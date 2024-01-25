import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qja", name = "I", descriptor = "I")
	public static int anInt7907 = -1;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!lc;ILjava/awt/Frame;)V")
	public static void method6885(@OriginalArg(0) Class207 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class281 local10 = arg0.method4578(arg1);
			while (local10.anInt7338 == 0) {
				Static491.method6679(10L);
			}
			if (local10.anInt7338 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static491.method6679(100L);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(BILjava/awt/Canvas;Lclient!d;Lclient!bt;)Lclient!ha;")
	public static Class33 method6886(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface9 arg2, @OriginalArg(4) Class34 arg3) {
		if (!Static667.method8904()) {
			throw new RuntimeException("");
		} else if (Static678.method8984("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg1, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class33_Sub2_Sub1 local60 = new Class33_Sub2_Sub1(local29, arg1, local39, arg2, arg3, arg0);
			local60.method8281();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILclient!ha;ILclient!kq;I)V")
	public static void method6887(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1 local10 = arg2.method4428(arg0);
		if (local10 == null) {
			return;
		}
		arg0.KA(arg3, arg1, arg2.anInt5035 + arg3, arg1 - -arg2.anInt4994);
		if (Static102.anInt10343 == 2 || Static102.anInt10343 == 5 || Static307.aClass17_68 == null) {
			arg0.A(-16777216, local10, arg3, arg1);
			return;
		}
		@Pc(45) int local45;
		@Pc(57) int local57;
		@Pc(54) int local54;
		@Pc(63) int local63;
		if (Static259.anInt4200 == 4) {
			local63 = 4096;
			local45 = Static443.anInt6913;
			local57 = Static149.anInt2728;
			local54 = (int) -Static642.aFloat230 & 0x3FFF;
		} else {
			local45 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925;
			local54 = (int) -Static642.aFloat230 + Static354.anInt5391 & 0x3FFF;
			local57 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917;
			local63 = 4096 - Static338.anInt5228 * 16;
		}
		@Pc(90) int local90 = local45 / 128 + 48 + 208 - Static224.anInt3557 * 2;
		@Pc(108) int local108 = Static267.anInt4309 * 4 + 48 - (Static267.anInt4309 - 104) * 2 - local57 / 128;
		Static307.aClass17_68.method5258((float) arg3 + (float) arg2.anInt5035 / 2.0F, (float) arg1 + (float) arg2.anInt4994 / 2.0F, (float) local90, (float) local108, local63, local54 << 2, local10, arg3, arg1);
		@Pc(159) int local159;
		@Pc(168) int local168;
		@Pc(179) int local179;
		@Pc(190) int local190;
		for (@Pc(142) Class4_Sub24 local142 = (Class4_Sub24) Static148.aClass163_17.method3639(); local142 != null; local142 = (Class4_Sub24) Static148.aClass163_17.method3640()) {
			@Pc(147) int local147 = local142.anInt4156;
			local159 = (Static545.aClass225_3.anIntArray422[local147] >> 14 & 0x3FFF) - Static445.anInt6949;
			local168 = (Static545.aClass225_3.anIntArray422[local147] & 0x3FFF) - Static321.anInt5000;
			local179 = local159 * 4 + 2 - local45 / 128;
			local190 = local168 * 4 + 2 - local57 / 128;
			Static257.method3717(local190, arg2, arg3, arg1, local10, arg0, Static545.aClass225_3.anIntArray423[local147], local179);
		}
		for (local159 = 0; local159 < Static612.anInt9404; local159++) {
			local168 = Static59.anIntArray85[local159] * 4 + 2 - local45 / 128;
			local179 = Static91.anIntArray117[local159] * 4 + 2 - local57 / 128;
			@Pc(245) Class342 local245 = Static441.aClass74_169.method2075(Static573.anIntArray634[local159]);
			if (local245.anIntArray620 != null) {
				local245 = local245.method7495(Static526.aClass293_1);
				if (local245 == null || local245.anInt8712 == -1) {
					continue;
				}
			}
			Static257.method3717(local179, arg2, arg3, arg1, local10, arg0, local245.anInt8712, local168);
		}
		@Pc(328) int local328;
		@Pc(339) int local339;
		for (@Pc(286) Class4_Sub7 local286 = (Class4_Sub7) Static406.aClass66_28.method1992(); local286 != null; local286 = (Class4_Sub7) Static406.aClass66_28.method1984()) {
			local179 = (int) (local286.aLong307 >> 28 & 0x3L);
			if (local179 == Static619.anInt9724) {
				local190 = (int) (local286.aLong307 & 0x3FFFL) - Static445.anInt6949;
				@Pc(318) int local318 = (int) (local286.aLong307 >> 14 & 0x3FFFL) - Static321.anInt5000;
				local328 = local190 * 4 + 2 - local45 / 128;
				local339 = local318 * 4 + 2 - local57 / 128;
				Static559.method7427(local339, Static338.aClass17Array10[0], local328, local10, arg1, arg3, arg2);
			}
		}
		@Pc(425) int local425;
		for (local179 = 0; local179 < Static105.anInt2131; local179++) {
			@Pc(370) Class4_Sub45 local370 = (Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local179]);
			if (local370 != null) {
				@Pc(375) Class3_Sub1_Sub2_Sub2_Sub2 local375 = local370.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				if (local375.method8531() && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 == local375.aByte141) {
					@Pc(387) Class345 local387 = local375.aClass345_1;
					if (local387 != null && local387.anIntArray624 != null) {
						local387 = local387.method7529(Static526.aClass293_1);
					}
					if (local387 != null && local387.aBoolean697 && local387.aBoolean699) {
						local339 = local375.anInt9925 / 128 - local45 / 128;
						local425 = local375.anInt9917 / 128 - local57 / 128;
						if (local387.anInt8768 == -1) {
							Static559.method7427(local425, Static338.aClass17Array10[1], local339, local10, arg1, arg3, arg2);
						} else {
							Static257.method3717(local425, arg2, arg3, arg1, local10, arg0, local387.anInt8768, local339);
						}
					}
				}
			}
		}
		local190 = Static518.anInt10290;
		@Pc(462) int[] local462 = Static489.anIntArray519;
		@Pc(513) int local513;
		@Pc(517) int local517;
		@Pc(542) int local542;
		for (local328 = 0; local328 < local190; local328++) {
			@Pc(472) Class3_Sub1_Sub2_Sub2_Sub1 local472 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local462[local328]];
			if (local472 != null && local472.method3528() && !local472.aBoolean293 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 != local472 && local472.aByte141 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141) {
				local425 = local472.anInt9925 / 128 - local45 / 128;
				local513 = local472.anInt9917 / 128 - local57 / 128;
				@Pc(515) boolean local515 = false;
				for (local517 = 0; local517 < Static450.anInt7035; local517++) {
					if (local472.aString37.equals(Static289.aStringArray20[local517]) && Static151.anIntArray198[local517] != 0) {
						local515 = true;
						break;
					}
				}
				@Pc(540) boolean local540 = false;
				for (local542 = 0; local542 < Static596.anInt9157; local542++) {
					if (local472.aString37.equals(Static547.aClass275Array1[local542].aString90)) {
						local540 = true;
						break;
					}
				}
				@Pc(562) boolean local562 = false;
				if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3956 != 0 && local472.anInt3956 != 0 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3956 == local472.anInt3956) {
					local562 = true;
				}
				if (local472.aBoolean292) {
					Static559.method7427(local513, Static338.aClass17Array10[6], local425, local10, arg1, arg3, arg2);
				} else if (local562) {
					Static559.method7427(local513, Static338.aClass17Array10[4], local425, local10, arg1, arg3, arg2);
				} else if (local472.aBoolean291) {
					Static559.method7427(local513, Static338.aClass17Array10[7], local425, local10, arg1, arg3, arg2);
				} else if (local515) {
					Static559.method7427(local513, Static338.aClass17Array10[3], local425, local10, arg1, arg3, arg2);
				} else if (local540) {
					Static559.method7427(local513, Static338.aClass17Array10[5], local425, local10, arg1, arg3, arg2);
				} else {
					Static559.method7427(local513, Static338.aClass17Array10[2], local425, local10, arg1, arg3, arg2);
				}
			}
		}
		@Pc(673) Class82[] local673 = Static9.aClass82Array41;
		@Pc(761) int local761;
		for (local425 = 0; local425 < local673.length; local425++) {
			@Pc(681) Class82 local681 = local673[local425];
			if (local681 != null && local681.anInt2225 != 0 && Static177.anInt3088 % 20 < 10) {
				@Pc(725) int local725;
				if (local681.anInt2225 == 1) {
					@Pc(710) Class4_Sub45 local710 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local681.anInt2224);
					if (local710 != null) {
						@Pc(715) Class3_Sub1_Sub2_Sub2_Sub2 local715 = local710.aClass3_Sub1_Sub2_Sub2_Sub2_2;
						local725 = local715.anInt9925 / 128 - local45 / 128;
						local542 = local715.anInt9917 / 128 - local57 / 128;
						Static521.method7029(local10, arg1, local542, arg3, 360000L, arg2, local725, local681.anInt2230);
					}
				}
				if (local681.anInt2225 == 2) {
					local761 = local681.anInt2227 / 128 - local45 / 128;
					local517 = local681.anInt2233 / 128 - local57 / 128;
					@Pc(777) long local777 = (long) (local681.anInt2232 << 7);
					@Pc(781) long local781 = local777 * local777;
					Static521.method7029(local10, arg1, local517, arg3, local781, arg2, local761, local681.anInt2230);
				}
				if (local681.anInt2225 == 10 && local681.anInt2224 >= 0 && Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20.length > local681.anInt2224) {
					@Pc(814) Class3_Sub1_Sub2_Sub2_Sub1 local814 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local681.anInt2224];
					if (local814 != null) {
						local517 = local814.anInt9925 / 128 - local45 / 128;
						local725 = local814.anInt9917 / 128 - local57 / 128;
						Static521.method7029(local10, arg1, local725, arg3, 360000L, arg2, local517, local681.anInt2230);
					}
				}
			}
		}
		if (Static259.anInt4200 == 4) {
			return;
		}
		if (Static78.anInt1643 != 0) {
			local513 = Static78.anInt1643 * 4 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() * 2 + 2 - local45 / 128 - 2;
			local761 = Static110.anInt2183 * 4 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() * 2 + 2 - local57 / 128 - 2;
			Static559.method7427(local761, Static388.aClass17Array13[Static63.aBoolean88 ? 1 : 0], local513, local10, arg1, arg3, arg2);
		}
		if (!Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aBoolean293) {
			arg0.method8103(arg2.anInt5035 / 2 + arg3 - 1, arg1 + -1 - -(arg2.anInt4994 / 2), -1, 3, 3);
			return;
		}
	}

	@OriginalMember(owner = "client!qja", name = "e", descriptor = "(B)Z")
	public static boolean method6888() {
		@Pc(15) Class4_Sub26 local15 = (Class4_Sub26) Static281.aClass163_25.method3639();
		if (local15 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local15.anInt4436; local21++) {
			if (local15.aClass281Array1[local21] != null && local15.aClass281Array1[local21].anInt7338 == 0) {
				return false;
			}
			if (local15.aClass281Array2[local21] != null && local15.aClass281Array2[local21].anInt7338 == 0) {
				return false;
			}
		}
		return true;
	}
}
