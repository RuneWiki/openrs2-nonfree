import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!up", name = "s", descriptor = "I")
	public static int anInt9836 = 0;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "[I")
	public static final int[] anIntArray563 = new int[25];

	@OriginalMember(owner = "client!up", name = "v", descriptor = "I")
	public static int anInt9838 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;BILclient!jfa;)V")
	public static void method8189(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class180 arg2) {
		@Pc(15) int local15;
		if (Static395.anIntArray385 != null && arg2.aByte49 >= arg1) {
			for (local15 = 0; local15 < Static395.anIntArray385.length; local15++) {
				if (Static395.anIntArray385[local15] != -1000000 && (Static395.anIntArray385[local15] >= arg2.anIntArray255[0] || Static395.anIntArray385[local15] >= arg2.anIntArray255[1] || Static395.anIntArray385[local15] >= arg2.anIntArray255[2] || Static395.anIntArray385[local15] >= arg2.anIntArray255[3]) && (arg2.anIntArray257[0] <= Static147.anIntArray598[local15] || Static147.anIntArray598[local15] >= arg2.anIntArray257[1] || arg2.anIntArray257[2] <= Static147.anIntArray598[local15] || arg2.anIntArray257[3] <= Static147.anIntArray598[local15]) && (arg2.anIntArray257[0] >= Static184.anIntArray171[local15] || Static184.anIntArray171[local15] <= arg2.anIntArray257[1] || Static184.anIntArray171[local15] <= arg2.anIntArray257[2] || arg2.anIntArray257[3] >= Static184.anIntArray171[local15]) && (arg2.anIntArray258[0] <= Static515.anIntArray233[local15] || Static515.anIntArray233[local15] >= arg2.anIntArray258[1] || Static515.anIntArray233[local15] >= arg2.anIntArray258[2] || arg2.anIntArray258[3] <= Static515.anIntArray233[local15]) && (arg2.anIntArray258[0] >= Static676.anIntArray511[local15] || arg2.anIntArray258[1] >= Static676.anIntArray511[local15] || arg2.anIntArray258[2] >= Static676.anIntArray511[local15] || arg2.anIntArray258[3] >= Static676.anIntArray511[local15])) {
					return;
				}
			}
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(298) boolean local298;
		@Pc(324) float local324;
		if (arg2.aByte48 == 1) {
			local15 = arg2.aShort54 + Static537.anInt10357 - Static281.anInt4404;
			if (local15 >= 0 && local15 <= Static537.anInt10357 + Static537.anInt10357) {
				local257 = arg2.aShort53 + Static537.anInt10357 - Static411.anInt7045;
				if (local257 < 0) {
					local257 = 0;
				} else if (local257 > Static537.anInt10357 + Static537.anInt10357) {
					return;
				}
				local279 = Static537.anInt10357 + arg2.aShort52 - Static411.anInt7045;
				if (Static537.anInt10357 + Static537.anInt10357 < local279) {
					local279 = Static537.anInt10357 + Static537.anInt10357;
				} else if (local279 < 0) {
					return;
				}
				local298 = false;
				while (local279 >= local257) {
					if (Static10.aBooleanArrayArray1[local15][local257++]) {
						local298 = true;
						break;
					}
				}
				if (local298) {
					local324 = (float) (Static62.anInt988 - arg2.anIntArray257[0]);
					if (local324 < 0.0F) {
						local324 *= -1.0F;
					}
					if (!local324 < (float) Static367.anInt6413 && (Static31.method401(0, arg2) && (Static31.method401(1, arg2) && (Static31.method401(2, arg2) && Static31.method401(3, arg2))))) {
						Static41.aClass180Array1[Static32.anInt447++] = arg2;
					}
				}
			}
		} else if (arg2.aByte48 == 2) {
			local15 = arg2.aShort53 + Static537.anInt10357 - Static411.anInt7045;
			if (local15 >= 0 && local15 <= Static537.anInt10357 + Static537.anInt10357) {
				local257 = Static537.anInt10357 + arg2.aShort54 - Static281.anInt4404;
				if (local257 < 0) {
					local257 = 0;
				} else if (Static537.anInt10357 + Static537.anInt10357 < local257) {
					return;
				}
				local279 = Static537.anInt10357 + arg2.aShort51 - Static281.anInt4404;
				if (local279 > Static537.anInt10357 + Static537.anInt10357) {
					local279 = Static537.anInt10357 + Static537.anInt10357;
				} else if (local279 < 0) {
					return;
				}
				local298 = false;
				while (local279 >= local257) {
					if (Static10.aBooleanArrayArray1[local257++][local15]) {
						local298 = true;
						break;
					}
				}
				if (local298) {
					local324 = (float) (Static668.anInt10414 - arg2.anIntArray258[0]);
					if (local324 < 0.0F) {
						local324 *= -1.0F;
					}
					if (!(local324 < (float) Static367.anInt6413) && (Static31.method401(0, arg2) && (Static31.method401(1, arg2) && (Static31.method401(2, arg2) && Static31.method401(3, arg2))))) {
						Static41.aClass180Array1[Static32.anInt447++] = arg2;
					}
				}
			}
		} else if (arg2.aByte48 == 16 || arg2.aByte48 == 8) {
			local15 = arg2.aShort54 + Static537.anInt10357 - Static281.anInt4404;
			if (local15 >= 0 && local15 <= Static537.anInt10357 + Static537.anInt10357) {
				local257 = arg2.aShort53 + Static537.anInt10357 - Static411.anInt7045;
				if (local257 >= 0 && Static537.anInt10357 + Static537.anInt10357 >= local257 && Static10.aBooleanArrayArray1[local15][local257]) {
					@Pc(581) float local581 = (float) (Static62.anInt988 - arg2.anIntArray257[0]);
					if (local581 < 0.0F) {
						local581 *= -1.0F;
					}
					@Pc(598) float local598 = (float) (Static668.anInt10414 - arg2.anIntArray258[0]);
					if (local598 < 0.0F) {
						local598 *= -1.0F;
					}
					if ((!((float) Static367.anInt6413 > local581) || !((float) Static367.anInt6413 > local598)) && (Static31.method401(0, arg2) && (Static31.method401(1, arg2) && (Static31.method401(2, arg2) && Static31.method401(3, arg2))))) {
						Static41.aClass180Array1[Static32.anInt447++] = arg2;
					}
				}
			}
		} else if (arg2.aByte48 == 4) {
			@Pc(663) float local663 = (float) (arg2.anIntArray255[0] - Static530.anInt8770);
			if (!((float) Static277.anInt4345 >= local663)) {
				local257 = Static537.anInt10357 + arg2.aShort53 - Static411.anInt7045;
				if (local257 < 0) {
					local257 = 0;
				} else if (local257 > Static537.anInt10357 + Static537.anInt10357) {
					return;
				}
				local279 = Static537.anInt10357 + arg2.aShort52 - Static411.anInt7045;
				if (local279 > Static537.anInt10357 + Static537.anInt10357) {
					local279 = Static537.anInt10357 + Static537.anInt10357;
				} else if (local279 < 0) {
					return;
				}
				@Pc(732) int local732 = arg2.aShort54 + Static537.anInt10357 - Static281.anInt4404;
				if (local732 < 0) {
					local732 = 0;
				} else if (local732 > Static537.anInt10357 + Static537.anInt10357) {
					return;
				}
				@Pc(758) int local758 = arg2.aShort51 + Static537.anInt10357 - Static281.anInt4404;
				if (Static537.anInt10357 + Static537.anInt10357 < local758) {
					local758 = Static537.anInt10357 + Static537.anInt10357;
				} else if (local758 < 0) {
					return;
				}
				@Pc(780) boolean local780 = false;
				label283: for (@Pc(782) int local782 = local732; local782 <= local758; local782++) {
					for (@Pc(785) int local785 = local257; local785 <= local279; local785++) {
						if (Static10.aBooleanArrayArray1[local782][local785]) {
							local780 = true;
							break label283;
						}
					}
				}
				if (local780 && (Static31.method401(0, arg2) && (Static31.method401(1, arg2) && (Static31.method401(2, arg2) && Static31.method401(3, arg2))))) {
					Static41.aClass180Array1[Static32.anInt447++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BLclient!wq;)V")
	public static void method8190(@OriginalArg(1) Class394 arg0) {
		if (arg0.anInt10500 == Static367.anInt6417) {
			Static425.aBooleanArray18[arg0.anInt10449] = true;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
	public static int method8191() {
		return Static634.anInt10113 == 1 ? Static275.anInt4317 : Static630.anInt10065;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "()V")
	public static void method8193() {
		for (@Pc(1) int local1 = Static436.anInt7713; local1 < Static202.anInt3256; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static665.anInt7330; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static92.anInt1526; local7++) {
					@Pc(16) Class313 local16 = Static129.aClass313ArrayArrayArray7[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class41_Sub1_Sub3 local21 = local16.aClass41_Sub1_Sub3_2;
						@Pc(24) Class41_Sub1_Sub3 local24 = local16.aClass41_Sub1_Sub3_1;
						if (local21 != null && local21.method8653()) {
							Static50.method745(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8653()) {
								Static50.method745(local24, local1, local4, local7, 1, 1);
								local24.method8658(0, local21, Static267.aClass143_6, 0, 0, false);
								local24.method8654();
							}
							local21.method8654();
						}
						for (@Pc(68) Class40 local68 = local16.aClass40_3; local68 != null; local68 = local68.aClass40_1) {
							@Pc(72) Class41_Sub1_Sub1 local72 = local68.aClass41_Sub1_Sub1_1;
							if (local72 != null && local72.method8653()) {
								Static50.method745(local72, local1, local4, local7, local72.aShort107 + 1 - local72.aShort109, local72.aShort110 - local72.aShort108 + 1);
								local72.method8654();
							}
						}
						@Pc(108) Class41_Sub1_Sub4 local108 = local16.aClass41_Sub1_Sub4_1;
						if (local108 != null && local108.method8653()) {
							Static365.method5370(local108, local1, local4, local7);
							local108.method8654();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(II)V")
	public static void method8194(@OriginalArg(0) int arg0) {
		Static430.anInt8829 = arg0;
		@Pc(7) Class265 local7 = Static540.aClass265_59;
		synchronized (Static540.aClass265_59) {
			Static540.aClass265_59.method6568();
		}
	}
}
