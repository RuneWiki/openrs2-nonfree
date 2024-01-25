import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 {

	@OriginalMember(owner = "client!aga", name = "F", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "()V")
	public Class11_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIB)[B")
	public byte[] method171() {
		this.aByteArray4 = new byte[524288];
		this.method7806();
		return this.aByteArray4;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(BII)V")
	@Override
	protected void method269(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * 2;
		@Pc(26) byte local26 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(29) int local29 = local17;
		@Pc(30) int local30 = local17 + 1;
		this.aByteArray4[local29] = local26;
		this.aByteArray4[local30] = local26;
	}
}
