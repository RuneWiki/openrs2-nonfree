import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static528 {

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_175 = new Class126(97, 9);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!kh;IZ)V")
	public static void method7386(@OriginalArg(0) int arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte82 == 0) {
			arg1.anInt5592 = arg1.anInt5601;
		} else if (arg1.aByte82 == 1) {
			arg1.anInt5592 = (arg2 - arg1.anInt5639) / 2 + arg1.anInt5601;
		} else if (arg1.aByte82 == 2) {
			arg1.anInt5592 = arg2 - arg1.anInt5601 - arg1.anInt5639;
		} else if (arg1.aByte82 == 3) {
			arg1.anInt5592 = arg2 * arg1.anInt5601 >> 14;
		} else if (arg1.aByte82 == 4) {
			arg1.anInt5592 = (arg2 - arg1.anInt5639) / 2 + (arg2 * arg1.anInt5601 >> 14);
		} else {
			arg1.anInt5592 = arg2 - (arg2 * arg1.anInt5601 >> 14) - arg1.anInt5639;
		}
		if (arg1.aByte84 == 0) {
			arg1.anInt5680 = arg1.anInt5589;
		} else if (arg1.aByte84 == 1) {
			arg1.anInt5680 = (arg0 - arg1.anInt5630) / 2 + arg1.anInt5589;
		} else if (arg1.aByte84 == 2) {
			arg1.anInt5680 = arg0 - arg1.anInt5630 - arg1.anInt5589;
		} else if (arg1.aByte84 == 3) {
			arg1.anInt5680 = arg0 * arg1.anInt5589 >> 14;
		} else if (arg1.aByte84 == 4) {
			arg1.anInt5680 = (arg1.anInt5589 * arg0 >> 14) + (arg0 - arg1.anInt5630) / 2;
		} else {
			arg1.anInt5680 = arg0 - arg1.anInt5630 - (arg0 * arg1.anInt5589 >> 14);
		}
		if (!Static605.aBoolean708) {
			return;
		}
		if (Static82.method1754(arg1).anInt19 == 0 && arg1.anInt5643 != 0) {
			return;
		}
		if (arg1.anInt5592 < 0) {
			arg1.anInt5592 = 0;
		} else if (arg1.anInt5592 + arg1.anInt5639 > arg2) {
			arg1.anInt5592 = arg2 - arg1.anInt5639;
		}
		if (arg1.anInt5680 < 0) {
			arg1.anInt5680 = 0;
			return;
		}
		if (arg1.anInt5630 + arg1.anInt5680 > arg0) {
			arg1.anInt5680 = arg0 - arg1.anInt5630;
			return;
		}
	}
}
