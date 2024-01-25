import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static374 {

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array10;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_295 = new Class296(83, 8);

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_90 = new Class306("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
	public static int anInt6861 = -1;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBLclient!jq;I)V")
	public static void method5743(@OriginalArg(0) int arg0, @OriginalArg(2) Class156 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte60 == 0) {
			arg1.anInt4734 = arg1.anInt4681;
		} else if (arg1.aByte60 == 1) {
			arg1.anInt4734 = (arg2 - arg1.anInt4732) / 2 + arg1.anInt4681;
		} else if (arg1.aByte60 == 2) {
			arg1.anInt4734 = arg2 - arg1.anInt4681 - arg1.anInt4732;
		} else if (arg1.aByte60 == 3) {
			arg1.anInt4734 = arg2 * arg1.anInt4681 >> 14;
		} else if (arg1.aByte60 == 4) {
			arg1.anInt4734 = (arg2 - arg1.anInt4732) / 2 + (arg2 * arg1.anInt4681 >> 14);
		} else {
			arg1.anInt4734 = arg2 - arg1.anInt4732 - (arg2 * arg1.anInt4681 >> 14);
		}
		if (arg1.aByte62 == 0) {
			arg1.anInt4702 = arg1.anInt4706;
		} else if (arg1.aByte62 == 1) {
			arg1.anInt4702 = arg1.anInt4706 + (arg0 - arg1.anInt4673) / 2;
		} else if (arg1.aByte62 == 2) {
			arg1.anInt4702 = arg0 - arg1.anInt4673 - arg1.anInt4706;
		} else if (arg1.aByte62 == 3) {
			arg1.anInt4702 = arg1.anInt4706 * arg0 >> 14;
		} else if (arg1.aByte62 == 4) {
			arg1.anInt4702 = (arg0 - arg1.anInt4673) / 2 + (arg0 * arg1.anInt4706 >> 14);
		} else {
			arg1.anInt4702 = arg0 - (arg0 * arg1.anInt4706 >> 14) - arg1.anInt4673;
		}
		if (!Static54.aBoolean69 || Static67.method1228(arg1).anInt2505 == 0 && arg1.anInt4735 != 0) {
			return;
		}
		if (arg1.anInt4734 < 0) {
			arg1.anInt4734 = 0;
		} else if (arg1.anInt4732 + arg1.anInt4734 > arg2) {
			arg1.anInt4734 = arg2 - arg1.anInt4732;
		}
		if (arg1.anInt4702 < 0) {
			arg1.anInt4702 = 0;
		} else if (arg0 < arg1.anInt4702 + arg1.anInt4673) {
			arg1.anInt4702 = arg0 - arg1.anInt4673;
		}
	}
}
