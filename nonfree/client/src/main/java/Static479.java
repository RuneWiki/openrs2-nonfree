import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public static int anInt7567 = -1;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Z")
	public static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([SB[Ljava/lang/String;)V")
	public static void method6584(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static238.method3424(arg1.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
	public static void method6585() {
		Static340.aClass33_9.method8133(Static491.aClass92_8);
		Static340.aClass33_9.DA(Static202.anInt3312, Static303.anInt4789, Static3.anInt3611, Static36.anInt794);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method6586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static303.method4275(arg1, arg0, arg2)) {
			return false;
		}
		@Pc(15) int local15 = Static552.anIntArray586[2];
		@Pc(19) int local19 = Static552.anIntArray586[1];
		@Pc(23) int local23 = Static552.anIntArray586[0];
		if (!Static303.method4275(arg7, arg8, arg3)) {
			return false;
		}
		@Pc(35) int local35 = Static552.anIntArray586[2];
		@Pc(39) int local39 = Static552.anIntArray586[0];
		@Pc(43) int local43 = Static552.anIntArray586[1];
		if (Static303.method4275(arg6, arg5, arg4)) {
			@Pc(60) int local60 = Static552.anIntArray586[0];
			@Pc(64) int local64 = Static552.anIntArray586[2];
			@Pc(68) int local68 = Static552.anIntArray586[1];
			return Static395.method2779(local43, local15, local35, local23, local60, local19, local39, local68, local64);
		} else {
			return false;
		}
	}
}
