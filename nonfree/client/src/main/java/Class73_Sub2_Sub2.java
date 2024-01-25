import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class73_Sub2_Sub2 extends Class73_Sub2 {

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class73_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBZ)V")
	@Override
	protected void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray101[local19] = local12;
		this.aByteArray101[local20] = local12;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIB)[B")
	public byte[] method7245() {
		this.aByteArray101 = new byte[524288];
		this.method7238();
		return this.aByteArray101;
	}
}
