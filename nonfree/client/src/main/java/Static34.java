import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_21 = new Class56(1, -1);

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method545() {
		if (Static237.aClass258_3.aBoolean524 && Static229.aClass51_2.anInt1589 != -1) {
			Static323.method4687(Static229.aClass51_2.anInt1589, Static229.aClass51_2.aString8);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)I")
	public static int method546(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return local41 + (arg0 & 0xFF80);
		}
	}
}
