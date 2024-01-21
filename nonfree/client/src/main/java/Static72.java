import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_35;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!rd;")
	public static Class1_Sub1_Sub15 aClass1_Sub1_Sub15_1;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	public static int anInt1808;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!q;")
	public static Class62 aClass62_21;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt1798 = -1;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_888 = Static108.method1915("l");

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[B")
	public static byte[] aByteArray53 = new byte[520];

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public static int anInt1801 = 0;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	public static volatile int anInt1805 = 0;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_889 = Static108.method1915(")3runescape)3com");

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_890 = Static108.method1915("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_891 = Static108.method1915("Texturen geladen)3");

	@OriginalMember(owner = "client!le", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_892 = Static108.method1915("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method1249() {
		Static81.method1387();
		Static99.aBoolean198 = true;
		Static79.method1798();
		if (Static90.aBoolean179) {
			Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static8.aClass39_155, 239, 40, 0, -1);
			Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static30.method601(new Class39[] { Static42.method744(Static8.aClass39_148), Static91.aClass39_1088 }), 239, 60, 128, -1);
		} else if (Static2.anInt133 == 1) {
			Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static46.aClass39_1324, 239, 40, 0, -1);
			Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static30.method601(new Class39[] { Static42.method744(Static8.aClass39_145), Static91.aClass39_1088 }), 239, 60, 128, -1);
		} else if (Static2.anInt133 == 2) {
			Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static32.aClass39_339, 239, 40, 0, -1);
			Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static30.method601(new Class39[] { Static42.method744(Static8.aClass39_145), Static91.aClass39_1088 }), 239, 60, 128, -1);
		} else {
			@Pc(92) Class1_Sub1_Sub4_Sub3 local92;
			@Pc(99) int local99;
			@Pc(110) int local110;
			if (Static2.anInt133 == 3) {
				if (Static8.aClass39_145 != Static8.aClass39_149) {
					Static122.method2061(Static8.aClass39_145);
					Static8.aClass39_149 = Static8.aClass39_145;
				}
				local92 = Static93.aClass1_Sub1_Sub4_Sub3_3;
				Static15.method1513(0, 0, 463, 77);
				for (local99 = 0; local99 < Static59.anInt1586; local99++) {
					local110 = local99 * 14 + 18 - Static16.anInt2466;
					if (local110 > 0 && local110 < 110) {
						local92.method741(Static68.aClass39Array20[local99], 239, local110, 0, -1);
					}
				}
				Static15.method1505();
				if (Static59.anInt1586 > 5) {
					Static26.method525(0, Static16.anInt2466, Static59.anInt1586 * 14 + 7, 77, 463);
				}
				if (Static8.aClass39_145.method1175() == 0) {
					Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static13.aClass39_286, 239, 40, 255, -1);
				} else if (Static59.anInt1586 == 0) {
					Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static68.aClass39_869, 239, 40, 0, -1);
				}
				local92.method741(Static30.method601(new Class39[] { Static42.method744(Static8.aClass39_145), Static91.aClass39_1088 }), 239, 90, 0, -1);
				Static15.method1506(0, 77, 479, 0);
			} else if (Static2.anInt133 == 4) {
				Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static8.aClass39_154, 239, 40, 0, -1);
				Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static30.method601(new Class39[] { Static42.method744(Static8.aClass39_145), Static91.aClass39_1088 }), 239, 60, 128, -1);
			} else if (Static122.aClass39_1434 == null) {
				@Pc(811) boolean local811;
				if (Static110.anInt2786 != -1) {
					local811 = Static89.method1478(2, 96, Static110.anInt2786, 479);
					if (!local811) {
						Static113.aBoolean226 = true;
					}
				} else if (Static9.anInt2991 == -1) {
					local99 = 0;
					local92 = Static93.aClass1_Sub1_Sub4_Sub3_3;
					Static15.method1513(0, 0, 463, 77);
					for (local110 = 0; local110 < 100; local110++) {
						if (Static67.aClass39Array19[local110] != null) {
							@Pc(227) int local227 = Static94.anIntArray338[local110];
							@Pc(235) int local235 = Static56.anInt1514 + 70 - local99 * 14;
							@Pc(239) Class39 local239 = Static16.aClass39Array25[local110];
							@Pc(241) byte local241 = 0;
							if (local239 != null && local239.method1185(Static112.aClass39_1343)) {
								local241 = 1;
								local239 = local239.method1181(5);
							}
							if (local239 != null && local239.method1185(Static38.aClass39_534)) {
								local239 = local239.method1181(5);
								local241 = 2;
							}
							if (local227 == 0) {
								local99++;
								if (local235 > 0 && local235 < 110) {
									local92.method753(Static67.aClass39Array19[local110], 4, local235, 0, -1);
								}
							}
							@Pc(318) int local318;
							if ((local227 == 1 || local227 == 2) && (local227 == 1 || Static114.anInt2845 == 0 || Static114.anInt2845 == 1 && Static98.method1718(local239))) {
								if (local235 > 0 && local235 < 110) {
									local318 = 4;
									if (local241 == 1) {
										Static74.aClass1_Sub1_Sub4_Sub1Array8[0].method492(4, local235 - 12);
										local318 += 14;
									}
									if (local241 == 2) {
										Static74.aClass1_Sub1_Sub4_Sub1Array8[1].method492(local318, local235 - 12);
										local318 += 14;
									}
									local92.method753(Static30.method601(new Class39[] { local239, Static44.aClass39_596 }), local318, local235, 0, -1);
									local318 += local92.method755(local239) + 8;
									local92.method753(Static67.aClass39Array19[local110], local318, local235, 255, -1);
								}
								local99++;
							}
							if ((local227 == 3 || local227 == 7) && Static71.anInt1792 == 0 && (local227 == 7 || Static24.anInt816 == 0 || Static24.anInt816 == 1 && Static98.method1718(local239))) {
								local99++;
								if (local235 > 0 && local235 < 110) {
									local92.method753(Static114.aClass39_1372, 4, local235, 0, -1);
									local318 = local92.method755(Static114.aClass39_1372) + 4;
									local318 += local92.method761(32);
									if (local241 == 1) {
										Static74.aClass1_Sub1_Sub4_Sub1Array8[0].method492(local318, local235 - 12);
										local318 += 14;
									}
									if (local241 == 2) {
										Static74.aClass1_Sub1_Sub4_Sub1Array8[1].method492(local318, local235 - 12);
										local318 += 14;
									}
									local92.method753(Static30.method601(new Class39[] { local239, Static44.aClass39_596 }), local318, local235, 0, -1);
									local318 += local92.method755(local239) + 8;
									local92.method753(Static67.aClass39Array19[local110], local318, local235, 8388608, -1);
								}
							}
							if (local227 == 4 && (Static11.anInt495 == 0 || Static11.anInt495 == 1 && Static98.method1718(local239))) {
								if (local235 > 0 && local235 < 110) {
									local92.method753(Static30.method601(new Class39[] { local239, Static114.aClass39_1359, Static67.aClass39Array19[local110] }), 4, local235, 8388736, -1);
								}
								local99++;
							}
							if (local227 == 5 && Static71.anInt1792 == 0 && Static24.anInt816 < 2) {
								local99++;
								if (local235 > 0 && local235 < 110) {
									local92.method753(Static67.aClass39Array19[local110], 4, local235, 8388608, -1);
								}
							}
							if (local227 == 6 && Static71.anInt1792 == 0 && Static24.anInt816 < 2) {
								local99++;
								if (local235 > 0 && local235 < 110) {
									local92.method753(Static30.method601(new Class39[] { Static110.aClass39_1339, Static114.aClass39_1359, local239, Static44.aClass39_596 }), 4, local235, 0, -1);
									local92.method753(Static67.aClass39Array19[local110], local92.method755(Static30.method601(new Class39[] { Static110.aClass39_1339, Static114.aClass39_1359, local239 })) + 12, local235, 8388608, -1);
								}
							}
							if (local227 == 8 && (Static11.anInt495 == 0 || Static11.anInt495 == 1 && Static98.method1718(local239))) {
								local99++;
								if (local235 > 0 && local235 < 110) {
									local92.method753(Static30.method601(new Class39[] { local239, Static114.aClass39_1359, Static67.aClass39Array19[local110] }), 4, local235, 8270336, -1);
								}
							}
						}
					}
					Static15.method1505();
					Static87.anInt2023 = local99 * 14 + 7;
					if (Static87.anInt2023 < 78) {
						Static87.anInt2023 = 78;
					}
					Static26.method525(0, Static87.anInt2023 - Static56.anInt1514 - 77, Static87.anInt2023, 77, 463);
					@Pc(738) Class39 local738;
					if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1 == null || Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass39_1234 == null) {
						local738 = Static38.aClass39_546;
					} else {
						local738 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass39_1234;
					}
					local92.method753(Static30.method601(new Class39[] { local738, Static44.aClass39_596 }), 4, 90, 0, -1);
					local92.method753(Static30.method601(new Class39[] { Static42.method744(Static8.aClass39_151), Static91.aClass39_1088 }), local92.method755(Static30.method601(new Class39[] { local738, Static114.aClass39_1370 })) + 6, 90, 255, -1);
					Static15.method1506(0, 77, 479, 0);
				} else {
					local811 = Static89.method1478(3, 96, Static9.anInt2991, 479);
					if (!local811) {
						Static113.aBoolean226 = true;
					}
				}
			} else {
				Static53.aClass1_Sub1_Sub4_Sub3_1.method760(Static122.aClass39_1434, 10, 20, 459, 40, 0, -1, 1, 1, 0);
				Static53.aClass1_Sub1_Sub4_Sub3_1.method741(Static19.aClass39_329, 239, 80, 128, -1);
			}
		}
		if (Static13.aBoolean47 && Static46.anInt2774 == 2) {
			Static124.method2080();
		}
		Static29.method582();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1250() {
		aByteArray53 = null;
		aClass39_892 = null;
		aClass39_891 = null;
		aClass39_889 = null;
		aClass39_890 = null;
		aClass1_Sub1_Sub15_1 = null;
		aClass39_888 = null;
		aClass1_Sub1_Sub4_Sub1_35 = null;
		aClass62_21 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class1_Sub19 local3 = null;
		for (@Pc(12) Class1_Sub19 local12 = (Class1_Sub19) Static96.aClass31_54.method1000(); local12 != null; local12 = (Class1_Sub19) Static96.aClass31_54.method1003()) {
			if (arg0 == local12.anInt2827 && arg7 == local12.anInt2830 && local12.anInt2818 == arg8 && arg3 == local12.anInt2821) {
				local3 = local12;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class1_Sub19();
			local3.anInt2818 = arg8;
			local3.anInt2821 = arg3;
			local3.anInt2827 = arg0;
			local3.anInt2830 = arg7;
			Static105.method1879(local3);
			Static96.aClass31_54.method1005(local3);
		}
		local3.anInt2837 = arg2;
		local3.anInt2838 = arg1;
		local3.anInt2826 = arg6;
		local3.anInt2828 = arg5;
		local3.anInt2819 = arg4;
	}
}
