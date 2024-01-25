import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!st", name = "M", descriptor = "[I")
	public static final int[] anIntArray637 = new int[13];

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(II)Lclient!waa;")
	public static Class373 method7397(@OriginalArg(1) int arg0) {
		@Pc(10) Class373[] local10 = Static517.method7186();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class373 local18 = local10[local12];
			if (arg0 == local18.anInt10187) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(III)Z")
	public static boolean method7398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIII)I")
	public static int method7399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class290.anIntArray547[arg2 * 8192 / arg0] >> 1;
		return (arg1 * local16 >> 16) + (arg3 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!km;IIBII)V")
	public static void method7400(@OriginalArg(0) Class2_Sub27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt5417 == -1 && arg0.anIntArray344 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(29) int local29 = arg0.anInt5412 * Static305.aClass2_Sub49_15.aClass33_Sub9_1.method3103() >> 8;
		if (arg3 > arg0.anInt5415) {
			local15 = arg3 - arg0.anInt5415;
		} else if (arg0.anInt5404 > arg3) {
			local15 = arg0.anInt5404 - arg3;
		}
		if (arg0.anInt5409 < arg1) {
			local15 += arg1 - arg0.anInt5409;
		} else if (arg1 < arg0.anInt5408) {
			local15 += arg0.anInt5408 - arg1;
		}
		if (arg0.anInt5403 == 0 || local15 - 256 > arg0.anInt5403 || Static305.aClass2_Sub49_15.aClass33_Sub9_1.method3103() == 0 || arg0.anInt5418 != arg2) {
			if (arg0.aClass2_Sub11_Sub4_3 != null) {
				Static622.aClass2_Sub11_Sub2_2.method2950(arg0.aClass2_Sub11_Sub4_3);
				arg0.aClass2_Sub38_1 = null;
				arg0.aClass2_Sub11_Sub4_3 = null;
				arg0.aClass2_Sub14_Sub1_2 = null;
			}
			if (arg0.aClass2_Sub11_Sub4_2 != null) {
				Static622.aClass2_Sub11_Sub2_2.method2950(arg0.aClass2_Sub11_Sub4_2);
				arg0.aClass2_Sub38_2 = null;
				arg0.aClass2_Sub11_Sub4_2 = null;
				arg0.aClass2_Sub14_Sub1_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(161) int local161 = arg0.anInt5403 - arg0.anInt5402;
		if (local161 < 0) {
			local161 = arg0.anInt5403;
		}
		@Pc(171) int local171 = local29;
		@Pc(177) int local177 = local15 - arg0.anInt5402;
		if (local177 > 0 && local161 > 0) {
			local171 = (local161 - local177) * local29 / local161;
		}
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999();
		@Pc(195) int local195 = 8192;
		@Pc(206) int local206 = (arg0.anInt5415 + arg0.anInt5404) / 2 - arg3;
		@Pc(216) int local216 = (arg0.anInt5408 + arg0.anInt5409) / 2 - arg1;
		@Pc(237) int local237;
		@Pc(260) int local260;
		if (local206 != 0 || local216 != 0) {
			local237 = -Static400.anInt7896 - (int) (Math.atan2((double) local206, (double) local216) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local237 > 8192) {
				local237 = 16384 - local237;
			}
			if (local15 <= 0) {
				local260 = 8192;
			} else if (local15 < 4096) {
				local260 = local15 * 8192 / 4096 + 8192;
			} else {
				local260 = 16384;
			}
			local195 = (16384 - local260 >> 1) + local237 * local260 / 8192;
		}
		@Pc(347) Class2_Sub11_Sub4 local347;
		if (arg0.aClass2_Sub11_Sub4_3 != null) {
			arg0.aClass2_Sub11_Sub4_3.method3333(local171);
			arg0.aClass2_Sub11_Sub4_3.method3336(local195);
		} else if (arg0.anInt5417 >= 0) {
			local237 = arg0.anInt5419 == 256 && arg0.anInt5406 == 256 ? 256 : Static167.method2914(arg0.anInt5419, arg0.anInt5406);
			if (arg0.aBoolean402) {
				if (arg0.aClass2_Sub38_1 == null) {
					arg0.aClass2_Sub38_1 = Static504.method7034(Static441.aClass238_203, arg0.anInt5417);
				}
				if (arg0.aClass2_Sub38_1 != null) {
					if (arg0.aClass2_Sub14_Sub1_2 == null) {
						arg0.aClass2_Sub14_Sub1_2 = arg0.aClass2_Sub38_1.method7032(new int[] { 22050 });
					}
					if (arg0.aClass2_Sub14_Sub1_2 != null) {
						local347 = Static653.method3343(arg0.aClass2_Sub14_Sub1_2, local237, local171 << 6, local195);
						local347.method3341(-1);
						Static622.aClass2_Sub11_Sub2_2.method2952(local347);
						arg0.aClass2_Sub11_Sub4_3 = local347;
					}
				}
			} else {
				@Pc(364) Class134 local364 = Static652.method3295(Static75.aClass238_236, arg0.anInt5417, 0);
				if (local364 != null) {
					@Pc(371) Class2_Sub14_Sub1 local371 = local364.method3296().method1819(Static311.aClass276_3);
					@Pc(379) Class2_Sub11_Sub4 local379 = Static653.method3343(local371, local237, local171 << 6, local195);
					local379.method3341(-1);
					Static622.aClass2_Sub11_Sub2_2.method2952(local379);
					arg0.aClass2_Sub11_Sub4_3 = local379;
				}
			}
		}
		if (arg0.aClass2_Sub11_Sub4_2 != null) {
			arg0.aClass2_Sub11_Sub4_2.method3333(local171);
			arg0.aClass2_Sub11_Sub4_2.method3336(local195);
			if (arg0.aClass2_Sub11_Sub4_2.method8921()) {
				return;
			}
			arg0.aClass2_Sub38_2 = null;
			arg0.aClass2_Sub11_Sub4_2 = null;
			arg0.aClass2_Sub14_Sub1_3 = null;
		} else if (arg0.anIntArray344 != null && (arg0.anInt5414 -= arg4) <= 0) {
			local237 = arg0.anInt5419 == 256 && arg0.anInt5406 == 256 ? 256 : (int) ((double) (arg0.anInt5419 - arg0.anInt5406) * Math.random()) + arg0.anInt5406;
			if (!arg0.aBoolean400) {
				local260 = (int) ((double) arg0.anIntArray344.length * Math.random());
				@Pc(455) Class134 local455 = Static652.method3295(Static75.aClass238_236, arg0.anIntArray344[local260], 0);
				if (local455 != null) {
					@Pc(462) Class2_Sub14_Sub1 local462 = local455.method3296().method1819(Static311.aClass276_3);
					@Pc(470) Class2_Sub11_Sub4 local470 = Static653.method3343(local462, local237, local171 << 6, local195);
					local470.method3341(0);
					Static622.aClass2_Sub11_Sub2_2.method2952(local470);
					arg0.anInt5414 = (int) ((double) (arg0.anInt5407 - arg0.anInt5413) * Math.random()) + arg0.anInt5413;
					arg0.aClass2_Sub11_Sub4_2 = local470;
					return;
				}
				return;
			}
			if (arg0.aClass2_Sub38_2 == null) {
				local260 = (int) (Math.random() * (double) arg0.anIntArray344.length);
				arg0.aClass2_Sub38_2 = Static504.method7034(Static441.aClass238_203, arg0.anIntArray344[local260]);
			}
			if (arg0.aClass2_Sub38_2 != null) {
				if (arg0.aClass2_Sub14_Sub1_3 == null) {
					arg0.aClass2_Sub14_Sub1_3 = arg0.aClass2_Sub38_2.method7032(new int[] { 22050 });
				}
				if (arg0.aClass2_Sub14_Sub1_3 != null) {
					local347 = Static653.method3343(arg0.aClass2_Sub14_Sub1_3, local237, local171 << 6, local195);
					local347.method3341(0);
					Static622.aClass2_Sub11_Sub2_2.method2952(local347);
					arg0.aClass2_Sub11_Sub4_2 = local347;
					arg0.anInt5414 = (int) (Math.random() * (double) (arg0.anInt5407 - arg0.anInt5413)) + arg0.anInt5413;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IILclient!ha;Lclient!cu;)V")
	public static void method7402(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(16) int local16;
		if (Static456.anIntArray507 != null && arg0 <= arg2.aByte39) {
			for (local16 = 0; local16 < Static456.anIntArray507.length; local16++) {
				if (Static456.anIntArray507[local16] != -1000000 && (arg2.anIntArray156[0] <= Static456.anIntArray507[local16] || arg2.anIntArray156[1] <= Static456.anIntArray507[local16] || arg2.anIntArray156[2] <= Static456.anIntArray507[local16] || Static456.anIntArray507[local16] >= arg2.anIntArray156[3]) && (Static425.anIntArray474[local16] >= arg2.anIntArray155[0] || arg2.anIntArray155[1] <= Static425.anIntArray474[local16] || arg2.anIntArray155[2] <= Static425.anIntArray474[local16] || arg2.anIntArray155[3] <= Static425.anIntArray474[local16]) && (Static602.anIntArray703[local16] <= arg2.anIntArray155[0] || Static602.anIntArray703[local16] <= arg2.anIntArray155[1] || Static602.anIntArray703[local16] <= arg2.anIntArray155[2] || arg2.anIntArray155[3] >= Static602.anIntArray703[local16]) && (Static619.anIntArray713[local16] >= arg2.anIntArray157[0] || arg2.anIntArray157[1] <= Static619.anIntArray713[local16] || Static619.anIntArray713[local16] >= arg2.anIntArray157[2] || arg2.anIntArray157[3] <= Static619.anIntArray713[local16]) && (Static72.anIntArray144[local16] <= arg2.anIntArray157[0] || arg2.anIntArray157[1] >= Static72.anIntArray144[local16] || arg2.anIntArray157[2] >= Static72.anIntArray144[local16] || Static72.anIntArray144[local16] <= arg2.anIntArray157[3])) {
					return;
				}
			}
		}
		@Pc(277) int local277;
		@Pc(299) int local299;
		@Pc(320) boolean local320;
		@Pc(352) float local352;
		if (arg2.aByte40 == 1) {
			local16 = arg2.aShort40 + Static621.anInt10151 - Static636.anInt10301;
			if (local16 >= 0 && Static621.anInt10151 + Static621.anInt10151 >= local16) {
				local277 = arg2.aShort38 + Static621.anInt10151 - Static66.anInt1803;
				if (local277 < 0) {
					local277 = 0;
				} else if (Static621.anInt10151 + Static621.anInt10151 < local277) {
					return;
				}
				local299 = Static621.anInt10151 + arg2.aShort39 - Static66.anInt1803;
				if (local299 > Static621.anInt10151 + Static621.anInt10151) {
					local299 = Static621.anInt10151 + Static621.anInt10151;
				} else if (local299 < 0) {
					return;
				}
				local320 = false;
				while (local299 >= local277) {
					if (Static447.aBooleanArrayArray9[local16][local277++]) {
						local320 = true;
						break;
					}
				}
				if (local320) {
					local352 = (float) (Static274.anInt5086 - arg2.anIntArray155[0]);
					if (local352 < 0.0F) {
						local352 *= -1.0F;
					}
					if (!local352 < (float) Static129.anInt2699 && (Static535.method7425(0, arg2) && (Static535.method7425(1, arg2) && (Static535.method7425(2, arg2) && Static535.method7425(3, arg2))))) {
						Static342.aClass62Array2[Static449.anInt7349++] = arg2;
					}
				}
			}
		} else if (arg2.aByte40 == 2) {
			local16 = arg2.aShort38 + Static621.anInt10151 - Static66.anInt1803;
			if (local16 >= 0 && Static621.anInt10151 + Static621.anInt10151 >= local16) {
				local277 = arg2.aShort40 + Static621.anInt10151 - Static636.anInt10301;
				if (local277 < 0) {
					local277 = 0;
				} else if (Static621.anInt10151 + Static621.anInt10151 < local277) {
					return;
				}
				local299 = arg2.aShort41 + Static621.anInt10151 - Static636.anInt10301;
				if (Static621.anInt10151 + Static621.anInt10151 < local299) {
					local299 = Static621.anInt10151 + Static621.anInt10151;
				} else if (local299 < 0) {
					return;
				}
				local320 = false;
				while (local277 <= local299) {
					if (Static447.aBooleanArrayArray9[local277++][local16]) {
						local320 = true;
						break;
					}
				}
				if (local320) {
					local352 = (float) (Static372.anInt6422 - arg2.anIntArray157[0]);
					if (local352 < 0.0F) {
						local352 *= -1.0F;
					}
					if (!((float) Static129.anInt2699 > local352) && (Static535.method7425(0, arg2) && (Static535.method7425(1, arg2) && (Static535.method7425(2, arg2) && Static535.method7425(3, arg2))))) {
						Static342.aClass62Array2[Static449.anInt7349++] = arg2;
					}
				}
			}
		} else if (arg2.aByte40 == 16 || arg2.aByte40 == 8) {
			local16 = Static621.anInt10151 + arg2.aShort40 - Static636.anInt10301;
			if (local16 >= 0 && Static621.anInt10151 + Static621.anInt10151 >= local16) {
				local277 = Static621.anInt10151 + arg2.aShort38 - Static66.anInt1803;
				if (local277 >= 0 && local277 <= Static621.anInt10151 + Static621.anInt10151 && Static447.aBooleanArrayArray9[local16][local277]) {
					@Pc(630) float local630 = (float) (Static274.anInt5086 - arg2.anIntArray155[0]);
					if (local630 < 0.0F) {
						local630 *= -1.0F;
					}
					@Pc(647) float local647 = (float) (Static372.anInt6422 - arg2.anIntArray157[0]);
					if (local647 < 0.0F) {
						local647 *= -1.0F;
					}
					if ((!(local630 < (float) Static129.anInt2699) || !((float) Static129.anInt2699 > local647)) && (Static535.method7425(0, arg2) && (Static535.method7425(1, arg2) && (Static535.method7425(2, arg2) && Static535.method7425(3, arg2))))) {
						Static342.aClass62Array2[Static449.anInt7349++] = arg2;
					}
				}
			}
		} else if (arg2.aByte40 == 4) {
			@Pc(712) float local712 = (float) (arg2.anIntArray156[0] - Static444.anInt7300);
			if (!(local712 <= (float) Static616.anInt8105)) {
				local277 = arg2.aShort38 + Static621.anInt10151 - Static66.anInt1803;
				if (local277 < 0) {
					local277 = 0;
				} else if (Static621.anInt10151 + Static621.anInt10151 < local277) {
					return;
				}
				local299 = arg2.aShort39 + Static621.anInt10151 - Static66.anInt1803;
				if (Static621.anInt10151 + Static621.anInt10151 < local299) {
					local299 = Static621.anInt10151 + Static621.anInt10151;
				} else if (local299 < 0) {
					return;
				}
				@Pc(780) int local780 = Static621.anInt10151 + arg2.aShort40 - Static636.anInt10301;
				if (local780 < 0) {
					local780 = 0;
				} else if (Static621.anInt10151 + Static621.anInt10151 < local780) {
					return;
				}
				@Pc(806) int local806 = arg2.aShort41 + Static621.anInt10151 - Static636.anInt10301;
				if (Static621.anInt10151 + Static621.anInt10151 < local806) {
					local806 = Static621.anInt10151 + Static621.anInt10151;
				} else if (local806 < 0) {
					return;
				}
				@Pc(826) boolean local826 = false;
				label283: for (@Pc(828) int local828 = local780; local828 <= local806; local828++) {
					for (@Pc(832) int local832 = local277; local832 <= local299; local832++) {
						if (Static447.aBooleanArrayArray9[local828][local832]) {
							local826 = true;
							break label283;
						}
					}
				}
				if (local826 && (Static535.method7425(0, arg2) && (Static535.method7425(1, arg2) && (Static535.method7425(2, arg2) && Static535.method7425(3, arg2))))) {
					Static342.aClass62Array2[Static449.anInt7349++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZI)Z")
	public static boolean method7403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
