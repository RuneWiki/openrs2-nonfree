import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_5;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	public static void method2981(@OriginalArg(0) int arg0) {
		Static458.anInt7779 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([[[BZIIIIZ[IIB[I[I[IIII[II)V")
	public static void method2982(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) int arg15) {
		if (Static1.anInt9943 == -1) {
			return;
		}
		@Pc(16) int[] local16 = Static374.aClass65_12.Y();
		@Pc(20) int local20 = local16[0];
		@Pc(24) int local24 = local16[1];
		@Pc(28) int local28 = local16[2];
		@Pc(32) int local32 = local16[3];
		@Pc(34) int local34 = local28;
		@Pc(36) int local36 = local32;
		if (Static1.anInt9943 == 1) {
			local34 = (int) ((double) local28 * (double) Static513.anInt8561 / (double) Static206.anInt3873);
			local36 = (int) ((double) Static513.anInt8561 * (double) local32 / (double) Static206.anInt3873);
		}
		if (!Static375.aBoolean591) {
			if (Static1.anInt9943 == 1) {
				Static325.method5026();
			}
			@Pc(75) int local75 = arg7 - Static3.anInt13;
			@Pc(80) int local80 = arg13 - Static486.anInt8169;
			@Pc(85) int local85 = arg15 - Static160.anInt3195;
			@Pc(107) int local107 = (int) ((double) local34 * ((double) local85 * Static554.aDouble24 + Static25.aDouble2 * (double) local75 + (double) local80 * Static487.aDouble20) / (double) arg4);
			@Pc(129) int local129 = (int) ((double) local36 * (Static81.aDouble3 * (double) local85 + (double) local75 * Static231.aDouble8 + Static179.aDouble7 * (double) local80) / (double) arg4);
			@Pc(144) double local144 = Static519.aDouble22 * (double) local85 + (double) local80 * Static12.aDouble1 + Static642.aDouble25 * (double) local75;
			@Pc(151) int local151 = local107 + Static5.anInt59 - Static250.anInt4569;
			@Pc(158) int local158 = Static414.anInt7335 + local129 - Static469.anInt7905;
			@Pc(162) int local162 = Static154.anInt3151 + local151;
			@Pc(166) int local166 = local158 + Static513.anInt8561;
			if (local151 >= 0 && local158 >= 0 && local162 <= Static193.anInt3732 && Static206.anInt3873 >= local166 || Static1.anInt9943 == 2) {
				Static25.anInt344 = local158;
				Static147.anInt3008 = local151;
				if (Static1.anInt9943 == 2) {
					Static141.aDouble4 = -local144;
				}
			} else if (local162 > 0 && local166 > 0 && local151 < Static193.anInt3732 && Static206.anInt3873 > local158) {
				@Pc(212) int local212 = local151 - Static5.anInt59;
				@Pc(217) int local217 = local158 - Static414.anInt7335;
				@Pc(219) int local219 = 0;
				@Pc(221) int local221 = 0;
				@Pc(223) int local223 = 0;
				@Pc(225) int local225 = 0;
				@Pc(227) double local227 = 0.0D;
				if (Static1.anInt9943 == 0) {
					local219 = local212;
					local221 = local217;
					local227 = Static141.aDouble4 + local144;
				} else if (Static1.anInt9943 == 1) {
					local223 = local212 / Static597.anInt9791;
					local225 = local217 / Static382.anInt6778;
					local221 = local225 * Static382.anInt6778;
					local219 = local223 * Static597.anInt9791;
					local227 = (Static141.aDouble4 + local144) * (double) (local219 * local212 + local217 * local221) / (double) (local217 * local217 + local212 * local212);
				}
				local227 = -local227;
				@Pc(290) int local290 = 0;
				@Pc(292) int local292 = 0;
				@Pc(294) int local294 = 0;
				@Pc(296) int local296 = 0;
				@Pc(298) int local298 = 0;
				@Pc(305) int local305;
				@Pc(310) int local310;
				@Pc(324) int local324;
				@Pc(312) int local312;
				if (local219 >= 0) {
					local305 = 0;
					local310 = Static193.anInt3732 - local219;
					local312 = local219;
					if (Static1.anInt9943 == 1) {
						local298 = local223;
						local294 = Static299.anInt5764 - local223;
					}
					local324 = local310;
				} else {
					local305 = -local219;
					local324 = 0;
					local310 = Static193.anInt3732 + local219;
					local312 = local305;
					if (Static1.anInt9943 == 1) {
						local298 = -local223;
						local294 = 0;
					}
				}
				@Pc(347) int local347 = 0;
				@Pc(360) int local360;
				@Pc(357) int local357;
				@Pc(362) int local362;
				@Pc(364) int local364;
				@Pc(382) int local382;
				if (local221 < 0) {
					local357 = Static206.anInt3873 + local221;
					local360 = -local221;
					local362 = 0;
					local364 = local360;
					if (Static1.anInt9943 == 1) {
						local290 = 0;
						local292 = -local225;
						local347 = Static31.anInt495 + local225;
						local296 = local292;
					}
					local382 = local360;
				} else {
					local360 = 0;
					local357 = Static206.anInt3873 - local221;
					local362 = local357;
					local364 = local221;
					if (Static1.anInt9943 == 1) {
						local296 = 0;
						local290 = Static31.anInt495 - local225;
						local292 = local225;
						local347 = local290;
					}
					local382 = 0;
				}
				@Pc(418) Class156 local418 = Static281.aClass270_1.aClass156_6;
				@Pc(434) int local434;
				for (@Pc(425) Class28_Sub7 local425 = (Class28_Sub7) local418.method3776(); local425 != null; local425 = (Class28_Sub7) local418.method3783()) {
					@Pc(430) Class28_Sub9[] local430 = local425.aClass28_Sub9Array1;
					@Pc(432) boolean local432 = true;
					for (local434 = 0; local434 < local430.length; local434++) {
						@Pc(440) Class28_Sub9 local440 = local430[local434];
						@Pc(443) int local443 = local440.anInt10431;
						@Pc(446) int local446 = local440.anInt10433;
						@Pc(449) int local449 = local440.anInt10432;
						@Pc(452) int local452 = local440.anInt10430;
						@Pc(459) int local459;
						local440.anInt10432 = local459 = local449 - local219;
						@Pc(467) int local467;
						local440.anInt10431 = local467 = local443 - local219;
						@Pc(474) int local474;
						local440.anInt10433 = local474 = local446 - local221;
						@Pc(482) int local482;
						local440.anInt10430 = local482 = local452 - local221;
						@Pc(486) int local486 = local440.anInt10434;
						if (local432) {
							@Pc(502) int local502 = (local467 < local459 ? local467 : local459) - local486;
							if (local502 <= Static193.anInt3732) {
								@Pc(522) int local522 = (local474 >= local482 ? local482 : local474) - local486;
								if (Static206.anInt3873 >= local522) {
									@Pc(534) int local534 = local486 + (local459 <= local467 ? local467 : local459);
									if (local534 >= 0) {
										@Pc(553) int local553 = (local482 <= local474 ? local474 : local482) + local486;
										if (local553 >= 0) {
											local432 = false;
										}
									}
								}
							}
						}
					}
					if (local432) {
						local425.method9022();
						Static334.method5129(local425);
					}
				}
				if (Static1.anInt9943 == 0) {
					Static374.aClass65_12.method6877(Static528.anInterface15_1);
				}
				Static374.aClass65_12.F(-local219, -local221);
				Static374.aClass65_12.b(local305, local360, local310, local357, local227);
				Static564.method5794(Static141.aDouble4 + local227);
				Static508.aDouble21 = Static141.aDouble4 + local227;
				if (Static1.anInt9943 == 1) {
					Static190.anInt5142 = local34;
					Static562.anInt9142 = local20 - local219 - Static250.anInt4569;
					Static26.anInt347 = local36;
					Static193.anInt3729 = local24 - Static469.anInt7905 - local221;
					Static374.aClass65_12.DA(Static562.anInt9142, Static193.anInt3729, Static190.anInt5142, Static26.anInt347);
				} else {
					Static190.anInt5142 = local34;
					Static193.anInt3729 = Static414.anInt7335 + local24 - local221 - Static469.anInt7905;
					Static562.anInt9142 = Static5.anInt59 + local20 - local219 - Static250.anInt4569;
					Static26.anInt347 = local36;
					Static374.aClass65_12.DA(Static562.anInt9142, Static193.anInt3729, Static190.anInt5142, Static26.anInt347);
				}
				Static599.method8203(Static281.aClass270_1);
				if (local364 > 0) {
					Static374.aClass65_12.KA(0, local362, Static193.anInt3732, local364 + local362);
					Static374.aClass65_12.ya();
					Static374.aClass65_12.GA(Static458.anInt7779);
					Static641.method8652(arg2, arg7, arg13, arg15, arg0, arg14, arg6, arg11, arg9, arg10, arg5, arg8, arg12, arg3, arg1, arg4, 1, false);
				}
				if (local312 > 0) {
					Static374.aClass65_12.KA(local324, local382, local324 + local312, local382 - -local357);
					Static374.aClass65_12.ya();
					Static374.aClass65_12.GA(Static458.anInt7779);
					Static641.method8652(arg2, arg7, arg13, arg15, arg0, arg14, arg6, arg11, arg9, arg10, arg5, arg8, arg12, arg3, arg1, arg4, 1, false);
				}
				Static374.aClass65_12.la();
				Static424.method6286();
				if (Static1.anInt9943 == 0) {
					Static374.aClass65_12.method6959();
				}
				Static469.anInt7905 += local221;
				Static141.aDouble4 += local227;
				Static250.anInt4569 += local219;
				Static25.anInt344 = local129 + Static414.anInt7335 - Static469.anInt7905;
				Static147.anInt3008 = Static5.anInt59 + local107 - Static250.anInt4569;
				if (Static1.anInt9943 == 1) {
					Static494.anInt8274 += local225;
					Static109.anInt2331 += local223;
					for (@Pc(795) int local795 = 0; local795 < Static31.anInt495; local795++) {
						@Pc(807) int local807 = Static17.method232(local795 + Static494.anInt8274, Static31.anInt495) * Static299.anInt5764;
						for (local434 = 0; local434 < Static299.anInt5764; local434++) {
							@Pc(821) int local821 = local807 + Static17.method232(Static109.anInt2331 + local434, Static299.anInt5764);
							@Pc(857) boolean local857 = local795 >= local290 && local795 < local292 + local290 || local296 <= local795 && local296 + local347 > local795 && local294 <= local434 && local434 < local298 + local294;
							Static420.anInterface15Array5[local821].method8681(Static597.anInt9791 * local434, Static382.anInt6778 * local795, Static597.anInt9791, Static382.anInt6778, local857);
						}
					}
				}
			} else {
				Static375.aBoolean591 = true;
			}
		}
		if (Static375.aBoolean591) {
			Static250.anInt4569 = 0;
			Static147.anInt3008 = Static5.anInt59;
			Static469.anInt7905 = 0;
			Static25.anInt344 = Static414.anInt7335;
			Static486.anInt8169 = arg13;
			Static160.anInt3195 = arg15;
			Static141.aDouble4 = 0.0D;
			Static3.anInt13 = arg7;
			if (Static1.anInt9943 == 0) {
				Static374.aClass65_12.method6877(Static528.anInterface15_1);
			}
			Static374.aClass65_12.la();
			Static374.aClass65_12.ya();
			Static374.aClass65_12.GA(Static458.anInt7779);
			Static504.aClass254_7.method7360(Static3.anInt13, Static486.anInt8169, Static160.anInt3195, Static35.anInt561, Static273.anInt5013, Static184.anInt3598);
			Static374.aClass65_12.method6891(Static504.aClass254_7);
			if (Static1.anInt9943 == 1) {
				Static193.anInt3729 = local24;
				Static562.anInt9142 = local20;
				Static190.anInt5142 = local34;
				Static26.anInt347 = local36;
				Static374.aClass65_12.DA(Static562.anInt9142, Static193.anInt3729, Static190.anInt5142, Static26.anInt347);
			} else {
				Static193.anInt3729 = Static414.anInt7335 + local24;
				Static26.anInt347 = local36;
				Static562.anInt9142 = Static5.anInt59 + local20;
				Static190.anInt5142 = local34;
				Static374.aClass65_12.DA(Static562.anInt9142, Static193.anInt3729, Static190.anInt5142, Static26.anInt347);
			}
			Static508.aDouble21 = 0.0D;
			Static281.aClass270_1.method6362();
			Static599.method8203(Static281.aClass270_1);
			Static641.method8652(arg2, arg7, arg13, arg15, arg0, arg14, arg6, arg11, arg9, arg10, arg5, arg8, arg12, arg3, arg1, arg4, 1, false);
			Static424.method6286();
			Static375.aBoolean591 = false;
			if (Static1.anInt9943 == 0) {
				Static374.aClass65_12.method6959();
			}
			if (Static1.anInt9943 == 1) {
				Static559.method7736();
			}
		}
		if (Static1.anInt9943 == 0) {
			Static528.anInterface15_1.method8680(Static147.anInt3008, Static25.anInt344, Static154.anInt3151, Static513.anInt8561, 0, 0);
		}
		Static10.anInt165++;
		Static564.method5794(Static141.aDouble4);
		Static290.aDouble9 = Static141.aDouble4;
		if (Static1.anInt9943 == 0 || Static1.anInt9943 == 2) {
			if (Static1.anInt9943 == 2) {
				Static374.aClass65_12.GA(Static458.anInt7779);
				Static374.aClass65_12.ya();
			}
			Static566.anInt9195 = Static5.anInt59 + local20 - Static147.anInt3008 - Static250.anInt4569;
			Static245.anInt778 = local36;
			Static527.anInt8741 = local34;
			Static401.anInt7138 = local24 + Static414.anInt7335 - Static25.anInt344 - Static469.anInt7905;
			Static374.aClass65_12.DA(Static566.anInt9195, Static401.anInt7138, Static527.anInt8741, Static245.anInt778);
		} else if (Static1.anInt9943 == 1) {
			Static245.anInt778 = local36;
			Static527.anInt8741 = local34;
			Static566.anInt9195 = local20 - Static250.anInt4569;
			Static401.anInt7138 = local24 - Static469.anInt7905;
			Static374.aClass65_12.DA(Static566.anInt9195, Static401.anInt7138, Static527.anInt8741, Static245.anInt778);
			Static374.aClass65_12.KA(Static147.anInt3008, Static25.anInt344, Static154.anInt3151 + Static147.anInt3008, Static513.anInt8561 + Static25.anInt344);
		}
		Static641.method8652(arg2, arg7, arg13, arg15, arg0, arg14, arg6, arg11, arg9, arg10, arg5, arg8, arg12, arg3, arg1, arg4, Static1.anInt9943 == 2 ? 0 : 2, Static1.anInt9943 == 1);
		Static374.aClass65_12.la();
		Static374.aClass65_12.DA(local20, local24, local28, local32);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)Lclient!lia;")
	public static Class215 method2983() {
		return Static661.method8825();
	}
}
