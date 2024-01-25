import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class43_Sub1_Sub1 extends Class43_Sub1 {

	@OriginalMember(owner = "client!cq", name = "F", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class43_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)V")
	@Override
	protected void method961(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(29) int local29 = local7;
		@Pc(30) int local30 = local7 + 1;
		this.aByteArray13[local29] = local16;
		this.aByteArray13[local30] = local16;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIII)[B")
	public byte[] method966() {
		this.aByteArray13 = new byte[524288];
		this.method3173();
		return this.aByteArray13;
	}
}
