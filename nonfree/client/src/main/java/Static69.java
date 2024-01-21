import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_746 = Static88.method1421("runes");

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!va;")
	public static Class61 aClass61_747 = Static88.method1421("mapdots");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!va;")
	public static Class61 aClass61_748 = Static88.method1421("(X");

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!va;")
	public static Class61 aClass61_749 = Static88.method1421(" (X");

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!va;")
	public static Class61 aClass61_750 = Static88.method1421("b12_full");

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static int anInt1817 = 0;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "[I")
	public static int[] anIntArray206 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	public static int anInt1818 = 2;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_751 = Static88.method1421("@gr1@");

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!va;")
	public static Class61 aClass61_752 = Static88.method1421("mapedge");

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Z")
	public static boolean method1010() {
		@Pc(7) long local7 = System.currentTimeMillis();
		@Pc(13) int local13 = (int) (local7 - Static27.aLong25);
		Static27.aLong25 = local7;
		if (local13 > 200) {
			local13 = 200;
		}
		Static25.anInt779 += local13;
		if (Static40.anInt1085 == 0 && Static102.anInt2598 == 0 && Static16.anInt524 == 0 && Static81.anInt2196 == 0) {
			return true;
		} else if (Static79.aClass27_3 == null) {
			return false;
		} else {
			try {
				if (Static25.anInt779 > 30000) {
					throw new IOException();
				}
				@Pc(56) Class10_Sub1_Sub9 local56;
				@Pc(61) Class10_Sub10 local61;
				while (Static102.anInt2598 < 20 && Static81.anInt2196 > 0) {
					local56 = (Class10_Sub1_Sub9) Static19.aClass50_3.method1251();
					local61 = new Class10_Sub10(4);
					local61.method1126(1);
					local61.method1159((int) local56.aLong81);
					Static79.aClass27_3.method613(local61.aByteArray9, 4);
					Static48.aClass50_7.method1252(local56, local56.aLong81);
					Static102.anInt2598++;
					Static81.anInt2196--;
				}
				while (Static40.anInt1085 < 20 && Static16.anInt524 > 0) {
					local56 = (Class10_Sub1_Sub9) Static94.aClass40_2.method896();
					local61 = new Class10_Sub10(4);
					local61.method1126(0);
					local61.method1159((int) local56.aLong81);
					Static79.aClass27_3.method613(local61.aByteArray9, 4);
					local56.method1655();
					Static9.aClass50_1.method1252(local56, local56.aLong81);
					Static16.anInt524--;
					Static40.anInt1085++;
				}
				for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
					@Pc(168) int local168 = Static79.aClass27_3.method608();
					if (local168 < 0) {
						throw new IOException();
					}
					if (local168 == 0) {
						break;
					}
					@Pc(181) byte local181 = 0;
					if (Static23.aClass10_Sub1_Sub9_1 == null) {
						local181 = 8;
					} else if (Static17.anInt559 == 0) {
						local181 = 1;
					}
					Static25.anInt779 = 0;
					@Pc(203) int local203;
					@Pc(227) int local227;
					@Pc(277) int local277;
					@Pc(292) int local292;
					if (local181 > 0) {
						local203 = local181 - Static21.aClass10_Sub10_2.anInt1957;
						if (local168 < local203) {
							local203 = local168;
						}
						Static79.aClass27_3.method609(local203, Static21.aClass10_Sub10_2.aByteArray9, Static21.aClass10_Sub10_2.anInt1957);
						if (Static25.aByte1 != 0) {
							for (local227 = 0; local227 < local203; local227++) {
								Static21.aClass10_Sub10_2.aByteArray9[Static21.aClass10_Sub10_2.anInt1957 + local227] ^= Static25.aByte1;
							}
						}
						Static21.aClass10_Sub10_2.anInt1957 += local203;
						if (Static21.aClass10_Sub10_2.anInt1957 < local181) {
							break;
						}
						if (Static23.aClass10_Sub1_Sub9_1 == null) {
							Static21.aClass10_Sub10_2.anInt1957 = 0;
							local227 = Static21.aClass10_Sub10_2.method1111();
							local277 = Static21.aClass10_Sub10_2.method1160();
							@Pc(284) long local284 = (long) (local277 + (local227 << 16));
							@Pc(288) int local288 = Static21.aClass10_Sub10_2.method1111();
							local292 = Static21.aClass10_Sub10_2.method1112();
							@Pc(298) Class10_Sub1_Sub9 local298 = (Class10_Sub1_Sub9) Static48.aClass50_7.method1250(local284);
							Static25.aBoolean37 = true;
							if (local298 == null) {
								local298 = (Class10_Sub1_Sub9) Static9.aClass50_1.method1250(local284);
								Static25.aBoolean37 = false;
							}
							if (local298 == null) {
								throw new IOException();
							}
							Static23.aClass10_Sub1_Sub9_1 = local298;
							@Pc(327) int local327 = local288 == 0 ? 5 : 9;
							Static64.aClass10_Sub10_5 = new Class10_Sub10(local292 + local327 + Static23.aClass10_Sub1_Sub9_1.aByte2);
							Static64.aClass10_Sub10_5.method1126(local288);
							Static64.aClass10_Sub10_5.method1157(local292);
							Static17.anInt559 = 8;
							Static21.aClass10_Sub10_2.anInt1957 = 0;
						} else if (Static17.anInt559 == 0) {
							if (Static21.aClass10_Sub10_2.aByteArray9[0] == -1) {
								Static21.aClass10_Sub10_2.anInt1957 = 0;
								Static17.anInt559 = 1;
							} else {
								Static23.aClass10_Sub1_Sub9_1 = null;
							}
						}
					} else {
						local203 = Static64.aClass10_Sub10_5.aByteArray9.length - Static23.aClass10_Sub1_Sub9_1.aByte2;
						local227 = 512 - Static17.anInt559;
						if (local203 - Static64.aClass10_Sub10_5.anInt1957 < local227) {
							local227 = local203 - Static64.aClass10_Sub10_5.anInt1957;
						}
						if (local168 < local227) {
							local227 = local168;
						}
						Static79.aClass27_3.method609(local227, Static64.aClass10_Sub10_5.aByteArray9, Static64.aClass10_Sub10_5.anInt1957);
						if (Static25.aByte1 != 0) {
							for (local277 = 0; local277 < local227; local277++) {
								Static64.aClass10_Sub10_5.aByteArray9[Static64.aClass10_Sub10_5.anInt1957 + local277] ^= Static25.aByte1;
							}
						}
						Static17.anInt559 += local227;
						Static64.aClass10_Sub10_5.anInt1957 += local227;
						if (local203 == Static64.aClass10_Sub10_5.anInt1957) {
							if (Static23.aClass10_Sub1_Sub9_1.aLong81 == 16711935L) {
								Static49.aClass10_Sub10_3 = Static64.aClass10_Sub10_5;
								for (local277 = 0; local277 < 256; local277++) {
									@Pc(481) Class11_Sub1 local481 = Static5.aClass11_Sub1Array1[local277];
									if (local481 != null) {
										Static49.aClass10_Sub10_3.anInt1957 = local277 * 4 + 5;
										local292 = Static49.aClass10_Sub10_3.method1112();
										local481.method235(local292);
									}
								}
							} else {
								Static62.aCRC32_2.reset();
								Static62.aCRC32_2.update(Static64.aClass10_Sub10_5.aByteArray9, 0, local203);
								local277 = (int) Static62.aCRC32_2.getValue();
								if (local277 != Static23.aClass10_Sub1_Sub9_1.anInt1336) {
									try {
										Static79.aClass27_3.method610();
									} catch (@Pc(525) Exception local525) {
									}
									Static25.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static79.aClass27_3 = null;
									Static64.anInt1731++;
									return false;
								}
								Static64.anInt1731 = 0;
								Static48.anInt1337 = 0;
								Static23.aClass10_Sub1_Sub9_1.aClass11_Sub1_8.method239(Static64.aClass10_Sub10_5.aByteArray9, (int) (Static23.aClass10_Sub1_Sub9_1.aLong81 & 0xFFFFL), (Static23.aClass10_Sub1_Sub9_1.aLong81 & 0xFF0000L) == 16711680L, Static25.aBoolean37);
							}
							Static23.aClass10_Sub1_Sub9_1.method1654();
							Static23.aClass10_Sub1_Sub9_1 = null;
							Static17.anInt559 = 0;
							if (Static25.aBoolean37) {
								Static102.anInt2598--;
							} else {
								Static40.anInt1085--;
							}
							Static64.aClass10_Sub10_5 = null;
						} else {
							if (Static17.anInt559 != 512) {
								break;
							}
							Static17.anInt559 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(608) IOException local608) {
				try {
					Static79.aClass27_3.method610();
				} catch (@Pc(613) Exception local613) {
				}
				Static79.aClass27_3 = null;
				Static48.anInt1337++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public static void method1011() {
		Static54.aClass29_39.method646();
		Static30.aClass29_25.method646();
		Static20.aClass29_75.method646();
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method1012() {
		for (@Pc(6) Class10_Sub3 local6 = (Class10_Sub3) Static56.aClass9_6.method72(); local6 != null; local6 = (Class10_Sub3) Static56.aClass9_6.method81()) {
			if (local6.anInt725 > 0) {
				local6.anInt725--;
			}
			if (local6.anInt725 != 0) {
				if (local6.anInt729 > 0) {
					local6.anInt729--;
				}
				if (local6.anInt729 == 0 && local6.anInt728 >= 1 && local6.anInt731 >= 1 && local6.anInt728 <= 102 && local6.anInt731 <= 102 && (local6.anInt736 < 0 || Static55.method812(local6.anInt736, local6.anInt741))) {
					Static23.method478(local6.anInt736, local6.anInt728, local6.anInt741, local6.anInt723, local6.anInt742, local6.anInt726, local6.anInt731);
					local6.anInt729 = -1;
					if (local6.anInt736 == local6.anInt738 && local6.anInt738 == -1) {
						local6.method1654();
					} else if (local6.anInt736 == local6.anInt738 && local6.anInt737 == local6.anInt742 && local6.anInt739 == local6.anInt741) {
						local6.method1654();
					}
				}
			} else if (local6.anInt738 < 0 || Static55.method812(local6.anInt738, local6.anInt739)) {
				Static23.method478(local6.anInt738, local6.anInt728, local6.anInt739, local6.anInt723, local6.anInt737, local6.anInt726, local6.anInt731);
				local6.method1654();
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	public static void method1013() {
		Static25.aBoolean36 = true;
		Static93.method1153();
		if (Static32.aBoolean44) {
			Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static15.aClass61_151, 239, 40, 0);
			Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static93.method1156(new Class61[] { Static15.aClass61_154, Static22.aClass61_286 }), 239, 60, 128);
		} else if (Static1.anInt6 == 1) {
			Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static47.aClass61_542, 239, 40, 0);
			Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static93.method1156(new Class61[] { Static15.aClass61_132, Static22.aClass61_286 }), 239, 60, 128);
		} else if (Static1.anInt6 == 2) {
			Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static15.aClass61_125, 239, 40, 0);
			Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static93.method1156(new Class61[] { Static15.aClass61_132, Static22.aClass61_286 }), 239, 60, 128);
		} else {
			@Pc(82) Class10_Sub1_Sub1_Sub4 local82;
			@Pc(89) int local89;
			@Pc(99) int local99;
			if (Static1.anInt6 == 3) {
				if (Static15.aClass61_132 != Static15.aClass61_156) {
					Static16.method382(Static15.aClass61_132);
					Static15.aClass61_156 = Static15.aClass61_132;
				}
				local82 = Static99.aClass10_Sub1_Sub1_Sub4_4;
				Static45.method1530(0, 0, 463, 77);
				for (local89 = 0; local89 < Static56.anInt1501; local89++) {
					local99 = local89 * 14 + 18 - Static50.anInt1407;
					if (local99 > 0 && local99 < 110) {
						local82.method1544(Static79.aClass61Array11[local89], 239, local99, 0);
					}
				}
				Static45.method1532();
				if (Static56.anInt1501 > 5) {
					Static51.method788(0, Static56.anInt1501 * 14 + 7, 77, Static50.anInt1407, 463);
				}
				if (Static15.aClass61_132.method1596() == 0) {
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static21.aClass61_260, 239, 40, 255);
				} else if (Static56.anInt1501 == 0) {
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static37.aClass61_427, 239, 40, 0);
				}
				local82.method1544(Static93.method1156(new Class61[] { Static15.aClass61_132, Static22.aClass61_286 }), 239, 90, 0);
				Static45.method1527(0, 77, 479, 0);
			} else if (Static54.aClass61_611 == null) {
				@Pc(215) boolean local215;
				if (Static74.anInt1871 != -1) {
					local215 = Static38.method636(0, 479, -1, 2, 0, Static74.anInt1871, 96, 0);
					if (!local215) {
						Static7.aBoolean1 = true;
					}
				} else if (Static98.anInt2479 == -1) {
					local82 = Static99.aClass10_Sub1_Sub1_Sub4_4;
					local89 = 0;
					Static45.method1530(0, 0, 463, 77);
					for (local99 = 0; local99 < 100; local99++) {
						if (Static39.aClass61Array2[local99] != null) {
							@Pc(263) int local263 = Static51.anIntArray154[local99];
							@Pc(267) Class61 local267 = Static48.aClass61Array8[local99];
							@Pc(276) int local276 = Static27.anInt887 + 70 - local89 * 14;
							@Pc(278) byte local278 = 0;
							if (local267 != null && local267.method1602(Static104.aClass61_1058)) {
								local278 = 1;
								local267 = local267.method1619(5);
							}
							if (local267 != null && local267.method1602(Static44.aClass61_515)) {
								local278 = 2;
								local267 = local267.method1619(5);
							}
							if (local263 == 0) {
								if (local276 > 0 && local276 < 110) {
									local82.method1548(Static39.aClass61Array2[local99], 4, local276, 0);
								}
								local89++;
							}
							@Pc(361) int local361;
							if ((local263 == 1 || local263 == 2) && (local263 == 1 || Static53.anInt1449 == 0 || Static53.anInt1449 == 1 && Static94.method1495(local267))) {
								if (local276 > 0 && local276 < 110) {
									local361 = 4;
									if (local278 == 1) {
										Static25.aClass10_Sub1_Sub1_Sub2Array1[0].method873(4, local276 - 12);
										local361 += 14;
									}
									if (local278 == 2) {
										Static25.aClass10_Sub1_Sub1_Sub2Array1[1].method873(local361, local276 - 12);
										local361 += 14;
									}
									local82.method1548(Static93.method1156(new Class61[] { local267, Static26.aClass61_698 }), local361, local276, 0);
									local361 += local82.method1549(local267) + 8;
									local82.method1548(Static39.aClass61Array2[local99], local361, local276, 255);
								}
								local89++;
							}
							if ((local263 == 3 || local263 == 7) && Static57.anInt1519 == 0 && (local263 == 7 || Static17.anInt584 == 0 || Static17.anInt584 == 1 && Static94.method1495(local267))) {
								local89++;
								if (local276 > 0 && local276 < 110) {
									local82.method1548(Static51.aClass61_589, 4, local276, 0);
									local361 = local82.method1549(Static51.aClass61_589) + 4;
									local361 += local82.method1552(32);
									if (local278 == 1) {
										Static25.aClass10_Sub1_Sub1_Sub2Array1[0].method873(local361, local276 - 12);
										local361 += 14;
									}
									if (local278 == 2) {
										Static25.aClass10_Sub1_Sub1_Sub2Array1[1].method873(local361, local276 - 12);
										local361 += 14;
									}
									local82.method1548(Static93.method1156(new Class61[] { local267, Static26.aClass61_698 }), local361, local276, 0);
									local361 += local82.method1549(local267) + 8;
									local82.method1548(Static39.aClass61Array2[local99], local361, local276, 8388608);
								}
							}
							if (local263 == 4 && (Static4.anInt25 == 0 || Static4.anInt25 == 1 && Static94.method1495(local267))) {
								local89++;
								if (local276 > 0 && local276 < 110) {
									local82.method1548(Static93.method1156(new Class61[] { local267, Static24.aClass61_925, Static39.aClass61Array2[local99] }), 4, local276, 8388736);
								}
							}
							if (local263 == 5 && Static57.anInt1519 == 0 && Static17.anInt584 < 2) {
								if (local276 > 0 && local276 < 110) {
									local82.method1548(Static39.aClass61Array2[local99], 4, local276, 8388608);
								}
								local89++;
							}
							if (local263 == 6 && Static57.anInt1519 == 0 && Static17.anInt584 < 2) {
								local89++;
								if (local276 > 0 && local276 < 110) {
									local82.method1548(Static93.method1156(new Class61[] { Static93.aClass61_809, Static24.aClass61_925, local267, Static26.aClass61_698 }), 4, local276, 0);
									local82.method1548(Static39.aClass61Array2[local99], local82.method1549(Static93.method1156(new Class61[] { Static93.aClass61_809, Static24.aClass61_925, local267 })) + 12, local276, 8388608);
								}
							}
							if (local263 == 8 && (Static4.anInt25 == 0 || Static4.anInt25 == 1 && Static94.method1495(local267))) {
								if (local276 > 0 && local276 < 110) {
									local82.method1548(Static93.method1156(new Class61[] { local267, Static24.aClass61_925, Static39.aClass61Array2[local99] }), 4, local276, 8270336);
								}
								local89++;
							}
						}
					}
					Static45.method1532();
					Static41.anInt1194 = local89 * 14 + 7;
					if (Static41.anInt1194 < 78) {
						Static41.anInt1194 = 78;
					}
					Static51.method788(0, Static41.anInt1194, 77, Static41.anInt1194 - Static27.anInt887 - 77, 463);
					@Pc(767) Class61 local767;
					if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1 == null || Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass61_699 == null) {
						local767 = Static15.aClass61_127;
					} else {
						local767 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass61_699;
					}
					local82.method1548(Static93.method1156(new Class61[] { local767, Static26.aClass61_698 }), 4, 90, 0);
					local82.method1548(Static93.method1156(new Class61[] { Static15.aClass61_163, Static22.aClass61_286 }), local82.method1549(Static93.method1156(new Class61[] { local767, Static79.aClass61_855 })) + 6, 90, 255);
					Static45.method1527(0, 77, 479, 0);
				} else {
					local215 = Static38.method636(0, 479, -1, 3, 0, Static98.anInt2479, 96, 0);
					if (!local215) {
						Static7.aBoolean1 = true;
					}
				}
			} else {
				Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static54.aClass61_611, 239, 40, 0);
				Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(Static74.aClass61_783, 239, 60, 128);
			}
		}
		if (Static82.aBoolean97 && Static10.anInt311 == 2) {
			Static82.method1284();
		}
		Static37.method619();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
	public static int method1014(@OriginalArg(1) int arg0) {
		@Pc(12) Class10_Sub1_Sub11 local12 = Static40.method647(arg0);
		@Pc(15) int local15 = local12.anInt1743;
		@Pc(18) int local18 = local12.anInt1741;
		@Pc(21) int local21 = local12.anInt1735;
		@Pc(28) int local28 = Class64.anIntArray340[local18 - local15];
		return local28 & Static74.anIntArray228[local21] >> local15;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public static void method1015() {
		aClass61_747 = null;
		aClass61_752 = null;
		aClass61_748 = null;
		aClass61_751 = null;
		aClass61_750 = null;
		aClass61_749 = null;
		aClass61_746 = null;
		anIntArray206 = null;
	}
}
