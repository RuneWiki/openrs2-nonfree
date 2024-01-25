import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array15;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Lclient!hk;")
	public static Class155 aClass155_12;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIBIIIII)Z")
	public static boolean method4219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 > 2000 || arg0 > 2000 || arg8 > 2000 || arg5 > 2000 || arg2 > 2000 || arg3 > 2000) {
			return false;
		} else if (arg1 >= -2000 && arg0 >= -2000 && arg8 >= -2000 && arg5 >= -2000 && arg2 >= -2000 && arg3 >= -2000) {
			@Pc(94) int local94;
			if (Static278.anInt4947 == 2) {
				local94 = arg1 * Static504.anInt8078 + arg5;
				if (local94 >= 0 && local94 < Static660.anIntArray613.length && (arg7 << 8) - 38400 < Static660.anIntArray613[local94]) {
					return false;
				}
				local94 = Static504.anInt8078 * arg0 + arg2;
				if (local94 >= 0 && Static660.anIntArray613.length > local94 && (arg4 << 8) - 38400 < Static660.anIntArray613[local94]) {
					return false;
				}
				local94 = arg8 * Static504.anInt8078 + arg3;
				if (local94 >= 0 && local94 < Static660.anIntArray613.length && (arg6 << 8) - 38400 < Static660.anIntArray613[local94]) {
					return false;
				}
			}
			local94 = arg2 - arg5;
			@Pc(208) int local208 = arg0 - arg1;
			@Pc(212) int local212 = arg3 - arg5;
			@Pc(217) int local217 = arg8 - arg1;
			@Pc(222) int local222 = arg4 - arg7;
			@Pc(226) int local226 = arg6 - arg7;
			if (arg1 < arg0 && arg8 > arg8) {
				arg1--;
				if (arg0 > arg8) {
					arg0++;
				} else {
					arg8++;
				}
			} else if (arg0 < arg8) {
				arg0--;
				if (arg8 < arg1) {
					arg1++;
				} else {
					arg8++;
				}
			} else {
				if (arg1 > arg0) {
					arg1++;
				} else {
					arg0++;
				}
				arg8--;
			}
			@Pc(303) int local303 = 0;
			if (arg0 != arg1) {
				local303 = (arg2 - arg5 << 12) / (arg0 - arg1);
			}
			@Pc(323) int local323 = 0;
			if (arg8 != arg0) {
				local323 = (arg3 - arg2 << 12) / (arg8 - arg0);
			}
			@Pc(344) int local344 = 0;
			if (arg1 != arg8) {
				local344 = (arg5 - arg3 << 12) / (arg1 - arg8);
			}
			@Pc(372) int local372 = local217 * local94 - local208 * local212;
			if (local372 == 0) {
				return false;
			}
			@Pc(389) int local389 = (local217 * local222 - local208 * local226 << 8) / local372;
			@Pc(402) int local402 = (local94 * local226 - local222 * local212 << 8) / local372;
			if (arg0 >= arg1 && arg8 >= arg1) {
				if (Static362.anInt9811 <= arg1) {
					return true;
				}
				arg7 = (arg7 << 8) + local389 - local389 * arg5;
				if (arg0 > Static362.anInt9811) {
					arg0 = Static362.anInt9811;
				}
				if (arg8 > Static362.anInt9811) {
					arg8 = Static362.anInt9811;
				}
				if (arg8 > arg0) {
					arg3 = arg5 <<= 0xC;
					if (arg1 < 0) {
						arg7 -= arg1 * local402;
						arg3 -= local344 * arg1;
						arg5 -= local303 * arg1;
						arg1 = 0;
					}
					arg2 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= arg0 * local323;
						arg0 = 0;
					}
					if ((arg0 == arg1 || local303 <= local344) && (arg0 != arg1 || local323 >= local344)) {
						arg8 -= arg0;
						arg0 -= arg1;
						arg1 = Static504.anInt8078 * arg1;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg1, (arg3 >> 12) + 1)) {
										return false;
									}
									arg3 += local344;
									arg7 += local402;
									arg1 += Static504.anInt8078;
									arg2 += local323;
								}
							}
							if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg1, (arg3 >> 12) + 1)) {
								return false;
							}
							arg1 += Static504.anInt8078;
							arg3 += local344;
							arg5 += local303;
							arg7 += local402;
						}
					} else {
						arg8 -= arg0;
						arg0 -= arg1;
						arg1 = Static504.anInt8078 * arg1;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg1, (arg2 >> 12) + 1)) {
										return false;
									}
									arg1 += Static504.anInt8078;
									arg3 += local344;
									arg7 += local402;
									arg2 += local323;
								}
							}
							if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg1, (arg5 >> 12) + 1)) {
								return false;
							}
							arg1 += Static504.anInt8078;
							arg5 += local303;
							arg3 += local344;
							arg7 += local402;
						}
					}
				} else {
					arg2 = arg5 <<= 0xC;
					arg3 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= arg1 * local303;
						arg2 -= local344 * arg1;
						arg7 -= local402 * arg1;
						arg1 = 0;
					}
					if (arg8 < 0) {
						arg3 -= local323 * arg8;
						arg8 = 0;
					}
					if ((arg1 == arg8 || local303 <= local344) && (arg1 != arg8 || local303 >= local323)) {
						arg0 -= arg8;
						arg8 -= arg1;
						arg1 = Static504.anInt8078 * arg1;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg1, (arg3 >> 12) + 1)) {
										return false;
									}
									arg3 += local323;
									arg7 += local402;
									arg1 += Static504.anInt8078;
									arg5 += local303;
								}
							}
							if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg1, (arg2 >> 12) + 1)) {
								return false;
							}
							arg5 += local303;
							arg2 += local344;
							arg7 += local402;
							arg1 += Static504.anInt8078;
						}
					} else {
						arg0 -= arg8;
						arg8 -= arg1;
						arg1 *= Static504.anInt8078;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg1, (arg5 >> 12) + 1)) {
										return false;
									}
									arg5 += local303;
									arg7 += local402;
									arg1 += Static504.anInt8078;
									arg3 += local323;
								}
							}
							if (!Static58.method6166(arg7, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg1, (arg5 >> 12) + 1)) {
								return false;
							}
							arg5 += local303;
							arg2 += local344;
							arg1 += Static504.anInt8078;
							arg7 += local402;
						}
					}
				}
			} else if (arg0 > arg8) {
				if (arg8 >= Static362.anInt9811) {
					return true;
				}
				if (Static362.anInt9811 < arg0) {
					arg0 = Static362.anInt9811;
				}
				if (Static362.anInt9811 < arg1) {
					arg1 = Static362.anInt9811;
				}
				arg6 = (arg6 << 8) + local389 - arg3 * local389;
				if (arg1 < arg0) {
					arg2 = arg3 <<= 0xC;
					if (arg8 < 0) {
						arg3 -= arg8 * local344;
						arg2 -= arg8 * local323;
						arg6 -= local402 * arg8;
						arg8 = 0;
					}
					arg5 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= arg1 * local303;
						arg1 = 0;
					}
					if (local344 <= local323) {
						arg0 -= arg1;
						arg1 -= arg8;
						arg8 *= Static504.anInt8078;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg8, (arg2 >> 12) + 1)) {
										return false;
									}
									arg6 += local402;
									arg5 += local303;
									arg8 += Static504.anInt8078;
									arg2 += local323;
								}
							}
							if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg8, (arg2 >> 12) + 1)) {
								return false;
							}
							arg6 += local402;
							arg8 += Static504.anInt8078;
							arg2 += local323;
							arg3 += local344;
						}
					} else {
						arg0 -= arg1;
						arg1 -= arg8;
						arg8 = Static504.anInt8078 * arg8;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg8, (arg5 >> 12) + 1)) {
										return false;
									}
									arg6 += local402;
									arg8 += Static504.anInt8078;
									arg2 += local323;
									arg5 += local303;
								}
							}
							if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg8, (arg3 >> 12) + 1)) {
								return false;
							}
							arg8 += Static504.anInt8078;
							arg6 += local402;
							arg3 += local344;
							arg2 += local323;
						}
					}
				} else {
					arg5 = arg3 <<= 0xC;
					arg2 <<= 0xC;
					if (arg8 < 0) {
						arg3 -= arg8 * local344;
						arg5 -= arg8 * local323;
						arg6 -= arg8 * local402;
						arg8 = 0;
					}
					if (arg0 < 0) {
						arg2 -= local303 * arg0;
						arg0 = 0;
					}
					if (local344 <= local323) {
						arg1 -= arg0;
						arg0 -= arg8;
						arg8 = Static504.anInt8078 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg8, (arg2 >> 12) + 1)) {
										return false;
									}
									arg3 += local344;
									arg6 += local402;
									arg2 += local303;
									arg8 += Static504.anInt8078;
								}
							}
							if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg8, (arg5 >> 12) + 1)) {
								return false;
							}
							arg8 += Static504.anInt8078;
							arg3 += local344;
							arg5 += local323;
							arg6 += local402;
						}
					} else {
						arg1 -= arg0;
						arg0 -= arg8;
						arg8 = Static504.anInt8078 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg8, (arg3 >> 12) + 1)) {
										return false;
									}
									arg6 += local402;
									arg8 += Static504.anInt8078;
									arg2 += local303;
									arg3 += local344;
								}
							}
							if (!Static58.method6166(arg6, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg8, (arg3 >> 12) + 1)) {
								return false;
							}
							arg3 += local344;
							arg5 += local323;
							arg8 += Static504.anInt8078;
							arg6 += local402;
						}
					}
				}
			} else if (arg0 >= Static362.anInt9811) {
				return true;
			} else {
				arg4 = local389 + (arg4 << 8) - local389 * arg2;
				if (arg8 > Static362.anInt9811) {
					arg8 = Static362.anInt9811;
				}
				if (Static362.anInt9811 < arg1) {
					arg1 = Static362.anInt9811;
				}
				if (arg8 >= arg1) {
					arg3 = arg2 <<= 0xC;
					arg5 <<= 0xC;
					if (arg0 < 0) {
						arg4 -= local402 * arg0;
						arg2 -= arg0 * local323;
						arg3 -= local303 * arg0;
						arg0 = 0;
					}
					if (arg1 < 0) {
						arg5 -= local344 * arg1;
						arg1 = 0;
					}
					if (local303 >= local323) {
						arg8 -= arg1;
						arg1 -= arg0;
						arg0 *= Static504.anInt8078;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg0, (arg5 >> 12) + 1)) {
										return false;
									}
									arg4 += local402;
									arg0 += Static504.anInt8078;
									arg5 += local344;
									arg2 += local323;
								}
							}
							if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg0, (arg3 >> 12) + 1)) {
								return false;
							}
							arg0 += Static504.anInt8078;
							arg2 += local323;
							arg4 += local402;
							arg3 += local303;
						}
					} else {
						arg8 -= arg1;
						arg1 -= arg0;
						arg0 *= Static504.anInt8078;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg0, (arg2 >> 12) + 1)) {
										return false;
									}
									arg5 += local344;
									arg0 += Static504.anInt8078;
									arg4 += local402;
									arg2 += local323;
								}
							}
							if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg0, (arg2 >> 12) + 1)) {
								return false;
							}
							arg0 += Static504.anInt8078;
							arg3 += local303;
							arg2 += local323;
							arg4 += local402;
						}
					}
				} else {
					arg5 = arg2 <<= 0xC;
					arg3 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local323 * arg0;
						arg5 -= local303 * arg0;
						arg4 -= local402 * arg0;
						arg0 = 0;
					}
					if (arg8 < 0) {
						arg3 -= local344 * arg8;
						arg8 = 0;
					}
					if (arg0 != arg8 && local323 > local303 || arg0 == arg8 && local344 < local303) {
						arg1 -= arg8;
						arg8 -= arg0;
						arg0 *= Static504.anInt8078;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg0, (arg3 >> 12) + 1)) {
										return false;
									}
									arg4 += local402;
									arg5 += local303;
									arg3 += local344;
									arg0 += Static504.anInt8078;
								}
							}
							if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg5 >> 12) - 1, arg0, (arg2 >> 12) + 1)) {
								return false;
							}
							arg0 += Static504.anInt8078;
							arg4 += local402;
							arg5 += local303;
							arg2 += local323;
						}
					} else {
						arg1 -= arg8;
						arg8 -= arg0;
						arg0 *= Static504.anInt8078;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg3 >> 12) - 1, arg0, (arg5 >> 12) + 1)) {
										return false;
									}
									arg0 += Static504.anInt8078;
									arg3 += local344;
									arg5 += local303;
									arg4 += local402;
								}
							}
							if (!Static58.method6166(arg4, Static660.anIntArray613, local389, (arg2 >> 12) - 1, arg0, (arg5 >> 12) + 1)) {
								return false;
							}
							arg0 += Static504.anInt8078;
							arg4 += local402;
							arg2 += local323;
							arg5 += local303;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ICLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4226(@OriginalArg(2) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(21) int local21 = 0;
			while (true) {
				local21 = arg1.indexOf(13, local21);
				if (local21 < 0) {
					break;
				}
				local21++;
				local13 += local17;
			}
		}
		@Pc(54) StringBuffer local54 = new StringBuffer(local13);
		@Pc(56) int local56 = 0;
		while (true) {
			@Pc(61) int local61 = arg1.indexOf(13, local56);
			if (local61 < 0) {
				local54.append(arg1.substring(local56));
				return local54.toString();
			}
			local54.append(arg1.substring(local56, local61));
			local56 = local61 + 1;
			local54.append(arg0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void method4227() {
		Static137.anInt2739 = Static73.aClass196_5.anInt5056 + Static73.aClass196_5.anInt5054 + 2;
		Static152.anInt2985 = Static85.aClass196_38.anInt5056 + Static85.aClass196_38.anInt5054 + 2;
		Static464.aStringArray33 = new String[500];
		for (@Pc(26) int local26 = 0; local26 < Static464.aStringArray33.length; local26++) {
			Static464.aStringArray33[local26] = "";
		}
		Static239.method3794(Static184.aClass131_3.method3168(Static375.anInt7800));
	}
}
