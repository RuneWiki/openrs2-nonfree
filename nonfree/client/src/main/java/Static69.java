import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "C")
	public static char aChar1;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "S")
	public static short aShort13 = 32767;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString37 = "wave:";

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public static int anInt1273 = 1;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public static void method1047(@OriginalArg(1) int arg0) {
		Static79.anInt1519 = arg0;
		Static17.anInt372 = 3;
		Static120.anInt2640 = 20;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIBI)V")
	public static void method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static10.aClass59Array1[0].method3790(arg0, arg1);
		Static10.aClass59Array1[1].method3790(arg0, arg1 + arg2 - 16);
		@Pc(36) int local36 = (arg2 - 32) * arg2 / arg3;
		if (local36 < 8) {
			local36 = 8;
		}
		@Pc(56) int local56 = arg4 * (arg2 - local36 - 32) / (arg3 - arg2);
		if (!Static178.aBoolean216) {
			Static166.method2627(arg0, arg1 + 16, 16, arg2 - 32, Static184.anInt3604);
			Static166.method2627(arg0, arg1 + local56 + 16, 16, local36, Static201.anInt3918);
			Static166.method2608(arg0, arg1 + local56 + 16, local36, Static67.anInt1260);
			Static166.method2608(arg0 + 1, local56 + 16 + arg1, local36, Static67.anInt1260);
			Static166.method2615(arg0, local56 + arg1 + 16, 16, Static67.anInt1260);
			Static166.method2615(arg0, local56 + arg1 + 17, 16, Static67.anInt1260);
			Static166.method2608(arg0 + 15, arg1 - -local56 + 16, local36, Static281.anInt5336);
			Static166.method2608(arg0 + 14, arg1 + 17 + local56, local36 - 1, Static281.anInt5336);
			Static166.method2615(arg0, local36 + local56 + arg1 + 15, 16, Static281.anInt5336);
			Static166.method2615(arg0 + 1, local56 + (arg1 + 14 - -local36), 15, Static281.anInt5336);
			return;
		}
		Static186.method2968(arg0, arg1 + 16, 16, arg2 - 32, Static184.anInt3604);
		Static186.method2968(arg0, local56 + arg1 + 16, 16, local36, Static201.anInt3918);
		Static186.method2962(arg0, arg1 + local56 + 16, local36, Static67.anInt1260);
		Static186.method2962(arg0 + 1, local56 + 16 + arg1, local36, Static67.anInt1260);
		Static186.method2960(arg0, arg1 + local56 + 16, 16, Static67.anInt1260);
		Static186.method2960(arg0, local56 + arg1 + 17, 16, Static67.anInt1260);
		Static186.method2962(arg0 + 15, local56 + 16 + arg1, local36, Static281.anInt5336);
		Static186.method2962(arg0 + 14, local56 + 17 + arg1, local36 - 1, Static281.anInt5336);
		Static186.method2960(arg0, local56 + arg1 + local36 + 15, 16, Static281.anInt5336);
		Static186.method2960(arg0 + 1, local36 + arg1 - -14 - -local56, 15, Static281.anInt5336);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	public static void method1049() {
		aString37 = null;
	}
}
