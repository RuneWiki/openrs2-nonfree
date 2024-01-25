import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array17;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_97 = new Class267("M", "M", "M", "M");

	@OriginalMember(owner = "client!um", name = "o", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_373 = new Class123(57, 8);

	@OriginalMember(owner = "client!um", name = "q", descriptor = "I")
	public static final int anInt7256 = 328;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
	public static void method5968() {
		if (Static388.aClass193_6 != Static170.aClass193_5) {
			try {
				Static456.method3806("tbrefresh", Static448.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIB)V")
	public static void method5975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg1);
		@Pc(17) int local17 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg2);
		@Pc(25) int local25 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg4);
		@Pc(36) int local36 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3);
		for (@Pc(38) int local38 = local11; local38 <= local17; local38++) {
			Static298.method4405(Static62.anIntArrayArray7[local38], arg0, local36, local25);
		}
	}
}
