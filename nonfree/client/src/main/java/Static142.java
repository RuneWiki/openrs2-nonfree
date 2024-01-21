import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "Lclient!wc;")
	public static Class86 aClass86_1 = new Class86();

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "[I")
	public static int[] anIntArray334 = new int[2048];

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1387 = Static51.method932("Examine");

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1386 = aClass10_1387;

	@OriginalMember(owner = "client!rh", name = "W", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1391 = Static51.method932("cyan:");

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1388 = aClass10_1391;

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
	public static int anInt3158 = -2;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
	public static int anInt3159 = 127;

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1389 = Static51.method932("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1390 = Static51.method932("Die Verbindung konnte");

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
	public static int anInt3160 = 0;

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1392 = aClass10_1391;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1393 = Static51.method932("(Y<)4col>");

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1394 = Static51.method932("leuchten1:");

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
	public static int[] anIntArray335 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!lf;IIB)V")
	public static void method2245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class2_Sub20 local7 = new Class2_Sub20();
		local7.anInt3027 = arg0 * 128;
		local7.anInt3013 = arg1 * 128;
		local7.anInt3014 = arg2.anInt2236 * 128;
		local7.anInt3020 = arg2.anInt2226;
		local7.anInt3021 = arg2.anInt2245;
		local7.anInt3024 = arg4;
		local7.anIntArray326 = arg2.anIntArray235;
		local7.anInt3022 = arg2.anInt2249;
		@Pc(50) int local50 = arg2.anInt2210;
		@Pc(53) int local53 = arg2.anInt2225;
		if (arg3 == 1 || arg3 == 3) {
			local53 = arg2.anInt2210;
			local50 = arg2.anInt2225;
		}
		local7.anInt3019 = (arg0 + local53) * 128;
		local7.anInt3012 = (local50 + arg1) * 128;
		if (arg2.anIntArray234 != null) {
			local7.aClass2_Sub1_Sub10_1 = arg2;
			local7.method2158();
		}
		Static136.aClass12_11.method382(local7);
		if (local7.anIntArray326 != null) {
			local7.anInt3017 = (int) (Math.random() * (double) (local7.anInt3020 - local7.anInt3022)) + local7.anInt3022;
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
	public static void method2246() {
		aClass10_1394 = null;
		aClass10_1393 = null;
		aClass10_1387 = null;
		aClass86_1 = null;
		aClass10_1392 = null;
		aClass10_1390 = null;
		aClass10_1386 = null;
		aClass10_1388 = null;
		anIntArray335 = null;
		aClass10_1389 = null;
		aClass10_1391 = null;
		anIntArray334 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI)I")
	public static int method2248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			arg0 = (arg1 & 0x7F) * arg0 / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method2249(@OriginalArg(0) Component arg0) {
		@Pc(13) Method local13 = Static122.aMethod1;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static156.aClass84_1);
		arg0.addFocusListener(Static156.aClass84_1);
	}
}
