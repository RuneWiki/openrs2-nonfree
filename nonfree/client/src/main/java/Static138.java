import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!gl;")
	public static Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	public static int anInt2879;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
	public static int anInt2888 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
	public static boolean method2342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static282.method4208(arg1, arg0) || Static263.method4046(arg0, arg1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZII)V")
	public static void method2344(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static253.anInt4705 = 3;
		Static402.anInt7015 = arg1;
		Static114.method1694(Static109.aClass170_2.anInt4548, Static109.aClass170_2.aString35);
		if (arg0) {
			Static100.method1501(false, "", "");
		} else {
			Static426.method6110();
			Static100.method1501(false, Static127.aString20, Static371.aString57);
		}
	}
}
