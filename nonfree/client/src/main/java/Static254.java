import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static254 {

	@OriginalMember(owner = "client!kn", name = "P", descriptor = "Lclient!kea;")
	public static Class161 aClass161_56;

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "Lclient!lk;")
	public static final Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLclient!qf;II)V")
	public static void method4345(@OriginalArg(1) Class245 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte79 == 0) {
			arg0.anInt7260 = arg0.anInt7257;
		} else if (arg0.aByte79 == 1) {
			arg0.anInt7260 = (arg2 - arg0.anInt7249) / 2 + arg0.anInt7257;
		} else if (arg0.aByte79 == 2) {
			arg0.anInt7260 = arg2 - arg0.anInt7257 - arg0.anInt7249;
		} else if (arg0.aByte79 == 3) {
			arg0.anInt7260 = arg2 * arg0.anInt7257 >> 14;
		} else if (arg0.aByte79 == 4) {
			arg0.anInt7260 = (arg2 * arg0.anInt7257 >> 14) + (arg2 - arg0.anInt7249) / 2;
		} else {
			arg0.anInt7260 = arg2 - (arg0.anInt7257 * arg2 >> 14) - arg0.anInt7249;
		}
		if (arg0.aByte80 == 0) {
			arg0.anInt7295 = arg0.anInt7283;
		} else if (arg0.aByte80 == 1) {
			arg0.anInt7295 = (arg1 - arg0.anInt7229) / 2 + arg0.anInt7283;
		} else if (arg0.aByte80 == 2) {
			arg0.anInt7295 = arg1 - arg0.anInt7229 - arg0.anInt7283;
		} else if (arg0.aByte80 == 3) {
			arg0.anInt7295 = arg1 * arg0.anInt7283 >> 14;
		} else if (arg0.aByte80 == 4) {
			arg0.anInt7295 = (arg0.anInt7283 * arg1 >> 14) + (arg1 - arg0.anInt7229) / 2;
		} else {
			arg0.anInt7295 = arg1 - arg0.anInt7229 - (arg0.anInt7283 * arg1 >> 14);
		}
		if (!Static362.aBoolean430 || Static63.method1295(arg0).anInt1859 == 0 && arg0.anInt7223 != 0) {
			return;
		}
		if (arg0.anInt7260 < 0) {
			arg0.anInt7260 = 0;
		} else if (arg2 < arg0.anInt7249 + arg0.anInt7260) {
			arg0.anInt7260 = arg2 - arg0.anInt7249;
		}
		if (arg0.anInt7295 < 0) {
			arg0.anInt7295 = 0;
		} else if (arg0.anInt7229 + arg0.anInt7295 > arg1) {
			arg0.anInt7295 = arg1 - arg0.anInt7229;
			return;
		}
	}
}
