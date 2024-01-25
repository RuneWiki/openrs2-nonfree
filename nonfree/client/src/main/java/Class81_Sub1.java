import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class81_Sub1 extends Class81 {

	@OriginalMember(owner = "client!du", name = "L", descriptor = "I")
	public int anInt2430 = 99;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIZ)V")
	public Class81_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static621.aClass315_6, Static527.aClass238_5);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIILclient!ha;IIIIILclient!fe;)V")
	public void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class105 arg9) {
		if (Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 0 && !Static24.method994(Static35.anInt1167, arg0, arg6, arg7)) {
			return;
		}
		if (this.anInt2430 > arg3) {
			this.anInt2430 = arg3;
		}
		@Pc(30) Class299 local30 = Static105.aClass302_1.method7466(arg2);
		if (Static262.aClass3_Sub27_12.aClass21_Sub9_1.method3111() == 0 && local30.aBoolean602) {
			return;
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		if (arg8 == 1 || arg8 == 3) {
			local50 = local30.anInt8625;
			local53 = local30.anInt8661;
		} else {
			local50 = local30.anInt8661;
			local53 = local30.anInt8625;
		}
		@Pc(77) int local77;
		@Pc(75) int local75;
		if (local50 + arg7 > super.anInt2414) {
			local75 = arg7 + 1;
			local77 = arg7;
		} else {
			local77 = arg7 + (local50 >> 1);
			local75 = (local50 + 1 >> 1) + arg7;
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (local53 + arg6 <= super.anInt2408) {
			local105 = arg6 + (local53 >> 1);
			local113 = (local53 + 1 >> 1) + arg6;
		} else {
			local113 = arg6 + 1;
			local105 = arg6;
		}
		@Pc(125) Class51 local125 = Static364.aClass51Array3[arg0];
		@Pc(153) int local153 = local125.method7835(local77, local105) + local125.method7835(local75, local105) + local125.method7835(local77, local113) + local125.method7835(local75, local113) >> 2;
		@Pc(161) int local161 = (local50 << 8) + (arg7 << 9);
		@Pc(170) int local170 = (arg6 << 9) + (local53 << 8);
		@Pc(182) boolean local182 = Static13.aBoolean727 && !super.aBoolean164 && local30.aBoolean601;
		if (local30.method7416()) {
			Static380.method6113(arg6, null, arg7, local30, null, arg3, arg8);
		}
		@Pc(216) boolean local216 = arg5 == -1 && local30.anInt8644 == -1 && local30.anIntArray536 == null && local30.anIntArray533 == null && !local30.aBoolean599;
		if (Static379.aBoolean513 && (Static242.method3967(arg1) && local30.anInt8655 != 1 || !(!Static145.method2664(arg1) || local30.anInt8655 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(368) int local368;
			@Pc(433) int local433;
			@Pc(429) int local429;
			if (arg1 == 10 || arg1 == 11) {
				@Pc(334) Class4_Sub1_Sub2_Sub2 local334 = null;
				@Pc(372) Class4_Sub1_Sub2 local372;
				if (local216) {
					@Pc(364) Class4_Sub1_Sub2_Sub2 local364 = new Class4_Sub1_Sub2_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg7, local50 + arg7 - 1, arg6, local53 + arg6 - 1, arg1, arg8, local182);
					local368 = local364.method2357();
					local334 = local364;
					local372 = local364;
				} else {
					local372 = new Class4_Sub1_Sub2_Sub4(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg7, local50 + arg7 - 1, arg6, local53 + arg6 - 1, arg1, arg8, arg5);
					local368 = 15;
				}
				if (Static67.method1693(local372, false)) {
					if (local334 != null && local334.method7378()) {
						local334.method7380(arg4);
					}
					if (local30.aBoolean606 && Static13.aBoolean727) {
						if (local368 > 30) {
							local368 = 30;
						}
						for (local429 = 0; local429 <= local50; local429++) {
							for (local433 = 0; local433 <= local53; local433++) {
								local125.ka(local429 + arg7, local433 + arg6, local368);
							}
						}
					}
				}
				if (local30.anInt8637 != 0 && arg9 != null) {
					arg9.method2735(local30.aBoolean605, local53, local50, arg6, !local30.aBoolean611, arg7);
				}
			} else {
				@Pc(529) Class4_Sub1_Sub2 local529;
				@Pc(559) Class4_Sub1_Sub2_Sub2 local559;
				if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
					if (local216) {
						local559 = new Class4_Sub1_Sub2_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg7, local50 + arg7 - 1, arg6, local53 + arg6 - 1, arg1, arg8, local182);
						local529 = local559;
						if (local559.method7378()) {
							local559.method7380(arg4);
						}
					} else {
						local529 = new Class4_Sub1_Sub2_Sub4(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg7, arg7 + local50 - 1, arg6, local53 + arg6 - 1, arg1, arg8, arg5);
					}
					Static67.method1693(local529, false);
					if (Static13.aBoolean727 && !super.aBoolean164 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg3 > 0 && local30.anInt8655 != 0) {
						super.aByteArrayArrayArray10[arg3][arg7][arg6] = (byte) (super.aByteArrayArrayArray10[arg3][arg7][arg6] | 0x4);
					}
					if (local30.anInt8637 != 0 && arg9 != null) {
						arg9.method2735(local30.aBoolean605, local53, local50, arg6, !local30.aBoolean611, arg7);
					}
				} else {
					@Pc(671) Class4_Sub1_Sub3 local671;
					if (arg1 == 0) {
						@Pc(644) int local644 = local30.anInt8655;
						if (Static415.aBoolean660 && local30.anInt8655 == -1) {
							local644 = 1;
						}
						if (local216) {
							@Pc(689) Class4_Sub1_Sub3_Sub2 local689 = new Class4_Sub1_Sub3_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8, local182);
							if (local689.method7378()) {
								local689.method7380(arg4);
							}
							local671 = local689;
						} else {
							local671 = new Class4_Sub1_Sub3_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8, arg5);
						}
						Static243.method3988(arg3, arg7, arg6, local671, null);
						if (arg8 == 0) {
							if (Static13.aBoolean727 && local30.aBoolean606) {
								local125.ka(arg7, arg6, 50);
								local125.ka(arg7, arg6 + 1, 50);
							}
							if (local644 == 1 && !super.aBoolean164) {
								Static195.method3394(local30.anInt8673, arg7, 1, arg6, arg3, local30.anInt8638);
							}
						} else if (arg8 == 1) {
							if (Static13.aBoolean727 && local30.aBoolean606) {
								local125.ka(arg7, arg6 + 1, 50);
								local125.ka(arg7 + 1, arg6 - -1, 50);
							}
							if (local644 == 1 && !super.aBoolean164) {
								Static195.method3394(-local30.anInt8673, arg7, 2, arg6 + 1, arg3, local30.anInt8638);
							}
						} else if (arg8 == 2) {
							if (Static13.aBoolean727 && local30.aBoolean606) {
								local125.ka(arg7 + 1, arg6, 50);
								local125.ka(arg7 + 1, arg6 + 1, 50);
							}
							if (local644 == 1 && !super.aBoolean164) {
								Static195.method3394(-local30.anInt8673, arg7 + 1, 1, arg6, arg3, local30.anInt8638);
							}
						} else if (arg8 == 3) {
							if (Static13.aBoolean727 && local30.aBoolean606) {
								local125.ka(arg7, arg6, 50);
								local125.ka(arg7 + 1, arg6, 50);
							}
							if (local644 == 1 && !super.aBoolean164) {
								Static195.method3394(local30.anInt8673, arg7, 2, arg6, arg3, local30.anInt8638);
							}
						}
						if (local30.anInt8637 != 0 && arg9 != null) {
							arg9.method2731(arg6, local30.aBoolean605, !local30.aBoolean611, arg8, arg7, arg1);
						}
						if (local30.anInt8683 != 64) {
							Static586.method8271(arg3, arg7, arg6, local30.anInt8683);
						}
					} else {
						@Pc(939) Class4_Sub1_Sub3 local939;
						@Pc(929) Class4_Sub1_Sub3_Sub2 local929;
						if (arg1 == 1) {
							if (local216) {
								local929 = new Class4_Sub1_Sub3_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8, local182);
								if (local929.method7378()) {
									local929.method7380(arg4);
								}
								local939 = local929;
							} else {
								local939 = new Class4_Sub1_Sub3_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8, arg5);
							}
							Static243.method3988(arg3, arg7, arg6, local939, null);
							if (local30.aBoolean606 && Static13.aBoolean727) {
								if (arg8 == 0) {
									local125.ka(arg7, arg6 + 1, 50);
								} else if (arg8 == 1) {
									local125.ka(arg7 + 1, arg6 + 1, 50);
								} else if (arg8 == 2) {
									local125.ka(arg7 + 1, arg6, 50);
								} else if (arg8 == 3) {
									local125.ka(arg7, arg6, 50);
								}
							}
							if (local30.anInt8637 != 0 && arg9 != null) {
								arg9.method2731(arg6, local30.aBoolean605, !local30.aBoolean611, arg8, arg7, arg1);
							}
						} else if (arg1 == 2) {
							local429 = arg8 + 1 & 0x3;
							if (local216) {
								@Pc(1107) Class4_Sub1_Sub3_Sub2 local1107 = new Class4_Sub1_Sub3_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8 + 4, local182);
								@Pc(1123) Class4_Sub1_Sub3_Sub2 local1123 = new Class4_Sub1_Sub3_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, local429, local182);
								if (local1107.method7378()) {
									local1107.method7380(arg4);
								}
								local671 = local1123;
								if (local1123.method7378()) {
									local1123.method7380(arg4);
								}
								local939 = local1107;
							} else {
								local939 = new Class4_Sub1_Sub3_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8 + 4, arg5);
								local671 = new Class4_Sub1_Sub3_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, local429, arg5);
							}
							Static243.method3988(arg3, arg7, arg6, local939, local671);
							if ((local30.anInt8655 == 1 || Static415.aBoolean660 && local30.anInt8655 == -1) && !super.aBoolean164) {
								if (arg8 == 0) {
									Static195.method3394(local30.anInt8673, arg7, 1, arg6, arg3, local30.anInt8638);
									Static195.method3394(local30.anInt8673, arg7, 2, arg6 + 1, arg3, local30.anInt8638);
								} else if (arg8 == 1) {
									Static195.method3394(local30.anInt8673, arg7 + 1, 1, arg6, arg3, local30.anInt8638);
									Static195.method3394(local30.anInt8673, arg7, 2, arg6 + 1, arg3, local30.anInt8638);
								} else if (arg8 == 2) {
									Static195.method3394(local30.anInt8673, arg7 + 1, 1, arg6, arg3, local30.anInt8638);
									Static195.method3394(local30.anInt8673, arg7, 2, arg6, arg3, local30.anInt8638);
								} else if (arg8 == 3) {
									Static195.method3394(local30.anInt8673, arg7, 1, arg6, arg3, local30.anInt8638);
									Static195.method3394(local30.anInt8673, arg7, 2, arg6, arg3, local30.anInt8638);
								}
							}
							if (local30.anInt8637 != 0 && arg9 != null) {
								arg9.method2731(arg6, local30.aBoolean605, !local30.aBoolean611, arg8, arg7, arg1);
							}
							if (local30.anInt8683 != 64) {
								Static586.method8271(arg3, arg7, arg6, local30.anInt8683);
							}
						} else if (arg1 == 3) {
							if (local216) {
								local929 = new Class4_Sub1_Sub3_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8, local182);
								local939 = local929;
								if (local929.method7378()) {
									local929.method7380(arg4);
								}
							} else {
								local939 = new Class4_Sub1_Sub3_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg1, arg8, arg5);
							}
							Static243.method3988(arg3, arg7, arg6, local939, null);
							if (local30.aBoolean606 && Static13.aBoolean727) {
								if (arg8 == 0) {
									local125.ka(arg7, arg6 + 1, 50);
								} else if (arg8 == 1) {
									local125.ka(arg7 + 1, arg6 + 1, 50);
								} else if (arg8 == 2) {
									local125.ka(arg7 + 1, arg6, 50);
								} else if (arg8 == 3) {
									local125.ka(arg7, arg6, 50);
								}
							}
							if (local30.anInt8637 != 0 && arg9 != null) {
								arg9.method2731(arg6, local30.aBoolean605, !local30.aBoolean611, arg8, arg7, arg1);
							}
						} else if (arg1 == 9) {
							if (local216) {
								local559 = new Class4_Sub1_Sub2_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg7, arg7, arg6, arg6, arg1, arg8, local182);
								local529 = local559;
								if (local559.method7378()) {
									local559.method7380(arg4);
								}
							} else {
								local529 = new Class4_Sub1_Sub2_Sub4(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg7, local50 + arg7 - 1, arg6, arg6 + local53 - 1, arg1, arg8, arg5);
							}
							Static67.method1693(local529, false);
							if (local30.anInt8655 == 1 && !super.aBoolean164) {
								@Pc(1515) byte local1515;
								if ((arg8 & 0x1) == 0) {
									local1515 = 8;
								} else {
									local1515 = 16;
								}
								Static195.method3394(0, arg7, local1515, arg6, arg3, local30.anInt8638);
							}
							if (local30.anInt8637 != 0 && arg9 != null) {
								arg9.method2735(local30.aBoolean605, local53, local50, arg6, !local30.aBoolean611, arg7);
							}
							if (local30.anInt8683 != 64) {
								Static586.method8271(arg3, arg7, arg6, local30.anInt8683);
							}
						} else {
							@Pc(1596) Class4_Sub1_Sub4 local1596;
							if (arg1 == 4) {
								if (local216) {
									@Pc(1586) Class4_Sub1_Sub4_Sub2 local1586 = new Class4_Sub1_Sub4_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, 0, 0, arg1, arg8);
									if (local1586.method7378()) {
										local1586.method7380(arg4);
									}
									local1596 = local1586;
								} else {
									local1596 = new Class4_Sub1_Sub4_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, 0, 0, arg1, arg8, arg5);
								}
								Static105.method2170(arg3, arg7, arg6, local1596, null);
							} else {
								@Pc(1634) Interface2 local1634;
								@Pc(1673) Class4_Sub1_Sub4_Sub2 local1673;
								if (arg1 == 5) {
									local368 = 65;
									local1634 = (Interface2) Static126.method2496(arg3, arg7, arg6);
									if (local1634 != null) {
										local368 = Static105.aClass302_1.method7466(local1634.method7381()).anInt8683 + 1;
									}
									if (local216) {
										local1673 = new Class4_Sub1_Sub4_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, local368 * Static103.anIntArray90[arg8], Static545.anIntArray643[arg8] * local368, arg1, arg8);
										if (local1673.method7378()) {
											local1673.method7380(arg4);
										}
										local1596 = local1673;
									} else {
										local1596 = new Class4_Sub1_Sub4_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, Static103.anIntArray90[arg8] * local368, local368 * Static545.anIntArray643[arg8], arg1, arg8, arg5);
									}
									Static105.method2170(arg3, arg7, arg6, local1596, null);
								} else if (arg1 == 6) {
									local368 = 33;
									local1634 = (Interface2) Static126.method2496(arg3, arg7, arg6);
									if (local1634 != null) {
										local368 = Static105.aClass302_1.method7466(local1634.method7381()).anInt8683 / 2 + 1;
									}
									if (local216) {
										local1673 = new Class4_Sub1_Sub4_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, Static103.anIntArray90[arg8] * local368, local368 * Static545.anIntArray643[arg8], arg1, arg8 + 4);
										if (local1673.method7378()) {
											local1673.method7380(arg4);
										}
										local1596 = local1673;
									} else {
										local1596 = new Class4_Sub1_Sub4_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, Static37.anIntArray31[arg8] * local368, local368 * Static640.anIntArray665[arg8], arg1, arg8 + 4, arg5);
									}
									Static105.method2170(arg3, arg7, arg6, local1596, null);
								} else if (arg1 == 7) {
									local368 = arg8 + 2 & 0x3;
									if (local216) {
										@Pc(1851) Class4_Sub1_Sub4_Sub2 local1851 = new Class4_Sub1_Sub4_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, 0, 0, arg1, local368 + 4);
										local1596 = local1851;
										if (local1851.method7378()) {
											local1851.method7380(arg4);
										}
									} else {
										local1596 = new Class4_Sub1_Sub4_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, 0, 0, arg1, local368 + 4, arg5);
									}
									Static105.method2170(arg3, arg7, arg6, local1596, null);
								} else if (arg1 == 8) {
									local429 = arg8 + 2 & 0x3;
									local433 = 33;
									@Pc(1907) Interface2 local1907 = (Interface2) Static126.method2496(arg3, arg7, arg6);
									if (local1907 != null) {
										local433 = Static105.aClass302_1.method7466(local1907.method7381()).anInt8683 / 2 + 1;
									}
									@Pc(1951) Class4_Sub1_Sub4 local1951;
									@Pc(1971) Class4_Sub1_Sub4 local1971;
									if (local216) {
										local1951 = new Class4_Sub1_Sub4_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, local433 * Static37.anIntArray31[arg8], local433 * Static640.anIntArray665[arg8], arg1, arg8 + 4);
										local1971 = new Class4_Sub1_Sub4_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, 0, 0, arg1, local429 + 4);
										if (local1951.method7378()) {
											local1951.method7380(arg4);
										}
										if (local1971.method7378()) {
											local1971.method7380(arg4);
										}
									} else {
										local1951 = new Class4_Sub1_Sub4_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, local433 * Static37.anIntArray31[arg8], local433 * Static640.anIntArray665[arg8], arg1, arg8 + 4, arg5);
										local1971 = new Class4_Sub1_Sub4_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, 0, 0, arg1, local429 + 4, arg5);
									}
									Static105.method2170(arg3, arg7, arg6, local1951, local1971);
								}
							}
						}
					}
				}
			}
		} else if (Static262.aClass3_Sub27_12.aClass21_Sub22_1.method6900() != 0 || local30.anInt8641 != 0 || local30.anInt8637 == 1 || local30.aBoolean603) {
			@Pc(292) Class4_Sub1_Sub5 local292;
			if (local216) {
				@Pc(282) Class4_Sub1_Sub5_Sub1 local282 = new Class4_Sub1_Sub5_Sub1(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg8, local182);
				if (local282.method7378()) {
					local282.method7380(arg4);
				}
				local292 = local282;
			} else {
				local292 = new Class4_Sub1_Sub5_Sub2(arg4, local30, arg3, arg0, local161, local153, local170, super.aBoolean164, arg8, arg5);
			}
			Static627.method8642(arg3, arg7, arg6, local292);
			if (local30.anInt8637 == 1 && arg9 != null) {
				arg9.method2730(arg7, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLclient!ha;[Lclient!fe;IIIIIII[B)V")
	public void method2289(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class105[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(26) Class3_Sub3 local26 = new Class3_Sub3(arg9);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local26.method4238();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(44) int local44 = local26.method4228();
				if (local44 == 0) {
					break;
				}
				local40 += local44 - 1;
				@Pc(59) int local59 = local40 & 0x3F;
				@Pc(65) int local65 = local40 >> 6 & 0x3F;
				@Pc(69) int local69 = local40 >> 12;
				@Pc(73) int local73 = local26.method4225();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				if (arg5 == local69 && local65 >= arg4 && local65 < arg4 + 8 && arg3 <= local59 && local59 < arg3 + 8) {
					@Pc(113) Class299 local113 = Static105.aClass302_1.method7466(local28);
					@Pc(131) int local131 = arg7 + Static558.method8038(local65 & 0x7, local59 & 0x7, local113.anInt8661, local81, arg6, local113.anInt8625);
					@Pc(149) int local149 = arg2 + Static75.method1778(arg6, local113.anInt8625, local59 & 0x7, local65 & 0x7, local113.anInt8661, local81);
					if (local131 > 0 && local149 > 0 && super.anInt2414 - 1 > local131 && super.anInt2408 - 1 > local149) {
						@Pc(171) Class105 local171 = null;
						if (!super.aBoolean164) {
							@Pc(176) int local176 = arg8;
							if ((Static513.aByteArrayArrayArray18[1][local131][local149] & 0x2) == 2) {
								local176 = arg8 - 1;
							}
							if (local176 >= 0) {
								local171 = arg1[local176];
							}
						}
						this.method2288(arg8, local77, local28, arg8, arg0, -1, local149, local131, arg6 + local81 & 0x3, local171);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ha;BZ)V")
	public void method2291(@OriginalArg(0) Class5 arg0, @OriginalArg(2) boolean arg1) {
		Static475.method7141();
		if (!arg1) {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if (super.anInt2418 > 1) {
				for (local14 = 0; local14 < super.anInt2414; local14++) {
					for (local18 = 0; local18 < super.anInt2408; local18++) {
						if ((Static513.aByteArrayArrayArray18[1][local14][local18] & 0x2) == 2) {
							Static548.method7972(local14, local18);
						}
					}
				}
			}
			for (local14 = 0; super.anInt2418 > local14; local14++) {
				for (local18 = 0; super.anInt2408 >= local18; local18++) {
					for (@Pc(64) int local64 = 0; local64 <= super.anInt2414; local64++) {
						if ((super.aByteArrayArrayArray10[local14][local64][local18] & 0x4) != 0) {
							@Pc(79) int local79 = local64;
							@Pc(81) int local81 = local64;
							@Pc(83) int local83 = local18;
							@Pc(85) int local85 = local18;
							while (local83 > 0 && (super.aByteArrayArrayArray10[local14][local64][local83 - 1] & 0x4) != 0 && local18 - local83 < 10) {
								local83--;
							}
							while (local85 < super.anInt2408 && (super.aByteArrayArrayArray10[local14][local64][local85 + 1] & 0x4) != 0 && local85 - local83 < 10) {
								local85++;
							}
							@Pc(148) int local148;
							label111: while (local79 > 0 && local64 - local79 < 10) {
								for (local148 = local83; local148 <= local85; local148++) {
									if ((super.aByteArrayArrayArray10[local14][local79 - 1][local148] & 0x4) == 0) {
										break label111;
									}
								}
								local79--;
							}
							label98: while (local81 < super.anInt2414 && local81 - local79 < 10) {
								for (local148 = local83; local148 <= local85; local148++) {
									if ((super.aByteArrayArrayArray10[local14][local81 + 1][local148] & 0x4) == 0) {
										break label98;
									}
								}
								local81++;
							}
							if ((local85 + 1 - local83) * (local81 + (-local79 - -1)) >= 4) {
								local148 = super.anIntArrayArrayArray8[local14][local79][local83];
								Static377.method6073(local83 << 9, local148, local14, local148, local79 << 9, (local81 << 9) + 512, (local85 << 9) + 512);
								for (@Pc(274) int local274 = local79; local274 <= local81; local274++) {
									for (@Pc(278) int local278 = local83; local278 <= local85; local278++) {
										super.aByteArrayArrayArray10[local14][local274][local278] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static452.method2908();
		}
		super.aByteArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(IIIII)Lclient!as;")
	private Interface2 method2293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface2 local5 = null;
		if (arg2 == 0) {
			local5 = (Interface2) Static126.method2496(arg3, arg0, arg1);
		}
		if (arg2 == 1) {
			local5 = (Interface2) Static610.method8465(arg3, arg0, arg1);
		}
		if (arg2 == 2) {
			local5 = (Interface2) Static572.method8142(arg3, arg0, arg1, as.class);
		}
		if (arg2 == 3) {
			local5 = (Interface2) Static625.method8735(arg3, arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ha;[Lclient!fe;IB[BI)V")
	public void method2294(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class3_Sub3 local10 = new Class3_Sub3(arg3);
		@Pc(24) int local24 = -1;
		while (true) {
			@Pc(28) int local28 = local10.method4238();
			if (local28 == 0) {
				return;
			}
			local24 += local28;
			@Pc(39) int local39 = 0;
			while (true) {
				@Pc(45) int local45 = local10.method4228();
				if (local45 == 0) {
					break;
				}
				local39 += local45 - 1;
				@Pc(57) int local57 = local39 & 0x3F;
				@Pc(63) int local63 = local39 >> 6 & 0x3F;
				@Pc(67) int local67 = local39 >> 12;
				@Pc(71) int local71 = local10.method4225();
				@Pc(75) int local75 = local71 >> 2;
				@Pc(79) int local79 = local71 & 0x3;
				@Pc(84) int local84 = local63 + arg4;
				@Pc(88) int local88 = arg2 + local57;
				if (local84 > 0 && local88 > 0 && super.anInt2414 - 1 > local84 && super.anInt2408 - 1 > local88) {
					@Pc(109) Class105 local109 = null;
					if (!super.aBoolean164) {
						@Pc(114) int local114 = local67;
						if ((Static513.aByteArrayArrayArray18[1][local84][local88] & 0x2) == 2) {
							local114 = local67 - 1;
						}
						if (local114 >= 0) {
							local109 = arg1[local114];
						}
					}
					this.method2288(local67, local75, local24, local67, arg0, -1, local88, local84, local79, local109);
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIILclient!ha;[ILclient!sl;I)V")
	public void method2295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class3_Sub3 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean164) {
			return;
		}
		if (arg7 != null) {
			arg7[0] = -1;
		}
		@Pc(19) Class16 local19 = null;
		@Pc(36) int local36 = (arg9 & 0x7) * 8;
		@Pc(42) int local42 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(58) int local58;
			@Pc(119) int local119;
			@Pc(165) int local165;
			@Pc(185) int local185;
			@Pc(65) int local65;
			@Pc(113) int local113;
			label233: do {
				while (true) {
					@Pc(47) int local47;
					@Pc(352) int local352;
					while (arg8.anInt4736 < arg8.aByteArray54.length) {
						local47 = arg8.method4225();
						if (local47 == 0) {
							local19 = new Class16(arg8);
						} else {
							if (local47 == 1) {
								local58 = arg8.method4225();
								continue label233;
							}
							if (local47 == 2) {
								if (local19 == null) {
									local19 = new Class16();
								}
								local19.method906(arg8);
							} else if (local47 != 128) {
								if (local47 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray9 == null) {
									super.aByteArrayArrayArray9 = new byte[4][][];
								}
								for (local58 = 0; local58 < 4; local58++) {
									@Pc(333) byte local333 = arg8.method4254();
									@Pc(356) int local356;
									if (local333 == 0 && super.aByteArrayArrayArray9[arg0] != null) {
										if (arg2 >= local58) {
											local352 = arg3;
											local356 = arg3 + 7;
											local113 = arg1;
											if (arg1 < 0) {
												local113 = 0;
											} else if (arg1 >= super.anInt2408) {
												local113 = super.anInt2408;
											}
											if (local356 < 0) {
												local356 = 0;
											} else if (super.anInt2414 <= local356) {
												local356 = super.anInt2414;
											}
											if (arg3 < 0) {
												local352 = 0;
											} else if (arg3 >= super.anInt2414) {
												local352 = super.anInt2414;
											}
											local119 = arg1 + 7;
											if (local119 < 0) {
												local119 = 0;
											} else if (super.anInt2408 <= local119) {
												local119 = super.anInt2408;
											}
											while (local352 < local356) {
												while (local113 < local119) {
													super.aByteArrayArrayArray9[arg0][local352][local113] = 0;
													local113++;
												}
												local352++;
											}
										}
									} else if (local333 == 1) {
										if (super.aByteArrayArrayArray9[arg0] == null) {
											super.aByteArrayArrayArray9[arg0] = new byte[super.anInt2414 + 1][super.anInt2408 + 1];
										}
										for (local352 = 0; local352 < 64; local352 += 4) {
											for (local356 = 0; local356 < 64; local356 += 4) {
												@Pc(494) byte local494 = arg8.method4254();
												if (local58 <= arg2) {
													for (local119 = local352; local119 < local352 + 4; local119++) {
														for (local165 = local356; local165 < local356 + 4; local165++) {
															if (local119 >= local36 && local119 < local36 + 8 && local165 >= local42 && local42 < local42 + 8) {
																local185 = arg3 + Static601.method8391(local119 & 0x7, local165 & 0x7, arg4);
																@Pc(564) int local564 = arg1 + Static23.method989(local165 & 0x7, local119 & 0x7, arg4);
																if (local185 >= 0 && super.anInt2414 > local185 && local564 >= 0 && super.anInt2408 > local564) {
																	super.aByteArrayArrayArray9[arg0][local185][local564] = local494;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg7 == null) {
								arg8.anInt4736 += 10;
							} else {
								arg7[0] = arg8.method4221();
								arg7[1] = arg8.method4209();
								arg7[2] = arg8.method4209();
								arg7[3] = arg8.method4209();
								arg7[4] = arg8.method4221();
							}
						}
					}
					if (local19 != null) {
						Static367.method5982(local19, arg3 >> 3, arg1 >> 3);
					}
					if (super.aByteArrayArrayArray9 != null && super.aByteArrayArrayArray9[arg0] != null) {
						local47 = arg3 + 7;
						local58 = arg1 + 7;
						for (local65 = arg3; local65 < local47; local65++) {
							for (local352 = arg1; local352 < local58; local352++) {
								super.aByteArrayArrayArray9[arg0][local65][local352] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local58 <= 0);
			for (local65 = 0; local65 < local58; local65++) {
				@Pc(74) Class206 local74 = new Class206(arg6, arg8, 2);
				if (local74.anInt6046 == 31) {
					@Pc(87) Class348 local87 = Static135.aClass331_1.method8108(arg8.method4221());
					local74.method5264(local87.anInt9607, local87.anInt9608, local87.anInt9604, local87.anInt9605);
				}
				if (arg6.method7517() > 0) {
					@Pc(107) Class3_Sub16 local107 = local74.aClass3_Sub16_3;
					local113 = local107.method4778() >> 9;
					local119 = local107.method4783() >> 9;
					if (arg2 == local74.anInt6053 && local113 >= local36 && local36 + 8 > local113 && local119 >= local42 && local42 + 8 > local119) {
						local165 = Static379.method6105(local107.method4783() & 0xFFF, local107.method4778() & 0xFFF, arg4) + (arg3 << 9);
						local185 = Static75.method1781(local107.method4778() & 0xFFF, arg4, local107.method4783() & 0xFFF) + (arg1 << 9);
						local113 = local165 >> 9;
						local119 = local185 >> 9;
						if (local113 >= 0 && local119 >= 0 && local113 < super.anInt2414 && super.anInt2408 > local119) {
							local107.method4784(local165, super.anIntArrayArrayArray8[arg2][local113][local119] - local107.method4777(), local185);
							Static574.method8148(local74);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIILclient!ha;Lclient!fe;I)V")
	public void method2296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) Class105 arg4, @OriginalArg(6) int arg5) {
		@Pc(15) Interface2 local15 = this.method2293(arg0, arg5, arg2, arg1);
		if (local15 == null) {
			return;
		}
		@Pc(24) Class299 local24 = Static105.aClass302_1.method7466(local15.method7381());
		@Pc(28) int local28 = local15.method7382();
		@Pc(32) int local32 = local15.method7379();
		if (local24.method7416()) {
			Static588.method8285(arg1, arg0, local24, arg5);
		}
		if (local15.method7378()) {
			local15.method7383(arg3);
		}
		if (arg2 == 0) {
			Static260.method7706(arg1, arg0, arg5);
			if (local24.anInt8637 != 0) {
				arg4.method2722(arg5, local28, local24.aBoolean605, !local24.aBoolean611, arg0, local32);
			}
			if (local24.anInt8655 == 1) {
				if (local32 != 0) {
					if (local32 == 1) {
						Static243.method3993(arg0, arg5 + 1, 2, arg1);
						return;
					}
					if (local32 == 2) {
						Static243.method3993(arg0 + 1, arg5, 1, arg1);
					} else if (local32 == 3) {
						Static243.method3993(arg0, arg5, 2, arg1);
						return;
					}
					return;
				}
				Static243.method3993(arg0, arg5, 1, arg1);
				return;
			}
			return;
		}
		if (arg2 == 1) {
			Static423.method6624(arg1, arg0, arg5);
			return;
		}
		if (arg2 != 2) {
			if (arg2 == 3) {
				Static574.method8147(arg1, arg0, arg5);
				if (local24.anInt8637 == 1) {
					arg4.method2726(arg5, arg0);
					return;
				}
			}
			return;
		}
		Static5.method3194(arg1, arg0, arg5, as.class);
		if (local24.anInt8637 != 0 && super.anInt2414 > local24.anInt8661 + arg0 && arg5 + local24.anInt8661 < super.anInt2408 && arg0 + local24.anInt8625 < super.anInt2414 && arg5 + local24.anInt8625 < super.anInt2408) {
			arg4.method2725(local24.anInt8625, local24.aBoolean605, arg0, arg5, local32, !local24.aBoolean611, local24.anInt8661);
		}
		if (local28 != 9) {
			return;
		}
		if ((local32 & 0x1) == 0) {
			Static243.method3993(arg0, arg5, 8, arg1);
			return;
		}
		Static243.method3993(arg0, arg5, 16, arg1);
		return;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([IIIILclient!ha;Lclient!sl;)V")
	public void method2297(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) Class3_Sub3 arg4) {
		if (super.aBoolean164) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class16 local13 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		while (true) {
			@Pc(33) int local33;
			@Pc(90) int local90;
			@Pc(100) int local100;
			@Pc(104) int local104;
			@Pc(40) int local40;
			label306: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(262) int local262;
					@Pc(266) int local266;
					while (arg4.aByteArray54.length > arg4.anInt4736) {
						local24 = arg4.method4225();
						if (local24 == 0) {
							local13 = new Class16(arg4);
						} else {
							if (local24 == 1) {
								local33 = arg4.method4225();
								continue label306;
							}
							if (local24 == 2) {
								if (local13 == null) {
									local13 = new Class16();
								}
								local13.method906(arg4);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray9 == null) {
									super.aByteArrayArrayArray9 = new byte[4][][];
								}
								local11 = true;
								for (local33 = 0; local33 < 4; local33++) {
									@Pc(232) byte local232 = arg4.method4254();
									if (local232 == 0 && super.aByteArrayArrayArray9[local33] != null) {
										local262 = arg1;
										local266 = arg1 + 64;
										local90 = arg2;
										local100 = arg2 + 64;
										if (arg2 < 0) {
											local90 = 0;
										} else if (arg2 >= super.anInt2408) {
											local90 = super.anInt2408;
										}
										if (local266 < 0) {
											local266 = 0;
										} else if (super.anInt2414 <= local266) {
											local266 = super.anInt2414;
										}
										if (arg1 < 0) {
											local262 = 0;
										} else if (arg1 >= super.anInt2414) {
											local262 = super.anInt2414;
										}
										if (local100 < 0) {
											local100 = 0;
										} else if (super.anInt2408 <= local100) {
											local100 = super.anInt2408;
										}
										while (local262 < local266) {
											while (local90 < local100) {
												super.aByteArrayArrayArray9[local33][local262][local90] = 0;
												local90++;
											}
											local262++;
										}
									} else if (local232 == 1) {
										if (super.aByteArrayArrayArray9[local33] == null) {
											super.aByteArrayArrayArray9[local33] = new byte[super.anInt2414 + 1][super.anInt2408 + 1];
										}
										for (local262 = 0; local262 < 64; local262 += 4) {
											for (local266 = 0; local266 < 64; local266 += 4) {
												@Pc(272) byte local272 = arg4.method4254();
												for (local100 = local262 + arg1; local100 < local262 + arg1 + 4; local100++) {
													for (local104 = arg2 + local266; local104 < arg2 + local266 + 4; local104++) {
														if (local100 >= 0 && super.anInt2414 > local100 && local104 >= 0 && super.anInt2408 > local104) {
															super.aByteArrayArrayArray9[local33][local100][local104] = local272;
														}
													}
												}
											}
										}
									} else if (local232 == 2) {
										if (super.aByteArrayArrayArray9[local33] == null) {
											super.aByteArrayArrayArray9[local33] = new byte[super.anInt2414 + 1][super.anInt2408 + 1];
										}
										if (local33 > 0) {
											local262 = arg1;
											local266 = arg1 + 64;
											local90 = arg2;
											local100 = arg2 + 64;
											if (arg1 < 0) {
												local262 = 0;
											} else if (arg1 >= super.anInt2414) {
												local262 = super.anInt2414;
											}
											if (arg2 < 0) {
												local90 = 0;
											} else if (super.anInt2408 <= arg2) {
												local90 = super.anInt2408;
											}
											if (local266 < 0) {
												local266 = 0;
											} else if (super.anInt2414 <= local266) {
												local266 = super.anInt2414;
											}
											if (local100 < 0) {
												local100 = 0;
											} else if (super.anInt2408 <= local100) {
												local100 = super.anInt2408;
											}
											while (local262 < local266) {
												while (local100 > local90) {
													super.aByteArrayArrayArray9[local33][local262][local90] = super.aByteArrayArrayArray9[local33 - 1][local262][local90];
													local90++;
												}
												local262++;
											}
										}
									}
								}
							} else if (arg0 == null) {
								arg4.anInt4736 += 10;
							} else {
								arg0[0] = arg4.method4221();
								arg0[1] = arg4.method4209();
								arg0[2] = arg4.method4209();
								arg0[3] = arg4.method4209();
								arg0[4] = arg4.method4221();
							}
						}
					}
					if (local13 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local33 = 0; local33 < 8; local33++) {
								local40 = local24 + (arg1 >> 3);
								local262 = (arg2 >> 3) + local33;
								if (local40 >= 0 && super.anInt2414 >> 3 > local40 && local262 >= 0 && local262 < super.anInt2408 >> 3) {
									Static367.method5982(local13, local40, local262);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray9 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray9[local24] != null) {
								for (local33 = 0; local33 < 16; local33++) {
									for (local40 = 0; local40 < 16; local40++) {
										local262 = (arg1 >> 2) + local33;
										local266 = local40 + (arg2 >> 2);
										if (local262 >= 0 && local262 < 26 && local266 >= 0 && local266 < 26) {
											super.aByteArrayArrayArray9[local24][local262][local266] = 0;
										}
									}
								}
							}
						}
					}
					return;
				}
			} while (local33 <= 0);
			for (local40 = 0; local40 < local33; local40++) {
				@Pc(49) Class206 local49 = new Class206(arg3, arg4, 2);
				if (local49.anInt6046 == 31) {
					@Pc(62) Class348 local62 = Static135.aClass331_1.method8108(arg4.method4221());
					local49.method5264(local62.anInt9607, local62.anInt9608, local62.anInt9604, local62.anInt9605);
				}
				if (arg3.method7517() > 0) {
					@Pc(82) Class3_Sub16 local82 = local49.aClass3_Sub16_3;
					local90 = (arg1 << 9) + local82.method4778();
					local100 = (arg2 << 9) + local82.method4783();
					local104 = local90 >> 9;
					@Pc(108) int local108 = local100 >> 9;
					if (local104 >= 0 && local108 >= 0 && local104 < super.anInt2414 && local108 < super.anInt2408) {
						local82.method4784(local90, super.anIntArrayArrayArray8[local49.anInt6053][local104][local108] - local82.method4777(), local100);
						Static574.method8148(local49);
					}
				}
			}
		}
	}
}
