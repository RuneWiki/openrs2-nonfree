import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class158 {

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "[I")
	private static final int[] anIntArray402 = new int[32768];

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "[I")
	private static final int[] anIntArray405;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!nm;")
	private Class153 aClass153_1;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Lclient!nm;")
	private Class153 aClass153_2;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!nm;")
	private Class153 aClass153_3;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "Lclient!nm;")
	private Class153 aClass153_4;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!nm;")
	private Class153 aClass153_5;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Lclient!nm;")
	private Class153 aClass153_6;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!nm;")
	private Class153 aClass153_7;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!je;")
	private Class102 aClass102_1;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Lclient!nm;")
	private Class153 aClass153_8;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "Lclient!nm;")
	private Class153 aClass153_9;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public int anInt4519 = 500;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "[I")
	private final int[] anIntArray404 = new int[5];

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "[I")
	private final int[] anIntArray400 = new int[5];

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
	public int anInt4521 = 0;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	private int anInt4520 = 100;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "[I")
	private final int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	private int anInt4522 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray402[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray405 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray405[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
	private int method4048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray405[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray402[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!jg;)V")
	public void method4049(@OriginalArg(0) Class14_Sub4 arg0) {
		this.aClass153_4 = new Class153();
		this.aClass153_4.method3869(arg0);
		this.aClass153_1 = new Class153();
		this.aClass153_1.method3869(arg0);
		@Pc(21) int local21 = arg0.method2548();
		if (local21 != 0) {
			arg0.anInt2637--;
			this.aClass153_8 = new Class153();
			this.aClass153_8.method3869(arg0);
			this.aClass153_5 = new Class153();
			this.aClass153_5.method3869(arg0);
		}
		local21 = arg0.method2548();
		if (local21 != 0) {
			arg0.anInt2637--;
			this.aClass153_9 = new Class153();
			this.aClass153_9.method3869(arg0);
			this.aClass153_2 = new Class153();
			this.aClass153_2.method3869(arg0);
		}
		local21 = arg0.method2548();
		if (local21 != 0) {
			arg0.anInt2637--;
			this.aClass153_3 = new Class153();
			this.aClass153_3.method3869(arg0);
			this.aClass153_7 = new Class153();
			this.aClass153_7.method3869(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2525();
			if (local114 == 0) {
				break;
			}
			this.anIntArray403[local109] = local114;
			this.anIntArray404[local109] = arg0.method2515();
			this.anIntArray400[local109] = arg0.method2525();
		}
		this.anInt4522 = arg0.method2525();
		this.anInt4520 = arg0.method2525();
		this.anInt4519 = arg0.method2498();
		this.anInt4521 = arg0.method2498();
		this.aClass102_1 = new Class102();
		this.aClass153_6 = new Class153();
		this.aClass102_1.method2935(arg0, this.aClass153_6);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
	public int[] method4051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static358.method766(Static230.anIntArray401, 0, arg0);
		if (arg1 < 10) {
			return Static230.anIntArray401;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass153_4.method3871();
		this.aClass153_1.method3871();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass153_8 != null) {
			this.aClass153_8.method3871();
			this.aClass153_5.method3871();
			local24 = (int) ((double) (this.aClass153_8.anInt4296 - this.aClass153_8.anInt4297) * 32.768D / local16);
			local26 = (int) ((double) this.aClass153_8.anInt4297 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass153_9 != null) {
			this.aClass153_9.method3871();
			this.aClass153_2.method3871();
			local63 = (int) ((double) (this.aClass153_9.anInt4296 - this.aClass153_9.anInt4297) * 32.768D / local16);
			local65 = (int) ((double) this.aClass153_9.anInt4297 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray403[local102] != 0) {
				Static230.anIntArray408[local102] = 0;
				Static230.anIntArray407[local102] = (int) ((double) this.anIntArray400[local102] * local16);
				Static230.anIntArray406[local102] = (this.anIntArray403[local102] << 14) / 100;
				Static230.anIntArray410[local102] = (int) ((double) (this.aClass153_4.anInt4296 - this.aClass153_4.anInt4297) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray404[local102]) / local16);
				Static230.anIntArray409[local102] = (int) ((double) this.aClass153_4.anInt4297 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass153_4.method3870(arg0);
			local187 = this.aClass153_1.method3870(arg0);
			if (this.aClass153_8 != null) {
				local195 = this.aClass153_8.method3870(arg0);
				local200 = this.aClass153_5.method3870(arg0);
				local182 += this.method4048(local28, local200, this.aClass153_8.anInt4298) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass153_9 != null) {
				local195 = this.aClass153_9.method3870(arg0);
				local200 = this.aClass153_2.method3870(arg0);
				local187 = local187 * ((this.method4048(local67, local200, this.aClass153_9.anInt4298) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray403[local195] != 0) {
					local200 = local176 + Static230.anIntArray407[local195];
					if (local200 < arg0) {
						Static230.anIntArray401[local200] += this.method4048(Static230.anIntArray408[local195], local187 * Static230.anIntArray406[local195] >> 15, this.aClass153_4.anInt4298);
						Static230.anIntArray408[local195] += (local182 * Static230.anIntArray410[local195] >> 16) + Static230.anIntArray409[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass153_3 != null) {
			this.aClass153_3.method3871();
			this.aClass153_7.method3871();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass153_3.method3870(arg0);
				local352 = this.aClass153_7.method3870(arg0);
				if (local339) {
					local187 = this.aClass153_3.anInt4297 + ((this.aClass153_3.anInt4296 - this.aClass153_3.anInt4297) * local347 >> 8);
				} else {
					local187 = this.aClass153_3.anInt4297 + ((this.aClass153_3.anInt4296 - this.aClass153_3.anInt4297) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static230.anIntArray401[local200] = 0;
				}
			}
		}
		if (this.anInt4522 > 0 && this.anInt4520 > 0) {
			local182 = (int) ((double) this.anInt4522 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static230.anIntArray401[local187] += Static230.anIntArray401[local187 - local182] * this.anInt4520 / 100;
			}
		}
		if (this.aClass102_1.anIntArray280[0] > 0 || this.aClass102_1.anIntArray280[1] > 0) {
			this.aClass153_6.method3871();
			local182 = this.aClass153_6.method3870(arg0 + 1);
			local187 = this.aClass102_1.method2931(0, (float) local182 / 65536.0F);
			local195 = this.aClass102_1.method2931(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static230.anIntArray401[local200 + local187] * (long) Static146.anInt3154 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static230.anIntArray401[local200 + local187 - local519 - 1] * (long) Static146.anIntArrayArray49[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static230.anIntArray401[local200 - local549 - 1] * (long) Static146.anIntArrayArray49[1][local549] >> 16);
					}
					Static230.anIntArray401[local200] = local352;
					local182 = this.aClass153_6.method3870(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static230.anIntArray401[local200 + local187] * (long) Static146.anInt3154 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static230.anIntArray401[local200 + local187 - local519 - 1] * (long) Static146.anIntArrayArray49[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static230.anIntArray401[local200 - local549 - 1] * (long) Static146.anIntArrayArray49[1][local549] >> 16);
						}
						Static230.anIntArray401[local200] = local352;
						local182 = this.aClass153_6.method3870(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static230.anIntArray401[local200 + local187 - local519 - 1] * (long) Static146.anIntArrayArray49[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static230.anIntArray401[local200 - local549 - 1] * (long) Static146.anIntArrayArray49[1][local549] >> 16);
							}
							Static230.anIntArray401[local200] = local352;
							this.aClass153_6.method3870(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass102_1.method2931(0, (float) local182 / 65536.0F);
					local195 = this.aClass102_1.method2931(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static230.anIntArray401[local182] < -32768) {
				Static230.anIntArray401[local182] = -32768;
			}
			if (Static230.anIntArray401[local182] > 32767) {
				Static230.anIntArray401[local182] = 32767;
			}
		}
		return Static230.anIntArray401;
	}
}
