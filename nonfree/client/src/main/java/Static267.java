import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
	public static int anInt5199;

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "Lclient!km;")
	public static Class91 aClass91_192;

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray24;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	public static int anInt5202 = 0;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
	public static int anInt5214 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBIIII)V")
	public static void method4056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = local17 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(41) int local41 = local25 + local13 * (1 - local29);
		@Pc(50) int local50 = local17 - local21 * (local29 - 1);
		@Pc(54) int local54 = local13 << 2;
		@Pc(58) int local58 = local17 << 2;
		@Pc(66) int local66 = local21 * ((arg1 << 1) - 3);
		@Pc(74) int local74 = local25 * 3;
		@Pc(80) int local80 = local58;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (arg2 >= Static297.anInt5619 && Static49.anInt1129 >= arg2) {
			local95 = Static23.method431(arg3 + arg0, Static68.anInt1451, Static224.anInt4436);
			local104 = Static23.method431(arg3 - arg0, Static68.anInt1451, Static224.anInt4436);
			Static126.method1523(Static22.anIntArrayArray3[arg2], local95, arg4, local104);
		}
		@Pc(118) int local118 = local54 * (arg1 - 1);
		while (local9 > 0) {
			local9--;
			if (local41 < 0) {
				while (local41 < 0) {
					local41 += local74;
					local7++;
					local50 += local80;
					local80 += local58;
					local74 += local58;
				}
			}
			local95 = arg2 - local9;
			if (local50 < 0) {
				local7++;
				local41 += local74;
				local50 += local80;
				local80 += local58;
				local74 += local58;
			}
			local50 += -local66;
			local41 += -local118;
			local118 -= local54;
			local66 -= local54;
			local104 = arg2 + local9;
			if (local104 >= Static297.anInt5619 && local95 <= Static49.anInt1129) {
				@Pc(222) int local222 = Static23.method431(local7 + arg3, Static68.anInt1451, Static224.anInt4436);
				@Pc(231) int local231 = Static23.method431(arg3 - local7, Static68.anInt1451, Static224.anInt4436);
				if (local95 >= Static297.anInt5619) {
					Static126.method1523(Static22.anIntArrayArray3[local95], local222, arg4, local231);
				}
				if (local104 <= Static49.anInt1129) {
					Static126.method1523(Static22.anIntArrayArray3[local104], local222, arg4, local231);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method4057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		@Pc(17) long local17 = Static108.method1986(arg3, arg2 + 0, arg4);
		@Pc(35) int local35;
		@Pc(42) int local42;
		@Pc(49) int local49;
		@Pc(53) Class181 local53;
		@Pc(72) int local72;
		@Pc(83) int[] local83;
		@Pc(98) int local98;
		if (local17 != 0L) {
			local35 = (int) local17 >> 20 & 0x3;
			local42 = (int) local17 >> 14 & 0x1F;
			local49 = (int) (local17 >>> 32) & Integer.MAX_VALUE;
			local53 = Static183.method3511(local49);
			if (local53.anInt5539 == -1) {
				local72 = arg1;
				if (local17 > 0L) {
					local72 = arg0;
				}
				local83 = Static50.anIntArray107;
				local98 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
				if (local42 == 0 || local42 == 2) {
					if (local35 == 0) {
						local83[local98] = local72;
						local83[local98 + 512] = local72;
						local83[local98 + 1024] = local72;
						local83[local98 + 1536] = local72;
					} else if (local35 == 1) {
						local83[local98] = local72;
						local83[local98 + 1] = local72;
						local83[local98 + 2] = local72;
						local83[local98 + 3] = local72;
					} else if (local35 == 2) {
						local83[local98 + 3] = local72;
						local83[local98 + 515] = local72;
						local83[local98 + 3 + 1024] = local72;
						local83[local98 + 1539] = local72;
					} else if (local35 == 3) {
						local83[local98 + 1536] = local72;
						local83[local98 + 1536 + 1] = local72;
						local83[local98 + 2 + 1536] = local72;
						local83[local98 + 1536 + 3] = local72;
					}
				}
				if (local42 == 3) {
					if (local35 == 0) {
						local83[local98] = local72;
					} else if (local35 == 1) {
						local83[local98 + 3] = local72;
					} else if (local35 == 2) {
						local83[local98 + 3 + 1536] = local72;
					} else if (local35 == 3) {
						local83[local98 + 1536] = local72;
					}
				}
				if (local42 == 2) {
					if (local35 == 3) {
						local83[local98] = local72;
						local83[local98 + 512] = local72;
						local83[local98 + 1024] = local72;
						local83[local98 + 1536] = local72;
					} else if (local35 == 0) {
						local83[local98] = local72;
						local83[local98 + 1] = local72;
						local83[local98 + 2] = local72;
						local83[local98 + 3] = local72;
					} else if (local35 == 1) {
						local83[local98 + 3] = local72;
						local83[local98 + 3 + 512] = local72;
						local83[local98 + 1024 + 3] = local72;
						local83[local98 + 1536 + 3] = local72;
					} else if (local35 == 2) {
						local83[local98 + 1536] = local72;
						local83[local98 + 1 + 1536] = local72;
						local83[local98 + 1538] = local72;
						local83[local98 + 1536 + 3] = local72;
					}
				}
			} else if (!Static134.method2285(arg4, local53, local35, arg2)) {
				return false;
			}
		}
		local17 = Static47.method929(arg3, arg2 + 0, arg4);
		if (local17 != 0L) {
			local35 = (int) local17 >> 20 & 0x3;
			local42 = (int) local17 >> 14 & 0x1F;
			local49 = (int) (local17 >>> 32) & Integer.MAX_VALUE;
			local53 = Static183.method3511(local49);
			if (local53.anInt5539 == -1) {
				if (local42 == 9) {
					local83 = Static50.anIntArray107;
					local98 = (52736 - arg4 * 512) * 4 + arg2 * 4 + 24624;
					local72 = 15658734;
					if (local17 > 0L) {
						local72 = 15597568;
					}
					if (local35 == 0 || local35 == 2) {
						local83[local98 + 1536] = local72;
						local83[local98 + 1 + 1024] = local72;
						local83[local98 + 514] = local72;
						local83[local98 + 3] = local72;
					} else {
						local83[local98] = local72;
						local83[local98 + 512 + 1] = local72;
						local83[local98 + 1024 + 2] = local72;
						local83[local98 + 1536 + 3] = local72;
					}
				}
			} else if (!Static134.method2285(arg4, local53, local35, arg2)) {
				return false;
			}
		}
		local17 = Static151.method4444(arg3, arg2 + 0, arg4);
		if (local17 != 0L) {
			local42 = (int) (local17 >>> 32) & Integer.MAX_VALUE;
			@Pc(588) Class181 local588 = Static183.method3511(local42);
			local35 = (int) local17 >> 20 & 0x3;
			if (local588.anInt5539 != -1 && !Static134.method2285(arg4, local588, local35, arg2)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!bo;Z)V")
	public static void method4058(@OriginalArg(0) Class14_Sub2 arg0) {
		arg0.aBoolean356 = false;
		@Pc(23) Class125 local23;
		if (arg0.anInt4658 != -1) {
			local23 = Static90.method1591(arg0.anInt4658);
			if (local23 == null || local23.anIntArray357 == null) {
				arg0.anInt4658 = -1;
			} else {
				arg0.anInt4632++;
				if (arg0.anInt4638 < local23.anIntArray357.length && arg0.anInt4632 > local23.anIntArray356[arg0.anInt4638]) {
					arg0.anInt4632 = 1;
					arg0.anInt4663++;
					arg0.anInt4638++;
					Static77.method1354(arg0.anInt4638, Static197.aClass14_Sub2_Sub1_2 == arg0, arg0.anInt4680, local23, arg0.anInt4630);
				}
				if (arg0.anInt4638 >= local23.anIntArray357.length) {
					arg0.anInt4632 = 0;
					arg0.anInt4638 = 0;
					Static77.method1354(arg0.anInt4638, Static197.aClass14_Sub2_Sub1_2 == arg0, arg0.anInt4680, local23, arg0.anInt4630);
				}
				arg0.anInt4663 = arg0.anInt4638 + 1;
				if (arg0.anInt4663 >= local23.anIntArray357.length) {
					arg0.anInt4663 = 0;
				}
			}
		}
		@Pc(163) Class125 local163;
		if (arg0.anInt4656 != -1 && Static237.anInt4710 >= arg0.anInt4652) {
			@Pc(146) Class157 local146 = Static242.method3711(arg0.anInt4656);
			@Pc(149) int local149 = local146.anInt4951;
			if (local149 == -1) {
				arg0.anInt4656 = -1;
			} else {
				label302: {
					local163 = Static90.method1591(local149);
					if (local146.aBoolean375) {
						if (local163.anInt3964 == 3) {
							if (arg0.anInt4665 > 0 && Static237.anInt4710 >= arg0.anInt4692 && arg0.anInt4647 < Static237.anInt4710) {
								arg0.anInt4656 = -1;
								break label302;
							}
						} else if (local163.anInt3964 == 1 && arg0.anInt4665 > 0 && Static237.anInt4710 >= arg0.anInt4692 && arg0.anInt4647 < Static237.anInt4710) {
							arg0.anInt4652 = Static237.anInt4710 + 1;
							break label302;
						}
					}
					if (local163 == null || local163.anIntArray357 == null) {
						arg0.anInt4656 = -1;
					} else {
						if (arg0.anInt4673 < 0) {
							arg0.anInt4673 = 0;
							Static77.method1354(0, arg0 == Static197.aClass14_Sub2_Sub1_2, arg0.anInt4680, local163, arg0.anInt4630);
						}
						arg0.anInt4657++;
						if (local163.anIntArray357.length > arg0.anInt4673 && local163.anIntArray356[arg0.anInt4673] < arg0.anInt4657) {
							arg0.anInt4673++;
							arg0.anInt4657 = 1;
							Static77.method1354(arg0.anInt4673, arg0 == Static197.aClass14_Sub2_Sub1_2, arg0.anInt4680, local163, arg0.anInt4630);
						}
						if (local163.anIntArray357.length <= arg0.anInt4673) {
							if (local146.aBoolean375) {
								arg0.anInt4673 -= local163.anInt3946;
								arg0.anInt4661++;
								if (local163.anInt3953 <= arg0.anInt4661) {
									arg0.anInt4656 = -1;
								} else if (arg0.anInt4673 >= 0 && local163.anIntArray357.length > arg0.anInt4673) {
									Static77.method1354(arg0.anInt4673, arg0 == Static197.aClass14_Sub2_Sub1_2, arg0.anInt4680, local163, arg0.anInt4630);
								} else {
									arg0.anInt4656 = -1;
								}
							} else {
								arg0.anInt4656 = -1;
							}
						}
						arg0.anInt4655 = arg0.anInt4673 + 1;
						if (arg0.anInt4655 >= local163.anIntArray357.length) {
							if (local146.aBoolean375) {
								arg0.anInt4655 -= local163.anInt3946;
								if (arg0.anInt4661 + 1 >= local163.anInt3953) {
									arg0.anInt4655 = -1;
								} else if (arg0.anInt4655 < 0 || local163.anIntArray357.length <= arg0.anInt4655) {
									arg0.anInt4655 = -1;
								}
							} else {
								arg0.anInt4655 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4620 != -1 && arg0.anInt4695 <= 1) {
			local23 = Static90.method1591(arg0.anInt4620);
			if (local23.anInt3964 == 3) {
				if (arg0.anInt4665 > 0 && Static237.anInt4710 >= arg0.anInt4692 && Static237.anInt4710 > arg0.anInt4647) {
					arg0.anInt4620 = -1;
				}
			} else if (local23.anInt3964 == 1 && arg0.anInt4665 > 0 && Static237.anInt4710 >= arg0.anInt4692 && Static237.anInt4710 > arg0.anInt4647) {
				arg0.anInt4695 = 1;
			}
		}
		if (arg0.anInt4620 != -1 && arg0.anInt4695 == 0) {
			local23 = Static90.method1591(arg0.anInt4620);
			if (local23 == null || local23.anIntArray357 == null) {
				arg0.anInt4620 = -1;
			} else {
				arg0.anInt4637++;
				if (local23.anIntArray357.length > arg0.anInt4633 && arg0.anInt4637 > local23.anIntArray356[arg0.anInt4633]) {
					arg0.anInt4633++;
					arg0.anInt4637 = 1;
					Static77.method1354(arg0.anInt4633, Static197.aClass14_Sub2_Sub1_2 == arg0, arg0.anInt4680, local23, arg0.anInt4630);
				}
				if (local23.anIntArray357.length <= arg0.anInt4633) {
					arg0.anInt4633 -= local23.anInt3946;
					arg0.anInt4693++;
					if (local23.anInt3953 <= arg0.anInt4693) {
						arg0.anInt4620 = -1;
					} else if (arg0.anInt4633 >= 0 && arg0.anInt4633 < local23.anIntArray357.length) {
						Static77.method1354(arg0.anInt4633, arg0 == Static197.aClass14_Sub2_Sub1_2, arg0.anInt4680, local23, arg0.anInt4630);
					} else {
						arg0.anInt4620 = -1;
					}
				}
				arg0.anInt4662 = arg0.anInt4633 + 1;
				if (arg0.anInt4662 >= local23.anIntArray357.length) {
					arg0.anInt4662 -= local23.anInt3946;
					if (local23.anInt3953 <= arg0.anInt4693 + 1) {
						arg0.anInt4662 = -1;
					} else if (arg0.anInt4662 < 0 || arg0.anInt4662 >= local23.anIntArray357.length) {
						arg0.anInt4662 = -1;
					}
				}
				arg0.aBoolean356 = local23.aBoolean299;
			}
		}
		if (arg0.anInt4695 > 0) {
			arg0.anInt4695--;
		}
		for (@Pc(712) int local712 = 0; local712 < arg0.aClass3Array3.length; local712++) {
			@Pc(726) Class3 local726 = arg0.aClass3Array3[local712];
			if (local726 != null) {
				if (local726.anInt105 > 0) {
					local726.anInt105--;
				} else {
					local163 = Static90.method1591(local726.anInt110);
					if (local163 == null || local163.anIntArray357 == null) {
						arg0.aClass3Array3[local712] = null;
					} else {
						local726.anInt102++;
						if (local726.anInt103 < local163.anIntArray357.length && local163.anIntArray356[local726.anInt103] < local726.anInt102) {
							local726.anInt103++;
							local726.anInt102 = 1;
							Static77.method1354(local726.anInt103, Static197.aClass14_Sub2_Sub1_2 == arg0, arg0.anInt4680, local163, arg0.anInt4630);
						}
						if (local163.anIntArray357.length <= local726.anInt103) {
							local726.anInt104++;
							local726.anInt103 -= local163.anInt3946;
							if (local726.anInt104 >= local163.anInt3953) {
								arg0.aClass3Array3[local712] = null;
							} else if (local726.anInt103 >= 0 && local726.anInt103 < local163.anIntArray357.length) {
								Static77.method1354(local726.anInt103, Static197.aClass14_Sub2_Sub1_2 == arg0, arg0.anInt4680, local163, arg0.anInt4630);
							} else {
								arg0.aClass3Array3[local712] = null;
							}
						}
						local726.anInt101 = local726.anInt103 + 1;
						if (local726.anInt101 >= local163.anIntArray357.length) {
							local726.anInt101 -= local163.anInt3946;
							if (local163.anInt3953 <= local726.anInt104 + 1) {
								local726.anInt101 = -1;
							} else if (local726.anInt101 < 0 || local726.anInt101 >= local163.anIntArray357.length) {
								local726.anInt101 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method4060(@OriginalArg(1) String arg0, @OriginalArg(3) String arg1, @OriginalArg(4) String arg2) {
		Static221.method3478(arg0, arg2, -1, arg1, 9);
	}
}
