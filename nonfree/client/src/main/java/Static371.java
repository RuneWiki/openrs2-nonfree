import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Lclient!fs;")
	public static Class76 aClass76_85;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_125 = new Class83(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)I")
	public static int method4958() {
		@Pc(7) Class19 local7 = Static122.aClass19_16;
		@Pc(9) boolean local9 = false;
		if (Static177.anInt2973 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static455.method4241(null, 0, local15, 0, null);
			local9 = true;
		}
		@Pc(32) long local32 = Static282.method3962();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method4276();
		}
		@Pc(69) int local69 = (int) (Static282.method3962() - local32);
		local7.method4293(0, 100, 0, -16777216, 100);
		if (local9) {
			local7.method4267();
		}
		return local69;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method4959(@OriginalArg(0) Class16_Sub1_Sub5 arg0) {
		arg0.aBoolean560 = false;
		@Pc(19) Class138 local19;
		if (arg0.anInt6076 != -1) {
			local19 = Static182.aClass55_1.method1397(arg0.anInt6076);
			if (local19 == null || local19.anIntArray295 == null) {
				arg0.anInt6076 = -1;
				arg0.aBoolean562 = false;
			} else {
				label394: {
					arg0.anInt6065++;
					if (arg0.anInt6016 < local19.anIntArray295.length && local19.anIntArray296[arg0.anInt6016] < arg0.anInt6065) {
						arg0.anInt6065 = 1;
						arg0.anInt6036++;
						arg0.anInt6016++;
						Static15.method156(arg0.anInt6893, arg0.anInt6016, arg0.aByte82, arg0.anInt6892, local19, arg0 == Static1.aClass16_Sub1_Sub5_Sub1_1);
					}
					if (arg0.anInt6016 >= local19.anIntArray295.length) {
						arg0.anInt6016 = 0;
						arg0.anInt6065 = 0;
						if (arg0.aBoolean562) {
							arg0.anInt6076 = arg0.method4757().method3637();
							if (arg0.anInt6076 == -1) {
								arg0.aBoolean562 = false;
								break label394;
							}
							local19 = Static182.aClass55_1.method1397(arg0.anInt6076);
						}
						Static15.method156(arg0.anInt6893, arg0.anInt6016, arg0.aByte82, arg0.anInt6892, local19, Static1.aClass16_Sub1_Sub5_Sub1_1 == arg0);
					}
					arg0.anInt6036 = arg0.anInt6016 + 1;
					if (local19.anIntArray295.length <= arg0.anInt6036) {
						arg0.anInt6036 = 0;
					}
				}
			}
		}
		@Pc(183) int local183;
		@Pc(196) Class138 local196;
		@Pc(180) Class161 local180;
		if (arg0.anInt6029 != -1 && arg0.anInt6057 <= Static24.anInt5323) {
			local180 = Static352.aClass194_2.method4421(arg0.anInt6029);
			local183 = local180.anInt5002;
			if (local183 == -1) {
				arg0.anInt6029 = -1;
			} else {
				label396: {
					local196 = Static182.aClass55_1.method1397(local183);
					if (local180.aBoolean459) {
						if (local196.anInt4401 == 3) {
							if (arg0.anInt6087 > 0 && Static24.anInt5323 >= arg0.anInt6018 && Static24.anInt5323 > arg0.anInt6023) {
								arg0.anInt6029 = -1;
								break label396;
							}
						} else if (local196.anInt4401 == 1 && arg0.anInt6087 > 0 && Static24.anInt5323 >= arg0.anInt6018 && Static24.anInt5323 > arg0.anInt6023) {
							arg0.anInt6057 = Static24.anInt5323 + 1;
							break label396;
						}
					}
					if (local196 == null || local196.anIntArray295 == null) {
						arg0.anInt6029 = -1;
					} else {
						if (arg0.anInt6027 < 0) {
							arg0.anInt6027 = 0;
							Static15.method156(arg0.anInt6893, 0, arg0.aByte82, arg0.anInt6892, local196, Static1.aClass16_Sub1_Sub5_Sub1_1 == arg0);
						}
						arg0.anInt6033++;
						if (local196.anIntArray295.length > arg0.anInt6027 && arg0.anInt6033 > local196.anIntArray296[arg0.anInt6027]) {
							arg0.anInt6027++;
							arg0.anInt6033 = 1;
							Static15.method156(arg0.anInt6893, arg0.anInt6027, arg0.aByte82, arg0.anInt6892, local196, arg0 == Static1.aClass16_Sub1_Sub5_Sub1_1);
						}
						if (arg0.anInt6027 >= local196.anIntArray295.length) {
							if (local180.aBoolean459) {
								arg0.anInt6027 -= local196.anInt4405;
								arg0.anInt6050++;
								if (local196.anInt4412 <= arg0.anInt6050) {
									arg0.anInt6029 = -1;
								} else if (arg0.anInt6027 >= 0 && arg0.anInt6027 < local196.anIntArray295.length) {
									Static15.method156(arg0.anInt6893, arg0.anInt6027, arg0.aByte82, arg0.anInt6892, local196, Static1.aClass16_Sub1_Sub5_Sub1_1 == arg0);
								} else {
									arg0.anInt6029 = -1;
								}
							} else {
								arg0.anInt6029 = -1;
							}
						}
						arg0.anInt6083 = arg0.anInt6027 + 1;
						if (arg0.anInt6083 >= local196.anIntArray295.length) {
							if (local180.aBoolean459) {
								arg0.anInt6083 -= local196.anInt4405;
								if (local196.anInt4412 <= arg0.anInt6050 + 1) {
									arg0.anInt6083 = -1;
								} else if (arg0.anInt6083 < 0 || local196.anIntArray295.length <= arg0.anInt6083) {
									arg0.anInt6083 = -1;
								}
							} else {
								arg0.anInt6083 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6045 != -1 && arg0.anInt6066 <= Static24.anInt5323) {
			local180 = Static352.aClass194_2.method4421(arg0.anInt6045);
			local183 = local180.anInt5002;
			if (local183 == -1) {
				arg0.anInt6045 = -1;
			} else {
				label399: {
					local196 = Static182.aClass55_1.method1397(local183);
					if (local180.aBoolean459) {
						if (local196.anInt4401 == 3) {
							if (arg0.anInt6087 > 0 && Static24.anInt5323 >= arg0.anInt6018 && Static24.anInt5323 > arg0.anInt6023) {
								arg0.anInt6045 = -1;
								break label399;
							}
						} else if (local196.anInt4401 == 1 && arg0.anInt6087 > 0 && Static24.anInt5323 >= arg0.anInt6018 && arg0.anInt6023 < Static24.anInt5323) {
							arg0.anInt6066 = Static24.anInt5323 + 1;
							break label399;
						}
					}
					if (local196 == null || local196.anIntArray295 == null) {
						arg0.anInt6045 = -1;
					} else {
						if (arg0.anInt6022 < 0) {
							arg0.anInt6022 = 0;
							Static15.method156(arg0.anInt6893, 0, arg0.aByte82, arg0.anInt6892, local196, Static1.aClass16_Sub1_Sub5_Sub1_1 == arg0);
						}
						arg0.anInt6062++;
						if (arg0.anInt6022 < local196.anIntArray295.length && arg0.anInt6062 > local196.anIntArray296[arg0.anInt6022]) {
							arg0.anInt6022++;
							arg0.anInt6062 = 1;
							Static15.method156(arg0.anInt6893, arg0.anInt6022, arg0.aByte82, arg0.anInt6892, local196, arg0 == Static1.aClass16_Sub1_Sub5_Sub1_1);
						}
						if (arg0.anInt6022 >= local196.anIntArray295.length) {
							if (local180.aBoolean459) {
								arg0.anInt6022 -= local196.anInt4405;
								arg0.anInt6031++;
								if (arg0.anInt6031 >= local196.anInt4412) {
									arg0.anInt6045 = -1;
								} else if (arg0.anInt6022 >= 0 && local196.anIntArray295.length > arg0.anInt6022) {
									Static15.method156(arg0.anInt6893, arg0.anInt6022, arg0.aByte82, arg0.anInt6892, local196, arg0 == Static1.aClass16_Sub1_Sub5_Sub1_1);
								} else {
									arg0.anInt6045 = -1;
								}
							} else {
								arg0.anInt6045 = -1;
							}
						}
						arg0.anInt6069 = arg0.anInt6022 + 1;
						if (local196.anIntArray295.length <= arg0.anInt6069) {
							if (local180.aBoolean459) {
								arg0.anInt6069 -= local196.anInt4405;
								if (arg0.anInt6031 + 1 >= local196.anInt4412) {
									arg0.anInt6069 = -1;
								} else if (arg0.anInt6069 < 0 || local196.anIntArray295.length <= arg0.anInt6069) {
									arg0.anInt6069 = -1;
								}
							} else {
								arg0.anInt6069 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6021 != -1 && arg0.anInt6046 <= 1) {
			local19 = Static182.aClass55_1.method1397(arg0.anInt6021);
			if (local19.anInt4401 == 3) {
				if (arg0.anInt6087 > 0 && arg0.anInt6018 <= Static24.anInt5323 && Static24.anInt5323 > arg0.anInt6023) {
					arg0.anInt6021 = -1;
				}
			} else if (local19.anInt4401 == 1 && arg0.anInt6087 > 0 && arg0.anInt6018 <= Static24.anInt5323 && Static24.anInt5323 > arg0.anInt6023) {
				arg0.anInt6046 = 2;
			}
		}
		if (arg0.anInt6021 != -1 && arg0.anInt6046 == 0) {
			local19 = Static182.aClass55_1.method1397(arg0.anInt6021);
			if (local19 == null || local19.anIntArray295 == null) {
				arg0.anInt6021 = -1;
			} else {
				arg0.anInt6073++;
				if (arg0.anInt6060 < local19.anIntArray295.length && arg0.anInt6073 > local19.anIntArray296[arg0.anInt6060]) {
					arg0.anInt6073 = 1;
					arg0.anInt6060++;
					Static15.method156(arg0.anInt6893, arg0.anInt6060, arg0.aByte82, arg0.anInt6892, local19, arg0 == Static1.aClass16_Sub1_Sub5_Sub1_1);
				}
				if (arg0.anInt6060 >= local19.anIntArray295.length) {
					arg0.anInt6060 -= local19.anInt4405;
					arg0.anInt6012++;
					if (local19.anInt4412 <= arg0.anInt6012) {
						arg0.anInt6021 = -1;
					} else if (arg0.anInt6060 >= 0 && arg0.anInt6060 < local19.anIntArray295.length) {
						Static15.method156(arg0.anInt6893, arg0.anInt6060, arg0.aByte82, arg0.anInt6892, local19, arg0 == Static1.aClass16_Sub1_Sub5_Sub1_1);
					} else {
						arg0.anInt6021 = -1;
					}
				}
				arg0.anInt6058 = arg0.anInt6060 + 1;
				if (arg0.anInt6058 >= local19.anIntArray295.length) {
					arg0.anInt6058 -= local19.anInt4405;
					if (arg0.anInt6012 + 1 >= local19.anInt4412) {
						arg0.anInt6058 = -1;
					} else if (arg0.anInt6058 < 0 || arg0.anInt6058 >= local19.anIntArray295.length) {
						arg0.anInt6058 = -1;
					}
				}
				arg0.aBoolean560 = local19.aBoolean407;
			}
		}
		if (arg0.anInt6046 > 0) {
			arg0.anInt6046--;
		}
		for (@Pc(1066) int local1066 = 0; local1066 < arg0.aClass165Array3.length; local1066++) {
			@Pc(1073) Class165 local1073 = arg0.aClass165Array3[local1066];
			if (local1073 != null) {
				if (local1073.anInt5141 > 0) {
					local1073.anInt5141--;
				} else {
					local196 = Static182.aClass55_1.method1397(local1073.anInt5139);
					if (local196 == null || local196.anIntArray295 == null) {
						arg0.aClass165Array3[local1066] = null;
					} else {
						local1073.anInt5142++;
						if (local196.anIntArray295.length > local1073.anInt5138 && local196.anIntArray296[local1073.anInt5138] < local1073.anInt5142) {
							local1073.anInt5138++;
							local1073.anInt5142 = 1;
							Static15.method156(arg0.anInt6893, local1073.anInt5138, arg0.aByte82, arg0.anInt6892, local196, Static1.aClass16_Sub1_Sub5_Sub1_1 == arg0);
						}
						if (local1073.anInt5138 >= local196.anIntArray295.length) {
							local1073.anInt5138 -= local196.anInt4405;
							local1073.anInt5143++;
							if (local1073.anInt5143 >= local196.anInt4412) {
								arg0.aClass165Array3[local1066] = null;
							} else if (local1073.anInt5138 >= 0 && local196.anIntArray295.length > local1073.anInt5138) {
								Static15.method156(arg0.anInt6893, local1073.anInt5138, arg0.aByte82, arg0.anInt6892, local196, Static1.aClass16_Sub1_Sub5_Sub1_1 == arg0);
							} else {
								arg0.aClass165Array3[local1066] = null;
							}
						}
						local1073.anInt5140 = local1073.anInt5138 + 1;
						if (local196.anIntArray295.length <= local1073.anInt5140) {
							local1073.anInt5140 -= local196.anInt4405;
							if (local1073.anInt5143 + 1 >= local196.anInt4412) {
								local1073.anInt5140 = -1;
							} else if (local1073.anInt5140 < 0 || local196.anIntArray295.length <= local1073.anInt5140) {
								local1073.anInt5140 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method4962(@OriginalArg(2) String arg0) {
		return Static437.method4041(16, arg0);
	}
}
