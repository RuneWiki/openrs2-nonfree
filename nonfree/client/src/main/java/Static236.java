import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public static int anInt4213 = 0;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_115 = new Class12(24, -1);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!lr;IIIB)V")
	public static void method3395(@OriginalArg(0) Class25_Sub5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray283[0];
		@Pc(15) int local15 = arg0.anIntArray284[0];
		if (local10 < 0 || Static296.anInt5187 <= local10 || local15 < 0 || local15 >= Static206.anInt3607 || (arg2 < 0 || Static296.anInt5187 <= arg2 || arg1 < 0 || Static206.anInt3607 <= arg1)) {
			return;
		}
		@Pc(82) int local82 = Static262.method3695(arg1, true, local10, 0, Static334.anIntArray390, arg2, Static81.anIntArray113, local15, 0, 0, arg0.method3427(), -4, Static447.aClass14Array3[arg0.aByte94], 0);
		if (local82 >= 1 && local82 <= 3) {
			for (@Pc(94) int local94 = 0; local94 < local82 - 1; local94++) {
				arg0.method3439(Static334.anIntArray390[local94], (byte) 2, Static81.anIntArray113[local94]);
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z")
	public static boolean method3396() {
		if (Static330.aBoolean639) {
			try {
				if ((Boolean) Static461.method3101(Static183.aClass83_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}
}
