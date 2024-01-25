import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!wja;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt58;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
	public static final boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
	public static final int[] anIntArray8 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static162.method9170(arg4, arg6, arg3)) {
			return false;
		}
		@Pc(15) int local15 = Static366.anIntArray490[1];
		@Pc(24) int local24 = Static366.anIntArray490[2];
		@Pc(28) int local28 = Static366.anIntArray490[0];
		if (!Static162.method9170(arg5, arg0, arg7)) {
			return false;
		}
		@Pc(40) int local40 = Static366.anIntArray490[0];
		@Pc(44) int local44 = Static366.anIntArray490[2];
		@Pc(48) int local48 = Static366.anIntArray490[1];
		if (Static162.method9170(arg8, arg2, arg1)) {
			@Pc(60) int local60 = Static366.anIntArray490[0];
			@Pc(64) int local64 = Static366.anIntArray490[2];
			@Pc(68) int local68 = Static366.anIntArray490[1];
			return Static556.method7808(local24, local64, local60, local40, local44, local15, local28, local48, local68);
		} else {
			return false;
		}
	}
}
