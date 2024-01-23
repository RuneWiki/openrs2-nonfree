import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!km", name = "d", descriptor = "Lclient!gf;")
	public static Class62 aClass62_5;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "I")
	public static int anInt2690;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString93 = "Walk here";

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString94 = "Loading interfaces - ";

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	public static int anInt2688 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public static void method2274() {
		Static110.aClass31_18.method850();
		Static12.aClass31_2.method850();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method2275(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(11) String local11 = Static155.method2390(Static239.method3766(arg0));
		@Pc(20) boolean local20 = false;
		for (@Pc(22) int local22 = 0; local22 < Static241.anInt4977; local22++) {
			@Pc(31) Class6_Sub6_Sub2 local31 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local22]];
			if (local31 != null && local31.aString147 != null && local31.aString147.equalsIgnoreCase(local11)) {
				if (arg1 == 1) {
					Static270.aClass1_Sub18_Sub1_3.method3130(27);
					Static270.aClass1_Sub18_Sub1_3.method3093(0);
					Static270.aClass1_Sub18_Sub1_3.method3102(Static143.anIntArray331[local22]);
				} else if (arg1 == 4) {
					Static270.aClass1_Sub18_Sub1_3.method3130(58);
					Static270.aClass1_Sub18_Sub1_3.method3093(0);
					Static270.aClass1_Sub18_Sub1_3.method3102(Static143.anIntArray331[local22]);
				} else if (arg1 == 5) {
					Static270.aClass1_Sub18_Sub1_3.method3130(1);
					Static270.aClass1_Sub18_Sub1_3.method3089(Static143.anIntArray331[local22]);
					Static270.aClass1_Sub18_Sub1_3.method3068(0);
				} else if (arg1 == 6) {
					Static270.aClass1_Sub18_Sub1_3.method3130(161);
					Static270.aClass1_Sub18_Sub1_3.method3093(0);
					Static270.aClass1_Sub18_Sub1_3.method3089(Static143.anIntArray331[local22]);
				} else if (arg1 == 7) {
					Static270.aClass1_Sub18_Sub1_3.method3130(251);
					Static270.aClass1_Sub18_Sub1_3.method3123(Static143.anIntArray331[local22]);
					Static270.aClass1_Sub18_Sub1_3.method3076(0);
				}
				local20 = true;
				break;
			}
		}
		if (!local20) {
			Static48.method843(Static182.aString117 + local11, 0, "");
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!rf;)V")
	public static void method2277(@OriginalArg(1) Class6_Sub6 arg0) {
		if (arg0.anInt4503 == 0) {
			return;
		}
		@Pc(16) Class79 local16 = arg0.method3503();
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (arg0.anInt4513 != -1 && arg0.anInt4513 < 32768) {
			@Pc(29) Class6_Sub6_Sub1 local29 = Static211.aClass6_Sub6_Sub1Array2[arg0.anInt4513];
			if (local29 != null) {
				local38 = arg0.anInt4562 - local29.anInt4562;
				local45 = arg0.anInt4569 - local29.anInt4569;
				if (local38 != 0 || local45 != 0) {
					arg0.anInt4579 = (int) (Math.atan2((double) local38, (double) local45) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(110) int local110;
		@Pc(79) int local79;
		if (arg0.anInt4513 >= 32768) {
			local79 = arg0.anInt4513 - 32768;
			if (local79 == Static216.anInt4446) {
				local79 = 2047;
			}
			@Pc(93) Class6_Sub6_Sub2 local93 = Static77.aClass6_Sub6_Sub2Array1[local79];
			if (local93 != null) {
				local45 = arg0.anInt4562 - local93.anInt4562;
				local110 = arg0.anInt4569 - local93.anInt4569;
				if (local45 != 0 || local110 != 0) {
					arg0.anInt4579 = (int) (Math.atan2((double) local45, (double) local110) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4552 != 0 || arg0.anInt4517 != 0) && (arg0.anInt4558 == 0 || arg0.anInt4551 > 0)) {
			local38 = arg0.anInt4569 - (arg0.anInt4517 - Static158.anInt2961 - Static158.anInt2961) * 64;
			local79 = arg0.anInt4562 - (arg0.anInt4552 - Static224.anInt4695 - Static224.anInt4695) * 64;
			if (local79 != 0 || local38 != 0) {
				arg0.anInt4579 = (int) (Math.atan2((double) local79, (double) local38) * 325.949D) & 0x7FF;
			}
			arg0.anInt4517 = 0;
			arg0.anInt4552 = 0;
		}
		local79 = arg0.anInt4579 - arg0.anInt4511 & 0x7FF;
		if (local79 == 0) {
			arg0.anInt4509 = 0;
			arg0.anInt4564 = 0;
		} else if (local16.anInt2195 == 0) {
			arg0.anInt4509++;
			@Pc(240) boolean local240;
			if (local79 > 1024) {
				local240 = true;
				arg0.anInt4511 -= arg0.anInt4503;
				if (arg0.anInt4503 > local79 || local79 > 2048 - arg0.anInt4503) {
					arg0.anInt4511 = arg0.anInt4579;
					local240 = false;
				}
				if (arg0.anInt4509 > 25 || local240) {
					arg0.anInt4544 = local16.anInt2224;
					if (arg0.anInt4558 > 0) {
						if (arg0.aByteArray76[arg0.anInt4558 - 1] == 2) {
							if (local16.anInt2222 != -1) {
								arg0.anInt4544 = local16.anInt2222;
							} else if (local16.anInt2225 != -1) {
								arg0.anInt4544 = local16.anInt2225;
							}
						} else if (arg0.aByteArray76[arg0.anInt4558 - 1] == 0) {
							if (local16.anInt2211 != -1) {
								arg0.anInt4544 = local16.anInt2211;
							} else if (local16.anInt2221 != -1) {
								arg0.anInt4544 = local16.anInt2221;
							}
						} else if (local16.anInt2227 != -1) {
							arg0.anInt4544 = local16.anInt2227;
						}
					} else if (local16.anInt2209 != -1) {
						arg0.anInt4544 = local16.anInt2209;
					}
				}
			} else {
				local240 = true;
				arg0.anInt4511 += arg0.anInt4503;
				if (local79 < arg0.anInt4503 || local79 > 2048 - arg0.anInt4503) {
					arg0.anInt4511 = arg0.anInt4579;
					local240 = false;
				}
				if (arg0.anInt4509 > 25 || local240) {
					arg0.anInt4544 = local16.anInt2224;
					if (arg0.anInt4558 <= 0) {
						if (local16.anInt2228 != -1) {
							arg0.anInt4544 = local16.anInt2228;
						}
					} else if (arg0.aByteArray76[arg0.anInt4558 - 1] == 2) {
						if (local16.anInt2216 != -1) {
							arg0.anInt4544 = local16.anInt2216;
						} else if (local16.anInt2225 != -1) {
							arg0.anInt4544 = local16.anInt2225;
						}
					} else if (arg0.aByteArray76[arg0.anInt4558 - 1] == 0) {
						if (local16.anInt2230 != -1) {
							arg0.anInt4544 = local16.anInt2230;
						} else if (local16.anInt2221 != -1) {
							arg0.anInt4544 = local16.anInt2221;
						}
					} else if (local16.anInt2210 != -1) {
						arg0.anInt4544 = local16.anInt2210;
					}
				}
			}
			arg0.anInt4511 &= 0x7FF;
		} else {
			arg0.anInt4544 = -1;
			local38 = arg0.anInt4579 << 5;
			if (arg0.anInt4523 != local38) {
				arg0.anInt4523 = local38;
				arg0.anInt4512 = 0;
				local45 = local38 - arg0.anInt4508 & 0xFFFF;
				local110 = arg0.anInt4564 * arg0.anInt4564 / (local16.anInt2195 * 2);
				@Pc(607) int local607;
				if (arg0.anInt4564 > 0 && local110 <= local45 && local45 - local110 < 32768) {
					arg0.anInt4555 = local45 / 2;
					arg0.aBoolean342 = true;
					local607 = local16.anInt2200 * local16.anInt2200 / (local16.anInt2195 * 2);
					if (local607 > 32767) {
						local607 = 32767;
					}
					if (local607 < arg0.anInt4555) {
						arg0.anInt4555 = local45 - local607;
					}
				} else if (arg0.anInt4564 < 0 && 65536 - local45 >= local110 && 65536 - local45 - local110 < 32768) {
					arg0.aBoolean342 = true;
					arg0.anInt4555 = (65536 - local45) / 2;
					local607 = local16.anInt2200 * local16.anInt2200 / (local16.anInt2195 * 2);
					if (local607 > 32767) {
						local607 = 32767;
					}
					if (local607 < arg0.anInt4555) {
						arg0.anInt4555 = 65536 - local607 - local45;
					}
				} else {
					arg0.aBoolean342 = false;
				}
			}
			if (arg0.anInt4564 == 0) {
				local45 = arg0.anInt4523 - arg0.anInt4508 & 0xFFFF;
				if (local16.anInt2195 <= local45) {
					arg0.aBoolean342 = true;
					local110 = local16.anInt2200 * local16.anInt2200 / (local16.anInt2195 * 2);
					arg0.anInt4512 = 0;
					if (local110 > 32767) {
						local110 = 32767;
					}
					if (local45 >= 32768) {
						arg0.anInt4555 = (65536 - local45) / 2;
						if (local110 < arg0.anInt4555) {
							arg0.anInt4555 = 65536 - local110 - local45;
						}
						arg0.anInt4564 = -local16.anInt2195;
					} else {
						arg0.anInt4564 = local16.anInt2195;
						arg0.anInt4555 = local45 / 2;
						if (arg0.anInt4555 > local110) {
							arg0.anInt4555 = local45 - local110;
						}
					}
				} else {
					arg0.anInt4508 = arg0.anInt4523;
				}
			} else if (arg0.anInt4564 > 0) {
				if (arg0.anInt4555 <= arg0.anInt4512) {
					arg0.aBoolean342 = false;
				}
				if (!arg0.aBoolean342) {
					arg0.anInt4564 -= local16.anInt2195;
					if (arg0.anInt4564 < 0) {
						arg0.anInt4564 = 0;
					}
				} else if (local16.anInt2200 > arg0.anInt4564) {
					arg0.anInt4564 += local16.anInt2195;
				}
			} else {
				if (arg0.anInt4555 <= arg0.anInt4512) {
					arg0.aBoolean342 = false;
				}
				if (!arg0.aBoolean342) {
					arg0.anInt4564 += local16.anInt2195;
					if (arg0.anInt4564 > 0) {
						arg0.anInt4564 = 0;
					}
				} else if (arg0.anInt4564 > -local16.anInt2200) {
					arg0.anInt4564 -= local16.anInt2195;
				}
			}
			if (arg0.anInt4564 <= 0) {
				arg0.anInt4512 -= arg0.anInt4564;
			} else {
				arg0.anInt4512 += arg0.anInt4564;
			}
			arg0.anInt4508 += arg0.anInt4564;
			arg0.anInt4508 &= 0xFFFF;
			arg0.anInt4511 = arg0.anInt4508 >> 5;
			if (arg0.anInt4564 < 0) {
				if (arg0.anInt4558 > 0) {
					if (arg0.aByteArray76[arg0.anInt4558 - 1] == 2) {
						if (local16.anInt2222 != -1) {
							arg0.anInt4544 = local16.anInt2222;
						} else if (local16.anInt2225 != -1) {
							arg0.anInt4544 = local16.anInt2225;
						}
					} else if (arg0.aByteArray76[arg0.anInt4558 - 1] == 0) {
						if (local16.anInt2211 != -1) {
							arg0.anInt4544 = local16.anInt2211;
						} else if (local16.anInt2221 != -1) {
							arg0.anInt4544 = local16.anInt2221;
						}
					}
				}
				if (arg0.anInt4544 == -1) {
					if (local16.anInt2227 != -1) {
						arg0.anInt4544 = local16.anInt2227;
					} else if (local16.anInt2209 != -1) {
						arg0.anInt4544 = local16.anInt2209;
					}
				}
			} else {
				if (arg0.anInt4558 > 0) {
					if (arg0.aByteArray76[arg0.anInt4558 - 1] == 2) {
						if (local16.anInt2216 != -1) {
							arg0.anInt4544 = local16.anInt2216;
						} else if (local16.anInt2225 != -1) {
							arg0.anInt4544 = local16.anInt2225;
						}
					} else if (arg0.aByteArray76[arg0.anInt4558 - 1] == 0) {
						if (local16.anInt2230 != -1) {
							arg0.anInt4544 = local16.anInt2230;
						} else if (local16.anInt2221 != -1) {
							arg0.anInt4544 = local16.anInt2221;
						}
					}
				}
				if (arg0.anInt4544 == -1) {
					if (local16.anInt2210 != -1) {
						arg0.anInt4544 = local16.anInt2210;
					} else if (local16.anInt2228 != -1) {
						arg0.anInt4544 = local16.anInt2228;
					}
				}
			}
			if (arg0.anInt4544 == -1) {
				arg0.anInt4544 = local16.anInt2224;
			}
		}
	}
}
