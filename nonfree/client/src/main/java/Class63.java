import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class63 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
	public static int[] anIntArray336 = new int[32768];

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!ce;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!ab;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!ce;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!ce;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!ce;")
	private Class13 aClass13_4;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!ce;")
	private Class13 aClass13_5;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!ce;")
	private Class13 aClass13_6;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!ce;")
	private Class13 aClass13_7;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!ce;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Lclient!ce;")
	private Class13 aClass13_9;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public int anInt2778 = 0;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
	private final int[] anIntArray337 = new int[5];

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public int anInt2780 = 500;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "[I")
	private final int[] anIntArray340 = new int[5];

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	private int anInt2779 = 0;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	private int anInt2781 = 100;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
	private final int[] anIntArray346 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray336[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray338 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray338[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
	public int[] method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static103.anIntArray339[local1] = 0;
		}
		if (arg1 < 10) {
			return Static103.anIntArray339;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass13_6.method335();
		this.aClass13_8.method335();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass13_4 != null) {
			this.aClass13_4.method335();
			this.aClass13_3.method335();
			local31 = (int) ((double) (this.aClass13_4.anInt380 - this.aClass13_4.anInt383) * 32.768D / local23);
			local33 = (int) ((double) this.aClass13_4.anInt383 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass13_2 != null) {
			this.aClass13_2.method335();
			this.aClass13_5.method335();
			local70 = (int) ((double) (this.aClass13_2.anInt380 - this.aClass13_2.anInt383) * 32.768D / local23);
			local72 = (int) ((double) this.aClass13_2.anInt383 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray346[local109] != 0) {
				Static103.anIntArray345[local109] = 0;
				Static103.anIntArray341[local109] = (int) ((double) this.anIntArray337[local109] * local23);
				Static103.anIntArray343[local109] = (this.anIntArray346[local109] << 14) / 100;
				Static103.anIntArray344[local109] = (int) ((double) (this.aClass13_6.anInt380 - this.aClass13_6.anInt383) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray340[local109]) / local23);
				Static103.anIntArray342[local109] = (int) ((double) this.aClass13_6.anInt383 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass13_6.method334(arg0);
			local194 = this.aClass13_8.method334(arg0);
			if (this.aClass13_4 != null) {
				local202 = this.aClass13_4.method334(arg0);
				local207 = this.aClass13_3.method334(arg0);
				local189 += this.method1979(local35, local207, this.aClass13_4.anInt382) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass13_2 != null) {
				local202 = this.aClass13_2.method334(arg0);
				local207 = this.aClass13_5.method334(arg0);
				local194 = local194 * ((this.method1979(local74, local207, this.aClass13_2.anInt382) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray346[local202] != 0) {
					local207 = local183 + Static103.anIntArray341[local202];
					if (local207 < arg0) {
						Static103.anIntArray339[local207] += this.method1979(Static103.anIntArray345[local202], local194 * Static103.anIntArray343[local202] >> 15, this.aClass13_6.anInt382);
						Static103.anIntArray345[local202] += (local189 * Static103.anIntArray344[local202] >> 16) + Static103.anIntArray342[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass13_7 != null) {
			this.aClass13_7.method335();
			this.aClass13_1.method335();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass13_7.method334(arg0);
				local359 = this.aClass13_1.method334(arg0);
				if (local346) {
					local194 = this.aClass13_7.anInt383 + ((this.aClass13_7.anInt380 - this.aClass13_7.anInt383) * local354 >> 8);
				} else {
					local194 = this.aClass13_7.anInt383 + ((this.aClass13_7.anInt380 - this.aClass13_7.anInt383) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static103.anIntArray339[local207] = 0;
				}
			}
		}
		if (this.anInt2779 > 0 && this.anInt2781 > 0) {
			local189 = (int) ((double) this.anInt2779 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static103.anIntArray339[local194] += Static103.anIntArray339[local194 - local189] * this.anInt2781 / 100;
			}
		}
		if (this.aClass3_1.anIntArray10[0] > 0 || this.aClass3_1.anIntArray10[1] > 0) {
			this.aClass13_9.method335();
			local189 = this.aClass13_9.method334(arg0 + 1);
			local194 = this.aClass3_1.method68(0, (float) local189 / 65536.0F);
			local202 = this.aClass3_1.method68(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static103.anIntArray339[local207 + local194] * (long) Static3.anInt92 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static103.anIntArray339[local207 + local194 - local526 - 1] * (long) Static3.anIntArrayArray1[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static103.anIntArray339[local207 - local556 - 1] * (long) Static3.anIntArrayArray1[1][local556] >> 16);
					}
					Static103.anIntArray339[local207] = local359;
					local189 = this.aClass13_9.method334(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static103.anIntArray339[local207 + local194] * (long) Static3.anInt92 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static103.anIntArray339[local207 + local194 - local526 - 1] * (long) Static3.anIntArrayArray1[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static103.anIntArray339[local207 - local556 - 1] * (long) Static3.anIntArrayArray1[1][local556] >> 16);
						}
						Static103.anIntArray339[local207] = local359;
						local189 = this.aClass13_9.method334(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static103.anIntArray339[local207 + local194 - local526 - 1] * (long) Static3.anIntArrayArray1[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static103.anIntArray339[local207 - local556 - 1] * (long) Static3.anIntArrayArray1[1][local556] >> 16);
							}
							Static103.anIntArray339[local207] = local359;
							this.aClass13_9.method334(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass3_1.method68(0, (float) local189 / 65536.0F);
					local202 = this.aClass3_1.method68(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static103.anIntArray339[local189] < -32768) {
				Static103.anIntArray339[local189] = -32768;
			}
			if (Static103.anIntArray339[local189] > 32767) {
				Static103.anIntArray339[local189] = 32767;
			}
		}
		return Static103.anIntArray339;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!g;)V")
	public void method1978(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aClass13_6 = new Class13();
		this.aClass13_6.method337(arg0);
		this.aClass13_8 = new Class13();
		this.aClass13_8.method337(arg0);
		@Pc(21) int local21 = arg0.method1281();
		if (local21 != 0) {
			arg0.anInt1772--;
			this.aClass13_4 = new Class13();
			this.aClass13_4.method337(arg0);
			this.aClass13_3 = new Class13();
			this.aClass13_3.method337(arg0);
		}
		local21 = arg0.method1281();
		if (local21 != 0) {
			arg0.anInt1772--;
			this.aClass13_2 = new Class13();
			this.aClass13_2.method337(arg0);
			this.aClass13_5 = new Class13();
			this.aClass13_5.method337(arg0);
		}
		local21 = arg0.method1281();
		if (local21 != 0) {
			arg0.anInt1772--;
			this.aClass13_7 = new Class13();
			this.aClass13_7.method337(arg0);
			this.aClass13_1 = new Class13();
			this.aClass13_1.method337(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1258();
			if (local114 == 0) {
				break;
			}
			this.anIntArray346[local109] = local114;
			this.anIntArray340[local109] = arg0.method1251();
			this.anIntArray337[local109] = arg0.method1258();
		}
		this.anInt2779 = arg0.method1258();
		this.anInt2781 = arg0.method1258();
		this.anInt2780 = arg0.method1273();
		this.anInt2778 = arg0.method1273();
		this.aClass3_1 = new Class3();
		this.aClass13_9 = new Class13();
		this.aClass3_1.method69(arg0, this.aClass13_9);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	private int method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray338[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray336[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
