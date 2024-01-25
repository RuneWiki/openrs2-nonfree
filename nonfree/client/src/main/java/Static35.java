import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIZIII)Z")
	public static boolean method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg4 > 2000 || arg1 > 2000 || arg6 > 2000 || arg7 > 2000 || arg0 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg4 >= -2000 && arg1 >= -2000 && arg6 >= -2000 && arg7 >= -2000 && arg0 >= -2000) {
			@Pc(74) int local74;
			if (Static540.anInt9050 == 2) {
				local74 = arg6 + arg5 * Static312.anInt5723;
				if (local74 >= 0 && local74 < Static429.anIntArray461.length && (arg2 << 8) - 38400 < Static429.anIntArray461[local74]) {
					return false;
				}
				local74 = arg7 + arg4 * Static312.anInt5723;
				if (local74 >= 0 && local74 < Static429.anIntArray461.length && (arg3 << 8) - 38400 < Static429.anIntArray461[local74]) {
					return false;
				}
				local74 = Static312.anInt5723 * arg1 + arg0;
				if (local74 >= 0 && local74 < Static429.anIntArray461.length && (arg8 << 8) - 38400 < Static429.anIntArray461[local74]) {
					return false;
				}
			}
			local74 = arg7 - arg6;
			@Pc(158) int local158 = arg4 - arg5;
			@Pc(163) int local163 = arg0 - arg6;
			@Pc(168) int local168 = arg1 - arg5;
			@Pc(173) int local173 = arg3 - arg2;
			if (arg5 < arg4 && arg1 < arg1) {
				arg5--;
				if (arg4 <= arg1) {
					arg1++;
				} else {
					arg4++;
				}
			} else if (arg4 < arg1) {
				arg4--;
				if (arg1 >= arg5) {
					arg1++;
				} else {
					arg5++;
				}
			} else {
				arg1--;
				if (arg5 > arg4) {
					arg5++;
				} else {
					arg4++;
				}
			}
			@Pc(226) int local226 = arg8 - arg2;
			@Pc(228) int local228 = 0;
			if (arg5 != arg4) {
				local228 = (arg7 - arg6 << 12) / (arg4 - arg5);
			}
			@Pc(245) int local245 = 0;
			if (arg1 != arg4) {
				local245 = (arg0 - arg7 << 12) / (arg1 - arg4);
			}
			@Pc(261) int local261 = 0;
			if (arg5 != arg1) {
				local261 = (arg6 - arg0 << 12) / (arg5 - arg1);
			}
			@Pc(289) int local289 = local168 * local74 - local163 * local158;
			if (local289 == 0) {
				return false;
			}
			@Pc(309) int local309 = (local173 * local168 - local226 * local158 << 8) / local289;
			@Pc(322) int local322 = (local226 * local74 - local163 * local173 << 8) / local289;
			if (arg5 <= arg4 && arg5 <= arg1) {
				if (arg5 >= Static198.anInt3804) {
					return true;
				}
				if (Static198.anInt3804 < arg1) {
					arg1 = Static198.anInt3804;
				}
				arg2 = (arg2 << 8) + local309 - arg6 * local309;
				if (Static198.anInt3804 < arg4) {
					arg4 = Static198.anInt3804;
				}
				if (arg1 > arg4) {
					arg0 = arg6 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= local261 * arg5;
						arg2 -= arg5 * local322;
						arg6 -= local228 * arg5;
						arg5 = 0;
					}
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= local245 * arg4;
						arg4 = 0;
					}
					if (arg4 != arg5 && local261 < local228 || arg5 == arg4 && local261 > local245) {
						arg1 -= arg4;
						arg4 -= arg5;
						arg5 = Static312.anInt5723 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg0 >> 12) - 1)) {
										return false;
									}
									arg7 += local245;
									arg0 += local261;
									arg2 += local322;
									arg5 += Static312.anInt5723;
								}
							}
							if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg0 >> 12) - 1)) {
								return false;
							}
							arg2 += local322;
							arg6 += local228;
							arg0 += local261;
							arg5 += Static312.anInt5723;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg5;
						arg5 *= Static312.anInt5723;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg7 >> 12) - 1)) {
										return false;
									}
									arg0 += local261;
									arg5 += Static312.anInt5723;
									arg7 += local245;
									arg2 += local322;
								}
							}
							if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg6 >> 12) - 1)) {
								return false;
							}
							arg2 += local322;
							arg5 += Static312.anInt5723;
							arg6 += local228;
							arg0 += local261;
						}
					}
				} else {
					arg7 = arg6 <<= 0xC;
					if (arg5 < 0) {
						arg6 -= local228 * arg5;
						arg2 -= arg5 * local322;
						arg7 -= arg5 * local261;
						arg5 = 0;
					}
					arg0 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local245;
						arg1 = 0;
					}
					if ((arg1 == arg5 || local261 >= local228) && (arg5 != arg1 || local228 >= local245)) {
						arg4 -= arg1;
						arg1 -= arg5;
						arg5 = Static312.anInt5723 * arg5;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg6 >> 12) - 1)) {
										return false;
									}
									arg5 += Static312.anInt5723;
									arg6 += local228;
									arg2 += local322;
									arg0 += local245;
								}
							}
							if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg6 >> 12) - 1)) {
								return false;
							}
							arg7 += local261;
							arg6 += local228;
							arg2 += local322;
							arg5 += Static312.anInt5723;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg5;
						arg5 *= Static312.anInt5723;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg0 >> 12) - 1)) {
										return false;
									}
									arg6 += local228;
									arg5 += Static312.anInt5723;
									arg0 += local245;
									arg2 += local322;
								}
							}
							if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg2, arg5, (arg7 >> 12) - 1)) {
								return false;
							}
							arg6 += local228;
							arg5 += Static312.anInt5723;
							arg7 += local261;
							arg2 += local322;
						}
					}
				}
			} else if (arg1 < arg4) {
				if (arg1 >= Static198.anInt3804) {
					return true;
				}
				if (arg4 > Static198.anInt3804) {
					arg4 = Static198.anInt3804;
				}
				if (Static198.anInt3804 < arg5) {
					arg5 = Static198.anInt3804;
				}
				arg8 = local309 + (arg8 << 8) - local309 * arg0;
				if (arg4 <= arg5) {
					arg6 = arg0 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= local245 * arg1;
						arg0 -= arg1 * local261;
						arg8 -= arg1 * local322;
						arg1 = 0;
					}
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= local228 * arg4;
						arg4 = 0;
					}
					if (local245 >= local261) {
						arg5 -= arg4;
						arg4 -= arg1;
						arg1 *= Static312.anInt5723;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg0 >> 12) - 1)) {
										return false;
									}
									arg0 += local261;
									arg8 += local322;
									arg7 += local228;
									arg1 += Static312.anInt5723;
								}
							}
							if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg0 >> 12) - 1)) {
								return false;
							}
							arg1 += Static312.anInt5723;
							arg0 += local261;
							arg6 += local245;
							arg8 += local322;
						}
					} else {
						arg5 -= arg4;
						arg4 -= arg1;
						arg1 = Static312.anInt5723 * arg1;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg7 >> 12) - 1)) {
										return false;
									}
									arg0 += local261;
									arg1 += Static312.anInt5723;
									arg8 += local322;
									arg7 += local228;
								}
							}
							if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg6 >> 12) - 1)) {
								return false;
							}
							arg0 += local261;
							arg1 += Static312.anInt5723;
							arg6 += local245;
							arg8 += local322;
						}
					}
				} else {
					arg7 = arg0 <<= 0xC;
					arg6 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local261;
						arg7 -= arg1 * local245;
						arg8 -= arg1 * local322;
						arg1 = 0;
					}
					if (arg5 < 0) {
						arg6 -= arg5 * local228;
						arg5 = 0;
					}
					if (local245 >= local261) {
						arg4 -= arg5;
						arg5 -= arg1;
						arg1 = Static312.anInt5723 * arg1;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg6 >> 12) - 1)) {
										return false;
									}
									arg8 += local322;
									arg6 += local228;
									arg1 += Static312.anInt5723;
									arg7 += local245;
								}
							}
							if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg0 >> 12) - 1)) {
								return false;
							}
							arg0 += local261;
							arg1 += Static312.anInt5723;
							arg8 += local322;
							arg7 += local245;
						}
					} else {
						arg4 -= arg5;
						arg5 -= arg1;
						arg1 *= Static312.anInt5723;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg7 >> 12) - 1)) {
										return false;
									}
									arg6 += local228;
									arg7 += local245;
									arg1 += Static312.anInt5723;
									arg8 += local322;
								}
							}
							if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg8, arg1, (arg7 >> 12) - 1)) {
								return false;
							}
							arg8 += local322;
							arg0 += local261;
							arg1 += Static312.anInt5723;
							arg7 += local245;
						}
					}
				}
			} else if (Static198.anInt3804 <= arg4) {
				return true;
			} else {
				if (Static198.anInt3804 < arg1) {
					arg1 = Static198.anInt3804;
				}
				if (arg5 > Static198.anInt3804) {
					arg5 = Static198.anInt3804;
				}
				arg3 = (arg3 << 8) - (arg7 * local309 - local309);
				if (arg5 <= arg1) {
					arg0 = arg7 <<= 0xC;
					arg6 <<= 0xC;
					if (arg4 < 0) {
						arg0 -= local228 * arg4;
						arg3 -= local322 * arg4;
						arg7 -= arg4 * local245;
						arg4 = 0;
					}
					if (arg5 < 0) {
						arg6 -= local261 * arg5;
						arg5 = 0;
					}
					if (local245 > local228) {
						arg1 -= arg5;
						arg5 -= arg4;
						arg4 *= Static312.anInt5723;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg6 >> 12) - 1)) {
										return false;
									}
									arg3 += local322;
									arg6 += local261;
									arg7 += local245;
									arg4 += Static312.anInt5723;
								}
							}
							if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg0 >> 12) - 1)) {
								return false;
							}
							arg7 += local245;
							arg0 += local228;
							arg3 += local322;
							arg4 += Static312.anInt5723;
						}
					} else {
						arg1 -= arg5;
						arg5 -= arg4;
						arg4 = Static312.anInt5723 * arg4;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg7 >> 12) - 1)) {
										return false;
									}
									arg4 += Static312.anInt5723;
									arg7 += local245;
									arg3 += local322;
									arg6 += local261;
								}
							}
							if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg7 >> 12) - 1)) {
								return false;
							}
							arg4 += Static312.anInt5723;
							arg3 += local322;
							arg0 += local228;
							arg7 += local245;
						}
					}
				} else {
					arg6 = arg7 <<= 0xC;
					arg0 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= local228 * arg4;
						arg3 -= arg4 * local322;
						arg7 -= local245 * arg4;
						arg4 = 0;
					}
					if (arg1 < 0) {
						arg0 -= local261 * arg1;
						arg1 = 0;
					}
					if (arg1 != arg4 && local245 > local228 || arg1 == arg4 && local261 < local228) {
						arg5 -= arg1;
						arg1 -= arg4;
						arg4 = Static312.anInt5723 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static132.method2305((arg0 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg6 >> 12) - 1)) {
										return false;
									}
									arg3 += local322;
									arg6 += local228;
									arg4 += Static312.anInt5723;
									arg0 += local261;
								}
							}
							if (!Static132.method2305((arg7 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg6 >> 12) - 1)) {
								return false;
							}
							arg4 += Static312.anInt5723;
							arg6 += local228;
							arg7 += local245;
							arg3 += local322;
						}
					} else {
						arg5 -= arg1;
						arg1 -= arg4;
						arg4 = Static312.anInt5723 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg0 >> 12) - 1)) {
										return false;
									}
									arg6 += local228;
									arg3 += local322;
									arg0 += local261;
									arg4 += Static312.anInt5723;
								}
							}
							if (!Static132.method2305((arg6 >> 12) + 1, local309, Static429.anIntArray461, arg3, arg4, (arg7 >> 12) - 1)) {
								return false;
							}
							arg3 += local322;
							arg6 += local228;
							arg7 += local245;
							arg4 += Static312.anInt5723;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BZ)V")
	public static void method644(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub3 local10 = new Class1_Sub3(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method7974();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(26) int[] local26 = Static193.anIntArray183 = new int[6];
					local26[0] = local10.method7945();
					local26[1] = local10.method7945();
					local26[2] = local10.method7945();
					local26[3] = local10.method7945();
					local26[4] = local10.method7945();
					local26[5] = local10.method7945();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local14 == 4) {
						local76 = local10.method7974();
						Static28.anIntArray27 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static28.anIntArray27[local81] = local10.method7945();
							if (Static28.anIntArray27[local81] == 65535) {
								Static28.anIntArray27[local81] = -1;
							}
						}
					} else if (local14 == 5) {
						local76 = local10.method7974();
						Static198.anIntArray185 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static198.anIntArray185[local81] = local10.method7945();
							if (Static198.anIntArray185[local81] == 65535) {
								Static198.anIntArray185[local81] = -1;
							}
						}
					}
				}
			}
		}
	}
}
