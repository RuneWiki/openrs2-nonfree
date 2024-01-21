import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cj", name = "kb", descriptor = "I")
	public static int anInt638;

	@OriginalMember(owner = "client!cj", name = "lb", descriptor = "Lclient!pb;")
	public static Class71 aClass71_7;

	@OriginalMember(owner = "client!cj", name = "ob", descriptor = "I")
	public static int anInt641;

	@OriginalMember(owner = "client!cj", name = "sb", descriptor = "Lclient!sh;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "J")
	public static long aLong35 = 0L;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_201 = Static151.method2243("Loaded sprites");

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "Lclient!mb;")
	public static Class62 aClass62_197 = aClass62_201;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_200 = Static151.method2243("You have only just left another world)3");

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "Lclient!mb;")
	public static Class62 aClass62_198 = aClass62_200;

	@OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_199 = Static151.method2243("Loaded fonts");

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_202 = Static151.method2243("Location");

	@OriginalMember(owner = "client!cj", name = "db", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_203 = Static151.method2243("<br>");

	@OriginalMember(owner = "client!cj", name = "hb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_204 = aClass62_199;

	@OriginalMember(owner = "client!cj", name = "ib", descriptor = "Lclient!mb;")
	public static Class62 aClass62_205 = aClass62_202;

	@OriginalMember(owner = "client!cj", name = "jb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_206 = Static151.method2243("Started 3d library");

	@OriginalMember(owner = "client!cj", name = "pb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_207 = Static151.method2243("Mem:");

	@OriginalMember(owner = "client!cj", name = "rb", descriptor = "[I")
	public static final int[] anIntArray60 = new int[2048];

	@OriginalMember(owner = "client!cj", name = "tb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_208 = aClass62_206;

	@OriginalMember(owner = "client!cj", name = "ub", descriptor = "[I")
	public static final int[] anIntArray61 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!kd;)Lclient!w;")
	public static Class24_Sub4 method485(@OriginalArg(1) Class2_Sub11 arg0) {
		return new Class24_Sub4(arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1536(), arg0.method1534());
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILclient!ra;)V")
	public static void method487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub20 arg3) {
		if (Static51.anInt1111 >= 400) {
			return;
		}
		if (arg3.anIntArray304 != null) {
			arg3 = arg3.method2451();
		}
		if (arg3 == null || !arg3.aBoolean153) {
			return;
		}
		@Pc(32) Class62 local32 = arg3.aClass62_1250;
		if (arg3.anInt3548 != 0) {
			local32 = Static169.method2460(new Class62[] { local32, Static123.method3146(arg3.anInt3548, Static186.aClass7_Sub2_Sub2_1.anInt3117), Static17.aClass62_131, Static8.aClass62_61, Static119.method1865(arg3.anInt3548), Static84.aClass62_1327 });
		}
		if (Static97.anInt2284 == 1) {
			Static99.method1601(Static169.method2460(new Class62[] { Static155.aClass62_1179, Static146.aClass62_1079, local32 }), Static169.aClass62_1261, (long) arg2, (short) 41, arg0, arg1);
		} else if (!Static8.aBoolean12) {
			@Pc(118) Class62[] local118 = arg3.aClass62Array108;
			if (Static180.aBoolean166) {
				local118 = Static16.method310(local118);
			}
			@Pc(128) int local128;
			if (local118 != null) {
				for (local128 = 4; local128 >= 0; local128--) {
					if (local118[local128] != null && (Static65.anInt1369 != 0 || !local118[local128].method1858(Static85.aClass62_594))) {
						@Pc(149) byte local149 = 0;
						if (local128 == 0) {
							local149 = 26;
						}
						if (local128 == 1) {
							local149 = 20;
						}
						if (local128 == 2) {
							local149 = 40;
						}
						if (local128 == 3) {
							local149 = 18;
						}
						if (local128 == 4) {
							local149 = 24;
						}
						Static99.method1601(Static169.method2460(new Class62[] { Static118.aClass62_911, local32 }), local118[local128], (long) arg2, local149, arg0, arg1);
					}
				}
			}
			if (Static65.anInt1369 == 0 && local118 != null) {
				for (local128 = 4; local128 >= 0; local128--) {
					if (local118[local128] != null && local118[local128].method1858(Static85.aClass62_594)) {
						@Pc(223) short local223 = 0;
						if (Static186.aClass7_Sub2_Sub2_1.anInt3117 < arg3.anInt3548) {
							local223 = 2000;
						}
						@Pc(236) short local236 = 0;
						if (local128 == 0) {
							local236 = 26;
						}
						if (local128 == 1) {
							local236 = 20;
						}
						if (local128 == 2) {
							local236 = 40;
						}
						if (local128 == 3) {
							local236 = 18;
						}
						if (local128 == 4) {
							local236 = 24;
						}
						if (local236 != 0) {
							local236 += local223;
						}
						Static99.method1601(Static169.method2460(new Class62[] { Static118.aClass62_911, local32 }), local118[local128], (long) arg2, local236, arg0, arg1);
					}
				}
			}
			Static99.method1601(Static169.method2460(new Class62[] { Static118.aClass62_911, local32 }), Static76.aClass62_542, (long) arg2, (short) 1002, arg0, arg1);
		} else if ((Static34.anInt818 & 0x2) == 2) {
			Static99.method1601(Static169.method2460(new Class62[] { Static145.aClass62_1077, Static146.aClass62_1079, local32 }), Static125.aClass62_970, (long) arg2, (short) 7, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
	public static void method488() {
		if (!Static12.aBoolean16) {
			return;
		}
		Static182.aClass42Array9 = null;
		Static142.anIntArray271 = null;
		Static135.aClass42_3 = null;
		Static25.aClass42Array1 = null;
		Static65.aClass42Array3 = null;
		Static5.aClass2_Sub1_Sub2_Sub1_1 = null;
		Static99.aClass2_Sub1_Sub2_Sub1_7 = null;
		Static170.anIntArray312 = null;
		Static163.anIntArray302 = null;
		Static85.anIntArray156 = null;
		Static53.anIntArray84 = null;
		Static59.aClass42_Sub1Array2 = null;
		Static159.aClass42_4 = null;
		Static56.aClass2_Sub1_Sub2_Sub1_5 = null;
		Static57.anIntArray90 = null;
		Static42.aClass2_Sub1_Sub2_Sub1_8 = null;
		Static7.anIntArray227 = null;
		Static101.aClass2_Sub1_Sub2Array7 = null;
		Static103.aClass42_2 = null;
		Static194.aClass42_5 = null;
		Static35.aClass42Array2 = null;
		Static78.anIntArray137 = null;
		Static149.method2223();
		Static149.method2221(true);
		Static12.aBoolean16 = false;
	}
}
