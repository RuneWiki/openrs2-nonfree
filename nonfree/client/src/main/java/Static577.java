import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_113 = new Class73(74, 11);

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[Lclient!db;")
	public static final Interface8[] anInterface8Array3 = new Interface8[75];

	@OriginalMember(owner = "client!um", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[128][128];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!ha;Lclient!d;I)V")
	public static void method5567(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Interface7 arg1) {
		if (Static491.aClass6_Sub5_Sub13_2 == null) {
			return;
		}
		if (Static382.anInt7220 < 10) {
			if (!Static491.aClass223_93.method5950(Static491.aClass6_Sub5_Sub13_2.aString41)) {
				Static382.anInt7220 = Static453.aClass223_102.method5957(Static491.aClass6_Sub5_Sub13_2.aString41) / 10;
				return;
			}
			Static152.method3042();
			Static382.anInt7220 = 10;
		}
		if (Static382.anInt7220 == 10) {
			Static491.anInt7785 = Static491.aClass6_Sub5_Sub13_2.anInt4037 >> 6 << 6;
			Static491.anInt7783 = Static491.aClass6_Sub5_Sub13_2.anInt4036 >> 6 << 6;
			Static491.anInt7787 = (Static491.aClass6_Sub5_Sub13_2.anInt4051 >> 6 << 6) + 64 - Static491.anInt7785;
			Static491.anInt7789 = (Static491.aClass6_Sub5_Sub13_2.anInt4043 >> 6 << 6) + 64 - Static491.anInt7783;
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static491.aClass6_Sub5_Sub13_2.method3444(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135, local77, Static227.anInt5049 + (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >> 9), (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >> 9) + Static477.anInt8412)) {
				local81 = local77[2] - Static491.anInt7785;
				local79 = local77[1] - Static491.anInt7783;
			}
			if (!Static378.aBoolean567 && local79 >= 0 && Static491.anInt7789 > local79 && local81 >= 0 && Static491.anInt7787 > local81) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static468.anInt8336 = local79;
				Static457.anInt8209 = local81;
			} else if (Static506.anInt8764 == -1 || Static178.anInt10781 == -1) {
				Static491.aClass6_Sub5_Sub13_2.method3441(Static491.aClass6_Sub5_Sub13_2.anInt4033 & 0x3FFF, local77, Static491.aClass6_Sub5_Sub13_2.anInt4033 >> 14 & 0x3FFF);
				Static457.anInt8209 = local77[2] - Static491.anInt7785;
				Static468.anInt8336 = local77[1] - Static491.anInt7783;
			} else {
				Static491.aClass6_Sub5_Sub13_2.method3441(Static178.anInt10781, local77, Static506.anInt8764);
				if (local77 != null) {
					Static468.anInt8336 = local77[1] - Static491.anInt7783;
					Static457.anInt8209 = local77[2] - Static491.anInt7785;
				}
				Static178.anInt10781 = -1;
				Static506.anInt8764 = -1;
				Static378.aBoolean567 = false;
			}
			if (Static491.aClass6_Sub5_Sub13_2.anInt4035 == 37) {
				Static491.aFloat158 = 3.0F;
				Static491.aFloat159 = 3.0F;
			} else if (Static491.aClass6_Sub5_Sub13_2.anInt4035 == 50) {
				Static491.aFloat158 = 4.0F;
				Static491.aFloat159 = 4.0F;
			} else if (Static491.aClass6_Sub5_Sub13_2.anInt4035 == 75) {
				Static491.aFloat158 = 6.0F;
				Static491.aFloat159 = 6.0F;
			} else if (Static491.aClass6_Sub5_Sub13_2.anInt4035 == 100) {
				Static491.aFloat158 = 8.0F;
				Static491.aFloat159 = 8.0F;
			} else if (Static491.aClass6_Sub5_Sub13_2.anInt4035 == 200) {
				Static491.aFloat158 = 16.0F;
				Static491.aFloat159 = 16.0F;
			} else {
				Static491.aFloat158 = 8.0F;
				Static491.aFloat159 = 8.0F;
			}
			Static491.anInt7780 = (int) Static491.aFloat158 >> 1;
			Static491.aByteArrayArrayArray16 = Static381.method6036(Static491.anInt7780);
			Static226.method4129();
			Static491.method6567();
			Static15.aClass163_8 = new Class163();
			Static491.anInt7779 += (int) (Math.random() * 5.0D) - 2;
			if (Static491.anInt7779 < -8) {
				Static491.anInt7779 = -8;
			}
			Static491.anInt7781 += (int) (Math.random() * 5.0D) - 2;
			if (Static491.anInt7779 > 8) {
				Static491.anInt7779 = 8;
			}
			if (Static491.anInt7781 < -16) {
				Static491.anInt7781 = -16;
			}
			if (Static491.anInt7781 > 16) {
				Static491.anInt7781 = 16;
			}
			Static491.method6574(arg1, Static491.anInt7779 >> 2 << 10, Static491.anInt7781 >> 1);
			Static491.aClass345_4.method8046(256, 1024);
			Static491.aClass341_4.method8003(256, 256);
			Static491.aClass310_3.method7478(4096);
			Static39.aClass214_1.method5869(256);
			Static382.anInt7220 = 20;
		} else if (Static382.anInt7220 == 20) {
			Static453.method6873(true);
			Static491.method6575(arg0, Static491.anInt7779, Static491.anInt7781);
			Static382.anInt7220 = 60;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 60) {
			if (Static491.aClass223_93.method5937(Static491.aClass6_Sub5_Sub13_2.aString41 + "_staticelements")) {
				if (!Static491.aClass223_93.method5950(Static491.aClass6_Sub5_Sub13_2.aString41 + "_staticelements")) {
					return;
				}
				Static491.aClass374_2 = Static105.method2437(Static149.aBoolean276, Static491.aClass223_93, Static491.aClass6_Sub5_Sub13_2.aString41 + "_staticelements");
			} else {
				Static491.aClass374_2 = new Class374(0);
			}
			Static491.method6572();
			Static382.anInt7220 = 70;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 70) {
			Static335.aClass333_7 = new Class333(arg0, 11, true, Static428.aCanvas12);
			Static382.anInt7220 = 73;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 73) {
			Static394.aClass333_10 = new Class333(arg0, 12, true, Static428.aCanvas12);
			Static382.anInt7220 = 76;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 76) {
			Static335.aClass333_6 = new Class333(arg0, 14, true, Static428.aCanvas12);
			Static382.anInt7220 = 79;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 79) {
			Static264.aClass333_4 = new Class333(arg0, 17, true, Static428.aCanvas12);
			Static382.anInt7220 = 82;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 82) {
			Static528.aClass333_13 = new Class333(arg0, 19, true, Static428.aCanvas12);
			Static382.anInt7220 = 85;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 85) {
			Static476.aClass333_12 = new Class333(arg0, 22, true, Static428.aCanvas12);
			Static382.anInt7220 = 88;
			Static453.method6873(true);
			Static67.method2006();
		} else if (Static382.anInt7220 == 88) {
			Static399.aClass333_9 = new Class333(arg0, 26, true, Static428.aCanvas12);
			Static382.anInt7220 = 91;
			Static453.method6873(true);
			Static67.method2006();
		} else {
			Static461.aClass333_11 = new Class333(arg0, 30, true, Static428.aCanvas12);
			Static382.anInt7220 = 100;
			Static453.method6873(true);
			Static67.method2006();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method5572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg0 && arg7 == arg8 && arg5 == arg4 && arg6 == arg2) {
			Static485.method7135(arg4, arg1, arg6, arg7, arg0);
			return;
		}
		@Pc(23) int local23 = arg0;
		@Pc(25) int local25 = arg7;
		@Pc(29) int local29 = arg0 * 3;
		@Pc(33) int local33 = arg7 * 3;
		@Pc(37) int local37 = arg3 * 3;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(58) int local58 = local37 + arg4 - local45 - arg0;
		@Pc(67) int local67 = arg6 + local41 - local49 - arg7;
		@Pc(77) int local77 = local45 + local29 - local37 - local37;
		@Pc(88) int local88 = local49 + local33 - local41 - local41;
		@Pc(93) int local93 = local37 - local29;
		@Pc(98) int local98 = local41 - local33;
		for (@Pc(100) int local100 = 128; local100 <= 4096; local100 += 128) {
			@Pc(108) int local108 = local100 * local100 >> 12;
			@Pc(114) int local114 = local100 * local108 >> 12;
			@Pc(118) int local118 = local58 * local114;
			@Pc(122) int local122 = local114 * local67;
			@Pc(126) int local126 = local108 * local77;
			@Pc(130) int local130 = local88 * local108;
			@Pc(134) int local134 = local100 * local93;
			@Pc(138) int local138 = local98 * local100;
			@Pc(150) int local150 = arg0 + (local118 + local126 + local134 >> 12);
			@Pc(160) int local160 = (local138 + local122 + local130 >> 12) + arg7;
			Static485.method7135(local150, arg1, local160, local25, local23);
			local25 = local160;
			local23 = local150;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method5573() {
		if (Static535.aClass6_Sub5_Sub11_1 != null) {
			Static535.aClass6_Sub5_Sub11_1 = null;
			Static413.method6488(Static626.anInt10528, Static9.anInt525, Static497.anInt8646, Static303.anInt6146);
		}
	}
}
