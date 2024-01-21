import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
	private int anInt3517 = 5;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
	private int anInt3518 = 0;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "[B")
	private byte[] aByteArray46 = new byte[512];

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
	private int anInt3523 = 2048;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "[S")
	private short[] aShortArray59 = new short[512];

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
	private int anInt3525 = 2;

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
	private int anInt3529 = 5;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
	private int anInt3522 = 1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		this.aByteArray46 = Static167.method2486(this.anInt3518);
		this.method2697();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(33) int local33 = Static34.anIntArray37[arg0] * this.anInt3529 + 2048;
			@Pc(37) int local37 = local33 >> 12;
			@Pc(41) int local41 = local37 + 1;
			for (@Pc(43) int local43 = 0; local43 < Static190.anInt3865; local43++) {
				Static159.anInt3291 = Integer.MAX_VALUE;
				Static40.anInt871 = Integer.MAX_VALUE;
				Static91.anInt1806 = Integer.MAX_VALUE;
				Static96.anInt2007 = Integer.MAX_VALUE;
				@Pc(63) int local63 = Static133.anIntArray187[local43] * this.anInt3517 + 2048;
				@Pc(67) int local67 = local63 >> 12;
				@Pc(71) int local71 = local67 + 1;
				@Pc(163) int local163;
				for (@Pc(75) int local75 = local37 - 1; local75 <= local41; local75++) {
					@Pc(100) int local100 = this.aByteArray46[(this.anInt3529 > local75 ? local75 : local75 - this.anInt3529) & 0xFF] & 0xFF;
					for (@Pc(104) int local104 = local67 - 1; local104 <= local71; local104++) {
						@Pc(133) int local133 = (this.aByteArray46[local100 + (this.anInt3517 <= local104 ? local104 - this.anInt3517 : local104) & 0xFF] & 0xFF) * 2;
						@Pc(138) int local138 = local133 + 1;
						@Pc(147) int local147 = local63 - this.aShortArray59[local133] - (local104 << 12);
						@Pc(160) int local160 = local33 - this.aShortArray59[local138] - (local75 << 12);
						local163 = this.anInt3522;
						@Pc(197) int local197;
						if (local163 == 1) {
							local197 = local147 * local147 + local160 * local160 >> 12;
						} else if (local163 == 3) {
							local160 = local160 < 0 ? -local160 : local160;
							local147 = local147 >= 0 ? local147 : -local147;
							local197 = local147 <= local160 ? local160 : local147;
						} else if (local163 == 4) {
							local147 = (int) (Math.sqrt((double) ((float) (local147 < 0 ? -local147 : local147) / 4096.0F)) * 4096.0D);
							local160 = (int) (Math.sqrt((double) ((float) (local160 < 0 ? -local160 : local160) / 4096.0F)) * 4096.0D);
							local197 = local160 + local147;
							local197 = local197 * local197 >> 12;
						} else if (local163 == 5) {
							local147 *= local147;
							local160 *= local160;
							local197 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local147 + local160) / 1.6777216E7F))) * 4096.0D);
						} else if (local163 == 2) {
							local197 = (local160 >= 0 ? local160 : -local160) + (local147 < 0 ? -local147 : local147);
						} else {
							local197 = (int) (Math.sqrt((double) ((float) (local147 * local147 + local160 * local160) / 1.6777216E7F)) * 4096.0D);
						}
						if (local197 < Static96.anInt2007) {
							Static159.anInt3291 = Static40.anInt871;
							Static40.anInt871 = Static91.anInt1806;
							Static91.anInt1806 = Static96.anInt2007;
							Static96.anInt2007 = local197;
						} else if (local197 < Static91.anInt1806) {
							Static159.anInt3291 = Static40.anInt871;
							Static40.anInt871 = Static91.anInt1806;
							Static91.anInt1806 = local197;
						} else if (local197 < Static40.anInt871) {
							Static159.anInt3291 = Static40.anInt871;
							Static40.anInt871 = local197;
						} else if (Static159.anInt3291 > local197) {
							Static159.anInt3291 = local197;
						}
					}
				}
				local163 = this.anInt3525;
				if (local163 == 0) {
					local19[local43] = Static96.anInt2007;
				} else if (local163 == 1) {
					local19[local43] = Static91.anInt1806;
				} else if (local163 == 3) {
					local19[local43] = Static40.anInt871;
				} else if (local163 == 4) {
					local19[local43] = Static159.anInt3291;
				} else if (local163 == 2) {
					local19[local43] = Static91.anInt1806 - Static96.anInt2007;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(B)V")
	private void method2697() {
		@Pc(16) Random local16 = new Random((long) this.anInt3518);
		this.aShortArray59 = new short[512];
		if (this.anInt3523 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray59[local28] = (short) Static13.method273(local16, this.anInt3523);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3517 = this.anInt3529 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt3518 = arg0.method1278();
		} else if (arg1 == 2) {
			this.anInt3523 = arg0.method1270();
		} else if (arg1 == 3) {
			this.anInt3525 = arg0.method1278();
		} else if (arg1 == 4) {
			this.anInt3522 = arg0.method1278();
		} else if (arg1 == 5) {
			this.anInt3517 = arg0.method1278();
		} else if (arg1 == 6) {
			this.anInt3529 = arg0.method1278();
		}
	}
}
