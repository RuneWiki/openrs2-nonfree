import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!oa;")
	public static Class7 aClass7_25;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!nb;")
	public static Class24 aClass24_5;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	public static int anInt728;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!vc;")
	private static Class71 aClass71_414 = Static38.method736("Hidden");

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[Lclient!vc;")
	public static Class71[] aClass71Array7 = new Class71[5];

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!vc;")
	private static Class71 aClass71_415 = Static38.method736("Invalid username or password)3");

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!vc;")
	private static Class71 aClass71_416 = Static38.method736("Close");

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_417 = aClass71_416;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_418 = aClass71_415;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_419 = Static38.method736("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!df", name = "t", descriptor = "[I")
	public static int[] anIntArray87 = new int[2000];

	@OriginalMember(owner = "client!df", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_420 = aClass71_414;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "I")
	public static int anInt731 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!me;)I")
	public static int method545(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		@Pc(18) Class5_Sub14 local18 = (Class5_Sub14) Static51.aClass57_7.method1575(((long) arg0.anInt1760 << 32) + ((long) arg0.anInt1769));
		return local18 == null ? arg0.anInt1763 : local18.anInt2387;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZJ)V")
	public static void method546(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static87.method1395(arg0 - 1L);
			Static87.method1395(1L);
		} else {
			Static87.method1395(arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method547() {
		if (Static119.aClass11_1 == null) {
			return;
		}
		if (Static118.anInt2916 >= 0) {
			if (Static40.anInt717 > 0) {
				Static9.anInt293 += Static50.anInt1406;
				Static119.aClass11_1.method1278(Static118.anInt2916, Static9.anInt293);
				Static40.anInt717--;
				if (Static40.anInt717 == 0) {
					Static119.aClass11_1.method1277();
					Static40.anInt717 = 20;
					Static118.anInt2916 = -1;
				}
			}
		} else if (Static40.anInt717 > 0) {
			Static40.anInt717--;
			if (Static40.anInt717 == 0) {
				if (Static9.aByteArray1 == null) {
					Static119.aClass11_1.method1271(256);
				} else {
					Static119.aClass11_1.method1271(Static102.anInt2389);
					Static118.anInt2916 = Static102.anInt2389;
					Static119.aClass11_1.method1272(Static108.aBoolean118, Static102.anInt2389, Static9.aByteArray1);
					Static9.aByteArray1 = null;
				}
				Static9.anInt293 = 0;
			}
		}
		Static119.aClass11_1.method1275();
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method548() {
		aClass71_420 = null;
		aClass24_5 = null;
		aClass71_414 = null;
		aClass7_25 = null;
		aClass71_415 = null;
		aClass71_419 = null;
		anIntArray87 = null;
		aClass71_418 = null;
		aByteArrayArrayArray1 = null;
		aClass71_417 = null;
		aClass71Array7 = null;
		aClass71_416 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (!Static106.method1689(arg3)) {
			return false;
		}
		Static39.aClass5_Sub1_Sub11Array1 = null;
		@Pc(25) boolean local25 = Static37.method461(-1, Static30.aClass5_Sub1_Sub11ArrayArray1[arg3], arg2, arg1, 0, 0, arg0, 0, 0);
		if (Static39.aClass5_Sub1_Sub11Array1 != null) {
			Static37.method461(-1412584499, Static39.aClass5_Sub1_Sub11Array1, arg2, arg1, Static107.anInt2556, 0, arg0, Static33.anInt937, 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lclient!me;")
	public static Class5_Sub1_Sub11 method550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class5_Sub1_Sub11 local7 = Static118.method1937(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass5_Sub1_Sub11Array2 == null || arg0 >= local7.aClass5_Sub1_Sub11Array2.length) {
			return null;
		} else {
			return local7.aClass5_Sub1_Sub11Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	public static int method551(@OriginalArg(1) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}
}
