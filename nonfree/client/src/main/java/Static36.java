import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "Lclient!pc;")
	public static Class77 aClass77_25;

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "Lclient!eb;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_2 = new Class91(5);

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_290 = Static181.method2795("Loaded input handler");

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!qe;")
	public static Class83 aClass83_289 = aClass83_290;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_293 = Static181.method2795("Please reload this page)3");

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Lclient!qe;")
	public static Class83 aClass83_291 = aClass83_293;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_292 = Static181.method2795("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
	public static int anInt939 = 0;

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
	public static int anInt940 = 100;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_294 = Static181.method2795("<col=ffff00>");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIBI)V")
	public static void method731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static83.anInt1856 < 100) {
			Static130.method2185();
		}
		Static126.method2119(arg1, arg2, arg3 + arg1, arg0 + arg2);
		Static24.method464();
		Static126.method2138(arg1, arg2, arg3, arg0, 0);
		@Pc(42) int local42;
		@Pc(53) int local53;
		if (Static83.anInt1856 < 100) {
			local42 = arg3 / 2 + arg1;
			local53 = arg2 + arg0 / 2 - 20 - 18;
			Static126.method2120(local42 - 152, local53, 304, 34, 9179409);
			Static126.method2120(local42 - 151, local53 - -1, 302, 32, 0);
			Static126.method2138(local42 - 150, local53 + 2, Static83.anInt1856 * 3, 30, 9179409);
			Static126.method2138(local42 + Static83.anInt1856 * 3 - 150, local53 + 2, 300 - Static83.anInt1856 * 3, 30, 0);
			Static62.aClass2_Sub2_Sub5_1.method1083(Static73.aClass83_535, local42, local53 + 20, 16777215, -1);
			return;
		}
		Static46.anInt1116 = (int) ((double) (arg0 * 2) / Static131.aDouble11);
		@Pc(130) int local130 = Static143.anInt3007 - (int) ((double) arg3 / Static131.aDouble11);
		Static62.anInt1513 = (int) ((double) (arg3 * 2) / Static131.aDouble11);
		Static31.anInt824 = Static62.anInt1512 - (int) ((double) arg0 / Static131.aDouble11);
		Static165.anInt3383 = Static143.anInt3007 - (int) ((double) arg3 / Static131.aDouble11);
		local42 = Static62.anInt1512 - (int) ((double) arg0 / Static131.aDouble11);
		@Pc(172) int local172 = (int) ((double) arg0 / Static131.aDouble11) + Static62.anInt1512;
		local53 = Static143.anInt3007 + (int) ((double) arg3 / Static131.aDouble11);
		Static110.method1952(arg0 + arg2, local42, local172, local130, arg2, arg3 + arg1, arg1, local53);
		Static9.method146(arg0 + arg2, local130, arg1, local53, arg3 + arg1, local42, local172, arg2);
		if (Static206.anInt4068 > 0) {
			Static206.anInt4068--;
		}
		if (!Static167.aBoolean160) {
			return;
		}
		@Pc(226) int local226 = arg1 + arg3 - 5;
		@Pc(232) int local232 = arg0 + arg2 - 8;
		Static167.aClass2_Sub2_Sub5_3.method1082(Static67.method1268(new Class83[] { Static99.aClass83_645, Static129.method2179(Static130.anInt2835) }), local226, local232, 16776960, -1);
		@Pc(253) int local253 = local232 - 15;
		@Pc(255) int local255 = 16776960;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(266) int local266 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		if (local266 > 32768 && Static158.aBoolean148) {
			local255 = 16711680;
		}
		if (local266 > 65536 && !Static158.aBoolean148) {
			local255 = 16711680;
		}
		Static167.aClass2_Sub2_Sub5_3.method1082(Static67.method1268(new Class83[] { Static48.aClass83_378, Static129.method2179(local266), Static215.aClass83_1223 }), local226, local253, local255, -1);
		local232 = local253 - 15;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ra;Z)Lclient!je;")
	public static Class2_Sub1 method733(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method260();
		@Pc(13) int local13 = arg0.method260();
		@Pc(17) Class2_Sub1 local17 = Static39.method786(local13);
		local17.anInt4288 = arg0.method260();
		@Pc(26) int local26 = arg0.method260();
		for (@Pc(37) int local37 = 0; local37 < local26; local37++) {
			@Pc(43) int local43 = arg0.method260();
			local17.method3264(arg0, local43);
		}
		local17.method3260();
		return local17;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
	public static boolean method740() {
		try {
			return Static156.method3234();
		} catch (@Pc(14) IOException local14) {
			Static71.method1377();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static148.anInt3046 + "," + Static197.anInt3927 + "," + Static168.anInt3481 + " - " + Static131.anInt2843 + "," + (Static54.aClass24_Sub4_Sub1_1.anIntArray319[0] + Static2.anInt57) + "," + (Static123.anInt2755 + Static54.aClass24_Sub4_Sub1_1.anIntArray316[0]) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static131.anInt2843 && local62 < 50; local62++) {
				local60 = local60 + Static33.aClass2_Sub3_Sub1_1.aByteArray2[local62] + ",";
			}
			Static188.method2856(local60, local19);
			Static193.method2906();
			return true;
		}
	}
}
