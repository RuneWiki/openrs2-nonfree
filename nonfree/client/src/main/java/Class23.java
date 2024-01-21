import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class23 {

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
	public static int[] anIntArray77 = new int[32768];

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!dc;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!i;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!dc;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!dc;")
	private Class15 aClass15_3;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!dc;")
	private Class15 aClass15_4;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!dc;")
	private Class15 aClass15_5;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!dc;")
	private Class15 aClass15_6;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!dc;")
	private Class15 aClass15_7;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!dc;")
	private Class15 aClass15_8;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!dc;")
	private Class15 aClass15_9;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	private int anInt738 = 0;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public int anInt737 = 0;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
	private final int[] anIntArray72 = new int[5];

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	private final int[] anIntArray73 = new int[5];

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[I")
	private final int[] anIntArray75 = new int[5];

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public int anInt739 = 500;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	private int anInt740 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray77[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray74 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray74[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I")
	public int[] method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static26.anIntArray76[local1] = 0;
		}
		if (arg1 < 10) {
			return Static26.anIntArray76;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass15_4.method406();
		this.aClass15_5.method406();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass15_2 != null) {
			this.aClass15_2.method406();
			this.aClass15_8.method406();
			local31 = (int) ((double) (this.aClass15_2.anInt557 - this.aClass15_2.anInt554) * 32.768D / local23);
			local33 = (int) ((double) this.aClass15_2.anInt554 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass15_6 != null) {
			this.aClass15_6.method406();
			this.aClass15_7.method406();
			local70 = (int) ((double) (this.aClass15_6.anInt557 - this.aClass15_6.anInt554) * 32.768D / local23);
			local72 = (int) ((double) this.aClass15_6.anInt554 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray73[local109] != 0) {
				Static26.anIntArray80[local109] = 0;
				Static26.anIntArray79[local109] = (int) ((double) this.anIntArray75[local109] * local23);
				Static26.anIntArray82[local109] = (this.anIntArray73[local109] << 14) / 100;
				Static26.anIntArray81[local109] = (int) ((double) (this.aClass15_4.anInt557 - this.aClass15_4.anInt554) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray72[local109]) / local23);
				Static26.anIntArray78[local109] = (int) ((double) this.aClass15_4.anInt554 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass15_4.method403(arg0);
			local194 = this.aClass15_5.method403(arg0);
			if (this.aClass15_2 != null) {
				local202 = this.aClass15_2.method403(arg0);
				local207 = this.aClass15_8.method403(arg0);
				local189 += this.method527(local35, local207, this.aClass15_2.anInt555) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass15_6 != null) {
				local202 = this.aClass15_6.method403(arg0);
				local207 = this.aClass15_7.method403(arg0);
				local194 = local194 * ((this.method527(local74, local207, this.aClass15_6.anInt555) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray73[local202] != 0) {
					local207 = local183 + Static26.anIntArray79[local202];
					if (local207 < arg0) {
						Static26.anIntArray76[local207] += this.method527(Static26.anIntArray80[local202], local194 * Static26.anIntArray82[local202] >> 15, this.aClass15_4.anInt555);
						Static26.anIntArray80[local202] += (local189 * Static26.anIntArray81[local202] >> 16) + Static26.anIntArray78[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass15_9 != null) {
			this.aClass15_9.method406();
			this.aClass15_3.method406();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass15_9.method403(arg0);
				local359 = this.aClass15_3.method403(arg0);
				if (local346) {
					local194 = this.aClass15_9.anInt554 + ((this.aClass15_9.anInt557 - this.aClass15_9.anInt554) * local354 >> 8);
				} else {
					local194 = this.aClass15_9.anInt554 + ((this.aClass15_9.anInt557 - this.aClass15_9.anInt554) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static26.anIntArray76[local207] = 0;
				}
			}
		}
		if (this.anInt738 > 0 && this.anInt740 > 0) {
			local189 = (int) ((double) this.anInt738 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static26.anIntArray76[local194] += Static26.anIntArray76[local194 - local189] * this.anInt740 / 100;
			}
		}
		if (this.aClass30_1.anIntArray134[0] > 0 || this.aClass30_1.anIntArray134[1] > 0) {
			this.aClass15_1.method406();
			local189 = this.aClass15_1.method403(arg0 + 1);
			local194 = this.aClass30_1.method648(0, (float) local189 / 65536.0F);
			local202 = this.aClass30_1.method648(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static26.anIntArray76[local207 + local194] * (long) Static40.anInt951 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static26.anIntArray76[local207 + local194 - local526 - 1] * (long) Static40.anIntArrayArray12[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static26.anIntArray76[local207 - local556 - 1] * (long) Static40.anIntArrayArray12[1][local556] >> 16);
					}
					Static26.anIntArray76[local207] = local359;
					local189 = this.aClass15_1.method403(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static26.anIntArray76[local207 + local194] * (long) Static40.anInt951 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static26.anIntArray76[local207 + local194 - local526 - 1] * (long) Static40.anIntArrayArray12[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static26.anIntArray76[local207 - local556 - 1] * (long) Static40.anIntArrayArray12[1][local556] >> 16);
						}
						Static26.anIntArray76[local207] = local359;
						local189 = this.aClass15_1.method403(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static26.anIntArray76[local207 + local194 - local526 - 1] * (long) Static40.anIntArrayArray12[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static26.anIntArray76[local207 - local556 - 1] * (long) Static40.anIntArrayArray12[1][local556] >> 16);
							}
							Static26.anIntArray76[local207] = local359;
							this.aClass15_1.method403(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass30_1.method648(0, (float) local189 / 65536.0F);
					local202 = this.aClass30_1.method648(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static26.anIntArray76[local189] < -32768) {
				Static26.anIntArray76[local189] = -32768;
			}
			if (Static26.anIntArray76[local189] > 32767) {
				Static26.anIntArray76[local189] = 32767;
			}
		}
		return Static26.anIntArray76;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ka;)V")
	public void method526(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass15_4 = new Class15();
		this.aClass15_4.method405(arg0);
		this.aClass15_5 = new Class15();
		this.aClass15_5.method405(arg0);
		@Pc(21) int local21 = arg0.method1186();
		if (local21 != 0) {
			arg0.anInt1692--;
			this.aClass15_2 = new Class15();
			this.aClass15_2.method405(arg0);
			this.aClass15_8 = new Class15();
			this.aClass15_8.method405(arg0);
		}
		local21 = arg0.method1186();
		if (local21 != 0) {
			arg0.anInt1692--;
			this.aClass15_6 = new Class15();
			this.aClass15_6.method405(arg0);
			this.aClass15_7 = new Class15();
			this.aClass15_7.method405(arg0);
		}
		local21 = arg0.method1186();
		if (local21 != 0) {
			arg0.anInt1692--;
			this.aClass15_9 = new Class15();
			this.aClass15_9.method405(arg0);
			this.aClass15_3 = new Class15();
			this.aClass15_3.method405(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1190();
			if (local114 == 0) {
				break;
			}
			this.anIntArray73[local109] = local114;
			this.anIntArray72[local109] = arg0.method1195();
			this.anIntArray75[local109] = arg0.method1190();
		}
		this.anInt738 = arg0.method1190();
		this.anInt740 = arg0.method1190();
		this.anInt739 = arg0.method1199();
		this.anInt737 = arg0.method1199();
		this.aClass30_1 = new Class30();
		this.aClass15_1 = new Class15();
		this.aClass30_1.method651(arg0, this.aClass15_1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
	private int method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray74[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray77[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
