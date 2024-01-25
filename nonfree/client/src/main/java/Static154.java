import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_3 = new Class166(64);

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!wk;")
	public static final Class246 aClass246_8 = new Class246(512);

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZIIIILclient!nl;)V")
	public static void method2825(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class171 arg2) {
		Static198.aClass171_50 = arg2;
		Static304.anInt6543 = 10000;
		Static257.anInt4521 = arg1;
		Static356.anInt5999 = 0;
		Static391.anInt6626 = 1;
		Static192.aBoolean276 = false;
		Static361.anInt6051 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = Static81.aShort7 + (Static105.aShort29 - Static81.aShort7) * local7 / 100;
		@Pc(36) int local36 = local30 * arg0 >> 8;
		@Pc(43) int local43 = 16384 - arg2 & 0x3FFF;
		@Pc(50) int local50 = 16384 - arg3 & 0x3FFF;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = local36;
		if (local43 != 0) {
			local54 = -local36 * Class177.anIntArray843[local43] >> 15;
			local56 = Class177.anIntArray844[local43] * local36 >> 15;
		}
		if (local50 != 0) {
			local52 = local56 * Class177.anIntArray843[local50] >> 15;
			local56 = local56 * Class177.anIntArray844[local50] >> 15;
		}
		Static51.anInt1057 = arg1 - local56;
		Static235.anInt4191 = arg3;
		Static285.anInt4940 = arg4 - local54;
		Static14.anInt360 = arg2;
		Static288.anInt5007 = 0;
		Static224.anInt4006 = arg6 - local52;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
	public static void method2828() {
		if (Static216.anInt3923 == 5) {
			Static216.anInt3923 = 6;
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	public static void method2829() {
		for (@Pc(3) int local3 = 0; local3 < Static3.anInt135; local3++) {
			@Pc(9) int local9 = Static62.anIntArray267[local3]--;
			if (Static62.anIntArray267[local3] >= -10) {
				@Pc(86) Class130 local86 = Static276.aClass130Array1[local3];
				if (local86 == null) {
					local86 = Static400.method3010(Static329.aClass171_85, Static286.anIntArray982[local3], 0);
					if (local86 == null) {
						continue;
					}
					Static62.anIntArray267[local3] += local86.method3008();
					Static276.aClass130Array1[local3] = local86;
				}
				if (Static62.anIntArray267[local3] < 0) {
					@Pc(231) int local231;
					if (Static284.anIntArray971[local3] == 0) {
						local231 = Static56.anIntArray228[local3] * Static143.anInt2862 >> 8;
					} else {
						@Pc(130) int local130 = Static284.anIntArray971[local3] >> 24 & 0x3;
						if (Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 == local130) {
							@Pc(146) int local146 = (Static284.anIntArray971[local3] & 0xFF) * 128;
							@Pc(154) int local154 = Static284.anIntArray971[local3] >> 16 & 0xFF;
							@Pc(163) int local163 = local154 * 128 + 64 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390;
							if (local163 < 0) {
								local163 = -local163;
							}
							@Pc(176) int local176 = Static284.anIntArray971[local3] >> 8 & 0xFF;
							@Pc(186) int local186 = local176 * 128 + 64 - Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386;
							if (local186 < 0) {
								local186 = -local186;
							}
							@Pc(200) int local200 = local186 + local163 - 128;
							if (local200 > local146) {
								Static62.anIntArray267[local3] = -100;
								continue;
							}
							if (local200 < 0) {
								local200 = 0;
							}
							local231 = (local146 - local200) * Static330.anInt5659 * Static56.anIntArray228[local3] / local146 >> 8;
						} else {
							local231 = 0;
						}
					}
					if (local231 > 0) {
						@Pc(252) Class2_Sub15_Sub1 local252 = local86.method3009().method4338(Static123.aClass223_1);
						@Pc(257) Class2_Sub2_Sub2 local257 = Static402.method3420(local252, local231);
						local257.method3419(Static67.anIntArray273[local3] - 1);
						Static324.aClass2_Sub2_Sub1_2.method59(local257);
					}
					Static62.anIntArray267[local3] = -100;
				}
			} else {
				Static3.anInt135--;
				for (@Pc(25) int local25 = local3; local25 < Static3.anInt135; local25++) {
					Static286.anIntArray982[local25] = Static286.anIntArray982[local25 + 1];
					Static276.aClass130Array1[local25] = Static276.aClass130Array1[local25 + 1];
					Static67.anIntArray273[local25] = Static67.anIntArray273[local25 + 1];
					Static62.anIntArray267[local25] = Static62.anIntArray267[local25 + 1];
					Static284.anIntArray971[local25] = Static284.anIntArray971[local25 + 1];
					Static56.anIntArray228[local25] = Static56.anIntArray228[local25 + 1];
				}
				local3--;
			}
		}
		if (Static221.aBoolean428 && !Static361.method5260()) {
			if (Static322.anInt5529 != 0 && Static220.anInt3948 != -1) {
				method2825(Static220.anInt3948, Static322.anInt5529, Static233.aClass171_53);
			}
			Static221.aBoolean428 = false;
		} else if (Static322.anInt5529 != 0 && Static220.anInt3948 != -1 && !Static361.method5260()) {
			Static216.method3597(Static81.aClass11_24);
			Static372.aClass2_Sub16_Sub2_4.method5355(Static220.anInt3948);
			Static220.anInt3948 = -1;
		}
	}
}
