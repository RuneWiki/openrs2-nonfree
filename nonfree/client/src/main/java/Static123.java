import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hm", name = "S", descriptor = "Lclient!ij;")
	public static Class93 aClass93_49;

	@OriginalMember(owner = "client!hm", name = "P", descriptor = "[I")
	public static final int[] anIntArray224 = new int[3];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!iq;I)Z")
	public static boolean method2170(@OriginalArg(0) Interface5 arg0) {
		@Pc(9) Class156 local9 = Static111.method1967(arg0.method5910());
		if (local9.anInt4766 == -1) {
			return true;
		} else {
			@Pc(20) Class213 local20 = Static346.method5925(local9.anInt4766);
			return local20.anInt6739 == -1 ? true : local20.method5985();
		}
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)V")
	public static void method2171() {
		Static149.anImage3 = null;
		Static77.aFont1 = null;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(III)V")
	public static void method2173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static92.method1683(arg1)) {
			Static101.method1807(arg0, Static304.aClass201ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)V")
	public static void method2174() {
		for (@Pc(7) int local7 = 0; local7 < Static195.anInt3883; local7++) {
			@Pc(13) int local13 = Static76.anIntArray118[local7];
			@Pc(17) Class4_Sub5_Sub2_Sub2 local17 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local13];
			@Pc(21) int local21 = Static187.aClass5_Sub12_Sub2_4.method5115();
			if ((local21 & 0x4) != 0) {
				local21 += Static187.aClass5_Sub12_Sub2_4.method5115() << 8;
			}
			@Pc(41) int local41;
			@Pc(58) int local58;
			if ((local21 & 0x200) != 0) {
				local41 = Static187.aClass5_Sub12_Sub2_4.method5086();
				@Pc(44) int[] local44 = new int[local41];
				@Pc(47) int[] local47 = new int[local41];
				@Pc(50) int[] local50 = new int[local41];
				for (@Pc(52) int local52 = 0; local52 < local41; local52++) {
					local58 = Static187.aClass5_Sub12_Sub2_4.method5113();
					if (local58 == 65535) {
						local58 = -1;
					}
					local44[local52] = local58;
					local47[local52] = Static187.aClass5_Sub12_Sub2_4.method5086();
					local50[local52] = Static187.aClass5_Sub12_Sub2_4.method5113();
				}
				Static284.method4945(local50, local44, local47, local17);
			}
			@Pc(108) int local108;
			if ((local21 & 0x10) != 0) {
				local41 = Static187.aClass5_Sub12_Sub2_4.method5060();
				local108 = Static187.aClass5_Sub12_Sub2_4.method5101();
				local17.method4809(Static283.anInt5563, local108, local41);
				local17.anInt5359 = Static283.anInt5563 + 300;
				local17.anInt5376 = Static187.aClass5_Sub12_Sub2_4.method5086();
			}
			if ((local21 & 0x80) != 0) {
				local41 = Static187.aClass5_Sub12_Sub2_4.method5113();
				if (local41 == 65535) {
					local41 = -1;
				}
				local108 = Static187.aClass5_Sub12_Sub2_4.method5068();
				Static96.method1763(local108, local41, local17);
			}
			if ((local21 & 0x100) != 0) {
				local41 = Static187.aClass5_Sub12_Sub2_4.method5113();
				local17.anInt5375 = Static187.aClass5_Sub12_Sub2_4.method5086();
				local17.anInt5352 = Static187.aClass5_Sub12_Sub2_4.method5068();
				local17.aBoolean448 = (local41 & 0x8000) != 0;
				local17.anInt5379 = local41 & 0x7FFF;
				local17.anInt5393 = local17.anInt5375 + Static283.anInt5563 + local17.anInt5379;
			}
			if ((local21 & 0x1) != 0) {
				if (local17.aClass106_1.method2822()) {
					Static161.method2843(local17);
				}
				local17.method4821(Static22.method442(Static187.aClass5_Sub12_Sub2_4.method5075()));
				local17.method4813(local17.aClass106_1.anInt3135);
				local17.anInt5392 = local17.aClass106_1.anInt3130 << 3;
				if (local17.aClass106_1.method2822()) {
					Static114.method1985(null, 0, local17.anIntArray522[0], null, local17, local17.anIntArray523[0], Static239.anInt4811);
				}
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt5362 = Static187.aClass5_Sub12_Sub2_4.method5113();
				if (local17.anInt5362 == 65535) {
					local17.anInt5362 = -1;
				}
			}
			if ((local21 & 0x8) != 0) {
				local41 = Static187.aClass5_Sub12_Sub2_4.method5113();
				if (local41 == 65535) {
					local41 = -1;
				}
				local108 = Static187.aClass5_Sub12_Sub2_4.method5074();
				@Pc(286) boolean local286 = true;
				@Pc(350) Class89 local350;
				if (local41 != -1 && local17.anInt5398 != -1) {
					@Pc(301) Class163 local301;
					if (local41 == local17.anInt5398) {
						local301 = Static325.method5628(local41);
						if (local301.aBoolean418 && local301.anInt5031 != -1) {
							local350 = Static162.method2849(local301.anInt5031);
							local58 = local350.anInt2468;
							if (local58 == 0) {
								local286 = false;
							} else if (local58 == 1) {
								local286 = true;
							} else if (local58 == 2) {
								local286 = false;
								local17.anInt5353 = 0;
							}
						}
					} else {
						local301 = Static325.method5628(local41);
						@Pc(306) Class163 local306 = Static325.method5628(local17.anInt5398);
						if (local301.anInt5031 != -1 && local306.anInt5031 != -1) {
							@Pc(320) Class89 local320 = Static162.method2849(local301.anInt5031);
							@Pc(325) Class89 local325 = Static162.method2849(local306.anInt5031);
							if (local325.anInt2465 > local320.anInt2465) {
								local286 = false;
							}
						}
					}
				}
				if (local286) {
					local17.anInt5404 = 0;
					local17.anInt5398 = local41;
					local17.anInt5358 = 0;
					local17.anInt5369 = 1;
					local17.anInt5373 = local108 >> 16;
					local17.anInt5395 = (local108 & 0xFFFF) + Static283.anInt5563;
					if (Static283.anInt5563 < local17.anInt5395) {
						local17.anInt5404 = -1;
					}
					if (local17.anInt5398 != -1 && local17.anInt5395 == Static283.anInt5563) {
						@Pc(432) int local432 = Static325.method5628(local17.anInt5398).anInt5031;
						if (local432 != -1) {
							local350 = Static162.method2849(local432);
							if (local350 != null && local350.anIntArray245 != null) {
								Static311.method3258(local350, local17.anInt6631, false, 0, local17.anInt6632);
							}
						}
					}
				}
			}
			if ((local21 & 0x40) != 0) {
				local41 = Static187.aClass5_Sub12_Sub2_4.method5060();
				local108 = Static187.aClass5_Sub12_Sub2_4.method5068();
				local17.method4809(Static283.anInt5563, local108, local41);
			}
			if ((local21 & 0x20) != 0) {
				local17.aString53 = Static187.aClass5_Sub12_Sub2_4.method5064();
				local17.anInt5368 = 100;
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt5378 = Static187.aClass5_Sub12_Sub2_4.method5100();
				local17.anInt5380 = Static187.aClass5_Sub12_Sub2_4.method5100();
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIBIII)V")
	public static void method2175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class131[] local3 = Static149.aClass131Array1;
		for (@Pc(9) int local9 = 0; local9 < local3.length; local9++) {
			@Pc(15) Class131 local15 = local3[local9];
			if (local15 != null && local15.anInt3892 == 2) {
				Static92.method1678(local15.anInt3882 + (local15.anInt3885 - Static12.anInt3797 << 7), local15.anInt3891 * 2, arg3 >> 1, arg1 >> 1, (local15.anInt3879 - Static172.anInt4394 << 7) + local15.anInt3895);
				if (anIntArray224[0] > -1 && Static283.anInt5563 % 20 < 10) {
					Static50.aClass95Array5[local15.anInt3889].method5491(anIntArray224[0] + arg0 - 12, arg2 + (anIntArray224[1] - 28));
				}
			}
		}
	}
}
