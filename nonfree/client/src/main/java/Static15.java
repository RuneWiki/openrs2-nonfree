import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "J")
	public static long aLong18;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public static int anInt285 = -1;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)Lclient!fl;")
	public static Class82 method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static159.aClass82ArrayArrayArray2[0][arg1][arg2] != null && Static159.aClass82ArrayArrayArray2[0][arg1][arg2].aClass82_1 != null;
			if (local28 && arg0 >= Static97.anInt1709 - 1) {
				return null;
			}
			Static410.method5129(arg0, arg1, arg2);
		}
		return Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public static void method239() {
		if (Static260.aClass77_5 != null) {
			Static260.aClass77_5.method4264();
		}
		if (Static343.aClass77_4 != null) {
			Static343.aClass77_4.method4264();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!vg;)V")
	public static void method240(@OriginalArg(1) Class250 arg0) {
		if (arg0.anInt7009 == 5 && arg0.anInt7030 != -1) {
			Static421.method5244(arg0, Static213.aClass128_22);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)V")
	public static void method241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static266.method2725(arg1)) {
			Static355.method4563(arg0, Static369.aClass250ArrayArray5[arg1]);
		}
	}
}
