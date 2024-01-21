import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class78 {

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "[I")
	public static int[] anIntArray358 = new int[32768];

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!ie;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!ie;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!ie;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!ie;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!ie;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!rc;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!ie;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Lclient!ie;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!ie;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "Lclient!ie;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
	public int anInt3624 = 500;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	private int anInt3623 = 100;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
	private final int[] anIntArray356 = new int[5];

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
	private final int[] anIntArray355 = new int[5];

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
	private final int[] anIntArray354 = new int[5];

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	private int anInt3625 = 0;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
	public int anInt3626 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray358[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray357 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray357[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ce;)V")
	public void method2617(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass37_2 = new Class37();
		this.aClass37_2.method1570(arg0);
		this.aClass37_6 = new Class37();
		this.aClass37_6.method1570(arg0);
		@Pc(21) int local21 = arg0.method1607();
		if (local21 != 0) {
			arg0.anInt2195--;
			this.aClass37_4 = new Class37();
			this.aClass37_4.method1570(arg0);
			this.aClass37_9 = new Class37();
			this.aClass37_9.method1570(arg0);
		}
		local21 = arg0.method1607();
		if (local21 != 0) {
			arg0.anInt2195--;
			this.aClass37_7 = new Class37();
			this.aClass37_7.method1570(arg0);
			this.aClass37_1 = new Class37();
			this.aClass37_1.method1570(arg0);
		}
		local21 = arg0.method1607();
		if (local21 != 0) {
			arg0.anInt2195--;
			this.aClass37_3 = new Class37();
			this.aClass37_3.method1570(arg0);
			this.aClass37_5 = new Class37();
			this.aClass37_5.method1570(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1645();
			if (local114 == 0) {
				break;
			}
			this.anIntArray354[local109] = local114;
			this.anIntArray355[local109] = arg0.method1608();
			this.anIntArray356[local109] = arg0.method1645();
		}
		this.anInt3625 = arg0.method1645();
		this.anInt3623 = arg0.method1645();
		this.anInt3624 = arg0.method1642();
		this.anInt3626 = arg0.method1642();
		this.aClass75_1 = new Class75();
		this.aClass37_8 = new Class37();
		this.aClass75_1.method2580(arg0, this.aClass37_8);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	private int method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray357[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray358[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
	public int[] method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static193.method2481(Static152.anIntArray359, 0, arg0);
		if (arg1 < 10) {
			return Static152.anIntArray359;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass37_2.method1571();
		this.aClass37_6.method1571();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass37_4 != null) {
			this.aClass37_4.method1571();
			this.aClass37_9.method1571();
			local24 = (int) ((double) (this.aClass37_4.anInt2137 - this.aClass37_4.anInt2140) * 32.768D / local16);
			local26 = (int) ((double) this.aClass37_4.anInt2140 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass37_7 != null) {
			this.aClass37_7.method1571();
			this.aClass37_1.method1571();
			local63 = (int) ((double) (this.aClass37_7.anInt2137 - this.aClass37_7.anInt2140) * 32.768D / local16);
			local65 = (int) ((double) this.aClass37_7.anInt2140 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray354[local102] != 0) {
				Static152.anIntArray360[local102] = 0;
				Static152.anIntArray362[local102] = (int) ((double) this.anIntArray356[local102] * local16);
				Static152.anIntArray364[local102] = (this.anIntArray354[local102] << 14) / 100;
				Static152.anIntArray361[local102] = (int) ((double) (this.aClass37_2.anInt2137 - this.aClass37_2.anInt2140) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray355[local102]) / local16);
				Static152.anIntArray363[local102] = (int) ((double) this.aClass37_2.anInt2140 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass37_2.method1569(arg0);
			local187 = this.aClass37_6.method1569(arg0);
			if (this.aClass37_4 != null) {
				local195 = this.aClass37_4.method1569(arg0);
				local200 = this.aClass37_9.method1569(arg0);
				local182 += this.method2618(local28, local200, this.aClass37_4.anInt2138) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass37_7 != null) {
				local195 = this.aClass37_7.method1569(arg0);
				local200 = this.aClass37_1.method1569(arg0);
				local187 = local187 * ((this.method2618(local67, local200, this.aClass37_7.anInt2138) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray354[local195] != 0) {
					local200 = local176 + Static152.anIntArray362[local195];
					if (local200 < arg0) {
						Static152.anIntArray359[local200] += this.method2618(Static152.anIntArray360[local195], local187 * Static152.anIntArray364[local195] >> 15, this.aClass37_2.anInt2138);
						Static152.anIntArray360[local195] += (local182 * Static152.anIntArray361[local195] >> 16) + Static152.anIntArray363[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass37_3 != null) {
			this.aClass37_3.method1571();
			this.aClass37_5.method1571();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass37_3.method1569(arg0);
				local352 = this.aClass37_5.method1569(arg0);
				if (local339) {
					local187 = this.aClass37_3.anInt2140 + ((this.aClass37_3.anInt2137 - this.aClass37_3.anInt2140) * local347 >> 8);
				} else {
					local187 = this.aClass37_3.anInt2140 + ((this.aClass37_3.anInt2137 - this.aClass37_3.anInt2140) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static152.anIntArray359[local200] = 0;
				}
			}
		}
		if (this.anInt3625 > 0 && this.anInt3623 > 0) {
			local182 = (int) ((double) this.anInt3625 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static152.anIntArray359[local187] += Static152.anIntArray359[local187 - local182] * this.anInt3623 / 100;
			}
		}
		if (this.aClass75_1.anIntArray348[0] > 0 || this.aClass75_1.anIntArray348[1] > 0) {
			this.aClass37_8.method1571();
			local182 = this.aClass37_8.method1569(arg0 + 1);
			local187 = this.aClass75_1.method2576(0, (float) local182 / 65536.0F);
			local195 = this.aClass75_1.method2576(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static152.anIntArray359[local200 + local187] * (long) Static146.anInt3570 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static152.anIntArray359[local200 + local187 - local519 - 1] * (long) Static146.anIntArrayArray30[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static152.anIntArray359[local200 - local549 - 1] * (long) Static146.anIntArrayArray30[1][local549] >> 16);
					}
					Static152.anIntArray359[local200] = local352;
					local182 = this.aClass37_8.method1569(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static152.anIntArray359[local200 + local187] * (long) Static146.anInt3570 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static152.anIntArray359[local200 + local187 - local519 - 1] * (long) Static146.anIntArrayArray30[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static152.anIntArray359[local200 - local549 - 1] * (long) Static146.anIntArrayArray30[1][local549] >> 16);
						}
						Static152.anIntArray359[local200] = local352;
						local182 = this.aClass37_8.method1569(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static152.anIntArray359[local200 + local187 - local519 - 1] * (long) Static146.anIntArrayArray30[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static152.anIntArray359[local200 - local549 - 1] * (long) Static146.anIntArrayArray30[1][local549] >> 16);
							}
							Static152.anIntArray359[local200] = local352;
							this.aClass37_8.method1569(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass75_1.method2576(0, (float) local182 / 65536.0F);
					local195 = this.aClass75_1.method2576(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static152.anIntArray359[local182] < -32768) {
				Static152.anIntArray359[local182] = -32768;
			}
			if (Static152.anIntArray359[local182] > 32767) {
				Static152.anIntArray359[local182] = 32767;
			}
		}
		return Static152.anIntArray359;
	}
}
