import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Lclient!wu;")
	public static Class380 aClass380_22;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
	public static int anInt1416;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	public static int anInt1412 = 0;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public static int anInt1413 = 0;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_7 = new Class109();

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
	public static final int[] anIntArray111 = new int[256];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)B")
	public static byte method1107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public static void method1108() {
		for (@Pc(10) Class2_Sub2_Sub21 local10 = (Class2_Sub2_Sub21) Static616.aClass109_73.method2325(); local10 != null; local10 = (Class2_Sub2_Sub21) Static616.aClass109_73.method2318()) {
			@Pc(17) Class13_Sub1_Sub1_Sub2 local17 = local10.aClass13_Sub1_Sub1_Sub2_1;
			if (local17.aBoolean377) {
				local10.method8653();
				local17.method4505();
			} else if (Static262.anInt5597 >= local17.anInt5301) {
				local17.method4502(Static544.anInt9305);
				if (local17.aBoolean377) {
					local10.method8653();
				} else {
					Static545.method7521(local17, true);
				}
			}
		}
	}
}
