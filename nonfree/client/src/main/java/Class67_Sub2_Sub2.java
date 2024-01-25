import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class67_Sub2_Sub2 extends Class67_Sub2 {

	@OriginalMember(owner = "client!ow", name = "G", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class67_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method6696(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(15) int local15 = local12;
		@Pc(16) int local16 = local12 + 1;
		this.aByteArray82[local15] = -1;
		@Pc(22) int local22 = arg0 & 0xFF;
		this.aByteArray82[local16] = (byte) (local22 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(IIII)[B")
	public byte[] method6698() {
		this.aByteArray82 = new byte[524288];
		this.method6687();
		return this.aByteArray82;
	}
}
