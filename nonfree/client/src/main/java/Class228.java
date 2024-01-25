import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class228 {

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "[I")
	private static final int[] anIntArray428 = new int[32768];

	@OriginalMember(owner = "client!lha", name = "n", descriptor = "[I")
	private static final int[] anIntArray429;

	@OriginalMember(owner = "client!lha", name = "t", descriptor = "Lclient!ar;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!lha", name = "w", descriptor = "Lclient!ar;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "Lclient!ar;")
	private Class23 aClass23_3;

	@OriginalMember(owner = "client!lha", name = "q", descriptor = "Lclient!ar;")
	private Class23 aClass23_4;

	@OriginalMember(owner = "client!lha", name = "l", descriptor = "Lclient!ar;")
	private Class23 aClass23_5;

	@OriginalMember(owner = "client!lha", name = "i", descriptor = "Lclient!ar;")
	private Class23 aClass23_6;

	@OriginalMember(owner = "client!lha", name = "s", descriptor = "Lclient!ar;")
	private Class23 aClass23_7;

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "Lclient!hka;")
	private Class162 aClass162_1;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "Lclient!ar;")
	private Class23 aClass23_8;

	@OriginalMember(owner = "client!lha", name = "p", descriptor = "Lclient!ar;")
	private Class23 aClass23_9;

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "[I")
	private final int[] anIntArray424 = new int[5];

	@OriginalMember(owner = "client!lha", name = "m", descriptor = "I")
	private int anInt5844 = 100;

	@OriginalMember(owner = "client!lha", name = "k", descriptor = "[I")
	private final int[] anIntArray425 = new int[5];

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "[I")
	private final int[] anIntArray427 = new int[5];

	@OriginalMember(owner = "client!lha", name = "u", descriptor = "I")
	public int anInt5845 = 500;

	@OriginalMember(owner = "client!lha", name = "v", descriptor = "I")
	public int anInt5846 = 0;

	@OriginalMember(owner = "client!lha", name = "r", descriptor = "I")
	private int anInt5847 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray428[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray429 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray429[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(II)[I")
	public int[] method5106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static732.method6318(Static375.anIntArray426, 0, arg0);
		if (arg1 < 10) {
			return Static375.anIntArray426;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass23_4.method974();
		this.aClass23_9.method974();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass23_6 != null) {
			this.aClass23_6.method974();
			this.aClass23_1.method974();
			local24 = (int) ((double) (this.aClass23_6.anInt1043 - this.aClass23_6.anInt1041) * 32.768D / local16);
			local26 = (int) ((double) this.aClass23_6.anInt1041 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass23_3 != null) {
			this.aClass23_3.method974();
			this.aClass23_2.method974();
			local63 = (int) ((double) (this.aClass23_3.anInt1043 - this.aClass23_3.anInt1041) * 32.768D / local16);
			local65 = (int) ((double) this.aClass23_3.anInt1041 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray427[local102] != 0) {
				Static375.anIntArray432[local102] = 0;
				Static375.anIntArray434[local102] = (int) ((double) this.anIntArray425[local102] * local16);
				Static375.anIntArray433[local102] = (this.anIntArray427[local102] << 14) / 100;
				Static375.anIntArray430[local102] = (int) ((double) (this.aClass23_4.anInt1043 - this.aClass23_4.anInt1041) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray424[local102]) / local16);
				Static375.anIntArray431[local102] = (int) ((double) this.aClass23_4.anInt1041 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass23_4.method971(arg0);
			local187 = this.aClass23_9.method971(arg0);
			if (this.aClass23_6 != null) {
				local195 = this.aClass23_6.method971(arg0);
				local200 = this.aClass23_1.method971(arg0);
				local182 += this.method5109(local28, local200, this.aClass23_6.anInt1044) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass23_3 != null) {
				local195 = this.aClass23_3.method971(arg0);
				local200 = this.aClass23_2.method971(arg0);
				local187 = local187 * ((this.method5109(local67, local200, this.aClass23_3.anInt1044) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray427[local195] != 0) {
					local200 = local176 + Static375.anIntArray434[local195];
					if (local200 < arg0) {
						Static375.anIntArray426[local200] += this.method5109(Static375.anIntArray432[local195], local187 * Static375.anIntArray433[local195] >> 15, this.aClass23_4.anInt1044);
						Static375.anIntArray432[local195] += (local182 * Static375.anIntArray430[local195] >> 16) + Static375.anIntArray431[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass23_7 != null) {
			this.aClass23_7.method974();
			this.aClass23_5.method974();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass23_7.method971(arg0);
				local352 = this.aClass23_5.method971(arg0);
				if (local339) {
					local187 = this.aClass23_7.anInt1041 + ((this.aClass23_7.anInt1043 - this.aClass23_7.anInt1041) * local347 >> 8);
				} else {
					local187 = this.aClass23_7.anInt1041 + ((this.aClass23_7.anInt1043 - this.aClass23_7.anInt1041) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static375.anIntArray426[local200] = 0;
				}
			}
		}
		if (this.anInt5847 > 0 && this.anInt5844 > 0) {
			local182 = (int) ((double) this.anInt5847 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static375.anIntArray426[local187] += Static375.anIntArray426[local187 - local182] * this.anInt5844 / 100;
			}
		}
		if (this.aClass162_1.anIntArray288[0] > 0 || this.aClass162_1.anIntArray288[1] > 0) {
			this.aClass23_8.method974();
			local182 = this.aClass23_8.method971(arg0 + 1);
			local187 = this.aClass162_1.method3517(0, (float) local182 / 65536.0F);
			local195 = this.aClass162_1.method3517(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static375.anIntArray426[local200 + local187] * (long) Static249.anInt3895 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static375.anIntArray426[local200 + local187 - local519 - 1] * (long) Static249.anIntArrayArray14[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static375.anIntArray426[local200 - local549 - 1] * (long) Static249.anIntArrayArray14[1][local549] >> 16);
					}
					Static375.anIntArray426[local200] = local352;
					local182 = this.aClass23_8.method971(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static375.anIntArray426[local200 + local187] * (long) Static249.anInt3895 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static375.anIntArray426[local200 + local187 - local519 - 1] * (long) Static249.anIntArrayArray14[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static375.anIntArray426[local200 - local549 - 1] * (long) Static249.anIntArrayArray14[1][local549] >> 16);
						}
						Static375.anIntArray426[local200] = local352;
						local182 = this.aClass23_8.method971(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static375.anIntArray426[local200 + local187 - local519 - 1] * (long) Static249.anIntArrayArray14[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static375.anIntArray426[local200 - local549 - 1] * (long) Static249.anIntArrayArray14[1][local549] >> 16);
							}
							Static375.anIntArray426[local200] = local352;
							this.aClass23_8.method971(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass162_1.method3517(0, (float) local182 / 65536.0F);
					local195 = this.aClass162_1.method3517(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static375.anIntArray426[local182] < -32768) {
				Static375.anIntArray426[local182] = -32768;
			}
			if (Static375.anIntArray426[local182] > 32767) {
				Static375.anIntArray426[local182] = 32767;
			}
		}
		return Static375.anIntArray426;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!ika;)V")
	public void method5108(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aClass23_4 = new Class23();
		this.aClass23_4.method972(arg0);
		this.aClass23_9 = new Class23();
		this.aClass23_9.method972(arg0);
		@Pc(21) int local21 = arg0.method2048(255);
		if (local21 != 0) {
			arg0.anInt2178--;
			this.aClass23_6 = new Class23();
			this.aClass23_6.method972(arg0);
			this.aClass23_1 = new Class23();
			this.aClass23_1.method972(arg0);
		}
		local21 = arg0.method2048(255);
		if (local21 != 0) {
			arg0.anInt2178--;
			this.aClass23_3 = new Class23();
			this.aClass23_3.method972(arg0);
			this.aClass23_2 = new Class23();
			this.aClass23_2.method972(arg0);
		}
		local21 = arg0.method2048(255);
		if (local21 != 0) {
			arg0.anInt2178--;
			this.aClass23_7 = new Class23();
			this.aClass23_7.method972(arg0);
			this.aClass23_5 = new Class23();
			this.aClass23_5.method972(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2054();
			if (local114 == 0) {
				break;
			}
			this.anIntArray427[local109] = local114;
			this.anIntArray424[local109] = arg0.method2009(128);
			this.anIntArray425[local109] = arg0.method2054();
		}
		this.anInt5847 = arg0.method2054();
		this.anInt5844 = arg0.method2054();
		this.anInt5845 = arg0.method2028(-14795);
		this.anInt5846 = arg0.method2028(-14795);
		this.aClass162_1 = new Class162();
		this.aClass23_8 = new Class23();
		this.aClass162_1.method3512(arg0, this.aClass23_8);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(III)I")
	private int method5109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray429[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray428[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
