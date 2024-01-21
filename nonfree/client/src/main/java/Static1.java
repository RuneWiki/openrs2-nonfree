import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!gb;")
	public static Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1 = Static75.method1216("scape main");

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public static int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!bb;")
	public static Class8 aClass8_1 = new Class8(64);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt3 = 0;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_2 = Static75.method1216("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_3 = Static75.method1216("Welt");

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!ad;")
	private static Class4 aClass4_4 = Static75.method1216("slide:");

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_5 = Static75.method1216("Aus");

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_6 = aClass4_4;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
	public static int[] anIntArray1 = new int[1000];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method1() {
		aClass4_4 = null;
		aClass4_6 = null;
		aClass4_5 = null;
		anIntArray1 = null;
		aClass4_2 = null;
		aClass8_1 = null;
		aClass4_3 = null;
		aClass3_Sub4_1 = null;
		aClass4_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		Static94.aClass8_27.method198();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	public static int method3(@OriginalArg(1) int arg0) {
		@Pc(3) Class3_Sub1_Sub8 local3 = Static20.method291(arg0);
		@Pc(6) int local6 = local3.anInt1714;
		@Pc(13) int local13 = local3.anInt1716;
		@Pc(21) int local21 = local3.anInt1719;
		@Pc(27) int local27 = Class3_Sub1_Sub13.anIntArray263[local21 - local13];
		return local27 & Static106.anIntArray329[local6] >> local13;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIILclient!ld;)V")
	public static void method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub1_Sub5 arg4) {
		@Pc(7) Class3_Sub8 local7 = new Class3_Sub8();
		local7.anIntArray242 = arg4.anIntArray213;
		local7.anInt1892 = arg4.anInt1544;
		@Pc(18) int local18 = arg4.anInt1543;
		@Pc(25) int local25 = arg4.anInt1548;
		local7.anInt1894 = arg2 * 128;
		if (arg0 == 1 || arg0 == 3) {
			local18 = arg4.anInt1548;
			local25 = arg4.anInt1543;
		}
		local7.anInt1893 = arg1;
		local7.anInt1889 = arg4.anInt1535 * 128;
		local7.anInt1906 = arg4.anInt1528;
		local7.anInt1888 = arg3 * 128;
		local7.anInt1902 = (local25 + arg3) * 128;
		local7.anInt1891 = (local18 + arg2) * 128;
		local7.anInt1905 = arg4.anInt1522;
		if (arg4.anIntArray215 != null) {
			local7.aClass3_Sub1_Sub5_1 = arg4;
			local7.method1284();
		}
		Static7.aClass20_1.method304(local7);
		if (local7.anIntArray242 != null) {
			local7.anInt1895 = local7.anInt1905 + (int) (Math.random() * (double) (local7.anInt1906 - local7.anInt1905));
		}
	}
}
