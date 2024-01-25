import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
	public static int anInt3241 = 0;

	@OriginalMember(owner = "client!kg", name = "N", descriptor = "[I")
	public static final int[] anIntArray366 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
	public static int anInt3244 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V")
	public static void method2872(@OriginalArg(1) int arg0) {
		if (!Static164.aClass154_Sub1_1.aBoolean470) {
			arg0 = -1;
		}
		if (arg0 == Static146.anInt2721) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class79 local26 = Static205.aClass224_2.method5108(arg0);
			@Pc(30) Class127 local30 = local26.method1655();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static61.aClass156_1.method3659(new Point(local26.anInt1971, local26.anInt1972), local30.method2795(), local30.method2796(), local30.method2806(), Static173.aCanvas2);
				Static146.anInt2721 = arg0;
			}
		}
		if (arg0 == -1 && Static146.anInt2721 != -1) {
			Static61.aClass156_1.method3659(new Point(), -1, null, -1, Static173.aCanvas2);
			Static146.anInt2721 = -1;
		}
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
	public static void method2873() {
		Static26.aClass3_Sub5_Sub1_2.method854();
		@Pc(13) int local13 = Static26.aClass3_Sub5_Sub1_2.method859(8);
		@Pc(18) int local18;
		if (local13 < Static23.anInt305) {
			for (local18 = local13; local18 < Static23.anInt305; local18++) {
				Static200.anIntArray389[Static363.anInt6168++] = Static369.anIntArray664[local18];
			}
		}
		if (local13 > Static23.anInt305) {
			throw new RuntimeException("gnpov1");
		}
		Static23.anInt305 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(61) int local61 = Static369.anIntArray664[local18];
			@Pc(65) Class28_Sub1_Sub1_Sub1 local65 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local61];
			@Pc(70) int local70 = Static26.aClass3_Sub5_Sub1_2.method859(1);
			if (local70 == 0) {
				Static369.anIntArray664[Static23.anInt305++] = local61;
				local65.anInt4365 = Static76.anInt1617;
			} else {
				@Pc(93) int local93 = Static26.aClass3_Sub5_Sub1_2.method859(2);
				if (local93 == 0) {
					Static369.anIntArray664[Static23.anInt305++] = local61;
					local65.anInt4365 = Static76.anInt1617;
					Static298.anIntArray570[Static365.anInt6136++] = local61;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local93 == 1) {
						Static369.anIntArray664[Static23.anInt305++] = local61;
						local65.anInt4365 = Static76.anInt1617;
						local137 = Static26.aClass3_Sub5_Sub1_2.method859(3);
						local65.method2970(local137, 1);
						local147 = Static26.aClass3_Sub5_Sub1_2.method859(1);
						if (local147 == 1) {
							Static298.anIntArray570[Static365.anInt6136++] = local61;
						}
					} else if (local93 == 2) {
						Static369.anIntArray664[Static23.anInt305++] = local61;
						local65.anInt4365 = Static76.anInt1617;
						if (Static26.aClass3_Sub5_Sub1_2.method859(1) == 1) {
							local137 = Static26.aClass3_Sub5_Sub1_2.method859(3);
							local65.method2970(local137, 2);
							local147 = Static26.aClass3_Sub5_Sub1_2.method859(3);
							local65.method2970(local147, 2);
						} else {
							local137 = Static26.aClass3_Sub5_Sub1_2.method859(3);
							local65.method2970(local137, 0);
						}
						local137 = Static26.aClass3_Sub5_Sub1_2.method859(1);
						if (local137 == 1) {
							Static298.anIntArray570[Static365.anInt6136++] = local61;
						}
					} else if (local93 == 3) {
						Static200.anIntArray389[Static363.anInt6168++] = local61;
					}
				}
			}
		}
	}
}
