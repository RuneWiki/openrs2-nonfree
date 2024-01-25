import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!cga;")
	public static Class60 aClass60_235 = new Class60();

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Z")
	public static boolean aBoolean968 = false;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
	public static final int[] anIntArray766 = new int[25];

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	public static void method9870() {
		@Pc(13) Class2_Sub33 local13 = Static592.method8154(Static305.aClass349_41, Static487.aClass221_2.aClass48_1);
		local13.aClass2_Sub20_Sub2_1.method8584(Static193.method2756());
		local13.aClass2_Sub20_Sub2_1.method8551(Static151.anInt7983);
		local13.aClass2_Sub20_Sub2_1.method8551(Static295.anInt4558);
		local13.aClass2_Sub20_Sub2_1.method8584(Static650.aClass2_Sub30_29.aClass11_Sub18_1.method4563());
		Static487.aClass221_2.method5173(local13);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method9873(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static158.aClass133Array4 == Static685.aClass133Array5) {
			return;
		}
		@Pc(10) int local10 = Static126.aClass133Array1[arg1].method8214(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class133 local25 = Static126.aClass133Array1[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method8214(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(FIFF)I")
	public static int method9874(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(13) float local13 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(40) float local40 = arg2 < 0.0F ? -arg2 : arg2;
		if (local30 > local13 && local30 > local40) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local13 < local40 && local30 < local40) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!ha;ILclient!mv;)V")
	public static void method9875(@OriginalArg(1) Class145 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class252 arg2) {
		@Pc(22) int local22;
		if (Static153.anIntArray371 != null && arg2.aByte85 >= arg1) {
			for (local22 = 0; local22 < Static153.anIntArray371.length; local22++) {
				if (Static153.anIntArray371[local22] != -1000000 && (Static153.anIntArray371[local22] >= arg2.anIntArray473[0] || arg2.anIntArray473[1] <= Static153.anIntArray371[local22] || Static153.anIntArray371[local22] >= arg2.anIntArray473[2] || Static153.anIntArray371[local22] >= arg2.anIntArray473[3]) && (arg2.anIntArray474[0] <= Static624.anIntArray693[local22] || Static624.anIntArray693[local22] >= arg2.anIntArray474[1] || Static624.anIntArray693[local22] >= arg2.anIntArray474[2] || Static624.anIntArray693[local22] >= arg2.anIntArray474[3]) && (arg2.anIntArray474[0] >= Static389.anIntArray448[local22] || arg2.anIntArray474[1] >= Static389.anIntArray448[local22] || arg2.anIntArray474[2] >= Static389.anIntArray448[local22] || arg2.anIntArray474[3] >= Static389.anIntArray448[local22]) && (Static524.anIntArray594[local22] >= arg2.anIntArray472[0] || arg2.anIntArray472[1] <= Static524.anIntArray594[local22] || Static524.anIntArray594[local22] >= arg2.anIntArray472[2] || arg2.anIntArray472[3] <= Static524.anIntArray594[local22]) && (Static236.anIntArray290[local22] <= arg2.anIntArray472[0] || Static236.anIntArray290[local22] <= arg2.anIntArray472[1] || arg2.anIntArray472[2] >= Static236.anIntArray290[local22] || Static236.anIntArray290[local22] <= arg2.anIntArray472[3])) {
					return;
				}
			}
		}
		@Pc(313) int local313;
		@Pc(336) int local336;
		@Pc(359) boolean local359;
		@Pc(394) float local394;
		if (arg2.aByte84 == 1) {
			local22 = arg2.aShort88 + Static128.anInt2136 - Static20.anInt267;
			if (local22 >= 0 && local22 <= Static128.anInt2136 + Static128.anInt2136) {
				local313 = Static128.anInt2136 + arg2.aShort89 - Static503.anInt2766;
				if (local313 < 0) {
					local313 = 0;
				} else if (Static128.anInt2136 + Static128.anInt2136 < local313) {
					return;
				}
				local336 = arg2.aShort90 + Static128.anInt2136 - Static503.anInt2766;
				if (local336 > Static128.anInt2136 + Static128.anInt2136) {
					local336 = Static128.anInt2136 + Static128.anInt2136;
				} else if (local336 < 0) {
					return;
				}
				local359 = false;
				while (local313 <= local336) {
					if (Static208.aBooleanArrayArray6[local22][local313++]) {
						local359 = true;
						break;
					}
				}
				if (local359) {
					local394 = (float) (Static600.anInt9334 - arg2.anIntArray474[0]);
					if (local394 < 0.0F) {
						local394 *= -1.0F;
					}
					if (!(float) Static89.anInt1518 > local394 && (Static13.method213(0, arg2) && (Static13.method213(1, arg2) && (Static13.method213(2, arg2) && Static13.method213(3, arg2))))) {
						Static371.aClass252Array2[Static339.anInt5253++] = arg2;
					}
				}
			}
		} else if (arg2.aByte84 == 2) {
			local22 = arg2.aShort89 + Static128.anInt2136 - Static503.anInt2766;
			if (local22 >= 0 && Static128.anInt2136 + Static128.anInt2136 >= local22) {
				local313 = Static128.anInt2136 + arg2.aShort88 - Static20.anInt267;
				if (local313 < 0) {
					local313 = 0;
				} else if (Static128.anInt2136 + Static128.anInt2136 < local313) {
					return;
				}
				local336 = Static128.anInt2136 + arg2.aShort87 - Static20.anInt267;
				if (local336 > Static128.anInt2136 + Static128.anInt2136) {
					local336 = Static128.anInt2136 + Static128.anInt2136;
				} else if (local336 < 0) {
					return;
				}
				local359 = false;
				while (local336 >= local313) {
					if (Static208.aBooleanArrayArray6[local313++][local22]) {
						local359 = true;
						break;
					}
				}
				if (local359) {
					local394 = (float) (Static384.anInt6087 - arg2.anIntArray472[0]);
					if (local394 < 0.0F) {
						local394 *= -1.0F;
					}
					if (!(local394 < (float) Static89.anInt1518) && (Static13.method213(0, arg2) && (Static13.method213(1, arg2) && (Static13.method213(2, arg2) && Static13.method213(3, arg2))))) {
						Static371.aClass252Array2[Static339.anInt5253++] = arg2;
					}
				}
			}
		} else if (arg2.aByte84 == 16 || arg2.aByte84 == 8) {
			local22 = Static128.anInt2136 + arg2.aShort88 - Static20.anInt267;
			if (local22 >= 0 && Static128.anInt2136 + Static128.anInt2136 >= local22) {
				local313 = arg2.aShort89 + Static128.anInt2136 - Static503.anInt2766;
				if (local313 >= 0 && Static128.anInt2136 + Static128.anInt2136 >= local313 && Static208.aBooleanArrayArray6[local22][local313]) {
					@Pc(699) float local699 = (float) (Static600.anInt9334 - arg2.anIntArray474[0]);
					if (local699 < 0.0F) {
						local699 *= -1.0F;
					}
					@Pc(716) float local716 = (float) (Static384.anInt6087 - arg2.anIntArray472[0]);
					if (local716 < 0.0F) {
						local716 *= -1.0F;
					}
					if ((!((float) Static89.anInt1518 > local699) || !(local716 < (float) Static89.anInt1518)) && (Static13.method213(0, arg2) && (Static13.method213(1, arg2) && (Static13.method213(2, arg2) && Static13.method213(3, arg2))))) {
						Static371.aClass252Array2[Static339.anInt5253++] = arg2;
					}
				}
			}
		} else if (arg2.aByte84 == 4) {
			@Pc(790) float local790 = (float) (arg2.anIntArray473[0] - Static705.anInt10795);
			if (!(local790 <= (float) Static431.anInt7043)) {
				local313 = arg2.aShort89 + Static128.anInt2136 - Static503.anInt2766;
				if (local313 < 0) {
					local313 = 0;
				} else if (local313 > Static128.anInt2136 + Static128.anInt2136) {
					return;
				}
				local336 = arg2.aShort90 + Static128.anInt2136 - Static503.anInt2766;
				if (Static128.anInt2136 + Static128.anInt2136 < local336) {
					local336 = Static128.anInt2136 + Static128.anInt2136;
				} else if (local336 < 0) {
					return;
				}
				@Pc(856) int local856 = arg2.aShort88 + Static128.anInt2136 - Static20.anInt267;
				if (local856 < 0) {
					local856 = 0;
				} else if (local856 > Static128.anInt2136 + Static128.anInt2136) {
					return;
				}
				@Pc(887) int local887 = arg2.aShort87 + Static128.anInt2136 - Static20.anInt267;
				if (local887 > Static128.anInt2136 + Static128.anInt2136) {
					local887 = Static128.anInt2136 + Static128.anInt2136;
				} else if (local887 < 0) {
					return;
				}
				@Pc(910) boolean local910 = false;
				label283: for (@Pc(912) int local912 = local856; local912 <= local887; local912++) {
					for (@Pc(918) int local918 = local313; local918 <= local336; local918++) {
						if (Static208.aBooleanArrayArray6[local912][local918]) {
							local910 = true;
							break label283;
						}
					}
				}
				if (local910 && (Static13.method213(0, arg2) && (Static13.method213(1, arg2) && (Static13.method213(2, arg2) && Static13.method213(3, arg2))))) {
					Static371.aClass252Array2[Static339.anInt5253++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!cw;I)V")
	public static void method9877(@OriginalArg(0) Class4_Sub5 arg0) {
		arg0.aClass4_Sub2_Sub1_Sub2_1 = null;
		if (Static489.anInt7866 < 20) {
			Static295.aClass320_3.method7600(arg0);
			Static489.anInt7866++;
		}
	}
}
