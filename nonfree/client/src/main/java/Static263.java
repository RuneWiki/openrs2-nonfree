import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!sn", name = "H", descriptor = "Lclient!ob;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!sn", name = "cb", descriptor = "Lclient!ek;")
	public static Class42 aClass42_88;

	@OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
	public static int anInt5196;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "Lclient!sf;")
	public static Class157 aClass157_42 = new Class157(4);

	@OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
	public static int anInt5180 = -1;

	@OriginalMember(owner = "client!sn", name = "Q", descriptor = "[I")
	public static int[] anIntArray494 = new int[1000];

	@OriginalMember(owner = "client!sn", name = "W", descriptor = "[I")
	public static int[] anIntArray495 = new int[256];

	@OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
	public static int anInt5195 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!ka;)V")
	public static void method4147(@OriginalArg(1) Class93_Sub1 arg0) {
		@Pc(7) int local7;
		for (local7 = 0; local7 < Static45.anIntArray157.length; local7++) {
			Static45.anIntArray157[local7] = 0;
		}
		@Pc(35) int local35;
		for (local7 = 0; local7 < 5000; local7++) {
			local35 = (int) ((double) 256 * Math.random() * 128.0D);
			Static45.anIntArray157[local35] = (int) (Math.random() * 284.0D);
		}
		@Pc(68) int local68;
		@Pc(80) int local80;
		for (local7 = 0; local7 < 20; local7++) {
			for (local35 = 1; local35 < 255; local35++) {
				for (local68 = 1; local68 < 127; local68++) {
					local80 = local68 + (local35 << 7);
					Static170.anIntArray368[local80] = (Static45.anIntArray157[local80 - 128] + Static45.anIntArray157[local80 + 1] + Static45.anIntArray157[local80 - 1] + Static45.anIntArray157[local80 + 128]) / 4;
				}
			}
			@Pc(117) int[] local117 = Static45.anIntArray157;
			Static45.anIntArray157 = Static170.anIntArray368;
			Static170.anIntArray368 = local117;
		}
		if (arg0 == null) {
			return;
		}
		local7 = 0;
		for (local35 = 0; local35 < arg0.anInt4359; local35++) {
			for (local68 = 0; local68 < arg0.anInt4355; local68++) {
				if (arg0.aByteArray34[local7++] != 0) {
					local80 = arg0.anInt4356 + local68 + 16;
					@Pc(171) int local171 = arg0.anInt4360 + local35 + 16;
					@Pc(177) int local177 = (local171 << 7) + local80;
					Static45.anIntArray157[local177] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ek;ILclient!ek;Z)Lclient!dj;")
	public static Class2_Sub8_Sub5_Sub1 method4149(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class42 arg2) {
		return Static187.method3282(arg2, arg1, 0) ? Static198.method3393(arg0.method1256(arg1, 0)) : null;
	}

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "(II)V")
	public static void method4153(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub8_Sub10 local14 = Static92.method1633(12, arg0);
		local14.method2043();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIIII)V")
	public static void method4155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class2_Sub31 local10;
		for (local10 = (Class2_Sub31) Static275.aClass44_23.method1352(); local10 != null; local10 = (Class2_Sub31) Static275.aClass44_23.method1360()) {
			Static291.method4443(arg1, arg0, arg3, local10, arg2);
		}
		@Pc(44) byte local44;
		@Pc(49) Class123 local49;
		@Pc(131) int local131;
		for (local10 = (Class2_Sub31) Static195.aClass44_29.method1352(); local10 != null; local10 = (Class2_Sub31) Static195.aClass44_29.method1360()) {
			local44 = 1;
			local49 = local10.aClass15_Sub2_Sub1_1.method4297();
			if (local49.anInt4136 == local10.aClass15_Sub2_Sub1_1.anInt5365) {
				local44 = 0;
			} else if (local10.aClass15_Sub2_Sub1_1.anInt5365 == local49.anInt4111 || local49.anInt4140 == local10.aClass15_Sub2_Sub1_1.anInt5365 || local49.anInt4121 == local10.aClass15_Sub2_Sub1_1.anInt5365 || local10.aClass15_Sub2_Sub1_1.anInt5365 == local49.anInt4124) {
				local44 = 2;
			} else if (local10.aClass15_Sub2_Sub1_1.anInt5365 == local49.anInt4113 || local49.anInt4133 == local10.aClass15_Sub2_Sub1_1.anInt5365 || local49.anInt4129 == local10.aClass15_Sub2_Sub1_1.anInt5365 || local10.aClass15_Sub2_Sub1_1.anInt5365 == local49.anInt4142) {
				local44 = 3;
			}
			if (local10.anInt5924 != local44) {
				local131 = Static35.method822(local10.aClass15_Sub2_Sub1_1);
				if (local10.anInt5913 != local131) {
					if (local10.aClass2_Sub3_Sub2_3 != null) {
						Static173.aClass2_Sub3_Sub4_2.method4662(local10.aClass2_Sub3_Sub2_3);
						local10.aClass2_Sub3_Sub2_3 = null;
					}
					local10.anInt5913 = local131;
				}
				local10.anInt5924 = local44;
			}
			local10.anInt5918 = local10.aClass15_Sub2_Sub1_1.anInt5358;
			local10.anInt5930 = local10.aClass15_Sub2_Sub1_1.anInt5358 + local10.aClass15_Sub2_Sub1_1.method4286() * 64;
			local10.anInt5920 = local10.aClass15_Sub2_Sub1_1.anInt5371;
			local10.anInt5927 = local10.aClass15_Sub2_Sub1_1.anInt5371 + local10.aClass15_Sub2_Sub1_1.method4286() * 64;
			Static291.method4443(arg1, arg0, arg3, local10, arg2);
		}
		for (local10 = (Class2_Sub31) Static304.aClass101_26.method2868(); local10 != null; local10 = (Class2_Sub31) Static304.aClass101_26.method2859()) {
			local44 = 1;
			local49 = local10.aClass15_Sub2_Sub2_2.method4297();
			if (local49.anInt4136 == local10.aClass15_Sub2_Sub2_2.anInt5365) {
				local44 = 0;
			} else if (local49.anInt4111 == local10.aClass15_Sub2_Sub2_2.anInt5365 || local10.aClass15_Sub2_Sub2_2.anInt5365 == local49.anInt4140 || local10.aClass15_Sub2_Sub2_2.anInt5365 == local49.anInt4121 || local10.aClass15_Sub2_Sub2_2.anInt5365 == local49.anInt4124) {
				local44 = 2;
			} else if (local49.anInt4113 == local10.aClass15_Sub2_Sub2_2.anInt5365 || local10.aClass15_Sub2_Sub2_2.anInt5365 == local49.anInt4133 || local10.aClass15_Sub2_Sub2_2.anInt5365 == local49.anInt4129 || local10.aClass15_Sub2_Sub2_2.anInt5365 == local49.anInt4142) {
				local44 = 3;
			}
			if (local44 != local10.anInt5924) {
				local131 = Static17.method309(local10.aClass15_Sub2_Sub2_2);
				if (local131 != local10.anInt5913) {
					if (local10.aClass2_Sub3_Sub2_3 != null) {
						Static173.aClass2_Sub3_Sub4_2.method4662(local10.aClass2_Sub3_Sub2_3);
						local10.aClass2_Sub3_Sub2_3 = null;
					}
					local10.anInt5913 = local131;
				}
				local10.anInt5924 = local44;
			}
			local10.anInt5918 = local10.aClass15_Sub2_Sub2_2.anInt5358;
			local10.anInt5930 = local10.aClass15_Sub2_Sub2_2.anInt5358 + local10.aClass15_Sub2_Sub2_2.method4286() * 64;
			local10.anInt5920 = local10.aClass15_Sub2_Sub2_2.anInt5371;
			local10.anInt5927 = local10.aClass15_Sub2_Sub2_2.anInt5371 + local10.aClass15_Sub2_Sub2_2.method4286() * 64;
			Static291.method4443(arg1, arg0, arg3, local10, arg2);
		}
	}
}
