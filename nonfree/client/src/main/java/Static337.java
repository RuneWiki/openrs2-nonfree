import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!nca", name = "y", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_77 = new Class316(41, 4);

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "I")
	public static int anInt6450 = 0;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)Lclient!va;")
	public static Class15_Sub2_Sub4 method5187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class133 local11 = Static113.aClass133ArrayArrayArray1[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class15_Sub2_Sub4 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class315 local22 = local11.aClass315_1; local22 != null; local22 = local22.aClass315_3) {
			@Pc(30) Class15_Sub2 local30 = local22.aClass15_Sub2_2;
			if (local30 instanceof Class15_Sub2_Sub4) {
				@Pc(36) Class15_Sub2_Sub4 local36 = (Class15_Sub2_Sub4) local30;
				@Pc(46) int local46 = (local36.method7135() - 1) * 256 + 252;
				@Pc(54) int local54 = local36.anInt8911 - local46 >> 9;
				@Pc(61) int local61 = local36.anInt8913 - local46 >> 9;
				@Pc(69) int local69 = local36.anInt8911 + local46 >> 9;
				@Pc(76) int local76 = local46 + local36.anInt8913 >> 9;
				if (local54 <= arg2 && local61 <= arg0 && arg2 <= local69 && arg0 <= local76) {
					@Pc(105) int local105 = (local76 + 1 - arg0) * (local69 + (1 - arg2));
					if (local105 > local19) {
						local17 = local36;
						local19 = local105;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(II[BIIIII[B)V")
	public static void method5188(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(22) int local22 = -arg3; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg0++;
				arg1[local30] = (byte) (arg1[local30] - arg7[arg2++]);
				@Pc(43) int local43 = arg0++;
				arg1[local43] = (byte) (arg1[local43] - arg7[arg2++]);
				@Pc(56) int local56 = arg0++;
				arg1[local56] = (byte) (arg1[local56] - arg7[arg2++]);
				@Pc(69) int local69 = arg0++;
				arg1[local69] = (byte) (arg1[local69] - arg7[arg2++]);
			}
			for (@Pc(88) int local88 = local15; local88 < 0; local88++) {
				local30 = arg0++;
				arg1[local30] = (byte) (arg1[local30] - arg7[arg2++]);
			}
			arg0 += arg5;
			arg2 += arg4;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
	public static void method5189() {
		Static479.method6666(Static165.aClass97_8);
		Static237.anInt4306++;
		if (Static307.aBoolean405 && Static471.aBoolean538) {
			@Pc(30) int local30 = Static9.aClass29_1.method2946();
			@Pc(38) int local38 = Static9.aClass29_1.method2942();
			local30 -= Static403.anInt7295;
			local38 -= Static63.anInt1087;
			if (Static232.anInt9855 > local30) {
				local30 = Static232.anInt9855;
			}
			if (Static165.aClass97_8.anInt2690 + local30 > Static580.aClass97_26.anInt2690 + Static232.anInt9855) {
				local30 = Static232.anInt9855 + Static580.aClass97_26.anInt2690 - Static165.aClass97_8.anInt2690;
			}
			if (local38 < Static86.anInt9999) {
				local38 = Static86.anInt9999;
			}
			if (local38 + Static165.aClass97_8.anInt2670 > Static86.anInt9999 - -Static580.aClass97_26.anInt2670) {
				local38 = Static86.anInt9999 + Static580.aClass97_26.anInt2670 - Static165.aClass97_8.anInt2670;
			}
			@Pc(114) int local114 = local30 + Static580.aClass97_26.anInt2691 - Static232.anInt9855;
			@Pc(121) int local121 = Static580.aClass97_26.anInt2665 + local38 - Static86.anInt9999;
			@Pc(179) Class6_Sub1 local179;
			if (Static9.aClass29_1.method2944()) {
				if (Static237.anInt4306 > Static165.aClass97_8.anInt2673) {
					@Pc(133) int local133 = local30 - Static470.anInt8299;
					@Pc(138) int local138 = local38 - Static166.anInt4489;
					if (local133 > Static165.aClass97_8.anInt2667 || -Static165.aClass97_8.anInt2667 > local133 || local138 > Static165.aClass97_8.anInt2667 || -Static165.aClass97_8.anInt2667 > local138) {
						Static301.aBoolean383 = true;
					}
				}
				if (Static165.aClass97_8.anObjectArray29 != null && Static301.aBoolean383) {
					local179 = new Class6_Sub1();
					local179.anInt92 = local114;
					local179.aClass97_2 = Static165.aClass97_8;
					local179.anObjectArray1 = Static165.aClass97_8.anObjectArray29;
					local179.anInt89 = local121;
					Static199.method3316(local179);
					return;
				}
			} else {
				if (Static301.aBoolean383) {
					Static269.method4026();
					if (Static165.aClass97_8.anObjectArray12 != null) {
						local179 = new Class6_Sub1();
						local179.anInt92 = local114;
						local179.aClass97_3 = Static3.aClass97_17;
						local179.anInt89 = local121;
						local179.aClass97_2 = Static165.aClass97_8;
						local179.anObjectArray1 = Static165.aClass97_8.anObjectArray12;
						Static199.method3316(local179);
					}
					if (Static3.aClass97_17 != null && Static74.method1038(Static165.aClass97_8) != null) {
						Static48.method7043(Static165.aClass97_8, Static3.aClass97_17);
					}
				} else if ((Static451.anInt7957 == 1 || Static76.method1089()) && Static384.anInt7048 > 2) {
					Static108.method1674(Static63.anInt1087 + Static166.anInt4489, Static403.anInt7295 + Static470.anInt8299);
				} else if (Static53.method7124()) {
					Static108.method1674(Static166.anInt4489 + Static63.anInt1087, Static470.anInt8299 + Static403.anInt7295);
				}
				Static165.aClass97_8 = null;
			}
		} else if (Static237.anInt4306 > 1) {
			Static165.aClass97_8 = null;
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)Z")
	public static boolean method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([[BILclient!op;)V")
	public static void method5192(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class238_Sub1 arg1) {
		@Pc(8) int local8 = Static287.aByteArrayArray13.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static468.anIntArray577[local10] >> 8) * 64 - Static150.anInt2792;
				@Pc(40) int local40 = (Static468.anIntArray577[local10] & 0xFF) * 64 - Static154.anInt2878;
				Static262.method3999();
				arg1.method5555(local29, Static554.aClass90_12, Static30.aClass138Array1, local40, local16);
			}
		}
	}
}
