import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static231 {

	@OriginalMember(owner = "client!hca", name = "ib", descriptor = "[Lclient!ik;")
	public static final Class171_Sub1[] aClass171_Sub1Array1 = new Class171_Sub1[37];

	@OriginalMember(owner = "client!hca", name = "ob", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_75 = new Class186(134, 9);

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
	public static int anInt4426 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILclient!av;I)V")
	public static void method3630(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte15 == 0) {
			arg1.anInt574 = arg1.anInt572;
		} else if (arg1.aByte15 == 1) {
			arg1.anInt574 = arg1.anInt572 + (arg0 - arg1.anInt569) / 2;
		} else if (arg1.aByte15 == 2) {
			arg1.anInt574 = arg0 - arg1.anInt569 - arg1.anInt572;
		} else if (arg1.aByte15 == 3) {
			arg1.anInt574 = arg1.anInt572 * arg0 >> 14;
		} else if (arg1.aByte15 == 4) {
			arg1.anInt574 = (arg0 - arg1.anInt569) / 2 + (arg0 * arg1.anInt572 >> 14);
		} else {
			arg1.anInt574 = arg0 - (arg1.anInt572 * arg0 >> 14) - arg1.anInt569;
		}
		if (arg1.aByte16 == 0) {
			arg1.anInt524 = arg1.anInt564;
		} else if (arg1.aByte16 == 1) {
			arg1.anInt524 = arg1.anInt564 + (arg2 - arg1.anInt509) / 2;
		} else if (arg1.aByte16 == 2) {
			arg1.anInt524 = arg2 - arg1.anInt509 - arg1.anInt564;
		} else if (arg1.aByte16 == 3) {
			arg1.anInt524 = arg1.anInt564 * arg2 >> 14;
		} else if (arg1.aByte16 == 4) {
			arg1.anInt524 = (arg2 - arg1.anInt509) / 2 + (arg1.anInt564 * arg2 >> 14);
		} else {
			arg1.anInt524 = arg2 - arg1.anInt509 - (arg1.anInt564 * arg2 >> 14);
		}
		if (!Static632.aBoolean738 || Static87.method1164(arg1).anInt5450 == 0 && arg1.anInt532 != 0) {
			return;
		}
		if (arg1.anInt524 < 0) {
			arg1.anInt524 = 0;
		} else if (arg1.anInt524 + arg1.anInt509 > arg2) {
			arg1.anInt524 = arg2 - arg1.anInt509;
		}
		if (arg1.anInt574 < 0) {
			arg1.anInt574 = 0;
		} else if (arg1.anInt569 + arg1.anInt574 > arg0) {
			arg1.anInt574 = arg0 - arg1.anInt569;
			return;
		}
	}
}
