import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_98 = new Class316(45, 3);

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "Lclient!kf;")
	public static final Class171 aClass171_14 = new Class171(1);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!ql;)V")
	public static void method6185(@OriginalArg(1) Class6_Sub12_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method6068();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static333.anInt6355; local12++) {
			local18 = Static354.anIntArray461[local12];
			if ((Static114.aByteArray28[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static114.aByteArray28[local18] = (byte) (Static114.aByteArray28[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method6061(1);
					if (local46 == 0) {
						local7 = Static125.method1932(arg0);
						Static114.aByteArray28[local18] = (byte) (Static114.aByteArray28[local18] | 0x2);
					} else {
						Static581.method7919(arg0, local18);
					}
				}
			}
		}
		arg0.method6065();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method6068();
		@Pc(132) int local132;
		for (local18 = 0; local18 < Static333.anInt6355; local18++) {
			local46 = Static354.anIntArray461[local18];
			if ((Static114.aByteArray28[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static114.aByteArray28[local46] = (byte) (Static114.aByteArray28[local46] | 0x2);
					local7--;
				} else {
					local132 = arg0.method6061(1);
					if (local132 == 0) {
						local7 = Static125.method1932(arg0);
						Static114.aByteArray28[local46] = (byte) (Static114.aByteArray28[local46] | 0x2);
					} else {
						Static581.method7919(arg0, local46);
					}
				}
			}
		}
		arg0.method6065();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method6068();
		@Pc(211) int local211;
		for (local46 = 0; local46 < Static493.anInt8639; local46++) {
			local132 = Static455.anIntArray567[local46];
			if ((Static114.aByteArray28[local132] & 0x1) != 0) {
				if (local7 > 0) {
					Static114.aByteArray28[local132] = (byte) (Static114.aByteArray28[local132] | 0x2);
					local7--;
				} else {
					local211 = arg0.method6061(1);
					if (local211 == 0) {
						local7 = Static125.method1932(arg0);
						Static114.aByteArray28[local132] = (byte) (Static114.aByteArray28[local132] | 0x2);
					} else if (Static318.method4956(arg0, local132)) {
						Static114.aByteArray28[local132] = (byte) (Static114.aByteArray28[local132] | 0x2);
					}
				}
			}
		}
		arg0.method6065();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method6068();
		for (local132 = 0; local132 < Static493.anInt8639; local132++) {
			local211 = Static455.anIntArray567[local132];
			if ((Static114.aByteArray28[local211] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static114.aByteArray28[local211] = (byte) (Static114.aByteArray28[local211] | 0x2);
				} else {
					@Pc(307) int local307 = arg0.method6061(1);
					if (local307 == 0) {
						local7 = Static125.method1932(arg0);
						Static114.aByteArray28[local211] = (byte) (Static114.aByteArray28[local211] | 0x2);
					} else if (Static318.method4956(arg0, local211)) {
						Static114.aByteArray28[local211] = (byte) (Static114.aByteArray28[local211] | 0x2);
					}
				}
			}
		}
		arg0.method6065();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static493.anInt8639 = 0;
		Static333.anInt6355 = 0;
		for (local211 = 1; local211 < 2048; local211++) {
			Static114.aByteArray28[local211] = (byte) (Static114.aByteArray28[local211] >> 1);
			@Pc(376) Class15_Sub2_Sub4_Sub2 local376 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local211];
			if (local376 == null) {
				Static455.anIntArray567[Static493.anInt8639++] = local211;
			} else {
				Static354.anIntArray461[Static333.anInt6355++] = local211;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method6187() {
		Static457.aClass7_6.method92();
		Static429.aClass41_5.method831();
		Static518.aClass242_2.method5669();
		Static85.aClass27_1.method522();
		Static119.aClass226_4.method5372();
		Static119.aClass244_4.method5723();
		Static388.aClass324_2.method7262();
		Static475.aClass291_2.method6547();
		Static344.aClass173_1.method4041();
		Static382.aClass78_1.method1671();
		Static81.aClass12_1.method199();
		Static242.aClass274_3.method6286();
		Static358.aClass320_3.method7207();
		Static497.aClass309_1.method6960();
		Static111.aClass259_1.method5912();
		Static57.aClass14_1.method209();
		Static376.aClass116_1.method2649();
		Static498.aClass271_1.method6191();
		Static108.aClass249_2.method5810();
		Static22.aClass350_1.method7899();
		Static357.method5351();
		Static22.method327();
		Static193.method3263();
		Static209.method3405();
		Static32.aClass330_8.method7678();
		Static32.aClass330_7.method7678();
		Static518.aClass330_63.method7678();
		Static342.aClass330_34.method7678();
		Static199.aClass330_25.method7678();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
	public static void method6188(@OriginalArg(0) int arg0) {
		if (arg0 == Static375.anInt9162) {
			return;
		}
		if (arg0 == 13) {
			if (Static299.aString45 == null) {
				Static478.method6623(Static526.anInt9112, Static576.aString93, Static286.aString42);
			} else {
				Static381.method5581(Static526.anInt9112);
			}
		}
		if (arg0 != 13 && Static481.aClass1_2 != null) {
			Static481.aClass1_2.method50();
			Static481.aClass1_2 = null;
		}
		if (arg0 == 3) {
			Static581.method7918(Static152.anInt1936 != Static320.anInt6124);
		}
		if (arg0 == 7) {
			Static129.method1979(Static428.anInt7625 != Static152.anInt1936);
		}
		if (arg0 == 5) {
			if (Static299.aString45 == null) {
				Static284.method4342(Static286.aString42, Static576.aString93);
			} else {
				Static115.method1816();
			}
		} else if (arg0 == 6) {
			if (Static299.aString45 == null) {
				Static478.method6623(Static526.anInt9112, Static576.aString93, Static286.aString42);
			} else {
				Static381.method5581(Static526.anInt9112);
			}
		} else if (arg0 == 9) {
			if (Static299.aString45 == null) {
				Static478.method6623(Static526.anInt9112, Static576.aString93, Static286.aString42);
			} else {
				Static381.method5581(Static526.anInt9112);
			}
		} else if (arg0 == 12) {
			if (Static299.aString45 == null) {
				Static284.method4342(Static286.aString42, Static576.aString93);
			} else {
				Static115.method1816();
			}
		}
		if (Static101.method2476(Static375.anInt9162)) {
			Static265.aClass248_37.anInt7247 = 2;
			Static282.aClass248_43.anInt7247 = 2;
			Static274.aClass248_41.anInt7247 = 2;
			Static107.aClass248_16.anInt7247 = 2;
			Static572.aClass248_109.anInt7247 = 2;
			Static535.aClass248_105.anInt7247 = 2;
			Static364.aClass248_63.anInt7247 = 2;
		}
		if (Static101.method2476(arg0)) {
			Static430.anInt7679 = 1;
			Static212.anInt9973 = 1;
			Static39.anInt748 = 0;
			Static6.anInt93 = 0;
			Static46.anInt864 = 0;
			Static138.method2968(true);
			Static265.aClass248_37.anInt7247 = 1;
			Static282.aClass248_43.anInt7247 = 1;
			Static274.aClass248_41.anInt7247 = 1;
			Static107.aClass248_16.anInt7247 = 1;
			Static572.aClass248_109.anInt7247 = 1;
			Static535.aClass248_105.anInt7247 = 1;
			Static364.aClass248_63.anInt7247 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static534.method7061();
		}
		@Pc(233) boolean local233 = arg0 == 2 || Static16.method202(arg0) || Static355.method5330(arg0);
		@Pc(250) boolean local250 = Static375.anInt9162 == 2 || Static16.method202(Static375.anInt9162) || Static355.method5330(Static375.anInt9162);
		if (local250 != local233) {
			if (local233) {
				Static175.anInt3168 = Static17.anInt235;
				if (Static58.aClass6_Sub17_Sub1_1.anInt9269 == 0) {
					Static516.method7067();
				} else {
					Static125.method1931(Static262.aClass248_36, Static17.anInt235, Static58.aClass6_Sub17_Sub1_1.anInt9269);
				}
				Static469.aClass180_3.method4349(false);
			} else {
				Static516.method7067();
				Static469.aClass180_3.method4349(true);
			}
		}
		if (Static101.method2476(arg0) || arg0 == 13) {
			Static554.aClass90_12.method7469();
		}
		Static375.anInt9162 = arg0;
	}
}
