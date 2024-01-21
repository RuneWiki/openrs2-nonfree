import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "[Lclient!hh;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	public static int anInt580 = 0;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_166 = Static151.method2243("hint_mapmarkers");

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	public static int anInt581 = 0;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_168 = Static151.method2243("glow3:");

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_167 = aClass62_168;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_169 = Static151.method2243("Please wait)3)3)3");

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!q;")
	public static final Class79 aClass79_1 = new Class79(30);

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "[B")
	public static final byte[] aByteArray4 = new byte[520];

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!mb;")
	public static Class62 aClass62_170 = aClass62_168;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!mb;")
	public static Class62 aClass62_171 = aClass62_169;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_172 = Static151.method2243("purple:");

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Lclient!mb;")
	public static Class62 aClass62_173 = aClass62_172;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_174 = aClass62_172;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_175 = Static151.method2243("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method444() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(64) int local64;
		if (Static158.anInt3381 == 179) {
			local12 = Static108.aClass2_Sub11_Sub1_3.method1534();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static28.anIntArray61[local16];
			local28 = Static108.aClass2_Sub11_Sub1_3.method1548();
			@Pc(32) byte local32 = Static108.aClass2_Sub11_Sub1_3.method1552();
			local36 = Static108.aClass2_Sub11_Sub1_3.method1562();
			@Pc(40) byte local40 = Static108.aClass2_Sub11_Sub1_3.method1552();
			@Pc(44) byte local44 = Static108.aClass2_Sub11_Sub1_3.method1552();
			@Pc(48) byte local48 = Static108.aClass2_Sub11_Sub1_3.method1552();
			local52 = Static108.aClass2_Sub11_Sub1_3.method1557();
			local56 = Static108.aClass2_Sub11_Sub1_3.method1581();
			local64 = Static18.anInt448 + (local56 >> 4 & 0x7);
			@Pc(70) int local70 = Static67.anInt1408 + (local56 & 0x7);
			@Pc(74) int local74 = Static108.aClass2_Sub11_Sub1_3.method1562();
			@Pc(85) Class7_Sub2_Sub2 local85;
			if (local74 == Static59.anInt1225) {
				local85 = Static186.aClass7_Sub2_Sub2_1;
			} else {
				local85 = Static62.aClass7_Sub2_Sub2Array1[local74];
			}
			if (local85 != null) {
				@Pc(95) Class2_Sub1_Sub11 local95 = Static60.method844(local36);
				@Pc(107) int local107;
				@Pc(104) int local104;
				if (local20 == 1 || local20 == 3) {
					local107 = local95.anInt1559;
					local104 = local95.anInt1556;
				} else {
					local104 = local95.anInt1559;
					local107 = local95.anInt1556;
				}
				@Pc(123) int local123 = (local107 + 1 >> 1) + local64;
				@Pc(129) int local129 = (local107 >> 1) + local64;
				@Pc(133) int[][] local133 = Static171.anIntArrayArrayArray7[Static126.anInt2806];
				@Pc(139) int local139 = (local104 >> 1) + local70;
				@Pc(147) int local147 = (local104 + 1 >> 1) + local70;
				@Pc(173) int local173 = local133[local129][local139] + local133[local123][local139] + local133[local129][local147] + local133[local123][local147] >> 2;
				@Pc(181) int local181 = (local70 << 7) + (local104 << 6);
				@Pc(189) int local189 = (local107 << 6) + (local64 << 7);
				@Pc(200) Class2_Sub1_Sub10 local200 = local95.method1070(local181, local20, local16, local189, false, local173, local133);
				if (local200 != null) {
					@Pc(211) byte local211;
					if (local44 > local32) {
						local211 = local44;
						local44 = local32;
						local32 = local211;
					}
					Static137.method2051(local28 + 1, 0, Static126.anInt2806, -1, local70, local24, 0, local52 + 1, local64);
					local85.anInt3101 = local173;
					local85.anInt3120 = local28 + anInt581;
					local85.anInt3118 = local70 * 128 + local104 * 64;
					local85.anInt3108 = local107 * 64 + local64 * 128;
					if (local48 < local40) {
						local211 = local40;
						local40 = local48;
						local48 = local211;
					}
					local85.anInt3112 = local40 + local70;
					local85.anInt3106 = local64 + local44;
					local85.aClass7_Sub7_1 = (Class7_Sub7) local200.aClass7_6;
					local85.anInt3107 = local32 + local64;
					local85.anInt3113 = local48 + local70;
					local85.anInt3122 = local52 + anInt581;
				}
			}
		}
		@Pc(335) int local335;
		if (Static158.anInt3381 == 148) {
			local12 = Static108.aClass2_Sub11_Sub1_3.method1534();
			local16 = (local12 >> 4 & 0x7) + Static18.anInt448;
			local20 = Static67.anInt1408 + (local12 & 0x7);
			local24 = Static108.aClass2_Sub11_Sub1_3.method1571();
			local28 = Static108.aClass2_Sub11_Sub1_3.method1557();
			local335 = Static108.aClass2_Sub11_Sub1_3.method1571();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && Static59.anInt1225 != local335) {
				@Pc(352) Class7_Sub6 local352 = new Class7_Sub6();
				local352.anInt3711 = local28;
				local352.anInt3706 = local24;
				if (Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local16][local20] == null) {
					Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local16][local20] = new Class13();
				}
				Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local16][local20].method304(new Class2_Sub1_Sub6(local352));
				Static143.method2155(local20, local16);
			}
			return;
		}
		@Pc(435) int local435;
		if (Static158.anInt3381 == 62) {
			local12 = Static108.aClass2_Sub11_Sub1_3.method1550();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static28.anIntArray61[local16];
			local28 = Static108.aClass2_Sub11_Sub1_3.method1529();
			local36 = Static67.anInt1408 + (local28 & 0x7);
			local335 = (local28 >> 4 & 0x7) + Static18.anInt448;
			local435 = Static108.aClass2_Sub11_Sub1_3.method1571();
			if (local335 >= 0 && local36 >= 0 && local335 < 104 && local36 < 104) {
				Static137.method2051(-1, local16, Static126.anInt2806, local435, local36, local24, local20, 0, local335);
			}
		} else if (Static158.anInt3381 == 188) {
			local12 = Static108.aClass2_Sub11_Sub1_3.method1534();
			local16 = Static18.anInt448 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static67.anInt1408;
			local24 = Static108.aClass2_Sub11_Sub1_3.method1557();
			local28 = Static108.aClass2_Sub11_Sub1_3.method1557();
			local335 = Static108.aClass2_Sub11_Sub1_3.method1557();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				@Pc(526) Class13 local526 = Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local16][local20];
				if (local526 != null) {
					for (@Pc(533) Class2_Sub1_Sub6 local533 = (Class2_Sub1_Sub6) local526.method303(); local533 != null; local533 = (Class2_Sub1_Sub6) local526.method309()) {
						@Pc(538) Class7_Sub6 local538 = local533.aClass7_Sub6_1;
						if (local538.anInt3706 == (local24 & 0x7FFF) && local28 == local538.anInt3711) {
							local538.anInt3711 = local335;
							break;
						}
					}
					Static143.method2155(local20, local16);
				}
			}
		} else {
			@Pc(656) int local656;
			if (Static158.anInt3381 == 166) {
				local12 = Static108.aClass2_Sub11_Sub1_3.method1534();
				local20 = (local12 & 0x7) + Static67.anInt1408;
				local16 = (local12 >> 4 & 0x7) + Static18.anInt448;
				local24 = Static108.aClass2_Sub11_Sub1_3.method1548();
				if (local24 == 65535) {
					local24 = -1;
				}
				local28 = Static108.aClass2_Sub11_Sub1_3.method1529();
				local36 = local28 & 0x3;
				local335 = local28 >> 2;
				local435 = Static28.anIntArray61[local335];
				if (local16 >= 0 && local20 >= 0 && local16 < 103 && local20 < 103) {
					if (local435 == 0) {
						@Pc(646) Class85 local646 = Static142.method2153(Static126.anInt2806, local16, local20);
						if (local646 != null) {
							local656 = Integer.MAX_VALUE & (int) (local646.aLong114 >>> 32);
							if (local335 == 2) {
								local646.aClass7_8 = new Class7_Sub5(local656, 2, local36 + 4, Static126.anInt2806, local16, local20, local24, false, local646.aClass7_8);
								local646.aClass7_9 = new Class7_Sub5(local656, 2, local36 + 1 & 0x3, Static126.anInt2806, local16, local20, local24, false, local646.aClass7_9);
							} else {
								local646.aClass7_8 = new Class7_Sub5(local656, local335, local36, Static126.anInt2806, local16, local20, local24, false, local646.aClass7_8);
							}
						}
					}
					if (local435 == 1) {
						@Pc(722) Class100 local722 = Static17.method337(Static126.anInt2806, local16, local20);
						if (local722 != null) {
							local656 = Integer.MAX_VALUE & (int) (local722.aLong135 >>> 32);
							if (local335 == 4 || local335 == 5) {
								local722.aClass7_11 = new Class7_Sub5(local656, 4, local36, Static126.anInt2806, local16, local20, local24, false, local722.aClass7_11);
							} else if (local335 == 6) {
								local722.aClass7_11 = new Class7_Sub5(local656, 4, local36 + 4, Static126.anInt2806, local16, local20, local24, false, local722.aClass7_11);
							} else if (local335 == 7) {
								local722.aClass7_11 = new Class7_Sub5(local656, 4, (local36 + 2 & 0x3) + 4, Static126.anInt2806, local16, local20, local24, false, local722.aClass7_11);
							} else if (local335 == 8) {
								local722.aClass7_11 = new Class7_Sub5(local656, 4, local36 + 4, Static126.anInt2806, local16, local20, local24, false, local722.aClass7_11);
								local722.aClass7_10 = new Class7_Sub5(local656, 4, (local36 + 2 & 0x3) + 4, Static126.anInt2806, local16, local20, local24, false, local722.aClass7_10);
							}
						}
					}
					if (local435 == 2) {
						if (local335 == 11) {
							local335 = 10;
						}
						@Pc(859) Class39 local859 = Static16.method300(Static126.anInt2806, local16, local20);
						if (local859 != null) {
							local859.aClass7_5 = new Class7_Sub5((int) (local859.aLong54 >>> 32) & Integer.MAX_VALUE, local335, local36, Static126.anInt2806, local16, local20, local24, false, local859.aClass7_5);
						}
					}
					if (local435 == 3) {
						@Pc(890) Class10 local890 = Static78.method1103(Static126.anInt2806, local16, local20);
						if (local890 != null) {
							local890.aClass7_1 = new Class7_Sub5((int) (local890.aLong23 >>> 32) & Integer.MAX_VALUE, 22, local36, Static126.anInt2806, local16, local20, local24, false, local890.aClass7_1);
						}
					}
				}
			} else {
				@Pc(987) int local987;
				if (Static158.anInt3381 == 133) {
					local12 = Static108.aClass2_Sub11_Sub1_3.method1534();
					local16 = Static18.anInt448 + (local12 >> 4 & 0x7);
					local20 = Static67.anInt1408 + (local12 & 0x7);
					local24 = Static108.aClass2_Sub11_Sub1_3.method1557();
					if (local24 == 65535) {
						local24 = -1;
					}
					local28 = Static108.aClass2_Sub11_Sub1_3.method1534();
					local335 = local28 >> 4 & 0xF;
					local36 = local28 & 0x7;
					local435 = Static108.aClass2_Sub11_Sub1_3.method1534();
					if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
						local987 = local335 + 1;
						if (local16 - local987 <= Static186.aClass7_Sub2_Sub2_1.anIntArray275[0] && local16 + local987 >= Static186.aClass7_Sub2_Sub2_1.anIntArray275[0] && local20 - local987 <= Static186.aClass7_Sub2_Sub2_1.anIntArray274[0] && Static186.aClass7_Sub2_Sub2_1.anIntArray274[0] <= local20 + local987 && Static81.anInt4473 != 0 && local36 > 0 && Static83.anInt1739 < 50 && local24 != -1) {
							Static53.anIntArray85[Static83.anInt1739] = local24;
							Static56.anIntArray89[Static83.anInt1739] = local36;
							Static108.anIntArray221[Static83.anInt1739] = local435;
							Static125.aClass27Array1[Static83.anInt1739] = null;
							Static111.anIntArray225[Static83.anInt1739] = (local20 << 8) + (local16 << 16) + local335;
							Static83.anInt1739++;
						}
					}
				}
				if (Static158.anInt3381 == 73) {
					local12 = Static108.aClass2_Sub11_Sub1_3.method1534();
					local16 = (local12 >> 4 & 0x7) + Static18.anInt448;
					local20 = Static67.anInt1408 + (local12 & 0x7);
					local24 = local16 + Static108.aClass2_Sub11_Sub1_3.method1552();
					local28 = Static108.aClass2_Sub11_Sub1_3.method1552() + local20;
					local335 = Static108.aClass2_Sub11_Sub1_3.method1568();
					local36 = Static108.aClass2_Sub11_Sub1_3.method1557();
					local435 = Static108.aClass2_Sub11_Sub1_3.method1534() * 4;
					local987 = Static108.aClass2_Sub11_Sub1_3.method1534() * 4;
					local656 = Static108.aClass2_Sub11_Sub1_3.method1557();
					local52 = Static108.aClass2_Sub11_Sub1_3.method1557();
					local56 = Static108.aClass2_Sub11_Sub1_3.method1534();
					local64 = Static108.aClass2_Sub11_Sub1_3.method1534();
					if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104 && local36 != 65535) {
						local28 = local28 * 128 + 64;
						local24 = local24 * 128 + 64;
						local16 = local16 * 128 + 64;
						local20 = local20 * 128 + 64;
						@Pc(1245) Class7_Sub1 local1245 = new Class7_Sub1(local36, Static126.anInt2806, local16, local20, Static175.method2548(local20, Static126.anInt2806, local16) - local435, local656 + anInt581, anInt581 + local52, local56, local64, local335, local987);
						local1245.method171(local24, local656 + anInt581, -local987 + Static175.method2548(local28, Static126.anInt2806, local24), local28);
						Static179.aClass13_13.method304(new Class2_Sub1_Sub17(local1245));
					}
				} else if (Static158.anInt3381 == 155) {
					local12 = Static108.aClass2_Sub11_Sub1_3.method1571();
					local16 = Static108.aClass2_Sub11_Sub1_3.method1550();
					local20 = Static18.anInt448 + (local16 >> 4 & 0x7);
					local24 = Static67.anInt1408 + (local16 & 0x7);
					if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
						@Pc(1318) Class13 local1318 = Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local20][local24];
						if (local1318 != null) {
							for (@Pc(1325) Class2_Sub1_Sub6 local1325 = (Class2_Sub1_Sub6) local1318.method303(); local1325 != null; local1325 = (Class2_Sub1_Sub6) local1318.method309()) {
								if (local1325.aClass7_Sub6_1.anInt3706 == (local12 & 0x7FFF)) {
									local1325.method3183();
									break;
								}
							}
							if (local1318.method303() == null) {
								Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local20][local24] = null;
							}
							Static143.method2155(local24, local20);
						}
					}
				} else if (Static158.anInt3381 == 195) {
					local12 = Static108.aClass2_Sub11_Sub1_3.method1581();
					local16 = local12 >> 2;
					local24 = Static28.anIntArray61[local16];
					local28 = Static108.aClass2_Sub11_Sub1_3.method1529();
					local20 = local12 & 0x3;
					local335 = Static18.anInt448 + (local28 >> 4 & 0x7);
					local36 = Static67.anInt1408 + (local28 & 0x7);
					if (local335 >= 0 && local36 >= 0 && local335 < 104 && local36 < 104) {
						Static137.method2051(-1, local16, Static126.anInt2806, -1, local36, local24, local20, 0, local335);
					}
				} else if (Static158.anInt3381 == 15) {
					local12 = Static108.aClass2_Sub11_Sub1_3.method1548();
					local16 = Static108.aClass2_Sub11_Sub1_3.method1534();
					local20 = Static18.anInt448 + (local16 >> 4 & 0x7);
					local24 = Static67.anInt1408 + (local16 & 0x7);
					local28 = Static108.aClass2_Sub11_Sub1_3.method1571();
					if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
						@Pc(1478) Class7_Sub6 local1478 = new Class7_Sub6();
						local1478.anInt3711 = local12;
						local1478.anInt3706 = local28;
						if (Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local20][local24] == null) {
							Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local20][local24] = new Class13();
						}
						Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local20][local24].method304(new Class2_Sub1_Sub6(local1478));
						Static143.method2155(local24, local20);
					}
				} else if (Static158.anInt3381 == 225) {
					local12 = Static108.aClass2_Sub11_Sub1_3.method1534();
					local16 = (local12 >> 4 & 0x7) + Static18.anInt448;
					local20 = (local12 & 0x7) + Static67.anInt1408;
					local24 = Static108.aClass2_Sub11_Sub1_3.method1557();
					local28 = Static108.aClass2_Sub11_Sub1_3.method1534();
					local335 = Static108.aClass2_Sub11_Sub1_3.method1557();
					if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
						local16 = local16 * 128 + 64;
						local20 = local20 * 128 + 64;
						@Pc(1604) Class7_Sub4 local1604 = new Class7_Sub4(local24, Static126.anInt2806, local16, local20, Static175.method2548(local20, Static126.anInt2806, local16) - local28, local335, anInt581);
						Static163.aClass13_11.method304(new Class2_Sub1_Sub13(local1604));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
	public static void method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub19 local8 = Static207.method3010(arg1);
		@Pc(15) int local15 = local8.anInt3462;
		@Pc(18) int local18 = local8.anInt3467;
		@Pc(21) int local21 = local8.anInt3463;
		@Pc(28) int local28 = Class2_Sub1_Sub25.anIntArray396[local21 - local15];
		if (arg0 < 0 || local28 < arg0) {
			arg0 = 0;
		}
		local28 <<= local15;
		Static71.anIntArray123[local18] = local28 & arg0 << local15 | Static71.anIntArray123[local18] & ~local28;
	}
}
