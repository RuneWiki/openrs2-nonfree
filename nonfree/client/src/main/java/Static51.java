import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_17 = new Class173(7, 2);

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
	public static int anInt759 = -1;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "Lclient!gfa;")
	public static final Class116 aClass116_2 = new Class116(4, 1, 1, 1);

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "F")
	public static float aFloat19 = 1.0F;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Z")
	public static boolean method668(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!r;Lclient!te;IB)V")
	public static void method670(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17;
		if (Static116.anIntArray124 != null && arg2 <= arg1.aByte114) {
			for (local17 = 0; local17 < Static116.anIntArray124.length; local17++) {
				if (Static116.anIntArray124[local17] != -1000000 && (arg1.anIntArray486[0] <= Static116.anIntArray124[local17] || arg1.anIntArray486[1] <= Static116.anIntArray124[local17] || Static116.anIntArray124[local17] >= arg1.anIntArray486[2] || Static116.anIntArray124[local17] >= arg1.anIntArray486[3]) && (Static99.anIntArray90[local17] >= arg1.anIntArray487[0] || arg1.anIntArray487[1] <= Static99.anIntArray90[local17] || Static99.anIntArray90[local17] >= arg1.anIntArray487[2] || Static99.anIntArray90[local17] >= arg1.anIntArray487[3]) && (arg1.anIntArray487[0] >= Static435.anIntArray427[local17] || arg1.anIntArray487[1] >= Static435.anIntArray427[local17] || Static435.anIntArray427[local17] <= arg1.anIntArray487[2] || arg1.anIntArray487[3] >= Static435.anIntArray427[local17]) && (Static229.anIntArray202[local17] >= arg1.anIntArray488[0] || arg1.anIntArray488[1] <= Static229.anIntArray202[local17] || arg1.anIntArray488[2] <= Static229.anIntArray202[local17] || arg1.anIntArray488[3] <= Static229.anIntArray202[local17]) && (Static61.anIntArray37[local17] <= arg1.anIntArray488[0] || arg1.anIntArray488[1] >= Static61.anIntArray37[local17] || Static61.anIntArray37[local17] <= arg1.anIntArray488[2] || Static61.anIntArray37[local17] <= arg1.anIntArray488[3])) {
					return;
				}
			}
		}
		@Pc(272) int local272;
		@Pc(296) int local296;
		@Pc(318) boolean local318;
		@Pc(346) float local346;
		if (arg1.aByte113 == 1) {
			local17 = arg1.aShort106 + Static579.anInt10075 - Static26.anInt403;
			if (local17 >= 0 && local17 <= Static579.anInt10075 + Static579.anInt10075) {
				local272 = arg1.aShort105 + Static579.anInt10075 - Static528.anInt9392;
				if (local272 < 0) {
					local272 = 0;
				} else if (Static579.anInt10075 + Static579.anInt10075 < local272) {
					return;
				}
				local296 = arg1.aShort104 + Static579.anInt10075 - Static528.anInt9392;
				if (Static579.anInt10075 + Static579.anInt10075 < local296) {
					local296 = Static579.anInt10075 + Static579.anInt10075;
				} else if (local296 < 0) {
					return;
				}
				local318 = false;
				while (local272 <= local296) {
					if (Static522.aBooleanArrayArray18[local17][local272++]) {
						local318 = true;
						break;
					}
				}
				if (local318) {
					local346 = Static358.anInt6975 - arg1.anIntArray487[0];
					if (local346 < 0.0F) {
						local346 *= -1.0F;
					}
					if (!(float) Static211.anInt3940 > local346 && (Static480.method8256(arg1, 0) && (Static480.method8256(arg1, 1) && (Static480.method8256(arg1, 2) && Static480.method8256(arg1, 3))))) {
						Static70.aClass314Array2[Static518.anInt9302++] = arg1;
					}
				}
			}
		} else if (arg1.aByte113 == 2) {
			local17 = Static579.anInt10075 + arg1.aShort105 - Static528.anInt9392;
			if (local17 >= 0 && Static579.anInt10075 + Static579.anInt10075 >= local17) {
				local272 = Static579.anInt10075 + arg1.aShort106 - Static26.anInt403;
				if (local272 < 0) {
					local272 = 0;
				} else if (Static579.anInt10075 + Static579.anInt10075 < local272) {
					return;
				}
				local296 = Static579.anInt10075 + arg1.aShort103 - Static26.anInt403;
				if (Static579.anInt10075 + Static579.anInt10075 < local296) {
					local296 = Static579.anInt10075 + Static579.anInt10075;
				} else if (local296 < 0) {
					return;
				}
				local318 = false;
				while (local272 <= local296) {
					if (Static522.aBooleanArrayArray18[local272++][local17]) {
						local318 = true;
						break;
					}
				}
				if (local318) {
					local346 = Static237.anInt4283 - arg1.anIntArray488[0];
					if (local346 < 0.0F) {
						local346 *= -1.0F;
					}
					if (!((float) Static211.anInt3940 > local346) && (Static480.method8256(arg1, 0) && (Static480.method8256(arg1, 1) && (Static480.method8256(arg1, 2) && Static480.method8256(arg1, 3))))) {
						Static70.aClass314Array2[Static518.anInt9302++] = arg1;
					}
				}
			}
		} else if (arg1.aByte113 == 16 || arg1.aByte113 == 8) {
			local17 = arg1.aShort106 + Static579.anInt10075 - Static26.anInt403;
			if (local17 >= 0 && Static579.anInt10075 + Static579.anInt10075 >= local17) {
				local272 = arg1.aShort105 + Static579.anInt10075 - Static528.anInt9392;
				if (local272 >= 0 && Static579.anInt10075 + Static579.anInt10075 >= local272 && Static522.aBooleanArrayArray18[local17][local272]) {
					@Pc(618) float local618 = (float) (Static358.anInt6975 - arg1.anIntArray487[0]);
					if (local618 < 0.0F) {
						local618 *= -1.0F;
					}
					@Pc(635) float local635 = (float) (Static237.anInt4283 - arg1.anIntArray488[0]);
					if (local635 < 0.0F) {
						local635 *= -1.0F;
					}
					if ((!((float) Static211.anInt3940 > local618) || !(local635 < (float) Static211.anInt3940)) && (Static480.method8256(arg1, 0) && (Static480.method8256(arg1, 1) && (Static480.method8256(arg1, 2) && Static480.method8256(arg1, 3))))) {
						Static70.aClass314Array2[Static518.anInt9302++] = arg1;
					}
				}
			}
		} else if (arg1.aByte113 == 4) {
			@Pc(700) float local700 = (float) (arg1.anIntArray486[0] - Static179.anInt3616);
			if (!(local700 <= (float) Static281.anInt5748)) {
				local272 = arg1.aShort105 + Static579.anInt10075 - Static528.anInt9392;
				if (local272 < 0) {
					local272 = 0;
				} else if (Static579.anInt10075 + Static579.anInt10075 < local272) {
					return;
				}
				local296 = Static579.anInt10075 + arg1.aShort104 - Static528.anInt9392;
				if (local296 > Static579.anInt10075 + Static579.anInt10075) {
					local296 = Static579.anInt10075 + Static579.anInt10075;
				} else if (local296 < 0) {
					return;
				}
				@Pc(767) int local767 = arg1.aShort106 + Static579.anInt10075 - Static26.anInt403;
				if (local767 < 0) {
					local767 = 0;
				} else if (local767 > Static579.anInt10075 + Static579.anInt10075) {
					return;
				}
				@Pc(793) int local793 = Static579.anInt10075 + arg1.aShort103 - Static26.anInt403;
				if (Static579.anInt10075 + Static579.anInt10075 < local793) {
					local793 = Static579.anInt10075 + Static579.anInt10075;
				} else if (local793 < 0) {
					return;
				}
				@Pc(813) boolean local813 = false;
				label283: for (@Pc(815) int local815 = local767; local815 <= local793; local815++) {
					for (@Pc(819) int local819 = local272; local819 <= local296; local819++) {
						if (Static522.aBooleanArrayArray18[local815][local819]) {
							local813 = true;
							break label283;
						}
					}
				}
				if (local813 && (Static480.method8256(arg1, 0) && (Static480.method8256(arg1, 1) && (Static480.method8256(arg1, 2) && Static480.method8256(arg1, 3))))) {
					Static70.aClass314Array2[Static518.anInt9302++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!uf;)I")
	public static int method675(@OriginalArg(1) Class328 arg0) {
		if (Static519.aClass328_4 == arg0) {
			return 5890;
		} else if (Static233.aClass328_1 == arg0) {
			return 34167;
		} else if (arg0 == Static283.aClass328_5) {
			return 34168;
		} else if (arg0 == Static447.aClass328_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
