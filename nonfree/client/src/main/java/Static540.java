import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIZI)V")
	public static void method8404(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static100.anInt2131 == arg1 && Static403.anInt7392 == arg3 && (Static673.anInt11161 == Static586.anInt10060 || Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 1)) {
			return;
		}
		Static673.anInt11161 = Static586.anInt10060;
		Static403.anInt7392 = arg3;
		Static100.anInt2131 = arg1;
		if (Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 1) {
			Static673.anInt11161 = 0;
		}
		Static67.method1345(arg2);
		Static88.method8992(Static242.aClass38_5, true, Static677.aClass137_47, Static514.aClass303_14.method7473(Static232.anInt4258), Static586.aClass158_12);
		@Pc(56) int local56 = Static329.anInt6225;
		@Pc(58) int local58 = Static202.anInt3755;
		Static329.anInt6225 = (Static100.anInt2131 - (Static26.anInt462 >> 4)) * 8;
		Static202.anInt3755 = (Static403.anInt7392 - (Static445.anInt6140 >> 4)) * 8;
		Static109.aClass14_Sub3_Sub16_1 = Static498.method7294(Static100.anInt2131 * 8, Static403.anInt7392 * 8);
		Static628.aClass294_3 = null;
		@Pc(91) int local91 = Static329.anInt6225 - local56;
		@Pc(95) int local95 = Static202.anInt3755 - local58;
		@Pc(116) int local116;
		@Pc(118) int local118;
		@Pc(170) int local170;
		@Pc(283) int local283;
		if (arg2 == 11) {
			for (local283 = 0; local283 < Static570.anInt9823; local283++) {
				@Pc(289) Class14_Sub44 local289 = Static151.aClass14_Sub44Array1[local283];
				if (local289 != null) {
					@Pc(294) Class12_Sub2_Sub2_Sub1_Sub1 local294 = local289.aClass12_Sub2_Sub2_Sub1_Sub1_2;
					for (local118 = 0; local118 < 10; local118++) {
						local294.anIntArray241[local118] -= local91;
						local294.anIntArray242[local118] -= local95;
					}
					local294.anInt10998 -= local91 * 512;
					local294.anInt11002 -= local95 * 512;
				}
			}
		} else {
			Static471.anInt8216 = 0;
			@Pc(104) boolean local104 = false;
			@Pc(110) int local110 = (Static26.anInt462 - 1) * 512;
			local116 = (Static445.anInt6140 - 1) * 512;
			for (local118 = 0; local118 < Static570.anInt9823; local118++) {
				@Pc(124) Class14_Sub44 local124 = Static151.aClass14_Sub44Array1[local118];
				if (local124 != null) {
					@Pc(129) Class12_Sub2_Sub2_Sub1_Sub1 local129 = local124.aClass12_Sub2_Sub2_Sub1_Sub1_2;
					local129.anInt11002 -= local95 * 512;
					local129.anInt10998 -= local91 * 512;
					if (local129.anInt10998 >= 0 && local129.anInt10998 <= local110 && local129.anInt11002 >= 0 && local116 >= local129.anInt11002) {
						@Pc(168) boolean local168 = true;
						for (local170 = 0; local170 < 10; local170++) {
							local129.anIntArray241[local170] -= local91;
							local129.anIntArray242[local170] -= local95;
							if (local129.anIntArray241[local170] < 0 || Static26.anInt462 <= local129.anIntArray241[local170] || local129.anIntArray242[local170] < 0 || local129.anIntArray242[local170] >= Static445.anInt6140) {
								local168 = false;
							}
						}
						if (local168) {
							Static530.anIntArray671[Static471.anInt8216++] = local129.anInt2945;
						} else {
							local129.method611((Class283) null);
							local104 = true;
							local124.method9315();
						}
					} else {
						local129.method611((Class283) null);
						local104 = true;
						local124.method9315();
					}
				}
			}
			if (local104) {
				Static570.anInt9823 = Static579.aClass187_73.method4080();
				Static579.aClass187_73.method4087(Static151.aClass14_Sub44Array1);
			}
		}
		for (local283 = 0; local283 < 2048; local283++) {
			@Pc(350) Class12_Sub2_Sub2_Sub1_Sub2 local350 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local283];
			if (local350 != null) {
				for (local116 = 0; local116 < 10; local116++) {
					local350.anIntArray241[local116] -= local91;
					local350.anIntArray242[local116] -= local95;
				}
				local350.anInt10998 -= local91 * 512;
				local350.anInt11002 -= local95 * 512;
			}
		}
		@Pc(400) Class390[] local400 = Static590.aClass390Array1;
		for (local116 = 0; local116 < local400.length; local116++) {
			@Pc(408) Class390 local408 = local400[local116];
			if (local408 != null) {
				local408.anInt11105 -= local95 * 512;
				local408.anInt11107 -= local91 * 512;
			}
		}
		@Pc(436) Class14_Sub9 local436;
		for (local436 = (Class14_Sub9) Static605.aClass262_69.method6318(); local436 != null; local436 = (Class14_Sub9) Static605.aClass262_69.method6311()) {
			local436.anInt1586 -= local95;
			local436.anInt1584 -= local91;
			if (Static74.anInt1617 != 4 && (local436.anInt1584 < 0 || local436.anInt1586 < 0 || local436.anInt1584 >= Static26.anInt462 || local436.anInt1586 >= Static445.anInt6140)) {
				local436.method9315();
			}
		}
		for (local436 = (Class14_Sub9) Static659.aClass262_74.method6318(); local436 != null; local436 = (Class14_Sub9) Static659.aClass262_74.method6311()) {
			local436.anInt1584 -= local91;
			local436.anInt1586 -= local95;
			if (Static74.anInt1617 != 4 && (local436.anInt1584 < 0 || local436.anInt1586 < 0 || Static26.anInt462 <= local436.anInt1584 || local436.anInt1586 >= Static445.anInt6140)) {
				local436.method9315();
			}
		}
		if (Static74.anInt1617 != 4) {
			for (@Pc(548) Class14_Sub42 local548 = (Class14_Sub42) Static568.aClass187_71.method4079(); local548 != null; local548 = (Class14_Sub42) Static568.aClass187_71.method4084()) {
				@Pc(556) int local556 = (int) (local548.aLong305 & 0x3FFFL);
				@Pc(560) int local560 = local556 - Static329.anInt6225;
				local170 = (int) (local548.aLong305 >> 14 & 0x3FFFL);
				@Pc(573) int local573 = local170 - Static202.anInt3755;
				if (local560 < 0 || local573 < 0 || Static26.anInt462 <= local560 || local573 >= Static445.anInt6140) {
					local548.method9315();
				}
			}
		}
		if (Static659.anInt10975 != 0) {
			Static35.anInt964 -= local95;
			Static659.anInt10975 -= local91;
		}
		Static38.method847();
		if (arg2 != 11) {
			Static74.anInt1618 -= local95 * 512;
			Static531.anInt9214 -= local95;
			Static243.anInt4386 -= local91;
			Static233.anInt4273 -= local91 * 512;
			Static8.anInt58 -= local95;
			Static654.anInt10919 -= local91;
			if (Math.abs(local91) > Static26.anInt462 || Math.abs(local95) > Static445.anInt6140) {
				Static677.method9300();
			}
		} else if (Static378.anInt6935 == 4) {
			Static620.anInt10427 -= local95 * 512;
			Static322.anInt6116 -= local91 * 512;
			Static569.anInt9811 -= local91 * 512;
			Static59.anInt1432 -= local95 * 512;
		} else {
			Static378.anInt6935 = 1;
			Static115.anInt2304 = -1;
			Static667.anInt11097 = -1;
		}
		Static524.method7528();
		Static405.method6013();
		Static551.aClass262_40.method6316();
		Static144.aClass262_13.method6316();
		Static239.aClass376_4.method9007();
		Static105.method1841();
	}
}
