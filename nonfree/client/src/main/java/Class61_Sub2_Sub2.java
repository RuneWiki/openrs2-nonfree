import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class61_Sub2_Sub2 extends Class61_Sub2 {

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "[B")
	private byte[] aByteArray118;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class61_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BII)V")
	@Override
	protected void method7946(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(20) byte local20 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg1 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray118[local27] = local20;
		this.aByteArray118[local28] = local20;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIB)[B")
	public byte[] method7951() {
		this.aByteArray118 = new byte[524288];
		this.method7939();
		return this.aByteArray118;
	}
}
