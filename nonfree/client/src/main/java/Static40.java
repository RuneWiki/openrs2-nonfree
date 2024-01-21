import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!na;")
	public static Class56 aClass56_15;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!ac;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array5;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!bc;")
	public static Class8 aClass8_23 = new Class8(30);

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	public static int anInt846 = -1;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_408 = Static119.method1462(": ");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_409 = Static119.method1462("me");

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_410 = Static119.method1462("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[Lclient!ed;")
	public static Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array1 = new Class2_Sub1_Sub1_Sub2[4];

	@OriginalMember(owner = "client!h", name = "p", descriptor = "J")
	public static volatile long aLong29 = 0L;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!pe;")
	private static Class65 aClass65_414 = Static119.method1462("To play on this world move to a free area first");

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_411 = aClass65_414;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_412 = Static119.method1462("p11_full");

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_413 = Static119.method1462("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!pe;")
	private static Class65 aClass65_415 = Static119.method1462("Username: ");

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_416 = aClass65_415;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
	public static void method673(@OriginalArg(0) int arg0) {
		if (Static94.method1566(arg0)) {
			Static30.method606(Static95.aClass2_Sub22ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!pe;ILclient!pe;Lclient!pe;)V")
	public static void method674(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class65 arg2) {
		Static57.aClass65_633 = arg0;
		Static57.aClass65_631 = arg1;
		Static57.aClass65_624 = arg2;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method675() {
		aClass56_15 = null;
		aClass65_414 = null;
		aClass65_412 = null;
		aClass2_Sub1_Sub1_Sub2Array1 = null;
		aClass65_415 = null;
		aClass65_416 = null;
		aClass8_23 = null;
		aClass2_Sub1_Sub4_Sub1Array5 = null;
		aClass65_408 = null;
		aClass4_1 = null;
		aClass65_410 = null;
		aClass65_413 = null;
		aClass65_409 = null;
		aClass65_411 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)I")
	public static int method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return (arg0 * (arg1 & 0xFF00FF) + local13 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + local13 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}
}
