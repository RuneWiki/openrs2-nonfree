import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!of", name = "db", descriptor = "[Lclient!se;")
	public static Class122[] aClass122Array1;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "I")
	public static int anInt3959 = 64;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
	public static int anInt3963 = -2;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!jb;IIBII)V")
	public static void method2943(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg0 == 0) {
			local7 = Static11.method222(arg4, arg3, arg5);
		} else if (arg0 == 1) {
			local7 = Static101.method2105(arg4, arg3, arg5);
		} else if (arg0 == 2) {
			local7 = Static60.method1145(arg4, arg3, arg5);
		} else if (arg0 == 3) {
			local7 = Static201.method3337(arg4, arg3, arg5);
		}
		@Pc(65) int local65 = Integer.MAX_VALUE & (int) (local7 >>> 32);
		@Pc(74) int local74 = (int) local7 >> 14 & 0x1F;
		@Pc(78) Class31 local78 = Static77.method1518(local65);
		if (local78.method928()) {
			Static205.method3436(arg4, arg3, local78, arg5);
		}
		@Pc(97) int local97 = (int) local7 >> 20 & 0x3;
		if (local7 == 0L) {
			return;
		}
		if (arg0 == 0) {
			Static64.method1257(arg4, arg3, arg5);
			if (local78.anInt1323 != 0) {
				arg1.method2208(local74, arg5, local78.aBoolean74, !local78.aBoolean71, local97, arg3);
			}
		} else if (arg0 == 1) {
			Static164.method2855(arg4, arg3, arg5);
		} else if (arg0 == 2) {
			Static176.method3017(arg4, arg3, arg5);
			if (local78.anInt1323 != 0 && local78.anInt1321 + arg3 < 104 && arg5 + local78.anInt1321 < 104 && arg3 + local78.anInt1331 < 104 && arg5 + local78.anInt1331 < 104) {
				arg1.method2214(arg5, !local78.aBoolean71, local97, arg3, local78.anInt1331, local78.aBoolean74, local78.anInt1321);
			}
		} else if (arg0 == 3) {
			Static252.method4078(arg4, arg3, arg5);
			if (local78.anInt1323 == 1) {
				arg1.method2212(arg3, arg5);
			}
		}
		if (local78.anIntArray100 != null) {
			local78 = local78.method935();
			return;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2944(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				@Pc(67) char local67 = Static249.aCharArray5[(int) (local53 - arg0 * 37L)];
				if (local67 == '_') {
					local67 = ' ';
					@Pc(79) int local79 = local49.length() - 1;
					local49.setCharAt(local79, Character.toUpperCase(local49.charAt(local79)));
				}
				local49.append(local67);
			}
			local49.reverse();
			local49.setCharAt(0, Character.toUpperCase(local49.charAt(0)));
			return local49.toString();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZIZZ)Lclient!hc;")
	public static Class51 method2946(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) Class71 local15 = null;
		if (Static52.aClass5_7 != null) {
			local15 = new Class71(arg0, Static52.aClass5_7, Static56.aClass5Array1[arg0], 1000000);
		}
		Static157.aClass17_Sub1Array1[arg0] = Static202.aClass130_1.method3888(Static252.aClass71_4, local15, arg0);
		if (arg2) {
			Static157.aClass17_Sub1Array1[arg0].method2194();
		}
		return new Class51(Static157.aClass17_Sub1Array1[arg0], arg3, arg1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2947(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static13.method232(arg1, 3);
		local8.method3810();
		local8.aString359 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!mi;I)V")
	public static void method2949(@OriginalArg(0) Class9_Sub1 arg0) {
		if (arg0.anInt404 == 0) {
			return;
		}
		@Pc(13) Class59 local13 = arg0.method207();
		@Pc(42) int local42;
		@Pc(48) int local48;
		if (arg0.anInt423 != -1 && arg0.anInt423 < 32768) {
			@Pc(33) Class9_Sub1_Sub2 local33 = Static36.aClass9_Sub1_Sub2Array2[arg0.anInt423];
			if (local33 != null) {
				local42 = arg0.anInt427 - local33.anInt427;
				local48 = arg0.anInt479 - local33.anInt479;
				if (local42 != 0 || local48 != 0) {
					arg0.anInt418 = (int) (Math.atan2((double) local42, (double) local48) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(105) int local105;
		@Pc(76) int local76;
		if (arg0.anInt423 >= 32768) {
			local76 = arg0.anInt423 - 32768;
			if (local76 == Static243.anInt5251) {
				local76 = 2047;
			}
			@Pc(89) Class9_Sub1_Sub1 local89 = Static147.aClass9_Sub1_Sub1Array1[local76];
			if (local89 != null) {
				local48 = arg0.anInt427 - local89.anInt427;
				local105 = arg0.anInt479 - local89.anInt479;
				if (local48 != 0 || local105 != 0) {
					arg0.anInt418 = (int) (Math.atan2((double) local48, (double) local105) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt433 != 0 || arg0.anInt459 != 0) && (arg0.anInt453 == 0 || arg0.anInt429 > 0)) {
			local76 = arg0.anInt427 - (arg0.anInt433 - Static64.anInt1786 - Static64.anInt1786) * 64;
			local42 = arg0.anInt479 - (arg0.anInt459 - Static29.anInt907 - Static29.anInt907) * 64;
			if (local76 != 0 || local42 != 0) {
				arg0.anInt418 = (int) (Math.atan2((double) local76, (double) local42) * 325.949D) & 0x7FF;
			}
			arg0.anInt459 = 0;
			arg0.anInt433 = 0;
		}
		local76 = arg0.anInt418 - arg0.anInt419 & 0x7FF;
		if (local76 == 0) {
			arg0.anInt406 = 0;
			arg0.anInt408 = 0;
		} else if (local13.anInt2745 == 0) {
			arg0.anInt406++;
			@Pc(826) boolean local826;
			if (local76 > 1024) {
				arg0.anInt419 -= arg0.anInt404;
				local826 = true;
				if (local76 < arg0.anInt404 || local76 > 2048 - arg0.anInt404) {
					arg0.anInt419 = arg0.anInt418;
					local826 = false;
				}
				if (arg0.anInt406 > 25 || local826) {
					arg0.anInt451 = local13.anInt2747;
					if (arg0.anInt453 > 0) {
						if (arg0.aByteArray5[arg0.anInt453 - 1] == 2) {
							if (local13.anInt2754 != -1) {
								arg0.anInt451 = local13.anInt2754;
							} else if (local13.anInt2726 != -1) {
								arg0.anInt451 = local13.anInt2726;
							}
						} else if (arg0.aByteArray5[arg0.anInt453 - 1] == 0) {
							if (local13.anInt2748 != -1) {
								arg0.anInt451 = local13.anInt2748;
							} else if (local13.anInt2758 != -1) {
								arg0.anInt451 = local13.anInt2758;
							}
						} else if (local13.anInt2736 != -1) {
							arg0.anInt451 = local13.anInt2736;
						}
					} else if (local13.anInt2749 != -1) {
						arg0.anInt451 = local13.anInt2749;
					}
				}
			} else {
				arg0.anInt419 += arg0.anInt404;
				local826 = true;
				if (local76 < arg0.anInt404 || local76 > 2048 - arg0.anInt404) {
					local826 = false;
					arg0.anInt419 = arg0.anInt418;
				}
				if (arg0.anInt406 > 25 || local826) {
					arg0.anInt451 = local13.anInt2747;
					if (arg0.anInt453 > 0) {
						if (arg0.aByteArray5[arg0.anInt453 - 1] == 2) {
							if (local13.anInt2730 != -1) {
								arg0.anInt451 = local13.anInt2730;
							} else if (local13.anInt2726 != -1) {
								arg0.anInt451 = local13.anInt2726;
							}
						} else if (arg0.aByteArray5[arg0.anInt453 - 1] == 0) {
							if (local13.anInt2727 != -1) {
								arg0.anInt451 = local13.anInt2727;
							} else if (local13.anInt2758 != -1) {
								arg0.anInt451 = local13.anInt2758;
							}
						} else if (local13.anInt2752 != -1) {
							arg0.anInt451 = local13.anInt2752;
						}
					} else if (local13.anInt2751 != -1) {
						arg0.anInt451 = local13.anInt2751;
					}
				}
			}
			arg0.anInt419 &= 0x7FF;
		} else {
			arg0.anInt451 = -1;
			local42 = arg0.anInt418 << 5;
			if (local42 != arg0.anInt405) {
				arg0.anInt405 = local42;
				arg0.anInt428 = 0;
				local48 = local42 - arg0.anInt447 & 0xFFFF;
				local105 = arg0.anInt408 * arg0.anInt408 / (local13.anInt2745 * 2);
				@Pc(299) int local299;
				if (arg0.anInt408 > 0 && local105 <= local48 && local48 - local105 < 32768) {
					arg0.aBoolean25 = true;
					arg0.anInt470 = local48 / 2;
					local299 = local13.anInt2719 * local13.anInt2719 / (local13.anInt2745 * 2);
					if (local299 > 32767) {
						local299 = 32767;
					}
					if (local299 < arg0.anInt470) {
						arg0.anInt470 = local48 - local299;
					}
				} else if (arg0.anInt408 < 0 && 65536 - local48 >= local105 && 65536 - local48 - local105 < 32768) {
					local299 = local13.anInt2719 * local13.anInt2719 / (local13.anInt2745 * 2);
					if (local299 > 32767) {
						local299 = 32767;
					}
					arg0.anInt470 = (65536 - local48) / 2;
					arg0.aBoolean25 = true;
					if (local299 < arg0.anInt470) {
						arg0.anInt470 = 65536 - local48 - local299;
					}
				} else {
					arg0.aBoolean25 = false;
				}
			}
			if (arg0.anInt408 == 0) {
				local48 = arg0.anInt405 - arg0.anInt447 & 0xFFFF;
				if (local13.anInt2745 > local48) {
					arg0.anInt447 = arg0.anInt405;
				} else {
					local105 = local13.anInt2719 * local13.anInt2719 / (local13.anInt2745 * 2);
					arg0.aBoolean25 = true;
					arg0.anInt428 = 0;
					if (local105 > 32767) {
						local105 = 32767;
					}
					if (local48 < 32768) {
						arg0.anInt408 = local13.anInt2745;
						arg0.anInt470 = local48 / 2;
						if (local105 < arg0.anInt470) {
							arg0.anInt470 = local48 - local105;
						}
					} else {
						arg0.anInt470 = (65536 - local48) / 2;
						arg0.anInt408 = -local13.anInt2745;
						if (arg0.anInt470 > local105) {
							arg0.anInt470 = 65536 - local105 - local48;
						}
					}
				}
			} else if (arg0.anInt408 > 0) {
				if (arg0.anInt470 <= arg0.anInt428) {
					arg0.aBoolean25 = false;
				}
				if (!arg0.aBoolean25) {
					arg0.anInt408 -= local13.anInt2745;
					if (arg0.anInt408 < 0) {
						arg0.anInt408 = 0;
					}
				} else if (arg0.anInt408 < local13.anInt2719) {
					arg0.anInt408 += local13.anInt2745;
				}
			} else {
				if (arg0.anInt428 >= arg0.anInt470) {
					arg0.aBoolean25 = false;
				}
				if (!arg0.aBoolean25) {
					arg0.anInt408 += local13.anInt2745;
					if (arg0.anInt408 > 0) {
						arg0.anInt408 = 0;
					}
				} else if (-local13.anInt2719 < arg0.anInt408) {
					arg0.anInt408 -= local13.anInt2745;
				}
			}
			if (arg0.anInt408 > 0) {
				arg0.anInt428 += arg0.anInt408;
			} else {
				arg0.anInt428 -= arg0.anInt408;
			}
			arg0.anInt447 += arg0.anInt408;
			arg0.anInt447 &= 0xFFFF;
			arg0.anInt419 = arg0.anInt447 >> 5;
			if (arg0.anInt408 >= 0) {
				if (arg0.anInt453 > 0) {
					if (arg0.aByteArray5[arg0.anInt453 - 1] == 2) {
						if (local13.anInt2730 != -1) {
							arg0.anInt451 = local13.anInt2730;
						} else if (local13.anInt2726 != -1) {
							arg0.anInt451 = local13.anInt2726;
						}
					} else if (arg0.aByteArray5[arg0.anInt453 - 1] == 0) {
						if (local13.anInt2727 != -1) {
							arg0.anInt451 = local13.anInt2727;
						} else if (local13.anInt2758 != -1) {
							arg0.anInt451 = local13.anInt2758;
						}
					}
				}
				if (arg0.anInt451 == -1) {
					if (local13.anInt2752 != -1) {
						arg0.anInt451 = local13.anInt2752;
					} else if (local13.anInt2751 != -1) {
						arg0.anInt451 = local13.anInt2751;
					}
				}
			} else {
				if (arg0.anInt453 > 0) {
					if (arg0.aByteArray5[arg0.anInt453 - 1] == 2) {
						if (local13.anInt2754 != -1) {
							arg0.anInt451 = local13.anInt2754;
						} else if (local13.anInt2726 != -1) {
							arg0.anInt451 = local13.anInt2726;
						}
					} else if (arg0.aByteArray5[arg0.anInt453 - 1] == 0) {
						if (local13.anInt2748 != -1) {
							arg0.anInt451 = local13.anInt2748;
						} else if (local13.anInt2758 != -1) {
							arg0.anInt451 = local13.anInt2758;
						}
					}
				}
				if (arg0.anInt451 == -1) {
					if (local13.anInt2736 != -1) {
						arg0.anInt451 = local13.anInt2736;
					} else if (local13.anInt2749 != -1) {
						arg0.anInt451 = local13.anInt2749;
					}
				}
			}
			if (arg0.anInt451 == -1) {
				arg0.anInt451 = local13.anInt2747;
				return;
			}
		}
	}
}
