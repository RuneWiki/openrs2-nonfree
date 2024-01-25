import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!vh;")
	public static Class250 aClass250_28;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "[[Lclient!bs;")
	public static Class33[][] aClass33ArrayArray1;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public static int anInt2560 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public static void method2263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 1);
		local8.method202();
		local8.anInt214 = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLclient!ir;)V")
	public static void method2264(@OriginalArg(1) Class26_Sub2_Sub2 arg0) {
		arg0.aBoolean457 = false;
		@Pc(19) Class191 local19;
		if (arg0.anInt7122 != -1) {
			local19 = Static191.aClass28_1.method567(arg0.anInt7122);
			if (local19 == null || local19.anIntArray452 == null) {
				arg0.aBoolean458 = false;
				arg0.anInt7122 = -1;
			} else {
				label394: {
					arg0.anInt7072++;
					if (arg0.anInt7082 < local19.anIntArray452.length && arg0.anInt7072 > local19.anIntArray454[arg0.anInt7082]) {
						arg0.anInt7121++;
						arg0.anInt7072 = 1;
						arg0.anInt7082++;
						Static228.method3411(arg0.anInt7065, Static196.aClass26_Sub2_Sub2_Sub1_1 == arg0, arg0.anInt7068, local19, arg0.anInt7082, arg0.aByte95);
					}
					if (arg0.anInt7082 >= local19.anIntArray452.length) {
						arg0.anInt7072 = 0;
						arg0.anInt7082 = 0;
						if (arg0.aBoolean458) {
							arg0.anInt7122 = arg0.method5533().method3817();
							if (arg0.anInt7122 == -1) {
								arg0.aBoolean458 = false;
								break label394;
							}
							local19 = Static191.aClass28_1.method567(arg0.anInt7122);
						}
						Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local19, arg0.anInt7082, arg0.aByte95);
					}
					arg0.anInt7121 = arg0.anInt7082 + 1;
					if (local19.anIntArray452.length <= arg0.anInt7121) {
						arg0.anInt7121 = 0;
					}
				}
			}
		}
		@Pc(182) int local182;
		@Pc(190) Class191 local190;
		@Pc(179) Class45 local179;
		if (arg0.anInt7119 != -1 && Static403.anInt6978 >= arg0.anInt7131) {
			local179 = Static168.aClass115_2.method2718(arg0.anInt7119);
			local182 = local179.anInt1316;
			if (local182 == -1) {
				arg0.anInt7119 = -1;
			} else {
				label396: {
					local190 = Static191.aClass28_1.method567(local182);
					if (local179.aBoolean62) {
						if (local190.anInt5749 == 3) {
							if (arg0.anInt7147 > 0 && Static403.anInt6978 >= arg0.anInt7088 && Static403.anInt6978 > arg0.anInt7103) {
								arg0.anInt7119 = -1;
								break label396;
							}
						} else if (local190.anInt5749 == 1 && arg0.anInt7147 > 0 && arg0.anInt7088 <= Static403.anInt6978 && arg0.anInt7103 < Static403.anInt6978) {
							arg0.anInt7131 = Static403.anInt6978 + 1;
							break label396;
						}
					}
					if (local190 == null || local190.anIntArray452 == null) {
						arg0.anInt7119 = -1;
					} else {
						if (arg0.anInt7107 < 0) {
							arg0.anInt7107 = 0;
							Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local190, 0, arg0.aByte95);
						}
						arg0.anInt7076++;
						if (arg0.anInt7107 < local190.anIntArray452.length && arg0.anInt7076 > local190.anIntArray454[arg0.anInt7107]) {
							arg0.anInt7076 = 1;
							arg0.anInt7107++;
							Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local190, arg0.anInt7107, arg0.aByte95);
						}
						if (local190.anIntArray452.length <= arg0.anInt7107) {
							if (local179.aBoolean62) {
								arg0.anInt7087++;
								arg0.anInt7107 -= local190.anInt5747;
								if (local190.anInt5752 <= arg0.anInt7087) {
									arg0.anInt7119 = -1;
								} else if (arg0.anInt7107 >= 0 && local190.anIntArray452.length > arg0.anInt7107) {
									Static228.method3411(arg0.anInt7065, Static196.aClass26_Sub2_Sub2_Sub1_1 == arg0, arg0.anInt7068, local190, arg0.anInt7107, arg0.aByte95);
								} else {
									arg0.anInt7119 = -1;
								}
							} else {
								arg0.anInt7119 = -1;
							}
						}
						arg0.anInt7128 = arg0.anInt7107 + 1;
						if (local190.anIntArray452.length <= arg0.anInt7128) {
							if (local179.aBoolean62) {
								arg0.anInt7128 -= local190.anInt5747;
								if (arg0.anInt7087 + 1 >= local190.anInt5752) {
									arg0.anInt7128 = -1;
								} else if (arg0.anInt7128 < 0 || local190.anIntArray452.length <= arg0.anInt7128) {
									arg0.anInt7128 = -1;
								}
							} else {
								arg0.anInt7128 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7102 != -1 && arg0.anInt7085 <= Static403.anInt6978) {
			local179 = Static168.aClass115_2.method2718(arg0.anInt7102);
			local182 = local179.anInt1316;
			if (local182 == -1) {
				arg0.anInt7102 = -1;
			} else {
				label399: {
					local190 = Static191.aClass28_1.method567(local182);
					if (local179.aBoolean62) {
						if (local190.anInt5749 == 3) {
							if (arg0.anInt7147 > 0 && arg0.anInt7088 <= Static403.anInt6978 && arg0.anInt7103 < Static403.anInt6978) {
								arg0.anInt7102 = -1;
								break label399;
							}
						} else if (local190.anInt5749 == 1 && arg0.anInt7147 > 0 && arg0.anInt7088 <= Static403.anInt6978 && arg0.anInt7103 < Static403.anInt6978) {
							arg0.anInt7085 = Static403.anInt6978 + 1;
							break label399;
						}
					}
					if (local190 == null || local190.anIntArray452 == null) {
						arg0.anInt7102 = -1;
					} else {
						if (arg0.anInt7100 < 0) {
							arg0.anInt7100 = 0;
							Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local190, 0, arg0.aByte95);
						}
						arg0.anInt7079++;
						if (arg0.anInt7100 < local190.anIntArray452.length && local190.anIntArray454[arg0.anInt7100] < arg0.anInt7079) {
							arg0.anInt7079 = 1;
							arg0.anInt7100++;
							Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local190, arg0.anInt7100, arg0.aByte95);
						}
						if (local190.anIntArray452.length <= arg0.anInt7100) {
							if (local179.aBoolean62) {
								arg0.anInt7100 -= local190.anInt5747;
								arg0.anInt7125++;
								if (arg0.anInt7125 >= local190.anInt5752) {
									arg0.anInt7102 = -1;
								} else if (arg0.anInt7100 >= 0 && arg0.anInt7100 < local190.anIntArray452.length) {
									Static228.method3411(arg0.anInt7065, Static196.aClass26_Sub2_Sub2_Sub1_1 == arg0, arg0.anInt7068, local190, arg0.anInt7100, arg0.aByte95);
								} else {
									arg0.anInt7102 = -1;
								}
							} else {
								arg0.anInt7102 = -1;
							}
						}
						arg0.anInt7108 = arg0.anInt7100 + 1;
						if (arg0.anInt7108 >= local190.anIntArray452.length) {
							if (local179.aBoolean62) {
								arg0.anInt7108 -= local190.anInt5747;
								if (local190.anInt5752 <= arg0.anInt7125 + 1) {
									arg0.anInt7108 = -1;
								} else if (arg0.anInt7108 < 0 || local190.anIntArray452.length <= arg0.anInt7108) {
									arg0.anInt7108 = -1;
								}
							} else {
								arg0.anInt7108 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7073 != -1 && arg0.anInt7120 <= 1) {
			local19 = Static191.aClass28_1.method567(arg0.anInt7073);
			if (local19.anInt5749 == 3) {
				if (arg0.anInt7147 > 0 && arg0.anInt7088 <= Static403.anInt6978 && arg0.anInt7103 < Static403.anInt6978) {
					arg0.anInt7073 = -1;
				}
			} else if (local19.anInt5749 == 1 && arg0.anInt7147 > 0 && Static403.anInt6978 >= arg0.anInt7088 && arg0.anInt7103 < Static403.anInt6978) {
				arg0.anInt7120 = 2;
			}
		}
		if (arg0.anInt7073 != -1 && arg0.anInt7120 == 0) {
			local19 = Static191.aClass28_1.method567(arg0.anInt7073);
			if (local19 == null || local19.anIntArray452 == null) {
				arg0.anInt7073 = -1;
			} else {
				arg0.anInt7127++;
				if (arg0.anInt7075 < local19.anIntArray452.length && arg0.anInt7127 > local19.anIntArray454[arg0.anInt7075]) {
					arg0.anInt7075++;
					arg0.anInt7127 = 1;
					Static228.method3411(arg0.anInt7065, Static196.aClass26_Sub2_Sub2_Sub1_1 == arg0, arg0.anInt7068, local19, arg0.anInt7075, arg0.aByte95);
				}
				if (local19.anIntArray452.length <= arg0.anInt7075) {
					arg0.anInt7136++;
					arg0.anInt7075 -= local19.anInt5747;
					if (local19.anInt5752 <= arg0.anInt7136) {
						arg0.anInt7073 = -1;
					} else if (arg0.anInt7075 >= 0 && local19.anIntArray452.length > arg0.anInt7075) {
						Static228.method3411(arg0.anInt7065, Static196.aClass26_Sub2_Sub2_Sub1_1 == arg0, arg0.anInt7068, local19, arg0.anInt7075, arg0.aByte95);
					} else {
						arg0.anInt7073 = -1;
					}
				}
				arg0.anInt7133 = arg0.anInt7075 + 1;
				if (arg0.anInt7133 >= local19.anIntArray452.length) {
					arg0.anInt7133 -= local19.anInt5747;
					if (arg0.anInt7136 + 1 >= local19.anInt5752) {
						arg0.anInt7133 = -1;
					} else if (arg0.anInt7133 < 0 || local19.anIntArray452.length <= arg0.anInt7133) {
						arg0.anInt7133 = -1;
					}
				}
				arg0.aBoolean457 = local19.aBoolean373;
			}
		}
		if (arg0.anInt7120 > 0) {
			arg0.anInt7120--;
		}
		for (@Pc(1089) int local1089 = 0; local1089 < arg0.aClass137Array3.length; local1089++) {
			@Pc(1096) Class137 local1096 = arg0.aClass137Array3[local1089];
			if (local1096 != null) {
				if (local1096.anInt3850 > 0) {
					local1096.anInt3850--;
				} else {
					local190 = Static191.aClass28_1.method567(local1096.anInt3849);
					if (local190 == null || local190.anIntArray452 == null) {
						arg0.aClass137Array3[local1089] = null;
					} else {
						local1096.anInt3858++;
						if (local190.anIntArray452.length > local1096.anInt3854 && local1096.anInt3858 > local190.anIntArray454[local1096.anInt3854]) {
							local1096.anInt3858 = 1;
							local1096.anInt3854++;
							Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local190, local1096.anInt3854, arg0.aByte95);
						}
						if (local190.anIntArray452.length <= local1096.anInt3854) {
							local1096.anInt3855++;
							local1096.anInt3854 -= local190.anInt5747;
							if (local190.anInt5752 <= local1096.anInt3855) {
								arg0.aClass137Array3[local1089] = null;
							} else if (local1096.anInt3854 >= 0 && local1096.anInt3854 < local190.anIntArray452.length) {
								Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local190, local1096.anInt3854, arg0.aByte95);
							} else {
								arg0.aClass137Array3[local1089] = null;
							}
						}
						local1096.anInt3856 = local1096.anInt3854 + 1;
						if (local190.anIntArray452.length <= local1096.anInt3856) {
							local1096.anInt3856 -= local190.anInt5747;
							if (local190.anInt5752 <= local1096.anInt3855 + 1) {
								local1096.anInt3856 = -1;
							} else if (local1096.anInt3856 < 0 || local1096.anInt3856 >= local190.anIntArray452.length) {
								local1096.anInt3856 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(JLjava/lang/String;IZIIZLjava/lang/String;IZI)V")
	public static void method2265(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub1 local28 = new Class1_Sub1(128);
		local28.method4115(10);
		local28.method4101((arg8 ? 4 : 0) | (arg5 ? 2 : 0) | (arg3 ? 1 : 0));
		local28.method4107(arg0);
		local28.method4105(local8[0]);
		local28.method4104(arg1);
		local28.method4105(local8[1]);
		local28.method4101(Static253.anInt4554);
		local28.method4115(arg4);
		local28.method4115(arg7);
		local28.method4105(local8[2]);
		local28.method4101(arg2);
		local28.method4101(arg9);
		local28.method4105(local8[3]);
		local28.method4141(Static195.aBigInteger3, Static212.aBigInteger2);
		@Pc(114) Class1_Sub1 local114 = new Class1_Sub1(350);
		local114.method4104(arg6);
		@Pc(127) int local127 = 8 - Static43.method4229(arg6) % 8;
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			local114.method4115((int) (Math.random() * 255.0D));
		}
		local114.method4143(local8);
		Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
		Static232.aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_8.anInt2675);
		Static232.aClass1_Sub1_Sub1_2.method4101(local114.anInt5056 + local28.anInt5056 + 2);
		Static232.aClass1_Sub1_Sub1_2.method4101(586);
		Static232.aClass1_Sub1_Sub1_2.method4110(local28.anInt5056, local28.aByteArray66);
		Static232.aClass1_Sub1_Sub1_2.method4110(local114.anInt5056, local114.aByteArray66);
		Static402.anInt6944 = 1;
		Static148.anInt2522 = 0;
		Static53.anInt1070 = 0;
		Static423.anInt7327 = -3;
	}
}
