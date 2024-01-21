import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!hb", name = "cd", descriptor = "I")
	public static int anInt1204;

	@OriginalMember(owner = "client!hb", name = "Oc", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!hb", name = "Sc", descriptor = "[I")
	public static int[] anIntArray179 = new int[4000];

	@OriginalMember(owner = "client!hb", name = "Wc", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!hb", name = "Xc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_674 = Static106.method1849("::gc");

	@OriginalMember(owner = "client!hb", name = "Yc", descriptor = "Lclient!sc;")
	private static Class66 aClass66_675 = Static106.method1849("Enter your username (V password)3");

	@OriginalMember(owner = "client!hb", name = "Zc", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[104][104];

	@OriginalMember(owner = "client!hb", name = "ad", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!hb", name = "bd", descriptor = "Lclient!rb;")
	public static Class60 aClass60_43 = new Class60(64);

	@OriginalMember(owner = "client!hb", name = "dd", descriptor = "Lclient!sc;")
	public static Class66 aClass66_676 = aClass66_675;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([Lclient!sc;Z)Lclient!sc;")
	public static Class66 method897(@OriginalArg(0) Class66[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static56.method1244(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)V")
	public static void method898() {
		anIntArrayArray13 = null;
		anIntArray179 = null;
		aBigInteger1 = null;
		aLongArray4 = null;
		aClass66_674 = null;
		aClass66_675 = null;
		aClass66_676 = null;
		aClass60_43 = null;
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)V")
	public static void method899() {
		@Pc(19) int local19;
		if (Static70.anInt714 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static70.anInt714 > 768) {
					Static20.anIntArray85[local19] = Static125.method2015(Static27.anIntArray104[local19], 1024 - Static70.anInt714, Static15.anIntArray500[local19]);
				} else if (Static70.anInt714 > 256) {
					Static20.anIntArray85[local19] = Static27.anIntArray104[local19];
				} else {
					Static20.anIntArray85[local19] = Static125.method2015(Static15.anIntArray500[local19], 256 - Static70.anInt714, Static27.anIntArray104[local19]);
				}
			}
		} else if (Static108.anInt180 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static108.anInt180 > 768) {
					Static20.anIntArray85[local19] = Static125.method2015(Static35.anIntArray115[local19], 1024 - Static108.anInt180, Static15.anIntArray500[local19]);
				} else if (Static108.anInt180 > 256) {
					Static20.anIntArray85[local19] = Static35.anIntArray115[local19];
				} else {
					Static20.anIntArray85[local19] = Static125.method2015(Static15.anIntArray500[local19], 256 - Static108.anInt180, Static35.anIntArray115[local19]);
				}
			}
		} else {
			for (local19 = 0; local19 < 256; local19++) {
				Static20.anIntArray85[local19] = Static15.anIntArray500[local19];
			}
		}
		Static115.method1659(0, 9, 128, 263);
		local19 = 0;
		@Pc(168) int local168 = 6885;
		Static126.aClass1_Sub1_Sub2_Sub1_15.method226(0, 0);
		Static115.method1672();
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(202) int local202;
		@Pc(209) int local209;
		@Pc(218) int local218;
		@Pc(216) int local216;
		@Pc(227) int local227;
		for (@Pc(175) int local175 = 1; local175 < 255; local175++) {
			local188 = Static132.anIntArray498[local175] * (256 - local175) / 256;
			local192 = local188 + 22;
			if (local192 < 0) {
				local192 = 0;
			}
			local19 += local192;
			for (local202 = local192; local202 < 128; local202++) {
				local209 = Static123.anIntArray488[local19++];
				if (local209 == 0) {
					local168++;
				} else {
					local216 = 256 - local209;
					local218 = local209;
					local209 = Static20.anIntArray85[local209];
					local227 = Static3.aClass6_1.anIntArray182[local168];
					Static3.aClass6_1.anIntArray182[local168++] = ((local227 & 0xFF00FF) * local216 + local218 * (local209 & 0xFF00FF) & 0xFF00FF00) + (local216 * (local227 & 0xFF00) + local218 * (local209 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local168 += local192 + 765 - 128;
		}
		local19 = 0;
		local168 = 7546;
		Static115.method1659(637, 9, 765, 263);
		Static127.aClass1_Sub1_Sub2_Sub1_16.method226(382, 0);
		Static115.method1672();
		for (local188 = 1; local188 < 255; local188++) {
			local192 = Static132.anIntArray498[local188] * (256 - local188) / 256;
			local168 += local192;
			local202 = 103 - local192;
			for (local209 = 0; local209 < local202; local209++) {
				local218 = Static123.anIntArray488[local19++];
				if (local218 == 0) {
					local168++;
				} else {
					local216 = local218;
					local227 = 256 - local218;
					local218 = Static20.anIntArray85[local218];
					@Pc(357) int local357 = Static3.aClass6_1.anIntArray182[local168];
					Static3.aClass6_1.anIntArray182[local168++] = ((local357 & 0xFF00FF) * local227 + local216 * (local218 & 0xFF00FF) & 0xFF00FF00) + (local227 * (local357 & 0xFF00) + (local218 & 0xFF00) * local216 & 0xFF0000) >> 8;
				}
			}
			local19 += 128 - local202;
			local168 += 765 - local192 - local202;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hd;IIB)V")
	public static void method900(@OriginalArg(0) Class1_Sub1_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg1 & 0x20) != 0) {
			arg0.aClass66_702 = Static133.aClass1_Sub12_Sub1_3.method1214();
			if (arg0.aClass66_702.method1814(0) == 126) {
				arg0.aClass66_702 = arg0.aClass66_702.method1831(1);
				Static103.method1791(2, arg0.aClass66_707, arg0.aClass66_702);
			} else if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1 == arg0) {
				Static103.method1791(2, arg0.aClass66_707, arg0.aClass66_702);
			}
			arg0.anInt1282 = 0;
			arg0.anInt1283 = 150;
			arg0.anInt1273 = 0;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if ((arg1 & 0x100) != 0) {
			local66 = Static133.aClass1_Sub12_Sub1_3.method1203();
			local70 = Static133.aClass1_Sub12_Sub1_3.method1202();
			arg0.method930(local70, Static22.anInt636, local66);
			arg0.anInt1264 = Static22.anInt636 + 300;
			arg0.anInt1242 = Static133.aClass1_Sub12_Sub1_3.method1203();
			arg0.anInt1275 = Static133.aClass1_Sub12_Sub1_3.method1212();
		}
		if ((arg1 & 0x4) != 0) {
			local66 = Static133.aClass1_Sub12_Sub1_3.method1203();
			@Pc(105) byte[] local105 = new byte[local66];
			@Pc(110) Class1_Sub12 local110 = new Class1_Sub12(local105);
			Static133.aClass1_Sub12_Sub1_3.method1207(local66, local105);
			Static106.aClass1_Sub12Array1[arg2] = local110;
			arg0.method939(local110);
		}
		if ((arg1 & 0x40) != 0) {
			local66 = Static133.aClass1_Sub12_Sub1_3.method1194();
			local70 = Static133.aClass1_Sub12_Sub1_3.method1190();
			if (local66 == 65535) {
				local66 = -1;
			}
			Static114.method1924(local66, local70, arg0);
		}
		if ((arg1 & 0x400) != 0) {
			arg0.anInt1255 = Static133.aClass1_Sub12_Sub1_3.method1194();
			local66 = Static133.aClass1_Sub12_Sub1_3.method1209();
			arg0.anInt1281 = (local66 & 0xFFFF) + Static22.anInt636;
			if (arg0.anInt1255 == 65535) {
				arg0.anInt1255 = -1;
			}
			arg0.anInt1249 = local66 >> 16;
			arg0.anInt1279 = 0;
			arg0.anInt1253 = 0;
			if (Static22.anInt636 < arg0.anInt1281) {
				arg0.anInt1279 = -1;
			}
		}
		if ((arg1 & 0x10) != 0) {
			local66 = Static133.aClass1_Sub12_Sub1_3.method1203();
			local70 = Static133.aClass1_Sub12_Sub1_3.method1202();
			arg0.method930(local70, Static22.anInt636, local66);
			arg0.anInt1264 = Static22.anInt636 + 300;
			arg0.anInt1242 = Static133.aClass1_Sub12_Sub1_3.method1190();
			arg0.anInt1275 = Static133.aClass1_Sub12_Sub1_3.method1212();
		}
		if ((arg1 & 0x1) != 0) {
			arg0.anInt1265 = Static133.aClass1_Sub12_Sub1_3.method1183();
			arg0.anInt1280 = Static133.aClass1_Sub12_Sub1_3.method1194();
		}
		if ((arg1 & 0x2) != 0) {
			arg0.anInt1241 = Static133.aClass1_Sub12_Sub1_3.method1176();
			if (arg0.anInt1241 == 65535) {
				arg0.anInt1241 = -1;
			}
		}
		if ((arg1 & 0x8) != 0) {
			local66 = Static133.aClass1_Sub12_Sub1_3.method1222();
			local70 = Static133.aClass1_Sub12_Sub1_3.method1203();
			@Pc(281) int local281 = Static133.aClass1_Sub12_Sub1_3.method1212();
			@Pc(284) int local284 = Static133.aClass1_Sub12_Sub1_3.anInt1694;
			if (arg0.aClass66_707 != null && arg0.aClass38_1 != null) {
				@Pc(295) long local295 = arg0.aClass66_707.method1806();
				@Pc(297) boolean local297 = false;
				if (local70 <= 1) {
					for (@Pc(302) int local302 = 0; local302 < Static126.anInt2886; local302++) {
						if (aLongArray4[local302] == local295) {
							local297 = true;
							break;
						}
					}
				}
				if (!local297 && Static63.anInt1927 == 0) {
					Static70.aClass1_Sub12_5.anInt1694 = 0;
					Static133.aClass1_Sub12_Sub1_3.method1186(local281, Static70.aClass1_Sub12_5.aByteArray12);
					Static70.aClass1_Sub12_5.anInt1694 = 0;
					@Pc(353) Class66 local353 = Static110.method772(Static68.method1378(Static70.aClass1_Sub12_5).method1839());
					arg0.aClass66_702 = local353.method1808();
					arg0.anInt1273 = local66 & 0xFF;
					arg0.anInt1282 = local66 >> 8;
					arg0.anInt1283 = 150;
					if (local70 == 2 || local70 == 3) {
						Static103.method1791(1, method897(new Class66[] { Static132.aClass66_1733, arg0.aClass66_707 }), local353);
					} else if (local70 == 1) {
						Static103.method1791(1, method897(new Class66[] { Static121.aClass66_1649, arg0.aClass66_707 }), local353);
					} else {
						Static103.method1791(2, arg0.aClass66_707, local353);
					}
				}
			}
			Static133.aClass1_Sub12_Sub1_3.anInt1694 = local284 + local281;
		}
		if ((arg1 & 0x200) == 0) {
			return;
		}
		arg0.anInt1258 = Static133.aClass1_Sub12_Sub1_3.method1212();
		arg0.anInt1256 = Static133.aClass1_Sub12_Sub1_3.method1203();
		arg0.anInt1267 = Static133.aClass1_Sub12_Sub1_3.method1190();
		arg0.anInt1260 = Static133.aClass1_Sub12_Sub1_3.method1202();
		arg0.anInt1239 = Static133.aClass1_Sub12_Sub1_3.method1176() + Static22.anInt636;
		arg0.anInt1292 = Static133.aClass1_Sub12_Sub1_3.method1183() + Static22.anInt636;
		arg0.anInt1272 = Static133.aClass1_Sub12_Sub1_3.method1203();
		arg0.anInt1237 = 1;
		arg0.anInt1284 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZII)Lclient!sc;")
	public static Class66 method901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static63.aClass66_1019;
		} else if (local4 < -6) {
			return Static16.aClass66_309;
		} else if (local4 < -3) {
			return Static86.aClass66_1255;
		} else if (local4 < 0) {
			return Static17.aClass66_337;
		} else if (local4 > 9) {
			return Static83.aClass66_1183;
		} else if (local4 > 6) {
			return Static65.aClass66_1050;
		} else if (local4 > 3) {
			return Static45.aClass66_775;
		} else if (local4 > 0) {
			return Static35.aClass66_504;
		} else {
			return Static19.aClass66_363;
		}
	}

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "(I)V")
	public static void method902() {
		for (@Pc(11) int local11 = 0; local11 < Static33.anInt854; local11++) {
			@Pc(17) int local17 = Static54.anIntArray248[local11];
			@Pc(21) Class1_Sub1_Sub1_Sub5_Sub1 local21 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local17];
			if (local21 != null) {
				Static118.method1951(local21.aClass1_Sub1_Sub5_1.anInt1474, local21);
			}
		}
	}
}
