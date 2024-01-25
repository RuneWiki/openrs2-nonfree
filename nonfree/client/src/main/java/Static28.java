import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public static int anInt6554 = 0;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "[Lclient!hs;")
	public static final Class7_Sub1[] aClass7_Sub1Array6 = new Class7_Sub1[29];

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_241 = new Class198(5);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class117 local13 = local7.aClass117_2; local13 != null; local13 = local13.aClass117_1) {
			@Pc(17) Class8_Sub1 local17 = local13.aClass8_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort98 == arg1 && local17.aShort97 == arg2) {
				Static223.method4030(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method5500(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static121.aString54 = arg2;
		Static193.anInt4281 = arg0;
		Static31.aString13 = arg1;
		if (Static121.aString54.equals("") || Static31.aString13.equals("")) {
			Static42.anInt1131 = 3;
		} else if (Static215.anInt4413 == -1) {
			Static272.anInt5418 = 0;
			Static237.anInt6658 = 1;
			Static42.anInt1131 = -3;
			Static191.anInt4006 = 0;
			@Pc(40) Class4_Sub11 local40 = new Class4_Sub11(128);
			local40.method3434(10);
			local40.method3452((int) (Math.random() * 9.9999999E7D));
			local40.method3435(Static15.method863(Static121.aString54));
			local40.method3452((int) (Math.random() * 9.9999999E7D));
			local40.method3410(Static31.aString13);
			local40.method3452((int) (Math.random() * 9.9999999E7D));
			local40.method3436(Static251.aBigInteger1, Static316.aBigInteger2);
			Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
			Static15.aClass4_Sub11_Sub1_2.method3434(24);
			Static15.aClass4_Sub11_Sub1_2.method3434(local40.anInt3768 + 2);
			Static15.aClass4_Sub11_Sub1_2.method3402(566);
			Static15.aClass4_Sub11_Sub1_2.method3424(local40.anInt3768, local40.aByteArray55);
		} else {
			Static146.method2548();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
	public static int method5505(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 - 1;
		@Pc(15) int local15 = local5 | local5 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5507(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static80.anInt2116 == 0 && Static23.anInt452 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static274.aBoolean398 = true;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static274.aBoolean398 = false;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static169.anInt3605 = 0;
				Static25.anInt501 = 0;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static283.aClass32_10.method851();
			}
			@Pc(58) int local58;
			@Pc(67) Runtime local67;
			@Pc(77) int local77;
			if (arg0.equalsIgnoreCase("gc")) {
				Static166.method3251();
				for (local58 = 0; local58 < 10; local58++) {
					System.gc();
				}
				local67 = Runtime.getRuntime();
				local77 = (int) ((local67.totalMemory() - local67.freeMemory()) / 1024L);
				Static224.method4040("mem=" + local77 + "k");
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static166.method3251();
				for (local58 = 0; local58 < 10; local58++) {
					System.gc();
				}
				local67 = Runtime.getRuntime();
				local77 = (int) ((local67.totalMemory() - local67.freeMemory()) / 1024L);
				Static224.method4040("Memory before cleanup=" + local77 + "k");
				Static169.method3267();
				Static166.method3251();
				for (@Pc(132) int local132 = 0; local132 < 10; local132++) {
					System.gc();
				}
				local77 = (int) ((local67.totalMemory() - local67.freeMemory()) / 1024L);
				Static224.method4040("Memory after cleanup=" + local77 + "k");
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static224.method4040("Number of player models in cache:" + Static44.method884());
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				if (Static139.anInt3199 == 30) {
					Static291.method4882();
				} else if (Static139.anInt3199 == 25) {
					Static357.aBoolean490 = true;
				}
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static147.aClass13_3.method298();
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static147.aClass13_3.method297();
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static1.aClass134_7.method3746();
				Static155.aClass114_3.method3171();
				Static147.aClass13_3.method302();
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static226.method4048();
				Static294.method4911();
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static195.method3698(-1, 1, false, -1);
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static195.method3698(-1, 2, false, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static195.method3698(768, 3, false, 1024);
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static106.method2349(0);
				Static233.anInt4697 = 0;
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static106.method2349(1);
				Static233.anInt4697 = 1;
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static106.method2349(2);
				Static233.anInt4697 = 2;
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static106.method2349(3);
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static51.aBoolean102 = !Static51.aBoolean102;
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
				Static226.method4048();
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static209.aBoolean333 = !Static209.aBoolean333;
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
				Static226.method4048();
			}
			if (arg0.startsWith("shadows ")) {
				Static9.anInt216 = Static246.method4383(arg0.substring(8));
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
				Static226.method4048();
			}
			if (arg0.startsWith("setba")) {
				Static159.anInt3440 = Static246.method4383(arg0.substring(6));
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
			}
			if (arg0.startsWith("setparticles")) {
				Static99.method2239(Static246.method4383(arg0.substring(13)));
				Static222.method4006(Static1.aClass134_7);
				Static313.aBoolean449 = false;
			}
			if (arg0.startsWith("fps ") && Static80.anInt2116 != 0) {
				Static97.method2225(Static246.method4383(arg0.substring(4)));
			}
			if (arg0.startsWith("rect_debug")) {
				Static30.anInt769 = Static246.method4383(arg0.substring(10).trim());
				Static224.method4040("rect_debug=" + Static30.anInt769);
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static189.aBoolean306 = true;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static151.aBoolean249 = !Static151.aBoolean249;
				Static224.method4040("clipcomponents=" + Static151.aBoolean249);
			}
			if (arg0.startsWith("bloom")) {
				@Pc(458) boolean local458 = Static274.aClass47_9.method2757();
				if (!Static31.method553(!local458)) {
					Static224.method4040("Failed to enable bloom");
				} else if (local458) {
					Static224.method4040("Bloom disabled");
				} else {
					Static224.method4040("Bloom enabled");
				}
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static246.aBoolean378) {
					Static246.aBoolean378 = false;
					Static224.method4040("Forced tweening disabled.");
				} else {
					Static246.aBoolean378 = true;
					Static224.method4040("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static73.aBoolean139) {
					Static224.method4040("Shift-click disabled.");
					Static73.aBoolean139 = false;
				} else {
					Static224.method4040("Shift-click ENABLED!");
					Static73.aBoolean139 = true;
				}
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static224.method4040("x:" + (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7) + " z:" + (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7));
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static224.method4040("Height: " + Static261.aClass60Array2[Static12.anInt267].method2264(Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7));
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static316.aClass193_99.method5063();
				Static316.aClass193_99.method5062();
				Static135.method2882();
				Static294.method4911();
			}
			if (arg0.startsWith("mc")) {
				if (Static274.aClass47_9.method2680()) {
					local58 = Integer.parseInt(arg0.substring(3));
					if (local58 < 1) {
						local58 = 1;
					} else if (local58 > 4) {
						local58 = 4;
					}
					Static142.anInt3231 = local58;
					Static274.aClass47_9.method2738(Static142.anInt3231);
					Static274.aClass47_9.method2744(0);
					Static224.method4040("Render cores now: " + Static142.anInt3231);
				} else {
					Static224.method4040("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg0.startsWith("cachespace")) {
				Static224.method4040("I(s): " + Static22.aClass198_18.method5211() + "/" + Static22.aClass198_18.method5208());
				Static224.method4040("I(m): " + Static242.aClass198_223.method5211() + "/" + Static242.aClass198_223.method5208());
				Static224.method4040("O(s): " + Static160.aClass103_1.method2967() + "/" + Static160.aClass103_1.method2964());
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static224.method4040("Pos: " + Static12.anInt267 + "," + ((Static240.anInt4829 >> 7) + Static286.anInt6699 >> 6) + "," + ((Static129.anInt3039 >> 7) + Static136.anInt3193 >> 6) + "," + ((Static240.anInt4829 >> 7) + Static286.anInt6699 & 0x3F) + "," + (Static136.anInt3193 + (Static129.anInt3039 >> 7) & 0x3F) + " Height: " + (Static81.method2010(Static12.anInt267, Static129.anInt3039, Static240.anInt4829) - Static112.anInt2705));
				Static224.method4040("Look: " + Static12.anInt267 + "," + (Static286.anInt6699 + Static63.anInt1629 >> 6) + "," + (Static124.anInt2958 + Static136.anInt3193 >> 6) + "," + (Static63.anInt1629 + Static286.anInt6699 & 0x3F) + "," + (Static136.anInt3193 + Static124.anInt2958 & 0x3F) + " Height: " + (Static81.method2010(Static12.anInt267, Static124.anInt2958, Static63.anInt1629) - Static149.anInt3929));
			}
			if (arg0.equals("showocc")) {
				Static239.aBoolean362 = !Static239.aBoolean362;
				Static226.method4048();
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static157.aBoolean269 = !Static157.aBoolean269;
				Static274.aClass47_9.method2725(Static157.aBoolean269);
				Static167.method3259();
			}
			if (arg0.equals("nonpcs")) {
				Static83.aBoolean170 = !Static83.aBoolean170;
			}
			if (arg0.equals("autoworld")) {
				Static240.method4264();
			}
			if (arg0.equals("heap")) {
				Static224.method4040("Heap: " + Static286.anInt6700 + "MB");
			}
			if (arg0.equals("savevarcs")) {
				Static149.method3565();
			}
			if (arg0.equals("scramblevarcs")) {
				for (local58 = 0; local58 < Static118.anIntArray244.length; local58++) {
					if (Static169.aBooleanArray18[local58]) {
						Static118.anIntArray244[local58] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static118.anIntArray244[local58] *= -1;
						}
					}
				}
				Static149.method3565();
			}
			if (arg0.equals("showcolmap")) {
				Static225.aBoolean352 = true;
				Static294.method4911();
			}
			if (arg0.equals("hidecolmap")) {
				Static225.aBoolean352 = false;
				Static294.method4911();
			}
			if (arg0.equals("resetcache")) {
				Static33.method566();
			}
			if (arg0.equals("profilecpu")) {
				Static224.method4040(Static349.method5544() + "ms");
			}
			if (arg0.startsWith("cpuusage")) {
				local58 = Integer.parseInt(arg0.substring(9));
				if (local58 >= 0 && local58 <= 4) {
					Static348.anInt6588 = local58;
				}
			}
			if (Static139.anInt3199 == 30) {
				Static15.aClass4_Sub11_Sub1_2.method706(9);
				Static15.aClass4_Sub11_Sub1_2.method3434(arg0.length() + 2);
				Static15.aClass4_Sub11_Sub1_2.method3434(arg1 ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
			}
		} catch (@Pc(1000) Exception local1000) {
			Static224.method4040("Whoops, something went wrong.");
		}
	}
}
