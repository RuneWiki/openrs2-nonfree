import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!nf;")
	public static Class238 aClass238_2;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "[B")
	public static byte[] aByteArray24;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "F")
	public static float aFloat14 = 1024.0F;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_43 = new Class289(90, -1);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLclient!sha;I)V")
	public static void method2021(@OriginalArg(0) int arg0, @OriginalArg(2) Class321 arg1, @OriginalArg(3) int arg2) {
		if (Static291.aBoolean314) {
			@Pc(18) Class325 local18 = Static127.anInt1401 == -1 ? null : Static280.aClass349_2.method8157(Static127.anInt1401);
			if (Static83.method1453(arg1).method5792() && (Static255.anInt5389 & 0x20) != 0 && (local18 == null || arg1.method7687(local18.anInt9243, Static127.anInt1401) != local18.anInt9243)) {
				Static200.method2916((long) (arg1.anInt9061 << 0 | arg1.anInt9040), Static355.aString75, arg1.anInt9040, false, 0L, Static172.aString32 + " -> " + arg1.aString123, 22, Static478.anInt8213, arg1.anInt9048, true, arg1.anInt9061, false);
			}
		}
		@Pc(88) String local88;
		for (@Pc(81) int local81 = 9; local81 >= 5; local81--) {
			local88 = Static578.method8041(arg1, local81);
			if (local88 != null) {
				Static200.method2916((long) (arg1.anInt9040 | arg1.anInt9061 << 0), local88, arg1.anInt9040, false, (long) (local81 + 1), arg1.aString123, 1008, Static66.method1148(local81, arg1), arg1.anInt9048, true, arg1.anInt9061, false);
			}
		}
		local88 = Static674.method8277(arg1);
		if (local88 != null) {
			Static200.method2916((long) (arg1.anInt9061 << 0 | arg1.anInt9040), local88, arg1.anInt9040, false, 0L, arg1.aString123, 57, arg1.anInt9020, arg1.anInt9048, true, arg1.anInt9061, false);
		}
		for (@Pc(174) int local174 = 4; local174 >= 0; local174--) {
			@Pc(181) String local181 = Static578.method8041(arg1, local174);
			if (local181 != null) {
				Static200.method2916((long) (arg1.anInt9040 | arg1.anInt9061 << 0), local181, arg1.anInt9040, false, (long) (local174 + 1), arg1.aString123, 20, Static66.method1148(local174, arg1), arg1.anInt9048, true, arg1.anInt9061, false);
			}
		}
		if (!Static83.method1453(arg1).method5794()) {
			return;
		}
		if (arg1.aString124 == null) {
			Static200.method2916((long) (arg1.anInt9061 << 0 | arg1.anInt9040), Static52.aClass41_10.method1007(Static616.anInt10077), arg1.anInt9040, false, 0L, "", 11, -1, arg1.anInt9048, true, arg1.anInt9061, false);
		} else {
			Static200.method2916((long) (arg1.anInt9040 | arg1.anInt9061 << 0), arg1.aString124, arg1.anInt9040, false, 0L, "", 11, -1, arg1.anInt9048, true, arg1.anInt9061, false);
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)Z")
	public static boolean method2025(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
