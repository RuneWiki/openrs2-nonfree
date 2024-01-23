import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!te", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!ai;")
	public static Class7 aClass7_35;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!ge;")
	public static Class39 aClass39_22 = new Class39(128);

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1373 = Static200.method3116("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1374 = Static200.method3116("(Y<)4col>");

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	public static int anInt4082 = -1;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	public static void method2980() {
		Static57.method1068(Static60.aClass6_9);
		Static56.anInt1481++;
		if (Static118.aBoolean146 && Static128.aBoolean157) {
			@Pc(24) int local24 = Static122.anInt2732;
			local24 -= Static29.anInt707;
			if (local24 < anInt4082) {
				local24 = anInt4082;
			}
			if (local24 + Static60.aClass6_9.anInt251 > anInt4082 + Static84.aClass6_8.anInt251) {
				local24 = Static84.aClass6_8.anInt251 + anInt4082 - Static60.aClass6_9.anInt251;
			}
			@Pc(57) int local57 = Static176.anInt768;
			@Pc(62) int local62 = local24 - Static214.anInt4575;
			@Pc(73) int local73 = Static60.aClass6_9.anInt253;
			local57 -= Static184.anInt3955;
			if (Static83.anInt1957 > local57) {
				local57 = Static83.anInt1957;
			}
			@Pc(90) int local90 = local24 + Static84.aClass6_8.anInt250 - anInt4082;
			if (Static84.aClass6_8.anInt221 + Static83.anInt1957 < local57 - -Static60.aClass6_9.anInt221) {
				local57 = Static84.aClass6_8.anInt221 + Static83.anInt1957 - Static60.aClass6_9.anInt221;
			}
			@Pc(118) int local118 = local57 - Static147.anInt3282;
			if (Static56.anInt1481 > Static60.aClass6_9.anInt248 && (local62 > local73 || local62 < -local73 || local73 < local118 || -local73 > local118)) {
				Static37.aBoolean55 = true;
			}
			@Pc(154) int local154 = local57 + Static84.aClass6_8.anInt247 - Static83.anInt1957;
			@Pc(163) Class1_Sub8 local163;
			if (Static60.aClass6_9.anObjectArray2 != null && Static37.aBoolean55) {
				local163 = new Class1_Sub8();
				local163.anInt1072 = local154;
				local163.aClass6_5 = Static60.aClass6_9;
				local163.anObjectArray29 = Static60.aClass6_9.anObjectArray2;
				local163.anInt1069 = local90;
				Static93.method1622(local163);
			}
			if (Static27.anInt641 == 0) {
				if (Static37.aBoolean55) {
					if (Static60.aClass6_9.anObjectArray7 != null) {
						local163 = new Class1_Sub8();
						local163.anObjectArray29 = Static60.aClass6_9.anObjectArray7;
						local163.anInt1069 = local90;
						local163.aClass6_6 = Static47.aClass6_4;
						local163.anInt1072 = local154;
						local163.aClass6_5 = Static60.aClass6_9;
						Static93.method1622(local163);
					}
					if (Static47.aClass6_4 != null && Static160.method2688(Static60.aClass6_9) != null) {
						Static96.aClass1_Sub9_Sub1_3.method953(135);
						Static96.aClass1_Sub9_Sub1_3.method914(Static60.aClass6_9.anInt242);
						Static96.aClass1_Sub9_Sub1_3.method910(Static60.aClass6_9.anInt229);
						Static96.aClass1_Sub9_Sub1_3.method910(Static47.aClass6_4.anInt229);
						Static96.aClass1_Sub9_Sub1_3.method902(Static47.aClass6_4.anInt242);
					}
				} else if ((Static173.anInt3720 == 1 || Static151.method2590(Static91.anInt2134 - 1)) && Static91.anInt2134 > 2) {
					Static163.method2706();
				} else if (Static91.anInt2134 > 0) {
					Static65.method1172(Static91.anInt2134 - 1);
				}
				Static60.aClass6_9 = null;
			}
		} else if (Static56.anInt1481 > 1) {
			Static60.aClass6_9 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Z")
	public static boolean method2982(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public static void method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt3358; local12++) {
			@Pc(18) Class29 local18 = local7.aClass29Array3[local12];
			if ((local18.aLong43 >> 29 & 0x3L) == 2L && local18.anInt1437 == arg1 && local18.anInt1423 == arg2) {
				Static204.method3168(local18);
				return;
			}
		}
	}
}
