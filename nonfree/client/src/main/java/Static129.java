import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "[[I")
	public static int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1254 = Static38.method685("Loading textures )2 ");

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1253 = aClass6_1254;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	public static int anInt4157 = 0;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
	public static int anInt4161 = 0;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1255 = Static38.method685("lila:");

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1256 = Static38.method685("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1257 = Static38.method685("Mitglieder)2Welt");

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lclient!ic;")
	public static Class2_Sub3_Sub8 method2790(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub8 local10 = (Class2_Sub3_Sub8) Static40.aClass17_7.method505((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static87.aClass10_73.method1605(arg0, 12);
		local10 = new Class2_Sub3_Sub8();
		if (local25 != null) {
			local10.method1075(new Class2_Sub13(local25));
		}
		local10.method1078();
		Static40.aClass17_7.method508((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(BI)V")
	public static void method2791() {
		Static19.aClass10_21 = null;
		Static135.anInt3139 = 0;
		Static6.anInt1431 = -1;
		Static65.anInt1613 = 1;
		Static141.anInt3309 = 2;
		Static109.anInt3491 = -1;
		Static155.aBoolean161 = false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method2795() {
		anIntArrayArray75 = null;
		aClass6_1257 = null;
		aClass6_1254 = null;
		aClass6_1256 = null;
		aClass6_1255 = null;
		aClass6_1253 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!ai;)V")
	public static void method2797(@OriginalArg(1) Class6 arg0) {
		if (Static98.anInt2447 >= 2) {
			if (arg0.method137(Static8.aClass6_63)) {
				System.gc();
			}
			if (arg0.method137(Static176.aClass6_1228)) {
				Static157.method2413();
			}
			if (arg0.method137(Static68.aClass6_509)) {
				Static110.aBoolean108 = true;
			}
			if (arg0.method137(Static22.aClass6_152)) {
				Static110.aBoolean108 = false;
			}
			if (arg0.method137(Static67.aClass6_496)) {
				for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
					for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
						for (@Pc(52) int local52 = 1; local52 < 103; local52++) {
							Static51.aClass48Array1[local44].anIntArrayArray35[local48][local52] = 0;
						}
					}
				}
			}
			if (arg0.method137(Static170.aClass6_1189) && Static115.anInt2775 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method103(Static179.aClass6_1262)) {
				Static81.anInt1980 = arg0.method119(12).method135().method122();
				Static6.method932(0, Static58.method956(new Class6[] { Static108.aClass6_735, Static106.method2806(Static81.anInt1980) }), null);
			}
			if (arg0.method137(Static111.aClass6_764)) {
				Static181.aBoolean89 = true;
			}
		}
		Static66.aClass2_Sub13_Sub1_2.method1455(251);
		Static66.aClass2_Sub13_Sub1_2.method1416(arg0.method107() - 1);
		Static66.aClass2_Sub13_Sub1_2.method1404(arg0.method119(2));
	}
}
