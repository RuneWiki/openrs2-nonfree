import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!dh;")
	public static Class26 aClass26_2;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public static int anInt4772;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
	public static int[] anIntArray496 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	public static int anInt4770 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method3305() {
		if (Static100.aClass31_4 != null) {
			Static100.aClass31_4.method1505();
		}
		if (Static25.aClass31_7 != null) {
			Static25.aClass31_7.method1505();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIII)Lclient!i;")
	public static Class41 method3307(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(26) int local26 = 1;
		@Pc(30) int local30 = arg1 / 10;
		while (local30 != 0) {
			local30 /= 10;
			local26++;
		}
		@Pc(44) int local44 = local26;
		if (arg1 < 0 || arg0) {
			local44 = local26 + 1;
		}
		@Pc(55) byte[] local55 = new byte[local44];
		if (arg1 < 0) {
			local55[0] = 45;
		} else if (arg0) {
			local55[0] = 43;
		}
		for (@Pc(74) int local74 = 0; local74 < local26; local74++) {
			@Pc(80) int local80 = arg1 % 10;
			arg1 /= 10;
			if (local80 < 0) {
				local80 = -local80;
			}
			if (local80 > 9) {
				local80 += 39;
			}
			local55[local44 - local74 - 1] = (byte) (local80 + 48);
		}
		@Pc(119) Class41 local119 = new Class41();
		local119.anInt2012 = local44;
		local119.aByteArray26 = local55;
		return local119;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIIIIIIBI[I)V")
	public static void method3308(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		if (Static64.anInt1699 > arg4) {
			arg1 -= Static64.anInt1699 - arg4;
			arg4 = Static64.anInt1699;
		}
		if (Static64.anInt1700 < arg1 + arg4) {
			arg1 = Static64.anInt1700 - arg4;
		}
		if (Static64.anInt1697 > arg7) {
			arg8 -= Static64.anInt1697 - arg7;
			arg7 = Static64.anInt1697;
		}
		@Pc(49) int local49 = arg4 * Static64.anInt1698 + arg7;
		if (arg6 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 8;
		}
		if (Static64.anInt1701 < arg8 + arg7) {
			arg8 = Static64.anInt1701 - arg7;
		}
		@Pc(110) int local110 = Static64.anInt1698 - arg8;
		@Pc(122) int local122;
		@Pc(126) int local126;
		if (arg6 == 1) {
			if (arg3 == 0) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 <= local122) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 1) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 >= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 2) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 <= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 3) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 <= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			}
		} else if (arg6 == 2) {
			if (arg3 == 0) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 <= local122 >> 1) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 1) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 >= local122 << 1) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 2) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local122 >> 1 >= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 3) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local126 >= local122 << 1) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			}
		} else if (arg6 == 3) {
			if (arg3 == 0) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local126 <= local122 >> 1) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 1) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 << 1 <= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 2) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 <= local122 >> 1) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 3) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local122 << 1 <= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			}
		} else if (arg6 == 4) {
			if (arg3 == 0) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 >> 1 <= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 1) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 << 1 >= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 2) {
				for (local122 = 0; local122 < arg1; local122++) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local122 >> 1 <= local126) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			} else if (arg3 == 3) {
				for (local122 = arg1 - 1; local122 >= 0; local122--) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local126 <= local122 << 1) {
							arg9[local49] = arg5;
						} else if (arg0) {
							arg9[local49] = arg2;
						}
						local49++;
					}
					local49 += local110;
				}
			}
		} else if (arg6 != 5) {
			if (arg6 == 6) {
				if (arg3 == 0) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 <= arg8 / 2) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 1) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local122 <= arg1 / 2) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 2) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 >= arg8 / 2) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 3) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (arg1 / 2 <= local122) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
			}
			if (arg6 == 7) {
				if (arg3 == 0) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 <= local122 - arg1 / 2) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 1) {
					for (local122 = arg1 - 1; local122 >= 0; local122--) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local122 - arg1 / 2 >= local126) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 2) {
					for (local122 = arg1 - 1; local122 >= 0; local122--) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local122 - arg1 / 2 >= local126) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 3) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local126 <= local122 - arg1 / 2) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
			}
			if (arg6 == 8) {
				if (arg3 == 0) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local122 - arg1 / 2 <= local126) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 1) {
					for (local122 = arg1 - 1; local122 >= 0; local122--) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local122 - arg1 / 2 <= local126) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 2) {
					for (local122 = arg1 - 1; local122 >= 0; local122--) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local122 - arg1 / 2 <= local126) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
				if (arg3 == 3) {
					for (local122 = 0; local122 < arg1; local122++) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local122 - arg1 / 2 <= local126) {
								arg9[local49] = arg5;
							} else if (arg0) {
								arg9[local49] = arg2;
							}
							local49++;
						}
						local49 += local110;
					}
					return;
				}
			}
		} else if (arg3 == 0) {
			for (local122 = arg1 - 1; local122 >= 0; local122--) {
				for (local126 = arg8 - 1; local126 >= 0; local126--) {
					if (local126 >= local122 >> 1) {
						arg9[local49] = arg5;
					} else if (arg0) {
						arg9[local49] = arg2;
					}
					local49++;
				}
				local49 += local110;
			}
		} else if (arg3 == 1) {
			for (local122 = arg1 - 1; local122 >= 0; local122--) {
				for (local126 = 0; local126 < arg8; local126++) {
					if (local126 <= local122 << 1) {
						arg9[local49] = arg5;
					} else if (arg0) {
						arg9[local49] = arg2;
					}
					local49++;
				}
				local49 += local110;
			}
		} else if (arg3 == 2) {
			for (local122 = 0; local122 < arg1; local122++) {
				for (local126 = 0; local126 < arg8; local126++) {
					if (local126 >= local122 >> 1) {
						arg9[local49] = arg5;
					} else if (arg0) {
						arg9[local49] = arg2;
					}
					local49++;
				}
				local49 += local110;
			}
		} else if (arg3 == 3) {
			for (local122 = 0; local122 < arg1; local122++) {
				for (local126 = arg8 - 1; local126 >= 0; local126--) {
					if (local126 <= local122 << 1) {
						arg9[local49] = arg5;
					} else if (arg0) {
						arg9[local49] = arg2;
					}
					local49++;
				}
				local49 += local110;
			}
		}
	}
}
