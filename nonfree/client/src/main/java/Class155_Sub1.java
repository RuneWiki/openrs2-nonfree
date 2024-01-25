import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class155_Sub1 extends Class155 {

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
	public int anInt4456 = 99;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIZ)V")
	public Class155_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static35.aClass47_3, Static234.aClass107_3);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!qa;IBLclient!id;I)V")
	public void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class112 arg4, @OriginalArg(6) int arg5) {
		@Pc(15) Interface6 local15 = null;
		if (arg1 == 0) {
			local15 = (Interface6) Static259.method5039(arg0, arg5, arg3);
		}
		if (arg1 == 1) {
			local15 = (Interface6) Static81.method1400(arg0, arg5, arg3);
		}
		if (arg1 == 2) {
			local15 = (Interface6) Static278.method5819(arg0, arg5, arg3, jv.class);
		}
		if (arg1 == 3) {
			local15 = (Interface6) Static366.method4342(arg0, arg5, arg3);
		}
		if (local15 == null) {
			return;
		}
		@Pc(67) Class182 local67 = Static71.aClass105_6.method2336(local15.method4665());
		@Pc(71) int local71 = local15.method4666();
		@Pc(75) int local75 = local15.method4670();
		if (local67.method4385()) {
			Static389.method5314(arg0, arg3, local67, arg5);
		}
		if (local15.method4671()) {
			local15.method4667(arg2);
		}
		if (arg1 == 0) {
			@Pc(100) Class26_Sub1 local100 = Static259.method5039(arg0, arg5, arg3);
			if (local100 instanceof Class26_Sub1_Sub3) {
				((Class26_Sub1_Sub3) local100).aClass26_Sub1_1 = null;
			} else {
				Static198.method3012(arg0, arg5, arg3);
			}
			if (local67.anInt5492 != 0) {
				arg4.method2680(local67.aBoolean357, arg5, local75, !local67.aBoolean358, local71, arg3);
				return;
			}
		} else if (arg1 == 1) {
			@Pc(278) Class26_Sub3 local278 = Static81.method1400(arg0, arg5, arg3);
			if (!(local278 instanceof Class26_Sub3_Sub3)) {
				Static176.method2751(arg0, arg5, arg3);
				return;
			}
			((Class26_Sub3_Sub3) local278).aClass26_Sub3_1 = null;
		} else {
			if (arg1 == 2) {
				@Pc(156) Class26_Sub2 local156 = Static278.method5819(arg0, arg5, arg3, jv.class);
				if (local156 instanceof Class26_Sub2_Sub6 && local156.aShort93 == arg5 && arg3 == local156.aShort94) {
					((Class26_Sub2_Sub6) local156).aClass26_Sub2_2 = null;
				} else {
					Static148.method2223(arg0, arg5, arg3, jv.class);
				}
				if (local67.anInt5492 != 0 && super.anInt4452 > arg5 + local67.anInt5486 && super.anInt4446 > arg3 + local67.anInt5486 && local67.anInt5487 + arg5 < super.anInt4452 && arg3 + local67.anInt5487 < super.anInt4446) {
					arg4.method2684(!local67.aBoolean358, local75, local67.anInt5487, local67.aBoolean357, local67.anInt5486, arg5, arg3);
					return;
				}
			} else if (arg1 == 3) {
				@Pc(250) Class26_Sub4 local250 = Static366.method4342(arg0, arg5, arg3);
				if (local250 instanceof Class26_Sub4_Sub2) {
					((Class26_Sub4_Sub2) local250).aClass26_Sub4_1 = null;
				} else {
					Static397.method5404(arg0, arg5, arg3);
				}
				if (local67.anInt5492 != 1) {
					return;
				}
				arg4.method2697(arg3, arg5);
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!qa;IIIIIILclient!id;II)V")
	public void method3659(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class112 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static389.aClass128_Sub1_1.method2984(Static285.anInt7839) && !Static266.method3895(arg2, arg5, Static424.anInt7348, arg8)) {
			return;
		}
		if (this.anInt4456 > arg6) {
			this.anInt4456 = arg6;
		}
		@Pc(30) Class182 local30 = Static71.aClass105_6.method2336(arg0);
		if (arg1.method4716() && Static389.aClass128_Sub1_1.aBoolean245 && local30.aBoolean363) {
			return;
		}
		@Pc(56) int local56;
		@Pc(53) int local53;
		if (arg3 == 1 || arg3 == 3) {
			local56 = local30.anInt5487;
			local53 = local30.anInt5486;
		} else {
			local53 = local30.anInt5487;
			local56 = local30.anInt5486;
		}
		@Pc(86) int local86;
		@Pc(84) int local84;
		if (local56 + arg2 > super.anInt4452) {
			local84 = arg2 + 1;
			local86 = arg2;
		} else {
			local86 = (local56 >> 1) + arg2;
			local84 = (local56 + 1 >> 1) + arg2;
		}
		@Pc(118) int local118;
		@Pc(126) int local126;
		if (arg5 + local53 <= super.anInt4446) {
			local118 = (local53 >> 1) + arg5;
			local126 = arg5 + (local53 + 1 >> 1);
		} else {
			local126 = arg5 + 1;
			local118 = arg5;
		}
		@Pc(138) Class136 local138 = Static92.aClass136Array1[arg8];
		@Pc(161) int local161 = local138.I(local86, local118) + local138.I(local84, local118) + local138.I(local86, local126) + local138.I(local84, local126) >> 2;
		@Pc(169) int local169 = (local56 << 6) + (arg2 << 7);
		@Pc(177) int local177 = (local53 << 6) + (arg5 << 7);
		@Pc(189) boolean local189 = Static148.aBoolean137 && !super.aBoolean304 && local30.aBoolean361;
		if (local30.method4385()) {
			Static409.method5547(arg3, arg6, null, arg2, arg5, null, local30);
		}
		@Pc(224) boolean local224 = arg9 == -1 && local30.anInt5450 == -1 && local30.anIntArray426 == null && local30.anIntArray425 == null && !local30.aBoolean352;
		if (Static403.aBoolean450 && (Static35.method1645(arg4) && local30.anInt5454 != 1 || !(!Static22.method3260(arg4) || local30.anInt5454 != 0))) {
			return;
		}
		if (arg4 != 22) {
			@Pc(380) Class26_Sub2 local380;
			@Pc(347) Class26_Sub2_Sub4 local347;
			@Pc(386) int local386;
			if (arg4 == 10 || arg4 == 11) {
				local347 = null;
				if (local224) {
					@Pc(378) Class26_Sub2_Sub4 local378 = new Class26_Sub2_Sub4(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg2, arg2 + local56 - 1, arg5, local53 + arg5 - 1, arg4, arg3, local189);
					local380 = local378;
					local347 = local378;
					local386 = local378.method3485();
				} else {
					local386 = 15;
					local380 = new Class26_Sub2_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg2, local56 + arg2 - 1, arg5, local53 + arg5 - 1, arg4, arg3, arg9);
				}
				@Pc(430) Class26_Sub2 local430 = Static278.method5819(arg6, arg2, arg5, jv.class);
				@Pc(432) boolean local432 = false;
				if (local430 instanceof Class26_Sub2_Sub6 && arg2 == local430.aShort93 && local430.aShort94 == arg5) {
					local432 = true;
					((Class26_Sub2_Sub6) local430).aClass26_Sub2_2 = local380;
				}
				if (local432 || Static176.method2753(local380, false)) {
					if (local347 != null && local347.method4671()) {
						local347.method4668(arg1);
					}
					if (local30.aBoolean349 && Static148.aBoolean137) {
						if (local386 > 30) {
							local386 = 30;
						}
						for (@Pc(483) int local483 = 0; local483 <= local56; local483++) {
							for (@Pc(487) int local487 = 0; local487 <= local53; local487++) {
								local138.QA(local483 + arg2, local487 + arg5, local386);
							}
						}
					}
				}
				if (local30.anInt5492 != 0 && arg7 != null) {
					arg7.method2693(arg2, arg5, local53, local30.aBoolean357, !local30.aBoolean358, local56);
				}
			} else {
				@Pc(634) Class26_Sub2 local634;
				if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
					if (local224) {
						local347 = new Class26_Sub2_Sub4(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg2, local56 + arg2 - 1, arg5, arg5 + local53 - 1, arg4, arg3, local189);
						if (local347.method4671()) {
							local347.method4668(arg1);
						}
						local380 = local347;
					} else {
						local380 = new Class26_Sub2_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg2, local56 + arg2 - 1, arg5, arg5 + local53 - 1, arg4, arg3, arg9);
					}
					local634 = Static278.method5819(arg6, arg2, arg5, jv.class);
					if (local634 instanceof Class26_Sub2_Sub6 && arg2 == local634.aShort93 && arg5 == local634.aShort94) {
						((Class26_Sub2_Sub6) local634).aClass26_Sub2_2 = local380;
					} else {
						Static176.method2753(local380, false);
					}
					if (Static148.aBoolean137 && !super.aBoolean304 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg6 > 0 && local30.anInt5454 != 0) {
						super.aByteArrayArrayArray11[arg6][arg2][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5] | 0x4);
					}
					if (local30.anInt5492 != 0 && arg7 != null) {
						arg7.method2693(arg2, arg5, local53, local30.aBoolean357, !local30.aBoolean358, local56);
					}
				} else {
					@Pc(756) Class26_Sub1 local756;
					if (arg4 == 0) {
						@Pc(729) int local729 = local30.anInt5454;
						if (Static350.aBoolean388 && local30.anInt5454 == -1) {
							local729 = 1;
						}
						if (local224) {
							@Pc(773) Class26_Sub1_Sub1 local773 = new Class26_Sub1_Sub1(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3, local189);
							if (local773.method4671()) {
								local773.method4668(arg1);
							}
							local756 = local773;
						} else {
							local756 = new Class26_Sub1_Sub2(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3, arg9);
						}
						@Pc(788) Class26_Sub1 local788 = Static259.method5039(arg6, arg2, arg5);
						if (local788 instanceof Class26_Sub1_Sub3) {
							((Class26_Sub1_Sub3) local788).aClass26_Sub1_1 = local756;
						} else {
							Static174.method2722(arg6, arg2, arg5, local756, null);
						}
						if (Static148.aBoolean137) {
							if (arg3 == 0) {
								if (local30.aBoolean349) {
									local138.QA(arg2, arg5, 50);
									local138.QA(arg2, arg5 + 1, 50);
								}
								if (local729 == 1 && !super.aBoolean304) {
									super.aByteArrayArrayArray11[arg6][arg2][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5] | 0x1);
								}
							} else if (arg3 == 1) {
								if (local30.aBoolean349) {
									local138.QA(arg2, arg5 + 1, 50);
									local138.QA(arg2 + 1, arg5 + 1, 50);
								}
								if (local729 == 1 && !super.aBoolean304) {
									super.aByteArrayArrayArray11[arg6][arg2][arg5 + 1] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5 + 1] | 0x2);
								}
							} else if (arg3 == 2) {
								if (local30.aBoolean349) {
									local138.QA(arg2 + 1, arg5, 50);
									local138.QA(arg2 + 1, arg5 - -1, 50);
								}
								if (local729 == 1 && !super.aBoolean304) {
									super.aByteArrayArrayArray11[arg6][arg2 + 1][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2 + 1][arg5] | 0x1);
								}
							} else if (arg3 == 3) {
								if (local30.aBoolean349) {
									local138.QA(arg2, arg5, 50);
									local138.QA(arg2 + 1, arg5, 50);
								}
								if (local729 == 1 && !super.aBoolean304) {
									super.aByteArrayArrayArray11[arg6][arg2][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5] | 0x2);
								}
							}
						}
						if (local30.anInt5492 != 0 && arg7 != null) {
							arg7.method2691(arg3, arg5, arg2, !local30.aBoolean358, local30.aBoolean357, arg4);
						}
						if (local30.anInt5481 != 16) {
							Static295.method4203(arg6, arg2, arg5, local30.anInt5481);
						}
					} else {
						@Pc(1055) Class26_Sub1_Sub1 local1055;
						@Pc(1057) Class26_Sub1 local1057;
						if (arg4 == 1) {
							if (local224) {
								local1055 = new Class26_Sub1_Sub1(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3, local189);
								local1057 = local1055;
								if (local1055.method4671()) {
									local1055.method4668(arg1);
								}
							} else {
								local1057 = new Class26_Sub1_Sub2(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3, arg9);
							}
							local756 = Static259.method5039(arg6, arg2, arg5);
							if (local756 instanceof Class26_Sub1_Sub3) {
								((Class26_Sub1_Sub3) local756).aClass26_Sub1_1 = local1057;
							} else {
								Static174.method2722(arg6, arg2, arg5, local1057, null);
							}
							if (local30.aBoolean349 && Static148.aBoolean137) {
								if (arg3 == 0) {
									local138.QA(arg2, arg5 + 1, 50);
								} else if (arg3 == 1) {
									local138.QA(arg2 + 1, arg5 + 1, 50);
								} else if (arg3 == 2) {
									local138.QA(arg2 + 1, arg5, 50);
								} else if (arg3 == 3) {
									local138.QA(arg2, arg5, 50);
								}
							}
							if (local30.anInt5492 != 0 && arg7 != null) {
								arg7.method2691(arg3, arg5, arg2, !local30.aBoolean358, local30.aBoolean357, arg4);
							}
						} else if (arg4 == 2) {
							local386 = arg3 + 1 & 0x3;
							if (local224) {
								@Pc(1209) Class26_Sub1_Sub1 local1209 = new Class26_Sub1_Sub1(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3 + 4, local189);
								@Pc(1224) Class26_Sub1_Sub1 local1224 = new Class26_Sub1_Sub1(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg4, local386, local189);
								if (local1209.method4671()) {
									local1209.method4668(arg1);
								}
								local756 = local1224;
								if (local1224.method4671()) {
									local1224.method4668(arg1);
								}
								local1057 = local1209;
							} else {
								local1057 = new Class26_Sub1_Sub2(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3 + 4, arg9);
								local756 = new Class26_Sub1_Sub2(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg4, local386, arg9);
							}
							Static174.method2722(arg6, arg2, arg5, local1057, local756);
							if (local30.anInt5454 == 1 && Static148.aBoolean137 && !super.aBoolean304) {
								if (arg3 == 0) {
									super.aByteArrayArrayArray11[arg6][arg2][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5] | 0x1);
									super.aByteArrayArrayArray11[arg6][arg2][arg5 + 1] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5 + 1] | 0x2);
								} else if (arg3 == 1) {
									super.aByteArrayArrayArray11[arg6][arg2][arg5 + 1] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5 + 1] | 0x2);
									super.aByteArrayArrayArray11[arg6][arg2 + 1][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2 + 1][arg5] | 0x1);
								} else if (arg3 == 2) {
									super.aByteArrayArrayArray11[arg6][arg2 + 1][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2 + 1][arg5] | 0x1);
									super.aByteArrayArrayArray11[arg6][arg2][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5] | 0x2);
								} else if (arg3 == 3) {
									super.aByteArrayArrayArray11[arg6][arg2][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5] | 0x2);
									super.aByteArrayArrayArray11[arg6][arg2][arg5] = (byte) (super.aByteArrayArrayArray11[arg6][arg2][arg5] | 0x1);
								}
							}
							if (local30.anInt5492 != 0 && arg7 != null) {
								arg7.method2691(arg3, arg5, arg2, !local30.aBoolean358, local30.aBoolean357, arg4);
							}
							if (local30.anInt5481 != 16) {
								Static295.method4203(arg6, arg2, arg5, local30.anInt5481);
							}
						} else if (arg4 == 3) {
							if (local224) {
								local1055 = new Class26_Sub1_Sub1(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3, local189);
								if (local1055.method4671()) {
									local1055.method4668(arg1);
								}
								local1057 = local1055;
							} else {
								local1057 = new Class26_Sub1_Sub2(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg4, arg3, arg9);
							}
							local756 = Static259.method5039(arg6, arg2, arg5);
							if (local756 instanceof Class26_Sub1_Sub3) {
								((Class26_Sub1_Sub3) local756).aClass26_Sub1_1 = local1057;
							} else {
								Static174.method2722(arg6, arg2, arg5, local1057, null);
							}
							if (local30.aBoolean349 && Static148.aBoolean137) {
								if (arg3 == 0) {
									local138.QA(arg2, arg5 + 1, 50);
								} else if (arg3 == 1) {
									local138.QA(arg2 + 1, arg5 - -1, 50);
								} else if (arg3 == 2) {
									local138.QA(arg2 + 1, arg5, 50);
								} else if (arg3 == 3) {
									local138.QA(arg2, arg5, 50);
								}
							}
							if (local30.anInt5492 != 0 && arg7 != null) {
								arg7.method2691(arg3, arg5, arg2, !local30.aBoolean358, local30.aBoolean357, arg4);
							}
						} else if (arg4 == 9) {
							if (local224) {
								local347 = new Class26_Sub2_Sub4(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg2, arg2, arg5, arg5, arg4, arg3, local189);
								if (local347.method4671()) {
									local347.method4668(arg1);
								}
								local380 = local347;
							} else {
								local380 = new Class26_Sub2_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg2, local56 + arg2 - 1, arg5, local53 + arg5 - 1, arg4, arg3, arg9);
							}
							local634 = Static278.method5819(arg6, arg2, arg5, jv.class);
							if (local634 instanceof Class26_Sub2_Sub6 && local634.aShort93 == arg2 && local634.aShort94 == arg5) {
								((Class26_Sub2_Sub6) local634).aClass26_Sub2_2 = local380;
							} else {
								Static176.method2753(local380, false);
							}
							if (local30.anInt5492 != 0 && arg7 != null) {
								arg7.method2693(arg2, arg5, local53, local30.aBoolean357, !local30.aBoolean358, local56);
							}
							if (local30.anInt5481 != 16) {
								Static295.method4203(arg6, arg2, arg5, local30.anInt5481);
							}
						} else {
							@Pc(1843) Class26_Sub3 local1843;
							if (arg4 == 4) {
								if (local224) {
									@Pc(1841) Class26_Sub3_Sub2 local1841 = new Class26_Sub3_Sub2(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, 0, 0, 0, arg4, arg3);
									local1843 = local1841;
									if (local1841.method4671()) {
										local1841.method4668(arg1);
									}
								} else {
									local1843 = new Class26_Sub3_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, 0, 0, 0, arg4, arg3, arg9);
								}
								@Pc(1877) Class26_Sub3 local1877 = Static81.method1400(arg6, arg2, arg5);
								if (local1877 instanceof Class26_Sub3_Sub3) {
									((Class26_Sub3_Sub3) local1877).aClass26_Sub3_1 = local1843;
								} else {
									Static35.method1646(arg6, arg2, arg5, local1843, null);
								}
							} else {
								@Pc(1899) int local1899;
								@Pc(1905) Interface6 local1905;
								@Pc(1973) Class26_Sub3_Sub2 local1973;
								@Pc(1988) Class26_Sub3 local1988;
								if (arg4 == 5) {
									local1899 = 17;
									local1905 = (Interface6) Static259.method5039(arg6, arg2, arg5);
									if (local1905 != null) {
										local1899 = Static71.aClass105_6.method2336(local1905.method4665()).anInt5481 + 1;
									}
									if (local224) {
										local1973 = new Class26_Sub3_Sub2(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, 0, Static209.anIntArray688[arg3] * local1899, local1899 * Static391.anIntArray564[arg3], arg4, arg3);
										local1843 = local1973;
										if (local1973.method4671()) {
											local1973.method4668(arg1);
										}
									} else {
										local1843 = new Class26_Sub3_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, 0, local1899 * Static209.anIntArray688[arg3], local1899 * Static391.anIntArray564[arg3], arg4, arg3, arg9);
									}
									local1988 = Static81.method1400(arg6, arg2, arg5);
									if (local1988 instanceof Class26_Sub3_Sub3) {
										((Class26_Sub3_Sub3) local1988).aClass26_Sub3_1 = local1843;
									} else {
										Static35.method1646(arg6, arg2, arg5, local1843, null);
									}
								} else if (arg4 == 6) {
									local1899 = 9;
									local1905 = (Interface6) Static259.method5039(arg6, arg2, arg5);
									if (local1905 != null) {
										local1899 = Static71.aClass105_6.method2336(local1905.method4665()).anInt5481 / 2 + 1;
									}
									if (local224) {
										local1973 = new Class26_Sub3_Sub2(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg3, Static209.anIntArray688[arg3] * local1899, Static391.anIntArray564[arg3] * local1899, arg4, arg3 + 4);
										if (local1973.method4671()) {
											local1973.method4668(arg1);
										}
										local1843 = local1973;
									} else {
										local1843 = new Class26_Sub3_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg3, Static359.anIntArray492[arg3] * local1899, local1899 * Static116.anIntArray180[arg3], arg4, arg3 + 4, arg9);
									}
									local1988 = Static81.method1400(arg6, arg2, arg5);
									if (local1988 instanceof Class26_Sub3_Sub3) {
										((Class26_Sub3_Sub3) local1988).aClass26_Sub3_1 = local1843;
									} else {
										Static35.method1646(arg6, arg2, arg5, local1843, null);
									}
								} else if (arg4 == 7) {
									local1899 = arg3 + 2 & 0x3;
									if (local224) {
										@Pc(2173) Class26_Sub3_Sub2 local2173 = new Class26_Sub3_Sub2(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, local1899, 0, 0, arg4, local1899 + 4);
										if (local2173.method4671()) {
											local2173.method4668(arg1);
										}
										local1843 = local2173;
									} else {
										local1843 = new Class26_Sub3_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, local1899, 0, 0, arg4, local1899 + 4, arg9);
									}
									@Pc(2188) Class26_Sub3 local2188 = Static81.method1400(arg6, arg2, arg5);
									if (local2188 instanceof Class26_Sub3_Sub3) {
										((Class26_Sub3_Sub3) local2188).aClass26_Sub3_1 = local1843;
									} else {
										Static35.method1646(arg6, arg2, arg5, local1843, null);
									}
								} else if (arg4 == 8) {
									local386 = arg3 + 2 & 0x3;
									@Pc(2214) int local2214 = 9;
									@Pc(2220) Interface6 local2220 = (Interface6) Static259.method5039(arg6, arg2, arg5);
									if (local2220 != null) {
										local2214 = Static71.aClass105_6.method2336(local2220.method4665()).anInt5481 / 2 + 1;
									}
									@Pc(2265) Class26_Sub3 local2265;
									@Pc(2286) Class26_Sub3 local2286;
									if (local224) {
										local2265 = new Class26_Sub3_Sub2(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg3, local2214 * Static359.anIntArray492[arg3], Static116.anIntArray180[arg3] * local2214, arg4, arg3 + 4);
										local2286 = new Class26_Sub3_Sub2(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg3, 0, 0, arg4, local386 + 4);
										if (local2265.method4671()) {
											local2265.method4668(arg1);
										}
										if (local2286.method4671()) {
											local2286.method4668(arg1);
										}
									} else {
										local2265 = new Class26_Sub3_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg3, Static359.anIntArray492[arg3] * local2214, local2214 * Static116.anIntArray180[arg3], arg4, arg3 + 4, arg9);
										local2286 = new Class26_Sub3_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg3, 0, 0, arg4, local386 + 4, arg9);
									}
									Static35.method1646(arg6, arg2, arg5, local2265, local2286);
								}
							}
						}
					}
				}
			}
		} else if (Static389.aClass128_Sub1_1.aBoolean240 || local30.anInt5468 != 0 || local30.anInt5492 == 1 || local30.aBoolean355) {
			@Pc(281) Class26_Sub4 local281;
			if (local224) {
				@Pc(279) Class26_Sub4_Sub3 local279 = new Class26_Sub4_Sub3(arg1, local30, arg8, local169, local161, local177, super.aBoolean304, arg3, local189);
				local281 = local279;
				if (local279.method4671()) {
					local279.method4668(arg1);
				}
			} else {
				local281 = new Class26_Sub4_Sub1(arg1, local30, arg6, arg8, local169, local161, local177, super.aBoolean304, arg3, arg9);
			}
			@Pc(311) Class26_Sub4 local311 = Static366.method4342(arg6, arg2, arg5);
			if (local311 instanceof Class26_Sub4_Sub2) {
				((Class26_Sub4_Sub2) local311).aClass26_Sub4_1 = local281;
			} else {
				Static208.method3188(arg6, arg2, arg5, local281);
			}
			if (local30.anInt5492 == 1 && arg7 != null) {
				arg7.method2696(arg2, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!qa;Z)V")
	public void method3661(@OriginalArg(0) Class109 arg0) {
		Static78.method1352(arg0);
		@Pc(19) int local19;
		@Pc(23) int local23;
		if (super.anInt4453 > 1) {
			for (local19 = 0; super.anInt4452 > local19; local19++) {
				for (local23 = 0; super.anInt4446 > local23; local23++) {
					if ((Static184.aByteArrayArrayArray3[1][local19][local23] & 0x2) == 2) {
						Static387.method5303(local19, local23);
					}
				}
			}
		}
		for (local19 = 0; local19 < super.anInt4453; local19++) {
			for (local23 = 0; super.anInt4446 >= local23; local23++) {
				for (@Pc(65) int local65 = 0; super.anInt4452 >= local65; local65++) {
					@Pc(83) int local83;
					@Pc(85) int local85;
					@Pc(87) int local87;
					@Pc(116) int local116;
					@Pc(144) int local144;
					@Pc(234) int local234;
					@Pc(243) int local243;
					@Pc(263) int local263;
					@Pc(267) int local267;
					if ((super.aByteArrayArrayArray11[local19][local65][local23] & 0x1) != 0) {
						local83 = local23;
						local85 = local23;
						local87 = local19;
						while (super.anInt4446 > local85 && (super.aByteArrayArrayArray11[local19][local65][local85 + 1] & 0x1) != 0) {
							local85++;
						}
						local116 = local19;
						while (local83 > 0 && (super.aByteArrayArrayArray11[local19][local65][local83 - 1] & 0x1) != 0) {
							local83--;
						}
						label164: while (local87 > 0) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray11[local87 - 1][local65][local144] & 0x1) == 0) {
									break label164;
								}
							}
							local87--;
						}
						label153: while (local116 < 3) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray11[local116 + 1][local65][local144] & 0x1) == 0) {
									break label153;
								}
							}
							local116++;
						}
						local144 = (local116 + 1 - local87) * (local85 + 1 - local83);
						if (local144 >= 2) {
							local234 = super.anIntArrayArrayArray12[local116][local65][local83] - 240;
							local243 = super.anIntArrayArrayArray12[local87][local65][local83];
							Static85.method1426(1, local65 << 7, local65 << 7, local83 << 7, (local85 << 7) + 128, local234, local243);
							for (local263 = local87; local263 <= local116; local263++) {
								for (local267 = local83; local267 <= local85; local267++) {
									super.aByteArrayArrayArray11[local263][local65][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local19][local65][local23] & 0x2) != 0) {
						local83 = local65;
						local85 = local65;
						local87 = local19;
						while (local83 > 0 && (super.aByteArrayArrayArray11[local19][local83 - 1][local23] & 0x2) != 0) {
							local83--;
						}
						local116 = local19;
						while (super.anInt4452 > local85 && (super.aByteArrayArrayArray11[local19][local85 + 1][local23] & 0x2) != 0) {
							local85++;
						}
						label218: while (local87 > 0) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray11[local87 - 1][local144][local23] & 0x2) == 0) {
									break label218;
								}
							}
							local87--;
						}
						label207: while (local116 < 3) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray11[local116 + 1][local144][local23] & 0x2) == 0) {
									break label207;
								}
							}
							local116++;
						}
						local144 = (local85 + 1 - local83) * (local116 + 1 - local87);
						if (local144 >= 2) {
							local234 = super.anIntArrayArrayArray12[local116][local83][local23] - 240;
							local243 = super.anIntArrayArrayArray12[local87][local83][local23];
							Static85.method1426(2, local83 << 7, (local85 << 7) + 128, local23 << 7, local23 << 7, local234, local243);
							for (local263 = local87; local263 <= local116; local263++) {
								for (local267 = local83; local267 <= local85; local267++) {
									super.aByteArrayArrayArray11[local263][local267][local23] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local19][local65][local23] & 0x4) != 0) {
						local83 = local65;
						local85 = local65;
						local87 = local23;
						local116 = local23;
						while (local87 > 0 && (super.aByteArrayArrayArray11[local19][local65][local87 - 1] & 0x4) != 0) {
							local87--;
						}
						while (local116 < super.anInt4446 && (super.aByteArrayArrayArray11[local19][local65][local116 + 1] & 0x4) != 0) {
							local116++;
						}
						label272: while (local83 > 0) {
							for (local144 = local87; local144 <= local116; local144++) {
								if ((super.aByteArrayArrayArray11[local19][local83 - 1][local144] & 0x4) == 0) {
									break label272;
								}
							}
							local83--;
						}
						label261: while (super.anInt4452 > local85) {
							for (local144 = local87; local144 <= local116; local144++) {
								if ((super.aByteArrayArrayArray11[local19][local85 + 1][local144] & 0x4) == 0) {
									break label261;
								}
							}
							local85++;
						}
						if ((local85 + 1 - local83) * (local116 + 1 - local87) >= 4) {
							local144 = super.anIntArrayArrayArray12[local19][local83][local87];
							Static85.method1426(4, local83 << 7, (local85 << 7) + 128, local87 << 7, (local116 << 7) + 128, local144, local144);
							for (@Pc(708) int local708 = local83; local708 <= local85; local708++) {
								for (local234 = local87; local234 <= local116; local234++) {
									super.aByteArrayArrayArray11[local19][local708][local234] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([IIILclient!qa;ZLclient!lh;)V")
	public void method3662(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(5) Class1_Sub1 arg4) {
		if (super.aBoolean304) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(19) Class33 local19 = null;
		while (true) {
			@Pc(24) int local24;
			@Pc(42) int local42;
			@Pc(246) int local246;
			@Pc(250) int local250;
			@Pc(49) int local49;
			while (arg4.aByteArray66.length > arg4.anInt5056) {
				local24 = arg4.method4130();
				if (local24 == 0) {
					local19 = new Class33(arg4);
				} else {
					@Pc(104) int local104;
					@Pc(108) int local108;
					@Pc(95) int local95;
					if (local24 == 1) {
						local42 = arg4.method4130();
						if (local42 > 0) {
							for (local49 = 0; local49 < local42; local49++) {
								@Pc(58) Class124 local58 = new Class124(arg3, arg4, 0);
								if (local58.anInt3448 == 31) {
									@Pc(69) Class120 local69 = Static445.aClass8_1.method233(arg4.method4093());
									local58.method2888(local69.anInt3229, local69.anInt3234, local69.anInt3227, local69.anInt3231);
								}
								if (arg3.method4755() > 0) {
									@Pc(86) Class1_Sub5 local86 = local58.aClass1_Sub5_1;
									local95 = local86.method3333() + (arg1 << 7);
									local104 = local86.method3325() + (arg2 << 7);
									local108 = local95 >> 7;
									@Pc(112) int local112 = local104 >> 7;
									if (local108 >= 0 && local112 >= 0 && super.anInt4452 > local108 && local112 < super.anInt4446) {
										local86.method3332(local95, local104, super.anIntArrayArrayArray12[local58.anInt3439][local108][local112] - local86.method3326());
										if (arg3.method4755() > 0) {
											Static257.method3782(local58);
										}
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local19 == null) {
							local19 = new Class33();
						}
						local19.method671(arg4);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray10 == null) {
							super.aByteArrayArrayArray10 = new byte[4][][];
						}
						for (local42 = 0; local42 < 4; local42++) {
							@Pc(204) byte local204 = arg4.method4112();
							if (local204 == 0 && super.aByteArrayArrayArray10[local42] != null) {
								local246 = arg1;
								local250 = arg1 + 64;
								local95 = arg2;
								if (local250 < 0) {
									local250 = 0;
								} else if (local250 >= super.anInt4452) {
									local250 = super.anInt4452;
								}
								if (arg2 < 0) {
									local95 = 0;
								} else if (super.anInt4446 <= arg2) {
									local95 = super.anInt4446;
								}
								if (arg1 < 0) {
									local246 = 0;
								} else if (arg1 >= super.anInt4452) {
									local246 = super.anInt4452;
								}
								local104 = arg2 + 64;
								if (local104 < 0) {
									local104 = 0;
								} else if (super.anInt4446 <= local104) {
									local104 = super.anInt4446;
								}
								while (local246 < local250) {
									while (local95 < local104) {
										super.aByteArrayArrayArray10[local42][local246][local95] = 0;
										local95++;
									}
									local246++;
								}
							} else if (local204 == 1) {
								if (super.aByteArrayArrayArray10[local42] == null) {
									super.aByteArrayArrayArray10[local42] = new byte[super.anInt4452 + 1][super.anInt4446 + 1];
								}
								for (local246 = 0; local246 < 64; local246 += 4) {
									for (local250 = 0; local250 < 64; local250 += 4) {
										@Pc(381) byte local381 = arg4.method4112();
										for (local104 = arg1 + local246; local104 < local246 + arg1 + 4; local104++) {
											for (local108 = local250 + arg2; local108 < local250 + arg2 + 4; local108++) {
												if (local104 >= 0 && super.anInt4452 > local104 && local108 >= 0 && super.anInt4446 > local108) {
													super.aByteArrayArrayArray10[local42][local104][local108] = local381;
												}
											}
										}
									}
								}
							} else if (local204 == 2) {
								if (super.aByteArrayArrayArray10[local42] == null) {
									super.aByteArrayArrayArray10[local42] = new byte[super.anInt4452 + 1][super.anInt4446 + 1];
								}
								if (local42 > 0) {
									local246 = arg1;
									local250 = arg1 + 64;
									local95 = arg2;
									local104 = arg2 + 64;
									if (local250 < 0) {
										local250 = 0;
									} else if (local250 >= super.anInt4452) {
										local250 = super.anInt4452;
									}
									if (arg1 < 0) {
										local246 = 0;
									} else if (arg1 >= super.anInt4452) {
										local246 = super.anInt4452;
									}
									if (arg2 < 0) {
										local95 = 0;
									} else if (super.anInt4446 <= arg2) {
										local95 = super.anInt4446;
									}
									if (local104 < 0) {
										local104 = 0;
									} else if (local104 >= super.anInt4446) {
										local104 = super.anInt4446;
									}
									while (local250 > local246) {
										while (local104 > local95) {
											super.aByteArrayArrayArray10[local42][local246][local95] = super.aByteArrayArrayArray10[local42 - 1][local246][local95];
											local95++;
										}
										local246++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg0 == null) {
						arg4.anInt5056 += 10;
					} else {
						arg0[0] = arg4.method4093();
						arg0[1] = arg4.method4100();
						arg0[2] = arg4.method4100();
						arg0[3] = arg4.method4100();
						arg0[4] = arg4.method4093();
					}
				}
			}
			if (local19 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local42 = 0; local42 < 8; local42++) {
						local49 = local24 + (arg1 >> 3);
						local246 = (arg2 >> 3) + local42;
						if (local49 >= 0 && local49 < super.anInt4452 >> 3 && local246 >= 0 && super.anInt4446 >> 3 > local246) {
							Static22.method3264(local19, local49, local246);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray10 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray10[local24] != null) {
						for (local42 = 0; local42 < 16; local42++) {
							for (local49 = 0; local49 < 16; local49++) {
								local246 = local42 + (arg1 >> 2);
								local250 = (arg2 >> 2) + local49;
								if (local246 >= 0 && local246 < 26 && local250 >= 0 && local250 < 26) {
									super.aByteArrayArrayArray10[local24][local246][local250] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BIIIIILclient!qa;I[Lclient!id;I)V")
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class109 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class112[] arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class1_Sub1 local10 = new Class1_Sub1(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method4120();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method4096();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local10.method4130();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (arg0 == local58 && local54 >= arg9 && local54 < arg9 + 8 && arg4 <= local48 && arg4 + 8 > local48) {
					@Pc(102) Class182 local102 = Static71.aClass105_6.method2336(local17);
					@Pc(119) int local119 = Static367.method5044(local70, local54 & 0x7, local102.anInt5486, arg7, local48 & 0x7, local102.anInt5487) + arg5;
					@Pc(136) int local136 = arg2 + Static17.method341(local48 & 0x7, arg7, local54 & 0x7, local102.anInt5487, local102.anInt5486, local70);
					if (local119 > 0 && local136 > 0 && local119 < super.anInt4452 - 1 && local136 < super.anInt4446 - 1) {
						@Pc(161) Class112 local161 = null;
						if (!super.aBoolean304) {
							@Pc(166) int local166 = arg3;
							if ((Static184.aByteArrayArrayArray3[1][local119][local136] & 0x2) == 2) {
								local166 = arg3 - 1;
							}
							if (local166 >= 0) {
								local161 = arg8[local166];
							}
						}
						this.method3659(local17, arg6, local119, arg7 + local70 & 0x3, local66, local136, arg3, local161, arg3, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!qa;[BII[Lclient!id;)V")
	public void method3664(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class112[] arg4) {
		@Pc(18) Class1_Sub1 local18 = new Class1_Sub1(arg2);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method4120();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method4096();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local18.method4130();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(77) int local77 = arg0 + local57;
				@Pc(81) int local81 = local51 + arg3;
				if (local77 > 0 && local81 > 0 && super.anInt4452 - 1 > local77 && super.anInt4446 - 1 > local81) {
					@Pc(103) Class112 local103 = null;
					if (!super.aBoolean304) {
						@Pc(108) int local108 = local61;
						if ((Static184.aByteArrayArrayArray3[1][local77][local81] & 0x2) == 2) {
							local108 = local61 - 1;
						}
						if (local108 >= 0) {
							local103 = arg4[local108];
						}
					}
					this.method3659(local20, arg1, local77, local73, local69, local81, local61, local103, local61, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[ILclient!qa;IBIILclient!lh;II)V")
	public void method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub1 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean304) {
			return;
		}
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(19) Class33 local19 = null;
		@Pc(25) int local25 = (arg0 & 0x7) * 8;
		@Pc(31) int local31 = (arg6 & 0x7) * 8;
		while (true) {
			@Pc(38) int local38;
			@Pc(123) int local123;
			@Pc(161) int local161;
			@Pc(438) int local438;
			while (arg7.aByteArray66.length > arg7.anInt5056) {
				local38 = arg7.method4130();
				if (local38 == 0) {
					local19 = new Class33(arg7);
				} else {
					@Pc(180) int local180;
					@Pc(184) int local184;
					@Pc(226) int local226;
					@Pc(311) int local311;
					if (local38 == 1) {
						local123 = arg7.method4130();
						if (local123 > 0) {
							for (local438 = 0; local438 < local123; local438++) {
								@Pc(447) Class124 local447 = new Class124(arg3, arg7, 0);
								if (local447.anInt3448 == 31) {
									@Pc(458) Class120 local458 = Static445.aClass8_1.method233(arg7.method4093());
									local447.method2888(local458.anInt3229, local458.anInt3234, local458.anInt3227, local458.anInt3231);
								}
								if (arg3.method4755() > 0) {
									@Pc(478) Class1_Sub5 local478 = local447.aClass1_Sub5_1;
									local311 = local478.method3333() >> 7;
									local180 = local478.method3325() >> 7;
									if (local447.anInt3439 == arg5 && local311 >= local25 && local25 + 8 > local311 && local31 <= local180 && local180 < local31 + 8) {
										local184 = (arg8 << 7) + Static438.method5869(arg1, local478.method3333() & 0x3FF, local478.method3325() & 0x3FF);
										local226 = (arg4 << 7) + Static168.method2675(arg1, local478.method3333() & 0x3FF, local478.method3325() & 0x3FF);
										local311 = local184 >> 7;
										local180 = local226 >> 7;
										if (local311 >= 0 && local180 >= 0 && super.anInt4452 > local311 && super.anInt4446 > local180) {
											local478.method3332(local184, local226, super.anIntArrayArrayArray12[arg5][local311][local180] - local478.method3326());
											if (arg3.method4755() > 0) {
												Static257.method3782(local447);
											}
										}
									}
								}
							}
						}
					} else if (local38 == 2) {
						if (local19 == null) {
							local19 = new Class33();
						}
						local19.method671(arg7);
					} else if (local38 != 128) {
						if (local38 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray10 == null) {
							super.aByteArrayArrayArray10 = new byte[4][][];
						}
						for (local123 = 0; local123 < 4; local123++) {
							@Pc(129) byte local129 = arg7.method4112();
							@Pc(165) int local165;
							if (local129 == 0 && super.aByteArrayArrayArray10[arg9] != null) {
								if (local123 <= arg5) {
									local161 = arg8;
									local165 = arg8 + 7;
									local311 = arg4;
									if (local165 < 0) {
										local165 = 0;
									} else if (super.anInt4452 <= local165) {
										local165 = super.anInt4452;
									}
									if (arg8 < 0) {
										local161 = 0;
									} else if (super.anInt4452 <= arg8) {
										local161 = super.anInt4452;
									}
									if (arg4 < 0) {
										local311 = 0;
									} else if (super.anInt4446 <= arg4) {
										local311 = super.anInt4446;
									}
									local180 = arg4 + 7;
									if (local180 < 0) {
										local180 = 0;
									} else if (super.anInt4446 <= local180) {
										local180 = super.anInt4446;
									}
									while (local165 > local161) {
										while (local311 < local180) {
											super.aByteArrayArrayArray10[arg9][local161][local311] = 0;
											local311++;
										}
										local161++;
									}
								}
							} else if (local129 == 1) {
								if (super.aByteArrayArrayArray10[arg9] == null) {
									super.aByteArrayArrayArray10[arg9] = new byte[super.anInt4452 + 1][super.anInt4446 + 1];
								}
								for (local161 = 0; local161 < 64; local161 += 4) {
									for (local165 = 0; local165 < 64; local165 += 4) {
										@Pc(171) byte local171 = arg7.method4112();
										if (local123 <= arg5) {
											for (local180 = local161; local180 < local161 + 4; local180++) {
												for (local184 = local165; local184 < local165 + 4; local184++) {
													if (local180 >= local25 && local180 < local25 + 8 && local31 <= local184 && local31 + 8 > local31) {
														local226 = Static419.method5631(arg1, local180 & 0x7, local184 & 0x7) + arg8;
														@Pc(239) int local239 = arg4 + Static271.method3947(local180 & 0x7, local184 & 0x7, arg1);
														if (local226 >= 0 && super.anInt4452 > local226 && local239 >= 0 && local239 < super.anInt4446) {
															super.aByteArrayArrayArray10[arg9][local226][local239] = local171;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg2 == null) {
						arg7.anInt5056 += 10;
					} else {
						arg2[0] = arg7.method4093();
						arg2[1] = arg7.method4100();
						arg2[2] = arg7.method4100();
						arg2[3] = arg7.method4100();
						arg2[4] = arg7.method4093();
					}
				}
			}
			if (local19 != null) {
				Static22.method3264(local19, arg8 >> 3, arg4 >> 3);
			}
			if (super.aByteArrayArrayArray10 != null && super.aByteArrayArrayArray10[arg9] != null) {
				local38 = arg8 + 7;
				local123 = arg4 + 7;
				for (local438 = arg8; local438 < local38; local438++) {
					for (local161 = arg4; local161 < local123; local161++) {
						super.aByteArrayArrayArray10[arg9][local438][local161] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
