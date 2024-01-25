import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_194 = new Class34("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public static final int anInt6713 = 0;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
	public static int[] anIntArray531 = new int[2];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BILclient!nh;III)Ljava/awt/Frame;")
	public static Frame method5609(@OriginalArg(1) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method3895()) {
			return null;
		}
		@Pc(17) Class200[] local17 = Static177.method3701(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg2 == local17[local25].anInt6071 && arg3 == local17[local25].anInt6072 && (!local23 || local17[local25].anInt6074 > arg0)) {
				local23 = true;
				arg0 = local17[local25].anInt6074;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(90) Class162 local90 = arg1.method3903(arg3, arg2, arg0);
		while (local90.anInt4801 == 0) {
			Static190.method3690(10L);
		}
		@Pc(110) Frame local110 = (Frame) local90.anObject5;
		if (local110 == null) {
			return null;
		} else if (local90.anInt4801 == 2) {
			Static197.method3801(arg1, local110);
			return null;
		} else {
			return local110;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static77.aClass194ArrayArrayArray1 == null) {
			Static208.aClass32_11.method2191(-16777216, arg2, arg0, arg3, arg1);
			return;
		}
		Static247.anInt5067++;
		if (Static198.aClass17_Sub1_Sub1_Sub1_3 != null && Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 - (Static198.aClass17_Sub1_Sub1_Sub1_3.method4318() - 1) * 64 >> 7 == Static99.anInt2377 && Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 + 64 - Static198.aClass17_Sub1_Sub1_Sub1_3.method4318() * 64 >> 7 == Static266.anInt5402) {
			Static99.anInt2377 = -1;
			Static266.anInt5402 = -1;
			Static115.method2440();
		}
		Static140.method2824();
		if (!arg4) {
			Static324.method5278();
		}
		Static277.method4845();
		Static156.method3148(arg3, arg1, arg0, true, arg2);
		@Pc(73) int local73 = Static73.anInt1940;
		@Pc(75) int local75 = Static74.anInt1955;
		@Pc(77) int local77 = Static1.anInt49;
		@Pc(79) int local79 = Static157.anInt4882;
		@Pc(87) int local87;
		@Pc(120) int local120;
		if (Static147.anInt3204 == 1) {
			local87 = (int) Static36.aFloat5;
			if (Static241.anInt4974 >> 8 > local87) {
				local87 = Static241.anInt4974 >> 8;
			}
			if (Static72.aBooleanArray9[4] && local87 < Static187.anIntArray369[4] + 128) {
				local87 = Static187.anIntArray369[4] + 128;
			}
			local120 = Static36.anInt1199 + (int) Static75.aFloat13 & 0x3FFF;
			Static126.method2614(Static87.anInt2179, (local87 >> 3) * 3 + 600, Static94.method2022(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109, Static242.anInt6745) + -50, Static107.anInt2547, local120, local75, local87);
		} else if (Static147.anInt3204 == 4) {
			local87 = (int) Static36.aFloat5;
			if (Static241.anInt4974 >> 8 > local87) {
				local87 = Static241.anInt4974 >> 8;
			}
			if (Static72.aBooleanArray9[4] && Static187.anIntArray369[4] + 128 > local87) {
				local87 = Static187.anIntArray369[4] + 128;
			}
			local120 = (int) Static75.aFloat13 & 0x3FFF;
			Static126.method2614(Static87.anInt2179, (local87 >> 3) * 3 + 600, Static94.method2022(Static77.anInt2010, Static133.anInt2962, Static242.anInt6745) + -50, Static107.anInt2547, local120, local75, local87);
		} else if (Static147.anInt3204 == 5) {
			Static298.method4997(local75);
		}
		local87 = Static320.anInt5326;
		local120 = Static95.anInt2319;
		@Pc(225) int local225 = Static64.anInt1797;
		@Pc(227) int local227 = Static179.anInt3884;
		@Pc(229) int local229 = Static18.anInt555;
		@Pc(272) int local272;
		for (@Pc(231) int local231 = 0; local231 < 5; local231++) {
			if (Static72.aBooleanArray9[local231]) {
				local272 = (int) ((double) (Static330.anIntArray512[local231] * 2 + 1) * Math.random() - (double) Static330.anIntArray512[local231] + Math.sin((double) Static238.anIntArray442[local231] * ((double) Static26.anIntArray87[local231] / 100.0D)) * (double) Static187.anIntArray369[local231]);
				if (local231 == 1) {
					Static95.anInt2319 += local272;
				}
				if (local231 == 0) {
					Static320.anInt5326 += local272;
				}
				if (local231 == 2) {
					Static64.anInt1797 += local272;
				}
				if (local231 == 3) {
					Static18.anInt555 = local272 + Static18.anInt555 & 0x3FFF;
				}
				if (local231 == 4) {
					Static179.anInt3884 += local272;
					if (Static179.anInt3884 < 1024) {
						Static179.anInt3884 = 1024;
					} else if (Static179.anInt3884 > 3072) {
						Static179.anInt3884 = 3072;
					}
				}
			}
		}
		if (Static320.anInt5326 < 0) {
			Static320.anInt5326 = 0;
		}
		if ((Static242.anInt6744 << 7) - 1 < Static320.anInt5326) {
			Static320.anInt5326 = (Static242.anInt6744 << 7) - 1;
		}
		if (Static64.anInt1797 < 0) {
			Static64.anInt1797 = 0;
		}
		if ((Static315.anInt6124 << 7) - 1 < Static64.anInt1797) {
			Static64.anInt1797 = (Static315.anInt6124 << 7) - 1;
		}
		Static236.method2130();
		Static280.method4877();
		Static208.aClass32_11.method2226(local79, local73, local79 + local77, local73 - -local75);
		Static208.aClass32_11.method2177();
		local272 = Static157.anInt4858;
		if (Static127.aClass212_1 == null) {
			Static208.aClass32_11.method2180(local272);
		} else {
			Static127.aClass212_1.method5469(local79, Static179.anInt3884, local272, local77, local75, Static208.aClass32_11, Static18.anInt555, local73, Static176.anInt3801 << 3);
		}
		Static63.method4863();
		Static265.aClass109_33.method3865(Static320.anInt5326, Static95.anInt2319, Static64.anInt1797, -Static179.anInt3884 & 0x3FFF, -Static18.anInt555 & 0x3FFF, -Static121.anInt2762 & 0x3FFF);
		Static208.aClass32_11.method2201(Static265.aClass109_33);
		Static208.aClass32_11.method2242(local77 / 2 + local79, local75 / 2 + local73, Static340.anInt6545 << 1, Static340.anInt6545 << 1);
		Static118.method2496(local75 / 2 + local73, local77 / 2 + local79, Static340.anInt6545 << 1, Static340.anInt6545 << 1);
		Static163.method3264(Static320.anInt5326, -Static18.anInt555 & 0x3FFF, Static64.anInt1797, -Static121.anInt2762 & 0x3FFF, Static95.anInt2319, -Static179.anInt3884 & 0x3FFF);
		@Pc(494) byte local494 = Static357.method3877() == 2 ? (byte) Static247.anInt5067 : 1;
		Static140.method2825(Static208.aClass32_11, Static5.anInt208, Static131.anInt3019, Static265.aClass109_33, Static320.anInt5326, Static95.anInt2319, Static64.anInt1797, Static304.aByteArrayArrayArray10, Static137.anIntArray266, Static96.anIntArray504, Static173.anIntArray346, Static185.anIntArray364, anIntArray531, Static242.anInt6745 + 1, local494, Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7, Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7, !Static111.aBoolean254);
		Static63.method4863();
		if (Static295.anInt5811 == 30) {
			Static182.method3601(local75, local79, local73, local77);
			Static136.method2778(local75, local79, local73, local77);
			Static168.method3376(local73, local77, local79, local75);
			Static271.method4749(local75, local79, local77, local73);
		}
		Static169.method3382();
		Static64.anInt1797 = local225;
		Static179.anInt3884 = local227;
		Static18.anInt555 = local229;
		Static95.anInt2319 = local120;
		Static320.anInt5326 = local87;
		if (Static190.aBoolean378 && Static283.aClass186_3.method4897() == 0) {
			Static190.aBoolean378 = false;
		}
		if (Static190.aBoolean378) {
			Static208.aClass32_11.method2191(-16777216, local79, local77, local73, local75);
			Static176.method3473(Static46.aClass34_34.method1285(Static259.anInt2907), false, Static212.aClass9_3);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method5611() {
		if (Static207.anInt4332 != 3) {
			Static292.anInt4638 = -1;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Lclient!qc;")
	public static Class17_Sub4 method5612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass17_Sub4_1;
	}
}
