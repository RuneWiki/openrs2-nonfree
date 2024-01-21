import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fb", name = "Y", descriptor = "Lclient!oc;")
	public static Class56 aClass56_31;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "Lclient!fc;")
	public static Class25 aClass25_400 = Static78.method1313("title_mute");

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Lclient!fc;")
	private static Class25 aClass25_402 = Static78.method1313("Prepared visibility map");

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "Lclient!fc;")
	public static Class25 aClass25_401 = aClass25_402;

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
	public static int anInt941 = 0;

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lclient!fc;")
	private static Class25 aClass25_404 = Static78.method1313(" ");

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "Lclient!fc;")
	public static Class25 aClass25_403 = aClass25_404;

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
	public static int anInt944 = 0;

	@OriginalMember(owner = "client!fb", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_405 = Static78.method1313("Versteckt");

	@OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
	public static int anInt946 = 1;

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
	public static int anInt947 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!oc;Lclient!oc;)I")
	public static int method751(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class56 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1273(Static14.aClass25_209, Static81.aClass25_858)) {
			local5++;
		}
		if (arg1.method1273(Static62.aClass25_624, Static81.aClass25_858)) {
			local5++;
		}
		if (arg1.method1273(Static101.aClass25_1116, Static81.aClass25_858)) {
			local5++;
		}
		if (arg1.method1273(Static96.aClass25_1378, Static81.aClass25_858)) {
			local5++;
		}
		if (arg1.method1273(Static50.aClass25_518, Static81.aClass25_858)) {
			local5++;
		}
		if (arg1.method1273(aClass25_400, Static81.aClass25_858)) {
			local5++;
		}
		arg1.method1273(Static77.aClass25_812, Static81.aClass25_858);
		arg1.method1273(Static3.aClass25_42, Static81.aClass25_858);
		arg1.method1273(Static62.aClass25_621, Static81.aClass25_858);
		arg1.method1273(Static40.aClass25_463, Static81.aClass25_858);
		arg1.method1273(Static24.aClass25_301, Static81.aClass25_858);
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)I")
	public static int method752() {
		@Pc(9) int local9 = Static129.method2048(Static67.anInt1471, Static21.anInt596, Static75.anInt1566);
		return local9 - Static90.anInt2026 >= 800 || (Static116.aByteArrayArrayArray7[Static21.anInt596][Static75.anInt1566 >> 7][Static67.anInt1471 >> 7] & 0x4) == 0 ? 3 : Static21.anInt596;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	public static void method753() {
		aClass25_405 = null;
		aClass25_403 = null;
		aClass25_400 = null;
		aClass25_401 = null;
		aClass56_31 = null;
		aClass25_404 = null;
		aClass25_402 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z")
	public static boolean method754(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lclient!qe;")
	public static Class1_Sub2_Sub17 method755(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub17 local6 = (Class1_Sub2_Sub17) Static100.aClass63_20.method1517((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static18.aClass56_17.method1269(12, arg0);
		local6 = new Class1_Sub2_Sub17();
		if (local20 != null) {
			local6.method1678(new Class1_Sub5(local20));
		}
		local6.method1669();
		Static100.aClass63_20.method1520(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLclient!oc;I)Z")
	public static boolean method756(@OriginalArg(1) Class56 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1280(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static6.method102(local8);
			return true;
		}
	}
}
