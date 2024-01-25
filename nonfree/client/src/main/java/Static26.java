import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public static int anInt449 = 13156520;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!ub;Z)V")
	public static void method473(@OriginalArg(1) Class1_Sub2_Sub6_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static276.anInt4608 >= 400) {
			return;
		}
		@Pc(19) Class158 local19 = arg0.aClass158_1;
		if (local19.anIntArray294 != null) {
			local19 = local19.method3705(Static119.aClass47_1);
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean323) {
			return;
		}
		@Pc(37) String local37 = local19.aString51;
		if (local19.anInt4465 != 0) {
			@Pc(53) String local53 = Static427.aClass113_4 == Static154.aClass113_3 ? Static391.aClass174_187.method4208(Static300.anInt5192) : Static300.aClass174_146.method4208(Static300.anInt5192);
			local37 = local37 + Static248.method3545(local19.anInt4465, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651) + " (" + local53 + local19.anInt4465 + ")";
		}
		if (!Static73.aBoolean88) {
			if (!arg1) {
				@Pc(83) String[] local83 = local19.aStringArray29;
				if (Static384.aBoolean444) {
					local83 = Static57.method1104(local83);
				}
				@Pc(93) int local93;
				if (local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && (local19.aByte54 == 0 || !local83[local93].equalsIgnoreCase(Static59.aClass174_37.method4208(Static300.anInt5192)))) {
							@Pc(113) byte local113 = 0;
							if (local93 == 0) {
								local113 = 23;
							}
							@Pc(119) int local119 = Static387.anInt6515;
							if (local93 == 1) {
								local113 = 16;
							}
							if (local93 == 2) {
								local113 = 57;
							}
							if (local93 == 3) {
								local113 = 22;
							}
							if (local93 == 4) {
								local113 = 2;
							}
							if (local19.anInt4446 == local93) {
								local119 = local19.anInt4449;
							}
							if (local19.anInt4452 == local93) {
								local119 = local19.anInt4455;
							}
							Static359.method5021(false, local113, 0, true, "<col=ffff00>" + local37, -1, local83[local93].equalsIgnoreCase(Static59.aClass174_37.method4208(Static300.anInt5192)) ? local19.anInt4473 : local119, local83[local93], (long) arg0.anInt7621, 0);
						}
					}
				}
				if (local19.aByte54 == 1 && local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && local83[local93].equalsIgnoreCase(Static59.aClass174_37.method4208(Static300.anInt5192))) {
							@Pc(232) short local232 = 0;
							if (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651 < local19.anInt4465) {
								local232 = 2000;
							}
							@Pc(241) short local241 = 0;
							if (local93 == 0) {
								local241 = 23;
							}
							if (local93 == 1) {
								local241 = 16;
							}
							if (local93 == 2) {
								local241 = 57;
							}
							if (local93 == 3) {
								local241 = 22;
							}
							if (local93 == 4) {
								local241 = 2;
							}
							if (local241 != 0) {
								local241 += local232;
							}
							Static359.method5021(false, local241, 0, true, "<col=ffff00>" + local37, -1, local19.anInt4473, local83[local93], (long) arg0.anInt7621, 0);
						}
					}
				}
			}
			Static359.method5021(arg1, 1002, 0, true, "<col=ffff00>" + local37, -1, Static172.anInt3102, Static73.aClass174_47.method4208(Static300.anInt5192), (long) arg0.anInt7621, 0);
		} else if (!arg1) {
			@Pc(349) Class32 local349 = Static116.anInt2044 == -1 ? null : Static70.aClass15_1.method323(Static116.anInt2044);
			if ((Static385.anInt6504 & 0x2) != 0) {
				if (local349 == null || local19.method3703(local349.anInt813, Static116.anInt2044) != local349.anInt813) {
					Static359.method5021(false, 44, 0, true, Static296.aString56 + " -> <col=ffff00>" + local37, -1, Static336.anInt5620, Static320.aString12, (long) arg0.anInt7621, 0);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ik;I)V")
	public static void method475(@OriginalArg(0) Class3_Sub25_Sub1 arg0) {
		arg0.method2785();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static271.anInt4534; local12++) {
			local18 = Static215.anIntArray267[local12];
			if ((Static166.aByteArray57[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static166.aByteArray57[local18] = (byte) (Static166.aByteArray57[local18] | 0x2);
				} else {
					local46 = arg0.method2783(1);
					if (local46 == 0) {
						local10 = Static406.method5558(arg0);
						Static166.aByteArray57[local18] = (byte) (Static166.aByteArray57[local18] | 0x2);
					} else {
						Static260.method5118(arg0, local18);
					}
				}
			}
		}
		arg0.method2786();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2785();
		@Pc(126) int local126;
		for (local18 = 0; local18 < Static271.anInt4534; local18++) {
			local46 = Static215.anIntArray267[local18];
			if ((Static166.aByteArray57[local46] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static166.aByteArray57[local46] = (byte) (Static166.aByteArray57[local46] | 0x2);
				} else {
					local126 = arg0.method2783(1);
					if (local126 == 0) {
						local10 = Static406.method5558(arg0);
						Static166.aByteArray57[local46] = (byte) (Static166.aByteArray57[local46] | 0x2);
					} else {
						Static260.method5118(arg0, local46);
					}
				}
			}
		}
		arg0.method2786();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2785();
		@Pc(209) int local209;
		for (local46 = 0; local46 < Static105.anInt1898; local46++) {
			local126 = Static55.anIntArray55[local46];
			if ((Static166.aByteArray57[local126] & 0x1) != 0) {
				if (local10 > 0) {
					Static166.aByteArray57[local126] = (byte) (Static166.aByteArray57[local126] | 0x2);
					local10--;
				} else {
					local209 = arg0.method2783(1);
					if (local209 == 0) {
						local10 = Static406.method5558(arg0);
						Static166.aByteArray57[local126] = (byte) (Static166.aByteArray57[local126] | 0x2);
					} else if (Static159.method2511(arg0, local126)) {
						Static166.aByteArray57[local126] = (byte) (Static166.aByteArray57[local126] | 0x2);
					}
				}
			}
		}
		arg0.method2786();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2785();
		for (local126 = 0; local126 < Static105.anInt1898; local126++) {
			local209 = Static55.anIntArray55[local126];
			if ((Static166.aByteArray57[local209] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static166.aByteArray57[local209] = (byte) (Static166.aByteArray57[local209] | 0x2);
				} else {
					@Pc(306) int local306 = arg0.method2783(1);
					if (local306 == 0) {
						local10 = Static406.method5558(arg0);
						Static166.aByteArray57[local209] = (byte) (Static166.aByteArray57[local209] | 0x2);
					} else if (Static159.method2511(arg0, local209)) {
						Static166.aByteArray57[local209] = (byte) (Static166.aByteArray57[local209] | 0x2);
					}
				}
			}
		}
		arg0.method2786();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static105.anInt1898 = 0;
		Static271.anInt4534 = 0;
		for (local209 = 1; local209 < 2048; local209++) {
			Static166.aByteArray57[local209] = (byte) (Static166.aByteArray57[local209] >> 1);
			@Pc(383) Class1_Sub2_Sub6_Sub2 local383 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local209];
			if (local383 == null) {
				Static55.anIntArray55[Static105.anInt1898++] = local209;
			} else {
				Static215.anIntArray267[Static271.anInt4534++] = local209;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
	public static void method476(@OriginalArg(1) int arg0) {
		if (Static63.anInt7101 == 0) {
			Static407.aClass3_Sub1_Sub4_3.method6305(arg0);
		} else {
			Static28.anInt494 = arg0;
		}
	}
}
