import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class40 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
	public static int[] anIntArray279 = new int[32768];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!oc;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!oc;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!oc;")
	private Class46 aClass46_3;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!oc;")
	private Class46 aClass46_4;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!oc;")
	private Class46 aClass46_5;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!oc;")
	private Class46 aClass46_6;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "Lclient!oc;")
	private Class46 aClass46_7;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Lclient!oc;")
	private Class46 aClass46_8;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!ub;")
	private Class61 aClass61_1;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Lclient!oc;")
	private Class46 aClass46_9;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	private int anInt1623 = 0;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
	private final int[] anIntArray277 = new int[5];

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public int anInt1624 = 500;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "[I")
	private final int[] anIntArray282 = new int[5];

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public int anInt1625 = 0;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
	private int anInt1626 = 100;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
	private final int[] anIntArray280 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray279[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray276 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray276[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!wd;)V")
	public void method1163(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aClass46_6 = new Class46();
		this.aClass46_6.method1484(arg0);
		this.aClass46_8 = new Class46();
		this.aClass46_8.method1484(arg0);
		@Pc(21) int local21 = arg0.method1421();
		if (local21 != 0) {
			arg0.anInt2060--;
			this.aClass46_2 = new Class46();
			this.aClass46_2.method1484(arg0);
			this.aClass46_4 = new Class46();
			this.aClass46_4.method1484(arg0);
		}
		local21 = arg0.method1421();
		if (local21 != 0) {
			arg0.anInt2060--;
			this.aClass46_5 = new Class46();
			this.aClass46_5.method1484(arg0);
			this.aClass46_3 = new Class46();
			this.aClass46_3.method1484(arg0);
		}
		local21 = arg0.method1421();
		if (local21 != 0) {
			arg0.anInt2060--;
			this.aClass46_9 = new Class46();
			this.aClass46_9.method1484(arg0);
			this.aClass46_1 = new Class46();
			this.aClass46_1.method1484(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1469();
			if (local114 == 0) {
				break;
			}
			this.anIntArray280[local109] = local114;
			this.anIntArray277[local109] = arg0.method1446();
			this.anIntArray282[local109] = arg0.method1469();
		}
		this.anInt1623 = arg0.method1469();
		this.anInt1626 = arg0.method1469();
		this.anInt1624 = arg0.method1451();
		this.anInt1625 = arg0.method1451();
		this.aClass61_1 = new Class61();
		this.aClass46_7 = new Class46();
		this.aClass61_1.method1810(arg0, this.aClass46_7);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
	public int[] method1164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static63.anIntArray278[local1] = 0;
		}
		if (arg1 < 10) {
			return Static63.anIntArray278;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass46_6.method1483();
		this.aClass46_8.method1483();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass46_2 != null) {
			this.aClass46_2.method1483();
			this.aClass46_4.method1483();
			local31 = (int) ((double) (this.aClass46_2.anInt2089 - this.aClass46_2.anInt2088) * 32.768D / local23);
			local33 = (int) ((double) this.aClass46_2.anInt2088 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass46_5 != null) {
			this.aClass46_5.method1483();
			this.aClass46_3.method1483();
			local70 = (int) ((double) (this.aClass46_5.anInt2089 - this.aClass46_5.anInt2088) * 32.768D / local23);
			local72 = (int) ((double) this.aClass46_5.anInt2088 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray280[local109] != 0) {
				Static63.anIntArray286[local109] = 0;
				Static63.anIntArray283[local109] = (int) ((double) this.anIntArray282[local109] * local23);
				Static63.anIntArray285[local109] = (this.anIntArray280[local109] << 14) / 100;
				Static63.anIntArray281[local109] = (int) ((double) (this.aClass46_6.anInt2089 - this.aClass46_6.anInt2088) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray277[local109]) / local23);
				Static63.anIntArray284[local109] = (int) ((double) this.aClass46_6.anInt2088 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass46_6.method1485(arg0);
			local194 = this.aClass46_8.method1485(arg0);
			if (this.aClass46_2 != null) {
				local202 = this.aClass46_2.method1485(arg0);
				local207 = this.aClass46_4.method1485(arg0);
				local189 += this.method1165(local35, local207, this.aClass46_2.anInt2090) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass46_5 != null) {
				local202 = this.aClass46_5.method1485(arg0);
				local207 = this.aClass46_3.method1485(arg0);
				local194 = local194 * ((this.method1165(local74, local207, this.aClass46_5.anInt2090) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray280[local202] != 0) {
					local207 = local183 + Static63.anIntArray283[local202];
					if (local207 < arg0) {
						Static63.anIntArray278[local207] += this.method1165(Static63.anIntArray286[local202], local194 * Static63.anIntArray285[local202] >> 15, this.aClass46_6.anInt2090);
						Static63.anIntArray286[local202] += (local189 * Static63.anIntArray281[local202] >> 16) + Static63.anIntArray284[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass46_9 != null) {
			this.aClass46_9.method1483();
			this.aClass46_1.method1483();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass46_9.method1485(arg0);
				local359 = this.aClass46_1.method1485(arg0);
				if (local346) {
					local194 = this.aClass46_9.anInt2088 + ((this.aClass46_9.anInt2089 - this.aClass46_9.anInt2088) * local354 >> 8);
				} else {
					local194 = this.aClass46_9.anInt2088 + ((this.aClass46_9.anInt2089 - this.aClass46_9.anInt2088) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static63.anIntArray278[local207] = 0;
				}
			}
		}
		if (this.anInt1623 > 0 && this.anInt1626 > 0) {
			local189 = (int) ((double) this.anInt1623 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static63.anIntArray278[local194] += Static63.anIntArray278[local194 - local189] * this.anInt1626 / 100;
			}
		}
		if (this.aClass61_1.anIntArray388[0] > 0 || this.aClass61_1.anIntArray388[1] > 0) {
			this.aClass46_7.method1483();
			local189 = this.aClass46_7.method1485(arg0 + 1);
			local194 = this.aClass61_1.method1811(0, (float) local189 / 65536.0F);
			local202 = this.aClass61_1.method1811(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static63.anIntArray278[local207 + local194] * (long) Static100.anInt2624 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static63.anIntArray278[local207 + local194 - local526 - 1] * (long) Static100.anIntArrayArray68[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static63.anIntArray278[local207 - local556 - 1] * (long) Static100.anIntArrayArray68[1][local556] >> 16);
					}
					Static63.anIntArray278[local207] = local359;
					local189 = this.aClass46_7.method1485(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static63.anIntArray278[local207 + local194] * (long) Static100.anInt2624 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static63.anIntArray278[local207 + local194 - local526 - 1] * (long) Static100.anIntArrayArray68[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static63.anIntArray278[local207 - local556 - 1] * (long) Static100.anIntArrayArray68[1][local556] >> 16);
						}
						Static63.anIntArray278[local207] = local359;
						local189 = this.aClass46_7.method1485(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static63.anIntArray278[local207 + local194 - local526 - 1] * (long) Static100.anIntArrayArray68[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static63.anIntArray278[local207 - local556 - 1] * (long) Static100.anIntArrayArray68[1][local556] >> 16);
							}
							Static63.anIntArray278[local207] = local359;
							this.aClass46_7.method1485(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass61_1.method1811(0, (float) local189 / 65536.0F);
					local202 = this.aClass61_1.method1811(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static63.anIntArray278[local189] < -32768) {
				Static63.anIntArray278[local189] = -32768;
			}
			if (Static63.anIntArray278[local189] > 32767) {
				Static63.anIntArray278[local189] = 32767;
			}
		}
		return Static63.anIntArray278;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
	private int method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray276[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray279[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
