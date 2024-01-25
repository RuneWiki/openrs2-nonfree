import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class103_Sub1_Sub1 extends Class103_Sub1 {

	@OriginalMember(owner = "client!fj", name = "P", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class103_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(BIII)[B")
	public byte[] method3153() {
		this.aByteArray24 = new byte[524288];
		this.method7633();
		return this.aByteArray24;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method3428(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(21) byte local21 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local12;
		@Pc(25) int local25 = local12 + 1;
		this.aByteArray24[local24] = local21;
		this.aByteArray24[local25] = local21;
	}
}
