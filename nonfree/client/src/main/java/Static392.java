import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	public static int anInt6825;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(II)Z")
	public static boolean method5967(@OriginalArg(1) int arg0) {
		if (arg0 == 46 || arg0 == 20 || arg0 == 10 || arg0 == 9 || arg0 == 1008 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 12;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method5968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg0 > 2000 || arg2 > 2000 || arg1 > 2000 || arg6 > 2000 || arg8 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg0 >= -2000 && arg2 >= -2000 && arg1 >= -2000 && arg6 >= -2000 && arg8 >= -2000) {
			@Pc(82) int local82;
			if (Static178.anInt2910 == 2) {
				local82 = Static55.anInt955 * arg4 + arg1;
				if (local82 >= 0 && local82 < Static572.anIntArray493.length && (arg5 << 8) - 38400 < Static572.anIntArray493[local82]) {
					return false;
				}
				local82 = arg6 + arg0 * Static55.anInt955;
				if (local82 >= 0 && Static572.anIntArray493.length > local82 && Static572.anIntArray493[local82] > (arg3 << 8) - 38400) {
					return false;
				}
				local82 = arg8 + arg2 * Static55.anInt955;
				if (local82 >= 0 && Static572.anIntArray493.length > local82 && Static572.anIntArray493[local82] > (arg7 << 8) - 38400) {
					return false;
				}
			}
			local82 = arg6 - arg1;
			@Pc(187) int local187 = arg0 - arg4;
			@Pc(192) int local192 = arg8 - arg1;
			@Pc(197) int local197 = arg2 - arg4;
			@Pc(201) int local201 = arg3 - arg5;
			@Pc(206) int local206 = arg7 - arg5;
			if (arg4 < arg0 && arg2 < arg2) {
				if (arg2 < arg0) {
					arg0++;
				} else {
					arg2++;
				}
				arg4--;
			} else if (arg0 < arg2) {
				arg0--;
				if (arg4 > arg2) {
					arg4++;
				} else {
					arg2++;
				}
			} else {
				if (arg4 > arg0) {
					arg4++;
				} else {
					arg0++;
				}
				arg2--;
			}
			@Pc(261) int local261 = 0;
			if (arg0 != arg4) {
				local261 = (arg6 - arg1 << 12) / (arg0 - arg4);
			}
			@Pc(281) int local281 = 0;
			if (arg2 != arg0) {
				local281 = (arg8 - arg6 << 12) / (arg2 - arg0);
			}
			@Pc(302) int local302 = 0;
			if (arg4 != arg2) {
				local302 = (arg1 - arg8 << 12) / (arg4 - arg2);
			}
			@Pc(326) int local326 = local197 * local82 - local187 * local192;
			if (local326 == 0) {
				return false;
			}
			@Pc(353) int local353 = (local201 * local197 - local206 * local187 << 8) / local326;
			@Pc(365) int local365 = (local82 * local206 - local192 * local201 << 8) / local326;
			if (arg4 <= arg0 && arg4 <= arg2) {
				if (arg4 >= Static550.anInt9243) {
					return true;
				}
				arg5 = (arg5 << 8) + local353 - local353 * arg1;
				if (Static550.anInt9243 < arg0) {
					arg0 = Static550.anInt9243;
				}
				if (arg2 > Static550.anInt9243) {
					arg2 = Static550.anInt9243;
				}
				if (arg2 <= arg0) {
					arg6 = arg1 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= local302 * arg4;
						arg5 -= local365 * arg4;
						arg1 -= local261 * arg4;
						arg4 = 0;
					}
					arg8 <<= 0xC;
					if (arg2 < 0) {
						arg8 -= local281 * arg2;
						arg2 = 0;
					}
					if ((arg2 == arg4 || local302 >= local261) && (arg4 != arg2 || local261 >= local281)) {
						arg0 -= arg2;
						arg2 -= arg4;
						arg4 = Static55.anInt955 * arg4;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static157.method2251(arg5, arg4, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
										return false;
									}
									arg5 += local365;
									arg8 += local281;
									arg4 += Static55.anInt955;
									arg1 += local261;
								}
							}
							if (!Static157.method2251(arg5, arg4, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
								return false;
							}
							arg4 += Static55.anInt955;
							arg5 += local365;
							arg1 += local261;
							arg6 += local302;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg4;
						arg4 *= Static55.anInt955;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static157.method2251(arg5, arg4, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
										return false;
									}
									arg4 += Static55.anInt955;
									arg1 += local261;
									arg5 += local365;
									arg8 += local281;
								}
							}
							if (!Static157.method2251(arg5, arg4, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
								return false;
							}
							arg5 += local365;
							arg4 += Static55.anInt955;
							arg6 += local302;
							arg1 += local261;
						}
					}
				} else {
					arg8 = arg1 <<= 0xC;
					arg6 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= local365 * arg4;
						arg1 -= arg4 * local261;
						arg8 -= local302 * arg4;
						arg4 = 0;
					}
					if (arg0 < 0) {
						arg6 -= local281 * arg0;
						arg0 = 0;
					}
					if (arg0 != arg4 && local261 > local302 || arg0 == arg4 && local281 < local302) {
						arg2 -= arg0;
						arg0 -= arg4;
						arg4 = Static55.anInt955 * arg4;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static157.method2251(arg5, arg4, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
										return false;
									}
									arg6 += local281;
									arg8 += local302;
									arg5 += local365;
									arg4 += Static55.anInt955;
								}
							}
							if (!Static157.method2251(arg5, arg4, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
								return false;
							}
							arg4 += Static55.anInt955;
							arg5 += local365;
							arg1 += local261;
							arg8 += local302;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg4;
						arg4 *= Static55.anInt955;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static157.method2251(arg5, arg4, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
										return false;
									}
									arg4 += Static55.anInt955;
									arg5 += local365;
									arg8 += local302;
									arg6 += local281;
								}
							}
							if (!Static157.method2251(arg5, arg4, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
								return false;
							}
							arg1 += local261;
							arg5 += local365;
							arg4 += Static55.anInt955;
							arg8 += local302;
						}
					}
				}
			} else if (arg0 <= arg2) {
				if (arg0 >= Static550.anInt9243) {
					return true;
				}
				if (Static550.anInt9243 < arg4) {
					arg4 = Static550.anInt9243;
				}
				arg3 = local353 + (arg3 << 8) - arg6 * local353;
				if (Static550.anInt9243 < arg2) {
					arg2 = Static550.anInt9243;
				}
				if (arg2 >= arg4) {
					arg8 = arg6 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= arg0 * local281;
						arg3 -= local365 * arg0;
						arg8 -= arg0 * local261;
						arg0 = 0;
					}
					arg1 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= local302 * arg4;
						arg4 = 0;
					}
					if (local261 < local281) {
						arg2 -= arg4;
						arg4 -= arg0;
						arg0 *= Static55.anInt955;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static157.method2251(arg3, arg0, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
										return false;
									}
									arg6 += local281;
									arg1 += local302;
									arg0 += Static55.anInt955;
									arg3 += local365;
								}
							}
							if (!Static157.method2251(arg3, arg0, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
								return false;
							}
							arg6 += local281;
							arg3 += local365;
							arg0 += Static55.anInt955;
							arg8 += local261;
						}
					} else {
						arg2 -= arg4;
						arg4 -= arg0;
						arg0 *= Static55.anInt955;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static157.method2251(arg3, arg0, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
										return false;
									}
									arg0 += Static55.anInt955;
									arg6 += local281;
									arg3 += local365;
									arg1 += local302;
								}
							}
							if (!Static157.method2251(arg3, arg0, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
								return false;
							}
							arg0 += Static55.anInt955;
							arg6 += local281;
							arg8 += local261;
							arg3 += local365;
						}
					}
				} else {
					arg1 = arg6 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= local281 * arg0;
						arg3 -= local365 * arg0;
						arg1 -= arg0 * local261;
						arg0 = 0;
					}
					arg8 <<= 0xC;
					if (arg2 < 0) {
						arg8 -= arg2 * local302;
						arg2 = 0;
					}
					if (arg0 != arg2 && local281 > local261 || arg2 == arg0 && local302 < local261) {
						arg4 -= arg2;
						arg2 -= arg0;
						arg0 = Static55.anInt955 * arg0;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static157.method2251(arg3, arg0, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
										return false;
									}
									arg8 += local302;
									arg0 += Static55.anInt955;
									arg3 += local365;
									arg1 += local261;
								}
							}
							if (!Static157.method2251(arg3, arg0, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
								return false;
							}
							arg3 += local365;
							arg6 += local281;
							arg0 += Static55.anInt955;
							arg1 += local261;
						}
					} else {
						arg4 -= arg2;
						arg2 -= arg0;
						arg0 = Static55.anInt955 * arg0;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static157.method2251(arg3, arg0, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
										return false;
									}
									arg1 += local261;
									arg3 += local365;
									arg8 += local302;
									arg0 += Static55.anInt955;
								}
							}
							if (!Static157.method2251(arg3, arg0, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
								return false;
							}
							arg3 += local365;
							arg1 += local261;
							arg6 += local281;
							arg0 += Static55.anInt955;
						}
					}
				}
			} else if (arg2 >= Static550.anInt9243) {
				return true;
			} else {
				arg7 = local353 + (arg7 << 8) - arg8 * local353;
				if (Static550.anInt9243 < arg4) {
					arg4 = Static550.anInt9243;
				}
				if (arg0 > Static550.anInt9243) {
					arg0 = Static550.anInt9243;
				}
				if (arg0 <= arg4) {
					arg1 = arg8 <<= 0xC;
					if (arg2 < 0) {
						arg8 -= arg2 * local302;
						arg7 -= local365 * arg2;
						arg1 -= arg2 * local281;
						arg2 = 0;
					}
					arg6 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= arg0 * local261;
						arg0 = 0;
					}
					if (local302 <= local281) {
						arg4 -= arg0;
						arg0 -= arg2;
						arg2 *= Static55.anInt955;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static157.method2251(arg7, arg2, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
										return false;
									}
									arg7 += local365;
									arg2 += Static55.anInt955;
									arg6 += local261;
									arg8 += local302;
								}
							}
							if (!Static157.method2251(arg7, arg2, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
								return false;
							}
							arg2 += Static55.anInt955;
							arg1 += local281;
							arg8 += local302;
							arg7 += local365;
						}
					} else {
						arg4 -= arg0;
						arg0 -= arg2;
						arg2 = Static55.anInt955 * arg2;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static157.method2251(arg7, arg2, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
										return false;
									}
									arg6 += local261;
									arg7 += local365;
									arg2 += Static55.anInt955;
									arg8 += local302;
								}
							}
							if (!Static157.method2251(arg7, arg2, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
								return false;
							}
							arg2 += Static55.anInt955;
							arg7 += local365;
							arg8 += local302;
							arg1 += local281;
						}
					}
				} else {
					arg6 = arg8 <<= 0xC;
					arg1 <<= 0xC;
					if (arg2 < 0) {
						arg6 -= arg2 * local281;
						arg7 -= local365 * arg2;
						arg8 -= arg2 * local302;
						arg2 = 0;
					}
					if (arg4 < 0) {
						arg1 -= arg4 * local261;
						arg4 = 0;
					}
					if (local281 < local302) {
						arg0 -= arg4;
						arg4 -= arg2;
						arg2 *= Static55.anInt955;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static157.method2251(arg7, arg2, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg1 >> 12) + 1)) {
										return false;
									}
									arg6 += local281;
									arg7 += local365;
									arg2 += Static55.anInt955;
									arg1 += local261;
								}
							}
							if (!Static157.method2251(arg7, arg2, (arg6 >> 12) - 1, Static572.anIntArray493, local353, (arg8 >> 12) + 1)) {
								return false;
							}
							arg8 += local302;
							arg2 += Static55.anInt955;
							arg6 += local281;
							arg7 += local365;
						}
					} else {
						arg0 -= arg4;
						arg4 -= arg2;
						arg2 *= Static55.anInt955;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static157.method2251(arg7, arg2, (arg1 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
										return false;
									}
									arg1 += local261;
									arg7 += local365;
									arg6 += local281;
									arg2 += Static55.anInt955;
								}
							}
							if (!Static157.method2251(arg7, arg2, (arg8 >> 12) - 1, Static572.anIntArray493, local353, (arg6 >> 12) + 1)) {
								return false;
							}
							arg6 += local281;
							arg2 += Static55.anInt955;
							arg7 += local365;
							arg8 += local302;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBI)B")
	public static byte method5971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[B)V")
	public static void method5972(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class14_Sub21 local15 = new Class14_Sub21(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method7695(97);
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(32) int[] local32 = Static550.anIntArray476 = new int[6];
					local32[0] = local15.method7717(-1978450544);
					local32[1] = local15.method7717(-1978450544);
					local32[2] = local15.method7717(-1978450544);
					local32[3] = local15.method7717(-1978450544);
					local32[4] = local15.method7717(-1978450544);
					local32[5] = local15.method7717(-1978450544);
				} else {
					@Pc(79) int local79;
					@Pc(84) int local84;
					if (local19 == 4) {
						local79 = local15.method7695(108);
						Static535.anIntArray474 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static535.anIntArray474[local84] = local15.method7717(-1978450544);
							if (Static535.anIntArray474[local84] == 65535) {
								Static535.anIntArray474[local84] = -1;
							}
						}
					} else if (local19 == 5) {
						local79 = local15.method7695(113);
						Static151.anIntArray147 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static151.anIntArray147[local84] = local15.method7717(-1978450544);
							if (Static151.anIntArray147[local84] == 65535) {
								Static151.anIntArray147[local84] = -1;
							}
						}
					}
				}
			}
		}
	}
}
