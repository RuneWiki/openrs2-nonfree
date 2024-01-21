import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "Lclient!oa;")
	public static Class7 aClass7_73;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1183 = Static38.method736("Accept challenge");

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1182 = aClass71_1183;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	public static int anInt2378 = 0;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	public static int anInt2379 = 0;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1184 = Static38.method736("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1185 = Static38.method736("blinken1:");

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1186 = Static38.method736("wishes to duel with you)3");

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1187 = Static38.method736("(U5");

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1188 = aClass71_1186;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1189 = Static38.method736("Ignorieren");

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	public static int anInt2385 = -1;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method1640() {
		aClass71_1186 = null;
		aClass71_1188 = null;
		aClass71_1189 = null;
		aClass7_73 = null;
		aClass71_1185 = null;
		aClass71_1184 = null;
		aClass71_1182 = null;
		aClass71_1183 = null;
		aClass71_1187 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/awt/Component;ZLclient!ha;)V")
	public static void method1641(@OriginalArg(2) Component arg0, @OriginalArg(4) Class29 arg1) {
		Static72.anInt1825 = 22050;
		Static102.aBoolean104 = false;
		Static94.aLong85 = Static50.method959();
		try {
			@Pc(15) Class3_Sub2 local15 = (Class3_Sub2) Class.forName("Class3_Sub2_Sub2").getDeclaredConstructor().newInstance();
			local15.method1229(arg0);
			local15.method1223(arg1, 2048);
			Static57.aClass3_1 = local15;
		} catch (@Pc(28) Throwable local28) {
			try {
				@Pc(33) Class3_Sub2_Sub1 local33 = new Class3_Sub2_Sub1(arg1);
				local33.method1229(arg0);
				local33.method1223(arg1, 16384);
				Static57.aClass3_1 = local33;
			} catch (@Pc(51) Throwable local51) {
				if (Static43.aString2.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static57.aClass3_1 = new Class3_Sub1();
						Static72.anInt1825 = 8000;
						Static102.aBoolean104 = false;
						return;
					} catch (@Pc(66) Throwable local66) {
					}
				}
				Static57.aClass3_1 = new Class3();
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
	public static void method1642() {
		Static71.aClass4_1.method708();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static85.aLongArray7[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static112.aLongArray8[local22] = 0L;
		}
		Static105.anInt2400 = 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!vc;ZLclient!vc;Lclient!vc;)V")
	public static void method1643(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class71 arg2) {
		Static98.aClass71_945 = arg1;
		Static98.aClass71_948 = arg0;
		Static98.aClass71_949 = arg2;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Lclient!gf;")
	public static Class5_Sub1_Sub8 method1644(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1_Sub8 local10 = (Class5_Sub1_Sub8) Static46.aClass54_22.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static21.aClass24_4.method679(4, arg0);
		local10 = new Class5_Sub1_Sub8();
		if (local20 != null) {
			local10.method765(new Class5_Sub11(local20), arg0);
		}
		local10.method760();
		Static46.aClass54_22.method1399(local10, (long) arg0);
		return local10;
	}
}
