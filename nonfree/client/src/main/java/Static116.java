import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!u", name = "j", descriptor = "[I")
	public static int[] anIntArray361;

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "Lclient!ic;")
	public static Class2_Sub10 aClass2_Sub10_54;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array11 = new Class2_Sub2_Sub1_Sub2[1000];

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public static int anInt2466 = -1;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_1555 = Static72.method1077("titlebutton");

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_1556 = Static72.method1077("Ignorieren");

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_1557 = Static72.method1077("Cabbage");

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_1558 = Static72.method1077(":chalreq:");

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_1559 = Static72.method1077(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!u", name = "K", descriptor = "I")
	public static int anInt2490 = 0;

	@OriginalMember(owner = "client!u", name = "X", descriptor = "Lclient!u;")
	public static Class74 aClass74_1560 = Static72.method1077("null");

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	public static void method1713() {
		aClass74_1558 = null;
		aClass74_1557 = null;
		aClass74_1559 = null;
		aClass2_Sub2_Sub1_Sub2Array11 = null;
		aClass74_1560 = null;
		aClass74_1555 = null;
		aClass74_1556 = null;
		aClass2_Sub10_54 = null;
		anIntArray361 = null;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(II)I")
	public static int method1730(@OriginalArg(0) int arg0) {
		@Pc(3) Class2_Sub2_Sub3 local3 = Static120.method1766(arg0);
		@Pc(10) int local10 = local3.anInt355;
		@Pc(13) int local13 = local3.anInt354;
		@Pc(24) int local24 = local3.anInt358;
		@Pc(31) int local31 = Class26_Sub1.anIntArray273[local24 - local13];
		return local31 & Static88.anIntArray260[local10] >> local13;
	}
}
