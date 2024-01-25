import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Lclient!i;")
	public static Class111 aClass111_9;

	@OriginalMember(owner = "client!ae", name = "Ab", descriptor = "I")
	public static int anInt7919;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Lclient!ci;")
	public static Class36 aClass36_5 = null;

	@OriginalMember(owner = "client!ae", name = "wb", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_153 = new Class92(76, -1);

	@OriginalMember(owner = "client!ae", name = "Eb", descriptor = "I")
	public static int anInt7923 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBIII)V")
	public static void method6463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static312.anInt5455 == 1) {
			Static404.aClass87Array17[Static49.anInt1319 / 100].method6567(Static391.anInt6975 - 8, Static248.anInt7514 + -8);
		}
		if (Static312.anInt5455 == 2) {
			Static404.aClass87Array17[Static49.anInt1319 / 100 + 4].method6567(Static391.anInt6975 - 8, Static248.anInt7514 - 8);
		}
		Static3.method69();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BC)Z")
	public static boolean method6476(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "(I)V")
	public static void method6482(@OriginalArg(0) int arg0) {
		Static435.anInt7711 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static229.anInt4189; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static61.anInt1698; local6++) {
				if (Static409.aClass101ArrayArrayArray3[arg0][local3][local6] == null) {
					Static409.aClass101ArrayArrayArray3[arg0][local3][local6] = new Class101(arg0, local3, local6);
				}
			}
		}
	}
}
