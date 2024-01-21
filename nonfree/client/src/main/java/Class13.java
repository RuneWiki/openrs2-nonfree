import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class13 {

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
	public static int[] anIntArray61 = new int[32768];

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!gb;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!gb;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!gb;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!gb;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!gb;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!gb;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!gb;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!gb;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "Lclient!le;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!gb;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	private int anInt428 = 100;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	private int anInt429 = 0;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
	public int anInt430 = 500;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
	private final int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
	private final int[] anIntArray57 = new int[5];

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
	private final int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public int anInt427 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray61[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray60 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray60[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	private int method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray60[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray61[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
	public int[] method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static15.anIntArray58[local1] = 0;
		}
		if (arg1 < 10) {
			return Static15.anIntArray58;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass27_8.method693();
		this.aClass27_9.method693();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass27_2 != null) {
			this.aClass27_2.method693();
			this.aClass27_6.method693();
			local31 = (int) ((double) (this.aClass27_2.anInt958 - this.aClass27_2.anInt960) * 32.768D / local23);
			local33 = (int) ((double) this.aClass27_2.anInt960 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass27_7 != null) {
			this.aClass27_7.method693();
			this.aClass27_3.method693();
			local70 = (int) ((double) (this.aClass27_7.anInt958 - this.aClass27_7.anInt960) * 32.768D / local23);
			local72 = (int) ((double) this.aClass27_7.anInt960 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray59[local109] != 0) {
				Static15.anIntArray65[local109] = 0;
				Static15.anIntArray64[local109] = (int) ((double) this.anIntArray57[local109] * local23);
				Static15.anIntArray63[local109] = (this.anIntArray59[local109] << 14) / 100;
				Static15.anIntArray66[local109] = (int) ((double) (this.aClass27_8.anInt958 - this.aClass27_8.anInt960) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray56[local109]) / local23);
				Static15.anIntArray62[local109] = (int) ((double) this.aClass27_8.anInt960 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass27_8.method694(arg0);
			local194 = this.aClass27_9.method694(arg0);
			if (this.aClass27_2 != null) {
				local202 = this.aClass27_2.method694(arg0);
				local207 = this.aClass27_6.method694(arg0);
				local189 += this.method273(local35, local207, this.aClass27_2.anInt959) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass27_7 != null) {
				local202 = this.aClass27_7.method694(arg0);
				local207 = this.aClass27_3.method694(arg0);
				local194 = local194 * ((this.method273(local74, local207, this.aClass27_7.anInt959) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray59[local202] != 0) {
					local207 = local183 + Static15.anIntArray64[local202];
					if (local207 < arg0) {
						Static15.anIntArray58[local207] += this.method273(Static15.anIntArray65[local202], local194 * Static15.anIntArray63[local202] >> 15, this.aClass27_8.anInt959);
						Static15.anIntArray65[local202] += (local189 * Static15.anIntArray66[local202] >> 16) + Static15.anIntArray62[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass27_4 != null) {
			this.aClass27_4.method693();
			this.aClass27_1.method693();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass27_4.method694(arg0);
				local359 = this.aClass27_1.method694(arg0);
				if (local346) {
					local194 = this.aClass27_4.anInt960 + ((this.aClass27_4.anInt958 - this.aClass27_4.anInt960) * local354 >> 8);
				} else {
					local194 = this.aClass27_4.anInt960 + ((this.aClass27_4.anInt958 - this.aClass27_4.anInt960) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static15.anIntArray58[local207] = 0;
				}
			}
		}
		if (this.anInt429 > 0 && this.anInt428 > 0) {
			local189 = (int) ((double) this.anInt429 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static15.anIntArray58[local194] += Static15.anIntArray58[local194 - local189] * this.anInt428 / 100;
			}
		}
		if (this.aClass43_1.anIntArray285[0] > 0 || this.aClass43_1.anIntArray285[1] > 0) {
			this.aClass27_5.method693();
			local189 = this.aClass27_5.method694(arg0 + 1);
			local194 = this.aClass43_1.method1263(0, (float) local189 / 65536.0F);
			local202 = this.aClass43_1.method1263(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static15.anIntArray58[local207 + local194] * (long) Static65.anInt1857 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static15.anIntArray58[local207 + local194 - local526 - 1] * (long) Static65.anIntArrayArray20[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static15.anIntArray58[local207 - local556 - 1] * (long) Static65.anIntArrayArray20[1][local556] >> 16);
					}
					Static15.anIntArray58[local207] = local359;
					local189 = this.aClass27_5.method694(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static15.anIntArray58[local207 + local194] * (long) Static65.anInt1857 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static15.anIntArray58[local207 + local194 - local526 - 1] * (long) Static65.anIntArrayArray20[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static15.anIntArray58[local207 - local556 - 1] * (long) Static65.anIntArrayArray20[1][local556] >> 16);
						}
						Static15.anIntArray58[local207] = local359;
						local189 = this.aClass27_5.method694(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static15.anIntArray58[local207 + local194 - local526 - 1] * (long) Static65.anIntArrayArray20[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static15.anIntArray58[local207 - local556 - 1] * (long) Static65.anIntArrayArray20[1][local556] >> 16);
							}
							Static15.anIntArray58[local207] = local359;
							this.aClass27_5.method694(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass43_1.method1263(0, (float) local189 / 65536.0F);
					local202 = this.aClass43_1.method1263(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static15.anIntArray58[local189] < -32768) {
				Static15.anIntArray58[local189] = -32768;
			}
			if (Static15.anIntArray58[local189] > 32767) {
				Static15.anIntArray58[local189] = 32767;
			}
		}
		return Static15.anIntArray58;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!hb;)V")
	public void method275(@OriginalArg(0) Class5_Sub9 arg0) {
		this.aClass27_8 = new Class27();
		this.aClass27_8.method695(arg0);
		this.aClass27_9 = new Class27();
		this.aClass27_9.method695(arg0);
		@Pc(21) int local21 = arg0.method1408();
		if (local21 != 0) {
			arg0.anInt2140--;
			this.aClass27_2 = new Class27();
			this.aClass27_2.method695(arg0);
			this.aClass27_6 = new Class27();
			this.aClass27_6.method695(arg0);
		}
		local21 = arg0.method1408();
		if (local21 != 0) {
			arg0.anInt2140--;
			this.aClass27_7 = new Class27();
			this.aClass27_7.method695(arg0);
			this.aClass27_3 = new Class27();
			this.aClass27_3.method695(arg0);
		}
		local21 = arg0.method1408();
		if (local21 != 0) {
			arg0.anInt2140--;
			this.aClass27_4 = new Class27();
			this.aClass27_4.method695(arg0);
			this.aClass27_1 = new Class27();
			this.aClass27_1.method695(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1417();
			if (local114 == 0) {
				break;
			}
			this.anIntArray59[local109] = local114;
			this.anIntArray56[local109] = arg0.method1445();
			this.anIntArray57[local109] = arg0.method1417();
		}
		this.anInt429 = arg0.method1417();
		this.anInt428 = arg0.method1417();
		this.anInt430 = arg0.method1418();
		this.anInt427 = arg0.method1418();
		this.aClass43_1 = new Class43();
		this.aClass27_5 = new Class27();
		this.aClass43_1.method1265(arg0, this.aClass27_5);
	}
}
