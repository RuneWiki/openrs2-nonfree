import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
	public static int anInt547;

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_3 = new Class53(100);

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_157 = Static151.method2243(")1");

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "[I")
	public static final int[] anIntArray56 = new int[1000];

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_158 = Static151.method2243("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
	public static int anInt556 = 0;

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_160 = Static151.method2243(" more options");

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "Lclient!mb;")
	public static Class62 aClass62_159 = aClass62_160;

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
	public static int anInt557 = -1;

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
	public static int anInt558 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIZ[IIIIIBI)V")
	public static void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 < Static212.anInt4429) {
			arg7 -= Static212.anInt4429 - arg5;
			arg5 = Static212.anInt4429;
		}
		if (arg6 == 9) {
			arg1 = arg1 + 1 & 0x3;
			arg6 = 1;
		}
		if (Static212.anInt4427 < arg5 + arg7) {
			arg7 = Static212.anInt4427 - arg5;
		}
		if (Static212.anInt4426 > arg9) {
			arg2 -= Static212.anInt4426 - arg9;
			arg9 = Static212.anInt4426;
		}
		@Pc(64) int local64 = Static212.anInt4430 - arg7;
		@Pc(74) int local74 = arg5 + Static212.anInt4430 * arg9;
		if (arg9 + arg2 > Static212.anInt4428) {
			arg2 = Static212.anInt4428 - arg9;
		}
		if (arg6 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg1 = arg1 + 3 & 0x3;
			arg6 = 8;
		}
		@Pc(124) int local124;
		@Pc(128) int local128;
		if (arg6 == 1) {
			if (arg1 == 0) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local128 <= local124) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 1) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local124 >= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 2) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local124 <= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 3) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local128 >= local124) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			}
		} else if (arg6 == 2) {
			if (arg1 == 0) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local124 >> 1 >= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 1) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local128 >= local124 << 1) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 2) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						if (local124 >> 1 >= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 3) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						if (local124 << 1 <= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			}
		} else if (arg6 == 3) {
			if (arg1 == 0) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						if (local124 >> 1 >= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 1) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local128 >= local124 << 1) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 2) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local124 >> 1 >= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 3) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						if (local124 << 1 <= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			}
		} else if (arg6 == 4) {
			if (arg1 == 0) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local124 >> 1 <= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 1) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = 0; local128 < arg7; local128++) {
						if (local128 <= local124 << 1) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 2) {
				for (local124 = 0; local124 < arg2; local124++) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						if (local128 >= local124 >> 1) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			} else if (arg1 == 3) {
				for (local124 = arg2 - 1; local124 >= 0; local124--) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						if (local124 << 1 >= local128) {
							arg4[local74] = arg8;
						} else if (arg3) {
							arg4[local74] = arg0;
						}
						local74++;
					}
					local74 += local64;
				}
			}
		} else if (arg6 != 5) {
			if (arg6 == 6) {
				if (arg1 == 0) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (arg7 / 2 >= local128) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 1) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (arg2 / 2 >= local124) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 2) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (arg7 / 2 <= local128) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 3) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (arg2 / 2 <= local124) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
			}
			if (arg6 == 7) {
				if (arg1 == 0) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (local128 <= local124 - arg2 / 2) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 1) {
					for (local124 = arg2 - 1; local124 >= 0; local124--) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (local124 - arg2 / 2 >= local128) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 2) {
					for (local124 = arg2 - 1; local124 >= 0; local124--) {
						for (local128 = arg7 - 1; local128 >= 0; local128--) {
							if (local124 - arg2 / 2 >= local128) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 3) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = arg7 - 1; local128 >= 0; local128--) {
							if (local124 - arg2 / 2 >= local128) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
			}
			if (arg6 == 8) {
				if (arg1 == 0) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (local128 >= local124 - arg2 / 2) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 1) {
					for (local124 = arg2 - 1; local124 >= 0; local124--) {
						for (local128 = 0; local128 < arg7; local128++) {
							if (local124 - arg2 / 2 <= local128) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 2) {
					for (local124 = arg2 - 1; local124 >= 0; local124--) {
						for (local128 = arg7 - 1; local128 >= 0; local128--) {
							if (local124 - arg2 / 2 <= local128) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
				if (arg1 == 3) {
					for (local124 = 0; local124 < arg2; local124++) {
						for (local128 = arg7 - 1; local128 >= 0; local128--) {
							if (local128 >= local124 - arg2 / 2) {
								arg4[local74] = arg8;
							} else if (arg3) {
								arg4[local74] = arg0;
							}
							local74++;
						}
						local74 += local64;
					}
					return;
				}
			}
		} else if (arg1 == 0) {
			for (local124 = arg2 - 1; local124 >= 0; local124--) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					if (local128 >= local124 >> 1) {
						arg4[local74] = arg8;
					} else if (arg3) {
						arg4[local74] = arg0;
					}
					local74++;
				}
				local74 += local64;
			}
		} else if (arg1 == 1) {
			for (local124 = arg2 - 1; local124 >= 0; local124--) {
				for (local128 = 0; local128 < arg7; local128++) {
					if (local124 << 1 >= local128) {
						arg4[local74] = arg8;
					} else if (arg3) {
						arg4[local74] = arg0;
					}
					local74++;
				}
				local74 += local64;
			}
		} else if (arg1 == 2) {
			for (local124 = 0; local124 < arg2; local124++) {
				for (local128 = 0; local128 < arg7; local128++) {
					if (local124 >> 1 <= local128) {
						arg4[local74] = arg8;
					} else if (arg3) {
						arg4[local74] = arg0;
					}
					local74++;
				}
				local74 += local64;
			}
		} else if (arg1 == 3) {
			for (local124 = 0; local124 < arg2; local124++) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					if (local128 <= local124 << 1) {
						arg4[local74] = arg8;
					} else if (arg3) {
						arg4[local74] = arg0;
					}
					local74++;
				}
				local74 += local64;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZIIIZI)Lclient!vi;")
	public static Class2_Sub1_Sub2 method423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(25) long local25 = ((long) arg1 << 38) + (arg3 ? 137438953472L : 0L) + (long) arg2 + ((long) arg4 << 16) + ((long) arg0 << 40);
		@Pc(40) Class2_Sub1_Sub2 local40 = (Class2_Sub1_Sub2) Static81.aClass53_26.method1648(local25);
		if (local40 != null) {
			return local40;
		}
		local40 = Static22.method397(arg1, arg4, arg2, arg3, arg0, false);
		if (local40 != null) {
			Static81.aClass53_26.method1645(local25, local40);
		}
		return local40;
	}
}
