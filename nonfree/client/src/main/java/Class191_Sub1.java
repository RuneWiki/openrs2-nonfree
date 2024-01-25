import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class191_Sub1 extends Class191 {

	@OriginalMember(owner = "client!th", name = "X", descriptor = "I")
	public int anInt6986 = 99;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIZ)V")
	public Class191_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static133.aClass59_1, Static240.aClass121_3);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLclient!ue;IIILclient!qa;)V")
	public void method5581(@OriginalArg(0) int arg0, @OriginalArg(2) Class253 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5) {
		@Pc(7) Interface12 local7 = null;
		if (arg0 == 0) {
			local7 = (Interface12) Static278.method4397(arg4, arg3, arg2);
		}
		if (arg0 == 1) {
			local7 = (Interface12) Static177.method3233(arg4, arg3, arg2);
		}
		if (arg0 == 2) {
			local7 = (Interface12) Static422.method5870(arg4, arg3, arg2, wo.class);
		}
		if (arg0 == 3) {
			local7 = (Interface12) Static241.method4021(arg4, arg3, arg2);
		}
		if (local7 == null) {
			return;
		}
		@Pc(68) Class139 local68 = Static146.aClass228_1.method5203(local7.method6320());
		@Pc(72) int local72 = local7.method6318();
		@Pc(78) int local78 = local7.method6316();
		if (local68.method3760()) {
			Static60.method1398(arg4, local68, arg3, arg2);
		}
		if (local7.method6319()) {
			local7.method6321(arg5);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				@Pc(108) Class11_Sub3 local108 = Static177.method3233(arg4, arg3, arg2);
				if (local108 instanceof Class11_Sub3_Sub2) {
					((Class11_Sub3_Sub2) local108).aClass11_Sub3_3 = null;
					return;
				}
				Static254.method4164(arg4, arg3, arg2);
				return;
			}
			if (arg0 == 2) {
				@Pc(137) Class11_Sub5 local137 = Static422.method5870(arg4, arg3, arg2, wo.class);
				if (local137 instanceof Class11_Sub5_Sub5 && local137.aShort95 == arg3 && local137.aShort93 == arg2) {
					((Class11_Sub5_Sub5) local137).aClass11_Sub5_2 = null;
				} else {
					Static76.method1645(arg4, arg3, arg2, wo.class);
				}
				if (local68.anInt4367 != 0 && arg3 + local68.anInt4353 < super.anInt6959 && local68.anInt4353 + arg2 < super.anInt6958 && local68.anInt4350 + arg3 < super.anInt6959 && super.anInt6958 > local68.anInt4350 + arg2) {
					arg1.method5736(!local68.aBoolean288, local68.anInt4350, arg3, arg2, local68.anInt4353, local78, local68.aBoolean284);
					return;
				}
			} else if (arg0 == 3) {
				@Pc(233) Class11_Sub1 local233 = Static241.method4021(arg4, arg3, arg2);
				if (local233 instanceof Class11_Sub1_Sub2) {
					((Class11_Sub1_Sub2) local233).aClass11_Sub1_1 = null;
				} else {
					Static343.method4798(arg4, arg3, arg2);
				}
				if (local68.anInt4367 != 1) {
					return;
				}
				arg1.method5737(arg2, arg3);
			} else {
				return;
			}
			return;
		}
		@Pc(263) Class11_Sub2 local263 = Static278.method4397(arg4, arg3, arg2);
		if (local263 instanceof Class11_Sub2_Sub2) {
			((Class11_Sub2_Sub2) local263).aClass11_Sub2_3 = null;
		} else {
			Static29.method6226(arg4, arg3, arg2);
		}
		if (local68.anInt4367 != 0) {
			arg1.method5739(local78, arg2, !local68.aBoolean288, local72, local68.aBoolean284, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!ue;IBIIIILclient!qa;I)V")
	public void method5582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class253 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class30 arg8, @OriginalArg(10) int arg9) {
		if (!Static157.aClass185_Sub1_1.method4639(Static192.anInt3828) && !Static404.method5662(arg3, arg4, arg9, Static238.anInt4697)) {
			return;
		}
		if (this.anInt6986 > arg0) {
			this.anInt6986 = arg0;
		}
		@Pc(34) Class139 local34 = Static146.aClass228_1.method5203(arg1);
		if (arg8.method2090() && Static157.aClass185_Sub1_1.aBoolean405 && local34.aBoolean279) {
			return;
		}
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg5 == 1 || arg5 == 3) {
			local60 = local34.anInt4350;
			local57 = local34.anInt4353;
		} else {
			local57 = local34.anInt4350;
			local60 = local34.anInt4353;
		}
		@Pc(85) int local85;
		@Pc(93) int local93;
		if (local60 + arg3 <= super.anInt6959) {
			local85 = arg3 + (local60 >> 1);
			local93 = (local60 + 1 >> 1) + arg3;
		} else {
			local93 = arg3 + 1;
			local85 = arg3;
		}
		@Pc(117) int local117;
		@Pc(115) int local115;
		if (local57 + arg9 > super.anInt6958) {
			local115 = arg9 + 1;
			local117 = arg9;
		} else {
			local115 = (local57 + 1 >> 1) + arg9;
			local117 = arg9 + (local57 >> 1);
		}
		@Pc(137) Class14 local137 = Static389.aClass14Array3[arg4];
		@Pc(161) int local161 = local137.oa(local85, local117) + local137.oa(local93, local117) + local137.oa(local85, local115) + local137.oa(local93, local115) >> 2;
		@Pc(169) int local169 = (local60 << 6) + (arg3 << 7);
		@Pc(178) int local178 = (arg9 << 7) + (local57 << 6);
		@Pc(190) boolean local190 = Static39.aBoolean63 && !super.aBoolean513 && local34.aBoolean276;
		if (local34.method3760()) {
			Static456.method6201(arg3, arg0, null, arg5, arg9, local34, null);
		}
		@Pc(224) boolean local224 = arg7 == -1 && local34.anInt4395 == -1 && local34.anIntArray340 == null && local34.anIntArray344 == null && !local34.aBoolean278;
		if (Static358.aBoolean465 && (Static101.method1903(arg6) && local34.anInt4390 != 1 || !(!Static39.method814(arg6) || local34.anInt4390 != 0))) {
			return;
		}
		if (arg6 != 22) {
			@Pc(378) Class11_Sub5 local378;
			@Pc(346) Class11_Sub5_Sub1 local346;
			@Pc(350) int local350;
			if (arg6 == 10 || arg6 == 11) {
				local346 = null;
				if (local224) {
					@Pc(409) Class11_Sub5_Sub1 local409 = new Class11_Sub5_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg3, local60 + arg3 - 1, arg9, arg9 + local57 - 1, arg6, arg5, local190);
					local350 = local409.method2737();
					local346 = local409;
					local378 = local409;
				} else {
					local350 = 15;
					local378 = new Class11_Sub5_Sub4(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg3, local60 + arg3 - 1, arg9, local57 + arg9 - 1, arg6, arg5, arg7);
				}
				@Pc(430) Class11_Sub5 local430 = Static422.method5870(arg0, arg3, arg9, wo.class);
				@Pc(432) boolean local432 = false;
				if (local430 instanceof Class11_Sub5_Sub5 && arg3 == local430.aShort95 && arg9 == local430.aShort93) {
					local432 = true;
					((Class11_Sub5_Sub5) local430).aClass11_Sub5_2 = local378;
				}
				if (local432 || Static72.method1589(local378, false)) {
					if (local346 != null && local346.method6319()) {
						local346.method6314(arg8);
					}
					if (local34.aBoolean283 && Static39.aBoolean63) {
						if (local350 > 30) {
							local350 = 30;
						}
						for (@Pc(481) int local481 = 0; local481 <= local60; local481++) {
							for (@Pc(485) int local485 = 0; local485 <= local57; local485++) {
								local137.m(arg3 + local481, arg9 - -local485, local350);
							}
						}
					}
				}
				if (local34.anInt4367 != 0 && arg2 != null) {
					arg2.method5726(local34.aBoolean284, local60, arg3, !local34.aBoolean288, local57, arg9);
				}
			} else {
				@Pc(631) Class11_Sub5 local631;
				if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
					if (local224) {
						local346 = new Class11_Sub5_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg3, arg3 + local60 - 1, arg9, local57 + arg9 - 1, arg6, arg5, local190);
						local378 = local346;
						if (local346.method6319()) {
							local346.method6314(arg8);
						}
					} else {
						local378 = new Class11_Sub5_Sub4(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg3, arg3 + local60 - 1, arg9, local57 + arg9 - 1, arg6, arg5, arg7);
					}
					local631 = Static422.method5870(arg0, arg3, arg9, wo.class);
					if (local631 instanceof Class11_Sub5_Sub5 && local631.aShort95 == arg3 && arg9 == local631.aShort93) {
						((Class11_Sub5_Sub5) local631).aClass11_Sub5_2 = local378;
					} else {
						Static72.method1589(local378, false);
					}
					if (Static39.aBoolean63 && !super.aBoolean513 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0 && local34.anInt4390 != 0) {
						super.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9] | 0x4);
					}
					if (local34.anInt4367 != 0 && arg2 != null) {
						arg2.method5726(local34.aBoolean284, local60, arg3, !local34.aBoolean288, local57, arg9);
					}
				} else {
					@Pc(762) Class11_Sub2 local762;
					if (arg6 == 0) {
						@Pc(727) int local727 = local34.anInt4390;
						if (Static336.aBoolean448 && local34.anInt4390 == -1) {
							local727 = 1;
						}
						if (local224) {
							@Pc(752) Class11_Sub2_Sub3 local752 = new Class11_Sub2_Sub3(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5, local190);
							if (local752.method6319()) {
								local752.method6314(arg8);
							}
							local762 = local752;
						} else {
							local762 = new Class11_Sub2_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5, arg7);
						}
						@Pc(785) Class11_Sub2 local785 = Static278.method4397(arg0, arg3, arg9);
						if (local785 instanceof Class11_Sub2_Sub2) {
							((Class11_Sub2_Sub2) local785).aClass11_Sub2_3 = local762;
						} else {
							Static381.method5402(arg0, arg3, arg9, local762, null);
						}
						if (Static39.aBoolean63) {
							if (arg5 == 0) {
								if (local34.aBoolean283) {
									local137.m(arg3, arg9, 50);
									local137.m(arg3, arg9 + 1, 50);
								}
								if (local727 == 1 && !super.aBoolean513) {
									super.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9] | 0x1);
								}
							} else if (arg5 == 1) {
								if (local34.aBoolean283) {
									local137.m(arg3, arg9 + 1, 50);
									local137.m(arg3 + 1, arg9 + 1, 50);
								}
								if (local727 == 1 && !super.aBoolean513) {
									super.aByteArrayArrayArray11[arg0][arg3][arg9 + 1] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9 + 1] | 0x2);
								}
							} else if (arg5 == 2) {
								if (local34.aBoolean283) {
									local137.m(arg3 + 1, arg9, 50);
									local137.m(arg3 + 1, arg9 - -1, 50);
								}
								if (local727 == 1 && !super.aBoolean513) {
									super.aByteArrayArrayArray11[arg0][arg3 + 1][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3 + 1][arg9] | 0x1);
								}
							} else if (arg5 == 3) {
								if (local34.aBoolean283) {
									local137.m(arg3, arg9, 50);
									local137.m(arg3 + 1, arg9, 50);
								}
								if (local727 == 1 && !super.aBoolean513) {
									super.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9] | 0x2);
								}
							}
						}
						if (local34.anInt4367 != 0 && arg2 != null) {
							arg2.method5733(!local34.aBoolean288, arg3, arg6, arg9, local34.aBoolean284, arg5);
						}
						if (local34.anInt4400 != 16) {
							Static131.method1831(arg0, arg3, arg9, local34.anInt4400);
						}
					} else {
						@Pc(1069) Class11_Sub2_Sub3 local1069;
						@Pc(1052) Class11_Sub2 local1052;
						if (arg6 == 1) {
							if (local224) {
								local1069 = new Class11_Sub2_Sub3(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5, local190);
								if (local1069.method6319()) {
									local1069.method6314(arg8);
								}
								local1052 = local1069;
							} else {
								local1052 = new Class11_Sub2_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5, arg7);
							}
							local762 = Static278.method4397(arg0, arg3, arg9);
							if (local762 instanceof Class11_Sub2_Sub2) {
								((Class11_Sub2_Sub2) local762).aClass11_Sub2_3 = local1052;
							} else {
								Static381.method5402(arg0, arg3, arg9, local1052, null);
							}
							if (local34.aBoolean283 && Static39.aBoolean63) {
								if (arg5 == 0) {
									local137.m(arg3, arg9 + 1, 50);
								} else if (arg5 == 1) {
									local137.m(arg3 + 1, arg9 + 1, 50);
								} else if (arg5 == 2) {
									local137.m(arg3 + 1, arg9, 50);
								} else if (arg5 == 3) {
									local137.m(arg3, arg9, 50);
								}
							}
							if (local34.anInt4367 != 0 && arg2 != null) {
								arg2.method5733(!local34.aBoolean288, arg3, arg6, arg9, local34.aBoolean284, arg5);
							}
						} else if (arg6 == 2) {
							local350 = arg5 + 1 & 0x3;
							if (local224) {
								@Pc(1207) Class11_Sub2_Sub3 local1207 = new Class11_Sub2_Sub3(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5 + 4, local190);
								@Pc(1222) Class11_Sub2_Sub3 local1222 = new Class11_Sub2_Sub3(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg6, local350, local190);
								if (local1207.method6319()) {
									local1207.method6314(arg8);
								}
								local762 = local1222;
								if (local1222.method6319()) {
									local1222.method6314(arg8);
								}
								local1052 = local1207;
							} else {
								local1052 = new Class11_Sub2_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5 + 4, arg7);
								local762 = new Class11_Sub2_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg6, local350, arg7);
							}
							Static381.method5402(arg0, arg3, arg9, local1052, local762);
							if (local34.anInt4390 == 1 && Static39.aBoolean63 && !super.aBoolean513) {
								if (arg5 == 0) {
									super.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9] | 0x1);
									super.aByteArrayArrayArray11[arg0][arg3][arg9 + 1] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9 + 1] | 0x2);
								} else if (arg5 == 1) {
									super.aByteArrayArrayArray11[arg0][arg3][arg9 + 1] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9 + 1] | 0x2);
									super.aByteArrayArrayArray11[arg0][arg3 + 1][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3 + 1][arg9] | 0x1);
								} else if (arg5 == 2) {
									super.aByteArrayArrayArray11[arg0][arg3 + 1][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3 + 1][arg9] | 0x1);
									super.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9] | 0x2);
								} else if (arg5 == 3) {
									super.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9] | 0x2);
									super.aByteArrayArrayArray11[arg0][arg3][arg9] = (byte) (super.aByteArrayArrayArray11[arg0][arg3][arg9] | 0x1);
								}
							}
							if (local34.anInt4367 != 0 && arg2 != null) {
								arg2.method5733(!local34.aBoolean288, arg3, arg6, arg9, local34.aBoolean284, arg5);
							}
							if (local34.anInt4400 != 16) {
								Static131.method1831(arg0, arg3, arg9, local34.anInt4400);
							}
						} else if (arg6 == 3) {
							if (local224) {
								local1069 = new Class11_Sub2_Sub3(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5, local190);
								local1052 = local1069;
								if (local1069.method6319()) {
									local1069.method6314(arg8);
								}
							} else {
								local1052 = new Class11_Sub2_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg6, arg5, arg7);
							}
							local762 = Static278.method4397(arg0, arg3, arg9);
							if (local762 instanceof Class11_Sub2_Sub2) {
								((Class11_Sub2_Sub2) local762).aClass11_Sub2_3 = local1052;
							} else {
								Static381.method5402(arg0, arg3, arg9, local1052, null);
							}
							if (local34.aBoolean283 && Static39.aBoolean63) {
								if (arg5 == 0) {
									local137.m(arg3, arg9 + 1, 50);
								} else if (arg5 == 1) {
									local137.m(arg3 + 1, arg9 + 1, 50);
								} else if (arg5 == 2) {
									local137.m(arg3 + 1, arg9, 50);
								} else if (arg5 == 3) {
									local137.m(arg3, arg9, 50);
								}
							}
							if (local34.anInt4367 != 0 && arg2 != null) {
								arg2.method5733(!local34.aBoolean288, arg3, arg6, arg9, local34.aBoolean284, arg5);
							}
						} else if (arg6 == 9) {
							if (local224) {
								local346 = new Class11_Sub5_Sub1(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg3, arg3, arg9, arg9, arg6, arg5, local190);
								if (local346.method6319()) {
									local346.method6314(arg8);
								}
								local378 = local346;
							} else {
								local378 = new Class11_Sub5_Sub4(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg3, arg3 + local60 - 1, arg9, local57 + arg9 - 1, arg6, arg5, arg7);
							}
							local631 = Static422.method5870(arg0, arg3, arg9, wo.class);
							if (local631 instanceof Class11_Sub5_Sub5 && arg3 == local631.aShort95 && arg9 == local631.aShort93) {
								((Class11_Sub5_Sub5) local631).aClass11_Sub5_2 = local378;
							} else {
								Static72.method1589(local378, false);
							}
							if (local34.anInt4367 != 0 && arg2 != null) {
								arg2.method5726(local34.aBoolean284, local60, arg3, !local34.aBoolean288, local57, arg9);
							}
							if (local34.anInt4400 != 16) {
								Static131.method1831(arg0, arg3, arg9, local34.anInt4400);
							}
						} else {
							@Pc(1835) Class11_Sub3 local1835;
							if (arg6 == 4) {
								if (local224) {
									@Pc(1825) Class11_Sub3_Sub1 local1825 = new Class11_Sub3_Sub1(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, 0, 0, 0, arg6, arg5);
									if (local1825.method6319()) {
										local1825.method6314(arg8);
									}
									local1835 = local1825;
								} else {
									local1835 = new Class11_Sub3_Sub3(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, 0, 0, 0, arg6, arg5, arg7);
								}
								@Pc(1861) Class11_Sub3 local1861 = Static177.method3233(arg0, arg3, arg9);
								if (local1861 instanceof Class11_Sub3_Sub2) {
									((Class11_Sub3_Sub2) local1861).aClass11_Sub3_3 = local1835;
								} else {
									Static164.method2905(arg0, arg3, arg9, local1835, null);
								}
							} else {
								@Pc(1883) int local1883;
								@Pc(1889) Interface12 local1889;
								@Pc(1928) Class11_Sub3_Sub1 local1928;
								@Pc(1972) Class11_Sub3 local1972;
								if (arg6 == 5) {
									local1883 = 17;
									local1889 = (Interface12) Static278.method4397(arg0, arg3, arg9);
									if (local1889 != null) {
										local1883 = Static146.aClass228_1.method5203(local1889.method6320()).anInt4400 + 1;
									}
									if (local224) {
										local1928 = new Class11_Sub3_Sub1(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, 0, local1883 * Static278.anIntArray402[arg5], local1883 * Static280.anIntArray407[arg5], arg6, arg5);
										local1835 = local1928;
										if (local1928.method6319()) {
											local1928.method6314(arg8);
										}
									} else {
										local1835 = new Class11_Sub3_Sub3(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, 0, local1883 * Static278.anIntArray402[arg5], local1883 * Static280.anIntArray407[arg5], arg6, arg5, arg7);
									}
									local1972 = Static177.method3233(arg0, arg3, arg9);
									if (local1972 instanceof Class11_Sub3_Sub2) {
										((Class11_Sub3_Sub2) local1972).aClass11_Sub3_3 = local1835;
									} else {
										Static164.method2905(arg0, arg3, arg9, local1835, null);
									}
								} else if (arg6 == 6) {
									local1883 = 9;
									local1889 = (Interface12) Static278.method4397(arg0, arg3, arg9);
									if (local1889 != null) {
										local1883 = Static146.aClass228_1.method5203(local1889.method6320()).anInt4400 / 2 + 1;
									}
									if (local224) {
										local1928 = new Class11_Sub3_Sub1(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg5, local1883 * Static278.anIntArray402[arg5], Static280.anIntArray407[arg5] * local1883, arg6, arg5 + 4);
										local1835 = local1928;
										if (local1928.method6319()) {
											local1928.method6314(arg8);
										}
									} else {
										local1835 = new Class11_Sub3_Sub3(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg5, Static171.anIntArray273[arg5] * local1883, local1883 * Static387.anIntArray543[arg5], arg6, arg5 + 4, arg7);
									}
									local1972 = Static177.method3233(arg0, arg3, arg9);
									if (local1972 instanceof Class11_Sub3_Sub2) {
										((Class11_Sub3_Sub2) local1972).aClass11_Sub3_3 = local1835;
									} else {
										Static164.method2905(arg0, arg3, arg9, local1835, null);
									}
								} else if (arg6 == 7) {
									local1883 = arg5 + 2 & 0x3;
									if (local224) {
										@Pc(2157) Class11_Sub3_Sub1 local2157 = new Class11_Sub3_Sub1(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, local1883, 0, 0, arg6, local1883 + 4);
										if (local2157.method6319()) {
											local2157.method6314(arg8);
										}
										local1835 = local2157;
									} else {
										local1835 = new Class11_Sub3_Sub3(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, local1883, 0, 0, arg6, local1883 + 4, arg7);
									}
									@Pc(2172) Class11_Sub3 local2172 = Static177.method3233(arg0, arg3, arg9);
									if (local2172 instanceof Class11_Sub3_Sub2) {
										((Class11_Sub3_Sub2) local2172).aClass11_Sub3_3 = local1835;
									} else {
										Static164.method2905(arg0, arg3, arg9, local1835, null);
									}
								} else if (arg6 == 8) {
									local350 = arg5 + 2 & 0x3;
									@Pc(2203) int local2203 = 9;
									@Pc(2209) Interface12 local2209 = (Interface12) Static278.method4397(arg0, arg3, arg9);
									if (local2209 != null) {
										local2203 = Static146.aClass228_1.method5203(local2209.method6320()).anInt4400 / 2 + 1;
									}
									@Pc(2252) Class11_Sub3 local2252;
									@Pc(2271) Class11_Sub3 local2271;
									if (local224) {
										local2252 = new Class11_Sub3_Sub1(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg5, local2203 * Static171.anIntArray273[arg5], Static387.anIntArray543[arg5] * local2203, arg6, arg5 + 4);
										local2271 = new Class11_Sub3_Sub1(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg5, 0, 0, arg6, local350 + 4);
										if (local2252.method6319()) {
											local2252.method6314(arg8);
										}
										if (local2271.method6319()) {
											local2271.method6314(arg8);
										}
									} else {
										local2252 = new Class11_Sub3_Sub3(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg5, local2203 * Static171.anIntArray273[arg5], local2203 * Static387.anIntArray543[arg5], arg6, arg5 + 4, arg7);
										local2271 = new Class11_Sub3_Sub3(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg5, 0, 0, arg6, local350 + 4, arg7);
									}
									Static164.method2905(arg0, arg3, arg9, local2252, local2271);
								}
							}
						}
					}
				}
			}
		} else if (Static157.aClass185_Sub1_1.aBoolean400 || local34.anInt4358 != 0 || local34.anInt4367 == 1 || local34.aBoolean280) {
			@Pc(281) Class11_Sub1 local281;
			if (local224) {
				@Pc(297) Class11_Sub1_Sub1 local297 = new Class11_Sub1_Sub1(arg8, local34, arg4, local169, local161, local178, super.aBoolean513, arg5, local190);
				local281 = local297;
				if (local297.method6319()) {
					local297.method6314(arg8);
				}
			} else {
				local281 = new Class11_Sub1_Sub3(arg8, local34, arg0, arg4, local169, local161, local178, super.aBoolean513, arg5, arg7);
			}
			@Pc(312) Class11_Sub1 local312 = Static241.method4021(arg0, arg3, arg9);
			if (local312 instanceof Class11_Sub1_Sub2) {
				((Class11_Sub1_Sub2) local312).aClass11_Sub1_1 = local281;
			} else {
				Static106.method6190(arg0, arg3, arg9, local281);
			}
			if (local34.anInt4367 == 1 && arg2 != null) {
				arg2.method5740(arg3, arg9);
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([IILclient!wn;ILclient!qa;IBIIII)V")
	public void method5583(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class30 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean513) {
			return;
		}
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(24) Class169 local24 = null;
		@Pc(30) int local30 = (arg8 & 0x7) * 8;
		@Pc(36) int local36 = (arg6 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					@Pc(41) int local41;
					@Pc(82) int local82;
					@Pc(411) int local411;
					@Pc(118) int local118;
					while (arg2.aByteArray77.length > arg2.anInt5526) {
						local41 = arg2.method4614();
						if (local41 == 0) {
							local24 = new Class169(arg2);
						} else {
							@Pc(256) int local256;
							@Pc(133) int local133;
							@Pc(137) int local137;
							@Pc(171) int local171;
							if (local41 == 1) {
								local82 = arg2.method4614();
								if (local82 > 0) {
									for (local411 = 0; local411 < local82; local411++) {
										@Pc(420) Class153 local420 = new Class153(arg4, arg2, 0);
										if (local420.anInt4678 == 31) {
											@Pc(431) Class5 local431 = Static75.aClass207_1.method4882(arg2.method4560());
											local420.method3996(local431.anInt46, local431.anInt44, local431.anInt51, local431.anInt52);
										}
										if (arg4.method2104() > 0) {
											@Pc(448) Class4_Sub17 local448 = local420.aClass4_Sub17_2;
											local256 = local448.method6165() >> 7;
											local133 = local448.method6161() >> 7;
											if (local420.anInt4679 == arg5 && local256 >= local30 && local256 < local30 + 8 && local133 >= local36 && local133 < local36 + 8) {
												local137 = Static233.method3942(arg3, local448.method6161() & 0x3FF, local448.method6165() & 0x3FF) + (arg9 << 7);
												local171 = (arg1 << 7) + Static135.method2511(local448.method6161() & 0x3FF, local448.method6165() & 0x3FF, arg3);
												local256 = local137 >> 7;
												local133 = local171 >> 7;
												if (local256 >= 0 && local133 >= 0 && local256 < super.anInt6959 && local133 < super.anInt6958) {
													local448.method6157(local171, local137, super.anIntArrayArrayArray12[arg5][local256][local133] - local448.method6162());
													Static112.method2199(local420);
												}
											}
										}
									}
								}
							} else if (local41 == 2) {
								if (local24 == null) {
									local24 = new Class169();
								}
								local24.method4247(arg2);
							} else if (local41 != 128) {
								if (local41 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray13 == null) {
									super.aByteArrayArrayArray13 = new byte[4][][];
								}
								for (local82 = 0; local82 < 4; local82++) {
									@Pc(88) byte local88 = arg2.method4576();
									@Pc(122) int local122;
									if (local88 == 0 && super.aByteArrayArrayArray13[arg7] != null) {
										if (local82 <= arg5) {
											local118 = arg9;
											local122 = arg9 + 7;
											local256 = arg1;
											if (arg1 < 0) {
												local256 = 0;
											} else if (arg1 >= super.anInt6958) {
												local256 = super.anInt6958;
											}
											if (local122 < 0) {
												local122 = 0;
											} else if (super.anInt6959 <= local122) {
												local122 = super.anInt6959;
											}
											local133 = arg1 + 7;
											if (arg9 < 0) {
												local118 = 0;
											} else if (arg9 >= super.anInt6959) {
												local118 = super.anInt6959;
											}
											if (local133 < 0) {
												local133 = 0;
											} else if (local133 >= super.anInt6958) {
												local133 = super.anInt6958;
											}
											while (local118 < local122) {
												while (local133 > local256) {
													super.aByteArrayArrayArray13[arg7][local118][local256] = 0;
													local256++;
												}
												local118++;
											}
										}
									} else if (local88 == 1) {
										if (super.aByteArrayArrayArray13[arg7] == null) {
											super.aByteArrayArrayArray13[arg7] = new byte[super.anInt6959 + 1][super.anInt6958 + 1];
										}
										for (local118 = 0; local118 < 64; local118 += 4) {
											for (local122 = 0; local122 < 64; local122 += 4) {
												@Pc(128) byte local128 = arg2.method4576();
												if (local82 <= arg5) {
													for (local133 = local118; local133 < local118 + 4; local133++) {
														for (local137 = local122; local137 < local122 + 4; local137++) {
															if (local30 <= local133 && local30 + 8 > local133 && local137 >= local36 && local36 + 8 > local36) {
																local171 = Static250.method4108(arg3, local133 & 0x7, local137 & 0x7) + arg9;
																@Pc(184) int local184 = arg1 + Static443.method6061(local137 & 0x7, arg3, local133 & 0x7);
																if (local171 >= 0 && super.anInt6959 > local171 && local184 >= 0 && super.anInt6958 > local184) {
																	super.aByteArrayArrayArray13[arg7][local171][local184] = local128;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg0 == null) {
								arg2.anInt5526 += 10;
							} else {
								arg0[0] = arg2.method4560();
								arg0[1] = arg2.method4586();
								arg0[2] = arg2.method4586();
								arg0[3] = arg2.method4586();
								arg0[4] = arg2.method4560();
							}
						}
					}
					if (local24 != null) {
						Static387.method5426(local24, arg1 >> 3, arg9 >> 3);
					}
					if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg7] != null) {
						local41 = arg9 + 7;
						local82 = arg1 + 7;
						for (local411 = arg9; local411 < local41; local411++) {
							for (local118 = arg1; local118 < local82; local118++) {
								super.aByteArrayArrayArray13[arg7][local411][local118] = 0;
							}
						}
						return;
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method5584(@OriginalArg(0) Class30 arg0) {
		Static234.method3953(arg0);
		@Pc(20) int local20;
		@Pc(24) int local24;
		if (super.anInt6970 > 1) {
			for (local20 = 0; super.anInt6959 > local20; local20++) {
				for (local24 = 0; super.anInt6958 > local24; local24++) {
					if ((Static398.aByteArrayArrayArray17[1][local20][local24] & 0x2) == 2) {
						Static156.method5965(local20, local24);
					}
				}
			}
		}
		for (local20 = 0; super.anInt6970 > local20; local20++) {
			for (local24 = 0; local24 <= super.anInt6958; local24++) {
				for (@Pc(68) int local68 = 0; super.anInt6959 >= local68; local68++) {
					@Pc(86) int local86;
					@Pc(88) int local88;
					@Pc(90) int local90;
					@Pc(137) int local137;
					@Pc(141) int local141;
					@Pc(243) int local243;
					@Pc(252) int local252;
					@Pc(272) int local272;
					@Pc(276) int local276;
					if ((super.aByteArrayArrayArray11[local20][local68][local24] & 0x1) != 0) {
						local86 = local24;
						local88 = local24;
						local90 = local20;
						while (local86 > 0 && (super.aByteArrayArrayArray11[local20][local68][local86 - 1] & 0x1) != 0) {
							local86--;
						}
						while (local88 < super.anInt6958 && (super.aByteArrayArrayArray11[local20][local68][local88 + 1] & 0x1) != 0) {
							local88++;
						}
						local137 = local20;
						label164: while (local90 > 0) {
							for (local141 = local86; local141 <= local88; local141++) {
								if ((super.aByteArrayArrayArray11[local90 - 1][local68][local141] & 0x1) == 0) {
									break label164;
								}
							}
							local90--;
						}
						label153: while (local137 < 3) {
							for (local141 = local86; local141 <= local88; local141++) {
								if ((super.aByteArrayArrayArray11[local137 + 1][local68][local141] & 0x1) == 0) {
									break label153;
								}
							}
							local137++;
						}
						local141 = (local88 + 1 - local86) * (local137 + 1 - local90);
						if (local141 >= 2) {
							local243 = super.anIntArrayArrayArray12[local137][local68][local86] - 240;
							local252 = super.anIntArrayArrayArray12[local90][local68][local86];
							Static412.method5720(1, local68 << 7, local68 << 7, local86 << 7, (local88 << 7) + 128, local243, local252);
							for (local272 = local90; local272 <= local137; local272++) {
								for (local276 = local86; local276 <= local88; local276++) {
									super.aByteArrayArrayArray11[local272][local68][local276] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local20][local68][local24] & 0x2) != 0) {
						local86 = local68;
						local88 = local68;
						local90 = local20;
						local137 = local20;
						while (local88 < super.anInt6959 && (super.aByteArrayArrayArray11[local20][local88 + 1][local24] & 0x2) != 0) {
							local88++;
						}
						while (local86 > 0 && (super.aByteArrayArrayArray11[local20][local86 - 1][local24] & 0x2) != 0) {
							local86--;
						}
						label218: while (local90 > 0) {
							for (local141 = local86; local141 <= local88; local141++) {
								if ((super.aByteArrayArrayArray11[local90 - 1][local141][local24] & 0x2) == 0) {
									break label218;
								}
							}
							local90--;
						}
						label207: while (local137 < 3) {
							for (local141 = local86; local141 <= local88; local141++) {
								if ((super.aByteArrayArrayArray11[local137 + 1][local141][local24] & 0x2) == 0) {
									break label207;
								}
							}
							local137++;
						}
						local141 = (local137 + 1 - local90) * (local88 + 1 - local86);
						if (local141 >= 2) {
							local243 = super.anIntArrayArrayArray12[local137][local86][local24] - 240;
							local252 = super.anIntArrayArrayArray12[local90][local86][local24];
							Static412.method5720(2, local86 << 7, (local88 << 7) + 128, local24 << 7, local24 << 7, local243, local252);
							for (local272 = local90; local272 <= local137; local272++) {
								for (local276 = local86; local276 <= local88; local276++) {
									super.aByteArrayArrayArray11[local272][local276][local24] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local20][local68][local24] & 0x4) != 0) {
						local86 = local68;
						local88 = local68;
						local90 = local24;
						local137 = local24;
						while (local90 > 0 && (super.aByteArrayArrayArray11[local20][local68][local90 - 1] & 0x4) != 0) {
							local90--;
						}
						while (local137 < super.anInt6958 && (super.aByteArrayArrayArray11[local20][local68][local137 + 1] & 0x4) != 0) {
							local137++;
						}
						label271: while (local86 > 0) {
							for (local141 = local90; local141 <= local137; local141++) {
								if ((super.aByteArrayArrayArray11[local20][local86 - 1][local141] & 0x4) == 0) {
									break label271;
								}
							}
							local86--;
						}
						label260: while (local88 < super.anInt6959) {
							for (local141 = local90; local141 <= local137; local141++) {
								if ((super.aByteArrayArrayArray11[local20][local88 + 1][local141] & 0x4) == 0) {
									break label260;
								}
							}
							local88++;
						}
						if ((local88 + 1 - local86) * (local137 + 1 - local90) >= 4) {
							local141 = super.anIntArrayArrayArray12[local20][local86][local90];
							Static412.method5720(4, local86 << 7, (local88 << 7) + 128, local90 << 7, (local137 << 7) + 128, local141, local141);
							for (@Pc(729) int local729 = local86; local729 <= local88; local729++) {
								for (local243 = local90; local243 <= local137; local243++) {
									super.aByteArrayArrayArray11[local20][local729][local243] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!qa;IIII[BI[Lclient!ue;III)V")
	public void method5586(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class253[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(15) Class4_Sub20 local15 = new Class4_Sub20(arg5);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4620();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(38) int local38 = local15.method4575();
				if (local38 == 0) {
					break;
				}
				local32 += local38 - 1;
				@Pc(53) int local53 = local32 & 0x3F;
				@Pc(59) int local59 = local32 >> 6 & 0x3F;
				@Pc(63) int local63 = local32 >> 12;
				@Pc(67) int local67 = local15.method4614();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				if (arg1 == local63 && arg4 <= local59 && local59 < arg4 + 8 && local53 >= arg8 && arg8 + 8 > local53) {
					@Pc(111) Class139 local111 = Static146.aClass228_1.method5203(local17);
					@Pc(128) int local128 = Static49.method1087(local75, local111.anInt4353, arg3, local59 & 0x7, local111.anInt4350, local53 & 0x7) + arg6;
					@Pc(145) int local145 = Static309.method4723(local111.anInt4350, local53 & 0x7, local75, arg3, local111.anInt4353, local59 & 0x7) + arg2;
					if (local128 > 0 && local145 > 0 && super.anInt6959 - 1 > local128 && super.anInt6958 - 1 > local145) {
						@Pc(171) Class253 local171 = null;
						if (!super.aBoolean513) {
							@Pc(176) int local176 = arg9;
							if ((Static398.aByteArrayArrayArray17[1][local128][local145] & 0x2) == 2) {
								local176 = arg9 - 1;
							}
							if (local176 >= 0) {
								local171 = arg7[local176];
							}
						}
						this.method5582(arg9, local17, local171, local128, arg9, arg3 + local75 & 0x3, local71, -1, arg0, local145);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[BI[Lclient!ue;Lclient!qa;I)V")
	public void method5587(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class253[] arg3, @OriginalArg(4) Class30 arg4) {
		@Pc(10) Class4_Sub20 local10 = new Class4_Sub20(arg1);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method4620();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(47) int local47 = local10.method4575();
				if (local47 == 0) {
					break;
				}
				local43 += local47 - 1;
				@Pc(59) int local59 = local43 & 0x3F;
				@Pc(65) int local65 = local43 >> 6 & 0x3F;
				@Pc(69) int local69 = local43 >> 12;
				@Pc(73) int local73 = local10.method4614();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				@Pc(85) int local85 = arg2 + local65;
				@Pc(90) int local90 = local59 + arg0;
				if (local85 > 0 && local90 > 0 && local85 < super.anInt6959 - 1 && super.anInt6958 - 1 > local90) {
					@Pc(111) Class253 local111 = null;
					if (!super.aBoolean513) {
						@Pc(116) int local116 = local69;
						if ((Static398.aByteArrayArrayArray17[1][local85][local90] & 0x2) == 2) {
							local116 = local69 - 1;
						}
						if (local116 >= 0) {
							local111 = arg3[local116];
						}
					}
					this.method5582(local69, local28, local111, local85, local69, local81, local77, -1, arg4, local90);
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[IILclient!qa;ILclient!wn;)V")
	public void method5589(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub20 arg4) {
		if (super.aBoolean513) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(19) Class169 local19 = null;
		while (true) {
			@Pc(35) int local35;
			@Pc(97) int local97;
			@Pc(101) int local101;
			@Pc(39) int local39;
			@Pc(89) int local89;
			label308: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(196) int local196;
					@Pc(200) int local200;
					while (arg4.aByteArray77.length > arg4.anInt5526) {
						local24 = arg4.method4614();
						if (local24 == 0) {
							local19 = new Class169(arg4);
						} else {
							if (local24 == 1) {
								local35 = arg4.method4614();
								continue label308;
							}
							if (local24 == 2) {
								if (local19 == null) {
									local19 = new Class169();
								}
								local19.method4247(arg4);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray13 == null) {
									super.aByteArrayArrayArray13 = new byte[4][][];
								}
								local11 = true;
								for (local35 = 0; local35 < 4; local35++) {
									@Pc(187) byte local187 = arg4.method4576();
									if (local187 == 0 && super.aByteArrayArrayArray13[local35] != null) {
										local196 = arg0;
										local200 = arg0 + 64;
										local89 = arg3;
										if (local200 < 0) {
											local200 = 0;
										} else if (local200 >= super.anInt6959) {
											local200 = super.anInt6959;
										}
										if (arg0 < 0) {
											local196 = 0;
										} else if (arg0 >= super.anInt6959) {
											local196 = super.anInt6959;
										}
										local97 = arg3 + 64;
										if (arg3 < 0) {
											local89 = 0;
										} else if (arg3 >= super.anInt6958) {
											local89 = super.anInt6958;
										}
										if (local97 < 0) {
											local97 = 0;
										} else if (local97 >= super.anInt6958) {
											local97 = super.anInt6958;
										}
										while (local200 > local196) {
											while (local89 < local97) {
												super.aByteArrayArrayArray13[local35][local196][local89] = 0;
												local89++;
											}
											local196++;
										}
									} else if (local187 == 1) {
										if (super.aByteArrayArrayArray13[local35] == null) {
											super.aByteArrayArrayArray13[local35] = new byte[super.anInt6959 + 1][super.anInt6958 + 1];
										}
										for (local196 = 0; local196 < 64; local196 += 4) {
											for (local200 = 0; local200 < 64; local200 += 4) {
												@Pc(462) byte local462 = arg4.method4576();
												for (local97 = local196 + arg0; local97 < local196 + arg0 + 4; local97++) {
													for (local101 = local200 + arg3; local101 < local200 + arg3 + 4; local101++) {
														if (local97 >= 0 && local97 < super.anInt6959 && local101 >= 0 && local101 < super.anInt6958) {
															super.aByteArrayArrayArray13[local35][local97][local101] = local462;
														}
													}
												}
											}
										}
									} else if (local187 == 2) {
										if (super.aByteArrayArrayArray13[local35] == null) {
											super.aByteArrayArrayArray13[local35] = new byte[super.anInt6959 + 1][super.anInt6958 + 1];
										}
										if (local35 > 0) {
											local196 = arg0;
											local200 = arg0 + 64;
											local89 = arg3;
											local97 = arg3 + 64;
											if (arg0 < 0) {
												local196 = 0;
											} else if (arg0 >= super.anInt6959) {
												local196 = super.anInt6959;
											}
											if (arg3 < 0) {
												local89 = 0;
											} else if (super.anInt6958 <= arg3) {
												local89 = super.anInt6958;
											}
											if (local200 < 0) {
												local200 = 0;
											} else if (local200 >= super.anInt6959) {
												local200 = super.anInt6959;
											}
											if (local97 < 0) {
												local97 = 0;
											} else if (super.anInt6958 <= local97) {
												local97 = super.anInt6958;
											}
											while (local196 < local200) {
												while (local89 < local97) {
													super.aByteArrayArrayArray13[local35][local196][local89] = super.aByteArrayArrayArray13[local35 - 1][local196][local89];
													local89++;
												}
												local196++;
											}
										}
									}
								}
							} else if (arg1 == null) {
								arg4.anInt5526 += 10;
							} else {
								arg1[0] = arg4.method4560();
								arg1[1] = arg4.method4586();
								arg1[2] = arg4.method4586();
								arg1[3] = arg4.method4586();
								arg1[4] = arg4.method4560();
							}
						}
					}
					if (local19 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local35 = 0; local35 < 8; local35++) {
								local39 = (arg0 >> 3) + local24;
								local196 = local35 + (arg3 >> 3);
								if (local39 >= 0 && super.anInt6959 >> 3 > local39 && local196 >= 0 && super.anInt6958 >> 3 > local196) {
									Static387.method5426(local19, local196, local39);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray13 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray13[local24] != null) {
								for (local35 = 0; local35 < 16; local35++) {
									for (local39 = 0; local39 < 16; local39++) {
										local196 = (arg0 >> 2) + local35;
										local200 = (arg3 >> 2) + local39;
										if (local196 >= 0 && local196 < 26 && local200 >= 0 && local200 < 26) {
											super.aByteArrayArrayArray13[local24][local196][local200] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local35 <= 0);
			for (local39 = 0; local39 < local35; local39++) {
				@Pc(48) Class153 local48 = new Class153(arg2, arg4, 0);
				if (local48.anInt4678 == 31) {
					@Pc(61) Class5 local61 = Static75.aClass207_1.method4882(arg4.method4560());
					local48.method3996(local61.anInt46, local61.anInt44, local61.anInt51, local61.anInt52);
				}
				if (arg2.method2104() > 0) {
					@Pc(81) Class4_Sub17 local81 = local48.aClass4_Sub17_2;
					local89 = local81.method6165() + (arg0 << 7);
					local97 = (arg3 << 7) + local81.method6161();
					local101 = local89 >> 7;
					@Pc(105) int local105 = local97 >> 7;
					if (local101 >= 0 && local105 >= 0 && super.anInt6959 > local101 && super.anInt6958 > local105) {
						local81.method6157(local97, local89, super.anIntArrayArrayArray12[local48.anInt4679][local101][local105] - local81.method6162());
						Static112.method2199(local48);
					}
				}
			}
		}
	}
}
