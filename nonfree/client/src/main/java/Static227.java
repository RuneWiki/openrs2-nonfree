import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static227 {

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
	public static int anInt5183;

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "Lclient!fea;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
	public static int anInt5187;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILclient!tp;II)V")
	public static void method4239(@OriginalArg(1) Class331 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte107 == 0) {
			arg0.anInt9528 = arg0.anInt9533;
		} else if (arg0.aByte107 == 1) {
			arg0.anInt9528 = (arg2 - arg0.anInt9553) / 2 + arg0.anInt9533;
		} else if (arg0.aByte107 == 2) {
			arg0.anInt9528 = arg2 - arg0.anInt9553 - arg0.anInt9533;
		} else if (arg0.aByte107 == 3) {
			arg0.anInt9528 = arg2 * arg0.anInt9533 >> 14;
		} else if (arg0.aByte107 == 4) {
			arg0.anInt9528 = (arg0.anInt9533 * arg2 >> 14) + (arg2 - arg0.anInt9553) / 2;
		} else {
			arg0.anInt9528 = arg2 - (arg2 * arg0.anInt9533 >> 14) - arg0.anInt9553;
		}
		if (arg0.aByte110 == 0) {
			arg0.anInt9541 = arg0.anInt9510;
		} else if (arg0.aByte110 == 1) {
			arg0.anInt9541 = (arg1 - arg0.anInt9505) / 2 + arg0.anInt9510;
		} else if (arg0.aByte110 == 2) {
			arg0.anInt9541 = arg1 - arg0.anInt9505 - arg0.anInt9510;
		} else if (arg0.aByte110 == 3) {
			arg0.anInt9541 = arg1 * arg0.anInt9510 >> 14;
		} else if (arg0.aByte110 == 4) {
			arg0.anInt9541 = (arg1 - arg0.anInt9505) / 2 + (arg1 * arg0.anInt9510 >> 14);
		} else {
			arg0.anInt9541 = arg1 - arg0.anInt9505 - (arg1 * arg0.anInt9510 >> 14);
		}
		if (!Static54.aBoolean127 || Static73.method1921(arg0).anInt6421 == 0 && arg0.anInt9490 != 0) {
			return;
		}
		if (arg0.anInt9541 < 0) {
			arg0.anInt9541 = 0;
		} else if (arg1 < arg0.anInt9505 + arg0.anInt9541) {
			arg0.anInt9541 = arg1 - arg0.anInt9505;
		}
		if (arg0.anInt9528 < 0) {
			arg0.anInt9528 = 0;
		} else if (arg2 < arg0.anInt9553 + arg0.anInt9528) {
			arg0.anInt9528 = arg2 - arg0.anInt9553;
			return;
		}
	}
}
