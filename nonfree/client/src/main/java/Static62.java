import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt1551 = 3;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
	public static int[] anIntArray316 = new int[200];

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public static int anInt1552 = 1;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_454 = Static13.method257(" x");

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!mc;")
	public static Class2_Sub2_Sub13 aClass2_Sub2_Sub13_1 = new Class2_Sub2_Sub13();

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!wc;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_3 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public static int anInt1554 = 0;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_455 = Static13.method257(" more options");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!f;")
	public static Class2_Sub2_Sub6 method1042(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub6 local10 = (Class2_Sub2_Sub6) Static55.aClass47_13.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static74.aClass5_24.method68(arg0, 12);
		local10 = new Class2_Sub2_Sub6();
		if (local20 != null) {
			local10.method523(new Class2_Sub3(local20));
		}
		local10.method522();
		Static55.aClass47_13.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method1043() {
		aClass2_Sub2_Sub13_1 = null;
		anIntArray316 = null;
		aClass2_Sub3_Sub1_3 = null;
		aClass40_454 = null;
		aClass40_455 = null;
	}
}
