import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Z")
	public static boolean aBoolean366;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt5236;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "I")
	public static int anInt5251;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_27 = new Class220(64);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
	public static int method4160(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local12 < local21) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local44 + local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local21 == local44) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local44 - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(152) int local152 = (int) (local58 * 256.0D);
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		if (local157 < 0) {
			local157 = 0;
		} else if (local157 > 255) {
			local157 = 255;
		}
		@Pc(172) int local172 = (int) (local66 * 256.0D);
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local172 > 243) {
			local157 >>= 0x4;
		} else if (local172 > 217) {
			local157 >>= 0x3;
		} else if (local172 > 192) {
			local157 >>= 0x2;
		} else if (local172 > 179) {
			local157 >>= 0x1;
		}
		return ((local152 >> 2 & 0x3F) << 10) + (local157 >> 5 << 7) + (local172 >> 1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!kj;)V")
	public static void method4161(@OriginalArg(1) Class11_Sub5_Sub2 arg0) {
		arg0.anInt7674 = 0;
		@Pc(22) Class109 local22;
		if (arg0.anInt7663 != -1) {
			local22 = Static37.aClass80_1.method1879(arg0.anInt7663);
			if (local22 == null || local22.anIntArray240 == null) {
				arg0.aBoolean514 = false;
				arg0.anInt7663 = -1;
			} else {
				label394: {
					arg0.anInt7647++;
					if (local22.anIntArray240.length > arg0.anInt7701 && arg0.anInt7647 > local22.anIntArray238[arg0.anInt7701]) {
						arg0.anInt7701++;
						arg0.anInt7657++;
						arg0.anInt7647 = 1;
						Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7701, local22, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
					}
					if (arg0.anInt7701 >= local22.anIntArray240.length) {
						arg0.anInt7647 = 0;
						arg0.anInt7701 = 0;
						if (arg0.aBoolean514) {
							arg0.anInt7663 = arg0.method6218().method2207();
							if (arg0.anInt7663 == -1) {
								arg0.aBoolean514 = false;
								break label394;
							}
							local22 = Static37.aClass80_1.method1879(arg0.anInt7663);
						}
						Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7701, local22, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
					}
					arg0.anInt7657 = arg0.anInt7701 + 1;
					if (arg0.anInt7657 >= local22.anIntArray240.length) {
						arg0.anInt7657 = 0;
					}
				}
			}
		}
		@Pc(178) int local178;
		@Pc(193) Class109 local193;
		@Pc(175) Class139 local175;
		if (arg0.anInt7667 != -1 && arg0.anInt7645 <= Static277.anInt5022) {
			local175 = Static399.aClass100_2.method2197(arg0.anInt7667);
			local178 = local175.anInt3448;
			if (local178 == -1) {
				arg0.anInt7667 = -1;
			} else {
				label396: {
					local193 = Static37.aClass80_1.method1879(local178);
					if (local175.aBoolean228) {
						if (local193.anInt2789 == 3) {
							if (arg0.anInt7705 > 0 && Static277.anInt5022 >= arg0.anInt7629 && arg0.anInt7669 < Static277.anInt5022) {
								arg0.anInt7667 = -1;
								break label396;
							}
						} else if (local193.anInt2789 == 1 && arg0.anInt7705 > 0 && Static277.anInt5022 >= arg0.anInt7629 && arg0.anInt7669 < Static277.anInt5022) {
							arg0.anInt7645 = Static277.anInt5022 + 1;
							break label396;
						}
					}
					if (local193 == null || local193.anIntArray240 == null) {
						arg0.anInt7667 = -1;
					} else {
						if (arg0.anInt7694 < 0) {
							arg0.anInt7694 = 0;
							Static245.method3411(Static127.aClass11_Sub5_Sub2_Sub1_2 == arg0, 0, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
						}
						arg0.anInt7683++;
						if (arg0.anInt7694 < local193.anIntArray240.length && local193.anIntArray238[arg0.anInt7694] < arg0.anInt7683) {
							arg0.anInt7683 = 1;
							arg0.anInt7694++;
							Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7694, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
						}
						if (arg0.anInt7694 >= local193.anIntArray240.length) {
							if (local175.aBoolean228) {
								arg0.anInt7694 -= local193.anInt2785;
								arg0.anInt7702++;
								if (arg0.anInt7702 >= local193.anInt2774) {
									arg0.anInt7667 = -1;
								} else if (arg0.anInt7694 >= 0 && local193.anIntArray240.length > arg0.anInt7694) {
									Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7694, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
								} else {
									arg0.anInt7667 = -1;
								}
							} else {
								arg0.anInt7667 = -1;
							}
						}
						arg0.anInt7703 = arg0.anInt7694 + 1;
						if (arg0.anInt7703 >= local193.anIntArray240.length) {
							if (local175.aBoolean228) {
								arg0.anInt7703 -= local193.anInt2785;
								if (local193.anInt2774 <= arg0.anInt7702 + 1) {
									arg0.anInt7703 = -1;
								} else if (arg0.anInt7703 < 0 || arg0.anInt7703 >= local193.anIntArray240.length) {
									arg0.anInt7703 = -1;
								}
							} else {
								arg0.anInt7703 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7633 != -1 && Static277.anInt5022 >= arg0.anInt7658) {
			local175 = Static399.aClass100_2.method2197(arg0.anInt7633);
			local178 = local175.anInt3448;
			if (local178 == -1) {
				arg0.anInt7633 = -1;
			} else {
				label399: {
					local193 = Static37.aClass80_1.method1879(local178);
					if (local175.aBoolean228) {
						if (local193.anInt2789 == 3) {
							if (arg0.anInt7705 > 0 && Static277.anInt5022 >= arg0.anInt7629 && Static277.anInt5022 > arg0.anInt7669) {
								arg0.anInt7633 = -1;
								break label399;
							}
						} else if (local193.anInt2789 == 1 && arg0.anInt7705 > 0 && arg0.anInt7629 <= Static277.anInt5022 && Static277.anInt5022 > arg0.anInt7669) {
							arg0.anInt7658 = Static277.anInt5022 + 1;
							break label399;
						}
					}
					if (local193 == null || local193.anIntArray240 == null) {
						arg0.anInt7633 = -1;
					} else {
						if (arg0.anInt7679 < 0) {
							arg0.anInt7679 = 0;
							Static245.method3411(Static127.aClass11_Sub5_Sub2_Sub1_2 == arg0, 0, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
						}
						arg0.anInt7655++;
						if (local193.anIntArray240.length > arg0.anInt7679 && arg0.anInt7655 > local193.anIntArray238[arg0.anInt7679]) {
							arg0.anInt7655 = 1;
							arg0.anInt7679++;
							Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7679, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
						}
						if (local193.anIntArray240.length <= arg0.anInt7679) {
							if (local175.aBoolean228) {
								arg0.anInt7653++;
								arg0.anInt7679 -= local193.anInt2785;
								if (local193.anInt2774 <= arg0.anInt7653) {
									arg0.anInt7633 = -1;
								} else if (arg0.anInt7679 >= 0 && local193.anIntArray240.length > arg0.anInt7679) {
									Static245.method3411(Static127.aClass11_Sub5_Sub2_Sub1_2 == arg0, arg0.anInt7679, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
								} else {
									arg0.anInt7633 = -1;
								}
							} else {
								arg0.anInt7633 = -1;
							}
						}
						arg0.anInt7666 = arg0.anInt7679 + 1;
						if (arg0.anInt7666 >= local193.anIntArray240.length) {
							if (local175.aBoolean228) {
								arg0.anInt7666 -= local193.anInt2785;
								if (arg0.anInt7653 + 1 >= local193.anInt2774) {
									arg0.anInt7666 = -1;
								} else if (arg0.anInt7666 < 0 || local193.anIntArray240.length <= arg0.anInt7666) {
									arg0.anInt7666 = -1;
								}
							} else {
								arg0.anInt7666 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7665 != -1 && arg0.anInt7662 <= 1) {
			local22 = Static37.aClass80_1.method1879(arg0.anInt7665);
			if (local22.anInt2789 == 3) {
				if (arg0.anInt7705 > 0 && arg0.anInt7629 <= Static277.anInt5022 && Static277.anInt5022 > arg0.anInt7669) {
					arg0.anInt7665 = -1;
				}
			} else if (local22.anInt2789 == 1 && arg0.anInt7705 > 0 && arg0.anInt7629 <= Static277.anInt5022 && Static277.anInt5022 > arg0.anInt7669) {
				arg0.anInt7662 = 2;
			}
		}
		if (arg0.anInt7665 != -1 && arg0.anInt7662 == 0) {
			local22 = Static37.aClass80_1.method1879(arg0.anInt7665);
			if (local22 == null || local22.anIntArray240 == null) {
				arg0.anInt7665 = -1;
			} else {
				arg0.anInt7654++;
				if (local22.anIntArray240.length > arg0.anInt7693 && arg0.anInt7654 > local22.anIntArray238[arg0.anInt7693]) {
					arg0.anInt7693++;
					arg0.anInt7654 = 1;
					Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7693, local22, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
				}
				if (local22.anIntArray240.length <= arg0.anInt7693) {
					arg0.anInt7693 -= local22.anInt2785;
					arg0.anInt7637++;
					if (local22.anInt2774 <= arg0.anInt7637) {
						arg0.anInt7665 = -1;
					} else if (arg0.anInt7693 >= 0 && arg0.anInt7693 < local22.anIntArray240.length) {
						Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7693, local22, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
					} else {
						arg0.anInt7665 = -1;
					}
				}
				arg0.anInt7704 = arg0.anInt7693 + 1;
				if (local22.anIntArray240.length <= arg0.anInt7704) {
					arg0.anInt7704 -= local22.anInt2785;
					if (local22.anInt2774 <= arg0.anInt7637 + 1) {
						arg0.anInt7704 = -1;
					} else if (arg0.anInt7704 < 0 || arg0.anInt7704 >= local22.anIntArray240.length) {
						arg0.anInt7704 = -1;
					}
				}
				arg0.anInt7674 = local22.anInt2773;
			}
		}
		if (arg0.anInt7662 > 0) {
			arg0.anInt7662--;
		}
		for (@Pc(1068) int local1068 = 0; local1068 < arg0.aClass92Array3.length; local1068++) {
			@Pc(1075) Class92 local1075 = arg0.aClass92Array3[local1068];
			if (local1075 != null) {
				if (local1075.anInt2198 > 0) {
					local1075.anInt2198--;
				} else {
					local193 = Static37.aClass80_1.method1879(local1075.anInt2199);
					if (local193 == null || local193.anIntArray240 == null) {
						arg0.aClass92Array3[local1068] = null;
					} else {
						local1075.anInt2193++;
						if (local193.anIntArray240.length > local1075.anInt2201 && local1075.anInt2193 > local193.anIntArray238[local1075.anInt2201]) {
							local1075.anInt2193 = 1;
							local1075.anInt2201++;
							Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, local1075.anInt2201, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
						}
						if (local193.anIntArray240.length <= local1075.anInt2201) {
							local1075.anInt2200++;
							local1075.anInt2201 -= local193.anInt2785;
							if (local193.anInt2774 <= local1075.anInt2200) {
								arg0.aClass92Array3[local1068] = null;
							} else if (local1075.anInt2201 >= 0 && local1075.anInt2201 < local193.anIntArray240.length) {
								Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, local1075.anInt2201, local193, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
							} else {
								arg0.aClass92Array3[local1068] = null;
							}
						}
						local1075.anInt2197 = local1075.anInt2201 + 1;
						if (local1075.anInt2197 >= local193.anIntArray240.length) {
							local1075.anInt2197 -= local193.anInt2785;
							if (local1075.anInt2200 + 1 >= local193.anInt2774) {
								local1075.anInt2197 = -1;
							} else if (local1075.anInt2197 < 0 || local1075.anInt2197 >= local193.anIntArray240.length) {
								local1075.anInt2197 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	public static void method4164() {
		Static316.aClass188_43.method4156();
	}
}
