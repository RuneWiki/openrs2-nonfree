import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!en;IILclient!bm;III)V")
	public static void method3896(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static203.anInt3932 < 100) {
			Static191.method5160(arg3, arg0);
		}
		arg0.method4795(arg4, arg2, arg5 + arg4, arg1 + arg2);
		@Pc(31) int local31;
		@Pc(41) int local41;
		if (Static203.anInt3932 < 100) {
			local31 = arg5 / 2 + arg4;
			local41 = arg1 / 2 + arg2 - 18 - 20;
			arg0.method4877(arg4, arg2, arg5, arg1, -16777216, 0);
			arg0.method4851(local31 - 152, local41, 304, 34, Static118.aColorArray2[Static95.anInt6301].getRGB(), 0);
			arg0.method4877(local31 - 150, local41 + 2, Static203.anInt3932 * 3, 30, Static114.aColorArray1[Static95.anInt6301].getRGB(), 0);
			Static190.aClass91_8.method5308(local41 + 20, -1, Static47.aString66, Static219.aColorArray3[Static95.anInt6301].getRGB(), local31);
			return;
		}
		@Pc(108) int local108 = Static180.anInt3602 - (int) ((float) arg5 / Static186.aFloat98);
		local31 = Static9.anInt302 + (int) ((float) arg1 / Static186.aFloat98);
		local41 = (int) ((float) arg5 / Static186.aFloat98) + Static180.anInt3602;
		Static47.anInt1202 = (int) ((float) (arg1 * 2) / Static186.aFloat98);
		Static112.anInt2426 = (int) ((float) (arg5 * 2) / Static186.aFloat98);
		Static218.anInt4347 = Static9.anInt302 - (int) ((float) arg1 / Static186.aFloat98);
		Static112.anInt2424 = Static180.anInt3602 - (int) ((float) arg5 / Static186.aFloat98);
		@Pc(167) int local167 = Static9.anInt302 - (int) ((float) arg1 / Static186.aFloat98);
		Static186.method5343(local108 + Static186.anInt6007, local31 + Static186.anInt6012, Static186.anInt6007 + local41, local167 - -Static186.anInt6012, arg4, arg2, arg5 + arg4, arg2 + 1 - -arg1);
		Static186.method5357(arg0);
		@Pc(198) Class211 local198 = Static186.method5354(arg0);
		Static75.method1602(local198, arg0);
		if (Static210.anInt5623 > 0) {
			Static31.anInt823--;
			if (Static31.anInt823 == 0) {
				Static210.anInt5623--;
				Static31.anInt823 = 20;
			}
		}
		if (!Static336.aBoolean407) {
			return;
		}
		@Pc(229) int local229 = arg4 + arg5 - 5;
		@Pc(235) int local235 = arg1 + arg2 - 8;
		Static62.aClass91_3.method5306(local229, 16776960, local235, "Fps:" + Static236.anInt4586);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static62.aClass91_3.method5306(local229, local264, local250, "Mem:" + local262 + "k");
		local235 = local250 - 15;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public static void method3897() {
		Static65.aClass170_36.anInt5179 = 1;
		Static334.aClient1.method942();
		Static21.aLong210 = 0L;
		Static252.aBoolean378 = true;
		Static338.aClass198_3.anInt6025 = 0;
		Static169.aBoolean246 = true;
		Static350.anInt6549 = 0;
		Static236.method4031();
		Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
		Static316.anInt6045 = -1;
		Static161.anInt3248 = -1;
		Static269.anInt5162 = 0;
		Static28.anInt770 = 0;
		Static12.anInt371 = 0;
		Static335.anInt6325 = -1;
		Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
		Static1.anInt4 = -1;
		for (@Pc(4269) int local4269 = 0; local4269 < Static141.aClass104Array1.length; local4269++) {
			Static141.aClass104Array1[local4269] = null;
		}
		Static181.method3377(0);
		for (@Pc(4291) int local4291 = 0; local4291 < 100; local4291++) {
			Static106.aStringArray13[local4291] = null;
		}
		Static193.anInt3825 = 0;
		Static100.anInt2199 = 0;
		Static293.anInt5615 = (int) (Math.random() * 80.0D) - 40;
		Static339.anInt6353 = (int) (Math.random() * 30.0D) - 20;
		Static155.aFloat64 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static225.anInt4428 = 0;
		Static288.anInt5541 = (int) (Math.random() * 100.0D) - 50;
		Static191.anInt5842 = (int) (Math.random() * 110.0D) - 55;
		Static20.aBoolean40 = false;
		Static253.anInt4957 = (int) (Math.random() * 120.0D) - 60;
		Static5.method171();
		Static161.anInt3258 = 0;
		Static63.anInt1486 = 0;
		for (@Pc(4364) int local4364 = 0; local4364 < 2048; local4364++) {
			Static312.aClass25_Sub1_Sub1_Sub1Array1[local4364] = null;
			Static227.aClass5_Sub1Array1[local4364] = null;
		}
		for (@Pc(4382) int local4382 = 0; local4382 < 32768; local4382++) {
			Static188.aClass25_Sub1_Sub1_Sub2Array1[local4382] = null;
		}
		Static85.aClass25_Sub1_Sub1_Sub1_1 = Static312.aClass25_Sub1_Sub1_Sub1Array1[2047] = new Class25_Sub1_Sub1_Sub1();
		Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5287 = 2047;
		Static262.aClass211_32.method5600();
		Static316.aClass211_37.method5600();
		Static175.aClass24_2.method625();
		Static3.aClass42_56.method1054();
		Static208.aClass211_18 = new Class211();
		Static31.anInt829 = 0;
		Static123.anInt2598 = 0;
		Static117.method2316();
		Static126.method2447();
		Class25_Sub1_Sub4.lb = 0;
		Static328.anInt6217 = 0;
		Static6.anInt193 = 0;
		Static99.anInt2187 = 0;
		Static339.anInt6358 = 0;
		Static341.anInt6374 = 0;
		Static32.anInt861 = 0;
		Static54.anInt1333 = 0;
		Static267.anInt5127 = 0;
		Static256.anInt4992 = 0;
		for (@Pc(4451) int local4451 = 0; local4451 < Static286.anIntArray412.length; local4451++) {
			if (!Static161.aBooleanArray15[local4451]) {
				Static286.anIntArray412[local4451] = -1;
			}
		}
		if (Static207.anInt4106 != -1) {
			Static132.method2686(Static207.anInt4106);
		}
		for (@Pc(4481) Class5_Sub40 local4481 = (Class5_Sub40) Static265.aClass42_53.method1060(); local4481 != null; local4481 = (Class5_Sub40) Static265.aClass42_53.method1055()) {
			if (!local4481.method5802()) {
				local4481 = (Class5_Sub40) Static265.aClass42_53.method1060();
				if (local4481 == null) {
					break;
				}
			}
			Static339.method5623(true, local4481, false);
		}
		Static207.anInt4106 = -1;
		Static265.aClass42_53 = new Class42(8);
		Static222.method3886();
		Static323.aClass96_20 = null;
		Static210.aClass61_3.method1717(false, null, -1, new int[5], -1);
		for (@Pc(4530) int local4530 = 0; local4530 < 8; local4530++) {
			Static47.aStringArray4[local4530] = null;
			Static226.aBooleanArray18[local4530] = false;
			Static297.anIntArray439[local4530] = -1;
		}
		Static102.method2048();
		Static133.aBoolean487 = true;
		for (@Pc(4556) int local4556 = 0; local4556 < 100; local4556++) {
			Static293.aBooleanArray25[local4556] = true;
		}
		Static305.aString337 = null;
		Static117.anInt2498 = 0;
		Static32.aClass205Array1 = null;
		for (@Pc(4576) int local4576 = 0; local4576 < 6; local4576++) {
			Static333.aClass41Array2[local4576] = new Class41();
		}
		for (@Pc(4590) int local4590 = 0; local4590 < 25; local4590++) {
			Static100.anIntArray129[local4590] = 0;
			Static319.anIntArray517[local4590] = 0;
			Static184.anIntArray536[local4590] = 0;
		}
		Static310.method5282();
		Static339.anInt6356 = 0;
		Static98.aShortArray18 = Static171.aShortArray37 = Static46.aShortArray12 = Static110.aShortArray19 = new short[256];
		Static27.aString305 = Static136.aString177;
		Static162.aBoolean229 = false;
		Static255.aBoolean381 = true;
		Static353.method5825();
		Static125.method2419();
		Static65.aClass170_36.anInt5179 = 2;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method3898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg6;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 - arg5;
		@Pc(24) int local24 = arg6 - arg5;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = arg6 * arg6;
		@Pc(36) int local36 = local19 * local19;
		@Pc(40) int local40 = local24 * local24;
		@Pc(44) int local44 = local32 << 1;
		@Pc(48) int local48 = local28 << 1;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = local36 << 1;
		@Pc(60) int local60 = arg6 << 1;
		@Pc(64) int local64 = local24 << 1;
		@Pc(72) int local72 = local44 + local28 * (1 - local60);
		@Pc(81) int local81 = local32 - (local60 - 1) * local48;
		@Pc(89) int local89 = (1 - local64) * local36 + local52;
		@Pc(98) int local98 = local40 - local56 * (local64 - 1);
		@Pc(102) int local102 = local28 << 2;
		@Pc(106) int local106 = local32 << 2;
		@Pc(110) int local110 = local36 << 2;
		@Pc(114) int local114 = local40 << 2;
		@Pc(118) int local118 = local44 * 3;
		@Pc(124) int local124 = local48 * (local60 - 3);
		@Pc(128) int local128 = local52 * 3;
		@Pc(134) int local134 = local56 * (local64 - 3);
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = (arg6 - 1) * local102;
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (local24 - 1) * local110;
		@Pc(154) int[] local154 = Static332.anIntArrayArray56[arg0];
		Static247.method3552(arg1, arg4 - arg2, local154, arg4 - local19);
		Static247.method3552(arg3, arg4 - local19, local154, arg4 + local19);
		Static247.method3552(arg1, arg4 + local19, local154, arg4 + arg2);
		while (local13 > 0) {
			@Pc(203) boolean local203 = local13 <= local24;
			if (local203) {
				if (local89 < 0) {
					while (local89 < 0) {
						local89 += local128;
						local98 += local144;
						local144 += local114;
						local128 += local114;
						local15++;
					}
				}
				if (local98 < 0) {
					local89 += local128;
					local98 += local144;
					local128 += local114;
					local15++;
					local144 += local114;
				}
				local98 += -local134;
				local89 += -local150;
				local134 -= local110;
				local150 -= local110;
			}
			if (local72 < 0) {
				while (local72 < 0) {
					local81 += local136;
					local72 += local118;
					local11++;
					local118 += local106;
					local136 += local106;
				}
			}
			if (local81 < 0) {
				local72 += local118;
				local81 += local136;
				local136 += local106;
				local118 += local106;
				local11++;
			}
			local81 += -local124;
			local72 += -local142;
			local142 -= local102;
			local124 -= local102;
			local13--;
			@Pc(336) int local336 = arg0 - local13;
			@Pc(340) int local340 = local13 + arg0;
			@Pc(344) int local344 = local11 + arg4;
			@Pc(349) int local349 = arg4 - local11;
			if (local203) {
				@Pc(374) int local374 = arg4 + local15;
				@Pc(379) int local379 = arg4 - local15;
				Static247.method3552(arg1, local349, Static332.anIntArrayArray56[local336], local379);
				Static247.method3552(arg3, local379, Static332.anIntArrayArray56[local336], local374);
				Static247.method3552(arg1, local374, Static332.anIntArrayArray56[local336], local344);
				Static247.method3552(arg1, local349, Static332.anIntArrayArray56[local340], local379);
				Static247.method3552(arg3, local379, Static332.anIntArrayArray56[local340], local374);
				Static247.method3552(arg1, local374, Static332.anIntArrayArray56[local340], local344);
			} else {
				Static247.method3552(arg1, local349, Static332.anIntArrayArray56[local336], local344);
				Static247.method3552(arg1, local349, Static332.anIntArrayArray56[local340], local344);
			}
		}
	}
}
