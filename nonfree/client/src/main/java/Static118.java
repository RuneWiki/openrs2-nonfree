import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_11;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Lclient!u;")
	public static Class76 aClass76_96;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!ig;")
	public static Class39 aClass39_33;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!fa;")
	public static Class1_Sub9 aClass1_Sub9_1 = new Class1_Sub9(8);

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	public static int anInt3208 = 0;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1074 = Static49.method1293("Unable to connect)3");

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1075 = aClass70_1074;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1076 = aClass70_1074;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1077 = Static49.method1293(":tradereq:");

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1078 = Static49.method1293("To create a new account you need to");

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1079 = Static49.method1293("");

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1080 = aClass70_1078;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public static void method2404() {
		aClass70_1076 = null;
		aClass70_1075 = null;
		aClass76_Sub1_11 = null;
		aClass70_1074 = null;
		aClass1_Sub9_1 = null;
		aClass70_1077 = null;
		aClass39_33 = null;
		aClass70_1080 = null;
		aClass76_96 = null;
		aClass70_1078 = null;
		aClass70_1079 = null;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public static void method2405() {
		while (true) {
			if (Static98.aClass1_Sub9_Sub1_2.method1289(Static69.anInt2127) >= 11) {
				@Pc(23) int local23 = Static98.aClass1_Sub9_Sub1_2.method1288(11);
				if (local23 != 2047) {
					@Pc(28) boolean local28 = false;
					if (Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local23] == null) {
						Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local23] = new Class1_Sub1_Sub4_Sub2_Sub1();
						if (Static42.aClass1_Sub9Array1[local23] != null) {
							Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local23].method959(Static42.aClass1_Sub9Array1[local23]);
						}
						local28 = true;
					}
					Static26.anIntArray46[Static104.anInt2960++] = local23;
					@Pc(64) Class1_Sub1_Sub4_Sub2_Sub1 local64 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local23];
					local64.anInt2026 = Static47.anInt1654;
					@Pc(72) int local72 = Static98.aClass1_Sub9_Sub1_2.method1288(5);
					if (local72 > 15) {
						local72 -= 32;
					}
					@Pc(83) int local83 = Static54.anIntArray177[Static98.aClass1_Sub9_Sub1_2.method1288(3)];
					if (local28) {
						local64.anInt2047 = local64.anInt2040 = local83;
					}
					@Pc(96) int local96 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
					@Pc(101) int local101 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
					if (local101 == 1) {
						Static48.anIntArray167[Static161.anInt4212++] = local23;
					}
					@Pc(117) int local117 = Static98.aClass1_Sub9_Sub1_2.method1288(5);
					if (local117 > 15) {
						local117 -= 32;
					}
					local64.method1514(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0] + local72, local117 + Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local96 == 1);
					continue;
				}
			}
			Static98.aClass1_Sub9_Sub1_2.method1291();
			return;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)I")
	public static int method2407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
