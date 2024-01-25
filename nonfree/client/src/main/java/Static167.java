import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	public static int anInt3341;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	public static int anInt3342;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_37 = new Class109(8);

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_77 = new Class85("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(JZ)V")
	public static void method3036(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static348.anInt6696;
		@Pc(13) int local13 = Static213.anInt4128;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (local11 != Static8.anInt184) {
			local21 = local11 - Static8.anInt184;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local29 < local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local29 > local21) {
				local29 = local21;
			}
			Static8.anInt184 += local29;
		}
		if (local13 != Static311.anInt3611) {
			local21 = local13 - Static311.anInt3611;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local29 > local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local29 < local21) {
				local29 = local21;
			}
			Static311.anInt3611 += local29;
		}
		if (!Static131.aBoolean194) {
			Static164.aFloat24 += Static192.aFloat34 * (float) arg0 / 40.0F * 8.0F;
			Static29.aFloat7 += Static215.aFloat55 * (float) arg0 / 40.0F * 8.0F;
		}
		Static275.method4842();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBZIZ)V")
	public static void method3038(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static283.method4927(arg2, arg1, 0, arg3, arg0, Static241.aClass6_Sub1Array2.length - 1);
		Static168.anInt3378 = 0;
		Static128.aClass5_Sub40_3 = null;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	public static void method3039() {
		for (@Pc(12) Class5_Sub1_Sub7 local12 = (Class5_Sub1_Sub7) Static114.aClass103_56.method2756(); local12 != null; local12 = (Class5_Sub1_Sub7) Static114.aClass103_56.method2748()) {
			@Pc(22) Class4_Sub5_Sub3 local22 = local12.aClass4_Sub5_Sub3_1;
			if (Static239.anInt4811 != local22.aByte75 || Static283.anInt5563 > local22.anInt5273) {
				local12.method6005();
				local22.method4708();
			} else if (local22.anInt5270 <= Static283.anInt5563) {
				if (local22.anInt5256 > 0) {
					@Pc(65) Class4_Sub5_Sub2_Sub2 local65 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local22.anInt5256 - 1];
					if (local65 != null && local65.anInt6631 >= 0 && Static22.anInt481 * 128 > local65.anInt6631 && local65.anInt6632 >= 0 && local65.anInt6632 < Static269.anInt5281 * 128) {
						local22.method4705(local65.anInt6632, local65.anInt6631, Static208.method3804(local22.aByte75, local65.anInt6631, local65.anInt6632) - local22.anInt5257, Static283.anInt5563);
					}
				}
				if (local22.anInt5256 < 0) {
					@Pc(119) int local119 = -local22.anInt5256 - 1;
					@Pc(130) Class4_Sub5_Sub2_Sub1 local130;
					if (local119 == Static166.anInt3304) {
						local130 = Static192.aClass4_Sub5_Sub2_Sub1_2;
					} else {
						local130 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local119];
					}
					if (local130 != null && local130.anInt6631 >= 0 && local130.anInt6631 < Static22.anInt481 * 128 && local130.anInt6632 >= 0 && local130.anInt6632 < Static269.anInt5281 * 128) {
						local22.method4705(local130.anInt6632, local130.anInt6631, Static208.method3804(local22.aByte75, local130.anInt6631, local130.anInt6632) - local22.anInt5257, Static283.anInt5563);
					}
				}
				local22.method4709(Static26.anInt519);
				Static78.method1418(local22, true);
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLclient!rd;)V")
	public static void method3040(@OriginalArg(1) Class4_Sub5_Sub2_Sub2 arg0) {
		if (Static160.anInt3181 >= 400) {
			return;
		}
		@Pc(18) Class106 local18 = arg0.aClass106_1;
		if (local18.anIntArray326 != null) {
			local18 = local18.method2829();
			if (local18 == null) {
				return;
			}
		}
		if (!local18.aBoolean241) {
			return;
		}
		@Pc(35) String local35 = local18.aString19;
		if (local18.anInt3158 != 0) {
			@Pc(56) String local56 = Static111.anInt2077 == 1 ? Static235.aClass85_107.method2020(Static41.anInt726) : Static160.aClass85_74.method2020(Static41.anInt726);
			local35 = local35 + Static318.method5545(Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566, local18.anInt3158) + " (" + local56 + local18.anInt3158 + ")";
		}
		if (Static54.aBoolean72) {
			@Pc(91) Class5_Sub1_Sub17 local91 = Static280.anInt5514 == -1 ? null : Static86.method1559(Static280.anInt5514);
			if ((Static5.anInt93 & 0x2) != 0) {
				if (local91 == null || local18.method2825(local91.anInt5597, Static280.anInt5514) != local91.anInt5597) {
					Static30.method540(Static255.aString49, 44, 0, (long) arg0.anInt5386, 0, Static169.anInt6216, Static230.aString42 + " -> <col=ffff00>" + local35);
				}
				return;
			}
			return;
		}
		@Pc(137) String[] local137 = local18.aStringArray40;
		if (Static3.aBoolean574) {
			local137 = Static209.method3854(local137);
		}
		@Pc(147) int local147;
		if (local137 != null) {
			for (local147 = 4; local147 >= 0; local147--) {
				if (local137[local147] != null && (Static111.anInt2077 != 0 || !local137[local147].equalsIgnoreCase(Static313.aClass85_129.method2020(Static41.anInt726)))) {
					@Pc(169) byte local169 = 0;
					@Pc(171) int local171 = Static314.anInt6099;
					if (local147 == 0) {
						local169 = 49;
					}
					if (local147 == 1) {
						local169 = 18;
					}
					if (local147 == 2) {
						local169 = 10;
					}
					if (local147 == 3) {
						local169 = 47;
					}
					if (local147 == local18.anInt3159) {
						local171 = local18.anInt3148;
					}
					if (local147 == 4) {
						local169 = 4;
					}
					if (local18.anInt3134 == local147) {
						local171 = local18.anInt3150;
					}
					Static30.method540(local137[local147], local169, 0, (long) arg0.anInt5386, 0, local171, "<col=ffff00>" + local35);
				}
			}
		}
		if (Static111.anInt2077 == 0 && local137 != null) {
			for (local147 = 4; local147 >= 0; local147--) {
				if (local137[local147] != null && local137[local147].equalsIgnoreCase(Static313.aClass85_129.method2020(Static41.anInt726))) {
					@Pc(267) short local267 = 0;
					if (local18.anInt3158 > Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566) {
						local267 = 2000;
					}
					@Pc(280) short local280 = 0;
					if (local147 == 0) {
						local280 = 49;
					}
					if (local147 == 1) {
						local280 = 18;
					}
					if (local147 == 2) {
						local280 = 10;
					}
					if (local147 == 3) {
						local280 = 47;
					}
					if (local147 == 4) {
						local280 = 4;
					}
					if (local280 != 0) {
						local280 += local267;
					}
					Static30.method540(local137[local147], local280, 0, (long) arg0.anInt5386, 0, local18.anInt3162, "<col=ffff00>" + local35);
				}
			}
		}
		Static30.method540(Static138.aClass85_66.method2020(Static41.anInt726), 1006, 0, (long) arg0.anInt5386, 0, Static51.anInt965, "<col=ffff00>" + local35);
	}
}
