import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class15_Sub2_Sub2 extends Class15_Sub2 {

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class15_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIII)[B")
	public byte[] method8211() {
		this.aByteArray101 = new byte[524288];
		this.method8197();
		return this.aByteArray101;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZBI)V")
	@Override
	protected void method8208(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte local17 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(21) int local21 = arg1 * 2;
		@Pc(24) int local24 = local21;
		@Pc(25) int local25 = local21 + 1;
		this.aByteArray101[local24] = local17;
		this.aByteArray101[local25] = local17;
	}
}
