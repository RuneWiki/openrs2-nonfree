import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class43_Sub2_Sub2 extends Class43_Sub2 {

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class43_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)[B")
	public byte[] method8292() {
		this.aByteArray105 = new byte[524288];
		this.method8278();
		return this.aByteArray105;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(23) int local23 = local16;
		@Pc(24) int local24 = local16 + 1;
		this.aByteArray105[local23] = local12;
		this.aByteArray105[local24] = local12;
	}
}
