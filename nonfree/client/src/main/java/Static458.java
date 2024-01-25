import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public static int anInt7601 = 0;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Lclient!gh;")
	public static Class89 aClass89_14 = null;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "[Lclient!bv;")
	public static final Class32[] aClass32Array1 = new Class32[2048];

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V")
	public static void method6071(@OriginalArg(0) int arg0) {
		if (Static358.anInt6086 == arg0) {
			return;
		}
		if (Static358.anInt6086 == 0) {
			Static148.method2569();
		}
		if (arg0 == 12) {
			Static102.method1791(Static2.aString1, Static33.aString67, Static109.anInt2181);
		}
		if (arg0 != 12 && Static59.aClass253_1 != null) {
			Static59.aClass253_1.method5484();
			Static59.aClass253_1 = null;
		}
		if (arg0 == 2) {
			Static163.method2718(Static189.anInt3826 != Static336.anInt5674);
		}
		if (arg0 == 6) {
			Static238.method3479(Static189.anInt3826 != Static39.anInt628);
		}
		if (arg0 == 4) {
			Static136.method2343(Static33.aString67, Static2.aString1);
		} else if (arg0 == 5) {
			Static102.method1791(Static2.aString1, Static33.aString67, Static109.anInt2181);
		} else if (arg0 == 8) {
			Static102.method1791(Static2.aString1, Static33.aString67, Static109.anInt2181);
		} else if (arg0 == 11) {
			Static136.method2343(Static33.aString67, Static2.aString1);
		}
		if (Static55.method942(Static358.anInt6086)) {
			Static255.aClass187_81.anInt5387 = 2;
			Static85.aClass187_137.anInt5387 = 2;
			Static87.aClass187_36.anInt5387 = 2;
			Static436.aClass187_126.anInt5387 = 2;
			Static297.aClass187_90.anInt5387 = 2;
			Static63.aClass187_21.anInt5387 = 2;
			Static339.aClass187_102.anInt5387 = 2;
		}
		if (Static55.method942(arg0)) {
			Static378.anInt6503 = 0;
			Static135.anInt6870 = 0;
			Static102.anInt2079 = 1;
			Static389.anInt6604 = 1;
			Static66.anInt1197 = 0;
			Static260.method3743(true);
			Static255.aClass187_81.anInt5387 = 1;
			Static85.aClass187_137.anInt5387 = 1;
			Static87.aClass187_36.anInt5387 = 1;
			Static436.aClass187_126.anInt5387 = 1;
			Static297.aClass187_90.anInt5387 = 1;
			Static63.aClass187_21.anInt5387 = 1;
			Static339.aClass187_102.anInt5387 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static127.method2215();
		}
		if (arg0 == 1) {
			Static180.method2969(Static21.aClass187_8, Static412.aClass50_8);
		} else {
			Static371.method4972();
		}
		@Pc(206) boolean local206 = arg0 == 1 || Static314.method4326(arg0) || Static207.method3218(arg0);
		@Pc(221) boolean local221 = Static358.anInt6086 == 1 || Static314.method4326(Static358.anInt6086) || Static207.method3218(Static358.anInt6086);
		if (local206 != local221) {
			if (local206) {
				Static151.anInt3107 = Static190.anInt3834;
				if (Static361.aClass85_Sub1_1.anInt2496 == 0) {
					Static81.method1529();
				} else {
					Static207.method3224(Static43.aClass187_11, Static361.aClass85_Sub1_1.anInt2496, Static190.anInt3834);
				}
				Static12.aClass103_1.method2599(false);
			} else {
				Static81.method1529();
				Static12.aClass103_1.method2599(true);
			}
		}
		if (Static55.method942(arg0) || arg0 == 12) {
			Static412.aClass50_8.method5877();
		}
		Static358.anInt6086 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIII)V")
	public static void method6073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static361.aClass85_Sub1_1.anInt2481 != 0 && arg2 != 0 && Static443.anInt7418 < 50 && arg1 != -1) {
			Static383.aClass68Array1[Static443.anInt7418++] = new Class68((byte) 2, arg1, arg2, arg3, arg0, 0);
		}
	}
}
