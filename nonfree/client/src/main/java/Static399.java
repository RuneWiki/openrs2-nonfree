import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
	public static int anInt6635;

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_54 = new Class102(64);

	@OriginalMember(owner = "client!tv", name = "Q", descriptor = "Z")
	public static boolean aBoolean731 = false;

	@OriginalMember(owner = "client!tv", name = "S", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_235 = new Class103(10, -1);

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
	public static void method5198() {
		if (Static185.aClass34_7 == null) {
			return;
		}
		Static252.aClass262_10.method5812();
		Static105.method1619();
		Static72.method1154();
		Static238.method3446();
		Static334.method4494();
		Static217.method3181();
		if (Static187.aClass5_1 != null) {
			Static187.aClass5_1.method52();
		}
		Static43.method596();
		Static417.method5509();
		Static286.method3944();
		Static301.method4121(false);
		Static4.method53();
		for (@Pc(40) int local40 = 0; local40 < 2048; local40++) {
			@Pc(46) Class25_Sub5_Sub1_Sub2 local46 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local40];
			if (local46 != null) {
				local46.aClass1_Sub17_3 = null;
				for (@Pc(53) int local53 = 0; local53 < local46.aClass57Array3.length; local53++) {
					local46.aClass57Array3[local53] = null;
				}
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static87.aClass25_Sub5_Sub1_Sub1Array6.length; local76++) {
			@Pc(82) Class25_Sub5_Sub1_Sub1 local82 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local76];
			if (local82 != null) {
				for (@Pc(86) int local86 = 0; local86 < local82.aClass57Array3.length; local86++) {
					local82.aClass57Array3[local86] = null;
				}
			}
		}
		Static148.aClass32_6 = null;
		Static281.aClass32_4 = null;
		Static185.aClass34_7.method5782();
		Static185.aClass34_7 = null;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!l;ILclient!za;)V")
	public static void method5199(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) Class34 arg1) {
		if (Static167.aClass1_Sub5_Sub18_2 == null) {
			return;
		}
		if (Static442.anInt7365 < 10) {
			if (!Static167.aClass82_32.method1844(Static167.aClass1_Sub5_Sub18_2.aString70)) {
				Static442.anInt7365 = Static160.aClass82_43.method1841(Static167.aClass1_Sub5_Sub18_2.aString70) / 10;
				return;
			}
			Static208.method2936();
			Static442.anInt7365 = 10;
		}
		if (Static442.anInt7365 == 10) {
			Static167.anInt2089 = Static167.aClass1_Sub5_Sub18_2.anInt6649 >> 6 << 6;
			Static167.anInt2099 = Static167.aClass1_Sub5_Sub18_2.anInt6642 >> 6 << 6;
			Static167.anInt2093 = (Static167.aClass1_Sub5_Sub18_2.anInt6648 >> 6 << 6) + 64 - Static167.anInt2089;
			Static167.anInt2094 = (Static167.aClass1_Sub5_Sub18_2.anInt6647 >> 6 << 6) + 64 - Static167.anInt2099;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static167.aClass1_Sub5_Sub18_2.method5197(Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94, Static164.anInt2731 + (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7), local75, (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7) + Static199.anInt3480)) {
				local79 = local75[2] - Static167.anInt2099;
				local77 = local75[1] - Static167.anInt2089;
			}
			if (!Static369.aBoolean698 && local77 >= 0 && local77 < Static167.anInt2093 && local79 >= 0 && Static167.anInt2094 > local79) {
				local79 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static441.anInt7355 = local77;
				Static169.anInt2773 = local79;
			} else if (Static125.anInt2320 == -1 || Static173.anInt2817 == -1) {
				Static167.aClass1_Sub5_Sub18_2.method5206(Static167.aClass1_Sub5_Sub18_2.anInt6646 & 0x3FFF, Static167.aClass1_Sub5_Sub18_2.anInt6646 >> 14 & 0x3FFF, local75);
				Static441.anInt7355 = local75[1] - Static167.anInt2089;
				Static169.anInt2773 = local75[2] - Static167.anInt2099;
			} else {
				Static167.aClass1_Sub5_Sub18_2.method5206(Static173.anInt2817, Static125.anInt2320, local75);
				Static369.aBoolean698 = false;
				Static173.anInt2817 = -1;
				Static125.anInt2320 = -1;
				if (local75 != null) {
					Static441.anInt7355 = local75[1] - Static167.anInt2089;
					Static169.anInt2773 = local75[2] - Static167.anInt2099;
				}
			}
			if (Static167.aClass1_Sub5_Sub18_2.anInt6641 == 37) {
				Static167.aFloat24 = 3.0F;
				Static167.aFloat23 = 3.0F;
			} else if (Static167.aClass1_Sub5_Sub18_2.anInt6641 == 50) {
				Static167.aFloat24 = 4.0F;
				Static167.aFloat23 = 4.0F;
			} else if (Static167.aClass1_Sub5_Sub18_2.anInt6641 == 75) {
				Static167.aFloat24 = 6.0F;
				Static167.aFloat23 = 6.0F;
			} else if (Static167.aClass1_Sub5_Sub18_2.anInt6641 == 100) {
				Static167.aFloat24 = 8.0F;
				Static167.aFloat23 = 8.0F;
			} else if (Static167.aClass1_Sub5_Sub18_2.anInt6641 == 200) {
				Static167.aFloat24 = 16.0F;
				Static167.aFloat23 = 16.0F;
			} else {
				Static167.aFloat24 = 8.0F;
				Static167.aFloat23 = 8.0F;
			}
			Static167.anInt2086 = (int) Static167.aFloat24 >> 1;
			Static167.aByteArrayArrayArray6 = Static305.method4181(Static167.anInt2086);
			Static65.method1075();
			Static167.method1770();
			Static103.aClass227_8 = new Class227();
			Static167.anInt2085 += (int) (Math.random() * 5.0D) - 2;
			if (Static167.anInt2085 < -8) {
				Static167.anInt2085 = -8;
			}
			Static167.anInt2087 += (int) (Math.random() * 5.0D) - 2;
			if (Static167.anInt2085 > 8) {
				Static167.anInt2085 = 8;
			}
			if (Static167.anInt2087 < -16) {
				Static167.anInt2087 = -16;
			}
			if (Static167.anInt2087 > 16) {
				Static167.anInt2087 = 16;
			}
			Static167.method1768(arg0, Static167.anInt2085 >> 2 << 10, Static167.anInt2087 >> 1);
			Static167.aClass178_2.method3967(256, 1024);
			Static167.aClass263_2.method5829(256, 256);
			Static167.aClass75_3.method1614(4096);
			Static82.aClass105_4.method2288(256);
			Static442.anInt7365 = 20;
		} else if (Static442.anInt7365 == 20) {
			Static105.method1613(true);
			Static167.method1757(arg1, Static167.anInt2085, Static167.anInt2087);
			Static442.anInt7365 = 60;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 60) {
			if (Static167.aClass82_32.method1843(Static167.aClass1_Sub5_Sub18_2.aString70 + "_staticelements")) {
				if (!Static167.aClass82_32.method1844(Static167.aClass1_Sub5_Sub18_2.aString70 + "_staticelements")) {
					return;
				}
				Static167.aClass100_3 = Static368.method4883(Static167.aClass82_32, Static337.aBoolean654, Static167.aClass1_Sub5_Sub18_2.aString70 + "_staticelements");
			} else {
				Static167.aClass100_3 = new Class100(0);
			}
			Static167.method1765();
			Static442.anInt7365 = 70;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 70) {
			Static380.aClass88_8 = new Class88(arg1, 11, true, Static392.aCanvas5);
			Static442.anInt7365 = 73;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 73) {
			Static151.aClass88_3 = new Class88(arg1, 12, true, Static392.aCanvas5);
			Static442.anInt7365 = 76;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 76) {
			Static199.aClass88_4 = new Class88(arg1, 14, true, Static392.aCanvas5);
			Static442.anInt7365 = 79;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 79) {
			Static71.aClass88_2 = new Class88(arg1, 17, true, Static392.aCanvas5);
			Static442.anInt7365 = 82;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 82) {
			Static201.aClass88_5 = new Class88(arg1, 19, true, Static392.aCanvas5);
			Static442.anInt7365 = 85;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 85) {
			Static350.aClass88_7 = new Class88(arg1, 22, true, Static392.aCanvas5);
			Static442.anInt7365 = 88;
			Static105.method1613(true);
			Static376.method4979();
		} else if (Static442.anInt7365 == 88) {
			Static289.aClass88_6 = new Class88(arg1, 26, true, Static392.aCanvas5);
			Static442.anInt7365 = 91;
			Static105.method1613(true);
			Static376.method4979();
		} else {
			Static2.aClass88_1 = new Class88(arg1, 30, true, Static392.aCanvas5);
			Static442.anInt7365 = 100;
			Static105.method1613(true);
			Static376.method4979();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5202(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static440.method5809(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static107.anInt2042; local29++) {
			@Pc(35) String local35 = Static320.aStringArray44[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static440.method5809(local35);
			if (local35 != null && local35.equals(local20)) {
				Static107.anInt2042--;
				for (@Pc(59) int local59 = local29; local59 < Static107.anInt2042; local59++) {
					Static320.aStringArray44[local59] = Static320.aStringArray44[local59 + 1];
					Static355.aStringArray41[local59] = Static355.aStringArray41[local59 + 1];
					Static434.anIntArray492[local59] = Static434.anIntArray492[local59 + 1];
					Static3.aStringArray39[local59] = Static3.aStringArray39[local59 + 1];
					Static71.anIntArray63[local59] = Static71.anIntArray63[local59 + 1];
					Static64.aBooleanArray3[local59] = Static64.aBooleanArray3[local59 + 1];
				}
				Static183.anInt3199 = Static18.anInt379;
				Static52.method867(Static89.aClass103_75);
				Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(arg0));
				Static18.aClass1_Sub28_Sub1_1.method5364(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[BIII)V")
	public static void method5204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static90.method1429(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static90.method1429(arg3)) {
			@Pc(34) int local34 = Static397.method5187(arg1);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg3 <= arg0 ? arg3 : arg0;
			@Pc(47) int local47 = arg0 >> 1;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(53) byte[] local53 = arg2;
			@Pc(71) byte[] local71 = new byte[local34 * local51 * local47];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local36, arg4, arg0, arg3, 0, arg1, 5121, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(90) int local90 = local34 * arg0;
				@Pc(92) byte[] local92 = local71;
				for (@Pc(94) int local94 = 0; local94 < local34; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(105) int local105 = local94 + local90;
					for (@Pc(107) int local107 = 0; local107 < local51; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local47; local111++) {
							@Pc(117) byte local117 = local53[local100];
							local100 += local34;
							@Pc(127) int local127 = local117 + local53[local100];
							@Pc(133) int local133 = local127 + local53[local105];
							local100 += local34;
							local105 += local34;
							@Pc(147) int local147 = local133 + local53[local105];
							local71[local98] = (byte) (local147 >> 2);
							local105 += local34;
							local98 += local34;
						}
						local105 += local90;
						local100 += local90;
					}
				}
				local71 = local53;
				arg0 = local47;
				arg3 = local51;
				local53 = local92;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
