import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
	public int anInt7280 = 99;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIZ)V")
	public Class115_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static281.aClass253_4, Static134.aClass140_3);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILclient!eq;IIILclient!qo;IIII)V")
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class210 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static291.aClass28_Sub1_1.method832(Static294.anInt5208) && !Static426.method6223(Static232.anInt4221, arg7, arg6, arg4)) {
			return;
		}
		if (arg0 < this.anInt7280) {
			this.anInt7280 = arg0;
		}
		@Pc(30) Class106 local30 = Static448.aClass104_4.method2616(arg8);
		if (Static294.anInt5208 == 1 && local30.aBoolean203) {
			return;
		}
		@Pc(53) int local53;
		@Pc(50) int local50;
		if (arg3 == 1 || arg3 == 3) {
			local50 = local30.anInt3158;
			local53 = local30.anInt3194;
		} else {
			local50 = local30.anInt3194;
			local53 = local30.anInt3158;
		}
		@Pc(86) int local86;
		@Pc(80) int local80;
		if (super.anInt7272 >= arg7 + local53) {
			local80 = (local53 + 1 >> 1) + arg7;
			local86 = (local53 >> 1) + arg7;
		} else {
			local80 = arg7 + 1;
			local86 = arg7;
		}
		@Pc(107) int local107;
		@Pc(105) int local105;
		if (arg4 + local50 > super.anInt7273) {
			local105 = arg4 + 1;
			local107 = arg4;
		} else {
			local107 = arg4 + (local50 >> 1);
			local105 = (local50 + 1 >> 1) + arg4;
		}
		@Pc(128) Class86 local128 = Static55.aClass86Array1[arg6];
		@Pc(155) int local155 = local128.method6594(local86, local107) + local128.method6594(local80, local107) + local128.method6594(local86, local105) + local128.method6594(local80, local105) >> 2;
		@Pc(163) int local163 = (local53 << 6) + (arg7 << 7);
		@Pc(171) int local171 = (local50 << 6) + (arg4 << 7);
		@Pc(183) boolean local183 = Static97.aBoolean149 && !super.aBoolean462 && local30.aBoolean212;
		if (local30.method2639()) {
			Static160.method2662(arg0, arg3, local30, null, arg7, null, arg4);
		}
		@Pc(216) boolean local216 = arg1 == -1 && local30.anInt3153 == -1 && local30.anIntArray189 == null && local30.anIntArray188 == null && !local30.aBoolean210;
		if (Static68.aBoolean471 && (Static350.method5227(arg9) && local30.anInt3191 != 1 || !(!Static145.method2483(arg9) || local30.anInt3191 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(376) Class3_Sub2 local376;
			@Pc(346) Class3_Sub2_Sub4 local346;
			@Pc(378) int local378;
			if (arg9 == 10 || arg9 == 11) {
				local346 = null;
				if (local216) {
					@Pc(408) Class3_Sub2_Sub4 local408 = new Class3_Sub2_Sub4(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg7, local53 + arg7 - 1, arg4, local50 + arg4 - 1, arg9, arg3, local183);
					local376 = local408;
					local346 = local408;
					local378 = local408.method2928();
				} else {
					local376 = new Class3_Sub2_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg7, local53 + arg7 - 1, arg4, arg4 + local50 - 1, arg9, arg3, arg1);
					local378 = 15;
				}
				@Pc(429) Class3_Sub2 local429 = Static415.method6101(arg0, arg7, arg4, sq.class);
				@Pc(431) boolean local431 = false;
				if (local429 instanceof Class3_Sub2_Sub2 && local429.aShort101 == arg7 && local429.aShort102 == arg4) {
					((Class3_Sub2_Sub2) local429).aClass3_Sub2_1 = local376;
					local431 = true;
				}
				if (local431 || Static411.method6066(local376, false)) {
					if (local346 != null && local346.method5326()) {
						local346.method5322(arg2);
					}
					if (local30.aBoolean202 && Static97.aBoolean149) {
						if (local378 > 30) {
							local378 = 30;
						}
						for (@Pc(478) int local478 = 0; local478 <= local53; local478++) {
							for (@Pc(482) int local482 = 0; local482 <= local50; local482++) {
								local128.method6593(arg7 + local478, arg4 - -local482, local378);
							}
						}
					}
				}
				if (local30.anInt3186 != 0 && arg5 != null) {
					arg5.method4713(local53, local50, local30.aBoolean209, arg7, !local30.aBoolean201, arg4);
				}
			} else {
				@Pc(627) Class3_Sub2 local627;
				if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
					if (local216) {
						local346 = new Class3_Sub2_Sub4(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg7, arg7 + local53 - 1, arg4, arg4 + local50 - 1, arg9, arg3, local183);
						local376 = local346;
						if (local346.method5326()) {
							local346.method5322(arg2);
						}
					} else {
						local376 = new Class3_Sub2_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg7, local53 + arg7 - 1, arg4, arg4 + local50 - 1, arg9, arg3, arg1);
					}
					local627 = Static415.method6101(arg0, arg7, arg4, sq.class);
					if (local627 instanceof Class3_Sub2_Sub2 && arg7 == local627.aShort101 && local627.aShort102 == arg4) {
						((Class3_Sub2_Sub2) local627).aClass3_Sub2_1 = local376;
					} else {
						Static411.method6066(local376, false);
					}
					if (Static97.aBoolean149 && !super.aBoolean462 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg0 > 0 && local30.anInt3191 != 0) {
						super.aByteArrayArrayArray13[arg0][arg7][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4] | 0x4);
					}
					if (local30.anInt3186 != 0 && arg5 != null) {
						arg5.method4713(local53, local50, local30.aBoolean209, arg7, !local30.aBoolean201, arg4);
					}
				} else {
					@Pc(755) Class3_Sub3 local755;
					if (arg9 == 0) {
						@Pc(728) int local728 = local30.anInt3191;
						if (Static425.aBoolean362 && local30.anInt3191 == -1) {
							local728 = 1;
						}
						if (local216) {
							@Pc(753) Class3_Sub3_Sub1 local753 = new Class3_Sub3_Sub1(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3, local183);
							local755 = local753;
							if (local753.method5326()) {
								local753.method5322(arg2);
							}
						} else {
							local755 = new Class3_Sub3_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3, arg1);
						}
						@Pc(786) Class3_Sub3 local786 = Static86.method825(arg0, arg7, arg4);
						if (local786 instanceof Class3_Sub3_Sub2) {
							((Class3_Sub3_Sub2) local786).aClass3_Sub3_3 = local755;
						} else {
							Static163.method2695(arg0, arg7, arg4, local755, null);
						}
						if (Static97.aBoolean149) {
							if (arg3 == 0) {
								if (local30.aBoolean202) {
									local128.method6593(arg7, arg4, 50);
									local128.method6593(arg7, arg4 + 1, 50);
								}
								if (local728 == 1 && !super.aBoolean462) {
									super.aByteArrayArrayArray13[arg0][arg7][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4] | 0x1);
								}
							} else if (arg3 == 1) {
								if (local30.aBoolean202) {
									local128.method6593(arg7, arg4 + 1, 50);
									local128.method6593(arg7 + 1, arg4 - -1, 50);
								}
								if (local728 == 1 && !super.aBoolean462) {
									super.aByteArrayArrayArray13[arg0][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4 + 1] | 0x2);
								}
							} else if (arg3 == 2) {
								if (local30.aBoolean202) {
									local128.method6593(arg7 + 1, arg4, 50);
									local128.method6593(arg7 + 1, arg4 + 1, 50);
								}
								if (local728 == 1 && !super.aBoolean462) {
									super.aByteArrayArrayArray13[arg0][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7 + 1][arg4] | 0x1);
								}
							} else if (arg3 == 3) {
								if (local30.aBoolean202) {
									local128.method6593(arg7, arg4, 50);
									local128.method6593(arg7 + 1, arg4, 50);
								}
								if (local728 == 1 && !super.aBoolean462) {
									super.aByteArrayArrayArray13[arg0][arg7][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4] | 0x2);
								}
							}
						}
						if (local30.anInt3186 != 0 && arg5 != null) {
							arg5.method4716(arg9, arg3, arg7, !local30.aBoolean201, arg4, local30.aBoolean209);
						}
						if (local30.anInt3154 != 16) {
							Static205.method3147(arg0, arg7, arg4, local30.anInt3154);
						}
					} else {
						@Pc(1061) Class3_Sub3_Sub1 local1061;
						@Pc(1063) Class3_Sub3 local1063;
						if (arg9 == 1) {
							if (local216) {
								local1061 = new Class3_Sub3_Sub1(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3, local183);
								local1063 = local1061;
								if (local1061.method5326()) {
									local1061.method5322(arg2);
								}
							} else {
								local1063 = new Class3_Sub3_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3, arg1);
							}
							local755 = Static86.method825(arg0, arg7, arg4);
							if (local755 instanceof Class3_Sub3_Sub2) {
								((Class3_Sub3_Sub2) local755).aClass3_Sub3_3 = local1063;
							} else {
								Static163.method2695(arg0, arg7, arg4, local1063, null);
							}
							if (local30.aBoolean202 && Static97.aBoolean149) {
								if (arg3 == 0) {
									local128.method6593(arg7, arg4 + 1, 50);
								} else if (arg3 == 1) {
									local128.method6593(arg7 + 1, arg4 + 1, 50);
								} else if (arg3 == 2) {
									local128.method6593(arg7 + 1, arg4, 50);
								} else if (arg3 == 3) {
									local128.method6593(arg7, arg4, 50);
								}
							}
							if (local30.anInt3186 != 0 && arg5 != null) {
								arg5.method4716(arg9, arg3, arg7, !local30.aBoolean201, arg4, local30.aBoolean209);
							}
						} else if (arg9 == 2) {
							local378 = arg3 + 1 & 0x3;
							if (local216) {
								@Pc(1212) Class3_Sub3_Sub1 local1212 = new Class3_Sub3_Sub1(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3 + 4, local183);
								@Pc(1227) Class3_Sub3_Sub1 local1227 = new Class3_Sub3_Sub1(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg9, local378, local183);
								if (local1212.method5326()) {
									local1212.method5322(arg2);
								}
								if (local1227.method5326()) {
									local1227.method5322(arg2);
								}
								local1063 = local1212;
								local755 = local1227;
							} else {
								local1063 = new Class3_Sub3_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3 + 4, arg1);
								local755 = new Class3_Sub3_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg9, local378, arg1);
							}
							Static163.method2695(arg0, arg7, arg4, local1063, local755);
							if (local30.anInt3191 == 1 && Static97.aBoolean149 && !super.aBoolean462) {
								if (arg3 == 0) {
									super.aByteArrayArrayArray13[arg0][arg7][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4] | 0x1);
									super.aByteArrayArrayArray13[arg0][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4 + 1] | 0x2);
								} else if (arg3 == 1) {
									super.aByteArrayArrayArray13[arg0][arg7][arg4 + 1] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4 + 1] | 0x2);
									super.aByteArrayArrayArray13[arg0][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7 + 1][arg4] | 0x1);
								} else if (arg3 == 2) {
									super.aByteArrayArrayArray13[arg0][arg7 + 1][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7 + 1][arg4] | 0x1);
									super.aByteArrayArrayArray13[arg0][arg7][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4] | 0x2);
								} else if (arg3 == 3) {
									super.aByteArrayArrayArray13[arg0][arg7][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4] | 0x2);
									super.aByteArrayArrayArray13[arg0][arg7][arg4] = (byte) (super.aByteArrayArrayArray13[arg0][arg7][arg4] | 0x1);
								}
							}
							if (local30.anInt3186 != 0 && arg5 != null) {
								arg5.method4716(arg9, arg3, arg7, !local30.aBoolean201, arg4, local30.aBoolean209);
							}
							if (local30.anInt3154 != 16) {
								Static205.method3147(arg0, arg7, arg4, local30.anInt3154);
							}
						} else if (arg9 == 3) {
							if (local216) {
								local1061 = new Class3_Sub3_Sub1(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3, local183);
								if (local1061.method5326()) {
									local1061.method5322(arg2);
								}
								local1063 = local1061;
							} else {
								local1063 = new Class3_Sub3_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg9, arg3, arg1);
							}
							local755 = Static86.method825(arg0, arg7, arg4);
							if (local755 instanceof Class3_Sub3_Sub2) {
								((Class3_Sub3_Sub2) local755).aClass3_Sub3_3 = local1063;
							} else {
								Static163.method2695(arg0, arg7, arg4, local1063, null);
							}
							if (local30.aBoolean202 && Static97.aBoolean149) {
								if (arg3 == 0) {
									local128.method6593(arg7, arg4 + 1, 50);
								} else if (arg3 == 1) {
									local128.method6593(arg7 + 1, arg4 + 1, 50);
								} else if (arg3 == 2) {
									local128.method6593(arg7 + 1, arg4, 50);
								} else if (arg3 == 3) {
									local128.method6593(arg7, arg4, 50);
								}
							}
							if (local30.anInt3186 != 0 && arg5 != null) {
								arg5.method4716(arg9, arg3, arg7, !local30.aBoolean201, arg4, local30.aBoolean209);
							}
						} else if (arg9 == 9) {
							if (local216) {
								local346 = new Class3_Sub2_Sub4(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg7, arg7, arg4, arg4, arg9, arg3, local183);
								if (local346.method5326()) {
									local346.method5322(arg2);
								}
								local376 = local346;
							} else {
								local376 = new Class3_Sub2_Sub3(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg7, local53 + arg7 - 1, arg4, local50 + arg4 - 1, arg9, arg3, arg1);
							}
							local627 = Static415.method6101(arg0, arg7, arg4, sq.class);
							if (local627 instanceof Class3_Sub2_Sub2 && arg7 == local627.aShort101 && arg4 == local627.aShort102) {
								((Class3_Sub2_Sub2) local627).aClass3_Sub2_1 = local376;
							} else {
								Static411.method6066(local376, false);
							}
							if (local30.anInt3186 != 0 && arg5 != null) {
								arg5.method4713(local53, local50, local30.aBoolean209, arg7, !local30.aBoolean201, arg4);
							}
							if (local30.anInt3154 != 16) {
								Static205.method3147(arg0, arg7, arg4, local30.anInt3154);
							}
						} else {
							@Pc(1827) Class3_Sub1 local1827;
							if (arg9 == 4) {
								if (local216) {
									@Pc(1825) Class3_Sub1_Sub3 local1825 = new Class3_Sub1_Sub3(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, 0, 0, 0, arg9, arg3);
									local1827 = local1825;
									if (local1825.method5326()) {
										local1825.method5322(arg2);
									}
								} else {
									local1827 = new Class3_Sub1_Sub1(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, 0, 0, 0, arg9, arg3, arg1);
								}
								@Pc(1861) Class3_Sub1 local1861 = Static273.method4127(arg0, arg7, arg4);
								if (local1861 instanceof Class3_Sub1_Sub2) {
									((Class3_Sub1_Sub2) local1861).aClass3_Sub1_1 = local1827;
								} else {
									Static445.method6519(arg0, arg7, arg4, local1827, null);
								}
							} else {
								@Pc(1881) int local1881;
								@Pc(1887) Interface10 local1887;
								@Pc(1926) Class3_Sub1_Sub3 local1926;
								@Pc(1970) Class3_Sub1 local1970;
								if (arg9 == 5) {
									local1881 = 17;
									local1887 = (Interface10) Static86.method825(arg0, arg7, arg4);
									if (local1887 != null) {
										local1881 = Static448.aClass104_4.method2616(local1887.method5325()).anInt3154 + 1;
									}
									if (local216) {
										local1926 = new Class3_Sub1_Sub3(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, 0, local1881 * Static152.anIntArray186[arg3], Static314.anIntArray367[arg3] * local1881, arg9, arg3);
										local1827 = local1926;
										if (local1926.method5326()) {
											local1926.method5322(arg2);
										}
									} else {
										local1827 = new Class3_Sub1_Sub1(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, 0, Static152.anIntArray186[arg3] * local1881, local1881 * Static314.anIntArray367[arg3], arg9, arg3, arg1);
									}
									local1970 = Static273.method4127(arg0, arg7, arg4);
									if (local1970 instanceof Class3_Sub1_Sub2) {
										((Class3_Sub1_Sub2) local1970).aClass3_Sub1_1 = local1827;
									} else {
										Static445.method6519(arg0, arg7, arg4, local1827, null);
									}
								} else if (arg9 == 6) {
									local1881 = 9;
									local1887 = (Interface10) Static86.method825(arg0, arg7, arg4);
									if (local1887 != null) {
										local1881 = Static448.aClass104_4.method2616(local1887.method5325()).anInt3154 / 2 + 1;
									}
									if (local216) {
										local1926 = new Class3_Sub1_Sub3(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg3, Static152.anIntArray186[arg3] * local1881, local1881 * Static314.anIntArray367[arg3], arg9, arg3 + 4);
										local1827 = local1926;
										if (local1926.method5326()) {
											local1926.method5322(arg2);
										}
									} else {
										local1827 = new Class3_Sub1_Sub1(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg3, Static386.anIntArray471[arg3] * local1881, local1881 * Static410.anIntArray504[arg3], arg9, arg3 + 4, arg1);
									}
									local1970 = Static273.method4127(arg0, arg7, arg4);
									if (local1970 instanceof Class3_Sub1_Sub2) {
										((Class3_Sub1_Sub2) local1970).aClass3_Sub1_1 = local1827;
									} else {
										Static445.method6519(arg0, arg7, arg4, local1827, null);
									}
								} else if (arg9 == 7) {
									local1881 = arg3 + 2 & 0x3;
									if (local216) {
										@Pc(2155) Class3_Sub1_Sub3 local2155 = new Class3_Sub1_Sub3(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, local1881, 0, 0, arg9, local1881 + 4);
										if (local2155.method5326()) {
											local2155.method5322(arg2);
										}
										local1827 = local2155;
									} else {
										local1827 = new Class3_Sub1_Sub1(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, local1881, 0, 0, arg9, local1881 + 4, arg1);
									}
									@Pc(2170) Class3_Sub1 local2170 = Static273.method4127(arg0, arg7, arg4);
									if (local2170 instanceof Class3_Sub1_Sub2) {
										((Class3_Sub1_Sub2) local2170).aClass3_Sub1_1 = local1827;
									} else {
										Static445.method6519(arg0, arg7, arg4, local1827, null);
									}
								} else if (arg9 == 8) {
									local378 = arg3 + 2 & 0x3;
									@Pc(2196) int local2196 = 9;
									@Pc(2202) Interface10 local2202 = (Interface10) Static86.method825(arg0, arg7, arg4);
									if (local2202 != null) {
										local2196 = Static448.aClass104_4.method2616(local2202.method5325()).anInt3154 / 2 + 1;
									}
									@Pc(2245) Class3_Sub1 local2245;
									@Pc(2264) Class3_Sub1 local2264;
									if (local216) {
										local2245 = new Class3_Sub1_Sub3(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg3, local2196 * Static386.anIntArray471[arg3], local2196 * Static410.anIntArray504[arg3], arg9, arg3 + 4);
										local2264 = new Class3_Sub1_Sub3(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg3, 0, 0, arg9, local378 + 4);
										if (local2245.method5326()) {
											local2245.method5322(arg2);
										}
										if (local2264.method5326()) {
											local2264.method5322(arg2);
										}
									} else {
										local2245 = new Class3_Sub1_Sub1(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg3, local2196 * Static386.anIntArray471[arg3], local2196 * Static410.anIntArray504[arg3], arg9, arg3 + 4, arg1);
										local2264 = new Class3_Sub1_Sub1(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg3, 0, 0, arg9, local378 + 4, arg1);
									}
									Static445.method6519(arg0, arg7, arg4, local2245, local2264);
								}
							}
						}
					}
				}
			}
		} else if (Static291.aClass28_Sub1_1.aBoolean78 || local30.anInt3163 != 0 || local30.anInt3186 == 1 || local30.aBoolean213) {
			@Pc(277) Class3_Sub5 local277;
			if (local216) {
				@Pc(293) Class3_Sub5_Sub2 local293 = new Class3_Sub5_Sub2(arg2, local30, arg6, local163, local155, local171, super.aBoolean462, arg3, local183);
				local277 = local293;
				if (local293.method5326()) {
					local293.method5322(arg2);
				}
			} else {
				local277 = new Class3_Sub5_Sub1(arg2, local30, arg0, arg6, local163, local155, local171, super.aBoolean462, arg3, arg1);
			}
			@Pc(308) Class3_Sub5 local308 = Static109.method4308(arg0, arg7, arg4);
			if (local308 instanceof Class3_Sub5_Sub3) {
				((Class3_Sub5_Sub3) local308).aClass3_Sub5_2 = local277;
			} else {
				Static225.method3367(arg0, arg7, arg4, local277);
			}
			if (local30.anInt3186 == 1 && arg5 != null) {
				arg5.method4717(arg4, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!eq;II[Lclient!qo;I[B)V")
	public void method5998(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class210[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(14) Class6_Sub1 local14 = new Class6_Sub1(arg4);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method6487();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method6445();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local14.method6433();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local53 + arg1;
				@Pc(77) int local77 = local47 + arg3;
				if (local73 > 0 && local77 > 0 && super.anInt7272 - 1 > local73 && super.anInt7273 - 1 > local77) {
					@Pc(105) Class210 local105 = null;
					if (!super.aBoolean462) {
						@Pc(110) int local110 = local57;
						if ((Static203.aByteArrayArrayArray11[1][local73][local77] & 0x2) == 2) {
							local110 = local57 - 1;
						}
						if (local110 >= 0) {
							local105 = arg2[local110];
						}
					}
					this.method5997(local57, -1, arg0, local69, local77, local105, local57, local73, local16, local65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ae;ILclient!eq;I[II)V")
	public void method5999(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean462) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(17) Class219 local17 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(28) int local28;
			@Pc(47) int local47;
			@Pc(204) int local204;
			@Pc(208) int local208;
			@Pc(51) int local51;
			while (arg0.aByteArray96.length > arg0.anInt7898) {
				local28 = arg0.method6433();
				if (local28 == 0) {
					local17 = new Class219(arg0);
				} else {
					@Pc(105) int local105;
					@Pc(109) int local109;
					@Pc(97) int local97;
					if (local28 == 1) {
						local47 = arg0.method6433();
						if (local47 > 0) {
							for (local51 = 0; local51 < local47; local51++) {
								@Pc(60) Class76 local60 = new Class76(arg1, arg0, 0);
								if (local60.anInt2355 == 31) {
									@Pc(71) Class228 local71 = Static126.aClass39_1.method1268(arg0.method6485());
									local60.method1934(local71.anInt6707, local71.anInt6700, local71.anInt6702, local71.anInt6705);
								}
								if (arg1.method5012() > 0) {
									@Pc(88) Class6_Sub11 local88 = local60.aClass6_Sub11_1;
									local97 = local88.method6390() + (arg4 << 7);
									local105 = local88.method6392() + (arg2 << 7);
									local109 = local97 >> 7;
									@Pc(113) int local113 = local105 >> 7;
									if (local109 >= 0 && local113 >= 0 && local109 < super.anInt7272 && super.anInt7273 > local113) {
										local88.method6387(local105, local97, super.anIntArrayArrayArray14[local60.anInt2354][local109][local113] - local88.method6391());
										if (arg1.method5012() > 0) {
											Static37.method914(local60);
										}
									}
								}
							}
						}
					} else if (local28 == 2) {
						if (local17 == null) {
							local17 = new Class219();
						}
						local17.method5246(arg0);
					} else if (local28 != 128) {
						if (local28 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local47 = 0; local47 < 4; local47++) {
							@Pc(192) byte local192 = arg0.method6438();
							if (local192 == 0 && super.aByteArrayArrayArray15[local47] != null) {
								local204 = arg4;
								local208 = arg4 + 64;
								local97 = arg2;
								local105 = arg2 + 64;
								if (arg4 < 0) {
									local204 = 0;
								} else if (arg4 >= super.anInt7272) {
									local204 = super.anInt7272;
								}
								if (local208 < 0) {
									local208 = 0;
								} else if (local208 >= super.anInt7272) {
									local208 = super.anInt7272;
								}
								if (arg2 < 0) {
									local97 = 0;
								} else if (arg2 >= super.anInt7273) {
									local97 = super.anInt7273;
								}
								if (local105 < 0) {
									local105 = 0;
								} else if (local105 >= super.anInt7273) {
									local105 = super.anInt7273;
								}
								while (local204 < local208) {
									while (local105 > local97) {
										super.aByteArrayArrayArray15[local47][local204][local97] = 0;
										local97++;
									}
									local204++;
								}
							} else if (local192 == 1) {
								if (super.aByteArrayArrayArray15[local47] == null) {
									super.aByteArrayArrayArray15[local47] = new byte[super.anInt7272 + 1][super.anInt7273 + 1];
								}
								for (local204 = 0; local204 < 64; local204 += 4) {
									for (local208 = 0; local208 < 64; local208 += 4) {
										@Pc(475) byte local475 = arg0.method6438();
										for (local105 = arg4 + local204; local105 < local204 + arg4 + 4; local105++) {
											for (local109 = arg2 + local208; local109 < arg2 + local208 + 4; local109++) {
												if (local105 >= 0 && local105 < super.anInt7272 && local109 >= 0 && local109 < super.anInt7273) {
													super.aByteArrayArrayArray15[local47][local105][local109] = local475;
												}
											}
										}
									}
								}
							} else if (local192 == 2) {
								if (super.aByteArrayArrayArray15[local47] == null) {
									super.aByteArrayArrayArray15[local47] = new byte[super.anInt7272 + 1][super.anInt7273 + 1];
								}
								if (local47 > 0) {
									local204 = arg4;
									local208 = arg4 + 64;
									local97 = arg2;
									if (arg2 < 0) {
										local97 = 0;
									} else if (arg2 >= super.anInt7273) {
										local97 = super.anInt7273;
									}
									local105 = arg2 + 64;
									if (local208 < 0) {
										local208 = 0;
									} else if (super.anInt7272 <= local208) {
										local208 = super.anInt7272;
									}
									if (arg4 < 0) {
										local204 = 0;
									} else if (super.anInt7272 <= arg4) {
										local204 = super.anInt7272;
									}
									if (local105 < 0) {
										local105 = 0;
									} else if (local105 >= super.anInt7273) {
										local105 = super.anInt7273;
									}
									while (local208 > local204) {
										while (local97 < local105) {
											super.aByteArrayArrayArray15[local47][local204][local97] = super.aByteArrayArrayArray15[local47 - 1][local204][local97];
											local97++;
										}
										local204++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg3 == null) {
						arg0.anInt7898 += 10;
					} else {
						arg3[0] = arg0.method6485();
						arg3[1] = arg0.method6428();
						arg3[2] = arg0.method6428();
						arg3[3] = arg0.method6428();
						arg3[4] = arg0.method6485();
					}
				}
			}
			if (local17 != null) {
				for (local28 = 0; local28 < 8; local28++) {
					for (local47 = 0; local47 < 8; local47++) {
						local51 = (arg4 >> 3) + local28;
						local204 = (arg2 >> 3) + local47;
						if (local51 >= 0 && super.anInt7272 >> 3 > local51 && local204 >= 0 && super.anInt7273 >> 3 > local204) {
							Static282.method4274(local17, local51, local204);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray15 != null) {
				for (local28 = 0; local28 < 4; local28++) {
					if (super.aByteArrayArrayArray15[local28] != null) {
						for (local47 = 0; local47 < 16; local47++) {
							for (local51 = 0; local51 < 16; local51++) {
								local204 = (arg4 >> 2) + local47;
								local208 = (arg2 >> 2) + local51;
								if (local204 >= 0 && local204 < 26 && local208 >= 0 && local208 < 26) {
									super.aByteArrayArrayArray15[local28][local204][local208] = 0;
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

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[Lclient!qo;IIILclient!eq;II[BII)V")
	public void method6000(@OriginalArg(0) int arg0, @OriginalArg(1) Class210[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class66 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(14) Class6_Sub1 local14 = new Class6_Sub1(arg8);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method6487();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method6445();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local14.method6433();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (local60 == arg9 && arg6 <= local56 && local56 < arg6 + 8 && arg3 <= local50 && arg3 + 8 > local50) {
					@Pc(108) Class106 local108 = Static448.aClass104_4.method2616(local16);
					@Pc(125) int local125 = arg0 + Static179.method2949(local56 & 0x7, local108.anInt3158, local108.anInt3194, arg7, local50 & 0x7, local72);
					@Pc(142) int local142 = arg2 + Static182.method2971(arg7, local72, local108.anInt3194, local50 & 0x7, local56 & 0x7, local108.anInt3158);
					if (local125 > 0 && local142 > 0 && local125 < super.anInt7272 - 1 && super.anInt7273 - 1 > local142) {
						@Pc(171) Class210 local171 = null;
						if (!super.aBoolean462) {
							@Pc(176) int local176 = arg4;
							if ((Static203.aByteArrayArrayArray11[1][local125][local142] & 0x2) == 2) {
								local176 = arg4 - 1;
							}
							if (local176 >= 0) {
								local171 = arg1[local176];
							}
						}
						this.method5997(arg4, -1, arg5, local72 + arg7 & 0x3, local142, local171, arg4, local125, local16, local68);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([IIIIIIIILclient!eq;Lclient!ae;I)V")
	public void method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class66 arg8, @OriginalArg(9) Class6_Sub1 arg9) {
		if (super.aBoolean462) {
			return;
		}
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(23) Class219 local23 = null;
		@Pc(29) int local29 = (arg6 & 0x7) * 8;
		@Pc(35) int local35 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(40) int local40;
			@Pc(91) int local91;
			@Pc(131) int local131;
			@Pc(426) int local426;
			while (arg9.anInt7898 < arg9.aByteArray96.length) {
				local40 = arg9.method6433();
				if (local40 == 0) {
					local23 = new Class219(arg9);
				} else {
					@Pc(152) int local152;
					@Pc(156) int local156;
					@Pc(190) int local190;
					@Pc(276) int local276;
					if (local40 == 1) {
						local91 = arg9.method6433();
						if (local91 > 0) {
							for (local426 = 0; local426 < local91; local426++) {
								@Pc(435) Class76 local435 = new Class76(arg8, arg9, 0);
								if (local435.anInt2355 == 31) {
									@Pc(448) Class228 local448 = Static126.aClass39_1.method1268(arg9.method6485());
									local435.method1934(local448.anInt6707, local448.anInt6700, local448.anInt6702, local448.anInt6705);
								}
								if (arg8.method5012() > 0) {
									@Pc(465) Class6_Sub11 local465 = local435.aClass6_Sub11_1;
									local276 = local465.method6390() >> 7;
									local152 = local465.method6392() >> 7;
									if (arg3 == local435.anInt2354 && local276 >= local29 && local29 + 8 > local276 && local152 >= local35 && local152 < local35 + 8) {
										local156 = (arg7 << 7) + Static307.method4512(local465.method6392() & 0x3FF, local465.method6390() & 0x3FF, arg2);
										local190 = (arg1 << 7) + Static224.method3362(arg2, local465.method6390() & 0x3FF, local465.method6392() & 0x3FF);
										local276 = local156 >> 7;
										local152 = local190 >> 7;
										if (local276 >= 0 && local152 >= 0 && super.anInt7272 > local276 && super.anInt7273 > local152) {
											local465.method6387(local190, local156, super.anIntArrayArrayArray14[arg3][local276][local152] - local465.method6391());
											if (arg8.method5012() > 0) {
												Static37.method914(local435);
											}
										}
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local23 == null) {
							local23 = new Class219();
						}
						local23.method5246(arg9);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local91 = 0; local91 < 4; local91++) {
							@Pc(99) byte local99 = arg9.method6438();
							@Pc(135) int local135;
							if (local99 == 0 && super.aByteArrayArrayArray15[arg4] != null) {
								if (local91 <= arg3) {
									local131 = arg7;
									local135 = arg7 + 7;
									local276 = arg1;
									if (arg7 < 0) {
										local131 = 0;
									} else if (arg7 >= super.anInt7272) {
										local131 = super.anInt7272;
									}
									if (arg1 < 0) {
										local276 = 0;
									} else if (arg1 >= super.anInt7273) {
										local276 = super.anInt7273;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (local135 >= super.anInt7272) {
										local135 = super.anInt7272;
									}
									local152 = arg1 + 7;
									if (local152 < 0) {
										local152 = 0;
									} else if (local152 >= super.anInt7273) {
										local152 = super.anInt7273;
									}
									while (local135 > local131) {
										while (local152 > local276) {
											super.aByteArrayArrayArray15[arg4][local131][local276] = 0;
											local276++;
										}
										local131++;
									}
								}
							} else if (local99 == 1) {
								if (super.aByteArrayArrayArray15[arg4] == null) {
									super.aByteArrayArrayArray15[arg4] = new byte[super.anInt7272 + 1][super.anInt7273 + 1];
								}
								for (local131 = 0; local131 < 64; local131 += 4) {
									for (local135 = 0; local135 < 64; local135 += 4) {
										@Pc(143) byte local143 = arg9.method6438();
										if (arg3 >= local91) {
											for (local152 = local131; local152 < local131 + 4; local152++) {
												for (local156 = local135; local156 < local135 + 4; local156++) {
													if (local152 >= local29 && local29 + 8 > local152 && local35 <= local156 && local35 + 8 > local35) {
														local190 = arg7 + Static447.method6095(local152 & 0x7, arg2, local156 & 0x7);
														@Pc(203) int local203 = arg1 + Static196.method3070(arg2, local152 & 0x7, local156 & 0x7);
														if (local190 >= 0 && local190 < super.anInt7272 && local203 >= 0 && super.anInt7273 > local203) {
															super.aByteArrayArrayArray15[arg4][local190][local203] = local143;
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
						arg9.anInt7898 += 10;
					} else {
						arg0[0] = arg9.method6485();
						arg0[1] = arg9.method6428();
						arg0[2] = arg9.method6428();
						arg0[3] = arg9.method6428();
						arg0[4] = arg9.method6485();
					}
				}
			}
			if (local23 != null) {
				Static282.method4274(local23, arg7 >> 3, arg1 >> 3);
			}
			if (super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg4] != null) {
				local40 = arg7 + 7;
				local91 = arg1 + 7;
				for (local426 = arg7; local426 < local40; local426++) {
					for (local131 = arg1; local131 < local91; local131++) {
						super.aByteArrayArrayArray15[arg4][local426][local131] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!eq;I)V")
	public void method6006(@OriginalArg(0) Class66 arg0) {
		Static103.method1842(arg0);
		@Pc(13) int local13;
		if (super.anInt7278 > 1) {
			for (local13 = 0; local13 < super.anInt7272; local13++) {
				for (@Pc(17) int local17 = 0; super.anInt7273 > local17; local17++) {
					if ((Static203.aByteArrayArrayArray11[1][local13][local17] & 0x2) == 2) {
						Static398.method1694(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt7278 > local13; local13++) {
			for (@Pc(63) int local63 = 0; super.anInt7273 >= local63; local63++) {
				for (@Pc(67) int local67 = 0; super.anInt7272 >= local67; local67++) {
					@Pc(85) int local85;
					@Pc(87) int local87;
					@Pc(89) int local89;
					@Pc(115) int local115;
					@Pc(146) int local146;
					@Pc(247) int local247;
					@Pc(256) int local256;
					@Pc(276) int local276;
					@Pc(280) int local280;
					if ((super.aByteArrayArrayArray13[local13][local67][local63] & 0x1) != 0) {
						local85 = local63;
						local87 = local63;
						local89 = local13;
						while (local85 > 0 && (super.aByteArrayArrayArray13[local13][local67][local85 - 1] & 0x1) != 0) {
							local85--;
						}
						local115 = local13;
						while (super.anInt7273 > local87 && (super.aByteArrayArrayArray13[local13][local67][local87 + 1] & 0x1) != 0) {
							local87++;
						}
						label164: while (local89 > 0) {
							for (local146 = local85; local146 <= local87; local146++) {
								if ((super.aByteArrayArrayArray13[local89 - 1][local67][local146] & 0x1) == 0) {
									break label164;
								}
							}
							local89--;
						}
						label153: while (local115 < 3) {
							for (local146 = local85; local146 <= local87; local146++) {
								if ((super.aByteArrayArrayArray13[local115 + 1][local67][local146] & 0x1) == 0) {
									break label153;
								}
							}
							local115++;
						}
						local146 = (local87 + 1 - local85) * (local115 + 1 - local89);
						if (local146 >= 2) {
							local247 = super.anIntArrayArrayArray14[local115][local67][local85] - 240;
							local256 = super.anIntArrayArrayArray14[local89][local67][local85];
							Static388.method5713(1, local67 << 7, local67 << 7, local85 << 7, (local87 << 7) + 128, local247, local256);
							for (local276 = local89; local276 <= local115; local276++) {
								for (local280 = local85; local280 <= local87; local280++) {
									super.aByteArrayArrayArray13[local276][local67][local280] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local13][local67][local63] & 0x2) != 0) {
						local85 = local67;
						local87 = local67;
						local89 = local13;
						local115 = local13;
						while (local85 > 0 && (super.aByteArrayArrayArray13[local13][local85 - 1][local63] & 0x2) != 0) {
							local85--;
						}
						while (local87 < super.anInt7272 && (super.aByteArrayArrayArray13[local13][local87 + 1][local63] & 0x2) != 0) {
							local87++;
						}
						label218: while (local89 > 0) {
							for (local146 = local85; local146 <= local87; local146++) {
								if ((super.aByteArrayArrayArray13[local89 - 1][local146][local63] & 0x2) == 0) {
									break label218;
								}
							}
							local89--;
						}
						label207: while (local115 < 3) {
							for (local146 = local85; local146 <= local87; local146++) {
								if ((super.aByteArrayArrayArray13[local115 + 1][local146][local63] & 0x2) == 0) {
									break label207;
								}
							}
							local115++;
						}
						local146 = (local87 + 1 - local85) * (local115 + 1 - local89);
						if (local146 >= 2) {
							local247 = super.anIntArrayArrayArray14[local115][local85][local63] - 240;
							local256 = super.anIntArrayArrayArray14[local89][local85][local63];
							Static388.method5713(2, local85 << 7, (local87 << 7) + 128, local63 << 7, local63 << 7, local247, local256);
							for (local276 = local89; local276 <= local115; local276++) {
								for (local280 = local85; local280 <= local87; local280++) {
									super.aByteArrayArrayArray13[local276][local280][local63] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local13][local67][local63] & 0x4) != 0) {
						local85 = local67;
						local87 = local67;
						local89 = local63;
						local115 = local63;
						while (local89 > 0 && (super.aByteArrayArrayArray13[local13][local67][local89 - 1] & 0x4) != 0) {
							local89--;
						}
						while (local115 < super.anInt7273 && (super.aByteArrayArrayArray13[local13][local67][local115 + 1] & 0x4) != 0) {
							local115++;
						}
						label271: while (local85 > 0) {
							for (local146 = local89; local146 <= local115; local146++) {
								if ((super.aByteArrayArrayArray13[local13][local85 - 1][local146] & 0x4) == 0) {
									break label271;
								}
							}
							local85--;
						}
						label260: while (local87 < super.anInt7272) {
							for (local146 = local89; local146 <= local115; local146++) {
								if ((super.aByteArrayArrayArray13[local13][local87 + 1][local146] & 0x4) == 0) {
									break label260;
								}
							}
							local87++;
						}
						if ((local115 + 1 - local89) * (local87 + 1 - local85) >= 4) {
							local146 = super.anIntArrayArrayArray14[local13][local85][local89];
							Static388.method5713(4, local85 << 7, (local87 << 7) + 128, local89 << 7, (local115 << 7) + 128, local146, local146);
							for (@Pc(714) int local714 = local85; local714 <= local87; local714++) {
								for (local247 = local89; local247 <= local115; local247++) {
									super.aByteArrayArrayArray13[local13][local714][local247] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qo;IIBLclient!eq;II)V")
	public void method6007(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface10 local7 = null;
		if (arg4 == 0) {
			local7 = (Interface10) Static86.method825(arg2, arg1, arg5);
		}
		if (arg4 == 1) {
			local7 = (Interface10) Static273.method4127(arg2, arg1, arg5);
		}
		if (arg4 == 2) {
			local7 = (Interface10) Static415.method6101(arg2, arg1, arg5, sq.class);
		}
		if (arg4 == 3) {
			local7 = (Interface10) Static109.method4308(arg2, arg1, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(68) Class106 local68 = Static448.aClass104_4.method2616(local7.method5325());
		@Pc(72) int local72 = local7.method5327();
		@Pc(76) int local76 = local7.method5321();
		if (local68.method2639()) {
			Static165.method2742(arg2, arg5, local68, arg1);
		}
		if (local7.method5326()) {
			local7.method5320(arg3);
		}
		if (arg4 == 0) {
			@Pc(104) Class3_Sub3 local104 = Static86.method825(arg2, arg1, arg5);
			if (local104 instanceof Class3_Sub3_Sub2) {
				((Class3_Sub3_Sub2) local104).aClass3_Sub3_3 = null;
			} else {
				Static289.method4353(arg2, arg1, arg5);
			}
			if (local68.anInt3186 != 0) {
				arg0.method4710(local76, !local68.aBoolean201, local68.aBoolean209, arg1, local72, arg5);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			@Pc(144) Class3_Sub1 local144 = Static273.method4127(arg2, arg1, arg5);
			if (local144 instanceof Class3_Sub1_Sub2) {
				((Class3_Sub1_Sub2) local144).aClass3_Sub1_1 = null;
				return;
			}
			Static242.method3802(arg2, arg1, arg5);
			return;
		}
		if (arg4 == 2) {
			@Pc(173) Class3_Sub2 local173 = Static415.method6101(arg2, arg1, arg5, sq.class);
			if (local173 instanceof Class3_Sub2_Sub2 && local173.aShort101 == arg1 && arg5 == local173.aShort102) {
				((Class3_Sub2_Sub2) local173).aClass3_Sub2_1 = null;
			} else {
				Static18.method494(arg2, arg1, arg5, sq.class);
			}
			if (local68.anInt3186 != 0 && arg1 + local68.anInt3158 < super.anInt7272 && arg5 + local68.anInt3158 < super.anInt7273 && local68.anInt3194 + arg1 < super.anInt7272 && arg5 + local68.anInt3194 < super.anInt7273) {
				arg0.method4715(local68.anInt3158, local76, !local68.aBoolean201, local68.aBoolean209, local68.anInt3194, arg1, arg5);
				return;
			}
			return;
		}
		if (arg4 != 3) {
			return;
		}
		@Pc(272) Class3_Sub5 local272 = Static109.method4308(arg2, arg1, arg5);
		if (local272 instanceof Class3_Sub5_Sub3) {
			((Class3_Sub5_Sub3) local272).aClass3_Sub5_2 = null;
		} else {
			Static250.method3879(arg2, arg1, arg5);
		}
		if (local68.anInt3186 == 1) {
			arg0.method4706(arg5, arg1);
			return;
		}
	}
}
