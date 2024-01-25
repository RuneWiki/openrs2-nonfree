import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class39_Sub1_Sub1 extends Class39_Sub1 {

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class39_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
	@Override
	protected void method4078(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(20) byte local20 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg1 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray16[local27] = local20;
		this.aByteArray16[local28] = local20;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)[B")
	public byte[] method1109() {
		this.aByteArray16 = new byte[524288];
		this.method6746();
		return this.aByteArray16;
	}
}
