import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public static int anInt9573;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	public static final int[] anIntArray583 = new int[5];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method7918() {
		if (Static581.anInt9720 == 9) {
			Static182.method3694(5);
		} else if (Static581.anInt9720 == 5 || Static581.anInt9720 == 6) {
			Static182.method3694(3);
		} else if (Static581.anInt9720 == 12) {
			Static182.method3694(3);
			return;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
	public static boolean method7919() {
		@Pc(10) Class3_Sub52 local10 = (Class3_Sub52) Static614.aClass276_64.method6907();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt10553; local16++) {
			if (local10.aClass376Array1[local16] != null && local10.aClass376Array1[local16].anInt10510 == 0) {
				return false;
			}
			if (local10.aClass376Array2[local16] != null && local10.aClass376Array2[local16].anInt10510 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIIB)V")
	public static void method7920(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 0) {
			Static234.method4503(false);
		} else {
			Static27.anInt475 = Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152();
			Static559.method7893(true, 0);
		}
		Static291.anInt5922 = arg3;
		Static623.anInt10314 = arg2;
		Static173.aBoolean847 = arg0;
		Static361.method2162(arg1);
	}
}
