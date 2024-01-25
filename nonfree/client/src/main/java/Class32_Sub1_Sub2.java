import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class32_Sub1_Sub2 extends Class32_Sub1 {

	@OriginalMember(owner = "client!tca", name = "E", descriptor = "[I")
	public static final int[] anIntArray631 = new int[120];

	@OriginalMember(owner = "client!tca", name = "G", descriptor = "[B")
	private byte[] aByteArray107;

	static {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 120; local13++) {
			@Pc(18) int local18 = local13 + 1;
			@Pc(31) int local31 = (int) ((double) local18 + Math.pow(2.0D, (double) local18 / 7.0D) * 300.0D);
			local11 += local31;
			anIntArray631[local13] = local11 / 4;
		}
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	public Class32_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method6963(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 * 2;
		@Pc(20) int local20 = arg0 & 0xFF;
		@Pc(23) int local23 = local16;
		@Pc(24) int local24 = local16 + 1;
		this.aByteArray107[local23] = -1;
		this.aByteArray107[local24] = (byte) (local20 * 3 >> 5);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)[B")
	public byte[] method6967() {
		this.aByteArray107 = new byte[524288];
		this.method6958();
		return this.aByteArray107;
	}
}
