import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!kb;")
	public static Class41 aClass41_25;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	public static int anInt2662;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public static int anInt2659 = -1;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_1248 = Static45.method1937(" x ");

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!af;")
	private static Class5 aClass5_1254 = Static45.method1937("Connecting to update server");

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_1249 = aClass5_1254;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt2660 = 0;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!af;")
	private static Class5 aClass5_1253 = Static45.method1937("This world is full)3");

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_1250 = aClass5_1253;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_1251 = Static45.method1937("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_1252 = null;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLclient!kb;BLclient!af;Lclient!af;I)V")
	public static void method1880(@OriginalArg(2) Class41 arg0, @OriginalArg(4) Class5 arg1, @OriginalArg(5) Class5 arg2) {
		@Pc(11) int local11 = arg0.method1724(arg2);
		@Pc(19) int local19 = arg0.method1698(arg1, local11);
		Static127.method2246(local19, arg0, 255, local11);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1884() {
		aClass5_1252 = null;
		aClass41_25 = null;
		aClass5_1249 = null;
		aClass5_1254 = null;
		aClass5_1253 = null;
		aClass5_1251 = null;
		aClass5_1250 = null;
		aClass5_1248 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
	public static int method1885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!rf;IIIILclient!md;III)V")
	public static void method1886(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class49 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static79.aBoolean64 && (Static25.aByteArrayArrayArray1[0][arg4][arg3] & 0x2) == 0) {
			if ((Static25.aByteArrayArrayArray1[arg2][arg4][arg3] & 0x10) != 0) {
				return;
			}
			if (Static56.method1021(arg4, arg3, arg2) != Static42.anInt1065) {
				return;
			}
		}
		if (Static76.anInt1797 > arg2) {
			Static76.anInt1797 = arg2;
		}
		@Pc(58) int local58 = Static95.anIntArrayArrayArray2[arg2][arg4 + 1][arg3];
		@Pc(66) int local66 = Static95.anIntArrayArrayArray2[arg2][arg4][arg3];
		@Pc(78) int local78 = Static95.anIntArrayArrayArray2[arg2][arg4 + 1][arg3 + 1];
		@Pc(88) int local88 = Static95.anIntArrayArrayArray2[arg2][arg4][arg3 + 1];
		@Pc(92) Class1_Sub3_Sub10 local92 = Static131.method2263(arg6);
		@Pc(102) int local102 = local78 + local58 + local66 + local88 >> 2;
		@Pc(109) int local109 = (arg1 << 6) + arg7;
		if (local92.anInt1670 == 1) {
			local109 += 256;
		}
		@Pc(128) int local128 = (arg6 << 14) + (arg3 << 7) + arg4 + 1073741824;
		if (local92.anInt1702 == 0) {
			local128 += Integer.MIN_VALUE;
		}
		if (local92.method1252()) {
			Static99.method1691(arg1, arg4, arg2, local92, arg3);
		}
		@Pc(186) Class1_Sub3_Sub4 local186;
		if (arg7 != 22) {
			@Pc(282) int local282;
			if (arg7 == 10 || arg7 == 11) {
				if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
					local186 = local92.method1256(10, local78, local58, local88, local66, arg1);
				} else {
					local186 = new Class1_Sub3_Sub4_Sub5(arg6, 10, arg1, local66, local58, local78, local88, local92.anInt1704, true, null);
				}
				if (local186 != null) {
					@Pc(268) int local268 = 0;
					@Pc(279) int local279;
					if (arg1 == 1 || arg1 == 3) {
						local279 = local92.anInt1696;
						local282 = local92.anInt1693;
					} else {
						local282 = local92.anInt1696;
						local279 = local92.anInt1693;
					}
					if (arg7 == 11) {
						local268 += 256;
					}
					if (arg0.method1849(arg2, arg4, arg3, local102, local282, local279, local186, local268, local128, local109) && local92.aBoolean59) {
						@Pc(314) int local314 = 15;
						if (local186 instanceof Class1_Sub3_Sub4_Sub4) {
							local314 = ((Class1_Sub3_Sub4_Sub4) local186).method640() / 4;
							if (local314 > 30) {
								local314 = 30;
							}
						}
						for (@Pc(332) int local332 = 0; local332 <= local282; local332++) {
							for (@Pc(336) int local336 = 0; local336 <= local279; local336++) {
								if (local314 > Static109.aByteArrayArrayArray6[arg2][local332 + arg4][local336 + arg3]) {
									Static109.aByteArrayArrayArray6[arg2][local332 + arg4][local336 + arg3] = (byte) local314;
								}
							}
						}
					}
				}
				if (local92.anInt1681 != 0 && arg5 != null) {
					arg5.method1317(arg4, arg1, arg3, local92.anInt1693, local92.anInt1696, local92.aBoolean58);
				}
			} else if (arg7 >= 12) {
				if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
					local186 = local92.method1256(arg7, local78, local58, local88, local66, arg1);
				} else {
					local186 = new Class1_Sub3_Sub4_Sub5(arg6, arg7, arg1, local66, local58, local78, local88, local92.anInt1704, true, null);
				}
				arg0.method1849(arg2, arg4, arg3, local102, 1, 1, local186, 0, local128, local109);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
					Static97.anIntArrayArrayArray3[arg2][arg4][arg3] |= 0x924;
				}
				if (local92.anInt1681 != 0 && arg5 != null) {
					arg5.method1317(arg4, arg1, arg3, local92.anInt1693, local92.anInt1696, local92.aBoolean58);
				}
			} else if (arg7 == 0) {
				if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
					local186 = local92.method1256(0, local78, local58, local88, local66, arg1);
				} else {
					local186 = new Class1_Sub3_Sub4_Sub5(arg6, 0, arg1, local66, local58, local78, local88, local92.anInt1704, true, null);
				}
				arg0.method1844(arg2, arg4, arg3, local102, local186, null, Static96.anIntArray366[arg1], 0, local128, local109);
				if (arg1 == 0) {
					if (local92.aBoolean59) {
						Static109.aByteArrayArrayArray6[arg2][arg4][arg3] = 50;
						Static109.aByteArrayArrayArray6[arg2][arg4][arg3 + 1] = 50;
					}
					if (local92.aBoolean54) {
						Static97.anIntArrayArrayArray3[arg2][arg4][arg3] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local92.aBoolean59) {
						Static109.aByteArrayArrayArray6[arg2][arg4][arg3 + 1] = 50;
						Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3 + 1] = 50;
					}
					if (local92.aBoolean54) {
						Static97.anIntArrayArrayArray3[arg2][arg4][arg3 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local92.aBoolean59) {
						Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3] = 50;
						Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3 + 1] = 50;
					}
					if (local92.aBoolean54) {
						Static97.anIntArrayArrayArray3[arg2][arg4 + 1][arg3] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local92.aBoolean59) {
						Static109.aByteArrayArrayArray6[arg2][arg4][arg3] = 50;
						Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3] = 50;
					}
					if (local92.aBoolean54) {
						Static97.anIntArrayArrayArray3[arg2][arg4][arg3] |= 0x492;
					}
				}
				if (local92.anInt1681 != 0 && arg5 != null) {
					arg5.method1325(arg3, arg7, arg1, local92.aBoolean58, arg4);
				}
				if (local92.anInt1690 != 16) {
					arg0.method1841(arg2, arg4, arg3, local92.anInt1690);
				}
			} else if (arg7 == 1) {
				if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
					local186 = local92.method1256(1, local78, local58, local88, local66, arg1);
				} else {
					local186 = new Class1_Sub3_Sub4_Sub5(arg6, 1, arg1, local66, local58, local78, local88, local92.anInt1704, true, null);
				}
				arg0.method1844(arg2, arg4, arg3, local102, local186, null, Static40.anIntArray183[arg1], 0, local128, local109);
				if (local92.aBoolean59) {
					if (arg1 == 0) {
						Static109.aByteArrayArrayArray6[arg2][arg4][arg3 + 1] = 50;
					} else if (arg1 == 1) {
						Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3 + 1] = 50;
					} else if (arg1 == 2) {
						Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3] = 50;
					} else if (arg1 == 3) {
						Static109.aByteArrayArrayArray6[arg2][arg4][arg3] = 50;
					}
				}
				if (local92.anInt1681 != 0 && arg5 != null) {
					arg5.method1325(arg3, arg7, arg1, local92.aBoolean58, arg4);
				}
			} else {
				@Pc(917) int local917;
				@Pc(948) Class1_Sub3_Sub4 local948;
				if (arg7 == 2) {
					local917 = arg1 + 1 & 0x3;
					@Pc(938) Class1_Sub3_Sub4 local938;
					if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
						local938 = local92.method1256(2, local78, local58, local88, local66, arg1 + 4);
						local948 = local92.method1256(2, local78, local58, local88, local66, local917);
					} else {
						local938 = new Class1_Sub3_Sub4_Sub5(arg6, 2, arg1 + 4, local66, local58, local78, local88, local92.anInt1704, true, null);
						local948 = new Class1_Sub3_Sub4_Sub5(arg6, 2, local917, local66, local58, local78, local88, local92.anInt1704, true, null);
					}
					arg0.method1844(arg2, arg4, arg3, local102, local938, local948, Static96.anIntArray366[arg1], Static96.anIntArray366[local917], local128, local109);
					if (local92.aBoolean54) {
						if (arg1 == 0) {
							Static97.anIntArrayArrayArray3[arg2][arg4][arg3] |= 0x249;
							Static97.anIntArrayArrayArray3[arg2][arg4][arg3 + 1] |= 0x492;
						} else if (arg1 == 1) {
							Static97.anIntArrayArrayArray3[arg2][arg4][arg3 + 1] |= 0x492;
							Static97.anIntArrayArrayArray3[arg2][arg4 + 1][arg3] |= 0x249;
						} else if (arg1 == 2) {
							Static97.anIntArrayArrayArray3[arg2][arg4 + 1][arg3] |= 0x249;
							Static97.anIntArrayArrayArray3[arg2][arg4][arg3] |= 0x492;
						} else if (arg1 == 3) {
							Static97.anIntArrayArrayArray3[arg2][arg4][arg3] |= 0x492;
							Static97.anIntArrayArrayArray3[arg2][arg4][arg3] |= 0x249;
						}
					}
					if (local92.anInt1681 != 0 && arg5 != null) {
						arg5.method1325(arg3, arg7, arg1, local92.aBoolean58, arg4);
					}
					if (local92.anInt1690 != 16) {
						arg0.method1841(arg2, arg4, arg3, local92.anInt1690);
					}
				} else if (arg7 == 3) {
					if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
						local186 = local92.method1256(3, local78, local58, local88, local66, arg1);
					} else {
						local186 = new Class1_Sub3_Sub4_Sub5(arg6, 3, arg1, local66, local58, local78, local88, local92.anInt1704, true, null);
					}
					arg0.method1844(arg2, arg4, arg3, local102, local186, null, Static40.anIntArray183[arg1], 0, local128, local109);
					if (local92.aBoolean59) {
						if (arg1 == 0) {
							Static109.aByteArrayArrayArray6[arg2][arg4][arg3 + 1] = 50;
						} else if (arg1 == 1) {
							Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3 + 1] = 50;
						} else if (arg1 == 2) {
							Static109.aByteArrayArrayArray6[arg2][arg4 + 1][arg3] = 50;
						} else if (arg1 == 3) {
							Static109.aByteArrayArrayArray6[arg2][arg4][arg3] = 50;
						}
					}
					if (local92.anInt1681 != 0 && arg5 != null) {
						arg5.method1325(arg3, arg7, arg1, local92.aBoolean58, arg4);
					}
				} else if (arg7 == 9) {
					if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
						local186 = local92.method1256(arg7, local78, local58, local88, local66, arg1);
					} else {
						local186 = new Class1_Sub3_Sub4_Sub5(arg6, arg7, arg1, local66, local58, local78, local88, local92.anInt1704, true, null);
					}
					arg0.method1849(arg2, arg4, arg3, local102, 1, 1, local186, 0, local128, local109);
					if (local92.anInt1681 != 0 && arg5 != null) {
						arg5.method1317(arg4, arg1, arg3, local92.anInt1693, local92.anInt1696, local92.aBoolean58);
					}
				} else {
					if (local92.aBoolean53) {
						if (arg1 == 1) {
							local917 = local88;
							local88 = local78;
							local78 = local58;
							local58 = local66;
							local66 = local917;
						} else if (arg1 == 2) {
							local917 = local88;
							local88 = local58;
							local58 = local917;
							local917 = local78;
							local78 = local66;
							local66 = local917;
						} else if (arg1 == 3) {
							local917 = local88;
							local88 = local66;
							local66 = local58;
							local58 = local78;
							local78 = local917;
						}
					}
					if (arg7 == 4) {
						if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
							local186 = local92.method1256(4, local78, local58, local88, local66, 0);
						} else {
							local186 = new Class1_Sub3_Sub4_Sub5(arg6, 4, 0, local66, local58, local78, local88, local92.anInt1704, true, null);
						}
						arg0.method1845(arg2, arg4, arg3, local102, local186, Static96.anIntArray366[arg1], arg1 * 512, 0, 0, local128, local109);
					} else if (arg7 == 5) {
						local917 = 16;
						local282 = arg0.method1875(arg2, arg4, arg3);
						if (local282 != 0) {
							local917 = Static131.method2263(local282 >> 14 & 0x7FFF).anInt1690;
						}
						if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
							local948 = local92.method1256(4, local78, local58, local88, local66, 0);
						} else {
							local948 = new Class1_Sub3_Sub4_Sub5(arg6, 4, 0, local66, local58, local78, local88, local92.anInt1704, true, null);
						}
						arg0.method1845(arg2, arg4, arg3, local102, local948, Static96.anIntArray366[arg1], arg1 * 512, Static72.anIntArray277[arg1] * local917, local917 * Static49.anIntArray200[arg1], local128, local109);
					} else if (arg7 == 6) {
						if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
							local186 = local92.method1256(4, local78, local58, local88, local66, 0);
						} else {
							local186 = new Class1_Sub3_Sub4_Sub5(arg6, 4, 0, local66, local58, local78, local88, local92.anInt1704, true, null);
						}
						arg0.method1845(arg2, arg4, arg3, local102, local186, 256, arg1, 0, 0, local128, local109);
					} else if (arg7 == 7) {
						if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
							local186 = local92.method1256(4, local78, local58, local88, local66, 0);
						} else {
							local186 = new Class1_Sub3_Sub4_Sub5(arg6, 4, 0, local66, local58, local78, local88, local92.anInt1704, true, null);
						}
						arg0.method1845(arg2, arg4, arg3, local102, local186, 512, arg1, 0, 0, local128, local109);
					} else if (arg7 == 8) {
						if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
							local186 = local92.method1256(4, local78, local58, local88, local66, 0);
						} else {
							local186 = new Class1_Sub3_Sub4_Sub5(arg6, 4, 0, local66, local58, local78, local88, local92.anInt1704, true, null);
						}
						arg0.method1845(arg2, arg4, arg3, local102, local186, 768, arg1, 0, 0, local128, local109);
					}
				}
			}
		} else if (!Static79.aBoolean64 || local92.anInt1702 != 0 || local92.anInt1681 == 1 || local92.aBoolean52) {
			if (local92.anInt1704 == -1 && local92.anIntArray283 == null) {
				local186 = local92.method1256(22, local78, local58, local88, local66, arg1);
			} else {
				local186 = new Class1_Sub3_Sub4_Sub5(arg6, 22, arg1, local66, local58, local78, local88, local92.anInt1704, true, null);
			}
			arg0.method1859(arg2, arg4, arg3, local102, local186, local128, local109);
			if (local92.anInt1681 == 1 && arg5 != null) {
				arg5.method1318(arg4, arg3);
			}
		}
	}
}
