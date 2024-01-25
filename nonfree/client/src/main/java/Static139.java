import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BLclient!gr;Lclient!nha;)Lclient!dk;")
	public static Class3_Sub14 method2308(@OriginalArg(1) Class130 arg0, @OriginalArg(2) Class233 arg1) {
		@Pc(8) Class3_Sub14 local8 = Static502.method7404();
		local8.aClass130_38 = arg0;
		local8.anInt2267 = arg0.anInt3625;
		if (local8.anInt2267 == -1) {
			local8.aClass3_Sub3_Sub2_2 = new Class3_Sub3_Sub2(260);
		} else if (local8.anInt2267 == -2) {
			local8.aClass3_Sub3_Sub2_2 = new Class3_Sub3_Sub2(10000);
		} else if (local8.anInt2267 <= 18) {
			local8.aClass3_Sub3_Sub2_2 = new Class3_Sub3_Sub2(20);
		} else if (local8.anInt2267 > 98) {
			local8.aClass3_Sub3_Sub2_2 = new Class3_Sub3_Sub2(260);
		} else {
			local8.aClass3_Sub3_Sub2_2 = new Class3_Sub3_Sub2(100);
		}
		local8.aClass3_Sub3_Sub2_2.method4274(arg1);
		local8.aClass3_Sub3_Sub2_2.method4270(local8.aClass130_38.method3269());
		local8.anInt2268 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public static void method2309() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static634.anInt10129; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static638.anInt10172; local13++) {
				if (Static553.method7993(Static330.aClass77ArrayArrayArray2, local9, true, local13, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!sia;BLclient!ha;)V")
	public static void method2310(@OriginalArg(0) int arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(3) Class5 arg2) {
		if (Static386.anIntArray439 != null && arg0 <= arg1.aByte127) {
			for (@Pc(17) int local17 = 0; local17 < Static386.anIntArray439.length; local17++) {
				if (Static386.anIntArray439[local17] != -1000000 && (arg1.anIntArray569[0] <= Static386.anIntArray439[local17] || arg1.anIntArray569[1] <= Static386.anIntArray439[local17] || arg1.anIntArray569[2] <= Static386.anIntArray439[local17] || Static386.anIntArray439[local17] >= arg1.anIntArray569[3]) && (arg1.anIntArray568[0] <= Static142.anIntArray552[local17] || Static142.anIntArray552[local17] >= arg1.anIntArray568[1] || arg1.anIntArray568[2] <= Static142.anIntArray552[local17] || arg1.anIntArray568[3] <= Static142.anIntArray552[local17]) && (arg1.anIntArray568[0] >= Static181.anIntArray182[local17] || Static181.anIntArray182[local17] <= arg1.anIntArray568[1] || arg1.anIntArray568[2] >= Static181.anIntArray182[local17] || Static181.anIntArray182[local17] <= arg1.anIntArray568[3]) && (arg1.anIntArray567[0] <= Static180.anIntArray181[local17] || Static180.anIntArray181[local17] >= arg1.anIntArray567[1] || arg1.anIntArray567[2] <= Static180.anIntArray181[local17] || arg1.anIntArray567[3] <= Static180.anIntArray181[local17]) && (Static637.anIntArray662[local17] <= arg1.anIntArray567[0] || Static637.anIntArray662[local17] <= arg1.anIntArray567[1] || Static637.anIntArray662[local17] <= arg1.anIntArray567[2] || Static637.anIntArray662[local17] <= arg1.anIntArray567[3])) {
					return;
				}
			}
		}
		@Pc(267) int local267;
		@Pc(283) int local283;
		@Pc(308) int local308;
		@Pc(331) boolean local331;
		@Pc(359) float local359;
		if (arg1.aByte126 == 1) {
			local267 = arg1.aShort120 + Static468.anInt10228 - Static626.anInt10075;
			if (local267 >= 0 && local267 <= Static468.anInt10228 + Static468.anInt10228) {
				local283 = Static468.anInt10228 + arg1.aShort122 - Static386.anInt7210;
				if (local283 < 0) {
					local283 = 0;
				} else if (local283 > Static468.anInt10228 + Static468.anInt10228) {
					return;
				}
				local308 = arg1.aShort123 + Static468.anInt10228 - Static386.anInt7210;
				if (local308 > Static468.anInt10228 + Static468.anInt10228) {
					local308 = Static468.anInt10228 + Static468.anInt10228;
				} else if (local308 < 0) {
					return;
				}
				local331 = false;
				while (local308 >= local283) {
					if (Static579.aBooleanArrayArray7[local267][local283++]) {
						local331 = true;
						break;
					}
				}
				if (local331) {
					local359 = Static596.anInt9756 - arg1.anIntArray568[0];
					if (local359 < 0.0F) {
						local359 *= -1.0F;
					}
					if (!(float) Static529.anInt9061 > local359 && (Static589.method8289(0, arg1) && (Static589.method8289(1, arg1) && (Static589.method8289(2, arg1) && Static589.method8289(3, arg1))))) {
						Static287.aClass309Array1[Static280.anInt5017++] = arg1;
					}
				}
			}
		} else if (arg1.aByte126 == 2) {
			local267 = arg1.aShort122 + Static468.anInt10228 - Static386.anInt7210;
			if (local267 >= 0 && Static468.anInt10228 + Static468.anInt10228 >= local267) {
				local283 = arg1.aShort120 + Static468.anInt10228 - Static626.anInt10075;
				if (local283 < 0) {
					local283 = 0;
				} else if (Static468.anInt10228 + Static468.anInt10228 < local283) {
					return;
				}
				local308 = Static468.anInt10228 + arg1.aShort121 - Static626.anInt10075;
				if (local308 > Static468.anInt10228 + Static468.anInt10228) {
					local308 = Static468.anInt10228 + Static468.anInt10228;
				} else if (local308 < 0) {
					return;
				}
				local331 = false;
				while (local283 <= local308) {
					if (Static579.aBooleanArrayArray7[local283++][local267]) {
						local331 = true;
						break;
					}
				}
				if (local331) {
					local359 = Static588.anInt9618 - arg1.anIntArray567[0];
					if (local359 < 0.0F) {
						local359 *= -1.0F;
					}
					if (!((float) Static529.anInt9061 > local359) && (Static589.method8289(0, arg1) && (Static589.method8289(1, arg1) && (Static589.method8289(2, arg1) && Static589.method8289(3, arg1))))) {
						Static287.aClass309Array1[Static280.anInt5017++] = arg1;
					}
				}
			}
		} else if (arg1.aByte126 == 16 || arg1.aByte126 == 8) {
			local267 = arg1.aShort120 + Static468.anInt10228 - Static626.anInt10075;
			if (local267 >= 0 && local267 <= Static468.anInt10228 + Static468.anInt10228) {
				local283 = arg1.aShort122 + Static468.anInt10228 - Static386.anInt7210;
				if (local283 >= 0 && local283 <= Static468.anInt10228 + Static468.anInt10228 && Static579.aBooleanArrayArray7[local267][local283]) {
					@Pc(615) float local615 = (float) (Static596.anInt9756 - arg1.anIntArray568[0]);
					if (local615 < 0.0F) {
						local615 *= -1.0F;
					}
					@Pc(632) float local632 = (float) (Static588.anInt9618 - arg1.anIntArray567[0]);
					if (local632 < 0.0F) {
						local632 *= -1.0F;
					}
					if ((!(local615 < (float) Static529.anInt9061) || !((float) Static529.anInt9061 > local632)) && (Static589.method8289(0, arg1) && (Static589.method8289(1, arg1) && (Static589.method8289(2, arg1) && Static589.method8289(3, arg1))))) {
						Static287.aClass309Array1[Static280.anInt5017++] = arg1;
					}
				}
			}
		} else if (arg1.aByte126 == 4) {
			@Pc(697) float local697 = (float) (arg1.anIntArray569[0] - Static245.anInt4543);
			if (!((float) Static118.anInt2566 >= local697)) {
				local283 = Static468.anInt10228 + arg1.aShort122 - Static386.anInt7210;
				if (local283 < 0) {
					local283 = 0;
				} else if (local283 > Static468.anInt10228 + Static468.anInt10228) {
					return;
				}
				local308 = arg1.aShort123 + Static468.anInt10228 - Static386.anInt7210;
				if (local308 > Static468.anInt10228 + Static468.anInt10228) {
					local308 = Static468.anInt10228 + Static468.anInt10228;
				} else if (local308 < 0) {
					return;
				}
				@Pc(762) int local762 = arg1.aShort120 + Static468.anInt10228 - Static626.anInt10075;
				if (local762 < 0) {
					local762 = 0;
				} else if (local762 > Static468.anInt10228 + Static468.anInt10228) {
					return;
				}
				@Pc(785) int local785 = Static468.anInt10228 + arg1.aShort121 - Static626.anInt10075;
				if (local785 > Static468.anInt10228 + Static468.anInt10228) {
					local785 = Static468.anInt10228 + Static468.anInt10228;
				} else if (local785 < 0) {
					return;
				}
				@Pc(802) boolean local802 = false;
				label283: for (@Pc(804) int local804 = local762; local804 <= local785; local804++) {
					for (@Pc(808) int local808 = local283; local808 <= local308; local808++) {
						if (Static579.aBooleanArrayArray7[local804][local808]) {
							local802 = true;
							break label283;
						}
					}
				}
				if (local802 && (Static589.method8289(0, arg1) && (Static589.method8289(1, arg1) && (Static589.method8289(2, arg1) && Static589.method8289(3, arg1))))) {
					Static287.aClass309Array1[Static280.anInt5017++] = arg1;
				}
			}
		}
	}
}
