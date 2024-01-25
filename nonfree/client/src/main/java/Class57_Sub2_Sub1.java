import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class57_Sub2_Sub1 extends Class57_Sub2 {

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class57_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIBI)[B")
	public byte[] method4487() {
		this.aByteArray78 = new byte[524288];
		this.method4477();
		return this.aByteArray78;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)V")
	@Override
	protected void method4483(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(21) byte local21 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local12;
		@Pc(25) int local25 = local12 + 1;
		this.aByteArray78[local24] = local21;
		this.aByteArray78[local25] = local21;
	}
}
