import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class18_Sub1_Sub1 extends Class18_Sub1 {

	@OriginalMember(owner = "client!am", name = "O", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class18_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(IIZI)[B")
	public byte[] method530() {
		this.aByteArray6 = new byte[524288];
		this.method8416();
		return this.aByteArray6;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method5643(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray6[local10] = -1;
		@Pc(25) int local25 = arg0 & 0xFF;
		this.aByteArray6[local11] = (byte) (local25 * 3 >> 5);
	}
}
