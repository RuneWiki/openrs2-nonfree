import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_49 = new Class40("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_27 = new Class236(46, 3);

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt3101 = 0;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString37 = null;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
	public static void method2771(@OriginalArg(1) int arg0) {
		Static45.anInt1001 = arg0;
		Static431.aClass288_56.method6744();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Z")
	public static boolean method2772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static43.method897(arg1, arg0) | Static146.method2755(arg0, arg1) | Static293.method4903(arg0, arg1)) & Static437.method6223(arg1, arg0);
	}
}
