import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	public int anInt3560 = 99;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIZ)V")
	public Class115_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static349.aClass206_5, Static264.aClass126_5);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIIIILclient!oa;IILclient!ld;)V")
	public void method3153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class189 arg9) {
		if (!Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242) && !Static353.method5386(arg8, arg2, Static294.anInt5492, arg7)) {
			return;
		}
		if (this.anInt3560 > arg5) {
			this.anInt3560 = arg5;
		}
		@Pc(30) Class252 local30 = Static412.aClass307_4.method6636(arg4);
		if (arg6.method6842() && Static140.aClass6_Sub48_Sub1_1.aBoolean676 && local30.aBoolean484) {
			return;
		}
		@Pc(52) int local52;
		@Pc(49) int local49;
		if (arg0 == 1 || arg0 == 3) {
			local52 = local30.anInt6898;
			local49 = local30.anInt6935;
		} else {
			local49 = local30.anInt6898;
			local52 = local30.anInt6935;
		}
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (super.anInt3551 >= local52 + arg2) {
			local78 = arg2 + (local52 >> 1);
			local86 = arg2 + (local52 + 1 >> 1);
		} else {
			local78 = arg2;
			local86 = arg2 + 1;
		}
		@Pc(111) int local111;
		@Pc(109) int local109;
		if (arg8 + local49 > super.anInt3553) {
			local109 = arg8 + 1;
			local111 = arg8;
		} else {
			local111 = (local49 >> 1) + arg8;
			local109 = arg8 + (local49 + 1 >> 1);
		}
		@Pc(132) Class59 local132 = Static133.aClass59Array3[arg7];
		@Pc(155) int local155 = local132.JA(local78, local111) + local132.JA(local86, local111) + local132.JA(local78, local109) + local132.JA(local86, local109) >> 2;
		@Pc(164) int local164 = (arg2 << 9) + (local52 << 8);
		@Pc(173) int local173 = (arg8 << 9) + (local49 << 8);
		@Pc(185) boolean local185 = Static253.aBoolean348 && !super.aBoolean249 && local30.aBoolean472;
		if (local30.method5795()) {
			Static588.method1990(local30, arg2, null, arg5, null, arg8, arg0);
		}
		@Pc(219) boolean local219 = arg1 == -1 && local30.anInt6926 == -1 && local30.anIntArray505 == null && local30.anIntArray506 == null && !local30.aBoolean474;
		if (Static449.aBoolean545 && (Static147.method7401(arg3) && local30.anInt6901 != 1 || !(!Static584.method7742(arg3) || local30.anInt6901 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(377) Class4_Sub1 local377;
			@Pc(344) Class4_Sub1_Sub3 local344;
			@Pc(348) int local348;
			if (arg3 == 10 || arg3 == 11) {
				local344 = null;
				if (local219) {
					@Pc(407) Class4_Sub1_Sub3 local407 = new Class4_Sub1_Sub3(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg2, local52 + arg2 - 1, arg8, arg8 + local49 - 1, arg3, arg0, local185);
					local344 = local407;
					local348 = local407.method2735();
					local377 = local407;
				} else {
					local348 = 15;
					local377 = new Class4_Sub1_Sub2(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg2, local52 + arg2 - 1, arg8, arg8 + local49 - 1, arg3, arg0, arg1);
				}
				@Pc(428) Class4_Sub1 local428 = Static117.method2480(arg5, arg2, arg8, pba.class);
				@Pc(430) boolean local430 = false;
				if (local428 instanceof Class4_Sub1_Sub4 && local428.aShort126 == arg2 && arg8 == local428.aShort125) {
					local430 = true;
					((Class4_Sub1_Sub4) local428).aClass4_Sub1_1 = local377;
				}
				if (local430 || Static254.method7016(local377, false)) {
					if (local344 != null && local344.method6271()) {
						local344.method6270(arg6);
					}
					if (local30.aBoolean481 && Static253.aBoolean348) {
						if (local348 > 30) {
							local348 = 30;
						}
						for (@Pc(477) int local477 = 0; local477 <= local52; local477++) {
							for (@Pc(481) int local481 = 0; local481 <= local49; local481++) {
								local132.EA(arg2 + local477, arg8 - -local481, local348);
							}
						}
					}
				}
				if (local30.anInt6914 != 0 && arg9 != null) {
					arg9.method4598(arg2, local49, arg8, local30.aBoolean469, !local30.aBoolean478, local52);
				}
			} else {
				@Pc(634) Class4_Sub1 local634;
				if (arg3 >= 12 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
					if (local219) {
						local344 = new Class4_Sub1_Sub3(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg2, local52 + arg2 - 1, arg8, arg8 + local49 - 1, arg3, arg0, local185);
						local377 = local344;
						if (local344.method6271()) {
							local344.method6270(arg6);
						}
					} else {
						local377 = new Class4_Sub1_Sub2(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg2, local52 + arg2 - 1, arg8, local49 + arg8 - 1, arg3, arg0, arg1);
					}
					local634 = Static117.method2480(arg5, arg2, arg8, pba.class);
					if (local634 instanceof Class4_Sub1_Sub4 && local634.aShort126 == arg2 && local634.aShort125 == arg8) {
						((Class4_Sub1_Sub4) local634).aClass4_Sub1_1 = local377;
					} else {
						Static254.method7016(local377, false);
					}
					if (Static253.aBoolean348 && !super.aBoolean249 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg5 > 0 && local30.anInt6901 != 0) {
						super.aByteArrayArrayArray12[arg5][arg2][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8] | 0x4);
					}
					if (local30.anInt6914 != 0 && arg9 != null) {
						arg9.method4598(arg2, local49, arg8, local30.aBoolean469, !local30.aBoolean478, local52);
					}
				} else {
					@Pc(760) Class4_Sub5 local760;
					if (arg3 == 0) {
						@Pc(733) int local733 = local30.anInt6901;
						if (Static398.aBoolean488 && local30.anInt6901 == -1) {
							local733 = 1;
						}
						if (local219) {
							@Pc(758) Class4_Sub5_Sub3 local758 = new Class4_Sub5_Sub3(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0, local185);
							local760 = local758;
							if (local758.method6271()) {
								local758.method6270(arg6);
							}
						} else {
							local760 = new Class4_Sub5_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0, arg1);
						}
						@Pc(791) Class4_Sub5 local791 = Static162.method2962(arg5, arg2, arg8);
						if (local791 instanceof Class4_Sub5_Sub2) {
							((Class4_Sub5_Sub2) local791).aClass4_Sub5_1 = local760;
						} else {
							Static550.method7453(arg5, arg2, arg8, local760, null);
						}
						if (Static253.aBoolean348) {
							if (arg0 == 0) {
								if (local30.aBoolean481) {
									local132.EA(arg2, arg8, 50);
									local132.EA(arg2, arg8 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean249) {
									super.aByteArrayArrayArray12[arg5][arg2][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local30.aBoolean481) {
									local132.EA(arg2, arg8 + 1, 50);
									local132.EA(arg2 + 1, arg8 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean249) {
									super.aByteArrayArrayArray12[arg5][arg2][arg8 + 1] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local30.aBoolean481) {
									local132.EA(arg2 + 1, arg8, 50);
									local132.EA(arg2 + 1, arg8 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean249) {
									super.aByteArrayArrayArray12[arg5][arg2 + 1][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2 + 1][arg8] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local30.aBoolean481) {
									local132.EA(arg2, arg8, 50);
									local132.EA(arg2 + 1, arg8, 50);
								}
								if (local733 == 1 && !super.aBoolean249) {
									super.aByteArrayArrayArray12[arg5][arg2][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8] | 0x2);
								}
							}
						}
						if (local30.anInt6914 != 0 && arg9 != null) {
							arg9.method4602(arg2, local30.aBoolean469, arg8, !local30.aBoolean478, arg0, arg3);
						}
						if (local30.anInt6920 != 64) {
							Static595.method7844(arg5, arg2, arg8, local30.anInt6920);
						}
					} else {
						@Pc(1067) Class4_Sub5_Sub3 local1067;
						@Pc(1077) Class4_Sub5 local1077;
						if (arg3 == 1) {
							if (local219) {
								local1067 = new Class4_Sub5_Sub3(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0, local185);
								if (local1067.method6271()) {
									local1067.method6270(arg6);
								}
								local1077 = local1067;
							} else {
								local1077 = new Class4_Sub5_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0, arg1);
							}
							local760 = Static162.method2962(arg5, arg2, arg8);
							if (local760 instanceof Class4_Sub5_Sub2) {
								((Class4_Sub5_Sub2) local760).aClass4_Sub5_1 = local1077;
							} else {
								Static550.method7453(arg5, arg2, arg8, local1077, null);
							}
							if (local30.aBoolean481 && Static253.aBoolean348) {
								if (arg0 == 0) {
									local132.EA(arg2, arg8 + 1, 50);
								} else if (arg0 == 1) {
									local132.EA(arg2 + 1, arg8 + 1, 50);
								} else if (arg0 == 2) {
									local132.EA(arg2 + 1, arg8, 50);
								} else if (arg0 == 3) {
									local132.EA(arg2, arg8, 50);
								}
							}
							if (local30.anInt6914 != 0 && arg9 != null) {
								arg9.method4602(arg2, local30.aBoolean469, arg8, !local30.aBoolean478, arg0, arg3);
							}
						} else if (arg3 == 2) {
							local348 = arg0 + 1 & 0x3;
							if (local219) {
								@Pc(1217) Class4_Sub5_Sub3 local1217 = new Class4_Sub5_Sub3(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0 + 4, local185);
								@Pc(1232) Class4_Sub5_Sub3 local1232 = new Class4_Sub5_Sub3(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg3, local348, local185);
								if (local1217.method6271()) {
									local1217.method6270(arg6);
								}
								local1077 = local1217;
								if (local1232.method6271()) {
									local1232.method6270(arg6);
								}
								local760 = local1232;
							} else {
								local1077 = new Class4_Sub5_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0 + 4, arg1);
								local760 = new Class4_Sub5_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg3, local348, arg1);
							}
							Static550.method7453(arg5, arg2, arg8, local1077, local760);
							if (local30.anInt6901 == 1 && Static253.aBoolean348 && !super.aBoolean249) {
								if (arg0 == 0) {
									super.aByteArrayArrayArray12[arg5][arg2][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8] | 0x1);
									super.aByteArrayArrayArray12[arg5][arg2][arg8 + 1] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.aByteArrayArrayArray12[arg5][arg2][arg8 + 1] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8 + 1] | 0x2);
									super.aByteArrayArrayArray12[arg5][arg2 + 1][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2 + 1][arg8] | 0x1);
								} else if (arg0 == 2) {
									super.aByteArrayArrayArray12[arg5][arg2 + 1][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2 + 1][arg8] | 0x1);
									super.aByteArrayArrayArray12[arg5][arg2][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8] | 0x2);
								} else if (arg0 == 3) {
									super.aByteArrayArrayArray12[arg5][arg2][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8] | 0x2);
									super.aByteArrayArrayArray12[arg5][arg2][arg8] = (byte) (super.aByteArrayArrayArray12[arg5][arg2][arg8] | 0x1);
								}
							}
							if (local30.anInt6914 != 0 && arg9 != null) {
								arg9.method4602(arg2, local30.aBoolean469, arg8, !local30.aBoolean478, arg0, arg3);
							}
							if (local30.anInt6920 != 64) {
								Static595.method7844(arg5, arg2, arg8, local30.anInt6920);
							}
						} else if (arg3 == 3) {
							if (local219) {
								local1067 = new Class4_Sub5_Sub3(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0, local185);
								if (local1067.method6271()) {
									local1067.method6270(arg6);
								}
								local1077 = local1067;
							} else {
								local1077 = new Class4_Sub5_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg3, arg0, arg1);
							}
							local760 = Static162.method2962(arg5, arg2, arg8);
							if (local760 instanceof Class4_Sub5_Sub2) {
								((Class4_Sub5_Sub2) local760).aClass4_Sub5_1 = local1077;
							} else {
								Static550.method7453(arg5, arg2, arg8, local1077, null);
							}
							if (local30.aBoolean481 && Static253.aBoolean348) {
								if (arg0 == 0) {
									local132.EA(arg2, arg8 + 1, 50);
								} else if (arg0 == 1) {
									local132.EA(arg2 + 1, arg8 - -1, 50);
								} else if (arg0 == 2) {
									local132.EA(arg2 + 1, arg8, 50);
								} else if (arg0 == 3) {
									local132.EA(arg2, arg8, 50);
								}
							}
							if (local30.anInt6914 != 0 && arg9 != null) {
								arg9.method4602(arg2, local30.aBoolean469, arg8, !local30.aBoolean478, arg0, arg3);
							}
						} else if (arg3 == 9) {
							if (local219) {
								local344 = new Class4_Sub1_Sub3(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg2, arg2, arg8, arg8, arg3, arg0, local185);
								if (local344.method6271()) {
									local344.method6270(arg6);
								}
								local377 = local344;
							} else {
								local377 = new Class4_Sub1_Sub2(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg2, arg2 + local52 - 1, arg8, local49 + arg8 - 1, arg3, arg0, arg1);
							}
							local634 = Static117.method2480(arg5, arg2, arg8, pba.class);
							if (local634 instanceof Class4_Sub1_Sub4 && local634.aShort126 == arg2 && arg8 == local634.aShort125) {
								((Class4_Sub1_Sub4) local634).aClass4_Sub1_1 = local377;
							} else {
								Static254.method7016(local377, false);
							}
							if (local30.anInt6914 != 0 && arg9 != null) {
								arg9.method4598(arg2, local49, arg8, local30.aBoolean469, !local30.aBoolean478, local52);
							}
							if (local30.anInt6920 != 64) {
								Static595.method7844(arg5, arg2, arg8, local30.anInt6920);
							}
						} else {
							@Pc(1836) Class4_Sub2 local1836;
							if (arg3 == 4) {
								if (local219) {
									@Pc(1855) Class4_Sub2_Sub2 local1855 = new Class4_Sub2_Sub2(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, 0, 0, 0, arg3, arg0);
									local1836 = local1855;
									if (local1855.method6271()) {
										local1855.method6270(arg6);
									}
								} else {
									local1836 = new Class4_Sub2_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, 0, 0, 0, arg3, arg0, arg1);
								}
								@Pc(1870) Class4_Sub2 local1870 = Static401.method5859(arg5, arg2, arg8);
								if (local1870 instanceof Class4_Sub2_Sub3) {
									((Class4_Sub2_Sub3) local1870).aClass4_Sub2_1 = local1836;
								} else {
									Static513.method7113(arg5, arg2, arg8, local1836, null);
								}
							} else {
								@Pc(1892) int local1892;
								@Pc(1898) Interface18 local1898;
								@Pc(1937) Class4_Sub2_Sub2 local1937;
								@Pc(1981) Class4_Sub2 local1981;
								if (arg3 == 5) {
									local1892 = 65;
									local1898 = (Interface18) Static162.method2962(arg5, arg2, arg8);
									if (local1898 != null) {
										local1892 = Static412.aClass307_4.method6636(local1898.method6265()).anInt6920 + 1;
									}
									if (local219) {
										local1937 = new Class4_Sub2_Sub2(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, 0, Static491.anIntArray604[arg0] * local1892, Static207.anIntArray269[arg0] * local1892, arg3, arg0);
										local1836 = local1937;
										if (local1937.method6271()) {
											local1937.method6270(arg6);
										}
									} else {
										local1836 = new Class4_Sub2_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, 0, Static491.anIntArray604[arg0] * local1892, local1892 * Static207.anIntArray269[arg0], arg3, arg0, arg1);
									}
									local1981 = Static401.method5859(arg5, arg2, arg8);
									if (local1981 instanceof Class4_Sub2_Sub3) {
										((Class4_Sub2_Sub3) local1981).aClass4_Sub2_1 = local1836;
									} else {
										Static513.method7113(arg5, arg2, arg8, local1836, null);
									}
								} else if (arg3 == 6) {
									local1892 = 33;
									local1898 = (Interface18) Static162.method2962(arg5, arg2, arg8);
									if (local1898 != null) {
										local1892 = Static412.aClass307_4.method6636(local1898.method6265()).anInt6920 / 2 + 1;
									}
									if (local219) {
										local1937 = new Class4_Sub2_Sub2(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg0, Static491.anIntArray604[arg0] * local1892, local1892 * Static207.anIntArray269[arg0], arg3, arg0 + 4);
										local1836 = local1937;
										if (local1937.method6271()) {
											local1937.method6270(arg6);
										}
									} else {
										local1836 = new Class4_Sub2_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg0, local1892 * Static312.anIntArray425[arg0], Static347.anIntArray460[arg0] * local1892, arg3, arg0 + 4, arg1);
									}
									local1981 = Static401.method5859(arg5, arg2, arg8);
									if (local1981 instanceof Class4_Sub2_Sub3) {
										((Class4_Sub2_Sub3) local1981).aClass4_Sub2_1 = local1836;
									} else {
										Static513.method7113(arg5, arg2, arg8, local1836, null);
									}
								} else if (arg3 == 7) {
									local1892 = arg0 + 2 & 0x3;
									if (local219) {
										@Pc(2168) Class4_Sub2_Sub2 local2168 = new Class4_Sub2_Sub2(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, local1892, 0, 0, arg3, local1892 + 4);
										local1836 = local2168;
										if (local2168.method6271()) {
											local2168.method6270(arg6);
										}
									} else {
										local1836 = new Class4_Sub2_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, local1892, 0, 0, arg3, local1892 + 4, arg1);
									}
									@Pc(2183) Class4_Sub2 local2183 = Static401.method5859(arg5, arg2, arg8);
									if (local2183 instanceof Class4_Sub2_Sub3) {
										((Class4_Sub2_Sub3) local2183).aClass4_Sub2_1 = local1836;
									} else {
										Static513.method7113(arg5, arg2, arg8, local1836, null);
									}
								} else if (arg3 == 8) {
									local348 = arg0 + 2 & 0x3;
									@Pc(2209) int local2209 = 33;
									@Pc(2215) Interface18 local2215 = (Interface18) Static162.method2962(arg5, arg2, arg8);
									if (local2215 != null) {
										local2209 = Static412.aClass307_4.method6636(local2215.method6265()).anInt6920 / 2 + 1;
									}
									@Pc(2260) Class4_Sub2 local2260;
									@Pc(2283) Class4_Sub2 local2283;
									if (local219) {
										local2260 = new Class4_Sub2_Sub2(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg0, Static312.anIntArray425[arg0] * local2209, Static347.anIntArray460[arg0] * local2209, arg3, arg0 + 4);
										local2283 = new Class4_Sub2_Sub2(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg0, 0, 0, arg3, local348 + 4);
										if (local2260.method6271()) {
											local2260.method6270(arg6);
										}
										if (local2283.method6271()) {
											local2283.method6270(arg6);
										}
									} else {
										local2260 = new Class4_Sub2_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg0, local2209 * Static312.anIntArray425[arg0], Static347.anIntArray460[arg0] * local2209, arg3, arg0 + 4, arg1);
										local2283 = new Class4_Sub2_Sub1(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg0, 0, 0, arg3, local348 + 4, arg1);
									}
									Static513.method7113(arg5, arg2, arg8, local2260, local2283);
								}
							}
						}
					}
				}
			}
		} else if (Static140.aClass6_Sub48_Sub1_1.aBoolean674 || local30.anInt6889 != 0 || local30.anInt6914 == 1 || local30.aBoolean482) {
			@Pc(276) Class4_Sub3 local276;
			if (local219) {
				@Pc(274) Class4_Sub3_Sub3 local274 = new Class4_Sub3_Sub3(arg6, local30, arg7, local164, local155, local173, super.aBoolean249, arg0, local185);
				local276 = local274;
				if (local274.method6271()) {
					local274.method6270(arg6);
				}
			} else {
				local276 = new Class4_Sub3_Sub2(arg6, local30, arg5, arg7, local164, local155, local173, super.aBoolean249, arg0, arg1);
			}
			@Pc(306) Class4_Sub3 local306 = Static300.method4758(arg5, arg2, arg8);
			if (local306 instanceof Class4_Sub3_Sub1) {
				((Class4_Sub3_Sub1) local306).aClass4_Sub3_1 = local276;
			} else {
				Static100.method1796(arg5, arg2, arg8, local276);
			}
			if (local30.anInt6914 == 1 && arg9 != null) {
				arg9.method4594(arg2, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([BII[Lclient!ld;Lclient!oa;IIIIII)V")
	public void method3154(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class189[] arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class6_Sub21 local15 = new Class6_Sub21(arg0);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method6041();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method6005();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local15.method6069();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (arg6 == local55 && local51 >= arg7 && local51 < arg7 + 8 && local45 >= arg1 && arg1 + 8 > local45) {
					@Pc(99) Class252 local99 = Static412.aClass307_4.method6636(local17);
					@Pc(116) int local116 = arg4 + Static330.method5153(local67, local99.anInt6898, local99.anInt6935, local51 & 0x7, arg9, local45 & 0x7);
					@Pc(133) int local133 = Static95.method1723(local45 & 0x7, local99.anInt6898, local99.anInt6935, local51 & 0x7, arg9, local67) + arg5;
					if (local116 > 0 && local133 > 0 && super.anInt3551 - 1 > local116 && local133 < super.anInt3553 - 1) {
						@Pc(162) Class189 local162 = null;
						if (!super.aBoolean249) {
							@Pc(167) int local167 = arg8;
							if ((Static154.aByteArrayArrayArray4[1][local116][local133] & 0x2) == 2) {
								local167 = arg8 - 1;
							}
							if (local167 >= 0) {
								local162 = arg2[local167];
							}
						}
						this.method3153(local67 + arg9 & 0x3, -1, local116, local63, local17, arg8, arg3, arg8, local133, local162);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ld;ILclient!oa;IIBI)V")
	public void method3155(@OriginalArg(0) Class189 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface18 local7 = null;
		if (arg5 == 0) {
			local7 = (Interface18) Static162.method2962(arg3, arg1, arg4);
		}
		if (arg5 == 1) {
			local7 = (Interface18) Static401.method5859(arg3, arg1, arg4);
		}
		if (arg5 == 2) {
			local7 = (Interface18) Static117.method2480(arg3, arg1, arg4, pba.class);
		}
		if (arg5 == 3) {
			local7 = (Interface18) Static300.method4758(arg3, arg1, arg4);
		}
		if (local7 == null) {
			return;
		}
		@Pc(69) Class252 local69 = Static412.aClass307_4.method6636(local7.method6265());
		@Pc(73) int local73 = local7.method6268();
		@Pc(77) int local77 = local7.method6272();
		if (local69.method5795()) {
			Static92.method1685(local69, arg3, arg1, arg4);
		}
		if (local7.method6271()) {
			local7.method6267(arg2);
		}
		if (arg5 == 0) {
			@Pc(102) Class4_Sub5 local102 = Static162.method2962(arg3, arg1, arg4);
			if (local102 instanceof Class4_Sub5_Sub2) {
				((Class4_Sub5_Sub2) local102).aClass4_Sub5_1 = null;
			} else {
				Static211.method3733(arg3, arg1, arg4);
			}
			if (local69.anInt6914 != 0) {
				arg0.method4599(!local69.aBoolean478, local73, local69.aBoolean469, arg1, local77, arg4);
				return;
			}
		} else if (arg5 == 1) {
			@Pc(286) Class4_Sub2 local286 = Static401.method5859(arg3, arg1, arg4);
			if (!(local286 instanceof Class4_Sub2_Sub3)) {
				Static468.method6539(arg3, arg1, arg4);
				return;
			}
			((Class4_Sub2_Sub3) local286).aClass4_Sub2_1 = null;
		} else {
			if (arg5 == 2) {
				@Pc(190) Class4_Sub1 local190 = Static117.method2480(arg3, arg1, arg4, pba.class);
				if (local190 instanceof Class4_Sub1_Sub4 && arg1 == local190.aShort126 && arg4 == local190.aShort125) {
					((Class4_Sub1_Sub4) local190).aClass4_Sub1_1 = null;
				} else {
					Static57.method1222(arg3, arg1, arg4, pba.class);
				}
				if (local69.anInt6914 == 0 || local69.anInt6935 + arg1 >= super.anInt3551 || local69.anInt6935 + arg4 >= super.anInt3553 || super.anInt3551 <= local69.anInt6898 + arg1 || local69.anInt6898 + arg4 >= super.anInt3553) {
					return;
				}
				arg0.method4588(arg4, local69.anInt6898, local69.anInt6935, !local69.aBoolean478, local77, arg1, local69.aBoolean469);
			} else if (arg5 == 3) {
				@Pc(152) Class4_Sub3 local152 = Static300.method4758(arg3, arg1, arg4);
				if (local152 instanceof Class4_Sub3_Sub1) {
					((Class4_Sub3_Sub1) local152).aClass4_Sub3_1 = null;
				} else {
					Static489.method6691(arg3, arg1, arg4);
				}
				if (local69.anInt6914 == 1) {
					arg0.method4593(arg1, arg4);
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIILclient!ji;Lclient!oa;[IIII)V")
	public void method3156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub21 arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean249) {
			return;
		}
		@Pc(13) Class348 local13 = null;
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(31) int local31 = (arg1 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(36) int local36;
						@Pc(101) int local101;
						@Pc(421) int local421;
						@Pc(126) int local126;
						while (arg4.anInt7338 < arg4.aByteArray93.length) {
							local36 = arg4.method6069();
							if (local36 == 0) {
								local13 = new Class348(arg4);
							} else {
								@Pc(132) int local132;
								@Pc(189) int local189;
								@Pc(282) int local282;
								@Pc(320) int local320;
								if (local36 == 1) {
									local101 = arg4.method6069();
									if (local101 > 0) {
										for (local421 = 0; local421 < local101; local421++) {
											@Pc(430) Class78 local430 = new Class78(arg5, arg4, 2);
											if (local430.anInt2076 == 31) {
												@Pc(443) Class309 local443 = Static507.aClass196_1.method4681(arg4.method6003());
												local430.method1921(local443.anInt8216, local443.anInt8215, local443.anInt8214, local443.anInt8220);
											}
											if (arg5.method6847() > 0) {
												@Pc(463) Class6_Sub7 local463 = local430.aClass6_Sub7_1;
												local132 = local463.method4292() >> 9;
												local189 = local463.method4286() >> 9;
												if (arg0 == local430.anInt2074 && local132 >= local25 && local132 < local25 + 8 && local31 <= local189 && local189 < local31 + 8) {
													local282 = Static2.method65(arg7, local463.method4292() & 0xFFF, local463.method4286() & 0xFFF) + (arg8 << 9);
													local320 = (arg3 << 9) + Static577.method7708(local463.method4292() & 0xFFF, arg7, local463.method4286() & 0xFFF);
													local132 = local282 >> 9;
													local189 = local320 >> 9;
													if (local132 >= 0 && local189 >= 0 && local132 < super.anInt3551 && super.anInt3553 > local189) {
														local463.method4290(local282, local320, super.anIntArrayArrayArray5[arg0][local132][local189] - local463.method4291());
														Static560.method7561(local430);
													}
												}
											}
										}
									}
								} else if (local36 == 2) {
									if (local13 == null) {
										local13 = new Class348();
									}
									local13.method7686(arg4);
								} else if (local36 != 128) {
									if (local36 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray13 == null) {
										super.aByteArrayArrayArray13 = new byte[4][][];
									}
									for (local101 = 0; local101 < 4; local101++) {
										@Pc(107) byte local107 = arg4.method6055();
										@Pc(130) int local130;
										if (local107 == 0 && super.aByteArrayArrayArray13[arg9] != null) {
											if (arg0 >= local101) {
												local126 = arg8;
												local130 = arg8 + 7;
												local132 = arg3;
												if (arg8 < 0) {
													local126 = 0;
												} else if (super.anInt3551 <= arg8) {
													local126 = super.anInt3551;
												}
												if (local130 < 0) {
													local130 = 0;
												} else if (super.anInt3551 <= local130) {
													local130 = super.anInt3551;
												}
												if (arg3 < 0) {
													local132 = 0;
												} else if (super.anInt3553 <= arg3) {
													local132 = super.anInt3553;
												}
												local189 = arg3 + 7;
												if (local189 < 0) {
													local189 = 0;
												} else if (super.anInt3553 <= local189) {
													local189 = super.anInt3553;
												}
												while (local126 < local130) {
													while (local132 < local189) {
														super.aByteArrayArrayArray13[arg9][local126][local132] = 0;
														local132++;
													}
													local126++;
												}
											}
										} else if (local107 == 1) {
											if (super.aByteArrayArrayArray13[arg9] == null) {
												super.aByteArrayArrayArray13[arg9] = new byte[super.anInt3551 + 1][super.anInt3553 + 1];
											}
											for (local126 = 0; local126 < 64; local126 += 4) {
												for (local130 = 0; local130 < 64; local130 += 4) {
													@Pc(269) byte local269 = arg4.method6055();
													if (local101 <= arg0) {
														for (local189 = local126; local189 < local126 + 4; local189++) {
															for (local282 = local130; local282 < local130 + 4; local282++) {
																if (local25 <= local189 && local25 + 8 > local189 && local282 >= local31 && local31 + 8 > local31) {
																	local320 = Static110.method1959(local189 & 0x7, arg7, local282 & 0x7) + arg8;
																	@Pc(334) int local334 = Static496.method6749(local189 & 0x7, local282 & 0x7, arg7) + arg3;
																	if (local320 >= 0 && local320 < super.anInt3551 && local334 >= 0 && local334 < super.anInt3553) {
																		super.aByteArrayArrayArray13[arg9][local320][local334] = local269;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg6 == null) {
									arg4.anInt7338 += 10;
								} else {
									arg6[0] = arg4.method6003();
									arg6[1] = arg4.method6058();
									arg6[2] = arg4.method6058();
									arg6[3] = arg4.method6058();
									arg6[4] = arg4.method6003();
								}
							}
						}
						if (local13 != null) {
							Static130.method2587(local13, arg8 >> 3, arg3 >> 3);
						}
						if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg9] != null) {
							local36 = arg8 + 7;
							local101 = arg3 + 7;
							for (local421 = arg8; local421 < local36; local421++) {
								for (local126 = arg3; local126 < local101; local126++) {
									super.aByteArrayArrayArray13[arg9][local421][local126] = 0;
								}
							}
							return;
						}
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I[Lclient!ld;Lclient!oa;II[B)V")
	public void method3157(@OriginalArg(1) Class189[] arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(21) Class6_Sub21 local21 = new Class6_Sub21(arg4);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local21.method6041();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local21.method6005();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local21.method6069();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = arg3 + local60;
				@Pc(85) int local85 = local54 + arg2;
				if (local80 > 0 && local85 > 0 && super.anInt3551 - 1 > local80 && super.anInt3553 - 1 > local85) {
					@Pc(106) Class189 local106 = null;
					if (!super.aBoolean249) {
						@Pc(111) int local111 = local64;
						if ((Static154.aByteArrayArrayArray4[1][local80][local85] & 0x2) == 2) {
							local111 = local64 - 1;
						}
						if (local111 >= 0) {
							local106 = arg0[local111];
						}
					}
					this.method3153(local76, -1, local80, local72, local23, local64, arg1, local64, local85, local106);
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!oa;I[IILclient!ji;)V")
	public void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub21 arg4) {
		if (super.aBoolean249) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) Class348 local19 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		while (true) {
			@Pc(42) int local42;
			@Pc(97) int local97;
			@Pc(105) int local105;
			@Pc(109) int local109;
			@Pc(49) int local49;
			label306: do {
				while (true) {
					@Pc(30) int local30;
					@Pc(248) int local248;
					@Pc(252) int local252;
					while (arg4.anInt7338 < arg4.aByteArray93.length) {
						local30 = arg4.method6069();
						if (local30 == 0) {
							local19 = new Class348(arg4);
						} else {
							if (local30 == 1) {
								local42 = arg4.method6069();
								continue label306;
							}
							if (local30 == 2) {
								if (local19 == null) {
									local19 = new Class348();
								}
								local19.method7686(arg4);
							} else if (local30 != 128) {
								if (local30 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray13 == null) {
									super.aByteArrayArrayArray13 = new byte[4][][];
								}
								local17 = true;
								for (local42 = 0; local42 < 4; local42++) {
									@Pc(239) byte local239 = arg4.method6055();
									if (local239 == 0 && super.aByteArrayArrayArray13[local42] != null) {
										local248 = arg3;
										local252 = arg3 + 64;
										local97 = arg0;
										local105 = arg0 + 64;
										if (arg3 < 0) {
											local248 = 0;
										} else if (super.anInt3551 <= arg3) {
											local248 = super.anInt3551;
										}
										if (local252 < 0) {
											local252 = 0;
										} else if (super.anInt3551 <= local252) {
											local252 = super.anInt3551;
										}
										if (arg0 < 0) {
											local97 = 0;
										} else if (super.anInt3553 <= arg0) {
											local97 = super.anInt3553;
										}
										if (local105 < 0) {
											local105 = 0;
										} else if (local105 >= super.anInt3553) {
											local105 = super.anInt3553;
										}
										while (local252 > local248) {
											while (local97 < local105) {
												super.aByteArrayArrayArray13[local42][local248][local97] = 0;
												local97++;
											}
											local248++;
										}
									} else if (local239 == 1) {
										if (super.aByteArrayArrayArray13[local42] == null) {
											super.aByteArrayArrayArray13[local42] = new byte[super.anInt3551 + 1][super.anInt3553 + 1];
										}
										for (local248 = 0; local248 < 64; local248 += 4) {
											for (local252 = 0; local252 < 64; local252 += 4) {
												@Pc(391) byte local391 = arg4.method6055();
												for (local105 = local248 + arg3; local105 < local248 + arg3 + 4; local105++) {
													for (local109 = local252 + arg0; local109 < arg0 + local252 + 4; local109++) {
														if (local105 >= 0 && super.anInt3551 > local105 && local109 >= 0 && super.anInt3553 > local109) {
															super.aByteArrayArrayArray13[local42][local105][local109] = local391;
														}
													}
												}
											}
										}
									} else if (local239 == 2) {
										if (super.aByteArrayArrayArray13[local42] == null) {
											super.aByteArrayArrayArray13[local42] = new byte[super.anInt3551 + 1][super.anInt3553 + 1];
										}
										if (local42 > 0) {
											local248 = arg3;
											local252 = arg3 + 64;
											local97 = arg0;
											if (local252 < 0) {
												local252 = 0;
											} else if (super.anInt3551 <= local252) {
												local252 = super.anInt3551;
											}
											if (arg3 < 0) {
												local248 = 0;
											} else if (super.anInt3551 <= arg3) {
												local248 = super.anInt3551;
											}
											if (arg0 < 0) {
												local97 = 0;
											} else if (arg0 >= super.anInt3553) {
												local97 = super.anInt3553;
											}
											local105 = arg0 + 64;
											if (local105 < 0) {
												local105 = 0;
											} else if (super.anInt3553 <= local105) {
												local105 = super.anInt3553;
											}
											while (local252 > local248) {
												while (local97 < local105) {
													super.aByteArrayArrayArray13[local42][local248][local97] = super.aByteArrayArrayArray13[local42 - 1][local248][local97];
													local97++;
												}
												local248++;
											}
										}
									}
								}
							} else if (arg2 == null) {
								arg4.anInt7338 += 10;
							} else {
								arg2[0] = arg4.method6003();
								arg2[1] = arg4.method6058();
								arg2[2] = arg4.method6058();
								arg2[3] = arg4.method6058();
								arg2[4] = arg4.method6003();
							}
						}
					}
					if (local19 != null) {
						for (local30 = 0; local30 < 8; local30++) {
							for (local42 = 0; local42 < 8; local42++) {
								local49 = (arg3 >> 3) + local30;
								local248 = local42 + (arg0 >> 3);
								if (local49 >= 0 && local49 < super.anInt3551 >> 3 && local248 >= 0 && super.anInt3553 >> 3 > local248) {
									Static130.method2587(local19, local49, local248);
								}
							}
						}
					}
					if (!local17 && super.aByteArrayArrayArray13 != null) {
						for (local30 = 0; local30 < 4; local30++) {
							if (super.aByteArrayArrayArray13[local30] != null) {
								for (local42 = 0; local42 < 16; local42++) {
									for (local49 = 0; local49 < 16; local49++) {
										local248 = local42 + (arg3 >> 2);
										local252 = (arg0 >> 2) + local49;
										if (local248 >= 0 && local248 < 26 && local252 >= 0 && local252 < 26) {
											super.aByteArrayArrayArray13[local30][local248][local252] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local42 <= 0);
			for (local49 = 0; local49 < local42; local49++) {
				@Pc(58) Class78 local58 = new Class78(arg1, arg4, 2);
				if (local58.anInt2076 == 31) {
					@Pc(69) Class309 local69 = Static507.aClass196_1.method4681(arg4.method6003());
					local58.method1921(local69.anInt8216, local69.anInt8215, local69.anInt8214, local69.anInt8220);
				}
				if (arg1.method6847() > 0) {
					@Pc(89) Class6_Sub7 local89 = local58.aClass6_Sub7_1;
					local97 = (arg3 << 9) + local89.method4292();
					local105 = local89.method4286() + (arg0 << 9);
					local109 = local97 >> 9;
					@Pc(113) int local113 = local105 >> 9;
					if (local109 >= 0 && local113 >= 0 && super.anInt3551 > local109 && super.anInt3553 > local113) {
						local89.method4290(local97, local105, super.anIntArrayArrayArray5[local58.anInt2074][local109][local113] - local89.method4291());
						Static560.method7561(local58);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!oa;)V")
	public void method3160(@OriginalArg(1) Class14 arg0) {
		Static98.method1776(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt3545 > 1) {
			for (local13 = 0; local13 < super.anInt3551; local13++) {
				for (local17 = 0; local17 < super.anInt3553; local17++) {
					if ((Static154.aByteArrayArrayArray4[1][local13][local17] & 0x2) == 2) {
						Static494.method6743(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; local13 < super.anInt3545; local13++) {
			for (local17 = 0; super.anInt3553 >= local17; local17++) {
				for (@Pc(59) int local59 = 0; local59 <= super.anInt3551; local59++) {
					@Pc(74) int local74;
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(101) int local101;
					@Pc(129) int local129;
					@Pc(224) int local224;
					@Pc(233) int local233;
					@Pc(253) int local253;
					@Pc(257) int local257;
					if ((super.aByteArrayArrayArray12[local13][local59][local17] & 0x1) != 0) {
						local74 = local17;
						local76 = local17;
						local78 = local13;
						while (local74 > 0 && (super.aByteArrayArrayArray12[local13][local59][local74 - 1] & 0x1) != 0) {
							local74--;
						}
						local101 = local13;
						while (local76 < super.anInt3553 && (super.aByteArrayArrayArray12[local13][local59][local76 + 1] & 0x1) != 0) {
							local76++;
						}
						label164: while (local78 > 0) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray12[local78 - 1][local59][local129] & 0x1) == 0) {
									break label164;
								}
							}
							local78--;
						}
						label153: while (local101 < 3) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray12[local101 + 1][local59][local129] & 0x1) == 0) {
									break label153;
								}
							}
							local101++;
						}
						local129 = (local76 + 1 - local74) * (local101 + 1 - local78);
						if (local129 >= 2) {
							local224 = super.anIntArrayArrayArray5[local101][local59][local74] - 960;
							local233 = super.anIntArrayArrayArray5[local78][local59][local74];
							Static83.method1639(1, local59 << 9, local59 << 9, local74 << 9, (local76 << 9) + 512, local224, local233);
							for (local253 = local78; local253 <= local101; local253++) {
								for (local257 = local74; local257 <= local76; local257++) {
									super.aByteArrayArrayArray12[local253][local59][local257] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local13][local59][local17] & 0x2) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local13;
						while (local74 > 0 && (super.aByteArrayArrayArray12[local13][local74 - 1][local17] & 0x2) != 0) {
							local74--;
						}
						while (local76 < super.anInt3551 && (super.aByteArrayArrayArray12[local13][local76 + 1][local17] & 0x2) != 0) {
							local76++;
						}
						local101 = local13;
						label218: while (local78 > 0) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray12[local78 - 1][local129][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local78--;
						}
						label207: while (local101 < 3) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray12[local101 + 1][local129][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local101++;
						}
						local129 = (local76 + 1 - local74) * (local101 + 1 - local78);
						if (local129 >= 2) {
							local224 = super.anIntArrayArrayArray5[local101][local74][local17] - 960;
							local233 = super.anIntArrayArrayArray5[local78][local74][local17];
							Static83.method1639(2, local74 << 9, (local76 << 9) + 512, local17 << 9, local17 << 9, local224, local233);
							for (local253 = local78; local253 <= local101; local253++) {
								for (local257 = local74; local257 <= local76; local257++) {
									super.aByteArrayArrayArray12[local253][local257][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local13][local59][local17] & 0x4) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local17;
						local101 = local17;
						while (local78 > 0 && (super.aByteArrayArrayArray12[local13][local59][local78 - 1] & 0x4) != 0) {
							local78--;
						}
						while (local101 < super.anInt3553 && (super.aByteArrayArrayArray12[local13][local59][local101 + 1] & 0x4) != 0) {
							local101++;
						}
						label272: while (local74 > 0) {
							for (local129 = local78; local129 <= local101; local129++) {
								if ((super.aByteArrayArrayArray12[local13][local74 - 1][local129] & 0x4) == 0) {
									break label272;
								}
							}
							local74--;
						}
						label261: while (local76 < super.anInt3551) {
							for (local129 = local78; local129 <= local101; local129++) {
								if ((super.aByteArrayArrayArray12[local13][local76 + 1][local129] & 0x4) == 0) {
									break label261;
								}
							}
							local76++;
						}
						if ((local101 + 1 - local78) * (local76 + 1 - local74) >= 4) {
							local129 = super.anIntArrayArrayArray5[local13][local74][local78];
							Static83.method1639(4, local74 << 9, (local76 << 9) + 512, local78 << 9, (local101 << 9) + 512, local129, local129);
							for (@Pc(701) int local701 = local74; local701 <= local76; local701++) {
								for (local224 = local78; local224 <= local101; local224++) {
									super.aByteArrayArrayArray12[local13][local701][local224] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray12 = null;
	}
}
