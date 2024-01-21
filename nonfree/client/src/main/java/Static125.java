import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_19;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!ra;")
	public static final Class2_Sub3 aClass2_Sub3_1 = new Class2_Sub3(8);

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_821 = Static181.method2795("null");

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	public static int anInt2772 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZIII[IIIII)V")
	public static void method2106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg6 < Static126.anInt2776) {
			arg1 -= Static126.anInt2776 - arg6;
			arg6 = Static126.anInt2776;
		}
		if (Static126.anInt2778 < arg1 + arg6) {
			arg1 = Static126.anInt2778 - arg6;
		}
		if (arg4 < Static126.anInt2774) {
			arg8 -= Static126.anInt2774 - arg4;
			arg4 = Static126.anInt2774;
		}
		if (arg8 + arg4 > Static126.anInt2777) {
			arg8 = Static126.anInt2777 - arg4;
		}
		if (arg9 == 9) {
			arg0 = arg0 + 1 & 0x3;
			arg9 = 1;
		}
		@Pc(71) int local71 = Static126.anInt2775 - arg8;
		@Pc(77) int local77 = arg4 + Static126.anInt2775 * arg6;
		if (arg9 == 10) {
			arg9 = 1;
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg9 == 11) {
			arg0 = arg0 + 3 & 0x3;
			arg9 = 8;
		}
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (arg9 == 1) {
			if (arg0 == 0) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local113 >= local117) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 1) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local117 <= local113) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local113 <= local117) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 3) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local117 >= local113) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			}
		} else if (arg9 == 2) {
			if (arg0 == 0) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local113 >> 1 >= local117) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 1) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local117 >= local113 << 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = arg8 - 1; local117 >= 0; local117--) {
						if (local117 <= local113 >> 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 3) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = arg8 - 1; local117 >= 0; local117--) {
						if (local113 << 1 <= local117) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			}
		} else if (arg9 == 3) {
			if (arg0 == 0) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = arg8 - 1; local117 >= 0; local117--) {
						if (local117 <= local113 >> 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 1) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local117 >= local113 << 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local117 <= local113 >> 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 3) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = arg8 - 1; local117 >= 0; local117--) {
						if (local117 >= local113 << 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			}
		} else if (arg9 == 4) {
			if (arg0 == 0) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local113 >> 1 <= local117) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 1) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = 0; local117 < arg8; local117++) {
						if (local117 <= local113 << 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg1; local113++) {
					for (local117 = arg8 - 1; local117 >= 0; local117--) {
						if (local113 >> 1 <= local117) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			} else if (arg0 == 3) {
				for (local113 = arg1 - 1; local113 >= 0; local113--) {
					for (local117 = arg8 - 1; local117 >= 0; local117--) {
						if (local117 <= local113 << 1) {
							arg5[local77] = arg3;
						} else if (arg2) {
							arg5[local77] = arg7;
						}
						local77++;
					}
					local77 += local71;
				}
			}
		} else if (arg9 != 5) {
			if (arg9 == 6) {
				if (arg0 == 0) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (local117 <= arg8 / 2) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 1) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (arg1 / 2 >= local113) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 2) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (arg8 / 2 <= local117) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 3) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (arg1 / 2 <= local113) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
			}
			if (arg9 == 7) {
				if (arg0 == 0) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (local117 <= local113 - arg1 / 2) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 1) {
					for (local113 = arg1 - 1; local113 >= 0; local113--) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (local113 - arg1 / 2 >= local117) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 2) {
					for (local113 = arg1 - 1; local113 >= 0; local113--) {
						for (local117 = arg8 - 1; local117 >= 0; local117--) {
							if (local113 - arg1 / 2 >= local117) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 3) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = arg8 - 1; local117 >= 0; local117--) {
							if (local117 <= local113 - arg1 / 2) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
			}
			if (arg9 == 8) {
				if (arg0 == 0) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (local117 >= local113 - arg1 / 2) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 1) {
					for (local113 = arg1 - 1; local113 >= 0; local113--) {
						for (local117 = 0; local117 < arg8; local117++) {
							if (local113 - arg1 / 2 <= local117) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 2) {
					for (local113 = arg1 - 1; local113 >= 0; local113--) {
						for (local117 = arg8 - 1; local117 >= 0; local117--) {
							if (local113 - arg1 / 2 <= local117) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
				if (arg0 == 3) {
					for (local113 = 0; local113 < arg1; local113++) {
						for (local117 = arg8 - 1; local117 >= 0; local117--) {
							if (local117 >= local113 - arg1 / 2) {
								arg5[local77] = arg3;
							} else if (arg2) {
								arg5[local77] = arg7;
							}
							local77++;
						}
						local77 += local71;
					}
					return;
				}
			}
		} else if (arg0 == 0) {
			for (local113 = arg1 - 1; local113 >= 0; local113--) {
				for (local117 = arg8 - 1; local117 >= 0; local117--) {
					if (local113 >> 1 <= local117) {
						arg5[local77] = arg3;
					} else if (arg2) {
						arg5[local77] = arg7;
					}
					local77++;
				}
				local77 += local71;
			}
		} else if (arg0 == 1) {
			for (local113 = arg1 - 1; local113 >= 0; local113--) {
				for (local117 = 0; local117 < arg8; local117++) {
					if (local113 << 1 >= local117) {
						arg5[local77] = arg3;
					} else if (arg2) {
						arg5[local77] = arg7;
					}
					local77++;
				}
				local77 += local71;
			}
		} else if (arg0 == 2) {
			for (local113 = 0; local113 < arg1; local113++) {
				for (local117 = 0; local117 < arg8; local117++) {
					if (local117 >= local113 >> 1) {
						arg5[local77] = arg3;
					} else if (arg2) {
						arg5[local77] = arg7;
					}
					local77++;
				}
				local77 += local71;
			}
		} else if (arg0 == 3) {
			for (local113 = 0; local113 < arg1; local113++) {
				for (local117 = arg8 - 1; local117 >= 0; local117--) {
					if (local113 << 1 >= local117) {
						arg5[local77] = arg3;
					} else if (arg2) {
						arg5[local77] = arg7;
					}
					local77++;
				}
				local77 += local71;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public static int method2107(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)I")
	public static int method2111(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public static void method2112() {
		@Pc(3) int local3 = Static61.anIntArray122[Static16.anInt2436];
		@Pc(7) Class54[] local7 = Static61.aClass54ArrayArray1[Static16.anInt2436];
		Static191.anInt3782 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class54 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt2001 == 1) {
				local27 = local16.anInt1984 + Static80.anInt1786 - Static206.anInt4069;
				if (local27 >= 0 && local27 <= Static80.anInt1786 + Static80.anInt1786) {
					local42 = local16.anInt1989 + Static80.anInt1786 - Static4.anInt96;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1999 + Static80.anInt1786 - Static4.anInt96;
					if (local53 > Static80.anInt1786 + Static80.anInt1786) {
						local53 = Static80.anInt1786 + Static80.anInt1786;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static58.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static87.anInt1883 - local16.anInt1992;
						if (local85 > 32) {
							local16.anInt1986 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt1986 = 2;
							local85 = -local85;
						}
						local16.anInt2003 = (local16.anInt1996 - Static95.anInt2024 << 8) / local85;
						local16.anInt1990 = (local16.anInt1995 - Static95.anInt2024 << 8) / local85;
						local16.anInt1980 = (local16.anInt1981 - Static57.anInt1428 << 8) / local85;
						local16.anInt1982 = (local16.anInt1993 - Static57.anInt1428 << 8) / local85;
						Static10.aClass54Array1[Static191.anInt3782++] = local16;
					}
				}
			} else if (local16.anInt2001 == 2) {
				local27 = local16.anInt1989 + Static80.anInt1786 - Static4.anInt96;
				if (local27 >= 0 && local27 <= Static80.anInt1786 + Static80.anInt1786) {
					local42 = local16.anInt1984 + Static80.anInt1786 - Static206.anInt4069;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1994 + Static80.anInt1786 - Static206.anInt4069;
					if (local53 > Static80.anInt1786 + Static80.anInt1786) {
						local53 = Static80.anInt1786 + Static80.anInt1786;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static58.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static95.anInt2024 - local16.anInt1996;
						if (local85 > 32) {
							local16.anInt1986 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt1986 = 4;
							local85 = -local85;
						}
						local16.anInt1985 = (local16.anInt1992 - Static87.anInt1883 << 8) / local85;
						local16.anInt2002 = (local16.anInt1987 - Static87.anInt1883 << 8) / local85;
						local16.anInt1980 = (local16.anInt1981 - Static57.anInt1428 << 8) / local85;
						local16.anInt1982 = (local16.anInt1993 - Static57.anInt1428 << 8) / local85;
						Static10.aClass54Array1[Static191.anInt3782++] = local16;
					}
				}
			} else if (local16.anInt2001 == 4) {
				local27 = local16.anInt1981 - Static57.anInt1428;
				if (local27 > 128) {
					local42 = local16.anInt1989 + Static80.anInt1786 - Static4.anInt96;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1999 + Static80.anInt1786 - Static4.anInt96;
					if (local53 > Static80.anInt1786 + Static80.anInt1786) {
						local53 = Static80.anInt1786 + Static80.anInt1786;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt1984 + Static80.anInt1786 - Static206.anInt4069;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt1994 + Static80.anInt1786 - Static206.anInt4069;
						if (local85 > Static80.anInt1786 + Static80.anInt1786) {
							local85 = Static80.anInt1786 + Static80.anInt1786;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static58.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt1986 = 5;
							local16.anInt1985 = (local16.anInt1992 - Static87.anInt1883 << 8) / local27;
							local16.anInt2002 = (local16.anInt1987 - Static87.anInt1883 << 8) / local27;
							local16.anInt2003 = (local16.anInt1996 - Static95.anInt2024 << 8) / local27;
							local16.anInt1990 = (local16.anInt1995 - Static95.anInt2024 << 8) / local27;
							Static10.aClass54Array1[Static191.anInt3782++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)I")
	public static int method2113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static71.method1373(arg1 + 91923, 4, arg0 + 45365) + (Static71.method1373(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static71.method1373(arg1, 1, arg0) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}
}
