import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class38 {

	@OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
	public static int[] anIntArray172 = new int[32768];

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!ga;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!ga;")
	private Class29 aClass29_2;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!ga;")
	private Class29 aClass29_3;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Lclient!ga;")
	private Class29 aClass29_4;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Lclient!ga;")
	private Class29 aClass29_5;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!ga;")
	private Class29 aClass29_6;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Lclient!ae;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!ga;")
	private Class29 aClass29_7;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!ga;")
	private Class29 aClass29_8;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!ga;")
	private Class29 aClass29_9;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public int anInt1251 = 0;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	private int anInt1252 = 0;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	private int anInt1253 = 100;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "[I")
	private final int[] anIntArray175 = new int[5];

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public int anInt1254 = 500;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "[I")
	private final int[] anIntArray174 = new int[5];

	@OriginalMember(owner = "client!k", name = "d", descriptor = "[I")
	private final int[] anIntArray171 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray172[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray173 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray173[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!id;)V")
	public void method941(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass29_4 = new Class29();
		this.aClass29_4.method581(arg0);
		this.aClass29_3 = new Class29();
		this.aClass29_3.method581(arg0);
		@Pc(21) int local21 = arg0.method1837();
		if (local21 != 0) {
			arg0.anInt2574--;
			this.aClass29_1 = new Class29();
			this.aClass29_1.method581(arg0);
			this.aClass29_8 = new Class29();
			this.aClass29_8.method581(arg0);
		}
		local21 = arg0.method1837();
		if (local21 != 0) {
			arg0.anInt2574--;
			this.aClass29_2 = new Class29();
			this.aClass29_2.method581(arg0);
			this.aClass29_6 = new Class29();
			this.aClass29_6.method581(arg0);
		}
		local21 = arg0.method1837();
		if (local21 != 0) {
			arg0.anInt2574--;
			this.aClass29_9 = new Class29();
			this.aClass29_9.method581(arg0);
			this.aClass29_5 = new Class29();
			this.aClass29_5.method581(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1844();
			if (local114 == 0) {
				break;
			}
			this.anIntArray174[local109] = local114;
			this.anIntArray175[local109] = arg0.method1834();
			this.anIntArray171[local109] = arg0.method1844();
		}
		this.anInt1252 = arg0.method1844();
		this.anInt1253 = arg0.method1844();
		this.anInt1254 = arg0.method1842();
		this.anInt1251 = arg0.method1842();
		this.aClass5_1 = new Class5();
		this.aClass29_7 = new Class29();
		this.aClass5_1.method132(arg0, this.aClass29_7);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	public int[] method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static56.anIntArray170[local1] = 0;
		}
		if (arg1 < 10) {
			return Static56.anIntArray170;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass29_4.method584();
		this.aClass29_3.method584();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass29_1 != null) {
			this.aClass29_1.method584();
			this.aClass29_8.method584();
			local31 = (int) ((double) (this.aClass29_1.anInt822 - this.aClass29_1.anInt823) * 32.768D / local23);
			local33 = (int) ((double) this.aClass29_1.anInt823 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass29_2 != null) {
			this.aClass29_2.method584();
			this.aClass29_6.method584();
			local70 = (int) ((double) (this.aClass29_2.anInt822 - this.aClass29_2.anInt823) * 32.768D / local23);
			local72 = (int) ((double) this.aClass29_2.anInt823 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray174[local109] != 0) {
				Static56.anIntArray177[local109] = 0;
				Static56.anIntArray180[local109] = (int) ((double) this.anIntArray171[local109] * local23);
				Static56.anIntArray176[local109] = (this.anIntArray174[local109] << 14) / 100;
				Static56.anIntArray178[local109] = (int) ((double) (this.aClass29_4.anInt822 - this.aClass29_4.anInt823) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray175[local109]) / local23);
				Static56.anIntArray179[local109] = (int) ((double) this.aClass29_4.anInt823 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass29_4.method583(arg0);
			local194 = this.aClass29_3.method583(arg0);
			if (this.aClass29_1 != null) {
				local202 = this.aClass29_1.method583(arg0);
				local207 = this.aClass29_8.method583(arg0);
				local189 += this.method944(local35, local207, this.aClass29_1.anInt824) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass29_2 != null) {
				local202 = this.aClass29_2.method583(arg0);
				local207 = this.aClass29_6.method583(arg0);
				local194 = local194 * ((this.method944(local74, local207, this.aClass29_2.anInt824) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray174[local202] != 0) {
					local207 = local183 + Static56.anIntArray180[local202];
					if (local207 < arg0) {
						Static56.anIntArray170[local207] += this.method944(Static56.anIntArray177[local202], local194 * Static56.anIntArray176[local202] >> 15, this.aClass29_4.anInt824);
						Static56.anIntArray177[local202] += (local189 * Static56.anIntArray178[local202] >> 16) + Static56.anIntArray179[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass29_9 != null) {
			this.aClass29_9.method584();
			this.aClass29_5.method584();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass29_9.method583(arg0);
				local359 = this.aClass29_5.method583(arg0);
				if (local346) {
					local194 = this.aClass29_9.anInt823 + ((this.aClass29_9.anInt822 - this.aClass29_9.anInt823) * local354 >> 8);
				} else {
					local194 = this.aClass29_9.anInt823 + ((this.aClass29_9.anInt822 - this.aClass29_9.anInt823) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static56.anIntArray170[local207] = 0;
				}
			}
		}
		if (this.anInt1252 > 0 && this.anInt1253 > 0) {
			local189 = (int) ((double) this.anInt1252 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static56.anIntArray170[local194] += Static56.anIntArray170[local194 - local189] * this.anInt1253 / 100;
			}
		}
		if (this.aClass5_1.anIntArray19[0] > 0 || this.aClass5_1.anIntArray19[1] > 0) {
			this.aClass29_7.method584();
			local189 = this.aClass29_7.method583(arg0 + 1);
			local194 = this.aClass5_1.method134(0, (float) local189 / 65536.0F);
			local202 = this.aClass5_1.method134(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static56.anIntArray170[local207 + local194] * (long) Static4.anInt120 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static56.anIntArray170[local207 + local194 - local526 - 1] * (long) Static4.anIntArrayArray1[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static56.anIntArray170[local207 - local556 - 1] * (long) Static4.anIntArrayArray1[1][local556] >> 16);
					}
					Static56.anIntArray170[local207] = local359;
					local189 = this.aClass29_7.method583(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static56.anIntArray170[local207 + local194] * (long) Static4.anInt120 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static56.anIntArray170[local207 + local194 - local526 - 1] * (long) Static4.anIntArrayArray1[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static56.anIntArray170[local207 - local556 - 1] * (long) Static4.anIntArrayArray1[1][local556] >> 16);
						}
						Static56.anIntArray170[local207] = local359;
						local189 = this.aClass29_7.method583(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static56.anIntArray170[local207 + local194 - local526 - 1] * (long) Static4.anIntArrayArray1[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static56.anIntArray170[local207 - local556 - 1] * (long) Static4.anIntArrayArray1[1][local556] >> 16);
							}
							Static56.anIntArray170[local207] = local359;
							this.aClass29_7.method583(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass5_1.method134(0, (float) local189 / 65536.0F);
					local202 = this.aClass5_1.method134(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static56.anIntArray170[local189] < -32768) {
				Static56.anIntArray170[local189] = -32768;
			}
			if (Static56.anIntArray170[local189] > 32767) {
				Static56.anIntArray170[local189] = 32767;
			}
		}
		return Static56.anIntArray170;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
	private int method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray173[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray172[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
