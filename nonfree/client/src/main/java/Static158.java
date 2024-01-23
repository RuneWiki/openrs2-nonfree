import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
	public static int[] anIntArray179 = new int[2048];

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString69 = "yellow:";

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)Lclient!tn;")
	public static Class171 method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass171_1 == null ? null : local7.aClass171_1;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(JI)V")
	public static void method1623(@OriginalArg(0) long arg0) {
		if (Static101.anInt1895 == 1 || Static101.anInt1895 == 5) {
			Static120.method1928(arg0);
		} else if (Static101.anInt1895 == 2) {
			Static315.method4656();
		} else if (Static101.anInt1895 == 4) {
			Static208.method3306(arg0);
		} else {
			Static127.method2016();
		}
		if (!Static108.aBoolean161) {
			if (Static190.anInt3885 != 0) {
				Static64.anInt3058 = Static107.anInt2125;
				Static268.anInt5935 = Static60.anInt1202;
			} else if (Static86.anInt1565 == 0) {
				Static64.anInt3058 = Static152.anInt3132;
				Static268.anInt5935 = Static300.anInt5678;
			} else {
				Static268.anInt5935 = Static46.anInt894;
				Static64.anInt3058 = Static84.anInt1530;
			}
			Static213.aStringArray35[0] = Static269.aString16;
			Static244.anIntArray441[0] = Static5.anInt69;
			Static316.anInt5941 = 1;
			Static241.aShortArray76[0] = 1002;
			Static54.aStringArray7[0] = "";
		}
		Static149.method2408((long) Static37.anInt757);
		if (Static287.anInt5450 != -1) {
			Static20.method398(Static287.anInt5450);
		}
		@Pc(96) int local96;
		for (local96 = 0; local96 < Static156.anInt3310; local96++) {
			if (Static132.aBooleanArray25[local96]) {
				Static307.aBooleanArray65[local96] = true;
			}
			Static213.aBooleanArray44[local96] = Static132.aBooleanArray25[local96];
			Static132.aBooleanArray25[local96] = false;
		}
		if (Static291.aBoolean404) {
			Static218.aBoolean293 = true;
		}
		Static173.aClass146_13 = null;
		Static66.anInt1302 = -1;
		Static51.aClass146_3 = null;
		Static253.anInt4756 = Static37.anInt757;
		Static110.anInt2181 = -1;
		if (Static287.anInt5450 != -1) {
			Static156.anInt3310 = 0;
			Static164.method2789();
		}
		if (Static291.aBoolean404) {
			Static133.method2166();
		} else {
			Static41.method731();
		}
		Static264.method3945();
		if (Static108.aBoolean161) {
			if (Static37.aBoolean62) {
				Static253.method3717();
			} else {
				Static70.method1150();
			}
		} else if (Static51.aClass146_3 != null) {
			Static221.method3499(Static36.anInt729, Static81.anInt1493, Static51.aClass146_3);
		} else if (Static66.anInt1302 != -1) {
			Static221.method3499(Static66.anInt1302, Static110.anInt2181, null);
		}
		local96 = Static108.aBoolean161 ? -1 : Static142.method2262();
		if (local96 == -1) {
			local96 = Static175.anInt3637;
		}
		Static229.method3597(local96);
		if (Static73.anInt1412 == 1) {
			Static73.anInt1412 = 2;
		}
		if (Static183.anInt3702 == 1) {
			Static183.anInt3702 = 2;
		}
		if (Static16.anInt245 == 3) {
			for (@Pc(230) int local230 = 0; local230 < Static156.anInt3310; local230++) {
				if (Static213.aBooleanArray44[local230]) {
					if (Static291.aBoolean404) {
						Static133.method2177(Static220.anIntArray527[local230], Static244.anIntArray440[local230], Static219.anIntArray345[local230], Static191.anIntArray319[local230], 16711935, 128);
					} else {
						Static41.method728(Static220.anIntArray527[local230], Static244.anIntArray440[local230], Static219.anIntArray345[local230], Static191.anIntArray319[local230], 16711935, 128);
					}
				} else if (Static307.aBooleanArray65[local230]) {
					if (Static291.aBoolean404) {
						Static133.method2177(Static220.anIntArray527[local230], Static244.anIntArray440[local230], Static219.anIntArray345[local230], Static191.anIntArray319[local230], 16711680, 128);
					} else {
						Static41.method728(Static220.anIntArray527[local230], Static244.anIntArray440[local230], Static219.anIntArray345[local230], Static191.anIntArray319[local230], 16711680, 128);
					}
				}
			}
		}
		Static164.method2786(Static295.anInt5586, Static229.aClass22_Sub3_Sub2_2.anInt4601, Static229.aClass22_Sub3_Sub2_2.anInt4623, Static147.anInt2946);
		Static147.anInt2946 = 0;
	}
}
