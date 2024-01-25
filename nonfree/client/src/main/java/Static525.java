import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
	public static int anInt8857;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!rga;Z[[[BIB)Z")
	public static boolean method7245(@OriginalArg(0) Class8_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static401.aBoolean564) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9365 >> Static351.anInt5832;
		@Pc(13) int local13 = arg0.anInt9370 >> Static351.anInt5832;
		if (local8 < Static562.anInt9353 || local8 >= Static513.anInt8697 || local13 < Static426.anInt7375 || local13 >= Static425.anInt7370) {
			return true;
		} else if ((arg2 == null || arg0.aByte123 < arg3 || arg2[arg0.aByte123][local8][local13] != arg4) && arg0.method7624() && !arg0.method7631()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static258.anInt4643 - 16 && local8 <= Static258.anInt4643 + 16 && local13 >= Static312.anInt5339 - 16 && local13 <= Static312.anInt5339 + 16) {
				if (Static514.aBoolean677) {
					Static465.aClass160Array1[Static7.anInt120++].method3433(arg0);
					Static7.anInt120 %= Static477.anInt8065;
				} else {
					arg0.method7625(Static402.aClass134_11);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "([[BLclient!bd;Z)V")
	public static void method7246(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class26_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt490; local24++) {
			Static510.method7089();
			for (@Pc(30) int local30 = 0; local30 < Static71.anInt1410 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static471.anInt8012 >> 3; local34++) {
					@Pc(44) int local44 = Static192.anIntArrayArrayArray5[local24][local30][local34];
					if (local44 != -1) {
						@Pc(54) int local54 = local44 >> 24 & 0x3;
						if (!arg1.aBoolean48 || local54 == 0) {
							@Pc(65) int local65 = local44 >> 1 & 0x3;
							@Pc(71) int local71 = local44 >> 14 & 0x3FF;
							@Pc(77) int local77 = local44 >> 3 & 0x7FF;
							@Pc(88) int local88 = (local71 / 8 << 8) + (local77 / 8);
							for (@Pc(90) int local90 = 0; local90 < Static566.anIntArray710.length; local90++) {
								if (Static566.anIntArray710[local90] == local88 && arg0[local90] != null) {
									@Pc(108) Class1_Sub35 local108 = new Class1_Sub35(arg0[local90]);
									arg1.method404(local108, local24, local34 * 8, local54, local65, local30 * 8, Static478.aClass59Array2, local77, local71);
									arg1.method415(local77, local24, local12[0] == -1 ? local12 : null, local71, local54, local108, Static16.aClass134_1, local65, local34 * 8, local30 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static544.aClass197_1 = Static485.aClass318_1.method6999(local12[1], Static321.aClass279_1, local12[0], local12[3], local12[2]);
			Static198.anInt3676 = local12[4];
		}
	}
}
