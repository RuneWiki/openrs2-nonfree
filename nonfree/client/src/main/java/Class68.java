import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class68 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[I")
	public static int[] anIntArray304 = new int[32768];

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!hd;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!db;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!hd;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!hd;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!hd;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!hd;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!hd;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!hd;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!hd;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!hd;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[I")
	private final int[] anIntArray303 = new int[5];

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	private final int[] anIntArray305 = new int[5];

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
	private final int[] anIntArray306 = new int[5];

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	private int anInt3244 = 0;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public int anInt3245 = 500;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	public int anInt3246 = 0;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	private int anInt3247 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray304[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray302 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray302[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!b;)V")
	public void method2075(@OriginalArg(0) Class6_Sub1 arg0) {
		this.aClass27_5 = new Class27();
		this.aClass27_5.method866(arg0);
		this.aClass27_2 = new Class27();
		this.aClass27_2.method866(arg0);
		@Pc(21) int local21 = arg0.method1495();
		if (local21 != 0) {
			arg0.anInt2209--;
			this.aClass27_4 = new Class27();
			this.aClass27_4.method866(arg0);
			this.aClass27_1 = new Class27();
			this.aClass27_1.method866(arg0);
		}
		local21 = arg0.method1495();
		if (local21 != 0) {
			arg0.anInt2209--;
			this.aClass27_6 = new Class27();
			this.aClass27_6.method866(arg0);
			this.aClass27_8 = new Class27();
			this.aClass27_8.method866(arg0);
		}
		local21 = arg0.method1495();
		if (local21 != 0) {
			arg0.anInt2209--;
			this.aClass27_3 = new Class27();
			this.aClass27_3.method866(arg0);
			this.aClass27_9 = new Class27();
			this.aClass27_9.method866(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1465();
			if (local114 == 0) {
				break;
			}
			this.anIntArray306[local109] = local114;
			this.anIntArray305[local109] = arg0.method1492();
			this.anIntArray303[local109] = arg0.method1465();
		}
		this.anInt3244 = arg0.method1465();
		this.anInt3247 = arg0.method1465();
		this.anInt3245 = arg0.method1500();
		this.anInt3246 = arg0.method1500();
		this.aClass12_1 = new Class12();
		this.aClass27_7 = new Class27();
		this.aClass12_1.method569(arg0, this.aClass27_7);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
	private int method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray302[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray304[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
	public int[] method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			Static113.anIntArray307[local1] = 0;
		}
		if (arg1 < 10) {
			return Static113.anIntArray307;
		}
		@Pc(23) double local23 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass27_5.method867();
		this.aClass27_2.method867();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (this.aClass27_4 != null) {
			this.aClass27_4.method867();
			this.aClass27_1.method867();
			local31 = (int) ((double) (this.aClass27_4.anInt1342 - this.aClass27_4.anInt1341) * 32.768D / local23);
			local33 = (int) ((double) this.aClass27_4.anInt1341 * 32.768D / local23);
		}
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.aClass27_6 != null) {
			this.aClass27_6.method867();
			this.aClass27_8.method867();
			local70 = (int) ((double) (this.aClass27_6.anInt1342 - this.aClass27_6.anInt1341) * 32.768D / local23);
			local72 = (int) ((double) this.aClass27_6.anInt1341 * 32.768D / local23);
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (this.anIntArray306[local109] != 0) {
				Static113.anIntArray311[local109] = 0;
				Static113.anIntArray308[local109] = (int) ((double) this.anIntArray303[local109] * local23);
				Static113.anIntArray309[local109] = (this.anIntArray306[local109] << 14) / 100;
				Static113.anIntArray310[local109] = (int) ((double) (this.aClass27_5.anInt1342 - this.aClass27_5.anInt1341) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray305[local109]) / local23);
				Static113.anIntArray312[local109] = (int) ((double) this.aClass27_5.anInt1341 * 32.768D / local23);
			}
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(202) int local202;
		@Pc(207) int local207;
		for (@Pc(183) int local183 = 0; local183 < arg0; local183++) {
			local189 = this.aClass27_5.method868(arg0);
			local194 = this.aClass27_2.method868(arg0);
			if (this.aClass27_4 != null) {
				local202 = this.aClass27_4.method868(arg0);
				local207 = this.aClass27_1.method868(arg0);
				local189 += this.method2076(local35, local207, this.aClass27_4.anInt1344) >> 1;
				local35 += (local202 * local31 >> 16) + local33;
			}
			if (this.aClass27_6 != null) {
				local202 = this.aClass27_6.method868(arg0);
				local207 = this.aClass27_8.method868(arg0);
				local194 = local194 * ((this.method2076(local74, local207, this.aClass27_6.anInt1344) >> 1) + 32768) >> 15;
				local74 += (local202 * local70 >> 16) + local72;
			}
			for (local202 = 0; local202 < 5; local202++) {
				if (this.anIntArray306[local202] != 0) {
					local207 = local183 + Static113.anIntArray308[local202];
					if (local207 < arg0) {
						Static113.anIntArray307[local207] += this.method2076(Static113.anIntArray311[local202], local194 * Static113.anIntArray309[local202] >> 15, this.aClass27_5.anInt1344);
						Static113.anIntArray311[local202] += (local189 * Static113.anIntArray310[local202] >> 16) + Static113.anIntArray312[local202];
					}
				}
			}
		}
		@Pc(354) int local354;
		@Pc(359) int local359;
		if (this.aClass27_3 != null) {
			this.aClass27_3.method867();
			this.aClass27_9.method867();
			local189 = 0;
			@Pc(346) boolean local346 = true;
			for (local207 = 0; local207 < arg0; local207++) {
				local354 = this.aClass27_3.method868(arg0);
				local359 = this.aClass27_9.method868(arg0);
				if (local346) {
					local194 = this.aClass27_3.anInt1341 + ((this.aClass27_3.anInt1342 - this.aClass27_3.anInt1341) * local354 >> 8);
				} else {
					local194 = this.aClass27_3.anInt1341 + ((this.aClass27_3.anInt1342 - this.aClass27_3.anInt1341) * local359 >> 8);
				}
				local189 += 256;
				if (local189 >= local194) {
					local189 = 0;
					local346 = !local346;
				}
				if (local346) {
					Static113.anIntArray307[local207] = 0;
				}
			}
		}
		if (this.anInt3244 > 0 && this.anInt3247 > 0) {
			local189 = (int) ((double) this.anInt3244 * local23);
			for (local194 = local189; local194 < arg0; local194++) {
				Static113.anIntArray307[local194] += Static113.anIntArray307[local194 - local189] * this.anInt3247 / 100;
			}
		}
		if (this.aClass12_1.anIntArray54[0] > 0 || this.aClass12_1.anIntArray54[1] > 0) {
			this.aClass27_7.method867();
			local189 = this.aClass27_7.method868(arg0 + 1);
			local194 = this.aClass12_1.method566(0, (float) local189 / 65536.0F);
			local202 = this.aClass12_1.method566(1, (float) local189 / 65536.0F);
			if (arg0 >= local194 + local202) {
				local207 = 0;
				local354 = local202;
				if (local202 > arg0 - local194) {
					local354 = arg0 - local194;
				}
				@Pc(526) int local526;
				@Pc(556) int local556;
				while (local207 < local354) {
					local359 = (int) ((long) Static113.anIntArray307[local207 + local194] * (long) Static16.anInt913 >> 16);
					for (local526 = 0; local526 < local194; local526++) {
						local359 += (int) ((long) Static113.anIntArray307[local207 + local194 - local526 - 1] * (long) Static16.anIntArrayArray2[0][local526] >> 16);
					}
					for (local556 = 0; local556 < local207; local556++) {
						local359 -= (int) ((long) Static113.anIntArray307[local207 - local556 - 1] * (long) Static16.anIntArrayArray2[1][local556] >> 16);
					}
					Static113.anIntArray307[local207] = local359;
					local189 = this.aClass27_7.method868(arg0 + 1);
					local207++;
				}
				local354 = 128;
				while (true) {
					if (local354 > arg0 - local194) {
						local354 = arg0 - local194;
					}
					while (local207 < local354) {
						local359 = (int) ((long) Static113.anIntArray307[local207 + local194] * (long) Static16.anInt913 >> 16);
						for (local526 = 0; local526 < local194; local526++) {
							local359 += (int) ((long) Static113.anIntArray307[local207 + local194 - local526 - 1] * (long) Static16.anIntArrayArray2[0][local526] >> 16);
						}
						for (local556 = 0; local556 < local202; local556++) {
							local359 -= (int) ((long) Static113.anIntArray307[local207 - local556 - 1] * (long) Static16.anIntArrayArray2[1][local556] >> 16);
						}
						Static113.anIntArray307[local207] = local359;
						local189 = this.aClass27_7.method868(arg0 + 1);
						local207++;
					}
					if (local207 >= arg0 - local194) {
						while (local207 < arg0) {
							local359 = 0;
							for (local526 = local207 + local194 - arg0; local526 < local194; local526++) {
								local359 += (int) ((long) Static113.anIntArray307[local207 + local194 - local526 - 1] * (long) Static16.anIntArrayArray2[0][local526] >> 16);
							}
							for (local556 = 0; local556 < local202; local556++) {
								local359 -= (int) ((long) Static113.anIntArray307[local207 - local556 - 1] * (long) Static16.anIntArrayArray2[1][local556] >> 16);
							}
							Static113.anIntArray307[local207] = local359;
							this.aClass27_7.method868(arg0 + 1);
							local207++;
						}
						break;
					}
					local194 = this.aClass12_1.method566(0, (float) local189 / 65536.0F);
					local202 = this.aClass12_1.method566(1, (float) local189 / 65536.0F);
					local354 += 128;
				}
			}
		}
		for (local189 = 0; local189 < arg0; local189++) {
			if (Static113.anIntArray307[local189] < -32768) {
				Static113.anIntArray307[local189] = -32768;
			}
			if (Static113.anIntArray307[local189] > 32767) {
				Static113.anIntArray307[local189] = 32767;
			}
		}
		return Static113.anIntArray307;
	}
}
