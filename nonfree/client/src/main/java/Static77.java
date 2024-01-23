import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	public static int anInt1474;

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "[I")
	public static int[] anIntArray154 = new int[100];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
	public static void method1182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static105.method1726(arg2, arg3, arg4, arg1);
		} else if (Static211.anInt4200 <= arg1 - arg4 && arg1 + arg4 <= Static154.anInt3126 && arg3 - arg0 >= Static171.anInt3392 && arg3 + arg0 <= Static141.anInt2889) {
			Static44.method702(arg4, arg1, arg0, arg3, arg2);
		} else {
			Static243.method3712(arg0, arg1, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!tk;)V")
	public static void method1191(@OriginalArg(1) Class164 arg0) {
		Static165.anInt3301 = 3;
		@Pc(9) Class50 local9 = null;
		Static240.method4000(true);
		Static298.aBoolean357 = true;
		Static18.anInt380 = 2;
		Static14.aBoolean154 = true;
		Static176.anInt808 = 0;
		Static159.aBoolean203 = true;
		Static150.anInt3043 = 127;
		Static139.aBoolean188 = true;
		Static182.aBoolean234 = true;
		Static218.anInt5374 = 0;
		Static52.anInt1043 = 255;
		Static114.aBoolean166 = true;
		Static73.aBoolean106 = true;
		Static105.aBoolean162 = true;
		Static71.anInt1312 = 127;
		Static268.aBoolean333 = true;
		Static224.anInt4445 = 0;
		Static171.aBoolean210 = true;
		Static238.aBoolean299 = true;
		Static222.anInt4407 = 0;
		if (Static193.anInt3800 >= 96) {
			Static109.method1760(2);
		} else {
			Static109.method1760(0);
		}
		Static266.aBoolean331 = true;
		Static92.aBoolean144 = false;
		Static169.aBoolean209 = false;
		Static116.anInt2573 = 0;
		Static74.aBoolean115 = false;
		Static11.anInt216 = 0;
		Static86.anInt1777 = 0;
		try {
			@Pc(86) Class123 local86 = arg0.method3947("runescape");
			while (local86.anInt3791 == 0) {
				Static122.method2061(1L);
			}
			if (local86.anInt3791 == 1) {
				local9 = (Class50) local86.anObject4;
				@Pc(111) byte[] local111 = new byte[(int) local9.method1252()];
				@Pc(128) int local128;
				for (@Pc(113) int local113 = 0; local113 < local111.length; local113 += local128) {
					local128 = local9.method1250(local111.length - local113, local111, local113);
					if (local128 == -1) {
						throw new IOException("EOF");
					}
				}
				Static76.method1156(new Class4_Sub17(local111));
			}
		} catch (@Pc(150) Exception local150) {
		}
		try {
			if (local9 != null) {
				local9.method1254();
			}
		} catch (@Pc(157) Exception local157) {
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIIIII)V")
	public static void method1192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static211.anInt4200 && arg0 <= Static154.anInt3126 && Static171.anInt3392 <= arg4 && arg3 <= Static141.anInt2889) {
			Static108.method1747(arg4, arg1, arg3, arg2, arg0);
		} else {
			Static3.method44(arg4, arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg2 && arg5 == arg8 && arg6 == arg4 && arg7 == arg1) {
			Static197.method3080(arg2, arg3, arg7, arg8, arg6);
			return;
		}
		@Pc(35) int local35 = arg2;
		@Pc(37) int local37 = arg8;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg2 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg4 * 3;
		@Pc(57) int local57 = arg0 * 3;
		@Pc(66) int local66 = local57 + arg6 - arg2 - local53;
		@Pc(70) int local70 = arg1 * 3;
		@Pc(80) int local80 = arg7 + local49 - local70 - arg8;
		@Pc(90) int local90 = local45 + local53 - local57 - local57;
		@Pc(95) int local95 = local57 - local45;
		@Pc(105) int local105 = local70 + local41 - local49 - local49;
		@Pc(110) int local110 = local49 - local41;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(123) int local123 = local112 * local112 >> 12;
			@Pc(129) int local129 = local123 * local112 >> 12;
			@Pc(133) int local133 = local66 * local129;
			@Pc(137) int local137 = local129 * local80;
			@Pc(141) int local141 = local123 * local105;
			@Pc(145) int local145 = local123 * local90;
			@Pc(149) int local149 = local112 * local95;
			@Pc(159) int local159 = (local149 + local133 + local145 >> 12) + arg2;
			@Pc(163) int local163 = local110 * local112;
			@Pc(174) int local174 = (local163 + local137 + local141 >> 12) + arg8;
			Static197.method3080(local35, arg3, local174, local37, local159);
			local37 = local174;
			local35 = local159;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	public static void method1198() {
		anIntArray154 = null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static178.aBoolean216) {
			Static186.method2963(arg2, arg1, arg3 + arg2, arg0 + arg1);
			Static186.method2968(arg2, arg1, arg3, arg0, 0);
		} else {
			Static166.method2622(arg2, arg1, arg3 + arg2, arg1 - -arg0);
			Static166.method2627(arg2, arg1, arg3, arg0, 0);
		}
		if (Static93.anInt1927 < 100) {
			return;
		}
		if (Static167.aClass4_Sub2_Sub1_5 == null || Static167.aClass4_Sub2_Sub1_5.anInt4301 != arg3 || Static167.aClass4_Sub2_Sub1_5.anInt4308 != arg0) {
			@Pc(74) Class4_Sub2_Sub1_Sub1 local74 = new Class4_Sub2_Sub1_Sub1(arg3, arg0);
			Static166.method2623(local74.anIntArray387, arg3, arg0);
			Static168.method2658(0, 0, 0, Static92.anInt1912, arg0, Static269.anInt5031, 0, arg3);
			if (Static178.aBoolean216) {
				Static167.aClass4_Sub2_Sub1_5 = new Class4_Sub2_Sub1_Sub2(local74);
			} else {
				Static167.aClass4_Sub2_Sub1_5 = local74;
			}
			if (Static178.aBoolean216) {
				Static166.anIntArray293 = null;
			} else {
				Static26.aClass119_1.method3926();
			}
		}
		Static167.aClass4_Sub2_Sub1_5.method3461(arg2, arg1);
		@Pc(122) int local122 = arg2 + arg3 * Static165.anInt3295 / Static269.anInt5031;
		@Pc(131) int local131 = arg1 + arg0 * Static87.anInt1806 / Static92.anInt1912;
		@Pc(137) int local137 = arg3 * Static59.anInt3156 / Static269.anInt5031;
		@Pc(139) int local139 = 16711680;
		if (Static132.anInt2784 == 1) {
			local139 = 16777215;
		}
		@Pc(151) int local151 = arg0 * Static21.anInt4307 / Static92.anInt1912;
		if (Static178.aBoolean216) {
			Static186.method2954(local122, local131, local137, local151, local139, 128);
			Static186.method2970(local122, local131, local137, local151, local139);
		} else {
			Static166.method2616(local122, local131, local137, local151, local139, 128);
			Static166.method2614(local122, local131, local137, local151, local139);
		}
		if (Static17.anInt372 <= 0) {
			return;
		}
		@Pc(199) int local199;
		if (Static120.anInt2640 > 10) {
			local199 = (20 - Static120.anInt2640) * 25;
		} else {
			local199 = Static120.anInt2640 * 25;
		}
		for (@Pc(210) Class4_Sub13 local210 = (Class4_Sub13) Static131.aClass10_29.method190(); local210 != null; local210 = (Class4_Sub13) Static131.aClass10_29.method191()) {
			if (local210.anInt1182 == Static79.anInt1519) {
				@Pc(227) int local227 = arg3 * local210.anInt1187 / Static269.anInt5031 + arg2;
				@Pc(237) int local237 = arg1 + arg0 * local210.anInt1184 / Static92.anInt1912;
				if (Static178.aBoolean216) {
					Static186.method2954(local227 - 2, local237 + -2, 4, 4, 16776960, local199);
				} else {
					Static166.method2616(local227 - 2, local237 + -2, 4, 4, 16776960, local199);
				}
			}
		}
	}
}
