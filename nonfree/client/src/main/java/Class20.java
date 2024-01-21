import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class20 {

	@OriginalMember(owner = "client!f", name = "l", descriptor = "[I")
	public static int[] anIntArray133 = new int[32768];

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
	public static int[] anIntArray131;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!ia;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!ia;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!ia;")
	private Class33 aClass33_3;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!ia;")
	private Class33 aClass33_4;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!ia;")
	private Class33 aClass33_5;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!ia;")
	private Class33 aClass33_6;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!mf;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!ia;")
	private Class33 aClass33_7;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!ia;")
	private Class33 aClass33_8;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Lclient!ia;")
	private Class33 aClass33_9;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public int anInt1142 = 0;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	private int anInt1143 = 0;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public int anInt1144 = 500;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private int anInt1145 = 100;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[I")
	private final int[] anIntArray132 = new int[5];

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
	private final int[] anIntArray134 = new int[5];

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
	private final int[] anIntArray139 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray133[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray131 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray131[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
	private int method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray131[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray133[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	public int[] method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static34.anIntArray135[local1] = 0;
		}
		if (arg1 < 10) {
			return Static34.anIntArray135;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass33_1.method888();
		this.aClass33_3.method888();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass33_6 != null) {
			this.aClass33_6.method888();
			this.aClass33_2.method888();
			local31 = (int) ((double) (this.aClass33_6.anInt1533 - this.aClass33_6.anInt1532) * 32.768D / local23);
			local33 = (int) ((double) this.aClass33_6.anInt1532 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass33_7 != null) {
			this.aClass33_7.method888();
			this.aClass33_4.method888();
			local70 = (int) ((double) (this.aClass33_7.anInt1533 - this.aClass33_7.anInt1532) * 32.768D / local23);
			local72 = (int) ((double) this.aClass33_7.anInt1532 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray139[local109] != 0) {
				Static34.anIntArray137[local109] = 0;
				Static34.anIntArray136[local109] = (int) ((double) this.anIntArray132[local109] * local23);
				Static34.anIntArray141[local109] = (this.anIntArray139[local109] << 14) / 100;
				Static34.anIntArray138[local109] = (int) ((double) (this.aClass33_1.anInt1533 - this.aClass33_1.anInt1532) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray134[local109]) / local23);
				Static34.anIntArray140[local109] = (int) ((double) this.aClass33_1.anInt1532 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass33_1.method891(arg0);
			local194 = this.aClass33_3.method891(arg0);
			if (this.aClass33_6 != null) {
				local202 = this.aClass33_6.method891(arg0);
				local207 = this.aClass33_2.method891(arg0);
				local189 += this.method608(local35, local207, this.aClass33_6.anInt1530) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass33_7 != null) {
				local202 = this.aClass33_7.method891(arg0);
				local207 = this.aClass33_4.method891(arg0);
				local194 = local194 * ((this.method608(local74, local207, this.aClass33_7.anInt1530) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray139[local202] != 0) {
					local207 = local183 + Static34.anIntArray136[local202];
					if (local207 < arg0) {
						Static34.anIntArray135[local207] += this.method608(Static34.anIntArray137[local202], local194 * Static34.anIntArray141[local202] >> 15, this.aClass33_1.anInt1530);
						Static34.anIntArray137[local202] += (local189 * Static34.anIntArray138[local202] >> 16) + Static34.anIntArray140[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass33_5 != null) {
			this.aClass33_5.method888();
			this.aClass33_8.method888();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass33_5.method891(arg0);
				local359 = this.aClass33_8.method891(arg0);
				if (local346) {
					local194 = this.aClass33_5.anInt1532 + ((this.aClass33_5.anInt1533 - this.aClass33_5.anInt1532) * local354 >> 8);
				} else {
					local194 = this.aClass33_5.anInt1532 + ((this.aClass33_5.anInt1533 - this.aClass33_5.anInt1532) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static34.anIntArray135[local207] = 0;
				}
			}
		}
		if (this.anInt1143 > 0 && this.anInt1145 > 0) {
			local189 = (int) ((double) this.anInt1143 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static34.anIntArray135[local194] += Static34.anIntArray135[local194 - local189] * this.anInt1145 / 100;
			}
		}
		if (this.aClass50_1.anIntArray259[0] > 0 || this.aClass50_1.anIntArray259[1] > 0) {
			this.aClass33_9.method888();
			local189 = this.aClass33_9.method891(arg0 + 1);
			local194 = this.aClass50_1.method1184(0, (float) local189 / 65536.0F);
			local202 = this.aClass50_1.method1184(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static34.anIntArray135[local207 + local194] * (long) Static75.anInt1964 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static34.anIntArray135[local207 + local194 - local526 - 1] * (long) Static75.anIntArrayArray25[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static34.anIntArray135[local207 - local556 - 1] * (long) Static75.anIntArrayArray25[1][local556] >> 16);
					}
					Static34.anIntArray135[local207] = local359;
					local189 = this.aClass33_9.method891(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static34.anIntArray135[local207 + local194] * (long) Static75.anInt1964 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static34.anIntArray135[local207 + local194 - local526 - 1] * (long) Static75.anIntArrayArray25[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static34.anIntArray135[local207 - local556 - 1] * (long) Static75.anIntArrayArray25[1][local556] >> 16);
						}
						Static34.anIntArray135[local207] = local359;
						local189 = this.aClass33_9.method891(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static34.anIntArray135[local207 + local194 - local526 - 1] * (long) Static75.anIntArrayArray25[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static34.anIntArray135[local207 - local556 - 1] * (long) Static75.anIntArrayArray25[1][local556] >> 16);
							}
							Static34.anIntArray135[local207] = local359;
							this.aClass33_9.method891(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass50_1.method1184(0, (float) local189 / 65536.0F);
					local202 = this.aClass50_1.method1184(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static34.anIntArray135[local189] < -32768) {
				Static34.anIntArray135[local189] = -32768;
			}
			if (Static34.anIntArray135[local189] > 32767) {
				Static34.anIntArray135[local189] = 32767;
			}
		}
		return Static34.anIntArray135;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!wb;)V")
	public void method611(@OriginalArg(0) Class2_Sub17 arg0) {
		this.aClass33_1 = new Class33();
		this.aClass33_1.method889(arg0);
		this.aClass33_3 = new Class33();
		this.aClass33_3.method889(arg0);
		@Pc(21) int local21 = arg0.method1780();
		if (local21 != 0) {
			arg0.anInt2799--;
			this.aClass33_6 = new Class33();
			this.aClass33_6.method889(arg0);
			this.aClass33_2 = new Class33();
			this.aClass33_2.method889(arg0);
		}
		local21 = arg0.method1780();
		if (local21 != 0) {
			arg0.anInt2799--;
			this.aClass33_7 = new Class33();
			this.aClass33_7.method889(arg0);
			this.aClass33_4 = new Class33();
			this.aClass33_4.method889(arg0);
		}
		local21 = arg0.method1780();
		if (local21 != 0) {
			arg0.anInt2799--;
			this.aClass33_5 = new Class33();
			this.aClass33_5.method889(arg0);
			this.aClass33_8 = new Class33();
			this.aClass33_8.method889(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1787();
			if (local114 == 0) {
				break;
			}
			this.anIntArray139[local109] = local114;
			this.anIntArray134[local109] = arg0.method1791();
			this.anIntArray132[local109] = arg0.method1787();
		}
		this.anInt1143 = arg0.method1787();
		this.anInt1145 = arg0.method1787();
		this.anInt1144 = arg0.method1783();
		this.anInt1142 = arg0.method1783();
		this.aClass50_1 = new Class50();
		this.aClass33_9 = new Class33();
		this.aClass50_1.method1185(arg0, this.aClass33_9);
	}
}
