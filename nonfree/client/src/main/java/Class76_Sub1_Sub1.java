import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class76_Sub1_Sub1 extends Class76_Sub1 {

	@OriginalMember(owner = "client!so", name = "I", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class76_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IIII)[B")
	public byte[] method5050() {
		this.aByteArray85 = new byte[524288];
		this.method5035();
		return this.aByteArray85;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method5047(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(23) int local23 = local16;
		@Pc(24) int local24 = local16 + 1;
		this.aByteArray85[local23] = local12;
		this.aByteArray85[local24] = local12;
	}
}
