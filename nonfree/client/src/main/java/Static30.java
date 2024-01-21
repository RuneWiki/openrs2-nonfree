import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_20;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "Lclient!l;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!oa;")
	public static Class56 aClass56_493 = Static33.method650("Hidden)2use");

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "Lclient!oa;")
	public static Class56 aClass56_494 = Static33.method650("scape main");

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Lclient!oa;")
	private static Class56 aClass56_498 = Static33.method650("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "Lclient!oa;")
	public static Class56 aClass56_495 = aClass56_498;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_496 = Static33.method650("mapscene");

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "Lclient!oa;")
	public static Class56 aClass56_497 = Static33.method650("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
	public static volatile int anInt915 = 0;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!oa;")
	public static Class56 aClass56_499 = Static33.method650("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Lclient!oa;")
	public static Class56 aClass56_500 = Static33.method650("leuchten1:");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!Static19.method398(arg2)) {
			return false;
		}
		Static9.aClass3_Sub1_Sub16Array1 = null;
		@Pc(25) boolean local25 = Static47.method876(Static31.aClass3_Sub1_Sub16ArrayArray1[arg2], 0, 0, arg3, arg1, 0, arg0, 0, -1);
		if (Static9.aClass3_Sub1_Sub16Array1 != null) {
			Static47.method876(Static9.aClass3_Sub1_Sub16Array1, 0, Static1.anInt4, arg3, arg1, Static103.anInt2582, arg0, 0, -1412584499);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!kd;Z)V")
	public static void method629(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		if (Static47.aClass3_Sub2_2 == null) {
			Static38.method697((byte) 0, 255, 255, 0, true, null);
			Static111.aClass44_Sub1Array1[arg0] = arg1;
		} else {
			Static47.aClass3_Sub2_2.anInt413 = arg0 * 4 + 5;
			@Pc(20) int local20 = Static47.aClass3_Sub2_2.method278();
			arg1.method1170(local20);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method630() {
		aClass3_Sub1_Sub1_Sub4_20 = null;
		aClass46_1 = null;
		aClass56_495 = null;
		aClass56_494 = null;
		aClass56_500 = null;
		aClass56_499 = null;
		aClass56_497 = null;
		aClass56_498 = null;
		aClass56_496 = null;
		aClass56_493 = null;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
	public static void method631() {
		Static18.aClass52_11.method1346();
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] method632() {
		@Pc(8) Class3_Sub1_Sub1_Sub2[] local8 = new Class3_Sub1_Sub1_Sub2[Static59.anInt1711];
		for (@Pc(10) int local10 = 0; local10 < Static59.anInt1711; local10++) {
			@Pc(20) Class3_Sub1_Sub1_Sub2 local20 = local8[local10] = new Class3_Sub1_Sub1_Sub2();
			local20.anInt1486 = Static64.anInt1829;
			local20.anInt1482 = Static84.anInt2277;
			local20.anInt1487 = Static47.anIntArray96[local10];
			local20.anInt1483 = Static69.anIntArray161[local10];
			local20.anInt1485 = Static51.anIntArray103[local10];
			local20.anInt1484 = Static76.anIntArray179[local10];
			@Pc(52) int local52 = local20.anInt1484 * local20.anInt1485;
			@Pc(56) byte[] local56 = Static116.aByteArrayArray10[local10];
			local20.anIntArray101 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray101[local62] = Static69.anIntArray163[local56[local62] & 0xFF];
			}
		}
		Static127.method2040();
		return local8;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
	public static boolean method633(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
