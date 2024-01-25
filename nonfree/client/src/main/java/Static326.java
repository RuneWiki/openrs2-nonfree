import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!uu;")
	public static Class250 aClass250_81;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
	public static int anInt5457;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "Lclient!aa;")
	public static Class2 aClass2_12;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Lclient!ip;")
	public static final Class111 aClass111_8 = new Class111("", 10);

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[Lclient!vr;")
	public static final Class261[] aClass261Array2 = new Class261[14];

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
	public static int anInt5454 = 1;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
	public static int anInt5455 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIBZI)V")
	public static void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static389.aClass227ArrayArrayArray3 == null) {
			Static413.aClass167_11.method5951(arg0, arg2, -16777216, arg1, arg4);
		} else if (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >= 0 && Static373.anInt6324 * 128 > Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 && Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >= 0 && Static291.anInt5062 * 128 > Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557) {
			Static463.anInt7797++;
			if (Static203.aClass1_Sub2_Sub6_Sub2_1 != null && Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 - (Static203.aClass1_Sub2_Sub6_Sub2_1.method6204() - 1) * 64 >> 7 == Static31.anInt592 && Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 - (Static203.aClass1_Sub2_Sub6_Sub2_1.method6204() - 1) * 64 >> 7 == Static392.anInt6568) {
				Static392.anInt6568 = -1;
				Static31.anInt592 = -1;
				Static336.method4668();
			}
			Static208.method3157();
			if (!arg3) {
				Static331.method5956();
			}
			Static438.method2066();
			Static296.method4220(arg4, arg2, arg1, arg0, true);
			@Pc(116) int local116 = Static72.anInt1324;
			@Pc(118) int local118 = Static388.anInt6529;
			@Pc(120) int local120 = Static365.anInt6193;
			@Pc(122) int local122 = Static360.anInt6141;
			@Pc(130) int local130;
			@Pc(168) int local168;
			if (Static27.anInt490 == 1) {
				local130 = (int) Static275.aFloat61;
				if (local130 < Static286.anInt2876 >> 8) {
					local130 = Static286.anInt2876 >> 8;
				}
				if (Static408.aBooleanArray26[4] && Static342.anIntArray353[4] + 128 > local130) {
					local130 = Static342.anIntArray353[4] + 128;
				}
				local168 = (int) Static19.aFloat6 + Static310.anInt5306 & 0x3FFF;
				Static166.method2551(local130, (local130 >> 3) * 3 + 600 << 0, Static32.anInt603, local168, Static181.method4212(Static276.anInt4606, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560) - 50, Static43.anInt5650, local122);
			} else if (Static27.anInt490 == 4) {
				local130 = (int) Static275.aFloat61;
				if (local130 < Static286.anInt2876 >> 8) {
					local130 = Static286.anInt2876 >> 8;
				}
				if (Static408.aBooleanArray26[4] && Static342.anIntArray353[4] + 128 > local130) {
					local130 = Static342.anIntArray353[4] + 128;
				}
				local168 = (int) Static19.aFloat6 & 0x3FFF;
				Static166.method2551(local130, (local130 >> 3) * 3 + 600 << 0, Static32.anInt603, local168, Static181.method4212(Static276.anInt4606, Static180.anInt3334, Static370.anInt6269) - 50, Static43.anInt5650, local122);
			} else if (Static27.anInt490 == 5) {
				Static329.method4565(local122);
			}
			local130 = Static266.anInt4433;
			local168 = Static410.anInt6946;
			@Pc(277) int local277 = Static152.anInt7561;
			@Pc(279) int local279 = Static419.anInt7092;
			@Pc(281) int local281 = Static372.anInt6317;
			@Pc(324) int local324;
			for (@Pc(283) int local283 = 0; local283 < 5; local283++) {
				if (Static408.aBooleanArray26[local283]) {
					local324 = (int) (Math.random() * (double) (Static392.anIntArray403[local283] * 2 + 1) - (double) Static392.anIntArray403[local283] + Math.sin((double) Static179.anIntArray196[local283] * ((double) Static197.anIntArray223[local283] / 100.0D)) * (double) Static342.anIntArray353[local283]);
					if (local283 == 0) {
						Static266.anInt4433 += local324;
					}
					if (local283 == 1) {
						Static410.anInt6946 += local324;
					}
					if (local283 == 3) {
						Static372.anInt6317 = Static372.anInt6317 + local324 & 0x3FFF;
					}
					if (local283 == 2) {
						Static152.anInt7561 += local324;
					}
					if (local283 == 4) {
						Static419.anInt7092 += local324;
						if (Static419.anInt7092 < 1024) {
							Static419.anInt7092 = 1024;
						} else if (Static419.anInt7092 > 3072) {
							Static419.anInt7092 = 3072;
						}
					}
				}
			}
			if (Static266.anInt4433 < 0) {
				Static266.anInt4433 = 0;
			}
			if ((Static459.anInt5916 << 7) - 1 < Static266.anInt4433) {
				Static266.anInt4433 = (Static459.anInt5916 << 7) - 1;
			}
			if (Static152.anInt7561 < 0) {
				Static152.anInt7561 = 0;
			}
			if (Static152.anInt7561 > (Static342.anInt5746 << 7) - 1) {
				Static152.anInt7561 = (Static342.anInt5746 << 7) - 1;
			}
			Static151.method2346();
			Static52.method983();
			Static413.aClass167_11.w(local120, local118, local120 + local116, local118 - -local122);
			Static413.aClass167_11.method6005();
			local324 = Static66.anInt1271;
			if (Static460.aClass64_1 == null) {
				Static413.aClass167_11.l(local324);
			} else {
				Static460.aClass64_1.method1676(Static413.aClass167_11, Static138.anInt2445 << 3, local116, Static419.anInt7092, local120, local118, Static372.anInt6317, local324, local122);
			}
			Static44.method856();
			Static359.aClass11_5.IA(Static266.anInt4433, Static410.anInt6946, Static152.anInt7561, -Static419.anInt7092 & 0x3FFF, -Static372.anInt6317 & 0x3FFF, -Static205.anInt5939 & 0x3FFF);
			Static413.aClass167_11.method6012(Static359.aClass11_5);
			Static413.aClass167_11.b(local120 + local116 / 2, local122 / 2 + local118, Static54.anInt1061 << 1, Static54.anInt1061 << 1);
			Static96.method1666(Static54.anInt1061 << 1, Static54.anInt1061 << 1, local116 / 2 + local120, local122 / 2 + local118);
			Static227.method3264(Static410.anInt6946, Static266.anInt4433, -Static419.anInt7092 & 0x3FFF, -Static372.anInt6317 & 0x3FFF, Static152.anInt7561, -Static205.anInt5939 & 0x3FFF);
			@Pc(556) byte local556 = Static39.aClass79_Sub1_1.method1949(Static402.anInt6656) == 2 ? (byte) Static463.anInt7797 : 1;
			Static182.method2879(Static413.aClass167_11, Static172.anInt3107, anInt5454, Static359.aClass11_5, Static266.anInt4433, Static410.anInt6946, Static152.anInt7561, Static6.aByteArrayArrayArray1, Static204.anIntArray311, Static124.anIntArray113, Static123.anIntArray103, Static256.anIntArray280, Static130.anIntArray120, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 + 1, local556, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7, !Static39.aClass79_Sub1_1.aBoolean162);
			Static44.method856();
			if (Static345.anInt5823 == 9) {
				Static272.method3777(local116, local118, local120, local122);
				Static310.method4370(local116, local118, local122, local120);
				Static339.method4724(local120, local122, local116, local118);
				Static159.method2514(local118, local116, local120, local122);
			}
			Static325.method4507();
			Static266.anInt4433 = local130;
			Static152.anInt7561 = local277;
			Static372.anInt6317 = local281;
			Static419.anInt7092 = local279;
			Static410.anInt6946 = local168;
			if (Static64.aBoolean83 && Static338.aClass191_3.method4502() == 0) {
				Static64.aBoolean83 = false;
			}
			if (Static64.aBoolean83) {
				Static413.aClass167_11.method5951(local122, local118, -16777216, local120, local116);
				Static275.method3805(Static163.aClass174_199.method4208(Static300.anInt5192), false, Static244.aClass18_1);
			}
		} else {
			Static413.aClass167_11.method5951(arg0, arg2, -16777216, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!l;ILclient!uu;)V")
	public static void method4516(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) Class250 arg1) {
		Static295.anInterface7_7 = arg0;
		Static453.aClass250_103 = arg1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFFZ)F")
	public static float method4518(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg2 + arg1 * (arg0 - arg2);
	}
}
