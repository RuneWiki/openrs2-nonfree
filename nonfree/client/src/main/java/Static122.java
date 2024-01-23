import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!j", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!j", name = "X", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13 = new String[8];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)Z")
	public static boolean method2091(@OriginalArg(0) int arg0) {
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static68.aClass1_Sub2_Sub14_Sub1_1 == null) {
			if (Static296.aBoolean335 || Static253.aClass1_Sub2_Sub14_9 == null) {
				Static68.aClass1_Sub2_Sub14_Sub1_1 = new Class1_Sub2_Sub14_Sub1(512, 512);
			} else {
				Static68.aClass1_Sub2_Sub14_Sub1_1 = (Class1_Sub2_Sub14_Sub1) Static253.aClass1_Sub2_Sub14_9;
			}
			@Pc(32) int[] local32 = Static68.aClass1_Sub2_Sub14_Sub1_1.anIntArray294;
			local35 = local32.length;
			for (local37 = 0; local37 < local35; local37++) {
				local32[local37] = 1;
			}
			for (local37 = 1; local37 < 103; local37++) {
				local71 = (103 - local37) * 512 * 4 + 24628;
				for (local75 = 1; local75 < 103; local75++) {
					if ((Static126.aByteArrayArrayArray24[arg0][local75][local37] & 0x18) == 0) {
						Static94.method4772(local32, local71, arg0, local75, local37);
					}
					if (arg0 < 3 && (Static126.aByteArrayArrayArray24[arg0 + 1][local75][local37] & 0x8) != 0) {
						Static94.method4772(local32, local71, arg0 + 1, local75, local37);
					}
					local71 += 4;
				}
			}
			Static232.anInt5145 = 0;
			for (local37 = 0; local37 < 104; local37++) {
				for (local71 = 0; local71 < 104; local71++) {
					@Pc(167) long local167 = Static242.method4165(Static145.anInt3477, local37 + 0, local71);
					if (local167 != 0L) {
						@Pc(182) Class30 local182 = Static268.method4511((int) (local167 >>> 32) & Integer.MAX_VALUE);
						@Pc(185) int local185 = local182.anInt832;
						@Pc(191) int local191;
						if (local182.anIntArray93 != null) {
							for (local191 = 0; local191 < local182.anIntArray93.length; local191++) {
								if (local182.anIntArray93[local191] != -1) {
									@Pc(210) Class30 local210 = Static268.method4511(local182.anIntArray93[local191]);
									if (local210.anInt832 >= 0) {
										local185 = local210.anInt832;
										break;
									}
								}
							}
						}
						if (local185 >= 0) {
							local191 = local37;
							@Pc(234) int local234 = local71;
							if (local185 != 22 && local185 != 29 && local185 != 34 && local185 != 36 && local185 != 46 && local185 != 47 && local185 != 48) {
								@Pc(268) int[][] local268 = Static213.aClass36Array1[Static145.anInt3477].anIntArrayArray7;
								for (@Pc(270) int local270 = 0; local270 < 10; local270++) {
									@Pc(278) int local278 = (int) (Math.random() * 4.0D);
									if (local278 == 0 && local191 > 0 && local191 > local37 - 3 && (local268[local191 - 1][local234] & 0x2C0108) == 0) {
										local191--;
									}
									if (local278 == 1 && local191 < 103 && local191 < local37 + 3 && (local268[local191 + 1][local234] & 0x2C0180) == 0) {
										local191++;
									}
									if (local278 == 2 && local234 > 0 && local234 > local71 - 3 && (local268[local191][local234 - 1] & 0x2C0102) == 0) {
										local234--;
									}
									if (local278 == 3 && local234 < 103 && local234 < local71 + 3 && (local268[local191][local234 + 1] & 0x2C0120) == 0) {
										local234++;
									}
								}
							}
							Static165.anIntArray342[Static232.anInt5145] = local182.anInt875;
							Static190.anIntArray381[Static232.anInt5145] = local191;
							Static40.anIntArray203[Static232.anInt5145] = local234;
							Static232.anInt5145++;
						}
					}
				}
			}
		}
		Static68.aClass1_Sub2_Sub14_Sub1_1.method2490();
		@Pc(455) int local455 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		local35 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local37 = 1; local37 < 103; local37++) {
			for (local71 = 1; local71 < 103; local71++) {
				if ((Static126.aByteArrayArrayArray24[arg0][local71][local37] & 0x18) == 0 && !Static144.method2674(local455, local37, local35, arg0, local71)) {
					if (Static296.aBoolean335) {
						Static203.anIntArray460 = null;
					} else {
						Static1.aClass5_1.method1716();
					}
					return false;
				}
				if (arg0 < 3 && (Static126.aByteArrayArrayArray24[arg0 + 1][local71][local37] & 0x8) != 0 && !Static144.method2674(local455, local37, local35, arg0 + 1, local71)) {
					if (Static296.aBoolean335) {
						Static203.anIntArray460 = null;
					} else {
						Static1.aClass5_1.method1716();
					}
					return false;
				}
			}
		}
		if (Static296.aBoolean335) {
			@Pc(573) int[] local573 = Static68.aClass1_Sub2_Sub14_Sub1_1.anIntArray294;
			local71 = local573.length;
			for (local75 = 0; local75 < local71; local75++) {
				if (local573[local75] == 0) {
					local573[local75] = 1;
				}
			}
			Static253.aClass1_Sub2_Sub14_9 = new Class1_Sub2_Sub14_Sub2(Static68.aClass1_Sub2_Sub14_Sub1_1);
		} else {
			Static253.aClass1_Sub2_Sub14_9 = Static68.aClass1_Sub2_Sub14_Sub1_1;
		}
		if (Static296.aBoolean335) {
			Static203.anIntArray460 = null;
		} else {
			Static1.aClass5_1.method1716();
		}
		Static68.aClass1_Sub2_Sub14_Sub1_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([IBI[JI)V")
	public static void method2092(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg3 + arg1) / 2;
		@Pc(15) long local15 = arg2[local11];
		@Pc(17) int local17 = arg3;
		arg2[local11] = arg2[arg1];
		arg2[arg1] = local15;
		@Pc(31) int local31 = arg0[local11];
		arg0[local11] = arg0[arg1];
		arg0[arg1] = local31;
		for (@Pc(43) int local43 = arg3; local43 < arg1; local43++) {
			if (arg2[local43] < (long) (local43 & 0x1) + local15) {
				@Pc(62) long local62 = arg2[local43];
				arg2[local43] = arg2[local17];
				arg2[local17] = local62;
				@Pc(76) int local76 = arg0[local43];
				arg0[local43] = arg0[local17];
				arg0[local17++] = local76;
			}
		}
		arg2[arg1] = arg2[local17];
		arg2[local17] = local15;
		arg0[arg1] = arg0[local17];
		arg0[local17] = local31;
		method2092(arg0, local17 - 1, arg2, arg3);
		method2092(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!lg;B)V")
	public static void method2093(@OriginalArg(0) Class25_Sub1 arg0) {
		if (arg0.anInt1615 == 0) {
			return;
		}
		@Pc(13) Class124 local13 = arg0.method1232();
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (arg0.anInt1631 != -1 && arg0.anInt1631 < 32768) {
			@Pc(26) Class25_Sub1_Sub2 local26 = Static27.aClass25_Sub1_Sub2Array1[arg0.anInt1631];
			if (local26 != null) {
				local36 = arg0.anInt1635 - local26.anInt1635;
				local42 = arg0.anInt1604 - local26.anInt1604;
				if (local36 != 0 || local42 != 0) {
					arg0.anInt1628 = (int) (Math.atan2((double) local36, (double) local42) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(107) int local107;
		@Pc(75) int local75;
		if (arg0.anInt1631 >= 32768) {
			local75 = arg0.anInt1631 - 32768;
			if (local75 == Static76.anInt5427) {
				local75 = 2047;
			}
			@Pc(89) Class25_Sub1_Sub1 local89 = Static271.aClass25_Sub1_Sub1Array1[local75];
			if (local89 != null) {
				local42 = arg0.anInt1635 - local89.anInt1635;
				local107 = arg0.anInt1604 - local89.anInt1604;
				if (local42 != 0 || local107 != 0) {
					arg0.anInt1628 = (int) (Math.atan2((double) local42, (double) local107) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1623 != 0 || arg0.anInt1655 != 0) && (arg0.anInt1610 == 0 || arg0.anInt1683 > 0)) {
			local75 = arg0.anInt1635 - (arg0.anInt1623 - Static82.anInt1972 - Static82.anInt1972) * 64;
			local36 = arg0.anInt1604 - (arg0.anInt1655 - Static266.anInt5790 - Static266.anInt5790) * 64;
			if (local75 != 0 || local36 != 0) {
				arg0.anInt1628 = (int) (Math.atan2((double) local75, (double) local36) * 325.949D) & 0x7FF;
			}
			arg0.anInt1655 = 0;
			arg0.anInt1623 = 0;
		}
		local75 = arg0.anInt1628 - arg0.anInt1681 & 0x7FF;
		if (local75 == 0) {
			arg0.anInt1676 = 0;
			arg0.anInt1656 = 0;
		} else if (local13.anInt4589 == 0) {
			arg0.anInt1656++;
			@Pc(234) boolean local234;
			if (local75 <= 1024) {
				arg0.anInt1681 += arg0.anInt1615;
				local234 = true;
				if (local75 < arg0.anInt1615 || 2048 - arg0.anInt1615 < local75) {
					local234 = false;
					arg0.anInt1681 = arg0.anInt1628;
				}
				if (arg0.anInt1656 > 25 || local234) {
					arg0.anInt1646 = local13.anInt4569;
					if (arg0.anInt1610 <= 0) {
						if (local13.anInt4610 != -1) {
							arg0.anInt1646 = local13.anInt4610;
						}
					} else if (arg0.aByteArray15[arg0.anInt1610 - 1] == 2) {
						if (local13.anInt4606 != -1) {
							arg0.anInt1646 = local13.anInt4606;
						} else if (local13.anInt4571 != -1) {
							arg0.anInt1646 = local13.anInt4571;
						}
					} else if (arg0.aByteArray15[arg0.anInt1610 - 1] == 0) {
						if (local13.anInt4604 != -1) {
							arg0.anInt1646 = local13.anInt4604;
						} else if (local13.anInt4602 != -1) {
							arg0.anInt1646 = local13.anInt4602;
						}
					} else if (local13.anInt4592 != -1) {
						arg0.anInt1646 = local13.anInt4592;
					}
				}
			} else {
				local234 = true;
				arg0.anInt1681 -= arg0.anInt1615;
				if (local75 < arg0.anInt1615 || local75 > 2048 - arg0.anInt1615) {
					local234 = false;
					arg0.anInt1681 = arg0.anInt1628;
				}
				if (arg0.anInt1656 > 25 || local234) {
					arg0.anInt1646 = local13.anInt4569;
					if (arg0.anInt1610 > 0) {
						if (arg0.aByteArray15[arg0.anInt1610 - 1] == 2) {
							if (local13.anInt4593 != -1) {
								arg0.anInt1646 = local13.anInt4593;
							} else if (local13.anInt4571 != -1) {
								arg0.anInt1646 = local13.anInt4571;
							}
						} else if (arg0.aByteArray15[arg0.anInt1610 - 1] == 0) {
							if (local13.anInt4591 != -1) {
								arg0.anInt1646 = local13.anInt4591;
							} else if (local13.anInt4602 != -1) {
								arg0.anInt1646 = local13.anInt4602;
							}
						} else if (local13.anInt4583 != -1) {
							arg0.anInt1646 = local13.anInt4583;
						}
					} else if (local13.anInt4576 != -1) {
						arg0.anInt1646 = local13.anInt4576;
					}
				}
			}
			arg0.anInt1681 &= 0x7FF;
		} else {
			arg0.anInt1646 = -1;
			local36 = arg0.anInt1628 << 5;
			if (arg0.anInt1659 != local36) {
				arg0.anInt1663 = 0;
				local42 = local36 - arg0.anInt1634 & 0xFFFF;
				arg0.anInt1659 = local36;
				local107 = arg0.anInt1676 * arg0.anInt1676 / (local13.anInt4589 * 2);
				@Pc(570) int local570;
				if (arg0.anInt1676 > 0 && local107 <= local42 && local42 - local107 < 32768) {
					arg0.anInt1606 = local42 / 2;
					arg0.aBoolean91 = true;
					local570 = local13.anInt4598 * local13.anInt4598 / (local13.anInt4589 * 2);
					if (local570 > 32767) {
						local570 = 32767;
					}
					if (arg0.anInt1606 > local570) {
						arg0.anInt1606 = local42 - local570;
					}
				} else if (arg0.anInt1676 < 0 && local107 <= 65536 - local42 && 65536 - local42 - local107 < 32768) {
					arg0.aBoolean91 = true;
					local570 = local13.anInt4598 * local13.anInt4598 / (local13.anInt4589 * 2);
					if (local570 > 32767) {
						local570 = 32767;
					}
					arg0.anInt1606 = (65536 - local42) / 2;
					if (local570 < arg0.anInt1606) {
						arg0.anInt1606 = 65536 - local570 - local42;
					}
				} else {
					arg0.aBoolean91 = false;
				}
			}
			if (arg0.anInt1676 == 0) {
				local42 = arg0.anInt1659 - arg0.anInt1634 & 0xFFFF;
				if (local42 < local13.anInt4589) {
					arg0.anInt1634 = arg0.anInt1659;
				} else {
					arg0.aBoolean91 = true;
					arg0.anInt1663 = 0;
					local107 = local13.anInt4598 * local13.anInt4598 / (local13.anInt4589 * 2);
					if (local107 > 32767) {
						local107 = 32767;
					}
					if (local42 >= 32768) {
						arg0.anInt1606 = (65536 - local42) / 2;
						if (local107 < arg0.anInt1606) {
							arg0.anInt1606 = 65536 - local107 - local42;
						}
						arg0.anInt1676 = -local13.anInt4589;
					} else {
						arg0.anInt1606 = local42 / 2;
						if (arg0.anInt1606 > local107) {
							arg0.anInt1606 = local42 - local107;
						}
						arg0.anInt1676 = local13.anInt4589;
					}
				}
			} else if (arg0.anInt1676 > 0) {
				if (arg0.anInt1663 >= arg0.anInt1606) {
					arg0.aBoolean91 = false;
				}
				if (!arg0.aBoolean91) {
					arg0.anInt1676 -= local13.anInt4589;
					if (arg0.anInt1676 < 0) {
						arg0.anInt1676 = 0;
					}
				} else if (arg0.anInt1676 < local13.anInt4598) {
					arg0.anInt1676 += local13.anInt4589;
				}
			} else {
				if (arg0.anInt1663 >= arg0.anInt1606) {
					arg0.aBoolean91 = false;
				}
				if (!arg0.aBoolean91) {
					arg0.anInt1676 += local13.anInt4589;
					if (arg0.anInt1676 > 0) {
						arg0.anInt1676 = 0;
					}
				} else if (-local13.anInt4598 < arg0.anInt1676) {
					arg0.anInt1676 -= local13.anInt4589;
				}
			}
			arg0.anInt1634 += arg0.anInt1676;
			if (arg0.anInt1676 <= 0) {
				arg0.anInt1663 -= arg0.anInt1676;
			} else {
				arg0.anInt1663 += arg0.anInt1676;
			}
			arg0.anInt1634 &= 0xFFFF;
			arg0.anInt1681 = arg0.anInt1634 >> 5;
			if (arg0.anInt1676 >= 0) {
				if (arg0.anInt1610 > 0) {
					if (arg0.aByteArray15[arg0.anInt1610 - 1] == 2) {
						if (local13.anInt4606 != -1) {
							arg0.anInt1646 = local13.anInt4606;
						} else if (local13.anInt4571 != -1) {
							arg0.anInt1646 = local13.anInt4571;
						}
					} else if (arg0.aByteArray15[arg0.anInt1610 - 1] == 0) {
						if (local13.anInt4604 != -1) {
							arg0.anInt1646 = local13.anInt4604;
						} else if (local13.anInt4602 != -1) {
							arg0.anInt1646 = local13.anInt4602;
						}
					}
				}
				if (arg0.anInt1646 == -1) {
					if (local13.anInt4592 != -1) {
						arg0.anInt1646 = local13.anInt4592;
					} else if (local13.anInt4610 != -1) {
						arg0.anInt1646 = local13.anInt4610;
					}
				}
			} else {
				if (arg0.anInt1610 > 0) {
					if (arg0.aByteArray15[arg0.anInt1610 - 1] == 2) {
						if (local13.anInt4593 != -1) {
							arg0.anInt1646 = local13.anInt4593;
						} else if (local13.anInt4571 != -1) {
							arg0.anInt1646 = local13.anInt4571;
						}
					} else if (arg0.aByteArray15[arg0.anInt1610 - 1] == 0) {
						if (local13.anInt4591 != -1) {
							arg0.anInt1646 = local13.anInt4591;
						} else if (local13.anInt4602 != -1) {
							arg0.anInt1646 = local13.anInt4602;
						}
					}
				}
				if (arg0.anInt1646 == -1) {
					if (local13.anInt4583 != -1) {
						arg0.anInt1646 = local13.anInt4583;
					} else if (local13.anInt4576 != -1) {
						arg0.anInt1646 = local13.anInt4576;
					}
				}
			}
			if (arg0.anInt1646 == -1) {
				arg0.anInt1646 = local13.anInt4569;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method2095(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(22) byte[] local22 = (byte[]) arg0;
			return arg1 ? Static25.method421(local22) : local22;
		} else if (arg0 instanceof Class34) {
			@Pc(36) Class34 local36 = (Class34) arg0;
			return local36.method938();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method2096() {
		for (@Pc(12) Class1_Sub2_Sub17 local12 = (Class1_Sub2_Sub17) Static293.aClass131_28.method3791(); local12 != null; local12 = (Class1_Sub2_Sub17) Static293.aClass131_28.method3792()) {
			@Pc(22) Class25_Sub7 local22 = local12.aClass25_Sub7_1;
			if (local22.anInt6169 != Static145.anInt3477 || Static32.anInt809 > local22.anInt6168) {
				local12.method4742();
			} else if (local22.anInt6163 <= Static32.anInt809) {
				if (local22.anInt6165 > 0) {
					@Pc(44) Class25_Sub1_Sub2 local44 = Static27.aClass25_Sub1_Sub2Array1[local22.anInt6165 - 1];
					if (local44 != null && local44.anInt1635 >= 0 && local44.anInt1635 < 13312 && local44.anInt1604 >= 0 && local44.anInt1604 < 13312) {
						local22.method4778(Static220.method3905(local44.anInt1635, local44.anInt1604, local22.anInt6169) - local22.anInt6177, Static32.anInt809, local44.anInt1604, local44.anInt1635);
					}
				}
				if (local22.anInt6165 < 0) {
					@Pc(99) int local99 = -local22.anInt6165 - 1;
					@Pc(106) Class25_Sub1_Sub1 local106;
					if (local99 == Static76.anInt5427) {
						local106 = Static239.aClass25_Sub1_Sub1_2;
					} else {
						local106 = Static271.aClass25_Sub1_Sub1Array1[local99];
					}
					if (local106 != null && local106.anInt1635 >= 0 && local106.anInt1635 < 13312 && local106.anInt1604 >= 0 && local106.anInt1604 < 13312) {
						local22.method4778(Static220.method3905(local106.anInt1635, local106.anInt1604, local22.anInt6169) - local22.anInt6177, Static32.anInt809, local106.anInt1604, local106.anInt1635);
					}
				}
				local22.method4781(Static112.anInt2417);
				Static227.method3944(Static145.anInt3477, (int) local22.aDouble8, (int) local22.aDouble6, (int) local22.aDouble5, 60, local22, local22.anInt6161, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIZZI)V")
	public static void method2097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 <= arg5) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg5) / 2;
		@Pc(25) int local25 = arg5;
		@Pc(29) Class140_Sub1 local29 = Static160.aClass140_Sub1Array2[local23];
		Static160.aClass140_Sub1Array2[local23] = Static160.aClass140_Sub1Array2[arg1];
		Static160.aClass140_Sub1Array2[arg1] = local29;
		for (@Pc(41) int local41 = arg5; local41 < arg1; local41++) {
			if (Static133.method2289(local29, arg0, Static160.aClass140_Sub1Array2[local41], arg3, arg2, arg4) <= 0) {
				@Pc(64) Class140_Sub1 local64 = Static160.aClass140_Sub1Array2[local41];
				Static160.aClass140_Sub1Array2[local41] = Static160.aClass140_Sub1Array2[local25];
				Static160.aClass140_Sub1Array2[local25++] = local64;
			}
		}
		Static160.aClass140_Sub1Array2[arg1] = Static160.aClass140_Sub1Array2[local25];
		Static160.aClass140_Sub1Array2[local25] = local29;
		method2097(arg0, local25 - 1, arg2, arg3, arg4, arg5);
		method2097(arg0, arg1, arg2, arg3, arg4, local25 + 1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)I")
	public static int method2098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
