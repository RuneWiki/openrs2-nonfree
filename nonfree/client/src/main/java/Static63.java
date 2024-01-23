import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
	public static int anInt1367;

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
	public static int anInt1368;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	public static int anInt1366 = 0;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
	public static int anInt1369 = -1;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
	public static int anInt1370 = 0;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "Lclient!ci;")
	public static Class26 aClass26_12 = new Class26();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public static void method1119() {
		Static10.aClass89_2.method2265();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!th;I)V")
	public static void method1120(@OriginalArg(0) Class168 arg0) {
		Static41.aClass168_33 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V")
	public static void method1121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub3_Sub22 local13 = Static271.method4108(11, arg1);
		local13.method4468();
		local13.anInt5852 = arg2;
		local13.anInt5849 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBZ)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static99.method1656(arg0)) {
			Static116.method1871(arg3, -1, arg1, arg2, Static34.aClass191ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V")
	public static void method1124(@OriginalArg(1) boolean arg0) {
		if (Static60.aBoolean91 != arg0) {
			Static60.aBoolean91 = arg0;
			Static120.method4727();
		}
	}
}
