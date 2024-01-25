import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	public static final int anInt997 = Static507.method7317(1600);

	@OriginalMember(owner = "client!au", name = "q", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_5 = new Class344(12, -1);

	@OriginalMember(owner = "client!au", name = "u", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_8 = new Class90(29, 5);

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
	public static void method882() {
		Static84.aClass13_1.method7248();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static121.aLongArray4[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static226.aLongArray5[local26] = 0L;
		}
		Static565.anInt5165 = 0;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method884(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)V")
	public static void method887() {
		if (Static39.aClass7_2.method7795()) {
			Static39.aClass7_2.method7836(Static201.aCanvas7);
			Static535.method7526();
			Static39.aClass7_2.method7833(Static201.aCanvas7);
			Static39.aClass7_2.method7796(Static201.aCanvas7);
		} else {
			Static146.method2531(Static453.anInt8614);
		}
		Static533.method7519();
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
	public static void method888() {
		if (Static166.anInt3460 == -1 || Static456.anInt8707 == -1) {
			return;
		}
		@Pc(23) int local23 = Static506.anInt9467 + ((Static257.anInt5231 - Static506.anInt9467) * Static528.anInt9684 >> 16);
		Static528.anInt9684 += local23;
		if (Static528.anInt9684 < 65535) {
			Static54.aBoolean118 = false;
			Static47.aBoolean116 = false;
		} else {
			Static528.anInt9684 = 65535;
			if (Static47.aBoolean116) {
				Static54.aBoolean118 = false;
			} else {
				Static54.aBoolean118 = true;
			}
			Static47.aBoolean116 = true;
		}
		@Pc(55) float local55 = (float) Static528.anInt9684 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static237.anInt4969 * 2;
		@Pc(88) int local88;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(162) int local162;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static576.anIntArrayArrayArray24[Static166.anInt3460][local62][local64] * 3;
			local88 = Static576.anIntArrayArrayArray24[Static166.anInt3460][local62 + 1][local64] * 3;
			local122 = (Static576.anIntArrayArrayArray24[Static166.anInt3460][local62 + 2][local64] + Static576.anIntArrayArrayArray24[Static166.anInt3460][local62 + 2][local64] - Static576.anIntArrayArrayArray24[Static166.anInt3460][local62 + 3][local64]) * 3;
			local130 = Static576.anIntArrayArrayArray24[Static166.anInt3460][local62][local64];
			local135 = local88 - local76;
			local143 = local122 + local76 - local88 * 2;
			local162 = Static576.anIntArrayArrayArray24[Static166.anInt3460][local62 + 2][local64] + local88 - local122 - local130;
			local58[local64] = (local55 * ((float) local143 + (float) local162 * local55) + (float) local135) * local55 + (float) local130;
		}
		Static114.anInt2613 = (int) local58[2] - Static157.anInt3323 * 512;
		Static139.anInt3067 = (int) local58[1] * -1;
		Static534.anInt9775 = (int) local58[0] - Static242.anInt10133 * 512;
		@Pc(218) float[] local218 = new float[3];
		local88 = Static435.anInt8345 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static576.anIntArrayArrayArray24[Static456.anInt8707][local88][local122] * 3;
			local135 = Static576.anIntArrayArrayArray24[Static456.anInt8707][local88 + 1][local122] * 3;
			local143 = (Static576.anIntArrayArrayArray24[Static456.anInt8707][local88 + 2][local122] + Static576.anIntArrayArrayArray24[Static456.anInt8707][local88 + 2][local122] - Static576.anIntArrayArrayArray24[Static456.anInt8707][local88 + 3][local122]) * 3;
			local162 = Static576.anIntArrayArrayArray24[Static456.anInt8707][local88][local122];
			@Pc(294) int local294 = local135 - local130;
			@Pc(302) int local302 = local143 + local130 - local135 * 2;
			@Pc(319) int local319 = local135 + Static576.anIntArrayArrayArray24[Static456.anInt8707][local88 + 2][local122] - local162 - local143;
			local218[local122] = local55 * ((float) local294 + (local55 * (float) local319 + (float) local302) * local55) + (float) local162;
		}
		@Pc(353) float local353 = local218[0] - local58[0];
		@Pc(363) float local363 = (local218[1] - local58[1]) * -1.0F;
		@Pc(371) float local371 = local218[2] - local58[2];
		@Pc(381) double local381 = Math.sqrt((double) (local371 * local371 + local353 * local353));
		Static233.anInt4905 = (int) (Math.atan2((double) local363, local381) * 2607.5945876176133D) & 0x3FFF;
		Static353.anInt6831 = (int) (-Math.atan2((double) local353, (double) local371) * 2607.5945876176133D) & 0x3FFF;
		Static470.anInt8934 = Static576.anIntArrayArrayArray24[Static166.anInt3460][local62][3] + ((Static576.anIntArrayArrayArray24[Static166.anInt3460][local62 + 2][3] - Static576.anIntArrayArrayArray24[Static166.anInt3460][local62][3]) * Static528.anInt9684 >> 16);
	}
}
