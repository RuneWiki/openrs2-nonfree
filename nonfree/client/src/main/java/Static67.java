import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dp", name = "H", descriptor = "[Lclient!sj;")
	public static Class181[] aClass181Array1;

	@OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
	public static int anInt1361;

	@OriginalMember(owner = "client!dp", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!dp", name = "L", descriptor = "I")
	public static int anInt1358 = 0;

	@OriginalMember(owner = "client!dp", name = "hb", descriptor = "I")
	public static volatile int anInt1375 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ir;Lclient!ir;I)V")
	public static void method1062(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1) {
		Static221.aClass100_94 = arg1;
		Static320.aClass100_54 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZII)V")
	public static void method1065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class200 local11 = Static160.method2551(arg0);
		@Pc(14) int local14 = local11.anInt6198;
		@Pc(17) int local17 = local11.anInt6197;
		@Pc(20) int local20 = local11.anInt6200;
		@Pc(27) int local27 = Class20.anIntArray22[local20 - local17];
		if (arg1 < 0 || local27 < arg1) {
			arg1 = 0;
		}
		local27 <<= local17;
		Static305.method5099(local14, ~local27 & Static288.anIntArray471[local14] | arg1 << local17 & local27);
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(Z)V")
	public static void method1066() {
		Static20.aClass3_Sub4_Sub2_1.method3688();
		@Pc(13) int local13 = Static20.aClass3_Sub4_Sub2_1.method3681(8);
		@Pc(22) int local22;
		if (Static42.anInt897 > local13) {
			for (local22 = local13; local22 < Static42.anInt897; local22++) {
				Static263.anIntArray427[Static244.anInt4836++] = Static130.anIntArray180[local22];
			}
		}
		if (Static42.anInt897 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static42.anInt897 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static130.anIntArray180[local22];
			@Pc(64) Class5_Sub4_Sub4_Sub2 local64 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local60];
			@Pc(69) int local69 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
			if (local69 == 0) {
				Static130.anIntArray180[Static42.anInt897++] = local60;
				local64.anInt4921 = Static51.anInt1101;
			} else {
				@Pc(89) int local89 = Static20.aClass3_Sub4_Sub2_1.method3681(2);
				if (local89 == 0) {
					Static130.anIntArray180[Static42.anInt897++] = local60;
					local64.anInt4921 = Static51.anInt1101;
					Static303.anIntArray447[Static283.anInt4489++] = local60;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static130.anIntArray180[Static42.anInt897++] = local60;
						local64.anInt4921 = Static51.anInt1101;
						local133 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
						local64.method4202(1, local133);
						local143 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
						if (local143 == 1) {
							Static303.anIntArray447[Static283.anInt4489++] = local60;
						}
					} else if (local89 == 2) {
						Static130.anIntArray180[Static42.anInt897++] = local60;
						local64.anInt4921 = Static51.anInt1101;
						if (Static20.aClass3_Sub4_Sub2_1.method3681(1) == 1) {
							local133 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
							local64.method4202(2, local133);
							local143 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
							local64.method4202(2, local143);
						} else {
							local133 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
							local64.method4202(0, local133);
						}
						local133 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
						if (local133 == 1) {
							Static303.anIntArray447[Static283.anInt4489++] = local60;
						}
					} else if (local89 == 3) {
						Static263.anIntArray427[Static244.anInt4836++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V")
	public static void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 * Static36.anInt809 >> 8;
		if (local9 != 0 && arg1 != -1) {
			Static228.method3979(local9, Static293.aClass100_121, arg1);
			Static107.aBoolean119 = true;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1069(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg1[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg2; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local32);
			for (@Pc(61) int local61 = arg2; local61 < local30; local61++) {
				@Pc(67) String local67 = arg1[local61];
				if (local67 == null) {
					local59.append("null");
				} else {
					local59.append(local67);
				}
			}
			return local59.toString();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BIZ)V")
	public static void method1071(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (arg0 != 0 && arg1) {
				Static212.aClass122_2 = Static102.method1725(0, Static353.aClass42_5, 0, Static295.aCanvas4, Static127.anInterface9_3);
				Static212.aClass122_2.method4751(0);
				@Pc(20) Class209 local20 = Static76.method1152(Static79.anInt5522, Static86.aClass100_86);
				@Pc(29) Class120 local29 = Static212.aClass122_2.method4727(local20, Static366.method3882(Static317.aClass100_112, Static79.anInt5522));
				Static300.method5080(Static168.aString130, true, local29);
				Static212.aClass122_2.method4789();
				Static306.method5130();
			}
			Static212.aClass122_2 = Static102.method1725(Static135.anInt2792 * 2, Static353.aClass42_5, arg0, Static295.aCanvas4, Static127.anInterface9_3);
			if (Static212.aClass122_2.method4759()) {
				@Pc(55) Class3_Sub11 local55 = Static212.aClass122_2.method4783();
				Static212.aClass122_2.method4792(local55);
			}
		} catch (@Pc(60) Throwable local60) {
			if (arg0 != 0) {
				Static212.aClass122_2 = Static102.method1725(0, Static353.aClass42_5, 0, Static295.aCanvas4, Static127.anInterface9_3);
				arg0 = 0;
			}
		}
		Static352.anInt6827 = arg0;
		Static221.method3873();
		if (!Static212.aClass122_2.method4781()) {
			Static189.anInt3970 = 1;
		}
		Static212.aClass122_2.method4779(Static189.anInt3970);
		Static212.aClass122_2.method4787(0);
		Static200.aClass56_3 = Static212.aClass122_2.method4743();
		Static25.aClass56_1 = Static212.aClass122_2.method4743();
		@Pc(106) int local106 = (int) ((double) Static162.anInt2152 * 34.46D);
		if (Static212.aClass122_2.method4746()) {
			local106 += 128;
		}
		Static212.aClass122_2.method4738(50, local106);
		Static212.aClass122_2.method4803(!Static352.aBoolean453);
		if (Static212.aClass122_2.method4710()) {
			Static190.method3409(Static172.aBoolean196);
		}
		Static323.aBoolean426 = !Static75.method1142();
		Static23.method437(Static162.anInt2152 >> 3, Static122.anInt2632 >> 3, Static212.aClass122_2);
		Static135.method2265();
		Static137.aBoolean143 = false;
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "(I)V")
	public static void method1072() {
		@Pc(10) int local10 = Static191.aClass209_6.method5510(Static334.aString244);
		@Pc(21) int local21;
		for (@Pc(15) Class3_Sub26 local15 = (Class3_Sub26) Static116.aClass127_12.method3402(); local15 != null; local15 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
			local21 = Static115.method2000(local15);
			if (local21 > local10) {
				local10 = local21;
			}
		}
		local10 += 8;
		local21 = Static170.anInt6279 * 16 + 21;
		@Pc(51) int local51 = Static192.anInt4000 - local10 / 2;
		if (Static298.anInt5944 < local51 + local10) {
			local51 = Static298.anInt5944 - local10;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(75) int local75 = Static221.anInt4562;
		if (Static171.anInt3583 < local21 + local75) {
			local75 = Static171.anInt3583 - local21;
		}
		Static277.anInt5536 = local51;
		if (local75 < 0) {
			local75 = 0;
		}
		Static86.anInt4285 = local75;
		Static260.anInt5197 = local10;
		Static257.anInt5150 = (Static74.aBoolean73 ? 26 : 22) + Static170.anInt6279 * 16;
		Static168.aBoolean192 = true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!wh;Ljava/awt/Canvas;II)Lclient!tj;")
	public static Class122 method1073(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class122_Sub1(arg1, arg0, arg2);
	}
}
