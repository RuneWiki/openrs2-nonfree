import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)[B")
	public byte[] method39() {
		this.aByteArray3 = new byte[524288];
		this.method6202();
		return this.aByteArray3;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method5153(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray3[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray3[local15] = (byte) (local11 * 3 >> 5);
	}
}
