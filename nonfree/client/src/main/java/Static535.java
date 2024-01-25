import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!th;")
	public static Class322 aClass322_5;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_151 = new Class274(87, 3);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)I")
	public static int method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = ((arg0 & 0xFF00) * local12 & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return (((arg1 & 0xFF00FF) * local35 & 0xFF00FF00 | local35 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7476(@OriginalArg(1) String arg0) {
		Static538.aString82 = arg0;
		if (Static234.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static234.anApplet2.getParameter("cookieprefix");
			@Pc(19) String local19 = Static234.anApplet2.getParameter("cookiehost");
			@Pc(34) String local34 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static96.method1664(Static438.method6517() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static648.method3665(Static234.anApplet2, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(87) Throwable local87) {
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)V")
	public static void method7477(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static214.aBooleanArray27[arg0]) {
			Static455.aClass97_116.method2572(arg0);
			Static399.aClass78ArrayArray1[arg0] = null;
			Static629.aClass78ArrayArray2[arg0] = null;
			Static214.aBooleanArray27[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIILclient!ht;)V")
	public static void method7478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1_Sub4 arg3) {
		@Pc(4) Class217 local4 = Static334.method5171(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass11_Sub1_Sub4_1 = arg3;
		@Pc(16) int local16 = Static331.aClass112Array3 == Static164.aClass112Array1 ? 1 : 0;
		if (arg3.method8306()) {
			if (arg3.method8310()) {
				Static146.aClass11_Sub1ArrayArray1[local16][Static442.anIntArray535[local16]++] = arg3;
				return;
			}
			Static317.aClass11_Sub1ArrayArray2[local16][Static336.anIntArray411[local16]++] = arg3;
			Static445.aBoolean594 = true;
			return;
		}
		Static483.aClass11_Sub1ArrayArray3[local16][Static429.anIntArray527[local16]++] = arg3;
	}
}
