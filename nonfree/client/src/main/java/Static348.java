import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mfa", name = "Ib", descriptor = "I")
	public static int anInt6489;

	@OriginalMember(owner = "client!mfa", name = "Xb", descriptor = "I")
	public static int anInt6498;

	@OriginalMember(owner = "client!mfa", name = "Ub", descriptor = "I")
	public static final int anInt6496 = 50;

	@OriginalMember(owner = "client!mfa", name = "Kb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[anInt6496];

	@OriginalMember(owner = "client!mfa", name = "Nb", descriptor = "[I")
	public static final int[] anIntArray376 = new int[anInt6496];

	@OriginalMember(owner = "client!mfa", name = "Qb", descriptor = "I")
	public static int anInt6494 = 0;

	@OriginalMember(owner = "client!mfa", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray377 = new int[anInt6496];

	@OriginalMember(owner = "client!mfa", name = "Tb", descriptor = "[I")
	public static final int[] anIntArray378 = new int[anInt6496];

	@OriginalMember(owner = "client!mfa", name = "Vb", descriptor = "[I")
	public static final int[] anIntArray379 = new int[anInt6496];

	@OriginalMember(owner = "client!mfa", name = "ac", descriptor = "[I")
	public static final int[] anIntArray380 = new int[anInt6496];

	@OriginalMember(owner = "client!mfa", name = "bc", descriptor = "I")
	public static int anInt6501 = 0;

	@OriginalMember(owner = "client!mfa", name = "cc", descriptor = "[I")
	public static final int[] anIntArray381 = new int[anInt6496];

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIII)Z")
	public static boolean method5647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Static480.aBoolean590 || !Static70.aBoolean94) {
			return false;
		} else if (Static560.anInt9310 < 100) {
			return false;
		} else {
			@Pc(28) int local28 = Static454.anIntArrayArrayArray24[arg1][arg2][arg0];
			if (-Static148.anInt3031 == local28) {
				return false;
			} else if (local28 == Static148.anInt3031) {
				return true;
			} else if (Static485.aClass91Array1 == Static637.aClass91Array4) {
				return false;
			} else {
				@Pc(56) int local56 = arg2 << Static485.anInt8241;
				@Pc(60) int local60 = arg0 << Static485.anInt8241;
				if (Static556.method7897(Static637.aClass91Array4[arg1].method7724(arg0 + 1, arg2), Static188.anInt3555 + local56 - 1, local60 + (Static188.anInt3555 - 1), local56 + 1, Static637.aClass91Array4[arg1].method7724(arg0, arg2), local60 + 1, local56 - -1, Static637.aClass91Array4[arg1].method7724(arg0 + 1, arg2 + 1), local60 + Static188.anInt3555 - 1) && Static556.method7897(Static637.aClass91Array4[arg1].method7724(arg0 + 1, arg2 - -1), local56 + Static188.anInt3555 - 1, Static188.anInt3555 + -1 + local60, local56 + 1, Static637.aClass91Array4[arg1].method7724(arg0, arg2), local60 + 1, Static188.anInt3555 + -1 + local56, Static637.aClass91Array4[arg1].method7724(arg0, arg2 + 1), local60 + 1)) {
					Static419.anInt7336++;
					Static454.anIntArrayArrayArray24[arg1][arg2][arg0] = Static148.anInt3031;
					return true;
				} else {
					Static454.anIntArrayArrayArray24[arg1][arg2][arg0] = -Static148.anInt3031;
					return false;
				}
			}
		}
	}
}
