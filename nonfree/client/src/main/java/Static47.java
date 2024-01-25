import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "Lclient!kw;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!bia", name = "g", descriptor = "Z")
	public static boolean aBoolean109;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
	public static int anInt1250 = 0;

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "[I")
	public static final int[] anIntArray47 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIILclient!ha;Lclient!kh;)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) Class208 arg3) {
		@Pc(19) Class1 local19 = arg3.method4715(arg2);
		if (local19 == null) {
			return;
		}
		arg2.KA(arg1, arg0, arg1 + arg3.anInt5639, arg0 - -arg3.anInt5630);
		if (Static364.anInt6467 == 2 || Static364.anInt6467 == 5 || Static103.aClass102_10 == null) {
			arg2.A(-16777216, local19, arg1, arg0);
			return;
		}
		@Pc(60) int local60;
		@Pc(68) int local68;
		@Pc(66) int local66;
		@Pc(58) int local58;
		if (Static378.anInt6662 == 4) {
			local58 = 4096;
			local60 = Static140.anInt2658;
			local66 = (int) -Static204.aFloat82 & 0x3FFF;
			local68 = Static276.anInt5174;
		} else {
			local60 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108;
			local68 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109;
			local58 = 4096 - Static433.anInt7606 * 16;
			local66 = Static56.anInt1426 + (int) -Static204.aFloat82 & 0x3FFF;
		}
		@Pc(104) int local104 = local60 / 128 + 208 + 48 - Static251.anInt4680 * 2;
		@Pc(122) int local122 = Static406.anInt6924 * 4 + 48 - (Static406.anInt6924 - 104) * 2 - local68 / 128;
		Static103.aClass102_10.method6952((float) arg3.anInt5639 / 2.0F + (float) arg1, (float) arg3.anInt5630 / 2.0F + (float) arg0, (float) local104, (float) local122, local58, local66 << 2, local19, arg1, arg0);
		@Pc(173) int local173;
		@Pc(183) int local183;
		@Pc(193) int local193;
		@Pc(204) int local204;
		for (@Pc(156) Class3_Sub53 local156 = (Class3_Sub53) Static401.aClass193_34.method4457(); local156 != null; local156 = (Class3_Sub53) Static401.aClass193_34.method4459()) {
			@Pc(161) int local161 = local156.anInt10023;
			local173 = (Static17.aClass121_1.anIntArray197[local161] >> 14 & 0x3FFF) - Static417.anInt7047;
			local183 = (Static17.aClass121_1.anIntArray197[local161] & 0x3FFF) - Static347.anInt7851;
			local193 = local173 * 4 + 2 - local60 / 128;
			local204 = local183 * 4 + 2 - local68 / 128;
			Static283.method4485(local193, arg1, local204, Static17.aClass121_1.anIntArray198[local161], arg3, local19, arg0, arg2);
		}
		for (local173 = 0; local173 < Static389.anInt6027; local173++) {
			local183 = Static328.anIntArray389[local173] * 4 + 2 - local60 / 128;
			local193 = Static290.anIntArray346[local173] * 4 + 2 - local68 / 128;
			@Pc(260) Class178 local260 = Static349.aClass374_2.method8357(Static17.anIntArray13[local173]);
			if (local260.anIntArray313 != null) {
				local260 = local260.method4012(Static592.aClass47_2);
				if (local260 == null || local260.anInt4787 == -1) {
					continue;
				}
			}
			Static283.method4485(local183, arg1, local193, local260.anInt4787, arg3, local19, arg0, arg2);
		}
		@Pc(353) int local353;
		@Pc(363) int local363;
		for (@Pc(305) Class3_Sub24 local305 = (Class3_Sub24) Static421.aClass62_32.method1680(); local305 != null; local305 = (Class3_Sub24) Static421.aClass62_32.method1681()) {
			local193 = (int) (local305.aLong309 >> 28 & 0x3L);
			if (Static122.anInt2388 == local193) {
				local204 = (int) (local305.aLong309 & 0x3FFFL) - Static417.anInt7047;
				@Pc(342) int local342 = (int) (local305.aLong309 >> 14 & 0x3FFFL) - Static347.anInt7851;
				local353 = local204 * 4 + 2 - local60 / 128;
				local363 = local342 * 4 + 2 - local68 / 128;
				Static378.method5558(local363, arg1, Static173.aClass102Array8[0], local19, arg0, local353, arg3);
			}
		}
		@Pc(454) int local454;
		for (local193 = 0; local193 < Static308.anInt5687; local193++) {
			@Pc(396) Class3_Sub11 local396 = (Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local193]);
			if (local396 != null) {
				@Pc(401) Class23_Sub2_Sub1_Sub2_Sub2 local401 = local396.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				if (local401.method8632() && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 == local401.aByte142) {
					@Pc(417) Class5 local417 = local401.aClass5_1;
					if (local417 != null && local417.anIntArray1 != null) {
						local417 = local417.method56(Static592.aClass47_2);
					}
					if (local417 != null && local417.aBoolean3 && local417.aBoolean9) {
						local363 = local401.anInt10108 / 128 - local60 / 128;
						local454 = local401.anInt10109 / 128 - local68 / 128;
						if (local417.anInt59 == -1) {
							Static378.method5558(local454, arg1, Static173.aClass102Array8[1], local19, arg0, local363, arg3);
						} else {
							Static283.method4485(local363, arg1, local454, local417.anInt59, arg3, local19, arg0, arg2);
						}
					}
				}
			}
		}
		local204 = Static187.anInt3432;
		@Pc(492) int[] local492 = Static668.anIntArray664;
		@Pc(538) int local538;
		@Pc(542) int local542;
		@Pc(571) int local571;
		for (local353 = 0; local353 < local204; local353++) {
			@Pc(502) Class23_Sub2_Sub1_Sub2_Sub1 local502 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local492[local353]];
			if (local502 != null && local502.method2907() && !local502.aBoolean259 && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 != local502 && local502.aByte142 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) {
				local454 = local502.anInt10108 / 128 - local60 / 128;
				local538 = local502.anInt10109 / 128 - local68 / 128;
				@Pc(540) boolean local540 = false;
				for (local542 = 0; local542 < Static121.anInt2381; local542++) {
					if (local502.aString34.equals(Static260.aStringArray36[local542]) && Static544.anIntArray579[local542] != 0) {
						local540 = true;
						break;
					}
				}
				@Pc(569) boolean local569 = false;
				for (local571 = 0; local571 < Static168.anInt3046; local571++) {
					if (local502.aString34.equals(Static199.aClass172Array30[local571].aString56)) {
						local569 = true;
						break;
					}
				}
				@Pc(595) boolean local595 = false;
				if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3290 != 0 && local502.anInt3290 != 0 && Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3290 == local502.anInt3290) {
					local595 = true;
				}
				if (local502.aBoolean262) {
					Static378.method5558(local538, arg1, Static173.aClass102Array8[6], local19, arg0, local454, arg3);
				} else if (local540) {
					Static378.method5558(local538, arg1, Static173.aClass102Array8[3], local19, arg0, local454, arg3);
				} else if (local569) {
					Static378.method5558(local538, arg1, Static173.aClass102Array8[5], local19, arg0, local454, arg3);
				} else if (local595) {
					Static378.method5558(local538, arg1, Static173.aClass102Array8[4], local19, arg0, local454, arg3);
				} else {
					Static378.method5558(local538, arg1, Static173.aClass102Array8[2], local19, arg0, local454, arg3);
				}
			}
		}
		@Pc(696) Class70[] local696 = Static110.aClass70Array1;
		@Pc(779) int local779;
		for (local454 = 0; local454 < local696.length; local454++) {
			@Pc(704) Class70 local704 = local696[local454];
			if (local704 != null && local704.anInt2023 != 0 && Static621.anInt9665 % 20 < 10) {
				@Pc(745) int local745;
				if (local704.anInt2023 == 1) {
					@Pc(730) Class3_Sub11 local730 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local704.anInt2021);
					if (local730 != null) {
						@Pc(735) Class23_Sub2_Sub1_Sub2_Sub2 local735 = local730.aClass23_Sub2_Sub1_Sub2_Sub2_1;
						local745 = local735.anInt10108 / 128 - local60 / 128;
						local571 = local735.anInt10109 / 128 - local68 / 128;
						Static405.method5785(local745, 360000L, local571, arg3, arg1, local19, arg0, local704.anInt2024);
					}
				}
				if (local704.anInt2023 == 2) {
					local779 = local704.anInt2018 / 128 - local60 / 128;
					local542 = local704.anInt2017 / 128 - local68 / 128;
					@Pc(794) long local794 = (long) (local704.anInt2019 << 7);
					@Pc(798) long local798 = local794 * local794;
					Static405.method5785(local779, local798, local542, arg3, arg1, local19, arg0, local704.anInt2024);
				}
				if (local704.anInt2023 == 10 && local704.anInt2021 >= 0 && Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1.length > local704.anInt2021) {
					@Pc(831) Class23_Sub2_Sub1_Sub2_Sub1 local831 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local704.anInt2021];
					if (local831 != null) {
						local542 = local831.anInt10108 / 128 - local60 / 128;
						local745 = local831.anInt10109 / 128 - local68 / 128;
						Static405.method5785(local542, 360000L, local745, arg3, arg1, local19, arg0, local704.anInt2024);
					}
				}
			}
		}
		if (Static378.anInt6662 == 4) {
			return;
		}
		if (Static75.anInt1704 != 0) {
			local538 = Static75.anInt1704 * 4 + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() - 1) * 2 + 2 - local60 / 128;
			local779 = Static217.anInt4007 * 4 + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() * 2 + 2 - local68 / 128 - 2;
			Static378.method5558(local779, arg1, Static269.aClass102Array12[Static301.aBoolean425 ? 1 : 0], local19, arg0, local538, arg3);
		}
		if (!Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aBoolean259) {
			arg2.method8113(3, arg1 + arg3.anInt5639 / 2 - 1, 3, -1, arg3.anInt5630 / 2 + arg0 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)V")
	public static void method1250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 7);
		local9.method1712();
		local9.anInt1790 = arg1;
	}
}
