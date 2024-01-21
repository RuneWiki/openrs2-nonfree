import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class71 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
	private static final int[] anIntArray297 = new int[32768];

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
	private static final int[] anIntArray300;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Lclient!te;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!df;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Lclient!df;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!df;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!df;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!df;")
	private Class21 aClass21_5;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!df;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!df;")
	private Class21 aClass21_7;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Lclient!df;")
	private Class21 aClass21_8;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Lclient!df;")
	private Class21 aClass21_9;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "[I")
	private final int[] anIntArray299 = new int[5];

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
	private final int[] anIntArray298 = new int[5];

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
	private final int[] anIntArray295 = new int[5];

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	private int anInt3174 = 0;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	private int anInt3173 = 100;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	public int anInt3175 = 500;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public int anInt3176 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray297[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray300 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray300[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	public int[] method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static189.method186(Static133.anIntArray296, 0, arg0);
		if (arg1 < 10) {
			return Static133.anIntArray296;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass21_8.method570();
		this.aClass21_9.method570();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass21_4 != null) {
			this.aClass21_4.method570();
			this.aClass21_7.method570();
			local24 = (int) ((double) (this.aClass21_4.anInt882 - this.aClass21_4.anInt884) * 32.768D / local16);
			local26 = (int) ((double) this.aClass21_4.anInt884 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass21_6 != null) {
			this.aClass21_6.method570();
			this.aClass21_2.method570();
			local63 = (int) ((double) (this.aClass21_6.anInt882 - this.aClass21_6.anInt884) * 32.768D / local16);
			local65 = (int) ((double) this.aClass21_6.anInt884 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray299[local102] != 0) {
				Static133.anIntArray303[local102] = 0;
				Static133.anIntArray305[local102] = (int) ((double) this.anIntArray295[local102] * local16);
				Static133.anIntArray301[local102] = (this.anIntArray299[local102] << 14) / 100;
				Static133.anIntArray304[local102] = (int) ((double) (this.aClass21_8.anInt882 - this.aClass21_8.anInt884) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray298[local102]) / local16);
				Static133.anIntArray302[local102] = (int) ((double) this.aClass21_8.anInt884 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass21_8.method571(arg0);
			local187 = this.aClass21_9.method571(arg0);
			if (this.aClass21_4 != null) {
				local195 = this.aClass21_4.method571(arg0);
				local200 = this.aClass21_7.method571(arg0);
				local182 += this.method2340(local28, local200, this.aClass21_4.anInt885) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass21_6 != null) {
				local195 = this.aClass21_6.method571(arg0);
				local200 = this.aClass21_2.method571(arg0);
				local187 = local187 * ((this.method2340(local67, local200, this.aClass21_6.anInt885) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray299[local195] != 0) {
					local200 = local176 + Static133.anIntArray305[local195];
					if (local200 < arg0) {
						Static133.anIntArray296[local200] += this.method2340(Static133.anIntArray303[local195], local187 * Static133.anIntArray301[local195] >> 15, this.aClass21_8.anInt885);
						Static133.anIntArray303[local195] += (local182 * Static133.anIntArray304[local195] >> 16) + Static133.anIntArray302[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass21_5 != null) {
			this.aClass21_5.method570();
			this.aClass21_3.method570();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass21_5.method571(arg0);
				local352 = this.aClass21_3.method571(arg0);
				if (local339) {
					local187 = this.aClass21_5.anInt884 + ((this.aClass21_5.anInt882 - this.aClass21_5.anInt884) * local347 >> 8);
				} else {
					local187 = this.aClass21_5.anInt884 + ((this.aClass21_5.anInt882 - this.aClass21_5.anInt884) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static133.anIntArray296[local200] = 0;
				}
			}
		}
		if (this.anInt3174 > 0 && this.anInt3173 > 0) {
			local182 = (int) ((double) this.anInt3174 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static133.anIntArray296[local187] += Static133.anIntArray296[local187 - local182] * this.anInt3173 / 100;
			}
		}
		if (this.aClass85_1.anIntArray348[0] > 0 || this.aClass85_1.anIntArray348[1] > 0) {
			this.aClass21_1.method570();
			local182 = this.aClass21_1.method571(arg0 + 1);
			local187 = this.aClass85_1.method2728(0, (float) local182 / 65536.0F);
			local195 = this.aClass85_1.method2728(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static133.anIntArray296[local200 + local187] * (long) Static161.anInt3580 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static133.anIntArray296[local200 + local187 - local519 - 1] * (long) Static161.anIntArrayArray29[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static133.anIntArray296[local200 - local549 - 1] * (long) Static161.anIntArrayArray29[1][local549] >> 16);
					}
					Static133.anIntArray296[local200] = local352;
					local182 = this.aClass21_1.method571(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static133.anIntArray296[local200 + local187] * (long) Static161.anInt3580 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static133.anIntArray296[local200 + local187 - local519 - 1] * (long) Static161.anIntArrayArray29[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static133.anIntArray296[local200 - local549 - 1] * (long) Static161.anIntArrayArray29[1][local549] >> 16);
						}
						Static133.anIntArray296[local200] = local352;
						local182 = this.aClass21_1.method571(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static133.anIntArray296[local200 + local187 - local519 - 1] * (long) Static161.anIntArrayArray29[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static133.anIntArray296[local200 - local549 - 1] * (long) Static161.anIntArrayArray29[1][local549] >> 16);
							}
							Static133.anIntArray296[local200] = local352;
							this.aClass21_1.method571(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass85_1.method2728(0, (float) local182 / 65536.0F);
					local195 = this.aClass85_1.method2728(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static133.anIntArray296[local182] < -32768) {
				Static133.anIntArray296[local182] = -32768;
			}
			if (Static133.anIntArray296[local182] > 32767) {
				Static133.anIntArray296[local182] = 32767;
			}
		}
		return Static133.anIntArray296;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!h;)V")
	public void method2339(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aClass21_8 = new Class21();
		this.aClass21_8.method573(arg0);
		this.aClass21_9 = new Class21();
		this.aClass21_9.method573(arg0);
		@Pc(21) int local21 = arg0.method1253();
		if (local21 != 0) {
			arg0.anInt1597--;
			this.aClass21_4 = new Class21();
			this.aClass21_4.method573(arg0);
			this.aClass21_7 = new Class21();
			this.aClass21_7.method573(arg0);
		}
		local21 = arg0.method1253();
		if (local21 != 0) {
			arg0.anInt1597--;
			this.aClass21_6 = new Class21();
			this.aClass21_6.method573(arg0);
			this.aClass21_2 = new Class21();
			this.aClass21_2.method573(arg0);
		}
		local21 = arg0.method1253();
		if (local21 != 0) {
			arg0.anInt1597--;
			this.aClass21_5 = new Class21();
			this.aClass21_5.method573(arg0);
			this.aClass21_3 = new Class21();
			this.aClass21_3.method573(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1240();
			if (local114 == 0) {
				break;
			}
			this.anIntArray299[local109] = local114;
			this.anIntArray298[local109] = arg0.method1255();
			this.anIntArray295[local109] = arg0.method1240();
		}
		this.anInt3174 = arg0.method1240();
		this.anInt3173 = arg0.method1240();
		this.anInt3175 = arg0.method1252();
		this.anInt3176 = arg0.method1252();
		this.aClass85_1 = new Class85();
		this.aClass21_1 = new Class21();
		this.aClass85_1.method2727(arg0, this.aClass21_1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	private int method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray300[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray297[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
