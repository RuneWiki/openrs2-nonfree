import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_109 = new Class186(1, 3);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_47 = new Class242(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "[I")
	public static final int[] anIntArray275 = new int[200];

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	public static int anInt3300 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public static void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class53 local28 = Static40.aClass53ArrayArrayArray2[local9][arg0][arg1] = Static40.aClass53ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte36--;
				for (@Pc(40) Class165 local40 = local28.aClass165_1; local40 != null; local40 = local40.aClass165_2) {
					@Pc(44) Class6_Sub2 local44 = local40.aClass6_Sub2_2;
					if (local44.aShort82 == arg0 && local44.aShort85 == arg1) {
						local44.aByte86--;
					}
				}
			}
		}
		if (Static40.aClass53ArrayArrayArray2[0][arg0][arg1] == null) {
			Static40.aClass53ArrayArrayArray2[0][arg0][arg1] = new Class53(0, arg0, arg1);
			Static40.aClass53ArrayArrayArray2[0][arg0][arg1].aByte37 = 1;
		}
		Static40.aClass53ArrayArrayArray2[0][arg0][arg1].aClass53_1 = local7;
		Static40.aClass53ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
