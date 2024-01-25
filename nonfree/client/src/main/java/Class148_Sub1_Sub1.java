import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class148_Sub1_Sub1 extends Class148_Sub1 {

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class148_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIZ)[B")
	public byte[] method3248() {
		this.aByteArray32 = new byte[524288];
		this.method7949();
		return this.aByteArray32;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BII)V")
	@Override
	protected void method5651(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray32[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray32[local15] = (byte) (local11 * 3 >> 5);
	}
}
