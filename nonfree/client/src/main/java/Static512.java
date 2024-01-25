import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public static int anInt9218;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_89 = new Class77(66, 2);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!nj;Z)V")
	public static void method7596(@OriginalArg(0) Class12_Sub8_Sub2 arg0) {
		arg0.method5241();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static381.anInt7254; local12++) {
			local18 = Static496.anIntArray465[local12];
			if ((Static329.aByteArray84[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static329.aByteArray84[local18] = (byte) (Static329.aByteArray84[local18] | 0x2);
				} else {
					local43 = arg0.method5238(1);
					if (local43 == 0) {
						local10 = Static85.method1876(arg0);
						Static329.aByteArray84[local18] = (byte) (Static329.aByteArray84[local18] | 0x2);
					} else {
						Static479.method7195(arg0, local18);
					}
				}
			}
		}
		arg0.method5240();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5241();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static381.anInt7254; local18++) {
			local43 = Static496.anIntArray465[local18];
			if ((Static329.aByteArray84[local43] & 0x1) != 0) {
				if (local10 > 0) {
					Static329.aByteArray84[local43] = (byte) (Static329.aByteArray84[local43] | 0x2);
					local10--;
				} else {
					local124 = arg0.method5238(1);
					if (local124 == 0) {
						local10 = Static85.method1876(arg0);
						Static329.aByteArray84[local43] = (byte) (Static329.aByteArray84[local43] | 0x2);
					} else {
						Static479.method7195(arg0, local43);
					}
				}
			}
		}
		arg0.method5240();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5241();
		@Pc(201) int local201;
		for (local43 = 0; local43 < Static436.anInt8037; local43++) {
			local124 = Static153.anIntArray285[local43];
			if ((Static329.aByteArray84[local124] & 0x1) != 0) {
				if (local10 > 0) {
					Static329.aByteArray84[local124] = (byte) (Static329.aByteArray84[local124] | 0x2);
					local10--;
				} else {
					local201 = arg0.method5238(1);
					if (local201 == 0) {
						local10 = Static85.method1876(arg0);
						Static329.aByteArray84[local124] = (byte) (Static329.aByteArray84[local124] | 0x2);
					} else if (Static46.method865(local124, arg0)) {
						Static329.aByteArray84[local124] = (byte) (Static329.aByteArray84[local124] | 0x2);
					}
				}
			}
		}
		arg0.method5240();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5241();
		for (local124 = 0; local124 < Static436.anInt8037; local124++) {
			local201 = Static153.anIntArray285[local124];
			if ((Static329.aByteArray84[local201] & 0x1) == 0) {
				if (local10 > 0) {
					Static329.aByteArray84[local201] = (byte) (Static329.aByteArray84[local201] | 0x2);
					local10--;
				} else {
					@Pc(285) int local285 = arg0.method5238(1);
					if (local285 == 0) {
						local10 = Static85.method1876(arg0);
						Static329.aByteArray84[local201] = (byte) (Static329.aByteArray84[local201] | 0x2);
					} else if (Static46.method865(local201, arg0)) {
						Static329.aByteArray84[local201] = (byte) (Static329.aByteArray84[local201] | 0x2);
					}
				}
			}
		}
		arg0.method5240();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static381.anInt7254 = 0;
		Static436.anInt8037 = 0;
		for (local201 = 1; local201 < 2048; local201++) {
			Static329.aByteArray84[local201] = (byte) (Static329.aByteArray84[local201] >> 1);
			@Pc(350) Class30_Sub1_Sub1_Sub1 local350 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local201];
			if (local350 == null) {
				Static153.anIntArray285[Static436.anInt8037++] = local201;
			} else {
				Static496.anIntArray465[Static381.anInt7254++] = local201;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([[[Lclient!bo;IIZII)Z")
	public static boolean method7597(@OriginalArg(0) Class37[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(19) byte local19 = arg3 ? 1 : (byte) (Static491.anInt8889 & 0xFF);
		if (local19 == Static245.aByteArrayArrayArray19[Static56.anInt1418][arg2][arg4]) {
			return false;
		} else if ((Static387.aByteArrayArrayArray18[Static56.anInt1418][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			Static111.anIntArray218[0] = arg2;
			@Pc(54) int local54 = 0;
			@Pc(57) int local57 = local48 + 1;
			Static61.anIntArray140[0] = arg4;
			Static245.aByteArrayArrayArray19[Static56.anInt1418][arg2][arg4] = local19;
			while (local54 != local57) {
				@Pc(75) int local75 = Static111.anIntArray218[local54] & 0xFFFF;
				@Pc(83) int local83 = Static111.anIntArray218[local54] >> 16 & 0xFF;
				@Pc(91) int local91 = Static111.anIntArray218[local54] >> 24 & 0xFF;
				@Pc(97) int local97 = Static61.anIntArray140[local54] & 0xFFFF;
				@Pc(105) int local105 = Static61.anIntArray140[local54] >> 16 & 0xFF;
				local54 = local54 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static387.aByteArrayArrayArray18[Static56.anInt1418][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(127) boolean local127 = false;
				@Pc(166) int local166;
				@Pc(209) int local209;
				label231: for (@Pc(131) int local131 = Static56.anInt1418 + 1; local131 <= 3; local131++) {
					if ((Static387.aByteArrayArrayArray18[local131][local75][local97] & 0x8) == 0) {
						@Pc(307) Class30_Sub1 local307;
						@Pc(317) int local317;
						@Pc(296) Class37 local296;
						@Pc(302) Class243 local302;
						if (local113 && arg0[local131][local75][local97] != null) {
							if (arg0[local131][local75][local97].aClass30_Sub2_2 != null) {
								local166 = Static271.method4569(local83);
								if (local166 == arg0[local131][local75][local97].aClass30_Sub2_2.anInt9038 || arg0[local131][local75][local97].aClass30_Sub2_1 != null && arg0[local131][local75][local97].aClass30_Sub2_1.anInt9038 == local166) {
									continue;
								}
								if (local91 != 0) {
									local209 = Static271.method4569(local91);
									if (local209 == arg0[local131][local75][local97].aClass30_Sub2_2.anInt9038 || arg0[local131][local75][local97].aClass30_Sub2_1 != null && arg0[local131][local75][local97].aClass30_Sub2_1.anInt9038 == local209) {
										continue;
									}
								}
								if (local105 != 0) {
									local209 = Static271.method4569(local105);
									if (arg0[local131][local75][local97].aClass30_Sub2_2.anInt9038 == local209 || arg0[local131][local75][local97].aClass30_Sub2_1 != null && local209 == arg0[local131][local75][local97].aClass30_Sub2_1.anInt9038) {
										continue;
									}
								}
							}
							local296 = arg0[local131][local75][local97];
							if (local296.aClass243_3 != null) {
								for (local302 = local296.aClass243_3; local302 != null; local302 = local302.aClass243_11) {
									local307 = local302.aClass30_Sub1_2;
									if (local307 instanceof Interface19) {
										@Pc(313) Interface19 local313 = (Interface19) local307;
										local317 = local313.method7918();
										@Pc(321) int local321 = local313.method7919();
										if (local317 == 21) {
											local317 = 19;
										}
										@Pc(332) int local332 = local317 | local321 << 6;
										if (local332 == local83 || local91 != 0 && local91 == local332 || local105 != 0 && local332 == local105) {
											continue label231;
										}
									}
								}
							}
						}
						local296 = arg0[local131][local75][local97];
						if (local296 != null && local296.aClass243_3 != null) {
							for (local302 = local296.aClass243_3; local302 != null; local302 = local302.aClass243_11) {
								local307 = local302.aClass30_Sub1_2;
								if (local307.aShort115 != local307.aShort113 || local307.aShort112 != local307.aShort114) {
									for (@Pc(400) int local400 = local307.aShort115; local400 <= local307.aShort113; local400++) {
										for (local317 = local307.aShort112; local317 <= local307.aShort114; local317++) {
											Static245.aByteArrayArrayArray19[local131][local400][local317] = local19;
										}
									}
								}
							}
						}
						local127 = true;
						Static245.aByteArrayArrayArray19[local131][local75][local97] = local19;
					}
				}
				if (local127) {
					local166 = Static51.aClass215Array6[Static56.anInt1418 + 1].ba(local75, local97);
					if (local166 > Static475.anIntArray644[arg1]) {
						Static475.anIntArray644[arg1] = local166;
					}
					local209 = local75 << 7;
					if (local209 < Static138.anIntArray232[arg1]) {
						Static138.anIntArray232[arg1] = local209;
					} else if (Static487.anIntArray656[arg1] < local209) {
						Static487.anIntArray656[arg1] = local209;
					}
					@Pc(506) int local506 = local97 << 7;
					if (local506 < Static224.anIntArray633[arg1]) {
						Static224.anIntArray633[arg1] = local506;
					} else if (local506 > Static149.anIntArray245[arg1]) {
						Static149.anIntArray245[arg1] = local506;
					}
				}
				if (!local113) {
					if (local75 >= 1 && Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 - 1][local97] != local19) {
						Static111.anIntArray218[local57] = local75 - 1 | 0x120000 | 0xD3000000;
						Static61.anIntArray140[local57] = local97 | 0x130000;
						Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 - 1][local97] = local19;
						local57 = local57 + 1 & 0xFFF;
					}
					local97++;
					if (Static329.anInt6247 > local97) {
						if (local75 - 1 >= 0 && local19 != Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 - 1][local97] && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75][local97] & 0x4) == 0 && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static111.anIntArray218[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static61.anIntArray140[local57] = local97 | 0x130000;
							Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 - 1][local97] = local19;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static245.aByteArrayArrayArray19[Static56.anInt1418][local75][local97] != local19) {
							Static111.anIntArray218[local57] = local75 | 0x520000 | 0x13000000;
							Static61.anIntArray140[local57] = local97 | 0x530000;
							Static245.aByteArrayArrayArray19[Static56.anInt1418][local75][local97] = local19;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static37.anInt7512 > local75 + 1 && Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 + 1][local97] != local19 && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75][local97] & 0x4) == 0 && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static111.anIntArray218[local57] = local75 + 1 | 0x92000000 | 0x520000;
							Static61.anIntArray140[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 + 1][local97] = local19;
						}
					}
					local97--;
					if (local75 + 1 < Static37.anInt7512 && local19 != Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 + 1][local97]) {
						Static111.anIntArray218[local57] = local75 + 1 | 0x53000000 | 0x920000;
						Static61.anIntArray140[local57] = local97 | 0x930000;
						local57 = local57 + 1 & 0xFFF;
						Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 + 1][local97] = local19;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 - 1][local97] != local19 && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75][local97] & 0x4) == 0 && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static111.anIntArray218[local57] = local75 - 1 | 0xD20000 | 0x12000000;
							Static61.anIntArray140[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 - 1][local97] = local19;
						}
						if (Static245.aByteArrayArrayArray19[Static56.anInt1418][local75][local97] != local19) {
							Static111.anIntArray218[local57] = local75 | 0xD20000 | 0x93000000;
							Static61.anIntArray140[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static245.aByteArrayArrayArray19[Static56.anInt1418][local75][local97] = local19;
						}
						if (Static37.anInt7512 > local75 + 1 && local19 != Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 + 1][local97] && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75][local97] & 0x4) == 0 && (Static387.aByteArrayArrayArray18[Static56.anInt1418][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static111.anIntArray218[local57] = local75 + 1 | 0x920000 | 0xD2000000;
							Static61.anIntArray140[local57] = local97 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static245.aByteArrayArrayArray19[Static56.anInt1418][local75 + 1][local97] = local19;
						}
					}
				}
			}
			if (Static475.anIntArray644[arg1] != -1000000) {
				Static475.anIntArray644[arg1] += 10;
				Static138.anIntArray232[arg1] -= 50;
				Static487.anIntArray656[arg1] += 50;
				Static149.anIntArray245[arg1] += 50;
				Static224.anIntArray633[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!as;Lclient!as;)V")
	public static void method7599(@OriginalArg(1) Class12_Sub4 arg0, @OriginalArg(2) Class12_Sub4 arg1) {
		if (arg0.aClass12_Sub4_60 != null) {
			arg0.method7959();
		}
		arg0.aClass12_Sub4_60 = arg1;
		arg0.aClass12_Sub4_59 = arg1.aClass12_Sub4_59;
		arg0.aClass12_Sub4_60.aClass12_Sub4_59 = arg0;
		arg0.aClass12_Sub4_59.aClass12_Sub4_60 = arg0;
	}
}
