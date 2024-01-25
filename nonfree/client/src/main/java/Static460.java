import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
	public static int anInt8088;

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
	public static int anInt8090;

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
	public static int anInt8092;

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "Lclient!da;")
	public static Class62 aClass62_9;

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_118 = new Class200(51, -2);

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "[I")
	public static final int[] anIntArray501 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLclient!qk;Lclient!ha;II)V")
	public static void method7013(@OriginalArg(1) Class279 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1 local10 = arg0.method7073(arg1);
		if (local10 == null) {
			return;
		}
		arg1.KA(arg2, arg3, arg2 + arg0.anInt8153, arg3 + arg0.anInt8141);
		if (Static51.anInt1431 == 2 || Static51.anInt1431 == 5 || Static499.aClass24_29 == null) {
			arg1.A(-16777216, local10, arg2, arg3);
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		@Pc(70) int local70;
		@Pc(62) int local62;
		if (Static305.anInt5422 == 4) {
			local70 = (int) -Static401.aFloat165 & 0x3FFF;
			local56 = Static349.anInt6751;
			local62 = 4096;
			local53 = Static602.anInt9811;
		} else {
			local53 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916;
			local56 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911;
			local62 = 4096 - Static517.anInt8961 * 16;
			local70 = (int) -Static401.aFloat165 + Static226.anInt1879 & 0x3FFF;
		}
		@Pc(97) int local97 = local53 / 128 + 48 + 208 - Static634.anInt10129 * 2;
		@Pc(115) int local115 = Static638.anInt10172 * 4 + 48 + 208 - local56 / 128 - Static638.anInt10172 * 2;
		Static499.aClass24_29.method8575((float) arg0.anInt8153 / 2.0F + (float) arg2, (float) arg3 + (float) arg0.anInt8141 / 2.0F, (float) local97, (float) local115, local62, local70 << 2, local10, arg2, arg3);
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(187) int local187;
		@Pc(197) int local197;
		for (@Pc(149) Class3_Sub19 local149 = (Class3_Sub19) Static568.aClass223_61.method5874(); local149 != null; local149 = (Class3_Sub19) Static568.aClass223_61.method5870()) {
			@Pc(154) int local154 = local149.anInt2696;
			local166 = (Static531.aClass156_8.anIntArray237[local154] >> 14 & 0x3FFF) - Static299.anInt5307;
			local176 = (Static531.aClass156_8.anIntArray237[local154] & 0x3FFF) - Static171.anInt3340;
			local187 = local166 * 4 + 2 - local53 / 128;
			local197 = local176 * 4 + 2 - local56 / 128;
			Static456.method6998(arg2, local197, local10, Static531.aClass156_8.anIntArray236[local154], local187, arg1, arg3, arg0);
		}
		for (local166 = 0; local166 < Static639.anInt10179; local166++) {
			local176 = Static349.anIntArray404[local166] * 4 + 2 - local53 / 128;
			local187 = Static378.anIntArray421[local166] * 4 + 2 - local56 / 128;
			@Pc(254) Class299 local254 = Static105.aClass302_1.method7466(Static39.anIntArray35[local166]);
			if (local254.anIntArray533 != null) {
				local254 = local254.method7418(Static373.aClass150_1);
				if (local254 == null || local254.anInt8681 == -1) {
					continue;
				}
			}
			Static456.method6998(arg2, local187, local10, local254.anInt8681, local176, arg1, arg3, arg0);
		}
		@Pc(343) int local343;
		@Pc(354) int local354;
		for (@Pc(295) Class3_Sub51 local295 = (Class3_Sub51) Static356.aClass280_28.method7110(); local295 != null; local295 = (Class3_Sub51) Static356.aClass280_28.method7108()) {
			local187 = (int) (local295.aLong276 >> 28 & 0x3L);
			if (Static176.anInt3422 == local187) {
				local197 = (int) (local295.aLong276 & 0x3FFFL) - Static299.anInt5307;
				@Pc(332) int local332 = (int) (local295.aLong276 >> 14 & 0x3FFFL) - Static171.anInt3340;
				local343 = local197 * 4 + 2 - local53 / 128;
				local354 = local332 * 4 + 2 - local56 / 128;
				Static506.method7464(arg2, Static255.aClass24Array11[0], local10, local343, local354, arg3, arg0);
			}
		}
		@Pc(446) int local446;
		for (local187 = 0; local187 < Static94.anInt2209; local187++) {
			@Pc(387) Class3_Sub28 local387 = (Class3_Sub28) Static551.aClass280_43.method7107((long) Static520.anIntArray594[local187]);
			if (local387 != null) {
				@Pc(392) Class4_Sub1_Sub2_Sub1_Sub1 local392 = local387.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				if (local392.method3333() && local392.aByte123 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123) {
					@Pc(408) Class109 local408 = local392.aClass109_1;
					if (local408 != null && local408.anIntArray147 != null) {
						local408 = local408.method2813(Static373.aClass150_1);
					}
					if (local408 != null && local408.aBoolean196 && local408.aBoolean200) {
						local354 = local392.anInt8916 / 128 - local53 / 128;
						local446 = local392.anInt8911 / 128 - local56 / 128;
						if (local408.anInt3035 == -1) {
							Static506.method7464(arg2, Static255.aClass24Array11[1], local10, local354, local446, arg3, arg0);
						} else {
							Static456.method6998(arg2, local446, local10, local408.anInt3035, local354, arg1, arg3, arg0);
						}
					}
				}
			}
		}
		local197 = Static274.anInt4964;
		@Pc(486) int[] local486 = Static70.anIntArray392;
		@Pc(532) int local532;
		@Pc(536) int local536;
		@Pc(564) int local564;
		for (local343 = 0; local343 < local197; local343++) {
			@Pc(496) Class4_Sub1_Sub2_Sub1_Sub2 local496 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local486[local343]];
			if (local496 != null && local496.method5079() && !local496.aBoolean409 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 != local496 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 == local496.aByte123) {
				local446 = local496.anInt8916 / 128 - local53 / 128;
				local532 = local496.anInt8911 / 128 - local56 / 128;
				@Pc(534) boolean local534 = false;
				for (local536 = 0; local536 < Static68.anInt1696; local536++) {
					if (local496.aString63.equals(Static422.aStringArray29[local536]) && Static117.anIntArray105[local536] != 0) {
						local534 = true;
						break;
					}
				}
				@Pc(562) boolean local562 = false;
				for (local564 = 0; local564 < Static70.anInt6477; local564++) {
					if (local496.aString63.equals(Static469.aClass69Array1[local564].aString12)) {
						local562 = true;
						break;
					}
				}
				@Pc(588) boolean local588 = false;
				if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5809 != 0 && local496.anInt5809 != 0 && local496.anInt5809 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5809) {
					local588 = true;
				}
				if (local496.aBoolean408) {
					Static506.method7464(arg2, Static255.aClass24Array11[6], local10, local446, local532, arg3, arg0);
				} else if (local534) {
					Static506.method7464(arg2, Static255.aClass24Array11[3], local10, local446, local532, arg3, arg0);
				} else if (local562) {
					Static506.method7464(arg2, Static255.aClass24Array11[5], local10, local446, local532, arg3, arg0);
				} else if (local588) {
					Static506.method7464(arg2, Static255.aClass24Array11[4], local10, local446, local532, arg3, arg0);
				} else {
					Static506.method7464(arg2, Static255.aClass24Array11[2], local10, local446, local532, arg3, arg0);
				}
			}
		}
		@Pc(685) Class251[] local685 = Static82.aClass251Array1;
		@Pc(766) int local766;
		for (local446 = 0; local446 < local685.length; local446++) {
			@Pc(693) Class251 local693 = local685[local446];
			if (local693 != null && local693.anInt7476 != 0 && Static101.anInt2262 % 20 < 10) {
				@Pc(732) int local732;
				if (local693.anInt7476 == 1) {
					@Pc(717) Class3_Sub28 local717 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local693.anInt7486);
					if (local717 != null) {
						@Pc(722) Class4_Sub1_Sub2_Sub1_Sub1 local722 = local717.aClass4_Sub1_Sub2_Sub1_Sub1_2;
						local732 = local722.anInt8916 / 128 - local53 / 128;
						local564 = local722.anInt8911 / 128 - local56 / 128;
						Static12.method832(local10, local564, arg3, 360000L, arg0, arg2, local693.anInt7480, local732);
					}
				}
				if (local693.anInt7476 == 2) {
					local766 = local693.anInt7487 / 128 - local53 / 128;
					local536 = local693.anInt7477 / 128 - local56 / 128;
					@Pc(782) long local782 = (long) (local693.anInt7485 << 7);
					@Pc(786) long local786 = local782 * local782;
					Static12.method832(local10, local536, arg3, local786, arg0, arg2, local693.anInt7480, local766);
				}
				if (local693.anInt7476 == 10 && local693.anInt7486 >= 0 && local693.anInt7486 < Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1.length) {
					@Pc(816) Class4_Sub1_Sub2_Sub1_Sub2 local816 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local693.anInt7486];
					if (local816 != null) {
						local536 = local816.anInt8916 / 128 - local53 / 128;
						local732 = local816.anInt8911 / 128 - local56 / 128;
						Static12.method832(local10, local732, arg3, 360000L, arg0, arg2, local693.anInt7480, local536);
					}
				}
			}
		}
		if (Static305.anInt5422 == 4) {
			return;
		}
		if (Static520.anInt9372 != 0) {
			local532 = Static520.anInt9372 * 4 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() * 2 + 2 - local53 / 128 - 2;
			local766 = Static300.anInt5337 * 4 + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() + -1) * 2 + 2 - local56 / 128;
			Static506.method7464(arg2, Static636.aClass24Array21[Static142.aBoolean634 ? 1 : 0], local10, local532, local766, arg3, arg0);
		}
		if (!Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aBoolean409) {
			arg1.method7528(arg0.anInt8153 / 2 + arg2 - 1, 3, 3, arg0.anInt8141 / 2 + arg3 - 1, -1);
			return;
		}
	}
}
