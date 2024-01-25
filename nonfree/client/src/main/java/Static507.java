import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	public static int anInt8770 = 0;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Lclient!sc;")
	public static final Class303 aClass303_1 = new Class303();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(DI)V")
	public static void method7287(@OriginalArg(0) double arg0) {
		if (arg0 == Static286.aDouble7) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static317.anIntArray293[local7] = local19 > 255 ? 255 : local19;
		}
		Static286.aDouble7 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!nq;)V")
	public static void method7290(@OriginalArg(1) Class229 arg0) {
		Static479.aClass229_1 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
	public static void method7291() {
		for (@Pc(7) int local7 = 0; local7 < Static574.anInt9809; local7++) {
			Static321.aClass169Array2[local7] = null;
		}
		Static574.anInt9809 = 0;
		@Pc(29) int local29;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static618.anInt10427; local25++) {
			for (local29 = 0; local29 < Static623.anInt10485; local29++) {
				for (local33 = 0; local33 < Static142.anInt3372; local33++) {
					@Pc(43) Class186 local43 = Static26.aClass186ArrayArrayArray1[local25][local33][local29];
					if (local43 != null) {
						if (local43.aShort62 > 0) {
							local43.aShort62 = (short) (local43.aShort62 * -1);
						}
						if (local43.aShort64 > 0) {
							local43.aShort64 = (short) (local43.aShort64 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static618.anInt10427; local29++) {
			for (local33 = 0; local33 < Static623.anInt10485; local33++) {
				for (@Pc(100) int local100 = 0; local100 < Static142.anInt3372; local100++) {
					@Pc(110) Class186 local110 = Static26.aClass186ArrayArrayArray1[local29][local100][local33];
					if (local110 != null) {
						@Pc(133) boolean local133 = Static26.aClass186ArrayArrayArray1[0][local100][local33] != null && Static26.aClass186ArrayArrayArray1[0][local100][local33].aClass186_1 != null;
						@Pc(138) int local138;
						@Pc(140) int local140;
						@Pc(154) Class186 local154;
						@Pc(162) int local162;
						@Pc(330) int local330;
						@Pc(344) int local344;
						@Pc(351) int local351;
						@Pc(367) int local367;
						@Pc(374) int local374;
						@Pc(378) int local378;
						@Pc(382) int local382;
						@Pc(388) int local388;
						@Pc(427) int local427;
						@Pc(431) int local431;
						if (local110.aShort64 < 0) {
							local138 = local33;
							local140 = local33;
							local154 = Static26.aClass186ArrayArrayArray1[local29][local100][local33 - 1];
							local162 = Static150.aClass245Array2[local29].method7583(local33, local100);
							while (local138 > 0 && local154 != null && local154.aShort64 < 0 && local154.aShort64 == local110.aShort64 && local154.aShort63 == local110.aShort63 && local162 == Static150.aClass245Array2[local29].method7583(local138 - 1, local100) && (local138 - 1 <= 0 || local162 == Static150.aClass245Array2[local29].method7583(local138 - 2, local100))) {
								local138--;
								local154 = Static26.aClass186ArrayArrayArray1[local29][local100][local138 - 1];
							}
							for (local154 = Static26.aClass186ArrayArrayArray1[local29][local100][local33 + 1]; local140 < Static142.anInt3372 && local154 != null && local154.aShort64 < 0 && local110.aShort64 == local154.aShort64 && local110.aShort63 == local154.aShort63 && Static150.aClass245Array2[local29].method7583(local140 + 1, local100) == local162 && (local140 + 1 >= Static142.anInt3372 || local162 == Static150.aClass245Array2[local29].method7583(local140 + 2, local100)); local154 = Static26.aClass186ArrayArrayArray1[local29][local100][local140 + 1]) {
								local140++;
							}
							local330 = local29 + 1 - local29;
							local344 = Static150.aClass245Array2[local133 ? local29 + 1 : local29].method7583(local138, local100);
							local351 = local110.aShort64 * local330 + local344;
							local367 = Static150.aClass245Array2[local133 ? local29 + 1 : local29].method7583(local140 + 1, local100);
							local374 = local367 + local110.aShort64 * local330;
							local378 = local100 << Static606.anInt10280;
							local382 = local138 << Static606.anInt10280;
							local388 = Static190.anInt4138 + (local140 << Static606.anInt10280);
							Static321.aClass169Array2[Static574.anInt9809++] = new Class169(1, local29, local378 + local110.aShort63, local110.aShort63 + local378, local110.aShort63 + local378, local110.aShort63 + local378, local344, local367, local374, local351, local382, local388, local388, local382);
							for (local427 = local29; local427 <= local29; local427++) {
								for (local431 = local138; local431 <= local140; local431++) {
									Static26.aClass186ArrayArrayArray1[local427][local100][local431].aShort64 = (short) (Static26.aClass186ArrayArrayArray1[local427][local100][local431].aShort64 * -1);
								}
							}
						}
						if (local110.aShort62 < 0) {
							local138 = local100;
							local140 = local100;
							local154 = Static26.aClass186ArrayArrayArray1[local29][local100 - 1][local33];
							local162 = Static150.aClass245Array2[local29].method7583(local33, local100);
							while (local138 > 0 && local154 != null && local154.aShort62 < 0 && local110.aShort62 == local154.aShort62 && local110.aShort61 == local154.aShort61 && local162 == Static150.aClass245Array2[local29].method7583(local33, local138 - 1) && (local138 - 1 <= 0 || Static150.aClass245Array2[local29].method7583(local33, local138 - 2) == local162)) {
								local138--;
								local154 = Static26.aClass186ArrayArrayArray1[local29][local138 - 1][local33];
							}
							for (local154 = Static26.aClass186ArrayArrayArray1[local29][local100 + 1][local33]; local140 < Static623.anInt10485 && local154 != null && local154.aShort62 < 0 && local110.aShort62 == local154.aShort62 && local154.aShort61 == local110.aShort61 && Static150.aClass245Array2[local29].method7583(local33, local140 + 1) == local162 && (local140 + 1 >= Static623.anInt10485 || local162 == Static150.aClass245Array2[local29].method7583(local33, local140 + 2)); local154 = Static26.aClass186ArrayArrayArray1[local29][local140 + 1][local33]) {
								local140++;
							}
							local330 = local29 + 1 - local29;
							local344 = Static150.aClass245Array2[local133 ? local29 + 1 : local29].method7583(local33, local138);
							local351 = local344 + local330 * local110.aShort62;
							local367 = Static150.aClass245Array2[local133 ? local29 + 1 : local29].method7583(local33, local140 + 1);
							local374 = local110.aShort62 * local330 + local367;
							local378 = local138 << Static606.anInt10280;
							local382 = Static190.anInt4138 + (local140 << Static606.anInt10280);
							local388 = local33 << Static606.anInt10280;
							Static321.aClass169Array2[Static574.anInt9809++] = new Class169(2, local29, local378, local382, local382, local378, local344, local367, local374, local351, local388 + local110.aShort61, local110.aShort61 + local388, local388 + local110.aShort61, local388 + local110.aShort61);
							for (local427 = local29; local427 <= local29; local427++) {
								for (local431 = local138; local431 <= local140; local431++) {
									Static26.aClass186ArrayArrayArray1[local427][local431][local33].aShort62 = (short) (Static26.aClass186ArrayArrayArray1[local427][local431][local33].aShort62 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static97.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V")
	public static void method7292() {
		Static97.aBoolean220 = false;
		Static116.anInt2989 = 0;
		Static483.anIntArrayArrayArray14 = new int[Static618.anInt10427][Static623.anInt10485 + 1][Static142.anInt3372 + 1];
		Static593.anInt10029 = 0;
		Static170.aClass169Array1 = new Class169[1000];
		Static321.aClass169Array2 = new Class169[2000];
		Static383.aClass169Array3 = new Class169[500];
		Static50.anInt1727 = Static190.anInt4138;
		Static574.anInt9809 = 0;
		Static201.anInt7302 = 0;
		Static629.anInt10541 = Static190.anInt4138;
		Static455.aClass169Array4 = new Class169[500];
		if (Static472.aClass5_14 instanceof oa) {
			Static211.aBoolean331 = false;
		} else {
			Static211.aBoolean331 = true;
		}
	}
}
