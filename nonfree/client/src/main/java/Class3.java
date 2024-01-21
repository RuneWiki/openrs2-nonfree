import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	public static int[] anIntArray17 = new int[32768];

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!fb;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!fb;")
	private Class19 aClass19_2;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!eb;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!fb;")
	private Class19 aClass19_3;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!fb;")
	private Class19 aClass19_4;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!fb;")
	private Class19 aClass19_5;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!fb;")
	private Class19 aClass19_6;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!fb;")
	private Class19 aClass19_7;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!fb;")
	private Class19 aClass19_8;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!fb;")
	private Class19 aClass19_9;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public int anInt138 = 0;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt139 = 100;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt140 = 0;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
	private final int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "[I")
	private final int[] anIntArray20 = new int[5];

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
	public int anInt141 = 500;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "[I")
	private final int[] anIntArray26 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray17[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray18 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray18[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!rc;)V")
	public void method65(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aClass19_4 = new Class19();
		this.aClass19_4.method447(arg0);
		this.aClass19_3 = new Class19();
		this.aClass19_3.method447(arg0);
		@Pc(21) int local21 = arg0.method716();
		if (local21 != 0) {
			arg0.anInt1266--;
			this.aClass19_5 = new Class19();
			this.aClass19_5.method447(arg0);
			this.aClass19_7 = new Class19();
			this.aClass19_7.method447(arg0);
		}
		local21 = arg0.method716();
		if (local21 != 0) {
			arg0.anInt1266--;
			this.aClass19_8 = new Class19();
			this.aClass19_8.method447(arg0);
			this.aClass19_1 = new Class19();
			this.aClass19_1.method447(arg0);
		}
		local21 = arg0.method716();
		if (local21 != 0) {
			arg0.anInt1266--;
			this.aClass19_6 = new Class19();
			this.aClass19_6.method447(arg0);
			this.aClass19_9 = new Class19();
			this.aClass19_9.method447(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method721();
			if (local114 == 0) {
				break;
			}
			this.anIntArray19[local109] = local114;
			this.anIntArray26[local109] = arg0.method706();
			this.anIntArray20[local109] = arg0.method721();
		}
		this.anInt140 = arg0.method721();
		this.anInt139 = arg0.method721();
		this.anInt141 = arg0.method715();
		this.anInt138 = arg0.method715();
		this.aClass16_1 = new Class16();
		this.aClass19_2 = new Class19();
		this.aClass16_1.method380(arg0, this.aClass19_2);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
	private int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray18[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray17[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
	public int[] method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static4.anIntArray16[local1] = 0;
		}
		if (arg1 < 10) {
			return Static4.anIntArray16;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass19_4.method445();
		this.aClass19_3.method445();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass19_5 != null) {
			this.aClass19_5.method445();
			this.aClass19_7.method445();
			local31 = (int) ((double) (this.aClass19_5.anInt866 - this.aClass19_5.anInt864) * 32.768D / local23);
			local33 = (int) ((double) this.aClass19_5.anInt864 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass19_8 != null) {
			this.aClass19_8.method445();
			this.aClass19_1.method445();
			local70 = (int) ((double) (this.aClass19_8.anInt866 - this.aClass19_8.anInt864) * 32.768D / local23);
			local72 = (int) ((double) this.aClass19_8.anInt864 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray19[local109] != 0) {
				Static4.anIntArray23[local109] = 0;
				Static4.anIntArray25[local109] = (int) ((double) this.anIntArray20[local109] * local23);
				Static4.anIntArray21[local109] = (this.anIntArray19[local109] << 14) / 100;
				Static4.anIntArray24[local109] = (int) ((double) (this.aClass19_4.anInt866 - this.aClass19_4.anInt864) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray26[local109]) / local23);
				Static4.anIntArray22[local109] = (int) ((double) this.aClass19_4.anInt864 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass19_4.method446(arg0);
			local194 = this.aClass19_3.method446(arg0);
			if (this.aClass19_5 != null) {
				local202 = this.aClass19_5.method446(arg0);
				local207 = this.aClass19_7.method446(arg0);
				local189 += this.method66(local35, local207, this.aClass19_5.anInt863) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass19_8 != null) {
				local202 = this.aClass19_8.method446(arg0);
				local207 = this.aClass19_1.method446(arg0);
				local194 = local194 * ((this.method66(local74, local207, this.aClass19_8.anInt863) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray19[local202] != 0) {
					local207 = local183 + Static4.anIntArray25[local202];
					if (local207 < arg0) {
						Static4.anIntArray16[local207] += this.method66(Static4.anIntArray23[local202], local194 * Static4.anIntArray21[local202] >> 15, this.aClass19_4.anInt863);
						Static4.anIntArray23[local202] += (local189 * Static4.anIntArray24[local202] >> 16) + Static4.anIntArray22[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass19_6 != null) {
			this.aClass19_6.method445();
			this.aClass19_9.method445();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass19_6.method446(arg0);
				local359 = this.aClass19_9.method446(arg0);
				if (local346) {
					local194 = this.aClass19_6.anInt864 + ((this.aClass19_6.anInt866 - this.aClass19_6.anInt864) * local354 >> 8);
				} else {
					local194 = this.aClass19_6.anInt864 + ((this.aClass19_6.anInt866 - this.aClass19_6.anInt864) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static4.anIntArray16[local207] = 0;
				}
			}
		}
		if (this.anInt140 > 0 && this.anInt139 > 0) {
			local189 = (int) ((double) this.anInt140 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static4.anIntArray16[local194] += Static4.anIntArray16[local194 - local189] * this.anInt139 / 100;
			}
		}
		if (this.aClass16_1.anIntArray105[0] > 0 || this.aClass16_1.anIntArray105[1] > 0) {
			this.aClass19_2.method445();
			local189 = this.aClass19_2.method446(arg0 + 1);
			local194 = this.aClass16_1.method381(0, (float) local189 / 65536.0F);
			local202 = this.aClass16_1.method381(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static4.anIntArray16[local207 + local194] * (long) Static23.anInt734 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static4.anIntArray16[local207 + local194 - local526 - 1] * (long) Static23.anIntArrayArray15[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static4.anIntArray16[local207 - local556 - 1] * (long) Static23.anIntArrayArray15[1][local556] >> 16);
					}
					Static4.anIntArray16[local207] = local359;
					local189 = this.aClass19_2.method446(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static4.anIntArray16[local207 + local194] * (long) Static23.anInt734 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static4.anIntArray16[local207 + local194 - local526 - 1] * (long) Static23.anIntArrayArray15[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static4.anIntArray16[local207 - local556 - 1] * (long) Static23.anIntArrayArray15[1][local556] >> 16);
						}
						Static4.anIntArray16[local207] = local359;
						local189 = this.aClass19_2.method446(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static4.anIntArray16[local207 + local194 - local526 - 1] * (long) Static23.anIntArrayArray15[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static4.anIntArray16[local207 - local556 - 1] * (long) Static23.anIntArrayArray15[1][local556] >> 16);
							}
							Static4.anIntArray16[local207] = local359;
							this.aClass19_2.method446(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass16_1.method381(0, (float) local189 / 65536.0F);
					local202 = this.aClass16_1.method381(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static4.anIntArray16[local189] < -32768) {
				Static4.anIntArray16[local189] = -32768;
			}
			if (Static4.anIntArray16[local189] > 32767) {
				Static4.anIntArray16[local189] = 32767;
			}
		}
		return Static4.anIntArray16;
	}
}
