import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString91 = "Select";

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	public static int anInt3211 = 0;

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
	public static int anInt3223 = 0;

	@OriginalMember(owner = "client!ki", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString92 = "Examine";

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)V")
	public static void method2511(@OriginalArg(0) int arg0) {
		if (arg0 == Static279.anInt5968) {
			return;
		}
		@Pc(28) boolean local28 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (Static279.anInt5968 == 0) {
			Static49.method1041();
		}
		if (arg0 == 40) {
			Static220.method3908();
		}
		if (arg0 != 40 && Static181.aClass41_3 != null) {
			Static181.aClass41_3.method1062();
			Static181.aClass41_3 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static58.anInt1513 = 0;
			Static25.anInt502 = 0;
			Static87.anInt2031 = 1;
			Static76.anInt5430 = 1;
			Static280.anInt5995 = 0;
			Static240.method4148(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static130.method2207();
		}
		if (arg0 == 5) {
			Static23.method396(Static33.aClass83_20);
		} else {
			Static247.method4245();
		}
		@Pc(116) boolean local116 = Static279.anInt5968 == 5 || Static279.anInt5968 == 10 || Static279.anInt5968 == 28;
		if (local116 != local28) {
			if (local28) {
				Static282.anInt6020 = Static175.anInt3976;
				if (Static239.anInt5264 == 0) {
					Static164.method3049();
				} else {
					Static112.method1806(Static175.anInt3976, 255, Static210.aClass83_139);
				}
				Static10.aClass42_1.method1071(false);
			} else {
				Static164.method3049();
				Static10.aClass42_1.method1071(true);
			}
		}
		if (Static296.aBoolean335 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static296.method4799();
		}
		Static279.anInt5968 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(BI)V")
	public static void method2512(@OriginalArg(1) int arg0) {
		if (Static91.method1593(arg0)) {
			Static205.method3643(Static81.aClass116ArrayArray1[arg0], -1);
		}
	}
}
