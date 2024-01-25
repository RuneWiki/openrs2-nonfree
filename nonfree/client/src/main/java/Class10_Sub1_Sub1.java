import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class10_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method1368(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray4[local19] = local16;
		this.aByteArray4[local20] = local16;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(IIII)[B")
	public byte[] method217() {
		this.aByteArray4 = new byte[524288];
		this.method7696();
		return this.aByteArray4;
	}
}
