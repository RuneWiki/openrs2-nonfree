import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class101_Sub1_Sub1 extends Class101_Sub1 {

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class101_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BIII)[B")
	public byte[] method3375() {
		this.aByteArray53 = new byte[524288];
		this.method7243();
		return this.aByteArray53;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZB)V")
	@Override
	protected void method6330(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(15) int local15 = arg0 * 2;
		@Pc(24) byte local24 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local15;
		@Pc(28) int local28 = local15 + 1;
		this.aByteArray53[local27] = local24;
		this.aByteArray53[local28] = local24;
	}
}
