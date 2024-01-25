import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static583 {

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "Lclient!mia;")
	public static Class233 aClass233_2;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_293 = new Class196(91, 4);

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(IB)I")
	public static int method7971(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!wq;III)V")
	public static void method7975(@OriginalArg(0) Class394 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte153 == 0) {
			arg0.anInt10486 = arg0.anInt10491;
		} else if (arg0.aByte153 == 1) {
			arg0.anInt10486 = arg0.anInt10491 + (arg2 - arg0.anInt10532) / 2;
		} else if (arg0.aByte153 == 2) {
			arg0.anInt10486 = arg2 - arg0.anInt10532 - arg0.anInt10491;
		} else if (arg0.aByte153 == 3) {
			arg0.anInt10486 = arg0.anInt10491 * arg2 >> 14;
		} else if (arg0.aByte153 == 4) {
			arg0.anInt10486 = (arg2 * arg0.anInt10491 >> 14) + (arg2 - arg0.anInt10532) / 2;
		} else {
			arg0.anInt10486 = arg2 - arg0.anInt10532 - (arg0.anInt10491 * arg2 >> 14);
		}
		if (arg0.aByte151 == 0) {
			arg0.anInt10494 = arg0.anInt10495;
		} else if (arg0.aByte151 == 1) {
			arg0.anInt10494 = arg0.anInt10495 + (arg1 - arg0.anInt10536) / 2;
		} else if (arg0.aByte151 == 2) {
			arg0.anInt10494 = arg1 - arg0.anInt10536 - arg0.anInt10495;
		} else if (arg0.aByte151 == 3) {
			arg0.anInt10494 = arg1 * arg0.anInt10495 >> 14;
		} else if (arg0.aByte151 == 4) {
			arg0.anInt10494 = (arg1 - arg0.anInt10536) / 2 + (arg0.anInt10495 * arg1 >> 14);
		} else {
			arg0.anInt10494 = arg1 - (arg1 * arg0.anInt10495 >> 14) - arg0.anInt10536;
		}
		if (!Static292.aBoolean301 || Static81.method1268(arg0).anInt7813 == 0 && arg0.anInt10479 != 0) {
			return;
		}
		if (arg0.anInt10494 < 0) {
			arg0.anInt10494 = 0;
		} else if (arg1 < arg0.anInt10536 + arg0.anInt10494) {
			arg0.anInt10494 = arg1 - arg0.anInt10536;
		}
		if (arg0.anInt10486 < 0) {
			arg0.anInt10486 = 0;
		} else if (arg0.anInt10532 + arg0.anInt10486 > arg2) {
			arg0.anInt10486 = arg2 - arg0.anInt10532;
		}
	}
}
