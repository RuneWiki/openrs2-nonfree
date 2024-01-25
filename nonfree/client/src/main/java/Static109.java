import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!t;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_89 = new Class137(50, 3);

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt1928 = 0;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt1929 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method1523() {
		Static41.method655();
		Static22.method395(Static336.aClass106_Sub1_1.aBoolean469);
		Static260.aClass77_5 = Static240.method3126(0, Static226.aCanvas9, Static41.aClass124_2, 22050);
		Static260.aClass77_5.method4274(Static244.aClass1_Sub9_Sub4_2);
		Static343.aClass77_4 = Static240.method3126(1, Static226.aCanvas9, Static41.aClass124_2, 2048);
		Static343.aClass77_4.method4274(Static155.aClass1_Sub9_Sub2_1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method1524(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 59 || arg0 == 48 || arg0 == 23 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 21 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	public static void method1525(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub3_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class163 local8 = Static240.aClass163Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static195.anInt3127; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static362.anInt6113; local15++) {
						local1 = local8.O(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static384.anInt6381;
							@Pc(32) int local32 = local12 << Static384.anInt6381;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class163 local41 = Static240.aClass163Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.I(local15, local12) - local41.I(local15, local12);
									@Pc(67) int local67 = local8.I(local15 + 1, local12) - local41.I(local15 + 1, local12);
									@Pc(85) int local85 = local8.I(local15 + 1, local12 + 1) - local41.I(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.I(local15, local12 + 1) - local41.I(local15, local12 + 1);
									local41.SA(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!me;I)V")
	public static void method1526(@OriginalArg(0) Class20_Sub3_Sub3 arg0) {
		arg0.aBoolean501 = false;
		@Pc(19) Class171 local19;
		if (arg0.anInt6037 != -1) {
			local19 = Static152.aClass213_1.method4410(arg0.anInt6037);
			if (local19 == null || local19.anIntArray235 == null) {
				arg0.anInt6037 = -1;
				arg0.aBoolean502 = false;
			} else {
				label394: {
					arg0.anInt6083++;
					if (arg0.anInt6013 < local19.anIntArray235.length && local19.anIntArray234[arg0.anInt6013] < arg0.anInt6083) {
						arg0.anInt6068++;
						arg0.anInt6013++;
						arg0.anInt6083 = 1;
						Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg0, local19, arg0.anInt6013);
					}
					if (local19.anIntArray235.length <= arg0.anInt6013) {
						arg0.anInt6013 = 0;
						arg0.anInt6083 = 0;
						if (arg0.aBoolean502) {
							arg0.anInt6037 = arg0.method4676().method1120();
							if (arg0.anInt6037 == -1) {
								arg0.aBoolean502 = false;
								break label394;
							}
							local19 = Static152.aClass213_1.method4410(arg0.anInt6037);
						}
						Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, arg0 == Static239.aClass20_Sub3_Sub3_Sub1_1, local19, arg0.anInt6013);
					}
					arg0.anInt6068 = arg0.anInt6013 + 1;
					if (local19.anIntArray235.length <= arg0.anInt6068) {
						arg0.anInt6068 = 0;
					}
				}
			}
		}
		@Pc(187) int local187;
		@Pc(200) Class171 local200;
		@Pc(184) Class14 local184;
		if (arg0.anInt6014 != -1 && Static368.anInt6250 >= arg0.anInt6015) {
			local184 = Static44.aClass190_2.method4005(arg0.anInt6014);
			local187 = local184.anInt325;
			if (local187 == -1) {
				arg0.anInt6014 = -1;
			} else {
				label396: {
					local200 = Static152.aClass213_1.method4410(local187);
					if (local184.aBoolean27) {
						if (local200.anInt4260 == 3) {
							if (arg0.anInt6087 > 0 && arg0.anInt6062 <= Static368.anInt6250 && Static368.anInt6250 > arg0.anInt6078) {
								arg0.anInt6014 = -1;
								break label396;
							}
						} else if (local200.anInt4260 == 1 && arg0.anInt6087 > 0 && Static368.anInt6250 >= arg0.anInt6062 && arg0.anInt6078 < Static368.anInt6250) {
							arg0.anInt6015 = Static368.anInt6250 + 1;
							break label396;
						}
					}
					if (local200 == null || local200.anIntArray235 == null) {
						arg0.anInt6014 = -1;
					} else {
						if (arg0.anInt6041 < 0) {
							arg0.anInt6041 = 0;
							Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg0, local200, 0);
						}
						arg0.anInt6069++;
						if (arg0.anInt6041 < local200.anIntArray235.length && local200.anIntArray234[arg0.anInt6041] < arg0.anInt6069) {
							arg0.anInt6069 = 1;
							arg0.anInt6041++;
							Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, arg0 == Static239.aClass20_Sub3_Sub3_Sub1_1, local200, arg0.anInt6041);
						}
						if (arg0.anInt6041 >= local200.anIntArray235.length) {
							if (local184.aBoolean27) {
								arg0.anInt6077++;
								arg0.anInt6041 -= local200.anInt4251;
								if (local200.anInt4252 <= arg0.anInt6077) {
									arg0.anInt6014 = -1;
								} else if (arg0.anInt6041 >= 0 && arg0.anInt6041 < local200.anIntArray235.length) {
									Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg0, local200, arg0.anInt6041);
								} else {
									arg0.anInt6014 = -1;
								}
							} else {
								arg0.anInt6014 = -1;
							}
						}
						arg0.anInt6030 = arg0.anInt6041 + 1;
						if (arg0.anInt6030 >= local200.anIntArray235.length) {
							if (local184.aBoolean27) {
								arg0.anInt6030 -= local200.anInt4251;
								if (local200.anInt4252 <= arg0.anInt6077 + 1) {
									arg0.anInt6030 = -1;
								} else if (arg0.anInt6030 < 0 || local200.anIntArray235.length <= arg0.anInt6030) {
									arg0.anInt6030 = -1;
								}
							} else {
								arg0.anInt6030 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6019 != -1 && Static368.anInt6250 >= arg0.anInt6042) {
			local184 = Static44.aClass190_2.method4005(arg0.anInt6019);
			local187 = local184.anInt325;
			if (local187 == -1) {
				arg0.anInt6019 = -1;
			} else {
				label399: {
					local200 = Static152.aClass213_1.method4410(local187);
					if (local184.aBoolean27) {
						if (local200.anInt4260 == 3) {
							if (arg0.anInt6087 > 0 && Static368.anInt6250 >= arg0.anInt6062 && arg0.anInt6078 < Static368.anInt6250) {
								arg0.anInt6019 = -1;
								break label399;
							}
						} else if (local200.anInt4260 == 1 && arg0.anInt6087 > 0 && Static368.anInt6250 >= arg0.anInt6062 && arg0.anInt6078 < Static368.anInt6250) {
							arg0.anInt6042 = Static368.anInt6250 + 1;
							break label399;
						}
					}
					if (local200 == null || local200.anIntArray235 == null) {
						arg0.anInt6019 = -1;
					} else {
						if (arg0.anInt6071 < 0) {
							arg0.anInt6071 = 0;
							Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, arg0 == Static239.aClass20_Sub3_Sub3_Sub1_1, local200, 0);
						}
						arg0.anInt6035++;
						if (local200.anIntArray235.length > arg0.anInt6071 && local200.anIntArray234[arg0.anInt6071] < arg0.anInt6035) {
							arg0.anInt6035 = 1;
							arg0.anInt6071++;
							Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg0, local200, arg0.anInt6071);
						}
						if (local200.anIntArray235.length <= arg0.anInt6071) {
							if (local184.aBoolean27) {
								arg0.anInt6071 -= local200.anInt4251;
								arg0.anInt6048++;
								if (arg0.anInt6048 >= local200.anInt4252) {
									arg0.anInt6019 = -1;
								} else if (arg0.anInt6071 >= 0 && local200.anIntArray235.length > arg0.anInt6071) {
									Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, arg0 == Static239.aClass20_Sub3_Sub3_Sub1_1, local200, arg0.anInt6071);
								} else {
									arg0.anInt6019 = -1;
								}
							} else {
								arg0.anInt6019 = -1;
							}
						}
						arg0.anInt6073 = arg0.anInt6071 + 1;
						if (local200.anIntArray235.length <= arg0.anInt6073) {
							if (local184.aBoolean27) {
								arg0.anInt6073 -= local200.anInt4251;
								if (local200.anInt4252 <= arg0.anInt6048 + 1) {
									arg0.anInt6073 = -1;
								} else if (arg0.anInt6073 < 0 || arg0.anInt6073 >= local200.anIntArray235.length) {
									arg0.anInt6073 = -1;
								}
							} else {
								arg0.anInt6073 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6051 != -1 && arg0.anInt6040 <= 1) {
			local19 = Static152.aClass213_1.method4410(arg0.anInt6051);
			if (local19.anInt4260 == 3) {
				if (arg0.anInt6087 > 0 && Static368.anInt6250 >= arg0.anInt6062 && arg0.anInt6078 < Static368.anInt6250) {
					arg0.anInt6051 = -1;
				}
			} else if (local19.anInt4260 == 1 && arg0.anInt6087 > 0 && arg0.anInt6062 <= Static368.anInt6250 && Static368.anInt6250 > arg0.anInt6078) {
				arg0.anInt6040 = 2;
			}
		}
		if (arg0.anInt6051 != -1 && arg0.anInt6040 == 0) {
			local19 = Static152.aClass213_1.method4410(arg0.anInt6051);
			if (local19 == null || local19.anIntArray235 == null) {
				arg0.anInt6051 = -1;
			} else {
				arg0.anInt6039++;
				if (arg0.anInt6044 < local19.anIntArray235.length && local19.anIntArray234[arg0.anInt6044] < arg0.anInt6039) {
					arg0.anInt6039 = 1;
					arg0.anInt6044++;
					Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg0, local19, arg0.anInt6044);
				}
				if (arg0.anInt6044 >= local19.anIntArray235.length) {
					arg0.anInt6053++;
					arg0.anInt6044 -= local19.anInt4251;
					if (local19.anInt4252 <= arg0.anInt6053) {
						arg0.anInt6051 = -1;
					} else if (arg0.anInt6044 >= 0 && arg0.anInt6044 < local19.anIntArray235.length) {
						Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, arg0 == Static239.aClass20_Sub3_Sub3_Sub1_1, local19, arg0.anInt6044);
					} else {
						arg0.anInt6051 = -1;
					}
				}
				arg0.anInt6022 = arg0.anInt6044 + 1;
				if (local19.anIntArray235.length <= arg0.anInt6022) {
					arg0.anInt6022 -= local19.anInt4251;
					if (arg0.anInt6053 + 1 >= local19.anInt4252) {
						arg0.anInt6022 = -1;
					} else if (arg0.anInt6022 < 0 || arg0.anInt6022 >= local19.anIntArray235.length) {
						arg0.anInt6022 = -1;
					}
				}
				arg0.aBoolean501 = local19.aBoolean333;
			}
		}
		if (arg0.anInt6040 > 0) {
			arg0.anInt6040--;
		}
		for (@Pc(1056) int local1056 = 0; local1056 < arg0.aClass99Array3.length; local1056++) {
			@Pc(1063) Class99 local1063 = arg0.aClass99Array3[local1056];
			if (local1063 != null) {
				if (local1063.anInt2444 > 0) {
					local1063.anInt2444--;
				} else {
					local200 = Static152.aClass213_1.method4410(local1063.anInt2438);
					if (local200 == null || local200.anIntArray235 == null) {
						arg0.aClass99Array3[local1056] = null;
					} else {
						local1063.anInt2447++;
						if (local200.anIntArray235.length > local1063.anInt2446 && local1063.anInt2447 > local200.anIntArray234[local1063.anInt2446]) {
							local1063.anInt2446++;
							local1063.anInt2447 = 1;
							Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, arg0 == Static239.aClass20_Sub3_Sub3_Sub1_1, local200, local1063.anInt2446);
						}
						if (local200.anIntArray235.length <= local1063.anInt2446) {
							local1063.anInt2446 -= local200.anInt4251;
							local1063.anInt2443++;
							if (local1063.anInt2443 >= local200.anInt4252) {
								arg0.aClass99Array3[local1056] = null;
							} else if (local1063.anInt2446 >= 0 && local1063.anInt2446 < local200.anIntArray235.length) {
								Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg0, local200, local1063.anInt2446);
							} else {
								arg0.aClass99Array3[local1056] = null;
							}
						}
						local1063.anInt2441 = local1063.anInt2446 + 1;
						if (local1063.anInt2441 >= local200.anIntArray235.length) {
							local1063.anInt2441 -= local200.anInt4251;
							if (local1063.anInt2443 + 1 >= local200.anInt4252) {
								local1063.anInt2441 = -1;
							} else if (local1063.anInt2441 < 0 || local1063.anInt2441 >= local200.anIntArray235.length) {
								local1063.anInt2441 = -1;
							}
						}
					}
				}
			}
		}
	}
}
