import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "Z")
	public static boolean aBoolean501 = true;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZIII)V")
	public static void method5303(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1 && Static261.anInt4343 == arg0 && Static237.anInt4007 == arg3 && (Static299.anInt4751 == Static315.anInt5514 || Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 1)) {
			return;
		}
		Static237.anInt4007 = arg3;
		Static315.anInt5514 = Static299.anInt4751;
		Static261.anInt4343 = arg0;
		if (Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 1) {
			Static315.anInt5514 = 0;
		}
		Static214.method3254(arg2);
		Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, true, Static76.aClass58_13.method1237(Static321.anInt5554));
		@Pc(60) int local60 = Static113.anInt1785;
		@Pc(62) int local62 = Static622.anInt10087;
		Static113.anInt1785 = (Static261.anInt4343 - (Static111.anInt1752 >> 4)) * 8;
		Static622.anInt10087 = (Static237.anInt4007 - (Static279.anInt4567 >> 4)) * 8;
		Static573.aClass5_Sub4_Sub1_3 = Static203.method145(Static261.anInt4343 * 8, Static237.anInt4007 * 8);
		Static173.aClass383_3 = null;
		@Pc(95) int local95 = Static113.anInt1785 - local60;
		@Pc(100) int local100 = Static622.anInt10087 - local62;
		@Pc(121) int local121;
		@Pc(123) int local123;
		@Pc(179) int local179;
		@Pc(269) int local269;
		if (arg2 == 11) {
			for (local269 = 0; local269 < Static108.anInt1716; local269++) {
				@Pc(275) Class5_Sub13 local275 = Static367.aClass5_Sub13Array1[local269];
				if (local275 != null) {
					@Pc(280) Class14_Sub1_Sub1_Sub3_Sub2 local280 = local275.aClass14_Sub1_Sub1_Sub3_Sub2_1;
					for (local123 = 0; local123 < 10; local123++) {
						local280.anIntArray253[local123] -= local95;
						local280.anIntArray252[local123] -= local100;
					}
					local280.anInt9317 -= local95 * 512;
					local280.anInt9315 -= local100 * 512;
				}
			}
		} else {
			Static58.anInt926 = 0;
			@Pc(109) boolean local109 = false;
			@Pc(115) int local115 = Static111.anInt1752 * 512 - 512;
			local121 = Static279.anInt4567 * 512 - 512;
			for (local123 = 0; local123 < Static108.anInt1716; local123++) {
				@Pc(129) Class5_Sub13 local129 = Static367.aClass5_Sub13Array1[local123];
				if (local129 != null) {
					@Pc(134) Class14_Sub1_Sub1_Sub3_Sub2 local134 = local129.aClass14_Sub1_Sub1_Sub3_Sub2_1;
					local134.anInt9315 -= local100 * 512;
					local134.anInt9317 -= local95 * 512;
					if (local134.anInt9317 >= 0 && local134.anInt9317 <= local115 && local134.anInt9315 >= 0 && local134.anInt9315 <= local121) {
						@Pc(177) boolean local177 = true;
						for (local179 = 0; local179 < 10; local179++) {
							local134.anIntArray253[local179] -= local95;
							local134.anIntArray252[local179] -= local100;
							if (local134.anIntArray253[local179] < 0 || Static111.anInt1752 <= local134.anIntArray253[local179] || local134.anIntArray252[local179] < 0 || local134.anIntArray252[local179] >= Static279.anInt4567) {
								local177 = false;
							}
						}
						if (local177) {
							Static191.anIntArray287[Static58.anInt926++] = local134.anInt2960;
						} else {
							local134.method2534((Class271) null);
							local109 = true;
							local129.method8911();
						}
					} else {
						local134.method2534((Class271) null);
						local109 = true;
						local129.method8911();
					}
				}
			}
			if (local109) {
				Static108.anInt1716 = Static51.aClass81_11.method1611();
				Static51.aClass81_11.method1606(Static367.aClass5_Sub13Array1);
			}
		}
		for (local269 = 0; local269 < 2048; local269++) {
			@Pc(336) Class14_Sub1_Sub1_Sub3_Sub1 local336 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local269];
			if (local336 != null) {
				for (local121 = 0; local121 < 10; local121++) {
					local336.anIntArray253[local121] -= local95;
					local336.anIntArray252[local121] -= local100;
				}
				local336.anInt9315 -= local100 * 512;
				local336.anInt9317 -= local95 * 512;
			}
		}
		@Pc(386) Class16[] local386 = Static568.aClass16Array1;
		for (local121 = 0; local121 < local386.length; local121++) {
			@Pc(394) Class16 local394 = local386[local121];
			if (local394 != null) {
				local394.anInt398 -= local95 * 512;
				local394.anInt402 -= local100 * 512;
			}
		}
		@Pc(422) Class5_Sub35 local422;
		for (local422 = (Class5_Sub35) Static404.aClass306_36.method7313(); local422 != null; local422 = (Class5_Sub35) Static404.aClass306_36.method7301()) {
			local422.anInt6497 -= local100;
			local422.anInt6495 -= local95;
			if (Static466.anInt7862 != 4 && (local422.anInt6495 < 0 || local422.anInt6497 < 0 || Static111.anInt1752 <= local422.anInt6495 || local422.anInt6497 >= Static279.anInt4567)) {
				local422.method8911();
			}
		}
		for (local422 = (Class5_Sub35) Static498.aClass306_55.method7313(); local422 != null; local422 = (Class5_Sub35) Static498.aClass306_55.method7301()) {
			local422.anInt6495 -= local95;
			local422.anInt6497 -= local100;
			if (Static466.anInt7862 != 4 && (local422.anInt6495 < 0 || local422.anInt6497 < 0 || Static111.anInt1752 <= local422.anInt6495 || Static279.anInt4567 <= local422.anInt6497)) {
				local422.method8911();
			}
		}
		if (Static466.anInt7862 != 4) {
			for (@Pc(540) Class5_Sub17 local540 = (Class5_Sub17) Static402.aClass81_65.method1608(); local540 != null; local540 = (Class5_Sub17) Static402.aClass81_65.method1610()) {
				@Pc(548) int local548 = (int) (local540.aLong282 & 0x3FFFL);
				@Pc(553) int local553 = local548 - Static113.anInt1785;
				local179 = (int) (local540.aLong282 >> 14 & 0x3FFFL);
				@Pc(566) int local566 = local179 - Static622.anInt10087;
				if (local553 < 0 || local566 < 0 || local553 >= Static111.anInt1752 || Static279.anInt4567 <= local566) {
					local540.method8911();
				}
			}
		}
		if (Static269.anInt1227 != 0) {
			Static119.anInt1885 -= local100;
			Static269.anInt1227 -= local95;
		}
		Static83.method7211();
		if (arg2 != 11) {
			Static512.anInt9960 -= local95;
			Static477.anInt7975 -= local100;
			Static70.anInt9231 -= local95 * 512;
			Static646.anInt10445 -= local100 * 512;
			Static148.anInt4148 -= local100;
			Static2.anInt7 -= local95;
			if (Math.abs(local95) > Static111.anInt1752 || Math.abs(local100) > Static279.anInt4567) {
				Static571.method8044();
			}
		} else if (Static584.anInt9543 == 4) {
			Static319.anInt5539 -= local100 * 512;
			Static102.anInt1587 -= local95 * 512;
			Static134.anInt2212 -= local95 * 512;
			Static377.anInt6619 -= local100 * 512;
		} else {
			Static584.anInt9543 = 1;
			Static609.anInt9978 = -1;
			Static394.anInt6873 = -1;
		}
		Static300.method4350();
		Static227.method3580();
		Static334.aClass306_29.method7315();
		Static471.aClass306_45.method7315();
		Static41.aClass363_1.method8482();
		Static514.method7414();
	}
}
