import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "F")
	private static float aFloat149;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!gi;")
	public static Class64 aClass64_20 = new Class64(64);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILclient!j;JZ)V")
	public static void method3974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class167 local6 = new Class167();
		local6.aClass6_9 = arg4;
		local6.anInt5539 = arg1 * 128 + 64;
		local6.anInt5542 = arg2 * 128 + 64;
		local6.anInt5537 = arg3;
		local6.aLong178 = arg5;
		local6.aBoolean422 = arg6;
		if (Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub19(arg0, arg1, arg2);
		}
		Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass167_1 = local6;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)I")
	public static int method3976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static265.aBoolean407) {
			arg0 = 1000000;
			Static265.aBoolean407 = false;
		}
		@Pc(18) Class119 local18 = Static147.aClass119ArrayArray1[arg3][arg2];
		@Pc(21) float local21 = local18.aFloat96;
		@Pc(24) int local24 = local18.anInt3250;
		@Pc(34) float local34 = ((float) arg1 * 0.1F + 0.7F) * local18.aFloat94;
		@Pc(37) float local37 = local18.aFloat91;
		@Pc(40) int local40 = local18.anInt3255;
		@Pc(43) int local43 = local18.anInt3252;
		@Pc(46) Class1_Sub2_Sub8 local46 = local18.aClass1_Sub2_Sub8_2;
		if (!Static57.aBoolean97) {
			local43 = 0;
		}
		@Pc(54) float local54 = local18.aFloat93;
		@Pc(57) float local57 = local18.aFloat95;
		@Pc(60) float local60 = local18.aFloat92;
		if (local24 != Static212.anInt5137 || local34 != Static201.aFloat118 || Static61.aFloat34 != local37 || Static103.aFloat56 != local21 || local40 != Static103.anInt1935 || Static177.anInt3263 != local43 || Static95.aClass1_Sub2_Sub8_1 != local46 || local54 != Static35.aFloat23 || Static159.aFloat83 != local57 || Static20.aFloat13 != local60) {
			Static67.anInt1382 = Static107.anInt1996;
			Static268.aFloat155 = Static36.aFloat134;
			Static179.aFloat99 = Static196.aFloat114;
			Static160.aFloat84 = Static171.aFloat89;
			Static254.aFloat168 = Static81.aFloat46;
			Static56.anInt1176 = Static106.anInt1988;
			Static236.aClass1_Sub2_Sub8_3 = Static263.aClass1_Sub2_Sub8_4;
			Static140.aFloat77 = Static249.aFloat146;
			Static278.anInt5564 = Static17.anInt410;
			aFloat149 = Static40.aFloat27;
			if (Static283.aClass1_Sub2_Sub8_5 == null || Static283.aClass1_Sub2_Sub8_5 == Static236.aClass1_Sub2_Sub8_3) {
				Static283.aClass1_Sub2_Sub8_5 = new Class1_Sub2_Sub8();
			}
			Static177.anInt3263 = local43;
			Static23.anInt5822 = 0;
			Static20.aFloat13 = local60;
			Static35.aFloat23 = local54;
			Static201.aFloat118 = local34;
			Static95.aClass1_Sub2_Sub8_1 = local46;
			Static103.aFloat56 = local21;
			Static61.aFloat34 = local37;
			Static159.aFloat83 = local57;
			Static103.anInt1935 = local40;
			Static212.anInt5137 = local24;
		}
		if (Static23.anInt5822 < 65536) {
			Static23.anInt5822 += arg0 * 250;
			if (Static23.anInt5822 < 65536) {
				@Pc(173) int local173 = Static23.anInt5822 >> 8;
				@Pc(180) int local180 = 65536 - Static23.anInt5822 >> 8;
				Static17.anInt410 = (local180 * (Static278.anInt5564 & 0xFF00) + local173 * (Static103.anInt1935 & 0xFF00) & 0xFF0000) + (local173 * (Static103.anInt1935 & 0xFF00FF) + local180 * (Static278.anInt5564 & 0xFF00FF) & 0xFF00FF00) >> 8;
				Static106.anInt1988 = ((Static56.anInt1176 & 0xFF00FF) * local180 + (Static212.anInt5137 & 0xFF00FF) * local173 & 0xFF00FF00) + ((Static212.anInt5137 & 0xFF00) * local173 + (Static56.anInt1176 & 0xFF00) * local180 & 0xFF0000) >> 8;
				Static107.anInt1996 = local173 * Static177.anInt3263 + local180 * Static67.anInt1382 >> 8;
				@Pc(258) float local258 = (float) (65536 - Static23.anInt5822) / 65536.0F;
				@Pc(263) float local263 = (float) Static23.anInt5822 / 65536.0F;
				Static81.aFloat46 = Static254.aFloat168 * local258 + local263 * Static159.aFloat83;
				Static40.aFloat27 = local263 * Static35.aFloat23 + aFloat149 * local258;
				Static196.aFloat114 = Static201.aFloat118 * local263 + Static179.aFloat99 * local258;
				Static249.aFloat146 = Static140.aFloat77 * local258 + Static61.aFloat34 * local263;
				Static171.aFloat89 = Static160.aFloat84 * local258 + local263 * Static103.aFloat56;
				Static36.aFloat134 = local263 * Static20.aFloat13 + local258 * Static268.aFloat155;
				if (Static95.aClass1_Sub2_Sub8_1 != Static236.aClass1_Sub2_Sub8_3) {
					if (Static236.aClass1_Sub2_Sub8_3 == null || Static95.aClass1_Sub2_Sub8_1 == null) {
						Static263.aClass1_Sub2_Sub8_4 = null;
					} else {
						Static263.aClass1_Sub2_Sub8_4 = Static283.aClass1_Sub2_Sub8_5.method1584(Static236.aClass1_Sub2_Sub8_3, Static95.aClass1_Sub2_Sub8_1, (float) Static23.anInt5822 / 65536.0F);
					}
				}
			} else {
				Static171.aFloat89 = Static103.aFloat56;
				Static23.anInt5822 = 65536;
				Static36.aFloat134 = Static20.aFloat13;
				Static236.aClass1_Sub2_Sub8_3 = null;
				Static17.anInt410 = Static103.anInt1935;
				Static107.anInt1996 = Static177.anInt3263;
				Static263.aClass1_Sub2_Sub8_4 = Static95.aClass1_Sub2_Sub8_1;
				Static196.aFloat114 = Static201.aFloat118;
				Static40.aFloat27 = Static35.aFloat23;
				Static249.aFloat146 = Static61.aFloat34;
				Static81.aFloat46 = Static159.aFloat83;
				Static106.anInt1988 = Static212.anInt5137;
			}
		}
		return Static17.anInt410;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIIIIIII[I)V")
	public static void method3977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		@Pc(3) int local3 = arg6;
		if (arg6 >= Static213.anInt4241) {
			return;
		}
		if (Static213.anInt4243 > arg6) {
			local3 = Static213.anInt4243;
		}
		@Pc(20) int local20 = arg0 + arg6;
		if (Static213.anInt4243 >= local20) {
			return;
		}
		if (Static213.anInt4241 < local20) {
			local20 = Static213.anInt4241;
		}
		@Pc(40) int local40 = arg4;
		if (arg4 >= Static213.anInt4238) {
			return;
		}
		if (Static213.anInt4242 > arg4) {
			local40 = Static213.anInt4242;
		}
		@Pc(63) int local63 = arg4 + arg5;
		if (Static213.anInt4242 >= local63) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg1 = arg1 + 3 & 0x3;
		}
		@Pc(121) int local121 = local40 * Static213.anInt4239 + local3;
		if (Static213.anInt4238 < local63) {
			local63 = Static213.anInt4238;
		}
		local63 -= arg4;
		local40 -= arg4;
		@Pc(145) int local145 = Static213.anInt4239 + local3 - local20;
		local20 -= arg6;
		local3 -= arg6;
		@Pc(158) int local158 = arg0 - local3;
		@Pc(163) int local163 = arg0 - local20;
		@Pc(168) int local168 = arg5 - local40;
		@Pc(173) int local173 = arg5 - local63;
		@Pc(188) int local188;
		if (arg7 == 1) {
			@Pc(183) int local183;
			if (arg1 == 0) {
				for (local183 = local40; local183 < local63; local183++) {
					for (local188 = local3; local188 < local20; local188++) {
						if (local188 <= local183) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 1) {
				for (local183 = local168 - 1; local183 >= local173; local183--) {
					for (local188 = local3; local188 < local20; local188++) {
						if (local183 >= local188) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 2) {
				for (local183 = local40; local183 < local63; local183++) {
					for (local188 = local3; local188 < local20; local188++) {
						if (local183 <= local188) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 3) {
				for (local183 = local168 - 1; local183 >= local173; local183--) {
					for (local188 = local3; local188 < local20; local188++) {
						if (local188 >= local183) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			}
			return;
		}
		@Pc(406) int local406;
		if (arg7 == 2) {
			if (arg1 == 0) {
				for (local188 = local168 - 1; local188 >= local173; local188--) {
					for (local406 = local3; local406 < local20; local406++) {
						if (local188 >> 1 >= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 1) {
				for (local188 = local40; local188 < local63; local188++) {
					for (local406 = local3; local406 < local20; local406++) {
						if (local121 >= 0 && arg9.length > local121) {
							if (local188 << 1 <= local406) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						} else {
							local121++;
						}
					}
					local121 += local145;
				}
			} else if (arg1 == 2) {
				for (local188 = local40; local188 < local63; local188++) {
					for (local406 = local158 - 1; local406 >= local163; local406--) {
						if (local406 <= local188 >> 1) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 3) {
				for (local188 = local168 - 1; local188 >= local173; local188--) {
					for (local406 = local158 - 1; local406 >= local163; local406--) {
						if (local188 << 1 <= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			}
		} else if (arg7 == 3) {
			if (arg1 == 0) {
				for (local188 = local168 - 1; local188 >= local173; local188--) {
					for (local406 = local158 - 1; local406 >= local163; local406--) {
						if (local188 >> 1 >= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 1) {
				for (local188 = local168 - 1; local188 >= local173; local188--) {
					for (local406 = local3; local406 < local20; local406++) {
						if (local188 << 1 <= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 2) {
				for (local188 = local40; local188 < local63; local188++) {
					for (local406 = local3; local406 < local20; local406++) {
						if (local188 >> 1 >= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 3) {
				for (local188 = local40; local188 < local63; local188++) {
					for (local406 = local158 - 1; local406 >= local163; local406--) {
						if (local188 << 1 <= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			}
		} else if (arg7 == 4) {
			if (arg1 == 0) {
				for (local188 = local168 - 1; local188 >= local173; local188--) {
					for (local406 = local3; local406 < local20; local406++) {
						if (local188 >> 1 <= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 1) {
				for (local188 = local40; local188 < local63; local188++) {
					for (local406 = local3; local406 < local20; local406++) {
						if (local188 << 1 >= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 2) {
				for (local188 = local40; local188 < local63; local188++) {
					for (local406 = local158 - 1; local406 >= local163; local406--) {
						if (local406 >= local188 >> 1) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			} else if (arg1 == 3) {
				for (local188 = local168 - 1; local188 >= local173; local188--) {
					for (local406 = local158 - 1; local406 >= local163; local406--) {
						if (local188 << 1 >= local406) {
							arg9[local121] = arg8;
						} else if (arg2) {
							arg9[local121] = arg3;
						}
						local121++;
					}
					local121 += local145;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg1 == 0) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local3; local406 < local20; local406++) {
							if (local406 <= arg0 / 2) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 1) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local3; local406 < local20; local406++) {
							if (arg5 / 2 >= local188) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 2) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local3; local406 < local20; local406++) {
							if (local406 >= arg0 / 2) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 3) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local3; local406 < local20; local406++) {
							if (arg5 / 2 <= local188) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg1 == 0) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local3; local406 < local20; local406++) {
							if (local406 <= local188 - arg5 / 2) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 1) {
					for (local188 = local168 - 1; local188 >= local173; local188--) {
						for (local406 = local3; local406 < local20; local406++) {
							if (local188 - arg5 / 2 >= local406) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 2) {
					for (local188 = local168 - 1; local188 >= local173; local188--) {
						for (local406 = local158 - 1; local406 >= local163; local406--) {
							if (local406 <= local188 - arg5 / 2) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 3) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local158 - 1; local406 >= local163; local406--) {
							if (local188 - arg5 / 2 >= local406) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg1 == 0) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local3; local406 < local20; local406++) {
							if (local188 - arg5 / 2 <= local406) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 1) {
					for (local188 = local168 - 1; local188 >= local173; local188--) {
						for (local406 = local3; local406 < local20; local406++) {
							if (local406 >= local188 - arg5 / 2) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 2) {
					for (local188 = local168 - 1; local188 >= local173; local188--) {
						for (local406 = local158 - 1; local406 >= local163; local406--) {
							if (local188 - arg5 / 2 <= local406) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
				if (arg1 == 3) {
					for (local188 = local40; local188 < local63; local188++) {
						for (local406 = local158 - 1; local406 >= local163; local406--) {
							if (local188 - arg5 / 2 <= local406) {
								arg9[local121] = arg8;
							} else if (arg2) {
								arg9[local121] = arg3;
							}
							local121++;
						}
						local121 += local145;
					}
					return;
				}
			}
		} else if (arg1 == 0) {
			for (local188 = local168 - 1; local188 >= local173; local188--) {
				for (local406 = local158 - 1; local406 >= local163; local406--) {
					if (local406 >= local188 >> 1) {
						arg9[local121] = arg8;
					} else if (arg2) {
						arg9[local121] = arg3;
					}
					local121++;
				}
				local121 += local145;
			}
		} else if (arg1 == 1) {
			for (local188 = local168 - 1; local188 >= local173; local188--) {
				for (local406 = local3; local406 < local20; local406++) {
					if (local406 <= local188 << 1) {
						arg9[local121] = arg8;
					} else if (arg2) {
						arg9[local121] = arg3;
					}
					local121++;
				}
				local121 += local145;
			}
		} else if (arg1 == 2) {
			for (local188 = local40; local188 < local63; local188++) {
				for (local406 = local3; local406 < local20; local406++) {
					if (local188 >> 1 <= local406) {
						arg9[local121] = arg8;
					} else if (arg2) {
						arg9[local121] = arg3;
					}
					local121++;
				}
				local121 += local145;
			}
		} else if (arg1 == 3) {
			for (local188 = local40; local188 < local63; local188++) {
				for (local406 = local158 - 1; local406 >= local163; local406--) {
					if (local188 << 1 >= local406) {
						arg9[local121] = arg8;
					} else if (arg2) {
						arg9[local121] = arg3;
					}
					local121++;
				}
				local121 += local145;
			}
		}
	}
}
