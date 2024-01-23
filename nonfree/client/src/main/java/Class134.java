import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class134 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "[I")
	private static int[] anIntArray443 = new int[32768];

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
	private static int[] anIntArray445;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!ve;")
	private Class179 aClass179_1;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Lclient!ve;")
	private Class179 aClass179_2;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!ve;")
	private Class179 aClass179_3;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Lclient!ve;")
	private Class179 aClass179_4;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!ve;")
	private Class179 aClass179_5;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Lclient!ve;")
	private Class179 aClass179_6;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!ve;")
	private Class179 aClass179_7;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!ve;")
	private Class179 aClass179_8;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Lclient!kd;")
	private Class97 aClass97_1;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "Lclient!ve;")
	private Class179 aClass179_9;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	public int anInt4013 = 500;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	public int anInt4016 = 0;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	private int anInt4015 = 100;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
	private int[] anIntArray442 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "[I")
	private int[] anIntArray444 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	private int anInt4014 = 0;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
	private int[] anIntArray441 = new int[] { 0, 0, 0, 0, 0 };

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray443[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray445 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray445[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!fh;)V")
	public void method3479(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aClass179_4 = new Class179();
		this.aClass179_4.method4423(arg0);
		this.aClass179_6 = new Class179();
		this.aClass179_6.method4423(arg0);
		@Pc(21) int local21 = arg0.method1853();
		if (local21 != 0) {
			arg0.anInt2018--;
			this.aClass179_2 = new Class179();
			this.aClass179_2.method4423(arg0);
			this.aClass179_3 = new Class179();
			this.aClass179_3.method4423(arg0);
		}
		local21 = arg0.method1853();
		if (local21 != 0) {
			arg0.anInt2018--;
			this.aClass179_9 = new Class179();
			this.aClass179_9.method4423(arg0);
			this.aClass179_7 = new Class179();
			this.aClass179_7.method4423(arg0);
		}
		local21 = arg0.method1853();
		if (local21 != 0) {
			arg0.anInt2018--;
			this.aClass179_8 = new Class179();
			this.aClass179_8.method4423(arg0);
			this.aClass179_1 = new Class179();
			this.aClass179_1.method4423(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method1830();
			if (local116 == 0) {
				break;
			}
			this.anIntArray444[local109] = local116;
			this.anIntArray442[local109] = arg0.method1817();
			this.anIntArray441[local109] = arg0.method1830();
		}
		this.anInt4014 = arg0.method1830();
		this.anInt4015 = arg0.method1830();
		this.anInt4013 = arg0.method1879();
		this.anInt4016 = arg0.method1879();
		this.aClass97_1 = new Class97();
		this.aClass179_5 = new Class179();
		this.aClass97_1.method2464(arg0, this.aClass179_5);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	private int method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray445[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray443[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	public int[] method3481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static317.method1047(Static211.anIntArray440, 0, arg0);
		if (arg1 < 10) {
			return Static211.anIntArray440;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass179_4.method4420();
		this.aClass179_6.method4420();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass179_2 != null) {
			this.aClass179_2.method4420();
			this.aClass179_3.method4420();
			local24 = (int) ((double) (this.aClass179_2.anInt5314 - this.aClass179_2.anInt5313) * 32.768D / local16);
			local26 = (int) ((double) this.aClass179_2.anInt5313 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass179_9 != null) {
			this.aClass179_9.method4420();
			this.aClass179_7.method4420();
			local63 = (int) ((double) (this.aClass179_9.anInt5314 - this.aClass179_9.anInt5313) * 32.768D / local16);
			local65 = (int) ((double) this.aClass179_9.anInt5313 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray444[local102] != 0) {
				Static211.anIntArray446[local102] = 0;
				Static211.anIntArray449[local102] = (int) ((double) this.anIntArray441[local102] * local16);
				Static211.anIntArray450[local102] = (this.anIntArray444[local102] << 14) / 100;
				Static211.anIntArray448[local102] = (int) ((double) (this.aClass179_4.anInt5314 - this.aClass179_4.anInt5313) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray442[local102]) / local16);
				Static211.anIntArray447[local102] = (int) ((double) this.aClass179_4.anInt5313 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass179_4.method4422(arg0);
			local190 = this.aClass179_6.method4422(arg0);
			if (this.aClass179_2 != null) {
				local198 = this.aClass179_2.method4422(arg0);
				local203 = this.aClass179_3.method4422(arg0);
				local185 += this.method3480(local28, local203, this.aClass179_2.anInt5311) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass179_9 != null) {
				local198 = this.aClass179_9.method4422(arg0);
				local203 = this.aClass179_7.method4422(arg0);
				local190 = local190 * ((this.method3480(local67, local203, this.aClass179_9.anInt5311) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray444[local198] != 0) {
					local203 = local102 + Static211.anIntArray449[local198];
					if (local203 < arg0) {
						Static211.anIntArray440[local203] += this.method3480(Static211.anIntArray446[local198], local190 * Static211.anIntArray450[local198] >> 15, this.aClass179_4.anInt5311);
						Static211.anIntArray446[local198] += (local185 * Static211.anIntArray448[local198] >> 16) + Static211.anIntArray447[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass179_8 != null) {
			this.aClass179_8.method4420();
			this.aClass179_1.method4420();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass179_8.method4422(arg0);
				local356 = this.aClass179_1.method4422(arg0);
				if (local341) {
					local185 = this.aClass179_8.anInt5313 + ((this.aClass179_8.anInt5314 - this.aClass179_8.anInt5313) * local203 >> 8);
				} else {
					local185 = this.aClass179_8.anInt5313 + ((this.aClass179_8.anInt5314 - this.aClass179_8.anInt5313) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static211.anIntArray440[local198] = 0;
				}
			}
		}
		if (this.anInt4014 > 0 && this.anInt4015 > 0) {
			local102 = (int) ((double) this.anInt4014 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static211.anIntArray440[local185] += Static211.anIntArray440[local185 - local102] * this.anInt4015 / 100;
			}
		}
		if (this.aClass97_1.anIntArray238[0] > 0 || this.aClass97_1.anIntArray238[1] > 0) {
			this.aClass179_5.method4420();
			local102 = this.aClass179_5.method4422(arg0 + 1);
			local185 = this.aClass97_1.method2465(0, (float) local102 / 65536.0F);
			local190 = this.aClass97_1.method2465(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static211.anIntArray440[local198 + local185] * (long) Static139.anInt2743 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static211.anIntArray440[local198 + local185 - local523 - 1] * (long) Static139.anIntArrayArray16[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static211.anIntArray440[local198 - local523 - 1] * (long) Static139.anIntArrayArray16[1][local523] >> 16);
					}
					Static211.anIntArray440[local198] = local356;
					local102 = this.aClass179_5.method4422(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static211.anIntArray440[local198 + local185] * (long) Static139.anInt2743 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static211.anIntArray440[local198 + local185 - local523 - 1] * (long) Static139.anIntArrayArray16[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static211.anIntArray440[local198 - local523 - 1] * (long) Static139.anIntArrayArray16[1][local523] >> 16);
						}
						Static211.anIntArray440[local198] = local356;
						local102 = this.aClass179_5.method4422(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static211.anIntArray440[local198 + local185 - local523 - 1] * (long) Static139.anIntArrayArray16[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static211.anIntArray440[local198 - local523 - 1] * (long) Static139.anIntArrayArray16[1][local523] >> 16);
							}
							Static211.anIntArray440[local198] = local356;
							this.aClass179_5.method4422(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass97_1.method2465(0, (float) local102 / 65536.0F);
					local190 = this.aClass97_1.method2465(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static211.anIntArray440[local102] < -32768) {
				Static211.anIntArray440[local102] = -32768;
			}
			if (Static211.anIntArray440[local102] > 32767) {
				Static211.anIntArray440[local102] = 32767;
			}
		}
		return Static211.anIntArray440;
	}
}
