import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class74_Sub2_Sub2 extends Class74_Sub2 {

	@OriginalMember(owner = "client!sv", name = "S", descriptor = "[I")
	public static final int[] anIntArray629 = new int[120];

	@OriginalMember(owner = "client!sv", name = "P", descriptor = "[B")
	private byte[] aByteArray124;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 120; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) (Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D + (double) local17);
			local10 += local30;
			anIntArray629[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class74_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7981(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray124[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray124[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIBI)[B")
	public byte[] method7988() {
		this.aByteArray124 = new byte[524288];
		this.method9043();
		return this.aByteArray124;
	}
}
