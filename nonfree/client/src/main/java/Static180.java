import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "F")
	public static float aFloat239;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame5;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "[I")
	public static final int[] anIntArray598 = new int[32];

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public static int anInt9478 = 0;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public static void method7714() {
		for (@Pc(12) int local12 = 0; local12 < Static102.anInt1774; local12++) {
			Static288.aClass333Array4[local12] = null;
		}
		Static102.anInt1774 = 0;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (@Pc(30) int local30 = 0; local30 < Static119.anInt2474; local30++) {
			for (local34 = 0; local34 < Static327.anInt5993; local34++) {
				for (local38 = 0; local38 < Static191.anInt3757; local38++) {
					@Pc(48) Class360 local48 = Static568.aClass360ArrayArrayArray22[local30][local38][local34];
					if (local48 != null) {
						if (local48.aShort123 > 0) {
							local48.aShort123 = (short) (local48.aShort123 * -1);
						}
						if (local48.aShort121 > 0) {
							local48.aShort121 = (short) (local48.aShort121 * -1);
						}
					}
				}
			}
		}
		for (local34 = 0; local34 < Static119.anInt2474; local34++) {
			for (local38 = 0; local38 < Static327.anInt5993; local38++) {
				for (@Pc(99) int local99 = 0; local99 < Static191.anInt3757; local99++) {
					@Pc(109) Class360 local109 = Static568.aClass360ArrayArrayArray22[local34][local99][local38];
					if (local109 != null) {
						@Pc(132) boolean local132 = Static568.aClass360ArrayArrayArray22[0][local99][local38] != null && Static568.aClass360ArrayArrayArray22[0][local99][local38].aClass360_1 != null;
						@Pc(140) int local140;
						@Pc(142) int local142;
						@Pc(156) Class360 local156;
						@Pc(166) int local166;
						@Pc(339) int local339;
						@Pc(353) int local353;
						@Pc(360) int local360;
						@Pc(376) int local376;
						@Pc(384) int local384;
						@Pc(388) int local388;
						@Pc(392) int local392;
						@Pc(398) int local398;
						@Pc(437) int local437;
						@Pc(441) int local441;
						if (local109.aShort121 < 0) {
							local140 = local38;
							local142 = local38;
							local156 = Static568.aClass360ArrayArrayArray22[local34][local99][local38 - 1];
							local166 = Static36.aClass129Array7[local34].method6481(local38, local99);
							while (local140 > 0 && local156 != null && local156.aShort121 < 0 && local156.aShort121 == local109.aShort121 && local109.aShort122 == local156.aShort122 && local166 == Static36.aClass129Array7[local34].method6481(local140 - 1, local99) && (local140 - 1 <= 0 || local166 == Static36.aClass129Array7[local34].method6481(local140 - 2, local99))) {
								local140--;
								local156 = Static568.aClass360ArrayArrayArray22[local34][local99][local140 - 1];
							}
							for (local156 = Static568.aClass360ArrayArrayArray22[local34][local99][local38 + 1]; Static191.anInt3757 > local142 && local156 != null && local156.aShort121 < 0 && local156.aShort121 == local109.aShort121 && local109.aShort122 == local156.aShort122 && Static36.aClass129Array7[local34].method6481(local142 + 1, local99) == local166 && (local142 + 1 >= Static191.anInt3757 || local166 == Static36.aClass129Array7[local34].method6481(local142 + 2, local99)); local156 = Static568.aClass360ArrayArrayArray22[local34][local99][local142 + 1]) {
								local142++;
							}
							local339 = local34 + 1 - local34;
							local353 = Static36.aClass129Array7[local132 ? local34 + 1 : local34].method6481(local140, local99);
							local360 = local109.aShort121 * local339 + local353;
							local376 = Static36.aClass129Array7[local132 ? local34 + 1 : local34].method6481(local142 + 1, local99);
							local384 = local376 + local339 * local109.aShort121;
							local388 = local99 << Static166.anInt7796;
							local392 = local140 << Static166.anInt7796;
							local398 = (local142 << Static166.anInt7796) + Static165.anInt3157;
							Static288.aClass333Array4[Static102.anInt1774++] = new Class333(1, local34, local109.aShort122 + local388, local109.aShort122 + local388, local109.aShort122 + local388, local388 - -local109.aShort122, local353, local376, local384, local360, local392, local398, local398, local392);
							for (local437 = local34; local437 <= local34; local437++) {
								for (local441 = local140; local441 <= local142; local441++) {
									Static568.aClass360ArrayArrayArray22[local437][local99][local441].aShort121 = (short) (Static568.aClass360ArrayArrayArray22[local437][local99][local441].aShort121 * -1);
								}
							}
						}
						if (local109.aShort123 < 0) {
							local140 = local99;
							local142 = local99;
							local156 = Static568.aClass360ArrayArrayArray22[local34][local99 - 1][local38];
							local166 = Static36.aClass129Array7[local34].method6481(local38, local99);
							while (local140 > 0 && local156 != null && local156.aShort123 < 0 && local156.aShort123 == local109.aShort123 && local109.aShort120 == local156.aShort120 && Static36.aClass129Array7[local34].method6481(local38, local140 - 1) == local166 && (local140 - 1 <= 0 || local166 == Static36.aClass129Array7[local34].method6481(local38, local140 - 2))) {
								local140--;
								local156 = Static568.aClass360ArrayArrayArray22[local34][local140 - 1][local38];
							}
							for (local156 = Static568.aClass360ArrayArrayArray22[local34][local99 + 1][local38]; local142 < Static327.anInt5993 && local156 != null && local156.aShort123 < 0 && local156.aShort123 == local109.aShort123 && local109.aShort120 == local156.aShort120 && Static36.aClass129Array7[local34].method6481(local38, local142 + 1) == local166 && (Static327.anInt5993 <= local142 + 1 || local166 == Static36.aClass129Array7[local34].method6481(local38, local142 + 2)); local156 = Static568.aClass360ArrayArrayArray22[local34][local142 + 1][local38]) {
								local142++;
							}
							local339 = local34 + 1 - local34;
							local353 = Static36.aClass129Array7[local132 ? local34 + 1 : local34].method6481(local38, local140);
							local360 = local339 * local109.aShort123 + local353;
							local376 = Static36.aClass129Array7[local132 ? local34 + 1 : local34].method6481(local38, local142 + 1);
							local384 = local339 * local109.aShort123 + local376;
							local388 = local140 << Static166.anInt7796;
							local392 = (local142 << Static166.anInt7796) + Static165.anInt3157;
							local398 = local38 << Static166.anInt7796;
							Static288.aClass333Array4[Static102.anInt1774++] = new Class333(2, local34, local388, local392, local392, local388, local353, local376, local384, local360, local398 + local109.aShort120, local398 + local109.aShort120, local398 + local109.aShort120, local109.aShort120 + local398);
							for (local437 = local34; local437 <= local34; local437++) {
								for (local441 = local140; local441 <= local142; local441++) {
									Static568.aClass360ArrayArrayArray22[local437][local441][local38].aShort123 = (short) (Static568.aClass360ArrayArrayArray22[local437][local441][local38].aShort123 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static312.aBoolean443 = true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method7716(@OriginalArg(0) String arg0) {
		if (Class1_Sub11_Sub2.aString104.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class1_Sub11_Sub2.aString104.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class1_Sub11_Sub2.aString104.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
