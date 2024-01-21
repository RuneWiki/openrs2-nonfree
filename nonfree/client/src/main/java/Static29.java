import java.awt.Font;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!gd;")
	private static Class23 aClass23_475 = Static15.method178("flash1:");

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!ba;")
	public static Class5 aClass5_22 = new Class5(64);

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_476 = aClass23_475;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public static int anInt880 = 0;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!gd;")
	private static Class23 aClass23_478 = Static15.method178(" is already on your ignore list");

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_477 = aClass23_478;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
	public static int anInt881 = 0;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "[Lclient!rc;")
	public static Class1_Sub5[] aClass1_Sub5Array1 = new Class1_Sub5[2048];

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!de;")
	public static Class14 aClass14_4 = new Class14(4096);

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!de;")
	public static Class14 aClass14_5 = new Class14(4096);

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	public static int anInt882 = -1;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[I")
	public static int[] anIntArray130 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method448() {
		aFont1 = null;
		aClass14_4 = null;
		aClass23_475 = null;
		aClass23_476 = null;
		aClass5_22 = null;
		aClass14_5 = null;
		anIntArray130 = null;
		aClass23_478 = null;
		aClass1_Sub5Array1 = null;
		aClass23_477 = null;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method449() {
		Static83.aClass1_Sub5_Sub1_3.method733();
		@Pc(11) int local11 = Static83.aClass1_Sub5_Sub1_3.method739(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static83.aClass1_Sub5_Sub1_3.method739(2);
		if (local22 == 0) {
			Static88.anIntArray151[Static37.anInt1299++] = 2047;
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		if (local22 == 1) {
			local46 = Static83.aClass1_Sub5_Sub1_3.method739(3);
			Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1389(false, local46);
			local56 = Static83.aClass1_Sub5_Sub1_3.method739(1);
			if (local56 == 1) {
				Static88.anIntArray151[Static37.anInt1299++] = 2047;
			}
			return;
		}
		@Pc(102) int local102;
		if (local22 == 2) {
			local46 = Static83.aClass1_Sub5_Sub1_3.method739(3);
			Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1389(true, local46);
			local56 = Static83.aClass1_Sub5_Sub1_3.method739(3);
			Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1389(true, local56);
			local102 = Static83.aClass1_Sub5_Sub1_3.method739(1);
			if (local102 == 1) {
				Static88.anIntArray151[Static37.anInt1299++] = 2047;
			}
		} else if (local22 == 3) {
			local46 = Static83.aClass1_Sub5_Sub1_3.method739(7);
			local56 = Static83.aClass1_Sub5_Sub1_3.method739(1);
			Static79.anInt2137 = Static83.aClass1_Sub5_Sub1_3.method739(2);
			local102 = Static83.aClass1_Sub5_Sub1_3.method739(1);
			if (local102 == 1) {
				Static88.anIntArray151[Static37.anInt1299++] = 2047;
			}
			@Pc(157) int local157 = Static83.aClass1_Sub5_Sub1_3.method739(7);
			Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1391(local46, local56 == 1, local157);
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method450() {
		@Pc(12) int local12 = Static83.aClass1_Sub5_Sub1_3.method739(8);
		@Pc(17) int local17;
		if (local12 < Static2.anInt2290) {
			for (local17 = local12; local17 < Static2.anInt2290; local17++) {
				Static111.anIntArray403[Static82.anInt2314++] = Static63.anIntArray226[local17];
			}
		}
		if (Static2.anInt2290 < local12) {
			throw new RuntimeException("gppov1");
		}
		Static2.anInt2290 = 0;
		for (local17 = 0; local17 < local12; local17++) {
			@Pc(53) int local53 = Static63.anIntArray226[local17];
			@Pc(57) Class1_Sub1_Sub2_Sub1_Sub2 local57 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local53];
			@Pc(62) int local62 = Static83.aClass1_Sub5_Sub1_3.method739(1);
			if (local62 == 0) {
				Static63.anIntArray226[Static2.anInt2290++] = local53;
				local57.anInt2224 = Static7.anInt176;
			} else {
				@Pc(81) int local81 = Static83.aClass1_Sub5_Sub1_3.method739(2);
				if (local81 == 0) {
					Static63.anIntArray226[Static2.anInt2290++] = local53;
					local57.anInt2224 = Static7.anInt176;
					Static88.anIntArray151[Static37.anInt1299++] = local53;
				} else {
					@Pc(127) int local127;
					@Pc(137) int local137;
					if (local81 == 1) {
						Static63.anIntArray226[Static2.anInt2290++] = local53;
						local57.anInt2224 = Static7.anInt176;
						local127 = Static83.aClass1_Sub5_Sub1_3.method739(3);
						local57.method1389(false, local127);
						local137 = Static83.aClass1_Sub5_Sub1_3.method739(1);
						if (local137 == 1) {
							Static88.anIntArray151[Static37.anInt1299++] = local53;
						}
					} else if (local81 == 2) {
						Static63.anIntArray226[Static2.anInt2290++] = local53;
						local57.anInt2224 = Static7.anInt176;
						local127 = Static83.aClass1_Sub5_Sub1_3.method739(3);
						local57.method1389(true, local127);
						local137 = Static83.aClass1_Sub5_Sub1_3.method739(3);
						local57.method1389(true, local137);
						@Pc(190) int local190 = Static83.aClass1_Sub5_Sub1_3.method739(1);
						if (local190 == 1) {
							Static88.anIntArray151[Static37.anInt1299++] = local53;
						}
					} else if (local81 == 3) {
						Static111.anIntArray403[Static82.anInt2314++] = local53;
					}
				}
			}
		}
	}
}
