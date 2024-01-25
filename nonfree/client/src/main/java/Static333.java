import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!v", name = "N", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array20;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_194 = new Class217(0, 6);

	@OriginalMember(owner = "client!v", name = "P", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_212 = new Class18(39, 8);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!fp;)V")
	public static void method5600(@OriginalArg(1) Class63 arg0) {
		if (Static224.anInt4512 < 2 && !Static77.aBoolean119 || Static243.aClass112_15 != null) {
			return;
		}
		@Pc(44) String local44;
		if (Static77.aBoolean119 && Static224.anInt4512 < 2) {
			local44 = Static365.aString65 + Static102.aClass106_238.method2927(Static254.anInt5172) + Static196.aString39 + " ->";
		} else if (Static272.aBoolean405 && Static271.aClass60_2.method1863(81) && Static224.anInt4512 > 2) {
			local44 = Static123.method2597((Class1_Sub22) Static317.aClass42_43.aClass1_73.aClass1_252.aClass1_252);
		} else {
			@Pc(51) Class1_Sub22 local51 = (Class1_Sub22) Static317.aClass42_43.aClass1_73.aClass1_252;
			local44 = Static123.method2597(local51);
			@Pc(57) int[] local57 = null;
			if (Static83.method1776(local51.anInt2822)) {
				local57 = Static243.aClass220_2.method5972((int) local51.aLong104).anIntArray58;
			} else if (Static289.method5105(local51.anInt2822)) {
				@Pc(82) Class11_Sub2_Sub6_Sub2 local82 = Static231.aClass11_Sub2_Sub6_Sub2Array1[(int) local51.aLong104];
				if (local82 != null) {
					@Pc(87) Class208 local87 = local82.aClass208_1;
					if (local87.anIntArray480 != null) {
						local87 = local87.method5539();
					}
					if (local87 != null) {
						local57 = local87.anIntArray476;
					}
				}
			} else if (Static298.method5710(local51.anInt2822)) {
				@Pc(117) Class71 local117;
				if (local51.anInt2822 == 1006) {
					local117 = Static219.method4081((int) local51.aLong104);
				} else {
					local117 = Static219.method4081((int) (local51.aLong104 >>> 32 & 0x7FFFFFFFL));
				}
				if (local117.anIntArray178 != null) {
					local117 = local117.method2282();
				}
				if (local117 != null) {
					local57 = local117.anIntArray181;
				}
			}
			if (local57 != null) {
				local44 = local44 + Static7.method285(local57);
			}
		}
		if (Static224.anInt4512 > 2) {
			local44 = local44 + "<col=ffffff> / " + (Static224.anInt4512 - 2) + Static21.aClass106_18.method2927(Static254.anInt5172);
		}
		if (Static27.aClass112_2 != null) {
			@Pc(235) Class33 local235 = Static27.aClass112_2.method3106(arg0);
			if (local235 == null) {
				local235 = Static340.aClass33_3;
			}
			local235.method6033(Static27.aClass112_2.anInt3415, Static213.aClass4Array11, Static27.aClass112_2.anInt3380, Static204.anInt4069, Static356.anInt6820, Static27.anInt622, Static27.aClass112_2.anInt3444, Static27.aClass112_2.anInt3386, Static166.aRandom1, Static27.aClass112_2.anInt3381, local44, Static27.aClass112_2.anInt3430, Static175.anIntArray269, Static74.anIntArray137);
			Static128.method5289(Static175.anIntArray269[1], Static175.anIntArray269[0], Static175.anIntArray269[3], Static175.anIntArray269[2]);
		} else if (Static95.aClass112_7 != null && Static285.aClass81_4 == Static171.aClass81_1) {
			@Pc(216) int local216 = Static340.aClass33_3.method6020(Static166.aRandom1, Static342.anInt6501 + 16, local44, Static213.aClass4Array11, Static27.anInt622, Static33.anInt829 + 4, Static74.anIntArray137);
			Static128.method5289(Static342.anInt6501, Static33.anInt829 + 4, 16, Static64.aClass80_17.method2543(local44) + local216);
			return;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ct;I)V")
	public static void method5602(@OriginalArg(0) Class30 arg0) {
		Static144.anInt3081 = arg0.method1153("p11_full");
		Static31.anInt788 = arg0.method1153("p12_full");
		Static78.anInt1753 = arg0.method1153("b12_full");
		Static102.anInt7003 = arg0.method1153("hitmarks");
		Static294.anInt5667 = arg0.method1153("hitbar_default");
		Static37.anInt939 = arg0.method1153("timerbar_default");
		Static7.anInt217 = arg0.method1153("headicons_pk");
		Static282.anInt5488 = arg0.method1153("headicons_prayer");
		Static186.anInt3747 = arg0.method1153("hint_headicons");
		Static254.anInt5165 = arg0.method1153("hint_mapmarkers");
		Static184.anInt3734 = arg0.method1153("mapflag");
		Static164.anInt3439 = arg0.method1153("cross");
		Static345.anInt6528 = arg0.method1153("mapdots");
		Static157.anInt3251 = arg0.method1153("scrollbar");
		Static201.anInt4057 = arg0.method1153("name_icons");
		Static5.anInt190 = arg0.method1153("floorshadows");
		Static233.anInt4717 = arg0.method1153("compass");
		Static72.anInt1650 = arg0.method1153("otherlevel");
		Static229.anInt4641 = arg0.method1153("hint_mapedge");
	}
}
