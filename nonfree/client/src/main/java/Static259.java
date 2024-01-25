import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!os;")
	public static Class248 aClass248_2;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public static int anInt5080;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public static int anInt5081;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt5079 = 0;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	public static final int[] anIntArray349 = new int[3];

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "[F")
	public static final float[] aFloatArray42 = new float[2];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method4235() {
		if (Static462.anInt8018 == 1 || Static462.anInt8018 == 3 || Static164.anInt3693 != Static462.anInt8018 && (Static462.anInt8018 == 0 || Static164.anInt3693 == 0)) {
			Static228.anInt4647 = 0;
			Static225.anInt4616 = 0;
			Static357.aClass222_23.method5469();
		}
		Static164.anInt3693 = Static462.anInt8018;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII[I)V")
	public static void method4236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(11) int local11 = arg1 - 1;
		@Pc(14) int local14 = local11 - 7;
		while (local14 > arg0) {
			@Pc(17) int local17 = arg0 + 1;
			arg3[local17] = arg2;
			@Pc(22) int local22 = local17 + 1;
			arg3[local22] = arg2;
			@Pc(27) int local27 = local22 + 1;
			arg3[local27] = arg2;
			@Pc(32) int local32 = local27 + 1;
			arg3[local32] = arg2;
			@Pc(37) int local37 = local32 + 1;
			arg3[local37] = arg2;
			@Pc(42) int local42 = local37 + 1;
			arg3[local42] = arg2;
			@Pc(47) int local47 = local42 + 1;
			arg3[local47] = arg2;
			arg0 = local47 + 1;
			arg3[arg0] = arg2;
		}
		while (arg0 < local11) {
			arg0++;
			arg3[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method4237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg3 > 2000 || arg1 > 2000 || arg7 > 2000 || arg2 > 2000 || arg6 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg3 >= -2000 && arg1 >= -2000 && arg7 >= -2000 && arg2 >= -2000 && arg6 >= -2000) {
			@Pc(65) int local65;
			if (Static299.anInt5571 == 2) {
				local65 = arg7 + Static64.anInt1374 * arg4;
				if (local65 >= 0 && Static385.anIntArray465.length > local65 && (arg5 << 8) - 38400 < Static385.anIntArray465[local65]) {
					return false;
				}
				local65 = arg2 + arg3 * Static64.anInt1374;
				if (local65 >= 0 && local65 < Static385.anIntArray465.length && (arg0 << 8) - 38400 < Static385.anIntArray465[local65]) {
					return false;
				}
				local65 = arg6 + arg1 * Static64.anInt1374;
				if (local65 >= 0 && local65 < Static385.anIntArray465.length && (arg8 << 8) - 38400 < Static385.anIntArray465[local65]) {
					return false;
				}
			}
			local65 = arg2 - arg7;
			@Pc(164) int local164 = arg3 - arg4;
			@Pc(169) int local169 = arg6 - arg7;
			@Pc(182) int local182 = arg1 - arg4;
			@Pc(187) int local187 = arg0 - arg5;
			@Pc(192) int local192 = arg8 - arg5;
			if (arg3 > arg4 && arg1 > arg1) {
				arg4--;
				if (arg1 < arg3) {
					arg3++;
				} else {
					arg1++;
				}
			} else if (arg3 >= arg1) {
				arg1--;
				if (arg3 >= arg4) {
					arg3++;
				} else {
					arg4++;
				}
			} else {
				arg3--;
				if (arg4 <= arg1) {
					arg1++;
				} else {
					arg4++;
				}
			}
			@Pc(242) int local242 = 0;
			if (arg3 != arg4) {
				local242 = (arg2 - arg7 << 12) / (arg3 - arg4);
			}
			@Pc(258) int local258 = 0;
			if (arg1 != arg3) {
				local258 = (arg6 - arg2 << 12) / (arg1 - arg3);
			}
			@Pc(278) int local278 = 0;
			if (arg4 != arg1) {
				local278 = (arg7 - arg6 << 12) / (arg4 - arg1);
			}
			@Pc(306) int local306 = local65 * local182 - local169 * local164;
			if (local306 == 0) {
				return false;
			}
			@Pc(326) int local326 = (local187 * local182 - local192 * local164 << 8) / local306;
			@Pc(339) int local339 = (local192 * local65 - local169 * local187 << 8) / local306;
			if (arg3 >= arg4 && arg4 <= arg1) {
				if (arg4 >= Static16.anInt299) {
					return true;
				}
				if (arg3 > Static16.anInt299) {
					arg3 = Static16.anInt299;
				}
				if (arg1 > Static16.anInt299) {
					arg1 = Static16.anInt299;
				}
				arg5 = (arg5 << 8) - (arg7 * local326 - local326);
				if (arg1 > arg3) {
					arg6 = arg7 <<= 0xC;
					arg2 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= arg4 * local339;
						arg7 -= arg4 * local242;
						arg6 -= local278 * arg4;
						arg4 = 0;
					}
					if (arg3 < 0) {
						arg2 -= arg3 * local258;
						arg3 = 0;
					}
					if (arg4 != arg3 && local242 > local278 || arg3 == arg4 && local278 > local258) {
						arg1 -= arg3;
						arg3 -= arg4;
						arg4 = Static64.anInt1374 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg2 >> 12) + 1, Static385.anIntArray465, arg4, arg5)) {
										return false;
									}
									arg5 += local339;
									arg4 += Static64.anInt1374;
									arg6 += local278;
									arg2 += local258;
								}
							}
							if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg7 >> 12) + 1, Static385.anIntArray465, arg4, arg5)) {
								return false;
							}
							arg5 += local339;
							arg6 += local278;
							arg4 += Static64.anInt1374;
							arg7 += local242;
						}
					} else {
						arg1 -= arg3;
						arg3 -= arg4;
						arg4 *= Static64.anInt1374;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg6 >> 12) - -1, Static385.anIntArray465, arg4, arg5)) {
										return false;
									}
									arg4 += Static64.anInt1374;
									arg2 += local258;
									arg5 += local339;
									arg6 += local278;
								}
							}
							if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg6 >> 12) - -1, Static385.anIntArray465, arg4, arg5)) {
								return false;
							}
							arg4 += Static64.anInt1374;
							arg7 += local242;
							arg6 += local278;
							arg5 += local339;
						}
					}
				} else {
					arg2 = arg7 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= arg4 * local339;
						arg2 -= arg4 * local278;
						arg7 -= arg4 * local242;
						arg4 = 0;
					}
					arg6 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= local258 * arg1;
						arg1 = 0;
					}
					if ((arg4 == arg1 || local278 >= local242) && (arg1 != arg4 || local258 <= local242)) {
						arg3 -= arg1;
						arg1 -= arg4;
						arg4 = Static64.anInt1374 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg6 >> 12) + 1, Static385.anIntArray465, arg4, arg5)) {
										return false;
									}
									arg5 += local339;
									arg7 += local242;
									arg4 += Static64.anInt1374;
									arg6 += local258;
								}
							}
							if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg2 >> 12) + 1, Static385.anIntArray465, arg4, arg5)) {
								return false;
							}
							arg7 += local242;
							arg2 += local278;
							arg4 += Static64.anInt1374;
							arg5 += local339;
						}
					} else {
						arg3 -= arg1;
						arg1 -= arg4;
						arg4 = Static64.anInt1374 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg7 >> 12) - -1, Static385.anIntArray465, arg4, arg5)) {
										return false;
									}
									arg6 += local258;
									arg4 += Static64.anInt1374;
									arg5 += local339;
									arg7 += local242;
								}
							}
							if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg7 >> 12) + 1, Static385.anIntArray465, arg4, arg5)) {
								return false;
							}
							arg2 += local278;
							arg7 += local242;
							arg4 += Static64.anInt1374;
							arg5 += local339;
						}
					}
				}
			} else if (arg1 >= arg3) {
				if (arg3 >= Static16.anInt299) {
					return true;
				}
				arg0 = (arg0 << 8) + local326 - local326 * arg2;
				if (arg1 > Static16.anInt299) {
					arg1 = Static16.anInt299;
				}
				if (arg4 > Static16.anInt299) {
					arg4 = Static16.anInt299;
				}
				if (arg1 >= arg4) {
					arg6 = arg2 <<= 0xC;
					arg7 <<= 0xC;
					if (arg3 < 0) {
						arg2 -= local258 * arg3;
						arg6 -= local242 * arg3;
						arg0 -= local339 * arg3;
						arg3 = 0;
					}
					if (arg4 < 0) {
						arg7 -= local278 * arg4;
						arg4 = 0;
					}
					if (local242 < local258) {
						arg1 -= arg4;
						arg4 -= arg3;
						arg3 = Static64.anInt1374 * arg3;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg2 >> 12) + 1, Static385.anIntArray465, arg3, arg0)) {
										return false;
									}
									arg7 += local278;
									arg2 += local258;
									arg0 += local339;
									arg3 += Static64.anInt1374;
								}
							}
							if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg2 >> 12) + 1, Static385.anIntArray465, arg3, arg0)) {
								return false;
							}
							arg0 += local339;
							arg2 += local258;
							arg3 += Static64.anInt1374;
							arg6 += local242;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg3;
						arg3 *= Static64.anInt1374;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg7 >> 12) - -1, Static385.anIntArray465, arg3, arg0)) {
										return false;
									}
									arg2 += local258;
									arg3 += Static64.anInt1374;
									arg7 += local278;
									arg0 += local339;
								}
							}
							if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg6 >> 12) + 1, Static385.anIntArray465, arg3, arg0)) {
								return false;
							}
							arg6 += local242;
							arg2 += local258;
							arg3 += Static64.anInt1374;
							arg0 += local339;
						}
					}
				} else {
					arg7 = arg2 <<= 0xC;
					if (arg3 < 0) {
						arg7 -= local242 * arg3;
						arg0 -= arg3 * local339;
						arg2 -= local258 * arg3;
						arg3 = 0;
					}
					arg6 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= arg1 * local278;
						arg1 = 0;
					}
					if (arg3 != arg1 && local242 < local258 || arg1 == arg3 && local278 < local242) {
						arg4 -= arg1;
						arg1 -= arg3;
						arg3 *= Static64.anInt1374;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg6 >> 12) - -1, Static385.anIntArray465, arg3, arg0)) {
										return false;
									}
									arg7 += local242;
									arg6 += local278;
									arg0 += local339;
									arg3 += Static64.anInt1374;
								}
							}
							if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg2 >> 12) + 1, Static385.anIntArray465, arg3, arg0)) {
								return false;
							}
							arg2 += local258;
							arg3 += Static64.anInt1374;
							arg7 += local242;
							arg0 += local339;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg3;
						arg3 *= Static64.anInt1374;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg7 >> 12) + 1, Static385.anIntArray465, arg3, arg0)) {
										return false;
									}
									arg3 += Static64.anInt1374;
									arg7 += local242;
									arg6 += local278;
									arg0 += local339;
								}
							}
							if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg7 >> 12) + 1, Static385.anIntArray465, arg3, arg0)) {
								return false;
							}
							arg0 += local339;
							arg2 += local258;
							arg7 += local242;
							arg3 += Static64.anInt1374;
						}
					}
				}
			} else if (arg1 >= Static16.anInt299) {
				return true;
			} else {
				arg8 = local326 + (arg8 << 8) - arg6 * local326;
				if (Static16.anInt299 < arg3) {
					arg3 = Static16.anInt299;
				}
				if (Static16.anInt299 < arg4) {
					arg4 = Static16.anInt299;
				}
				if (arg3 > arg4) {
					arg2 = arg6 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= arg1 * local278;
						arg8 -= local339 * arg1;
						arg2 -= local258 * arg1;
						arg1 = 0;
					}
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= arg4 * local242;
						arg4 = 0;
					}
					if (local258 < local278) {
						arg3 -= arg4;
						arg4 -= arg1;
						arg1 = Static64.anInt1374 * arg1;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg7 >> 12) + 1, Static385.anIntArray465, arg1, arg8)) {
										return false;
									}
									arg1 += Static64.anInt1374;
									arg7 += local242;
									arg8 += local339;
									arg2 += local258;
								}
							}
							if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg6 >> 12) + 1, Static385.anIntArray465, arg1, arg8)) {
								return false;
							}
							arg2 += local258;
							arg8 += local339;
							arg6 += local278;
							arg1 += Static64.anInt1374;
						}
					} else {
						arg3 -= arg4;
						arg4 -= arg1;
						arg1 = Static64.anInt1374 * arg1;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg2 >> 12) - -1, Static385.anIntArray465, arg1, arg8)) {
										return false;
									}
									arg7 += local242;
									arg1 += Static64.anInt1374;
									arg2 += local258;
									arg8 += local339;
								}
							}
							if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg2 >> 12) + 1, Static385.anIntArray465, arg1, arg8)) {
								return false;
							}
							arg2 += local258;
							arg1 += Static64.anInt1374;
							arg6 += local278;
							arg8 += local339;
						}
					}
				} else {
					arg7 = arg6 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= local278 * arg1;
						arg7 -= local258 * arg1;
						arg8 -= local339 * arg1;
						arg1 = 0;
					}
					arg2 <<= 0xC;
					if (arg3 < 0) {
						arg2 -= arg3 * local242;
						arg3 = 0;
					}
					if (local258 >= local278) {
						arg4 -= arg3;
						arg3 -= arg1;
						arg1 *= Static64.anInt1374;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg2 >> 12) + 1, Static385.anIntArray465, arg1, arg8)) {
										return false;
									}
									arg6 += local278;
									arg2 += local242;
									arg8 += local339;
									arg1 += Static64.anInt1374;
								}
							}
							if (!Static411.method6322(local326, (arg6 >> 12) - 1, (arg7 >> 12) + 1, Static385.anIntArray465, arg1, arg8)) {
								return false;
							}
							arg6 += local278;
							arg7 += local258;
							arg1 += Static64.anInt1374;
							arg8 += local339;
						}
					} else {
						arg4 -= arg3;
						arg3 -= arg1;
						arg1 = Static64.anInt1374 * arg1;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static411.method6322(local326, (arg2 >> 12) - 1, (arg6 >> 12) - -1, Static385.anIntArray465, arg1, arg8)) {
										return false;
									}
									arg6 += local278;
									arg2 += local242;
									arg1 += Static64.anInt1374;
									arg8 += local339;
								}
							}
							if (!Static411.method6322(local326, (arg7 >> 12) - 1, (arg6 >> 12) + 1, Static385.anIntArray465, arg1, arg8)) {
								return false;
							}
							arg6 += local278;
							arg1 += Static64.anInt1374;
							arg7 += local258;
							arg8 += local339;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
