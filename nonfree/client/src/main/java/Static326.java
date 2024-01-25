import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static326 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_24 = new Class107(37, -2);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBLclient!uq;I)V")
	public static void method570(@OriginalArg(0) int arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte93 == 0) {
			arg1.anInt6690 = arg1.anInt6661;
		} else if (arg1.aByte93 == 1) {
			arg1.anInt6690 = arg1.anInt6661 + (arg2 - arg1.anInt6687) / 2;
		} else if (arg1.aByte93 == 2) {
			arg1.anInt6690 = arg2 - arg1.anInt6687 - arg1.anInt6661;
		} else if (arg1.aByte93 == 3) {
			arg1.anInt6690 = arg1.anInt6661 * arg2 >> 14;
		} else if (arg1.aByte93 == 4) {
			arg1.anInt6690 = (arg2 - arg1.anInt6687) / 2 + (arg1.anInt6661 * arg2 >> 14);
		} else {
			arg1.anInt6690 = arg2 - arg1.anInt6687 - (arg1.anInt6661 * arg2 >> 14);
		}
		if (arg1.aByte95 == 0) {
			arg1.anInt6723 = arg1.anInt6669;
		} else if (arg1.aByte95 == 1) {
			arg1.anInt6723 = (arg0 - arg1.anInt6677) / 2 + arg1.anInt6669;
		} else if (arg1.aByte95 == 2) {
			arg1.anInt6723 = arg0 - arg1.anInt6669 - arg1.anInt6677;
		} else if (arg1.aByte95 == 3) {
			arg1.anInt6723 = arg0 * arg1.anInt6669 >> 14;
		} else if (arg1.aByte95 == 4) {
			arg1.anInt6723 = (arg1.anInt6669 * arg0 >> 14) + (arg0 - arg1.anInt6677) / 2;
		} else {
			arg1.anInt6723 = arg0 - arg1.anInt6677 - (arg1.anInt6669 * arg0 >> 14);
		}
		if (!Static313.aBoolean387) {
			return;
		}
		if (Static57.method1248(arg1).anInt2012 == 0 && arg1.anInt6654 != 0) {
			return;
		}
		if (arg1.anInt6723 < 0) {
			arg1.anInt6723 = 0;
		} else if (arg1.anInt6723 + arg1.anInt6677 > arg0) {
			arg1.anInt6723 = arg0 - arg1.anInt6677;
		}
		if (arg1.anInt6690 < 0) {
			arg1.anInt6690 = 0;
			return;
		}
		if (arg2 < arg1.anInt6687 + arg1.anInt6690) {
			arg1.anInt6690 = arg2 - arg1.anInt6687;
			return;
		}
	}
}
