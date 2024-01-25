import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Lclient!pc;")
	public static Class255 aClass255_4;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
	public static int method5701() {
		return Static251.aClass8_1.method178();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIBI)Z")
	public static boolean method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static62.aBoolean167 || !Static219.aBoolean366) {
			return false;
		} else if (Static513.anInt9411 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static132.anIntArrayArrayArray10[arg0][arg1][arg2];
			if (-Static523.anInt9521 == local24) {
				return false;
			} else if (Static523.anInt9521 == local24) {
				return true;
			} else if (Static103.aClass65Array3 == Static9.aClass65Array1) {
				return false;
			} else {
				@Pc(48) int local48 = arg1 << Static151.anInt3896;
				@Pc(52) int local52 = arg2 << Static151.anInt3896;
				if (Static549.method8195(local48 + 1, local48 - (-Static582.anInt10356 - -1), local52 + 1, local48 + 1, local52 + Static582.anInt10356 - 1, Static9.aClass65Array1[arg0].method7995(arg2 + 1, arg1), Static9.aClass65Array1[arg0].method7995(arg2 + 1, arg1 + 1), Static9.aClass65Array1[arg0].method7995(arg2, arg1), Static582.anInt10356 + local52 - 1) && Static549.method8195(local48 + 1, Static582.anInt10356 + local48 + -1, local52 + 1, Static582.anInt10356 + (local48 - 1), local52 + Static582.anInt10356 - 1, Static9.aClass65Array1[arg0].method7995(arg2 - -1, arg1 + 1), Static9.aClass65Array1[arg0].method7995(arg2, arg1 + 1), Static9.aClass65Array1[arg0].method7995(arg2, arg1), local52 + 1)) {
					Static361.anInt7190++;
					Static132.anIntArrayArrayArray10[arg0][arg1][arg2] = Static523.anInt9521;
					return true;
				} else {
					Static132.anIntArrayArrayArray10[arg0][arg1][arg2] = -Static523.anInt9521;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg3 < 512 || arg5 < 512 || arg3 > (Static47.anInt1794 - 2) * 512 || (Static209.anInt4742 - 2) * 512 < arg5) {
			Static613.anIntArray690[0] = Static613.anIntArray690[1] = -1;
			return;
		}
		@Pc(50) int local50 = Static590.method8716(arg3, arg0, arg5) - arg1;
		if (Static487.aBoolean676) {
			Static353.method6007(true);
		} else {
			Static45.aClass30_3.method4646(arg4, 0, 0);
			Static186.aClass20_4.method7241(Static45.aClass30_3);
		}
		if (Static639.aBoolean753) {
			Static186.aClass20_4.HA(arg3, local50, arg5, Static380.anInt7419, Static613.anIntArray690);
		} else {
			Static186.aClass20_4.da(arg3, local50, arg5, Static613.anIntArray690);
		}
		if (Static487.aBoolean676) {
			Static31.method767();
		} else {
			Static45.aClass30_3.method4646(-arg4, 0, 0);
			Static186.aClass20_4.method7241(Static45.aClass30_3);
		}
	}
}
