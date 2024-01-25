import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!ya;")
	public static Class135 aClass135_4;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "Lclient!qn;")
	public static Class211 aClass211_46;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "J")
	public static volatile long aLong87 = 0L;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	public static void method2390() {
		Static448.method5935(Static291.aClass146_65);
		Static247.aClass4_Sub9_Sub2_2.method5029(Static318.anInt5169);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method2391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static131.method1881(arg1)) {
			return;
		}
		if (Static185.aClass110ArrayArray1[arg1] == null) {
			Static55.method769(Static412.aClass110ArrayArray2[arg1], -1, arg5, arg2, arg7, arg6, arg4, arg3, arg0, arg8);
		} else {
			Static55.method769(Static185.aClass110ArrayArray1[arg1], -1, arg5, arg2, arg7, arg6, arg4, arg3, arg0, arg8);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
	public static int method2393(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public static void method2394() {
		if (Static8.anInt119 == 8) {
			Static119.method4569(4);
		} else if (Static8.anInt119 == 4 || Static8.anInt119 == 5) {
			Static119.method4569(2);
		} else if (Static8.anInt119 == 11) {
			Static119.method4569(2);
		}
	}
}
