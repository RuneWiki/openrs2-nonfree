import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!he", name = "jb", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_11;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "Lclient!v;")
	public static Class76 aClass76_516 = Static134.method2017("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
	public static int anInt1191 = 0;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
	public static int anInt1192 = 0;

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!v;")
	private static Class76 aClass76_517 = Static134.method2017("Please wait)3)3)3");

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "Lclient!v;")
	private static Class76 aClass76_518 = Static134.method2017("Please enter your password)3");

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
	public static int anInt1195 = 0;

	@OriginalMember(owner = "client!he", name = "yb", descriptor = "Lclient!v;")
	private static Class76 aClass76_525 = Static134.method2017("glow2:");

	@OriginalMember(owner = "client!he", name = "ib", descriptor = "Lclient!v;")
	public static Class76 aClass76_519 = aClass76_525;

	@OriginalMember(owner = "client!he", name = "kb", descriptor = "Lclient!v;")
	public static Class76 aClass76_520 = Static134.method2017("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!he", name = "mb", descriptor = "Lclient!v;")
	public static Class76 aClass76_521 = aClass76_518;

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "Lclient!v;")
	public static Class76 aClass76_522 = Static134.method2017("auf der Hautpseite)3");

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "Lclient!v;")
	public static Class76 aClass76_523 = aClass76_525;

	@OriginalMember(owner = "client!he", name = "ub", descriptor = "Lclient!v;")
	public static Class76 aClass76_524 = aClass76_517;

	@OriginalMember(owner = "client!he", name = "xb", descriptor = "I")
	public static int anInt1205 = 127;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!dc;I)V")
	public static void method810(@OriginalArg(1) Class17_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static34.aClass4_Sub10_3 == null) {
			Static56.method981(255, 0, null, true, (byte) 0, 255);
			Static32.aClass17_Sub1Array1[arg1] = arg0;
		} else {
			Static34.aClass4_Sub10_3.anInt931 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static34.aClass4_Sub10_3.method549();
			@Pc(20) int local20 = Static34.aClass4_Sub10_3.method549();
			arg0.method305(local20, local16);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BI)I")
	public static int method811(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static48.method841(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
	public static boolean method812() {
		@Pc(5) Class53 local5 = Static6.aClass53_1;
		synchronized (Static6.aClass53_1) {
			if (Static130.anInt2771 == Static101.anInt2302) {
				return false;
			} else {
				Static28.anInt589 = Static55.anIntArray186[Static101.anInt2302];
				Static78.anInt1984 = Static94.anIntArray307[Static101.anInt2302];
				Static101.anInt2302 = Static101.anInt2302 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
	public static void method813() {
		@Pc(5) Class55 local5 = Static92.aClass55_1;
		synchronized (Static92.aClass55_1) {
			Static122.anInt2680 = Static57.anInt1523;
			Static2.anInt31 = Static10.anInt212;
			Static126.anInt2734 = Static98.anInt2267;
			Static38.anInt1093 = Static114.anInt2471;
			Static75.anInt1928 = Static42.anInt1165;
			Static20.anInt427 = Static124.anInt2717;
			Static36.aLong37 = Static23.aLong22;
			Static114.anInt2471 = 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!la;I)V")
	public static void method814(@OriginalArg(0) Class17 arg0) {
		Static120.aClass17_39 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!v;)Z")
	public static boolean method815(@OriginalArg(1) Class76 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < anInt1192; local18++) {
			if (arg0.method1882(Static75.aClass76Array20[local18])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
	public static boolean method816(@OriginalArg(1) int arg0) {
		if (Static92.aBooleanArray13[arg0]) {
			return true;
		} else if (Static31.aClass17_10.method289(arg0)) {
			@Pc(25) int local25 = Static31.aClass17_10.method283(arg0);
			if (local25 == 0) {
				Static92.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static29.aClass4_Sub8ArrayArray1[arg0] == null) {
				Static29.aClass4_Sub8ArrayArray1[arg0] = new Class4_Sub8[local25];
			}
			for (@Pc(44) int local44 = 0; local44 < local25; local44++) {
				if (Static29.aClass4_Sub8ArrayArray1[arg0][local44] == null) {
					@Pc(61) byte[] local61 = Static31.aClass17_10.method290(arg0, local44);
					if (local61 != null) {
						Static29.aClass4_Sub8ArrayArray1[arg0][local44] = new Class4_Sub8();
						Static29.aClass4_Sub8ArrayArray1[arg0][local44].anInt514 = local44 + (arg0 << 16);
						if (local61[0] == -1) {
							Static29.aClass4_Sub8ArrayArray1[arg0][local44].method329(new Class4_Sub10(local61));
						} else {
							Static29.aClass4_Sub8ArrayArray1[arg0][local44].method321(new Class4_Sub10(local61));
						}
					}
				}
			}
			Static92.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
	public static void method817() {
		aClass76_516 = null;
		aClass76_519 = null;
		aClass76_520 = null;
		aClass76_525 = null;
		aClass76_518 = null;
		aClass76_517 = null;
		aClass76_524 = null;
		aClass76_522 = null;
		aClass76_523 = null;
		aClass17_Sub1_11 = null;
		aClass76_521 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (method816(arg2)) {
			Static95.aClass4_Sub8Array2 = null;
			Static97.method1560(arg7, arg4, Static29.aClass4_Sub8ArrayArray1[arg2], arg5, arg1, -1, arg6, arg0, arg3);
			if (Static95.aClass4_Sub8Array2 != null) {
				Static97.method1560(arg7, arg4, Static95.aClass4_Sub8Array2, arg5, Static29.anInt599, -1412584499, arg6, Static69.anInt1765, arg3);
				Static95.aClass4_Sub8Array2 = null;
			}
		} else if (arg4 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static70.aBooleanArray9[local14] = true;
			}
		} else {
			Static70.aBooleanArray9[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!ne;)V")
	public static void method819(@OriginalArg(1) Class4_Sub10 arg0) {
		@Pc(4) byte[] local4 = new byte[24];
		if (Static69.aClass68_9 != null) {
			@Pc(16) int local16;
			try {
				local16 = 0;
				Static69.aClass68_9.method1685(0L);
				Static69.aClass68_9.method1677(local4);
				while (local16 < 24 && local4[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local16 = 0; local16 < 24; local16++) {
					local4[local16] = -1;
				}
			}
		}
		arg0.method601(local4, 24);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method820(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
