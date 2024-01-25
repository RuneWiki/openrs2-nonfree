import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ega", name = "v", descriptor = "I")
	public static int anInt2822;

	@OriginalMember(owner = "client!ega", name = "w", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!ega", name = "x", descriptor = "I")
	public static int anInt2823;

	@OriginalMember(owner = "client!ega", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ega", name = "q", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_49 = new Class342(64);

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2333(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static336.anInt6067; local16++) {
			if (arg0.equalsIgnoreCase(Static205.aStringArray17[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static412.aStringArray34[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	public static void method2334() {
		if (Static138.anInt3344 == -1 || Static127.anInt2897 == -1) {
			return;
		}
		@Pc(25) int local25 = (Static358.anInt6359 * (Static560.anInt9756 - Static57.anInt1531) >> 16) + Static57.anInt1531;
		Static358.anInt6359 += local25;
		if (Static358.anInt6359 >= 65535) {
			Static358.anInt6359 = 65535;
			if (Static471.aBoolean563) {
				Static169.aBoolean263 = false;
			} else {
				Static169.aBoolean263 = true;
			}
			Static471.aBoolean563 = true;
		} else {
			Static471.aBoolean563 = false;
			Static169.aBoolean263 = false;
		}
		@Pc(55) float local55 = (float) Static358.anInt6359 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static230.anInt4673 * 2;
		@Pc(88) int local88;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(142) int local142;
		@Pc(159) int local159;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static276.anIntArrayArrayArray10[Static138.anInt3344][local62][local64] * 3;
			local88 = Static276.anIntArrayArrayArray10[Static138.anInt3344][local62 + 1][local64] * 3;
			local120 = (Static276.anIntArrayArrayArray10[Static138.anInt3344][local62 + 2][local64] + Static276.anIntArrayArrayArray10[Static138.anInt3344][local62 + 2][local64] - Static276.anIntArrayArrayArray10[Static138.anInt3344][local62 + 3][local64]) * 3;
			local128 = Static276.anIntArrayArrayArray10[Static138.anInt3344][local62][local64];
			local133 = local88 - local76;
			local142 = local120 + local76 - local88 * 2;
			local159 = Static276.anIntArrayArrayArray10[Static138.anInt3344][local62 + 2][local64] + local88 - local128 - local120;
			local58[local64] = ((float) local133 + local55 * (local55 * (float) local159 + (float) local142)) * local55 + (float) local128;
		}
		Static335.anInt6057 = (int) local58[1] * -1;
		Static407.anInt7345 = (int) local58[0] - Static321.anInt5874 * 512;
		Static418.anInt7466 = (int) local58[2] - Static137.anInt3293 * 512;
		@Pc(212) float[] local212 = new float[3];
		local88 = Static511.anInt8808 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static276.anIntArrayArrayArray10[Static127.anInt2897][local88][local120] * 3;
			local133 = Static276.anIntArrayArrayArray10[Static127.anInt2897][local88 + 1][local120] * 3;
			local142 = (Static276.anIntArrayArrayArray10[Static127.anInt2897][local88 + 2][local120] + Static276.anIntArrayArrayArray10[Static127.anInt2897][local88 + 2][local120] - Static276.anIntArrayArrayArray10[Static127.anInt2897][local88 + 3][local120]) * 3;
			local159 = Static276.anIntArrayArrayArray10[Static127.anInt2897][local88][local120];
			@Pc(288) int local288 = local133 - local128;
			@Pc(297) int local297 = local142 + local128 - local133 * 2;
			@Pc(315) int local315 = local133 + Static276.anIntArrayArrayArray10[Static127.anInt2897][local88 + 2][local120] - local142 - local159;
			local212[local120] = (float) local159 + local55 * (((float) local297 + local55 * (float) local315) * local55 + (float) local288);
		}
		@Pc(349) float local349 = local212[0] - local58[0];
		@Pc(360) float local360 = (local212[1] - local58[1]) * -1.0F;
		@Pc(369) float local369 = local212[2] - local58[2];
		@Pc(379) double local379 = Math.sqrt((double) (local369 * local369 + local349 * local349));
		Static568.anInt9808 = (int) (Math.atan2((double) local360, local379) * 2607.5945876176133D) & 0x3FFF;
		Static421.anInt7497 = (int) (-Math.atan2((double) local349, (double) local369) * 2607.5945876176133D) & 0x3FFF;
		Static528.anInt10345 = ((Static276.anIntArrayArrayArray10[Static138.anInt3344][local62 + 2][3] - Static276.anIntArrayArrayArray10[Static138.anInt3344][local62][3]) * Static358.anInt6359 >> 16) + Static276.anIntArrayArrayArray10[Static138.anInt3344][local62][3];
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
	public static String method2337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg2[arg0];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg0 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg0; local36 < local32; local36++) {
				@Pc(42) String local42 = arg2[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(61) StringBuffer local61 = new StringBuffer(local34);
			for (@Pc(72) int local72 = arg0; local72 < local32; local72++) {
				@Pc(78) String local78 = arg2[local72];
				if (local78 == null) {
					local61.append("null");
				} else {
					local61.append(local78);
				}
			}
			return local61.toString();
		}
	}
}
