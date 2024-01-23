import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
	public static int anInt1377 = -1;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "[C")
	public static char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString48 = "Loaded update list";

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[IIIIIIIZII)V")
	public static void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg0;
		if (Static258.anInt5066 <= arg0) {
			return;
		}
		@Pc(19) int local19 = arg0 + arg2;
		if (arg0 < Static258.anInt5067) {
			local3 = Static258.anInt5067;
		}
		if (Static258.anInt5067 >= local19) {
			return;
		}
		if (local19 > Static258.anInt5066) {
			local19 = Static258.anInt5066;
		}
		@Pc(44) int local44 = arg6;
		if (Static258.anInt5068 <= arg6) {
			return;
		}
		if (arg6 < Static258.anInt5065) {
			local44 = Static258.anInt5065;
		}
		@Pc(61) int local61 = arg6 + arg5;
		if (Static258.anInt5065 >= local61) {
			return;
		}
		@Pc(73) int local73 = local44 * Static258.anInt5069 + local3;
		if (local61 > Static258.anInt5068) {
			local61 = Static258.anInt5068;
		}
		local44 -= arg6;
		local61 -= arg6;
		@Pc(97) int local97 = Static258.anInt5069 + local3 - local19;
		local3 -= arg0;
		if (arg8 == 9) {
			arg8 = 1;
			arg9 = arg9 + 1 & 0x3;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg9 = arg9 + 3 & 0x3;
		}
		local19 -= arg0;
		if (arg8 == 11) {
			arg8 = 8;
			arg9 = arg9 + 3 & 0x3;
		}
		@Pc(145) int local145 = arg5 - local61;
		@Pc(150) int local150 = arg2 - local19;
		@Pc(154) int local154 = arg5 - local44;
		@Pc(159) int local159 = arg2 - local3;
		@Pc(167) int local167;
		@Pc(172) int local172;
		if (arg8 == 1) {
			if (arg9 == 0) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local167 >= local172) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 1) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local172 <= local167) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 2) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local172 >= local167) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 3) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local172 >= local167) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			}
		} else if (arg8 == 2) {
			if (arg9 == 0) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local172 <= local167 >> 1) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 1) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local73 >= 0 && arg1.length > local73) {
							if (local167 << 1 <= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						} else {
							local73++;
						}
					}
					local73 += local97;
				}
			} else if (arg9 == 2) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local159 - 1; local172 >= local150; local172--) {
						if (local172 <= local167 >> 1) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 3) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local159 - 1; local172 >= local150; local172--) {
						if (local167 << 1 <= local172) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			}
		} else if (arg8 == 3) {
			if (arg9 == 0) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local159 - 1; local172 >= local150; local172--) {
						if (local167 >> 1 >= local172) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 1) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local167 << 1 <= local172) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 2) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local172 <= local167 >> 1) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 3) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local159 - 1; local172 >= local150; local172--) {
						if (local167 << 1 <= local172) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			}
		} else if (arg8 == 4) {
			if (arg9 == 0) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local172 >= local167 >> 1) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 1) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local3; local172 < local19; local172++) {
						if (local172 <= local167 << 1) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 2) {
				for (local167 = local44; local167 < local61; local167++) {
					for (local172 = local159 - 1; local172 >= local150; local172--) {
						if (local172 >= local167 >> 1) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			} else if (arg9 == 3) {
				for (local167 = local154 - 1; local167 >= local145; local167--) {
					for (local172 = local159 - 1; local172 >= local150; local172--) {
						if (local172 <= local167 << 1) {
							arg1[local73] = arg3;
						} else if (arg7) {
							arg1[local73] = arg4;
						}
						local73++;
					}
					local73 += local97;
				}
			}
		} else if (arg8 != 5) {
			if (arg8 == 6) {
				if (arg9 == 0) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local3; local172 < local19; local172++) {
							if (arg2 / 2 >= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 1) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local3; local172 < local19; local172++) {
							if (local167 <= arg5 / 2) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 2) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local3; local172 < local19; local172++) {
							if (arg2 / 2 <= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 3) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local3; local172 < local19; local172++) {
							if (local167 >= arg5 / 2) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
			}
			if (arg8 == 7) {
				if (arg9 == 0) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local3; local172 < local19; local172++) {
							if (local172 <= local167 - arg5 / 2) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 1) {
					for (local167 = local154 - 1; local167 >= local145; local167--) {
						for (local172 = local3; local172 < local19; local172++) {
							if (local167 - arg5 / 2 >= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 2) {
					for (local167 = local154 - 1; local167 >= local145; local167--) {
						for (local172 = local159 - 1; local172 >= local150; local172--) {
							if (local167 - arg5 / 2 >= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 3) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local159 - 1; local172 >= local150; local172--) {
							if (local172 <= local167 - arg5 / 2) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
			}
			if (arg8 == 8) {
				if (arg9 == 0) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local3; local172 < local19; local172++) {
							if (local167 - arg5 / 2 <= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 1) {
					for (local167 = local154 - 1; local167 >= local145; local167--) {
						for (local172 = local3; local172 < local19; local172++) {
							if (local167 - arg5 / 2 <= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 2) {
					for (local167 = local154 - 1; local167 >= local145; local167--) {
						for (local172 = local159 - 1; local172 >= local150; local172--) {
							if (local167 - arg5 / 2 <= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
				if (arg9 == 3) {
					for (local167 = local44; local167 < local61; local167++) {
						for (local172 = local159 - 1; local172 >= local150; local172--) {
							if (local167 - arg5 / 2 <= local172) {
								arg1[local73] = arg3;
							} else if (arg7) {
								arg1[local73] = arg4;
							}
							local73++;
						}
						local73 += local97;
					}
					return;
				}
			}
		} else if (arg9 == 0) {
			for (local167 = local154 - 1; local167 >= local145; local167--) {
				for (local172 = local159 - 1; local172 >= local150; local172--) {
					if (local167 >> 1 <= local172) {
						arg1[local73] = arg3;
					} else if (arg7) {
						arg1[local73] = arg4;
					}
					local73++;
				}
				local73 += local97;
			}
		} else if (arg9 == 1) {
			for (local167 = local154 - 1; local167 >= local145; local167--) {
				for (local172 = local3; local172 < local19; local172++) {
					if (local167 << 1 >= local172) {
						arg1[local73] = arg3;
					} else if (arg7) {
						arg1[local73] = arg4;
					}
					local73++;
				}
				local73 += local97;
			}
		} else if (arg9 == 2) {
			for (local167 = local44; local167 < local61; local167++) {
				for (local172 = local3; local172 < local19; local172++) {
					if (local167 >> 1 <= local172) {
						arg1[local73] = arg3;
					} else if (arg7) {
						arg1[local73] = arg4;
					}
					local73++;
				}
				local73 += local97;
			}
		} else if (arg9 == 3) {
			for (local167 = local44; local167 < local61; local167++) {
				for (local172 = local159 - 1; local172 >= local150; local172--) {
					if (local167 << 1 >= local172) {
						arg1[local73] = arg3;
					} else if (arg7) {
						arg1[local73] = arg4;
					}
					local73++;
				}
				local73 += local97;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method1164() {
		if (Static268.anInt5350 <= 0) {
			Static46.aClass91_1 = Static261.aClass91_3;
			Static261.aClass91_3 = null;
			Static123.method2035(40);
		} else {
			Static39.method721();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)V")
	public static void method1165() {
		Static159.aClass172_28.method4349(5);
		Static90.aClass172_42.method4349(5);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([[[I[[B[[BII[[B[[I[[F[[[B[[I[[I[[F[[I[[F[[I[[B)[Lclient!bl;")
	public static Class4_Sub8[] method1166(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) float[][] arg10, @OriginalArg(12) int[][] arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int[][] arg13, @OriginalArg(15) byte[][] arg14) {
		@Pc(5) int[][] local5 = new int[105][105];
		@Pc(16) int local16;
		@Pc(21) int local21;
		@Pc(61) byte local61;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				local21 = 0;
				if (arg0 != null) {
					@Pc(36) int local36 = arg0[arg3][local11 >> 3][local16 >> 3];
					local21 = local36 >> 1 & 0x3;
				}
				if (local21 == 0) {
					local61 = arg14[local11][local16];
					if (local61 == 0) {
						local61 = arg14[local11 - 1][local16];
					}
					if (local61 == 0) {
						local61 = arg14[local11][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg14[local11 - 1][local16 - 1];
					}
				} else if (local21 == 1) {
					local61 = arg14[local11][local16 - 1];
					if (local61 == 0) {
						local61 = arg14[local11][local16];
					}
					if (local61 == 0) {
						local61 = arg14[local11 - 1][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg14[local11 - 1][local16];
					}
				} else if (local21 == 2) {
					local61 = arg14[local11 - 1][local16 - 1];
					if (local61 == 0) {
						local61 = arg14[local11][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg14[local11 - 1][local16];
					}
					if (local61 == 0) {
						local61 = arg14[local11][local16];
					}
				} else {
					local61 = arg14[local11 - 1][local16];
					if (local61 == 0) {
						local61 = arg14[local11 - 1][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg14[local11][local16];
					}
					if (local61 == 0) {
						local61 = arg14[local11][local16 - 1];
					}
				}
				if (local61 != 0) {
					@Pc(241) Class118 local241 = Static151.method2396((local61 & 0xFF) - 1);
					local5[local11][local16] = local241.anInt3685 + (local241.anInt3682 + 1 << 16);
				}
			}
		}
		@Pc(266) Class163 local266 = new Class163(128);
		@Pc(324) int local324;
		@Pc(343) int local343;
		@Pc(318) int local318;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				if (arg14[local16][local21] != 0) {
					@Pc(300) int[] local300;
					if (arg2[local16][local21] == 0) {
						local300 = Static216.anIntArrayArray29[0];
					} else {
						local300 = Static135.anIntArrayArray16[arg1[local16][local21]];
						if (local300.length == 0) {
							continue;
						}
					}
					local318 = 0;
					local324 = local5[local16][local21];
					if (arg11 != null) {
						local318 = arg11[local16][local21] & 0xFFFFFF;
					}
					local343 = local5[local16 + 1][local21];
					@Pc(351) int local351 = local5[local16][local21 + 1];
					@Pc(361) int local361 = local5[local16 + 1][local21 + 1];
					@Pc(369) long local369 = (long) local324 << 32 | (long) local318;
					@Pc(377) long local377 = (long) local361 << 32 | (long) local318;
					@Pc(385) long local385 = (long) local343 << 32 | (long) local318;
					@Pc(393) long local393 = (long) local351 << 32 | (long) local318;
					@Pc(398) int local398 = local300.length / 2;
					@Pc(404) Class4_Sub8 local404 = (Class4_Sub8) local266.method4188(local369);
					if (local404 == null) {
						local404 = new Class4_Sub8((local324 >> 16) - 1, (float) (local324 & 0xFFFF), false, arg5 != null, local318);
						local266.method4181(local369, local404);
					}
					local404.anInt582++;
					local404.anInt585 += local398;
					if (local385 != local369) {
						local404 = (Class4_Sub8) local266.method4188(local385);
						if (local404 == null) {
							local404 = new Class4_Sub8((local343 >> 16) - 1, (float) (local343 & 0xFFFF), false, arg5 != null, local318);
							local266.method4181(local385, local404);
						}
						local404.anInt585 += local398;
						local404.anInt582++;
					}
					if (local369 != local377 && local377 != local385) {
						local404 = (Class4_Sub8) local266.method4188(local377);
						if (local404 == null) {
							local404 = new Class4_Sub8((local361 >> 16) - 1, (float) (local361 & 0xFFFF), false, arg5 != null, local318);
							local266.method4181(local377, local404);
						}
						local404.anInt585 += local398;
						local404.anInt582++;
					}
					if (local369 != local393 && local385 != local393 && local377 != local393) {
						local404 = (Class4_Sub8) local266.method4188(local393);
						if (local404 == null) {
							local404 = new Class4_Sub8((local351 >> 16) - 1, (float) (local351 & 0xFFFF), false, arg5 != null, local318);
							local266.method4181(local393, local404);
						}
						local404.anInt585 += local398;
						local404.anInt582++;
					}
				}
			}
		}
		@Pc(633) Class4_Sub8 local633;
		for (local633 = (Class4_Sub8) local266.method4192(); local633 != null; local633 = (Class4_Sub8) local266.method4183()) {
			local633.method572();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				local61 = arg14[local16][local21];
				if (local61 != 0) {
					if ((arg7[arg3][local16][local21] & 0x8) != 0) {
						local318 = 0;
					} else if ((arg7[1][local16][local21] & 0x2) == 2 && arg3 > 0) {
						local318 = arg3 - 1;
					} else {
						local318 = arg3;
					}
					local324 = 0;
					local343 = 128;
					@Pc(719) boolean[] local719 = null;
					if (arg11 != null) {
						local324 = arg11[local16][local21] & 0xFFFFFF;
						local343 = arg11[local16][local21] >>> 24 << 3;
					}
					@Pc(814) int local814;
					@Pc(795) int local795;
					@Pc(753) int[] local753;
					@Pc(945) byte local945;
					@Pc(778) int local778;
					@Pc(852) int local852;
					if (arg2[local16][local21] == 0) {
						local753 = Static216.anIntArrayArray29[0];
						local778 = arg14[local16 + 1][local21 - 1] == local61 ? 1 : -1;
						local795 = arg14[local16 + 1][local21 + 1] == local61 ? 1 : -1;
						local814 = arg14[local16 - 1][local21 - 1] == local61 ? 1 : -1;
						if (local61 == arg14[local16][local21 - 1]) {
							local778++;
							local814++;
						} else {
							local814--;
							local778--;
						}
						local852 = local61 == arg14[local16 - 1][local21 + 1] ? 1 : -1;
						if (arg14[local16 + 1][local21] == local61) {
							local795++;
							local778++;
						} else {
							local795--;
							local778--;
						}
						if (arg14[local16][local21 + 1] == local61) {
							local852++;
							local795++;
						} else {
							local795--;
							local852--;
						}
						if (arg14[local16 - 1][local21] == local61) {
							local814++;
							local852++;
						} else {
							local814--;
							local852--;
						}
						@Pc(914) int local914 = local814 - local795;
						@Pc(919) int local919 = local778 - local852;
						if (local919 < 0) {
							local919 = -local919;
						}
						if (local914 < 0) {
							local914 = -local914;
						}
						local945 = (byte) (local919 > local914 ? 1 : 0);
						arg4[local16][local21] = local945;
					} else {
						local945 = arg4[local16][local21];
						local719 = Static125.aBooleanArrayArray3[arg1[local16][local21]];
						local753 = Static135.anIntArrayArray16[arg1[local16][local21]];
						if (local753.length == 0) {
							continue;
						}
					}
					local814 = local5[local16][local21];
					local778 = local5[local16 + 1][local21];
					local795 = local5[local16 + 1][local21 + 1];
					local852 = local5[local16][local21 + 1];
					@Pc(1019) long local1019 = (long) local778 << 32 | (long) local324;
					@Pc(1027) long local1027 = (long) local795 << 32 | (long) local324;
					@Pc(1035) long local1035 = (long) local324 | (long) local814 << 32;
					@Pc(1043) long local1043 = (long) local852 << 32 | (long) local324;
					@Pc(1049) int local1049 = arg9[local16][local21];
					@Pc(1057) int local1057 = arg9[local16 + 1][local21];
					@Pc(1067) int local1067 = arg9[local16 + 1][local21 + 1];
					@Pc(1075) int local1075 = arg9[local16][local21 + 1];
					@Pc(1081) int local1081 = arg8[local16][local21];
					@Pc(1089) int local1089 = arg8[local16 + 1][local21];
					@Pc(1099) int local1099 = arg8[local16 + 1][local21 + 1];
					@Pc(1107) int local1107 = arg8[local16][local21 + 1];
					@Pc(1113) int local1113 = (local778 >> 16) - 1;
					@Pc(1119) int local1119 = (local795 >> 16) - 1;
					@Pc(1125) int local1125 = (local814 >> 16) - 1;
					@Pc(1131) int local1131 = (local852 >> 16) - 1;
					@Pc(1137) Class4_Sub8 local1137 = (Class4_Sub8) local266.method4188(local1035);
					Static284.method4444(arg10, Static76.method1293(local1067, local1099, local1125), local343, Static76.method1293(local1075, local1107, local1125), local1137, arg13, arg6, Static76.method1293(local1057, local1089, local1125), local814 <= local778, local318, local945, arg12, arg5, local16, Static76.method1293(local1049, local1081, local1125), local795 >= local814, local719, local753, local814 >= local814, local852 >= local814, local21);
					if (local1019 != local1035) {
						local1137 = (Class4_Sub8) local266.method4188(local1019);
						Static284.method4444(arg10, Static76.method1293(local1067, local1099, local1113), local343, Static76.method1293(local1075, local1107, local1113), local1137, arg13, arg6, Static76.method1293(local1057, local1089, local1113), local778 >= local778, local318, local945, arg12, arg5, local16, Static76.method1293(local1049, local1081, local1113), local778 <= local795, local719, local753, local778 <= local814, local778 <= local852, local21);
					}
					if (local1027 != local1035 && local1027 != local1019) {
						local1137 = (Class4_Sub8) local266.method4188(local1027);
						Static284.method4444(arg10, Static76.method1293(local1067, local1099, local1119), local343, Static76.method1293(local1075, local1107, local1119), local1137, arg13, arg6, Static76.method1293(local1057, local1089, local1119), local795 <= local778, local318, local945, arg12, arg5, local16, Static76.method1293(local1049, local1081, local1119), local795 >= local795, local719, local753, local814 >= local795, local795 <= local852, local21);
					}
					if (local1043 != local1035 && local1043 != local1019 && local1027 != local1043) {
						local1137 = (Class4_Sub8) local266.method4188(local1043);
						Static284.method4444(arg10, Static76.method1293(local1067, local1099, local1131), local343, Static76.method1293(local1075, local1107, local1131), local1137, arg13, arg6, Static76.method1293(local1057, local1089, local1131), local778 >= local852, local318, local945, arg12, arg5, local16, Static76.method1293(local1049, local1081, local1131), local795 >= local852, local719, local753, local852 <= local814, local852 <= local852, local21);
					}
				}
			}
		}
		for (local633 = (Class4_Sub8) local266.method4192(); local633 != null; local633 = (Class4_Sub8) local266.method4183()) {
			if (local633.anInt587 == 0) {
				local633.method4690();
			} else {
				local633.method570();
			}
		}
		local16 = local266.method4179();
		@Pc(1502) Class4_Sub8[] local1502 = new Class4_Sub8[local16];
		local266.method4187(local1502);
		@Pc(1510) long[] local1510 = new long[local16];
		for (local318 = 0; local318 < local16; local318++) {
			local1510[local318] = local1502[local318].aLong211;
		}
		Static263.method4118(local1510, local1502);
		return local1502;
	}
}
