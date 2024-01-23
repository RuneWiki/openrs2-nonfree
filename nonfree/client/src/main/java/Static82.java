import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!pa;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt1810;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString63 = "white:";

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
	public static int anInt1827 = 0;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	public static int anInt1831 = 0;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)Z")
	public static boolean method1686() {
		try {
			if (Static63.anInt1315 == 2) {
				if (Static250.aClass1_Sub26_2 == null) {
					Static250.aClass1_Sub26_2 = Static324.method3673(Static167.aClass119_12, Static101.anInt2158, Static289.anInt5257);
					if (Static250.aClass1_Sub26_2 == null) {
						return false;
					}
				}
				if (Static156.aClass58_1 == null) {
					Static156.aClass58_1 = new Class58(Static279.aClass119_87, Static84.aClass119_36);
				}
				if (Static292.aClass1_Sub7_Sub2_3.method2783(Static198.aClass119_65, Static156.aClass58_1, Static250.aClass1_Sub26_2)) {
					Static292.aClass1_Sub7_Sub2_3.method2786();
					Static292.aClass1_Sub7_Sub2_3.method2762(Static118.anInt2421);
					Static292.aClass1_Sub7_Sub2_3.method2790(Static1.aBoolean6, Static250.aClass1_Sub26_2);
					Static167.aClass119_12 = null;
					Static63.anInt1315 = 0;
					Static156.aClass58_1 = null;
					Static250.aClass1_Sub26_2 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static292.aClass1_Sub7_Sub2_3.method2777();
			Static167.aClass119_12 = null;
			Static63.anInt1315 = 0;
			Static250.aClass1_Sub26_2 = null;
			Static156.aClass58_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
	public static void method1687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(9, arg1);
		local8.method4062();
		local8.anInt4863 = arg2;
		local8.anInt4862 = arg0;
	}
}
