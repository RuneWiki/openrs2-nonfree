import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)[B")
	public byte[] method1628() {
		this.aByteArray29 = new byte[524288];
		this.method6173();
		return this.aByteArray29;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(BII)V")
	@Override
	protected void method4746(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(24) byte local24 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local7;
		@Pc(28) int local28 = local7 + 1;
		this.aByteArray29[local27] = local24;
		this.aByteArray29[local28] = local24;
	}
}
