import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_156 = new Class77(77, 14);

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)V")
	public static void method5195() {
		Static19.method552(Static125.aClass41_64);
		Static39.aClass2_Sub13_Sub2_4.method4199(Static45.anInt2591);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBC)I")
	public static int method5196(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
