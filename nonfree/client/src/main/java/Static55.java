import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "Lclient!oc;")
	public static Class34 aClass34_45;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
	public static int anInt1713;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
	public static int anInt1715;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "Lclient!nd;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lclient!rb;")
	public static Class55 aClass55_25;

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] aClass1_Sub1_Sub6_Sub3Array6;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "[Lclient!n;")
	public static Class39[] aClass39Array1 = new Class39[50];

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!gd;")
	public static Class23 aClass23_923 = Static15.method178("Ignorieren");

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "Lclient!gd;")
	private static Class23 aClass23_925 = Static15.method178("Error loading your profile)3");

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "Lclient!gd;")
	public static Class23 aClass23_924 = aClass23_925;

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	public static int anInt1717 = 0;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "[I")
	public static int[] anIntArray201 = new int[1000];

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "Lclient!td;")
	public static Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!ke", name = "db", descriptor = "Lclient!gd;")
	private static Class23 aClass23_929 = Static15.method178("red:");

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "Lclient!gd;")
	public static Class23 aClass23_926 = aClass23_929;

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "Lclient!gd;")
	public static Class23 aClass23_927 = Static15.method178("Versteckt");

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_928 = Static15.method178("@gre@");

	@OriginalMember(owner = "client!ke", name = "cb", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method1069() {
		aClass23_929 = null;
		aClass23_925 = null;
		aClass23_923 = null;
		anIntArray201 = null;
		aClass41_2 = null;
		aClass23_928 = null;
		aClass23_926 = null;
		aClass55_25 = null;
		aClass61_1 = null;
		aClass39Array1 = null;
		aClass34_45 = null;
		aClass1_Sub1_Sub6_Sub3Array6 = null;
		aClass23_924 = null;
		aClass23_927 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
	public static void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg3 - 32) * arg3 / arg2;
		Static9.aClass1_Sub1_Sub6_Sub3Array1[0].method1194(arg4, arg0);
		Static9.aClass1_Sub1_Sub6_Sub3Array1[1].method1194(arg4, arg0 + arg3 - 16);
		Static24.method1578(arg4, arg0 + 16, 16, arg3 - 32, Static9.anInt201);
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(67) int local67 = arg1 * (arg3 - local11 - 32) / (arg2 - arg3);
		Static24.method1578(arg4, local67 + arg0 + 16, 16, local11, Static11.anInt221);
		Static24.method1586(arg4, local67 + arg0 + 16, local11, Static51.anInt1627);
		Static24.method1586(arg4 + 1, local67 + 16 + arg0, local11, Static51.anInt1627);
		Static24.method1585(arg4, local67 + arg0 + 16, 16, Static51.anInt1627);
		Static24.method1585(arg4, arg0 + local67 + 17, 16, Static51.anInt1627);
		Static24.method1586(arg4 + 15, local67 + (arg0 - -16), local11, Static112.anInt2928);
		Static24.method1586(arg4 + 14, arg0 + 17 + local67, local11 - 1, Static112.anInt2928);
		Static24.method1585(arg4, local67 + arg0 + local11 + 15, 16, Static112.anInt2928);
		Static24.method1585(arg4 + 1, local67 + 14 + arg0 + local11, 15, Static112.anInt2928);
	}
}
