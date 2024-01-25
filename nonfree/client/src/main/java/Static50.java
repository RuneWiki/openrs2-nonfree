import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!ae;")
	public static Class4 aClass4_5;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "I")
	public static int anInt1114;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_31 = new Class119(4);

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt1115 = -1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public static void method1196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0];
		@Pc(13) int local13 = Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0];
		if (Static41.anInt830 == 1) {
			if (!Static73.method3198(0, local8, false, 0, 1, arg0, -2, arg1, local13, 1)) {
				Static73.method3198(0, local8, false, 0, 1, arg0, -3, arg1, local13, 1);
			}
		} else if (!Static73.method3198(0, local8, false, 0, 1, arg0, -3, arg1, local13, 1)) {
			Static73.method3198(0, local8, false, 0, 1, arg0, -2, arg1, local13, 1);
		}
	}
}
