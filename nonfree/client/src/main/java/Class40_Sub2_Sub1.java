import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class40_Sub2_Sub1 extends Class40_Sub2 {

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class40_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method8455(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(15) int local15 = local12;
		@Pc(16) int local16 = local12 + 1;
		this.aByteArray76[local15] = -1;
		@Pc(22) int local22 = arg1 & 0xFF;
		this.aByteArray76[local16] = (byte) (local22 * 3 >> 5);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)[B")
	public byte[] method6551() {
		this.aByteArray76 = new byte[524288];
		this.method8830((byte) -112);
		return this.aByteArray76;
	}
}
