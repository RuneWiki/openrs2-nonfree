import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!nw", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray83 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!nw", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray84 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!ria;I)Lclient!ria;")
	public static Class303 method5830(@OriginalArg(0) Class303 arg0) {
		@Pc(11) Class303 local11 = Static79.method1732(arg0);
		if (local11 == null) {
			local11 = arg0.aClass303_19;
		}
		return local11;
	}

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "(III)V")
	public static void method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static112.aClass17_3 == Static51.aClass17_2) {
			if (Static250.method4182(0, 1, 0, -2, false, arg1, 1, arg0)) {
				return;
			}
			Static250.method4182(0, 1, 0, -3, false, arg1, 1, arg0);
		} else if (Static250.method4182(0, 1, 0, -3, false, arg1, 1, arg0)) {
			return;
		} else {
			Static250.method4182(0, 1, 0, -2, false, arg1, 1, arg0);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIIII)V")
	public static void method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static463.anInt7492 = arg1;
		Static53.anInt1367 = arg3;
		Static539.anInt8679 = arg0;
		Static134.anInt9432 = arg5;
		Static26.anInt533 = arg2;
		Static542.anInt8732 = arg4;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IB)V")
	public static void method5833(@OriginalArg(0) int arg0) {
		Static286.anInt5207 = -1;
		Static648.anInt10477 = 3;
		Static50.anInt1296 = arg0;
		Static14.anInt274 = 100;
	}

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "(III)Z")
	public static boolean method5835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static228.method3698(arg1, arg0) & Static345.method8049(arg1, arg0);
	}
}
