import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "[[Lclient!te;")
	public static Class3_Sub1_Sub17[][] aClass3_Sub1_Sub17ArrayArray3;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!bd;")
	public static Class9 aClass9_12 = new Class9(200);

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
	public static int[] anIntArray134 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[I")
	public static int[] anIntArray135 = new int[100];

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
	public static int anInt1151 = 0;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!ae;")
	private static Class5 aClass5_524 = Static56.method972("Sorry invited players only)3");

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "Lclient!ae;")
	public static Class5 aClass5_525 = aClass5_524;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "Lclient!ae;")
	public static Class5 aClass5_526 = Static56.method972("Side panel redrawn");

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	public static int anInt1152 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!l;IIIILclient!h;ZI)V")
	public static void method773(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class30 arg6, @OriginalArg(8) int arg7) {
		if (Static74.aBoolean91 && (Static93.aByteArrayArrayArray5[0][arg5][arg2] & 0x2) == 0) {
			if ((Static93.aByteArrayArrayArray5[arg4][arg5][arg2] & 0x10) != 0) {
				return;
			}
			if (Static74.method1230(arg2, arg5, arg4) != Static83.anInt2037) {
				return;
			}
		}
		if (arg4 < Static38.anInt1058) {
			Static38.anInt1058 = arg4;
		}
		@Pc(53) int local53 = Static111.anIntArrayArrayArray7[arg4][arg5][arg2];
		@Pc(63) int local63 = Static111.anIntArrayArrayArray7[arg4][arg5][arg2 + 1];
		@Pc(75) int local75 = Static111.anIntArrayArrayArray7[arg4][arg5 + 1][arg2 + 1];
		@Pc(85) int local85 = Static111.anIntArrayArrayArray7[arg4][arg5 + 1][arg2];
		@Pc(96) int local96 = local75 + local53 + local85 + local63 >> 2;
		@Pc(100) Class3_Sub1_Sub15 local100 = Static72.method1211(arg3);
		@Pc(114) int local114 = arg5 + (arg2 << 7) + (arg3 << 14) + 1073741824;
		if (local100.anInt2324 == 0) {
			local114 += Integer.MIN_VALUE;
		}
		@Pc(130) int local130 = (arg7 << 6) + arg0;
		if (local100.anInt2339 == 1) {
			local130 += 256;
		}
		if (local100.method1523()) {
			Static40.method758(arg2, arg7, arg5, local100, arg4);
		}
		@Pc(180) Class3_Sub1_Sub1 local180;
		if (arg0 != 22) {
			@Pc(278) int local278;
			if (arg0 == 10 || arg0 == 11) {
				if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
					local180 = local100.method1531(10, local53, arg7, local63, local75, local85);
				} else {
					local180 = new Class3_Sub1_Sub1_Sub3(arg3, 10, arg7, local53, local85, local75, local63, local100.anInt2323, true, null);
				}
				if (local180 != null) {
					@Pc(275) int local275;
					if (arg7 == 1 || arg7 == 3) {
						local275 = local100.anInt2312;
						local278 = local100.anInt2331;
					} else {
						local275 = local100.anInt2331;
						local278 = local100.anInt2312;
					}
					@Pc(288) int local288 = 0;
					if (arg0 == 11) {
						local288 += 256;
					}
					if (arg1.method1039(arg4, arg5, arg2, local96, local278, local275, local180, local288, local114, local130) && local100.aBoolean118) {
						@Pc(323) Class3_Sub1_Sub1_Sub6 local323;
						if (local180 instanceof Class3_Sub1_Sub1_Sub6) {
							local323 = (Class3_Sub1_Sub1_Sub6) local180;
						} else {
							local323 = local100.method1531(10, local53, arg7, local63, local75, local85);
						}
						if (local323 != null) {
							for (@Pc(332) int local332 = 0; local332 <= local278; local332++) {
								for (@Pc(336) int local336 = 0; local336 <= local275; local336++) {
									@Pc(343) int local343 = local323.method1819() / 4;
									if (local343 > 30) {
										local343 = 30;
									}
									if (local343 > Static19.aByteArrayArrayArray2[arg4][arg5 + local332][local336 + arg2]) {
										Static19.aByteArrayArrayArray2[arg4][arg5 + local332][arg2 + local336] = (byte) local343;
									}
								}
							}
						}
					}
				}
				if (local100.aBoolean112 && arg6 != null) {
					arg6.method707(local100.aBoolean114, arg5, local100.anInt2312, arg2, local100.anInt2331, arg7);
				}
			} else if (arg0 >= 12) {
				if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
					local180 = local100.method1531(arg0, local53, arg7, local63, local75, local85);
				} else {
					local180 = new Class3_Sub1_Sub1_Sub3(arg3, arg0, arg7, local53, local85, local75, local63, local100.anInt2323, true, null);
				}
				arg1.method1039(arg4, arg5, arg2, local96, 1, 1, local180, 0, local114, local130);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
					Static78.anIntArrayArrayArray4[arg4][arg5][arg2] |= 0x924;
				}
				if (local100.aBoolean112 && arg6 != null) {
					arg6.method707(local100.aBoolean114, arg5, local100.anInt2312, arg2, local100.anInt2331, arg7);
				}
			} else if (arg0 == 0) {
				if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
					local180 = local100.method1531(0, local53, arg7, local63, local75, local85);
				} else {
					local180 = new Class3_Sub1_Sub1_Sub3(arg3, 0, arg7, local53, local85, local75, local63, local100.anInt2323, true, null);
				}
				arg1.method1061(arg4, arg5, arg2, local96, local180, null, Static102.anIntArray302[arg7], 0, local114, local130);
				if (arg7 == 0) {
					if (local100.aBoolean118) {
						Static19.aByteArrayArrayArray2[arg4][arg5][arg2] = 50;
						Static19.aByteArrayArrayArray2[arg4][arg5][arg2 + 1] = 50;
					}
					if (local100.aBoolean113) {
						Static78.anIntArrayArrayArray4[arg4][arg5][arg2] |= 0x249;
					}
				} else if (arg7 == 1) {
					if (local100.aBoolean118) {
						Static19.aByteArrayArrayArray2[arg4][arg5][arg2 + 1] = 50;
						Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2 + 1] = 50;
					}
					if (local100.aBoolean113) {
						Static78.anIntArrayArrayArray4[arg4][arg5][arg2 + 1] |= 0x492;
					}
				} else if (arg7 == 2) {
					if (local100.aBoolean118) {
						Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2] = 50;
						Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2 + 1] = 50;
					}
					if (local100.aBoolean113) {
						Static78.anIntArrayArrayArray4[arg4][arg5 + 1][arg2] |= 0x249;
					}
				} else if (arg7 == 3) {
					if (local100.aBoolean118) {
						Static19.aByteArrayArrayArray2[arg4][arg5][arg2] = 50;
						Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2] = 50;
					}
					if (local100.aBoolean113) {
						Static78.anIntArrayArrayArray4[arg4][arg5][arg2] |= 0x492;
					}
				}
				if (local100.aBoolean112 && arg6 != null) {
					arg6.method705(arg5, local100.aBoolean114, arg2, arg7, arg0);
				}
				if (local100.anInt2322 != 16) {
					arg1.method1023(arg4, arg5, arg2, local100.anInt2322);
				}
			} else if (arg0 == 1) {
				if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
					local180 = local100.method1531(1, local53, arg7, local63, local75, local85);
				} else {
					local180 = new Class3_Sub1_Sub1_Sub3(arg3, 1, arg7, local53, local85, local75, local63, local100.anInt2323, true, null);
				}
				arg1.method1061(arg4, arg5, arg2, local96, local180, null, anIntArray134[arg7], 0, local114, local130);
				if (local100.aBoolean118) {
					if (arg7 == 0) {
						Static19.aByteArrayArrayArray2[arg4][arg5][arg2 + 1] = 50;
					} else if (arg7 == 1) {
						Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2 + 1] = 50;
					} else if (arg7 == 2) {
						Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2] = 50;
					} else if (arg7 == 3) {
						Static19.aByteArrayArrayArray2[arg4][arg5][arg2] = 50;
					}
				}
				if (local100.aBoolean112 && arg6 != null) {
					arg6.method705(arg5, local100.aBoolean114, arg2, arg7, arg0);
				}
			} else {
				@Pc(929) int local929;
				@Pc(959) Class3_Sub1_Sub1 local959;
				if (arg0 == 2) {
					local929 = arg7 + 1 & 0x3;
					@Pc(949) Class3_Sub1_Sub1 local949;
					if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
						local949 = local100.method1531(2, local53, arg7 + 4, local63, local75, local85);
						local959 = local100.method1531(2, local53, local929, local63, local75, local85);
					} else {
						local949 = new Class3_Sub1_Sub1_Sub3(arg3, 2, arg7 + 4, local53, local85, local75, local63, local100.anInt2323, true, null);
						local959 = new Class3_Sub1_Sub1_Sub3(arg3, 2, local929, local53, local85, local75, local63, local100.anInt2323, true, null);
					}
					arg1.method1061(arg4, arg5, arg2, local96, local949, local959, Static102.anIntArray302[arg7], Static102.anIntArray302[local929], local114, local130);
					if (local100.aBoolean113) {
						if (arg7 == 0) {
							Static78.anIntArrayArrayArray4[arg4][arg5][arg2] |= 0x249;
							Static78.anIntArrayArrayArray4[arg4][arg5][arg2 + 1] |= 0x492;
						} else if (arg7 == 1) {
							Static78.anIntArrayArrayArray4[arg4][arg5][arg2 + 1] |= 0x492;
							Static78.anIntArrayArrayArray4[arg4][arg5 + 1][arg2] |= 0x249;
						} else if (arg7 == 2) {
							Static78.anIntArrayArrayArray4[arg4][arg5 + 1][arg2] |= 0x249;
							Static78.anIntArrayArrayArray4[arg4][arg5][arg2] |= 0x492;
						} else if (arg7 == 3) {
							Static78.anIntArrayArrayArray4[arg4][arg5][arg2] |= 0x492;
							Static78.anIntArrayArrayArray4[arg4][arg5][arg2] |= 0x249;
						}
					}
					if (local100.aBoolean112 && arg6 != null) {
						arg6.method705(arg5, local100.aBoolean114, arg2, arg7, arg0);
					}
					if (local100.anInt2322 != 16) {
						arg1.method1023(arg4, arg5, arg2, local100.anInt2322);
					}
				} else if (arg0 == 3) {
					if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
						local180 = local100.method1531(3, local53, arg7, local63, local75, local85);
					} else {
						local180 = new Class3_Sub1_Sub1_Sub3(arg3, 3, arg7, local53, local85, local75, local63, local100.anInt2323, true, null);
					}
					arg1.method1061(arg4, arg5, arg2, local96, local180, null, anIntArray134[arg7], 0, local114, local130);
					if (local100.aBoolean118) {
						if (arg7 == 0) {
							Static19.aByteArrayArrayArray2[arg4][arg5][arg2 + 1] = 50;
						} else if (arg7 == 1) {
							Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2 + 1] = 50;
						} else if (arg7 == 2) {
							Static19.aByteArrayArrayArray2[arg4][arg5 + 1][arg2] = 50;
						} else if (arg7 == 3) {
							Static19.aByteArrayArrayArray2[arg4][arg5][arg2] = 50;
						}
					}
					if (local100.aBoolean112 && arg6 != null) {
						arg6.method705(arg5, local100.aBoolean114, arg2, arg7, arg0);
					}
				} else if (arg0 == 9) {
					if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
						local180 = local100.method1531(arg0, local53, arg7, local63, local75, local85);
					} else {
						local180 = new Class3_Sub1_Sub1_Sub3(arg3, arg0, arg7, local53, local85, local75, local63, local100.anInt2323, true, null);
					}
					arg1.method1039(arg4, arg5, arg2, local96, 1, 1, local180, 0, local114, local130);
					if (local100.aBoolean112 && arg6 != null) {
						arg6.method707(local100.aBoolean114, arg5, local100.anInt2312, arg2, local100.anInt2331, arg7);
					}
				} else {
					if (local100.aBoolean116) {
						if (arg7 == 1) {
							local929 = local63;
							local63 = local75;
							local75 = local85;
							local85 = local53;
							local53 = local929;
						} else if (arg7 == 2) {
							local929 = local63;
							local63 = local85;
							local85 = local929;
							@Pc(1427) int local1427 = local75;
							local75 = local53;
							local53 = local1427;
						} else if (arg7 == 3) {
							local929 = local63;
							local63 = local53;
							local53 = local85;
							local85 = local75;
							local75 = local929;
						}
					}
					if (arg0 == 4) {
						if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
							local180 = local100.method1531(4, local53, 0, local63, local75, local85);
						} else {
							local180 = new Class3_Sub1_Sub1_Sub3(arg3, 4, 0, local53, local85, local75, local63, local100.anInt2323, true, null);
						}
						arg1.method1021(arg4, arg5, arg2, local96, local180, Static102.anIntArray302[arg7], arg7 * 512, 0, 0, local114, local130);
					} else if (arg0 == 5) {
						local929 = 16;
						local278 = arg1.method1035(arg4, arg5, arg2);
						if (local278 > 0) {
							local929 = Static72.method1211(local278 >> 14 & 0x7FFF).anInt2322;
						}
						if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
							local959 = local100.method1531(4, local53, 0, local63, local75, local85);
						} else {
							local959 = new Class3_Sub1_Sub1_Sub3(arg3, 4, 0, local53, local85, local75, local63, local100.anInt2323, true, null);
						}
						arg1.method1021(arg4, arg5, arg2, local96, local959, Static102.anIntArray302[arg7], arg7 * 512, local929 * Static92.anIntArray269[arg7], local929 * Static91.anIntArray266[arg7], local114, local130);
					} else if (arg0 == 6) {
						if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
							local180 = local100.method1531(4, local53, 0, local63, local75, local85);
						} else {
							local180 = new Class3_Sub1_Sub1_Sub3(arg3, 4, 0, local53, local85, local75, local63, local100.anInt2323, true, null);
						}
						arg1.method1021(arg4, arg5, arg2, local96, local180, 256, arg7, 0, 0, local114, local130);
					} else if (arg0 == 7) {
						if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
							local180 = local100.method1531(4, local53, 0, local63, local75, local85);
						} else {
							local180 = new Class3_Sub1_Sub1_Sub3(arg3, 4, 0, local53, local85, local75, local63, local100.anInt2323, true, null);
						}
						arg1.method1021(arg4, arg5, arg2, local96, local180, 512, arg7, 0, 0, local114, local130);
					} else if (arg0 == 8) {
						if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
							local180 = local100.method1531(4, local53, 0, local63, local75, local85);
						} else {
							local180 = new Class3_Sub1_Sub1_Sub3(arg3, 4, 0, local53, local85, local75, local63, local100.anInt2323, true, null);
						}
						arg1.method1021(arg4, arg5, arg2, local96, local180, 768, arg7, 0, 0, local114, local130);
					}
				}
			}
		} else if (!Static74.aBoolean91 || local100.anInt2324 != 0 || local100.aBoolean119) {
			if (local100.anInt2323 == -1 && local100.anIntArray263 == null) {
				local180 = local100.method1531(22, local53, arg7, local63, local75, local85);
			} else {
				local180 = new Class3_Sub1_Sub1_Sub3(arg3, 22, arg7, local53, local85, local75, local63, local100.anInt2323, true, null);
			}
			arg1.method1037(arg4, arg5, arg2, local96, local180, local114, local130);
			if (local100.aBoolean112 && local100.anInt2324 == 1 && arg6 != null) {
				arg6.method709(arg2, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!lb;)V")
	public static void method777(@OriginalArg(1) Class43 arg0) {
		Static35.aClass43_1 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(IB)Lclient!ne;")
	public static Class3_Sub1_Sub11 method778(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub11 local15 = (Class3_Sub1_Sub11) Static4.aClass9_5.method282((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static79.aClass11_44.method1882(12, arg0);
		local15 = new Class3_Sub1_Sub11();
		if (local25 != null) {
			local15.method1251(new Class3_Sub6(local25));
		}
		local15.method1255();
		Static4.aClass9_5.method284(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
	public static int method780(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static82.anIntArray227[arg0];
		@Pc(11) int local11 = (local3 * Static50.anInt1355 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	public static void method781() {
		aClass5_525 = null;
		aClass5_524 = null;
		aClass9_12 = null;
		aClass3_Sub1_Sub17ArrayArray3 = null;
		anIntArray134 = null;
		aClass5_526 = null;
		anIntArray135 = null;
	}
}
