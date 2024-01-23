import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "Lclient!df;")
	public static Class1_Sub3_Sub5 aClass1_Sub3_Sub5_2;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "Lclient!th;")
	public static Class168 aClass168_129;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "Lclient!cj;")
	public static Class27 aClass27_22;

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
	public static int anInt3904;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "Lclient!th;")
	public static Class168 aClass168_130;

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "Lclient!cj;")
	public static Class27 aClass27_23;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	public static int anInt3900 = 2;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public static void method2829() {
		if (Static198.aBoolean268) {
			Static198.aBoolean268 = false;
			Static108.aClass1_Sub3_Sub13_6 = null;
			Static300.aClass46_1 = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2830(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(14) String local14 = Static238.method3756(arg0);
		if (local14 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static223.anInt4775; local25++) {
			@Pc(34) String local34 = Static238.method3756(Static280.aStringArray43[local25]);
			if (local34 != null && local34.equals(local14)) {
				Static223.anInt4775--;
				for (@Pc(51) int local51 = local25; local51 < Static223.anInt4775; local51++) {
					Static280.aStringArray43[local51] = Static280.aStringArray43[local51 + 1];
					Static234.aStringArray39[local51] = Static234.aStringArray39[local51 + 1];
					Static114.anIntArray259[local51] = Static114.anIntArray259[local51 + 1];
					Static142.aStringArray29[local51] = Static142.aStringArray29[local51 + 1];
					Static77.anIntArray187[local51] = Static77.anIntArray187[local51 + 1];
					Static60.aBooleanArray16[local51] = Static60.aBooleanArray16[local51 + 1];
				}
				Static41.anInt1002 = Static12.anInt4023;
				Static2.aClass1_Sub14_Sub1_1.method2252(74);
				Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(arg0));
				Static2.aClass1_Sub14_Sub1_1.method2188(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public static void method2831() {
		Static83.method1427(false);
		System.gc();
		Static112.method1823(25);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!im;ILclient!im;IZ)I")
	public static int method2832(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(9) int local9 = arg0.anInt2571;
			@Pc(12) int local12 = arg2.anInt2571;
			if (!arg3) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg1 == 2) {
			return Static141.method4423(arg0.method1930().aString329, arg2.method1930().aString329, Static134.anInt3081);
		} else if (arg1 == 3) {
			if (arg0.aString161.equals("-")) {
				if (arg2.aString161.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString161.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static141.method4423(arg0.aString161, arg2.aString161, Static134.anInt3081);
			}
		} else if (arg1 == 4) {
			return arg0.method1920() ? (arg2.method1920() ? 0 : 1) : (arg2.method1920() ? -1 : 0);
		} else if (arg1 == 5) {
			return arg0.method1922() ? (arg2.method1922() ? 0 : 1) : (arg2.method1922() ? -1 : 0);
		} else if (arg1 == 6) {
			return arg0.method1926() ? (arg2.method1926() ? 0 : 1) : arg2.method1926() ? -1 : 0;
		} else if (arg1 == 7) {
			return arg0.method1921() ? (arg2.method1921() ? 0 : 1) : (arg2.method1921() ? -1 : 0);
		} else {
			return arg0.anInt2583 - arg2.anInt2583;
		}
	}
}
