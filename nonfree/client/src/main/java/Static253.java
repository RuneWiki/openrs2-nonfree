import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!wa;")
	public static Class175 aClass175_4;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[Lclient!in;")
	public static Class71[] aClass71Array2;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString292 = null;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIZII)V")
	public static void method3879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (Static277.aBoolean412) {
			@Pc(23) int local23 = arg3 - 334;
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 100) {
				local23 = 100;
			}
			@Pc(45) int local45 = (Static258.aShort30 - Static217.aShort29) * local23 / 100 + Static217.aShort29;
			if (local45 < Static60.aShort16) {
				local45 = Static60.aShort16;
			} else if (local45 > Static137.aShort22) {
				local45 = Static137.aShort22;
			}
			@Pc(72) int local72 = arg3 * local45 * 512 / (arg1 * 334);
			@Pc(110) int local110;
			@Pc(116) int local116;
			@Pc(84) short local84;
			if (local72 < Static63.aShort17) {
				local84 = Static63.aShort17;
				local45 = local84 * 334 * arg1 / (arg3 * 512);
				if (Static137.aShort22 < local45) {
					local45 = Static137.aShort22;
					local110 = local45 * 512 * arg3 / (local84 * 334);
					local116 = (arg1 - local110) / 2;
					if (arg2) {
						Static41.method842();
						Static41.method832(arg4, arg0, local116, arg3, 0);
						Static41.method832(arg1 + arg4 - local116, arg0, local116, arg3, 0);
					}
					arg1 -= local116 * 2;
					arg4 += local116;
				}
			} else if (Static165.aShort27 < local72) {
				local84 = Static165.aShort27;
				local45 = arg1 * local84 * 334 / (arg3 * 512);
				if (local45 < Static60.aShort16) {
					local45 = Static60.aShort16;
					local110 = local84 * arg1 * 334 / (local45 * 512);
					local116 = (arg3 - local110) / 2;
					if (arg2) {
						Static41.method842();
						Static41.method832(arg4, arg0, arg1, local116, 0);
						Static41.method832(arg4, arg3 + arg0 - local116, arg1, local116, 0);
					}
					arg3 -= local116 * 2;
					arg0 += local116;
				}
			}
			Static93.anInt2105 = local45 * arg3 / 334;
		}
		Static248.anInt4910 = arg4;
		Static114.anInt2607 = arg0;
		Static38.anInt1002 = (short) arg3;
		Static150.anInt3231 = (short) arg1;
	}
}
