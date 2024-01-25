import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
	public static int anInt10516 = 1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)Z")
	public static boolean method8778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static554.method8265(arg0, arg1) || Static423.method6817(arg1, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBIIII)Z")
	public static boolean method8779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 > 2000 || arg5 > 2000 || arg8 > 2000 || arg7 > 2000 || arg2 > 2000 || arg0 > 2000) {
			return false;
		} else if (arg1 >= -2000 && arg5 >= -2000 && arg8 >= -2000 && arg7 >= -2000 && arg2 >= -2000 && arg0 >= -2000) {
			@Pc(66) int local66;
			if (Static126.anInt3222 == 2) {
				local66 = arg7 + arg1 * Static640.anInt11044;
				if (local66 >= 0 && Static204.anIntArray648.length > local66 && Static204.anIntArray648[local66] > (arg6 << 8) - 38400) {
					return false;
				}
				local66 = arg2 + arg5 * Static640.anInt11044;
				if (local66 >= 0 && local66 < Static204.anIntArray648.length && Static204.anIntArray648[local66] > (arg4 << 8) - 38400) {
					return false;
				}
				local66 = arg0 + arg8 * Static640.anInt11044;
				if (local66 >= 0 && Static204.anIntArray648.length > local66 && (arg3 << 8) - 38400 < Static204.anIntArray648[local66]) {
					return false;
				}
			}
			local66 = arg2 - arg7;
			@Pc(150) int local150 = arg5 - arg1;
			@Pc(155) int local155 = arg0 - arg7;
			@Pc(160) int local160 = arg8 - arg1;
			@Pc(165) int local165 = arg4 - arg6;
			if (arg1 < arg5 && arg8 > arg8) {
				arg1--;
				if (arg5 > arg8) {
					arg5++;
				} else {
					arg8++;
				}
			} else if (arg8 <= arg5) {
				arg8--;
				if (arg5 < arg1) {
					arg1++;
				} else {
					arg5++;
				}
			} else {
				arg5--;
				if (arg8 < arg1) {
					arg1++;
				} else {
					arg8++;
				}
			}
			@Pc(219) int local219 = arg3 - arg6;
			@Pc(221) int local221 = 0;
			if (arg1 != arg5) {
				local221 = (arg2 - arg7 << 12) / (arg5 - arg1);
			}
			@Pc(240) int local240 = 0;
			if (arg8 != arg5) {
				local240 = (arg0 - arg2 << 12) / (arg8 - arg5);
			}
			@Pc(266) int local266 = 0;
			if (arg8 != arg1) {
				local266 = (arg7 - arg0 << 12) / (arg1 - arg8);
			}
			@Pc(289) int local289 = local160 * local66 - local150 * local155;
			if (local289 == 0) {
				return false;
			}
			@Pc(309) int local309 = (local165 * local160 - local219 * local150 << 8) / local289;
			@Pc(322) int local322 = (local66 * local219 - local165 * local155 << 8) / local289;
			if (arg1 <= arg5 && arg1 <= arg8) {
				if (arg1 >= Static319.anInt6494) {
					return true;
				}
				arg6 = (arg6 << 8) - (arg7 * local309 - local309);
				if (arg8 > Static319.anInt6494) {
					arg8 = Static319.anInt6494;
				}
				if (arg5 > Static319.anInt6494) {
					arg5 = Static319.anInt6494;
				}
				if (arg5 < arg8) {
					arg0 = arg7 <<= 0xC;
					if (arg1 < 0) {
						arg7 -= local221 * arg1;
						arg6 -= arg1 * local322;
						arg0 -= arg1 * local266;
						arg1 = 0;
					}
					arg2 <<= 0xC;
					if (arg5 < 0) {
						arg2 -= arg5 * local240;
						arg5 = 0;
					}
					if (arg5 != arg1 && local266 < local221 || arg5 == arg1 && local266 > local240) {
						arg8 -= arg5;
						arg5 -= arg1;
						arg1 *= Static640.anInt11044;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg6, (arg2 >> 12) + 1, (arg0 >> 12) + -1, Static204.anIntArray648, arg1)) {
										return false;
									}
									arg2 += local240;
									arg0 += local266;
									arg6 += local322;
									arg1 += Static640.anInt11044;
								}
							}
							if (!Static305.method5398(local309, arg6, (arg7 >> 12) + 1, (arg0 >> 12) + -1, Static204.anIntArray648, arg1)) {
								return false;
							}
							arg6 += local322;
							arg1 += Static640.anInt11044;
							arg7 += local221;
							arg0 += local266;
						}
					} else {
						arg8 -= arg5;
						arg5 -= arg1;
						arg1 *= Static640.anInt11044;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg6, (arg0 >> 12) + 1, (arg2 >> 12) + -1, Static204.anIntArray648, arg1)) {
										return false;
									}
									arg2 += local240;
									arg1 += Static640.anInt11044;
									arg6 += local322;
									arg0 += local266;
								}
							}
							if (!Static305.method5398(local309, arg6, (arg0 >> 12) + 1, (arg7 >> 12) + -1, Static204.anIntArray648, arg1)) {
								return false;
							}
							arg1 += Static640.anInt11044;
							arg6 += local322;
							arg0 += local266;
							arg7 += local221;
						}
					}
				} else {
					arg2 = arg7 <<= 0xC;
					if (arg1 < 0) {
						arg2 -= local266 * arg1;
						arg6 -= arg1 * local322;
						arg7 -= local221 * arg1;
						arg1 = 0;
					}
					arg0 <<= 0xC;
					if (arg8 < 0) {
						arg0 -= arg8 * local240;
						arg8 = 0;
					}
					if ((arg1 == arg8 || local221 <= local266) && (arg1 != arg8 || local221 >= local240)) {
						arg5 -= arg8;
						arg8 -= arg1;
						arg1 = Static640.anInt11044 * arg1;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg6, (arg0 >> 12) + 1, (arg7 >> 12) + -1, Static204.anIntArray648, arg1)) {
										return false;
									}
									arg7 += local221;
									arg6 += local322;
									arg0 += local240;
									arg1 += Static640.anInt11044;
								}
							}
							if (!Static305.method5398(local309, arg6, (arg2 >> 12) + 1, (arg7 >> 12) + -1, Static204.anIntArray648, arg1)) {
								return false;
							}
							arg2 += local266;
							arg7 += local221;
							arg6 += local322;
							arg1 += Static640.anInt11044;
						}
					} else {
						arg5 -= arg8;
						arg8 -= arg1;
						arg1 *= Static640.anInt11044;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg6, (arg7 >> 12) + 1, (arg0 >> 12) - 1, Static204.anIntArray648, arg1)) {
										return false;
									}
									arg1 += Static640.anInt11044;
									arg0 += local240;
									arg6 += local322;
									arg7 += local221;
								}
							}
							if (!Static305.method5398(local309, arg6, (arg7 >> 12) + 1, (arg2 >> 12) + -1, Static204.anIntArray648, arg1)) {
								return false;
							}
							arg1 += Static640.anInt11044;
							arg7 += local221;
							arg6 += local322;
							arg2 += local266;
						}
					}
				}
			} else if (arg8 < arg5) {
				if (arg8 >= Static319.anInt6494) {
					return true;
				}
				arg3 = (arg3 << 8) + local309 - local309 * arg0;
				if (arg1 > Static319.anInt6494) {
					arg1 = Static319.anInt6494;
				}
				if (Static319.anInt6494 < arg5) {
					arg5 = Static319.anInt6494;
				}
				if (arg1 < arg5) {
					arg2 = arg0 <<= 0xC;
					arg7 <<= 0xC;
					if (arg8 < 0) {
						arg3 -= arg8 * local322;
						arg0 -= local266 * arg8;
						arg2 -= arg8 * local240;
						arg8 = 0;
					}
					if (arg1 < 0) {
						arg7 -= arg1 * local221;
						arg1 = 0;
					}
					if (local266 > local240) {
						arg5 -= arg1;
						arg1 -= arg8;
						arg8 *= Static640.anInt11044;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg3, (arg7 >> 12) + 1, (arg2 >> 12) + -1, Static204.anIntArray648, arg8)) {
										return false;
									}
									arg8 += Static640.anInt11044;
									arg7 += local221;
									arg3 += local322;
									arg2 += local240;
								}
							}
							if (!Static305.method5398(local309, arg3, (arg0 >> 12) + 1, (arg2 >> 12) - 1, Static204.anIntArray648, arg8)) {
								return false;
							}
							arg8 += Static640.anInt11044;
							arg0 += local266;
							arg2 += local240;
							arg3 += local322;
						}
					} else {
						arg5 -= arg1;
						arg1 -= arg8;
						arg8 *= Static640.anInt11044;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg3, (arg2 >> 12) + 1, (arg7 >> 12) - 1, Static204.anIntArray648, arg8)) {
										return false;
									}
									arg3 += local322;
									arg2 += local240;
									arg8 += Static640.anInt11044;
									arg7 += local221;
								}
							}
							if (!Static305.method5398(local309, arg3, (arg2 >> 12) + 1, (arg0 >> 12) + -1, Static204.anIntArray648, arg8)) {
								return false;
							}
							arg3 += local322;
							arg2 += local240;
							arg8 += Static640.anInt11044;
							arg0 += local266;
						}
					}
				} else {
					arg7 = arg0 <<= 0xC;
					if (arg8 < 0) {
						arg7 -= local240 * arg8;
						arg0 -= local266 * arg8;
						arg3 -= arg8 * local322;
						arg8 = 0;
					}
					arg2 <<= 0xC;
					if (arg5 < 0) {
						arg2 -= arg5 * local221;
						arg5 = 0;
					}
					if (local266 <= local240) {
						arg1 -= arg5;
						arg5 -= arg8;
						arg8 *= Static640.anInt11044;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg3, (arg2 >> 12) + 1, (arg0 >> 12) + -1, Static204.anIntArray648, arg8)) {
										return false;
									}
									arg0 += local266;
									arg2 += local221;
									arg3 += local322;
									arg8 += Static640.anInt11044;
								}
							}
							if (!Static305.method5398(local309, arg3, (arg7 >> 12) + 1, (arg0 >> 12) - 1, Static204.anIntArray648, arg8)) {
								return false;
							}
							arg3 += local322;
							arg8 += Static640.anInt11044;
							arg7 += local240;
							arg0 += local266;
						}
					} else {
						arg1 -= arg5;
						arg5 -= arg8;
						arg8 = Static640.anInt11044 * arg8;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg3, (arg0 >> 12) + 1, (arg2 >> 12) + -1, Static204.anIntArray648, arg8)) {
										return false;
									}
									arg3 += local322;
									arg2 += local221;
									arg8 += Static640.anInt11044;
									arg0 += local266;
								}
							}
							if (!Static305.method5398(local309, arg3, (arg0 >> 12) + 1, (arg7 >> 12) + -1, Static204.anIntArray648, arg8)) {
								return false;
							}
							arg0 += local266;
							arg8 += Static640.anInt11044;
							arg7 += local240;
							arg3 += local322;
						}
					}
				}
			} else if (arg5 >= Static319.anInt6494) {
				return true;
			} else {
				arg4 = local309 + (arg4 << 8) - arg2 * local309;
				if (Static319.anInt6494 < arg8) {
					arg8 = Static319.anInt6494;
				}
				if (Static319.anInt6494 < arg1) {
					arg1 = Static319.anInt6494;
				}
				if (arg8 >= arg1) {
					arg0 = arg2 <<= 0xC;
					arg7 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= local221 * arg5;
						arg4 -= arg5 * local322;
						arg2 -= local240 * arg5;
						arg5 = 0;
					}
					if (arg1 < 0) {
						arg7 -= local266 * arg1;
						arg1 = 0;
					}
					if (local221 >= local240) {
						arg8 -= arg1;
						arg1 -= arg5;
						arg5 = Static640.anInt11044 * arg5;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg4, (arg7 >> 12) + 1, (arg2 >> 12) + -1, Static204.anIntArray648, arg5)) {
										return false;
									}
									arg4 += local322;
									arg5 += Static640.anInt11044;
									arg2 += local240;
									arg7 += local266;
								}
							}
							if (!Static305.method5398(local309, arg4, (arg0 >> 12) + 1, (arg2 >> 12) - 1, Static204.anIntArray648, arg5)) {
								return false;
							}
							arg2 += local240;
							arg4 += local322;
							arg5 += Static640.anInt11044;
							arg0 += local221;
						}
					} else {
						arg8 -= arg1;
						arg1 -= arg5;
						arg5 = Static640.anInt11044 * arg5;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg4, (arg2 >> 12) + 1, (arg7 >> 12) - 1, Static204.anIntArray648, arg5)) {
										return false;
									}
									arg2 += local240;
									arg7 += local266;
									arg4 += local322;
									arg5 += Static640.anInt11044;
								}
							}
							if (!Static305.method5398(local309, arg4, (arg2 >> 12) + 1, (arg0 >> 12) - 1, Static204.anIntArray648, arg5)) {
								return false;
							}
							arg5 += Static640.anInt11044;
							arg2 += local240;
							arg4 += local322;
							arg0 += local221;
						}
					}
				} else {
					arg7 = arg2 <<= 0xC;
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= local221 * arg5;
						arg2 -= arg5 * local240;
						arg4 -= local322 * arg5;
						arg5 = 0;
					}
					if (arg8 < 0) {
						arg0 -= local266 * arg8;
						arg8 = 0;
					}
					if (arg5 != arg8 && local240 > local221 || arg5 == arg8 && local221 > local266) {
						arg1 -= arg8;
						arg8 -= arg5;
						arg5 = Static640.anInt11044 * arg5;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg4, (arg0 >> 12) + 1, (arg7 >> 12) + -1, Static204.anIntArray648, arg5)) {
										return false;
									}
									arg7 += local221;
									arg0 += local266;
									arg4 += local322;
									arg5 += Static640.anInt11044;
								}
							}
							if (!Static305.method5398(local309, arg4, (arg2 >> 12) + 1, (arg7 >> 12) + -1, Static204.anIntArray648, arg5)) {
								return false;
							}
							arg7 += local221;
							arg4 += local322;
							arg5 += Static640.anInt11044;
							arg2 += local240;
						}
					} else {
						arg1 -= arg8;
						arg8 -= arg5;
						arg5 = Static640.anInt11044 * arg5;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static305.method5398(local309, arg4, (arg7 >> 12) + 1, (arg0 >> 12) + -1, Static204.anIntArray648, arg5)) {
										return false;
									}
									arg4 += local322;
									arg5 += Static640.anInt11044;
									arg7 += local221;
									arg0 += local266;
								}
							}
							if (!Static305.method5398(local309, arg4, (arg7 >> 12) + 1, (arg2 >> 12) - 1, Static204.anIntArray648, arg5)) {
								return false;
							}
							arg2 += local240;
							arg7 += local221;
							arg5 += Static640.anInt11044;
							arg4 += local322;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
