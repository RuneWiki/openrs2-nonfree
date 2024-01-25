import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!rea", name = "C", descriptor = "I")
	public static int anInt7912 = 0;

	@OriginalMember(owner = "client!rea", name = "D", descriptor = "[I")
	public static final int[] anIntArray522 = new int[8];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!r;ILclient!hv;)V")
	public static void method6486(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Class148 arg2) {
		@Pc(13) int local13;
		if (Static392.anIntArray476 != null && arg2.aByte51 >= arg0) {
			for (local13 = 0; local13 < Static392.anIntArray476.length; local13++) {
				if (Static392.anIntArray476[local13] != -1000000 && (Static392.anIntArray476[local13] >= arg2.anIntArray250[0] || Static392.anIntArray476[local13] >= arg2.anIntArray250[1] || arg2.anIntArray250[2] <= Static392.anIntArray476[local13] || arg2.anIntArray250[3] <= Static392.anIntArray476[local13]) && (Static254.anIntArray317[local13] >= arg2.anIntArray252[0] || arg2.anIntArray252[1] <= Static254.anIntArray317[local13] || arg2.anIntArray252[2] <= Static254.anIntArray317[local13] || arg2.anIntArray252[3] <= Static254.anIntArray317[local13]) && (Static456.anIntArray521[local13] <= arg2.anIntArray252[0] || arg2.anIntArray252[1] >= Static456.anIntArray521[local13] || Static456.anIntArray521[local13] <= arg2.anIntArray252[2] || arg2.anIntArray252[3] >= Static456.anIntArray521[local13]) && (Static510.anIntArray606[local13] >= arg2.anIntArray251[0] || arg2.anIntArray251[1] <= Static510.anIntArray606[local13] || Static510.anIntArray606[local13] >= arg2.anIntArray251[2] || arg2.anIntArray251[3] <= Static510.anIntArray606[local13]) && (Static336.anIntArray427[local13] <= arg2.anIntArray251[0] || arg2.anIntArray251[1] >= Static336.anIntArray427[local13] || Static336.anIntArray427[local13] <= arg2.anIntArray251[2] || arg2.anIntArray251[3] >= Static336.anIntArray427[local13])) {
					return;
				}
			}
		}
		@Pc(274) int local274;
		@Pc(292) int local292;
		@Pc(314) boolean local314;
		@Pc(341) float local341;
		if (arg2.aByte50 == 1) {
			local13 = arg2.aShort40 + Static74.anInt1648 - Static350.anInt6287;
			if (local13 >= 0 && local13 <= Static74.anInt1648 + Static74.anInt1648) {
				local274 = arg2.aShort38 + Static74.anInt1648 - Static148.anInt3061;
				if (local274 < 0) {
					local274 = 0;
				} else if (local274 > Static74.anInt1648 + Static74.anInt1648) {
					return;
				}
				local292 = Static74.anInt1648 + arg2.aShort39 - Static148.anInt3061;
				if (Static74.anInt1648 + Static74.anInt1648 < local292) {
					local292 = Static74.anInt1648 + Static74.anInt1648;
				} else if (local292 < 0) {
					return;
				}
				local314 = false;
				while (local274 <= local292) {
					if (Static557.aBooleanArrayArray9[local13][local274++]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local341 = Static96.anInt2029 - arg2.anIntArray252[0];
					if (local341 < 0.0F) {
						local341 *= -1.0F;
					}
					if (!(float) Static489.anInt8256 > local341 && (Static202.method3295(arg2, 0) && (Static202.method3295(arg2, 1) && (Static202.method3295(arg2, 2) && Static202.method3295(arg2, 3))))) {
						Static259.aClass148Array1[Static35.anInt907++] = arg2;
					}
				}
			}
		} else if (arg2.aByte50 == 2) {
			local13 = Static74.anInt1648 + arg2.aShort38 - Static148.anInt3061;
			if (local13 >= 0 && local13 <= Static74.anInt1648 + Static74.anInt1648) {
				local274 = Static74.anInt1648 + arg2.aShort40 - Static350.anInt6287;
				if (local274 < 0) {
					local274 = 0;
				} else if (Static74.anInt1648 + Static74.anInt1648 < local274) {
					return;
				}
				local292 = Static74.anInt1648 + arg2.aShort41 - Static350.anInt6287;
				if (local292 > Static74.anInt1648 + Static74.anInt1648) {
					local292 = Static74.anInt1648 + Static74.anInt1648;
				} else if (local292 < 0) {
					return;
				}
				local314 = false;
				while (local274 <= local292) {
					if (Static557.aBooleanArrayArray9[local274++][local13]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local341 = Static497.anInt8373 - arg2.anIntArray251[0];
					if (local341 < 0.0F) {
						local341 *= -1.0F;
					}
					if (!(local341 < (float) Static489.anInt8256) && (Static202.method3295(arg2, 0) && (Static202.method3295(arg2, 1) && (Static202.method3295(arg2, 2) && Static202.method3295(arg2, 3))))) {
						Static259.aClass148Array1[Static35.anInt907++] = arg2;
					}
				}
			}
		} else if (arg2.aByte50 == 16 || arg2.aByte50 == 8) {
			local13 = Static74.anInt1648 + arg2.aShort40 - Static350.anInt6287;
			if (local13 >= 0 && local13 <= Static74.anInt1648 + Static74.anInt1648) {
				local274 = Static74.anInt1648 + arg2.aShort38 - Static148.anInt3061;
				if (local274 >= 0 && Static74.anInt1648 + Static74.anInt1648 >= local274 && Static557.aBooleanArrayArray9[local13][local274]) {
					@Pc(608) float local608 = (float) (Static96.anInt2029 - arg2.anIntArray252[0]);
					if (local608 < 0.0F) {
						local608 *= -1.0F;
					}
					@Pc(624) float local624 = (float) (Static497.anInt8373 - arg2.anIntArray251[0]);
					if (local624 < 0.0F) {
						local624 *= -1.0F;
					}
					if ((!((float) Static489.anInt8256 > local608) || !(local624 < (float) Static489.anInt8256)) && (Static202.method3295(arg2, 0) && (Static202.method3295(arg2, 1) && (Static202.method3295(arg2, 2) && Static202.method3295(arg2, 3))))) {
						Static259.aClass148Array1[Static35.anInt907++] = arg2;
					}
				}
			}
		} else if (arg2.aByte50 == 4) {
			@Pc(690) float local690 = (float) (arg2.anIntArray250[0] - Static551.anInt8936);
			if (!((float) Static334.anInt6168 >= local690)) {
				local274 = Static74.anInt1648 + arg2.aShort38 - Static148.anInt3061;
				if (local274 < 0) {
					local274 = 0;
				} else if (Static74.anInt1648 + Static74.anInt1648 < local274) {
					return;
				}
				local292 = Static74.anInt1648 + arg2.aShort39 - Static148.anInt3061;
				if (Static74.anInt1648 + Static74.anInt1648 < local292) {
					local292 = Static74.anInt1648 + Static74.anInt1648;
				} else if (local292 < 0) {
					return;
				}
				@Pc(751) int local751 = Static74.anInt1648 + arg2.aShort40 - Static350.anInt6287;
				if (local751 < 0) {
					local751 = 0;
				} else if (local751 > Static74.anInt1648 + Static74.anInt1648) {
					return;
				}
				@Pc(774) int local774 = arg2.aShort41 + Static74.anInt1648 - Static350.anInt6287;
				if (Static74.anInt1648 + Static74.anInt1648 < local774) {
					local774 = Static74.anInt1648 + Static74.anInt1648;
				} else if (local774 < 0) {
					return;
				}
				@Pc(797) boolean local797 = false;
				label283: for (@Pc(799) int local799 = local751; local799 <= local774; local799++) {
					for (@Pc(803) int local803 = local274; local803 <= local292; local803++) {
						if (Static557.aBooleanArrayArray9[local799][local803]) {
							local797 = true;
							break label283;
						}
					}
				}
				if (local797 && (Static202.method3295(arg2, 0) && (Static202.method3295(arg2, 1) && (Static202.method3295(arg2, 2) && Static202.method3295(arg2, 3))))) {
					Static259.aClass148Array1[Static35.anInt907++] = arg2;
				}
			}
		}
	}
}
