import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IJ)V")
	public static void method7114(@OriginalArg(1) long arg0) {
		if (Static270.aClass276ArrayArrayArray2 != null) {
			if (Static346.anInt6215 == 1 || Static346.anInt6215 == 5) {
				Static447.method6335(arg0);
			} else if (Static346.anInt6215 == 4) {
				Static180.method3270(arg0);
			}
		}
		Static381.method5628(Static240.aClass14_7, (long) Static312.anInt5688);
		if (Static468.anInt8036 != -1) {
			Static441.method6275(Static468.anInt8036);
		}
		for (@Pc(42) int local42 = 0; local42 < Static414.anInt7237; local42++) {
			if (Static31.aBooleanArray17[local42]) {
				Static143.aBooleanArray15[local42] = true;
			}
			Static528.aBooleanArray37[local42] = Static31.aBooleanArray17[local42];
			Static31.aBooleanArray17[local42] = false;
		}
		Static38.anInt984 = Static312.anInt5688;
		if (Static240.aClass14_7.method6876()) {
			Static299.aBoolean389 = true;
		}
		if (Static468.anInt8036 != -1) {
			Static414.anInt7237 = 0;
			Static214.method3753();
		}
		Static240.aClass14_7.F();
		Static121.method2519(Static240.aClass14_7);
		@Pc(93) int local93 = Static13.method6290();
		if (local93 == -1) {
			local93 = Static245.anInt4901;
		}
		if (local93 == -1) {
			local93 = Static375.anInt6611;
		}
		Static57.method1223(local93);
		Static287.method4669(Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540, Static54.anInt1208);
		Static54.anInt1208 = 0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZB)V")
	public static void method7115(@OriginalArg(0) boolean arg0) {
		if (Static342.aString46.length() == 0) {
			return;
		}
		Static513.method7109("--> " + Static342.aString46);
		Static57.method1221(false, Static342.aString46, arg0);
		Static162.anInt3371 = 0;
		Static342.aString46 = "";
		Static400.anInt7014 = 0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Z")
	public static boolean method7116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
