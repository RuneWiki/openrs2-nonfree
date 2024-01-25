import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!li;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!fc;")
	public static Class73 aClass73_2;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_140 = new Class129(67, 4);

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "[I")
	public static final int[] anIntArray375 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
	public static final int anInt5080 = 4;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public static int anInt5081 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIBIII)V")
	public static void method4009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static216.aClass1_Sub1_1.anInt4512 != 0 && arg3 != 0 && Static344.anInt5625 < 50 && arg1 != -1) {
			Static113.aClass75Array1[Static344.anInt5625++] = new Class75((byte) 1, arg1, arg3, arg4, arg0, arg2);
		}
	}
}
