import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
	public static int anInt2906;

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
	public static int anInt2913;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public static int anInt2892 = 20;

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "[I")
	public static int[] anIntArray303 = new int[25];

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "Lclient!qh;")
	public static Class93 aClass93_85 = null;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBIIII)V")
	public static void method2356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg1; local3 <= arg0; local3++) {
			Static107.method1641(arg2, arg4, Static139.anIntArrayArray21[local3], arg3);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!qh;)Lclient!qh;")
	public static Class93 method2359(@OriginalArg(1) Class93 arg0) {
		@Pc(14) Class93 local14 = Static35.method550(arg0);
		if (local14 == null) {
			local14 = arg0.aClass93_105;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)Z")
	public static boolean method2360() {
		if (Static112.anInt2225 != 0) {
			try {
				if ((Boolean) Static213.aClass50_1339.method1217(Static4.aClass87_1.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(31) Throwable local31) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	public static void method2361() {
		Static150.aClass84_25.method2576();
		Static111.aClass84_22.method2576();
		Static199.aClass84_33.method2576();
	}
}
