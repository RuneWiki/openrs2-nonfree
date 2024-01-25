import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 {

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class11_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(BII)V")
	@Override
	protected void method269(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(17) byte local17 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(21) int local21 = arg1 * 2;
		@Pc(24) int local24 = local21;
		@Pc(25) int local25 = local21 + 1;
		this.aByteArray6[local24] = local17;
		this.aByteArray6[local25] = local17;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIB)[B")
	public byte[] method271() {
		this.aByteArray6 = new byte[524288];
		this.method7806();
		return this.aByteArray6;
	}
}
