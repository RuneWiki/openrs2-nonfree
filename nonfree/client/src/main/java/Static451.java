import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static451 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!db;")
	public static final Class64 aClass64_493 = new Class64(56, 7);

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt9796 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!gba;BI)V")
	public static void method8012(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte40 == 0) {
			arg1.anInt3458 = arg1.anInt3473;
		} else if (arg1.aByte40 == 1) {
			arg1.anInt3458 = arg1.anInt3473 + (arg0 - arg1.anInt3481) / 2;
		} else if (arg1.aByte40 == 2) {
			arg1.anInt3458 = arg0 - arg1.anInt3481 - arg1.anInt3473;
		} else if (arg1.aByte40 == 3) {
			arg1.anInt3458 = arg0 * arg1.anInt3473 >> 14;
		} else if (arg1.aByte40 == 4) {
			arg1.anInt3458 = (arg1.anInt3473 * arg0 >> 14) + (arg0 - arg1.anInt3481) / 2;
		} else {
			arg1.anInt3458 = arg0 - (arg0 * arg1.anInt3473 >> 14) - arg1.anInt3481;
		}
		if (arg1.aByte41 == 0) {
			arg1.anInt3456 = arg1.anInt3447;
		} else if (arg1.aByte41 == 1) {
			arg1.anInt3456 = (arg2 - arg1.anInt3474) / 2 + arg1.anInt3447;
		} else if (arg1.aByte41 == 2) {
			arg1.anInt3456 = arg2 - arg1.anInt3447 - arg1.anInt3474;
		} else if (arg1.aByte41 == 3) {
			arg1.anInt3456 = arg1.anInt3447 * arg2 >> 14;
		} else if (arg1.aByte41 == 4) {
			arg1.anInt3456 = (arg1.anInt3447 * arg2 >> 14) + (arg2 - arg1.anInt3474) / 2;
		} else {
			arg1.anInt3456 = arg2 - arg1.anInt3474 - (arg1.anInt3447 * arg2 >> 14);
		}
		if (!Static126.aBoolean235 || Static69.method1233(arg1).anInt5878 == 0 && arg1.anInt3519 != 0) {
			return;
		}
		if (arg1.anInt3456 < 0) {
			arg1.anInt3456 = 0;
		} else if (arg2 < arg1.anInt3456 + arg1.anInt3474) {
			arg1.anInt3456 = arg2 - arg1.anInt3474;
		}
		if (arg1.anInt3458 < 0) {
			arg1.anInt3458 = 0;
		} else if (arg1.anInt3481 + arg1.anInt3458 > arg0) {
			arg1.anInt3458 = arg0 - arg1.anInt3481;
		}
	}
}
