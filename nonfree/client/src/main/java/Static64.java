import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!cw", name = "P", descriptor = "Lclient!qd;")
	public static Class190 aClass190_2;

	@OriginalMember(owner = "client!cw", name = "Q", descriptor = "[I")
	public static final int[] anIntArray93 = new int[500];

	@OriginalMember(owner = "client!cw", name = "R", descriptor = "J")
	public static long aLong54 = 0L;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(II)V")
	public static void method1272(@OriginalArg(0) int arg0) {
		Static158.anIntArray257 = new int[arg0];
		Static83.anIntArray161 = new int[arg0];
		Static116.anIntArray477 = new int[arg0];
		Static430.anIntArray518 = new int[arg0];
		Static348.anIntArray563 = new int[arg0];
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Z")
	public static boolean method1273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static413.method3224(arg1, arg0)) {
			return (arg1 & 0xB000) != 0 | Static320.method4653(arg1, arg0) | Static414.method5561(arg1, arg0) ? true : (Static79.method1403(arg0, arg1) | Static436.method5786(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
