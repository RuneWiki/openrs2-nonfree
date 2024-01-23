import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 aClass2_Sub3_Sub1_Sub1_5;

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
	public static int anInt4455;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
	public static int anInt4456;

	@OriginalMember(owner = "client!qd", name = "mb", descriptor = "Lclient!jd;")
	public static Class84 aClass84_95;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!fa;")
	public static Class53 aClass53_9 = new Class53(64);

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString223 = "Continue";

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
	public static int anInt4449 = 0;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString224 = "Use";

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "[Lclient!th;")
	public static Class36_Sub3_Sub2[] aClass36_Sub3_Sub2Array1 = new Class36_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!qd", name = "ib", descriptor = "[I")
	public static int[] anIntArray362 = new int[2];

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
	public static void method3609() {
		Static159.aClass46_27.method1077();
		Static278.aClass46_39.method1077();
		Static8.aClass46_3.method1077();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method3610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static26.anInt552 * 128) {
			arg0 = Static26.anInt552 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static232.anInt4787 * 128) {
			arg2 = Static232.anInt4787 * 128 - 1;
		}
		Static17.anInt431 = Class66.anIntArray148[arg3];
		Static278.anInt5805 = Class66.anIntArray153[arg3];
		Static26.anInt551 = Class66.anIntArray148[arg4];
		Static239.anInt4868 = Class66.anIntArray153[arg4];
		Static77.anInt1648 = arg0;
		Static189.anInt3965 = arg1;
		Static173.anInt3690 = arg2;
		Static53.anInt1215 = arg0 / 128;
		Static210.anInt4375 = arg2 / 128;
		Static281.anInt5831 = Static53.anInt1215 - Static92.anInt2034;
		if (Static281.anInt5831 < 0) {
			Static281.anInt5831 = 0;
		}
		Static26.anInt549 = Static210.anInt4375 - Static92.anInt2034;
		if (Static26.anInt549 < 0) {
			Static26.anInt549 = 0;
		}
		Static222.anInt4612 = Static53.anInt1215 + Static92.anInt2034;
		if (Static222.anInt4612 > Static26.anInt552) {
			Static222.anInt4612 = Static26.anInt552;
		}
		Static50.anInt1165 = Static210.anInt4375 + Static92.anInt2034;
		if (Static50.anInt1165 > Static232.anInt4787) {
			Static50.anInt1165 = Static232.anInt4787;
		}
		@Pc(99) short local99;
		if (Static60.aBoolean106) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static92.anInt2034 + Static92.anInt2034 + 2; local104++) {
			for (local113 = 0; local113 < Static92.anInt2034 + Static92.anInt2034 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static92.anInt2034 << 7) - (Static77.anInt1648 & 0x7F);
				@Pc(140) int local140 = (local113 - Static92.anInt2034 << 7) - (Static173.anInt3690 & 0x7F);
				@Pc(146) int local146 = Static53.anInt1215 + local104 - Static92.anInt2034;
				@Pc(152) int local152 = Static210.anInt4375 + local113 - Static92.anInt2034;
				if (local146 >= 0 && local152 >= 0 && local146 < Static26.anInt552 && local152 < Static232.anInt4787) {
					@Pc(176) int local176;
					if (Static144.anIntArrayArrayArray5 == null) {
						local176 = Static274.anIntArrayArrayArray14[0][local146][local152] + 128 - Static189.anInt3965;
					} else {
						local176 = Static144.anIntArrayArrayArray5[0][local146][local152] + 128 - Static189.anInt3965;
					}
					@Pc(201) int local201 = Static274.anIntArrayArrayArray14[3][local146][local152] - Static189.anInt3965 - 1000;
					Static162.aBooleanArrayArray4[local104][local113] = Static213.method3623(local130, local201, local176, local140, local99);
				} else {
					Static162.aBooleanArrayArray4[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static92.anInt2034 + Static92.anInt2034 + 1; local104++) {
			for (local113 = 0; local113 < Static92.anInt2034 + Static92.anInt2034 + 1; local113++) {
				Static121.aBooleanArrayArray3[local104][local113] = Static162.aBooleanArrayArray4[local104][local113] || Static162.aBooleanArrayArray4[local104 + 1][local113] || Static162.aBooleanArrayArray4[local104][local113 + 1] || Static162.aBooleanArrayArray4[local104 + 1][local113 + 1];
			}
		}
		Static32.anIntArray48 = arg6;
		Static208.anIntArray357 = arg7;
		Static163.anIntArray258 = arg8;
		Static195.anIntArray328 = arg9;
		Static188.anIntArray318 = arg10;
		Static95.method1830();
		if (Static102.aClass2_Sub31ArrayArrayArray1 != null) {
			Static219.method3700(true);
			Static61.method2449(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static60.aBoolean106) {
				Static68.aBoolean124 = false;
				Static4.method119(0, 0);
				Static117.method2158(null);
				Static128.method2272();
			}
			Static219.method3700(false);
		}
		Static61.method2449(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(Z)V")
	public static void method3612() {
		Static266.aClass46_36.method1077();
		Static266.aClass46_37.method1077();
		Static106.aClass46_15.method1077();
		Static73.aClass46_9.method1077();
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
	public static void method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class2_Sub31 local30 = Static180.aClass2_Sub31ArrayArrayArray2[local9][arg0][arg1] = Static180.aClass2_Sub31ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt5713--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt5708; local40++) {
					@Pc(49) Class34 local49 = local30.aClass34Array2[local40];
					if ((local49.aLong49 >> 29 & 0x3L) == 2L && local49.anInt894 == arg0 && local49.anInt897 == arg1) {
						local49.anInt904--;
					}
				}
			}
		}
		if (Static180.aClass2_Sub31ArrayArrayArray2[0][arg0][arg1] == null) {
			Static180.aClass2_Sub31ArrayArrayArray2[0][arg0][arg1] = new Class2_Sub31(0, arg0, arg1);
		}
		Static180.aClass2_Sub31ArrayArrayArray2[0][arg0][arg1].aClass2_Sub31_1 = local7;
		Static180.aClass2_Sub31ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!t;)V")
	public static void method3614(@OriginalArg(1) Class36_Sub3 arg0) {
		if (arg0.anInt5132 == 0) {
			return;
		}
		@Pc(13) Class70 local13 = arg0.method4104();
		@Pc(39) int local39;
		@Pc(46) int local46;
		if (arg0.anInt5061 != -1 && arg0.anInt5061 < 32768) {
			@Pc(29) Class36_Sub3_Sub1 local29 = Static201.aClass36_Sub3_Sub1Array1[arg0.anInt5061];
			if (local29 != null) {
				local39 = arg0.anInt5093 - local29.anInt5093;
				local46 = arg0.anInt5109 - local29.anInt5109;
				if (local39 != 0 || local46 != 0) {
					arg0.anInt5063 = (int) (Math.atan2((double) local39, (double) local46) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(129) int local129;
		@Pc(100) int local100;
		if (arg0.anInt5061 >= 32768) {
			local100 = arg0.anInt5061 - 32768;
			if (local100 == Static11.anInt298) {
				local100 = 2047;
			}
			@Pc(113) Class36_Sub3_Sub2 local113 = aClass36_Sub3_Sub2Array1[local100];
			if (local113 != null) {
				local46 = arg0.anInt5093 - local113.anInt5093;
				local129 = arg0.anInt5109 - local113.anInt5109;
				if (local46 != 0 || local129 != 0) {
					arg0.anInt5063 = (int) (Math.atan2((double) local46, (double) local129) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt5117 != 0 || arg0.anInt5098 != 0) && (arg0.anInt5096 == 0 || arg0.anInt5137 > 0)) {
			local100 = arg0.anInt5093 - (arg0.anInt5117 - Static125.anInt5772 - Static125.anInt5772) * 64;
			local39 = arg0.anInt5109 - (arg0.anInt5098 - Static203.anInt4236 - Static203.anInt4236) * 64;
			if (local100 != 0 || local39 != 0) {
				arg0.anInt5063 = (int) (Math.atan2((double) local100, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt5117 = 0;
			arg0.anInt5098 = 0;
		}
		local100 = arg0.anInt5063 - arg0.anInt5069 & 0x7FF;
		if (local100 == 0) {
			arg0.anInt5116 = 0;
			arg0.anInt5136 = 0;
		} else if (local13.anInt2110 == 0) {
			arg0.anInt5136++;
			@Pc(871) boolean local871;
			if (local100 <= 1024) {
				arg0.anInt5069 += arg0.anInt5132;
				local871 = true;
				if (local100 < arg0.anInt5132 || local100 > 2048 - arg0.anInt5132) {
					local871 = false;
					arg0.anInt5069 = arg0.anInt5063;
				}
				if (arg0.anInt5136 > 25 || local871) {
					arg0.anInt5138 = local13.anInt2098;
					if (arg0.anInt5096 > 0) {
						if (arg0.aByteArray70[arg0.anInt5096 - 1] == 2) {
							if (local13.anInt2118 != -1) {
								arg0.anInt5138 = local13.anInt2118;
							} else if (local13.anInt2096 != -1) {
								arg0.anInt5138 = local13.anInt2096;
							}
						} else if (arg0.aByteArray70[arg0.anInt5096 - 1] == 0) {
							if (local13.anInt2089 != -1) {
								arg0.anInt5138 = local13.anInt2089;
							} else if (local13.anInt2097 != -1) {
								arg0.anInt5138 = local13.anInt2097;
							}
						} else if (local13.anInt2094 != -1) {
							arg0.anInt5138 = local13.anInt2094;
						}
					} else if (local13.anInt2100 != -1) {
						arg0.anInt5138 = local13.anInt2100;
					}
				}
			} else {
				arg0.anInt5069 -= arg0.anInt5132;
				local871 = true;
				if (local100 < arg0.anInt5132 || 2048 - arg0.anInt5132 < local100) {
					local871 = false;
					arg0.anInt5069 = arg0.anInt5063;
				}
				if (arg0.anInt5136 > 25 || local871) {
					arg0.anInt5138 = local13.anInt2098;
					if (arg0.anInt5096 > 0) {
						if (arg0.aByteArray70[arg0.anInt5096 - 1] == 2) {
							if (local13.anInt2114 != -1) {
								arg0.anInt5138 = local13.anInt2114;
							} else if (local13.anInt2096 != -1) {
								arg0.anInt5138 = local13.anInt2096;
							}
						} else if (arg0.aByteArray70[arg0.anInt5096 - 1] == 0) {
							if (local13.anInt2120 != -1) {
								arg0.anInt5138 = local13.anInt2120;
							} else if (local13.anInt2097 != -1) {
								arg0.anInt5138 = local13.anInt2097;
							}
						} else if (local13.anInt2099 != -1) {
							arg0.anInt5138 = local13.anInt2099;
						}
					} else if (local13.anInt2102 != -1) {
						arg0.anInt5138 = local13.anInt2102;
					}
				}
			}
			arg0.anInt5069 &= 0x7FF;
		} else {
			arg0.anInt5138 = -1;
			local39 = arg0.anInt5063 << 5;
			if (local39 != arg0.anInt5147) {
				local129 = arg0.anInt5116 * arg0.anInt5116 / (local13.anInt2110 * 2);
				arg0.anInt5111 = 0;
				arg0.anInt5147 = local39;
				local46 = local39 - arg0.anInt5062 & 0xFFFF;
				@Pc(325) int local325;
				if (arg0.anInt5116 > 0 && local46 >= local129 && local46 - local129 < 32768) {
					arg0.anInt5100 = local46 / 2;
					arg0.aBoolean424 = true;
					local325 = local13.anInt2104 * local13.anInt2104 / (local13.anInt2110 * 2);
					if (local325 > 32767) {
						local325 = 32767;
					}
					if (arg0.anInt5100 > local325) {
						arg0.anInt5100 = local46 - local325;
					}
				} else if (arg0.anInt5116 < 0 && 65536 - local46 >= local129 && 65536 - local46 - local129 < 32768) {
					local325 = local13.anInt2104 * local13.anInt2104 / (local13.anInt2110 * 2);
					arg0.anInt5100 = (65536 - local46) / 2;
					arg0.aBoolean424 = true;
					if (local325 > 32767) {
						local325 = 32767;
					}
					if (arg0.anInt5100 > local325) {
						arg0.anInt5100 = 65536 - local325 - local46;
					}
				} else {
					arg0.aBoolean424 = false;
				}
			}
			if (arg0.anInt5116 == 0) {
				local46 = arg0.anInt5147 - arg0.anInt5062 & 0xFFFF;
				if (local13.anInt2110 > local46) {
					arg0.anInt5062 = arg0.anInt5147;
				} else {
					local129 = local13.anInt2104 * local13.anInt2104 / (local13.anInt2110 * 2);
					if (local129 > 32767) {
						local129 = 32767;
					}
					arg0.anInt5111 = 0;
					if (local46 >= 32768) {
						arg0.anInt5100 = (65536 - local46) / 2;
						if (local129 < arg0.anInt5100) {
							arg0.anInt5100 = 65536 - local129 - local46;
						}
						arg0.anInt5116 = -local13.anInt2110;
					} else {
						arg0.anInt5116 = local13.anInt2110;
						arg0.anInt5100 = local46 / 2;
						if (local129 < arg0.anInt5100) {
							arg0.anInt5100 = local46 - local129;
						}
					}
					arg0.aBoolean424 = true;
				}
			} else if (arg0.anInt5116 > 0) {
				if (arg0.anInt5111 >= arg0.anInt5100) {
					arg0.aBoolean424 = false;
				}
				if (!arg0.aBoolean424) {
					arg0.anInt5116 -= local13.anInt2110;
					if (arg0.anInt5116 < 0) {
						arg0.anInt5116 = 0;
					}
				} else if (arg0.anInt5116 < local13.anInt2104) {
					arg0.anInt5116 += local13.anInt2110;
				}
			} else {
				if (arg0.anInt5111 >= arg0.anInt5100) {
					arg0.aBoolean424 = false;
				}
				if (!arg0.aBoolean424) {
					arg0.anInt5116 += local13.anInt2110;
					if (arg0.anInt5116 > 0) {
						arg0.anInt5116 = 0;
					}
				} else if (-local13.anInt2104 < arg0.anInt5116) {
					arg0.anInt5116 -= local13.anInt2110;
				}
			}
			arg0.anInt5062 += arg0.anInt5116;
			arg0.anInt5062 &= 0xFFFF;
			arg0.anInt5069 = arg0.anInt5062 >> 5;
			if (arg0.anInt5116 > 0) {
				arg0.anInt5111 += arg0.anInt5116;
			} else {
				arg0.anInt5111 -= arg0.anInt5116;
			}
			if (arg0.anInt5116 >= 0) {
				if (arg0.anInt5096 > 0) {
					if (arg0.aByteArray70[arg0.anInt5096 - 1] == 2) {
						if (local13.anInt2118 != -1) {
							arg0.anInt5138 = local13.anInt2118;
						} else if (local13.anInt2096 != -1) {
							arg0.anInt5138 = local13.anInt2096;
						}
					} else if (arg0.aByteArray70[arg0.anInt5096 - 1] == 0) {
						if (local13.anInt2089 != -1) {
							arg0.anInt5138 = local13.anInt2089;
						} else if (local13.anInt2097 != -1) {
							arg0.anInt5138 = local13.anInt2097;
						}
					}
				}
				if (arg0.anInt5138 == -1) {
					if (local13.anInt2094 != -1) {
						arg0.anInt5138 = local13.anInt2094;
					} else if (local13.anInt2100 != -1) {
						arg0.anInt5138 = local13.anInt2100;
					}
				}
			} else {
				if (arg0.anInt5096 > 0) {
					if (arg0.aByteArray70[arg0.anInt5096 - 1] == 2) {
						if (local13.anInt2114 != -1) {
							arg0.anInt5138 = local13.anInt2114;
						} else if (local13.anInt2096 != -1) {
							arg0.anInt5138 = local13.anInt2096;
						}
					} else if (arg0.aByteArray70[arg0.anInt5096 - 1] == 0) {
						if (local13.anInt2120 != -1) {
							arg0.anInt5138 = local13.anInt2120;
						} else if (local13.anInt2097 != -1) {
							arg0.anInt5138 = local13.anInt2097;
						}
					}
				}
				if (arg0.anInt5138 == -1) {
					if (local13.anInt2099 != -1) {
						arg0.anInt5138 = local13.anInt2099;
					} else if (local13.anInt2102 != -1) {
						arg0.anInt5138 = local13.anInt2102;
					}
				}
			}
			if (arg0.anInt5138 == -1) {
				arg0.anInt5138 = local13.anInt2098;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) Class2_Sub4 local11 = null;
		for (@Pc(16) Class2_Sub4 local16 = (Class2_Sub4) Static104.aClass1_10.method13(); local16 != null; local16 = (Class2_Sub4) Static104.aClass1_10.method9()) {
			if (arg1 == local16.anInt390 && arg7 == local16.anInt405 && arg4 == local16.anInt389 && arg8 == local16.anInt400) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class2_Sub4();
			local11.anInt400 = arg8;
			local11.anInt405 = arg7;
			local11.anInt390 = arg1;
			local11.anInt389 = arg4;
			Static2.method4761(local11);
			Static104.aClass1_10.method11(local11);
		}
		local11.anInt395 = arg3;
		local11.anInt396 = arg5;
		local11.anInt404 = arg0;
		local11.anInt402 = arg6;
		local11.anInt391 = arg2;
	}
}
