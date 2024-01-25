import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
	public static int anInt1125;

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
	public static int anInt1127;

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_18 = new Class387(76, 0);

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray53 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)Z")
	public static boolean method1121(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIBI)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static395.anInt6759;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static34.anInt621 = arg1;
			Static471.anInt7983 = arg3;
			Static395.anInt6759 = 2;
			Static243.anInt4196 = arg0;
			Static297.anInt5142 = arg2;
		} else if (local5 == 2) {
			if (arg0 < Static243.anInt4196) {
				Static243.anInt4196 = arg0;
			}
			if (arg3 < Static471.anInt7983) {
				Static471.anInt7983 = arg3;
			}
			if (arg1 > Static34.anInt621) {
				Static34.anInt621 = arg1;
			}
			if (arg2 > Static297.anInt5142) {
				Static297.anInt5142 = arg2;
			}
		}
	}
}
