import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	public static int anInt4272;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_58 = new Class67("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_51 = new Class158(50, -1);

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lclient!hi;")
	public static final Class122[] aClass122Array1 = new Class122[14];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg5 < 0 || Static118.anInt2527 - 1 <= arg6 || arg5 >= Static549.anInt9482 - 1) {
			return;
		}
		if (Static279.aClass290ArrayArrayArray7 == null) {
			return;
		}
		@Pc(37) Interface15 local37;
		if (arg4 == 0) {
			local37 = (Interface15) Static542.method7740(arg0, arg6, arg5);
			@Pc(43) Interface15 local43 = (Interface15) Static92.method1829(arg0, arg6, arg5);
			if (local37 != null && arg3 != 2) {
				if (local37 instanceof Class6_Sub2_Sub3) {
					((Class6_Sub2_Sub3) local37).aClass281_4.method6971(arg1);
				} else {
					Static185.method3504(local37.method7758(), arg5, arg4, arg2, arg0, arg6, arg3, arg1);
				}
			}
			if (local43 != null) {
				if (local43 instanceof Class6_Sub2_Sub3) {
					((Class6_Sub2_Sub3) local43).aClass281_4.method6971(arg1);
				} else {
					Static185.method3504(local43.method7758(), arg5, arg4, arg2, arg0, arg6, arg3, arg1);
				}
			}
		} else if (arg4 == 1) {
			local37 = (Interface15) Static183.method4959(arg0, arg6, arg5);
			if (local37 != null) {
				if (local37 instanceof Class6_Sub4_Sub3) {
					((Class6_Sub4_Sub3) local37).aClass281_3.method6971(arg1);
				} else {
					@Pc(219) int local219 = local37.method7758();
					if (arg3 == 4 || arg3 == 5) {
						Static185.method3504(local219, arg5, arg4, arg2, arg0, arg6, 4, arg1);
					} else if (arg3 == 6) {
						Static185.method3504(local219, arg5, arg4, arg2 + 4, arg0, arg6, 4, arg1);
					} else if (arg3 == 7) {
						Static185.method3504(local219, arg5, arg4, (arg2 + 2 & 0x3) + 4, arg0, arg6, 4, arg1);
					} else if (arg3 == 8) {
						Static185.method3504(local219, arg5, arg4, arg2 + 4, arg0, arg6, 4, arg1);
						Static185.method3504(local219, arg5, arg4, (arg2 + 2 & 0x3) + 4, arg0, arg6, 4, arg1);
					}
				}
			}
		} else if (arg4 == 2) {
			local37 = (Interface15) Static420.method6482(arg0, arg6, arg5, qn.class);
			if (local37 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local37 instanceof Class6_Sub1_Sub6) {
					((Class6_Sub1_Sub6) local37).aClass281_2.method6971(arg1);
				} else {
					Static185.method3504(local37.method7758(), arg5, arg4, arg2, arg0, arg6, arg3, arg1);
				}
			}
		} else if (arg4 == 3) {
			local37 = (Interface15) Static72.method1464(arg0, arg6, arg5);
			if (local37 != null) {
				if (local37 instanceof Class6_Sub3_Sub3) {
					((Class6_Sub3_Sub3) local37).aClass281_1.method6971(arg1);
				} else {
					Static185.method3504(local37.method7758(), arg5, arg4, arg2, arg0, arg6, arg3, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!qb;B)V")
	public static void method3527(@OriginalArg(0) Class6_Sub1_Sub2 arg0) {
		arg0.anInt8531 = 0;
		@Pc(19) Class122 local19;
		if (arg0.anInt8534 != -1) {
			local19 = Static46.aClass247_1.method6029(arg0.anInt8534);
			if (local19 == null || local19.anIntArray396 == null) {
				arg0.anInt8534 = -1;
				arg0.aBoolean630 = false;
			} else {
				label394: {
					arg0.anInt8540++;
					if (arg0.anInt8556 < local19.anIntArray396.length && arg0.anInt8540 > local19.anIntArray394[arg0.anInt8556]) {
						arg0.anInt8551++;
						arg0.anInt8556++;
						arg0.anInt8540 = 1;
						Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local19, arg0.anInt8556);
					}
					if (local19.anIntArray396.length <= arg0.anInt8556) {
						arg0.anInt8556 = 0;
						arg0.anInt8540 = 0;
						if (arg0.aBoolean630) {
							arg0.anInt8534 = arg0.method7088().method2119();
							if (arg0.anInt8534 == -1) {
								arg0.aBoolean630 = false;
								break label394;
							}
							local19 = Static46.aClass247_1.method6029(arg0.anInt8534);
						}
						Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local19, arg0.anInt8556);
					}
					arg0.anInt8551 = arg0.anInt8556 + 1;
					if (local19.anIntArray396.length <= arg0.anInt8551) {
						arg0.anInt8551 = 0;
					}
				}
			}
		}
		@Pc(187) int local187;
		@Pc(201) Class122 local201;
		@Pc(184) Class186 local184;
		if (arg0.anInt8565 != -1 && arg0.anInt8537 <= Static223.anInt4829) {
			local184 = Static17.aClass231_2.method5905(arg0.anInt8565);
			local187 = local184.anInt5838;
			if (local187 == -1) {
				arg0.anInt8565 = -1;
			} else {
				label396: {
					local201 = Static46.aClass247_1.method6029(local187);
					if (local184.aBoolean375) {
						if (local201.anInt4153 == 3) {
							if (arg0.anInt8600 > 0 && arg0.anInt8555 <= Static223.anInt4829 && Static223.anInt4829 > arg0.anInt8589) {
								arg0.anInt8565 = -1;
								break label396;
							}
						} else if (local201.anInt4153 == 1 && arg0.anInt8600 > 0 && arg0.anInt8555 <= Static223.anInt4829 && Static223.anInt4829 > arg0.anInt8589) {
							arg0.anInt8537 = Static223.anInt4829 + 1;
							break label396;
						}
					}
					if (local201 == null || local201.anIntArray396 == null) {
						arg0.anInt8565 = -1;
					} else {
						if (arg0.anInt8562 < 0) {
							arg0.anInt8562 = 0;
							Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, 0);
						}
						arg0.anInt8549++;
						if (arg0.anInt8562 < local201.anIntArray396.length && local201.anIntArray394[arg0.anInt8562] < arg0.anInt8549) {
							arg0.anInt8562++;
							arg0.anInt8549 = 1;
							Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, arg0.anInt8562);
						}
						if (arg0.anInt8562 >= local201.anIntArray396.length) {
							if (local184.aBoolean375) {
								arg0.anInt8562 -= local201.anInt4152;
								arg0.anInt8568++;
								if (local201.anInt4161 <= arg0.anInt8568) {
									arg0.anInt8565 = -1;
								} else if (arg0.anInt8562 >= 0 && arg0.anInt8562 < local201.anIntArray396.length) {
									Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, arg0.anInt8562);
								} else {
									arg0.anInt8565 = -1;
								}
							} else {
								arg0.anInt8565 = -1;
							}
						}
						arg0.anInt8581 = arg0.anInt8562 + 1;
						if (arg0.anInt8581 >= local201.anIntArray396.length) {
							if (local184.aBoolean375) {
								arg0.anInt8581 -= local201.anInt4152;
								if (local201.anInt4161 <= arg0.anInt8568 + 1) {
									arg0.anInt8581 = -1;
								} else if (arg0.anInt8581 < 0 || arg0.anInt8581 >= local201.anIntArray396.length) {
									arg0.anInt8581 = -1;
								}
							} else {
								arg0.anInt8581 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8526 != -1 && arg0.anInt8569 <= Static223.anInt4829) {
			local184 = Static17.aClass231_2.method5905(arg0.anInt8526);
			local187 = local184.anInt5838;
			if (local187 == -1) {
				arg0.anInt8526 = -1;
			} else {
				label399: {
					local201 = Static46.aClass247_1.method6029(local187);
					if (local184.aBoolean375) {
						if (local201.anInt4153 == 3) {
							if (arg0.anInt8600 > 0 && Static223.anInt4829 >= arg0.anInt8555 && arg0.anInt8589 < Static223.anInt4829) {
								arg0.anInt8526 = -1;
								break label399;
							}
						} else if (local201.anInt4153 == 1 && arg0.anInt8600 > 0 && arg0.anInt8555 <= Static223.anInt4829 && Static223.anInt4829 > arg0.anInt8589) {
							arg0.anInt8569 = Static223.anInt4829 + 1;
							break label399;
						}
					}
					if (local201 == null || local201.anIntArray396 == null) {
						arg0.anInt8526 = -1;
					} else {
						if (arg0.anInt8543 < 0) {
							arg0.anInt8543 = 0;
							Static448.method6790(arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, 0);
						}
						arg0.anInt8586++;
						if (local201.anIntArray396.length > arg0.anInt8543 && arg0.anInt8586 > local201.anIntArray394[arg0.anInt8543]) {
							arg0.anInt8586 = 1;
							arg0.anInt8543++;
							Static448.method6790(arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, arg0.anInt8543);
						}
						if (local201.anIntArray396.length <= arg0.anInt8543) {
							if (local184.aBoolean375) {
								arg0.anInt8543 -= local201.anInt4152;
								arg0.anInt8552++;
								if (local201.anInt4161 <= arg0.anInt8552) {
									arg0.anInt8526 = -1;
								} else if (arg0.anInt8543 >= 0 && arg0.anInt8543 < local201.anIntArray396.length) {
									Static448.method6790(arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, arg0.anInt8543);
								} else {
									arg0.anInt8526 = -1;
								}
							} else {
								arg0.anInt8526 = -1;
							}
						}
						arg0.anInt8529 = arg0.anInt8543 + 1;
						if (local201.anIntArray396.length <= arg0.anInt8529) {
							if (local184.aBoolean375) {
								arg0.anInt8529 -= local201.anInt4152;
								if (arg0.anInt8552 + 1 >= local201.anInt4161) {
									arg0.anInt8529 = -1;
								} else if (arg0.anInt8529 < 0 || arg0.anInt8529 >= local201.anIntArray396.length) {
									arg0.anInt8529 = -1;
								}
							} else {
								arg0.anInt8529 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8592 != -1 && arg0.anInt8575 <= 1) {
			local19 = Static46.aClass247_1.method6029(arg0.anInt8592);
			if (local19.anInt4153 == 3) {
				if (arg0.anInt8600 > 0 && Static223.anInt4829 >= arg0.anInt8555 && arg0.anInt8589 < Static223.anInt4829) {
					arg0.anInt8592 = -1;
				}
			} else if (local19.anInt4153 == 1 && arg0.anInt8600 > 0 && Static223.anInt4829 >= arg0.anInt8555 && arg0.anInt8589 < Static223.anInt4829) {
				arg0.anInt8575 = 2;
			}
		}
		if (arg0.anInt8592 != -1 && arg0.anInt8575 == 0) {
			local19 = Static46.aClass247_1.method6029(arg0.anInt8592);
			if (local19 == null || local19.anIntArray396 == null) {
				arg0.anInt8592 = -1;
			} else {
				arg0.anInt8580++;
				if (arg0.anInt8584 < local19.anIntArray396.length && local19.anIntArray394[arg0.anInt8584] < arg0.anInt8580) {
					arg0.anInt8584++;
					arg0.anInt8580 = 1;
					Static448.method6790(arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local19, arg0.anInt8584);
				}
				if (arg0.anInt8584 >= local19.anIntArray396.length) {
					arg0.anInt8584 -= local19.anInt4152;
					arg0.anInt8583++;
					if (local19.anInt4161 <= arg0.anInt8583) {
						arg0.anInt8592 = -1;
					} else if (arg0.anInt8584 >= 0 && arg0.anInt8584 < local19.anIntArray396.length) {
						Static448.method6790(arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local19, arg0.anInt8584);
					} else {
						arg0.anInt8592 = -1;
					}
				}
				arg0.anInt8579 = arg0.anInt8584 + 1;
				if (local19.anIntArray396.length <= arg0.anInt8579) {
					arg0.anInt8579 -= local19.anInt4152;
					if (local19.anInt4161 <= arg0.anInt8583 + 1) {
						arg0.anInt8579 = -1;
					} else if (arg0.anInt8579 < 0 || local19.anIntArray396.length <= arg0.anInt8579) {
						arg0.anInt8579 = -1;
					}
				}
				arg0.anInt8531 = local19.anInt4143;
			}
		}
		if (arg0.anInt8575 > 0) {
			arg0.anInt8575--;
		}
		for (@Pc(1054) int local1054 = 0; local1054 < arg0.aClass152Array3.length; local1054++) {
			@Pc(1061) Class152 local1061 = arg0.aClass152Array3[local1054];
			if (local1061 != null) {
				if (local1061.anInt4902 > 0) {
					local1061.anInt4902--;
				} else {
					local201 = Static46.aClass247_1.method6029(local1061.anInt4899);
					if (local201 == null || local201.anIntArray396 == null) {
						arg0.aClass152Array3[local1054] = null;
					} else {
						local1061.anInt4901++;
						if (local201.anIntArray396.length > local1061.anInt4900 && local1061.anInt4901 > local201.anIntArray394[local1061.anInt4900]) {
							local1061.anInt4900++;
							local1061.anInt4901 = 1;
							Static448.method6790(arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, local1061.anInt4900);
						}
						if (local1061.anInt4900 >= local201.anIntArray396.length) {
							local1061.anInt4898++;
							local1061.anInt4900 -= local201.anInt4152;
							if (local201.anInt4161 <= local1061.anInt4898) {
								arg0.aClass152Array3[local1054] = null;
							} else if (local1061.anInt4900 >= 0 && local1061.anInt4900 < local201.anIntArray396.length) {
								Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local201, local1061.anInt4900);
							} else {
								arg0.aClass152Array3[local1054] = null;
							}
						}
						local1061.anInt4897 = local1061.anInt4900 + 1;
						if (local1061.anInt4897 >= local201.anIntArray396.length) {
							local1061.anInt4897 -= local201.anInt4152;
							if (local201.anInt4161 <= local1061.anInt4898 + 1) {
								local1061.anInt4897 = -1;
							} else if (local1061.anInt4897 < 0 || local1061.anInt4897 >= local201.anIntArray396.length) {
								local1061.anInt4897 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([BIILclient!gf;)Lclient!le;")
	public static Class175 method3528(@OriginalArg(0) byte[] arg0, @OriginalArg(3) Class5_Sub3_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static262.anIntArray469, 0);
		if (Static262.anIntArray469[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class175(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
