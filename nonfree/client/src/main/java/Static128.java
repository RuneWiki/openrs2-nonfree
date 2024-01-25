import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
	public static int anInt2337;

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "Lclient!nj;")
	public static Class3_Sub25 aClass3_Sub25_2;

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "Lclient!la;")
	public static final Class136 aClass136_61 = new Class136(5, 2);

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
	public static int anInt2338 = 0;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
	public static void method2019() {
		for (@Pc(10) Class3_Sub38 local10 = (Class3_Sub38) Static325.aClass193_54.method4519(); local10 != null; local10 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			if (Static139.method2135(local10.anInt5875)) {
				Static460.method6239(local10);
			}
		}
		if (Static276.anInt4608 == 1) {
			Static149.method2338();
			return;
		}
		Static208.method3163(Static100.anInt1814, Static368.anInt6234, Static242.anInt4125, Static348.anInt5871);
		@Pc(55) int local55 = Static251.aClass124_14.method3099(Static22.aClass174_14.method4208(Static300.anInt5192));
		for (@Pc(60) Class3_Sub38 local60 = (Class3_Sub38) Static325.aClass193_54.method4519(); local60 != null; local60 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			@Pc(66) int local66 = Static442.method6043(local60);
			if (local55 < local66) {
				local55 = local66;
			}
		}
		Static100.anInt1814 = local55 + 8;
		Static242.anInt4125 = (Static71.aBoolean86 ? 26 : 22) + Static276.anInt4608 * 16;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!wj;B)V")
	public static void method2022(@OriginalArg(0) Class1_Sub2_Sub6 arg0) {
		arg0.anInt7628 = 0;
		@Pc(24) Class261 local24;
		if (arg0.anInt7586 != -1) {
			local24 = Static444.aClass59_3.method1552(arg0.anInt7586);
			if (local24 == null || local24.anIntArray494 == null) {
				arg0.aBoolean507 = false;
				arg0.anInt7586 = -1;
			} else {
				label394: {
					arg0.anInt7576++;
					if (arg0.anInt7569 < local24.anIntArray494.length && arg0.anInt7576 > local24.anIntArray493[arg0.anInt7569]) {
						arg0.anInt7581++;
						arg0.anInt7576 = 1;
						arg0.anInt7569++;
						Static192.method3007(local24, arg0.aByte101, arg0.anInt7569, arg0.anInt7560, arg0.anInt7557, arg0 == Static203.aClass1_Sub2_Sub6_Sub2_1);
					}
					if (arg0.anInt7569 >= local24.anIntArray494.length) {
						arg0.anInt7576 = 0;
						arg0.anInt7569 = 0;
						if (arg0.aBoolean507) {
							arg0.anInt7586 = arg0.method6189().method3512();
							if (arg0.anInt7586 == -1) {
								arg0.aBoolean507 = false;
								break label394;
							}
							local24 = Static444.aClass59_3.method1552(arg0.anInt7586);
						}
						Static192.method3007(local24, arg0.aByte101, arg0.anInt7569, arg0.anInt7560, arg0.anInt7557, arg0 == Static203.aClass1_Sub2_Sub6_Sub2_1);
					}
					arg0.anInt7581 = arg0.anInt7569 + 1;
					if (arg0.anInt7581 >= local24.anIntArray494.length) {
						arg0.anInt7581 = 0;
					}
				}
			}
		}
		@Pc(187) int local187;
		@Pc(197) Class261 local197;
		@Pc(184) Class52 local184;
		if (arg0.anInt7596 != -1 && arg0.anInt7590 <= Static172.anInt3107) {
			local184 = Static387.aClass201_2.method4775(arg0.anInt7596);
			local187 = local184.anInt1397;
			if (local187 == -1) {
				arg0.anInt7596 = -1;
			} else {
				label396: {
					local197 = Static444.aClass59_3.method1552(local187);
					if (local184.aBoolean92) {
						if (local197.anInt7420 == 3) {
							if (arg0.anInt7641 > 0 && Static172.anInt3107 >= arg0.anInt7568 && arg0.anInt7611 < Static172.anInt3107) {
								arg0.anInt7596 = -1;
								break label396;
							}
						} else if (local197.anInt7420 == 1 && arg0.anInt7641 > 0 && Static172.anInt3107 >= arg0.anInt7568 && Static172.anInt3107 > arg0.anInt7611) {
							arg0.anInt7590 = Static172.anInt3107 + 1;
							break label396;
						}
					}
					if (local197 == null || local197.anIntArray494 == null) {
						arg0.anInt7596 = -1;
					} else {
						if (arg0.anInt7572 < 0) {
							arg0.anInt7572 = 0;
							Static192.method3007(local197, arg0.aByte101, 0, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
						}
						arg0.anInt7604++;
						if (arg0.anInt7572 < local197.anIntArray494.length && local197.anIntArray493[arg0.anInt7572] < arg0.anInt7604) {
							arg0.anInt7572++;
							arg0.anInt7604 = 1;
							Static192.method3007(local197, arg0.aByte101, arg0.anInt7572, arg0.anInt7560, arg0.anInt7557, arg0 == Static203.aClass1_Sub2_Sub6_Sub2_1);
						}
						if (arg0.anInt7572 >= local197.anIntArray494.length) {
							if (local184.aBoolean92) {
								arg0.anInt7599++;
								arg0.anInt7572 -= local197.anInt7413;
								if (arg0.anInt7599 >= local197.anInt7424) {
									arg0.anInt7596 = -1;
								} else if (arg0.anInt7572 >= 0 && local197.anIntArray494.length > arg0.anInt7572) {
									Static192.method3007(local197, arg0.aByte101, arg0.anInt7572, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
								} else {
									arg0.anInt7596 = -1;
								}
							} else {
								arg0.anInt7596 = -1;
							}
						}
						arg0.anInt7614 = arg0.anInt7572 + 1;
						if (local197.anIntArray494.length <= arg0.anInt7614) {
							if (local184.aBoolean92) {
								arg0.anInt7614 -= local197.anInt7413;
								if (arg0.anInt7599 + 1 >= local197.anInt7424) {
									arg0.anInt7614 = -1;
								} else if (arg0.anInt7614 < 0 || arg0.anInt7614 >= local197.anIntArray494.length) {
									arg0.anInt7614 = -1;
								}
							} else {
								arg0.anInt7614 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7605 != -1 && Static172.anInt3107 >= arg0.anInt7595) {
			local184 = Static387.aClass201_2.method4775(arg0.anInt7605);
			local187 = local184.anInt1397;
			if (local187 == -1) {
				arg0.anInt7605 = -1;
			} else {
				label399: {
					local197 = Static444.aClass59_3.method1552(local187);
					if (local184.aBoolean92) {
						if (local197.anInt7420 == 3) {
							if (arg0.anInt7641 > 0 && arg0.anInt7568 <= Static172.anInt3107 && arg0.anInt7611 < Static172.anInt3107) {
								arg0.anInt7605 = -1;
								break label399;
							}
						} else if (local197.anInt7420 == 1 && arg0.anInt7641 > 0 && arg0.anInt7568 <= Static172.anInt3107 && Static172.anInt3107 > arg0.anInt7611) {
							arg0.anInt7595 = Static172.anInt3107 + 1;
							break label399;
						}
					}
					if (local197 == null || local197.anIntArray494 == null) {
						arg0.anInt7605 = -1;
					} else {
						if (arg0.anInt7629 < 0) {
							arg0.anInt7629 = 0;
							Static192.method3007(local197, arg0.aByte101, 0, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
						}
						arg0.anInt7592++;
						if (local197.anIntArray494.length > arg0.anInt7629 && arg0.anInt7592 > local197.anIntArray493[arg0.anInt7629]) {
							arg0.anInt7629++;
							arg0.anInt7592 = 1;
							Static192.method3007(local197, arg0.aByte101, arg0.anInt7629, arg0.anInt7560, arg0.anInt7557, arg0 == Static203.aClass1_Sub2_Sub6_Sub2_1);
						}
						if (arg0.anInt7629 >= local197.anIntArray494.length) {
							if (local184.aBoolean92) {
								arg0.anInt7629 -= local197.anInt7413;
								arg0.anInt7623++;
								if (arg0.anInt7623 >= local197.anInt7424) {
									arg0.anInt7605 = -1;
								} else if (arg0.anInt7629 >= 0 && local197.anIntArray494.length > arg0.anInt7629) {
									Static192.method3007(local197, arg0.aByte101, arg0.anInt7629, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
								} else {
									arg0.anInt7605 = -1;
								}
							} else {
								arg0.anInt7605 = -1;
							}
						}
						arg0.anInt7593 = arg0.anInt7629 + 1;
						if (local197.anIntArray494.length <= arg0.anInt7593) {
							if (local184.aBoolean92) {
								arg0.anInt7593 -= local197.anInt7413;
								if (arg0.anInt7623 + 1 >= local197.anInt7424) {
									arg0.anInt7593 = -1;
								} else if (arg0.anInt7593 < 0 || arg0.anInt7593 >= local197.anIntArray494.length) {
									arg0.anInt7593 = -1;
								}
							} else {
								arg0.anInt7593 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7612 != -1 && arg0.anInt7624 <= 1) {
			local24 = Static444.aClass59_3.method1552(arg0.anInt7612);
			if (local24.anInt7420 == 3) {
				if (arg0.anInt7641 > 0 && Static172.anInt3107 >= arg0.anInt7568 && arg0.anInt7611 < Static172.anInt3107) {
					arg0.anInt7612 = -1;
				}
			} else if (local24.anInt7420 == 1 && arg0.anInt7641 > 0 && Static172.anInt3107 >= arg0.anInt7568 && Static172.anInt3107 > arg0.anInt7611) {
				arg0.anInt7624 = 2;
			}
		}
		if (arg0.anInt7612 != -1 && arg0.anInt7624 == 0) {
			local24 = Static444.aClass59_3.method1552(arg0.anInt7612);
			if (local24 == null || local24.anIntArray494 == null) {
				arg0.anInt7612 = -1;
			} else {
				arg0.anInt7620++;
				if (arg0.anInt7588 < local24.anIntArray494.length && local24.anIntArray493[arg0.anInt7588] < arg0.anInt7620) {
					arg0.anInt7620 = 1;
					arg0.anInt7588++;
					Static192.method3007(local24, arg0.aByte101, arg0.anInt7588, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
				}
				if (arg0.anInt7588 >= local24.anIntArray494.length) {
					arg0.anInt7588 -= local24.anInt7413;
					arg0.anInt7597++;
					if (local24.anInt7424 <= arg0.anInt7597) {
						arg0.anInt7612 = -1;
					} else if (arg0.anInt7588 >= 0 && arg0.anInt7588 < local24.anIntArray494.length) {
						Static192.method3007(local24, arg0.aByte101, arg0.anInt7588, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
					} else {
						arg0.anInt7612 = -1;
					}
				}
				arg0.anInt7617 = arg0.anInt7588 + 1;
				if (arg0.anInt7617 >= local24.anIntArray494.length) {
					arg0.anInt7617 -= local24.anInt7413;
					if (local24.anInt7424 <= arg0.anInt7597 + 1) {
						arg0.anInt7617 = -1;
					} else if (arg0.anInt7617 < 0 || arg0.anInt7617 >= local24.anIntArray494.length) {
						arg0.anInt7617 = -1;
					}
				}
				arg0.anInt7628 = local24.anInt7422;
			}
		}
		if (arg0.anInt7624 > 0) {
			arg0.anInt7624--;
		}
		for (@Pc(1070) int local1070 = 0; local1070 < arg0.aClass60Array3.length; local1070++) {
			@Pc(1077) Class60 local1077 = arg0.aClass60Array3[local1070];
			if (local1077 != null) {
				if (local1077.anInt1695 > 0) {
					local1077.anInt1695--;
				} else {
					local197 = Static444.aClass59_3.method1552(local1077.anInt1694);
					if (local197 == null || local197.anIntArray494 == null) {
						arg0.aClass60Array3[local1070] = null;
					} else {
						local1077.anInt1701++;
						if (local1077.anInt1697 < local197.anIntArray494.length && local1077.anInt1701 > local197.anIntArray493[local1077.anInt1697]) {
							local1077.anInt1701 = 1;
							local1077.anInt1697++;
							Static192.method3007(local197, arg0.aByte101, local1077.anInt1697, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
						}
						if (local197.anIntArray494.length <= local1077.anInt1697) {
							local1077.anInt1697 -= local197.anInt7413;
							local1077.anInt1696++;
							if (local1077.anInt1696 >= local197.anInt7424) {
								arg0.aClass60Array3[local1070] = null;
							} else if (local1077.anInt1697 >= 0 && local1077.anInt1697 < local197.anIntArray494.length) {
								Static192.method3007(local197, arg0.aByte101, local1077.anInt1697, arg0.anInt7560, arg0.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg0);
							} else {
								arg0.aClass60Array3[local1070] = null;
							}
						}
						local1077.anInt1698 = local1077.anInt1697 + 1;
						if (local1077.anInt1698 >= local197.anIntArray494.length) {
							local1077.anInt1698 -= local197.anInt7413;
							if (local197.anInt7424 <= local1077.anInt1696 + 1) {
								local1077.anInt1698 = -1;
							} else if (local1077.anInt1698 < 0 || local1077.anInt1698 >= local197.anIntArray494.length) {
								local1077.anInt1698 = -1;
							}
						}
					}
				}
			}
		}
	}
}
