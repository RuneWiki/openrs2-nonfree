import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public static int anInt1801;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!oa;")
	public static Class9 aClass9_14;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "Lclient!kc;")
	public static Class11 aClass11_9;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_11;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!lc;")
	public static Class31 aClass31_640 = Static56.method1206("backvmid2");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!lc;")
	public static Class31 aClass31_641 = Static56.method1206("Please wait)3)3)3");

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!lc;")
	public static Class31 aClass31_642 = Static56.method1206(" with)3)3)3");

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public static int anInt1802 = -1;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_643 = Static56.method1206("@or2@");

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_644 = Static56.method1206("::");

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	public static int anInt1806 = 0;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_645 = Static56.method1206("You have not yet set*6nany contact details)3");

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!lc;")
	public static Class31 aClass31_646 = Static56.method1206("Imported maps");

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!lc;")
	public static Class31 aClass31_647 = Static56.method1206("null");

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Lclient!lc;")
	public static Class31 aClass31_648 = Static56.method1206("mapdots");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!mb;")
	public static Class2_Sub1_Sub10 method1158(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub10 local15 = (Class2_Sub1_Sub10) Static61.aClass17_78.method786((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = aClass11_9.method338(12, arg0);
		local15 = new Class2_Sub1_Sub10();
		if (local25 != null) {
			local15.method1305(new Class2_Sub6(local25));
		}
		local15.method1311();
		Static61.aClass17_78.method783(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1162() {
		aClass31_645 = null;
		aByteArrayArray9 = null;
		aClass11_Sub1_11 = null;
		aClass31_641 = null;
		aClass31_643 = null;
		aClass31_642 = null;
		aClass9_14 = null;
		aClass31_644 = null;
		anIntArray266 = null;
		aClass11_9 = null;
		aClass31_646 = null;
		aClass31_647 = null;
		aClass31_640 = null;
		aClass31_648 = null;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1165() {
		@Pc(16) int local16;
		if (Static37.anInt1412 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static37.anInt1412 > 768) {
					Static82.anIntArray326[local16] = Static99.method1687(1024 - Static37.anInt1412, Static41.anIntArray242[local16], Static12.anIntArray77[local16]);
				} else if (Static37.anInt1412 <= 256) {
					Static82.anIntArray326[local16] = Static99.method1687(256 - Static37.anInt1412, Static12.anIntArray77[local16], Static41.anIntArray242[local16]);
				} else {
					Static82.anIntArray326[local16] = Static41.anIntArray242[local16];
				}
			}
		} else if (Static101.anInt2753 <= 0) {
			for (local16 = 0; local16 < 256; local16++) {
				Static82.anIntArray326[local16] = Static12.anIntArray77[local16];
			}
		} else {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static101.anInt2753 > 768) {
					Static82.anIntArray326[local16] = Static99.method1687(1024 - Static101.anInt2753, Static98.anIntArray144[local16], Static12.anIntArray77[local16]);
				} else if (Static101.anInt2753 <= 256) {
					Static82.anIntArray326[local16] = Static99.method1687(256 - Static101.anInt2753, Static12.anIntArray77[local16], Static98.anIntArray144[local16]);
				} else {
					Static82.anIntArray326[local16] = Static98.anIntArray144[local16];
				}
			}
		}
		for (local16 = 0; local16 < 33920; local16++) {
			Static9.aClass9_2.anIntArray169[local16] = Static64.aClass2_Sub1_Sub3_Sub2_2.anIntArray89[local16];
		}
		@Pc(172) int local172 = 1152;
		@Pc(174) int local174 = 0;
		@Pc(189) int local189;
		@Pc(193) int local193;
		@Pc(203) int local203;
		@Pc(210) int local210;
		@Pc(217) int local217;
		@Pc(222) int local222;
		@Pc(231) int local231;
		for (@Pc(176) int local176 = 1; local176 < 255; local176++) {
			local189 = Static38.anIntArray229[local176] * (256 - local176) / 256;
			local193 = local189 + 22;
			if (local193 < 0) {
				local193 = 0;
			}
			local174 += local193;
			for (local203 = local193; local203 < 128; local203++) {
				local210 = Static25.anIntArray122[local174++];
				if (local210 == 0) {
					local172++;
				} else {
					local217 = local210;
					local222 = 256 - local210;
					local210 = Static82.anIntArray326[local210];
					local231 = Static9.aClass9_2.anIntArray169[local172];
					Static9.aClass9_2.anIntArray169[local172++] = ((local210 & 0xFF00) * local217 + local222 * (local231 & 0xFF00) & 0xFF0000) + ((local210 & 0xFF00FF) * local217 + (local222 * (local231 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local172 += local193;
		}
		for (local189 = 0; local189 < 33920; local189++) {
			Static95.aClass9_26.anIntArray169[local189] = Static69.aClass2_Sub1_Sub3_Sub2_6.anIntArray89[local189];
		}
		local174 = 0;
		local172 = 1176;
		for (local193 = 1; local193 < 255; local193++) {
			local203 = (256 - local193) * Static38.anIntArray229[local193] / 256;
			local172 += local203;
			local210 = 103 - local203;
			for (local217 = 0; local217 < local210; local217++) {
				local222 = Static25.anIntArray122[local174++];
				if (local222 == 0) {
					local172++;
				} else {
					local231 = local222;
					@Pc(360) int local360 = Static95.aClass9_26.anIntArray169[local172];
					@Pc(364) int local364 = 256 - local222;
					local222 = Static82.anIntArray326[local222];
					Static95.aClass9_26.anIntArray169[local172++] = ((local222 & 0xFF00) * local231 + local364 * (local360 & 0xFF00) & 0xFF0000) + (local364 * (local360 & 0xFF00FF) + local231 * (local222 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local172 += 128 - local210 - local203;
			local174 += 128 - local210;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public static void method1167() {
		Static19.aClass17_34.method782();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V")
	public static void method1168(@OriginalArg(0) boolean arg0) {
		if (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 >> 7 == Static85.anInt2509 && Static8.anInt302 == Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 >> 7) {
			Static85.anInt2509 = 0;
		}
		@Pc(29) int local29 = Static21.anInt1007;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(43) int local43 = 0; local43 < local29; local43++) {
			@Pc(59) Class2_Sub1_Sub4_Sub6_Sub1 local59;
			@Pc(53) int local53;
			if (arg0) {
				local53 = 33538048;
				local59 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1;
			} else {
				local53 = Static78.anIntArray322[local43] << 14;
				local59 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[Static78.anIntArray322[local43]];
			}
			if (local59 != null && local59.method1270()) {
				@Pc(76) int local76 = local59.anInt2006 >> 7;
				@Pc(81) int local81 = local59.anInt2011 >> 7;
				local59.aBoolean88 = false;
				if ((Static10.aBoolean28 && Static21.anInt1007 > 50 || Static21.anInt1007 > 200) && !arg0 && local59.anInt1988 == local59.anInt2007) {
					local59.aBoolean88 = true;
				}
				if (local76 >= 0 && local76 < 104 && local81 >= 0 && local81 < 104) {
					if (local59.aClass2_Sub1_Sub4_Sub5_3 == null || local59.anInt1731 > Static49.anInt2694 || Static49.anInt2694 >= local59.anInt1720) {
						if ((local59.anInt2006 & 0x7F) == 64 && (local59.anInt2011 & 0x7F) == 64) {
							if (Static78.anInt2278 == Static46.anIntArrayArray51[local76][local81]) {
								continue;
							}
							Static46.anIntArrayArray51[local76][local81] = Static78.anInt2278;
						}
						local59.anInt1714 = Static42.method1057(local59.anInt2006, local59.anInt2011, Static58.anInt1945);
						Static99.aClass64_1.method1791(Static58.anInt1945, local59.anInt2006, local59.anInt2011, local59.anInt1714, 60, local59, local59.anInt1991, local53, local59.aBoolean102);
					} else {
						local59.aBoolean88 = false;
						local59.anInt1714 = Static42.method1057(local59.anInt2006, local59.anInt2011, Static58.anInt1945);
						Static99.aClass64_1.method1760(Static58.anInt1945, local59.anInt2006, local59.anInt2011, local59.anInt1714, local59, local59.anInt1991, local53, local59.anInt1713, local59.anInt1721, local59.anInt1715, local59.anInt1729);
					}
				}
			}
		}
	}
}
