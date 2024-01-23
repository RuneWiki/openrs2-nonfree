import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "Lclient!bc;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
	public static int anInt2402;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
	public static int anInt2397 = 0;

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)Lclient!vm;")
	public static Class1_Sub2_Sub21 method1894() {
		return Static20.aClass1_Sub2_Sub21_1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Z")
	public static boolean method1895(@OriginalArg(0) int arg0) {
		if (Static16.anInt295 == arg0) {
			return false;
		}
		Static225.anIntArrayArray28 = new int[104][104];
		Static33.anIntArrayArrayArray2 = new int[4][13][13];
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			Static88.aClass92Array1[local25] = new Class92(104, 104);
		}
		Static229.aClass61ArrayArrayArray1 = new Class61[4][104][104];
		Static35.aByteArrayArrayArray12 = new byte[4][104][104];
		Static260.aByteArrayArrayArray25 = new byte[4][104][104];
		if (Static277.aBoolean412) {
			Static120.method2132();
			Static292.method4406();
			Static73.aClass62ArrayArray1 = new Class62[13][13];
		}
		Static16.anInt295 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZII[IIIIII)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg0;
		if (arg0 >= Static50.anInt1137) {
			return;
		}
		@Pc(20) int local20 = arg3 + arg0;
		if (Static50.anInt1139 > arg0) {
			local3 = Static50.anInt1139;
		}
		if (Static50.anInt1139 >= local20) {
			return;
		}
		if (local20 > Static50.anInt1137) {
			local20 = Static50.anInt1137;
		}
		@Pc(51) int local51 = arg5;
		if (arg5 >= Static50.anInt1136) {
			return;
		}
		if (arg5 < Static50.anInt1135) {
			local51 = Static50.anInt1135;
		}
		@Pc(68) int local68 = arg5 + arg1;
		if (Static50.anInt1135 >= local68) {
			return;
		}
		if (local68 > Static50.anInt1136) {
			local68 = Static50.anInt1136;
		}
		local68 -= arg5;
		if (arg8 == 9) {
			arg7 = arg7 + 1 & 0x3;
			arg8 = 1;
		}
		@Pc(104) int local104 = local3 + Static50.anInt1138 * local51;
		if (arg8 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg8 = 1;
		}
		local51 -= arg5;
		@Pc(126) int local126 = arg1 - local51;
		if (arg8 == 11) {
			arg8 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		@Pc(148) int local148 = Static50.anInt1138 + local3 - local20;
		@Pc(152) int local152 = arg1 - local68;
		local3 -= arg0;
		local20 -= arg0;
		@Pc(165) int local165 = arg3 - local20;
		@Pc(170) int local170 = arg3 - local3;
		@Pc(182) int local182;
		@Pc(187) int local187;
		if (arg8 == 1) {
			if (arg7 == 0) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local182 >= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 1) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local182 >= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 2) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local182 <= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 3) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local187 >= local182) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			}
		} else if (arg8 == 2) {
			if (arg7 == 0) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local182 >> 1 >= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 1) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local104 >= 0 && arg4.length > local104) {
							if (local182 << 1 <= local187) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						} else {
							local104++;
						}
					}
					local104 += local148;
				}
			} else if (arg7 == 2) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local170 - 1; local187 >= local165; local187--) {
						if (local182 >> 1 >= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 3) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local170 - 1; local187 >= local165; local187--) {
						if (local182 << 1 <= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			}
		} else if (arg8 == 3) {
			if (arg7 == 0) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local170 - 1; local187 >= local165; local187--) {
						if (local187 <= local182 >> 1) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 1) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local182 << 1 <= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 2) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local187 <= local182 >> 1) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 3) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local170 - 1; local187 >= local165; local187--) {
						if (local182 << 1 <= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			}
		} else if (arg8 == 4) {
			if (arg7 == 0) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local182 >> 1 <= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 1) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local3; local187 < local20; local187++) {
						if (local187 <= local182 << 1) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 2) {
				for (local182 = local51; local182 < local68; local182++) {
					for (local187 = local170 - 1; local187 >= local165; local187--) {
						if (local187 >= local182 >> 1) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			} else if (arg7 == 3) {
				for (local182 = local126 - 1; local182 >= local152; local182--) {
					for (local187 = local170 - 1; local187 >= local165; local187--) {
						if (local182 << 1 >= local187) {
							arg4[local104] = arg9;
						} else if (arg2) {
							arg4[local104] = arg6;
						}
						local104++;
					}
					local104 += local148;
				}
			}
		} else if (arg8 != 5) {
			if (arg8 == 6) {
				if (arg7 == 0) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local3; local187 < local20; local187++) {
							if (local187 <= arg3 / 2) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 1) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local3; local187 < local20; local187++) {
							if (local182 <= arg1 / 2) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 2) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local3; local187 < local20; local187++) {
							if (local187 >= arg3 / 2) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 3) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local3; local187 < local20; local187++) {
							if (arg1 / 2 <= local182) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
			}
			if (arg8 == 7) {
				if (arg7 == 0) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local3; local187 < local20; local187++) {
							if (local182 - arg1 / 2 >= local187) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 1) {
					for (local182 = local126 - 1; local182 >= local152; local182--) {
						for (local187 = local3; local187 < local20; local187++) {
							if (local182 - arg1 / 2 >= local187) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 2) {
					for (local182 = local126 - 1; local182 >= local152; local182--) {
						for (local187 = local170 - 1; local187 >= local165; local187--) {
							if (local187 <= local182 - arg1 / 2) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 3) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local170 - 1; local187 >= local165; local187--) {
							if (local187 <= local182 - arg1 / 2) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
			}
			if (arg8 == 8) {
				if (arg7 == 0) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local3; local187 < local20; local187++) {
							if (local182 - arg1 / 2 <= local187) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 1) {
					for (local182 = local126 - 1; local182 >= local152; local182--) {
						for (local187 = local3; local187 < local20; local187++) {
							if (local187 >= local182 - arg1 / 2) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 2) {
					for (local182 = local126 - 1; local182 >= local152; local182--) {
						for (local187 = local170 - 1; local187 >= local165; local187--) {
							if (local182 - arg1 / 2 <= local187) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
				if (arg7 == 3) {
					for (local182 = local51; local182 < local68; local182++) {
						for (local187 = local170 - 1; local187 >= local165; local187--) {
							if (local182 - arg1 / 2 <= local187) {
								arg4[local104] = arg9;
							} else if (arg2) {
								arg4[local104] = arg6;
							}
							local104++;
						}
						local104 += local148;
					}
					return;
				}
			}
		} else if (arg7 == 0) {
			for (local182 = local126 - 1; local182 >= local152; local182--) {
				for (local187 = local170 - 1; local187 >= local165; local187--) {
					if (local182 >> 1 <= local187) {
						arg4[local104] = arg9;
					} else if (arg2) {
						arg4[local104] = arg6;
					}
					local104++;
				}
				local104 += local148;
			}
		} else if (arg7 == 1) {
			for (local182 = local126 - 1; local182 >= local152; local182--) {
				for (local187 = local3; local187 < local20; local187++) {
					if (local187 <= local182 << 1) {
						arg4[local104] = arg9;
					} else if (arg2) {
						arg4[local104] = arg6;
					}
					local104++;
				}
				local104 += local148;
			}
		} else if (arg7 == 2) {
			for (local182 = local51; local182 < local68; local182++) {
				for (local187 = local3; local187 < local20; local187++) {
					if (local182 >> 1 <= local187) {
						arg4[local104] = arg9;
					} else if (arg2) {
						arg4[local104] = arg6;
					}
					local104++;
				}
				local104 += local148;
			}
		} else if (arg7 == 3) {
			for (local182 = local51; local182 < local68; local182++) {
				for (local187 = local170 - 1; local187 >= local165; local187--) {
					if (local182 << 1 >= local187) {
						arg4[local104] = arg9;
					} else if (arg2) {
						arg4[local104] = arg6;
					}
					local104++;
				}
				local104 += local148;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([[B[Lclient!re;I[[F[[BI[[B[[I[[F[[F[[BI)V")
	public static void method1898(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class144[] arg1, @OriginalArg(3) float[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10) {
		for (@Pc(7) int local7 = 0; local7 < arg4; local7++) {
			@Pc(18) Class144 local18 = arg1[local7];
			if (arg10 == local18.anInt4492) {
				@Pc(30) Class178 local30 = new Class178();
				@Pc(39) int local39 = (local18.anInt4502 >> 7) - local18.anInt4503;
				@Pc(41) int local41 = 0;
				@Pc(50) int local50 = (local18.anInt4490 >> 7) - local18.anInt4503;
				if (local50 < 0) {
					local41 = -local50;
					local50 = 0;
				}
				@Pc(68) int local68 = (local18.anInt4490 >> 7) + local18.anInt4503;
				if (local68 > 103) {
					local68 = 103;
				}
				@Pc(76) int local76;
				@Pc(84) short local84;
				@Pc(90) int local90;
				@Pc(98) int local98;
				@Pc(113) int local113;
				@Pc(136) int local136;
				@Pc(312) boolean local312;
				@Pc(353) int local353;
				for (local76 = local50; local76 <= local68; local76++) {
					local84 = local18.aShortArray75[local41];
					local90 = (local84 >> 8) + local39;
					local98 = (local84 & 0xFF) + local90 - 1;
					if (local90 < 0) {
						local90 = 0;
					}
					if (local98 > 103) {
						local98 = 103;
					}
					for (local113 = local90; local113 <= local98; local113++) {
						@Pc(128) int local128 = arg3[local113][local76] & 0xFF;
						local136 = arg9[local113][local76] & 0xFF;
						@Pc(138) boolean local138 = false;
						@Pc(152) Class10 local152;
						@Pc(170) int[] local170;
						@Pc(241) int[] local241;
						if (local128 == 0) {
							if (local136 == 0) {
								continue;
							}
							local152 = Static163.method2826(local136 - 1);
							if (local152.anInt262 == -1) {
								continue;
							}
							if (arg5[local113][local76] != 0) {
								local241 = Static200.anIntArrayArray21[arg5[local113][local76]];
								local30.anInt5530 += ((local241.length >> 1) - 2) * 3;
								local30.anInt5529 += local241.length >> 1;
								continue;
							}
						} else if (local136 != 0) {
							local152 = Static163.method2826(local136 - 1);
							@Pc(163) byte local163;
							if (local152.anInt262 == -1) {
								local163 = arg5[local113][local76];
								if (local163 != 0) {
									local170 = Static199.anIntArrayArray20[local163];
									local30.anInt5530 += ((local170.length >> 1) - 2) * 3;
									local30.anInt5529 += local170.length >> 1;
								}
								continue;
							}
							local163 = arg5[local113][local76];
							if (local163 != 0) {
								local138 = true;
							}
						}
						@Pc(270) Class25 local270 = Static90.method1590(arg10, local113, local76);
						if (local270 != null) {
							@Pc(281) int local281 = (int) (local270.aLong39 >> 14) & 0x3F;
							if (local281 == 9) {
								local170 = null;
								@Pc(294) int local294 = (int) (local270.aLong39 >> 20) & 0x3;
								@Pc(321) boolean local321;
								@Pc(340) short local340;
								@Pc(346) int local346;
								if ((local294 & 0x1) == 0) {
									local312 = local113 + 1 <= local98;
									local321 = local90 <= local113 - 1;
									if (!local321 && local68 >= local76 + 1) {
										local340 = local18.aShortArray75[local41 + 1];
										local346 = local39 + (local340 >> 8);
										local353 = local346 + (local340 & 0xFF);
										local321 = local346 < local113 && local113 < local353;
									}
									if (!local312 && local50 <= local76 - 1) {
										local340 = local18.aShortArray75[local41 - 1];
										local346 = local39 + (local340 >> 8);
										local353 = (local340 & 0xFF) + local346;
										local312 = local346 < local113 && local353 > local113;
									}
									if (local321 && local312) {
										local170 = Static200.anIntArrayArray21[0];
									} else if (local321) {
										local170 = Static200.anIntArrayArray21[1];
									} else if (local312) {
										local170 = Static200.anIntArrayArray21[1];
									}
								} else {
									local312 = local113 + 1 <= local98;
									local321 = local113 - 1 >= local90;
									if (!local321 && local76 - 1 >= local50) {
										local340 = local18.aShortArray75[local41 - 1];
										local346 = local39 + (local340 >> 8);
										local353 = local346 + (local340 & 0xFF);
										local321 = local346 < local113 && local353 > local113;
									}
									if (!local312 && local76 + 1 <= local68) {
										local340 = local18.aShortArray75[local41 + 1];
										local346 = (local340 >> 8) + local39;
										local353 = local346 + (local340 & 0xFF);
										local312 = local113 > local346 && local113 < local353;
									}
									if (local321 && local312) {
										local170 = Static200.anIntArrayArray21[0];
									} else if (local321) {
										local170 = Static200.anIntArrayArray21[1];
									} else if (local312) {
										local170 = Static200.anIntArrayArray21[1];
									}
								}
								if (local170 != null) {
									local30.anInt5530 += ((local170.length >> 1) - 2) * 3;
									local30.anInt5529 += local170.length >> 1;
								}
								continue;
							}
						}
						if (local138) {
							local170 = Static199.anIntArrayArray20[arg5[local113][local76]];
							local241 = Static200.anIntArrayArray21[arg5[local113][local76]];
							local30.anInt5530 += (local241.length >> 1) * 3 - 6;
							local30.anInt5530 += ((local170.length >> 1) - 2) * 3;
							local30.anInt5529 += local241.length >> 1;
							local30.anInt5529 += local170.length >> 1;
						} else {
							local241 = Static200.anIntArrayArray21[0];
							local30.anInt5530 += ((local241.length >> 1) - 2) * 3;
							local30.anInt5529 += local241.length >> 1;
						}
					}
					local41++;
				}
				local41 = 0;
				local30.method4390();
				if ((local18.anInt4490 >> 7) - local18.anInt4503 < 0) {
					local41 = local18.anInt4503 - (local18.anInt4490 >> 7);
				}
				for (local76 = local50; local76 <= local68; local76++) {
					local84 = local18.aShortArray75[local41];
					local90 = (local84 >> 8) + local39;
					local98 = (local84 & 0xFF) + local90 - 1;
					if (local90 < 0) {
						local90 = 0;
					}
					if (local98 > 103) {
						local98 = 103;
					}
					for (local113 = local90; local113 <= local98; local113++) {
						@Pc(761) byte local761 = arg0[local113][local76];
						local136 = arg3[local113][local76] & 0xFF;
						@Pc(777) int local777 = arg9[local113][local76] & 0xFF;
						@Pc(779) boolean local779 = false;
						@Pc(798) Class10 local798;
						if (local136 == 0) {
							if (local777 == 0) {
								continue;
							}
							local798 = Static163.method2826(local777 - 1);
							if (local798.anInt262 == -1) {
								continue;
							}
							if (arg5[local113][local76] != 0) {
								Static261.method4007(local76, arg0[local113][local76], arg8, local18, local30, local113, Static200.anIntArrayArray21[arg5[local113][local76]], arg7, arg2, arg6);
								continue;
							}
						} else if (local777 != 0) {
							local798 = Static163.method2826(local777 - 1);
							if (local798.anInt262 == -1) {
								Static261.method4007(local76, arg0[local113][local76], arg8, local18, local30, local113, Static199.anIntArrayArray20[arg5[local113][local76]], arg7, arg2, arg6);
								continue;
							}
							@Pc(810) byte local810 = arg5[local113][local76];
							if (local810 != 0) {
								local779 = true;
							}
						}
						@Pc(902) Class25 local902 = Static90.method1590(arg10, local113, local76);
						if (local902 != null) {
							@Pc(913) int local913 = (int) (local902.aLong39 >> 14) & 0x3F;
							if (local913 == 9) {
								@Pc(921) int[] local921 = null;
								@Pc(929) int local929 = (int) (local902.aLong39 >> 20) & 0x3;
								@Pc(985) int local985;
								@Pc(949) boolean local949;
								@Pc(973) short local973;
								if ((local929 & 0x1) == 0) {
									local312 = local113 - 1 >= local90;
									local949 = local113 + 1 <= local98;
									if (!local312 && local76 + 1 <= local68) {
										local973 = local18.aShortArray75[local41 + 1];
										local353 = (local973 >> 8) + local39;
										local985 = local353 + (local973 & 0xFF);
										local312 = local113 > local353 && local113 < local985;
									}
									if (!local949 && local76 - 1 >= local50) {
										local973 = local18.aShortArray75[local41 - 1];
										local353 = (local973 >> 8) + local39;
										local985 = (local973 & 0xFF) + local353;
										local949 = local113 > local353 && local113 < local985;
									}
									if (local312 && local949) {
										local921 = Static200.anIntArrayArray21[0];
									} else if (local312) {
										local921 = Static200.anIntArrayArray21[1];
										local761 = 1;
									} else if (local949) {
										local761 = 3;
										local921 = Static200.anIntArrayArray21[1];
									}
								} else {
									local949 = local113 + 1 <= local98;
									local312 = local90 <= local113 - 1;
									if (!local312 && local76 - 1 >= local50) {
										local973 = local18.aShortArray75[local41 - 1];
										local353 = local39 + (local973 >> 8);
										local985 = (local973 & 0xFF) + local353;
										local312 = local113 > local353 && local985 > local113;
									}
									if (!local949 && local76 + 1 <= local68) {
										local973 = local18.aShortArray75[local41 + 1];
										local353 = local39 + (local973 >> 8);
										local985 = (local973 & 0xFF) + local353;
										local949 = local113 > local353 && local113 < local985;
									}
									if (local312 && local949) {
										local921 = Static200.anIntArrayArray21[0];
									} else if (local312) {
										local921 = Static200.anIntArrayArray21[1];
										local761 = 0;
									} else if (local949) {
										local921 = Static200.anIntArrayArray21[1];
										local761 = 2;
									}
								}
								if (local921 != null) {
									Static261.method4007(local76, local761, arg8, local18, local30, local113, local921, arg7, arg2, arg6);
								}
								continue;
							}
						}
						if (local779) {
							Static261.method4007(local76, arg0[local113][local76], arg8, local18, local30, local113, Static199.anIntArrayArray20[arg5[local113][local76]], arg7, arg2, arg6);
							Static261.method4007(local76, arg0[local113][local76], arg8, local18, local30, local113, Static200.anIntArrayArray21[arg5[local113][local76]], arg7, arg2, arg6);
						} else {
							Static261.method4007(local76, local761, arg8, local18, local30, local113, Static200.anIntArrayArray21[0], arg7, arg2, arg6);
						}
					}
					local41++;
				}
				if (local30.anInt5528 > 0 && local30.anInt5527 > 0) {
					local30.method4394();
					local18.aClass178_1 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1899(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg0.indexOf(arg2); local9 != -1; local9 = arg0.indexOf(arg2, local9 + arg1.length())) {
			arg0 = arg0.substring(0, local9) + arg1 + arg0.substring(arg2.length() + local9);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IZ)I")
	public static int method1900(@OriginalArg(0) int arg0) {
		if (arg0 <= 0) {
			return arg0 < 0 ? -1 : 0;
		} else {
			return 1;
		}
	}
}
