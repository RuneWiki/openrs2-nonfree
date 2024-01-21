import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!be", name = "z", descriptor = "Z")
	public static boolean aBoolean270;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "I")
	public static int anInt2984;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "I")
	public static int anInt2985;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "Lclient!ea;")
	public static Class20 aClass20_59;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_930 = Static60.method1113("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Lclient!aa;")
	public static Class2 aClass2_32 = new Class2();

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	public static int anInt2982 = -1;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "I")
	public static int anInt2983 = 0;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "Lclient!ec;")
	public static Class22 aClass22_931 = Static60.method1113("Mem:");

	@OriginalMember(owner = "client!be", name = "F", descriptor = "I")
	public static int anInt2986 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
	public static boolean method1907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	public static void method1908() {
		aClass2_32 = null;
		aClass20_59 = null;
		aClass22_930 = null;
		aClass22_931 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIII)V")
	public static void method1909(@OriginalArg(0) boolean arg0) {
		Static28.anInt649 = 2;
		Static48.aBoolean123 = arg0;
		Static116.anInt2873 = 22050;
	}
}
