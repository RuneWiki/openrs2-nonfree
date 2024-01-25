import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class45_Sub1_Sub1 extends Class45_Sub1 {

	@OriginalMember(owner = "client!bu", name = "I", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class45_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIII)[B")
	public byte[] method1198() {
		this.aByteArray33 = new byte[524288];
		this.method7178();
		return this.aByteArray33;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7182(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(17) int local17 = arg0 * 2;
		@Pc(26) byte local26 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(29) int local29 = local17;
		@Pc(30) int local30 = local17 + 1;
		this.aByteArray33[local29] = local26;
		this.aByteArray33[local30] = local26;
	}
}
