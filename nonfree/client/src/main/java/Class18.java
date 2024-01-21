import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class18 {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[I")
	public static int[] anIntArray160 = new int[32768];

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!tc;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!s;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!s;")
	private Class55 aClass55_2;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!s;")
	private Class55 aClass55_3;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!s;")
	private Class55 aClass55_4;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!s;")
	private Class55 aClass55_5;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!s;")
	private Class55 aClass55_6;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!s;")
	private Class55 aClass55_7;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!s;")
	private Class55 aClass55_8;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!s;")
	private Class55 aClass55_9;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
	private int anInt1281 = 0;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public int anInt1282 = 0;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
	private final int[] anIntArray159 = new int[5];

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "[I")
	private final int[] anIntArray161 = new int[5];

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	private int anInt1284 = 100;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
	public int anInt1283 = 500;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "[I")
	private final int[] anIntArray163 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray160[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray157 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray157[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	private int method855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray157[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray160[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I")
	public int[] method856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static32.anIntArray158[local1] = 0;
		}
		if (arg1 < 10) {
			return Static32.anIntArray158;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass55_1.method1493();
		this.aClass55_7.method1493();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass55_5 != null) {
			this.aClass55_5.method1493();
			this.aClass55_4.method1493();
			local31 = (int) ((double) (this.aClass55_5.anInt2378 - this.aClass55_5.anInt2375) * 32.768D / local23);
			local33 = (int) ((double) this.aClass55_5.anInt2375 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass55_3 != null) {
			this.aClass55_3.method1493();
			this.aClass55_8.method1493();
			local70 = (int) ((double) (this.aClass55_3.anInt2378 - this.aClass55_3.anInt2375) * 32.768D / local23);
			local72 = (int) ((double) this.aClass55_3.anInt2375 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray159[local109] != 0) {
				Static32.anIntArray162[local109] = 0;
				Static32.anIntArray167[local109] = (int) ((double) this.anIntArray163[local109] * local23);
				Static32.anIntArray166[local109] = (this.anIntArray159[local109] << 14) / 100;
				Static32.anIntArray165[local109] = (int) ((double) (this.aClass55_1.anInt2378 - this.aClass55_1.anInt2375) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray161[local109]) / local23);
				Static32.anIntArray164[local109] = (int) ((double) this.aClass55_1.anInt2375 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass55_1.method1495(arg0);
			local194 = this.aClass55_7.method1495(arg0);
			if (this.aClass55_5 != null) {
				local202 = this.aClass55_5.method1495(arg0);
				local207 = this.aClass55_4.method1495(arg0);
				local189 += this.method855(local35, local207, this.aClass55_5.anInt2376) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass55_3 != null) {
				local202 = this.aClass55_3.method1495(arg0);
				local207 = this.aClass55_8.method1495(arg0);
				local194 = local194 * ((this.method855(local74, local207, this.aClass55_3.anInt2376) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray159[local202] != 0) {
					local207 = local183 + Static32.anIntArray167[local202];
					if (local207 < arg0) {
						Static32.anIntArray158[local207] += this.method855(Static32.anIntArray162[local202], local194 * Static32.anIntArray166[local202] >> 15, this.aClass55_1.anInt2376);
						Static32.anIntArray162[local202] += (local189 * Static32.anIntArray165[local202] >> 16) + Static32.anIntArray164[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass55_6 != null) {
			this.aClass55_6.method1493();
			this.aClass55_9.method1493();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass55_6.method1495(arg0);
				local359 = this.aClass55_9.method1495(arg0);
				if (local346) {
					local194 = this.aClass55_6.anInt2375 + ((this.aClass55_6.anInt2378 - this.aClass55_6.anInt2375) * local354 >> 8);
				} else {
					local194 = this.aClass55_6.anInt2375 + ((this.aClass55_6.anInt2378 - this.aClass55_6.anInt2375) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static32.anIntArray158[local207] = 0;
				}
			}
		}
		if (this.anInt1281 > 0 && this.anInt1284 > 0) {
			local189 = (int) ((double) this.anInt1281 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static32.anIntArray158[local194] += Static32.anIntArray158[local194 - local189] * this.anInt1284 / 100;
			}
		}
		if (this.aClass58_1.anIntArray361[0] > 0 || this.aClass58_1.anIntArray361[1] > 0) {
			this.aClass55_2.method1493();
			local189 = this.aClass55_2.method1495(arg0 + 1);
			local194 = this.aClass58_1.method1581(0, (float) local189 / 65536.0F);
			local202 = this.aClass58_1.method1581(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static32.anIntArray158[local207 + local194] * (long) Static94.anInt2533 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static32.anIntArray158[local207 + local194 - local526 - 1] * (long) Static94.anIntArrayArray63[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static32.anIntArray158[local207 - local556 - 1] * (long) Static94.anIntArrayArray63[1][local556] >> 16);
					}
					Static32.anIntArray158[local207] = local359;
					local189 = this.aClass55_2.method1495(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static32.anIntArray158[local207 + local194] * (long) Static94.anInt2533 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static32.anIntArray158[local207 + local194 - local526 - 1] * (long) Static94.anIntArrayArray63[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static32.anIntArray158[local207 - local556 - 1] * (long) Static94.anIntArrayArray63[1][local556] >> 16);
						}
						Static32.anIntArray158[local207] = local359;
						local189 = this.aClass55_2.method1495(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static32.anIntArray158[local207 + local194 - local526 - 1] * (long) Static94.anIntArrayArray63[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static32.anIntArray158[local207 - local556 - 1] * (long) Static94.anIntArrayArray63[1][local556] >> 16);
							}
							Static32.anIntArray158[local207] = local359;
							this.aClass55_2.method1495(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass58_1.method1581(0, (float) local189 / 65536.0F);
					local202 = this.aClass58_1.method1581(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static32.anIntArray158[local189] < -32768) {
				Static32.anIntArray158[local189] = -32768;
			}
			if (Static32.anIntArray158[local189] > 32767) {
				Static32.anIntArray158[local189] = 32767;
			}
		}
		return Static32.anIntArray158;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!pd;)V")
	public void method857(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aClass55_1 = new Class55();
		this.aClass55_1.method1492(arg0);
		this.aClass55_7 = new Class55();
		this.aClass55_7.method1492(arg0);
		@Pc(21) int local21 = arg0.method665();
		if (local21 != 0) {
			arg0.anInt952--;
			this.aClass55_5 = new Class55();
			this.aClass55_5.method1492(arg0);
			this.aClass55_4 = new Class55();
			this.aClass55_4.method1492(arg0);
		}
		local21 = arg0.method665();
		if (local21 != 0) {
			arg0.anInt952--;
			this.aClass55_3 = new Class55();
			this.aClass55_3.method1492(arg0);
			this.aClass55_8 = new Class55();
			this.aClass55_8.method1492(arg0);
		}
		local21 = arg0.method665();
		if (local21 != 0) {
			arg0.anInt952--;
			this.aClass55_6 = new Class55();
			this.aClass55_6.method1492(arg0);
			this.aClass55_9 = new Class55();
			this.aClass55_9.method1492(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method646();
			if (local114 == 0) {
				break;
			}
			this.anIntArray159[local109] = local114;
			this.anIntArray161[local109] = arg0.method664();
			this.anIntArray163[local109] = arg0.method646();
		}
		this.anInt1281 = arg0.method646();
		this.anInt1284 = arg0.method646();
		this.anInt1283 = arg0.method627();
		this.anInt1282 = arg0.method627();
		this.aClass58_1 = new Class58();
		this.aClass55_2 = new Class55();
		this.aClass58_1.method1585(arg0, this.aClass55_2);
	}
}
