import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!dfa", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!dfa", name = "o", descriptor = "Lclient!ifa;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "Lclient!ha;")
	public static Class144 aClass144_3;

	@OriginalMember(owner = "client!dfa", name = "s", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_9 = new Class317(30);

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "I")
	public static int anInt1787 = 0;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZII)Z")
	public static boolean method1710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static86.method1433(arg0, arg1) | (arg0 & 0x70000) != 0 || Static63.method1036(arg0, arg1);
	}

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(III)I")
	public static int method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(III)V")
	public static void method1713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static223.anInt4348 == 1) {
			Static131.method2013(Static594.aClass14_Sub2_Sub20_4, arg1, arg0);
		} else if (Static223.anInt4348 == 2) {
			if (Static656.aBoolean741) {
				Static515.method7649(Static532.method7876() + arg1, Static276.method4674() + arg0);
			} else {
				Static515.method7649(arg1, arg0);
			}
		}
		Static594.aClass14_Sub2_Sub20_4 = null;
		Static223.anInt4348 = 0;
	}
}
