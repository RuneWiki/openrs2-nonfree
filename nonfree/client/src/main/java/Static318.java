import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public static int anInt6132;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	public static final int anInt6131 = 52;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class213 local28 = Static98.aClass213ArrayArrayArray2[local9][arg0][arg1] = Static98.aClass213ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte70--;
				for (@Pc(40) Class81 local40 = local28.aClass81_4; local40 != null; local40 = local40.aClass81_3) {
					@Pc(44) Class10_Sub3 local44 = local40.aClass10_Sub3_1;
					if (local44.aShort83 == arg0 && local44.aShort82 == arg1) {
						local44.aByte64--;
					}
				}
			}
		}
		if (Static98.aClass213ArrayArrayArray2[0][arg0][arg1] == null) {
			Static98.aClass213ArrayArrayArray2[0][arg0][arg1] = new Class213(0, arg0, arg1);
			Static98.aClass213ArrayArrayArray2[0][arg0][arg1].aByte73 = 1;
		}
		Static98.aClass213ArrayArrayArray2[0][arg0][arg1].aClass213_1 = local7;
		Static98.aClass213ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
