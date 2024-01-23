import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "Lclient!wf;")
	public static Class191 aClass191_8;

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
	public static int anInt2751 = 0;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "[I")
	public static int[] anIntArray280 = new int[8];

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "[I")
	public static int[] anIntArray281 = new int[] { -2, 0, 5, 0, 0, 0, 0, 15, 0, 10, 0, 0, 0, 10, 0, 6, 3, 5, 0, 0, 0, 0, 8, 8, -2, 0, -1, 2, 3, -1, 6, 0, 0, -1, 2, 0, 7, 0, 6, 0, 8, 1, 0, 0, 6, 0, 0, 0, -1, 28, 0, 12, -1, 0, 15, 0, 0, 0, 2, 0, -1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, -1, 5, 0, -1, -1, 3, 2, 0, 6, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 20, 2, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 14, 7, 0, 0, 0, 0, 0, -1, 0, 12, 8, 0, 3, 1, 0, 1, 3, 8, 8, 0, 7, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0, 12, 0, 0, 0, 0, 2, 8, -2, 0, 0, -2, 6, 0, 0, 0, -2, 0, 6, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, -2, 4, 14, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 6, 0, -2, 3, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, -2, 0, 0, 12, 0, 12, 0, 9, 0, 0, 0, 0, 2, 6, 0, 0, 4, 1, 6, 0, 0, 0, 0, 8, 0, 0, -2, 0, 0, 3, 0, 0, 2, 10, 1, 0, 0, 8, 0, -2, 7, 3, 0, 0, 11, -1, 0, 0, 4, -1, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString175 = "K";

	@OriginalMember(owner = "client!jg", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString176 = null;

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V")
	public static void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class26 local9 = Static20.aClass26ArrayArrayArray1[Static185.anInt4085][arg0][arg1];
		if (local9 == null) {
			Static264.method4015(Static185.anInt4085, arg0, arg1);
			return;
		}
		@Pc(24) Class1_Sub3_Sub1 local24 = null;
		@Pc(26) int local26 = -99999999;
		@Pc(31) Class1_Sub3_Sub1 local31;
		for (local31 = (Class1_Sub3_Sub1) local9.method666(); local31 != null; local31 = (Class1_Sub3_Sub1) local9.method672()) {
			@Pc(40) Class57 local40 = Static56.method1050(local31.aClass2_Sub7_1.anInt5219);
			@Pc(43) int local43 = local40.anInt1810;
			if (local40.anInt1824 == 1) {
				local43 *= local31.aClass2_Sub7_1.anInt5216 + 1;
			}
			if (local43 > local26) {
				local24 = local31;
				local26 = local43;
			}
		}
		if (local24 == null) {
			Static264.method4015(Static185.anInt4085, arg0, arg1);
			return;
		}
		@Pc(91) Class2_Sub7 local91 = null;
		local9.method665(local24);
		@Pc(97) Class2_Sub7 local97 = null;
		for (local31 = (Class1_Sub3_Sub1) local9.method666(); local31 != null; local31 = (Class1_Sub3_Sub1) local9.method672()) {
			@Pc(107) Class2_Sub7 local107 = local31.aClass2_Sub7_1;
			if (local24.aClass2_Sub7_1.anInt5219 != local107.anInt5219) {
				if (local97 == null) {
					local97 = local107;
				}
				if (local107.anInt5219 != local97.anInt5219 && local91 == null) {
					local91 = local107;
				}
			}
		}
		@Pc(144) long local144 = (long) (arg0 + (arg1 << 7) + 1610612736);
		Static35.method757(Static185.anInt4085, arg0, arg1, Static93.method1576(arg1 * 128 + 64, arg0 * 128 + 64, Static185.anInt4085), local24.aClass2_Sub7_1, local144, local97, local91);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method2069(@OriginalArg(0) String arg0) {
		return Static190.method3076(16, arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!df;ZI)V")
	public static void method2071(@OriginalArg(0) Class1_Sub3_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) int local9;
		if (Static294.aBoolean367 || arg1) {
			local9 = Static270.anInt5412;
			@Pc(15) int local15 = local9 * 956 / 503;
			Static108.aClass1_Sub3_Sub13_6.method4205((Static38.anInt950 - local15) / 2, 0, local15, local9);
			Static300.aClass46_1.method3523(Static38.anInt950 / 2 - Static300.aClass46_1.anInt4753 / 2, 18);
		}
		arg0.method3499(Static208.anInt4489 == 1 ? Static262.aString377 : Static72.aString98, Static38.anInt950 / 2, Static270.anInt5412 / 2 - 26, 16777215, -1);
		local9 = Static270.anInt5412 / 2 - 18;
		if (Static294.aBoolean367) {
			Static156.method2540(Static38.anInt950 / 2 - 152, local9, 304, 34, 9179409);
			Static156.method2540(Static38.anInt950 / 2 - 151, local9 + 1, 302, 32, 0);
			Static156.method2537(Static38.anInt950 / 2 - 150, local9 + 2, Static22.anInt612 * 3, 30, 9179409);
			Static156.method2537(Static22.anInt612 * 3 + Static38.anInt950 / 2 - 150, local9 - -2, 300 - Static22.anInt612 * 3, 30, 0);
		} else {
			Static231.method3626(Static38.anInt950 / 2 - 152, local9, 304, 34, 9179409);
			Static231.method3626(Static38.anInt950 / 2 - 151, local9 - -1, 302, 32, 0);
			Static231.method3630(Static38.anInt950 / 2 - 150, local9 + 2, Static22.anInt612 * 3, 30, 9179409);
			Static231.method3630(Static38.anInt950 / 2 + Static22.anInt612 * 3 - 150, local9 + 2, 300 - Static22.anInt612 * 3, 30, 0);
		}
		arg0.method3499(Static66.aString333, Static38.anInt950 / 2, Static270.anInt5412 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
	public static void method2073(@OriginalArg(1) boolean arg0) {
		@Pc(17) byte local17;
		@Pc(19) byte[][] local19;
		if (Static294.aBoolean367 && arg0) {
			local17 = 1;
			local19 = Static72.aByteArrayArray10;
		} else {
			local17 = 4;
			local19 = Static230.aByteArrayArray13;
		}
		@Pc(28) int local28 = local19.length;
		@Pc(30) int local30;
		@Pc(45) int local45;
		for (local30 = 0; local30 < local28; local30++) {
			@Pc(35) int[] local35 = null;
			@Pc(39) byte[] local39 = local19[local30];
			local45 = Static234.anIntArray456[local30] & 0xFF;
			@Pc(52) int local52 = local45 * 64 - Static217.anInt4673;
			@Pc(58) int local58 = Static234.anIntArray456[local30] >> 8;
			@Pc(64) int local64 = local58 * 64 - Static159.anInt3527;
			if (local39 != null) {
				Static248.method3834();
				local35 = Static277.method4192(Static82.aClass75Array1, local64, local52, arg0, Static159.anInt3527, local39, Static217.anInt4673);
			}
			if (!arg0 && local58 == Static288.anInt5790 / 8 && Static279.anInt5604 / 8 == local45) {
				if (local35 == null) {
					Static3.anInt56 = -1;
				} else {
					Static229.anInt4845 = local35[2];
					Static3.anInt56 = local35[0];
					Static64.anInt1383 = local35[1];
					Static245.anInt5023 = local35[3];
					Static240.anInt5002 = local35[4];
				}
			}
		}
		for (local30 = 0; local30 < local28; local30++) {
			@Pc(139) int local139 = (Static234.anIntArray456[local30] >> 8) * 64 - Static159.anInt3527;
			@Pc(150) int local150 = (Static234.anIntArray456[local30] & 0xFF) * 64 - Static217.anInt4673;
			@Pc(154) byte[] local154 = local19[local30];
			if (local154 == null && Static279.anInt5604 < 800) {
				Static248.method3834();
				for (local45 = 0; local45 < local17; local45++) {
					Static260.method3990(local139, local150, 64, local45, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!jn;Lclient!mf;)V")
	public static void method2074(@OriginalArg(1) Class1_Sub3_Sub11 arg0, @OriginalArg(2) Class107 arg1) {
		@Pc(9) Class46_Sub1 local9 = arg1.method2743();
		if (local9 == null) {
			return;
		}
		@Pc(16) int local16 = local9.anInt4753;
		if (local9.anInt4751 > local9.anInt4753) {
			local16 = local9.anInt4751;
		}
		@Pc(28) int local28 = arg0.anInt3106;
		@Pc(31) int local31 = arg0.anInt3109;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(50) int local50;
		@Pc(82) int local82;
		if (arg1.aString237 != null) {
			local33 = Static160.aClass1_Sub3_Sub5_1.method3515(arg1.aString237, null, Static27.aStringArray35);
			for (local50 = 0; local50 < local33; local50++) {
				@Pc(61) String local61 = Static27.aStringArray35[local50];
				if (local50 < local33 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static176.aClass27_22.method678(local61);
				if (local37 < local82) {
					local37 = local82;
				}
			}
			local35 = (local33 - 1) * Static176.aClass27_22.method687() + Static176.aClass27_22.method685() / 2;
		}
		local50 = arg0.anInt3106;
		if (local28 < local16 + Static268.anInt2662) {
			local50 = local16 / 2 + Static268.anInt2662 + local16 + local37 / 2 + 5;
			local28 = local16 + Static268.anInt2662;
		} else if (Static268.anInt2665 - local16 < local28) {
			local28 = Static268.anInt2665 - local16;
			local50 = Static268.anInt2665 - local16 - local16 / 2 - local37 / 2 - 5;
		}
		@Pc(173) int local173 = -2;
		@Pc(181) int local181 = arg0.anInt3109 - local35 / 2;
		@Pc(183) int local183 = -2;
		if (Static268.anInt2666 + local16 > local31) {
			local31 = local16 + Static268.anInt2666;
			local181 = local16 / 2 + local16 + Static268.anInt2666 + Static176.aClass27_22.method687();
		} else if (Static268.anInt2668 - local16 < local31) {
			local31 = Static268.anInt2668 - local16;
			local181 = Static268.anInt2668 - local35 - local16 - local16 / 2;
		}
		local16 >>= 0x1;
		@Pc(244) int local244 = -2;
		local82 = (int) (Math.atan2((double) (local28 - arg0.anInt3106), (double) (local31 - arg0.anInt3109)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(267) int local267 = -2;
		local9.method2484(local9.anInt4745 << 3, local9.anInt4747 << 3, local16 + (local28 << 4), local16 + (local31 << 4), local82);
		if (arg1.aString237 != null) {
			local173 = local50 - local37 / 2 - 5;
			local244 = local37 + local173 + 10;
			local183 = local181 - Static176.aClass27_22.method685() - 3;
			local267 = local183 + local33 * Static176.aClass27_22.method687();
			if (arg1.anInt3766 != 0) {
				Static231.method3650(local173, local183, local244 - local173, local267 - local183, arg1.anInt3766, arg1.anInt3766 >>> 24);
			}
			if (arg1.anInt3770 != 0) {
				Static231.method3623(local173, local183, local244 - local173, -local183 + local267, arg1.anInt3770, arg1.anInt3770 >>> 24);
			}
			for (@Pc(368) int local368 = 0; local368 < local33; local368++) {
				@Pc(375) String local375 = Static27.aStringArray35[local368];
				if (local368 < local33 - 1) {
					local375 = local375.substring(0, local375.length() - 4);
				}
				Static176.aClass27_22.method682(local375, local50, local181, arg1.anInt3773);
				local181 += Static176.aClass27_22.method687();
			}
		}
		if ((local28 - local16 >= Static89.anInt5974 || Static89.anInt5974 >= local16 + local28 || Static289.anInt5816 <= local31 - local16 || Static289.anInt5816 >= local16 + local31) && (Static89.anInt5974 <= local173 || Static89.anInt5974 >= local244 || local183 >= Static289.anInt5816 || Static289.anInt5816 >= local267)) {
			return;
		}
		if (arg1.aStringArray32[4] != null) {
			Static12.method2960(0, -1, (long) arg0.anInt3104, arg1.aString238, 0, arg1.aStringArray32[4], (short) 1011);
		}
		if (arg1.aStringArray32[3] != null) {
			Static12.method2960(0, -1, (long) arg0.anInt3104, arg1.aString238, 0, arg1.aStringArray32[3], (short) 1012);
		}
		if (arg1.aStringArray32[2] != null) {
			Static12.method2960(0, -1, (long) arg0.anInt3104, arg1.aString238, 0, arg1.aStringArray32[2], (short) 1007);
		}
		if (arg1.aStringArray32[1] != null) {
			Static12.method2960(0, -1, (long) arg0.anInt3104, arg1.aString238, 0, arg1.aStringArray32[1], (short) 1006);
		}
		if (arg1.aStringArray32[0] != null) {
			Static12.method2960(0, -1, (long) arg0.anInt3104, arg1.aString238, 0, arg1.aStringArray32[0], (short) 1002);
		}
	}
}
