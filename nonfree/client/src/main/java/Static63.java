import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BD)V")
	public static void method949(@OriginalArg(1) double arg0) {
		if (Static695.aDouble60 == arg0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(26) int local26 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static481.anIntArray549[local12] = local26 <= 255 ? local26 : 255;
		}
		Static695.aDouble60 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIZZI)V")
	public static void method951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static166.anInt2884 == 4) {
			Static166.anInt2884 = 0;
			Static640.anInt9835 = -1;
		}
		if (!arg2 && Static719.anInt10965 == arg0 && Static663.anInt9247 == arg3 && (Static684.anInt10516 == Static597.anInt9295 || Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 1)) {
			return;
		}
		Static597.anInt9295 = Static684.anInt10516;
		Static719.anInt10965 = arg0;
		Static663.anInt9247 = arg3;
		if (Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 1) {
			Static597.anInt9295 = 0;
		}
		Static261.method9374(-75, arg1);
		Static271.method3803(Static289.aClass191_12.method4067(Static414.anInt9485), true, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
		@Pc(74) int local74 = Static243.anInt3820;
		Static243.anInt3820 = (Static719.anInt10965 - (Static426.anInt6942 >> 4)) * 8;
		@Pc(85) int local85 = Static224.anInt11062;
		Static224.anInt11062 = (Static663.anInt9247 - (Static280.anInt6752 >> 4)) * 8;
		Static310.aClass2_Sub6_Sub21_3 = Static90.method2905(Static719.anInt10965 * 8, Static663.anInt9247 * 8);
		Static8.aClass372_1 = null;
		@Pc(109) int local109 = Static243.anInt3820 - local74;
		@Pc(113) int local113 = Static224.anInt11062 - local85;
		@Pc(120) int local120;
		@Pc(133) int local133;
		@Pc(267) int local267;
		@Pc(207) int local207;
		if (arg1 == 12) {
			for (local120 = 0; local120 < Static676.anInt10488; local120++) {
				@Pc(126) Class2_Sub49 local126 = Static459.aClass2_Sub49Array1[local120];
				if (local126 != null) {
					@Pc(131) Class4_Sub2_Sub1_Sub2_Sub2 local131 = local126.aClass4_Sub2_Sub1_Sub2_Sub2_3;
					for (local133 = 0; local133 < local131.anIntArray183.length; local133++) {
						local131.anIntArray183[local133] -= local109;
						local131.anIntArray182[local133] -= local113;
					}
					local131.anInt10228 -= local113 * 512;
					local131.anInt10229 -= local109 * 512;
				}
			}
		} else {
			@Pc(193) boolean local193 = false;
			Static217.anInt3445 = 0;
			@Pc(201) int local201 = Static426.anInt6942 * 512 - 512;
			local207 = (Static280.anInt6752 - 1) * 512;
			for (local133 = 0; local133 < Static676.anInt10488; local133++) {
				@Pc(215) Class2_Sub49 local215 = Static459.aClass2_Sub49Array1[local133];
				if (local215 != null) {
					@Pc(220) Class4_Sub2_Sub1_Sub2_Sub2 local220 = local215.aClass4_Sub2_Sub1_Sub2_Sub2_3;
					local220.anInt10229 -= local109 * 512;
					local220.anInt10228 -= local113 * 512;
					if (local220.anInt10229 >= 0 && local201 >= local220.anInt10229 && local220.anInt10228 >= 0 && local207 >= local220.anInt10228) {
						@Pc(265) boolean local265 = true;
						for (local267 = 0; local267 < local220.anIntArray183.length; local267++) {
							local220.anIntArray183[local267] -= local109;
							local220.anIntArray182[local267] -= local113;
							if (local220.anIntArray183[local267] < 0 || Static426.anInt6942 <= local220.anIntArray183[local267] || local220.anIntArray182[local267] < 0 || Static280.anInt6752 <= local220.anIntArray182[local267]) {
								local265 = false;
							}
						}
						if (local265) {
							Static266.anIntArray305[Static217.anInt3445++] = local220.anInt2320;
						} else {
							local220.method2068((Class261) null);
							local215.method9872();
							local193 = true;
						}
					} else {
						local220.method2068((Class261) null);
						local215.method9872();
						local193 = true;
					}
				}
			}
			if (local193) {
				Static676.anInt10488 = Static467.aClass218_37.method5094();
				Static467.aClass218_37.method5091(Static459.aClass2_Sub49Array1);
			}
		}
		for (local120 = 0; local120 < 2048; local120++) {
			@Pc(396) Class4_Sub2_Sub1_Sub2_Sub1 local396 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local120];
			if (local396 != null) {
				for (local207 = 0; local207 < local396.anIntArray183.length; local207++) {
					local396.anIntArray183[local207] -= local109;
					local396.anIntArray182[local207] -= local113;
				}
				local396.anInt10228 -= local113 * 512;
				local396.anInt10229 -= local109 * 512;
			}
		}
		@Pc(454) Class350[] local454 = Static690.aClass350Array1;
		for (local207 = 0; local207 < local454.length; local207++) {
			@Pc(462) Class350 local462 = local454[local207];
			if (local462 != null) {
				local462.anInt9434 -= local113 * 512;
				local462.anInt9443 -= local109 * 512;
			}
		}
		@Pc(492) Class2_Sub46 local492;
		for (local492 = (Class2_Sub46) Static237.aClass60_235.method1226(7); local492 != null; local492 = (Class2_Sub46) Static237.aClass60_235.method1228()) {
			local492.anInt7501 -= local109;
			local492.anInt7498 -= local113;
			if (Static718.anInt10954 != 4 && (local492.anInt7501 < 0 || local492.anInt7498 < 0 || local492.anInt7501 >= Static426.anInt6942 || Static280.anInt6752 <= local492.anInt7498)) {
				local492.method9872();
			}
		}
		for (local492 = (Class2_Sub46) Static556.aClass60_180.method1226(7); local492 != null; local492 = (Class2_Sub46) Static556.aClass60_180.method1228()) {
			local492.anInt7498 -= local113;
			local492.anInt7501 -= local109;
			if (Static718.anInt10954 != 4 && (local492.anInt7501 < 0 || local492.anInt7498 < 0 || Static426.anInt6942 <= local492.anInt7501 || Static280.anInt6752 <= local492.anInt7498)) {
				local492.method9872();
			}
		}
		if (Static718.anInt10954 != 4) {
			for (@Pc(636) Class2_Sub53 local636 = (Class2_Sub53) Static596.aClass218_41.method5092(); local636 != null; local636 = (Class2_Sub53) Static596.aClass218_41.method5096()) {
				@Pc(644) int local644 = (int) (local636.aLong352 & 0x3FFFL);
				@Pc(649) int local649 = local644 - Static243.anInt3820;
				local267 = (int) (local636.aLong352 >> 14 & 0x3FFFL);
				@Pc(662) int local662 = local267 - Static224.anInt11062;
				if (local649 < 0 || local662 < 0 || Static426.anInt6942 <= local649 || Static280.anInt6752 <= local662) {
					local636.method9872();
				}
			}
		}
		if (Static392.anInt6487 != 0) {
			Static371.anInt5924 -= local113;
			Static392.anInt6487 -= local109;
		}
		Static557.method7767();
		if (arg1 != 12) {
			Static430.anInt7002 -= local109 * 512;
			Static218.anInt3475 -= local113 * 512;
			Static147.anInt2479 -= local113;
			Static14.anInt205 -= local113;
			Static594.anInt9285 -= local109;
			Static567.anInt8900 -= local109;
			if (Math.abs(local109) > Static426.anInt6942 || Math.abs(local113) > Static280.anInt6752) {
				Static408.method6014();
			}
		} else if (Static60.anInt1040 == 4) {
			Static712.anInt10863 -= local113 * 512;
			Static670.anInt10429 -= local109 * 512;
			Static682.anInt11014 -= local109 * 512;
			Static506.anInt8028 -= local113 * 512;
		} else {
			Static253.anInt3964 = -1;
			Static45.anInt602 = -1;
			Static60.anInt1040 = 1;
		}
		Static278.method3934();
		Static145.method2135();
		Static211.aClass218_18.method5097();
		Static120.aClass60_37.method1223();
		Static480.aClass320_6.method7603();
		Static633.method8622();
	}
}
