import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!jf;")
	public static Class44 aClass44_2;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array4;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!sd;")
	private static Class73 aClass73_360 = Static122.method531(" is already on your ignore list)3");

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_359 = aClass73_360;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt605 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBIIILclient!i;ILclient!pf;)V")
	public static void method483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class35 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class60 arg7) {
		if (Static85.aBoolean127 && (Static110.aByteArrayArrayArray5[0][arg6][arg3] & 0x2) == 0) {
			if ((Static110.aByteArrayArrayArray5[arg1][arg6][arg3] & 0x10) != 0) {
				return;
			}
			if (Static101.method1773(arg3, arg6, arg1) != Static33.anInt830) {
				return;
			}
		}
		if (Static108.anInt2483 > arg1) {
			Static108.anInt2483 = arg1;
		}
		@Pc(52) Class3_Sub1_Sub15 local52 = Static151.method2466(arg2);
		@Pc(68) int local68;
		@Pc(65) int local65;
		if (arg0 == 1 || arg0 == 3) {
			local68 = local52.anInt3014;
			local65 = local52.anInt3012;
		} else {
			local65 = local52.anInt3014;
			local68 = local52.anInt3012;
		}
		@Pc(95) int local95;
		@Pc(89) int local89;
		if (local68 + arg6 <= 104) {
			local89 = (local68 + 1 >> 1) + arg6;
			local95 = (local68 >> 1) + arg6;
		} else {
			local95 = arg6;
			local89 = arg6 + 1;
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (local65 + arg3 > 104) {
			local110 = arg3;
			local114 = arg3 + 1;
		} else {
			local110 = (local65 >> 1) + arg3;
			local114 = (local65 + 1 >> 1) + arg3;
		}
		@Pc(134) int[][] local134 = Static65.anIntArrayArrayArray5[arg1];
		@Pc(160) int local160 = local134[local89][local114] + local134[local95][local114] + local134[local95][local110] + local134[local89][local110] >> 2;
		@Pc(168) int local168 = (local65 << 6) + (arg3 << 7);
		@Pc(176) int local176 = (local68 << 6) + (arg6 << 7);
		@Pc(188) int local188 = (arg2 << 14) + (arg3 << 7) + arg6 + 1073741824;
		if (local52.anInt3017 == 0) {
			local188 += Integer.MIN_VALUE;
		}
		@Pc(204) int local204 = arg4 + (arg0 << 6);
		if (local52.anInt3032 == 1) {
			local204 += 256;
		}
		if (local52.method2198()) {
			Static2.method11(arg1, arg6, arg3, local52, arg0);
		}
		@Pc(255) Class3_Sub1_Sub4 local255;
		if (arg4 != 22) {
			@Pc(361) int local361;
			@Pc(379) int local379;
			if (arg4 == 10 || arg4 == 11) {
				if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
					local255 = local52.method2193(local160, 10, local134, local176, arg0, local168);
				} else {
					local255 = new Class3_Sub1_Sub4_Sub6(arg2, 10, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
				}
				if (local255 != null && arg5.method1161(arg1, arg6, arg3, local160, local68, local65, local255, arg4 == 11 ? 256 : 0, local188, local204) && local52.aBoolean202) {
					local361 = 15;
					if (local255 instanceof Class3_Sub1_Sub4_Sub5) {
						local361 = ((Class3_Sub1_Sub4_Sub5) local255).method1893() / 4;
						if (local361 > 30) {
							local361 = 30;
						}
					}
					for (local379 = 0; local379 <= local68; local379++) {
						for (@Pc(383) int local383 = 0; local383 <= local65; local383++) {
							if (local361 > Static65.aByteArrayArrayArray3[arg1][arg6 + local379][arg3 + local383]) {
								Static65.aByteArrayArrayArray3[arg1][arg6 + local379][arg3 + local383] = (byte) local361;
							}
						}
					}
				}
				if (local52.anInt3008 != 0 && arg7 != null) {
					arg7.method2160(arg3, local52.aBoolean205, local65, local68, arg6);
				}
			} else if (arg4 >= 12) {
				if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
					local255 = local52.method2193(local160, arg4, local134, local176, arg0, local168);
				} else {
					local255 = new Class3_Sub1_Sub4_Sub6(arg2, arg4, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
				}
				arg5.method1161(arg1, arg6, arg3, local160, 1, 1, local255, 0, local188, local204);
				if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg1 > 0) {
					Static5.anIntArrayArrayArray1[arg1][arg6][arg3] |= 0x924;
				}
				if (local52.anInt3008 != 0 && arg7 != null) {
					arg7.method2160(arg3, local52.aBoolean205, local65, local68, arg6);
				}
			} else if (arg4 == 0) {
				if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
					local255 = local52.method2193(local160, 0, local134, local176, arg0, local168);
				} else {
					local255 = new Class3_Sub1_Sub4_Sub6(arg2, 0, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
				}
				arg5.method1146(arg1, arg6, arg3, local160, local255, null, Static50.anIntArray116[arg0], 0, local188, local204);
				if (arg0 == 0) {
					if (local52.aBoolean202) {
						Static65.aByteArrayArrayArray3[arg1][arg6][arg3] = 50;
						Static65.aByteArrayArrayArray3[arg1][arg6][arg3 + 1] = 50;
					}
					if (local52.aBoolean199) {
						Static5.anIntArrayArrayArray1[arg1][arg6][arg3] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local52.aBoolean202) {
						Static65.aByteArrayArrayArray3[arg1][arg6][arg3 + 1] = 50;
						Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean199) {
						Static5.anIntArrayArrayArray1[arg1][arg6][arg3 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local52.aBoolean202) {
						Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3] = 50;
						Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean199) {
						Static5.anIntArrayArrayArray1[arg1][arg6 + 1][arg3] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local52.aBoolean202) {
						Static65.aByteArrayArrayArray3[arg1][arg6][arg3] = 50;
						Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3] = 50;
					}
					if (local52.aBoolean199) {
						Static5.anIntArrayArrayArray1[arg1][arg6][arg3] |= 0x492;
					}
				}
				if (local52.anInt3008 != 0 && arg7 != null) {
					arg7.method2154(arg4, local52.aBoolean205, arg6, arg0, arg3);
				}
				if (local52.anInt3011 != 16) {
					arg5.method1156(arg1, arg6, arg3, local52.anInt3011);
				}
			} else {
				@Pc(847) Class3_Sub1_Sub4 local847;
				if (arg4 == 1) {
					if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
						local847 = local52.method2193(local160, 1, local134, local176, arg0, local168);
					} else {
						local847 = new Class3_Sub1_Sub4_Sub6(arg2, 1, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
					}
					arg5.method1146(arg1, arg6, arg3, local160, local847, null, Static138.anIntArray332[arg0], 0, local188, local204);
					if (local52.aBoolean202) {
						if (arg0 == 0) {
							Static65.aByteArrayArrayArray3[arg1][arg6][arg3 + 1] = 50;
						} else if (arg0 == 1) {
							Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3 + 1] = 50;
						} else if (arg0 == 2) {
							Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3] = 50;
						} else if (arg0 == 3) {
							Static65.aByteArrayArrayArray3[arg1][arg6][arg3] = 50;
						}
					}
					if (local52.anInt3008 != 0 && arg7 != null) {
						arg7.method2154(arg4, local52.aBoolean205, arg6, arg0, arg3);
					}
				} else {
					@Pc(1006) Class3_Sub1_Sub4 local1006;
					if (arg4 == 2) {
						local361 = arg0 + 1 & 0x3;
						@Pc(992) Class3_Sub1_Sub4 local992;
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local992 = local52.method2193(local160, 2, local134, local176, arg0 + 4, local168);
							local1006 = local52.method2193(local160, 2, local134, local176, local361, local168);
						} else {
							local992 = new Class3_Sub1_Sub4_Sub6(arg2, 2, arg0 + 4, arg1, arg6, arg3, local52.anInt3022, true, null);
							local1006 = new Class3_Sub1_Sub4_Sub6(arg2, 2, local361, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1146(arg1, arg6, arg3, local160, local992, local1006, Static50.anIntArray116[arg0], Static50.anIntArray116[local361], local188, local204);
						if (local52.aBoolean199) {
							if (arg0 == 0) {
								Static5.anIntArrayArrayArray1[arg1][arg6][arg3] |= 0x249;
								Static5.anIntArrayArrayArray1[arg1][arg6][arg3 + 1] |= 0x492;
							} else if (arg0 == 1) {
								Static5.anIntArrayArrayArray1[arg1][arg6][arg3 + 1] |= 0x492;
								Static5.anIntArrayArrayArray1[arg1][arg6 + 1][arg3] |= 0x249;
							} else if (arg0 == 2) {
								Static5.anIntArrayArrayArray1[arg1][arg6 + 1][arg3] |= 0x249;
								Static5.anIntArrayArrayArray1[arg1][arg6][arg3] |= 0x492;
							} else if (arg0 == 3) {
								Static5.anIntArrayArrayArray1[arg1][arg6][arg3] |= 0x492;
								Static5.anIntArrayArrayArray1[arg1][arg6][arg3] |= 0x249;
							}
						}
						if (local52.anInt3008 != 0 && arg7 != null) {
							arg7.method2154(arg4, local52.aBoolean205, arg6, arg0, arg3);
						}
						if (local52.anInt3011 != 16) {
							arg5.method1156(arg1, arg6, arg3, local52.anInt3011);
						}
					} else if (arg4 == 3) {
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local847 = local52.method2193(local160, 3, local134, local176, arg0, local168);
						} else {
							local847 = new Class3_Sub1_Sub4_Sub6(arg2, 3, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1146(arg1, arg6, arg3, local160, local847, null, Static138.anIntArray332[arg0], 0, local188, local204);
						if (local52.aBoolean202) {
							if (arg0 == 0) {
								Static65.aByteArrayArrayArray3[arg1][arg6][arg3 + 1] = 50;
							} else if (arg0 == 1) {
								Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3 + 1] = 50;
							} else if (arg0 == 2) {
								Static65.aByteArrayArrayArray3[arg1][arg6 + 1][arg3] = 50;
							} else if (arg0 == 3) {
								Static65.aByteArrayArrayArray3[arg1][arg6][arg3] = 50;
							}
						}
						if (local52.anInt3008 != 0 && arg7 != null) {
							arg7.method2154(arg4, local52.aBoolean205, arg6, arg0, arg3);
						}
					} else if (arg4 == 9) {
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local847 = local52.method2193(local160, arg4, local134, local176, arg0, local168);
						} else {
							local847 = new Class3_Sub1_Sub4_Sub6(arg2, arg4, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1161(arg1, arg6, arg3, local160, 1, 1, local847, 0, local188, local204);
						if (local52.anInt3008 != 0 && arg7 != null) {
							arg7.method2160(arg3, local52.aBoolean205, local65, local68, arg6);
						}
						if (local52.anInt3011 != 16) {
							arg5.method1156(arg1, arg6, arg3, local52.anInt3011);
						}
					} else if (arg4 == 4) {
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local847 = local52.method2193(local160, 4, local134, local176, arg0, local168);
						} else {
							local847 = new Class3_Sub1_Sub4_Sub6(arg2, 4, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1170(arg1, arg6, arg3, local160, local847, null, Static50.anIntArray116[arg0], 0, 0, 0, local188, local204);
					} else if (arg4 == 5) {
						local379 = arg5.method1149(arg1, arg6, arg3);
						local361 = 16;
						if (local379 != 0) {
							local361 = Static151.method2466(local379 >> 14 & 0x7FFF).anInt3011;
						}
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local1006 = local52.method2193(local160, 4, local134, local176, arg0, local168);
						} else {
							local1006 = new Class3_Sub1_Sub4_Sub6(arg2, 4, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1170(arg1, arg6, arg3, local160, local1006, null, Static50.anIntArray116[arg0], 0, local361 * Static111.anIntArray300[arg0], Static41.anIntArray93[arg0] * local361, local188, local204);
					} else if (arg4 == 6) {
						local379 = arg5.method1149(arg1, arg6, arg3);
						local361 = 8;
						if (local379 != 0) {
							local361 = Static151.method2466(local379 >> 14 & 0x7FFF).anInt3011 / 2;
						}
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local1006 = local52.method2193(local160, 4, local134, local176, arg0 + 4, local168);
						} else {
							local1006 = new Class3_Sub1_Sub4_Sub6(arg2, 4, arg0 + 4, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1170(arg1, arg6, arg3, local160, local1006, null, 256, arg0, local361 * Static17.anIntArray396[arg0], Static46.anIntArray98[arg0] * local361, local188, local204);
					} else if (arg4 == 7) {
						local379 = arg0 + 2 & 0x3;
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local847 = local52.method2193(local160, 4, local134, local176, local379 + 4, local168);
						} else {
							local847 = new Class3_Sub1_Sub4_Sub6(arg2, 4, local379 + 4, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1170(arg1, arg6, arg3, local160, local847, null, 256, local379, 0, 0, local188, local204);
					} else if (arg4 == 8) {
						local361 = 8;
						local379 = arg5.method1149(arg1, arg6, arg3);
						if (local379 != 0) {
							local361 = Static151.method2466(local379 >> 14 & 0x7FFF).anInt3011 / 2;
						}
						@Pc(1767) int local1767 = arg0 + 2 & 0x3;
						@Pc(1807) Class3_Sub1_Sub4 local1807;
						if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
							local1006 = local52.method2193(local160, 4, local134, local176, arg0 + 4, local168);
							local1807 = local52.method2193(local160, 4, local134, local176, local1767 + 4, local168);
						} else {
							local1006 = new Class3_Sub1_Sub4_Sub6(arg2, 4, arg0 + 4, arg1, arg6, arg3, local52.anInt3022, true, null);
							local1807 = new Class3_Sub1_Sub4_Sub6(arg2, 4, local1767 + 4, arg1, arg6, arg3, local52.anInt3022, true, null);
						}
						arg5.method1170(arg1, arg6, arg3, local160, local1006, local1807, 256, arg0, local361 * Static17.anIntArray396[arg0], local361 * Static46.anIntArray98[arg0], local188, local204);
					}
				}
			}
		} else if (!Static85.aBoolean127 || local52.anInt3017 != 0 || local52.anInt3008 == 1 || local52.aBoolean200) {
			if (local52.anInt3022 == -1 && local52.anIntArray314 == null) {
				local255 = local52.method2193(local160, 22, local134, local176, arg0, local168);
			} else {
				local255 = new Class3_Sub1_Sub4_Sub6(arg2, 22, arg0, arg1, arg6, arg3, local52.anInt3022, true, null);
			}
			arg5.method1145(arg1, arg6, arg3, local160, local255, local188, local204);
			if (local52.anInt3008 == 1 && arg7 != null) {
				arg7.method2148(arg3, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!vd;)I")
	public static int method484(@OriginalArg(1) Class83 arg0) {
		@Pc(24) Class3_Sub7 local24 = (Class3_Sub7) Static146.aClass16_10.method554((long) arg0.anInt3677 + ((long) arg0.anInt3676 << 32));
		return local24 == null ? arg0.anInt3685 : local24.anInt845;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method485() {
		aClass44_2 = null;
		aClass3_Sub1_Sub3_Sub4Array4 = null;
		aClass73_360 = null;
		aBigInteger2 = null;
		aClass73_359 = null;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method486() {
		if (!Static83.aBoolean120) {
			return;
		}
		Static17.anIntArray397 = null;
		Static32.aClass3_Sub1_Sub3_Sub4_7 = null;
		Static47.aClass3_Sub1_Sub3_Sub3Array19 = null;
		Static3.aClass3_Sub1_Sub3_Sub3Array1 = null;
		Static39.aClass3_Sub1_Sub3_Sub4_9 = null;
		Static157.anIntArray372 = null;
		Static2.anIntArray2 = null;
		Static67.aClass3_Sub1_Sub3_Sub4_13 = null;
		Static84.anIntArray192 = null;
		Static170.aClass3_Sub1_Sub3_Sub3_15 = null;
		Static160.aClass3_Sub1_Sub3_Sub3Array41 = null;
		aClass3_Sub1_Sub3_Sub4Array4 = null;
		Static38.aClass3_Sub1_Sub3_Sub3_13 = null;
		Static143.aClass3_Sub1_Sub3_Sub3_14 = null;
		Static53.aClass3_Sub1_Sub3_Sub4_45 = null;
		Static39.aClass3_Sub1_Sub3_Sub3_4 = null;
		Static122.anIntArray72 = null;
		Static37.anIntArray92 = null;
		Static175.anIntArray417 = null;
		Static82.anIntArray189 = null;
		Static12.aClass3_Sub1_Sub3_Sub3Array5 = null;
		Static37.aClass3_Sub1_Sub3_Sub3Array10 = null;
		Static47.method1372();
		Static44.method789(true);
		Static83.aBoolean120 = false;
	}
}
