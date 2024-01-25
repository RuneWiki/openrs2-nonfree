import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ada", name = "F", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	public Class8_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method5660(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(27) int local27 = local16;
		@Pc(28) int local28 = local16 + 1;
		this.aByteArray3[local27] = local12;
		this.aByteArray3[local28] = local12;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIII)[B")
	public byte[] method89() {
		this.aByteArray3 = new byte[524288];
		this.method7598();
		return this.aByteArray3;
	}
}
