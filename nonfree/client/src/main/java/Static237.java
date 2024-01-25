import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "Lclient!of;")
	public static Class40 aClass40_13;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString188 = null;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BJ)V")
	public static void method4194(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!mb;I)Z")
	public static boolean method4197(@OriginalArg(0) Class132 arg0) {
		if (arg0.anIntArray406 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray406.length; local20++) {
			@Pc(27) int local27 = Static191.method3587(local20, arg0);
			@Pc(32) int local32 = arg0.anIntArray407[local20];
			if (arg0.anIntArray406[local20] == 2) {
				if (local27 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray406[local20] == 3) {
				if (local32 >= local27) {
					return false;
				}
			} else if (arg0.anIntArray406[local20] == 4) {
				if (local32 == local27) {
					return false;
				}
			} else if (local32 != local27) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	public static void method4198() {
		@Pc(6) Class70 local6 = Static267.aClass70_84;
		synchronized (Static267.aClass70_84) {
			Static267.aClass70_84.method1397(5);
		}
		local6 = Static336.aClass70_105;
		synchronized (Static336.aClass70_105) {
			Static336.aClass70_105.method1397(5);
		}
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)Z")
	public static boolean method4200() {
		@Pc(5) Class198 local5 = Static337.aClass198_1;
		synchronized (Static337.aClass198_1) {
			if (Static329.anInt6095 == Static292.anInt5505) {
				return false;
			} else {
				Static67.anInt1255 = Static181.anIntArray397[Static292.anInt5505];
				Static156.aChar10 = Static16.aCharArray1[Static292.anInt5505];
				Static292.anInt5505 = Static292.anInt5505 + 1 & 0x7F;
				return true;
			}
		}
	}
}
