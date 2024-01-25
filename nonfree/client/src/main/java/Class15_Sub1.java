import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!aha", name = "O", descriptor = "I")
	public int anInt357 = 99;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(IIIZ)V")
	public Class15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static519.aClass163_7, Static244.aClass210_5);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZBLclient!ha;)V")
	public void method395(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class126 arg1) {
		Static384.method5954();
		if (!arg0) {
			@Pc(20) int local20;
			@Pc(24) int local24;
			if (super.anInt347 > 1) {
				for (local20 = 0; local20 < super.anInt342; local20++) {
					for (local24 = 0; local24 < super.anInt332; local24++) {
						if ((Static480.aByteArrayArrayArray19[1][local20][local24] & 0x2) == 2) {
							Static502.method7339(local20, local24);
						}
					}
				}
			}
			for (local20 = 0; local20 < super.anInt347; local20++) {
				for (local24 = 0; super.anInt332 >= local24; local24++) {
					for (@Pc(68) int local68 = 0; super.anInt342 >= local68; local68++) {
						if ((super.aByteArrayArrayArray9[local20][local68][local24] & 0x4) != 0) {
							@Pc(86) int local86 = local68;
							@Pc(88) int local88 = local68;
							@Pc(90) int local90 = local24;
							@Pc(92) int local92 = local24;
							while (local90 > 0 && (super.aByteArrayArrayArray9[local20][local68][local90 - 1] & 0x4) != 0 && local24 - local90 < 10) {
								local90--;
							}
							while (local92 < super.anInt332 && (super.aByteArrayArrayArray9[local20][local68][local92 + 1] & 0x4) != 0 && local92 - local90 < 10) {
								local92++;
							}
							@Pc(161) int local161;
							label111: while (local86 > 0 && local68 - local86 < 10) {
								for (local161 = local90; local161 <= local92; local161++) {
									if ((super.aByteArrayArrayArray9[local20][local86 - 1][local161] & 0x4) == 0) {
										break label111;
									}
								}
								local86--;
							}
							label98: while (super.anInt342 > local88 && local88 - local86 < 10) {
								for (local161 = local90; local161 <= local92; local161++) {
									if ((super.aByteArrayArrayArray9[local20][local88 + 1][local161] & 0x4) == 0) {
										break label98;
									}
								}
								local88++;
							}
							if ((local88 + 1 - local86) * (local92 + (-local90 - -1)) >= 4) {
								local161 = super.anIntArrayArrayArray2[local20][local86][local90];
								Static333.method5158(local20, (local88 << 9) + 512, local86 << 9, local90 << 9, local161, (local92 << 9) + 512, local161);
								for (@Pc(286) int local286 = local86; local286 <= local88; local286++) {
									for (@Pc(290) int local290 = local90; local290 <= local92; local290++) {
										super.aByteArrayArrayArray9[local20][local286][local290] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static485.method6975();
		}
		super.aByteArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIBIILclient!ha;Lclient!kb;)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class126 arg8, @OriginalArg(10) Class182 arg9) {
		if (Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 0 && !Static179.method2902(arg5, Static315.anInt5514, arg3, arg2)) {
			return;
		}
		if (arg0 < this.anInt357) {
			this.anInt357 = arg0;
		}
		@Pc(34) Class283 local34 = Static525.aClass371_4.method8554(arg1);
		if (Static627.aClass5_Sub46_31.aClass11_Sub29_1.method8541() == 0 && local34.aBoolean647) {
			return;
		}
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg6 == 1 || arg6 == 3) {
			local57 = local34.anInt7838;
			local60 = local34.anInt7822;
		} else {
			local57 = local34.anInt7822;
			local60 = local34.anInt7838;
		}
		@Pc(93) int local93;
		@Pc(86) int local86;
		if (arg5 + local60 <= super.anInt342) {
			local86 = (local60 + 1 >> 1) + arg5;
			local93 = arg5 + (local60 >> 1);
		} else {
			local93 = arg5;
			local86 = arg5 + 1;
		}
		@Pc(121) int local121;
		@Pc(115) int local115;
		if (super.anInt332 >= arg3 + local57) {
			local115 = arg3 + (local57 + 1 >> 1);
			local121 = arg3 + (local57 >> 1);
		} else {
			local121 = arg3;
			local115 = arg3 + 1;
		}
		@Pc(133) Class40 local133 = Static299.aClass40Array1[arg2];
		@Pc(170) int local170 = local133.method8442(local93, local121) + local133.method8442(local86, local121) + local133.method8442(local93, local115) + local133.method8442(local86, local115) >> 2;
		@Pc(179) int local179 = (arg5 << 9) + (local60 << 8);
		@Pc(187) int local187 = (local57 << 8) + (arg3 << 9);
		@Pc(199) boolean local199 = Static268.aBoolean365 && !super.aBoolean31 && local34.aBoolean654;
		if (local34.method6853()) {
			Static600.method8380((Class14_Sub1_Sub1_Sub3_Sub2) null, arg6, arg5, local34, arg0, arg3, (Class14_Sub1_Sub1_Sub3_Sub1) null);
		}
		@Pc(239) boolean local239 = arg4 == -1 && local34.anInt7794 == -1 && local34.anIntArray625 == null && local34.anIntArray623 == null && !local34.aBoolean641 && !local34.aBoolean651;
		if (Static355.aBoolean530 && (Static568.method8024(arg7) && local34.anInt7824 != 1 || !(!Static129.method5614(arg7) || local34.anInt7824 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(384) Class14_Sub1_Sub1 local384;
			@Pc(352) Class14_Sub1_Sub1_Sub1 local352;
			@Pc(356) int local356;
			@Pc(450) int local450;
			if (arg7 == 10 || arg7 == 11) {
				local352 = null;
				if (local239) {
					@Pc(414) Class14_Sub1_Sub1_Sub1 local414 = new Class14_Sub1_Sub1_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg5, local60 + arg5 - 1, arg3, local57 + arg3 - 1, arg7, arg6, local199);
					local384 = local414;
					local352 = local414;
					local356 = local414.method361();
				} else {
					local356 = 15;
					local384 = new Class14_Sub1_Sub1_Sub5(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg5, local60 + arg5 - 1, arg3, local57 + arg3 - 1, arg7, arg6, arg4);
				}
				if (Static509.method7368(local384, false)) {
					if (local352 != null && local352.method8014()) {
						local352.method8011(arg8);
					}
					if (local34.aBoolean645 && Static268.aBoolean365) {
						if (local356 > 30) {
							local356 = 30;
						}
						for (local450 = 0; local450 <= local60; local450++) {
							for (@Pc(454) int local454 = 0; local454 <= local57; local454++) {
								local133.ka(local450 + arg5, local454 + arg3, local356);
							}
						}
					}
				}
				if (local34.anInt7835 != 0 && arg9 != null) {
					arg9.method4160(local34.aBoolean655, local60, !local34.aBoolean649, arg3, local57, arg5);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local239) {
					local352 = new Class14_Sub1_Sub1_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg5, arg5 + local60 - 1, arg3, arg3 + local57 - 1, arg7, arg6, local199);
					local384 = local352;
					if (local352.method8014()) {
						local352.method8011(arg8);
					}
				} else {
					local384 = new Class14_Sub1_Sub1_Sub5(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg5, arg5 + local60 - 1, arg3, arg3 + local57 - 1, arg7, arg6, arg4);
				}
				Static509.method7368(local384, false);
				if (Static268.aBoolean365 && !super.aBoolean31 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0 && local34.anInt7824 != 0) {
					super.aByteArrayArrayArray9[arg0][arg5][arg3] = (byte) (super.aByteArrayArrayArray9[arg0][arg5][arg3] | 0x4);
				}
				if (local34.anInt7835 != 0 && arg9 != null) {
					arg9.method4160(local34.aBoolean655, local60, !local34.aBoolean649, arg3, local57, arg5);
				}
			} else {
				@Pc(684) Class14_Sub1_Sub3 local684;
				if (arg7 == 0) {
					@Pc(657) int local657 = local34.anInt7824;
					if (Static499.aBoolean702 && local34.anInt7824 == -1) {
						local657 = 1;
					}
					if (local239) {
						@Pc(702) Class14_Sub1_Sub3_Sub1 local702 = new Class14_Sub1_Sub3_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6, local199);
						if (local702.method8014()) {
							local702.method8011(arg8);
						}
						local684 = local702;
					} else {
						local684 = new Class14_Sub1_Sub3_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6, arg4);
					}
					Static395.method6124(arg0, arg5, arg3, local684, (Class14_Sub1_Sub3) null);
					if (arg6 == 0) {
						if (Static268.aBoolean365 && local34.aBoolean645) {
							local133.ka(arg5, arg3, 50);
							local133.ka(arg5, arg3 + 1, 50);
						}
						if (local657 == 1 && !super.aBoolean31) {
							Static318.method4970(local34.anInt7828, 1, arg5, arg3, local34.anInt7813, arg0);
						}
					} else if (arg6 == 1) {
						if (Static268.aBoolean365 && local34.aBoolean645) {
							local133.ka(arg5, arg3 + 1, 50);
							local133.ka(arg5 + 1, arg3 + 1, 50);
						}
						if (local657 == 1 && !super.aBoolean31) {
							Static318.method4970(-local34.anInt7828, 2, arg5, arg3 + 1, local34.anInt7813, arg0);
						}
					} else if (arg6 == 2) {
						if (Static268.aBoolean365 && local34.aBoolean645) {
							local133.ka(arg5 + 1, arg3, 50);
							local133.ka(arg5 + 1, arg3 + 1, 50);
						}
						if (local657 == 1 && !super.aBoolean31) {
							Static318.method4970(-local34.anInt7828, 1, arg5 + 1, arg3, local34.anInt7813, arg0);
						}
					} else if (arg6 == 3) {
						if (Static268.aBoolean365 && local34.aBoolean645) {
							local133.ka(arg5, arg3, 50);
							local133.ka(arg5 + 1, arg3, 50);
						}
						if (local657 == 1 && !super.aBoolean31) {
							Static318.method4970(local34.anInt7828, 2, arg5, arg3, local34.anInt7813, arg0);
						}
					}
					if (local34.anInt7835 != 0 && arg9 != null) {
						arg9.method4171(!local34.aBoolean649, arg7, arg3, local34.aBoolean655, arg6, arg5);
					}
					if (local34.anInt7806 != 64) {
						Static162.method2430(arg0, arg5, arg3, local34.anInt7806);
					}
				} else {
					@Pc(955) Class14_Sub1_Sub3 local955;
					@Pc(943) Class14_Sub1_Sub3_Sub1 local943;
					if (arg7 == 1) {
						if (local239) {
							local943 = new Class14_Sub1_Sub3_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6, local199);
							if (local943.method8014()) {
								local943.method8011(arg8);
							}
							local955 = local943;
						} else {
							local955 = new Class14_Sub1_Sub3_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6, arg4);
						}
						Static395.method6124(arg0, arg5, arg3, local955, (Class14_Sub1_Sub3) null);
						if (local34.aBoolean645 && Static268.aBoolean365) {
							if (arg6 == 0) {
								local133.ka(arg5, arg3 + 1, 50);
							} else if (arg6 == 1) {
								local133.ka(arg5 + 1, arg3 + 1, 50);
							} else if (arg6 == 2) {
								local133.ka(arg5 + 1, arg3, 50);
							} else if (arg6 == 3) {
								local133.ka(arg5, arg3, 50);
							}
						}
						if (local34.anInt7835 != 0 && arg9 != null) {
							arg9.method4171(!local34.aBoolean649, arg7, arg3, local34.aBoolean655, arg6, arg5);
						}
					} else if (arg7 == 2) {
						local356 = arg6 + 1 & 0x3;
						if (local239) {
							@Pc(1124) Class14_Sub1_Sub3_Sub1 local1124 = new Class14_Sub1_Sub3_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6 + 4, local199);
							@Pc(1140) Class14_Sub1_Sub3_Sub1 local1140 = new Class14_Sub1_Sub3_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, local356, local199);
							if (local1124.method8014()) {
								local1124.method8011(arg8);
							}
							local684 = local1140;
							local955 = local1124;
							if (local1140.method8014()) {
								local1140.method8011(arg8);
							}
						} else {
							local955 = new Class14_Sub1_Sub3_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6 + 4, arg4);
							local684 = new Class14_Sub1_Sub3_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, local356, arg4);
						}
						Static395.method6124(arg0, arg5, arg3, local955, local684);
						if ((local34.anInt7824 == 1 || Static499.aBoolean702 && local34.anInt7824 == -1) && !super.aBoolean31) {
							if (arg6 == 0) {
								Static318.method4970(local34.anInt7828, 1, arg5, arg3, local34.anInt7813, arg0);
								Static318.method4970(local34.anInt7828, 2, arg5, arg3 + 1, local34.anInt7813, arg0);
							} else if (arg6 == 1) {
								Static318.method4970(local34.anInt7828, 1, arg5 + 1, arg3, local34.anInt7813, arg0);
								Static318.method4970(local34.anInt7828, 2, arg5, arg3 + 1, local34.anInt7813, arg0);
							} else if (arg6 == 2) {
								Static318.method4970(local34.anInt7828, 1, arg5 + 1, arg3, local34.anInt7813, arg0);
								Static318.method4970(local34.anInt7828, 2, arg5, arg3, local34.anInt7813, arg0);
							} else if (arg6 == 3) {
								Static318.method4970(local34.anInt7828, 1, arg5, arg3, local34.anInt7813, arg0);
								Static318.method4970(local34.anInt7828, 2, arg5, arg3, local34.anInt7813, arg0);
							}
						}
						if (local34.anInt7835 != 0 && arg9 != null) {
							arg9.method4171(!local34.aBoolean649, arg7, arg3, local34.aBoolean655, arg6, arg5);
						}
						if (local34.anInt7806 != 64) {
							Static162.method2430(arg0, arg5, arg3, local34.anInt7806);
						}
					} else if (arg7 == 3) {
						if (local239) {
							local943 = new Class14_Sub1_Sub3_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6, local199);
							if (local943.method8014()) {
								local943.method8011(arg8);
							}
							local955 = local943;
						} else {
							local955 = new Class14_Sub1_Sub3_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg7, arg6, arg4);
						}
						Static395.method6124(arg0, arg5, arg3, local955, (Class14_Sub1_Sub3) null);
						if (local34.aBoolean645 && Static268.aBoolean365) {
							if (arg6 == 0) {
								local133.ka(arg5, arg3 + 1, 50);
							} else if (arg6 == 1) {
								local133.ka(arg5 + 1, arg3 + 1, 50);
							} else if (arg6 == 2) {
								local133.ka(arg5 + 1, arg3, 50);
							} else if (arg6 == 3) {
								local133.ka(arg5, arg3, 50);
							}
						}
						if (local34.anInt7835 != 0 && arg9 != null) {
							arg9.method4171(!local34.aBoolean649, arg7, arg3, local34.aBoolean655, arg6, arg5);
						}
					} else if (arg7 == 9) {
						if (local239) {
							local352 = new Class14_Sub1_Sub1_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg5, arg5, arg3, arg3, arg7, arg6, local199);
							if (local352.method8014()) {
								local352.method8011(arg8);
							}
							local384 = local352;
						} else {
							local384 = new Class14_Sub1_Sub1_Sub5(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg5, local60 + arg5 - 1, arg3, local57 + arg3 - 1, arg7, arg6, arg4);
						}
						Static509.method7368(local384, false);
						if (local34.anInt7824 == 1 && !super.aBoolean31) {
							@Pc(1548) byte local1548;
							if ((arg6 & 0x1) == 0) {
								local1548 = 8;
							} else {
								local1548 = 16;
							}
							Static318.method4970(0, local1548, arg5, arg3, local34.anInt7813, arg0);
						}
						if (local34.anInt7835 != 0 && arg9 != null) {
							arg9.method4160(local34.aBoolean655, local60, !local34.aBoolean649, arg3, local57, arg5);
						}
						if (local34.anInt7806 != 64) {
							Static162.method2430(arg0, arg5, arg3, local34.anInt7806);
						}
					} else {
						@Pc(1618) Class14_Sub1_Sub2 local1618;
						if (arg7 == 4) {
							if (local239) {
								@Pc(1637) Class14_Sub1_Sub2_Sub1 local1637 = new Class14_Sub1_Sub2_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, 0, 0, arg7, arg6);
								local1618 = local1637;
								if (local1637.method8014()) {
									local1637.method8011(arg8);
								}
							} else {
								local1618 = new Class14_Sub1_Sub2_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, 0, 0, arg7, arg6, arg4);
							}
							Static303.method4407(arg0, arg5, arg3, local1618, (Class14_Sub1_Sub2) null);
						} else {
							@Pc(1661) int local1661;
							@Pc(1667) Interface20 local1667;
							@Pc(1706) Class14_Sub1_Sub2_Sub1 local1706;
							if (arg7 == 5) {
								local1661 = 65;
								local1667 = (Interface20) Static601.method8388(arg0, arg5, arg3);
								if (local1667 != null) {
									local1661 = Static525.aClass371_4.method8554(local1667.method8009()).anInt7806 + 1;
								}
								if (local239) {
									local1706 = new Class14_Sub1_Sub2_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, local1661 * Static103.anIntArray138[arg6], local1661 * Static95.anIntArray128[arg6], arg7, arg6);
									local1618 = local1706;
									if (local1706.method8014()) {
										local1706.method8011(arg8);
									}
								} else {
									local1618 = new Class14_Sub1_Sub2_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, local1661 * Static103.anIntArray138[arg6], Static95.anIntArray128[arg6] * local1661, arg7, arg6, arg4);
								}
								Static303.method4407(arg0, arg5, arg3, local1618, (Class14_Sub1_Sub2) null);
							} else if (arg7 == 6) {
								local1661 = 33;
								local1667 = (Interface20) Static601.method8388(arg0, arg5, arg3);
								if (local1667 != null) {
									local1661 = Static525.aClass371_4.method8554(local1667.method8009()).anInt7806 / 2 + 1;
								}
								if (local239) {
									local1706 = new Class14_Sub1_Sub2_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, Static103.anIntArray138[arg6] * local1661, local1661 * Static95.anIntArray128[arg6], arg7, arg6 + 4);
									local1618 = local1706;
									if (local1706.method8014()) {
										local1706.method8011(arg8);
									}
								} else {
									local1618 = new Class14_Sub1_Sub2_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, Static485.anIntArray648[arg6] * local1661, local1661 * Static553.anIntArray704[arg6], arg7, arg6 + 4, arg4);
								}
								Static303.method4407(arg0, arg5, arg3, local1618, (Class14_Sub1_Sub2) null);
							} else if (arg7 == 7) {
								local1661 = arg6 + 2 & 0x3;
								if (local239) {
									@Pc(1884) Class14_Sub1_Sub2_Sub1 local1884 = new Class14_Sub1_Sub2_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, 0, 0, arg7, local1661 + 4);
									local1618 = local1884;
									if (local1884.method8014()) {
										local1884.method8011(arg8);
									}
								} else {
									local1618 = new Class14_Sub1_Sub2_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, 0, 0, arg7, local1661 + 4, arg4);
								}
								Static303.method4407(arg0, arg5, arg3, local1618, (Class14_Sub1_Sub2) null);
							} else if (arg7 == 8) {
								local356 = arg6 + 2 & 0x3;
								local450 = 33;
								@Pc(1940) Interface20 local1940 = (Interface20) Static601.method8388(arg0, arg5, arg3);
								if (local1940 != null) {
									local450 = Static525.aClass371_4.method8554(local1940.method8009()).anInt7806 / 2 + 1;
								}
								@Pc(1983) Class14_Sub1_Sub2 local1983;
								@Pc(2002) Class14_Sub1_Sub2 local2002;
								if (local239) {
									local1983 = new Class14_Sub1_Sub2_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, local450 * Static485.anIntArray648[arg6], local450 * Static553.anIntArray704[arg6], arg7, arg6 + 4);
									local2002 = new Class14_Sub1_Sub2_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, 0, 0, arg7, local356 + 4);
									if (local1983.method8014()) {
										local1983.method8011(arg8);
									}
									if (local2002.method8014()) {
										local2002.method8011(arg8);
									}
								} else {
									local1983 = new Class14_Sub1_Sub2_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, Static485.anIntArray648[arg6] * local450, local450 * Static553.anIntArray704[arg6], arg7, arg6 + 4, arg4);
									local2002 = new Class14_Sub1_Sub2_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, 0, 0, arg7, local356 + 4, arg4);
								}
								Static303.method4407(arg0, arg5, arg3, local1983, local2002);
							}
						}
					}
				}
			}
		} else if (Static627.aClass5_Sub46_31.aClass11_Sub16_1.method4417() != 0 || local34.anInt7843 != 0 || local34.anInt7835 == 1 || local34.aBoolean652) {
			@Pc(300) Class14_Sub1_Sub5 local300;
			if (local239) {
				@Pc(298) Class14_Sub1_Sub5_Sub1 local298 = new Class14_Sub1_Sub5_Sub1(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg6, local199);
				local300 = local298;
				if (local298.method8014()) {
					local298.method8011(arg8);
				}
			} else {
				local300 = new Class14_Sub1_Sub5_Sub2(arg8, local34, arg0, arg2, local179, local170, local187, super.aBoolean31, arg6, arg4);
			}
			Static215.method3282(arg0, arg5, arg3, local300);
			if (local34.anInt7835 == 1 && arg9 != null) {
				arg9.method4169(arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IILclient!ee;[IBLclient!ha;)V")
	public void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub12 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Class126 arg4) {
		if (super.aBoolean31) {
			return;
		}
		@Pc(16) boolean local16 = false;
		@Pc(18) Class248 local18 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(29) int local29;
			@Pc(50) int local50;
			@Pc(252) int local252;
			@Pc(256) int local256;
			@Pc(57) int local57;
			while (arg2.anInt10154 < arg2.aByteArray104.length) {
				local29 = arg2.method8645();
				if (local29 == 0) {
					local18 = new Class248(arg2);
				} else {
					@Pc(115) int local115;
					@Pc(119) int local119;
					@Pc(107) int local107;
					if (local29 == 1) {
						local50 = arg2.method8645();
						if (local50 > 0) {
							for (local57 = 0; local57 < local50; local57++) {
								@Pc(66) Class175 local66 = new Class175(arg4, arg2, 2);
								if (local66.anInt4423 == 31) {
									@Pc(81) Class98 local81 = Static586.aClass337_1.method7922(arg2.method8631());
									local66.method4041(local81.anInt2197, local81.anInt2191, local81.anInt2196, local81.anInt2192);
								}
								if (arg4.method7032() > 0) {
									@Pc(98) Class5_Sub27 local98 = local66.aClass5_Sub27_2;
									local107 = local98.method6330() + (arg0 << 9);
									local115 = local98.method6335() + (arg1 << 9);
									local119 = local107 >> 9;
									@Pc(123) int local123 = local115 >> 9;
									if (local119 >= 0 && local123 >= 0 && local119 < super.anInt342 && local123 < super.anInt332) {
										local98.method6332(super.anIntArrayArrayArray2[local66.anInt4431][local119][local123] - local98.method6334(), local115, local107);
										Static306.method4439(local66);
									}
								}
							}
						}
					} else if (local29 == 2) {
						if (local18 == null) {
							local18 = new Class248();
						}
						local18.method5964(arg2);
					} else if (local29 != 128) {
						if (local29 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						local16 = true;
						for (local50 = 0; local50 < 4; local50++) {
							@Pc(210) byte local210 = arg2.method8635();
							if (local210 == 0 && super.aByteArrayArrayArray11[local50] != null) {
								local252 = arg0;
								local256 = arg0 + 64;
								local107 = arg1;
								if (arg1 < 0) {
									local107 = 0;
								} else if (arg1 >= super.anInt332) {
									local107 = super.anInt332;
								}
								local115 = arg1 + 64;
								if (local256 < 0) {
									local256 = 0;
								} else if (local256 >= super.anInt342) {
									local256 = super.anInt342;
								}
								if (arg0 < 0) {
									local252 = 0;
								} else if (super.anInt342 <= arg0) {
									local252 = super.anInt342;
								}
								if (local115 < 0) {
									local115 = 0;
								} else if (super.anInt332 <= local115) {
									local115 = super.anInt332;
								}
								while (local252 < local256) {
									while (local107 < local115) {
										super.aByteArrayArrayArray11[local50][local252][local107] = 0;
										local107++;
									}
									local252++;
								}
							} else if (local210 == 1) {
								if (super.aByteArrayArrayArray11[local50] == null) {
									super.aByteArrayArrayArray11[local50] = new byte[super.anInt342 + 1][super.anInt332 + 1];
								}
								for (local252 = 0; local252 < 64; local252 += 4) {
									for (local256 = 0; local256 < 64; local256 += 4) {
										@Pc(390) byte local390 = arg2.method8635();
										for (local115 = local252 + arg0; local115 < arg0 + local252 + 4; local115++) {
											for (local119 = arg1 + local256; local119 < arg1 + local256 + 4; local119++) {
												if (local115 >= 0 && super.anInt342 > local115 && local119 >= 0 && local119 < super.anInt332) {
													super.aByteArrayArrayArray11[local50][local115][local119] = local390;
												}
											}
										}
									}
								}
							} else if (local210 == 2) {
								if (super.aByteArrayArrayArray11[local50] == null) {
									super.aByteArrayArrayArray11[local50] = new byte[super.anInt342 + 1][super.anInt332 + 1];
								}
								if (local50 > 0) {
									local252 = arg0;
									local256 = arg0 + 64;
									local107 = arg1;
									if (arg1 < 0) {
										local107 = 0;
									} else if (super.anInt332 <= arg1) {
										local107 = super.anInt332;
									}
									local115 = arg1 + 64;
									if (local256 < 0) {
										local256 = 0;
									} else if (super.anInt342 <= local256) {
										local256 = super.anInt342;
									}
									if (arg0 < 0) {
										local252 = 0;
									} else if (super.anInt342 <= arg0) {
										local252 = super.anInt342;
									}
									if (local115 < 0) {
										local115 = 0;
									} else if (super.anInt332 <= local115) {
										local115 = super.anInt332;
									}
									while (local256 > local252) {
										while (local107 < local115) {
											super.aByteArrayArrayArray11[local50][local252][local107] = super.aByteArrayArrayArray11[local50 - 1][local252][local107];
											local107++;
										}
										local252++;
									}
								}
							}
						}
					} else if (arg3 == null) {
						arg2.anInt10154 += 10;
					} else {
						arg3[0] = arg2.method8631();
						arg3[1] = arg2.method8595();
						arg3[2] = arg2.method8595();
						arg3[3] = arg2.method8595();
						arg3[4] = arg2.method8631();
					}
				}
			}
			if (local18 != null) {
				for (local29 = 0; local29 < 8; local29++) {
					for (local50 = 0; local50 < 8; local50++) {
						local57 = local29 + (arg0 >> 3);
						local252 = (arg1 >> 3) + local50;
						if (local57 >= 0 && super.anInt342 >> 3 > local57 && local252 >= 0 && local252 < super.anInt332 >> 3) {
							Static224.method3510(local57, local18, local252);
						}
					}
				}
			}
			if (!local16 && super.aByteArrayArrayArray11 != null) {
				for (local29 = 0; local29 < 4; local29++) {
					if (super.aByteArrayArrayArray11[local29] != null) {
						for (local50 = 0; local50 < 16; local50++) {
							for (local57 = 0; local57 < 16; local57++) {
								local252 = local50 + (arg0 >> 2);
								local256 = local57 + (arg1 >> 2);
								if (local252 >= 0 && local252 < 26 && local256 >= 0 && local256 < 26) {
									super.aByteArrayArrayArray11[local29][local252][local256] = 0;
								}
							}
						}
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIILclient!kb;ILclient!ha;)V")
	public void method399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class182 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class126 arg5) {
		@Pc(15) Interface20 local15 = this.method402(arg2, arg4, arg0, arg1);
		if (local15 == null) {
			return;
		}
		@Pc(24) Class283 local24 = Static525.aClass371_4.method8554(local15.method8009());
		@Pc(28) int local28 = local15.method8015();
		@Pc(32) int local32 = local15.method8012();
		if (local24.method6853()) {
			Static53.method847(local24, arg1, arg4, arg2);
		}
		if (local15.method8014()) {
			local15.method8010(arg5);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				Static185.method2975(arg1, arg2, arg4);
				return;
			}
			if (arg0 == 2) {
				Static144.method2148(arg1, arg2, arg4, paa.class);
				if (local24.anInt7835 != 0 && local24.anInt7838 + arg2 < super.anInt342 && arg4 + local24.anInt7838 < super.anInt332 && super.anInt342 > local24.anInt7822 + arg2 && local24.anInt7822 + arg4 < super.anInt332) {
					arg3.method4172(local24.anInt7822, arg4, local32, local24.aBoolean655, arg2, !local24.aBoolean649, local24.anInt7838);
				}
				if (local28 != 9) {
					return;
				}
				if ((local32 & 0x1) == 0) {
					Static339.method5203(arg1, arg4, arg2, 8);
					return;
				}
				Static339.method5203(arg1, arg4, arg2, 16);
			} else if (arg0 == 3) {
				Static598.method8370(arg1, arg2, arg4);
				if (local24.anInt7835 == 1) {
					arg3.method4170(arg2, arg4);
					return;
				}
			}
			return;
		}
		Static311.method4934(arg1, arg2, arg4);
		if (local24.anInt7835 != 0) {
			arg3.method4163(local32, arg4, local28, !local24.aBoolean649, arg2, local24.aBoolean655);
		}
		if (local24.anInt7824 != 1) {
			return;
		}
		if (local32 == 0) {
			Static339.method5203(arg1, arg4, arg2, 1);
			return;
		}
		if (local32 == 1) {
			Static339.method5203(arg1, arg4 + 1, arg2, 2);
			return;
		}
		if (local32 == 2) {
			Static339.method5203(arg1, arg4, arg2 + 1, 1);
			return;
		}
		if (local32 == 3) {
			Static339.method5203(arg1, arg4, arg2, 2);
			return;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(BIIIIILclient!ee;ILclient!ha;[II)V")
	public void method401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class126 arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean31) {
			return;
		}
		@Pc(18) Class248 local18 = null;
		if (arg8 != null) {
			arg8[0] = -1;
		}
		@Pc(30) int local30 = (arg1 & 0x7) * 8;
		@Pc(36) int local36 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(52) int local52;
			@Pc(110) int local110;
			@Pc(160) int local160;
			@Pc(183) int local183;
			@Pc(59) int local59;
			@Pc(104) int local104;
			label233: do {
				while (true) {
					@Pc(41) int local41;
					@Pc(328) int local328;
					while (arg5.anInt10154 < arg5.aByteArray104.length) {
						local41 = arg5.method8645();
						if (local41 == 0) {
							local18 = new Class248(arg5);
						} else {
							if (local41 == 1) {
								local52 = arg5.method8645();
								continue label233;
							}
							if (local41 == 2) {
								if (local18 == null) {
									local18 = new Class248();
								}
								local18.method5964(arg5);
							} else if (local41 != 128) {
								if (local41 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								for (local52 = 0; local52 < 4; local52++) {
									@Pc(313) byte local313 = arg5.method8635();
									@Pc(332) int local332;
									if (local313 == 0 && super.aByteArrayArrayArray11[arg9] != null) {
										if (arg2 >= local52) {
											local328 = arg4;
											local332 = arg4 + 7;
											local104 = arg3;
											local110 = arg3 + 7;
											if (arg3 < 0) {
												local104 = 0;
											} else if (arg3 >= super.anInt332) {
												local104 = super.anInt332;
											}
											if (arg4 < 0) {
												local328 = 0;
											} else if (super.anInt342 <= arg4) {
												local328 = super.anInt342;
											}
											if (local332 < 0) {
												local332 = 0;
											} else if (super.anInt342 <= local332) {
												local332 = super.anInt342;
											}
											if (local110 < 0) {
												local110 = 0;
											} else if (local110 >= super.anInt332) {
												local110 = super.anInt332;
											}
											while (local332 > local328) {
												while (local104 < local110) {
													super.aByteArrayArrayArray11[arg9][local328][local104] = 0;
													local104++;
												}
												local328++;
											}
										}
									} else if (local313 == 1) {
										if (super.aByteArrayArrayArray11[arg9] == null) {
											super.aByteArrayArrayArray11[arg9] = new byte[super.anInt342 + 1][super.anInt332 + 1];
										}
										for (local328 = 0; local328 < 64; local328 += 4) {
											for (local332 = 0; local332 < 64; local332 += 4) {
												@Pc(467) byte local467 = arg5.method8635();
												if (local52 <= arg2) {
													for (local110 = local328; local110 < local328 + 4; local110++) {
														for (local160 = local332; local160 < local332 + 4; local160++) {
															if (local110 >= local30 && local30 + 8 > local110 && local160 >= local36 && local36 < local36 + 8) {
																local183 = arg4 + Static104.method1521(arg6, local160 & 0x7, local110 & 0x7);
																@Pc(524) int local524 = arg3 + Static333.method5157(local160 & 0x7, arg6, local110 & 0x7);
																if (local183 >= 0 && local183 < super.anInt342 && local524 >= 0 && super.anInt332 > local524) {
																	super.aByteArrayArrayArray11[arg9][local183][local524] = local467;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg8 == null) {
								arg5.anInt10154 += 10;
							} else {
								arg8[0] = arg5.method8631();
								arg8[1] = arg5.method8595();
								arg8[2] = arg5.method8595();
								arg8[3] = arg5.method8595();
								arg8[4] = arg5.method8631();
							}
						}
					}
					if (local18 != null) {
						Static224.method3510(arg4 >> 3, local18, arg3 >> 3);
					}
					if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg9] != null) {
						local41 = arg4 + 7;
						local52 = arg3 + 7;
						for (local59 = arg4; local59 < local41; local59++) {
							for (local328 = arg3; local328 < local52; local328++) {
								super.aByteArrayArrayArray11[arg9][local59][local328] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local52 <= 0);
			for (local59 = 0; local59 < local52; local59++) {
				@Pc(68) Class175 local68 = new Class175(arg7, arg5, 2);
				if (local68.anInt4423 == 31) {
					@Pc(81) Class98 local81 = Static586.aClass337_1.method7922(arg5.method8631());
					local68.method4041(local81.anInt2197, local81.anInt2191, local81.anInt2196, local81.anInt2192);
				}
				if (arg7.method7032() > 0) {
					@Pc(98) Class5_Sub27 local98 = local68.aClass5_Sub27_2;
					local104 = local98.method6330() >> 9;
					local110 = local98.method6335() >> 9;
					if (local68.anInt4431 == arg2 && local104 >= local30 && local30 + 8 > local104 && local36 <= local110 && local36 + 8 > local110) {
						local160 = (arg4 << 9) + Static414.method6319(local98.method6335() & 0xFFF, local98.method6330() & 0xFFF, arg6);
						local104 = local160 >> 9;
						local183 = (arg3 << 9) + Static580.method8701(local98.method6335() & 0xFFF, arg6, local98.method6330() & 0xFFF);
						local110 = local183 >> 9;
						if (local104 >= 0 && local110 >= 0 && super.anInt342 > local104 && local110 < super.anInt332) {
							local98.method6332(super.anIntArrayArrayArray2[arg2][local104][local110] - local98.method6334(), local183, local160);
							Static306.method4439(local68);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZIIII)Lclient!paa;")
	public Interface20 method402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface20 local5 = null;
		if (arg2 == 0) {
			local5 = (Interface20) Static601.method8388(arg3, arg0, arg1);
		}
		if (arg2 == 1) {
			local5 = (Interface20) Static237.method3640(arg3, arg0, arg1);
		}
		if (arg2 == 2) {
			local5 = (Interface20) Static1.method5727(arg3, arg0, arg1, paa.class);
		}
		if (arg2 == 3) {
			local5 = (Interface20) Static70.method7879(arg3, arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!ha;II[BI[Lclient!kb;IIBII)V")
	public void method403(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class182[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class5_Sub12 local10 = new Class5_Sub12(arg3);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local10.method8627();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local10.method8614();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(54) int local54 = local38 & 0x3F;
				@Pc(60) int local60 = local38 >> 6 & 0x3F;
				@Pc(64) int local64 = local38 >> 12;
				@Pc(68) int local68 = local10.method8645();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				if (local64 == arg1 && local60 >= arg7 && local60 < arg7 + 8 && local54 >= arg2 && local54 < arg2 + 8) {
					@Pc(108) Class283 local108 = Static525.aClass371_4.method8554(local23);
					@Pc(125) int local125 = Static523.method7487(local54 & 0x7, local108.anInt7822, local60 & 0x7, arg8, local76, local108.anInt7838) + arg4;
					@Pc(142) int local142 = Static219.method3392(local108.anInt7838, arg8, local76, local54 & 0x7, local108.anInt7822, local60 & 0x7) + arg6;
					if (local125 > 0 && local142 > 0 && local125 < super.anInt342 - 1 && local142 < super.anInt332 - 1) {
						@Pc(167) Class182 local167 = null;
						if (!super.aBoolean31) {
							@Pc(172) int local172 = arg9;
							if ((Static480.aByteArrayArrayArray19[1][local125][local142] & 0x2) == 2) {
								local172 = arg9 - 1;
							}
							if (local172 >= 0) {
								local167 = arg5[local172];
							}
						}
						this.method397(arg9, local23, arg9, local142, -1, local125, local76 + arg8 & 0x3, local72, arg0, local167);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "([Lclient!kb;Lclient!ha;I[BII)V")
	public void method405(@OriginalArg(0) Class182[] arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) Class5_Sub12 local14 = new Class5_Sub12(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method8627();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method8614();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local14.method8645();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				@Pc(70) int local70 = local50 + arg4;
				@Pc(74) int local74 = arg3 + local44;
				if (local70 > 0 && local74 > 0 && super.anInt342 - 1 > local70 && super.anInt332 - 1 > local74) {
					@Pc(99) Class182 local99 = null;
					if (!super.aBoolean31) {
						@Pc(104) int local104 = local54;
						if ((Static480.aByteArrayArrayArray19[1][local70][local74] & 0x2) == 2) {
							local104 = local54 - 1;
						}
						if (local104 >= 0) {
							local99 = arg0[local104];
						}
					}
					this.method397(local54, local16, local54, local74, -1, local70, local66, local62, arg1, local99);
				}
			}
		}
	}
}
