import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class77_Sub1_Sub1 extends Class77_Sub1 {

	@OriginalMember(owner = "client!re", name = "M", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class77_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method4690(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(16) int local16 = arg1 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray78[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray78[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIB)[B")
	public byte[] method4691() {
		this.aByteArray78 = new byte[524288];
		this.method5142();
		return this.aByteArray78;
	}
}
