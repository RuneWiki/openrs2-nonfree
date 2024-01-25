import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class239 {

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
	private static final int[] anIntArray409 = new int[32768];

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[I")
	private static final int[] anIntArray410;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!go;")
	private Class90 aClass90_1;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!go;")
	private Class90 aClass90_2;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!go;")
	private Class90 aClass90_3;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!go;")
	private Class90 aClass90_4;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!go;")
	private Class90 aClass90_5;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "Lclient!wb;")
	private Class263 aClass263_1;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "Lclient!go;")
	private Class90 aClass90_6;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "Lclient!go;")
	private Class90 aClass90_7;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "Lclient!go;")
	private Class90 aClass90_8;

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "Lclient!go;")
	private Class90 aClass90_9;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
	private final int[] anIntArray406 = new int[5];

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public int anInt6601 = 500;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	private int anInt6603 = 0;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public int anInt6602 = 0;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[I")
	private final int[] anIntArray413 = new int[5];

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	private int anInt6604 = 100;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "[I")
	private final int[] anIntArray407 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray409[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray410 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray410[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	public int[] method5464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static466.method207(Static397.anIntArray408, 0, arg0);
		if (arg1 < 10) {
			return Static397.anIntArray408;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass90_5.method2089();
		this.aClass90_8.method2089();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass90_3 != null) {
			this.aClass90_3.method2089();
			this.aClass90_2.method2089();
			local24 = (int) ((double) (this.aClass90_3.anInt2410 - this.aClass90_3.anInt2409) * 32.768D / local16);
			local26 = (int) ((double) this.aClass90_3.anInt2409 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass90_7 != null) {
			this.aClass90_7.method2089();
			this.aClass90_9.method2089();
			local63 = (int) ((double) (this.aClass90_7.anInt2410 - this.aClass90_7.anInt2409) * 32.768D / local16);
			local65 = (int) ((double) this.aClass90_7.anInt2409 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray407[local102] != 0) {
				Static397.anIntArray415[local102] = 0;
				Static397.anIntArray412[local102] = (int) ((double) this.anIntArray413[local102] * local16);
				Static397.anIntArray414[local102] = (this.anIntArray407[local102] << 14) / 100;
				Static397.anIntArray411[local102] = (int) ((double) (this.aClass90_5.anInt2410 - this.aClass90_5.anInt2409) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray406[local102]) / local16);
				Static397.anIntArray416[local102] = (int) ((double) this.aClass90_5.anInt2409 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass90_5.method2090(arg0);
			local187 = this.aClass90_8.method2090(arg0);
			if (this.aClass90_3 != null) {
				local195 = this.aClass90_3.method2090(arg0);
				local200 = this.aClass90_2.method2090(arg0);
				local182 += this.method5466(local28, local200, this.aClass90_3.anInt2408) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass90_7 != null) {
				local195 = this.aClass90_7.method2090(arg0);
				local200 = this.aClass90_9.method2090(arg0);
				local187 = local187 * ((this.method5466(local67, local200, this.aClass90_7.anInt2408) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray407[local195] != 0) {
					local200 = local176 + Static397.anIntArray412[local195];
					if (local200 < arg0) {
						Static397.anIntArray408[local200] += this.method5466(Static397.anIntArray415[local195], local187 * Static397.anIntArray414[local195] >> 15, this.aClass90_5.anInt2408);
						Static397.anIntArray415[local195] += (local182 * Static397.anIntArray411[local195] >> 16) + Static397.anIntArray416[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass90_4 != null) {
			this.aClass90_4.method2089();
			this.aClass90_6.method2089();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass90_4.method2090(arg0);
				local352 = this.aClass90_6.method2090(arg0);
				if (local339) {
					local187 = this.aClass90_4.anInt2409 + ((this.aClass90_4.anInt2410 - this.aClass90_4.anInt2409) * local347 >> 8);
				} else {
					local187 = this.aClass90_4.anInt2409 + ((this.aClass90_4.anInt2410 - this.aClass90_4.anInt2409) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static397.anIntArray408[local200] = 0;
				}
			}
		}
		if (this.anInt6603 > 0 && this.anInt6604 > 0) {
			local182 = (int) ((double) this.anInt6603 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static397.anIntArray408[local187] += Static397.anIntArray408[local187 - local182] * this.anInt6604 / 100;
			}
		}
		if (this.aClass263_1.anIntArray498[0] > 0 || this.aClass263_1.anIntArray498[1] > 0) {
			this.aClass90_1.method2089();
			local182 = this.aClass90_1.method2090(arg0 + 1);
			local187 = this.aClass263_1.method6084(0, (float) local182 / 65536.0F);
			local195 = this.aClass263_1.method6084(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static397.anIntArray408[local200 + local187] * (long) Static446.anInt7455 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static397.anIntArray408[local200 + local187 - local519 - 1] * (long) Static446.anIntArrayArray63[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static397.anIntArray408[local200 - local549 - 1] * (long) Static446.anIntArrayArray63[1][local549] >> 16);
					}
					Static397.anIntArray408[local200] = local352;
					local182 = this.aClass90_1.method2090(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static397.anIntArray408[local200 + local187] * (long) Static446.anInt7455 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static397.anIntArray408[local200 + local187 - local519 - 1] * (long) Static446.anIntArrayArray63[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static397.anIntArray408[local200 - local549 - 1] * (long) Static446.anIntArrayArray63[1][local549] >> 16);
						}
						Static397.anIntArray408[local200] = local352;
						local182 = this.aClass90_1.method2090(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static397.anIntArray408[local200 + local187 - local519 - 1] * (long) Static446.anIntArrayArray63[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static397.anIntArray408[local200 - local549 - 1] * (long) Static446.anIntArrayArray63[1][local549] >> 16);
							}
							Static397.anIntArray408[local200] = local352;
							this.aClass90_1.method2090(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass263_1.method6084(0, (float) local182 / 65536.0F);
					local195 = this.aClass263_1.method6084(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static397.anIntArray408[local182] < -32768) {
				Static397.anIntArray408[local182] = -32768;
			}
			if (Static397.anIntArray408[local182] > 32767) {
				Static397.anIntArray408[local182] = 32767;
			}
		}
		return Static397.anIntArray408;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!nj;)V")
	public void method5465(@OriginalArg(0) Class3_Sub25 arg0) {
		this.aClass90_5 = new Class90();
		this.aClass90_5.method2087(arg0);
		this.aClass90_8 = new Class90();
		this.aClass90_8.method2087(arg0);
		@Pc(21) int local21 = arg0.method4096();
		if (local21 != 0) {
			arg0.anInt4974--;
			this.aClass90_3 = new Class90();
			this.aClass90_3.method2087(arg0);
			this.aClass90_2 = new Class90();
			this.aClass90_2.method2087(arg0);
		}
		local21 = arg0.method4096();
		if (local21 != 0) {
			arg0.anInt4974--;
			this.aClass90_7 = new Class90();
			this.aClass90_7.method2087(arg0);
			this.aClass90_9 = new Class90();
			this.aClass90_9.method2087(arg0);
		}
		local21 = arg0.method4096();
		if (local21 != 0) {
			arg0.anInt4974--;
			this.aClass90_4 = new Class90();
			this.aClass90_4.method2087(arg0);
			this.aClass90_6 = new Class90();
			this.aClass90_6.method2087(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4086();
			if (local114 == 0) {
				break;
			}
			this.anIntArray407[local109] = local114;
			this.anIntArray406[local109] = arg0.method4092();
			this.anIntArray413[local109] = arg0.method4086();
		}
		this.anInt6603 = arg0.method4086();
		this.anInt6604 = arg0.method4086();
		this.anInt6601 = arg0.method4083();
		this.anInt6602 = arg0.method4083();
		this.aClass263_1 = new Class263();
		this.aClass90_1 = new Class90();
		this.aClass263_1.method6080(arg0, this.aClass90_1);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)I")
	private int method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray410[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray409[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
