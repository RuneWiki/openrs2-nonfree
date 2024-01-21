import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!vh", name = "X", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1478 = Static151.method2243("Too many connections from your address)3");

	@OriginalMember(owner = "client!vh", name = "kb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1479 = aClass62_1478;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[[[II)V")
	public static void method2993(@OriginalArg(3) int[][][] arg0) {
		Static204.anInt4231 = 4;
		Static198.anInt4147 = 104;
		Static12.anInt319 = 104;
		Static92.aClass2_Sub18ArrayArrayArray1 = new Class2_Sub18[4][104][104];
		Static20.anIntArrayArrayArray1 = new int[4][105][105];
		Static72.anIntArrayArrayArray3 = arg0;
		Static19.method346();
		Static182.anInt3830 = 25;
		Static7.aBooleanArrayArray4 = new boolean[Static182.anInt3830 + Static182.anInt3830 + 1][Static182.anInt3830 + Static182.anInt3830 + 1];
		Static89.aBooleanArrayArray2 = new boolean[Static182.anInt3830 + Static182.anInt3830 + 2][Static182.anInt3830 + Static182.anInt3830 + 2];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZ)I")
	public static int method2996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)V")
	public static void method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass18_1 = null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!rg;I)V")
	public static void method2998(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static44.anInt998 != 1) {
			return;
		}
		if (Static43.anInt985 >= 280 && Static43.anInt985 <= 294 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(0, 0);
			return;
		}
		if (Static43.anInt985 >= 295 && Static43.anInt985 <= 360 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(1, 0);
			return;
		}
		if (Static43.anInt985 >= 390 && Static43.anInt985 <= 404 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(0, 1);
			return;
		}
		if (Static43.anInt985 >= 405 && Static43.anInt985 <= 470 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(1, 1);
			return;
		}
		if (Static43.anInt985 >= 500 && Static43.anInt985 <= 514 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(0, 2);
			return;
		}
		if (Static43.anInt985 >= 515 && Static43.anInt985 <= 580 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(1, 2);
			return;
		}
		if (Static43.anInt985 >= 610 && Static43.anInt985 <= 624 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(0, 3);
			return;
		}
		if (Static43.anInt985 >= 625 && Static43.anInt985 <= 690 && Static170.anInt3634 >= 4 && Static170.anInt3634 <= 18) {
			Static90.method28(1, 3);
			return;
		}
		if (Static43.anInt985 >= 700 && Static170.anInt3634 >= 4 && Static43.anInt985 <= 758 && Static170.anInt3634 <= 20) {
			Static56.aBoolean49 = false;
			Static116.method1788();
			return;
		}
		if (Static80.anInt1653 == -1) {
			return;
		}
		@Pc(246) Class38 local246 = Static187.aClass38Array1[Static80.anInt1653];
		if (local246.aBoolean62 == Static36.aBoolean36) {
			@Pc(270) byte[] local270 = Static169.method2460(new Class62[] { local246.aClass62_486, Static163.aClass62_1226 }).method1845();
			Static209.aString6 = new String(local270, 0, local270.length);
			Static56.aBoolean49 = false;
			Static74.anInt1521 = local246.anInt1432;
			if (Static187.anInt3891 != 0) {
				Static187.anInt3891 = 0;
				Static208.anInt4336 = 43594;
				Static5.anInt171 = 43594;
				Static104.anInt2343 = 443;
			}
			Static116.method1788();
			return;
		}
		@Pc(357) Class62 local357 = Static169.method2460(new Class62[] { Static120.aClass62_927, local246.aClass62_486, Static11.aClass62_89, Static119.method1865(Static134.anInt2873), Static119.aClass62_914, Static119.method1865(Static60.aBoolean52 ? 1 : 0), Static174.aClass62_1301, Static119.method1865(Static137.anInt2897), Static26.aClass62_1356, Static119.method1865(Static196.anInt4035) });
		try {
			arg0.getAppletContext().showDocument(local357.method1875(), "_self");
		} catch (@Pc(366) Exception local366) {
		}
	}
}
