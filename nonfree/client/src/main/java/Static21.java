import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "Z")
	public static boolean aBoolean44;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	public static int anInt546;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
	public static final int[] anIntArray51 = new int[6];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)I")
	public static int method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg2;
			arg2 = arg4;
			arg4 = local10;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return 7 + 1 - arg0 - arg4;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg8 > 2000 || arg5 > 2000 || arg2 > 2000 || arg7 > 2000 || arg6 > 2000 || arg0 > 2000) {
			return false;
		} else if (arg8 >= -2000 && arg5 >= -2000 && arg2 >= -2000 && arg7 >= -2000 && arg6 >= -2000 && arg0 >= -2000) {
			@Pc(64) int local64;
			if (Static437.anInt7278 == 2) {
				local64 = arg8 * Static28.anInt683 + arg7;
				if (local64 >= 0 && Static571.anIntArray639.length > local64 && (arg3 << 8) - 15360 < Static571.anIntArray639[local64]) {
					return false;
				}
				local64 = Static28.anInt683 * arg5 + arg6;
				if (local64 >= 0 && Static571.anIntArray639.length > local64 && Static571.anIntArray639[local64] > (arg4 << 8) - 15360) {
					return false;
				}
				local64 = arg0 + Static28.anInt683 * arg2;
				if (local64 >= 0 && Static571.anIntArray639.length > local64 && (arg1 << 8) - 15360 < Static571.anIntArray639[local64]) {
					return false;
				}
			}
			local64 = arg6 - arg7;
			@Pc(158) int local158 = arg5 - arg8;
			@Pc(162) int local162 = arg0 - arg7;
			@Pc(167) int local167 = arg2 - arg8;
			@Pc(172) int local172 = arg4 - arg3;
			if (arg5 > arg8 && arg2 < arg2) {
				arg8--;
				if (arg2 >= arg5) {
					arg2++;
				} else {
					arg5++;
				}
			} else if (arg5 < arg2) {
				arg5--;
				if (arg2 >= arg8) {
					arg2++;
				} else {
					arg8++;
				}
			} else {
				if (arg5 >= arg8) {
					arg5++;
				} else {
					arg8++;
				}
				arg2--;
			}
			@Pc(229) int local229 = arg1 - arg3;
			@Pc(231) int local231 = 0;
			if (arg8 != arg5) {
				local231 = (arg6 - arg7 << 12) / (arg5 - arg8);
			}
			@Pc(250) int local250 = 0;
			if (arg5 != arg2) {
				local250 = (arg0 - arg6 << 12) / (arg2 - arg5);
			}
			@Pc(271) int local271 = 0;
			if (arg2 != arg8) {
				local271 = (arg7 - arg0 << 12) / (arg8 - arg2);
			}
			@Pc(294) int local294 = local167 * local64 - local162 * local158;
			if (local294 == 0) {
				return false;
			}
			@Pc(311) int local311 = (local172 * local167 - local229 * local158 << 8) / local294;
			@Pc(323) int local323 = (local229 * local64 - local172 * local162 << 8) / local294;
			if (arg5 >= arg8 && arg8 <= arg2) {
				if (arg8 >= Static91.anInt2280) {
					return true;
				}
				arg3 = local311 + (arg3 << 8) - local311 * arg7;
				if (Static91.anInt2280 < arg5) {
					arg5 = Static91.anInt2280;
				}
				if (Static91.anInt2280 < arg2) {
					arg2 = Static91.anInt2280;
				}
				if (arg5 >= arg2) {
					arg6 = arg7 <<= 0xC;
					if (arg8 < 0) {
						arg6 -= local271 * arg8;
						arg3 -= local323 * arg8;
						arg7 -= local231 * arg8;
						arg8 = 0;
					}
					arg0 <<= 0xC;
					if (arg2 < 0) {
						arg0 -= arg2 * local250;
						arg2 = 0;
					}
					if ((arg8 == arg2 || local271 >= local231) && (arg8 != arg2 || local250 <= local231)) {
						arg5 -= arg2;
						arg2 -= arg8;
						arg8 = Static28.anInt683 * arg8;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static180.method3141(arg8, (arg7 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg3)) {
										return false;
									}
									arg0 += local250;
									arg7 += local231;
									arg3 += local323;
									arg8 += Static28.anInt683;
								}
							}
							if (!Static180.method3141(arg8, (arg7 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg3)) {
								return false;
							}
							arg6 += local271;
							arg8 += Static28.anInt683;
							arg3 += local323;
							arg7 += local231;
						}
					} else {
						arg5 -= arg2;
						arg2 -= arg8;
						arg8 = Static28.anInt683 * arg8;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static180.method3141(arg8, (arg0 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg3)) {
										return false;
									}
									arg3 += local323;
									arg7 += local231;
									arg0 += local250;
									arg8 += Static28.anInt683;
								}
							}
							if (!Static180.method3141(arg8, (arg6 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg3)) {
								return false;
							}
							arg8 += Static28.anInt683;
							arg6 += local271;
							arg3 += local323;
							arg7 += local231;
						}
					}
				} else {
					arg0 = arg7 <<= 0xC;
					if (arg8 < 0) {
						arg3 -= arg8 * local323;
						arg7 -= arg8 * local231;
						arg0 -= local271 * arg8;
						arg8 = 0;
					}
					arg6 <<= 0xC;
					if (arg5 < 0) {
						arg6 -= arg5 * local250;
						arg5 = 0;
					}
					if ((arg5 == arg8 || local271 >= local231) && (arg8 != arg5 || local271 <= local250)) {
						arg2 -= arg5;
						arg5 -= arg8;
						arg8 = Static28.anInt683 * arg8;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static180.method3141(arg8, (arg6 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg3)) {
										return false;
									}
									arg0 += local271;
									arg6 += local250;
									arg3 += local323;
									arg8 += Static28.anInt683;
								}
							}
							if (!Static180.method3141(arg8, (arg7 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg3)) {
								return false;
							}
							arg3 += local323;
							arg7 += local231;
							arg8 += Static28.anInt683;
							arg0 += local271;
						}
					} else {
						arg2 -= arg5;
						arg5 -= arg8;
						arg8 = Static28.anInt683 * arg8;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static180.method3141(arg8, (arg0 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg3)) {
										return false;
									}
									arg3 += local323;
									arg0 += local271;
									arg8 += Static28.anInt683;
									arg6 += local250;
								}
							}
							if (!Static180.method3141(arg8, (arg0 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg3)) {
								return false;
							}
							arg3 += local323;
							arg7 += local231;
							arg8 += Static28.anInt683;
							arg0 += local271;
						}
					}
				}
			} else if (arg5 <= arg2) {
				if (Static91.anInt2280 <= arg5) {
					return true;
				}
				arg4 = (arg4 << 8) + local311 - arg6 * local311;
				if (arg8 > Static91.anInt2280) {
					arg8 = Static91.anInt2280;
				}
				if (arg2 > Static91.anInt2280) {
					arg2 = Static91.anInt2280;
				}
				if (arg8 > arg2) {
					arg7 = arg6 <<= 0xC;
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= arg5 * local231;
						arg6 -= arg5 * local250;
						arg4 -= local323 * arg5;
						arg5 = 0;
					}
					if (arg2 < 0) {
						arg0 -= local271 * arg2;
						arg2 = 0;
					}
					if (arg5 != arg2 && local231 < local250 || arg5 == arg2 && local231 > local271) {
						arg8 -= arg2;
						arg2 -= arg5;
						arg5 = Static28.anInt683 * arg5;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static180.method3141(arg5, (arg7 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg4)) {
										return false;
									}
									arg5 += Static28.anInt683;
									arg0 += local271;
									arg7 += local231;
									arg4 += local323;
								}
							}
							if (!Static180.method3141(arg5, (arg7 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg4)) {
								return false;
							}
							arg6 += local250;
							arg4 += local323;
							arg5 += Static28.anInt683;
							arg7 += local231;
						}
					} else {
						arg8 -= arg2;
						arg2 -= arg5;
						arg5 *= Static28.anInt683;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static180.method3141(arg5, (arg0 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg4)) {
										return false;
									}
									arg5 += Static28.anInt683;
									arg4 += local323;
									arg0 += local271;
									arg7 += local231;
								}
							}
							if (!Static180.method3141(arg5, (arg6 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg4)) {
								return false;
							}
							arg7 += local231;
							arg6 += local250;
							arg5 += Static28.anInt683;
							arg4 += local323;
						}
					}
				} else {
					arg0 = arg6 <<= 0xC;
					arg7 <<= 0xC;
					if (arg5 < 0) {
						arg4 -= local323 * arg5;
						arg0 -= local231 * arg5;
						arg6 -= arg5 * local250;
						arg5 = 0;
					}
					if (arg8 < 0) {
						arg7 -= local271 * arg8;
						arg8 = 0;
					}
					if (local250 <= local231) {
						arg2 -= arg8;
						arg8 -= arg5;
						arg5 *= Static28.anInt683;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static180.method3141(arg5, (arg6 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg4)) {
										return false;
									}
									arg4 += local323;
									arg7 += local271;
									arg5 += Static28.anInt683;
									arg6 += local250;
								}
							}
							if (!Static180.method3141(arg5, (arg6 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg4)) {
								return false;
							}
							arg5 += Static28.anInt683;
							arg0 += local231;
							arg6 += local250;
							arg4 += local323;
						}
					} else {
						arg2 -= arg8;
						arg8 -= arg5;
						arg5 = Static28.anInt683 * arg5;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static180.method3141(arg5, (arg7 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg4)) {
										return false;
									}
									arg7 += local271;
									arg5 += Static28.anInt683;
									arg4 += local323;
									arg6 += local250;
								}
							}
							if (!Static180.method3141(arg5, (arg0 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg4)) {
								return false;
							}
							arg4 += local323;
							arg6 += local250;
							arg5 += Static28.anInt683;
							arg0 += local231;
						}
					}
				}
			} else if (Static91.anInt2280 <= arg2) {
				return true;
			} else {
				if (arg8 > Static91.anInt2280) {
					arg8 = Static91.anInt2280;
				}
				if (Static91.anInt2280 < arg5) {
					arg5 = Static91.anInt2280;
				}
				arg1 = local311 + (arg1 << 8) - arg0 * local311;
				if (arg8 >= arg5) {
					arg7 = arg0 <<= 0xC;
					if (arg2 < 0) {
						arg1 -= local323 * arg2;
						arg0 -= local271 * arg2;
						arg7 -= local250 * arg2;
						arg2 = 0;
					}
					arg6 <<= 0xC;
					if (arg5 < 0) {
						arg6 -= arg5 * local231;
						arg5 = 0;
					}
					if (local271 <= local250) {
						arg8 -= arg5;
						arg5 -= arg2;
						arg2 *= Static28.anInt683;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static180.method3141(arg2, (arg0 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg1)) {
										return false;
									}
									arg2 += Static28.anInt683;
									arg1 += local323;
									arg6 += local231;
									arg0 += local271;
								}
							}
							if (!Static180.method3141(arg2, (arg0 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg1)) {
								return false;
							}
							arg7 += local250;
							arg0 += local271;
							arg2 += Static28.anInt683;
							arg1 += local323;
						}
					} else {
						arg8 -= arg5;
						arg5 -= arg2;
						arg2 = Static28.anInt683 * arg2;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static180.method3141(arg2, (arg6 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg1)) {
										return false;
									}
									arg1 += local323;
									arg2 += Static28.anInt683;
									arg6 += local231;
									arg0 += local271;
								}
							}
							if (!Static180.method3141(arg2, (arg7 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg1)) {
								return false;
							}
							arg0 += local271;
							arg2 += Static28.anInt683;
							arg7 += local250;
							arg1 += local323;
						}
					}
				} else {
					arg6 = arg0 <<= 0xC;
					arg7 <<= 0xC;
					if (arg2 < 0) {
						arg0 -= arg2 * local271;
						arg6 -= local250 * arg2;
						arg1 -= arg2 * local323;
						arg2 = 0;
					}
					if (arg8 < 0) {
						arg7 -= arg8 * local231;
						arg8 = 0;
					}
					if (local250 < local271) {
						arg5 -= arg8;
						arg8 -= arg2;
						arg2 *= Static28.anInt683;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static180.method3141(arg2, (arg6 >> 12) - 1, Static571.anIntArray639, (arg7 >> 12) + 1, local311, arg1)) {
										return false;
									}
									arg1 += local323;
									arg7 += local231;
									arg2 += Static28.anInt683;
									arg6 += local250;
								}
							}
							if (!Static180.method3141(arg2, (arg6 >> 12) - 1, Static571.anIntArray639, (arg0 >> 12) + 1, local311, arg1)) {
								return false;
							}
							arg1 += local323;
							arg6 += local250;
							arg0 += local271;
							arg2 += Static28.anInt683;
						}
					} else {
						arg5 -= arg8;
						arg8 -= arg2;
						arg2 = Static28.anInt683 * arg2;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static180.method3141(arg2, (arg7 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg1)) {
										return false;
									}
									arg1 += local323;
									arg2 += Static28.anInt683;
									arg7 += local231;
									arg6 += local250;
								}
							}
							if (!Static180.method3141(arg2, (arg0 >> 12) - 1, Static571.anIntArray639, (arg6 >> 12) + 1, local311, arg1)) {
								return false;
							}
							arg2 += Static28.anInt683;
							arg6 += local250;
							arg1 += local323;
							arg0 += local271;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBIIIZI)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static500.anInt7956 = arg0;
		Static326.anInt5856 = arg2;
		Static225.anInt4393 = arg1;
		Static12.anInt137 = arg3;
		Static41.anInt966 = arg5;
		if (arg4 && Static326.anInt5856 >= 100) {
			Static233.anInt4431 = Static41.anInt966 * 512 + 256;
			Static421.anInt7061 = Static12.anInt137 * 512 + 256;
			Static545.anInt8633 = Static130.method2562(Static233.anInt4431, Static209.anInt8182, Static421.anInt7061) - Static500.anInt7956;
		}
		Static205.anInt4130 = -1;
		Static471.anInt7695 = -1;
		Static446.anInt7363 = 2;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
	public static void method443(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg0, 16);
		local8.method845();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) Class3_Sub48 local15 = Static144.method2729(arg1, arg0);
		if (local15 != null) {
			local15.method7812();
		}
	}
}
