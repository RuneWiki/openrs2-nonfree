import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!ba;")
	public static Class11 aClass11_5;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_729 = Static187.method3089("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	public static int anInt1731 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B[IIIIIIZIII)V")
	public static void method1184(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 9) {
			arg5 = arg5 + 1 & 0x3;
			arg1 = 1;
		}
		if (arg8 < Static46.anInt4202) {
			arg3 -= Static46.anInt4202 - arg8;
			arg8 = Static46.anInt4202;
		}
		if (arg2 < Static46.anInt4197) {
			arg7 -= Static46.anInt4197 - arg2;
			arg2 = Static46.anInt4197;
		}
		if (Static46.anInt4201 < arg8 + arg3) {
			arg3 = Static46.anInt4201 - arg8;
		}
		if (arg1 == 10) {
			arg5 = arg5 + 3 & 0x3;
			arg1 = 1;
		}
		@Pc(79) int local79 = Static46.anInt4199 - arg3;
		@Pc(85) int local85 = arg2 * Static46.anInt4199 + arg8;
		if (arg1 == 11) {
			arg1 = 8;
			arg5 = arg5 + 3 & 0x3;
		}
		if (arg2 + arg7 > Static46.anInt4200) {
			arg7 = Static46.anInt4200 - arg2;
		}
		@Pc(128) int local128;
		@Pc(132) int local132;
		if (arg1 == 1) {
			if (arg5 == 0) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local128 >= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 1) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local132 <= local128) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 2) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local128 <= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 3) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local132 >= local128) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			}
		} else if (arg1 == 2) {
			if (arg5 == 0) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local128 >> 1 >= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 1) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local128 << 1 <= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 2) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = arg3 - 1; local132 >= 0; local132--) {
						if (local128 >> 1 >= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 3) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = arg3 - 1; local132 >= 0; local132--) {
						if (local128 << 1 <= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			}
		} else if (arg1 == 3) {
			if (arg5 == 0) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = arg3 - 1; local132 >= 0; local132--) {
						if (local128 >> 1 >= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 1) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local128 << 1 <= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 2) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local128 >> 1 >= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 3) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = arg3 - 1; local132 >= 0; local132--) {
						if (local128 << 1 <= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			}
		} else if (arg1 == 4) {
			if (arg5 == 0) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local128 >> 1 <= local132) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 1) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = 0; local132 < arg3; local132++) {
						if (local132 <= local128 << 1) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 2) {
				for (local128 = 0; local128 < arg7; local128++) {
					for (local132 = arg3 - 1; local132 >= 0; local132--) {
						if (local132 >= local128 >> 1) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			} else if (arg5 == 3) {
				for (local128 = arg7 - 1; local128 >= 0; local128--) {
					for (local132 = arg3 - 1; local132 >= 0; local132--) {
						if (local132 <= local128 << 1) {
							arg0[local85] = arg9;
						} else if (arg6) {
							arg0[local85] = arg4;
						}
						local85++;
					}
					local85 += local79;
				}
			}
		} else if (arg1 != 5) {
			if (arg1 == 6) {
				if (arg5 == 0) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (arg3 / 2 >= local132) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 1) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (arg7 / 2 >= local128) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 2) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (arg3 / 2 <= local132) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 3) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (local128 >= arg7 / 2) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
			}
			if (arg1 == 7) {
				if (arg5 == 0) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (local132 <= local128 - arg7 / 2) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 1) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (local128 - arg7 / 2 >= local132) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 2) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						for (local132 = arg3 - 1; local132 >= 0; local132--) {
							if (local132 <= local128 - arg7 / 2) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 3) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = arg3 - 1; local132 >= 0; local132--) {
							if (local132 <= local128 - arg7 / 2) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
			}
			if (arg1 == 8) {
				if (arg5 == 0) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (local132 >= local128 - arg7 / 2) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 1) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						for (local132 = 0; local132 < arg3; local132++) {
							if (local132 >= local128 - arg7 / 2) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 2) {
					for (local128 = arg7 - 1; local128 >= 0; local128--) {
						for (local132 = arg3 - 1; local132 >= 0; local132--) {
							if (local128 - arg7 / 2 <= local132) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
				if (arg5 == 3) {
					for (local128 = 0; local128 < arg7; local128++) {
						for (local132 = arg3 - 1; local132 >= 0; local132--) {
							if (local128 - arg7 / 2 <= local132) {
								arg0[local85] = arg9;
							} else if (arg6) {
								arg0[local85] = arg4;
							}
							local85++;
						}
						local85 += local79;
					}
					return;
				}
			}
		} else if (arg5 == 0) {
			for (local128 = arg7 - 1; local128 >= 0; local128--) {
				for (local132 = arg3 - 1; local132 >= 0; local132--) {
					if (local128 >> 1 <= local132) {
						arg0[local85] = arg9;
					} else if (arg6) {
						arg0[local85] = arg4;
					}
					local85++;
				}
				local85 += local79;
			}
		} else if (arg5 == 1) {
			for (local128 = arg7 - 1; local128 >= 0; local128--) {
				for (local132 = 0; local132 < arg3; local132++) {
					if (local132 <= local128 << 1) {
						arg0[local85] = arg9;
					} else if (arg6) {
						arg0[local85] = arg4;
					}
					local85++;
				}
				local85 += local79;
			}
		} else if (arg5 == 2) {
			for (local128 = 0; local128 < arg7; local128++) {
				for (local132 = 0; local132 < arg3; local132++) {
					if (local132 >= local128 >> 1) {
						arg0[local85] = arg9;
					} else if (arg6) {
						arg0[local85] = arg4;
					}
					local85++;
				}
				local85 += local79;
			}
		} else if (arg5 == 3) {
			for (local128 = 0; local128 < arg7; local128++) {
				for (local132 = arg3 - 1; local132 >= 0; local132--) {
					if (local128 << 1 >= local132) {
						arg0[local85] = arg9;
					} else if (arg6) {
						arg0[local85] = arg4;
					}
					local85++;
				}
				local85 += local79;
			}
		}
	}
}
