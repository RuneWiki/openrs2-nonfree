import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "Lclient!kj;")
	public static Class2_Sub3_Sub12 aClass2_Sub3_Sub12_5;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
	public static int anInt4607;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString230 = "Loaded title screen";

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_18 = new Class1();

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public static int anInt4605 = 2301979;

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
	public static int anInt4606 = 0;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "Lclient!a;")
	public static Class1 aClass1_19 = new Class1();

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
	public static int anInt4608 = 0;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I")
	public static int method3711(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)V")
	public static void method3713() {
		Static186.aClass46_31.method1068(5);
		Static144.aClass46_24.method1068(5);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3714(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static77.method1383(Static61.method2447(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
