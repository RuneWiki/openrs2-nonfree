import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V")
	@Override
	protected void method6207(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray78[local19] = local12;
		this.aByteArray78[local20] = local12;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBII)[B")
	public byte[] method6148() {
		this.aByteArray78 = new byte[524288];
		this.method6202();
		return this.aByteArray78;
	}
}
