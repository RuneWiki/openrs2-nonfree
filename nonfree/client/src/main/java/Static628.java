import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static628 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!qga;I)V")
	public static void method8818(@OriginalArg(1) int arg0, @OriginalArg(2) Class299 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte109 == 0) {
			arg1.anInt8534 = arg1.anInt8532;
		} else if (arg1.aByte109 == 1) {
			arg1.anInt8534 = arg1.anInt8532 + (arg2 - arg1.anInt8573) / 2;
		} else if (arg1.aByte109 == 2) {
			arg1.anInt8534 = arg2 - arg1.anInt8573 - arg1.anInt8532;
		} else if (arg1.aByte109 == 3) {
			arg1.anInt8534 = arg2 * arg1.anInt8532 >> 14;
		} else if (arg1.aByte109 == 4) {
			arg1.anInt8534 = (arg2 - arg1.anInt8573) / 2 + (arg1.anInt8532 * arg2 >> 14);
		} else {
			arg1.anInt8534 = arg2 - (arg1.anInt8532 * arg2 >> 14) - arg1.anInt8573;
		}
		if (arg1.aByte107 == 0) {
			arg1.anInt8603 = arg1.anInt8529;
		} else if (arg1.aByte107 == 1) {
			arg1.anInt8603 = (arg0 - arg1.anInt8547) / 2 + arg1.anInt8529;
		} else if (arg1.aByte107 == 2) {
			arg1.anInt8603 = arg0 - arg1.anInt8529 - arg1.anInt8547;
		} else if (arg1.aByte107 == 3) {
			arg1.anInt8603 = arg0 * arg1.anInt8529 >> 14;
		} else if (arg1.aByte107 == 4) {
			arg1.anInt8603 = (arg0 * arg1.anInt8529 >> 14) + (arg0 - arg1.anInt8547) / 2;
		} else {
			arg1.anInt8603 = arg0 - (arg0 * arg1.anInt8529 >> 14) - arg1.anInt8547;
		}
		if (!Static123.aBoolean140 || Static80.method1360(arg1).anInt453 == 0 && arg1.anInt8610 != 0) {
			return;
		}
		if (arg1.anInt8534 < 0) {
			arg1.anInt8534 = 0;
		} else if (arg1.anInt8573 + arg1.anInt8534 > arg2) {
			arg1.anInt8534 = arg2 - arg1.anInt8573;
		}
		if (arg1.anInt8603 < 0) {
			arg1.anInt8603 = 0;
		} else if (arg1.anInt8603 + arg1.anInt8547 > arg0) {
			arg1.anInt8603 = arg0 - arg1.anInt8547;
			return;
		}
	}
}
