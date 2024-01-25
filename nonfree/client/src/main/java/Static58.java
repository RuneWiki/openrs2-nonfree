import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
	public static int anInt1264 = 0;

	@OriginalMember(owner = "client!cca", name = "y", descriptor = "I")
	public static int anInt1270 = -1;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!rn;)I")
	public static int method1196(@OriginalArg(1) Class3_Sub43 arg0) {
		@Pc(7) String local7 = Static143.method2767(arg0);
		@Pc(9) int[] local9 = null;
		if (Static354.method5255(arg0.anInt7753)) {
			local9 = Static6.aClass92_1.method2673((int) arg0.aLong221).anIntArray291;
		} else if (arg0.anInt7751 != -1) {
			local9 = Static6.aClass92_1.method2673(arg0.anInt7751).anIntArray291;
		} else if (Static246.method3794(arg0.anInt7753)) {
			@Pc(41) Class3_Sub34 local41 = (Class3_Sub34) Static213.aClass354_37.method7689((long) arg0.aLong221);
			if (local41 != null) {
				@Pc(46) Class41_Sub2_Sub1_Sub4_Sub1 local46 = local41.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				@Pc(49) Class264 local49 = local46.aClass264_1;
				if (local49.anIntArray443 != null) {
					local49 = local49.method5994(Static491.aClass318_1);
				}
				if (local49 != null) {
					local9 = local49.anIntArray444;
				}
			}
		} else if (Static440.method6182(arg0.anInt7753)) {
			@Pc(81) Class280 local81;
			if (arg0.anInt7753 == 1011) {
				local81 = Static478.aClass212_3.method4793((int) arg0.aLong221);
			} else {
				local81 = Static478.aClass212_3.method4793((int) (arg0.aLong221 >>> 32 & 0x7FFFFFFFL));
			}
			if (local81.anIntArray457 != null) {
				local81 = local81.method6181(Static491.aClass318_1);
			}
			if (local81 != null) {
				local9 = local81.anIntArray459;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static94.method1753(local9);
		}
		@Pc(144) int local144 = Static75.aClass134_7.method3347(local7, Static348.aClass14Array12);
		if (arg0.aBoolean607) {
			local144 += Static362.aClass14_18.E() + 4;
		}
		return local144;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
	public static void method1200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(13, arg0);
		local8.method7326();
		local8.anInt8802 = arg1;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method1201(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static68.aClass34Array1 != Static426.aClass34Array5) {
			@Pc(12) int local12 = Static108.aClass34Array6[arg1].method6530(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class34 local19 = Static108.aClass34Array6[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method6530(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method6534(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.E(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIBII)V")
	public static void method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static469.anInt4270 <= arg1 - arg0 && Static325.anInt5516 >= arg0 + arg1 && arg2 - arg0 >= Static395.anInt6904 && Static561.anInt2703 >= arg0 + arg2) {
			Static57.method1009(arg2, arg0, arg5, arg3, arg1, arg4);
		} else {
			Static472.method6505(arg0, arg1, arg5, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I[BZIIILclient!vj;I)Lclient!br;")
	public static Class24_Sub1_Sub1 method1203(@OriginalArg(1) byte[] arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class45_Sub3 arg3) {
		if (arg3.aBoolean707 || Static259.method3984(arg1) && Static259.method3984(arg2)) {
			return new Class24_Sub1_Sub1(arg3, 3553, 6406, arg1, arg2, false, arg0, 6406);
		} else if (arg3.aBoolean698) {
			return new Class24_Sub1_Sub1(arg3, 34037, 6406, arg1, arg2, false, arg0, 6406);
		} else {
			return new Class24_Sub1_Sub1(arg3, 6406, arg1, arg2, Static371.method5424(arg1), Static371.method5424(arg2), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(B)V")
	public static void method1204() {
		Static235.aClass322_82.anInt8219 = 1;
		Static180.method3113();
		Static301.aBoolean389 = true;
		Static95.aBoolean162 = true;
		Static503.method6789();
		for (@Pc(7442) int local7442 = 0; local7442 < Static283.aClass205Array1.length; local7442++) {
			Static283.aClass205Array1[local7442] = null;
		}
		Static369.aBoolean463 = false;
		Static153.method2892();
		Static51.anInt993 = (int) (Math.random() * 100.0D) - 50;
		Static43.aFloat20 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static244.anInt4328 = (int) (Math.random() * 120.0D) - 60;
		Static159.anInt3275 = (int) (Math.random() * 110.0D) - 55;
		Static36.anInt654 = (int) (Math.random() * 80.0D) - 40;
		Static41.anInt765 = (int) (Math.random() * 30.0D) - 20;
		Static395.method5772();
		for (@Pc(7516) int local7516 = 0; local7516 < 2048; local7516++) {
			Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local7516] = null;
		}
		Static137.anInt2977 = 0;
		Static88.anInt1884 = 0;
		Static213.aClass354_37.method7687();
		Static103.aClass112_16.method3092();
		Static432.aClass112_51.method3092();
		Static82.aClass178_21.method4162();
		Static211.aClass354_17.method7687();
		Static469.aClass112_27 = new Class112();
		Static491.aClass318_1.method6744();
		Static188.method6381();
		Static515.anInt3055 = 0;
		Static379.anInt6484 = 0;
		Static92.anInt1927 = 0;
		Static562.anInt9174 = 0;
		Static399.anInt6956 = 0;
		Static254.anInt4507 = 0;
		Static413.anInt7051 = 0;
		Static351.anInt6111 = 0;
		Static477.anInt7888 = 0;
		Static257.anInt4538 = 0;
		for (@Pc(7584) int local7584 = 0; local7584 < Static468.anIntArray497.length; local7584++) {
			if (!Static351.aBooleanArray21[local7584]) {
				Static468.anIntArray497[local7584] = -1;
			}
		}
		if (Static353.anInt6188 != -1) {
			Static153.method2893(Static353.anInt6188);
		}
		for (@Pc(7614) Class3_Sub49 local7614 = (Class3_Sub49) Static216.aClass354_18.method7694(); local7614 != null; local7614 = (Class3_Sub49) Static216.aClass354_18.method7692()) {
			if (!local7614.method7828()) {
				local7614 = (Class3_Sub49) Static216.aClass354_18.method7694();
				if (local7614 == null) {
					break;
				}
			}
			Static250.method3868(local7614, false, true);
		}
		Static353.anInt6188 = -1;
		Static216.aClass354_18 = new Class354(8);
		Static333.method4752();
		Static19.aClass361_1 = null;
		for (@Pc(7656) int local7656 = 0; local7656 < 8; local7656++) {
			Static478.aStringArray32[local7656] = null;
			Static32.aBooleanArray1[local7656] = false;
			Static413.anIntArray439[local7656] = -1;
		}
		Static548.method7289();
		Static472.aBoolean613 = true;
		for (@Pc(7682) int local7682 = 0; local7682 < 100; local7682++) {
			Static319.aBooleanArray17[local7682] = true;
		}
		for (@Pc(7694) int local7694 = 0; local7694 < 6; local7694++) {
			Static450.aClass211Array20[local7694] = new Class211();
		}
		for (@Pc(7710) int local7710 = 0; local7710 < 25; local7710++) {
			Static135.anIntArray134[local7710] = 0;
			Static320.anIntArray308[local7710] = 0;
			Static143.anIntArray141[local7710] = 0;
		}
		Static428.method6060();
		Static115.aBoolean505 = true;
		Static242.aShortArray66 = Static553.aShortArray131 = Static487.aShortArray133 = Static45.aShortArray10 = new short[256];
		Static355.aString44 = Static544.aClass343_30.method7222(Static256.anInt4535);
		Static405.aClass3_Sub3_Sub1_1.aBoolean597 = false;
		Static106.anInt2143 = 0;
		Static405.aClass3_Sub3_Sub1_1.aBoolean598 = false;
		Static426.method6039();
		Static52.method830();
		Static81.aClass3_Sub38_1 = null;
		Static235.aClass322_82.anInt8219 = 2;
		Static330.aLong152 = 0L;
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)V")
	public static void method1205() {
		if (Static32.anInt602 == 7) {
			Static326.method4711(false);
		} else {
			Static225.aClass165_1 = Static324.aClass165_2;
			Static324.aClass165_2 = null;
			Static25.method439(13);
		}
	}
}
