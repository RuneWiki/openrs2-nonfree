import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	public static int anInt3201;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method2239() {
		Static152.method2858(Static41.aClass20_4);
		Static47.anInt4241++;
		if (Static56.aBoolean87 && Static73.aBoolean75) {
			@Pc(24) int local24 = Static154.anInt4252;
			local24 -= Static88.anInt2736;
			@Pc(30) int local30 = Static9.anInt293;
			@Pc(36) int local36 = Static41.aClass20_4.anInt1222;
			local30 -= Static85.anInt2578;
			if (Static125.anInt3620 > local24) {
				local24 = Static125.anInt3620;
			}
			if (Static126.anInt3636 > local30) {
				local30 = Static126.anInt3636;
			}
			if (Static157.aClass20_12.anInt1260 + Static125.anInt3620 < local24 - -Static41.aClass20_4.anInt1260) {
				local24 = Static157.aClass20_12.anInt1260 + Static125.anInt3620 - Static41.aClass20_4.anInt1260;
			}
			@Pc(81) int local81 = local24 - Static32.anInt1092;
			if (Static41.aClass20_4.anInt1212 + local30 > Static126.anInt3636 + Static157.aClass20_12.anInt1212) {
				local30 = Static126.anInt3636 + Static157.aClass20_12.anInt1212 - Static41.aClass20_4.anInt1212;
			}
			@Pc(104) int local104 = local30 - Static36.anInt1163;
			if (Static47.anInt4241 > Static41.aClass20_4.anInt1210 && (local81 > local36 || local81 < -local36 || local104 > local36 || local104 < -local36)) {
				Static180.aBoolean212 = true;
			}
			@Pc(141) int local141 = local30 + Static157.aClass20_12.anInt1256 - Static126.anInt3636;
			@Pc(149) int local149 = local24 + Static157.aClass20_12.anInt1219 - Static125.anInt3620;
			@Pc(158) Class1_Sub10 local158;
			if (Static41.aClass20_4.anObjectArray19 != null && Static180.aBoolean212) {
				local158 = new Class1_Sub10();
				local158.anInt1446 = local141;
				local158.aClass20_6 = Static41.aClass20_4;
				local158.anObjectArray28 = Static41.aClass20_4.anObjectArray19;
				local158.anInt1448 = local149;
				Static97.method2118(local158);
			}
			if (Static127.anInt3639 == 0) {
				if (Static180.aBoolean212) {
					if (Static41.aClass20_4.anObjectArray27 != null) {
						local158 = new Class1_Sub10();
						local158.aClass20_6 = Static41.aClass20_4;
						local158.anObjectArray28 = Static41.aClass20_4.anObjectArray27;
						local158.anInt1446 = local141;
						local158.aClass20_5 = Static122.aClass20_10;
						local158.anInt1448 = local149;
						Static97.method2118(local158);
					}
					if (Static122.aClass20_10 != null && Static94.method2061(Static41.aClass20_4) != null) {
						Static95.aClass1_Sub6_Sub1_1.method555(78);
						Static95.aClass1_Sub6_Sub1_1.method532(Static122.aClass20_10.anInt1240);
						Static95.aClass1_Sub6_Sub1_1.method511(Static41.aClass20_4.anInt1200);
						Static95.aClass1_Sub6_Sub1_1.method531(Static122.aClass20_10.anInt1200);
						Static95.aClass1_Sub6_Sub1_1.method513(Static41.aClass20_4.anInt1240);
					}
				} else if ((Static8.anInt219 == 1 || Static177.method3180(Static80.anInt2478 - 1)) && Static80.anInt2478 > 2) {
					Static132.method2562();
				} else if (Static80.anInt2478 > 0) {
					Static32.method698(Static80.anInt2478 - 1);
				}
				Static41.aClass20_4 = null;
			}
		} else if (Static47.anInt4241 > 1) {
			Static41.aClass20_4 = null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZILclient!dd;I)V")
	public static void method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class16 arg2, @OriginalArg(5) int arg3) {
		Static7.anInt199 = arg3;
		Static41.anInt1326 = 1;
		Static47.anInt4240 = arg1;
		Static78.aBoolean96 = false;
		Static171.aClass16_37 = arg2;
		Static91.anInt2765 = arg0;
		Static32.anInt1093 = 10000;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZB)V")
	public static void method2245(@OriginalArg(0) boolean arg0) {
		Static147.method2775();
		Static57.anInt1791++;
		if (Static57.anInt1791 < 50 && !arg0) {
			return;
		}
		Static57.anInt1791 = 0;
		if (Static117.aBoolean145 || Static35.aClass21_2 == null) {
			return;
		}
		Static95.aClass1_Sub6_Sub1_1.method555(186);
		try {
			Static35.aClass21_2.method1024(Static95.aClass1_Sub6_Sub1_1.aByteArray3, Static95.aClass1_Sub6_Sub1_1.anInt839);
			Static95.aClass1_Sub6_Sub1_1.anInt839 = 0;
		} catch (@Pc(49) IOException local49) {
			Static117.aBoolean145 = true;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method2256() {
		aByteArrayArrayArray5 = null;
	}
}
