import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public static int anInt1715;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt1716;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_28 = new Class92(14, 4);

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_21 = new Class267("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_81 = new Class123(105, -1);

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_29 = new Class92(78, 11);

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_82 = new Class123(12, 6);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!so;IBB)V")
	public static void method1340(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray458[0];
		@Pc(15) int local15 = arg1.anIntArray459[0];
		if (local10 < 0 || Static181.anInt3574 <= local10 || local15 < 0 || Static117.anInt2450 <= local15 || (arg0 < 0 || Static181.anInt3574 <= arg0 || arg2 < 0 || Static117.anInt2450 <= arg2)) {
			return;
		}
		@Pc(71) int local71 = Static51.method1172(arg1.method5521(), Static209.aClass210Array2[arg1.aByte103], 0, -4, 0, local15, local10, 0, 0, arg2, Static265.anIntArray325, Static298.anIntArray357, arg0, true);
		if (local71 >= 1 && local71 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local71 - 1; local85++) {
				arg1.method5530(Static265.anIntArray325[local85], Static298.anIntArray357[local85], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method1342() {
		if (Static177.aClass73_6 != null) {
			Static177.aClass73_6.method1875();
			Static177.aClass73_6 = null;
		}
		Static225.method3368();
		Static350.method5233();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static209.aClass210Array2[local19].method4714();
		}
		Static124.method2122(false);
		System.gc();
		Static170.method2805();
		Static168.anInt3378 = -1;
		Static5.aBoolean10 = false;
		Static290.method4373(true);
		Static2.anInt6396 = 0;
		Static372.anInt6696 = 0;
		Static96.anInt5953 = 0;
		Static348.anInt6273 = 0;
		Static98.anInt6276 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static122.aClass17Array1.length; local60++) {
			Static122.aClass17Array1[local60] = null;
		}
		Static147.method2522();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static374.aClass3_Sub2_Sub1_Sub2Array1[local75] = null;
		}
		Static136.anInt2887 = 0;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			Static308.aClass3_Sub2_Sub1_Sub1Array1[local91] = null;
		}
		Static165.aClass74_15.method1888();
		Static43.method976();
		Static206.anInt3849 = 0;
		Static393.aClass207_1.method4641();
		Static344.method5288();
		Static194.method3061();
		Static192.method3048(true);
		try {
			Static456.method3806("loggedout", Static45.aClass209_127.anApplet1);
		} catch (@Pc(132) Throwable local132) {
		}
		Static61.aClass6_Sub30_1 = null;
		Static46.aLong46 = 0L;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method1343() {
		Static98.anInt6276 = 0;
		@Pc(11) int local11 = Static232.aClass6_Sub1_Sub1_4.method6472();
		@Pc(15) int local15 = Static232.aClass6_Sub1_Sub1_4.method6477();
		@Pc(19) int local19 = Static232.aClass6_Sub1_Sub1_4.method6455();
		@Pc(30) boolean local30 = Static232.aClass6_Sub1_Sub1_4.method6488() == 1;
		Static233.method3616(local11);
		@Pc(43) int local43 = (Static334.anInt5833 - Static232.aClass6_Sub1_Sub1_4.anInt7898) / 16;
		Static386.anIntArrayArray46 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static386.anIntArrayArray46[local49][local53] = Static232.aClass6_Sub1_Sub1_4.method6442();
			}
		}
		Static411.anIntArray508 = new int[local43];
		Static213.aByteArrayArray23 = new byte[local43][];
		Static188.anIntArray230 = new int[local43];
		Static174.anIntArray219 = null;
		Static269.aByteArrayArray17 = new byte[local43][];
		Static39.aByteArrayArray6 = new byte[local43][];
		Static298.aByteArrayArray20 = null;
		Static137.aByteArrayArray11 = new byte[local43][];
		Static372.anIntArray460 = new int[local43];
		Static344.anIntArray411 = new int[local43];
		Static426.anIntArray519 = new int[local43];
		local43 = 0;
		for (local53 = (local15 - (Static181.anInt3574 >> 4)) / 8; local53 <= ((Static181.anInt3574 >> 4) + local15) / 8; local53++) {
			for (@Pc(129) int local129 = (local19 - (Static117.anInt2450 >> 4)) / 8; local129 <= ((Static117.anInt2450 >> 4) + local19) / 8; local129++) {
				Static411.anIntArray508[local43] = (local53 << 8) + local129;
				Static344.anIntArray411[local43] = Static332.aClass100_63.method2494("m" + local53 + "_" + local129);
				Static426.anIntArray519[local43] = Static332.aClass100_63.method2494("l" + local53 + "_" + local129);
				Static188.anIntArray230[local43] = Static332.aClass100_63.method2494("um" + local53 + "_" + local129);
				Static372.anIntArray460[local43] = Static332.aClass100_63.method2494("ul" + local53 + "_" + local129);
				local43++;
			}
		}
		Static86.method821(local30, false, local19, local15);
	}
}
