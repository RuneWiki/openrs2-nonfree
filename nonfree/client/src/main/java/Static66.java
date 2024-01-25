import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!e", name = "L", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString120 = "Loaded defaults";

	@OriginalMember(owner = "client!e", name = "N", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_15 = new Class10(8);

	@OriginalMember(owner = "client!e", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString121 = "Created gameworld";

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(BII)V")
	public static void method1337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static263.aClass103_52 = new Class103(arg0);
		Static281.aClass103_51 = new Class103(arg1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method1339(@OriginalArg(0) Class180 arg0) {
		Static191.aClass180_50 = arg0;
	}
}
