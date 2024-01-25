import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!vo;")
	public static Class39 aClass39_4;

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
	public static int anInt8101;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "[I")
	public static final int[] anIntArray552 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString74 = null;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray43 = new boolean[100];

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIII)V")
	public static void method6795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg0) {
			Static556.method7710(arg3, arg2, arg1, arg4);
		} else if (arg4 - arg2 >= Static306.anInt5020 && arg4 + arg2 <= Static252.anInt4988 && Static570.anInt9385 <= arg3 - arg0 && Static177.anInt3963 >= arg0 + arg3) {
			Static195.method7909(arg3, arg0, arg1, arg4, arg2);
		} else {
			Static417.method6377(arg0, arg1, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method6796(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static446.anInt7901; local9++) {
			if (arg0.equalsIgnoreCase(Static391.aStringArray25[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4);
	}
}
