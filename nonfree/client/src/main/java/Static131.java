import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[S")
	public static short[] aShortArray50 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray30 = new boolean[8];

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
	public static int[] anIntArray263 = new int[5];

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString167 = "Loading title screen - ";

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
	public static void method2228(@OriginalArg(1) boolean arg0) {
		Static198.aByteArrayArrayArray2 = null;
		Static21.anIntArray48 = null;
		Static230.aByteArrayArrayArray15 = null;
		Static10.anIntArrayArrayArray1 = null;
		Static100.anIntArrayArrayArray6 = null;
		Static170.aClass71_15 = null;
		Static104.aByteArrayArrayArray16 = null;
		if (arg0 && Static20.aClass1_Sub2_Sub21_1 != null) {
			Static256.anInt5006 = Static20.aClass1_Sub2_Sub21_1.anInt5434;
		} else {
			Static256.anInt5006 = -1;
		}
		Static24.aByteArrayArrayArray22 = null;
		Static267.aByteArrayArrayArray24 = null;
		Static20.aClass1_Sub2_Sub21_1 = null;
		Static100.anIntArrayArrayArray5 = null;
		Static192.anInt3954 = 0;
		Static134.aClass61_17.method1845();
		Static218.aClass156_8 = null;
		Static133.aClass156_6 = null;
		Static258.anInt5077 = -1;
		Static246.aClass1_Sub2_Sub11_Sub2_4 = null;
		Static19.aClass156_1 = null;
		Static133.aClass156_7 = null;
		Static22.anInt448 = -1;
		Static92.aClass156_4 = null;
		Static69.aClass156_3 = null;
		Static164.aClass1_Sub2_Sub11_14 = null;
		Static53.aClass82_13 = null;
		Static109.aClass156_5 = null;
		Static31.aClass156_2 = null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!bo;I)V")
	public static void method2230(@OriginalArg(0) Class14_Sub2 arg0) {
		if (arg0.anInt4617 == 0) {
			return;
		}
		@Pc(17) Class164 local17 = arg0.method3650();
		@Pc(40) int local40;
		@Pc(46) int local46;
		if (arg0.anInt4627 != -1 && arg0.anInt4627 < 32768) {
			@Pc(32) Class14_Sub2_Sub2 local32 = Static254.aClass14_Sub2_Sub2Array1[arg0.anInt4627];
			if (local32 != null) {
				local40 = arg0.anInt4680 - local32.anInt4680;
				local46 = arg0.anInt4630 - local32.anInt4630;
				if (local40 != 0 || local46 != 0) {
					arg0.anInt4618 = (int) (Math.atan2((double) local40, (double) local46) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(94) int local94;
		@Pc(75) int local75;
		if (arg0.anInt4627 >= 32768) {
			local75 = arg0.anInt4627 - 32768;
			if (local75 == Static71.anInt1526) {
				local75 = 2047;
			}
			@Pc(85) Class14_Sub2_Sub1 local85 = Static98.aClass14_Sub2_Sub1Array1[local75];
			if (local85 != null) {
				local94 = arg0.anInt4630 - local85.anInt4630;
				local46 = arg0.anInt4680 - local85.anInt4680;
				if (local46 != 0 || local94 != 0) {
					arg0.anInt4618 = (int) (Math.atan2((double) local46, (double) local94) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4691 != 0 || arg0.anInt4639 != 0) && (arg0.anInt4678 == 0 || arg0.anInt4614 > 0)) {
			local75 = arg0.anInt4680 - (arg0.anInt4691 - Static53.anInt5288 - Static53.anInt5288) * 64;
			local40 = arg0.anInt4630 - (arg0.anInt4639 - Static83.anInt1875 - Static83.anInt1875) * 64;
			if (local75 != 0 || local40 != 0) {
				arg0.anInt4618 = (int) (Math.atan2((double) local75, (double) local40) * 325.949D) & 0x7FF;
			}
			arg0.anInt4691 = 0;
			arg0.anInt4639 = 0;
		}
		local75 = arg0.anInt4618 - arg0.anInt4681 & 0x7FF;
		if (local75 == 0) {
			arg0.anInt4660 = 0;
			arg0.anInt4669 = 0;
		} else if (local17.anInt5187 == 0) {
			arg0.anInt4669++;
			@Pc(839) boolean local839;
			if (local75 <= 1024) {
				arg0.anInt4681 += arg0.anInt4617;
				local839 = true;
				if (local75 < arg0.anInt4617 || local75 > 2048 - arg0.anInt4617) {
					local839 = false;
					arg0.anInt4681 = arg0.anInt4618;
				}
				if (arg0.anInt4669 > 25 || local839) {
					arg0.anInt4658 = local17.anInt5224;
					if (arg0.anInt4678 > 0) {
						if (arg0.aByteArray63[arg0.anInt4678 - 1] == 2) {
							if (local17.anInt5203 != -1) {
								arg0.anInt4658 = local17.anInt5203;
							} else if (local17.anInt5207 != -1) {
								arg0.anInt4658 = local17.anInt5207;
							}
						} else if (arg0.aByteArray63[arg0.anInt4678 - 1] == 0) {
							if (local17.anInt5211 != -1) {
								arg0.anInt4658 = local17.anInt5211;
							} else if (local17.anInt5221 != -1) {
								arg0.anInt4658 = local17.anInt5221;
							}
						} else if (local17.anInt5210 != -1) {
							arg0.anInt4658 = local17.anInt5210;
						}
					} else if (local17.anInt5197 != -1) {
						arg0.anInt4658 = local17.anInt5197;
					}
				}
			} else {
				arg0.anInt4681 -= arg0.anInt4617;
				local839 = true;
				if (arg0.anInt4617 > local75 || local75 > 2048 - arg0.anInt4617) {
					arg0.anInt4681 = arg0.anInt4618;
					local839 = false;
				}
				if (arg0.anInt4669 > 25 || local839) {
					arg0.anInt4658 = local17.anInt5224;
					if (arg0.anInt4678 > 0) {
						if (arg0.aByteArray63[arg0.anInt4678 - 1] == 2) {
							if (local17.anInt5206 != -1) {
								arg0.anInt4658 = local17.anInt5206;
							} else if (local17.anInt5207 != -1) {
								arg0.anInt4658 = local17.anInt5207;
							}
						} else if (arg0.aByteArray63[arg0.anInt4678 - 1] == 0) {
							if (local17.anInt5188 != -1) {
								arg0.anInt4658 = local17.anInt5188;
							} else if (local17.anInt5221 != -1) {
								arg0.anInt4658 = local17.anInt5221;
							}
						} else if (local17.anInt5186 != -1) {
							arg0.anInt4658 = local17.anInt5186;
						}
					} else if (local17.anInt5196 != -1) {
						arg0.anInt4658 = local17.anInt5196;
					}
				}
			}
			arg0.anInt4681 &= 0x7FF;
		} else {
			arg0.anInt4658 = -1;
			local40 = arg0.anInt4618 << 5;
			if (local40 != arg0.anInt4687) {
				arg0.anInt4664 = 0;
				local46 = local40 - arg0.anInt4644 & 0xFFFF;
				local94 = arg0.anInt4660 * arg0.anInt4660 / (local17.anInt5187 * 2);
				@Pc(316) int local316;
				if (arg0.anInt4660 > 0 && local94 <= local46 && local46 - local94 < 32768) {
					arg0.aBoolean354 = true;
					local316 = local17.anInt5194 * local17.anInt5194 / (local17.anInt5187 * 2);
					arg0.anInt4615 = local46 / 2;
					if (local316 > 32767) {
						local316 = 32767;
					}
					if (local316 < arg0.anInt4615) {
						arg0.anInt4615 = local46 - local316;
					}
				} else if (arg0.anInt4660 < 0 && 65536 - local46 >= local94 && 65536 - local46 - local94 < 32768) {
					arg0.anInt4615 = (65536 - local46) / 2;
					arg0.aBoolean354 = true;
					local316 = local17.anInt5194 * local17.anInt5194 / (local17.anInt5187 * 2);
					if (local316 > 32767) {
						local316 = 32767;
					}
					if (local316 < arg0.anInt4615) {
						arg0.anInt4615 = 65536 - local46 - local316;
					}
				} else {
					arg0.aBoolean354 = false;
				}
				arg0.anInt4687 = local40;
			}
			if (arg0.anInt4660 == 0) {
				local46 = arg0.anInt4687 - arg0.anInt4644 & 0xFFFF;
				if (local46 < local17.anInt5187) {
					arg0.anInt4644 = arg0.anInt4687;
				} else {
					local94 = local17.anInt5194 * local17.anInt5194 / (local17.anInt5187 * 2);
					if (local94 > 32767) {
						local94 = 32767;
					}
					arg0.anInt4664 = 0;
					arg0.aBoolean354 = true;
					if (local46 < 32768) {
						arg0.anInt4615 = local46 / 2;
						if (local94 < arg0.anInt4615) {
							arg0.anInt4615 = local46 - local94;
						}
						arg0.anInt4660 = local17.anInt5187;
					} else {
						arg0.anInt4660 = -local17.anInt5187;
						arg0.anInt4615 = (65536 - local46) / 2;
						if (arg0.anInt4615 > local94) {
							arg0.anInt4615 = 65536 - local46 - local94;
						}
					}
				}
			} else if (arg0.anInt4660 > 0) {
				if (arg0.anInt4615 <= arg0.anInt4664) {
					arg0.aBoolean354 = false;
				}
				if (!arg0.aBoolean354) {
					arg0.anInt4660 -= local17.anInt5187;
					if (arg0.anInt4660 < 0) {
						arg0.anInt4660 = 0;
					}
				} else if (local17.anInt5194 > arg0.anInt4660) {
					arg0.anInt4660 += local17.anInt5187;
				}
			} else {
				if (arg0.anInt4664 >= arg0.anInt4615) {
					arg0.aBoolean354 = false;
				}
				if (!arg0.aBoolean354) {
					arg0.anInt4660 += local17.anInt5187;
					if (arg0.anInt4660 > 0) {
						arg0.anInt4660 = 0;
					}
				} else if (arg0.anInt4660 > -local17.anInt5194) {
					arg0.anInt4660 -= local17.anInt5187;
				}
			}
			if (arg0.anInt4660 > 0) {
				arg0.anInt4664 += arg0.anInt4660;
			} else {
				arg0.anInt4664 -= arg0.anInt4660;
			}
			arg0.anInt4644 += arg0.anInt4660;
			arg0.anInt4644 &= 0xFFFF;
			arg0.anInt4681 = arg0.anInt4644 >> 5;
			if (arg0.anInt4660 < 0) {
				if (arg0.anInt4678 > 0) {
					if (arg0.aByteArray63[arg0.anInt4678 - 1] == 2) {
						if (local17.anInt5206 != -1) {
							arg0.anInt4658 = local17.anInt5206;
						} else if (local17.anInt5207 != -1) {
							arg0.anInt4658 = local17.anInt5207;
						}
					} else if (arg0.aByteArray63[arg0.anInt4678 - 1] == 0) {
						if (local17.anInt5188 != -1) {
							arg0.anInt4658 = local17.anInt5188;
						} else if (local17.anInt5221 != -1) {
							arg0.anInt4658 = local17.anInt5221;
						}
					}
				}
				if (arg0.anInt4658 == -1) {
					if (local17.anInt5186 != -1) {
						arg0.anInt4658 = local17.anInt5186;
					} else if (local17.anInt5196 != -1) {
						arg0.anInt4658 = local17.anInt5196;
					}
				}
			} else {
				if (arg0.anInt4678 > 0) {
					if (arg0.aByteArray63[arg0.anInt4678 - 1] == 2) {
						if (local17.anInt5203 != -1) {
							arg0.anInt4658 = local17.anInt5203;
						} else if (local17.anInt5207 != -1) {
							arg0.anInt4658 = local17.anInt5207;
						}
					} else if (arg0.aByteArray63[arg0.anInt4678 - 1] == 0) {
						if (local17.anInt5211 != -1) {
							arg0.anInt4658 = local17.anInt5211;
						} else if (local17.anInt5221 != -1) {
							arg0.anInt4658 = local17.anInt5221;
						}
					}
				}
				if (arg0.anInt4658 == -1) {
					if (local17.anInt5210 != -1) {
						arg0.anInt4658 = local17.anInt5210;
					} else if (local17.anInt5197 != -1) {
						arg0.anInt4658 = local17.anInt5197;
					}
				}
			}
			if (arg0.anInt4658 == -1) {
				arg0.anInt4658 = local17.anInt5224;
			}
		}
	}
}
