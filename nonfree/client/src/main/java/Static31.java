import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "[Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3[] aClass1_Sub1_Sub5_Sub3Array3;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_5;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!dd;")
	public static Class19 aClass19_28 = new Class19(128);

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public static int anInt799 = 0;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!rd;")
	private static Class64 aClass64_491 = Static69.method1153("Bad session id)3");

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_488 = aClass64_491;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt801 = 0;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_489 = Static69.method1153("Hidden)2");

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	public static int anInt802 = -1;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_490 = Static69.method1153("scrollbar");

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	public static int anInt803 = 255;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!rd;")
	private static Class64 aClass64_493 = Static69.method1153("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_492 = aClass64_493;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!rd;")
	public static Class64 aClass64_494 = Static69.method1153("Entfernen");

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	public static int anInt805 = 0;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public static void method547() {
		aClass64_491 = null;
		aClass64_492 = null;
		anIntArrayArray6 = null;
		aClass64_488 = null;
		aClass64_489 = null;
		aClass64_494 = null;
		aClass19_28 = null;
		aClass1_Sub1_Sub5_Sub3_5 = null;
		aClass64_490 = null;
		aByteArrayArray2 = null;
		aClass64_493 = null;
		aClass1_Sub1_Sub5_Sub3Array3 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!nd;I)I")
	public static int method548(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		@Pc(18) Class1_Sub13 local18 = (Class1_Sub13) Static10.aClass58_1.method1380(((long) arg0.anInt1717 << 1572721824) + ((long) arg0.anInt1742));
		return local18 == null ? arg0.anInt1748 : local18.anInt2555;
	}
}
