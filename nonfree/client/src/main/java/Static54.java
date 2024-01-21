import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!fi", name = "db", descriptor = "Lclient!ag;")
	public static Class4 aClass4_48;

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array14 = new Class13[100];

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
	public static void method1314() {
		aClass4_48 = null;
		aClass13Array14 = null;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
	public static int method1315(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Z")
	public static boolean method1316(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}
