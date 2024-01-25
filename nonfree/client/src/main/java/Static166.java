import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
	public static int anInt3250;

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
	public static int anInt3251;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
	public static int anInt3254;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public static int anInt3255 = 0;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[Ljava/lang/String;[I)V")
	public static void method3018(@OriginalArg(1) String[] arg0, @OriginalArg(2) int[] arg1) {
		Static229.method3619(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V")
	public static void method3019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(115) Class128 local115 = Static283.aClass128ArrayArrayArray1[arg0][arg2][arg1];
			if (local115 != null) {
				if (arg3 == 1) {
					local115.aShort41 = 0;
				} else if (arg3 == 2) {
					local115.aShort42 = 0;
				}
			}
			Static584.method8039();
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static412.anInt6979; local22++) {
			@Pc(28) Class250 local28 = Static96.aClass250Array178[local22];
			if (arg3 == local28.aByte91 && local28.aShort65 == arg2 && arg1 == local28.aShort63 || arg2 == local28.aShort64 && arg1 == local28.aShort63) {
				if (Static412.anInt6979 != local22) {
					Static693.method8316(Static96.aClass250Array178, local22 + 1, Static96.aClass250Array178, local22, Static96.aClass250Array178.length - local22 - 1);
				}
				Static412.anInt6979--;
				return;
			}
		}
	}
}
