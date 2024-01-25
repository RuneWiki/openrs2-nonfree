import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_24 = new Class81(60, 1);

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V")
	public static void method1028() {
		Static20.method271();
		Static404.aClass68ArrayArray1 = null;
		Static61.aClass21_1 = null;
		Static429.aClass21_4 = null;
		Static184.aClass26_4 = null;
		Static376.aClass21_3 = null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method1029(@OriginalArg(1) Class26 arg0) {
		@Pc(7) int local7 = Static346.anInt6104;
		@Pc(9) int local9 = Static117.anInt2356;
		@Pc(11) int local11 = Static85.anInt3261;
		@Pc(15) int local15 = Static447.anInt4684 - 3;
		if (Static312.aClass76_8 == null || Static344.aClass76_15 == null) {
			if (Static351.aClass188_97.method4296(Static33.anInt662) && Static351.aClass188_97.method4296(Static327.anInt5867)) {
				Static312.aClass76_8 = arg0.method2230(Static456.method1764(Static351.aClass188_97, Static33.anInt662, 0));
				@Pc(61) Class89 local61 = Static456.method1764(Static351.aClass188_97, Static327.anInt5867, 0);
				Static344.aClass76_15 = arg0.method2230(local61);
				local61.method1774();
				Static348.aClass76_16 = arg0.method2230(local61);
			} else {
				arg0.NA(local7, local9, local11, 20, 255 - Static449.anInt2640 << 24 | Static393.anInt6883, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static312.aClass76_8 != null && Static344.aClass76_15 != null) {
			local88 = (local11 - Static344.aClass76_15.UA() * 2) / Static312.aClass76_8.UA();
			for (local90 = 0; local90 < local88; local90++) {
				Static312.aClass76_8.method6088(local7 + Static344.aClass76_15.UA() + local90 * Static312.aClass76_8.UA(), local9);
			}
			Static344.aClass76_15.method6088(local7, local9);
			Static348.aClass76_16.method6088(local11 + local7 - Static348.aClass76_16.UA(), local9);
		}
		Static193.aClass56_3.method5848(Static115.aClass256_129.method5720(Static272.anInt7537), local9 + 14, Static354.anInt6243 | 0xFF000000, local7 + 3, -1);
		arg0.NA(local7, local9 + 20, local11, local15 - 20, -Static449.anInt2640 + 255 << 24 | Static393.anInt6883, 1);
		local88 = Static304.aClass40_1.method1164();
		local90 = Static304.aClass40_1.method1159();
		@Pc(175) int local175 = 0;
		@Pc(197) int local197;
		for (@Pc(180) Class2_Sub26 local180 = (Class2_Sub26) Static288.aClass265_41.method6005(); local180 != null; local180 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
			local197 = (Static168.anInt3255 - local175 - 1) * 16 + local9 + 13 + 20;
			if (local7 < local88 && local11 + local7 > local88 && local197 - 13 < local90 && local197 + 4 > local90 && local180.aBoolean379) {
				arg0.NA(local7, local197 - 12, local11, 16, Static303.anInt5387 | 255 - Static297.anInt5338 << 24, 1);
			}
			local175++;
		}
		if ((Static445.aClass76_22 == null || Static33.aClass76_1 == null || Static48.aClass76_5 == null) && Static351.aClass188_97.method4296(Static7.anInt236) && Static351.aClass188_97.method4296(Static330.anInt5886) && Static351.aClass188_97.method4296(Static355.anInt6272)) {
			@Pc(269) Class89 local269 = Static456.method1764(Static351.aClass188_97, Static330.anInt5886, 0);
			Static33.aClass76_1 = arg0.method2230(local269);
			local269.method1774();
			Static423.aClass76_21 = arg0.method2230(local269);
			Static445.aClass76_22 = arg0.method2230(Static456.method1764(Static351.aClass188_97, Static7.anInt236, 0));
			@Pc(294) Class89 local294 = Static456.method1764(Static351.aClass188_97, Static355.anInt6272, 0);
			Static48.aClass76_5 = arg0.method2230(local294);
			local294.method1774();
			Static39.aClass76_4 = arg0.method2230(local294);
		}
		@Pc(361) int local361;
		@Pc(325) int local325;
		if (Static445.aClass76_22 != null && Static33.aClass76_1 != null && Static48.aClass76_5 != null) {
			local197 = (local11 - Static48.aClass76_5.UA() * 2) / Static445.aClass76_22.UA();
			for (local325 = 0; local325 < local197; local325++) {
				Static445.aClass76_22.method6088(Static48.aClass76_5.UA() + local7 + Static445.aClass76_22.UA() * local325, local15 + local9 + -Static445.aClass76_22.qa());
			}
			local361 = (local15 - Static48.aClass76_5.qa() - 20) / Static33.aClass76_1.qa();
			for (@Pc(363) int local363 = 0; local363 < local361; local363++) {
				Static33.aClass76_1.method6088(local7, local363 * Static33.aClass76_1.qa() + local9 + 20);
				Static423.aClass76_21.method6088(local11 + local7 - Static423.aClass76_21.UA(), Static33.aClass76_1.qa() * local363 + local9 + 20);
			}
			Static48.aClass76_5.method6088(local7, local15 + local9 - Static48.aClass76_5.qa());
			Static39.aClass76_4.method6088(local11 + local7 - Static48.aClass76_5.UA(), local9 - (-local15 + Static48.aClass76_5.qa()));
		}
		local175 = 0;
		for (@Pc(439) Class2_Sub26 local439 = (Class2_Sub26) Static288.aClass265_41.method6005(); local439 != null; local439 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
			local325 = local9 + (-local175 + -1 + Static168.anInt3255) * 16 + 13 + 20;
			local361 = Static354.anInt6243 | 0xFF000000;
			if (local7 < local88 && local88 < local7 + local11 && local90 > local325 - 13 && local325 + 4 > local90 && local439.aBoolean379) {
				local361 = Static123.anInt2431 | 0xFF000000;
			}
			@Pc(492) int[] local492 = null;
			if (Static210.method3247(local439.anInt4529)) {
				local492 = Static350.aClass149_2.method3483((int) local439.aLong137).anIntArray47;
			} else if (local439.anInt4530 != -1) {
				local492 = Static350.aClass149_2.method3483(local439.anInt4530).anIntArray47;
			} else if (Static252.method3870(local439.anInt4529)) {
				@Pc(564) Class4_Sub2_Sub2_Sub2 local564 = Static4.aClass4_Sub2_Sub2_Sub2Array1[(int) local439.aLong137];
				if (local564 != null) {
					@Pc(569) Class215 local569 = local564.aClass215_1;
					if (local569.anIntArray400 != null) {
						local569 = local569.method4795(Static215.aClass225_1);
					}
					if (local569 != null) {
						local492 = local569.anIntArray401;
					}
				}
			} else if (Static6.method151(local439.anInt4529)) {
				@Pc(536) Class250 local536;
				if (local439.anInt4529 == 1012) {
					local536 = Static406.aClass150_3.method3508((int) local439.aLong137);
				} else {
					local536 = Static406.aClass150_3.method3508((int) (local439.aLong137 >>> 32 & 0x7FFFFFFFL));
				}
				if (local536.anIntArray479 != null) {
					local536 = local536.method5591(Static215.aClass225_1);
				}
				if (local536 != null) {
					local492 = local536.anIntArray480;
				}
			}
			@Pc(595) String local595 = Static136.method1990(local439);
			if (local492 != null) {
				local595 = local595 + Static237.method3704(local492);
			}
			Static193.aClass56_3.method5849(local7 + 3, local325, Static112.aClass76Array10, local361, Static224.anIntArray303, local595);
			local175++;
			if (local439.aBoolean381) {
				Static226.aClass76_11.method6088(Static55.aClass210_1.method4758(local595) + local7 + 5, local325 + -12);
			}
		}
		Static301.method4366(Static85.anInt3261, Static117.anInt2356, Static447.anInt4684, Static346.anInt6104);
	}
}
