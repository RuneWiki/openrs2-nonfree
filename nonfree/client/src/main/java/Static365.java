import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!se", name = "y", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "[I")
	public static final int[] anIntArray398 = new int[5];

	@OriginalMember(owner = "client!se", name = "H", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_38 = new Class243();

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_133 = new Class119(47, -1);

	@OriginalMember(owner = "client!se", name = "M", descriptor = "[Lclient!el;")
	public static final Class64[] aClass64Array1 = new Class64[2048];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!bu;)V")
	public static void method4812(@OriginalArg(1) Class32 arg0) {
		Static435.anInt7308 = 0;
		Static324.anInt7645 = 0;
		Static245.aClass138_4 = new Class138();
		Static168.aClass6_Sub3_Sub1_Sub1Array1 = new Class6_Sub3_Sub1_Sub1[1024];
		Static72.method1423(arg0);
		Static82.method3175(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILclient!mq;)V")
	public static void method4813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class156 arg2) {
		if (Static446.aBoolean648) {
			@Pc(17) Class224 local17 = Static96.anInt2198 == -1 ? null : Static318.aClass26_5.method691(Static96.anInt2198);
			if (Static53.method1118(arg2).method5985() && (Static279.anInt4322 & 0x20) != 0 && (local17 == null || arg2.method3769(Static96.anInt2198, local17.anInt6133) != local17.anInt6133)) {
				Static102.method1792(Static415.aString62 + " -> " + arg2.aString42, 0L, Static141.anInt2928, arg2.anInt4850, true, Static189.aString34, false, arg2.anInt4868, arg2.anInt4826, 50);
			}
			return;
		}
		@Pc(77) String local77;
		for (@Pc(70) int local70 = 9; local70 >= 5; local70--) {
			local77 = Static437.method5729(local70, arg2);
			if (local77 != null) {
				Static102.method1792(arg2.aString42, (long) (local70 + 1), Static187.method2987(arg2, local70), arg2.anInt4850, true, local77, false, arg2.anInt4868, arg2.anInt4826, 1002);
			}
		}
		local77 = Static337.method4505(arg2);
		if (local77 != null) {
			Static102.method1792(arg2.aString42, 0L, arg2.anInt4880, arg2.anInt4850, true, local77, false, arg2.anInt4868, arg2.anInt4826, 8);
		}
		for (@Pc(138) int local138 = 4; local138 >= 0; local138--) {
			@Pc(147) String local147 = Static437.method5729(local138, arg2);
			if (local147 != null) {
				Static102.method1792(arg2.aString42, (long) (local138 + 1), Static187.method2987(arg2, local138), arg2.anInt4850, true, local147, false, arg2.anInt4868, arg2.anInt4826, 10);
			}
		}
		if (!Static53.method1118(arg2).method5979()) {
			return;
		}
		if (arg2.aString39 == null) {
			Static102.method1792("", 0L, -1, arg2.anInt4850, true, Static292.aClass189_169.method4262(Static53.anInt1454), false, arg2.anInt4868, arg2.anInt4826, 15);
		} else {
			Static102.method1792("", 0L, -1, arg2.anInt4850, true, arg2.aString39, false, arg2.anInt4868, arg2.anInt4826, 15);
		}
	}
}
