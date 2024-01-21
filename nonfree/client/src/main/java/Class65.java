import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class65 {

	@OriginalMember(owner = "client!te", name = "t", descriptor = "[I")
	public static int[] anIntArray317 = new int[32768];

	@OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
	public static int[] anIntArray313;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!ea;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!ea;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!ea;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!ea;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!ea;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!ea;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Lclient!ea;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Lclient!ea;")
	private Class21 aClass21_8;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!ea;")
	private Class21 aClass21_9;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Lclient!hb;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
	private final int[] anIntArray314 = new int[5];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	private int anInt2526 = 0;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "I")
	public int anInt2528 = 500;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	private int anInt2529 = 100;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public int anInt2527 = 0;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[I")
	private final int[] anIntArray316 = new int[5];

	@OriginalMember(owner = "client!te", name = "m", descriptor = "[I")
	private final int[] anIntArray315 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray317[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray313 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray313[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!gb;)V")
	public void method1686(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass21_2 = new Class21();
		this.aClass21_2.method475(arg0);
		this.aClass21_9 = new Class21();
		this.aClass21_9.method475(arg0);
		@Pc(21) int local21 = arg0.method446();
		if (local21 != 0) {
			arg0.anInt627--;
			this.aClass21_6 = new Class21();
			this.aClass21_6.method475(arg0);
			this.aClass21_7 = new Class21();
			this.aClass21_7.method475(arg0);
		}
		local21 = arg0.method446();
		if (local21 != 0) {
			arg0.anInt627--;
			this.aClass21_5 = new Class21();
			this.aClass21_5.method475(arg0);
			this.aClass21_8 = new Class21();
			this.aClass21_8.method475(arg0);
		}
		local21 = arg0.method446();
		if (local21 != 0) {
			arg0.anInt627--;
			this.aClass21_3 = new Class21();
			this.aClass21_3.method475(arg0);
			this.aClass21_1 = new Class21();
			this.aClass21_1.method475(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method444();
			if (local114 == 0) {
				break;
			}
			this.anIntArray316[local109] = local114;
			this.anIntArray314[local109] = arg0.method436();
			this.anIntArray315[local109] = arg0.method444();
		}
		this.anInt2526 = arg0.method444();
		this.anInt2529 = arg0.method444();
		this.anInt2528 = arg0.method459();
		this.anInt2527 = arg0.method459();
		this.aClass33_1 = new Class33();
		this.aClass21_4 = new Class21();
		this.aClass33_1.method737(arg0, this.aClass21_4);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I")
	private int method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray313[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray317[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[I")
	public int[] method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static102.anIntArray312[local1] = 0;
		}
		if (arg1 < 10) {
			return Static102.anIntArray312;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass21_2.method474();
		this.aClass21_9.method474();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass21_6 != null) {
			this.aClass21_6.method474();
			this.aClass21_7.method474();
			local31 = (int) ((double) (this.aClass21_6.anInt693 - this.aClass21_6.anInt690) * 32.768D / local23);
			local33 = (int) ((double) this.aClass21_6.anInt690 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass21_5 != null) {
			this.aClass21_5.method474();
			this.aClass21_8.method474();
			local70 = (int) ((double) (this.aClass21_5.anInt693 - this.aClass21_5.anInt690) * 32.768D / local23);
			local72 = (int) ((double) this.aClass21_5.anInt690 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray316[local109] != 0) {
				Static102.anIntArray322[local109] = 0;
				Static102.anIntArray321[local109] = (int) ((double) this.anIntArray315[local109] * local23);
				Static102.anIntArray320[local109] = (this.anIntArray316[local109] << 14) / 100;
				Static102.anIntArray319[local109] = (int) ((double) (this.aClass21_2.anInt693 - this.aClass21_2.anInt690) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray314[local109]) / local23);
				Static102.anIntArray318[local109] = (int) ((double) this.aClass21_2.anInt690 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass21_2.method473(arg0);
			local194 = this.aClass21_9.method473(arg0);
			if (this.aClass21_6 != null) {
				local202 = this.aClass21_6.method473(arg0);
				local207 = this.aClass21_7.method473(arg0);
				local189 += this.method1688(local35, local207, this.aClass21_6.anInt692) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass21_5 != null) {
				local202 = this.aClass21_5.method473(arg0);
				local207 = this.aClass21_8.method473(arg0);
				local194 = local194 * ((this.method1688(local74, local207, this.aClass21_5.anInt692) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray316[local202] != 0) {
					local207 = local183 + Static102.anIntArray321[local202];
					if (local207 < arg0) {
						Static102.anIntArray312[local207] += this.method1688(Static102.anIntArray322[local202], local194 * Static102.anIntArray320[local202] >> 15, this.aClass21_2.anInt692);
						Static102.anIntArray322[local202] += (local189 * Static102.anIntArray319[local202] >> 16) + Static102.anIntArray318[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass21_3 != null) {
			this.aClass21_3.method474();
			this.aClass21_1.method474();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass21_3.method473(arg0);
				local359 = this.aClass21_1.method473(arg0);
				if (local346) {
					local194 = this.aClass21_3.anInt690 + ((this.aClass21_3.anInt693 - this.aClass21_3.anInt690) * local354 >> 8);
				} else {
					local194 = this.aClass21_3.anInt690 + ((this.aClass21_3.anInt693 - this.aClass21_3.anInt690) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static102.anIntArray312[local207] = 0;
				}
			}
		}
		if (this.anInt2526 > 0 && this.anInt2529 > 0) {
			local189 = (int) ((double) this.anInt2526 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static102.anIntArray312[local194] += Static102.anIntArray312[local194 - local189] * this.anInt2529 / 100;
			}
		}
		if (this.aClass33_1.anIntArray115[0] > 0 || this.aClass33_1.anIntArray115[1] > 0) {
			this.aClass21_4.method474();
			local189 = this.aClass21_4.method473(arg0 + 1);
			local194 = this.aClass33_1.method733(0, (float) local189 / 65536.0F);
			local202 = this.aClass33_1.method733(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static102.anIntArray312[local207 + local194] * (long) Static40.anInt1078 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static102.anIntArray312[local207 + local194 - local526 - 1] * (long) Static40.anIntArrayArray8[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static102.anIntArray312[local207 - local556 - 1] * (long) Static40.anIntArrayArray8[1][local556] >> 16);
					}
					Static102.anIntArray312[local207] = local359;
					local189 = this.aClass21_4.method473(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static102.anIntArray312[local207 + local194] * (long) Static40.anInt1078 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static102.anIntArray312[local207 + local194 - local526 - 1] * (long) Static40.anIntArrayArray8[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static102.anIntArray312[local207 - local556 - 1] * (long) Static40.anIntArrayArray8[1][local556] >> 16);
						}
						Static102.anIntArray312[local207] = local359;
						local189 = this.aClass21_4.method473(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static102.anIntArray312[local207 + local194 - local526 - 1] * (long) Static40.anIntArrayArray8[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static102.anIntArray312[local207 - local556 - 1] * (long) Static40.anIntArrayArray8[1][local556] >> 16);
							}
							Static102.anIntArray312[local207] = local359;
							this.aClass21_4.method473(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass33_1.method733(0, (float) local189 / 65536.0F);
					local202 = this.aClass33_1.method733(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static102.anIntArray312[local189] < -32768) {
				Static102.anIntArray312[local189] = -32768;
			}
			if (Static102.anIntArray312[local189] > 32767) {
				Static102.anIntArray312[local189] = 32767;
			}
		}
		return Static102.anIntArray312;
	}
}
