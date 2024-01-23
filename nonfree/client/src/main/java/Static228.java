import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Lclient!rn;")
	public static Class155 aClass155_36;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public static int anInt1431;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	public static int anInt1434;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public static int anInt1435;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!eh;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "Lclient!jo;")
	public static Class3_Sub4_Sub14 aClass3_Sub4_Sub14_2;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
	public static int anInt1437;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
	public static int anInt1438;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	public static int anInt1439;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public static int anInt1440;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public static int anInt1441;

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
	public static int anInt1442;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
	public static int anInt1443;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	public static int anInt1444;

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Lclient!cn;")
	private static Class30 aClass30_12 = new Class30(16);

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	public static int anInt1433 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "Lclient!mm;")
	public static Class115 aClass115_4 = new Class115();

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public static int anInt1436 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lclient!jo;")
	public static Class3_Sub4_Sub14 method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class3_Sub4_Sub14 local4 = (Class3_Sub4_Sub14) aClass30_12.method664(); local4 != null; local4 = (Class3_Sub4_Sub14) aClass30_12.method671()) {
			if (local4.aBoolean198 && local4.method2357(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()Lclient!fk;")
	public static Class56 method1183() {
		@Pc(3) int local3 = anInt1442 - anInt1437;
		@Pc(7) int local7 = anInt1440 - anInt1444;
		@Pc(15) int local15 = (anInt1441 - anInt1443 << 16) / local3;
		@Pc(23) int local23 = (anInt1438 - anInt1439 << 16) / local7;
		return method1188(local15, local23);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([IIIIIIIIIZ)V")
	private static void method1184(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(1) int local1 = arg1;
		if (arg1 >= Static143.anInt2747) {
			return;
		}
		if (arg1 < Static143.anInt2748) {
			local1 = Static143.anInt2748;
		}
		@Pc(14) int local14 = arg1 + arg5;
		if (local14 <= Static143.anInt2748) {
			return;
		}
		if (local14 > Static143.anInt2747) {
			local14 = Static143.anInt2747;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 >= Static143.anInt2744) {
			return;
		}
		if (arg2 < Static143.anInt2746) {
			local25 = Static143.anInt2746;
		}
		@Pc(38) int local38 = arg2 + arg6;
		if (local38 <= Static143.anInt2746) {
			return;
		}
		if (local38 > Static143.anInt2744) {
			local38 = Static143.anInt2744;
		}
		@Pc(53) int local53 = local25 * Static143.anInt2745 + local1;
		@Pc(59) int local59 = Static143.anInt2745 + local1 - local14;
		local1 -= arg1;
		local14 -= arg1;
		local25 -= arg2;
		local38 -= arg2;
		@Pc(79) int local79 = arg5 - local14;
		@Pc(83) int local83 = arg5 - local1;
		@Pc(87) int local87 = arg6 - local38;
		@Pc(91) int local91 = arg6 - local25;
		if (arg7 == 9) {
			arg7 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		@Pc(131) int local131;
		@Pc(136) int local136;
		if (arg7 == 1) {
			if (arg8 == 0) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 2) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local53 >= 0 && local53 < arg0.length) {
							if (local136 >= local131 << 1) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						} else {
							local53++;
						}
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 3) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 == 4) {
			if (arg8 == 0) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 >= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 1) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local1; local136 < local14; local136++) {
						if (local136 <= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 2) {
				for (local131 = local25; local131 < local38; local131++) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 >= local131 >> 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			} else if (arg8 == 3) {
				for (local131 = local91 - 1; local131 >= local87; local131--) {
					for (local136 = local83 - 1; local136 >= local79; local136--) {
						if (local136 <= local131 << 1) {
							arg0[local53] = arg4;
						} else if (arg9) {
							arg0[local53] = arg3;
						}
						local53++;
					}
					local53 += local59;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local131 <= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= arg5 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local131 >= arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 <= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg8 == 0) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 1) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local1; local136 < local14; local136++) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 2) {
					for (local131 = local91 - 1; local131 >= local87; local131--) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
				if (arg8 == 3) {
					for (local131 = local25; local131 < local38; local131++) {
						for (local136 = local83 - 1; local136 >= local79; local136--) {
							if (local136 >= local131 - arg6 / 2) {
								arg0[local53] = arg4;
							} else if (arg9) {
								arg0[local53] = arg3;
							}
							local53++;
						}
						local53 += local59;
					}
					return;
				}
			}
		} else if (arg8 == 0) {
			for (local131 = local91 - 1; local131 >= local87; local131--) {
				for (local136 = local83 - 1; local136 >= local79; local136--) {
					if (local136 >= local131 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 1) {
			for (local131 = local91 - 1; local131 >= local87; local131--) {
				for (local136 = local1; local136 < local14; local136++) {
					if (local136 <= local131 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 2) {
			for (local131 = local25; local131 < local38; local131++) {
				for (local136 = local1; local136 < local14; local136++) {
					if (local136 >= local131 >> 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		} else if (arg8 == 3) {
			for (local131 = local25; local131 < local38; local131++) {
				for (local136 = local83 - 1; local136 >= local79; local136--) {
					if (local136 <= local131 << 1) {
						arg0[local53] = arg4;
					} else if (arg9) {
						arg0[local53] = arg3;
					}
					local53++;
				}
				local53 += local59;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ug;)V")
	public static void method1186(@OriginalArg(0) Class3_Sub26 arg0) {
		label83: while (true) {
			if (arg0.anInt4615 < arg0.aByteArray64.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method3915() == 1) {
					local7 = true;
					local9 = arg0.method3915();
					local11 = arg0.method3915();
				}
				@Pc(30) int local30 = arg0.method3915();
				@Pc(34) int local34 = arg0.method3915();
				@Pc(40) int local40 = local30 * 64 - anInt1431;
				@Pc(50) int local50 = anInt1432 + anInt1435 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt1434 && local50 < anInt1432) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method3920();
								if (local113 != 0) {
									if (aByteArrayArrayArray11[local68][local72] == null) {
										aByteArrayArrayArray11[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray11[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method3920();
									if (aByteArrayArrayArray9[local68][local72] == null) {
										aByteArrayArrayArray9[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray9[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					local113 = arg0.method3920();
					if (local113 != 0) {
						arg0.anInt4615++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt1437 = arg0;
		anInt1444 = arg1;
		anInt1442 = arg2;
		anInt1440 = arg3;
		anInt1443 = arg4;
		anInt1439 = arg5;
		anInt1441 = arg6;
		anInt1438 = arg7;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIII)Lclient!fk;")
	private static Class56 method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class56 local3 = new Class56();
		for (@Pc(8) Class3_Sub4_Sub23 local8 = (Class3_Sub4_Sub23) aClass115_4.method2879(); local8 != null; local8 = (Class3_Sub4_Sub23) aClass115_4.method2885()) {
			method1196(local8, arg0, arg1);
			local3.method1282(local8);
		}
		@Pc(29) int[] local29 = new int[3];
		for (@Pc(31) int local31 = 0; local31 < aClass43_2.anInt1243; local31++) {
			@Pc(40) Class3_Sub4_Sub23 local40 = aClass43_2.aClass3_Sub4_Sub23Array1[local31];
			@Pc(67) boolean local67 = aClass3_Sub4_Sub14_2.method2353(aClass43_2.anIntArray112[local31] & 0x3FFF, aClass43_2.anIntArray112[local31] >> 14 & 0x3FFF, aClass43_2.anIntArray112[local31] >> 28 & 0x3, local29);
			if (local67) {
				local40.anInt5964 = local29[1] - anInt1431;
				local40.anInt5970 = anInt1432 + anInt1435 - local29[2] - 1;
				method1196(local40, arg0, arg1);
				local3.method1282(local40);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lclient!jo;")
	public static Class3_Sub4_Sub14 method1189(@OriginalArg(0) int arg0) {
		return (Class3_Sub4_Sub14) aClass30_12.method663((long) arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!rn;)V")
	public static void method1190(@OriginalArg(0) Class155 arg0) {
		aClass155_36 = arg0;
		aClass30_12.method667();
		@Pc(9) int local9 = aClass155_36.method4120("details");
		@Pc(14) int[] local14 = aClass155_36.method4117(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			aClass30_12.method668(Static254.method4297(new Class3_Sub26(aClass155_36.method4121(local9, local14[local16])), local14[local16]), (long) local14[local16]);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ug;Z)V")
	public static void method1191(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) boolean arg1) {
		label125: while (true) {
			if (arg0.anInt4615 < arg0.aByteArray64.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method3915() == 1) {
					local7 = true;
					local9 = arg0.method3915();
					local11 = arg0.method3915();
				}
				@Pc(30) int local30 = arg0.method3915();
				@Pc(34) int local34 = arg0.method3915();
				@Pc(40) int local40 = local30 * 64 - anInt1431;
				@Pc(50) int local50 = anInt1432 + anInt1435 - local34 * 64 - 1;
				@Pc(68) int local68;
				@Pc(72) int local72;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt1434 && local50 < anInt1432) {
					local68 = local40 >> 6;
					local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label125;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								@Pc(113) int local113 = arg0.method3915();
								if (local113 != 0) {
									@Pc(125) int local125;
									if ((local113 & 0x1) == 1) {
										local125 = arg0.method3915();
										if (aByteArrayArrayArray12[local68][local72] == null) {
											aByteArrayArrayArray12[local68][local72] = new byte[4096];
										}
										aByteArrayArrayArray12[local68][local72][(63 - local79 << 6) + local74] = (byte) local125;
									}
									if ((local113 & 0x2) == 2) {
										local125 = arg0.method3899();
										if (anIntArrayArrayArray5[local68][local72] == null) {
											anIntArrayArrayArray5[local68][local72] = new int[4096];
										}
										anIntArrayArrayArray5[local68][local72][(63 - local79 << 6) + local74] = local125;
									}
									if ((local113 & 0x4) == 4) {
										local125 = arg0.method3948();
										@Pc(202) int local202 = arg0.method3915();
										local125--;
										@Pc(207) Class49 local207 = Static175.method2874(local125);
										if (local207.anIntArray131 != null) {
											local207 = local207.method1112();
											if (local207 == null || local207.anInt1377 == -1) {
												continue;
											}
										}
										if ((!local207.aBoolean115 || arg1) && local207.anInt1377 != -1) {
											@Pc(236) Class3_Sub4_Sub23 local236 = new Class3_Sub4_Sub23();
											local236.anInt5971 = local207.anInt1377;
											local236.anInt5968 = local202;
											local236.anInt5964 = local68 * 64 + local74;
											local236.anInt5970 = local72 * 64 + 64 - local79;
											aClass115_4.method2875(local236);
										}
									}
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label125;
					}
					local72 = arg0.method3915();
					if (local72 != 0) {
						if ((local72 & 0x1) == 1) {
							arg0.anInt4615++;
						}
						if ((local72 & 0x2) == 2) {
							arg0.anInt4615 += 2;
						}
						if ((local72 & 0x4) == 4) {
							arg0.anInt4615 += 3;
						}
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IIII)V")
	private static void method1192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anInt1442 - anInt1437;
		@Pc(7) int local7 = anInt1440 - anInt1444;
		if (anInt1442 < anInt1434) {
			local3++;
		}
		if (anInt1440 < anInt1432) {
			local7++;
		}
		@Pc(17) int local17;
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(104) int local104;
		@Pc(81) int local81;
		@Pc(93) int local93;
		@Pc(97) int local97;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(193) int local193;
		@Pc(213) int local213;
		@Pc(231) int local231;
		@Pc(250) int local250;
		@Pc(316) int local316;
		@Pc(332) int local332;
		@Pc(142) int[][] local142;
		for (local17 = 0; local17 < local3; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local50 = local17 + anInt1437 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray4.length - 1) {
					local142 = anIntArrayArrayArray4[local50];
					@Pc(146) byte[][] local146 = aByteArrayArrayArray11[local50];
					@Pc(150) byte[][] local150 = aByteArrayArrayArray9[local50];
					@Pc(154) byte[][] local154 = aByteArrayArrayArray10[local50];
					@Pc(158) byte[][] local158 = aByteArrayArrayArray13[local50];
					@Pc(162) byte[][] local162 = aByteArrayArrayArray12[local50];
					local28 += anInt1443;
					local38 += anInt1443;
					for (local172 = 0; local172 < local7; local172++) {
						local183 = arg1 * local172 >> 16;
						local193 = arg1 * (local172 + 1) >> 16;
						@Pc(197) int local197 = local193 - local183;
						if (local197 > 0) {
							local183 += anInt1439;
							local193 += anInt1439;
							local213 = local172 + anInt1444 >> 6;
							@Pc(219) int local219 = local172 + anInt1444 & 0x3F;
							@Pc(225) int local225 = local17 + anInt1437 & 0x3F;
							local231 = (local219 << 6) + local225;
							if (local213 < 0 || local213 > local142.length - 1 || local142[local213] == null) {
								if (aClass3_Sub4_Sub14_2.anInt2663 != -1) {
									local250 = aClass3_Sub4_Sub14_2.anInt2663;
								} else if ((local17 + anInt1437 & 0x4) == (local172 + anInt1444 & 0x4)) {
									local250 = anIntArray140[Static85.anInt1598 + 1];
								} else {
									local250 = 4936552;
								}
								if (local213 < 0 || local213 > local142.length - 1) {
									if (local250 == 0) {
										local250 = 1;
									}
									Static143.method2462(local28, local183, local42, local197, local250);
									continue;
								}
							} else {
								local250 = local142[local213][local231];
							}
							if (local250 == 0) {
								local250 = 1;
							}
							local316 = local146[local213] == null ? 0 : anIntArray140[local146[local213][local231] & 0xFF];
							local332 = local154[local213] == null ? 0 : anIntArray140[local154[local213][local231] & 0xFF];
							@Pc(366) int local366;
							if (local316 == 0 && local332 == 0) {
								Static143.method2462(local28, local183, local42, local197, local250);
							} else {
								@Pc(362) byte local362;
								if (local316 != 0) {
									if (local316 == -1) {
										local316 = 1;
									}
									local362 = local150[local213] == null ? 0 : local150[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static143.method2462(local28, local183, local42, local197, local316);
									} else {
										method1184(Static143.anIntArray316, local28, local183, local250, local316, local42, local197, local366 >> 2, local362 & 0x3, true);
									}
								}
								if (local332 != 0) {
									if (local332 == -1) {
										local332 = local250;
									}
									local362 = local158[local213][local231];
									local366 = local362 & 0xFC;
									if (local366 == 0 || local42 <= 1 || local197 <= 1) {
										Static143.method2462(local28, local183, local42, local197, local332);
									}
									method1184(Static143.anIntArray316, local28, local183, 0, local332, local42, local197, local366 >> 2, local362 & 0x3, local316 == 0);
								}
							}
							if (local162[local213] != null) {
								@Pc(459) int local459 = local162[local213][local231] & 0xFF;
								if (local459 != 0) {
									if (local42 == 1) {
										local366 = local28;
									} else {
										local366 = local38 - 1;
									}
									@Pc(477) int local477;
									if (local197 == 1) {
										local477 = local183;
									} else {
										local477 = local193 - 1;
									}
									@Pc(484) int local484 = 13421772;
									if (local459 >= 5 && local459 <= 8 || local459 >= 13 && local459 <= 16 || local459 >= 21 && local459 <= 24 || local459 == 27 || local459 == 28) {
										local484 = 13369344;
										local459 -= 4;
									}
									if (local459 == 1) {
										Static143.method2453(local28, local183, local197, local484);
									} else if (local459 == 2) {
										Static143.method2460(local28, local183, local42, local484);
									} else if (local459 == 3) {
										Static143.method2453(local366, local183, local197, local484);
									} else if (local459 == 4) {
										Static143.method2460(local28, local477, local42, local484);
									} else if (local459 == 9) {
										Static143.method2453(local28, local183, local197, 16777215);
										Static143.method2460(local28, local183, local42, local484);
									} else if (local459 == 10) {
										Static143.method2453(local366, local183, local197, 16777215);
										Static143.method2460(local28, local183, local42, local484);
									} else if (local459 == 11) {
										Static143.method2453(local366, local183, local197, 16777215);
										Static143.method2460(local28, local477, local42, local484);
									} else if (local459 == 12) {
										Static143.method2453(local28, local183, local197, 16777215);
										Static143.method2460(local28, local477, local42, local484);
									} else if (local459 == 17) {
										Static143.method2460(local28, local183, 1, local484);
									} else if (local459 == 18) {
										Static143.method2460(local366, local183, 1, local484);
									} else if (local459 == 19) {
										Static143.method2460(local366, local477, 1, local484);
									} else if (local459 == 20) {
										Static143.method2460(local28, local477, 1, local484);
									} else {
										@Pc(644) int local644;
										if (local459 == 25) {
											for (local644 = 0; local644 < local197; local644++) {
												Static143.method2460(local28 + local644, local477 - local644, 1, local484);
											}
										} else if (local459 == 26) {
											for (local644 = 0; local644 < local197; local644++) {
												Static143.method2460(local28 + local644, local183 + local644, 1, local484);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local28 += anInt1443;
					for (@Pc(68) int local68 = 0; local68 < local7; local68++) {
						local81 = (arg1 * local68 >> 16) + anInt1439;
						local93 = (arg1 * (local68 + 1) >> 16) + anInt1439;
						local97 = local93 - local81;
						if (aClass3_Sub4_Sub14_2.anInt2663 != -1) {
							local104 = aClass3_Sub4_Sub14_2.anInt2663;
						} else if ((local17 + anInt1437 & 0x4) == (local68 + anInt1444 & 0x4)) {
							local104 = anIntArray140[Static85.anInt1598 + 1];
						} else {
							local104 = 4936552;
						}
						if (local104 == 0) {
							local104 = 1;
						}
						Static143.method2462(local28, local81, local42, local97, local104);
					}
				}
			}
		}
		for (local17 = -2; local17 < local3 + 2; local17++) {
			local28 = arg0 * local17 >> 16;
			local38 = arg0 * (local17 + 1) >> 16;
			local42 = local38 - local28;
			if (local42 > 0) {
				local28 += anInt1443;
				local50 = local17 + anInt1437 >> 6;
				if (local50 >= 0 && local50 <= anIntArrayArrayArray5.length - 1) {
					local142 = anIntArrayArrayArray5[local50];
					for (local104 = -2; local104 < local7 + 2; local104++) {
						local81 = arg1 * local104 >> 16;
						local93 = arg1 * (local104 + 1) >> 16;
						local97 = local93 - local81;
						if (local97 > 0) {
							local81 += anInt1439;
							@Pc(785) int local785 = local104 + anInt1444 >> 6;
							if (local785 >= 0 && local785 <= local142.length - 1) {
								local172 = ((local104 + anInt1444 & 0x3F) << 6) + (local17 + anInt1437 & 0x3F);
								if (local142[local785] != null) {
									local183 = local142[local785][local172];
									local193 = local183 & 0x1FFF;
									if (local193 != 0) {
										@Pc(832) Class182 local832 = Static281.method3885(local193 - 1);
										local213 = local183 >> 13 & 0x3;
										@Pc(849) boolean local849 = (local183 >> 15 & 0x1) == 1;
										@Pc(855) Class81_Sub2 local855 = local832.method4741(local849, local213);
										if (local855 != null) {
											local231 = local42 * local855.anInt2797 / 4;
											local250 = local97 * local855.anInt2796 / 4;
											if (local832.aBoolean411) {
												local316 = local183 >> 16 & 0xF;
												local332 = local183 >> 20 & 0xF;
												if ((local213 & 0x1) == 1) {
													local213 = local316;
													local316 = local332;
													local332 = local213;
												}
												local231 = local316 * local42;
												local250 = local332 * local97;
											}
											if (local231 != 0 && local250 != 0) {
												if (local832.anInt5764 == 0) {
													local855.method2510(local28, local81 + local97 - local250, local231, local250);
												} else {
													local855.method2503(local28, local81 + local97 - local250, local231, local250, local832.anInt5764);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public static void method1193(@OriginalArg(0) int arg0) {
		aClass3_Sub4_Sub14_2 = (Class3_Sub4_Sub14) aClass30_12.method663((long) arg0);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "()V")
	public static void method1194() {
		for (@Pc(1) int local1 = 0; local1 < aClass43_2.anInt1243; local1++) {
			if (aClass43_2.aClass3_Sub4_Sub23Array1[local1] != null) {
				aClass115_4.method2875(aClass43_2.aClass3_Sub4_Sub23Array1[local1]);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "()V")
	public static void method1195() {
		@Pc(3) int local3 = anInt1442 - anInt1437;
		@Pc(7) int local7 = anInt1440 - anInt1444;
		@Pc(15) int local15 = (anInt1441 - anInt1443 << 16) / local3;
		@Pc(23) int local23 = (anInt1438 - anInt1439 << 16) / local7;
		method1192(local15, local23);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!vo;IIII)V")
	private static void method1196(@OriginalArg(0) Class3_Sub4_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt5967 = anInt1443 + (arg1 * (arg0.anInt5964 - anInt1437) >> 16);
		arg0.anInt5969 = anInt1439 + (arg2 * (arg0.anInt5970 - anInt1444) >> 16);
		@Pc(32) Class40 local32 = Static96.method1438(arg0.anInt5971);
		if (local32.anInt1169 != -1) {
			@Pc(42) Class81 local42 = local32.method981(true, false);
			if (local42 != null) {
				if (arg0.anInt5967 - (local42.anInt2797 + 1 >> 1) <= anInt1441 && arg0.anInt5967 + (local42.anInt2797 + 1 >> 1) >= anInt1443 && arg0.anInt5969 - (local42.anInt2796 + 1 >> 1) <= anInt1438 && arg0.anInt5969 + (local42.anInt2796 + 1 >> 1) >= anInt1439) {
					arg0.aBoolean423 = false;
				} else {
					arg0.aBoolean423 = true;
				}
				return;
			}
		}
		if (arg0.anInt5964 >= anInt1437 && arg0.anInt5964 <= anInt1442 && arg0.anInt5970 >= anInt1444 && arg0.anInt5970 <= anInt1440) {
			arg0.aBoolean423 = false;
		} else {
			arg0.aBoolean423 = true;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)Lclient!mm;")
	public static Class115 method1197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class115 local3 = new Class115();
		for (@Pc(8) Class3_Sub4_Sub14 local8 = (Class3_Sub4_Sub14) aClass30_12.method664(); local8 != null; local8 = (Class3_Sub4_Sub14) aClass30_12.method671()) {
			if (local8.aBoolean198 && local8.method2357(arg0, arg1)) {
				local3.method2875(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Lclient!ug;)V")
	public static void method1198(@OriginalArg(0) Class3_Sub26 arg0) {
		label83: while (true) {
			if (arg0.anInt4615 < arg0.aByteArray64.length) {
				@Pc(7) boolean local7 = false;
				@Pc(9) int local9 = 0;
				@Pc(11) int local11 = 0;
				if (arg0.method3915() == 1) {
					local7 = true;
					local9 = arg0.method3915();
					local11 = arg0.method3915();
				}
				@Pc(30) int local30 = arg0.method3915();
				@Pc(34) int local34 = arg0.method3915();
				@Pc(40) int local40 = local30 * 64 - anInt1431;
				@Pc(50) int local50 = anInt1432 + anInt1435 - local34 * 64 - 1;
				@Pc(113) byte local113;
				@Pc(68) int local68;
				if (local40 >= 0 && local50 - 63 >= 0 && local40 + 63 < anInt1434 && local50 < anInt1432) {
					local68 = local40 >> 6;
					@Pc(72) int local72 = local50 >> 6;
					@Pc(74) int local74 = 0;
					while (true) {
						if (local74 >= 64) {
							continue label83;
						}
						for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
							if (!local7 || local74 >= local9 * 8 && local74 < local9 * 8 + 8 && local79 >= local11 * 8 && local79 < local11 * 8 + 8) {
								local113 = arg0.method3920();
								if (local113 != 0) {
									if (aByteArrayArrayArray10[local68][local72] == null) {
										aByteArrayArrayArray10[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray10[local68][local72][(63 - local79 << 6) + local74] = local113;
									@Pc(146) byte local146 = arg0.method3920();
									if (aByteArrayArrayArray13[local68][local72] == null) {
										aByteArrayArrayArray13[local68][local72] = new byte[4096];
									}
									aByteArrayArrayArray13[local68][local72][(63 - local79 << 6) + local74] = local146;
								}
							}
						}
						local74++;
					}
				}
				local68 = 0;
				while (true) {
					if (local68 >= (local7 ? 64 : 4096)) {
						continue label83;
					}
					local113 = arg0.method3920();
					if (local113 != 0) {
						arg0.anInt4615++;
					}
					local68++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)V")
	public static void method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static163.anInt3083; local1++) {
			@Pc(8) Class183 local8 = Static278.method4188(local1);
			if (local8 != null) {
				@Pc(14) int local14 = local8.anInt5780;
				if (local14 >= 0 && !Static16.anInterface4_1.method2909(local14)) {
					local14 = -1;
				}
				@Pc(64) int local64;
				@Pc(29) int local29;
				@Pc(35) int local35;
				@Pc(57) int local57;
				if (local8.anInt5776 >= 0) {
					local29 = local8.anInt5776;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static16.anIntArray25[Static156.method2604(local57, 96)];
				} else if (local14 >= 0) {
					local64 = Static16.anIntArray25[Static156.method2604(Static16.anInterface4_1.method2906(local14), 96)];
				} else if (local8.anInt5777 == -1) {
					local64 = -1;
				} else {
					local29 = local8.anInt5777;
					local35 = (local29 & 0x7F) + arg1;
					if (local35 < 0) {
						local35 = 0;
					} else if (local35 > 127) {
						local35 = 127;
					}
					local57 = (local29 + arg0 & 0xFC00) + (local29 & 0x380) + local35;
					local64 = Static16.anIntArray25[Static156.method2604(local57, 96)];
				}
				anIntArray140[local1 + 1] = local64;
			}
		}
	}
}
