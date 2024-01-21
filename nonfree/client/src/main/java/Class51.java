import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class51 {

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "[I")
	public static int[] anIntArray245 = new int[32768];

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!ta;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!ta;")
	private Class79 aClass79_2;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!ta;")
	private Class79 aClass79_3;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Lclient!ta;")
	private Class79 aClass79_4;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!ta;")
	private Class79 aClass79_5;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!ta;")
	private Class79 aClass79_6;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!ta;")
	private Class79 aClass79_7;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Lclient!ta;")
	private Class79 aClass79_8;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Lclient!bi;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!ta;")
	private Class79 aClass79_9;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	private int anInt2602 = 100;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
	private final int[] anIntArray244 = new int[5];

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public int anInt2601 = 0;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
	private final int[] anIntArray246 = new int[5];

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "[I")
	private final int[] anIntArray242 = new int[5];

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	private int anInt2604 = 0;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public int anInt2603 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray245[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray243 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray243[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)I")
	private int method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray243[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray245[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
	public int[] method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static184.method1641(Static106.anIntArray247, 0, arg0);
		if (arg1 < 10) {
			return Static106.anIntArray247;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass79_4.method2404();
		this.aClass79_6.method2404();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass79_8 != null) {
			this.aClass79_8.method2404();
			this.aClass79_2.method2404();
			local24 = (int) ((double) (this.aClass79_8.anInt3479 - this.aClass79_8.anInt3478) * 32.768D / local16);
			local26 = (int) ((double) this.aClass79_8.anInt3478 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass79_5 != null) {
			this.aClass79_5.method2404();
			this.aClass79_9.method2404();
			local63 = (int) ((double) (this.aClass79_5.anInt3479 - this.aClass79_5.anInt3478) * 32.768D / local16);
			local65 = (int) ((double) this.aClass79_5.anInt3478 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray246[local102] != 0) {
				Static106.anIntArray248[local102] = 0;
				Static106.anIntArray252[local102] = (int) ((double) this.anIntArray242[local102] * local16);
				Static106.anIntArray249[local102] = (this.anIntArray246[local102] << 14) / 100;
				Static106.anIntArray250[local102] = (int) ((double) (this.aClass79_4.anInt3479 - this.aClass79_4.anInt3478) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray244[local102]) / local16);
				Static106.anIntArray251[local102] = (int) ((double) this.aClass79_4.anInt3478 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass79_4.method2401(arg0);
			local187 = this.aClass79_6.method2401(arg0);
			if (this.aClass79_8 != null) {
				local195 = this.aClass79_8.method2401(arg0);
				local200 = this.aClass79_2.method2401(arg0);
				local182 += this.method1832(local28, local200, this.aClass79_8.anInt3480) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass79_5 != null) {
				local195 = this.aClass79_5.method2401(arg0);
				local200 = this.aClass79_9.method2401(arg0);
				local187 = local187 * ((this.method1832(local67, local200, this.aClass79_5.anInt3480) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray246[local195] != 0) {
					local200 = local176 + Static106.anIntArray252[local195];
					if (local200 < arg0) {
						Static106.anIntArray247[local200] += this.method1832(Static106.anIntArray248[local195], local187 * Static106.anIntArray249[local195] >> 15, this.aClass79_4.anInt3480);
						Static106.anIntArray248[local195] += (local182 * Static106.anIntArray250[local195] >> 16) + Static106.anIntArray251[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass79_3 != null) {
			this.aClass79_3.method2404();
			this.aClass79_1.method2404();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass79_3.method2401(arg0);
				local352 = this.aClass79_1.method2401(arg0);
				if (local339) {
					local187 = this.aClass79_3.anInt3478 + ((this.aClass79_3.anInt3479 - this.aClass79_3.anInt3478) * local347 >> 8);
				} else {
					local187 = this.aClass79_3.anInt3478 + ((this.aClass79_3.anInt3479 - this.aClass79_3.anInt3478) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static106.anIntArray247[local200] = 0;
				}
			}
		}
		if (this.anInt2604 > 0 && this.anInt2602 > 0) {
			local182 = (int) ((double) this.anInt2604 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static106.anIntArray247[local187] += Static106.anIntArray247[local187 - local182] * this.anInt2602 / 100;
			}
		}
		if (this.aClass9_1.anIntArray47[0] > 0 || this.aClass9_1.anIntArray47[1] > 0) {
			this.aClass79_7.method2404();
			local182 = this.aClass79_7.method2401(arg0 + 1);
			local187 = this.aClass9_1.method454(0, (float) local182 / 65536.0F);
			local195 = this.aClass9_1.method454(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static106.anIntArray247[local200 + local187] * (long) Static20.anInt707 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static106.anIntArray247[local200 + local187 - local519 - 1] * (long) Static20.anIntArrayArray2[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static106.anIntArray247[local200 - local549 - 1] * (long) Static20.anIntArrayArray2[1][local549] >> 16);
					}
					Static106.anIntArray247[local200] = local352;
					local182 = this.aClass79_7.method2401(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static106.anIntArray247[local200 + local187] * (long) Static20.anInt707 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static106.anIntArray247[local200 + local187 - local519 - 1] * (long) Static20.anIntArrayArray2[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static106.anIntArray247[local200 - local549 - 1] * (long) Static20.anIntArrayArray2[1][local549] >> 16);
						}
						Static106.anIntArray247[local200] = local352;
						local182 = this.aClass79_7.method2401(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static106.anIntArray247[local200 + local187 - local519 - 1] * (long) Static20.anIntArrayArray2[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static106.anIntArray247[local200 - local549 - 1] * (long) Static20.anIntArrayArray2[1][local549] >> 16);
							}
							Static106.anIntArray247[local200] = local352;
							this.aClass79_7.method2401(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass9_1.method454(0, (float) local182 / 65536.0F);
					local195 = this.aClass9_1.method454(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static106.anIntArray247[local182] < -32768) {
				Static106.anIntArray247[local182] = -32768;
			}
			if (Static106.anIntArray247[local182] > 32767) {
				Static106.anIntArray247[local182] = 32767;
			}
		}
		return Static106.anIntArray247;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!ab;)V")
	public void method1835(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass79_4 = new Class79();
		this.aClass79_4.method2403(arg0);
		this.aClass79_6 = new Class79();
		this.aClass79_6.method2403(arg0);
		@Pc(21) int local21 = arg0.method1698();
		if (local21 != 0) {
			arg0.anInt2385--;
			this.aClass79_8 = new Class79();
			this.aClass79_8.method2403(arg0);
			this.aClass79_2 = new Class79();
			this.aClass79_2.method2403(arg0);
		}
		local21 = arg0.method1698();
		if (local21 != 0) {
			arg0.anInt2385--;
			this.aClass79_5 = new Class79();
			this.aClass79_5.method2403(arg0);
			this.aClass79_9 = new Class79();
			this.aClass79_9.method2403(arg0);
		}
		local21 = arg0.method1698();
		if (local21 != 0) {
			arg0.anInt2385--;
			this.aClass79_3 = new Class79();
			this.aClass79_3.method2403(arg0);
			this.aClass79_1 = new Class79();
			this.aClass79_1.method2403(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1679();
			if (local114 == 0) {
				break;
			}
			this.anIntArray246[local109] = local114;
			this.anIntArray244[local109] = arg0.method1669();
			this.anIntArray242[local109] = arg0.method1679();
		}
		this.anInt2604 = arg0.method1679();
		this.anInt2602 = arg0.method1679();
		this.anInt2603 = arg0.method1680();
		this.anInt2601 = arg0.method1680();
		this.aClass9_1 = new Class9();
		this.aClass79_7 = new Class79();
		this.aClass9_1.method453(arg0, this.aClass79_7);
	}
}
