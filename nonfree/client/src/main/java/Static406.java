import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public static int anInt7855;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Z")
	public static boolean aBoolean566 = false;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!Static358.aBoolean477) {
			return false;
		} else if (Static350.anInt7294 < 100) {
			return false;
		} else {
			@Pc(36) int local36;
			@Pc(40) int local40;
			if (arg5 != arg0 || arg4 != arg3) {
				for (local36 = arg5; local36 <= arg0; local36++) {
					for (local40 = arg3; local40 <= arg4; local40++) {
						if (Static206.anIntArrayArrayArray23[arg1][local36][local40] == -Static472.anInt8979) {
							return false;
						}
					}
				}
				local40 = (arg5 << Static392.anInt3635) + 1;
				@Pc(120) int local120 = (arg3 << Static392.anInt3635) + 2;
				if (Static154.method2625(arg2, Static168.anInt3487 * (arg0 + 1 - arg5), local120, Static255.aClass115Array2[arg1].method8055(arg3, arg5), Static168.anInt3487 * (arg4 + 1 - arg3), local40)) {
					Static217.anInt8618++;
					return true;
				} else {
					return false;
				}
			} else if (Static351.method5319(arg1, arg5, arg3)) {
				local36 = arg5 << Static392.anInt3635;
				local40 = arg3 << Static392.anInt3635;
				if (Static154.method2625(arg2, Static168.anInt3487, local40, Static255.aClass115Array2[arg1].method8055(arg3, arg5), Static168.anInt3487, local36)) {
					Static217.anInt8618++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V")
	public static void method6143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg4; local15 <= arg3; local15++) {
			Static238.method3886(Static442.anIntArrayArray48[local15], arg0, arg2, arg1);
		}
	}
}
