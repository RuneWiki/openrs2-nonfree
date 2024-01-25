import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[B")
	public static byte[] aByteArray40;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	public static int anInt2892;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!qf;")
	public static Class245 aClass245_4 = null;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
	public static final int[] anIntArray280 = new int[8];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!qf;III)V")
	public static void method2461(@OriginalArg(0) Class245 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static506.aBoolean659) {
			@Pc(18) Class244 local18 = Static262.anInt5489 == -1 ? null : Static37.aClass121_1.method3431(Static262.anInt5489);
			if (Static63.method1295(arg0).method1752() && (Static170.anInt3907 & 0x20) != 0 && (local18 == null || arg0.method6013(Static262.anInt5489, local18.anInt7213) != local18.anInt7213)) {
				Static507.method7642(true, Static117.aString29 + " -> " + arg0.aString56, arg0.anInt7271, Static88.aString19, Static46.anInt1080, arg0.anInt7256, arg0.anInt7264, false, 13, 0L);
			}
		}
		@Pc(80) String local80;
		for (@Pc(73) int local73 = 9; local73 >= 5; local73--) {
			local80 = Static192.method3682(local73, arg0);
			if (local80 != null) {
				Static507.method7642(true, arg0.aString56, arg0.anInt7271, local80, Static418.method6466(arg0, local73), arg0.anInt7256, arg0.anInt7264, false, 1003, (long) (local73 + 1));
			}
		}
		local80 = Static27.method796(arg0);
		if (local80 != null) {
			Static507.method7642(true, arg0.aString56, arg0.anInt7271, local80, arg0.anInt7274, arg0.anInt7256, arg0.anInt7264, false, 20, 0L);
		}
		for (@Pc(149) int local149 = 4; local149 >= 0; local149--) {
			@Pc(156) String local156 = Static192.method3682(local149, arg0);
			if (local156 != null) {
				Static507.method7642(true, arg0.aString56, arg0.anInt7271, local156, Static418.method6466(arg0, local149), arg0.anInt7256, arg0.anInt7264, false, 50, (long) (local149 + 1));
			}
		}
		if (!Static63.method1295(arg0).method1756()) {
			return;
		}
		if (arg0.aString58 == null) {
			Static507.method7642(true, "", arg0.anInt7271, Static307.aClass67_70.method1934(Static193.anInt7803), -1, arg0.anInt7256, arg0.anInt7264, false, 58, 0L);
		} else {
			Static507.method7642(true, "", arg0.anInt7271, arg0.aString58, -1, arg0.anInt7256, arg0.anInt7264, false, 58, 0L);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2462(@OriginalArg(1) String arg0) {
		return Static183.method4960(arg0, mi.class);
	}
}
