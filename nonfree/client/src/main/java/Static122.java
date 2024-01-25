import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!nd;")
	public static Class238 aClass238_58;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt2592;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V")
	public static void method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static640.anInt10333 || Static346.anInt5494 > arg2) {
			return;
		}
		@Pc(23) boolean local23;
		if (Static566.anInt9279 > arg3) {
			local23 = false;
			arg3 = Static566.anInt9279;
		} else if (arg3 <= Static392.anInt6753) {
			local23 = true;
		} else {
			local23 = false;
			arg3 = Static392.anInt6753;
		}
		@Pc(42) boolean local42;
		if (Static566.anInt9279 > arg0) {
			arg0 = Static566.anInt9279;
			local42 = false;
		} else if (Static392.anInt6753 < arg0) {
			arg0 = Static392.anInt6753;
			local42 = false;
		} else {
			local42 = true;
		}
		if (Static346.anInt5494 > arg4) {
			arg4 = Static346.anInt5494;
		} else {
			Static188.method3208(arg0, arg1, arg3, Static349.anIntArrayArray71[arg4++]);
		}
		if (Static640.anInt10333 < arg2) {
			arg2 = Static640.anInt10333;
		} else {
			Static188.method3208(arg0, arg1, arg3, Static349.anIntArrayArray71[arg2--]);
		}
		@Pc(103) int local103;
		if (local23 && local42) {
			for (local103 = arg4; local103 <= arg2; local103++) {
				@Pc(149) int[] local149 = Static349.anIntArrayArray71[local103];
				local149[arg3] = local149[arg0] = arg1;
			}
		} else if (local23) {
			for (local103 = arg4; local103 <= arg2; local103++) {
				Static349.anIntArrayArray71[local103][arg3] = arg1;
			}
		} else if (local42) {
			for (local103 = arg4; local103 <= arg2; local103++) {
				Static349.anIntArrayArray71[local103][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!cs;ILclient!ha;IILclient!up;)Z")
	public static boolean method2200(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(5) Class353 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		@Pc(9) int local9 = Integer.MAX_VALUE;
		@Pc(11) int local11 = Integer.MIN_VALUE;
		if (arg2.anIntArray691 != null) {
			local11 = Static371.anInt9386 - (Static371.anInt9386 - Static371.anInt9387) * (-Static371.anInt9381 + arg2.anInt9806 - -arg0.anInt2178) / (Static371.anInt9383 - Static371.anInt9381);
			local7 = (arg2.anInt9824 + arg0.anInt2183 - Static371.anInt9380) * (Static371.anInt9388 - Static371.anInt9391) / (Static371.anInt9389 - Static371.anInt9380) + Static371.anInt9391;
			local5 = (arg0.anInt2183 + arg2.anInt9790 - Static371.anInt9380) * (Static371.anInt9388 - Static371.anInt9391) / (Static371.anInt9389 - Static371.anInt9380) + Static371.anInt9391;
			local9 = Static371.anInt9386 - (arg0.anInt2178 + arg2.anInt9793 - Static371.anInt9381) * (Static371.anInt9386 - Static371.anInt9387) / (Static371.anInt9383 - Static371.anInt9381);
		}
		@Pc(97) Class31 local97 = null;
		@Pc(99) int local99 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg2.anInt9818 != -1) {
			if (arg0.aBoolean182 && arg2.anInt9819 != -1) {
				local97 = arg2.method8338(true, arg1);
			} else {
				local97 = arg2.method8338(false, arg1);
			}
			if (local97 != null) {
				local99 = arg0.anInt2181 - (local97.method8788() + 1 >> 1);
				if (local5 > local99) {
					local5 = local99;
				}
				local112 = arg0.anInt2181 + (local97.method8788() + 1 >> 1);
				local114 = arg0.anInt2180 - (local97.method8807() + 1 >> 1);
				if (local7 < local112) {
					local7 = local112;
				}
				local116 = arg0.anInt2180 + (local97.method8807() + 1 >> 1);
				if (local9 > local114) {
					local9 = local114;
				}
				if (local116 > local11) {
					local11 = local116;
				}
			}
		}
		@Pc(220) Class63 local220 = null;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(315) int local315;
		if (arg2.aString100 != null) {
			local220 = Static522.method7263(arg2.anInt9795);
			if (local220 != null) {
				local222 = Static539.aClass183_11.method4458(arg2.aString100, Static53.aStringArray3, (int[]) null, (Class31[]) null);
				local224 = arg0.anInt2181 + arg2.anInt9807 * (Static371.anInt9388 - Static371.anInt9391) / (Static371.anInt9389 - Static371.anInt9380);
				local226 = arg0.anInt2180 - (Static371.anInt9386 - Static371.anInt9387) * arg2.anInt9786 / (Static371.anInt9383 - Static371.anInt9381);
				if (local97 == null) {
					local226 -= local220.method1822() * local222 / 2;
				} else {
					local226 -= (local97.method8807() >> 1) + (local222 * local220.method1824());
				}
				for (local315 = 0; local315 < local222; local315++) {
					@Pc(320) String local320 = Static53.aStringArray3[local315];
					if (local315 < local222 - 1) {
						local320 = local320.substring(0, local320.length() - 4);
					}
					@Pc(337) int local337 = local220.method1823(local320);
					if (local337 > local228) {
						local228 = local337;
					}
				}
				local230 = local224 - local228 / 2;
				if (local5 > local230) {
					local5 = local230;
				}
				local232 = local228 / 2 + local224;
				local234 = local226;
				if (local7 < local232) {
					local7 = local232;
				}
				local236 = local226 + local222 * local220.method1824();
				if (local234 < local9) {
					local9 = local234;
				}
				if (local11 < local236) {
					local11 = local236;
				}
			}
		}
		if (Static371.anInt9391 > local7 || Static371.anInt9388 < local5 || Static371.anInt9387 > local11 || Static371.anInt9386 < local9) {
			return true;
		}
		Static371.method7979(arg1, arg0, arg2);
		if (local97 != null) {
			if (Static648.anInt10477 > 0 && (Static286.anInt5207 != -1 && arg0.anInt2179 == Static286.anInt5207 || Static50.anInt1296 != -1 && arg2.anInt9797 == Static50.anInt1296)) {
				if (Static14.anInt274 > 50) {
					local315 = 200 - Static14.anInt274 * 2;
				} else {
					local315 = Static14.anInt274 * 2;
				}
				@Pc(485) int local485 = local315 << 24 | 0xFFFF00;
				arg1.method8095(arg0.anInt2180, arg0.anInt2181, local97.method8801() / 2 + 7, local485);
				arg1.method8095(arg0.anInt2180, arg0.anInt2181, local97.method8801() / 2 + 5, local485);
				arg1.method8095(arg0.anInt2180, arg0.anInt2181, local97.method8801() / 2 + 3, local485);
				arg1.method8095(arg0.anInt2180, arg0.anInt2181, local97.method8801() / 2 + 1, local485);
				arg1.method8095(arg0.anInt2180, arg0.anInt2181, local97.method8801() / 2, local485);
			}
			local97.method8793(arg0.anInt2181 - (local97.method8788() >> 1), arg0.anInt2180 + -(local97.method8807() >> 1));
		}
		if (arg2.aString100 != null && local220 != null) {
			Static270.method4446(arg0, local224, arg2, local220, local228, arg1, local226, local222);
		}
		if (arg2.anInt9818 != -1 || arg2.aString100 != null) {
			@Pc(598) Class2_Sub35 local598 = new Class2_Sub35(arg0);
			local598.anInt7247 = local236;
			local598.anInt7252 = local116;
			local598.anInt7248 = local99;
			local598.anInt7253 = local112;
			local598.anInt7245 = local114;
			local598.anInt7244 = local230;
			local598.anInt7243 = local234;
			local598.anInt7246 = local232;
			Static435.aClass114_38.method2771(local598);
		}
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[BZIII)Z")
	public static boolean method2201(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class2_Sub17 local17 = new Class2_Sub17(arg1);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method2880();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method2853();
					if (local42 == 0) {
						continue label56;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method2859() >> 2;
					@Pc(85) int local85 = local75 + arg4;
					@Pc(90) int local90 = local69 + arg2;
					if (local85 > 0 && local90 > 0 && local85 < arg0 - 1 && arg3 - 1 > local90) {
						@Pc(116) Class5 local116 = Static79.aClass304_2.method6956(local19);
						if (local81 != 22 || Static305.aClass2_Sub49_15.aClass33_Sub21_1.method5680() != 0 || local116.anInt81 != 0 || local116.anInt102 == 1 || local116.aBoolean2) {
							if (!local116.method82()) {
								local12 = false;
								Static417.anInt6986++;
							}
							local36 = true;
						}
					}
				}
				local42 = local17.method2853();
				if (local42 == 0) {
					break;
				}
				local17.method2859();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!nd;II)Lclient!ef;")
	public static Class2_Sub7_Sub3 method2203(@OriginalArg(1) Class238 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub17 local16 = new Class2_Sub17(arg0.method5567(arg2, arg1));
		@Pc(49) Class2_Sub7_Sub3 local49 = new Class2_Sub7_Sub3(arg2, local16.method2833(), local16.method2833(), local16.method2881(), local16.method2881(), local16.method2859() == 1, local16.method2859(), local16.method2859());
		@Pc(53) int local53 = local16.method2859();
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local49.aClass114_15.method2771(new Class2_Sub6(local16.method2859(), local16.method2825(), local16.method2825(), local16.method2825(), local16.method2825(), local16.method2825(), local16.method2825(), local16.method2825(), local16.method2825()));
		}
		local49.method2289();
		return local49;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZII)I")
	public static int method2204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
