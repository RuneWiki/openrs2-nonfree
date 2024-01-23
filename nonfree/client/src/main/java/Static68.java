import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public static int anInt1344;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt1350;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!ph;")
	public static Class138 aClass138_20;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "[[[Lclient!bo;")
	public static Class24[][][] aClass24ArrayArrayArray1;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "Lclient!qa;")
	public static Class142 aClass142_1 = new Class142();

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "[I")
	public static int[] anIntArray109 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString42 = "scroll:";

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method1136() {
		Static223.aClass169_123.method4018();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z")
	public static boolean method1137() {
		try {
			if (Static78.anInt1449 == 2) {
				if (Static178.aClass1_Sub16_3 == null) {
					Static178.aClass1_Sub16_3 = Static322.method2761(Static75.aClass138_21, Static185.anInt3720, Static97.anInt1804);
					if (Static178.aClass1_Sub16_3 == null) {
						return false;
					}
				}
				if (Static243.aClass131_3 == null) {
					Static243.aClass131_3 = new Class131(Static55.aClass138_12, Static306.aClass138_82);
				}
				if (Static183.aClass1_Sub4_Sub3_3.method1497(Static8.aClass138_3, Static178.aClass1_Sub16_3, Static243.aClass131_3)) {
					Static183.aClass1_Sub4_Sub3_3.method1490();
					Static183.aClass1_Sub4_Sub3_3.method1499(Static59.anInt1191);
					Static183.aClass1_Sub4_Sub3_3.method1467(Static86.aBoolean123, Static178.aClass1_Sub16_3);
					Static75.aClass138_21 = null;
					Static78.anInt1449 = 0;
					Static243.aClass131_3 = null;
					Static178.aClass1_Sub16_3 = null;
					return true;
				}
			}
		} catch (@Pc(72) Exception local72) {
			local72.printStackTrace();
			Static183.aClass1_Sub4_Sub3_3.method1494();
			Static243.aClass131_3 = null;
			Static78.anInt1449 = 0;
			Static75.aClass138_21 = null;
			Static178.aClass1_Sub16_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!nf;ILjava/lang/Object;)V")
	public static void method1139(@OriginalArg(0) Class117 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 50 && arg0.anEventQueue1.peekEvent() != null; local21++) {
			Static202.method3246(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZ)V")
	public static void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (Static299.anInt5670 != arg0) {
			Static310.anIntArray108 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static310.anIntArray108[local17] = (local17 << 12) / arg0;
			}
			Static237.anInt3638 = arg0 * 32;
			Static299.anInt5670 = arg0;
			Static142.anInt2791 = arg0 - 1;
		}
		if (Static202.anInt4038 == arg1) {
			return;
		}
		if (Static299.anInt5670 == arg1) {
			Static7.anIntArray13 = Static310.anIntArray108;
		} else {
			Static7.anIntArray13 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static7.anIntArray13[local17] = (local17 << 12) / arg1;
			}
		}
		Static167.anInt3492 = arg1 - 1;
		Static202.anInt4038 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Lclient!be;")
	public static Class1_Sub1_Sub2 method1141() {
		@Pc(8) Class1_Sub1_Sub2 local8 = (Class1_Sub1_Sub2) Static73.aClass5_9.method49();
		if (local8 != null) {
			local8.method4616();
			local8.method4617();
			return local8;
		}
		do {
			local8 = (Class1_Sub1_Sub2) Static51.aClass5_6.method49();
			if (local8 == null) {
				return null;
			}
			if (local8.method295() > Static135.method2186()) {
				return null;
			}
			local8.method4616();
			local8.method4617();
		} while ((local8.aLong224 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(7) int local7 = arg3;
			arg3 = arg4;
			arg4 = local7;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg1;
		} else if (local20 == 1) {
			return 1 + 7 - arg3 - arg5;
		} else if (local20 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
	public static boolean method1143(@OriginalArg(3) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = false;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(53) char local53 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local53 == '-') {
					local28 = true;
					continue;
				}
				if (local53 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local53 >= '0' && local53 <= '9') {
				local80 = local53 - '0';
			} else if (local53 >= 'A' && local53 <= 'Z') {
				local80 = local53 - '7';
			} else if (local53 >= 'a' && local53 <= 'z') {
				local80 = local53 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local28) {
				local80 = -local80;
			}
			@Pc(125) int local125 = local80 + local30 * 10;
			if (local125 / 10 != local30) {
				return false;
			}
			local30 = local125;
			local32 = true;
		}
		return local32;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	public static void method1144() {
		@Pc(7) int local7;
		@Pc(20) int local20;
		for (local7 = -1; local7 < Static222.anInt4329; local7++) {
			if (local7 == -1) {
				local20 = 2047;
			} else {
				local20 = Static46.anIntArray79[local7];
			}
			@Pc(30) Class22_Sub3_Sub2 local30 = Static195.aClass22_Sub3_Sub2Array1[local20];
			if (local30 != null && local30.anInt4636 > 0) {
				local30.anInt4636--;
				if (local30.anInt4636 == 0) {
					local30.aString150 = null;
				}
			}
		}
		for (local7 = 0; local7 < Static105.anInt2015; local7++) {
			local20 = Static7.anIntArray12[local7];
			@Pc(69) Class22_Sub3_Sub1 local69 = Static265.aClass22_Sub3_Sub1Array1[local20];
			if (local69 != null && local69.anInt4636 > 0) {
				local69.anInt4636--;
				if (local69.anInt4636 == 0) {
					local69.aString150 = null;
				}
			}
		}
	}
}
