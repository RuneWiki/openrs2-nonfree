import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "Lclient!lc;")
	public static Class98 aClass98_86;

	@OriginalMember(owner = "client!kl", name = "M", descriptor = "Lclient!lc;")
	public static Class98 aClass98_87;

	@OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
	public static int anInt2925;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!kl", name = "L", descriptor = "Lclient!ie;")
	public static Class4_Sub17_Sub1 aClass4_Sub17_Sub1_3 = new Class4_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII[IIZII)V")
	public static void method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		if (arg2 >= Static166.anInt3306) {
			return;
		}
		if (Static166.anInt3302 > arg2) {
			local7 = Static166.anInt3302;
		}
		@Pc(20) int local20 = arg4 + arg2;
		if (Static166.anInt3302 >= local20) {
			return;
		}
		@Pc(27) int local27 = arg9;
		if (local20 > Static166.anInt3306) {
			local20 = Static166.anInt3306;
		}
		if (arg9 >= Static166.anInt3304) {
			return;
		}
		if (Static166.anInt3303 > arg9) {
			local27 = Static166.anInt3303;
		}
		@Pc(48) int local48 = arg9 + arg1;
		if (local48 <= Static166.anInt3303) {
			return;
		}
		if (arg0 == 9) {
			arg0 = 1;
			arg5 = arg5 + 1 & 0x3;
		}
		@Pc(77) int local77 = Static166.anInt3305 + local7 - local20;
		local20 -= arg2;
		@Pc(87) int local87 = local7 + Static166.anInt3305 * local27;
		if (Static166.anInt3304 < local48) {
			local48 = Static166.anInt3304;
		}
		local48 -= arg9;
		local27 -= arg9;
		local7 -= arg2;
		if (arg0 == 10) {
			arg0 = 1;
			arg5 = arg5 + 3 & 0x3;
		}
		@Pc(120) int local120 = arg1 - local48;
		@Pc(124) int local124 = arg4 - local20;
		if (arg0 == 11) {
			arg0 = 8;
			arg5 = arg5 + 3 & 0x3;
		}
		@Pc(141) int local141 = arg4 - local7;
		@Pc(145) int local145 = arg1 - local27;
		@Pc(155) int local155;
		@Pc(160) int local160;
		if (arg0 == 1) {
			if (arg5 == 0) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local160 <= local155) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 1) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local160 <= local155) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 2) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local160 >= local155) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 3) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local155 <= local160) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			}
		} else if (arg0 == 2) {
			if (arg5 == 0) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local160 <= local155 >> 1) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 1) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local87 >= 0 && local87 < arg6.length) {
							if (local160 >= local155 << 1) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						} else {
							local87++;
						}
					}
					local87 += local77;
				}
			} else if (arg5 == 2) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local141 - 1; local160 >= local124; local160--) {
						if (local155 >> 1 >= local160) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 3) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local141 - 1; local160 >= local124; local160--) {
						if (local155 << 1 <= local160) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			}
		} else if (arg0 == 3) {
			if (arg5 == 0) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local141 - 1; local160 >= local124; local160--) {
						if (local160 <= local155 >> 1) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 1) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local155 << 1 <= local160) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 2) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local155 >> 1 >= local160) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 3) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local141 - 1; local160 >= local124; local160--) {
						if (local155 << 1 <= local160) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			}
		} else if (arg0 == 4) {
			if (arg5 == 0) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local155 >> 1 <= local160) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 1) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local7; local160 < local20; local160++) {
						if (local160 <= local155 << 1) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 2) {
				for (local155 = local27; local155 < local48; local155++) {
					for (local160 = local141 - 1; local160 >= local124; local160--) {
						if (local160 >= local155 >> 1) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			} else if (arg5 == 3) {
				for (local155 = local145 - 1; local155 >= local120; local155--) {
					for (local160 = local141 - 1; local160 >= local124; local160--) {
						if (local160 <= local155 << 1) {
							arg6[local87] = arg3;
						} else if (arg7) {
							arg6[local87] = arg8;
						}
						local87++;
					}
					local87 += local77;
				}
			}
		} else if (arg0 != 5) {
			if (arg0 == 6) {
				if (arg5 == 0) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local7; local160 < local20; local160++) {
							if (arg4 / 2 >= local160) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 1) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local7; local160 < local20; local160++) {
							if (arg1 / 2 >= local155) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 2) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local7; local160 < local20; local160++) {
							if (arg4 / 2 <= local160) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 3) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local7; local160 < local20; local160++) {
							if (arg1 / 2 <= local155) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
			}
			if (arg0 == 7) {
				if (arg5 == 0) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local7; local160 < local20; local160++) {
							if (local160 <= local155 - arg1 / 2) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 1) {
					for (local155 = local145 - 1; local155 >= local120; local155--) {
						for (local160 = local7; local160 < local20; local160++) {
							if (local155 - arg1 / 2 >= local160) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 2) {
					for (local155 = local145 - 1; local155 >= local120; local155--) {
						for (local160 = local141 - 1; local160 >= local124; local160--) {
							if (local160 <= local155 - arg1 / 2) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 3) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local141 - 1; local160 >= local124; local160--) {
							if (local160 <= local155 - arg1 / 2) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
			}
			if (arg0 == 8) {
				if (arg5 == 0) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local7; local160 < local20; local160++) {
							if (local155 - arg1 / 2 <= local160) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 1) {
					for (local155 = local145 - 1; local155 >= local120; local155--) {
						for (local160 = local7; local160 < local20; local160++) {
							if (local155 - arg1 / 2 <= local160) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 2) {
					for (local155 = local145 - 1; local155 >= local120; local155--) {
						for (local160 = local141 - 1; local160 >= local124; local160--) {
							if (local155 - arg1 / 2 <= local160) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
				if (arg5 == 3) {
					for (local155 = local27; local155 < local48; local155++) {
						for (local160 = local141 - 1; local160 >= local124; local160--) {
							if (local155 - arg1 / 2 <= local160) {
								arg6[local87] = arg3;
							} else if (arg7) {
								arg6[local87] = arg8;
							}
							local87++;
						}
						local87 += local77;
					}
					return;
				}
			}
		} else if (arg5 == 0) {
			for (local155 = local145 - 1; local155 >= local120; local155--) {
				for (local160 = local141 - 1; local160 >= local124; local160--) {
					if (local155 >> 1 <= local160) {
						arg6[local87] = arg3;
					} else if (arg7) {
						arg6[local87] = arg8;
					}
					local87++;
				}
				local87 += local77;
			}
		} else if (arg5 == 1) {
			for (local155 = local145 - 1; local155 >= local120; local155--) {
				for (local160 = local7; local160 < local20; local160++) {
					if (local160 <= local155 << 1) {
						arg6[local87] = arg3;
					} else if (arg7) {
						arg6[local87] = arg8;
					}
					local87++;
				}
				local87 += local77;
			}
		} else if (arg5 == 2) {
			for (local155 = local27; local155 < local48; local155++) {
				for (local160 = local7; local160 < local20; local160++) {
					if (local160 >= local155 >> 1) {
						arg6[local87] = arg3;
					} else if (arg7) {
						arg6[local87] = arg8;
					}
					local87++;
				}
				local87 += local77;
			}
		} else if (arg5 == 3) {
			for (local155 = local27; local155 < local48; local155++) {
				for (local160 = local141 - 1; local160 >= local124; local160--) {
					if (local160 <= local155 << 1) {
						arg6[local87] = arg3;
					} else if (arg7) {
						arg6[local87] = arg8;
					}
					local87++;
				}
				local87 += local77;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)I")
	public static int method2311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 <= arg0 ? (arg0 > arg1 ? arg1 : arg0) : arg2;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII)V")
	public static void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static266.anInt5000 = arg0;
		Static18.anInt383 = arg2;
		Static121.anInt2644 = arg3;
		Static47.anInt951 = arg1;
		Static274.anInt5109 = arg4;
		if (Static121.anInt2644 >= 100) {
			@Pc(25) int local25 = Static18.anInt383 * 128 + 64;
			@Pc(31) int local31 = Static266.anInt5000 * 128 + 64;
			@Pc(40) int local40 = Static96.method1559(Static210.anInt4103, local25, local31) - Static274.anInt5109;
			@Pc(45) int local45 = local31 - Static149.anInt3032;
			@Pc(49) int local49 = local40 - Static160.anInt3185;
			@Pc(54) int local54 = local25 - Static211.anInt4210;
			@Pc(66) int local66 = (int) Math.sqrt((double) (local45 * local45 + local54 * local54));
			Static299.anInt5560 = (int) (Math.atan2((double) local49, (double) local66) * 325.949D) & 0x7FF;
			Static279.anInt5259 = (int) (Math.atan2((double) local45, (double) local54) * -325.949D) & 0x7FF;
			if (Static299.anInt5560 < 128) {
				Static299.anInt5560 = 128;
			}
			if (Static299.anInt5560 > 383) {
				Static299.anInt5560 = 383;
			}
		}
		Static239.anInt4616 = 2;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
	public static void method2313() {
		aClass4_Sub17_Sub1_3 = null;
		aClass98_87 = null;
		aClass98_86 = null;
	}
}
