import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!o;")
	public static Class86 aClass86_2;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public static int anInt1424;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!sc;")
	private static Class107 aClass107_397 = Static231.method3737("Discard");

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_398 = aClass107_397;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!sc;")
	private static Class107 aClass107_399 = Static231.method3737("Checking for updates )2 ");

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!jd;")
	public static Class61 aClass61_20 = new Class61(100);

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!sc;")
	public static Class107 aClass107_400 = aClass107_399;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt1425 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lclient!je;")
	public static Class1_Sub2_Sub10 method1124(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub10 local15 = (Class1_Sub2_Sub10) Static115.aClass8_7.method312((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = Static142.aClass28_55.method819(arg0, 1);
		} else {
			local32 = Static59.aClass28_26.method819(arg0 & 0x7FFF, 1);
		}
		local15 = new Class1_Sub2_Sub10();
		if (local32 != null) {
			local15.method1713(new Class1_Sub26(local32));
		}
		if (arg0 >= 32768) {
			local15.method1716();
		}
		Static115.aClass8_7.method304(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method1125() {
		Static120.aClass61_50.method1697();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIILclient!af;IJZ)Z")
	public static boolean method1127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static224.method3666(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!nb;IIIZILclient!qa;IIIIII)Lclient!nb;")
	public static Class5_Sub3 method1128(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class96 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(27) long local27 = ((long) arg11 << 48) + (long) ((arg7 << 24) + (arg10 << 16) + arg3) + ((long) arg0 << 32);
		@Pc(33) Class5_Sub3 local33 = (Class5_Sub3) Static36.aClass61_15.method1693(local27);
		@Pc(98) int local98;
		@Pc(119) int local119;
		@Pc(129) int local129;
		@Pc(125) int local125;
		@Pc(150) int local150;
		if (local33 == null) {
			@Pc(55) byte local55;
			if (arg3 == 1) {
				local55 = 9;
			} else if (arg3 == 2) {
				local55 = 12;
			} else if (arg3 == 3) {
				local55 = 15;
			} else if (arg3 == 4) {
				local55 = 18;
			} else {
				local55 = 21;
			}
			@Pc(92) Class5_Sub1 local92 = new Class5_Sub1(local55 * 3 + 1, 2 * 3 * local55 + -local55, 0);
			local98 = local92.method280(0, 0);
			@Pc(113) int[] local113 = new int[] { 64, 96, 128 };
			@Pc(117) int[][] local117 = new int[3][local55];
			@Pc(131) int local131;
			@Pc(161) int local161;
			for (local119 = 0; local119 < 3; local119++) {
				local125 = local113[local119];
				local129 = local113[local119];
				for (local131 = 0; local131 < local55; local131++) {
					@Pc(139) int local139 = (local131 << 11) / local55;
					local150 = arg5 + local129 * Class45.anIntArray159[local139] >> 16;
					local161 = arg9 + local125 * Class45.anIntArray156[local139] >> 16;
					local117[local119][local131] = local92.method280(local150, local161);
				}
			}
			for (local129 = 0; local129 < 3; local129++) {
				local125 = (local129 * 256 + 128) / 3;
				local131 = 256 - local125;
				@Pc(210) byte local210 = (byte) (arg10 * local131 + arg7 * local125 >> 8);
				@Pc(255) short local255 = (short) ((local131 * (arg0 & 0x7F) + (arg11 & 0x7F) * local125 & 0x7F00) + ((arg11 & 0xFC00) * local125 + local131 * (arg0 & 0xFC00) & 0xFC0000) + ((arg11 & 0x380) * local125 + local131 * (arg0 & 0x380) & 0x38000) >> 8);
				for (local161 = 0; local161 < local55; local161++) {
					if (local129 == 0) {
						local92.method289(local98, local117[0][(local161 + 1) % local55], local117[0][local161], local255, local210);
					} else {
						local92.method289(local117[local129 - 1][local161], local117[local129 - 1][(local161 + 1) % local55], local117[local129][(local161 + 1) % local55], local255, local210);
						local92.method289(local117[local129 - 1][local161], local117[local129][(local161 + 1) % local55], local117[local129][local161], local255, local210);
					}
				}
			}
			local33 = local92.method274(64, 768, -50, -10, -50);
			Static36.aClass61_15.method1694(local27, local33);
		}
		@Pc(371) int local371 = arg3 * 64 - 1;
		@Pc(374) int local374 = -local371;
		@Pc(377) int local377 = -local371;
		@Pc(379) int local379 = local371;
		@Pc(382) int local382 = arg1.method537();
		local119 = arg1.method542();
		local98 = local371;
		if (arg4) {
			if (arg2 > 1152 && arg2 < 1920) {
				local379 = local371 + 128;
			}
			if (arg2 > 128 && arg2 < 896) {
				local374 -= 128;
			}
			if (arg2 > 1664 || arg2 < 384) {
				local377 -= 128;
			}
			if (arg2 > 640 && arg2 < 1408) {
				local98 = local371 + 128;
			}
		}
		if (local382 < local374) {
			local382 = local374;
		}
		if (local379 < local119) {
			local119 = local379;
		}
		local129 = arg1.method545();
		local125 = arg1.method536();
		if (local125 > local98) {
			local125 = local98;
		}
		@Pc(461) Class1_Sub2_Sub3 local461 = null;
		if (local377 > local129) {
			local129 = local377;
		}
		if (arg6 != null) {
			@Pc(477) int local477 = arg6.anIntArray323[arg12];
			local461 = Static14.method336(local477 >> 16);
			arg12 = local477 & 0xFFFF;
		}
		if (local461 == null) {
			local33 = local33.method546(true, true);
			local33.method538((local119 - local382) / 2, 128, (local125 - local129) / 2);
			local33.method532((local119 + local382) / 2, 0, (local129 + local125) / 2);
		} else {
			local33 = local33.method546(!local461.method474(arg12), true);
			local33.method538((local119 - local382) / 2, 128, (local125 - local129) / 2);
			local33.method532((local119 + local382) / 2, 0, (local125 + local129) / 2);
			local33.method544(local461, arg12);
		}
		if (arg2 != 0) {
			local33.method535(arg2);
		}
		@Pc(576) Class5_Sub3_Sub1 local576 = (Class5_Sub3_Sub1) local33;
		if (arg8 != Static130.method2174(Static191.anInt4237, local129 + arg9, arg5 + local382) || arg8 != Static130.method2174(Static191.anInt4237, arg9 + local125, local119 + arg5)) {
			for (local150 = 0; local150 < local576.anInt551; local150++) {
				local576.anIntArray50[local150] += Static130.method2174(Static191.anInt4237, local576.anIntArray49[local150] + arg9, arg5 + local576.anIntArray58[local150]) - arg8;
			}
			local576.aBoolean46 = false;
		}
		return local33;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIIIIZBIII)V")
	public static void method1129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg4;
		if (Static205.anInt4391 <= arg4) {
			return;
		}
		if (arg4 < Static205.anInt4392) {
			local12 = Static205.anInt4392;
		}
		@Pc(33) int local33 = arg2 + arg4;
		if (Static205.anInt4392 >= local33) {
			return;
		}
		if (local33 > Static205.anInt4391) {
			local33 = Static205.anInt4391;
		}
		@Pc(48) int local48 = arg8;
		if (arg8 >= Static205.anInt4390) {
			return;
		}
		if (Static205.anInt4393 > arg8) {
			local48 = Static205.anInt4393;
		}
		@Pc(65) int local65 = arg7 + arg8;
		if (Static205.anInt4393 >= local65) {
			return;
		}
		if (arg1 == 9) {
			arg1 = 1;
			arg3 = arg3 + 1 & 0x3;
		}
		if (Static205.anInt4390 < local65) {
			local65 = Static205.anInt4390;
		}
		if (arg1 == 10) {
			arg1 = 1;
			arg3 = arg3 + 3 & 0x3;
		}
		@Pc(110) int local110 = Static205.anInt4388 * local48 + local12;
		if (arg1 == 11) {
			arg1 = 8;
			arg3 = arg3 + 3 & 0x3;
		}
		local48 -= arg8;
		local65 -= arg8;
		@Pc(136) int local136 = local12 + Static205.anInt4388 - local33;
		local12 -= arg4;
		local33 -= arg4;
		@Pc(149) int local149 = arg2 - local33;
		@Pc(153) int local153 = arg2 - local12;
		@Pc(158) int local158 = arg7 - local65;
		@Pc(162) int local162 = arg7 - local48;
		@Pc(172) int local172;
		@Pc(176) int local176;
		if (arg1 == 1) {
			if (arg3 == 0) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local176 <= local172) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 1) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local176 <= local172) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 2) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local172 <= local176) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 3) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local176 >= local172) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			}
		} else if (arg1 == 2) {
			if (arg3 == 0) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local176 <= local172 >> 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 1) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local110 >= 0 && local110 < arg0.length) {
							if (local172 << 1 <= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						} else {
							local110++;
						}
					}
					local110 += local136;
				}
			} else if (arg3 == 2) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local153 - 1; local176 >= local149; local176--) {
						if (local176 <= local172 >> 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 3) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local153 - 1; local176 >= local149; local176--) {
						if (local176 >= local172 << 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			}
		} else if (arg1 == 3) {
			if (arg3 == 0) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local153 - 1; local176 >= local149; local176--) {
						if (local172 >> 1 >= local176) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 1) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local176 >= local172 << 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 2) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local176 <= local172 >> 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 3) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local153 - 1; local176 >= local149; local176--) {
						if (local172 << 1 <= local176) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			}
		} else if (arg1 == 4) {
			if (arg3 == 0) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local176 >= local172 >> 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 1) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local12; local176 < local33; local176++) {
						if (local172 << 1 >= local176) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 2) {
				for (local172 = local48; local172 < local65; local172++) {
					for (local176 = local153 - 1; local176 >= local149; local176--) {
						if (local176 >= local172 >> 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			} else if (arg3 == 3) {
				for (local172 = local162 - 1; local172 >= local158; local172--) {
					for (local176 = local153 - 1; local176 >= local149; local176--) {
						if (local176 <= local172 << 1) {
							arg0[local110] = arg5;
						} else if (arg6) {
							arg0[local110] = arg9;
						}
						local110++;
					}
					local110 += local136;
				}
			}
		} else if (arg1 != 5) {
			if (arg1 == 6) {
				if (arg3 == 0) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local12; local176 < local33; local176++) {
							if (local176 <= arg2 / 2) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 1) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local12; local176 < local33; local176++) {
							if (arg7 / 2 >= local172) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 2) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local12; local176 < local33; local176++) {
							if (arg2 / 2 <= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 3) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local12; local176 < local33; local176++) {
							if (arg7 / 2 <= local172) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
			}
			if (arg1 == 7) {
				if (arg3 == 0) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local12; local176 < local33; local176++) {
							if (local172 - arg7 / 2 >= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 1) {
					for (local172 = local162 - 1; local172 >= local158; local172--) {
						for (local176 = local12; local176 < local33; local176++) {
							if (local172 - arg7 / 2 >= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 2) {
					for (local172 = local162 - 1; local172 >= local158; local172--) {
						for (local176 = local153 - 1; local176 >= local149; local176--) {
							if (local176 <= local172 - arg7 / 2) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 3) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local153 - 1; local176 >= local149; local176--) {
							if (local172 - arg7 / 2 >= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
			}
			if (arg1 == 8) {
				if (arg3 == 0) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local12; local176 < local33; local176++) {
							if (local172 - arg7 / 2 <= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 1) {
					for (local172 = local162 - 1; local172 >= local158; local172--) {
						for (local176 = local12; local176 < local33; local176++) {
							if (local176 >= local172 - arg7 / 2) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 2) {
					for (local172 = local162 - 1; local172 >= local158; local172--) {
						for (local176 = local153 - 1; local176 >= local149; local176--) {
							if (local172 - arg7 / 2 <= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
				if (arg3 == 3) {
					for (local172 = local48; local172 < local65; local172++) {
						for (local176 = local153 - 1; local176 >= local149; local176--) {
							if (local172 - arg7 / 2 <= local176) {
								arg0[local110] = arg5;
							} else if (arg6) {
								arg0[local110] = arg9;
							}
							local110++;
						}
						local110 += local136;
					}
					return;
				}
			}
		} else if (arg3 == 0) {
			for (local172 = local162 - 1; local172 >= local158; local172--) {
				for (local176 = local153 - 1; local176 >= local149; local176--) {
					if (local172 >> 1 <= local176) {
						arg0[local110] = arg5;
					} else if (arg6) {
						arg0[local110] = arg9;
					}
					local110++;
				}
				local110 += local136;
			}
		} else if (arg3 == 1) {
			for (local172 = local162 - 1; local172 >= local158; local172--) {
				for (local176 = local12; local176 < local33; local176++) {
					if (local176 <= local172 << 1) {
						arg0[local110] = arg5;
					} else if (arg6) {
						arg0[local110] = arg9;
					}
					local110++;
				}
				local110 += local136;
			}
		} else if (arg3 == 2) {
			for (local172 = local48; local172 < local65; local172++) {
				for (local176 = local12; local176 < local33; local176++) {
					if (local172 >> 1 <= local176) {
						arg0[local110] = arg5;
					} else if (arg6) {
						arg0[local110] = arg9;
					}
					local110++;
				}
				local110 += local136;
			}
		} else if (arg3 == 3) {
			for (local172 = local48; local172 < local65; local172++) {
				for (local176 = local153 - 1; local176 >= local149; local176--) {
					if (local172 << 1 >= local176) {
						arg0[local110] = arg5;
					} else if (arg6) {
						arg0[local110] = arg9;
					}
					local110++;
				}
				local110 += local136;
			}
		}
	}
}
