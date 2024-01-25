import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array6;

	@OriginalMember(owner = "client!lh", name = "N", descriptor = "Lclient!mn;")
	public static Class171 aClass171_51;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method3183(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg0, 11);
		local8.method2578();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!lm;)V")
	public static void method3184(@OriginalArg(1) Class163 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg0 == Static143.aClass163_9) {
			local12 = Static202.aClass2_Sub17_Sub1_1.method6148();
			@Pc(16) byte local16 = Static202.aClass2_Sub17_Sub1_1.method6123();
			local20 = Static202.aClass2_Sub17_Sub1_1.method6168();
			local28 = (local20 >> 4 & 0x7) + Static183.anInt3210;
			local34 = (local20 & 0x7) + Static340.anInt6081;
			@Pc(38) byte local38 = Static202.aClass2_Sub17_Sub1_1.method6150();
			local42 = Static202.aClass2_Sub17_Sub1_1.method6110();
			local46 = Static202.aClass2_Sub17_Sub1_1.method6158();
			@Pc(50) byte local50 = Static202.aClass2_Sub17_Sub1_1.method6123();
			local56 = Static202.aClass2_Sub17_Sub1_1.method6119();
			local60 = local56 >> 2;
			local64 = local56 & 0x3;
			local70 = Static202.aClass2_Sub17_Sub1_1.method6148();
			@Pc(74) byte local74 = Static202.aClass2_Sub17_Sub1_1.method6120();
			if (!Static257.aClass75_8.method6002()) {
				Static265.method3557(local74, Static344.anInt6100, local50, local42, local16, local70, local38, local46, local28, local60, local64, local12, local34);
			}
			return;
		}
		@Pc(106) int local106;
		@Pc(127) int local127;
		if (arg0 == Static259.aClass163_11) {
			local12 = Static202.aClass2_Sub17_Sub1_1.method6138();
			local106 = (local12 & 0x7) + Static340.anInt6081;
			local20 = local106 + Static153.anInt2798;
			local28 = (local12 >> 4 & 0x7) + Static183.anInt3210;
			local34 = local28 + Static386.anInt7205;
			local127 = Static202.aClass2_Sub17_Sub1_1.method6148();
			local42 = Static202.aClass2_Sub17_Sub1_1.method6148();
			local46 = Static202.aClass2_Sub17_Sub1_1.method6148();
			if (Static293.aClass220_27 != null) {
				@Pc(154) Class2_Sub43 local154 = (Class2_Sub43) Static293.aClass220_27.method5099((long) (Static344.anInt6100 << 28 | local20 << 14 | local34));
				if (local154 != null) {
					for (@Pc(162) Class2_Sub26 local162 = (Class2_Sub26) local154.aClass181_47.method3972(); local162 != null; local162 = (Class2_Sub26) local154.aClass181_47.method3975()) {
						if (local162.anInt4284 == (local127 & 0x7FFF) && local162.anInt4278 == local42) {
							local162.method6260();
							local162.anInt4278 = local46;
							Static368.method6265(local34, local162, Static344.anInt6100, local20);
							break;
						}
					}
					if (local28 >= 0 && local106 >= 0 && Static234.anInt3949 > local28 && Static371.anInt6492 > local106) {
						Static133.method4452(local106, Static344.anInt6100, local28);
					}
				}
			}
		} else if (arg0 == Static337.aClass163_15) {
			local12 = Static202.aClass2_Sub17_Sub1_1.method6153();
			local106 = Static202.aClass2_Sub17_Sub1_1.method6119();
			local20 = (local106 & 0x7) + Static340.anInt6081;
			local28 = local20 + Static153.anInt2798;
			local34 = (local106 >> 4 & 0x7) + Static183.anInt3210;
			local127 = Static386.anInt7205 + local34;
			@Pc(270) Class2_Sub43 local270 = (Class2_Sub43) Static293.aClass220_27.method5099((long) (local127 | Static344.anInt6100 << 28 | local28 << 14));
			if (local270 != null) {
				for (@Pc(278) Class2_Sub26 local278 = (Class2_Sub26) local270.aClass181_47.method3972(); local278 != null; local278 = (Class2_Sub26) local270.aClass181_47.method3975()) {
					if (local278.anInt4284 == (local12 & 0x7FFF)) {
						local278.method6260();
						break;
					}
				}
				if (local270.aClass181_47.method3971()) {
					local270.method6260();
				}
				if (local34 >= 0 && local20 >= 0 && Static234.anInt3949 > local34 && Static371.anInt6492 > local20) {
					Static133.method4452(local20, Static344.anInt6100, local34);
				}
			}
		} else if (Static45.aClass163_1 == arg0) {
			Static202.aClass2_Sub17_Sub1_1.method6138();
			local12 = Static202.aClass2_Sub17_Sub1_1.method6138();
			local106 = Static183.anInt3210 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static340.anInt6081;
			local28 = Static202.aClass2_Sub17_Sub1_1.method6148();
			local34 = Static202.aClass2_Sub17_Sub1_1.method6138();
			local127 = Static202.aClass2_Sub17_Sub1_1.method6145();
			@Pc(371) String local371 = Static202.aClass2_Sub17_Sub1_1.method6141();
			Static171.method4370(local106, local127, local371, local28, local34, local20, Static344.anInt6100);
		} else if (Static317.aClass163_13 == arg0) {
			local12 = Static202.aClass2_Sub17_Sub1_1.method6119();
			local106 = local12 >> 2;
			local20 = local12 & 0x3;
			local28 = Static191.anIntArray275[local106];
			local34 = Static202.aClass2_Sub17_Sub1_1.method6119();
			local127 = Static183.anInt3210 + (local34 >> 4 & 0x7);
			local42 = Static340.anInt6081 + (local34 & 0x7);
			if (Static131.method2108(Static409.anInt701) || local127 >= 0 && local42 >= 0 && Static234.anInt3949 > local127 && Static371.anInt6492 > local42) {
				Static355.method4985(local28, local106, local127, local42, -1, Static344.anInt6100, local20);
			}
		} else if (arg0 == Static325.aClass163_14) {
			local12 = Static202.aClass2_Sub17_Sub1_1.method6110();
			if (local12 == 65535) {
				local12 = -1;
			}
			local106 = Static202.aClass2_Sub17_Sub1_1.method6115();
			local20 = Static183.anInt3210 + (local106 >> 4 & 0x7);
			local28 = Static340.anInt6081 + (local106 & 0x7);
			local34 = Static202.aClass2_Sub17_Sub1_1.method6115();
			local127 = local34 >> 2;
			local42 = local34 & 0x3;
			local46 = Static191.anIntArray275[local127];
			Static79.method1179(Static344.anInt6100, local20, local127, local42, local28, local12, local46);
		} else {
			@Pc(579) int local579;
			@Pc(601) int local601;
			@Pc(555) boolean local555;
			if (arg0 == Static84.aClass163_20) {
				local12 = Static202.aClass2_Sub17_Sub1_1.method6138();
				local106 = (local12 >> 4 & 0xF) + Static183.anInt3210 * 2;
				local20 = (local12 & 0xF) + Static340.anInt6081 * 2;
				local555 = Static202.aClass2_Sub17_Sub1_1.method6138() != 0;
				local34 = Static202.aClass2_Sub17_Sub1_1.method6120() + local106;
				local127 = Static202.aClass2_Sub17_Sub1_1.method6120() + local20;
				local42 = Static202.aClass2_Sub17_Sub1_1.method6149();
				local46 = Static202.aClass2_Sub17_Sub1_1.method6149();
				local579 = Static202.aClass2_Sub17_Sub1_1.method6148();
				@Pc(583) byte local583 = Static202.aClass2_Sub17_Sub1_1.method6120();
				local60 = Static202.aClass2_Sub17_Sub1_1.method6138() * 4;
				local64 = Static202.aClass2_Sub17_Sub1_1.method6148();
				local70 = Static202.aClass2_Sub17_Sub1_1.method6148();
				local601 = Static202.aClass2_Sub17_Sub1_1.method6138();
				if (local601 == 255) {
					local601 = -1;
				}
				@Pc(614) int local614 = Static202.aClass2_Sub17_Sub1_1.method6148();
				if (local106 >= 0 && local20 >= 0 && Static234.anInt3949 * 2 > local106 && local20 < Static234.anInt3949 * 2 && local34 >= 0 && local127 >= 0 && local34 < Static371.anInt6492 * 2 && local127 < Static371.anInt6492 * 2 && local579 != 65535) {
					local56 = local583 << 0;
					local60 <<= 0x0;
					local127 *= 64;
					local614 <<= 0x0;
					local20 = local20 * 64;
					local34 *= 64;
					local106 *= 64;
					if (local42 != 0) {
						@Pc(686) Class11_Sub5_Sub2 local686 = null;
						@Pc(705) int local705;
						@Pc(695) int local695;
						@Pc(699) int local699;
						if (local42 >= 0) {
							local695 = local42 - 1;
							local699 = local695 & 0x7FF;
							local705 = local695 >> 11 & 0xF;
							@Pc(712) Class2_Sub34 local712 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local699);
							if (local712 != null) {
								local686 = local712.aClass11_Sub5_Sub2_Sub2_2;
							}
						} else {
							local695 = -local42 - 1;
							local699 = local695 & 0x7FF;
							local705 = local695 >> 11 & 0xF;
							if (Static94.anInt5592 == local699) {
								local686 = Static127.aClass11_Sub5_Sub2_Sub1_2;
							} else {
								local686 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local699];
							}
						}
						if (local686 != null) {
							@Pc(753) Class101 local753 = local686.method6218();
							if (local753.anIntArrayArray58 != null && local753.anIntArrayArray58[local705] != null) {
								local699 = local753.anIntArrayArray58[local705][0];
								@Pc(775) int local775 = local753.anIntArrayArray58[local705][2];
								@Pc(780) int local780 = local686.aClass23_7.method461();
								@Pc(784) int local784 = Class229.anIntArray537[local780];
								@Pc(788) int local788 = Class229.anIntArray536[local780];
								@Pc(798) int local798 = local788 * local699 + local775 * local784 >> 15;
								@Pc(809) int local809 = local788 * local775 - local699 * local784 >> 15;
								local106 += local798;
								local20 += local809;
								local56 -= local753.anIntArrayArray58[local705][1];
							}
						}
					}
					@Pc(849) Class11_Sub5_Sub4 local849 = new Class11_Sub5_Sub4(local579, Static344.anInt6100, local106, local20, local56, Static277.anInt5022 + local64, local70 - -Static277.anInt5022, local601, local614, local46, local60, local555);
					local849.method4434(Static277.anInt5022 + local64, Static365.method3535(Static344.anInt6100, local34, local127) + -local60, local34, local127);
					Static361.aClass181_36.method3973(new Class2_Sub1_Sub15(local849));
				}
			} else if (Static372.aClass163_18 == arg0) {
				local12 = Static202.aClass2_Sub17_Sub1_1.method6148();
				local106 = Static202.aClass2_Sub17_Sub1_1.method6168();
				local20 = (local106 & 0x7) + Static340.anInt6081;
				local28 = local20 + Static153.anInt2798;
				local34 = (local106 >> 4 & 0x7) + Static183.anInt3210;
				local127 = Static386.anInt7205 + local34;
				local42 = Static202.aClass2_Sub17_Sub1_1.method6110();
				@Pc(926) boolean local926 = local34 >= 0 && local20 >= 0 && Static234.anInt3949 > local34 && Static371.anInt6492 > local20;
				if (local926 || Static131.method2108(Static409.anInt701)) {
					Static368.method6265(local127, new Class2_Sub26(local42, local12), Static344.anInt6100, local28);
					if (local926) {
						Static133.method4452(local20, Static344.anInt6100, local34);
					}
				}
			} else {
				@Pc(1150) Class11_Sub5_Sub4 local1150;
				if (arg0 == Static284.aClass163_12) {
					local12 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local106 = Static183.anInt3210 * 2 + (local12 >> 4 & 0xF);
					local20 = (local12 & 0xF) + Static340.anInt6081 * 2;
					local555 = Static202.aClass2_Sub17_Sub1_1.method6138() != 0;
					local34 = local106 + Static202.aClass2_Sub17_Sub1_1.method6120();
					local127 = Static202.aClass2_Sub17_Sub1_1.method6120() + local20;
					local42 = Static202.aClass2_Sub17_Sub1_1.method6149();
					local46 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local579 = Static202.aClass2_Sub17_Sub1_1.method6138() * 4;
					local56 = Static202.aClass2_Sub17_Sub1_1.method6138() * 4;
					local60 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local64 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local70 = Static202.aClass2_Sub17_Sub1_1.method6138();
					if (local70 == 255) {
						local70 = -1;
					}
					local601 = Static202.aClass2_Sub17_Sub1_1.method6148();
					if (local106 >= 0 && local20 >= 0 && Static234.anInt3949 * 2 > local106 && Static234.anInt3949 * 2 > local20 && local34 >= 0 && local127 >= 0 && Static371.anInt6492 * 2 > local34 && local127 < Static371.anInt6492 * 2 && local46 != 65535) {
						local579 <<= 0x0;
						local20 = local20 * 64;
						local127 *= 64;
						local34 *= 64;
						local56 <<= 0x0;
						local106 *= 64;
						local601 <<= 0x0;
						local1150 = new Class11_Sub5_Sub4(local46, Static344.anInt6100, local106, local20, local579, Static277.anInt5022 + local60, local64 - -Static277.anInt5022, local70, local601, local42, local56, local555);
						local1150.method4434(local60 + Static277.anInt5022, -local56 + Static365.method3535(Static344.anInt6100, local34, local127), local34, local127);
						Static361.aClass181_36.method3973(new Class2_Sub1_Sub15(local1150));
					}
				} else if (arg0 == Static92.aClass163_6) {
					local12 = Static202.aClass2_Sub17_Sub1_1.method6153();
					local106 = Static202.aClass2_Sub17_Sub1_1.method6119();
					local20 = Static340.anInt6081 + (local106 & 0x7);
					local28 = local20 + Static153.anInt2798;
					local34 = Static183.anInt3210 + (local106 >> 4 & 0x7);
					local127 = Static386.anInt7205 + local34;
					local42 = Static202.aClass2_Sub17_Sub1_1.method6124();
					local46 = Static202.aClass2_Sub17_Sub1_1.method6124();
					if (local46 != Static94.anInt5592) {
						@Pc(1249) boolean local1249 = local34 >= 0 && local20 >= 0 && Static234.anInt3949 > local34 && Static371.anInt6492 > local20;
						if (local1249 || Static131.method2108(Static409.anInt701)) {
							Static368.method6265(local127, new Class2_Sub26(local42, local12), Static344.anInt6100, local28);
							if (local1249) {
								Static133.method4452(local20, Static344.anInt6100, local34);
							}
						}
					}
				} else if (arg0 == Static71.aClass163_4) {
					local12 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local106 = (local12 >> 4 & 0x7) + Static183.anInt3210;
					local20 = Static340.anInt6081 + (local12 & 0x7);
					local28 = Static202.aClass2_Sub17_Sub1_1.method6148();
					if (local28 == 65535) {
						local28 = -1;
					}
					local34 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local127 = local34 >> 4 & 0xF;
					local42 = local34 & 0x7;
					local46 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local579 = Static202.aClass2_Sub17_Sub1_1.method6138();
					if (local106 >= 0 && local20 >= 0 && Static234.anInt3949 > local106 && local20 < Static371.anInt6492) {
						local56 = local127 + 1;
						if (local106 - local56 <= Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0] && local106 + local56 >= Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0] && local20 - local56 <= Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0] && Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0] <= local20 + local56) {
							Static289.method4094(local42, (Static344.anInt6100 << 24) + (local106 << 16) + (local20 << 8) + local127, local579, local46, local28);
						}
					}
				} else if (Static340.aClass163_16 == arg0) {
					local12 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local106 = Static202.aClass2_Sub17_Sub1_1.method6138();
					Static249.aClass39_2.method748(local12).method4314(local106);
				} else if (Static143.aClass163_8 == arg0) {
					local12 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local106 = Static183.anInt3210 + (local12 >> 4 & 0x7);
					local20 = (local12 & 0x7) + Static340.anInt6081;
					local28 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local34 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local127 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local42 = Static202.aClass2_Sub17_Sub1_1.method6138();
					if (local106 >= 0 && local20 >= 0 && Static234.anInt3949 > local106 && Static371.anInt6492 > local20) {
						local46 = local106 * 128 + 64;
						local579 = local20 * 128 + 64;
						local56 = Static344.anInt6100;
						if (local56 < 3 && Static369.method5157(local20, local106)) {
							local56++;
						}
						@Pc(1546) Class11_Sub5_Sub1 local1546 = new Class11_Sub5_Sub1(local28, local127, Static277.anInt5022, Static344.anInt6100, local56, local46, Static365.method3535(Static344.anInt6100, local46, local579) - local34, local579, local106, local106, local20, local20, local42);
						Static364.aClass181_38.method3973(new Class2_Sub1_Sub18(local1546));
					}
				} else if (Static269.aClass163_7 == arg0) {
					local12 = Static202.aClass2_Sub17_Sub1_1.method6115();
					local106 = Static183.anInt3210 + (local12 >> 4 & 0x7);
					local20 = (local12 & 0x7) + Static340.anInt6081;
					local28 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local34 = local28 >> 2;
					local127 = local28 & 0x3;
					local42 = Static191.anIntArray275[local34];
					local46 = Static202.aClass2_Sub17_Sub1_1.method6110();
					if (Static131.method2108(Static409.anInt701) || local106 >= 0 && local20 >= 0 && local106 < Static234.anInt3949 && Static371.anInt6492 > local20) {
						Static355.method4985(local42, local34, local106, local20, local46, Static344.anInt6100, local127);
					}
				} else if (arg0 == Static362.aClass163_17) {
					local12 = Static202.aClass2_Sub17_Sub1_1.method6138();
					@Pc(1657) boolean local1657 = (local12 & 0x80) != 0;
					local20 = Static183.anInt3210 + (local12 >> 3 & 0x7);
					local28 = (local12 & 0x7) + Static340.anInt6081;
					local34 = local20 + Static202.aClass2_Sub17_Sub1_1.method6120();
					local127 = local28 + Static202.aClass2_Sub17_Sub1_1.method6120();
					local42 = Static202.aClass2_Sub17_Sub1_1.method6149();
					local46 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local579 = Static202.aClass2_Sub17_Sub1_1.method6138() * 4;
					local56 = Static202.aClass2_Sub17_Sub1_1.method6138() * 4;
					local60 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local64 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local70 = Static202.aClass2_Sub17_Sub1_1.method6138();
					local601 = Static202.aClass2_Sub17_Sub1_1.method6148();
					if (local70 == 255) {
						local70 = -1;
					}
					if (local20 >= 0 && local28 >= 0 && local20 < Static234.anInt3949 && Static371.anInt6492 > local28 && local34 >= 0 && local127 >= 0 && local34 < Static234.anInt3949 && local127 < Static371.anInt6492 && local46 != 65535) {
						local28 = local28 * 128 + 64;
						local34 = local34 * 128 + 64;
						local127 = local127 * 128 + 64;
						local601 <<= 0x0;
						local20 = local20 * 128 + 64;
						local56 <<= 0x0;
						local579 <<= 0x0;
						local1150 = new Class11_Sub5_Sub4(local46, Static344.anInt6100, local20, local28, local579, local60 + Static277.anInt5022, Static277.anInt5022 + local64, local70, local601, local42, local56, local1657);
						local1150.method4434(local60 + Static277.anInt5022, -local56 + Static365.method3535(Static344.anInt6100, local34, local127), local34, local127);
						Static361.aClass181_36.method3973(new Class2_Sub1_Sub15(local1150));
					}
				} else {
					Static22.method402(null, "T3 - " + arg0);
					Static360.method5072(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method3185(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIBIIII)Z")
	public static boolean method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 + arg2 > arg0 && arg0 + arg1 > arg4) {
			return arg3 + arg7 > arg6 && arg6 + arg5 > arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)V")
	public static void method3189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static195.method2779(arg0)) {
			Static195.method2780(arg1, Static188.aClass93ArrayArray4[arg0]);
		}
	}
}
