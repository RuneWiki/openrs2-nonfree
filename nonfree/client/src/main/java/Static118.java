import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "Lclient!ih;")
	public static final Class92 aClass92_4 = new Class92(64);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	public static void method2489() {
		Static7.anImage1 = null;
		Static63.aFont2 = null;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
	public static void method2491() {
		Static232.method4269(25);
		Static280.method4867();
		System.gc();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method2492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static279.method4856(arg3)) {
			Static34.method849(arg7, -1, arg5, arg2, Static348.aClass12ArrayArray1[arg3], arg0, arg4, arg6, arg1);
		} else if (arg2 == -1) {
			for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
				Static223.aBooleanArray28[local27] = true;
			}
		} else {
			Static223.aBooleanArray28[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIIIZ)V")
	public static void method2494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static279.method4856(arg1)) {
			Static249.method4472(Static348.aClass12ArrayArray1[arg1], arg2, arg0, -1, arg3);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
	public static void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static355.anInt6764 = arg3;
		Static240.anInt1897 = arg0;
		Static251.anInt4676 = arg2;
		Static216.anInt4585 = arg1;
	}
}
