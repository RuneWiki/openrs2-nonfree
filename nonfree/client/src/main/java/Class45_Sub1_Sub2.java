import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class45_Sub1_Sub2 extends Class45_Sub1 {

	@OriginalMember(owner = "client!si", name = "G", descriptor = "[B")
	private byte[] aByteArray111;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class45_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7182(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(29) int local29 = local16;
		@Pc(30) int local30 = local16 + 1;
		this.aByteArray111[local29] = local12;
		this.aByteArray111[local30] = local12;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)[B")
	public byte[] method7185() {
		this.aByteArray111 = new byte[524288];
		this.method7178();
		return this.aByteArray111;
	}
}
