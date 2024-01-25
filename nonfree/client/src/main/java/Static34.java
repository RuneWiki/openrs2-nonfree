import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public static int anInt653;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public static int anInt652 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public static void method593(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(7, arg0);
		local8.method4782();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method594(@OriginalArg(0) String arg0) {
		if (Static167.aStringArray28 == null) {
			Static266.method4803();
		}
		@Pc(14) String[] local14 = Static183.method3233(arg0, '\n');
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			for (@Pc(26) int local26 = Static208.anInt4355; local26 > 0; local26--) {
				Static167.aStringArray28[local26] = Static167.aStringArray28[local26 - 1];
			}
			Static167.aStringArray28[0] = local14[local22];
			if (Static208.anInt4355 < Static167.aStringArray28.length - 1) {
				Static208.anInt4355++;
				if (Static229.anInt4788 > 0) {
					Static229.anInt4788++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZIZIIIILclient!ba;ILclient!ii;)V")
	public static void method595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class17 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class105 arg11) {
		if (!Static25.method408() && !Static217.method739(arg10, arg3, arg5, Static98.anInt1912)) {
			return;
		}
		if (arg10 < Static203.anInt4293) {
			Static203.anInt4293 = arg10;
		}
		@Pc(33) Class79 local33 = Static129.method2097(arg0);
		if (Static24.anInt437 == 1 && local33.aBoolean147) {
			return;
		}
		@Pc(51) int local51;
		@Pc(54) int local54;
		if (arg1 == 1 || arg1 == 3) {
			local54 = local33.anInt1884;
			local51 = local33.anInt1897;
		} else {
			local51 = local33.anInt1884;
			local54 = local33.anInt1897;
		}
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (local51 + arg5 <= Static43.anInt1151) {
			local78 = arg5 + (local51 >> 1);
			local86 = arg5 + (local51 + 1 >> 1);
		} else {
			local86 = arg5 + 1;
			local78 = arg5;
		}
		@Pc(102) int local102;
		@Pc(106) int local106;
		if (arg3 + local54 > Static260.anInt5348) {
			local102 = arg3;
			local106 = arg3 + 1;
		} else {
			local106 = arg3 + (local54 + 1 >> 1);
			local102 = (local54 >> 1) + arg3;
		}
		@Pc(126) Class12 local126 = Static263.aClass12Array2[arg6];
		@Pc(151) int local151 = local126.method2704(local78, local102) + local126.method2704(local86, local102) + local126.method2704(local78, local106) + local126.method2704(local86, local106) >> 2;
		@Pc(160) int local160 = (arg5 << 7) + (local51 << 6);
		@Pc(168) int local168 = (arg3 << 7) + (local54 << 6);
		@Pc(179) boolean local179 = arg4 && !arg2 && local33.aBoolean148;
		if (local33.method1561()) {
			Static147.method2608(arg10, arg3, arg1, arg5, null, local33, null);
		}
		@Pc(215) boolean local215 = arg8 == -1 && local33.anInt1857 == -1 && local33.anIntArray155 == null && local33.anIntArray161 == null && !local33.aBoolean151;
		if (Static18.aBoolean29 && local33.anInt1893 != 1) {
			return;
		}
		if (arg7 != 22) {
			@Pc(341) Class10_Sub1 local341;
			@Pc(311) Class10_Sub1_Sub4 local311;
			@Pc(343) int local343;
			@Pc(408) int local408;
			if (arg7 == 10 || arg7 == 11) {
				local311 = null;
				if (local215) {
					@Pc(372) Class10_Sub1_Sub4 local372 = new Class10_Sub1_Sub4(arg11, local33, arg10, arg6, local160, local151, local168, arg2, arg5, arg5 + local51 - 1, arg3, local54 + arg3 - 1, arg7, arg1, local179);
					local341 = local372;
					local343 = local372.method3854();
					local311 = local372;
				} else {
					local341 = new Class10_Sub1_Sub3(arg11, local33, arg7, arg1, arg10, arg6, local160, local151, local168, arg2, arg5, arg5 + local51 - 1, arg3, arg3 + local54 - 1, arg8);
					local343 = 15;
				}
				if (Static189.method5292(local341, false)) {
					if (local311 != null && local311.method5451()) {
						local311.method5446(arg11);
					}
					if (local33.aBoolean146 && arg4) {
						if (local343 > 30) {
							local343 = 30;
						}
						for (local408 = 0; local408 <= local51; local408++) {
							for (@Pc(412) int local412 = 0; local412 <= local54; local412++) {
								local126.method2708(arg5 + local408, local412 + arg3, local343);
							}
						}
					}
				}
				if (local33.anInt1881 != 0 && arg9 != null) {
					arg9.method336(!local33.aBoolean145, arg3, local54, local33.aBoolean140, local51, arg5);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local215) {
					local311 = new Class10_Sub1_Sub4(arg11, local33, arg10, arg6, local160, local151, local168, arg2, arg5, local51 + arg5 - 1, arg3, local54 + arg3 - 1, arg7, arg1, local179);
					if (local311.method5451()) {
						local311.method5446(arg11);
					}
					local341 = local311;
				} else {
					local341 = new Class10_Sub1_Sub3(arg11, local33, arg7, arg1, arg10, arg6, local160, local151, local168, arg2, arg5, local51 + arg5 - 1, arg3, arg3 + local54 - 1, arg8);
				}
				Static189.method5292(local341, false);
				if (arg4 && !arg2 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg10 > 0 && local33.anInt1893 != 0) {
					Static268.aByteArrayArrayArray10[arg10][arg5][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3] | 0x4);
				}
				if (local33.anInt1881 != 0 && arg9 != null) {
					arg9.method336(!local33.aBoolean145, arg3, local54, local33.aBoolean140, local51, arg5);
				}
			} else {
				@Pc(644) Class10_Sub2_Sub1 local644;
				@Pc(646) Class10_Sub2 local646;
				if (arg7 == 0) {
					if (local215) {
						local644 = new Class10_Sub2_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg7, arg1, local179);
						local646 = local644;
						if (local644.method5451()) {
							local644.method5446(arg11);
						}
					} else {
						local646 = new Class10_Sub2_Sub2(arg11, local33, 0, arg1, arg10, arg6, local160, local151, local168, arg2, arg8);
					}
					Static277.method4955(arg10, arg5, arg3, local646, null);
					if (arg4) {
						if (arg1 == 0) {
							if (local33.aBoolean146) {
								local126.method2708(arg5, arg3, 50);
								local126.method2708(arg5, arg3 + 1, 50);
							}
							if (local33.anInt1893 == 1 && !arg2) {
								Static268.aByteArrayArrayArray10[arg10][arg5][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3] | 0x1);
							}
						} else if (arg1 == 1) {
							if (local33.aBoolean146) {
								local126.method2708(arg5, arg3 + 1, 50);
								local126.method2708(arg5 + 1, arg3 + 1, 50);
							}
							if (local33.anInt1893 == 1 && !arg2) {
								Static268.aByteArrayArrayArray10[arg10][arg5][arg3 + 1] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3 + 1] | 0x2);
							}
						} else if (arg1 == 2) {
							if (local33.aBoolean146) {
								local126.method2708(arg5 + 1, arg3, 50);
								local126.method2708(arg5 + 1, arg3 + 1, 50);
							}
							if (local33.anInt1893 == 1 && !arg2) {
								Static268.aByteArrayArrayArray10[arg10][arg5 + 1][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5 + 1][arg3] | 0x1);
							}
						} else if (arg1 == 3) {
							if (local33.aBoolean146) {
								local126.method2708(arg5, arg3, 50);
								local126.method2708(arg5 + 1, arg3, 50);
							}
							if (local33.anInt1893 == 1 && !arg2) {
								Static268.aByteArrayArrayArray10[arg10][arg5][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3] | 0x2);
							}
						}
					}
					if (local33.anInt1881 != 0 && arg9 != null) {
						arg9.method330(arg7, !local33.aBoolean145, local33.aBoolean140, arg1, arg5, arg3);
					}
					if (local33.anInt1864 != 16) {
						Static303.method5267(arg10, arg5, arg3, local33.anInt1864);
					}
				} else if (arg7 == 1) {
					if (local215) {
						local644 = new Class10_Sub2_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg7, arg1, local179);
						if (local644.method5451()) {
							local644.method5446(arg11);
						}
						local646 = local644;
					} else {
						local646 = new Class10_Sub2_Sub2(arg11, local33, 1, arg1, arg10, arg6, local160, local151, local168, arg2, arg8);
					}
					Static277.method4955(arg10, arg5, arg3, local646, null);
					if (local33.aBoolean146 && arg4) {
						if (arg1 == 0) {
							local126.method2708(arg5, arg3 + 1, 50);
						} else if (arg1 == 1) {
							local126.method2708(arg5 + 1, arg3 + 1, 50);
						} else if (arg1 == 2) {
							local126.method2708(arg5 + 1, arg3, 50);
						} else if (arg1 == 3) {
							local126.method2708(arg5, arg3, 50);
						}
					}
					if (local33.anInt1881 != 0 && arg9 != null) {
						arg9.method330(arg7, !local33.aBoolean145, local33.aBoolean140, arg1, arg5, arg3);
					}
				} else if (arg7 == 2) {
					local343 = arg1 + 1 & 0x3;
					@Pc(1094) Class10_Sub2 local1094;
					if (local215) {
						@Pc(1060) Class10_Sub2_Sub1 local1060 = new Class10_Sub2_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg7, arg1 + 4, local179);
						@Pc(1074) Class10_Sub2_Sub1 local1074 = new Class10_Sub2_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg7, local343, local179);
						if (local1060.method5451()) {
							local1060.method5446(arg11);
						}
						if (local1074.method5451()) {
							local1074.method5446(arg11);
						}
						local1094 = local1074;
						local646 = local1060;
					} else {
						local646 = new Class10_Sub2_Sub2(arg11, local33, 2, arg1 + 4, arg10, arg6, local160, local151, local168, arg2, arg8);
						local1094 = new Class10_Sub2_Sub2(arg11, local33, 2, local343, arg10, arg6, local160, local151, local168, arg2, arg8);
					}
					Static277.method4955(arg10, arg5, arg3, local646, local1094);
					if (local33.anInt1893 == 1 && arg4 && !arg2) {
						if (arg1 == 0) {
							Static268.aByteArrayArrayArray10[arg10][arg5][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3] | 0x1);
							Static268.aByteArrayArrayArray10[arg10][arg5][arg3 + 1] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3 + 1] | 0x2);
						} else if (arg1 == 1) {
							Static268.aByteArrayArrayArray10[arg10][arg5][arg3 + 1] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3 + 1] | 0x2);
							Static268.aByteArrayArrayArray10[arg10][arg5 + 1][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5 + 1][arg3] | 0x1);
						} else if (arg1 == 2) {
							Static268.aByteArrayArrayArray10[arg10][arg5 + 1][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5 + 1][arg3] | 0x1);
							Static268.aByteArrayArrayArray10[arg10][arg5][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3] | 0x2);
						} else if (arg1 == 3) {
							Static268.aByteArrayArrayArray10[arg10][arg5][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3] | 0x2);
							Static268.aByteArrayArrayArray10[arg10][arg5][arg3] = (byte) (Static268.aByteArrayArrayArray10[arg10][arg5][arg3] | 0x1);
						}
					}
					if (local33.anInt1881 != 0 && arg9 != null) {
						arg9.method330(arg7, !local33.aBoolean145, local33.aBoolean140, arg1, arg5, arg3);
					}
					if (local33.anInt1864 != 16) {
						Static303.method5267(arg10, arg5, arg3, local33.anInt1864);
					}
				} else if (arg7 == 3) {
					if (local215) {
						local644 = new Class10_Sub2_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg7, arg1, local179);
						if (local644.method5451()) {
							local644.method5446(arg11);
						}
						local646 = local644;
					} else {
						local646 = new Class10_Sub2_Sub2(arg11, local33, 3, arg1, arg10, arg6, local160, local151, local168, arg2, arg8);
					}
					Static277.method4955(arg10, arg5, arg3, local646, null);
					if (local33.aBoolean146 && arg4) {
						if (arg1 == 0) {
							local126.method2708(arg5, arg3 + 1, 50);
						} else if (arg1 == 1) {
							local126.method2708(arg5 + 1, arg3 + 1, 50);
						} else if (arg1 == 2) {
							local126.method2708(arg5 + 1, arg3, 50);
						} else if (arg1 == 3) {
							local126.method2708(arg5, arg3, 50);
						}
					}
					if (local33.anInt1881 != 0 && arg9 != null) {
						arg9.method330(arg7, !local33.aBoolean145, local33.aBoolean140, arg1, arg5, arg3);
					}
				} else if (arg7 == 9) {
					if (local215) {
						local311 = new Class10_Sub1_Sub4(arg11, local33, arg10, arg6, local160, local151, local168, arg2, arg5, arg5, arg3, arg3, arg7, arg1, local179);
						if (local311.method5451()) {
							local311.method5446(arg11);
						}
						local341 = local311;
					} else {
						local341 = new Class10_Sub1_Sub3(arg11, local33, arg7, arg1, arg10, arg6, local160, local151, local168, arg2, arg5, local51 + arg5 - 1, arg3, arg3 + local54 - 1, arg8);
					}
					Static189.method5292(local341, false);
					if (local33.anInt1881 != 0 && arg9 != null) {
						arg9.method336(!local33.aBoolean145, arg3, local54, local33.aBoolean140, local51, arg5);
					}
					if (local33.anInt1864 != 16) {
						Static303.method5267(arg10, arg5, arg3, local33.anInt1864);
					}
				} else {
					@Pc(1609) Class10_Sub4 local1609;
					if (arg7 == 4) {
						if (local215) {
							@Pc(1627) Class10_Sub4_Sub1 local1627 = new Class10_Sub4_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, 0, 0, 0, arg7, arg1);
							if (local1627.method5451()) {
								local1627.method5446(arg11);
							}
							local1609 = local1627;
						} else {
							local1609 = new Class10_Sub4_Sub2(arg11, local33, arg7, arg1, arg10, arg6, local160, local151, local168, arg2, 0, 0, 0, arg8);
						}
						Static246.method4473(arg10, arg5, arg3, local1609, null);
					} else {
						@Pc(1653) int local1653;
						@Pc(1659) Interface4 local1659;
						@Pc(1722) Class10_Sub4_Sub1 local1722;
						if (arg7 == 5) {
							local1653 = 16;
							local1659 = (Interface4) Static107.method1713(arg10, arg5, arg3);
							if (local1659 != null) {
								local1653 = Static129.method2097(local1659.method5445()).anInt1864;
							}
							if (local215) {
								local1722 = new Class10_Sub4_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, 0, local1653 * Static134.anIntArray269[arg1], Static334.anIntArray657[arg1] * local1653, arg7, arg1);
								if (local1722.method5451()) {
									local1722.method5446(arg11);
								}
								local1609 = local1722;
							} else {
								local1609 = new Class10_Sub4_Sub2(arg11, local33, arg7, arg1, arg10, arg6, local160, local151, local168, arg2, 0, Static134.anIntArray269[arg1] * local1653, Static334.anIntArray657[arg1] * local1653, arg8);
							}
							Static246.method4473(arg10, arg5, arg3, local1609, null);
						} else if (arg7 == 6) {
							local1653 = 8;
							local1659 = (Interface4) Static107.method1713(arg10, arg5, arg3);
							if (local1659 != null) {
								local1653 = Static129.method2097(local1659.method5445()).anInt1864 / 2;
							}
							if (local215) {
								local1722 = new Class10_Sub4_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg1, Static134.anIntArray269[arg1] * local1653, Static334.anIntArray657[arg1] * local1653, arg7, arg1 + 4);
								if (local1722.method5451()) {
									local1722.method5446(arg11);
								}
								local1609 = local1722;
							} else {
								local1609 = new Class10_Sub4_Sub2(arg11, local33, arg7, arg1 + 4, arg10, arg6, local160, local151, local168, arg2, arg1, Static66.anIntArray104[arg1] * local1653, Static347.anIntArray670[arg1] * local1653, arg8);
							}
							Static246.method4473(arg10, arg5, arg3, local1609, null);
						} else if (arg7 == 7) {
							local1653 = arg1 + 2 & 0x3;
							if (local215) {
								@Pc(1865) Class10_Sub4_Sub1 local1865 = new Class10_Sub4_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, local1653, 0, 0, arg7, local1653 + 4);
								local1609 = local1865;
								if (local1865.method5451()) {
									local1865.method5446(arg11);
								}
							} else {
								local1609 = new Class10_Sub4_Sub2(arg11, local33, arg7, local1653 + 4, arg10, arg6, local160, local151, local168, arg2, local1653, 0, 0, arg8);
							}
							Static246.method4473(arg10, arg5, arg3, local1609, null);
						} else if (arg7 == 8) {
							local343 = arg1 + 2 & 0x3;
							local408 = 8;
							@Pc(1921) Interface4 local1921 = (Interface4) Static107.method1713(arg10, arg5, arg3);
							if (local1921 != null) {
								local408 = Static129.method2097(local1921.method5445()).anInt1864 / 2;
							}
							@Pc(1962) Class10_Sub4 local1962;
							@Pc(1982) Class10_Sub4 local1982;
							if (local215) {
								local1962 = new Class10_Sub4_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg1, Static66.anIntArray104[arg1] * local408, local408 * Static347.anIntArray670[arg1], arg7, arg1 + 4);
								local1982 = new Class10_Sub4_Sub1(arg11, local33, arg6, local160, local151, local168, arg2, arg1, 0, 0, arg7, local343 + 4);
								if (local1962.method5451()) {
									local1962.method5446(arg11);
								}
								if (local1982.method5451()) {
									local1982.method5446(arg11);
								}
							} else {
								local1962 = new Class10_Sub4_Sub2(arg11, local33, arg7, arg1 + 4, arg10, arg6, local160, local151, local168, arg2, arg1, local408 * Static66.anIntArray104[arg1], Static347.anIntArray670[arg1] * local408, arg8);
								local1982 = new Class10_Sub4_Sub2(arg11, local33, arg7, local343 + 4, arg10, arg6, local160, local151, local168, arg2, arg1, 0, 0, arg8);
							}
							Static246.method4473(arg10, arg5, arg3, local1962, local1982);
						}
					}
				}
			}
		} else if (Static341.aBoolean543 || local33.anInt1863 != 0 || local33.anInt1881 == 1 || local33.aBoolean143) {
			@Pc(257) Class10_Sub3 local257;
			if (local215) {
				@Pc(272) Class10_Sub3_Sub2 local272 = new Class10_Sub3_Sub2(arg11, local33, arg6, local160, local151, local168, arg2, arg1, local179);
				if (local272.method5451()) {
					local272.method5446(arg11);
				}
				local257 = local272;
			} else {
				local257 = new Class10_Sub3_Sub1(arg11, local33, arg1, arg10, arg6, local160, local151, local168, arg2, arg8);
			}
			Static193.method3422(arg10, arg5, arg3, local257);
			if (local33.anInt1881 == 1 && arg9 != null) {
				arg9.method328(arg3, arg5);
			}
		}
	}
}
