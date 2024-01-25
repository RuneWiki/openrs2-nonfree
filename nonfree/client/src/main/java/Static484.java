import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "Lclient!oh;")
	public static Class237 aClass237_117;

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lclient!da;")
	public static Class27 aClass27_16;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "J")
	public static long aLong224 = -1L;

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!bda;I)V")
	public static void method7152(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0) {
		@Pc(16) Class97 local16;
		if (arg0.anInt8107 != -1) {
			local16 = Static28.aClass220_1.method5670(arg0.anInt8107);
			if (local16 == null || local16.anIntArray182 == null) {
				arg0.aBoolean585 = false;
				arg0.anInt8107 = -1;
			} else {
				label357: {
					arg0.anInt8070++;
					if (local16.anIntArray182.length > arg0.anInt8110 && local16.anIntArray180[arg0.anInt8110] < arg0.anInt8070) {
						arg0.anInt8131++;
						arg0.anInt8070 = 1;
						arg0.anInt8110++;
						if (!arg0.aBoolean583) {
							Static522.method7447(arg0, local16, arg0.anInt8110);
						}
					}
					if (local16.anIntArray182.length <= arg0.anInt8110) {
						arg0.anInt8070 = 0;
						arg0.anInt8110 = 0;
						if (arg0.aBoolean585) {
							arg0.anInt8107 = arg0.method6686().method3054();
							if (arg0.anInt8107 == -1) {
								arg0.aBoolean585 = false;
								break label357;
							}
							local16 = Static28.aClass220_1.method5670(arg0.anInt8107);
						}
						if (!arg0.aBoolean583) {
							Static522.method7447(arg0, local16, arg0.anInt8110);
						}
					}
					arg0.anInt8131 = arg0.anInt8110 + 1;
					if (local16.anIntArray182 == null) {
						arg0.aBoolean585 = false;
						arg0.anInt8107 = -1;
					} else if (local16.anIntArray182.length <= arg0.anInt8131) {
						arg0.anInt8131 = 0;
					}
				}
			}
		}
		@Pc(172) int local172;
		@Pc(181) Class97 local181;
		@Pc(169) Class73 local169;
		if (arg0.anInt8058 != -1 && arg0.anInt8099 <= Static435.anInt8192) {
			local169 = Static202.aClass333_2.method7823(arg0.anInt8058);
			local172 = local169.anInt2718;
			if (local172 == -1) {
				arg0.anInt8058 = -1;
			} else {
				label358: {
					local181 = Static28.aClass220_1.method5670(local172);
					if (local169.aBoolean202) {
						if (local181.anInt3612 == 3) {
							if (arg0.anInt8140 > 0 && Static435.anInt8192 >= arg0.anInt8101 && Static435.anInt8192 > arg0.anInt8124) {
								arg0.anInt8058 = -1;
								break label358;
							}
						} else if (local181.anInt3612 == 1 && arg0.anInt8140 > 0 && Static435.anInt8192 >= arg0.anInt8101 && Static435.anInt8192 > arg0.anInt8124) {
							arg0.anInt8099 = Static435.anInt8192 + 1;
							break label358;
						}
					}
					if (local181 == null || local181.anIntArray182 == null) {
						arg0.anInt8058 = -1;
					} else {
						if (arg0.anInt8056 < 0) {
							arg0.anInt8056 = 0;
							if (!arg0.aBoolean583) {
								Static522.method7447(arg0, local181, 0);
							}
						}
						arg0.anInt8122++;
						if (local181.anIntArray182.length > arg0.anInt8056 && local181.anIntArray180[arg0.anInt8056] < arg0.anInt8122) {
							arg0.anInt8056++;
							arg0.anInt8122 = 1;
							if (!arg0.aBoolean583) {
								Static522.method7447(arg0, local181, arg0.anInt8056);
							}
						}
						if (arg0.anInt8056 >= local181.anIntArray182.length) {
							if (local169.aBoolean202) {
								arg0.anInt8056 -= local181.anInt3609;
								arg0.anInt8100++;
								if (arg0.anInt8100 >= local181.anInt3608) {
									arg0.anInt8058 = -1;
								} else if (arg0.anInt8056 < 0 || local181.anIntArray182.length <= arg0.anInt8056) {
									arg0.anInt8058 = -1;
								} else if (!arg0.aBoolean583) {
									Static522.method7447(arg0, local181, arg0.anInt8056);
								}
							} else {
								arg0.anInt8058 = -1;
							}
						}
						arg0.anInt8098 = arg0.anInt8056 + 1;
						if (arg0.anInt8098 >= local181.anIntArray182.length) {
							if (local169.aBoolean202) {
								arg0.anInt8098 -= local181.anInt3609;
								if (local181.anInt3608 <= arg0.anInt8100 + 1) {
									arg0.anInt8098 = -1;
								} else if (arg0.anInt8098 < 0 || local181.anIntArray182.length <= arg0.anInt8098) {
									arg0.anInt8098 = -1;
								}
							} else {
								arg0.anInt8098 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8074 != -1 && Static435.anInt8192 >= arg0.anInt8111) {
			local169 = Static202.aClass333_2.method7823(arg0.anInt8074);
			local172 = local169.anInt2718;
			if (local172 == -1) {
				arg0.anInt8074 = -1;
			} else {
				label361: {
					local181 = Static28.aClass220_1.method5670(local172);
					if (local169.aBoolean202) {
						if (local181.anInt3612 == 3) {
							if (arg0.anInt8140 > 0 && arg0.anInt8101 <= Static435.anInt8192 && Static435.anInt8192 > arg0.anInt8124) {
								arg0.anInt8074 = -1;
								break label361;
							}
						} else if (local181.anInt3612 == 1 && arg0.anInt8140 > 0 && Static435.anInt8192 >= arg0.anInt8101 && arg0.anInt8124 < Static435.anInt8192) {
							arg0.anInt8111 = Static435.anInt8192 + 1;
							break label361;
						}
					}
					if (local181 == null || local181.anIntArray182 == null) {
						arg0.anInt8074 = -1;
					} else {
						if (arg0.anInt8095 < 0) {
							arg0.anInt8095 = 0;
							if (!arg0.aBoolean583) {
								Static522.method7447(arg0, local181, 0);
							}
						}
						arg0.anInt8134++;
						if (local181.anIntArray182.length > arg0.anInt8095 && arg0.anInt8134 > local181.anIntArray180[arg0.anInt8095]) {
							arg0.anInt8095++;
							arg0.anInt8134 = 1;
							if (!arg0.aBoolean583) {
								Static522.method7447(arg0, local181, arg0.anInt8095);
							}
						}
						if (local181.anIntArray182.length <= arg0.anInt8095) {
							if (local169.aBoolean202) {
								arg0.anInt8095 -= local181.anInt3609;
								arg0.anInt8092++;
								if (local181.anInt3608 <= arg0.anInt8092) {
									arg0.anInt8074 = -1;
								} else if (arg0.anInt8095 < 0 || arg0.anInt8095 >= local181.anIntArray182.length) {
									arg0.anInt8074 = -1;
								} else if (!arg0.aBoolean583) {
									Static522.method7447(arg0, local181, arg0.anInt8095);
								}
							} else {
								arg0.anInt8074 = -1;
							}
						}
						arg0.anInt8116 = arg0.anInt8095 + 1;
						if (local181.anIntArray182.length <= arg0.anInt8116) {
							if (local169.aBoolean202) {
								arg0.anInt8116 -= local181.anInt3609;
								if (local181.anInt3608 <= arg0.anInt8092 + 1) {
									arg0.anInt8116 = -1;
								} else if (arg0.anInt8116 < 0 || local181.anIntArray182.length <= arg0.anInt8116) {
									arg0.anInt8116 = -1;
								}
							} else {
								arg0.anInt8116 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8105 != -1 && arg0.anInt8094 <= 1) {
			local16 = Static28.aClass220_1.method5670(arg0.anInt8105);
			if (local16.anInt3612 == 3) {
				if (arg0.anInt8140 > 0 && Static435.anInt8192 >= arg0.anInt8101 && Static435.anInt8192 > arg0.anInt8124) {
					arg0.anInt8105 = -1;
					arg0.anIntArray434 = null;
				}
			} else if (local16.anInt3612 == 1 && arg0.anInt8140 > 0 && arg0.anInt8101 <= Static435.anInt8192 && Static435.anInt8192 > arg0.anInt8124) {
				arg0.anInt8094 = 2;
			}
		}
		if (arg0.anInt8105 != -1 && arg0.anInt8094 == 0) {
			local16 = Static28.aClass220_1.method5670(arg0.anInt8105);
			if (local16 == null || local16.anIntArray182 == null) {
				arg0.anIntArray434 = null;
				arg0.anInt8105 = -1;
			} else {
				arg0.anInt8080++;
				if (arg0.anInt8063 < local16.anIntArray182.length && arg0.anInt8080 > local16.anIntArray180[arg0.anInt8063]) {
					arg0.anInt8063++;
					arg0.anInt8080 = 1;
					if (!arg0.aBoolean583) {
						Static522.method7447(arg0, local16, arg0.anInt8063);
					}
				}
				if (local16.anIntArray182.length <= arg0.anInt8063) {
					arg0.anInt8119++;
					arg0.anInt8063 -= local16.anInt3609;
					if (arg0.anInt8119 >= local16.anInt3608) {
						arg0.anIntArray434 = null;
						arg0.anInt8105 = -1;
					} else if (arg0.anInt8063 < 0 || local16.anIntArray182.length <= arg0.anInt8063) {
						arg0.anInt8105 = -1;
						arg0.anIntArray434 = null;
					} else if (!arg0.aBoolean583) {
						Static522.method7447(arg0, local16, arg0.anInt8063);
					}
				}
				arg0.anInt8049 = arg0.anInt8063 + 1;
				if (arg0.anInt8049 >= local16.anIntArray182.length) {
					arg0.anInt8049 -= local16.anInt3609;
					if (local16.anInt3608 <= arg0.anInt8119 + 1) {
						arg0.anInt8049 = -1;
					} else if (arg0.anInt8049 < 0 || arg0.anInt8049 >= local16.anIntArray182.length) {
						arg0.anInt8049 = -1;
					}
				}
			}
		}
		if (arg0.anInt8094 > 0) {
			arg0.anInt8094--;
		}
		for (@Pc(984) int local984 = 0; local984 < arg0.aClass96Array3.length; local984++) {
			@Pc(991) Class96 local991 = arg0.aClass96Array3[local984];
			if (local991 != null) {
				if (local991.anInt3587 > 0) {
					local991.anInt3587--;
				} else {
					local181 = Static28.aClass220_1.method5670(local991.anInt3579);
					if (local181 == null || local181.anIntArray182 == null) {
						arg0.aClass96Array3[local984] = null;
					} else {
						local991.anInt3586++;
						if (local991.anInt3581 < local181.anIntArray182.length && local181.anIntArray180[local991.anInt3581] < local991.anInt3586) {
							local991.anInt3586 = 1;
							local991.anInt3581++;
							if (!arg0.aBoolean583) {
								Static522.method7447(arg0, local181, local991.anInt3581);
							}
						}
						if (local991.anInt3581 >= local181.anIntArray182.length) {
							local991.anInt3581 -= local181.anInt3609;
							local991.anInt3585++;
							if (local991.anInt3585 >= local181.anInt3608) {
								arg0.aClass96Array3[local984] = null;
							} else if (local991.anInt3581 < 0 || local991.anInt3581 >= local181.anIntArray182.length) {
								arg0.aClass96Array3[local984] = null;
							} else if (!arg0.aBoolean583) {
								Static522.method7447(arg0, local181, local991.anInt3581);
							}
						}
						local991.anInt3584 = local991.anInt3581 + 1;
						if (local991.anInt3584 >= local181.anIntArray182.length) {
							local991.anInt3584 -= local181.anInt3609;
							if (local991.anInt3585 + 1 >= local181.anInt3608) {
								local991.anInt3584 = -1;
							} else if (local991.anInt3584 < 0 || local991.anInt3584 >= local181.anIntArray182.length) {
								local991.anInt3584 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)Lclient!vp;")
	public static Class15_Sub1_Sub3 method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass15_Sub1_Sub3_1 == null ? null : local7.aClass15_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII)I")
	public static int method7157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static34.aClass86Array5 == null) {
			return 0;
		}
		if (arg3 < 3) {
			@Pc(22) int local22 = arg4 >> 9;
			@Pc(26) int local26 = arg1 >> 9;
			if (arg0 < 0 || arg2 < 0 || arg0 > Static372.anInt7082 - 1 || Static218.anInt5023 - 1 < arg2) {
				return 0;
			}
			if (local22 < 1 || local26 < 1 || local22 > Static372.anInt7082 - 1 || local26 > Static218.anInt5023 - 1) {
				return 0;
			}
			@Pc(97) boolean local97 = (Static118.aByteArrayArrayArray20[1][arg4 >> 9][arg1 >> 9] & 0x2) != 0;
			@Pc(122) boolean local122;
			@Pc(138) boolean local138;
			if ((arg4 & 0x1FF) == 0) {
				local122 = (Static118.aByteArrayArrayArray20[1][local22 - 1][arg1 >> 9] & 0x2) != 0;
				local138 = (Static118.aByteArrayArrayArray20[1][local22][arg1 >> 9] & 0x2) != 0;
				if (local138 != local122) {
					local97 = (Static118.aByteArrayArrayArray20[1][arg0][arg2] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				local122 = (Static118.aByteArrayArrayArray20[1][arg4 >> 9][local26 - 1] & 0x2) != 0;
				local138 = (Static118.aByteArrayArrayArray20[1][arg4 >> 9][local26] & 0x2) != 0;
				if (local138 != local122) {
					local97 = (Static118.aByteArrayArrayArray20[1][arg0][arg2] & 0x2) != 0;
				}
			}
			if (local97) {
				arg3++;
			}
		}
		return Static34.aClass86Array5[arg3].method8088(arg1, arg4);
	}
}
