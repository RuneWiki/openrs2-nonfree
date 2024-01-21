import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_13;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static final int anInt1645 = 5063219;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1035 = Static69.method1153("");

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public static int anInt1656 = 0;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1036 = Static69.method1153("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1037 = Static69.method1153(" has logged in)3");

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1039 = Static69.method1153("white:");

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1038 = aClass64_1039;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1040 = aClass64_1037;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1041 = Static69.method1153("hitmarks");

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!pb;Lclient!pb;I)I")
	public static int method1197(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1075(Static45.aClass64_708, Static34.aClass64_501)) {
			local5++;
		}
		if (arg0.method1075(Static57.aClass64_815, Static34.aClass64_501)) {
			local5++;
		}
		if (arg0.method1075(Static46.aClass64_713, Static34.aClass64_501)) {
			local5++;
		}
		if (arg0.method1075(Static10.aClass64_286, Static34.aClass64_501)) {
			local5++;
		}
		if (arg0.method1075(Static92.aClass64_1312, Static34.aClass64_501)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1205() {
		aClass64_1035 = null;
		aClass64_1040 = null;
		aClass1_Sub1_Sub5_Sub3_13 = null;
		aClass64_1038 = null;
		aClass64_1041 = null;
		aClass64_1037 = null;
		aClass64_1036 = null;
		aClass64_1039 = null;
	}
}
