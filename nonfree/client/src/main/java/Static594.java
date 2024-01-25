import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "[Lclient!bu;")
	public static Class45[] aClass45Array1;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILclient!cj;Lclient!ha;)V")
	public static void method8351(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(17) int local17;
		if (Static154.anIntArray266 != null && arg0 <= arg1.aByte27) {
			for (local17 = 0; local17 < Static154.anIntArray266.length; local17++) {
				if (Static154.anIntArray266[local17] != -1000000 && (Static154.anIntArray266[local17] >= arg1.anIntArray123[0] || Static154.anIntArray266[local17] >= arg1.anIntArray123[1] || arg1.anIntArray123[2] <= Static154.anIntArray266[local17] || arg1.anIntArray123[3] <= Static154.anIntArray266[local17]) && (Static530.anIntArray745[local17] >= arg1.anIntArray122[0] || Static530.anIntArray745[local17] >= arg1.anIntArray122[1] || Static530.anIntArray745[local17] >= arg1.anIntArray122[2] || Static530.anIntArray745[local17] >= arg1.anIntArray122[3]) && (arg1.anIntArray122[0] >= Static522.anIntArray730[local17] || Static522.anIntArray730[local17] <= arg1.anIntArray122[1] || Static522.anIntArray730[local17] <= arg1.anIntArray122[2] || Static522.anIntArray730[local17] <= arg1.anIntArray122[3]) && (arg1.anIntArray121[0] <= Static557.anIntArray770[local17] || Static557.anIntArray770[local17] >= arg1.anIntArray121[1] || arg1.anIntArray121[2] <= Static557.anIntArray770[local17] || arg1.anIntArray121[3] <= Static557.anIntArray770[local17]) && (arg1.anIntArray121[0] >= Static457.anIntArray644[local17] || arg1.anIntArray121[1] >= Static457.anIntArray644[local17] || Static457.anIntArray644[local17] <= arg1.anIntArray121[2] || Static457.anIntArray644[local17] <= arg1.anIntArray121[3])) {
					return;
				}
			}
		}
		@Pc(268) int local268;
		@Pc(295) int local295;
		@Pc(313) boolean local313;
		@Pc(345) float local345;
		if (arg1.aByte26 == 1) {
			local17 = Static7.anInt94 + arg1.aShort15 - Static220.anInt4183;
			if (local17 >= 0 && Static7.anInt94 + Static7.anInt94 >= local17) {
				local268 = arg1.aShort16 + Static7.anInt94 - Static547.anInt8968;
				if (local268 < 0) {
					local268 = 0;
				} else if (Static7.anInt94 + Static7.anInt94 < local268) {
					return;
				}
				local295 = Static7.anInt94 + arg1.aShort13 - Static547.anInt8968;
				if (local295 > Static7.anInt94 + Static7.anInt94) {
					local295 = Static7.anInt94 + Static7.anInt94;
				} else if (local295 < 0) {
					return;
				}
				local313 = false;
				while (local268 <= local295) {
					if (Static430.aBooleanArrayArray7[local17][local268++]) {
						local313 = true;
						break;
					}
				}
				if (local313) {
					local345 = (float) (Static562.anInt9120 - arg1.anIntArray122[0]);
					if (local345 < 0.0F) {
						local345 *= -1.0F;
					}
					if (!local345 < (float) Static190.anInt3825 && (Static415.method5918(0, arg1) && (Static415.method5918(1, arg1) && (Static415.method5918(2, arg1) && Static415.method5918(3, arg1))))) {
						Static433.aClass60Array10[Static331.anInt5493++] = arg1;
					}
				}
			}
		} else if (arg1.aByte26 == 2) {
			local17 = arg1.aShort16 + Static7.anInt94 - Static547.anInt8968;
			if (local17 >= 0 && Static7.anInt94 + Static7.anInt94 >= local17) {
				local268 = arg1.aShort15 + Static7.anInt94 - Static220.anInt4183;
				if (local268 < 0) {
					local268 = 0;
				} else if (local268 > Static7.anInt94 + Static7.anInt94) {
					return;
				}
				local295 = arg1.aShort14 + Static7.anInt94 - Static220.anInt4183;
				if (local295 > Static7.anInt94 + Static7.anInt94) {
					local295 = Static7.anInt94 + Static7.anInt94;
				} else if (local295 < 0) {
					return;
				}
				local313 = false;
				while (local295 >= local268) {
					if (Static430.aBooleanArrayArray7[local268++][local17]) {
						local313 = true;
						break;
					}
				}
				if (local313) {
					local345 = (float) (Static493.anInt8117 - arg1.anIntArray121[0]);
					if (local345 < 0.0F) {
						local345 *= -1.0F;
					}
					if (!((float) Static190.anInt3825 > local345) && (Static415.method5918(0, arg1) && (Static415.method5918(1, arg1) && (Static415.method5918(2, arg1) && Static415.method5918(3, arg1))))) {
						Static433.aClass60Array10[Static331.anInt5493++] = arg1;
					}
				}
			}
		} else if (arg1.aByte26 == 16 || arg1.aByte26 == 8) {
			local17 = arg1.aShort15 + Static7.anInt94 - Static220.anInt4183;
			if (local17 >= 0 && Static7.anInt94 + Static7.anInt94 >= local17) {
				local268 = Static7.anInt94 + arg1.aShort16 - Static547.anInt8968;
				if (local268 >= 0 && local268 <= Static7.anInt94 + Static7.anInt94 && Static430.aBooleanArrayArray7[local17][local268]) {
					@Pc(600) float local600 = (float) (Static562.anInt9120 - arg1.anIntArray122[0]);
					if (local600 < 0.0F) {
						local600 *= -1.0F;
					}
					@Pc(617) float local617 = (float) (Static493.anInt8117 - arg1.anIntArray121[0]);
					if (local617 < 0.0F) {
						local617 *= -1.0F;
					}
					if ((!((float) Static190.anInt3825 > local600) || !((float) Static190.anInt3825 > local617)) && (Static415.method5918(0, arg1) && (Static415.method5918(1, arg1) && (Static415.method5918(2, arg1) && Static415.method5918(3, arg1))))) {
						Static433.aClass60Array10[Static331.anInt5493++] = arg1;
					}
				}
			}
		} else if (arg1.aByte26 == 4) {
			@Pc(682) float local682 = (float) (arg1.anIntArray123[0] - Static442.anInt7034);
			if (!((float) Static463.anInt7621 >= local682)) {
				local268 = Static7.anInt94 + arg1.aShort16 - Static547.anInt8968;
				if (local268 < 0) {
					local268 = 0;
				} else if (Static7.anInt94 + Static7.anInt94 < local268) {
					return;
				}
				local295 = arg1.aShort13 + Static7.anInt94 - Static547.anInt8968;
				if (local295 > Static7.anInt94 + Static7.anInt94) {
					local295 = Static7.anInt94 + Static7.anInt94;
				} else if (local295 < 0) {
					return;
				}
				@Pc(748) int local748 = Static7.anInt94 + arg1.aShort15 - Static220.anInt4183;
				if (local748 < 0) {
					local748 = 0;
				} else if (Static7.anInt94 + Static7.anInt94 < local748) {
					return;
				}
				@Pc(772) int local772 = Static7.anInt94 + arg1.aShort14 - Static220.anInt4183;
				if (local772 > Static7.anInt94 + Static7.anInt94) {
					local772 = Static7.anInt94 + Static7.anInt94;
				} else if (local772 < 0) {
					return;
				}
				@Pc(787) boolean local787 = false;
				label283: for (@Pc(789) int local789 = local748; local789 <= local772; local789++) {
					for (@Pc(793) int local793 = local268; local793 <= local295; local793++) {
						if (Static430.aBooleanArrayArray7[local789][local793]) {
							local787 = true;
							break label283;
						}
					}
				}
				if (local787 && (Static415.method5918(0, arg1) && (Static415.method5918(1, arg1) && (Static415.method5918(2, arg1) && Static415.method5918(3, arg1))))) {
					Static433.aClass60Array10[Static331.anInt5493++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V")
	public static void method8354(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub11_Sub4 local15 = Static583.method8201(5, (long) arg0);
		local15.method2194();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)V")
	public static void method8355() {
		Static553.anInt9041 = 0;
		Static499.anInt8156 = -1;
		Static18.anInt450 = 1;
		Static512.aBoolean627 = false;
		Static403.aClass15_107 = null;
		Static257.aClass3_Sub1_Sub3_2 = null;
		Static453.anInt7540 = -1;
		Static586.anInt9458 = 2;
	}
}
