import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
	public int anInt9098 = 99;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIZ)V")
	public Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static92.aClass350_2, Static620.aClass119_5);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!mb;ILclient!ha;IIIIII)V")
	public void method7518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class137 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 0 && !Static169.method2765(arg9, arg8, arg5, Static673.anInt11161)) {
			return;
		}
		if (this.anInt9098 > arg6) {
			this.anInt9098 = arg6;
		}
		@Pc(30) Class203 local30 = Static511.aClass13_2.method86(arg3);
		if (Static56.aClass14_Sub22_5.aClass21_Sub28_1.method9104() == 0 && local30.aBoolean425) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg0 == 1 || arg0 == 3) {
			local53 = local30.anInt6028;
			local56 = local30.anInt6065;
		} else {
			local53 = local30.anInt6065;
			local56 = local30.anInt6028;
		}
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (local53 + arg9 <= super.anInt9083) {
			local76 = (local53 >> 1) + arg9;
			local84 = arg9 + (local53 + 1 >> 1);
		} else {
			local84 = arg9 + 1;
			local76 = arg9;
		}
		@Pc(108) int local108;
		@Pc(117) int local117;
		if (super.anInt9081 >= local56 + arg5) {
			local108 = arg5 + (local56 >> 1);
			local117 = arg5 + (local56 + 1 >> 1);
		} else {
			local117 = arg5 + 1;
			local108 = arg5;
		}
		@Pc(129) Class51 local129 = Static576.aClass51Array3[arg8];
		@Pc(157) int local157 = local129.method7857(local108, local76) + local129.method7857(local108, local84) + local129.method7857(local117, local76) + local129.method7857(local117, local84) >> 2;
		@Pc(165) int local165 = (arg9 << 9) + (local53 << 8);
		@Pc(173) int local173 = (local56 << 8) + (arg5 << 9);
		@Pc(185) boolean local185 = Static421.aBoolean520 && !super.aBoolean636 && local30.aBoolean420;
		if (local30.method5012()) {
			Static413.method1523(local30, (Class12_Sub2_Sub2_Sub1_Sub1) null, (Class12_Sub2_Sub2_Sub1_Sub2) null, arg5, arg9, arg0, arg6);
		}
		@Pc(222) boolean local222 = arg7 == -1 && local30.anInt6039 == -1 && local30.anIntArray442 == null && local30.anIntArray440 == null && !local30.aBoolean418 && !local30.aBoolean412;
		if (Static79.aBoolean141 && (Static140.method2210(arg1) && local30.anInt6011 != 1 || !(!Static15.method142(arg1) || local30.anInt6011 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(375) Class12_Sub2_Sub2 local375;
			@Pc(337) Class12_Sub2_Sub2_Sub2 local337;
			@Pc(371) int local371;
			@Pc(434) int local434;
			if (arg1 == 10 || arg1 == 11) {
				local337 = null;
				if (local222) {
					@Pc(367) Class12_Sub2_Sub2_Sub2 local367 = new Class12_Sub2_Sub2_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg9, arg9 + local53 - 1, arg5, arg5 + local56 - 1, arg1, arg0, local185);
					local371 = local367.method2262();
					local337 = local367;
					local375 = local367;
				} else {
					local375 = new Class12_Sub2_Sub2_Sub3(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg9, local53 + arg9 - 1, arg5, arg5 + local56 - 1, arg1, arg0, arg7);
					local371 = 15;
				}
				if (Static662.method9184(local375, false)) {
					if (local337 != null && local337.method9173()) {
						local337.method9177(arg4);
					}
					if (local30.aBoolean413 && Static421.aBoolean520) {
						if (local371 > 30) {
							local371 = 30;
						}
						for (local434 = 0; local434 <= local53; local434++) {
							for (@Pc(438) int local438 = 0; local438 <= local56; local438++) {
								local129.ka(arg9 + local434, arg5 + local438, local371);
							}
						}
					}
				}
				if (local30.anInt6016 != 0 && arg2 != null) {
					arg2.method5362(local53, arg5, arg9, !local30.aBoolean416, local56, local30.aBoolean414);
				}
			} else if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
				if (local222) {
					local337 = new Class12_Sub2_Sub2_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg9, arg9 + local53 - 1, arg5, local56 + arg5 - 1, arg1, arg0, local185);
					local375 = local337;
					if (local337.method9173()) {
						local337.method9177(arg4);
					}
				} else {
					local375 = new Class12_Sub2_Sub2_Sub3(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg9, local53 + arg9 - 1, arg5, arg5 + local56 - 1, arg1, arg0, arg7);
				}
				Static662.method9184(local375, false);
				if (Static421.aBoolean520 && !super.aBoolean636 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg6 > 0 && local30.anInt6011 != 0) {
					super.aByteArrayArrayArray12[arg6][arg9][arg5] = (byte) (super.aByteArrayArrayArray12[arg6][arg9][arg5] | 0x4);
				}
				if (local30.anInt6016 != 0 && arg2 != null) {
					arg2.method5362(local53, arg5, arg9, !local30.aBoolean416, local56, local30.aBoolean414);
				}
			} else {
				@Pc(680) Class12_Sub2_Sub1 local680;
				if (arg1 == 0) {
					@Pc(651) int local651 = local30.anInt6011;
					if (Static75.aBoolean126 && local30.anInt6011 == -1) {
						local651 = 1;
					}
					if (local222) {
						@Pc(678) Class12_Sub2_Sub1_Sub1 local678 = new Class12_Sub2_Sub1_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0, local185);
						local680 = local678;
						if (local678.method9173()) {
							local678.method9177(arg4);
						}
					} else {
						local680 = new Class12_Sub2_Sub1_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0, arg7);
					}
					Static595.method8436(arg6, arg9, arg5, local680, (Class12_Sub2_Sub1) null);
					if (arg0 == 0) {
						if (Static421.aBoolean520 && local30.aBoolean413) {
							local129.ka(arg9, arg5, 50);
							local129.ka(arg9, arg5 + 1, 50);
						}
						if (local651 == 1 && !super.aBoolean636) {
							Static217.method3393(local30.anInt6057, arg9, arg5, 1, local30.anInt6063, arg6);
						}
					} else if (arg0 == 1) {
						if (Static421.aBoolean520 && local30.aBoolean413) {
							local129.ka(arg9, arg5 + 1, 50);
							local129.ka(arg9 + 1, arg5 + 1, 50);
						}
						if (local651 == 1 && !super.aBoolean636) {
							Static217.method3393(-local30.anInt6057, arg9, arg5 + 1, 2, local30.anInt6063, arg6);
						}
					} else if (arg0 == 2) {
						if (Static421.aBoolean520 && local30.aBoolean413) {
							local129.ka(arg9 + 1, arg5, 50);
							local129.ka(arg9 + 1, arg5 + 1, 50);
						}
						if (local651 == 1 && !super.aBoolean636) {
							Static217.method3393(-local30.anInt6057, arg9 + 1, arg5, 1, local30.anInt6063, arg6);
						}
					} else if (arg0 == 3) {
						if (Static421.aBoolean520 && local30.aBoolean413) {
							local129.ka(arg9, arg5, 50);
							local129.ka(arg9 + 1, arg5, 50);
						}
						if (local651 == 1 && !super.aBoolean636) {
							Static217.method3393(local30.anInt6057, arg9, arg5, 2, local30.anInt6063, arg6);
						}
					}
					if (local30.anInt6016 != 0 && arg2 != null) {
						arg2.method5358(local30.aBoolean414, arg0, !local30.aBoolean416, arg5, arg1, arg9);
					}
					if (local30.anInt6025 != 64) {
						Static454.method6571(arg6, arg9, arg5, local30.anInt6025);
					}
				} else {
					@Pc(951) Class12_Sub2_Sub1 local951;
					@Pc(941) Class12_Sub2_Sub1_Sub1 local941;
					if (arg1 == 1) {
						if (local222) {
							local941 = new Class12_Sub2_Sub1_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0, local185);
							if (local941.method9173()) {
								local941.method9177(arg4);
							}
							local951 = local941;
						} else {
							local951 = new Class12_Sub2_Sub1_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0, arg7);
						}
						Static595.method8436(arg6, arg9, arg5, local951, (Class12_Sub2_Sub1) null);
						if (local30.aBoolean413 && Static421.aBoolean520) {
							if (arg0 == 0) {
								local129.ka(arg9, arg5 + 1, 50);
							} else if (arg0 == 1) {
								local129.ka(arg9 + 1, arg5 + 1, 50);
							} else if (arg0 == 2) {
								local129.ka(arg9 + 1, arg5, 50);
							} else if (arg0 == 3) {
								local129.ka(arg9, arg5, 50);
							}
						}
						if (local30.anInt6016 != 0 && arg2 != null) {
							arg2.method5358(local30.aBoolean414, arg0, !local30.aBoolean416, arg5, arg1, arg9);
						}
					} else if (arg1 == 2) {
						local371 = arg0 + 1 & 0x3;
						if (local222) {
							@Pc(1079) Class12_Sub2_Sub1_Sub1 local1079 = new Class12_Sub2_Sub1_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0 + 4, local185);
							@Pc(1095) Class12_Sub2_Sub1_Sub1 local1095 = new Class12_Sub2_Sub1_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, local371, local185);
							if (local1079.method9173()) {
								local1079.method9177(arg4);
							}
							if (local1095.method9173()) {
								local1095.method9177(arg4);
							}
							local680 = local1095;
							local951 = local1079;
						} else {
							local951 = new Class12_Sub2_Sub1_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0 + 4, arg7);
							local680 = new Class12_Sub2_Sub1_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, local371, arg7);
						}
						Static595.method8436(arg6, arg9, arg5, local951, local680);
						if ((local30.anInt6011 == 1 || Static75.aBoolean126 && local30.anInt6011 == -1) && !super.aBoolean636) {
							if (arg0 == 0) {
								Static217.method3393(local30.anInt6057, arg9, arg5, 1, local30.anInt6063, arg6);
								Static217.method3393(local30.anInt6057, arg9, arg5 + 1, 2, local30.anInt6063, arg6);
							} else if (arg0 == 1) {
								Static217.method3393(local30.anInt6057, arg9 + 1, arg5, 1, local30.anInt6063, arg6);
								Static217.method3393(local30.anInt6057, arg9, arg5 + 1, 2, local30.anInt6063, arg6);
							} else if (arg0 == 2) {
								Static217.method3393(local30.anInt6057, arg9 + 1, arg5, 1, local30.anInt6063, arg6);
								Static217.method3393(local30.anInt6057, arg9, arg5, 2, local30.anInt6063, arg6);
							} else if (arg0 == 3) {
								Static217.method3393(local30.anInt6057, arg9, arg5, 1, local30.anInt6063, arg6);
								Static217.method3393(local30.anInt6057, arg9, arg5, 2, local30.anInt6063, arg6);
							}
						}
						if (local30.anInt6016 != 0 && arg2 != null) {
							arg2.method5358(local30.aBoolean414, arg0, !local30.aBoolean416, arg5, arg1, arg9);
						}
						if (local30.anInt6025 != 64) {
							Static454.method6571(arg6, arg9, arg5, local30.anInt6025);
						}
					} else if (arg1 == 3) {
						if (local222) {
							local941 = new Class12_Sub2_Sub1_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0, local185);
							local951 = local941;
							if (local941.method9173()) {
								local941.method9177(arg4);
							}
						} else {
							local951 = new Class12_Sub2_Sub1_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg1, arg0, arg7);
						}
						Static595.method8436(arg6, arg9, arg5, local951, (Class12_Sub2_Sub1) null);
						if (local30.aBoolean413 && Static421.aBoolean520) {
							if (arg0 == 0) {
								local129.ka(arg9, arg5 + 1, 50);
							} else if (arg0 == 1) {
								local129.ka(arg9 + 1, arg5 + 1, 50);
							} else if (arg0 == 2) {
								local129.ka(arg9 + 1, arg5, 50);
							} else if (arg0 == 3) {
								local129.ka(arg9, arg5, 50);
							}
						}
						if (local30.anInt6016 != 0 && arg2 != null) {
							arg2.method5358(local30.aBoolean414, arg0, !local30.aBoolean416, arg5, arg1, arg9);
						}
					} else if (arg1 == 9) {
						if (local222) {
							local337 = new Class12_Sub2_Sub2_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg9, arg9, arg5, arg5, arg1, arg0, local185);
							if (local337.method9173()) {
								local337.method9177(arg4);
							}
							local375 = local337;
						} else {
							local375 = new Class12_Sub2_Sub2_Sub3(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg9, local53 + arg9 - 1, arg5, local56 + arg5 - 1, arg1, arg0, arg7);
						}
						Static662.method9184(local375, false);
						if (local30.anInt6011 == 1 && !super.aBoolean636) {
							@Pc(1537) byte local1537;
							if ((arg0 & 0x1) == 0) {
								local1537 = 8;
							} else {
								local1537 = 16;
							}
							Static217.method3393(0, arg9, arg5, local1537, local30.anInt6063, arg6);
						}
						if (local30.anInt6016 != 0 && arg2 != null) {
							arg2.method5362(local53, arg5, arg9, !local30.aBoolean416, local56, local30.aBoolean414);
						}
						if (local30.anInt6025 != 64) {
							Static454.method6571(arg6, arg9, arg5, local30.anInt6025);
						}
					} else {
						@Pc(1612) Class12_Sub2_Sub3 local1612;
						if (arg1 == 4) {
							if (local222) {
								@Pc(1610) Class12_Sub2_Sub3_Sub2 local1610 = new Class12_Sub2_Sub3_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, 0, 0, arg1, arg0);
								local1612 = local1610;
								if (local1610.method9173()) {
									local1610.method9177(arg4);
								}
							} else {
								local1612 = new Class12_Sub2_Sub3_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, 0, 0, arg1, arg0, arg7);
							}
							Static238.method3569(arg6, arg9, arg5, local1612, (Class12_Sub2_Sub3) null);
						} else {
							@Pc(1652) int local1652;
							@Pc(1658) Interface19 local1658;
							@Pc(1697) Class12_Sub2_Sub3_Sub2 local1697;
							if (arg1 == 5) {
								local1652 = 65;
								local1658 = (Interface19) Static622.method8738(arg6, arg9, arg5);
								if (local1658 != null) {
									local1652 = Static511.aClass13_2.method86(local1658.method9171()).anInt6025 + 1;
								}
								if (local222) {
									local1697 = new Class12_Sub2_Sub3_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, local1652 * Static119.anIntArray209[arg0], Static161.anIntArray260[arg0] * local1652, arg1, arg0);
									if (local1697.method9173()) {
										local1697.method9177(arg4);
									}
									local1612 = local1697;
								} else {
									local1612 = new Class12_Sub2_Sub3_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, local1652 * Static119.anIntArray209[arg0], local1652 * Static161.anIntArray260[arg0], arg1, arg0, arg7);
								}
								Static238.method3569(arg6, arg9, arg5, local1612, (Class12_Sub2_Sub3) null);
							} else if (arg1 == 6) {
								local1652 = 33;
								local1658 = (Interface19) Static622.method8738(arg6, arg9, arg5);
								if (local1658 != null) {
									local1652 = Static511.aClass13_2.method86(local1658.method9171()).anInt6025 / 2 + 1;
								}
								if (local222) {
									local1697 = new Class12_Sub2_Sub3_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, Static119.anIntArray209[arg0] * local1652, Static161.anIntArray260[arg0] * local1652, arg1, arg0 + 4);
									if (local1697.method9173()) {
										local1697.method9177(arg4);
									}
									local1612 = local1697;
								} else {
									local1612 = new Class12_Sub2_Sub3_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, local1652 * Static349.anIntArray469[arg0], Static346.anIntArray461[arg0] * local1652, arg1, arg0 + 4, arg7);
								}
								Static238.method3569(arg6, arg9, arg5, local1612, (Class12_Sub2_Sub3) null);
							} else if (arg1 == 7) {
								local1652 = arg0 + 2 & 0x3;
								if (local222) {
									@Pc(1877) Class12_Sub2_Sub3_Sub2 local1877 = new Class12_Sub2_Sub3_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, 0, 0, arg1, local1652 + 4);
									local1612 = local1877;
									if (local1877.method9173()) {
										local1877.method9177(arg4);
									}
								} else {
									local1612 = new Class12_Sub2_Sub3_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, 0, 0, arg1, local1652 + 4, arg7);
								}
								Static238.method3569(arg6, arg9, arg5, local1612, (Class12_Sub2_Sub3) null);
							} else if (arg1 == 8) {
								local371 = arg0 + 2 & 0x3;
								local434 = 33;
								@Pc(1935) Interface19 local1935 = (Interface19) Static622.method8738(arg6, arg9, arg5);
								if (local1935 != null) {
									local434 = Static511.aClass13_2.method86(local1935.method9171()).anInt6025 / 2 + 1;
								}
								@Pc(1979) Class12_Sub2_Sub3 local1979;
								@Pc(1999) Class12_Sub2_Sub3 local1999;
								if (local222) {
									local1979 = new Class12_Sub2_Sub3_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, Static349.anIntArray469[arg0] * local434, local434 * Static346.anIntArray461[arg0], arg1, arg0 + 4);
									local1999 = new Class12_Sub2_Sub3_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, 0, 0, arg1, local371 + 4);
									if (local1979.method9173()) {
										local1979.method9177(arg4);
									}
									if (local1999.method9173()) {
										local1999.method9177(arg4);
									}
								} else {
									local1979 = new Class12_Sub2_Sub3_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, Static349.anIntArray469[arg0] * local434, local434 * Static346.anIntArray461[arg0], arg1, arg0 + 4, arg7);
									local1999 = new Class12_Sub2_Sub3_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, 0, 0, arg1, local371 + 4, arg7);
								}
								Static238.method3569(arg6, arg9, arg5, local1979, local1999);
							}
						}
					}
				}
			}
		} else if (Static56.aClass14_Sub22_5.aClass21_Sub27_1.method8612() != 0 || local30.anInt6045 != 0 || local30.anInt6016 == 1 || local30.aBoolean417) {
			@Pc(281) Class12_Sub2_Sub4 local281;
			if (local222) {
				@Pc(298) Class12_Sub2_Sub4_Sub1 local298 = new Class12_Sub2_Sub4_Sub1(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg0, local185);
				local281 = local298;
				if (local298.method9173()) {
					local298.method9177(arg4);
				}
			} else {
				local281 = new Class12_Sub2_Sub4_Sub2(arg4, local30, arg6, arg8, local165, local157, local173, super.aBoolean636, arg0, arg7);
			}
			Static603.method8472(arg6, arg9, arg5, local281);
			if (local30.anInt6016 == 1 && arg2 != null) {
				arg2.method5374(arg5, arg9);
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([IILclient!ha;ILclient!so;I)V")
	public void method7519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(4) Class14_Sub29 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean636) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(35) Class304 local35 = null;
		while (true) {
			@Pc(40) int local40;
			@Pc(93) int local93;
			@Pc(132) int local132;
			@Pc(136) int local136;
			@Pc(516) int local516;
			while (arg3.anInt7264 < arg3.aByteArray84.length) {
				local40 = arg3.method5866();
				if (local40 == 0) {
					local35 = new Class304(arg3);
				} else {
					@Pc(245) int local245;
					@Pc(146) int local146;
					@Pc(152) int local152;
					if (local40 == 1) {
						local93 = arg3.method5866();
						if (local93 > 0) {
							for (local516 = 0; local516 < local93; local516++) {
								@Pc(525) Class328 local525 = new Class328(arg2, arg3, 2);
								if (local525.anInt9442 == 31) {
									@Pc(538) Class98 local538 = Static264.aClass68_1.method1730(arg3.method5900());
									local525.method7810(local538.anInt2817, local538.anInt2816, local538.anInt2815, local538.anInt2820);
								}
								if (arg2.method7937() > 0) {
									@Pc(558) Class14_Sub37 local558 = local525.aClass14_Sub37_3;
									local245 = local558.method7827() + (arg4 << 9);
									local146 = local558.method7826() + (arg1 << 9);
									local152 = local245 >> 9;
									@Pc(583) int local583 = local146 >> 9;
									if (local152 >= 0 && local583 >= 0 && local152 < super.anInt9083 && local583 < super.anInt9081) {
										local558.method7821(local245, local146, super.anIntArrayArrayArray19[local525.anInt9433][local152][local583] - local558.method7823());
										Static118.method2069(local525);
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local35 == null) {
							local35 = new Class304();
						}
						local35.method7475(arg3);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						local11 = true;
						for (local93 = 0; local93 < 4; local93++) {
							@Pc(99) byte local99 = arg3.method5845();
							if (local99 == 0 && super.aByteArrayArrayArray14[local93] != null) {
								local132 = arg4;
								local136 = arg4 + 64;
								local245 = arg1;
								if (local136 < 0) {
									local136 = 0;
								} else if (super.anInt9083 <= local136) {
									local136 = super.anInt9083;
								}
								if (arg4 < 0) {
									local132 = 0;
								} else if (arg4 >= super.anInt9083) {
									local132 = super.anInt9083;
								}
								if (arg1 < 0) {
									local245 = 0;
								} else if (arg1 >= super.anInt9081) {
									local245 = super.anInt9081;
								}
								local146 = arg1 + 64;
								if (local146 < 0) {
									local146 = 0;
								} else if (super.anInt9081 <= local146) {
									local146 = super.anInt9081;
								}
								while (local132 < local136) {
									while (local146 > local245) {
										super.aByteArrayArrayArray14[local93][local132][local245] = 0;
										local245++;
									}
									local132++;
								}
							} else if (local99 == 1) {
								if (super.aByteArrayArrayArray14[local93] == null) {
									super.aByteArrayArrayArray14[local93] = new byte[super.anInt9083 + 1][super.anInt9081 + 1];
								}
								for (local132 = 0; local132 < 64; local132 += 4) {
									for (local136 = 0; local136 < 64; local136 += 4) {
										@Pc(142) byte local142 = arg3.method5845();
										for (local146 = local132 + arg4; local146 < local132 + arg4 + 4; local146++) {
											for (local152 = arg1 + local136; local152 < arg1 + local136 + 4; local152++) {
												if (local146 >= 0 && local146 < super.anInt9083 && local152 >= 0 && super.anInt9081 > local152) {
													super.aByteArrayArrayArray14[local93][local146][local152] = local142;
												}
											}
										}
									}
								}
							} else if (local99 == 2) {
								if (super.aByteArrayArrayArray14[local93] == null) {
									super.aByteArrayArrayArray14[local93] = new byte[super.anInt9083 + 1][super.anInt9081 + 1];
								}
								if (local93 > 0) {
									local132 = arg4;
									local136 = arg4 + 64;
									local245 = arg1;
									if (arg4 < 0) {
										local132 = 0;
									} else if (arg4 >= super.anInt9083) {
										local132 = super.anInt9083;
									}
									if (arg1 < 0) {
										local245 = 0;
									} else if (super.anInt9081 <= arg1) {
										local245 = super.anInt9081;
									}
									local146 = arg1 + 64;
									if (local136 < 0) {
										local136 = 0;
									} else if (local136 >= super.anInt9083) {
										local136 = super.anInt9083;
									}
									if (local146 < 0) {
										local146 = 0;
									} else if (super.anInt9081 <= local146) {
										local146 = super.anInt9081;
									}
									while (local136 > local132) {
										while (local245 < local146) {
											super.aByteArrayArrayArray14[local93][local132][local245] = super.aByteArrayArrayArray14[local93 - 1][local132][local245];
											local245++;
										}
										local132++;
									}
								}
							}
						}
					} else if (arg0 == null) {
						arg3.anInt7264 += 10;
					} else {
						arg0[0] = arg3.method5900();
						arg0[1] = arg3.method5890();
						arg0[2] = arg3.method5890();
						arg0[3] = arg3.method5890();
						arg0[4] = arg3.method5900();
					}
				}
			}
			if (local35 != null) {
				for (local40 = 0; local40 < 8; local40++) {
					for (local93 = 0; local93 < 8; local93++) {
						local516 = (arg4 >> 3) + local40;
						local132 = local93 + (arg1 >> 3);
						if (local516 >= 0 && local516 < super.anInt9083 >> 3 && local132 >= 0 && super.anInt9081 >> 3 > local132) {
							Static493.method7313(local132, local516, local35);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray14 != null) {
				for (local40 = 0; local40 < 4; local40++) {
					if (super.aByteArrayArrayArray14[local40] != null) {
						for (local93 = 0; local93 < 16; local93++) {
							for (local516 = 0; local516 < 16; local516++) {
								local132 = local93 + (arg4 >> 2);
								local136 = local516 + (arg1 >> 2);
								if (local132 >= 0 && local132 < 26 && local136 >= 0 && local136 < 26) {
									super.aByteArrayArrayArray14[local40][local132][local136] = 0;
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

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ha;IIIILclient!mb;B)V")
	public void method7521(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class226 arg5) {
		@Pc(13) Interface19 local13 = this.method7524(arg3, arg1, arg2, arg4);
		if (local13 == null) {
			return;
		}
		@Pc(22) Class203 local22 = Static511.aClass13_2.method86(local13.method9171());
		@Pc(26) int local26 = local13.method9175();
		@Pc(30) int local30 = local13.method9174();
		if (local22.method5012()) {
			Static186.method9082(local22, arg2, arg4, arg1);
		}
		if (local13.method9173()) {
			local13.method9172(arg0);
		}
		if (arg3 == 0) {
			Static322.method5088(arg1, arg4, arg2);
			if (local22.anInt6016 != 0) {
				arg5.method5364(local22.aBoolean414, !local22.aBoolean416, local26, arg4, local30, arg2);
			}
			if (local22.anInt6011 == 1) {
				if (local30 == 0) {
					Static403.method5995(arg1, 1, arg4, arg2);
				} else if (local30 == 1) {
					Static403.method5995(arg1, 2, arg4, arg2 + 1);
				} else if (local30 == 2) {
					Static403.method5995(arg1, 1, arg4 + 1, arg2);
				} else if (local30 == 3) {
					Static403.method5995(arg1, 2, arg4, arg2);
				}
			}
		} else if (arg3 == 1) {
			Static64.method1269(arg1, arg4, arg2);
		} else if (arg3 == 2) {
			Static193.method3000(arg1, arg4, arg2, nq.class);
			if (local22.anInt6016 != 0 && arg4 + local22.anInt6065 < super.anInt9083 && local22.anInt6065 + arg2 < super.anInt9081 && super.anInt9083 > arg4 + local22.anInt6028 && local22.anInt6028 + arg2 < super.anInt9081) {
				arg5.method5370(arg2, local22.anInt6065, local22.aBoolean414, !local22.aBoolean416, local30, local22.anInt6028, arg4);
			}
			if (local26 == 9) {
				if ((local30 & 0x1) == 0) {
					Static403.method5995(arg1, 8, arg4, arg2);
				} else {
					Static403.method5995(arg1, 16, arg4, arg2);
				}
			}
		} else if (arg3 == 3) {
			Static475.method6875(arg1, arg4, arg2);
			if (local22.anInt6016 == 1) {
				arg5.method5371(arg2, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIIILclient!ha;IIII[Lclient!mb;I)V")
	public void method7523(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class137 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class226[] arg8, @OriginalArg(10) int arg9) {
		@Pc(16) Class14_Sub29 local16 = new Class14_Sub29(arg0);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method5887();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local16.method5895();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(58) int local58 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local33 >> 12;
				@Pc(66) int local66 = local16.method5866();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				if (local62 == arg4 && local58 >= arg2 && local58 < arg2 + 8 && local52 >= arg7 && local52 < arg7 + 8) {
					@Pc(106) Class203 local106 = Static511.aClass13_2.method86(local18);
					@Pc(123) int local123 = Static403.method6001(local52 & 0x7, local74, local58 & 0x7, local106.anInt6065, local106.anInt6028, arg1) + arg9;
					@Pc(140) int local140 = Static518.method8573(arg1, local106.anInt6028, local106.anInt6065, local52 & 0x7, local74, local58 & 0x7) + arg6;
					if (local123 > 0 && local140 > 0 && super.anInt9083 - 1 > local123 && local140 < super.anInt9081 - 1) {
						@Pc(162) Class226 local162 = null;
						if (!super.aBoolean636) {
							@Pc(167) int local167 = arg5;
							if ((Static553.aByteArrayArrayArray18[1][local123][local140] & 0x2) == 2) {
								local167 = arg5 - 1;
							}
							if (local167 >= 0) {
								local162 = arg8[local167];
							}
						}
						this.method7518(arg1 + local74 & 0x3, local70, local162, local18, arg3, local140, arg5, -1, arg5, local123);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIIII)Lclient!nq;")
	public Interface19 method7524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface19 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface19) Static622.method8738(arg1, arg3, arg2);
		}
		if (arg0 == 1) {
			local5 = (Interface19) Static385.method5716(arg1, arg3, arg2);
		}
		if (arg0 == 2) {
			local5 = (Interface19) Static595.method8438(arg1, arg3, arg2, nq.class);
		}
		if (arg0 == 3) {
			local5 = (Interface19) Static430.method6312(arg1, arg3, arg2);
		}
		return local5;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!ha;Z)V")
	public void method7525(@OriginalArg(1) Class137 arg0, @OriginalArg(2) boolean arg1) {
		Static135.method2156();
		if (!arg1) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			if (super.anInt9077 > 1) {
				for (local16 = 0; super.anInt9083 > local16; local16++) {
					for (local20 = 0; local20 < super.anInt9081; local20++) {
						if ((Static553.aByteArrayArrayArray18[1][local16][local20] & 0x2) == 2) {
							Static400.method5986(local16, local20);
						}
					}
				}
			}
			for (local16 = 0; super.anInt9077 > local16; local16++) {
				for (local20 = 0; local20 <= super.anInt9081; local20++) {
					for (@Pc(60) int local60 = 0; super.anInt9083 >= local60; local60++) {
						if ((super.aByteArrayArrayArray12[local16][local60][local20] & 0x4) != 0) {
							@Pc(78) int local78 = local60;
							@Pc(80) int local80 = local60;
							@Pc(82) int local82 = local20;
							@Pc(84) int local84 = local20;
							while (local82 > 0 && (super.aByteArrayArrayArray12[local16][local60][local82 - 1] & 0x4) != 0 && local20 - local82 < 10) {
								local82--;
							}
							while (super.anInt9081 > local84 && (super.aByteArrayArrayArray12[local16][local60][local84 + 1] & 0x4) != 0 && local84 - local82 < 10) {
								local84++;
							}
							@Pc(143) int local143;
							label111: while (local78 > 0 && local60 - local78 < 10) {
								for (local143 = local82; local143 <= local84; local143++) {
									if ((super.aByteArrayArrayArray12[local16][local78 - 1][local143] & 0x4) == 0) {
										break label111;
									}
								}
								local78--;
							}
							label98: while (local80 < super.anInt9083 && local80 - local78 < 10) {
								for (local143 = local82; local143 <= local84; local143++) {
									if ((super.aByteArrayArrayArray12[local16][local80 + 1][local143] & 0x4) == 0) {
										break label98;
									}
								}
								local80++;
							}
							if ((local84 + 1 - local82) * ((local80 - local78) + 1) >= 4) {
								local143 = super.anIntArrayArrayArray19[local16][local78][local82];
								Static364.method5500((local84 << 9) + 512, local143, local82 << 9, local143, (local80 << 9) + 512, local78 << 9, local16);
								for (@Pc(274) int local274 = local78; local274 <= local80; local274++) {
									for (@Pc(278) int local278 = local82; local278 <= local84; local278++) {
										super.aByteArrayArrayArray12[local16][local274][local278] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static423.method6257();
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!so;IIIII[IILclient!ha;II)V")
	public void method7526(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class137 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean636) {
			return;
		}
		@Pc(13) Class304 local13 = null;
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(25) int local25 = (arg8 & 0x7) * 8;
		@Pc(31) int local31 = (arg2 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(129) int local129;
			@Pc(151) int local151;
			@Pc(423) int local423;
			while (arg0.aByteArray84.length > arg0.anInt7264) {
				local36 = arg0.method5866();
				if (local36 == 0) {
					local13 = new Class304(arg0);
				} else {
					@Pc(194) int local194;
					@Pc(302) int local302;
					@Pc(345) int local345;
					@Pc(157) int local157;
					if (local36 == 1) {
						local129 = arg0.method5866();
						if (local129 > 0) {
							for (local423 = 0; local423 < local129; local423++) {
								@Pc(432) Class328 local432 = new Class328(arg7, arg0, 2);
								if (local432.anInt9442 == 31) {
									@Pc(445) Class98 local445 = Static264.aClass68_1.method1730(arg0.method5900());
									local432.method7810(local445.anInt2817, local445.anInt2816, local445.anInt2815, local445.anInt2820);
								}
								if (arg7.method7937() > 0) {
									@Pc(465) Class14_Sub37 local465 = local432.aClass14_Sub37_3;
									local157 = local465.method7827() >> 9;
									local194 = local465.method7826() >> 9;
									if (local432.anInt9433 == arg9 && local25 <= local157 && local157 < local25 + 8 && local194 >= local31 && local194 < local31 + 8) {
										local302 = (arg1 << 9) + Static170.method2768(local465.method7827() & 0xFFF, arg4, local465.method7826() & 0xFFF);
										local345 = Static513.method7467(local465.method7826() & 0xFFF, arg4, local465.method7827() & 0xFFF) + (arg3 << 9);
										local157 = local302 >> 9;
										local194 = local345 >> 9;
										if (local157 >= 0 && local194 >= 0 && super.anInt9083 > local157 && super.anInt9081 > local194) {
											local465.method7821(local302, local345, super.anIntArrayArrayArray19[arg9][local157][local194] - local465.method7823());
											Static118.method2069(local432);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local13 == null) {
							local13 = new Class304();
						}
						local13.method7475(arg0);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						for (local129 = 0; local129 < 4; local129++) {
							@Pc(135) byte local135 = arg0.method5845();
							@Pc(155) int local155;
							if (local135 == 0 && super.aByteArrayArrayArray14[arg6] != null) {
								if (arg9 >= local129) {
									local151 = arg1;
									local155 = arg1 + 7;
									local157 = arg3;
									if (arg3 < 0) {
										local157 = 0;
									} else if (super.anInt9081 <= arg3) {
										local157 = super.anInt9081;
									}
									if (arg1 < 0) {
										local151 = 0;
									} else if (super.anInt9083 <= arg1) {
										local151 = super.anInt9083;
									}
									local194 = arg3 + 7;
									if (local155 < 0) {
										local155 = 0;
									} else if (super.anInt9083 <= local155) {
										local155 = super.anInt9083;
									}
									if (local194 < 0) {
										local194 = 0;
									} else if (super.anInt9081 <= local194) {
										local194 = super.anInt9081;
									}
									while (local151 < local155) {
										while (local194 > local157) {
											super.aByteArrayArrayArray14[arg6][local151][local157] = 0;
											local157++;
										}
										local151++;
									}
								}
							} else if (local135 == 1) {
								if (super.aByteArrayArrayArray14[arg6] == null) {
									super.aByteArrayArrayArray14[arg6] = new byte[super.anInt9083 + 1][super.anInt9081 + 1];
								}
								for (local151 = 0; local151 < 64; local151 += 4) {
									for (local155 = 0; local155 < 64; local155 += 4) {
										@Pc(293) byte local293 = arg0.method5845();
										if (local129 <= arg9) {
											for (local194 = local151; local194 < local151 + 4; local194++) {
												for (local302 = local155; local302 < local155 + 4; local302++) {
													if (local25 <= local194 && local194 < local25 + 8 && local31 <= local302 && local31 + 8 > local31) {
														local345 = arg1 + Static328.method5136(local302 & 0x7, local194 & 0x7, arg4);
														@Pc(357) int local357 = Static62.method7509(arg4, local194 & 0x7, local302 & 0x7) + arg3;
														if (local345 >= 0 && super.anInt9083 > local345 && local357 >= 0 && local357 < super.anInt9081) {
															super.aByteArrayArrayArray14[arg6][local345][local357] = local293;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg5 == null) {
						arg0.anInt7264 += 10;
					} else {
						arg5[0] = arg0.method5900();
						arg5[1] = arg0.method5890();
						arg5[2] = arg0.method5890();
						arg5[3] = arg0.method5890();
						arg5[4] = arg0.method5900();
					}
				}
			}
			if (local13 != null) {
				Static493.method7313(arg3 >> 3, arg1 >> 3, local13);
			}
			if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg6] != null) {
				local36 = arg1 + 7;
				local129 = arg3 + 7;
				for (local423 = arg1; local423 < local36; local423++) {
					for (local151 = arg3; local151 < local129; local151++) {
						super.aByteArrayArrayArray14[arg6][local423][local151] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIII[Lclient!mb;Lclient!ha;)V")
	public void method7527(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class226[] arg3, @OriginalArg(5) Class137 arg4) {
		@Pc(14) Class14_Sub29 local14 = new Class14_Sub29(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method5887();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method5895();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local14.method5866();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local53 + arg2;
				@Pc(78) int local78 = local47 + arg1;
				if (local73 > 0 && local78 > 0 && super.anInt9083 - 1 > local73 && super.anInt9081 - 1 > local78) {
					@Pc(103) Class226 local103 = null;
					if (!super.aBoolean636) {
						@Pc(108) int local108 = local57;
						if ((Static553.aByteArrayArrayArray18[1][local73][local78] & 0x2) == 2) {
							local108 = local57 - 1;
						}
						if (local108 >= 0) {
							local103 = arg3[local108];
						}
					}
					this.method7518(local69, local65, local103, local16, arg4, local78, local57, -1, local57, local73);
				}
			}
		}
	}
}
