import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt1201;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
	public static final int[] anIntArray152 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public static int anInt1202 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class132 local28 = Static25.aClass132ArrayArrayArray1[local9][arg0][arg1] = Static25.aClass132ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte50--;
				for (@Pc(40) Class116 local40 = local28.aClass116_3; local40 != null; local40 = local40.aClass116_2) {
					@Pc(44) Class25_Sub1 local44 = local40.aClass25_Sub1_1;
					if (local44.aShort88 == arg0 && local44.aShort89 == arg1) {
						local44.aByte70--;
					}
				}
			}
		}
		if (Static25.aClass132ArrayArrayArray1[0][arg0][arg1] == null) {
			Static25.aClass132ArrayArrayArray1[0][arg0][arg1] = new Class132(0, arg0, arg1);
			Static25.aClass132ArrayArrayArray1[0][arg0][arg1].aByte47 = 1;
		}
		Static25.aClass132ArrayArrayArray1[0][arg0][arg1].aClass132_1 = local7;
		Static25.aClass132ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
