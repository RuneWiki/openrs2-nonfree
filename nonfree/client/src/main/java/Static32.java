import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_11 = new Class241(67, -1);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I")
	public static int method420(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method421(@OriginalArg(0) Class75 arg0) {
		if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 != Static494.anInt4033 && (Static334.aClass243ArrayArrayArray2 != null && Static9.method119(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, arg0))) {
			Static494.anInt4033 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILclient!eea;)V")
	public static void method422(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub15_Sub1 arg1) {
		@Pc(18) boolean local18 = arg1.method2468(1) == 1;
		if (local18) {
			Static604.anIntArray620[Static27.anInt372++] = arg0;
		}
		@Pc(35) int local35 = arg1.method2468(2);
		@Pc(39) Class60_Sub1_Sub1_Sub3_Sub1 local39 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[arg0];
		if (local35 != 0) {
			@Pc(168) int local168;
			@Pc(173) int local173;
			@Pc(178) int local178;
			if (local35 == 1) {
				local168 = arg1.method2468(3);
				local173 = local39.anIntArray263[0];
				local178 = local39.anIntArray264[0];
				if (local168 == 0) {
					local173--;
					local178--;
				} else if (local168 == 1) {
					local178--;
				} else if (local168 == 2) {
					local178--;
					local173++;
				} else if (local168 == 3) {
					local173--;
				} else if (local168 == 4) {
					local173++;
				} else if (local168 == 5) {
					local173--;
					local178++;
				} else if (local168 == 6) {
					local178++;
				} else if (local168 == 7) {
					local173++;
					local178++;
				}
				if (local18) {
					local39.anInt2839 = local173;
					local39.aBoolean228 = true;
					local39.anInt2840 = local178;
				} else {
					local39.method2705(local178, local173, Static27.aByteArray4[arg0]);
				}
			} else if (local35 == 2) {
				local168 = arg1.method2468(4);
				local173 = local39.anIntArray263[0];
				local178 = local39.anIntArray264[0];
				if (local168 == 0) {
					local178 -= 2;
					local173 -= 2;
				} else if (local168 == 1) {
					local178 -= 2;
					local173--;
				} else if (local168 == 2) {
					local178 -= 2;
				} else if (local168 == 3) {
					local178 -= 2;
					local173++;
				} else if (local168 == 4) {
					local173 += 2;
					local178 -= 2;
				} else if (local168 == 5) {
					local173 -= 2;
					local178--;
				} else if (local168 == 6) {
					local173 += 2;
					local178--;
				} else if (local168 == 7) {
					local173 -= 2;
				} else if (local168 == 8) {
					local173 += 2;
				} else if (local168 == 9) {
					local178++;
					local173 -= 2;
				} else if (local168 == 10) {
					local173 += 2;
					local178++;
				} else if (local168 == 11) {
					local178 += 2;
					local173 -= 2;
				} else if (local168 == 12) {
					local173--;
					local178 += 2;
				} else if (local168 == 13) {
					local178 += 2;
				} else if (local168 == 14) {
					local173++;
					local178 += 2;
				} else if (local168 == 15) {
					local173 += 2;
					local178 += 2;
				}
				if (local18) {
					local39.anInt2839 = local173;
					local39.anInt2840 = local178;
					local39.aBoolean228 = true;
				} else {
					local39.method2705(local178, local173, Static27.aByteArray4[arg0]);
				}
			} else {
				local168 = arg1.method2468(1);
				@Pc(547) int local547;
				@Pc(557) int local557;
				@Pc(573) int local573;
				@Pc(580) int local580;
				if (local168 == 0) {
					local173 = arg1.method2468(12);
					local178 = local173 >> 10;
					local547 = local173 >> 5 & 0x1F;
					if (local547 > 15) {
						local547 -= 32;
					}
					local557 = local173 & 0x1F;
					if (local557 > 15) {
						local557 -= 32;
					}
					local573 = local39.anIntArray263[0] + local547;
					local580 = local39.anIntArray264[0] + local557;
					if (local18) {
						local39.anInt2840 = local580;
						local39.aBoolean228 = true;
						local39.anInt2839 = local573;
					} else {
						local39.method2705(local580, local573, Static27.aByteArray4[arg0]);
					}
					local39.aByte135 = local39.aByte134 = (byte) (local39.aByte135 + local178 & 0x3);
					if (Static180.method3417(1, local573, local580)) {
						local39.aByte134++;
					}
					if (Static503.anInt8407 == arg0) {
						if (Static504.anInt8428 != local39.aByte135) {
							Static429.aBoolean549 = true;
						}
						Static504.anInt8428 = local39.aByte135;
					}
				} else {
					local173 = arg1.method2468(30);
					local178 = local173 >> 28;
					local547 = local173 >> 14 & 0x3FFF;
					local557 = local173 & 0x3FFF;
					local573 = (local39.anIntArray263[0] + Static50.anInt606 + local547 & 0x3FFF) - Static50.anInt606;
					local580 = (local557 + Static404.anInt7039 + local39.anIntArray264[0] & 0x3FFF) - Static404.anInt7039;
					if (local18) {
						local39.anInt2839 = local573;
						local39.anInt2840 = local580;
						local39.aBoolean228 = true;
					} else {
						local39.method2705(local580, local573, Static27.aByteArray4[arg0]);
					}
					local39.aByte135 = local39.aByte134 = (byte) (local39.aByte135 + local178 & 0x3);
					if (Static180.method3417(1, local573, local580)) {
						local39.aByte134++;
					}
					if (arg0 == Static503.anInt8407) {
						Static504.anInt8428 = local39.aByte135;
					}
				}
			}
		} else if (local18) {
			local39.aBoolean228 = false;
		} else if (Static503.anInt8407 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(69) Class353 local69 = Static395.aClass353Array1[arg0] = new Class353();
			local69.anInt9537 = (local39.anIntArray264[0] + Static404.anInt7039 >> 6) + (local39.anIntArray263[0] + Static50.anInt606 >> 6 << 14) + (local39.aByte135 << 28);
			if (local39.anInt2853 == -1) {
				local69.anInt9540 = local39.aClass258_7.method6285(16383);
			} else {
				local69.anInt9540 = local39.anInt2853;
			}
			local69.anInt9538 = local39.anInt4858;
			local69.aBoolean710 = local39.aBoolean226;
			local69.aBoolean711 = local39.aBoolean227;
			if (local39.anInt2862 > 0) {
				Static369.method5575(local39);
			}
			Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[arg0] = null;
			if (arg1.method2468(1) != 0) {
				Static511.method7381(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIII)V")
	public static void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static223.anInt4380 < arg3 || arg4 < Static605.anInt9561) {
			return;
		}
		@Pc(37) boolean local37;
		if (Static398.anInt6878 > arg0) {
			arg0 = Static398.anInt6878;
			local37 = false;
		} else if (arg0 <= Static8.anInt136) {
			local37 = true;
		} else {
			local37 = false;
			arg0 = Static8.anInt136;
		}
		@Pc(58) boolean local58;
		if (arg1 < Static398.anInt6878) {
			local58 = false;
			arg1 = Static398.anInt6878;
		} else if (arg1 > Static8.anInt136) {
			arg1 = Static8.anInt136;
			local58 = false;
		} else {
			local58 = true;
		}
		if (arg3 < Static605.anInt9561) {
			arg3 = Static605.anInt9561;
		} else {
			Static367.method5559(-7, arg0, arg2, Static36.anIntArrayArray4[arg3++], arg1);
		}
		if (arg4 <= Static223.anInt4380) {
			Static367.method5559(-7, arg0, arg2, Static36.anIntArrayArray4[arg4--], arg1);
		} else {
			arg4 = Static223.anInt4380;
		}
		@Pc(123) int local123;
		if (local37 && local58) {
			for (local123 = arg3; local123 <= arg4; local123++) {
				@Pc(129) int[] local129 = Static36.anIntArrayArray4[local123];
				local129[arg0] = local129[arg1] = arg2;
			}
		} else if (local37) {
			for (local123 = arg3; local123 <= arg4; local123++) {
				Static36.anIntArrayArray4[local123][arg0] = arg2;
			}
		} else if (local58) {
			for (local123 = arg3; local123 <= arg4; local123++) {
				Static36.anIntArrayArray4[local123][arg1] = arg2;
			}
		}
	}
}
