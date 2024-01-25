import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!os", name = "y", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "I")
	public static int anInt7656;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "[Lclient!va;")
	public static final Class5_Sub2_Sub20[] aClass5_Sub2_Sub20Array4 = new Class5_Sub2_Sub20[14];

	@OriginalMember(owner = "client!os", name = "A", descriptor = "[I")
	public static final int[] anIntArray428 = new int[500];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBIIIIIIII)Z")
	public static boolean method6501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 > 2000 || arg0 > 2000 || arg3 > 2000 || arg5 > 2000 || arg2 > 2000 || arg7 > 2000) {
			return false;
		} else if (arg1 >= -2000 && arg0 >= -2000 && arg3 >= -2000 && arg5 >= -2000 && arg2 >= -2000 && arg7 >= -2000) {
			@Pc(73) int local73;
			if (Static188.anInt3093 == 2) {
				local73 = Static626.anInt10033 * arg1 + arg5;
				if (local73 >= 0 && local73 < Static92.anIntArray87.length && Static92.anIntArray87[local73] > (arg6 << 8) - 38400) {
					return false;
				}
				local73 = arg0 * Static626.anInt10033 + arg2;
				if (local73 >= 0 && local73 < Static92.anIntArray87.length && Static92.anIntArray87[local73] > (arg4 << 8) - 38400) {
					return false;
				}
				local73 = arg3 * Static626.anInt10033 + arg7;
				if (local73 >= 0 && local73 < Static92.anIntArray87.length && Static92.anIntArray87[local73] > (arg8 << 8) - 38400) {
					return false;
				}
			}
			local73 = arg2 - arg5;
			@Pc(172) int local172 = arg0 - arg1;
			@Pc(177) int local177 = arg7 - arg5;
			@Pc(181) int local181 = arg3 - arg1;
			@Pc(186) int local186 = arg4 - arg6;
			@Pc(191) int local191 = arg8 - arg6;
			if (arg0 > arg1 && arg3 > arg3) {
				arg1--;
				if (arg3 < arg0) {
					arg0++;
				} else {
					arg3++;
				}
			} else if (arg0 >= arg3) {
				arg3--;
				if (arg1 <= arg0) {
					arg0++;
				} else {
					arg1++;
				}
			} else {
				arg0--;
				if (arg1 <= arg3) {
					arg3++;
				} else {
					arg1++;
				}
			}
			@Pc(229) int local229 = 0;
			if (arg0 != arg1) {
				local229 = (arg2 - arg5 << 12) / (arg0 - arg1);
			}
			@Pc(246) int local246 = 0;
			if (arg3 != arg0) {
				local246 = (arg7 - arg2 << 12) / (arg3 - arg0);
			}
			@Pc(267) int local267 = 0;
			if (arg3 != arg1) {
				local267 = (arg5 - arg7 << 12) / (arg1 - arg3);
			}
			@Pc(290) int local290 = local73 * local181 - local172 * local177;
			if (local290 == 0) {
				return false;
			}
			@Pc(307) int local307 = (local186 * local181 - local172 * local191 << 8) / local290;
			@Pc(319) int local319 = (local73 * local191 - local186 * local177 << 8) / local290;
			if (arg0 >= arg1 && arg1 <= arg3) {
				if (arg1 >= Static220.anInt3498) {
					return true;
				}
				if (arg0 > Static220.anInt3498) {
					arg0 = Static220.anInt3498;
				}
				if (arg3 > Static220.anInt3498) {
					arg3 = Static220.anInt3498;
				}
				arg6 = local307 + (arg6 << 8) - arg5 * local307;
				if (arg3 <= arg0) {
					arg2 = arg5 <<= 0xC;
					arg7 <<= 0xC;
					if (arg1 < 0) {
						arg2 -= local267 * arg1;
						arg6 -= local319 * arg1;
						arg5 -= local229 * arg1;
						arg1 = 0;
					}
					if (arg3 < 0) {
						arg7 -= local246 * arg3;
						arg3 = 0;
					}
					if (arg1 != arg3 && local229 > local267 || arg3 == arg1 && local229 < local246) {
						arg0 -= arg3;
						arg3 -= arg1;
						arg1 = Static626.anInt10033 * arg1;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static19.method274(arg1, (arg5 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
										return false;
									}
									arg7 += local246;
									arg6 += local319;
									arg1 += Static626.anInt10033;
									arg5 += local229;
								}
							}
							if (!Static19.method274(arg1, (arg5 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
								return false;
							}
							arg6 += local319;
							arg5 += local229;
							arg2 += local267;
							arg1 += Static626.anInt10033;
						}
					} else {
						arg0 -= arg3;
						arg3 -= arg1;
						arg1 *= Static626.anInt10033;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static19.method274(arg1, (arg7 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
										return false;
									}
									arg7 += local246;
									arg1 += Static626.anInt10033;
									arg5 += local229;
									arg6 += local319;
								}
							}
							if (!Static19.method274(arg1, (arg2 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
								return false;
							}
							arg2 += local267;
							arg1 += Static626.anInt10033;
							arg6 += local319;
							arg5 += local229;
						}
					}
				} else {
					arg7 = arg5 <<= 0xC;
					if (arg1 < 0) {
						arg7 -= local267 * arg1;
						arg5 -= local229 * arg1;
						arg6 -= arg1 * local319;
						arg1 = 0;
					}
					arg2 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= arg0 * local246;
						arg0 = 0;
					}
					if ((arg1 == arg0 || local229 <= local267) && (arg0 != arg1 || local246 >= local267)) {
						arg3 -= arg0;
						arg0 -= arg1;
						arg1 = Static626.anInt10033 * arg1;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static19.method274(arg1, (arg7 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
										return false;
									}
									arg6 += local319;
									arg2 += local246;
									arg1 += Static626.anInt10033;
									arg7 += local267;
								}
							}
							if (!Static19.method274(arg1, (arg7 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
								return false;
							}
							arg5 += local229;
							arg7 += local267;
							arg1 += Static626.anInt10033;
							arg6 += local319;
						}
					} else {
						arg3 -= arg0;
						arg0 -= arg1;
						arg1 *= Static626.anInt10033;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static19.method274(arg1, (arg2 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
										return false;
									}
									arg1 += Static626.anInt10033;
									arg6 += local319;
									arg7 += local267;
									arg2 += local246;
								}
							}
							if (!Static19.method274(arg1, (arg5 >> 12) + 1, arg6, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
								return false;
							}
							arg5 += local229;
							arg6 += local319;
							arg1 += Static626.anInt10033;
							arg7 += local267;
						}
					}
				}
			} else if (arg0 <= arg3) {
				if (arg0 >= Static220.anInt3498) {
					return true;
				}
				arg4 = local307 + (arg4 << 8) - local307 * arg2;
				if (arg3 > Static220.anInt3498) {
					arg3 = Static220.anInt3498;
				}
				if (Static220.anInt3498 < arg1) {
					arg1 = Static220.anInt3498;
				}
				if (arg1 <= arg3) {
					arg7 = arg2 <<= 0xC;
					arg5 <<= 0xC;
					if (arg0 < 0) {
						arg4 -= arg0 * local319;
						arg2 -= local246 * arg0;
						arg7 -= local229 * arg0;
						arg0 = 0;
					}
					if (arg1 < 0) {
						arg5 -= local267 * arg1;
						arg1 = 0;
					}
					if (local246 <= local229) {
						arg3 -= arg1;
						arg1 -= arg0;
						arg0 *= Static626.anInt10033;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static19.method274(arg0, (arg5 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
										return false;
									}
									arg4 += local319;
									arg2 += local246;
									arg0 += Static626.anInt10033;
									arg5 += local267;
								}
							}
							if (!Static19.method274(arg0, (arg7 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
								return false;
							}
							arg4 += local319;
							arg0 += Static626.anInt10033;
							arg7 += local229;
							arg2 += local246;
						}
					} else {
						arg3 -= arg1;
						arg1 -= arg0;
						arg0 = Static626.anInt10033 * arg0;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static19.method274(arg0, (arg2 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
										return false;
									}
									arg5 += local267;
									arg2 += local246;
									arg4 += local319;
									arg0 += Static626.anInt10033;
								}
							}
							if (!Static19.method274(arg0, (arg2 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
								return false;
							}
							arg0 += Static626.anInt10033;
							arg4 += local319;
							arg2 += local246;
							arg7 += local229;
						}
					}
				} else {
					arg5 = arg2 <<= 0xC;
					arg7 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local246 * arg0;
						arg5 -= arg0 * local229;
						arg4 -= local319 * arg0;
						arg0 = 0;
					}
					if (arg3 < 0) {
						arg7 -= arg3 * local267;
						arg3 = 0;
					}
					if (arg3 != arg0 && local229 < local246 || arg3 == arg0 && local229 > local267) {
						arg1 -= arg3;
						arg3 -= arg0;
						arg0 *= Static626.anInt10033;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static19.method274(arg0, (arg7 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
										return false;
									}
									arg0 += Static626.anInt10033;
									arg4 += local319;
									arg7 += local267;
									arg5 += local229;
								}
							}
							if (!Static19.method274(arg0, (arg2 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
								return false;
							}
							arg5 += local229;
							arg0 += Static626.anInt10033;
							arg4 += local319;
							arg2 += local246;
						}
					} else {
						arg1 -= arg3;
						arg3 -= arg0;
						arg0 = Static626.anInt10033 * arg0;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static19.method274(arg0, (arg5 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
										return false;
									}
									arg5 += local229;
									arg4 += local319;
									arg0 += Static626.anInt10033;
									arg7 += local267;
								}
							}
							if (!Static19.method274(arg0, (arg5 >> 12) + 1, arg4, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
								return false;
							}
							arg2 += local246;
							arg5 += local229;
							arg0 += Static626.anInt10033;
							arg4 += local319;
						}
					}
				}
			} else if (Static220.anInt3498 <= arg3) {
				return true;
			} else {
				arg8 = local307 + (arg8 << 8) - arg7 * local307;
				if (Static220.anInt3498 < arg0) {
					arg0 = Static220.anInt3498;
				}
				if (arg1 > Static220.anInt3498) {
					arg1 = Static220.anInt3498;
				}
				if (arg1 < arg0) {
					arg2 = arg7 <<= 0xC;
					if (arg3 < 0) {
						arg8 -= local319 * arg3;
						arg2 -= local246 * arg3;
						arg7 -= local267 * arg3;
						arg3 = 0;
					}
					arg5 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= arg1 * local229;
						arg1 = 0;
					}
					if (local267 <= local246) {
						arg0 -= arg1;
						arg1 -= arg3;
						arg3 *= Static626.anInt10033;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static19.method274(arg3, (arg2 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
										return false;
									}
									arg2 += local246;
									arg5 += local229;
									arg3 += Static626.anInt10033;
									arg8 += local319;
								}
							}
							if (!Static19.method274(arg3, (arg2 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
								return false;
							}
							arg3 += Static626.anInt10033;
							arg2 += local246;
							arg7 += local267;
							arg8 += local319;
						}
					} else {
						arg0 -= arg1;
						arg1 -= arg3;
						arg3 *= Static626.anInt10033;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static19.method274(arg3, (arg5 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
										return false;
									}
									arg5 += local229;
									arg8 += local319;
									arg2 += local246;
									arg3 += Static626.anInt10033;
								}
							}
							if (!Static19.method274(arg3, (arg7 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
								return false;
							}
							arg2 += local246;
							arg3 += Static626.anInt10033;
							arg8 += local319;
							arg7 += local267;
						}
					}
				} else {
					arg5 = arg7 <<= 0xC;
					if (arg3 < 0) {
						arg7 -= arg3 * local267;
						arg8 -= arg3 * local319;
						arg5 -= arg3 * local246;
						arg3 = 0;
					}
					arg2 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local229 * arg0;
						arg0 = 0;
					}
					if (local267 <= local246) {
						arg1 -= arg0;
						arg0 -= arg3;
						arg3 = Static626.anInt10033 * arg3;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static19.method274(arg3, (arg2 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
										return false;
									}
									arg3 += Static626.anInt10033;
									arg2 += local229;
									arg7 += local267;
									arg8 += local319;
								}
							}
							if (!Static19.method274(arg3, (arg5 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg7 >> 12) - 1)) {
								return false;
							}
							arg3 += Static626.anInt10033;
							arg5 += local246;
							arg7 += local267;
							arg8 += local319;
						}
					} else {
						arg1 -= arg0;
						arg0 -= arg3;
						arg3 = Static626.anInt10033 * arg3;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static19.method274(arg3, (arg7 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg2 >> 12) - 1)) {
										return false;
									}
									arg7 += local267;
									arg3 += Static626.anInt10033;
									arg8 += local319;
									arg2 += local229;
								}
							}
							if (!Static19.method274(arg3, (arg7 >> 12) + 1, arg8, Static92.anIntArray87, local307, (arg5 >> 12) - 1)) {
								return false;
							}
							arg3 += Static626.anInt10033;
							arg7 += local267;
							arg8 += local319;
							arg5 += local246;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
