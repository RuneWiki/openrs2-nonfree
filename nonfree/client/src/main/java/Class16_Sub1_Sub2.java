import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class16_Sub1_Sub2 extends Class16_Sub1 {

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class16_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)[B")
	public byte[] method1896() {
		this.aByteArray27 = new byte[524288];
		this.method7182();
		return this.aByteArray27;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method1889(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * 2;
		@Pc(24) byte local24 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local15;
		@Pc(28) int local28 = local15 + 1;
		this.aByteArray27[local27] = local24;
		this.aByteArray27[local28] = local24;
	}
}
