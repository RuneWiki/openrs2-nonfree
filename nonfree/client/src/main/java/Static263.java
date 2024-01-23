import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!so", name = "rb", descriptor = "Lclient!nk;")
	public static Class121 aClass121_117;

	@OriginalMember(owner = "client!so", name = "sb", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!so", name = "tb", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!so", name = "bb", descriptor = "Lclient!qj;")
	public static Class148 aClass148_10 = new Class148(64);

	@OriginalMember(owner = "client!so", name = "qb", descriptor = "Lclient!te;")
	public static Class75 aClass75_1 = Static123.method2171();

	@OriginalMember(owner = "client!so", name = "ub", descriptor = "[I")
	public static int[] anIntArray425 = new int[2048];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public static void method4144(@OriginalArg(0) int arg0) {
		Static134.anInt5649 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIII)I")
	public static int method4147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method4149(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg0);
		@Pc(12) int local12 = local4.method1378();
		@Pc(16) int local16 = local4.method1392();
		if (local16 < 0 || Static87.anInt1703 != 0 && local16 > Static87.anInt1703) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(41) byte[] local41 = new byte[local16];
			local4.method1355(local16, local41);
			return local41;
		} else {
			@Pc(53) int local53 = local4.method1392();
			if (local53 < 0 || Static87.anInt1703 != 0 && local53 > Static87.anInt1703) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local53];
			if (local12 == 1) {
				Static223.method3458(local76, local53, arg0, local16);
			} else {
				Static299.aClass164_1.method4115(local4, local76);
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method4150(@OriginalArg(2) String arg0) {
		return Static172.method2907(arg0, 16);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!gi;B)V")
	public static void method4151(@OriginalArg(0) Class15_Sub5 arg0) {
		if (arg0.anInt5529 == 0) {
			return;
		}
		@Pc(18) Class11 local18 = arg0.method4698();
		@Pc(40) int local40;
		@Pc(47) int local47;
		if (arg0.anInt5581 != -1 && arg0.anInt5581 < 32768) {
			@Pc(31) Class15_Sub5_Sub1 local31 = Static83.aClass15_Sub5_Sub1Array1[arg0.anInt5581];
			if (local31 != null) {
				local40 = arg0.anInt5559 - local31.anInt5559;
				local47 = arg0.anInt5557 - local31.anInt5557;
				if (local40 != 0 || local47 != 0) {
					arg0.anInt5593 = (int) (Math.atan2((double) local40, (double) local47) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(106) int local106;
		@Pc(77) int local77;
		if (arg0.anInt5581 >= 32768) {
			local77 = arg0.anInt5581 - 32768;
			if (Static35.anInt3966 == local77) {
				local77 = 2047;
			}
			@Pc(90) Class15_Sub5_Sub2 local90 = Static17.aClass15_Sub5_Sub2Array1[local77];
			if (local90 != null) {
				local47 = arg0.anInt5559 - local90.anInt5559;
				local106 = arg0.anInt5557 - local90.anInt5557;
				if (local47 != 0 || local106 != 0) {
					arg0.anInt5593 = (int) (Math.atan2((double) local47, (double) local106) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt5517 != 0 || arg0.anInt5526 != 0) && (arg0.anInt5578 == 0 || arg0.anInt5519 > 0)) {
			local77 = arg0.anInt5559 - (arg0.anInt5517 - Static199.anInt3817 - Static199.anInt3817) * 64;
			local40 = arg0.anInt5557 - (arg0.anInt5526 - Static192.anInt3637 - Static192.anInt3637) * 64;
			if (local77 != 0 || local40 != 0) {
				arg0.anInt5593 = (int) (Math.atan2((double) local77, (double) local40) * 325.949D) & 0x7FF;
			}
			arg0.anInt5517 = 0;
			arg0.anInt5526 = 0;
		}
		local77 = arg0.anInt5593 - arg0.anInt5554 & 0x7FF;
		if (local77 == 0) {
			arg0.anInt5562 = 0;
			arg0.anInt5520 = 0;
		} else if (local18.anInt221 == 0) {
			arg0.anInt5520++;
			@Pc(853) boolean local853;
			if (local77 > 1024) {
				local853 = true;
				arg0.anInt5554 -= arg0.anInt5529;
				if (arg0.anInt5529 > local77 || local77 > 2048 - arg0.anInt5529) {
					arg0.anInt5554 = arg0.anInt5593;
					local853 = false;
				}
				if (arg0.anInt5520 > 25 || local853) {
					arg0.anInt5569 = local18.anInt200;
					if (arg0.anInt5578 > 0) {
						if (arg0.aByteArray73[arg0.anInt5578 - 1] == 2) {
							if (local18.anInt180 != -1) {
								arg0.anInt5569 = local18.anInt180;
							} else if (local18.anInt187 != -1) {
								arg0.anInt5569 = local18.anInt187;
							}
						} else if (arg0.aByteArray73[arg0.anInt5578 - 1] == 0) {
							if (local18.anInt216 != -1) {
								arg0.anInt5569 = local18.anInt216;
							} else if (local18.anInt190 != -1) {
								arg0.anInt5569 = local18.anInt190;
							}
						} else if (local18.anInt183 != -1) {
							arg0.anInt5569 = local18.anInt183;
						}
					} else if (local18.anInt209 != -1) {
						arg0.anInt5569 = local18.anInt209;
					}
				}
			} else {
				local853 = true;
				arg0.anInt5554 += arg0.anInt5529;
				if (arg0.anInt5529 > local77 || local77 > 2048 - arg0.anInt5529) {
					local853 = false;
					arg0.anInt5554 = arg0.anInt5593;
				}
				if (arg0.anInt5520 > 25 || local853) {
					arg0.anInt5569 = local18.anInt200;
					if (arg0.anInt5578 <= 0) {
						if (local18.anInt203 != -1) {
							arg0.anInt5569 = local18.anInt203;
						}
					} else if (arg0.aByteArray73[arg0.anInt5578 - 1] == 2) {
						if (local18.anInt186 != -1) {
							arg0.anInt5569 = local18.anInt186;
						} else if (local18.anInt187 != -1) {
							arg0.anInt5569 = local18.anInt187;
						}
					} else if (arg0.aByteArray73[arg0.anInt5578 - 1] == 0) {
						if (local18.anInt213 != -1) {
							arg0.anInt5569 = local18.anInt213;
						} else if (local18.anInt190 != -1) {
							arg0.anInt5569 = local18.anInt190;
						}
					} else if (local18.anInt208 != -1) {
						arg0.anInt5569 = local18.anInt208;
					}
				}
			}
			arg0.anInt5554 &= 0x7FF;
		} else {
			arg0.anInt5569 = -1;
			local40 = arg0.anInt5593 << 5;
			if (arg0.anInt5573 != local40) {
				arg0.anInt5573 = local40;
				arg0.anInt5575 = 0;
				local47 = local40 - arg0.anInt5536 & 0xFFFF;
				local106 = arg0.anInt5562 * arg0.anInt5562 / (local18.anInt221 * 2);
				@Pc(302) int local302;
				if (arg0.anInt5562 > 0 && local106 <= local47 && local47 - local106 < 32768) {
					arg0.anInt5574 = local47 / 2;
					arg0.aBoolean373 = true;
					local302 = local18.anInt219 * local18.anInt219 / (local18.anInt221 * 2);
					if (local302 > 32767) {
						local302 = 32767;
					}
					if (arg0.anInt5574 > local302) {
						arg0.anInt5574 = local47 - local302;
					}
				} else if (arg0.anInt5562 < 0 && 65536 - local47 >= local106 && 65536 - local106 - local47 < 32768) {
					arg0.aBoolean373 = true;
					arg0.anInt5574 = (65536 - local47) / 2;
					local302 = local18.anInt219 * local18.anInt219 / (local18.anInt221 * 2);
					if (local302 > 32767) {
						local302 = 32767;
					}
					if (local302 < arg0.anInt5574) {
						arg0.anInt5574 = 65536 - local47 - local302;
					}
				} else {
					arg0.aBoolean373 = false;
				}
			}
			if (arg0.anInt5562 == 0) {
				local47 = arg0.anInt5573 - arg0.anInt5536 & 0xFFFF;
				if (local47 >= local18.anInt221) {
					local106 = local18.anInt219 * local18.anInt219 / (local18.anInt221 * 2);
					arg0.anInt5575 = 0;
					arg0.aBoolean373 = true;
					if (local106 > 32767) {
						local106 = 32767;
					}
					if (local47 < 32768) {
						arg0.anInt5562 = local18.anInt221;
						arg0.anInt5574 = local47 / 2;
						if (local106 < arg0.anInt5574) {
							arg0.anInt5574 = local47 - local106;
						}
					} else {
						arg0.anInt5562 = -local18.anInt221;
						arg0.anInt5574 = (65536 - local47) / 2;
						if (arg0.anInt5574 > local106) {
							arg0.anInt5574 = 65536 - local106 - local47;
						}
					}
				} else {
					arg0.anInt5536 = arg0.anInt5573;
				}
			} else if (arg0.anInt5562 <= 0) {
				if (arg0.anInt5575 >= arg0.anInt5574) {
					arg0.aBoolean373 = false;
				}
				if (!arg0.aBoolean373) {
					arg0.anInt5562 += local18.anInt221;
					if (arg0.anInt5562 > 0) {
						arg0.anInt5562 = 0;
					}
				} else if (arg0.anInt5562 > -local18.anInt219) {
					arg0.anInt5562 -= local18.anInt221;
				}
			} else {
				if (arg0.anInt5575 >= arg0.anInt5574) {
					arg0.aBoolean373 = false;
				}
				if (!arg0.aBoolean373) {
					arg0.anInt5562 -= local18.anInt221;
					if (arg0.anInt5562 < 0) {
						arg0.anInt5562 = 0;
					}
				} else if (arg0.anInt5562 < local18.anInt219) {
					arg0.anInt5562 += local18.anInt221;
				}
			}
			if (arg0.anInt5562 > 0) {
				arg0.anInt5575 += arg0.anInt5562;
			} else {
				arg0.anInt5575 -= arg0.anInt5562;
			}
			arg0.anInt5536 += arg0.anInt5562;
			arg0.anInt5536 &= 0xFFFF;
			arg0.anInt5554 = arg0.anInt5536 >> 5;
			if (arg0.anInt5562 < 0) {
				if (arg0.anInt5578 > 0) {
					if (arg0.aByteArray73[arg0.anInt5578 - 1] == 2) {
						if (local18.anInt180 != -1) {
							arg0.anInt5569 = local18.anInt180;
						} else if (local18.anInt187 != -1) {
							arg0.anInt5569 = local18.anInt187;
						}
					} else if (arg0.aByteArray73[arg0.anInt5578 - 1] == 0) {
						if (local18.anInt216 != -1) {
							arg0.anInt5569 = local18.anInt216;
						} else if (local18.anInt190 != -1) {
							arg0.anInt5569 = local18.anInt190;
						}
					}
				}
				if (arg0.anInt5569 == -1) {
					if (local18.anInt183 != -1) {
						arg0.anInt5569 = local18.anInt183;
					} else if (local18.anInt209 != -1) {
						arg0.anInt5569 = local18.anInt209;
					}
				}
			} else {
				if (arg0.anInt5578 > 0) {
					if (arg0.aByteArray73[arg0.anInt5578 - 1] == 2) {
						if (local18.anInt186 != -1) {
							arg0.anInt5569 = local18.anInt186;
						} else if (local18.anInt187 != -1) {
							arg0.anInt5569 = local18.anInt187;
						}
					} else if (arg0.aByteArray73[arg0.anInt5578 - 1] == 0) {
						if (local18.anInt213 != -1) {
							arg0.anInt5569 = local18.anInt213;
						} else if (local18.anInt190 != -1) {
							arg0.anInt5569 = local18.anInt190;
						}
					}
				}
				if (arg0.anInt5569 == -1) {
					if (local18.anInt208 != -1) {
						arg0.anInt5569 = local18.anInt208;
					} else if (local18.anInt203 != -1) {
						arg0.anInt5569 = local18.anInt203;
					}
				}
			}
			if (arg0.anInt5569 == -1) {
				arg0.anInt5569 = local18.anInt200;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public static void method4152() {
		Static192.aClass187_102.method4525();
		Static80.aClass187_50.method4525();
		Static79.aClass187_49.method4525();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIB)V")
	public static void method4153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static205.anInt3910 == 1) {
			Static113.aClass1_Sub2_Sub1Array6[Static262.anInt4774 / 100].method3839(Static303.anInt5390 - 8, Static92.anInt5525 + -8);
		}
		if (Static205.anInt3910 == 2) {
			Static113.aClass1_Sub2_Sub1Array6[Static262.anInt4774 / 100 + 4].method3839(Static303.anInt5390 - 8, Static92.anInt5525 + -8);
		}
		Static212.method610();
	}
}
