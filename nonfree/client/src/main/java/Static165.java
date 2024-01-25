import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!eq;")
	public static Class66 aClass66_8;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!fe;")
	public static Class74 aClass74_15 = new Class74(64);

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public static int anInt3313 = 0;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_160 = new Class123(29, 0);

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "F")
	public static float aFloat28 = 1024.0F;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILclient!ts;ILclient!eq;)V")
	public static void method2740(@OriginalArg(1) int arg0, @OriginalArg(2) Class239 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class66 arg3) {
		@Pc(10) Class22 local10 = arg1.method5734(arg3);
		if (local10 == null) {
			return;
		}
		arg3.method5044(arg2, arg0, arg1.anInt6898 + arg2, arg1.anInt6899 + arg0);
		if (Static420.anInt7505 == 2 || Static420.anInt7505 == 5 || Static405.aClass87_29 == null) {
			arg3.method5005(local10, arg2, arg0);
			return;
		}
		@Pc(61) int local61;
		@Pc(51) int local51;
		@Pc(57) int local57;
		@Pc(59) int local59;
		if (Static429.anInt7656 == 4) {
			local51 = Static202.anInt3800;
			local57 = (int) -Static265.aFloat51 & 0x3FFF;
			local59 = 4096;
			local61 = Static261.anInt4746;
		} else {
			local59 = 4096 - Static280.anInt5012 * 16;
			local57 = Static439.anInt418 + (int) -Static265.aFloat51 & 0x3FFF;
			local51 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207;
			local61 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202;
		}
		@Pc(97) int local97 = local61 / 32 + 208 + 48 - Static181.anInt3574 * 2;
		@Pc(115) int local115 = Static117.anInt2450 * 4 + 208 + 48 - Static117.anInt2450 * 2 - local51 / 32;
		Static405.aClass87_29.method6569((float) arg2 + (float) arg1.anInt6898 / 2.0F, (float) arg1.anInt6899 / 2.0F + (float) arg0, (float) local97, (float) local115, local59, local57 << 2, local10, arg2, arg0);
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(187) int local187;
		@Pc(197) int local197;
		for (@Pc(149) Class6_Sub39 local149 = (Class6_Sub39) Static220.aClass244_19.method5976(); local149 != null; local149 = (Class6_Sub39) Static220.aClass244_19.method5964()) {
			@Pc(154) int local154 = local149.anInt6429;
			local166 = (Static39.aClass202_3.anIntArray365[local154] >> 14 & 0x3FFF) - Static2.anInt6396;
			local176 = (Static39.aClass202_3.anIntArray365[local154] & 0x3FFF) - Static348.anInt6273;
			local187 = local166 * 4 + 2 - local61 / 32;
			local197 = local176 * 4 + 2 - local51 / 32;
			Static311.method4533(local187, arg3, arg2, local10, arg1, local197, Static39.aClass202_3.anIntArray366[local154], arg0);
		}
		for (local166 = 0; local166 < Static365.anInt6515; local166++) {
			local176 = Static357.anIntArray412[local166] * 4 + 2 - local61 / 32;
			local187 = Static44.anIntArray75[local166] * 4 + 2 - local51 / 32;
			@Pc(254) Class106 local254 = Static448.aClass104_4.method2616(Static372.anIntArray461[local166]);
			if (local254.anIntArray188 != null) {
				local254 = local254.method2625(Static393.aClass207_1);
				if (local254 == null || local254.anInt3162 == -1) {
					continue;
				}
			}
			Static311.method4533(local176, arg3, arg2, local10, arg1, local187, local254.anInt3162, arg0);
		}
		for (@Pc(295) Class6_Sub22 local295 = (Class6_Sub22) aClass74_15.method1889(); local295 != null; local295 = (Class6_Sub22) aClass74_15.method1881()) {
			local187 = (int) (local295.aLong229 >> 28 & 0x3L);
			if (local187 == Static344.anInt6358) {
				local197 = (int) (local295.aLong229 & 0x3FFFL) * 4 + 2 - local61 / 32;
				@Pc(342) int local342 = (int) (local295.aLong229 >> 14 & 0x3FFFL) * 4 + 2 - local51 / 32;
				Static231.method6536(arg0, local197, local10, local342, Static192.aClass87Array10[0], arg2, arg1);
			}
		}
		@Pc(416) int local416;
		for (local187 = 0; local187 < Static136.anInt2887; local187++) {
			@Pc(370) Class3_Sub2_Sub1_Sub1 local370 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local187]];
			if (local370 != null && local370.method1325() && Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 == local370.aByte103) {
				@Pc(388) Class48 local388 = local370.aClass48_1;
				if (local388 != null && local388.anIntArray103 != null) {
					local388 = local388.method1378(Static393.aClass207_1);
				}
				if (local388 != null && local388.aBoolean131 && local388.aBoolean128) {
					local416 = local370.anInt7202 / 32 - local61 / 32;
					@Pc(425) int local425 = local370.anInt7207 / 32 - local51 / 32;
					if (local388.anInt1757 == -1) {
						Static231.method6536(arg0, local416, local10, local425, Static192.aClass87Array10[1], arg2, arg1);
					} else {
						Static311.method4533(local416, arg3, arg2, local10, arg1, local425, local388.anInt1757, arg0);
					}
				}
			}
		}
		local197 = Static95.anInt2186;
		@Pc(462) int[] local462 = Static178.anIntArray542;
		@Pc(500) int local500;
		@Pc(509) int local509;
		@Pc(513) int local513;
		for (local416 = 0; local416 < local197; local416++) {
			@Pc(472) Class3_Sub2_Sub1_Sub2 local472 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local462[local416]];
			if (local472 != null && local472.method5534() && local472 != Static302.aClass3_Sub2_Sub1_Sub2_2 && Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 == local472.aByte103) {
				local500 = local472.anInt7202 / 32 - local61 / 32;
				local509 = local472.anInt7207 / 32 - local51 / 32;
				@Pc(511) boolean local511 = false;
				for (local513 = 0; local513 < Static398.anInt2169; local513++) {
					if (local472.aString54.equals(Static314.aStringArray32[local513]) && Static137.anIntArray174[local513] != 0) {
						local511 = true;
						break;
					}
				}
				@Pc(540) boolean local540 = false;
				for (@Pc(542) int local542 = 0; local542 < Static338.anInt5890; local542++) {
					if (local472.aString54.equals(Static57.aClass128Array1[local542].aString25)) {
						local540 = true;
						break;
					}
				}
				@Pc(562) boolean local562 = false;
				if (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6644 != 0 && local472.anInt6644 != 0 && local472.anInt6644 == Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6644) {
					local562 = true;
				}
				if (local472.aBoolean422) {
					Static231.method6536(arg0, local500, local10, local509, Static192.aClass87Array10[6], arg2, arg1);
				} else if (local511) {
					Static231.method6536(arg0, local500, local10, local509, Static192.aClass87Array10[3], arg2, arg1);
				} else if (local540) {
					Static231.method6536(arg0, local500, local10, local509, Static192.aClass87Array10[5], arg2, arg1);
				} else if (local562) {
					Static231.method6536(arg0, local500, local10, local509, Static192.aClass87Array10[4], arg2, arg1);
				} else {
					Static231.method6536(arg0, local500, local10, local509, Static192.aClass87Array10[2], arg2, arg1);
				}
			}
		}
		@Pc(660) Class17[] local660 = Static122.aClass17Array1;
		@Pc(755) int local755;
		for (local500 = 0; local500 < local660.length; local500++) {
			@Pc(668) Class17 local668 = local660[local500];
			if (local668 != null && local668.anInt532 != 0 && Static66.anInt1741 % 20 < 10) {
				@Pc(728) int local728;
				if (local668.anInt532 == 1 && local668.anInt531 >= 0 && Static308.aClass3_Sub2_Sub1_Sub1Array1.length > local668.anInt531) {
					@Pc(707) Class3_Sub2_Sub1_Sub1 local707 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local668.anInt531];
					if (local707 != null) {
						local513 = local707.anInt7202 / 32 - local61 / 32;
						local728 = local707.anInt7207 / 32 - local51 / 32;
						Static207.method3185(arg0, arg1, local513, 360000L, local728, arg2, local10, local668.anInt537);
					}
				}
				if (local668.anInt532 == 2) {
					local755 = local668.anInt533 / 32 - local61 / 32;
					local513 = local668.anInt535 / 32 - local51 / 32;
					@Pc(771) long local771 = (long) (local668.anInt536 << 5);
					@Pc(775) long local775 = local771 * local771;
					Static207.method3185(arg0, arg1, local755, local775, local513, arg2, local10, local668.anInt537);
				}
				if (local668.anInt532 == 10 && local668.anInt531 >= 0 && local668.anInt531 < Static374.aClass3_Sub2_Sub1_Sub2Array1.length) {
					@Pc(810) Class3_Sub2_Sub1_Sub2 local810 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local668.anInt531];
					if (local810 != null) {
						local513 = local810.anInt7202 / 32 - local61 / 32;
						local728 = local810.anInt7207 / 32 - local51 / 32;
						Static207.method3185(arg0, arg1, local513, 360000L, local728, arg2, local10, local668.anInt537);
					}
				}
			}
		}
		if (Static429.anInt7656 == 4) {
			return;
		}
		if (Static114.anInt5655 != 0) {
			local509 = Static114.anInt5655 * 4 + (Static302.aClass3_Sub2_Sub1_Sub2_2.method5521() + -1) * 2 + 2 - local61 / 32;
			local755 = Static346.anInt6243 * 4 + Static302.aClass3_Sub2_Sub1_Sub2_2.method5521() * 2 + 2 - local51 / 32 - 2;
			Static231.method6536(arg0, local509, local10, local755, Static201.aClass87Array14[Static409.aBoolean467 ? 1 : 0], arg2, arg1);
		}
		arg3.method5035(3, arg0 + arg1.anInt6899 / 2 - 1, -1, arg1.anInt6898 / 2 + arg2 - 1, 3);
		return;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public static void method2741(@OriginalArg(0) int arg0) {
		Static138.anInt4528 = -1;
		Static224.anInt4061 = 3;
		Static373.anInt6709 = 100;
		Static224.anInt4054 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!hn;BI)V")
	public static void method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class6_Sub19 local16 = (Class6_Sub19) Static182.aClass244_16.method5976(); local16 != null; local16 = (Class6_Sub19) Static182.aClass244_16.method5964()) {
			if (arg0 == local16.anInt3589 && local16.anInt3594 == arg3 << 7 && arg1 << 7 == local16.anInt3596 && local16.aClass106_1.anInt3167 == arg2.anInt3167) {
				if (local16.aClass6_Sub4_Sub1_3 != null) {
					Static360.aClass6_Sub4_Sub4_2.method5907(local16.aClass6_Sub4_Sub1_3);
					local16.aClass6_Sub4_Sub1_3 = null;
				}
				if (local16.aClass6_Sub4_Sub1_2 != null) {
					Static360.aClass6_Sub4_Sub4_2.method5907(local16.aClass6_Sub4_Sub1_2);
					local16.aClass6_Sub4_Sub1_2 = null;
				}
				local16.method6525();
				return;
			}
		}
	}
}
