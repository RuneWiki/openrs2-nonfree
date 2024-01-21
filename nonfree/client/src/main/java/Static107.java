import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "Lclient!ig;")
	public static Class39 aClass39_28;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "Lclient!sd;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "Lclient!rf;")
	public static Class70 aClass70_981 = Static49.method1293("_");

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
	public static int anInt3030 = 0;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "Lclient!rf;")
	public static Class70 aClass70_982 = Static49.method1293("title)3jpg");

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
	public static int anInt3036 = 0;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_983 = Static49.method1293("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_984 = Static49.method1293("mapfunction");

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "[I")
	public static int[] anIntArray296 = new int[200];

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)Z")
	public static boolean method2252(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)V")
	public static void method2253() {
		aClass70_983 = null;
		aClass70_981 = null;
		aClass39_28 = null;
		anIntArray296 = null;
		aClass70_982 = null;
		aClass70_984 = null;
		aClass36_1 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!u;B)V")
	public static void method2254(@OriginalArg(0) Class76 arg0) {
		Static36.aClass76_32 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)I")
	public static int method2255(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local13 >> 12;
	}
}
