import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class9 {

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[I")
	public static int[] anIntArray62 = new int[32768];

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!n;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!n;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!n;")
	private Class41 aClass41_3;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!n;")
	private Class41 aClass41_4;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!n;")
	private Class41 aClass41_5;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!ja;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!n;")
	private Class41 aClass41_6;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!n;")
	private Class41 aClass41_7;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!n;")
	private Class41 aClass41_8;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!n;")
	private Class41 aClass41_9;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
	private final int[] anIntArray58 = new int[5];

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public int anInt410 = 500;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt408 = 100;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[I")
	private final int[] anIntArray63 = new int[5];

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
	private final int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public int anInt409 = 0;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	private int anInt411 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray62[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray60 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray60[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private int method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray60[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray62[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fe;)V")
	public void method259(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aClass41_8 = new Class41();
		this.aClass41_8.method1195(arg0);
		this.aClass41_9 = new Class41();
		this.aClass41_9.method1195(arg0);
		@Pc(21) int local21 = arg0.method1410();
		if (local21 != 0) {
			arg0.anInt2342--;
			this.aClass41_7 = new Class41();
			this.aClass41_7.method1195(arg0);
			this.aClass41_5 = new Class41();
			this.aClass41_5.method1195(arg0);
		}
		local21 = arg0.method1410();
		if (local21 != 0) {
			arg0.anInt2342--;
			this.aClass41_2 = new Class41();
			this.aClass41_2.method1195(arg0);
			this.aClass41_4 = new Class41();
			this.aClass41_4.method1195(arg0);
		}
		local21 = arg0.method1410();
		if (local21 != 0) {
			arg0.anInt2342--;
			this.aClass41_3 = new Class41();
			this.aClass41_3.method1195(arg0);
			this.aClass41_6 = new Class41();
			this.aClass41_6.method1195(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1376();
			if (local114 == 0) {
				break;
			}
			this.anIntArray58[local109] = local114;
			this.anIntArray63[local109] = arg0.method1399();
			this.anIntArray59[local109] = arg0.method1376();
		}
		this.anInt411 = arg0.method1376();
		this.anInt408 = arg0.method1376();
		this.anInt410 = arg0.method1396();
		this.anInt409 = arg0.method1396();
		this.aClass29_1 = new Class29();
		this.aClass41_1 = new Class41();
		this.aClass29_1.method851(arg0, this.aClass41_1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
	public int[] method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static11.anIntArray61[local1] = 0;
		}
		if (arg1 < 10) {
			return Static11.anIntArray61;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass41_8.method1194();
		this.aClass41_9.method1194();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass41_7 != null) {
			this.aClass41_7.method1194();
			this.aClass41_5.method1194();
			local31 = (int) ((double) (this.aClass41_7.anInt1988 - this.aClass41_7.anInt1987) * 32.768D / local23);
			local33 = (int) ((double) this.aClass41_7.anInt1987 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass41_2 != null) {
			this.aClass41_2.method1194();
			this.aClass41_4.method1194();
			local70 = (int) ((double) (this.aClass41_2.anInt1988 - this.aClass41_2.anInt1987) * 32.768D / local23);
			local72 = (int) ((double) this.aClass41_2.anInt1987 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray58[local109] != 0) {
				Static11.anIntArray67[local109] = 0;
				Static11.anIntArray66[local109] = (int) ((double) this.anIntArray59[local109] * local23);
				Static11.anIntArray68[local109] = (this.anIntArray58[local109] << 14) / 100;
				Static11.anIntArray65[local109] = (int) ((double) (this.aClass41_8.anInt1988 - this.aClass41_8.anInt1987) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray63[local109]) / local23);
				Static11.anIntArray64[local109] = (int) ((double) this.aClass41_8.anInt1987 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass41_8.method1192(arg0);
			local194 = this.aClass41_9.method1192(arg0);
			if (this.aClass41_7 != null) {
				local202 = this.aClass41_7.method1192(arg0);
				local207 = this.aClass41_5.method1192(arg0);
				local189 += this.method257(local35, local207, this.aClass41_7.anInt1986) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass41_2 != null) {
				local202 = this.aClass41_2.method1192(arg0);
				local207 = this.aClass41_4.method1192(arg0);
				local194 = local194 * ((this.method257(local74, local207, this.aClass41_2.anInt1986) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray58[local202] != 0) {
					local207 = local183 + Static11.anIntArray66[local202];
					if (local207 < arg0) {
						Static11.anIntArray61[local207] += this.method257(Static11.anIntArray67[local202], local194 * Static11.anIntArray68[local202] >> 15, this.aClass41_8.anInt1986);
						Static11.anIntArray67[local202] += (local189 * Static11.anIntArray65[local202] >> 16) + Static11.anIntArray64[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass41_3 != null) {
			this.aClass41_3.method1194();
			this.aClass41_6.method1194();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass41_3.method1192(arg0);
				local359 = this.aClass41_6.method1192(arg0);
				if (local346) {
					local194 = this.aClass41_3.anInt1987 + ((this.aClass41_3.anInt1988 - this.aClass41_3.anInt1987) * local354 >> 8);
				} else {
					local194 = this.aClass41_3.anInt1987 + ((this.aClass41_3.anInt1988 - this.aClass41_3.anInt1987) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static11.anIntArray61[local207] = 0;
				}
			}
		}
		if (this.anInt411 > 0 && this.anInt408 > 0) {
			local189 = (int) ((double) this.anInt411 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static11.anIntArray61[local194] += Static11.anIntArray61[local194 - local189] * this.anInt408 / 100;
			}
		}
		if (this.aClass29_1.anIntArray197[0] > 0 || this.aClass29_1.anIntArray197[1] > 0) {
			this.aClass41_1.method1194();
			local189 = this.aClass41_1.method1192(arg0 + 1);
			local194 = this.aClass29_1.method846(0, (float) local189 / 65536.0F);
			local202 = this.aClass29_1.method846(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static11.anIntArray61[local207 + local194] * (long) Static49.anInt1415 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static11.anIntArray61[local207 + local194 - local526 - 1] * (long) Static49.anIntArrayArray12[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static11.anIntArray61[local207 - local556 - 1] * (long) Static49.anIntArrayArray12[1][local556] >> 16);
					}
					Static11.anIntArray61[local207] = local359;
					local189 = this.aClass41_1.method1192(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static11.anIntArray61[local207 + local194] * (long) Static49.anInt1415 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static11.anIntArray61[local207 + local194 - local526 - 1] * (long) Static49.anIntArrayArray12[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static11.anIntArray61[local207 - local556 - 1] * (long) Static49.anIntArrayArray12[1][local556] >> 16);
						}
						Static11.anIntArray61[local207] = local359;
						local189 = this.aClass41_1.method1192(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static11.anIntArray61[local207 + local194 - local526 - 1] * (long) Static49.anIntArrayArray12[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static11.anIntArray61[local207 - local556 - 1] * (long) Static49.anIntArrayArray12[1][local556] >> 16);
							}
							Static11.anIntArray61[local207] = local359;
							this.aClass41_1.method1192(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass29_1.method846(0, (float) local189 / 65536.0F);
					local202 = this.aClass29_1.method846(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static11.anIntArray61[local189] < -32768) {
				Static11.anIntArray61[local189] = -32768;
			}
			if (Static11.anIntArray61[local189] > 32767) {
				Static11.anIntArray61[local189] = 32767;
			}
		}
		return Static11.anIntArray61;
	}
}
