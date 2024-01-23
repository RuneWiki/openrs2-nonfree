import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
	public static int anInt326;

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "Lclient!kk;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
	public static int anInt335 = 0;

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "I")
	public static int anInt341 = 0;

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
	public static int anInt343 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[IIIIIZI)V")
	public static void method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg1;
		if (arg1 >= Static29.anInt551) {
			return;
		}
		if (arg1 < Static29.anInt552) {
			local7 = Static29.anInt552;
		}
		@Pc(24) int local24 = arg7 + arg1;
		if (Static29.anInt552 >= local24) {
			return;
		}
		if (Static29.anInt551 < local24) {
			local24 = Static29.anInt551;
		}
		@Pc(39) int local39 = arg6;
		if (arg6 >= Static29.anInt550) {
			return;
		}
		if (Static29.anInt548 > arg6) {
			local39 = Static29.anInt548;
		}
		@Pc(56) int local56 = arg0 + arg6;
		if (local56 <= Static29.anInt548) {
			return;
		}
		if (arg5 == 9) {
			arg5 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (Static29.anInt550 < local56) {
			local56 = Static29.anInt550;
		}
		if (arg5 == 10) {
			arg5 = 1;
			arg2 = arg2 + 3 & 0x3;
		}
		local56 -= arg6;
		@Pc(101) int local101 = local7 + local39 * Static29.anInt549;
		if (arg5 == 11) {
			arg5 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		local39 -= arg6;
		@Pc(124) int local124 = Static29.anInt549 + local7 - local24;
		local24 -= arg1;
		local7 -= arg1;
		@Pc(136) int local136 = arg7 - local24;
		@Pc(146) int local146 = arg0 - local56;
		@Pc(151) int local151 = arg7 - local7;
		@Pc(155) int local155 = arg0 - local39;
		@Pc(167) int local167;
		@Pc(171) int local171;
		if (arg5 == 1) {
			if (arg2 == 0) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local171 <= local167) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 1) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local171 <= local167) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 2) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local167 <= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 3) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local167 <= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			}
		} else if (arg5 == 2) {
			if (arg2 == 0) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local167 >> 1 >= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 1) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local101 >= 0 && local101 < arg3.length) {
							if (local171 >= local167 << 1) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						} else {
							local101++;
						}
					}
					local101 += local124;
				}
			} else if (arg2 == 2) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local151 - 1; local171 >= local136; local171--) {
						if (local167 >> 1 >= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 3) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local151 - 1; local171 >= local136; local171--) {
						if (local171 >= local167 << 1) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			}
		} else if (arg5 == 3) {
			if (arg2 == 0) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local151 - 1; local171 >= local136; local171--) {
						if (local167 >> 1 >= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 1) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local171 >= local167 << 1) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 2) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local167 >> 1 >= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 3) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local151 - 1; local171 >= local136; local171--) {
						if (local167 << 1 <= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			}
		} else if (arg5 == 4) {
			if (arg2 == 0) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local167 >> 1 <= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 1) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local7; local171 < local24; local171++) {
						if (local167 << 1 >= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 2) {
				for (local167 = local39; local167 < local56; local167++) {
					for (local171 = local151 - 1; local171 >= local136; local171--) {
						if (local171 >= local167 >> 1) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			} else if (arg2 == 3) {
				for (local167 = local155 - 1; local167 >= local146; local167--) {
					for (local171 = local151 - 1; local171 >= local136; local171--) {
						if (local167 << 1 >= local171) {
							arg3[local101] = arg4;
						} else if (arg8) {
							arg3[local101] = arg9;
						}
						local101++;
					}
					local101 += local124;
				}
			}
		} else if (arg5 != 5) {
			if (arg5 == 6) {
				if (arg2 == 0) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local7; local171 < local24; local171++) {
							if (arg7 / 2 >= local171) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 1) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local7; local171 < local24; local171++) {
							if (local167 <= arg0 / 2) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 2) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local7; local171 < local24; local171++) {
							if (arg7 / 2 <= local171) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 3) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local7; local171 < local24; local171++) {
							if (local167 >= arg0 / 2) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
			}
			if (arg5 == 7) {
				if (arg2 == 0) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local7; local171 < local24; local171++) {
							if (local171 <= local167 - arg0 / 2) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 1) {
					for (local167 = local155 - 1; local167 >= local146; local167--) {
						for (local171 = local7; local171 < local24; local171++) {
							if (local171 <= local167 - arg0 / 2) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 2) {
					for (local167 = local155 - 1; local167 >= local146; local167--) {
						for (local171 = local151 - 1; local171 >= local136; local171--) {
							if (local167 - arg0 / 2 >= local171) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 3) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local151 - 1; local171 >= local136; local171--) {
							if (local167 - arg0 / 2 >= local171) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
			}
			if (arg5 == 8) {
				if (arg2 == 0) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local7; local171 < local24; local171++) {
							if (local171 >= local167 - arg0 / 2) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 1) {
					for (local167 = local155 - 1; local167 >= local146; local167--) {
						for (local171 = local7; local171 < local24; local171++) {
							if (local167 - arg0 / 2 <= local171) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 2) {
					for (local167 = local155 - 1; local167 >= local146; local167--) {
						for (local171 = local151 - 1; local171 >= local136; local171--) {
							if (local171 >= local167 - arg0 / 2) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
				if (arg2 == 3) {
					for (local167 = local39; local167 < local56; local167++) {
						for (local171 = local151 - 1; local171 >= local136; local171--) {
							if (local167 - arg0 / 2 <= local171) {
								arg3[local101] = arg4;
							} else if (arg8) {
								arg3[local101] = arg9;
							}
							local101++;
						}
						local101 += local124;
					}
					return;
				}
			}
		} else if (arg2 == 0) {
			for (local167 = local155 - 1; local167 >= local146; local167--) {
				for (local171 = local151 - 1; local171 >= local136; local171--) {
					if (local171 >= local167 >> 1) {
						arg3[local101] = arg4;
					} else if (arg8) {
						arg3[local101] = arg9;
					}
					local101++;
				}
				local101 += local124;
			}
		} else if (arg2 == 1) {
			for (local167 = local155 - 1; local167 >= local146; local167--) {
				for (local171 = local7; local171 < local24; local171++) {
					if (local171 <= local167 << 1) {
						arg3[local101] = arg4;
					} else if (arg8) {
						arg3[local101] = arg9;
					}
					local101++;
				}
				local101 += local124;
			}
		} else if (arg2 == 2) {
			for (local167 = local39; local167 < local56; local167++) {
				for (local171 = local7; local171 < local24; local171++) {
					if (local171 >= local167 >> 1) {
						arg3[local101] = arg4;
					} else if (arg8) {
						arg3[local101] = arg9;
					}
					local101++;
				}
				local101 += local124;
			}
		} else if (arg2 == 3) {
			for (local167 = local39; local167 < local56; local167++) {
				for (local171 = local151 - 1; local171 >= local136; local171--) {
					if (local167 << 1 >= local171) {
						arg3[local101] = arg4;
					} else if (arg8) {
						arg3[local101] = arg9;
					}
					local101++;
				}
				local101 += local124;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!je;ZLclient!je;)V")
	public static void method254(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg1.aClass1_Sub1_53 != null) {
			arg1.method3531();
		}
		arg1.aClass1_Sub1_53 = arg0;
		arg1.aClass1_Sub1_52 = arg0.aClass1_Sub1_52;
		arg1.aClass1_Sub1_53.aClass1_Sub1_52 = arg1;
		arg1.aClass1_Sub1_52.aClass1_Sub1_53 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Lclient!hh;)Lclient!hh;")
	public static Class50 method257(@OriginalArg(1) Class50[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static49.method775(0, arg0, arg0.length);
	}
}
