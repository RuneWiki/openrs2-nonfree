import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!qf", name = "Ib", descriptor = "Lclient!ps;")
	public static Class257 aClass257_4;

	@OriginalMember(owner = "client!qf", name = "Rb", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array18;

	@OriginalMember(owner = "client!qf", name = "Nb", descriptor = "I")
	public static int anInt7365 = 0;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(IB)Lclient!vf;")
	public static Class342 method6079(@OriginalArg(0) int arg0) {
		@Pc(18) Class342[] local18 = Static151.method2880();
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			if (arg0 == local18[local20].anInt9214) {
				return local18[local20];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZII)Z")
	public static boolean method6083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static515.method7130(arg0, arg1) : Static280.method4617(arg0, arg1);
		return local22 | (arg1 & 0x10000) != 0 | Static294.method4725(arg1, arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
	public static boolean method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZII)V")
	public static void method6085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static445.anInt7719 == 1) {
			Static219.aClass58Array10[Static212.anInt4275 / 100].method7666(Static404.anInt7179 - 8, Static499.anInt8329 + -8);
		}
		if (Static445.anInt7719 == 2) {
			Static219.aClass58Array10[Static212.anInt4275 / 100 + 4].method7666(Static404.anInt7179 - 8, Static499.anInt8329 + -8);
		}
		Static194.method3520();
	}
}
