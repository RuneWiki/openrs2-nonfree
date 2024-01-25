import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class67_Sub2_Sub1 extends Class67_Sub2 {

	@OriginalMember(owner = "client!lv", name = "E", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	public Class67_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method6696(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray73[local19] = (byte) (local11 * 3 >> 5);
		this.aByteArray73[local20] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(IIII)[B")
	public byte[] method5477() {
		this.aByteArray73 = new byte[524288];
		this.method6687();
		return this.aByteArray73;
	}
}
