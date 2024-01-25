import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class42_Sub1_Sub1 extends Class42_Sub1 {

	@OriginalMember(owner = "client!cp", name = "H", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class42_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method1199(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray17[local19] = local16;
		this.aByteArray17[local20] = local16;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIZ)[B")
	public byte[] method1202() {
		this.aByteArray17 = new byte[524288];
		this.method4150();
		return this.aByteArray17;
	}
}
