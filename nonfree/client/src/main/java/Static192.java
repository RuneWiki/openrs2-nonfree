import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!ve;")
	public static Class69 aClass69_36;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
	public static int anInt4309;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1231 = Static81.method1507("Unable to find ");

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public static int anInt4303 = 0;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1235 = Static81.method1507("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1232 = aClass24_1235;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1233 = Static81.method1507("Fallen lassen");

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1234 = aClass24_1231;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Lclient!fj;")
	public static final Class1_Sub7 aClass1_Sub7_6 = new Class1_Sub7(new byte[5000]);

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static int anInt4307 = 0;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!rh;")
	public static final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_31 = new Class1_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1236 = Static81.method1507("Einloggen");

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
	public static int anInt4308 = 0;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1237 = Static81.method1507("mapfunction");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)Z")
	public static boolean method3303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static85.method2618(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static52.method1042(local10 + 1, Static181.anIntArrayArrayArray10[arg0][arg1][arg2] + arg3, local14 + 1) && Static52.method1042(local10 + 128 - 1, Static181.anIntArrayArrayArray10[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static52.method1042(local10 + 128 - 1, Static181.anIntArrayArrayArray10[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static52.method1042(local10 + 1, Static181.anIntArrayArrayArray10[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII[IIIIIZI)V")
	public static void method3304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg6 < Static90.anInt4604) {
			arg1 -= Static90.anInt4604 - arg6;
			arg6 = Static90.anInt4604;
		}
		if (arg5 == 9) {
			arg5 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (Static90.anInt4602 > arg9) {
			arg0 -= Static90.anInt4602 - arg9;
			arg9 = Static90.anInt4602;
		}
		if (arg5 == 10) {
			arg2 = arg2 + 3 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 11) {
			arg5 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		if (arg1 + arg6 > Static90.anInt4603) {
			arg1 = Static90.anInt4603 - arg6;
		}
		if (arg9 + arg0 > Static90.anInt4600) {
			arg0 = Static90.anInt4600 - arg9;
		}
		@Pc(110) int local110 = Static90.anInt4601 - arg0;
		@Pc(116) int local116 = arg9 + Static90.anInt4601 * arg6;
		@Pc(123) int local123;
		@Pc(127) int local127;
		if (arg5 == 1) {
			if (arg2 == 0) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local127 <= local123) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 1) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local127 <= local123) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 2) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local123 <= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 3) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local123 <= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			}
		} else if (arg5 == 2) {
			if (arg2 == 0) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local123 >> 1 >= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 1) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local127 >= local123 << 1) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 2) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = arg0 - 1; local127 >= 0; local127--) {
						if (local127 <= local123 >> 1) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 3) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = arg0 - 1; local127 >= 0; local127--) {
						if (local127 >= local123 << 1) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			}
		} else if (arg5 == 3) {
			if (arg2 == 0) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = arg0 - 1; local127 >= 0; local127--) {
						if (local127 <= local123 >> 1) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 1) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local123 << 1 <= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 2) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local123 >> 1 >= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 3) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = arg0 - 1; local127 >= 0; local127--) {
						if (local127 >= local123 << 1) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			}
		} else if (arg5 == 4) {
			if (arg2 == 0) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local123 >> 1 <= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 1) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = 0; local127 < arg0; local127++) {
						if (local127 <= local123 << 1) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 2) {
				for (local123 = 0; local123 < arg1; local123++) {
					for (local127 = arg0 - 1; local127 >= 0; local127--) {
						if (local123 >> 1 <= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			} else if (arg2 == 3) {
				for (local123 = arg1 - 1; local123 >= 0; local123--) {
					for (local127 = arg0 - 1; local127 >= 0; local127--) {
						if (local123 << 1 >= local127) {
							arg3[local116] = arg7;
						} else if (arg8) {
							arg3[local116] = arg4;
						}
						local116++;
					}
					local116 += local110;
				}
			}
		} else if (arg5 != 5) {
			if (arg5 == 6) {
				if (arg2 == 0) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (local127 <= arg0 / 2) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 1) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (local123 <= arg1 / 2) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 2) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (local127 >= arg0 / 2) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 3) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (arg1 / 2 <= local123) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
			}
			if (arg5 == 7) {
				if (arg2 == 0) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (local123 - arg1 / 2 >= local127) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 1) {
					for (local123 = arg1 - 1; local123 >= 0; local123--) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (local123 - arg1 / 2 >= local127) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 2) {
					for (local123 = arg1 - 1; local123 >= 0; local123--) {
						for (local127 = arg0 - 1; local127 >= 0; local127--) {
							if (local123 - arg1 / 2 >= local127) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 3) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = arg0 - 1; local127 >= 0; local127--) {
							if (local123 - arg1 / 2 >= local127) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
			}
			if (arg5 == 8) {
				if (arg2 == 0) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (local127 >= local123 - arg1 / 2) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 1) {
					for (local123 = arg1 - 1; local123 >= 0; local123--) {
						for (local127 = 0; local127 < arg0; local127++) {
							if (local123 - arg1 / 2 <= local127) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 2) {
					for (local123 = arg1 - 1; local123 >= 0; local123--) {
						for (local127 = arg0 - 1; local127 >= 0; local127--) {
							if (local127 >= local123 - arg1 / 2) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
				if (arg2 == 3) {
					for (local123 = 0; local123 < arg1; local123++) {
						for (local127 = arg0 - 1; local127 >= 0; local127--) {
							if (local123 - arg1 / 2 <= local127) {
								arg3[local116] = arg7;
							} else if (arg8) {
								arg3[local116] = arg4;
							}
							local116++;
						}
						local116 += local110;
					}
					return;
				}
			}
		} else if (arg2 == 0) {
			for (local123 = arg1 - 1; local123 >= 0; local123--) {
				for (local127 = arg0 - 1; local127 >= 0; local127--) {
					if (local127 >= local123 >> 1) {
						arg3[local116] = arg7;
					} else if (arg8) {
						arg3[local116] = arg4;
					}
					local116++;
				}
				local116 += local110;
			}
		} else if (arg2 == 1) {
			for (local123 = arg1 - 1; local123 >= 0; local123--) {
				for (local127 = 0; local127 < arg0; local127++) {
					if (local127 <= local123 << 1) {
						arg3[local116] = arg7;
					} else if (arg8) {
						arg3[local116] = arg4;
					}
					local116++;
				}
				local116 += local110;
			}
		} else if (arg2 == 2) {
			for (local123 = 0; local123 < arg1; local123++) {
				for (local127 = 0; local127 < arg0; local127++) {
					if (local127 >= local123 >> 1) {
						arg3[local116] = arg7;
					} else if (arg8) {
						arg3[local116] = arg4;
					}
					local116++;
				}
				local116 += local110;
			}
		} else if (arg2 == 3) {
			for (local123 = 0; local123 < arg1; local123++) {
				for (local127 = arg0 - 1; local127 >= 0; local127--) {
					if (local123 << 1 >= local127) {
						arg3[local116] = arg7;
					} else if (arg8) {
						arg3[local116] = arg4;
					}
					local116++;
				}
				local116 += local110;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
	public static void method3306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Static52.anInt1338 || arg3 < Static13.anInt308) {
			return;
		}
		@Pc(32) boolean local32;
		if (Static63.anInt1608 > arg0) {
			local32 = false;
			arg0 = Static63.anInt1608;
		} else if (arg0 <= Static63.anInt1595) {
			local32 = true;
		} else {
			arg0 = Static63.anInt1595;
			local32 = false;
		}
		@Pc(49) boolean local49;
		if (arg4 < Static63.anInt1608) {
			local49 = false;
			arg4 = Static63.anInt1608;
		} else if (Static63.anInt1595 >= arg4) {
			local49 = true;
		} else {
			arg4 = Static63.anInt1595;
			local49 = false;
		}
		if (Static13.anInt308 <= arg1) {
			Static39.method731(Static98.anIntArrayArray16[arg1++], arg4, arg0, arg2);
		} else {
			arg1 = Static13.anInt308;
		}
		if (Static52.anInt1338 >= arg3) {
			Static39.method731(Static98.anIntArrayArray16[arg3--], arg4, arg0, arg2);
		} else {
			arg3 = Static52.anInt1338;
		}
		@Pc(110) int local110;
		if (local49 && local32) {
			for (local110 = arg1; local110 <= arg3; local110++) {
				@Pc(116) int[] local116 = Static98.anIntArrayArray16[local110];
				local116[arg4] = local116[arg0] = arg2;
			}
			return;
		}
		if (local49) {
			for (local110 = arg1; local110 <= arg3; local110++) {
				Static98.anIntArrayArray16[local110][arg4] = arg2;
			}
			return;
		}
		if (local32) {
			for (local110 = arg1; local110 <= arg3; local110++) {
				Static98.anIntArrayArray16[local110][arg0] = arg2;
			}
			return;
		}
	}
}
