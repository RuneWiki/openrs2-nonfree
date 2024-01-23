import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
	public static int[] anIntArray570 = new int[14];

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!tl;")
	public static Class155 aClass155_43 = new Class155(64);

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Z")
	public static boolean aBoolean302 = true;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIZZIII[II)V")
	public static void method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		if (Static203.anInt4510 <= arg3) {
			return;
		}
		@Pc(20) int local20 = arg3 + arg9;
		if (arg3 < Static203.anInt4508) {
			local7 = Static203.anInt4508;
		}
		if (local20 <= Static203.anInt4508) {
			return;
		}
		if (local20 > Static203.anInt4510) {
			local20 = Static203.anInt4510;
		}
		@Pc(40) int local40 = arg1;
		if (arg1 >= Static203.anInt4506) {
			return;
		}
		if (Static203.anInt4509 > arg1) {
			local40 = Static203.anInt4509;
		}
		@Pc(62) int local62 = arg1 + arg2;
		if (local62 <= Static203.anInt4509) {
			return;
		}
		if (arg6 == 9) {
			arg6 = 1;
			arg7 = arg7 + 1 & 0x3;
		}
		if (arg6 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg6 = 1;
		}
		if (Static203.anInt4506 < local62) {
			local62 = Static203.anInt4506;
		}
		if (arg6 == 11) {
			arg6 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		@Pc(119) int local119 = local7 + Static203.anInt4507 * local40;
		local40 -= arg1;
		local62 -= arg1;
		@Pc(134) int local134 = local7 + Static203.anInt4507 - local20;
		local20 -= arg3;
		local7 -= arg3;
		@Pc(147) int local147 = arg9 - local20;
		@Pc(152) int local152 = arg2 - local62;
		@Pc(156) int local156 = arg2 - local40;
		@Pc(161) int local161 = arg9 - local7;
		@Pc(173) int local173;
		@Pc(178) int local178;
		if (arg6 == 1) {
			if (arg7 == 0) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local178 <= local173) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 1) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local173 >= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 2) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local178 >= local173) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 3) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local173 <= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			}
		} else if (arg6 == 2) {
			if (arg7 == 0) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local173 >> 1 >= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 1) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local119 >= 0 && arg8.length > local119) {
							if (local173 << 1 <= local178) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						} else {
							local119++;
						}
					}
					local119 += local134;
				}
			} else if (arg7 == 2) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local161 - 1; local178 >= local147; local178--) {
						if (local173 >> 1 >= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 3) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local161 - 1; local178 >= local147; local178--) {
						if (local178 >= local173 << 1) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			}
		} else if (arg6 == 3) {
			if (arg7 == 0) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local161 - 1; local178 >= local147; local178--) {
						if (local173 >> 1 >= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 1) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local173 << 1 <= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 2) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local178 <= local173 >> 1) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 3) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local161 - 1; local178 >= local147; local178--) {
						if (local173 << 1 <= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			}
		} else if (arg6 == 4) {
			if (arg7 == 0) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local178 >= local173 >> 1) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 1) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local7; local178 < local20; local178++) {
						if (local173 << 1 >= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 2) {
				for (local173 = local40; local173 < local62; local173++) {
					for (local178 = local161 - 1; local178 >= local147; local178--) {
						if (local178 >= local173 >> 1) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			} else if (arg7 == 3) {
				for (local173 = local156 - 1; local173 >= local152; local173--) {
					for (local178 = local161 - 1; local178 >= local147; local178--) {
						if (local173 << 1 >= local178) {
							arg8[local119] = arg0;
						} else if (arg4) {
							arg8[local119] = arg5;
						}
						local119++;
					}
					local119 += local134;
				}
			}
		} else if (arg6 != 5) {
			if (arg6 == 6) {
				if (arg7 == 0) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local7; local178 < local20; local178++) {
							if (local178 <= arg9 / 2) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 1) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local7; local178 < local20; local178++) {
							if (local173 <= arg2 / 2) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 2) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local7; local178 < local20; local178++) {
							if (arg9 / 2 <= local178) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 3) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local7; local178 < local20; local178++) {
							if (arg2 / 2 <= local173) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
			}
			if (arg6 == 7) {
				if (arg7 == 0) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local7; local178 < local20; local178++) {
							if (local173 - arg2 / 2 >= local178) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 1) {
					for (local173 = local156 - 1; local173 >= local152; local173--) {
						for (local178 = local7; local178 < local20; local178++) {
							if (local173 - arg2 / 2 >= local178) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 2) {
					for (local173 = local156 - 1; local173 >= local152; local173--) {
						for (local178 = local161 - 1; local178 >= local147; local178--) {
							if (local178 <= local173 - arg2 / 2) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 3) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local161 - 1; local178 >= local147; local178--) {
							if (local178 <= local173 - arg2 / 2) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
			}
			if (arg6 == 8) {
				if (arg7 == 0) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local7; local178 < local20; local178++) {
							if (local178 >= local173 - arg2 / 2) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 1) {
					for (local173 = local156 - 1; local173 >= local152; local173--) {
						for (local178 = local7; local178 < local20; local178++) {
							if (local178 >= local173 - arg2 / 2) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 2) {
					for (local173 = local156 - 1; local173 >= local152; local173--) {
						for (local178 = local161 - 1; local178 >= local147; local178--) {
							if (local173 - arg2 / 2 <= local178) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
				if (arg7 == 3) {
					for (local173 = local40; local173 < local62; local173++) {
						for (local178 = local161 - 1; local178 >= local147; local178--) {
							if (local173 - arg2 / 2 <= local178) {
								arg8[local119] = arg0;
							} else if (arg4) {
								arg8[local119] = arg5;
							}
							local119++;
						}
						local119 += local134;
					}
					return;
				}
			}
		} else if (arg7 == 0) {
			for (local173 = local156 - 1; local173 >= local152; local173--) {
				for (local178 = local161 - 1; local178 >= local147; local178--) {
					if (local173 >> 1 <= local178) {
						arg8[local119] = arg0;
					} else if (arg4) {
						arg8[local119] = arg5;
					}
					local119++;
				}
				local119 += local134;
			}
		} else if (arg7 == 1) {
			for (local173 = local156 - 1; local173 >= local152; local173--) {
				for (local178 = local7; local178 < local20; local178++) {
					if (local178 <= local173 << 1) {
						arg8[local119] = arg0;
					} else if (arg4) {
						arg8[local119] = arg5;
					}
					local119++;
				}
				local119 += local134;
			}
		} else if (arg7 == 2) {
			for (local173 = local40; local173 < local62; local173++) {
				for (local178 = local7; local178 < local20; local178++) {
					if (local173 >> 1 <= local178) {
						arg8[local119] = arg0;
					} else if (arg4) {
						arg8[local119] = arg5;
					}
					local119++;
				}
				local119 += local134;
			}
		} else if (arg7 == 3) {
			for (local173 = local40; local173 < local62; local173++) {
				for (local178 = local161 - 1; local178 >= local147; local178--) {
					if (local178 <= local173 << 1) {
						arg8[local119] = arg0;
					} else if (arg4) {
						arg8[local119] = arg5;
					}
					local119++;
				}
				local119 += local134;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Lclient!tf;")
	public static Class152 method4471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2332; local13++) {
			@Pc(22) Class152 local22 = local7.aClass152Array1[local13];
			if ((local22.aLong181 >> 29 & 0x3L) == 2L && local22.anInt5509 == arg1 && local22.anInt5519 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static102.anInt2239 && arg6 <= Static88.anInt2052 && Static152.anInt3532 <= arg0 && Static223.anInt1245 >= arg4) {
			Static34.method723(arg5, arg0, arg2, arg6, arg1, arg3, arg4);
		} else {
			Static220.method3904(arg2, arg3, arg4, arg5, arg1, arg0, arg6);
		}
	}
}
