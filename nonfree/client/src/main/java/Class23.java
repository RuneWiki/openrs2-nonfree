import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class23 {

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "[I")
	public static int[] anIntArray136 = new int[32768];

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!rd;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!rd;")
	private Class59 aClass59_2;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!rd;")
	private Class59 aClass59_3;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!rd;")
	private Class59 aClass59_4;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!rd;")
	private Class59 aClass59_5;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!rd;")
	private Class59 aClass59_6;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!rd;")
	private Class59 aClass59_7;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!ae;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!rd;")
	private Class59 aClass59_8;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!rd;")
	private Class59 aClass59_9;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
	private final int[] anIntArray133 = new int[5];

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
	private final int[] anIntArray135 = new int[5];

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public int anInt961 = 0;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
	private final int[] anIntArray134 = new int[5];

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
	private int anInt962 = 0;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	private int anInt960 = 100;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
	public int anInt959 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray136[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray138 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray138[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!wd;)V")
	public void method743(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aClass59_9 = new Class59();
		this.aClass59_9.method1652(arg0);
		this.aClass59_1 = new Class59();
		this.aClass59_1.method1652(arg0);
		@Pc(21) int local21 = arg0.method1399();
		if (local21 != 0) {
			arg0.anInt1939--;
			this.aClass59_2 = new Class59();
			this.aClass59_2.method1652(arg0);
			this.aClass59_7 = new Class59();
			this.aClass59_7.method1652(arg0);
		}
		local21 = arg0.method1399();
		if (local21 != 0) {
			arg0.anInt1939--;
			this.aClass59_4 = new Class59();
			this.aClass59_4.method1652(arg0);
			this.aClass59_6 = new Class59();
			this.aClass59_6.method1652(arg0);
		}
		local21 = arg0.method1399();
		if (local21 != 0) {
			arg0.anInt1939--;
			this.aClass59_8 = new Class59();
			this.aClass59_8.method1652(arg0);
			this.aClass59_3 = new Class59();
			this.aClass59_3.method1652(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1397();
			if (local114 == 0) {
				break;
			}
			this.anIntArray135[local109] = local114;
			this.anIntArray134[local109] = arg0.method1407();
			this.anIntArray133[local109] = arg0.method1397();
		}
		this.anInt962 = arg0.method1397();
		this.anInt960 = arg0.method1397();
		this.anInt959 = arg0.method1366();
		this.anInt961 = arg0.method1366();
		this.aClass5_1 = new Class5();
		this.aClass59_5 = new Class59();
		this.aClass5_1.method141(arg0, this.aClass59_5);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[I")
	public int[] method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static37.anIntArray137[local1] = 0;
		}
		if (arg1 < 10) {
			return Static37.anIntArray137;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass59_9.method1653();
		this.aClass59_1.method1653();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass59_2 != null) {
			this.aClass59_2.method1653();
			this.aClass59_7.method1653();
			local31 = (int) ((double) (this.aClass59_2.anInt2352 - this.aClass59_2.anInt2351) * 32.768D / local23);
			local33 = (int) ((double) this.aClass59_2.anInt2351 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass59_4 != null) {
			this.aClass59_4.method1653();
			this.aClass59_6.method1653();
			local70 = (int) ((double) (this.aClass59_4.anInt2352 - this.aClass59_4.anInt2351) * 32.768D / local23);
			local72 = (int) ((double) this.aClass59_4.anInt2351 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray135[local109] != 0) {
				Static37.anIntArray142[local109] = 0;
				Static37.anIntArray140[local109] = (int) ((double) this.anIntArray133[local109] * local23);
				Static37.anIntArray139[local109] = (this.anIntArray135[local109] << 14) / 100;
				Static37.anIntArray141[local109] = (int) ((double) (this.aClass59_9.anInt2352 - this.aClass59_9.anInt2351) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray134[local109]) / local23);
				Static37.anIntArray143[local109] = (int) ((double) this.aClass59_9.anInt2351 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass59_9.method1650(arg0);
			local194 = this.aClass59_1.method1650(arg0);
			if (this.aClass59_2 != null) {
				local202 = this.aClass59_2.method1650(arg0);
				local207 = this.aClass59_7.method1650(arg0);
				local189 += this.method745(local35, local207, this.aClass59_2.anInt2353) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass59_4 != null) {
				local202 = this.aClass59_4.method1650(arg0);
				local207 = this.aClass59_6.method1650(arg0);
				local194 = local194 * ((this.method745(local74, local207, this.aClass59_4.anInt2353) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray135[local202] != 0) {
					local207 = local183 + Static37.anIntArray140[local202];
					if (local207 < arg0) {
						Static37.anIntArray137[local207] += this.method745(Static37.anIntArray142[local202], local194 * Static37.anIntArray139[local202] >> 15, this.aClass59_9.anInt2353);
						Static37.anIntArray142[local202] += (local189 * Static37.anIntArray141[local202] >> 16) + Static37.anIntArray143[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass59_8 != null) {
			this.aClass59_8.method1653();
			this.aClass59_3.method1653();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass59_8.method1650(arg0);
				local359 = this.aClass59_3.method1650(arg0);
				if (local346) {
					local194 = this.aClass59_8.anInt2351 + ((this.aClass59_8.anInt2352 - this.aClass59_8.anInt2351) * local354 >> 8);
				} else {
					local194 = this.aClass59_8.anInt2351 + ((this.aClass59_8.anInt2352 - this.aClass59_8.anInt2351) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static37.anIntArray137[local207] = 0;
				}
			}
		}
		if (this.anInt962 > 0 && this.anInt960 > 0) {
			local189 = (int) ((double) this.anInt962 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static37.anIntArray137[local194] += Static37.anIntArray137[local194 - local189] * this.anInt960 / 100;
			}
		}
		if (this.aClass5_1.anIntArray16[0] > 0 || this.aClass5_1.anIntArray16[1] > 0) {
			this.aClass59_5.method1653();
			local189 = this.aClass59_5.method1650(arg0 + 1);
			local194 = this.aClass5_1.method143(0, (float) local189 / 65536.0F);
			local202 = this.aClass5_1.method143(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static37.anIntArray137[local207 + local194] * (long) Static5.anInt147 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static37.anIntArray137[local207 + local194 - local526 - 1] * (long) Static5.anIntArrayArray4[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static37.anIntArray137[local207 - local556 - 1] * (long) Static5.anIntArrayArray4[1][local556] >> 16);
					}
					Static37.anIntArray137[local207] = local359;
					local189 = this.aClass59_5.method1650(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static37.anIntArray137[local207 + local194] * (long) Static5.anInt147 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static37.anIntArray137[local207 + local194 - local526 - 1] * (long) Static5.anIntArrayArray4[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static37.anIntArray137[local207 - local556 - 1] * (long) Static5.anIntArrayArray4[1][local556] >> 16);
						}
						Static37.anIntArray137[local207] = local359;
						local189 = this.aClass59_5.method1650(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static37.anIntArray137[local207 + local194 - local526 - 1] * (long) Static5.anIntArrayArray4[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static37.anIntArray137[local207 - local556 - 1] * (long) Static5.anIntArrayArray4[1][local556] >> 16);
							}
							Static37.anIntArray137[local207] = local359;
							this.aClass59_5.method1650(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass5_1.method143(0, (float) local189 / 65536.0F);
					local202 = this.aClass5_1.method143(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static37.anIntArray137[local189] < -32768) {
				Static37.anIntArray137[local189] = -32768;
			}
			if (Static37.anIntArray137[local189] > 32767) {
				Static37.anIntArray137[local189] = 32767;
			}
		}
		return Static37.anIntArray137;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
	private int method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray138[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray136[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
