import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "Lclient!ue;")
	public static Class196 aClass196_2;

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array14;

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "Z")
	public static boolean aBoolean93 = true;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
	public static int anInt1421 = 0;

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
	public static int anInt1422 = 0;

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "[I")
	public static final int[] anIntArray155 = new int[4096];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(JI)V")
	public static void method1336(@OriginalArg(0) long arg0) {
		if (Static203.aClass106Array3 != null) {
			if (Static334.anInt6112 == 1 || Static334.anInt6112 == 5) {
				Static168.method743(arg0);
			} else if (Static334.anInt6112 == 2) {
				Static90.method1535();
			} else if (Static334.anInt6112 == 4) {
				Static59.method981(arg0);
			} else {
				Static220.method3911();
			}
		}
		Static147.method2881((long) Static76.anInt2853, Static289.aClass81_7);
		if (Static62.anInt1131 != -1) {
			Static172.method3366(Static62.anInt1131);
		}
		for (@Pc(52) int local52 = 0; local52 < Static25.anInt504; local52++) {
			if (Static103.aBooleanArray18[local52]) {
				Static120.aBooleanArray20[local52] = true;
			}
			Static162.aBooleanArray23[local52] = Static103.aBooleanArray18[local52];
			Static103.aBooleanArray18[local52] = false;
		}
		Static268.anInt5004 = Static76.anInt2853;
		if (Static289.aClass81_7.method2988()) {
			Static115.aBoolean185 = true;
		}
		Static10.aClass132_2 = null;
		if (Static62.anInt1131 != -1) {
			Static25.anInt504 = 0;
			Static7.method148();
		}
		Static289.aClass81_7.method3032();
		Static156.method5553(Static289.aClass81_7);
		@Pc(105) int local105 = Static82.method1379();
		if (local105 == -1) {
			local105 = Static211.anInt3858;
		}
		Static66.method1125(local105);
		Static294.method5027(Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339, Static343.anInt6225, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340, Static133.anInt2448);
		Static133.anInt2448 = 0;
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
	public static void method1337() {
		if (Static337.aClass198_1 != null) {
			@Pc(3) Class198 local3 = Static337.aClass198_1;
			synchronized (Static337.aClass198_1) {
				Static337.aClass198_1 = null;
			}
		}
	}
}
