import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array3;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Lclient!md;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub2Array4;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
	public static int anInt75;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt64 = 1;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
	public static int[] anIntArray4 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public static int anInt69 = 0;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!b;")
	public static Class3_Sub2 aClass3_Sub2_1 = new Class3_Sub2(8);

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	public static volatile int anInt74 = 0;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Lclient!n;")
	public static Class52 aClass52_2 = new Class52(64);

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "Lclient!sb;")
	public static Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_54 = Static33.method650("Fps:");

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "Z")
	public static final boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public static void method41(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class37 local7 = Static8.aClass37ArrayArrayArray1[Static94.anInt2470][arg0][arg1];
		if (local7 == null) {
			Static116.aClass14_1.method442(Static94.anInt2470, arg0, arg1);
			return;
		}
		@Pc(29) Class3_Sub1_Sub2_Sub2 local29 = null;
		@Pc(31) int local31 = -99999999;
		@Pc(36) Class3_Sub1_Sub2_Sub2 local36;
		for (local36 = (Class3_Sub1_Sub2_Sub2) local7.method989(); local36 != null; local36 = (Class3_Sub1_Sub2_Sub2) local7.method990()) {
			@Pc(42) Class3_Sub1_Sub8 local42 = Static12.method239(local36.anInt682);
			@Pc(45) int local45 = local42.anInt1754;
			if (local42.anInt1731 == 1) {
				local45 *= local36.anInt688 + 1;
			}
			if (local31 < local45) {
				local29 = local36;
				local31 = local45;
			}
		}
		if (local29 == null) {
			Static116.aClass14_1.method442(Static94.anInt2470, arg0, arg1);
			return;
		}
		local7.method991(local29);
		local36 = (Class3_Sub1_Sub2_Sub2) local7.method989();
		@Pc(95) Class3_Sub1_Sub2_Sub2 local95 = null;
		@Pc(104) int local104 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(106) Class3_Sub1_Sub2_Sub2 local106 = null;
		while (local36 != null) {
			if (local36.anInt682 != local29.anInt682) {
				if (local95 == null) {
					local95 = local36;
				}
				if (local95.anInt682 != local36.anInt682 && local106 == null) {
					local106 = local36;
				}
			}
			local36 = (Class3_Sub1_Sub2_Sub2) local7.method990();
		}
		Static116.aClass14_1.method412(Static94.anInt2470, arg0, arg1, Static27.method560(arg1 * 128 + 64, Static94.anInt2470, arg0 * 128 + 64), local29, local104, local95, local106);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method43() {
		try {
			@Pc(6) Graphics local6 = Static59.aCanvas1.getGraphics();
			Static31.aClass30_5.method811(205, 553, local6);
		} catch (@Pc(19) Exception local19) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
	public static void method44() {
		aClass30_3 = null;
		anIntArray4 = null;
		aClass68_1 = null;
		aClass56_54 = null;
		aClass3_Sub1_Sub1_Sub2Array4 = null;
		aClass3_Sub1_Sub1_Sub4Array3 = null;
		aClass3_Sub2_1 = null;
		aByteArrayArray1 = null;
		aClass52_2 = null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)I")
	public static int method45(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg1);
		return Static51.aClass3_Sub1_Sub14_1 != null && Static51.aClass3_Sub1_Sub14_1.aLong94 == local10 ? Static65.aClass3_Sub2_4.anInt413 * 99 / (Static65.aClass3_Sub2_4.aByteArray7.length - Static51.aClass3_Sub1_Sub14_1.aByte4) + 1 : 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Lclient!oa;")
	public static Class56 method46(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static111.method1851(arg0) : Static49.aClass56_837;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method47() {
		@Pc(3) Class10 local3 = Static119.aClass10_1;
		synchronized (Static119.aClass10_1) {
			Static26.anInt763 = Static12.anInt304;
			@Pc(22) int local22;
			if (Static12.anInt306 >= 0) {
				while (Static12.anInt306 != Static57.anInt1617) {
					local22 = Static44.anIntArray77[Static57.anInt1617];
					Static57.anInt1617 = Static57.anInt1617 + 1 & 0x7F;
					if (local22 >= 0) {
						Static71.aBooleanArray8[local22] = true;
					} else {
						Static71.aBooleanArray8[~local22] = false;
					}
				}
			} else {
				for (local22 = 0; local22 < 112; local22++) {
					Static71.aBooleanArray8[local22] = false;
				}
				Static12.anInt306 = Static57.anInt1617;
			}
			Static12.anInt304 = Static114.anInt2884;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!kc;BLjava/awt/Component;I)Lclient!le;")
	public static Class18 method49(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static7.anInt420 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class18 local38 = (Class18) Class.forName("Class18_Sub1").getDeclaredConstructor().newInstance();
			local38.anIntArray194 = new int[(Static28.aBoolean44 ? 2 : 1) * 256];
			local38.anInt2303 = arg3;
			local38.method1531(arg2);
			local38.anInt2299 = (arg3 & 0xFFFFFC00) + 1024;
			if (local38.anInt2299 > 16384) {
				local38.anInt2299 = 16384;
			}
			local38.method1542(local38.anInt2299);
			if (Static60.anInt1735 > 0 && Static99.aClass7_2 == null) {
				Static99.aClass7_2 = new Class7();
				arg1.method1093(Static60.anInt1735, Static99.aClass7_2);
			}
			if (Static99.aClass7_2 != null) {
				if (Static99.aClass7_2.aClass18Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static99.aClass7_2.aClass18Array1[arg0] = local38;
			}
			return local38;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class18_Sub2 local114 = new Class18_Sub2(arg1, arg0);
				local114.anInt2303 = arg3;
				local114.anIntArray194 = new int[(Static28.aBoolean44 ? 2 : 1) * 256];
				local114.method1531(arg2);
				local114.anInt2299 = 16384;
				local114.method1542(local114.anInt2299);
				if (Static60.anInt1735 > 0 && Static99.aClass7_2 == null) {
					Static99.aClass7_2 = new Class7();
					arg1.method1093(Static60.anInt1735, Static99.aClass7_2);
				}
				if (Static99.aClass7_2 != null) {
					if (Static99.aClass7_2.aClass18Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static99.aClass7_2.aClass18Array1[arg0] = local114;
				}
				return local114;
			} catch (@Pc(181) Throwable local181) {
				return new Class18();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;Lclient!tb;B)V")
	public static void method50(@OriginalArg(0) Component arg0, @OriginalArg(1) Class44 arg1) {
		if (Static119.aBoolean162) {
			return;
		}
		Static59.aClass3_Sub1_Sub1_Sub4_37 = Static17.method347(Static52.aClass56_847, arg1, Static61.aClass56_951);
		Static115.aClass3_Sub1_Sub1_Sub4_70 = Static17.method347(Static65.aClass56_986, arg1, Static61.aClass56_951);
		Static40.aClass3_Sub1_Sub1_Sub4_26 = Static17.method347(Static40.aClass56_624, arg1, Static61.aClass56_951);
		Static12.aClass3_Sub1_Sub1_Sub4_9 = Static17.method347(Static77.aClass56_1723, arg1, Static61.aClass56_951);
		Static23.aClass3_Sub1_Sub1_Sub4_16 = Static17.method347(Static95.aClass56_1346, arg1, Static61.aClass56_951);
		Static64.aClass3_Sub1_Sub1_Sub4_39 = Static17.method347(Static45.aClass56_707, arg1, Static61.aClass56_951);
		Static105.aClass30_16 = Static11.method235(96, arg0, 479);
		Static115.aClass3_Sub1_Sub1_Sub4_70.method1504(0, 0);
		Static80.aClass30_13 = Static11.method235(156, arg0, 172);
		Static6.method1486();
		Static40.aClass3_Sub1_Sub1_Sub4_26.method1504(0, 0);
		Static31.aClass30_5 = Static11.method235(261, arg0, 190);
		Static59.aClass3_Sub1_Sub1_Sub4_37.method1504(0, 0);
		Static2.aClass30_1 = Static11.method235(334, arg0, 512);
		Static6.method1486();
		Static16.aClass30_4 = Static11.method235(50, arg0, 496);
		Static111.aClass30_17 = Static11.method235(37, arg0, 269);
		aClass30_3 = Static11.method235(45, arg0, 249);
		@Pc(106) Class3_Sub1_Sub1_Sub2 local106 = Static109.method1161(Static61.aClass56_951, arg1, Static21.aClass56_301);
		Static76.aClass30_12 = Static11.method235(local106.anInt1484, arg0, local106.anInt1485);
		local106.method958(0, 0);
		@Pc(124) Class3_Sub1_Sub1_Sub2 local124 = Static109.method1161(Static61.aClass56_951, arg1, Static21.aClass56_298);
		Static95.aClass30_15 = Static11.method235(local124.anInt1484, arg0, local124.anInt1485);
		local124.method958(0, 0);
		@Pc(142) Class3_Sub1_Sub1_Sub2 local142 = Static109.method1161(Static61.aClass56_951, arg1, Static76.aClass56_1112);
		Static4.aClass30_2 = Static11.method235(local142.anInt1484, arg0, local142.anInt1485);
		local142.method958(0, 0);
		@Pc(160) Class3_Sub1_Sub1_Sub2 local160 = Static109.method1161(Static61.aClass56_951, arg1, Static106.aClass56_1453);
		Static65.aClass30_11 = Static11.method235(local160.anInt1484, arg0, local160.anInt1485);
		local160.method958(0, 0);
		@Pc(178) Class3_Sub1_Sub1_Sub2 local178 = Static109.method1161(Static61.aClass56_951, arg1, Static31.aClass56_501);
		Static33.aClass30_6 = Static11.method235(local178.anInt1484, arg0, local178.anInt1485);
		local178.method958(0, 0);
		@Pc(196) Class3_Sub1_Sub1_Sub2 local196 = Static109.method1161(Static61.aClass56_951, arg1, Static114.aClass56_1568);
		Static44.aClass30_7 = Static11.method235(local196.anInt1484, arg0, local196.anInt1485);
		local196.method958(0, 0);
		@Pc(214) Class3_Sub1_Sub1_Sub2 local214 = Static109.method1161(Static61.aClass56_951, arg1, Static125.aClass56_1730);
		Static92.aClass30_14 = Static11.method235(local214.anInt1484, arg0, local214.anInt1485);
		local214.method958(0, 0);
		@Pc(232) Class3_Sub1_Sub1_Sub2 local232 = Static109.method1161(Static61.aClass56_951, arg1, Static11.aClass56_170);
		Static57.aClass30_10 = Static11.method235(local232.anInt1484, arg0, local232.anInt1485);
		local232.method958(0, 0);
		@Pc(250) Class3_Sub1_Sub1_Sub2 local250 = Static109.method1161(Static61.aClass56_951, arg1, Static57.aClass56_893);
		Static127.aClass30_18 = Static11.method235(local250.anInt1484, arg0, local250.anInt1485);
		local250.method958(0, 0);
		Static93.aClass3_Sub1_Sub1_Sub4_57 = Static17.method347(Static97.aClass56_1397, arg1, Static61.aClass56_951);
		Static102.aClass3_Sub1_Sub1_Sub4_75 = Static17.method347(Static36.aClass56_570, arg1, Static61.aClass56_951);
		Static84.aClass3_Sub1_Sub1_Sub4_52 = Static17.method347(Static18.aClass56_238, arg1, Static61.aClass56_951);
		Static86.aClass3_Sub1_Sub1_Sub4_54 = Static93.aClass3_Sub1_Sub1_Sub4_57.method1506();
		Static86.aClass3_Sub1_Sub1_Sub4_54.method1501();
		Static69.aClass3_Sub1_Sub1_Sub4_44 = Static102.aClass3_Sub1_Sub1_Sub4_75.method1506();
		Static69.aClass3_Sub1_Sub1_Sub4_44.method1501();
		Static68.aClass3_Sub1_Sub1_Sub4_41 = Static93.aClass3_Sub1_Sub1_Sub4_57.method1506();
		Static68.aClass3_Sub1_Sub1_Sub4_41.method1500();
		Static69.aClass3_Sub1_Sub1_Sub4_43 = Static102.aClass3_Sub1_Sub1_Sub4_75.method1506();
		Static69.aClass3_Sub1_Sub1_Sub4_43.method1500();
		Static41.aClass3_Sub1_Sub1_Sub4_27 = Static84.aClass3_Sub1_Sub1_Sub4_52.method1506();
		Static41.aClass3_Sub1_Sub1_Sub4_27.method1500();
		Static113.aClass3_Sub1_Sub1_Sub4_68 = Static93.aClass3_Sub1_Sub1_Sub4_57.method1506();
		Static113.aClass3_Sub1_Sub1_Sub4_68.method1501();
		Static113.aClass3_Sub1_Sub1_Sub4_68.method1500();
		Static106.aClass3_Sub1_Sub1_Sub4_63 = Static102.aClass3_Sub1_Sub1_Sub4_75.method1506();
		Static106.aClass3_Sub1_Sub1_Sub4_63.method1501();
		Static106.aClass3_Sub1_Sub1_Sub4_63.method1500();
		Static80.aClass3_Sub1_Sub1_Sub4Array44 = Static124.method1994(arg1, Static61.aClass56_951, Static71.aClass56_1047);
		Static69.anIntArray160 = new int[151];
		Static50.anIntArray99 = new int[33];
		Static65.anIntArray142 = new int[151];
		Static66.anIntArray32 = new int[33];
		@Pc(343) int local343;
		@Pc(345) int local345;
		@Pc(347) int local347;
		for (@Pc(339) int local339 = 0; local339 < 33; local339++) {
			local343 = 999;
			local345 = 0;
			for (local347 = 0; local347 < 34; local347++) {
				if (Static40.aClass3_Sub1_Sub1_Sub4_26.aByteArray30[Static40.aClass3_Sub1_Sub1_Sub4_26.anInt2250 * local339 + local347] == 0) {
					if (local343 == 999) {
						local343 = local347;
					}
				} else if (local343 != 999) {
					local345 = local347;
					break;
				}
			}
			Static50.anIntArray99[local339] = local343;
			Static66.anIntArray32[local339] = local345 - local343;
		}
		for (local343 = 5; local343 < 156; local343++) {
			local345 = 999;
			local347 = 0;
			for (@Pc(411) int local411 = 25; local411 < 172; local411++) {
				if (Static40.aClass3_Sub1_Sub1_Sub4_26.aByteArray30[Static40.aClass3_Sub1_Sub1_Sub4_26.anInt2250 * local343 + local411] == 0 && (local411 > 34 || local343 > 34)) {
					if (local345 == 999) {
						local345 = local411;
					}
				} else if (local345 != 999) {
					local347 = local411;
					break;
				}
			}
			Static65.anIntArray142[local343 - 5] = local345 - 25;
			Static69.anIntArray160[local343 - 5] = local347 - local345;
		}
		Static119.aBoolean162 = true;
	}
}
