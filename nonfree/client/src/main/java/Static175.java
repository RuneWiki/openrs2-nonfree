import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!f;")
	public static Class13 aClass13_32;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "[S")
	public static short[] aShortArray37;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2032 = Static122.method531("This world is full)3");

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2036 = Static122.method531("This computers address has been blocked");

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2033 = aClass73_2036;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "[S")
	public static short[] aShortArray36 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2034 = Static122.method531("scape main");

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2039 = Static122.method531("wave2:");

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2035 = aClass73_2039;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2037 = aClass73_2032;

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2038 = aClass73_2039;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIB)Lclient!fg;")
	public static Class3_Sub13 method2697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub13 local8 = new Class3_Sub13();
		local8.anInt1132 = arg2;
		local8.anInt1133 = arg0;
		Static91.aClass16_9.method546(local8, (long) arg1);
		Static130.method2166(arg0);
		Static119.method2071(arg0);
		@Pc(34) Class83 local34 = Static80.method1396(arg1);
		if (local34 != null) {
			Static60.method1104(local34);
		}
		if (Static11.aClass83_3 != null) {
			Static60.method1104(Static11.aClass83_3);
			Static11.aClass83_3 = null;
		}
		Static142.anInt3262 = 0;
		Static169.aBoolean245 = false;
		Static23.method500(Static53.anInt3959, Static116.anInt2761, Static138.anInt3195, Static133.anInt3045);
		if (Static133.anInt3052 != -1) {
			Static148.method2412(1, Static133.anInt3052);
		}
		return local8;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method2699() {
		@Pc(5) int local5 = Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1062(Static102.aClass73_1312);
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < Static142.anInt3262; local7++) {
			local15 = Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1062(Static50.method909(local7));
			if (local5 < local15) {
				local5 = local15;
			}
		}
		local15 = Static142.anInt3262 * 15 + 21;
		local5 += 8;
		Static53.anInt3959 = Static142.anInt3262 * 15 + 22;
		Static169.aBoolean245 = true;
		@Pc(58) int local58 = Static61.anInt1463 - local5 / 2;
		Static133.anInt3045 = local5;
		if (local5 + local58 > 765) {
			local58 = 765 - local5;
		}
		@Pc(72) int local72 = Static51.anInt1243;
		if (local72 + local15 > 503) {
			local72 = 503 - local15;
		}
		if (local72 < 0) {
			local72 = 0;
		}
		Static138.anInt3195 = local72;
		if (local58 < 0) {
			local58 = 0;
		}
		Static116.anInt2761 = local58;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 method2702() {
		@Pc(7) Class3_Sub1_Sub3_Sub3 local7 = new Class3_Sub1_Sub3_Sub3();
		local7.anIntArray196 = Static9.anIntArray12;
		local7.anInt1919 = Static72.anIntArray177[0];
		local7.anInt1915 = Static86.anInt1939;
		local7.anInt1914 = Static143.anIntArray350[0];
		local7.anInt1918 = Static42.anIntArray46[0];
		local7.aByteArray17 = Static124.aByteArrayArray8[0];
		local7.anInt1916 = Static57.anInt1344;
		local7.anInt1917 = Static37.anIntArray89[0];
		Static90.method1592();
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
	public static void method2703(@OriginalArg(1) int arg0) {
		if (Static137.anInt3105 == 0) {
			Static147.aClass3_Sub9_Sub2_2.method923(arg0);
		} else {
			Static71.anInt1634 = arg0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method2705() {
		aClass73_2036 = null;
		aClass73_2033 = null;
		aClass73_2037 = null;
		aShortArray37 = null;
		anIntArray417 = null;
		aShortArray36 = null;
		aClass13_32 = null;
		aClass73_2032 = null;
		aClass73_2035 = null;
		aClass73_2039 = null;
		aClass73_2038 = null;
		aClass73_2034 = null;
		aBooleanArray18 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fa;")
	public static RuntimeException_Sub1 method2706(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!f;Lclient!sd;IILclient!sd;IZ)V")
	public static void method2707(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(4) Class73 arg2) {
		@Pc(15) int local15 = arg0.method359(arg1);
		@Pc(21) int local21 = arg0.method358(local15, arg2);
		Static57.method996(local15, 255, arg0, local21);
	}
}
