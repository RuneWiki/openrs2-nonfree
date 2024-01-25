import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	public static int anInt6753;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	public static final int anInt6756 = 1406;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_54 = new Class83(4);

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[5];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	public static void method5303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class211 local28 = Static268.aClass211ArrayArrayArray4[local9][arg0][arg1] = Static268.aClass211ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte73--;
				for (@Pc(40) Class125 local40 = local28.aClass125_3; local40 != null; local40 = local40.aClass125_1) {
					@Pc(44) Class26_Sub2 local44 = local40.aClass26_Sub2_1;
					if (local44.aShort93 == arg0 && local44.aShort94 == arg1) {
						local44.aByte95--;
					}
				}
			}
		}
		if (Static268.aClass211ArrayArrayArray4[0][arg0][arg1] == null) {
			Static268.aClass211ArrayArrayArray4[0][arg0][arg1] = new Class211(0, arg0, arg1);
			Static268.aClass211ArrayArrayArray4[0][arg0][arg1].aByte78 = 1;
		}
		Static268.aClass211ArrayArrayArray4[0][arg0][arg1].aClass211_1 = local7;
		Static268.aClass211ArrayArrayArray4[3][arg0][arg1] = null;
	}
}
