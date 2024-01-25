import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class13_Sub1_Sub2 extends Class13_Sub1 {

	@OriginalMember(owner = "client!fha", name = "J", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "()V")
	public Class13_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIII)[B")
	public byte[] method2938() {
		this.aByteArray26 = new byte[524288];
		this.method7333();
		return this.aByteArray26;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method2933(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(27) int local27 = local16;
		@Pc(28) int local28 = local16 + 1;
		this.aByteArray26[local27] = local12;
		this.aByteArray26[local28] = local12;
	}
}
