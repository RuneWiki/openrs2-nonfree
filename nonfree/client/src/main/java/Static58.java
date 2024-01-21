import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1677 = Static15.method178("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1672 = aClass23_1677;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	public static int anInt2818 = 0;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1673 = Static15.method178("backvmid2");

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1674 = Static15.method178("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1675 = Static15.method178("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1676 = Static15.method178("(U3");

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
	public static int anInt2821 = 0;

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1678 = aClass23_1675;

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!ba;")
	public static Class5 aClass5_62 = new Class5(50);

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1680 = Static15.method178("Service unavailable)3");

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1679 = aClass23_1680;

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1681 = Static15.method178("World");

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1682 = aClass23_1681;

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "[J")
	public static long[] aLongArray37 = new long[100];

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	public static void method1853() {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (Static96.anInt1794 == 228) {
			local12 = Static83.aClass1_Sub5_Sub1_3.method713();
			local21 = Static35.anInt1095 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static43.anInt1458;
			local31 = Static83.aClass1_Sub5_Sub1_3.method716();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local43 = Static114.anIntArray411[local35];
			if (local21 >= 0 && local27 >= 0 && local21 < 104 && local27 < 104) {
				Static87.method1880(local35, -1, Static79.anInt2137, 0, local43, local39, local21, local27, -1);
			}
			return;
		}
		@Pc(111) int local111;
		if (Static96.anInt1794 == 37) {
			local12 = Static83.aClass1_Sub5_Sub1_3.method713();
			local21 = local12 >> 2;
			local27 = local12 & 0x3;
			local31 = Static114.anIntArray411[local21];
			local35 = Static83.aClass1_Sub5_Sub1_3.method716();
			local39 = Static35.anInt1095 + (local35 >> 4 & 0x7);
			local43 = (local35 & 0x7) + Static43.anInt1458;
			local111 = Static83.aClass1_Sub5_Sub1_3.method715();
			if (local39 >= 0 && local43 >= 0 && local39 < 104 && local43 < 104) {
				Static87.method1880(local21, local111, Static79.anInt2137, 0, local31, local27, local39, local43, -1);
			}
		} else if (Static96.anInt1794 == 62) {
			local12 = Static83.aClass1_Sub5_Sub1_3.method716();
			local21 = (local12 >> 4 & 0x7) + Static35.anInt1095;
			local27 = (local12 & 0x7) + Static43.anInt1458;
			local31 = Static83.aClass1_Sub5_Sub1_3.method715();
			local35 = Static83.aClass1_Sub5_Sub1_3.method715();
			local39 = Static83.aClass1_Sub5_Sub1_3.method715();
			if (local21 >= 0 && local27 >= 0 && local21 < 104 && local27 < 104) {
				@Pc(199) Class45 local199 = Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local21][local27];
				if (local199 != null) {
					for (@Pc(206) Class1_Sub1_Sub2_Sub3 local206 = (Class1_Sub1_Sub2_Sub3) local199.method1299(); local206 != null; local206 = (Class1_Sub1_Sub2_Sub3) local199.method1288()) {
						if ((local31 & 0x7FFF) == local206.anInt1041 && local206.anInt1046 == local35) {
							local206.anInt1046 = local39;
							break;
						}
					}
					Static104.method1776(local27, local21);
				}
			}
		} else {
			@Pc(276) int local276;
			@Pc(284) int local284;
			@Pc(290) int local290;
			@Pc(294) int local294;
			@Pc(298) int local298;
			if (Static96.anInt1794 == 151) {
				local12 = Static83.aClass1_Sub5_Sub1_3.method728();
				local21 = Static83.aClass1_Sub5_Sub1_3.method718();
				local31 = local21 & 0x3;
				local27 = local21 >> 2;
				local35 = Static114.anIntArray411[local27];
				@Pc(264) byte local264 = Static83.aClass1_Sub5_Sub1_3.method693();
				@Pc(268) byte local268 = Static83.aClass1_Sub5_Sub1_3.method727();
				local111 = Static83.aClass1_Sub5_Sub1_3.method715();
				local276 = Static83.aClass1_Sub5_Sub1_3.method718();
				local284 = (local276 >> 4 & 0x7) + Static35.anInt1095;
				local290 = (local276 & 0x7) + Static43.anInt1458;
				local294 = Static83.aClass1_Sub5_Sub1_3.method715();
				local298 = Static83.aClass1_Sub5_Sub1_3.method728();
				@Pc(302) byte local302 = Static83.aClass1_Sub5_Sub1_3.method693();
				@Pc(306) byte local306 = Static83.aClass1_Sub5_Sub1_3.method693();
				@Pc(315) Class1_Sub1_Sub2_Sub1_Sub2 local315;
				if (local12 == Static84.anInt2353) {
					local315 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1;
				} else {
					local315 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local12];
				}
				if (local315 != null) {
					@Pc(326) Class1_Sub1_Sub4 local326 = Static97.method1645(local294);
					@Pc(336) int local336 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local284 + 1][local290];
					@Pc(348) int local348 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local284 + 1][local290 + 1];
					@Pc(356) int local356 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local284][local290];
					@Pc(366) int local366 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local284][local290 + 1];
					@Pc(376) Class1_Sub1_Sub2_Sub6 local376 = local326.method173(local348, local27, local356, local336, local366, local31);
					if (local376 != null) {
						Static87.method1880(0, -1, Static79.anInt2137, local111 + 1, local35, 0, local284, local290, local298 + 1);
						local315.aClass1_Sub1_Sub2_Sub6_1 = local376;
						local315.anInt2244 = Static7.anInt176 + local298;
						@Pc(404) int local404 = local326.anInt299;
						local315.anInt2247 = local111 + Static7.anInt176;
						@Pc(412) int local412 = local326.anInt305;
						if (local31 == 1 || local31 == 3) {
							local412 = local326.anInt299;
							local404 = local326.anInt305;
						}
						local315.anInt2246 = local404 * 64 + local284 * 128;
						@Pc(442) byte local442;
						if (local264 < local268) {
							local442 = local268;
							local268 = local264;
							local264 = local442;
						}
						if (local302 > local306) {
							local442 = local302;
							local302 = local306;
							local306 = local442;
						}
						local315.anInt2249 = local290 * 128 + local412 * 64;
						local315.anInt2240 = Static48.method987(local315.anInt2249, local315.anInt2246, Static79.anInt2137);
						local315.anInt2243 = local302 + local290;
						local315.anInt2259 = local264 + local284;
						local315.anInt2237 = local268 + local284;
						local315.anInt2257 = local290 + local306;
					}
				}
			}
			if (Static96.anInt1794 == 67) {
				local12 = Static83.aClass1_Sub5_Sub1_3.method716();
				local21 = Static35.anInt1095 + (local12 >> 4 & 0x7);
				local27 = (local12 & 0x7) + Static43.anInt1458;
				local31 = Static83.aClass1_Sub5_Sub1_3.method715();
				local35 = Static83.aClass1_Sub5_Sub1_3.method716();
				local43 = local35 & 0x7;
				local39 = local35 >> 4 & 0xF;
				local111 = Static83.aClass1_Sub5_Sub1_3.method716();
				if (local21 >= 0 && local27 >= 0 && local21 < 104 && local27 < 104) {
					local276 = local39 + 1;
					if (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0] >= local21 - local276 && Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0] <= local21 + local276 && local27 - local276 <= Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0] && local276 + local27 >= Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0] && Static104.anInt2679 != 0 && local43 > 0 && Static111.anInt2901 < 50) {
						Static68.anIntArray62[Static111.anInt2901] = local31;
						Static43.anIntArray173[Static111.anInt2901] = local43;
						Static7.anIntArray36[Static111.anInt2901] = local111;
						Static55.aClass39Array1[Static111.anInt2901] = null;
						Static109.anIntArray394[Static111.anInt2901] = local39 + (local21 << 16) + (local27 << 8);
						Static111.anInt2901++;
					}
				}
			}
			if (Static96.anInt1794 == 63) {
				local12 = Static83.aClass1_Sub5_Sub1_3.method716();
				local27 = (local12 & 0x7) + Static43.anInt1458;
				local21 = (local12 >> 4 & 0x7) + Static35.anInt1095;
				local31 = Static83.aClass1_Sub5_Sub1_3.method713();
				local39 = local31 & 0x3;
				local35 = local31 >> 2;
				local43 = Static114.anIntArray411[local35];
				local111 = Static83.aClass1_Sub5_Sub1_3.method715();
				if (local21 >= 0 && local27 >= 0 && local21 < 103 && local27 < 103) {
					local276 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local21][local27];
					local284 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local21 + 1][local27];
					local294 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local21][local27 + 1];
					local290 = Static72.anIntArrayArrayArray5[Static79.anInt2137][local21 + 1][local27 + 1];
					if (local43 == 0) {
						@Pc(758) Class2 local758 = Static19.aClass65_1.method1716(Static79.anInt2137, local21, local27);
						if (local758 != null) {
							@Pc(767) int local767 = local758.anInt136 >> 14 & 0x7FFF;
							if (local35 == 2) {
								local758.aClass1_Sub1_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local767, 2, local39 + 4, local276, local284, local290, local294, local111, false, local758.aClass1_Sub1_Sub2_1);
								local758.aClass1_Sub1_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local767, 2, local39 + 1 & 0x3, local276, local284, local290, local294, local111, false, local758.aClass1_Sub1_Sub2_2);
							} else {
								local758.aClass1_Sub1_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local767, local35, local39, local276, local284, local290, local294, local111, false, local758.aClass1_Sub1_Sub2_1);
							}
						}
					}
					if (local43 == 1) {
						@Pc(836) Class25 local836 = Static19.aClass65_1.method1761(Static79.anInt2137, local21, local27);
						if (local836 != null) {
							local836.aClass1_Sub1_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local836.anInt1290 >> 14 & 0x7FFF, 4, 0, local276, local284, local290, local294, local111, false, local836.aClass1_Sub1_Sub2_6);
						}
					}
					if (local43 == 2) {
						if (local35 == 11) {
							local35 = 10;
						}
						@Pc(875) Class63 local875 = Static19.aClass65_1.method1740(Static79.anInt2137, local21, local27);
						if (local875 != null) {
							local875.aClass1_Sub1_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local875.anInt2582 >> 14 & 0x7FFF, local35, local39, local276, local284, local290, local294, local111, false, local875.aClass1_Sub1_Sub2_8);
						}
					}
					if (local43 == 3) {
						@Pc(907) Class32 local907 = Static19.aClass65_1.method1758(Static79.anInt2137, local21, local27);
						if (local907 != null) {
							local907.aClass1_Sub1_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local907.anInt1635 >> 14 & 0x7FFF, 22, local39, local276, local284, local290, local294, local111, false, local907.aClass1_Sub1_Sub2_7);
						}
					}
				}
			} else {
				@Pc(984) Class1_Sub1_Sub2_Sub3 local984;
				if (Static96.anInt1794 == 232) {
					local12 = Static83.aClass1_Sub5_Sub1_3.method678();
					local21 = Static83.aClass1_Sub5_Sub1_3.method718();
					local27 = Static35.anInt1095 + (local21 >> 4 & 0x7);
					local31 = (local21 & 0x7) + Static43.anInt1458;
					local35 = Static83.aClass1_Sub5_Sub1_3.method678();
					if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104) {
						local984 = new Class1_Sub1_Sub2_Sub3();
						local984.anInt1046 = local35;
						local984.anInt1041 = local12;
						if (Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local27][local31] == null) {
							Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local27][local31] = new Class45();
						}
						Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local27][local31].method1295(local984);
						Static104.method1776(local31, local27);
					}
				} else if (Static96.anInt1794 == 213) {
					local12 = Static83.aClass1_Sub5_Sub1_3.method716();
					local21 = Static35.anInt1095 + (local12 >> 4 & 0x7);
					local27 = (local12 & 0x7) + Static43.anInt1458;
					local31 = Static83.aClass1_Sub5_Sub1_3.method715();
					local35 = Static83.aClass1_Sub5_Sub1_3.method716();
					local39 = Static83.aClass1_Sub5_Sub1_3.method715();
					if (local21 >= 0 && local27 >= 0 && local21 < 104 && local27 < 104) {
						local21 = local21 * 128 + 64;
						local27 = local27 * 128 + 64;
						@Pc(1101) Class1_Sub1_Sub2_Sub5 local1101 = new Class1_Sub1_Sub2_Sub5(local31, Static79.anInt2137, local21, local27, Static48.method987(local27, local21, Static79.anInt2137) - local35, local39, Static7.anInt176);
						Static71.aClass45_5.method1295(local1101);
					}
				} else if (Static96.anInt1794 == 244) {
					local12 = Static83.aClass1_Sub5_Sub1_3.method713();
					local27 = (local12 & 0x7) + Static43.anInt1458;
					local21 = (local12 >> 4 & 0x7) + Static35.anInt1095;
					local31 = Static83.aClass1_Sub5_Sub1_3.method675();
					if (local21 >= 0 && local27 >= 0 && local21 < 104 && local27 < 104) {
						@Pc(1149) Class45 local1149 = Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local21][local27];
						if (local1149 != null) {
							for (local984 = (Class1_Sub1_Sub2_Sub3) local1149.method1299(); local984 != null; local984 = (Class1_Sub1_Sub2_Sub3) local1149.method1288()) {
								if (local984.anInt1041 == (local31 & 0x7FFF)) {
									local984.method1913();
									break;
								}
							}
							if (local1149.method1299() == null) {
								Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local21][local27] = null;
							}
							Static104.method1776(local27, local21);
						}
					}
				} else if (Static96.anInt1794 == 77) {
					local12 = Static83.aClass1_Sub5_Sub1_3.method716();
					local21 = Static35.anInt1095 + (local12 >> 4 & 0x7);
					local27 = Static43.anInt1458 + (local12 & 0x7);
					local31 = Static83.aClass1_Sub5_Sub1_3.method699() + local21;
					local35 = Static83.aClass1_Sub5_Sub1_3.method699() + local27;
					local39 = Static83.aClass1_Sub5_Sub1_3.method691();
					local43 = Static83.aClass1_Sub5_Sub1_3.method715();
					local111 = Static83.aClass1_Sub5_Sub1_3.method716() * 4;
					local276 = Static83.aClass1_Sub5_Sub1_3.method716() * 4;
					local284 = Static83.aClass1_Sub5_Sub1_3.method715();
					local290 = Static83.aClass1_Sub5_Sub1_3.method715();
					local294 = Static83.aClass1_Sub5_Sub1_3.method716();
					local298 = Static83.aClass1_Sub5_Sub1_3.method716();
					if (local21 >= 0 && local27 >= 0 && local21 < 104 && local27 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local43 != 65535) {
						local21 = local21 * 128 + 64;
						local35 = local35 * 128 + 64;
						local31 = local31 * 128 + 64;
						local27 = local27 * 128 + 64;
						@Pc(1349) Class1_Sub1_Sub2_Sub4 local1349 = new Class1_Sub1_Sub2_Sub4(local43, Static79.anInt2137, local21, local27, Static48.method987(local27, local21, Static79.anInt2137) - local111, local284 + Static7.anInt176, Static7.anInt176 + local290, local294, local298, local39, local276);
						local1349.method978(local35, local31, Static7.anInt176 + local284, Static48.method987(local35, local31, Static79.anInt2137) + -local276);
						Static20.aClass45_1.method1295(local1349);
					}
				} else if (Static96.anInt1794 == 159) {
					local12 = Static83.aClass1_Sub5_Sub1_3.method678();
					local21 = Static83.aClass1_Sub5_Sub1_3.method675();
					local27 = Static83.aClass1_Sub5_Sub1_3.method678();
					local31 = Static83.aClass1_Sub5_Sub1_3.method676();
					local35 = (local31 >> 4 & 0x7) + Static35.anInt1095;
					local39 = (local31 & 0x7) + Static43.anInt1458;
					if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && Static84.anInt2353 != local21) {
						@Pc(1422) Class1_Sub1_Sub2_Sub3 local1422 = new Class1_Sub1_Sub2_Sub3();
						local1422.anInt1046 = local27;
						local1422.anInt1041 = local12;
						if (Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local35][local39] == null) {
							Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local35][local39] = new Class45();
						}
						Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local35][local39].method1295(local1422);
						Static104.method1776(local39, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public static void method1854() {
		for (@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) Static114.aClass45_10.method1299(); local8 != null; local8 = (Class1_Sub12) Static114.aClass45_10.method1288()) {
			if (local8.aClass1_Sub4_Sub2_2 != null) {
				Static15.aClass1_Sub4_Sub1_1.method370(local8.aClass1_Sub4_Sub2_2);
				local8.aClass1_Sub4_Sub2_2 = null;
			}
			if (local8.aClass1_Sub4_Sub2_1 != null) {
				Static15.aClass1_Sub4_Sub1_1.method370(local8.aClass1_Sub4_Sub2_1);
				local8.aClass1_Sub4_Sub2_1 = null;
			}
		}
		Static114.aClass45_10.method1291();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1856() {
		aClass23_1682 = null;
		anIntArray393 = null;
		aClass5_62 = null;
		aClass23_1673 = null;
		aClass23_1678 = null;
		aClass23_1672 = null;
		aClass23_1680 = null;
		aClass23_1676 = null;
		aClass23_1677 = null;
		aClass23_1674 = null;
		aLongArray37 = null;
		aClass23_1681 = null;
		aClass23_1675 = null;
		aClass23_1679 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZI)I")
	public static int method1857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}
