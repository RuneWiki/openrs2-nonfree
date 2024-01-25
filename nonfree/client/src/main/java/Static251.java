import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!o;")
	public static final Class169 aClass169_233 = new Class169("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt4365 = 0;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_112 = new Class211(54, 3);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
	public static boolean method3878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static56.anInt1158; local1++) {
			@Pc(6) Class5 local6 = Static146.aClass5Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt86 == 1) {
				local15 = local6.anInt73 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt83 + (local6.anInt75 * local15 >> 8);
					local37 = local6.anInt70 + (local6.anInt81 * local15 >> 8);
					local47 = local6.anInt84 + (local6.anInt72 * local15 >> 8);
					local57 = local6.anInt92 + (local6.anInt87 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt86 == 2) {
				local15 = arg0 - local6.anInt73;
				if (local15 > 0) {
					local27 = local6.anInt83 + (local6.anInt75 * local15 >> 8);
					local37 = local6.anInt70 + (local6.anInt81 * local15 >> 8);
					local47 = local6.anInt84 + (local6.anInt72 * local15 >> 8);
					local57 = local6.anInt92 + (local6.anInt87 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt86 == 3) {
				local15 = local6.anInt83 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt73 + (local6.anInt71 * local15 >> 8);
					local37 = local6.anInt78 + (local6.anInt77 * local15 >> 8);
					local47 = local6.anInt84 + (local6.anInt72 * local15 >> 8);
					local57 = local6.anInt92 + (local6.anInt87 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt86 == 4) {
				local15 = arg2 - local6.anInt83;
				if (local15 > 0) {
					local27 = local6.anInt73 + (local6.anInt71 * local15 >> 8);
					local37 = local6.anInt78 + (local6.anInt77 * local15 >> 8);
					local47 = local6.anInt84 + (local6.anInt72 * local15 >> 8);
					local57 = local6.anInt92 + (local6.anInt87 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt86 == 5) {
				local15 = arg1 - local6.anInt84;
				if (local15 > 0) {
					local27 = local6.anInt73 + (local6.anInt71 * local15 >> 8);
					local37 = local6.anInt78 + (local6.anInt77 * local15 >> 8);
					local47 = local6.anInt83 + (local6.anInt75 * local15 >> 8);
					local57 = local6.anInt70 + (local6.anInt81 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method3879() {
		@Pc(5) byte local5 = 0;
		if (Static188.aClass135_Sub1_1.aBoolean332) {
			local5 = 55;
		}
		Static319.method4696(local5);
		Static54.aClass153_1.method3080(local5);
		Static263.aClass102_2.method2183(local5);
		Static168.aClass196_2.method4448(local5);
		Static10.aClass246_1.method5425(local5);
		Static311.method4630(local5);
		Static355.method3872(local5);
		Static258.method3960(local5);
		Static235.method3242(local5);
		if (Static142.anInt2665 == 10) {
			Static212.method2974(28);
		} else if (Static142.anInt2665 == 30) {
			Static212.method2974(25);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IC)Z")
	public static boolean method3881(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!sk;IIIILclient!sk;BIII)V")
	public static void method3882(@OriginalArg(0) Class25_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25_Sub1_Sub1 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg4.method1883();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class51 local20 = (Class51) Static297.aClass227_41.method4863((long) local7);
		if (local20 == null) {
			@Pc(27) Class80[] local27 = Static397.method1432(Static145.aClass230_41, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static66.aClass164_2.method5360(local27[0]);
			Static297.aClass227_41.method4865(local20, (long) local7);
		}
		Static382.method5421(arg0.anInt6080, arg3 >> 1, arg0.aByte70, arg5 >> 1, arg0.method1877() * 64, arg0.anInt6077, 0);
		@Pc(73) int local73 = Static202.anIntArray421[0] + arg2 - 18;
		@Pc(81) int local81 = local73 + arg1 / 4 * 18;
		@Pc(91) int local91 = arg6 + Static202.anIntArray421[1] - 54 - 16;
		@Pc(99) int local99 = local91 + arg1 % 4 * 18;
		local20.method4669(local81, local99);
		if (arg0 == arg4) {
			Static66.aClass164_2.method5397(18, 18, local81 - 1, -256, local99 - 1);
		}
		@Pc(129) Class41_Sub6 local129 = Static313.method4637();
		local129.anInt5562 = local99;
		local129.aClass25_Sub1_Sub1_1 = arg4;
		local129.anInt5561 = local81;
		local129.anInt5560 = local99 + 16;
		local129.anInt5563 = local81 + 16;
		Static245.aClass208_5.method4664(local129);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
	public static void method3883() {
		@Pc(7) Class237 local7 = null;
		try {
			@Pc(11) Class112 local11 = Static341.aClass162_5.method3265();
			while (local11.anInt2969 == 0) {
				Static57.method5056(1L);
			}
			if (local11.anInt2969 == 1) {
				local7 = (Class237) local11.anObject5;
				@Pc(38) Class1_Sub33 local38 = new Class1_Sub33(Static380.anInt6134 * 6 + 3);
				local38.method5165(1);
				local38.method5138(Static380.anInt6134);
				for (@Pc(48) int local48 = 0; local48 < Static158.anIntArray322.length; local48++) {
					if (Static105.aBooleanArray10[local48]) {
						local38.method5138(local48);
						local38.method5142(Static158.anIntArray322[local48]);
					}
				}
				local7.method5208(local38.aByteArray86, local38.lb, 0);
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local7 != null) {
				local7.method5212();
			}
		} catch (@Pc(86) Exception local86) {
		}
		Static104.aLong56 = Static378.method5293();
		Static121.aBoolean177 = false;
	}
}
