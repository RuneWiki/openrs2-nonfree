import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!jd", name = "jb", descriptor = "Lclient!lc;")
	public static Class40 aClass40_43;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array10 = new Class60[1000];

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "Lclient!mf;")
	public static Class48 aClass48_34 = new Class48(50);

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_537 = Static121.method2047("sl_button");

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)V")
	public static void method1024() {
		aClass40_43 = null;
		aClass60_537 = null;
		aClass60Array10 = null;
		aClass48_34 = null;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lclient!lc;III)Lclient!qf;")
	public static Class4_Sub4_Sub3_Sub4 method1025(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static13.method279(arg2, arg0, arg1) ? Static65.method1285() : null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIILclient!m;Lclient!ha;ZI)V")
	public static void method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class45 arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(8) int arg7) {
		if (Static61.aBoolean57 && (Static95.aByteArrayArrayArray5[0][arg3][arg1] & 0x2) == 0) {
			if ((Static95.aByteArrayArrayArray5[arg2][arg3][arg1] & 0x10) != 0) {
				return;
			}
			if (Static62.method1264(arg3, arg1, arg2) != Static127.anInt2976) {
				return;
			}
		}
		if (arg2 < Static128.anInt2644) {
			Static128.anInt2644 = arg2;
		}
		@Pc(58) int local58 = Static58.anIntArrayArrayArray5[arg2][arg3 + 1][arg1];
		@Pc(70) int local70 = Static58.anIntArrayArrayArray5[arg2][arg3 + 1][arg1 + 1];
		@Pc(78) int local78 = Static58.anIntArrayArrayArray5[arg2][arg3][arg1];
		@Pc(92) int local92 = Static58.anIntArrayArrayArray5[arg2][arg3][arg1 + 1];
		@Pc(105) int local105 = arg3 + (arg1 << 7) + (arg4 << 14) + 1073741824;
		@Pc(109) Class4_Sub4_Sub5 local109 = Static24.method477(arg4);
		@Pc(115) int local115 = arg0 + (arg7 << 6);
		if (local109.anInt1102 == 0) {
			local105 += Integer.MIN_VALUE;
		}
		if (local109.anInt1086 == 1) {
			local115 += 256;
		}
		if (local109.method731()) {
			Static61.method1123(arg1, arg2, arg3, arg7, local109);
		}
		@Pc(150) int local150 = local78 + local58 + local70 + local92 >> 2;
		@Pc(192) Class4_Sub4_Sub1 local192;
		if (arg0 != 22) {
			@Pc(289) int local289;
			if (arg0 == 10 || arg0 == 11) {
				if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
					local192 = local109.method732(10, local58, local70, local92, local78, arg7);
				} else {
					local192 = new Class4_Sub4_Sub1_Sub3(arg4, 10, arg7, local78, local58, local70, local92, local109.anInt1078, true, null);
				}
				if (local192 != null) {
					@Pc(274) int local274 = 0;
					if (arg0 == 11) {
						local274 += 256;
					}
					@Pc(292) int local292;
					if (arg7 == 1 || arg7 == 3) {
						local289 = local109.anInt1085;
						local292 = local109.anInt1075;
					} else {
						local289 = local109.anInt1075;
						local292 = local109.anInt1085;
					}
					if (arg6.method785(arg2, arg3, arg1, local150, local289, local292, local192, local274, local105, local115) && local109.aBoolean32) {
						@Pc(318) int local318 = 15;
						if (local192 instanceof Class4_Sub4_Sub1_Sub6) {
							local318 = ((Class4_Sub4_Sub1_Sub6) local192).method1795() / 4;
							if (local318 > 30) {
								local318 = 30;
							}
						}
						for (@Pc(336) int local336 = 0; local336 <= local289; local336++) {
							for (@Pc(340) int local340 = 0; local340 <= local292; local340++) {
								if (Static36.aByteArrayArrayArray2[arg2][arg3 + local336][arg1 + local340] < local318) {
									Static36.aByteArrayArrayArray2[arg2][arg3 + local336][arg1 + local340] = (byte) local318;
								}
							}
						}
					}
				}
				if (local109.anInt1080 != 0 && arg5 != null) {
					arg5.method1325(local109.anInt1075, arg7, arg1, arg3, local109.aBoolean38, local109.anInt1085);
				}
			} else if (arg0 >= 12) {
				if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
					local192 = local109.method732(arg0, local58, local70, local92, local78, arg7);
				} else {
					local192 = new Class4_Sub4_Sub1_Sub3(arg4, arg0, arg7, local78, local58, local70, local92, local109.anInt1078, true, null);
				}
				arg6.method785(arg2, arg3, arg1, local150, 1, 1, local192, 0, local105, local115);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
					Static123.anIntArrayArrayArray7[arg2][arg3][arg1] |= 0x924;
				}
				if (local109.anInt1080 != 0 && arg5 != null) {
					arg5.method1325(local109.anInt1075, arg7, arg1, arg3, local109.aBoolean38, local109.anInt1085);
				}
			} else if (arg0 == 0) {
				if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
					local192 = local109.method732(0, local58, local70, local92, local78, arg7);
				} else {
					local192 = new Class4_Sub4_Sub1_Sub3(arg4, 0, arg7, local78, local58, local70, local92, local109.anInt1078, true, null);
				}
				arg6.method795(arg2, arg3, arg1, local150, local192, null, Static99.anIntArray244[arg7], 0, local105, local115);
				if (arg7 == 0) {
					if (local109.aBoolean32) {
						Static36.aByteArrayArrayArray2[arg2][arg3][arg1] = 50;
						Static36.aByteArrayArrayArray2[arg2][arg3][arg1 + 1] = 50;
					}
					if (local109.aBoolean39) {
						Static123.anIntArrayArrayArray7[arg2][arg3][arg1] |= 0x249;
					}
				} else if (arg7 == 1) {
					if (local109.aBoolean32) {
						Static36.aByteArrayArrayArray2[arg2][arg3][arg1 + 1] = 50;
						Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1 + 1] = 50;
					}
					if (local109.aBoolean39) {
						Static123.anIntArrayArrayArray7[arg2][arg3][arg1 + 1] |= 0x492;
					}
				} else if (arg7 == 2) {
					if (local109.aBoolean32) {
						Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1] = 50;
						Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1 + 1] = 50;
					}
					if (local109.aBoolean39) {
						Static123.anIntArrayArrayArray7[arg2][arg3 + 1][arg1] |= 0x249;
					}
				} else if (arg7 == 3) {
					if (local109.aBoolean32) {
						Static36.aByteArrayArrayArray2[arg2][arg3][arg1] = 50;
						Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1] = 50;
					}
					if (local109.aBoolean39) {
						Static123.anIntArrayArrayArray7[arg2][arg3][arg1] |= 0x492;
					}
				}
				if (local109.anInt1080 != 0 && arg5 != null) {
					arg5.method1337(arg7, arg0, local109.aBoolean38, arg3, arg1);
				}
				if (local109.anInt1113 != 16) {
					arg6.method792(arg2, arg3, arg1, local109.anInt1113);
				}
			} else if (arg0 == 1) {
				if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
					local192 = local109.method732(1, local58, local70, local92, local78, arg7);
				} else {
					local192 = new Class4_Sub4_Sub1_Sub3(arg4, 1, arg7, local78, local58, local70, local92, local109.anInt1078, true, null);
				}
				arg6.method795(arg2, arg3, arg1, local150, local192, null, Static18.anIntArray30[arg7], 0, local105, local115);
				if (local109.aBoolean32) {
					if (arg7 == 0) {
						Static36.aByteArrayArrayArray2[arg2][arg3][arg1 + 1] = 50;
					} else if (arg7 == 1) {
						Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1 + 1] = 50;
					} else if (arg7 == 2) {
						Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1] = 50;
					} else if (arg7 == 3) {
						Static36.aByteArrayArrayArray2[arg2][arg3][arg1] = 50;
					}
				}
				if (local109.anInt1080 != 0 && arg5 != null) {
					arg5.method1337(arg7, arg0, local109.aBoolean38, arg3, arg1);
				}
			} else {
				@Pc(936) int local936;
				@Pc(965) Class4_Sub4_Sub1 local965;
				if (arg0 == 2) {
					local936 = arg7 + 1 & 0x3;
					@Pc(955) Class4_Sub4_Sub1 local955;
					if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
						local955 = local109.method732(2, local58, local70, local92, local78, arg7 + 4);
						local965 = local109.method732(2, local58, local70, local92, local78, local936);
					} else {
						local955 = new Class4_Sub4_Sub1_Sub3(arg4, 2, arg7 + 4, local78, local58, local70, local92, local109.anInt1078, true, null);
						local965 = new Class4_Sub4_Sub1_Sub3(arg4, 2, local936, local78, local58, local70, local92, local109.anInt1078, true, null);
					}
					arg6.method795(arg2, arg3, arg1, local150, local955, local965, Static99.anIntArray244[arg7], Static99.anIntArray244[local936], local105, local115);
					if (local109.aBoolean39) {
						if (arg7 == 0) {
							Static123.anIntArrayArrayArray7[arg2][arg3][arg1] |= 0x249;
							Static123.anIntArrayArrayArray7[arg2][arg3][arg1 + 1] |= 0x492;
						} else if (arg7 == 1) {
							Static123.anIntArrayArrayArray7[arg2][arg3][arg1 + 1] |= 0x492;
							Static123.anIntArrayArrayArray7[arg2][arg3 + 1][arg1] |= 0x249;
						} else if (arg7 == 2) {
							Static123.anIntArrayArrayArray7[arg2][arg3 + 1][arg1] |= 0x249;
							Static123.anIntArrayArrayArray7[arg2][arg3][arg1] |= 0x492;
						} else if (arg7 == 3) {
							Static123.anIntArrayArrayArray7[arg2][arg3][arg1] |= 0x492;
							Static123.anIntArrayArrayArray7[arg2][arg3][arg1] |= 0x249;
						}
					}
					if (local109.anInt1080 != 0 && arg5 != null) {
						arg5.method1337(arg7, arg0, local109.aBoolean38, arg3, arg1);
					}
					if (local109.anInt1113 != 16) {
						arg6.method792(arg2, arg3, arg1, local109.anInt1113);
					}
				} else if (arg0 == 3) {
					if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
						local192 = local109.method732(3, local58, local70, local92, local78, arg7);
					} else {
						local192 = new Class4_Sub4_Sub1_Sub3(arg4, 3, arg7, local78, local58, local70, local92, local109.anInt1078, true, null);
					}
					arg6.method795(arg2, arg3, arg1, local150, local192, null, Static18.anIntArray30[arg7], 0, local105, local115);
					if (local109.aBoolean32) {
						if (arg7 == 0) {
							Static36.aByteArrayArrayArray2[arg2][arg3][arg1 + 1] = 50;
						} else if (arg7 == 1) {
							Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1 + 1] = 50;
						} else if (arg7 == 2) {
							Static36.aByteArrayArrayArray2[arg2][arg3 + 1][arg1] = 50;
						} else if (arg7 == 3) {
							Static36.aByteArrayArrayArray2[arg2][arg3][arg1] = 50;
						}
					}
					if (local109.anInt1080 != 0 && arg5 != null) {
						arg5.method1337(arg7, arg0, local109.aBoolean38, arg3, arg1);
					}
				} else if (arg0 == 9) {
					if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
						local192 = local109.method732(arg0, local58, local70, local92, local78, arg7);
					} else {
						local192 = new Class4_Sub4_Sub1_Sub3(arg4, arg0, arg7, local78, local58, local70, local92, local109.anInt1078, true, null);
					}
					arg6.method785(arg2, arg3, arg1, local150, 1, 1, local192, 0, local105, local115);
					if (local109.anInt1080 != 0 && arg5 != null) {
						arg5.method1325(local109.anInt1075, arg7, arg1, arg3, local109.aBoolean38, local109.anInt1085);
					}
				} else {
					if (local109.aBoolean37) {
						if (arg7 == 1) {
							local936 = local92;
							local92 = local70;
							local70 = local58;
							local58 = local78;
							local78 = local936;
						} else if (arg7 == 2) {
							local936 = local92;
							local92 = local58;
							local58 = local936;
							local936 = local70;
							local70 = local78;
							local78 = local936;
						} else if (arg7 == 3) {
							local936 = local92;
							local92 = local78;
							local78 = local58;
							local58 = local70;
							local70 = local936;
						}
					}
					if (arg0 == 4) {
						if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
							local192 = local109.method732(4, local58, local70, local92, local78, 0);
						} else {
							local192 = new Class4_Sub4_Sub1_Sub3(arg4, 4, 0, local78, local58, local70, local92, local109.anInt1078, true, null);
						}
						arg6.method765(arg2, arg3, arg1, local150, local192, Static99.anIntArray244[arg7], arg7 * 512, 0, 0, local105, local115);
					} else if (arg0 == 5) {
						local936 = 16;
						local289 = arg6.method796(arg2, arg3, arg1);
						if (local289 != 0) {
							local936 = Static24.method477(local289 >> 14 & 0x7FFF).anInt1113;
						}
						if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
							local965 = local109.method732(4, local58, local70, local92, local78, 0);
						} else {
							local965 = new Class4_Sub4_Sub1_Sub3(arg4, 4, 0, local78, local58, local70, local92, local109.anInt1078, true, null);
						}
						arg6.method765(arg2, arg3, arg1, local150, local965, Static99.anIntArray244[arg7], arg7 * 512, local936 * Static26.anIntArray46[arg7], local936 * Static8.anIntArray11[arg7], local105, local115);
					} else if (arg0 == 6) {
						if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
							local192 = local109.method732(4, local58, local70, local92, local78, 0);
						} else {
							local192 = new Class4_Sub4_Sub1_Sub3(arg4, 4, 0, local78, local58, local70, local92, local109.anInt1078, true, null);
						}
						arg6.method765(arg2, arg3, arg1, local150, local192, 256, arg7, 0, 0, local105, local115);
					} else if (arg0 == 7) {
						if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
							local192 = local109.method732(4, local58, local70, local92, local78, 0);
						} else {
							local192 = new Class4_Sub4_Sub1_Sub3(arg4, 4, 0, local78, local58, local70, local92, local109.anInt1078, true, null);
						}
						arg6.method765(arg2, arg3, arg1, local150, local192, 512, arg7, 0, 0, local105, local115);
					} else if (arg0 == 8) {
						if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
							local192 = local109.method732(4, local58, local70, local92, local78, 0);
						} else {
							local192 = new Class4_Sub4_Sub1_Sub3(arg4, 4, 0, local78, local58, local70, local92, local109.anInt1078, true, null);
						}
						arg6.method765(arg2, arg3, arg1, local150, local192, 768, arg7, 0, 0, local105, local115);
					}
				}
			}
		} else if (!Static61.aBoolean57 || local109.anInt1102 != 0 || local109.anInt1080 == 1 || local109.aBoolean36) {
			if (local109.anInt1078 == -1 && local109.anIntArray94 == null) {
				local192 = local109.method732(22, local58, local70, local92, local78, arg7);
			} else {
				local192 = new Class4_Sub4_Sub1_Sub3(arg4, 22, arg7, local78, local58, local70, local92, local109.anInt1078, true, null);
			}
			arg6.method790(arg2, arg3, arg1, local150, local192, local105, local115);
			if (local109.anInt1080 == 1 && arg5 != null) {
				arg5.method1334(arg1, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 method1027() {
		@Pc(7) Class4_Sub4_Sub3_Sub1 local7 = new Class4_Sub4_Sub3_Sub1();
		local7.anInt634 = Static113.anIntArray299[0];
		local7.anIntArray35 = Static56.anIntArray146;
		local7.anInt636 = Static46.anInt1202;
		local7.anInt635 = Static102.anIntArray279[0];
		local7.anInt637 = Static61.anIntArray166[0];
		local7.aByteArray24 = Static105.aByteArrayArray8[0];
		local7.anInt638 = Static31.anInt850;
		local7.anInt633 = Static76.anIntArray193[0];
		Static131.method2144();
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class4_Sub12 local12 = (Class4_Sub12) Static111.aClass66_13.method1834((long) arg3);
		if (local12 == null) {
			local12 = new Class4_Sub12();
			Static111.aClass66_13.method1830(local12, (long) arg3);
		}
		if (local12.anIntArray149.length <= arg1) {
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(43) int[] local43 = new int[arg1 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray149.length; local45++) {
				local38[local45] = local12.anIntArray149[local45];
				local43[local45] = local12.anIntArray151[local45];
			}
			for (@Pc(75) int local75 = local12.anIntArray149.length; local75 < arg1; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local12.anIntArray149 = local38;
			local12.anIntArray151 = local43;
		}
		local12.anIntArray149[arg1] = arg0;
		local12.anIntArray151[arg1] = arg2;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lclient!q;IB)V")
	public static void method1029(@OriginalArg(0) Class4_Sub17[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(18) Class4_Sub17 local18 = arg0[local7];
			if (local18 != null && arg1 == local18.anInt2192 && (!local18.aBoolean103 || !Static13.method277(local18))) {
				if (local18.anInt2231 == 0) {
					if (!local18.aBoolean103 && Static13.method277(local18) && Static119.aClass4_Sub17_16 != local18) {
						continue;
					}
					method1029(arg0, local18.anInt2203);
					if (local18.aClass4_Sub17Array3 != null) {
						method1029(local18.aClass4_Sub17Array3, local18.anInt2203);
					}
					@Pc(73) Class4_Sub18 local73 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local18.anInt2203);
					if (local73 != null) {
						Static66.method1106(local73.anInt2402);
					}
				}
				if (local18.anInt2231 == 6) {
					@Pc(100) int local100;
					if (local18.anInt2198 != -1 || local18.anInt2253 != -1) {
						@Pc(95) boolean local95 = Static121.method2040(local18);
						if (local95) {
							local100 = local18.anInt2253;
						} else {
							local100 = local18.anInt2198;
						}
						if (local100 != -1) {
							@Pc(112) Class4_Sub4_Sub14 local112 = Static127.method2102(local100);
							local18.anInt2207 += Static15.anInt2962;
							while (local112.anIntArray294[local18.anInt2251] < local18.anInt2207) {
								local18.anInt2207 -= local112.anIntArray294[local18.anInt2251];
								local18.anInt2251++;
								if (local18.anInt2251 >= local112.anIntArray295.length) {
									local18.anInt2251 -= local112.anInt2710;
									if (local18.anInt2251 < 0 || local112.anIntArray295.length <= local18.anInt2251) {
										local18.anInt2251 = 0;
									}
								}
								Static130.method2133(local18);
							}
						}
					}
					if (local18.anInt2183 != 0 && !local18.aBoolean103) {
						local100 = local18.anInt2183 << 16 >> 16;
						local100 *= Static15.anInt2962;
						@Pc(201) int local201 = local18.anInt2183 >> 16;
						@Pc(205) int local205 = local201 * Static15.anInt2962;
						local18.anInt2232 = local18.anInt2232 + local100 & 0x7FF;
						local18.anInt2226 = local205 + local18.anInt2226 & 0x7FF;
						Static130.method2133(local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!qc;Lclient!lc;ZLclient!qc;)[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] method1030(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(9) int local9 = arg1.method1107(arg2);
		@Pc(19) int local19 = arg1.method1100(local9, arg0);
		return Static87.method1503(local19, arg1, local9);
	}
}
