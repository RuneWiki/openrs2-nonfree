import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class134 local13 = local7.aClass134_1; local13 != null; local13 = local13.aClass134_2) {
			@Pc(17) Class4_Sub2 local17 = local13.aClass4_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort88 == arg1 && local17.aShort89 == arg2) {
				Static389.method5364(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)V")
	public static void method5550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 11);
		local8.method434();
		local8.anInt657 = arg1;
		local8.anInt656 = arg2;
	}
}
