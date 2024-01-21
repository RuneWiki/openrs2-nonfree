import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!v", name = "Hc", descriptor = "[Lclient!be;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!v", name = "Jc", descriptor = "I")
	public static int anInt2848;

	@OriginalMember(owner = "client!v", name = "Nc", descriptor = "[I")
	public static int[] anIntArray486;

	@OriginalMember(owner = "client!v", name = "Oc", descriptor = "Lclient!dd;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!v", name = "bd", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_20;

	@OriginalMember(owner = "client!v", name = "kd", descriptor = "Z")
	public static boolean aBoolean128;

	@OriginalMember(owner = "client!v", name = "Bc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1380 = Static78.method1313("<col=00ffff>");

	@OriginalMember(owner = "client!v", name = "dd", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1385 = Static78.method1313("Loading title screen )2 ");

	@OriginalMember(owner = "client!v", name = "Ec", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1381 = aClass25_1385;

	@OriginalMember(owner = "client!v", name = "Fc", descriptor = "I")
	public static int anInt2845 = 0;

	@OriginalMember(owner = "client!v", name = "Kc", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1382 = Static78.method1313("Accept trade");

	@OriginalMember(owner = "client!v", name = "Lc", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!v", name = "Rc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1383 = aClass25_1382;

	@OriginalMember(owner = "client!v", name = "Vc", descriptor = "[I")
	public static int[] anIntArray487 = new int[25];

	@OriginalMember(owner = "client!v", name = "ed", descriptor = "I")
	public static final int anInt2859 = 2301979;

	@OriginalMember(owner = "client!v", name = "jd", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1386 = Static78.method1313("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V")
	public static void method1979() {
		aClass25_1380 = null;
		aClass18_1 = null;
		aClass25_1386 = null;
		aClass25_1382 = null;
		aClass11Array1 = null;
		aClass56_Sub1_20 = null;
		anIntArray487 = null;
		aClass25_1385 = null;
		aClass25_1381 = null;
		anIntArray486 = null;
		aClass25_1383 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1980(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static90.method1519(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static68.aClass74_1.anApplet1 != null) {
				@Pc(108) Class50 local108 = Static68.aClass74_1.method1819(new URL(Static68.aClass74_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static100.anInt2319 + "&u=" + Static38.aLong76 + "&v1=" + Static113.aString5 + "&v2=" + Static113.aString3 + "&e=" + local7));
				while (local108.anInt1485 == 0) {
					Static53.method1782(1L);
				}
				if (local108.anInt1485 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local108.anObject4;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
	public static void method1982() {
		Static101.aClass63_21.method1513();
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(B)V")
	public static void method1983() {
		if (Static3.anInt59 == 2) {
			Static107.method1733((Static92.anInt2075 - Static46.anInt1190 << 7) + Static10.anInt267, anInt2845 * 2, (Static69.anInt1480 - Static47.anInt1211 << 7) + Static110.anInt2552);
			if (Static12.anInt333 > -1 && Static60.anInt1366 % 20 < 10) {
				Static118.aClass1_Sub2_Sub2_Sub1Array9[0].method204(Static12.anInt333 - 12, Static53.anInt2569 + -28);
			}
		}
	}
}
