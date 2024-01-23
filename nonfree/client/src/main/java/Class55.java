import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class55 {

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "[I")
	private static int[] anIntArray179 = new int[32768];

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "[I")
	private static int[] anIntArray180;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!ic;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!ji;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!ji;")
	private Class58 aClass58_2;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!ji;")
	private Class58 aClass58_3;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!ji;")
	private Class58 aClass58_4;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!ji;")
	private Class58 aClass58_5;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!ji;")
	private Class58 aClass58_6;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!ji;")
	private Class58 aClass58_7;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!ji;")
	private Class58 aClass58_8;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!ji;")
	private Class58 aClass58_9;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	public int anInt1948 = 500;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
	private int[] anIntArray176 = new int[5];

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
	private int[] anIntArray178 = new int[5];

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	private int anInt1949 = 0;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	private int anInt1951 = 100;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	public int anInt1950 = 0;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "[I")
	private int[] anIntArray184 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray179[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray180 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray180[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!pg;)V")
	public void method1499(@OriginalArg(0) Class1_Sub17 arg0) {
		this.aClass58_3 = new Class58();
		this.aClass58_3.method1581(arg0);
		this.aClass58_8 = new Class58();
		this.aClass58_8.method1581(arg0);
		@Pc(21) int local21 = arg0.method2142();
		if (local21 != 0) {
			arg0.anInt2656--;
			this.aClass58_1 = new Class58();
			this.aClass58_1.method1581(arg0);
			this.aClass58_7 = new Class58();
			this.aClass58_7.method1581(arg0);
		}
		local21 = arg0.method2142();
		if (local21 != 0) {
			arg0.anInt2656--;
			this.aClass58_5 = new Class58();
			this.aClass58_5.method1581(arg0);
			this.aClass58_4 = new Class58();
			this.aClass58_4.method1581(arg0);
		}
		local21 = arg0.method2142();
		if (local21 != 0) {
			arg0.anInt2656--;
			this.aClass58_2 = new Class58();
			this.aClass58_2.method1581(arg0);
			this.aClass58_6 = new Class58();
			this.aClass58_6.method1581(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2156();
			if (local114 == 0) {
				break;
			}
			this.anIntArray176[local109] = local114;
			this.anIntArray178[local109] = arg0.method2177();
			this.anIntArray184[local109] = arg0.method2156();
		}
		this.anInt1949 = arg0.method2156();
		this.anInt1951 = arg0.method2156();
		this.anInt1948 = arg0.method2178();
		this.anInt1950 = arg0.method2178();
		this.aClass52_1 = new Class52();
		this.aClass58_9 = new Class58();
		this.aClass52_1.method1426(arg0, this.aClass58_9);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
	public int[] method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static235.method867(Static96.anIntArray177, 0, arg0);
		if (arg1 < 10) {
			return Static96.anIntArray177;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass58_3.method1583();
		this.aClass58_8.method1583();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass58_1 != null) {
			this.aClass58_1.method1583();
			this.aClass58_7.method1583();
			local24 = (int) ((double) (this.aClass58_1.anInt2047 - this.aClass58_1.anInt2046) * 32.768D / local16);
			local26 = (int) ((double) this.aClass58_1.anInt2046 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass58_5 != null) {
			this.aClass58_5.method1583();
			this.aClass58_4.method1583();
			local63 = (int) ((double) (this.aClass58_5.anInt2047 - this.aClass58_5.anInt2046) * 32.768D / local16);
			local65 = (int) ((double) this.aClass58_5.anInt2046 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray176[local102] != 0) {
				Static96.anIntArray182[local102] = 0;
				Static96.anIntArray185[local102] = (int) ((double) this.anIntArray184[local102] * local16);
				Static96.anIntArray183[local102] = (this.anIntArray176[local102] << 14) / 100;
				Static96.anIntArray181[local102] = (int) ((double) (this.aClass58_3.anInt2047 - this.aClass58_3.anInt2046) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray178[local102]) / local16);
				Static96.anIntArray186[local102] = (int) ((double) this.aClass58_3.anInt2046 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass58_3.method1580(arg0);
			local187 = this.aClass58_8.method1580(arg0);
			if (this.aClass58_1 != null) {
				local195 = this.aClass58_1.method1580(arg0);
				local200 = this.aClass58_7.method1580(arg0);
				local182 += this.method1502(local28, local200, this.aClass58_1.anInt2049) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass58_5 != null) {
				local195 = this.aClass58_5.method1580(arg0);
				local200 = this.aClass58_4.method1580(arg0);
				local187 = local187 * ((this.method1502(local67, local200, this.aClass58_5.anInt2049) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray176[local195] != 0) {
					local200 = local176 + Static96.anIntArray185[local195];
					if (local200 < arg0) {
						Static96.anIntArray177[local200] += this.method1502(Static96.anIntArray182[local195], local187 * Static96.anIntArray183[local195] >> 15, this.aClass58_3.anInt2049);
						Static96.anIntArray182[local195] += (local182 * Static96.anIntArray181[local195] >> 16) + Static96.anIntArray186[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass58_2 != null) {
			this.aClass58_2.method1583();
			this.aClass58_6.method1583();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass58_2.method1580(arg0);
				local352 = this.aClass58_6.method1580(arg0);
				if (local339) {
					local187 = this.aClass58_2.anInt2046 + ((this.aClass58_2.anInt2047 - this.aClass58_2.anInt2046) * local347 >> 8);
				} else {
					local187 = this.aClass58_2.anInt2046 + ((this.aClass58_2.anInt2047 - this.aClass58_2.anInt2046) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static96.anIntArray177[local200] = 0;
				}
			}
		}
		if (this.anInt1949 > 0 && this.anInt1951 > 0) {
			local182 = (int) ((double) this.anInt1949 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static96.anIntArray177[local187] += Static96.anIntArray177[local187 - local182] * this.anInt1951 / 100;
			}
		}
		if (this.aClass52_1.anIntArray167[0] > 0 || this.aClass52_1.anIntArray167[1] > 0) {
			this.aClass58_9.method1583();
			local182 = this.aClass58_9.method1580(arg0 + 1);
			local187 = this.aClass52_1.method1427(0, (float) local182 / 65536.0F);
			local195 = this.aClass52_1.method1427(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static96.anIntArray177[local200 + local187] * (long) Static90.anInt1864 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static96.anIntArray177[local200 + local187 - local519 - 1] * (long) Static90.anIntArrayArray10[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static96.anIntArray177[local200 - local549 - 1] * (long) Static90.anIntArrayArray10[1][local549] >> 16);
					}
					Static96.anIntArray177[local200] = local352;
					local182 = this.aClass58_9.method1580(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static96.anIntArray177[local200 + local187] * (long) Static90.anInt1864 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static96.anIntArray177[local200 + local187 - local519 - 1] * (long) Static90.anIntArrayArray10[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static96.anIntArray177[local200 - local549 - 1] * (long) Static90.anIntArrayArray10[1][local549] >> 16);
						}
						Static96.anIntArray177[local200] = local352;
						local182 = this.aClass58_9.method1580(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static96.anIntArray177[local200 + local187 - local519 - 1] * (long) Static90.anIntArrayArray10[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static96.anIntArray177[local200 - local549 - 1] * (long) Static90.anIntArrayArray10[1][local549] >> 16);
							}
							Static96.anIntArray177[local200] = local352;
							this.aClass58_9.method1580(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass52_1.method1427(0, (float) local182 / 65536.0F);
					local195 = this.aClass52_1.method1427(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static96.anIntArray177[local182] < -32768) {
				Static96.anIntArray177[local182] = -32768;
			}
			if (Static96.anIntArray177[local182] > 32767) {
				Static96.anIntArray177[local182] = 32767;
			}
		}
		return Static96.anIntArray177;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
	private int method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray180[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray179[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
