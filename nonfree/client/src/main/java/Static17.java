import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!ta;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_6;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[B")
	public static byte[] aByteArray4;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!q;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!kc;")
	private static Class36 aClass36_222 = Static14.method2017("New User");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_223 = aClass36_222;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt442 = 0;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt444 = 0;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!kc;")
	public static Class36 aClass36_224 = Static14.method2017(":0");

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_229 = Static14.method2017("Enter amount:");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_225 = aClass36_229;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_226 = Static14.method2017("huffman");

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!kc;")
	private static Class36 aClass36_227 = Static14.method2017("wishes to trade with you)3");

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_228 = aClass36_227;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_230 = Static14.method2017("blinken2:");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ec;")
	public static RuntimeException_Sub1 method336(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString8 = local5.aString8 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] method337() {
		@Pc(8) Class2_Sub1_Sub1_Sub3[] local8 = new Class2_Sub1_Sub1_Sub3[Static79.anInt2057];
		for (@Pc(15) int local15 = 0; local15 < Static79.anInt2057; local15++) {
			@Pc(25) Class2_Sub1_Sub1_Sub3 local25 = local8[local15] = new Class2_Sub1_Sub1_Sub3();
			local25.anInt1784 = Static96.anInt2558;
			local25.anInt1785 = Static10.anInt247;
			local25.anInt1782 = Static27.anIntArray60[local15];
			local25.anInt1780 = Static64.anIntArray204[local15];
			local25.anInt1783 = Static92.anIntArray293[local15];
			local25.anInt1781 = Static36.anIntArray132[local15];
			@Pc(55) byte[] local55 = Static42.aByteArrayArray19[local15];
			@Pc(61) int local61 = local25.anInt1781 * local25.anInt1783;
			local25.anIntArray224 = new int[local61];
			for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
				local25.anIntArray224[local67] = Static43.anIntArray161[local55[local67] & 0xFF];
			}
		}
		Static40.method1545();
		return local8;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method339() {
		aClass36_230 = null;
		aClass36_225 = null;
		aClass36_229 = null;
		aClass14_5 = null;
		aClass36_226 = null;
		aClass36_224 = null;
		aByteArray4 = null;
		aClass36_228 = null;
		aClass36_222 = null;
		aClass54_1 = null;
		aClass36_223 = null;
		aClass36_227 = null;
		aClass2_Sub1_Sub1_Sub1_6 = null;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method340() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (Static10.anInt253 == 78) {
			local12 = Static92.aClass2_Sub12_Sub1_3.method1399();
			local20 = (local12 >> 4 & 0x7) + Static103.anInt2694;
			local26 = (local12 & 0x7) + Static4.anInt134;
			local30 = Static92.aClass2_Sub12_Sub1_3.method1366();
			local34 = Static92.aClass2_Sub12_Sub1_3.method1366();
			local38 = Static92.aClass2_Sub12_Sub1_3.method1366();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(63) Class8 local63 = Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local20][local26];
				if (local63 != null) {
					for (@Pc(70) Class2_Sub1_Sub4_Sub3 local70 = (Class2_Sub1_Sub4_Sub3) local63.method175(); local70 != null; local70 = (Class2_Sub1_Sub4_Sub3) local63.method173()) {
						if (local70.anInt1747 == (local30 & 0x7FFF) && local70.anInt1752 == local34) {
							local70.anInt1752 = local38;
							break;
						}
					}
					Static66.method1156(local26, local20);
				}
			}
		} else if (Static10.anInt253 == 3) {
			local12 = Static92.aClass2_Sub12_Sub1_3.method1401();
			local20 = Static92.aClass2_Sub12_Sub1_3.method1391();
			local26 = Static103.anInt2694 + (local20 >> 4 & 0x7);
			local30 = Static4.anInt134 + (local20 & 0x7);
			local34 = Static92.aClass2_Sub12_Sub1_3.method1401();
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
				@Pc(159) Class2_Sub1_Sub4_Sub3 local159 = new Class2_Sub1_Sub4_Sub3();
				local159.anInt1747 = local12;
				local159.anInt1752 = local34;
				if (Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local26][local30] == null) {
					Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local26][local30] = new Class8();
				}
				Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local26][local30].method187(local159);
				Static66.method1156(local30, local26);
			}
		} else {
			@Pc(235) int local235;
			@Pc(239) int local239;
			@Pc(259) int local259;
			@Pc(269) int local269;
			@Pc(311) int local311;
			@Pc(281) int local281;
			@Pc(291) int local291;
			if (Static10.anInt253 == 114) {
				local12 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local20 = (local12 >> 4 & 0x7) + Static103.anInt2694;
				local26 = (local12 & 0x7) + Static4.anInt134;
				local30 = Static92.aClass2_Sub12_Sub1_3.method1401();
				local34 = Static92.aClass2_Sub12_Sub1_3.method1391();
				local38 = local34 >> 2;
				local235 = local34 & 0x3;
				local239 = Static42.anIntArray159[local38];
				if (local20 >= 0 && local26 >= 0 && local20 < 103 && local26 < 103) {
					local259 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local20][local26];
					local269 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local20 + 1][local26];
					local281 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local20 + 1][local26 + 1];
					local291 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local20][local26 + 1];
					if (local239 == 0) {
						@Pc(302) Class35 local302 = Static85.aClass61_1.method1735(Static92.anInt2412, local20, local26);
						if (local302 != null) {
							local311 = local302.anInt1327 >> 14 & 0x7FFF;
							if (local38 == 2) {
								local302.aClass2_Sub1_Sub4_4 = new Class2_Sub1_Sub4_Sub6(local311, 2, local235 + 4, local259, local269, local281, local291, local30, false, local302.aClass2_Sub1_Sub4_4);
								local302.aClass2_Sub1_Sub4_3 = new Class2_Sub1_Sub4_Sub6(local311, 2, local235 + 1 & 0x3, local259, local269, local281, local291, local30, false, local302.aClass2_Sub1_Sub4_3);
							} else {
								local302.aClass2_Sub1_Sub4_4 = new Class2_Sub1_Sub4_Sub6(local311, local38, local235, local259, local269, local281, local291, local30, false, local302.aClass2_Sub1_Sub4_4);
							}
						}
					}
					if (local239 == 1) {
						@Pc(383) Class17 local383 = Static85.aClass61_1.method1711(Static92.anInt2412, local20, local26);
						if (local383 != null) {
							local383.aClass2_Sub1_Sub4_2 = new Class2_Sub1_Sub4_Sub6(local383.anInt496 >> 14 & 0x7FFF, 4, 0, local259, local269, local281, local291, local30, false, local383.aClass2_Sub1_Sub4_2);
						}
					}
					if (local239 == 2) {
						if (local38 == 11) {
							local38 = 10;
						}
						@Pc(424) Class6 local424 = Static85.aClass61_1.method1716(Static92.anInt2412, local20, local26);
						if (local424 != null) {
							local424.aClass2_Sub1_Sub4_1 = new Class2_Sub1_Sub4_Sub6(local424.anInt157 >> 14 & 0x7FFF, local38, local235, local259, local269, local281, local291, local30, false, local424.aClass2_Sub1_Sub4_1);
						}
					}
					if (local239 == 3) {
						@Pc(458) Class58 local458 = Static85.aClass61_1.method1733(Static92.anInt2412, local20, local26);
						if (local458 != null) {
							local458.aClass2_Sub1_Sub4_8 = new Class2_Sub1_Sub4_Sub6(local458.anInt2339 >> 14 & 0x7FFF, 22, local235, local259, local269, local281, local291, local30, false, local458.aClass2_Sub1_Sub4_8);
						}
					}
				}
			} else if (Static10.anInt253 == 36) {
				local12 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local20 = Static103.anInt2694 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static4.anInt134;
				local30 = Static92.aClass2_Sub12_Sub1_3.method1366();
				local34 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local38 = Static92.aClass2_Sub12_Sub1_3.method1366();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					local20 = local20 * 128 + 64;
					local26 = local26 * 128 + 64;
					@Pc(555) Class2_Sub1_Sub4_Sub4 local555 = new Class2_Sub1_Sub4_Sub4(local30, Static92.anInt2412, local20, local26, Static56.method1044(local26, local20, Static92.anInt2412) - local34, local38, Static113.anInt2952);
					Static71.aClass8_5.method187(local555);
				}
			} else {
				@Pc(620) Class2_Sub1_Sub4_Sub3 local620;
				if (Static10.anInt253 == 234) {
					local12 = Static92.aClass2_Sub12_Sub1_3.method1388();
					local20 = (local12 >> 4 & 0x7) + Static103.anInt2694;
					local26 = (local12 & 0x7) + Static4.anInt134;
					local30 = Static92.aClass2_Sub12_Sub1_3.method1401();
					local34 = Static92.aClass2_Sub12_Sub1_3.method1366();
					local38 = Static92.aClass2_Sub12_Sub1_3.method1401();
					if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && local38 != Static18.anInt455) {
						local620 = new Class2_Sub1_Sub4_Sub3();
						local620.anInt1752 = local34;
						local620.anInt1747 = local30;
						if (Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local20][local26] == null) {
							Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local20][local26] = new Class8();
						}
						Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local20][local26].method187(local620);
						Static66.method1156(local26, local20);
					}
				} else if (Static10.anInt253 == 88) {
					local20 = Static92.aClass2_Sub12_Sub1_3.method1391();
					local26 = local20 >> 2;
					local30 = local20 & 0x3;
					local34 = Static42.anIntArray159[local26];
					local38 = Static92.aClass2_Sub12_Sub1_3.method1382();
					local239 = Static4.anInt134 + (local38 & 0x7);
					local235 = Static103.anInt2694 + (local38 >> 4 & 0x7);
					if (local235 >= 0 && local239 >= 0 && local235 < 104 && local239 < 104) {
						Static69.method1197(local34, Static92.anInt2412, -1, local239, -1, local235, local30, 0, local26);
					}
				} else if (Static10.anInt253 == 29) {
					local20 = Static92.aClass2_Sub12_Sub1_3.method1391();
					local30 = local20 & 0x3;
					local26 = local20 >> 2;
					local34 = Static42.anIntArray159[local26];
					local38 = Static92.aClass2_Sub12_Sub1_3.method1399();
					local239 = (local38 & 0x7) + Static4.anInt134;
					local235 = (local38 >> 4 & 0x7) + Static103.anInt2694;
					local259 = Static92.aClass2_Sub12_Sub1_3.method1378();
					if (local235 >= 0 && local239 >= 0 && local235 < 104 && local239 < 104) {
						Static69.method1197(local34, Static92.anInt2412, local259, local239, -1, local235, local30, 0, local26);
					}
				} else if (Static10.anInt253 == 19) {
					local20 = Static92.aClass2_Sub12_Sub1_3.method1378();
					local26 = Static92.aClass2_Sub12_Sub1_3.method1399();
					local30 = (local26 >> 4 & 0x7) + Static103.anInt2694;
					local34 = Static4.anInt134 + (local26 & 0x7);
					if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
						@Pc(846) Class8 local846 = Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local30][local34];
						if (local846 != null) {
							for (local620 = (Class2_Sub1_Sub4_Sub3) local846.method175(); local620 != null; local620 = (Class2_Sub1_Sub4_Sub3) local846.method173()) {
								if (local620.anInt1747 == (local20 & 0x7FFF)) {
									local620.method2073();
									break;
								}
							}
							if (local846.method175() == null) {
								Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local30][local34] = null;
							}
							Static66.method1156(local34, local30);
						}
					}
				} else if (Static10.anInt253 == 27) {
					local20 = Static92.aClass2_Sub12_Sub1_3.method1399();
					local26 = (local20 >> 4 & 0x7) + Static103.anInt2694;
					local30 = (local20 & 0x7) + Static4.anInt134;
					local34 = local26 + Static92.aClass2_Sub12_Sub1_3.method1406();
					local38 = local30 + Static92.aClass2_Sub12_Sub1_3.method1406();
					local235 = Static92.aClass2_Sub12_Sub1_3.method1385();
					local239 = Static92.aClass2_Sub12_Sub1_3.method1366();
					local259 = Static92.aClass2_Sub12_Sub1_3.method1399() * 4;
					local269 = Static92.aClass2_Sub12_Sub1_3.method1399() * 4;
					local281 = Static92.aClass2_Sub12_Sub1_3.method1366();
					local291 = Static92.aClass2_Sub12_Sub1_3.method1366();
					@Pc(961) int local961 = Static92.aClass2_Sub12_Sub1_3.method1399();
					local311 = Static92.aClass2_Sub12_Sub1_3.method1399();
					if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local239 != 65535) {
						local26 = local26 * 128 + 64;
						local34 = local34 * 128 + 64;
						local30 = local30 * 128 + 64;
						local38 = local38 * 128 + 64;
						@Pc(1048) Class2_Sub1_Sub4_Sub5 local1048 = new Class2_Sub1_Sub4_Sub5(local239, Static92.anInt2412, local26, local30, Static56.method1044(local30, local26, Static92.anInt2412) - local259, local281 + Static113.anInt2952, local291 + Static113.anInt2952, local961, local311, local235, local269);
						local1048.method1881(Static113.anInt2952 + local281, -local269 + Static56.method1044(local38, local34, Static92.anInt2412), local34, local38);
						Static59.aClass8_4.method187(local1048);
					}
				} else {
					if (Static10.anInt253 == 13) {
						local20 = Static92.aClass2_Sub12_Sub1_3.method1399();
						local26 = Static103.anInt2694 + (local20 >> 4 & 0x7);
						local30 = (local20 & 0x7) + Static4.anInt134;
						local34 = Static92.aClass2_Sub12_Sub1_3.method1378();
						@Pc(1100) byte local1100 = Static92.aClass2_Sub12_Sub1_3.method1387();
						local235 = Static92.aClass2_Sub12_Sub1_3.method1382();
						local239 = local235 >> 2;
						local259 = local235 & 0x3;
						local269 = Static42.anIntArray159[local239];
						@Pc(1120) byte local1120 = Static92.aClass2_Sub12_Sub1_3.method1406();
						@Pc(1124) byte local1124 = Static92.aClass2_Sub12_Sub1_3.method1406();
						@Pc(1128) byte local1128 = Static92.aClass2_Sub12_Sub1_3.method1400();
						local311 = Static92.aClass2_Sub12_Sub1_3.method1413();
						@Pc(1136) int local1136 = Static92.aClass2_Sub12_Sub1_3.method1378();
						@Pc(1140) int local1140 = Static92.aClass2_Sub12_Sub1_3.method1401();
						@Pc(1147) Class2_Sub1_Sub4_Sub2_Sub2 local1147;
						if (Static18.anInt455 == local1140) {
							local1147 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3;
						} else {
							local1147 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local1140];
						}
						if (local1147 != null) {
							@Pc(1157) Class2_Sub1_Sub13 local1157 = Static2.method2072(local311);
							@Pc(1165) int local1165 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local26][local30];
							@Pc(1175) int local1175 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local26 + 1][local30];
							@Pc(1185) int local1185 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local26][local30 + 1];
							@Pc(1197) int local1197 = Static27.anIntArrayArrayArray4[Static92.anInt2412][local26 + 1][local30 + 1];
							@Pc(1207) Class2_Sub1_Sub4_Sub1 local1207 = local1157.method1629(local1197, local259, local1175, local1165, local239, local1185);
							if (local1207 != null) {
								Static69.method1197(local269, Static92.anInt2412, -1, local30, local34 + 1, local26, 0, local1136 + 1, 0);
								local1147.anInt2217 = Static113.anInt2952 + local1136;
								local1147.anInt2226 = Static113.anInt2952 + local34;
								local1147.aClass2_Sub1_Sub4_Sub1_3 = local1207;
								@Pc(1240) int local1240 = local1157.anInt2326;
								@Pc(1243) int local1243 = local1157.anInt2288;
								@Pc(1248) byte local1248;
								if (local1124 > local1100) {
									local1248 = local1124;
									local1124 = local1100;
									local1100 = local1248;
								}
								if (local259 == 1 || local259 == 3) {
									local1243 = local1157.anInt2326;
									local1240 = local1157.anInt2288;
								}
								if (local1120 < local1128) {
									local1248 = local1128;
									local1128 = local1120;
									local1120 = local1248;
								}
								local1147.anInt2230 = local1240 * 64 + local26 * 128;
								local1147.anInt2220 = local1243 * 64 + local30 * 128;
								local1147.anInt2224 = Static56.method1044(local1147.anInt2220, local1147.anInt2230, Static92.anInt2412);
								local1147.anInt2228 = local1100 + local26;
								local1147.anInt2231 = local30 + local1128;
								local1147.anInt2213 = local1124 + local26;
								local1147.anInt2211 = local1120 + local30;
							}
						}
					}
					if (Static10.anInt253 == 98) {
						local20 = Static92.aClass2_Sub12_Sub1_3.method1399();
						local30 = Static4.anInt134 + (local20 & 0x7);
						local26 = (local20 >> 4 & 0x7) + Static103.anInt2694;
						local34 = Static92.aClass2_Sub12_Sub1_3.method1366();
						local38 = Static92.aClass2_Sub12_Sub1_3.method1399();
						local239 = local38 & 0x7;
						local235 = local38 >> 4 & 0xF;
						local259 = Static92.aClass2_Sub12_Sub1_3.method1399();
						if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
							local269 = local235 + 1;
							if (local26 - local269 <= Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0] && Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0] <= local269 + local26 && Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0] >= local30 - local269 && local30 + local269 >= Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0] && Static42.anInt1116 != 0 && local239 > 0 && Static115.anInt1793 < 50) {
								Static111.anIntArray344[Static115.anInt1793] = local34;
								Static80.anIntArray246[Static115.anInt1793] = local239;
								Static74.anIntArray237[Static115.anInt1793] = local259;
								Static101.aClass7Array1[Static115.anInt1793] = null;
								Static59.anIntArray197[Static115.anInt1793] = (local26 << 16) - (-(local30 << 8) - local235);
								Static115.anInt1793++;
								return;
							}
						}
					}
				}
			}
		}
	}
}
