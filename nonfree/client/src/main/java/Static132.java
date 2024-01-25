import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_38 = new Class67("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	public static int anInt2742 = -1;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_35 = new Class158(14, 8);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZZILclient!qf;)V")
	public static void method2301(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class245 arg3) {
		@Pc(8) int local8 = arg3.anInt7249;
		@Pc(11) int local11 = arg3.anInt7229;
		if (arg3.aByte78 == 0) {
			arg3.anInt7249 = arg3.anInt7262;
		} else if (arg3.aByte78 == 1) {
			arg3.anInt7249 = arg2 - arg3.anInt7262;
		} else if (arg3.aByte78 == 2) {
			arg3.anInt7249 = arg2 * arg3.anInt7262 >> 14;
		}
		if (arg3.aByte81 == 0) {
			arg3.anInt7229 = arg3.anInt7239;
		} else if (arg3.aByte81 == 1) {
			arg3.anInt7229 = arg0 - arg3.anInt7239;
		} else if (arg3.aByte81 == 2) {
			arg3.anInt7229 = arg3.anInt7239 * arg0 >> 14;
		}
		if (arg3.aByte78 == 4) {
			arg3.anInt7249 = arg3.anInt7229 * arg3.anInt7267 / arg3.anInt7297;
		}
		if (arg3.aByte81 == 4) {
			arg3.anInt7229 = arg3.anInt7297 * arg3.anInt7249 / arg3.anInt7267;
		}
		if (Static362.aBoolean430 && (Static63.method1295(arg3).anInt1859 != 0 || arg3.anInt7223 == 0)) {
			if (arg3.anInt7229 < 5 && arg3.anInt7249 < 5) {
				arg3.anInt7249 = 5;
				arg3.anInt7229 = 5;
			} else {
				if (arg3.anInt7229 <= 0) {
					arg3.anInt7229 = 5;
				}
				if (arg3.anInt7249 <= 0) {
					arg3.anInt7249 = 5;
				}
			}
		}
		if (arg3.anInt7273 == Static135.anInt2757) {
			Static20.aClass245_1 = arg3;
		}
		if (arg1 && arg3.anObjectArray6 != null && (arg3.anInt7249 != local8 || local11 != arg3.anInt7229)) {
			@Pc(194) Class3_Sub21 local194 = new Class3_Sub21();
			local194.anObjectArray4 = arg3.anObjectArray6;
			local194.aClass245_8 = arg3;
			Static471.aClass71_64.method2076(local194);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I")
	public static int method2302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = 255 - arg1;
		@Pc(35) int local35 = ((arg2 & 0xFF00FF) * arg1 & 0xFF00FF00 | arg1 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local17 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local17 & 0xFF00FF00) >>> 8) + local35;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)Z")
	public static boolean method2303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static29.method808(arg0, arg1) & Static310.method5038(arg0, arg1);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!rt;)V")
	public static void method2304(@OriginalArg(1) Class3_Sub27 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static267.anInt5563; local11++) {
			@Pc(17) int local17 = arg0.method7547();
			@Pc(21) int local21 = arg0.method7591();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static246.aClass68_Sub1Array1[local17] != null) {
				Static246.aClass68_Sub1Array1[local17].anInt2092 = local21;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method2306() {
		Static492.aClass161_109.anInt5061 = 1;
		Static12.method649();
		Static530.aBoolean675 = true;
		Static323.aBoolean394 = true;
		Static290.method4909();
		for (@Pc(7079) int local7079 = 0; local7079 < Static518.aClass296Array2.length; local7079++) {
			Static518.aClass296Array2[local7079] = null;
		}
		Static506.aBoolean659 = false;
		Static208.method3830();
		Static509.anInt8869 = (int) (Math.random() * 30.0D) - 20;
		Static148.anInt2973 = (int) (Math.random() * 80.0D) - 40;
		Static487.aFloat258 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static410.anInt7538 = (int) (Math.random() * 100.0D) - 50;
		Static308.anInt6011 = (int) (Math.random() * 110.0D) - 55;
		Static262.anInt5488 = (int) (Math.random() * 120.0D) - 60;
		Static297.method4963();
		for (@Pc(7151) int local7151 = 0; local7151 < 2048; local7151++) {
			Static498.aClass6_Sub1_Sub2_Sub1Array1[local7151] = null;
		}
		Static221.anInt4798 = 0;
		Static183.anInt5938 = 0;
		Static240.aClass267_20.method6648();
		Static436.aClass71_60.method2088();
		Static422.aClass71_65.method2088();
		Static226.aClass90_10.method2324();
		Static476.aClass267_37.method6648();
		Static536.aClass71_67 = new Class71();
		Static127.aClass215_1.method5538();
		Static201.method3755();
		Static347.anInt6621 = 0;
		Static99.anInt6726 = 0;
		Static49.anInt1109 = 0;
		Static400.anInt7395 = 0;
		Static515.anInt8982 = 0;
		Static205.anInt4557 = 0;
		Static346.anInt6595 = 0;
		Static22.anInt8153 = 0;
		Static192.anInt4400 = 0;
		Static236.anInt1380 = 0;
		for (@Pc(7215) int local7215 = 0; local7215 < Static416.anIntArray153.length; local7215++) {
			if (!Static4.aBooleanArray44[local7215]) {
				Static416.anIntArray153[local7215] = -1;
			}
		}
		if (Static422.anInt8667 != -1) {
			Static102.method4938(Static422.anInt8667);
		}
		for (@Pc(7242) Class3_Sub29 local7242 = (Class3_Sub29) Static156.aClass267_14.method6643(); local7242 != null; local7242 = (Class3_Sub29) Static156.aClass267_14.method6650()) {
			if (!local7242.method7821()) {
				local7242 = (Class3_Sub29) Static156.aClass267_14.method6643();
				if (local7242 == null) {
					break;
				}
			}
			Static361.method5656(false, true, local7242);
		}
		Static422.anInt8667 = -1;
		Static156.aClass267_14 = new Class267(8);
		Static104.method2058();
		Static140.aClass245_4 = null;
		for (@Pc(7288) int local7288 = 0; local7288 < 8; local7288++) {
			Static521.aStringArray50[local7288] = null;
			Static184.aBooleanArray21[local7288] = false;
			Static486.anIntArray673[local7288] = -1;
		}
		Static3.method402();
		Static220.aBoolean338 = true;
		for (@Pc(7312) int local7312 = 0; local7312 < 100; local7312++) {
			Static125.aBooleanArray12[local7312] = true;
		}
		for (@Pc(7326) int local7326 = 0; local7326 < 6; local7326++) {
			Static469.aClass105Array1[local7326] = new Class105();
		}
		for (@Pc(7340) int local7340 = 0; local7340 < 25; local7340++) {
			Static437.anIntArray679[local7340] = 0;
			Static82.anIntArray157[local7340] = 0;
			Static403.anIntArray652[local7340] = 0;
		}
		Static245.method4229();
		Static256.aBoolean354 = true;
		Static532.aShortArray194 = Static9.aShortArray184 = Static120.aShortArray64 = Static350.aShortArray148 = new short[256];
		Static441.aString63 = Static83.aClass67_24.method1934(Static193.anInt7803);
		Static7.aClass3_Sub15_Sub1_1.aBoolean613 = false;
		Static22.anInt8151 = 0;
		Static7.aClass3_Sub15_Sub1_1.aBoolean610 = false;
		Static59.method1189();
		Static528.method7621();
		Static492.aClass161_109.anInt5061 = 2;
		Static361.aClass3_Sub40_2 = null;
		Static79.aLong58 = 0L;
	}
}
