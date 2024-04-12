import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class29 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "[I")
	public static int[] anIntArray247 = new int[32768];

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!ie;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!ie;")
	private Class26 aClass26_2;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!md;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!ie;")
	private Class26 aClass26_3;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!ie;")
	private Class26 aClass26_4;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!ie;")
	private Class26 aClass26_5;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!ie;")
	private Class26 aClass26_6;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!ie;")
	private Class26 aClass26_7;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!ie;")
	private Class26 aClass26_8;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!ie;")
	private Class26 aClass26_9;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	public int anInt1147 = 0;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	private int anInt1148 = 100;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
	private final int[] anIntArray245 = new int[5];

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
	private final int[] anIntArray249 = new int[5];

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	public int anInt1149 = 500;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "I")
	private int anInt1150 = 0;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "[I")
	private final int[] anIntArray255 = new int[5];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I", line = 7)
	private int method841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray246[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray247[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray247[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray246 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray246[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
		anIntArray248 = new int[220500];
		anIntArray250 = new int[5];
		anIntArray252 = new int[5];
		anIntArray251 = new int[5];
		anIntArray253 = new int[5];
		anIntArray254 = new int[5];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!eb;)V", line = 95)
	public void method843(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass26_5 = new Class26();
		this.aClass26_5.method799(arg0);
		this.aClass26_2 = new Class26();
		this.aClass26_2.method799(arg0);
		@Pc(21) int local21 = arg0.method1708();
		if (local21 != 0) {
			arg0.anInt2546--;
			this.aClass26_9 = new Class26();
			this.aClass26_9.method799(arg0);
			this.aClass26_3 = new Class26();
			this.aClass26_3.method799(arg0);
		}
		local21 = arg0.method1708();
		if (local21 != 0) {
			arg0.anInt2546--;
			this.aClass26_1 = new Class26();
			this.aClass26_1.method799(arg0);
			this.aClass26_4 = new Class26();
			this.aClass26_4.method799(arg0);
		}
		local21 = arg0.method1708();
		if (local21 != 0) {
			arg0.anInt2546--;
			this.aClass26_7 = new Class26();
			this.aClass26_7.method799(arg0);
			this.aClass26_8 = new Class26();
			this.aClass26_8.method799(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1698();
			if (local114 == 0) {
				break;
			}
			this.anIntArray249[local109] = local114;
			this.anIntArray255[local109] = arg0.method1699();
			this.anIntArray245[local109] = arg0.method1698();
		}
		this.anInt1150 = arg0.method1698();
		this.anInt1148 = arg0.method1698();
		this.anInt1149 = arg0.method1704();
		this.anInt1147 = arg0.method1704();
		this.aClass36_1 = new Class36();
		this.aClass26_6 = new Class26();
		this.aClass36_1.method1066(arg0, this.aClass26_6);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I", line = 158)
	public int[] method844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			anIntArray248[local1] = 0;
		}
		if (arg1 < 10) {
			return anIntArray248;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass26_5.method797();
		this.aClass26_2.method797();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass26_9 != null) {
			this.aClass26_9.method797();
			this.aClass26_3.method797();
			local31 = (int) ((double) (this.aClass26_9.anInt1084 - this.aClass26_9.anInt1086) * 32.768D / local23);
			local33 = (int) ((double) this.aClass26_9.anInt1086 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass26_1 != null) {
			this.aClass26_1.method797();
			this.aClass26_4.method797();
			local70 = (int) ((double) (this.aClass26_1.anInt1084 - this.aClass26_1.anInt1086) * 32.768D / local23);
			local72 = (int) ((double) this.aClass26_1.anInt1086 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray249[local109] != 0) {
				anIntArray252[local109] = 0;
				anIntArray253[local109] = (int) ((double) this.anIntArray245[local109] * local23);
				anIntArray250[local109] = (this.anIntArray249[local109] << 14) / 100;
				anIntArray251[local109] = (int) ((double) (this.aClass26_5.anInt1084 - this.aClass26_5.anInt1086) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray255[local109]) / local23);
				anIntArray254[local109] = (int) ((double) this.aClass26_5.anInt1086 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass26_5.method800(arg0);
			local194 = this.aClass26_2.method800(arg0);
			if (this.aClass26_9 != null) {
				local202 = this.aClass26_9.method800(arg0);
				local207 = this.aClass26_3.method800(arg0);
				local189 += this.method841(local35, local207, this.aClass26_9.anInt1085) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass26_1 != null) {
				local202 = this.aClass26_1.method800(arg0);
				local207 = this.aClass26_4.method800(arg0);
				local194 = local194 * ((this.method841(local74, local207, this.aClass26_1.anInt1085) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray249[local202] != 0) {
					local207 = local183 + anIntArray253[local202];
					if (local207 < arg0) {
						anIntArray248[local207] += this.method841(anIntArray252[local202], local194 * anIntArray250[local202] >> 15, this.aClass26_5.anInt1085);
						anIntArray252[local202] += (local189 * anIntArray251[local202] >> 16) + anIntArray254[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass26_7 != null) {
			this.aClass26_7.method797();
			this.aClass26_8.method797();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass26_7.method800(arg0);
				local359 = this.aClass26_8.method800(arg0);
				if (local346) {
					local194 = this.aClass26_7.anInt1086 + ((this.aClass26_7.anInt1084 - this.aClass26_7.anInt1086) * local354 >> 8);
				} else {
					local194 = this.aClass26_7.anInt1086 + ((this.aClass26_7.anInt1084 - this.aClass26_7.anInt1086) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					anIntArray248[local207] = 0;
				}
			}
		}
		if (this.anInt1150 > 0 && this.anInt1148 > 0) {
			local189 = (int) ((double) this.anInt1150 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				anIntArray248[local194] += anIntArray248[local194 - local189] * this.anInt1148 / 100;
			}
		}
		if (this.aClass36_1.anIntArray335[0] > 0 || this.aClass36_1.anIntArray335[1] > 0) {
			this.aClass26_6.method797();
			local189 = this.aClass26_6.method800(arg0 + 1);
			local194 = this.aClass36_1.method1069(0, (float) local189 / 65536.0F);
			local202 = this.aClass36_1.method1069(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) anIntArray248[local207 + local194] * (long) Static59.anInt1619 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) anIntArray248[local207 + local194 - local526 - 1] * (long) Class36.anIntArrayArray12[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) anIntArray248[local207 - local556 - 1] * (long) Class36.anIntArrayArray12[1][local556] >> 16);
					}
					anIntArray248[local207] = local359;
					local189 = this.aClass26_6.method800(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) anIntArray248[local207 + local194] * (long) Static59.anInt1619 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) anIntArray248[local207 + local194 - local526 - 1] * (long) Class36.anIntArrayArray12[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) anIntArray248[local207 - local556 - 1] * (long) Class36.anIntArrayArray12[1][local556] >> 16);
						}
						anIntArray248[local207] = local359;
						local189 = this.aClass26_6.method800(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) anIntArray248[local207 + local194 - local526 - 1] * (long) Class36.anIntArrayArray12[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) anIntArray248[local207 - local556 - 1] * (long) Class36.anIntArrayArray12[1][local556] >> 16);
							}
							anIntArray248[local207] = local359;
							this.aClass26_6.method800(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass36_1.method1069(0, (float) local189 / 65536.0F);
					local202 = this.aClass36_1.method1069(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (anIntArray248[local189] < -32768) {
				anIntArray248[local189] = -32768;
			}
			if (anIntArray248[local189] > 32767) {
				anIntArray248[local189] = 32767;
			}
		}
		return anIntArray248;
	}
}
