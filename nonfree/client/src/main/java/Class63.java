import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class63 {

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
	public static int[] anIntArray291 = new int[32768];

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!ra;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!ra;")
	private Class65 aClass65_2;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!ra;")
	private Class65 aClass65_3;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!ra;")
	private Class65 aClass65_4;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!ra;")
	private Class65 aClass65_5;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!ra;")
	private Class65 aClass65_6;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!ra;")
	private Class65 aClass65_7;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!ra;")
	private Class65 aClass65_8;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!l;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Lclient!ra;")
	private Class65 aClass65_9;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public int anInt2206 = 500;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	private int anInt2205 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
	private final int[] anIntArray288 = new int[5];

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	private int anInt2207 = 100;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public int anInt2208 = 0;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
	private final int[] anIntArray290 = new int[5];

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	private final int[] anIntArray289 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray291[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray293 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray293[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ob;)V")
	public void method1530(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aClass65_4 = new Class65();
		this.aClass65_4.method1624(arg0);
		this.aClass65_1 = new Class65();
		this.aClass65_1.method1624(arg0);
		@Pc(21) int local21 = arg0.method647();
		if (local21 != 0) {
			arg0.anInt964--;
			this.aClass65_7 = new Class65();
			this.aClass65_7.method1624(arg0);
			this.aClass65_3 = new Class65();
			this.aClass65_3.method1624(arg0);
		}
		local21 = arg0.method647();
		if (local21 != 0) {
			arg0.anInt964--;
			this.aClass65_8 = new Class65();
			this.aClass65_8.method1624(arg0);
			this.aClass65_5 = new Class65();
			this.aClass65_5.method1624(arg0);
		}
		local21 = arg0.method647();
		if (local21 != 0) {
			arg0.anInt964--;
			this.aClass65_9 = new Class65();
			this.aClass65_9.method1624(arg0);
			this.aClass65_6 = new Class65();
			this.aClass65_6.method1624(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method619();
			if (local114 == 0) {
				break;
			}
			this.anIntArray288[local109] = local114;
			this.anIntArray289[local109] = arg0.method635();
			this.anIntArray290[local109] = arg0.method619();
		}
		this.anInt2205 = arg0.method619();
		this.anInt2207 = arg0.method619();
		this.anInt2206 = arg0.method602();
		this.anInt2208 = arg0.method602();
		this.aClass45_1 = new Class45();
		this.aClass65_2 = new Class65();
		this.aClass45_1.method1119(arg0, this.aClass65_2);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	private int method1532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray293[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray291[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)[I")
	public int[] method1533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static92.anIntArray292[local1] = 0;
		}
		if (arg1 < 10) {
			return Static92.anIntArray292;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass65_4.method1625();
		this.aClass65_1.method1625();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass65_7 != null) {
			this.aClass65_7.method1625();
			this.aClass65_3.method1625();
			local31 = (int) ((double) (this.aClass65_7.anInt2300 - this.aClass65_7.anInt2299) * 32.768D / local23);
			local33 = (int) ((double) this.aClass65_7.anInt2299 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass65_8 != null) {
			this.aClass65_8.method1625();
			this.aClass65_5.method1625();
			local70 = (int) ((double) (this.aClass65_8.anInt2300 - this.aClass65_8.anInt2299) * 32.768D / local23);
			local72 = (int) ((double) this.aClass65_8.anInt2299 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray288[local109] != 0) {
				Static92.anIntArray298[local109] = 0;
				Static92.anIntArray297[local109] = (int) ((double) this.anIntArray290[local109] * local23);
				Static92.anIntArray295[local109] = (this.anIntArray288[local109] << 14) / 100;
				Static92.anIntArray296[local109] = (int) ((double) (this.aClass65_4.anInt2300 - this.aClass65_4.anInt2299) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray289[local109]) / local23);
				Static92.anIntArray294[local109] = (int) ((double) this.aClass65_4.anInt2299 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass65_4.method1623(arg0);
			local194 = this.aClass65_1.method1623(arg0);
			if (this.aClass65_7 != null) {
				local202 = this.aClass65_7.method1623(arg0);
				local207 = this.aClass65_3.method1623(arg0);
				local189 += this.method1532(local35, local207, this.aClass65_7.anInt2298) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass65_8 != null) {
				local202 = this.aClass65_8.method1623(arg0);
				local207 = this.aClass65_5.method1623(arg0);
				local194 = local194 * ((this.method1532(local74, local207, this.aClass65_8.anInt2298) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray288[local202] != 0) {
					local207 = local183 + Static92.anIntArray297[local202];
					if (local207 < arg0) {
						Static92.anIntArray292[local207] += this.method1532(Static92.anIntArray298[local202], local194 * Static92.anIntArray295[local202] >> 15, this.aClass65_4.anInt2298);
						Static92.anIntArray298[local202] += (local189 * Static92.anIntArray296[local202] >> 16) + Static92.anIntArray294[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass65_9 != null) {
			this.aClass65_9.method1625();
			this.aClass65_6.method1625();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass65_9.method1623(arg0);
				local359 = this.aClass65_6.method1623(arg0);
				if (local346) {
					local194 = this.aClass65_9.anInt2299 + ((this.aClass65_9.anInt2300 - this.aClass65_9.anInt2299) * local354 >> 8);
				} else {
					local194 = this.aClass65_9.anInt2299 + ((this.aClass65_9.anInt2300 - this.aClass65_9.anInt2299) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static92.anIntArray292[local207] = 0;
				}
			}
		}
		if (this.anInt2205 > 0 && this.anInt2207 > 0) {
			local189 = (int) ((double) this.anInt2205 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static92.anIntArray292[local194] += Static92.anIntArray292[local194 - local189] * this.anInt2207 / 100;
			}
		}
		if (this.aClass45_1.anIntArray202[0] > 0 || this.aClass45_1.anIntArray202[1] > 0) {
			this.aClass65_2.method1625();
			local189 = this.aClass65_2.method1623(arg0 + 1);
			local194 = this.aClass45_1.method1118(0, (float) local189 / 65536.0F);
			local202 = this.aClass45_1.method1118(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static92.anIntArray292[local207 + local194] * (long) Static64.anInt1652 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static92.anIntArray292[local207 + local194 - local526 - 1] * (long) Static64.anIntArrayArray10[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static92.anIntArray292[local207 - local556 - 1] * (long) Static64.anIntArrayArray10[1][local556] >> 16);
					}
					Static92.anIntArray292[local207] = local359;
					local189 = this.aClass65_2.method1623(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static92.anIntArray292[local207 + local194] * (long) Static64.anInt1652 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static92.anIntArray292[local207 + local194 - local526 - 1] * (long) Static64.anIntArrayArray10[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static92.anIntArray292[local207 - local556 - 1] * (long) Static64.anIntArrayArray10[1][local556] >> 16);
						}
						Static92.anIntArray292[local207] = local359;
						local189 = this.aClass65_2.method1623(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static92.anIntArray292[local207 + local194 - local526 - 1] * (long) Static64.anIntArrayArray10[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static92.anIntArray292[local207 - local556 - 1] * (long) Static64.anIntArrayArray10[1][local556] >> 16);
							}
							Static92.anIntArray292[local207] = local359;
							this.aClass65_2.method1623(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass45_1.method1118(0, (float) local189 / 65536.0F);
					local202 = this.aClass45_1.method1118(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static92.anIntArray292[local189] < -32768) {
				Static92.anIntArray292[local189] = -32768;
			}
			if (Static92.anIntArray292[local189] > 32767) {
				Static92.anIntArray292[local189] = 32767;
			}
		}
		return Static92.anIntArray292;
	}
}
