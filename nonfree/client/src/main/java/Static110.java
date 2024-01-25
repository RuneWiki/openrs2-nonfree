import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!el", name = "w", descriptor = "I")
	public static int anInt2572;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_37 = new Class186(19, 8);

	@OriginalMember(owner = "client!el", name = "D", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_9 = new Class33(14, 6);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	public static void method2414(@OriginalArg(1) int arg0) {
		if (Static41.anInt1359 == 1) {
			Static450.anInt7568 = arg0;
		} else if (Static41.anInt1359 == 2 || Static41.anInt1359 == 3) {
			Static243.anInt4679 = arg0;
		}
	}
}
