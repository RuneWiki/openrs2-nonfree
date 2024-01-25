import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
	public static int anInt2581;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
	public static int anInt2579 = 0;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
	public static void method1913() {
		for (@Pc(3) int local3 = 0; local3 < Static404.aClass68ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static404.aClass68ArrayArray1[local3].length; local7++) {
				Static404.aClass68ArrayArray1[local3][local7] = Static221.aClass68_1;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
	public static void method1914() {
		Static440.method5948();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static332.aClass37Array1[local8].method1060();
		}
		Static210.method3244();
		Static238.method3614();
		System.gc();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
	public static void method1915(@OriginalArg(1) int arg0) {
		Static393.anInt6882 = arg0;
		Static277.aClass129_48.method3025();
	}
}
