import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!lc", name = "ub", descriptor = "Lclient!uf;")
	public static Class1_Sub2_Sub5_Sub5 aClass1_Sub2_Sub5_Sub5_7;

	@OriginalMember(owner = "client!lc", name = "jb", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_47 = new Class87(64);

	@OriginalMember(owner = "client!lc", name = "lb", descriptor = "[I")
	public static final int[] anIntArray294 = new int[4000];

	@OriginalMember(owner = "client!lc", name = "nb", descriptor = "[I")
	public static final int[] anIntArray295 = new int[100];

	@OriginalMember(owner = "client!lc", name = "pb", descriptor = "I")
	public static int anInt2597 = 0;

	@OriginalMember(owner = "client!lc", name = "qb", descriptor = "[I")
	public static final int[] anIntArray296 = new int[32];

	@OriginalMember(owner = "client!lc", name = "rb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1533 = Static118.method2249("Loaded fonts");

	@OriginalMember(owner = "client!lc", name = "sb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1534 = aClass65_1533;

	@OriginalMember(owner = "client!lc", name = "tb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1535 = Static118.method2249(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public static void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static100.method1896(Static133.anInt3309, arg1, Static206.anInt4385);
		@Pc(21) int local21 = Static100.method1896(Static133.anInt3309, arg5, Static206.anInt4385);
		@Pc(27) int local27 = Static100.method1896(Static23.anInt685, arg0, Static71.anInt1744);
		@Pc(35) int local35 = Static100.method1896(Static23.anInt685, arg3, Static71.anInt1744);
		@Pc(44) int local44 = Static100.method1896(Static133.anInt3309, arg1 + arg2, Static206.anInt4385);
		@Pc(53) int local53 = Static100.method1896(Static133.anInt3309, arg5 - arg2, Static206.anInt4385);
		for (@Pc(55) int local55 = local11; local55 < local44; local55++) {
			Static51.method893(arg4, Static40.anIntArrayArray11[local55], local35, local27);
		}
		for (@Pc(71) int local71 = local21; local71 > local53; local71--) {
			Static51.method893(arg4, Static40.anIntArrayArray11[local71], local35, local27);
		}
		@Pc(97) int local97 = Static100.method1896(Static23.anInt685, arg2 + arg0, Static71.anInt1744);
		@Pc(106) int local106 = Static100.method1896(Static23.anInt685, arg3 - arg2, Static71.anInt1744);
		for (@Pc(108) int local108 = local44; local108 <= local53; local108++) {
			@Pc(114) int[] local114 = Static40.anIntArrayArray11[local108];
			Static51.method893(arg4, local114, local97, local27);
			Static51.method893(arg4, local114, local35, local106);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Object;Lclient!da;I)V")
	public static void method1957(@OriginalArg(0) Object arg0, @OriginalArg(1) Class14 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static135.method2569(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
