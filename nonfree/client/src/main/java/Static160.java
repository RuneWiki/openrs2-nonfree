import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ht", name = "H", descriptor = "Lclient!tu;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!ht", name = "R", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!ht", name = "S", descriptor = "Lclient!fo;")
	public static Class82 aClass82_43;

	@OriginalMember(owner = "client!ht", name = "Q", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_116 = new Class103(81, 2);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!jk;Z)V")
	public static void method2323(@OriginalArg(0) Class124 arg0) {
		if (Static453.anInt7489 == arg0.anInt3387) {
			Static369.aBooleanArray23[arg0.anInt3396] = true;
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)I")
	public static int method2324(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(III)Z")
	public static boolean method2326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static271.anIntArrayArrayArray15[arg0][arg1][arg2];
		if (local7 == -Static172.anInt2813) {
			return false;
		} else if (local7 == Static172.anInt2813) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static215.anInt4460;
			@Pc(26) int local26 = arg2 << Static215.anInt4460;
			if (Static409.method5278(local22 + 1, Static94.aClass157Array1[arg0].ua(arg1, arg2), local26 + 1) && Static409.method5278(local22 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1 + 1, arg2), local26 + 1) && Static409.method5278(local22 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1 + 1, arg2 + 1), local26 + Static5.anInt78 - 1) && Static409.method5278(local22 + 1, Static94.aClass157Array1[arg0].ua(arg1, arg2 + 1), local26 + Static5.anInt78 - 1) && Static409.method5278(local22 + Static341.anInt5832, Static94.aClass157Array1[arg0].ua(arg1, arg2), local26 + 1) && Static409.method5278(local22 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1 + 1, arg2), local26 + Static341.anInt5832) && Static409.method5278(local22 + Static341.anInt5832, Static94.aClass157Array1[arg0].ua(arg1, arg2 + 1), local26 + Static5.anInt78 - 1) && Static409.method5278(local22 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1, arg2), local26 + Static341.anInt5832) && Static409.method5278(local22 + Static341.anInt5832, Static94.aClass157Array1[arg0].ua(arg1, arg2), local26 + Static341.anInt5832)) {
				Static271.anIntArrayArrayArray15[arg0][arg1][arg2] = Static172.anInt2813;
				return true;
			} else {
				Static271.anIntArrayArrayArray15[arg0][arg1][arg2] = -Static172.anInt2813;
				return false;
			}
		}
	}
}
