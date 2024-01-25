import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt5515;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!sc;")
	public static Class223 aClass223_4;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!gi;I)V")
	public static void method4379(@OriginalArg(1) int arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) int arg2) {
		if (Static125.aClass93_11 != null || Static45.aBoolean34 || (arg1 == null || Static361.method5087(arg1) == null)) {
			return;
		}
		Static125.aClass93_11 = arg1;
		Static148.aClass93_8 = Static361.method5087(arg1);
		Static191.aBoolean214 = false;
		Static86.anInt1457 = arg2;
		Static321.anInt5761 = arg0;
		Static383.anInt6622 = 0;
	}
}
