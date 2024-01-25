import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class61_Sub2_Sub1 extends Class61_Sub2 {

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class61_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V")
	@Override
	protected void method7946(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * 2;
		@Pc(24) byte local24 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local15;
		@Pc(28) int local28 = local15 + 1;
		this.aByteArray103[local27] = local24;
		this.aByteArray103[local28] = local24;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIB)[B")
	public byte[] method7051() {
		this.aByteArray103 = new byte[524288];
		this.method7939();
		return this.aByteArray103;
	}
}
