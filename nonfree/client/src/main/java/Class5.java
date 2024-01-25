import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
	private static final int[] anIntArray14 = new int[32768];

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
	private static final int[] anIntArray11;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!fr;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!fr;")
	private Class75 aClass75_2;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!ac;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!fr;")
	private Class75 aClass75_3;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!fr;")
	private Class75 aClass75_4;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!fr;")
	private Class75 aClass75_5;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!fr;")
	private Class75 aClass75_6;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!fr;")
	private Class75 aClass75_7;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!fr;")
	private Class75 aClass75_8;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!fr;")
	private Class75 aClass75_9;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public int anInt77 = 500;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
	private final int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public int anInt79 = 0;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
	private final int[] anIntArray9 = new int[5];

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
	private final int[] anIntArray13 = new int[5];

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	private int anInt78 = 100;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	private int anInt80 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray14[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray11 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray11[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
	private int method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray11[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray14[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ef;)V")
	public void method75(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aClass75_6 = new Class75();
		this.aClass75_6.method2014(arg0);
		this.aClass75_9 = new Class75();
		this.aClass75_9.method2014(arg0);
		@Pc(21) int local21 = arg0.method3124();
		if (local21 != 0) {
			arg0.anInt3606--;
			this.aClass75_3 = new Class75();
			this.aClass75_3.method2014(arg0);
			this.aClass75_2 = new Class75();
			this.aClass75_2.method2014(arg0);
		}
		local21 = arg0.method3124();
		if (local21 != 0) {
			arg0.anInt3606--;
			this.aClass75_7 = new Class75();
			this.aClass75_7.method2014(arg0);
			this.aClass75_1 = new Class75();
			this.aClass75_1.method2014(arg0);
		}
		local21 = arg0.method3124();
		if (local21 != 0) {
			arg0.anInt3606--;
			this.aClass75_8 = new Class75();
			this.aClass75_8.method2014(arg0);
			this.aClass75_5 = new Class75();
			this.aClass75_5.method2014(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3153();
			if (local114 == 0) {
				break;
			}
			this.anIntArray9[local109] = local114;
			this.anIntArray10[local109] = arg0.method3123();
			this.anIntArray13[local109] = arg0.method3153();
		}
		this.anInt80 = arg0.method3153();
		this.anInt78 = arg0.method3153();
		this.anInt77 = arg0.method3104();
		this.anInt79 = arg0.method3104();
		this.aClass4_1 = new Class4();
		this.aClass75_4 = new Class75();
		this.aClass4_1.method71(arg0, this.aClass75_4);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
	public int[] method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static369.method2577(Static5.anIntArray12, 0, arg0);
		if (arg1 < 10) {
			return Static5.anIntArray12;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass75_6.method2016();
		this.aClass75_9.method2016();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass75_3 != null) {
			this.aClass75_3.method2016();
			this.aClass75_2.method2016();
			local24 = (int) ((double) (this.aClass75_3.anInt2102 - this.aClass75_3.anInt2103) * 32.768D / local16);
			local26 = (int) ((double) this.aClass75_3.anInt2103 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass75_7 != null) {
			this.aClass75_7.method2016();
			this.aClass75_1.method2016();
			local63 = (int) ((double) (this.aClass75_7.anInt2102 - this.aClass75_7.anInt2103) * 32.768D / local16);
			local65 = (int) ((double) this.aClass75_7.anInt2103 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray9[local102] != 0) {
				Static5.anIntArray18[local102] = 0;
				Static5.anIntArray17[local102] = (int) ((double) this.anIntArray13[local102] * local16);
				Static5.anIntArray16[local102] = (this.anIntArray9[local102] << 14) / 100;
				Static5.anIntArray15[local102] = (int) ((double) (this.aClass75_6.anInt2102 - this.aClass75_6.anInt2103) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray10[local102]) / local16);
				Static5.anIntArray19[local102] = (int) ((double) this.aClass75_6.anInt2103 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass75_6.method2017(arg0);
			local187 = this.aClass75_9.method2017(arg0);
			if (this.aClass75_3 != null) {
				local195 = this.aClass75_3.method2017(arg0);
				local200 = this.aClass75_2.method2017(arg0);
				local182 += this.method74(local28, local200, this.aClass75_3.anInt2100) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass75_7 != null) {
				local195 = this.aClass75_7.method2017(arg0);
				local200 = this.aClass75_1.method2017(arg0);
				local187 = local187 * ((this.method74(local67, local200, this.aClass75_7.anInt2100) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray9[local195] != 0) {
					local200 = local176 + Static5.anIntArray17[local195];
					if (local200 < arg0) {
						Static5.anIntArray12[local200] += this.method74(Static5.anIntArray18[local195], local187 * Static5.anIntArray16[local195] >> 15, this.aClass75_6.anInt2100);
						Static5.anIntArray18[local195] += (local182 * Static5.anIntArray15[local195] >> 16) + Static5.anIntArray19[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass75_8 != null) {
			this.aClass75_8.method2016();
			this.aClass75_5.method2016();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass75_8.method2017(arg0);
				local352 = this.aClass75_5.method2017(arg0);
				if (local339) {
					local187 = this.aClass75_8.anInt2103 + ((this.aClass75_8.anInt2102 - this.aClass75_8.anInt2103) * local347 >> 8);
				} else {
					local187 = this.aClass75_8.anInt2103 + ((this.aClass75_8.anInt2102 - this.aClass75_8.anInt2103) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static5.anIntArray12[local200] = 0;
				}
			}
		}
		if (this.anInt80 > 0 && this.anInt78 > 0) {
			local182 = (int) ((double) this.anInt80 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static5.anIntArray12[local187] += Static5.anIntArray12[local187 - local182] * this.anInt78 / 100;
			}
		}
		if (this.aClass4_1.anIntArray7[0] > 0 || this.aClass4_1.anIntArray7[1] > 0) {
			this.aClass75_4.method2016();
			local182 = this.aClass75_4.method2017(arg0 + 1);
			local187 = this.aClass4_1.method68(0, (float) local182 / 65536.0F);
			local195 = this.aClass4_1.method68(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static5.anIntArray12[local200 + local187] * (long) Static4.anInt76 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static5.anIntArray12[local200 + local187 - local519 - 1] * (long) Static4.anIntArrayArray2[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static5.anIntArray12[local200 - local549 - 1] * (long) Static4.anIntArrayArray2[1][local549] >> 16);
					}
					Static5.anIntArray12[local200] = local352;
					local182 = this.aClass75_4.method2017(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static5.anIntArray12[local200 + local187] * (long) Static4.anInt76 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static5.anIntArray12[local200 + local187 - local519 - 1] * (long) Static4.anIntArrayArray2[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static5.anIntArray12[local200 - local549 - 1] * (long) Static4.anIntArrayArray2[1][local549] >> 16);
						}
						Static5.anIntArray12[local200] = local352;
						local182 = this.aClass75_4.method2017(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static5.anIntArray12[local200 + local187 - local519 - 1] * (long) Static4.anIntArrayArray2[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static5.anIntArray12[local200 - local549 - 1] * (long) Static4.anIntArrayArray2[1][local549] >> 16);
							}
							Static5.anIntArray12[local200] = local352;
							this.aClass75_4.method2017(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass4_1.method68(0, (float) local182 / 65536.0F);
					local195 = this.aClass4_1.method68(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static5.anIntArray12[local182] < -32768) {
				Static5.anIntArray12[local182] = -32768;
			}
			if (Static5.anIntArray12[local182] > 32767) {
				Static5.anIntArray12[local182] = 32767;
			}
		}
		return Static5.anIntArray12;
	}
}
