import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Lclient!dp;")
	public static Class53 aClass53_85;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Lclient!mb;")
	public static Class132 aClass132_11;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString126 = "Examine";

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public static int anInt2883 = 104;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)V")
	public static void method3083(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static62.anInt1131 != -1) {
				Static223.method3943(Static62.anInt1131);
			}
			for (@Pc(21) Class6_Sub30 local21 = (Class6_Sub30) Static197.aClass108_30.method2903(); local21 != null; local21 = (Class6_Sub30) Static197.aClass108_30.method2905()) {
				if (!local21.method5757()) {
					local21 = (Class6_Sub30) Static197.aClass108_30.method2903();
					if (local21 == null) {
						break;
					}
				}
				Static103.method2104(true, false, local21);
			}
			Static62.anInt1131 = -1;
			Static197.aClass108_30 = new Class108(8);
			Static38.method663();
			Static62.anInt1131 = Static200.anInt3707;
			Static222.method3938(false);
			Static205.method5709();
			Static140.method2656(Static62.anInt1131);
		}
		Static65.method1112();
		Static163.anInt3085 = -1;
		Static66.method1125(Static211.anInt3858);
		Static253.aClass44_Sub4_Sub4_Sub1_1 = new Class44_Sub4_Sub4_Sub1();
		Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 = 6656;
		Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] = 52;
		Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 = 6656;
		Static11.anInt197 = 0;
		Static287.anInt5405 = 0;
		Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0] = 52;
		if (Static334.anInt6112 == 2) {
			Static11.anInt197 = Static268.anInt5000 << 7;
			Static287.anInt5405 = Static179.anInt3361 << 7;
		} else {
			Static220.method3911();
		}
		Static262.method4419();
		if (Static287.anInt5405 == 0 || Static11.anInt197 == 0) {
			Static290.method4952(10);
		} else {
			Static138.method4287();
			Static290.method4952(28);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
	public static boolean method3085(@OriginalArg(1) int arg0) {
		if (arg0 == 49 || arg0 == 1 || arg0 == 26 || arg0 == 30 || arg0 == 4) {
			return true;
		} else if (arg0 == 44 || arg0 == 32 || arg0 == 1002) {
			return true;
		} else if (arg0 == 28 || arg0 == 42 || arg0 == 23 || arg0 == 24 || arg0 == 34) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 40 || arg0 == 1005 || arg0 == 11;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!dp;B)V")
	public static void method3090(@OriginalArg(0) Class53 arg0) {
		Static268.aClass53_123 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZJ)V")
	public static void method3092(@OriginalArg(1) long arg0) {
		Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
		Static131.aClass6_Sub10_Sub1_2.method3968(21);
		Static131.aClass6_Sub10_Sub1_2.method3970(arg0);
		Static92.anInt1691 = -3;
		Static215.anInt3939 = 1;
		Static166.anInt3137 = 0;
		Static291.anInt5474 = 0;
	}
}
