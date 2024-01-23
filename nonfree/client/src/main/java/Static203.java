import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	public static int anInt4533 = 0;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "[I")
	public static int[] anIntArray469 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_1213 = Static184.method2923("Lade Texturen )2 ");

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
	public static boolean method3139(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBIIII)V")
	public static void method3142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static75.method2627(arg4, arg1, arg3, arg0);
			}
		} else if (local15 == 0) {
			Static79.method1453(arg2, arg3, arg4, arg0);
		} else {
			@Pc(54) int local54 = (local15 << 12) / local10;
			@Pc(62) int local62 = arg3 - (local54 * arg0 >> 12);
			@Pc(78) int local78;
			@Pc(87) int local87;
			if (Static60.anInt4779 > arg2) {
				local78 = Static60.anInt4779;
				local87 = (Static60.anInt4779 * local54 >> 12) + local62;
			} else if (arg2 > Static11.anInt385) {
				local78 = Static11.anInt385;
				local87 = local62 + (Static11.anInt385 * local54 >> 12);
			} else {
				local78 = arg2;
				local87 = arg1;
			}
			if (Static45.anInt1337 > local87) {
				local87 = Static45.anInt1337;
				local78 = (Static45.anInt1337 - local62 << 12) / local54;
			} else if (local87 > Static17.anInt457) {
				local87 = Static17.anInt457;
				local78 = (Static17.anInt457 - local62 << 12) / local54;
			}
			@Pc(139) int local139;
			@Pc(147) int local147;
			if (Static60.anInt4779 > arg0) {
				local139 = Static60.anInt4779;
				local147 = (Static60.anInt4779 * local54 >> 12) + local62;
			} else if (Static11.anInt385 < arg0) {
				local139 = Static11.anInt385;
				local147 = (local54 * Static11.anInt385 >> 12) + local62;
			} else {
				local139 = arg0;
				local147 = arg3;
			}
			if (local147 < Static45.anInt1337) {
				local147 = Static45.anInt1337;
				local139 = (Static45.anInt1337 - local62 << 12) / local54;
			} else if (Static17.anInt457 < local147) {
				local147 = Static17.anInt457;
				local139 = (Static17.anInt457 - local62 << 12) / local54;
			}
			Static92.method1617(local139, local87, arg4, local147, local78);
		}
	}
}
