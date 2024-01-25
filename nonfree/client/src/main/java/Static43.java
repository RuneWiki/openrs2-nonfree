import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "J")
	public static long aLong45 = -1L;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public static int anInt1190 = 0;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_54 = new Class123(68, 8);

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_16 = new Class92(50, 7);

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIII)V")
	public static void method974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(14) int local14 = arg6 + arg0;
		for (@Pc(16) int local16 = arg6; local16 < local14; local16++) {
			Static298.method4405(Static62.anIntArrayArray7[local16], arg2, arg3, arg4);
		}
		@Pc(34) int local34 = arg0 + arg4;
		@Pc(39) int local39 = arg3 - arg0;
		for (@Pc(41) int local41 = arg1; local41 > local10; local41--) {
			Static298.method4405(Static62.anIntArrayArray7[local41], arg2, arg3, arg4);
		}
		for (@Pc(69) int local69 = local14; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static62.anIntArrayArray7[local69];
			Static298.method4405(local75, arg2, local34, arg4);
			Static298.method4405(local75, arg5, local39, local34);
			Static298.method4405(local75, arg2, arg3, local39);
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public static void method976() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static412.aBooleanArray26[local3] = false;
		}
		Static413.anInt7423 = 0;
		Static181.anInt3578 = -1;
		Static405.anInt7262 = 0;
		Static429.anInt7656 = 1;
		Static53.anInt1471 = -1;
	}
}
