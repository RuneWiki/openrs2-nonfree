import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class87 {

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "[I")
	public static int[] anIntArray574 = new int[32768];

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "[I")
	public static int[] anIntArray573;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!cd;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Lclient!cd;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "Lclient!cd;")
	private Class12 aClass12_3;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "Lclient!he;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!cd;")
	private Class12 aClass12_4;

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "Lclient!cd;")
	private Class12 aClass12_5;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!cd;")
	private Class12 aClass12_6;

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "Lclient!cd;")
	private Class12 aClass12_7;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "Lclient!cd;")
	private Class12 aClass12_8;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "Lclient!cd;")
	private Class12 aClass12_9;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "[I")
	private final int[] anIntArray571 = new int[5];

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public int anInt4180 = 500;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
	private final int[] anIntArray570 = new int[5];

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	private int anInt4181 = 100;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
	private int anInt4182 = 0;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	public int anInt4183 = 0;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
	private final int[] anIntArray572 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray574[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray573 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray573[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!jg;)V")
	public void method2985(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass12_8 = new Class12();
		this.aClass12_8.method390(arg0);
		this.aClass12_9 = new Class12();
		this.aClass12_9.method390(arg0);
		@Pc(21) int local21 = arg0.method861();
		if (local21 != 0) {
			arg0.anInt1357--;
			this.aClass12_5 = new Class12();
			this.aClass12_5.method390(arg0);
			this.aClass12_4 = new Class12();
			this.aClass12_4.method390(arg0);
		}
		local21 = arg0.method861();
		if (local21 != 0) {
			arg0.anInt1357--;
			this.aClass12_6 = new Class12();
			this.aClass12_6.method390(arg0);
			this.aClass12_7 = new Class12();
			this.aClass12_7.method390(arg0);
		}
		local21 = arg0.method861();
		if (local21 != 0) {
			arg0.anInt1357--;
			this.aClass12_3 = new Class12();
			this.aClass12_3.method390(arg0);
			this.aClass12_2 = new Class12();
			this.aClass12_2.method390(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method856();
			if (local114 == 0) {
				break;
			}
			this.anIntArray570[local109] = local114;
			this.anIntArray571[local109] = arg0.method889();
			this.anIntArray572[local109] = arg0.method856();
		}
		this.anInt4182 = arg0.method856();
		this.anInt4181 = arg0.method856();
		this.anInt4180 = arg0.method878();
		this.anInt4183 = arg0.method878();
		this.aClass38_1 = new Class38();
		this.aClass12_1 = new Class12();
		this.aClass38_1.method1113(arg0, this.aClass12_1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
	private int method2986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray573[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray574[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I")
	public int[] method2988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static184.method626(Static173.anIntArray569, 0, arg0);
		if (arg1 < 10) {
			return Static173.anIntArray569;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass12_8.method392();
		this.aClass12_9.method392();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass12_5 != null) {
			this.aClass12_5.method392();
			this.aClass12_4.method392();
			local24 = (int) ((double) (this.aClass12_5.anInt687 - this.aClass12_5.anInt689) * 32.768D / local16);
			local26 = (int) ((double) this.aClass12_5.anInt689 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass12_6 != null) {
			this.aClass12_6.method392();
			this.aClass12_7.method392();
			local63 = (int) ((double) (this.aClass12_6.anInt687 - this.aClass12_6.anInt689) * 32.768D / local16);
			local65 = (int) ((double) this.aClass12_6.anInt689 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray570[local102] != 0) {
				Static173.anIntArray576[local102] = 0;
				Static173.anIntArray575[local102] = (int) ((double) this.anIntArray572[local102] * local16);
				Static173.anIntArray578[local102] = (this.anIntArray570[local102] << 14) / 100;
				Static173.anIntArray579[local102] = (int) ((double) (this.aClass12_8.anInt687 - this.aClass12_8.anInt689) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray571[local102]) / local16);
				Static173.anIntArray577[local102] = (int) ((double) this.aClass12_8.anInt689 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass12_8.method391(arg0);
			local187 = this.aClass12_9.method391(arg0);
			if (this.aClass12_5 != null) {
				local195 = this.aClass12_5.method391(arg0);
				local200 = this.aClass12_4.method391(arg0);
				local182 += this.method2986(local28, local200, this.aClass12_5.anInt690) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass12_6 != null) {
				local195 = this.aClass12_6.method391(arg0);
				local200 = this.aClass12_7.method391(arg0);
				local187 = local187 * ((this.method2986(local67, local200, this.aClass12_6.anInt690) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray570[local195] != 0) {
					local200 = local176 + Static173.anIntArray575[local195];
					if (local200 < arg0) {
						Static173.anIntArray569[local200] += this.method2986(Static173.anIntArray576[local195], local187 * Static173.anIntArray578[local195] >> 15, this.aClass12_8.anInt690);
						Static173.anIntArray576[local195] += (local182 * Static173.anIntArray579[local195] >> 16) + Static173.anIntArray577[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass12_3 != null) {
			this.aClass12_3.method392();
			this.aClass12_2.method392();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass12_3.method391(arg0);
				local352 = this.aClass12_2.method391(arg0);
				if (local339) {
					local187 = this.aClass12_3.anInt689 + ((this.aClass12_3.anInt687 - this.aClass12_3.anInt689) * local347 >> 8);
				} else {
					local187 = this.aClass12_3.anInt689 + ((this.aClass12_3.anInt687 - this.aClass12_3.anInt689) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static173.anIntArray569[local200] = 0;
				}
			}
		}
		if (this.anInt4182 > 0 && this.anInt4181 > 0) {
			local182 = (int) ((double) this.anInt4182 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static173.anIntArray569[local187] += Static173.anIntArray569[local187 - local182] * this.anInt4181 / 100;
			}
		}
		if (this.aClass38_1.anIntArray227[0] > 0 || this.aClass38_1.anIntArray227[1] > 0) {
			this.aClass12_1.method392();
			local182 = this.aClass12_1.method391(arg0 + 1);
			local187 = this.aClass38_1.method1118(0, (float) local182 / 65536.0F);
			local195 = this.aClass38_1.method1118(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static173.anIntArray569[local200 + local187] * (long) Static63.anInt1655 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static173.anIntArray569[local200 + local187 - local519 - 1] * (long) Static63.anIntArrayArray19[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static173.anIntArray569[local200 - local549 - 1] * (long) Static63.anIntArrayArray19[1][local549] >> 16);
					}
					Static173.anIntArray569[local200] = local352;
					local182 = this.aClass12_1.method391(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static173.anIntArray569[local200 + local187] * (long) Static63.anInt1655 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static173.anIntArray569[local200 + local187 - local519 - 1] * (long) Static63.anIntArrayArray19[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static173.anIntArray569[local200 - local549 - 1] * (long) Static63.anIntArrayArray19[1][local549] >> 16);
						}
						Static173.anIntArray569[local200] = local352;
						local182 = this.aClass12_1.method391(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static173.anIntArray569[local200 + local187 - local519 - 1] * (long) Static63.anIntArrayArray19[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static173.anIntArray569[local200 - local549 - 1] * (long) Static63.anIntArrayArray19[1][local549] >> 16);
							}
							Static173.anIntArray569[local200] = local352;
							this.aClass12_1.method391(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass38_1.method1118(0, (float) local182 / 65536.0F);
					local195 = this.aClass38_1.method1118(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static173.anIntArray569[local182] < -32768) {
				Static173.anIntArray569[local182] = -32768;
			}
			if (Static173.anIntArray569[local182] > 32767) {
				Static173.anIntArray569[local182] = 32767;
			}
		}
		return Static173.anIntArray569;
	}
}
