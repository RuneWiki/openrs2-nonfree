import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "[Lclient!i;")
	public static Class139[] aClass139Array17;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_202 = new Class272(111, -2);

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public static int anInt6347 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JI)V")
	public static void method5521(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static274.method4407(arg0 - 1L);
			Static274.method4407(1L);
		} else {
			Static274.method4407(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!sb;Lclient!rh;)Lclient!mu;")
	public static Class3_Sub34 method5522(@OriginalArg(1) Class298 arg0, @OriginalArg(2) Class287 arg1) {
		@Pc(8) Class3_Sub34 local8 = Static592.method7786();
		local8.aClass298_129 = arg0;
		local8.anInt6003 = arg0.anInt7690;
		if (local8.anInt6003 == -1) {
			local8.aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(260);
		} else if (local8.anInt6003 == -2) {
			local8.aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(10000);
		} else if (local8.anInt6003 <= 18) {
			local8.aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(20);
		} else if (local8.anInt6003 > 98) {
			local8.aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(260);
		} else {
			local8.aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(100);
		}
		local8.aClass3_Sub11_Sub1_2.method994(arg1);
		local8.aClass3_Sub11_Sub1_2.method996(local8.aClass298_129.method6498());
		local8.anInt6004 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oe;Lclient!r;II)V")
	public static void method5524(@OriginalArg(0) Class241 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17;
		if (Static311.anIntArray427 != null && arg2 <= arg0.aByte84) {
			for (local17 = 0; local17 < Static311.anIntArray427.length; local17++) {
				if (Static311.anIntArray427[local17] != -1000000 && (arg0.anIntArray508[0] <= Static311.anIntArray427[local17] || arg0.anIntArray508[1] <= Static311.anIntArray427[local17] || Static311.anIntArray427[local17] >= arg0.anIntArray508[2] || Static311.anIntArray427[local17] >= arg0.anIntArray508[3]) && (arg0.anIntArray507[0] <= Static8.anIntArray14[local17] || Static8.anIntArray14[local17] >= arg0.anIntArray507[1] || Static8.anIntArray14[local17] >= arg0.anIntArray507[2] || Static8.anIntArray14[local17] >= arg0.anIntArray507[3]) && (arg0.anIntArray507[0] >= Static226.anIntArray354[local17] || arg0.anIntArray507[1] >= Static226.anIntArray354[local17] || arg0.anIntArray507[2] >= Static226.anIntArray354[local17] || Static226.anIntArray354[local17] <= arg0.anIntArray507[3]) && (arg0.anIntArray509[0] <= Static334.anIntArray460[local17] || Static334.anIntArray460[local17] >= arg0.anIntArray509[1] || arg0.anIntArray509[2] <= Static334.anIntArray460[local17] || Static334.anIntArray460[local17] >= arg0.anIntArray509[3]) && (arg0.anIntArray509[0] >= Static189.anIntArray312[local17] || arg0.anIntArray509[1] >= Static189.anIntArray312[local17] || arg0.anIntArray509[2] >= Static189.anIntArray312[local17] || Static189.anIntArray312[local17] <= arg0.anIntArray509[3])) {
					return;
				}
			}
		}
		@Pc(283) int local283;
		@Pc(308) int local308;
		@Pc(322) boolean local322;
		@Pc(353) float local353;
		if (arg0.aByte85 == 1) {
			local17 = Static266.anInt4982 + arg0.aShort90 - Static210.anInt4205;
			if (local17 >= 0 && local17 <= Static266.anInt4982 + Static266.anInt4982) {
				local283 = Static266.anInt4982 + arg0.aShort89 - Static12.anInt136;
				if (local283 < 0) {
					local283 = 0;
				} else if (Static266.anInt4982 + Static266.anInt4982 < local283) {
					return;
				}
				local308 = Static266.anInt4982 + arg0.aShort88 - Static12.anInt136;
				if (Static266.anInt4982 + Static266.anInt4982 < local308) {
					local308 = Static266.anInt4982 + Static266.anInt4982;
				} else if (local308 < 0) {
					return;
				}
				local322 = false;
				while (local283 <= local308) {
					if (Static356.aBooleanArrayArray5[local17][local283++]) {
						local322 = true;
						break;
					}
				}
				if (local322) {
					local353 = Static93.anInt2300 - arg0.anIntArray507[0];
					if (local353 < 0.0F) {
						local353 *= -1.0F;
					}
					if (!local353 < (float) Static311.anInt5615 && (Static501.method6758(0, arg0) && (Static501.method6758(1, arg0) && (Static501.method6758(2, arg0) && Static501.method6758(3, arg0))))) {
						Static466.aClass241Array37[Static123.anInt2786++] = arg0;
					}
				}
			}
		} else if (arg0.aByte85 == 2) {
			local17 = Static266.anInt4982 + arg0.aShort89 - Static12.anInt136;
			if (local17 >= 0 && local17 <= Static266.anInt4982 + Static266.anInt4982) {
				local283 = arg0.aShort90 + Static266.anInt4982 - Static210.anInt4205;
				if (local283 < 0) {
					local283 = 0;
				} else if (Static266.anInt4982 + Static266.anInt4982 < local283) {
					return;
				}
				local308 = arg0.aShort87 + Static266.anInt4982 - Static210.anInt4205;
				if (Static266.anInt4982 + Static266.anInt4982 < local308) {
					local308 = Static266.anInt4982 + Static266.anInt4982;
				} else if (local308 < 0) {
					return;
				}
				local322 = false;
				while (local308 >= local283) {
					if (Static356.aBooleanArrayArray5[local283++][local17]) {
						local322 = true;
						break;
					}
				}
				if (local322) {
					local353 = Static321.anInt5796 - arg0.anIntArray509[0];
					if (local353 < 0.0F) {
						local353 *= -1.0F;
					}
					if (!((float) Static311.anInt5615 > local353) && (Static501.method6758(0, arg0) && (Static501.method6758(1, arg0) && (Static501.method6758(2, arg0) && Static501.method6758(3, arg0))))) {
						Static466.aClass241Array37[Static123.anInt2786++] = arg0;
					}
				}
			}
		} else if (arg0.aByte85 == 16 || arg0.aByte85 == 8) {
			local17 = arg0.aShort90 + Static266.anInt4982 - Static210.anInt4205;
			if (local17 >= 0 && Static266.anInt4982 + Static266.anInt4982 >= local17) {
				local283 = arg0.aShort89 + Static266.anInt4982 - Static12.anInt136;
				if (local283 >= 0 && Static266.anInt4982 + Static266.anInt4982 >= local283 && Static356.aBooleanArrayArray5[local17][local283]) {
					@Pc(619) float local619 = (float) (Static93.anInt2300 - arg0.anIntArray507[0]);
					if (local619 < 0.0F) {
						local619 *= -1.0F;
					}
					@Pc(635) float local635 = (float) (Static321.anInt5796 - arg0.anIntArray509[0]);
					if (local635 < 0.0F) {
						local635 *= -1.0F;
					}
					if ((!(local619 < (float) Static311.anInt5615) || !((float) Static311.anInt5615 > local635)) && (Static501.method6758(0, arg0) && (Static501.method6758(1, arg0) && (Static501.method6758(2, arg0) && Static501.method6758(3, arg0))))) {
						Static466.aClass241Array37[Static123.anInt2786++] = arg0;
					}
				}
			}
		} else if (arg0.aByte85 == 4) {
			@Pc(706) float local706 = (float) (arg0.anIntArray508[0] - Static311.anInt5621);
			if (!((float) Static351.anInt6124 >= local706)) {
				local283 = Static266.anInt4982 + arg0.aShort89 - Static12.anInt136;
				if (local283 < 0) {
					local283 = 0;
				} else if (Static266.anInt4982 + Static266.anInt4982 < local283) {
					return;
				}
				local308 = arg0.aShort88 + Static266.anInt4982 - Static12.anInt136;
				if (local308 > Static266.anInt4982 + Static266.anInt4982) {
					local308 = Static266.anInt4982 + Static266.anInt4982;
				} else if (local308 < 0) {
					return;
				}
				@Pc(770) int local770 = Static266.anInt4982 + arg0.aShort90 - Static210.anInt4205;
				if (local770 < 0) {
					local770 = 0;
				} else if (local770 > Static266.anInt4982 + Static266.anInt4982) {
					return;
				}
				@Pc(789) int local789 = arg0.aShort87 + Static266.anInt4982 - Static210.anInt4205;
				if (Static266.anInt4982 + Static266.anInt4982 < local789) {
					local789 = Static266.anInt4982 + Static266.anInt4982;
				} else if (local789 < 0) {
					return;
				}
				@Pc(812) boolean local812 = false;
				label283: for (@Pc(814) int local814 = local770; local814 <= local789; local814++) {
					for (@Pc(818) int local818 = local283; local818 <= local308; local818++) {
						if (Static356.aBooleanArrayArray5[local814][local818]) {
							local812 = true;
							break label283;
						}
					}
				}
				if (local812 && (Static501.method6758(0, arg0) && (Static501.method6758(1, arg0) && (Static501.method6758(2, arg0) && Static501.method6758(3, arg0))))) {
					Static466.aClass241Array37[Static123.anInt2786++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBII[BI)Z")
	public static boolean method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(21) int local21;
		if (local9 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local9;
		}
		@Pc(38) int local38 = -((arg1 + 7) / 8);
		@Pc(47) int local47 = -((arg3 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local38; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local47; local53 < 0; local53++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local21;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}
}
