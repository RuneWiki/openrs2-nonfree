import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array2;

	@OriginalMember(owner = "client!uo", name = "Q", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!uo", name = "R", descriptor = "Z")
	private static boolean aBoolean79;

	@OriginalMember(owner = "client!uo", name = "S", descriptor = "Z")
	private static boolean aBoolean80;

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "[I")
	public static final int[] anIntArray128 = new int[5];

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
	public static int anInt882 = 0;

	@OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
	public static int anInt886 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method861(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 < 128 || arg4 < 128 || arg1 > Static392.anInt6751 * 128 - 256 || Static307.anInt5484 * 128 - 256 < arg4) {
			Static136.anIntArray287[0] = Static136.anIntArray287[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static18.method508(arg4, arg0, arg1) - arg3;
		Static280.aClass54_2.method4783(arg6, 0, 0);
		Static304.aClass82_4.method4533(Static280.aClass54_2);
		Static304.aClass82_4.method4531(arg1, local49, arg4, Static136.anIntArray287);
		Static280.aClass54_2.method4783(-arg6, 0, 0);
		Static304.aClass82_4.method4533(Static280.aClass54_2);
	}

	@OriginalMember(owner = "client!uo", name = "providesignlink", descriptor = "(Lclient!dq;)V")
	private static void method862(@OriginalArg(0) Class53 arg0) {
		Static92.aClass53_2 = arg0;
		Static271.aClass53_4 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!dq;ILjava/lang/Object;)V")
	public static void method870(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static185.method3004(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	public static void method873() {
		Static291.aClass154_41.method3748();
	}
}
