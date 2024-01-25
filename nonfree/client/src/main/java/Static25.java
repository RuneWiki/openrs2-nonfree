import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_8 = new Class126(100, 10);

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(B)V")
	public static void method793() {
		if (Static659.anInt10095 == -1 || Static81.anInt1786 == -1) {
			return;
		}
		@Pc(31) int local31 = Static8.anInt98 + (Static132.anInt2472 * (Static125.anInt2417 - Static8.anInt98) >> 16);
		Static132.anInt2472 += local31;
		if (Static132.anInt2472 < 65535) {
			Static261.aBoolean398 = false;
			Static236.aBoolean348 = false;
		} else {
			Static132.anInt2472 = 65535;
			if (Static261.aBoolean398) {
				Static236.aBoolean348 = false;
			} else {
				Static236.aBoolean348 = true;
			}
			Static261.aBoolean398 = true;
		}
		@Pc(61) float local61 = (float) Static132.anInt2472 / 65535.0F;
		@Pc(64) float[] local64 = new float[3];
		@Pc(68) int local68 = Static513.anInt8594 * 2;
		@Pc(94) int local94;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(165) int local165;
		for (@Pc(70) int local70 = 0; local70 < 3; local70++) {
			@Pc(82) int local82 = Static278.anIntArrayArrayArray11[Static659.anInt10095][local68][local70] * 3;
			local94 = Static278.anIntArrayArrayArray11[Static659.anInt10095][local68 + 1][local70] * 3;
			local127 = (Static278.anIntArrayArrayArray11[Static659.anInt10095][local68 + 2][local70] + Static278.anIntArrayArrayArray11[Static659.anInt10095][local68 + 2][local70] - Static278.anIntArrayArrayArray11[Static659.anInt10095][local68 + 3][local70]) * 3;
			local135 = Static278.anIntArrayArrayArray11[Static659.anInt10095][local68][local70];
			local140 = local94 - local82;
			local148 = local127 + local82 - local94 * 2;
			local165 = local94 + Static278.anIntArrayArrayArray11[Static659.anInt10095][local68 - -2][local70] - local135 - local127;
			local64[local70] = (float) local135 + local61 * ((float) local140 + (local61 * (float) local165 + (float) local148) * local61);
		}
		Static663.anInt10236 = (int) local64[2] - Static347.anInt7851 * 512;
		Static97.anInt2082 = (int) local64[0] - Static417.anInt7047 * 512;
		Static265.anInt9363 = (int) local64[1] * -1;
		@Pc(221) float[] local221 = new float[3];
		local94 = Static293.anInt5387 * 2;
		for (local127 = 0; local127 < 3; local127++) {
			local135 = Static278.anIntArrayArrayArray11[Static81.anInt1786][local94][local127] * 3;
			local140 = Static278.anIntArrayArrayArray11[Static81.anInt1786][local94 + 1][local127] * 3;
			local148 = (Static278.anIntArrayArrayArray11[Static81.anInt1786][local94 + 2][local127] + Static278.anIntArrayArrayArray11[Static81.anInt1786][local94 + 2][local127] - Static278.anIntArrayArrayArray11[Static81.anInt1786][local94 + 3][local127]) * 3;
			local165 = Static278.anIntArrayArrayArray11[Static81.anInt1786][local94][local127];
			@Pc(296) int local296 = local140 - local135;
			@Pc(304) int local304 = local135 + local148 - local140 * 2;
			@Pc(322) int local322 = local140 + Static278.anIntArrayArrayArray11[Static81.anInt1786][local94 + 2][local127] - local165 - local148;
			local221[local127] = (float) local165 + local61 * (local61 * (local61 * (float) local322 + (float) local304) + (float) local296);
		}
		@Pc(356) float local356 = local221[0] - local64[0];
		@Pc(366) float local366 = -1.0F * (local221[1] - local64[1]);
		@Pc(375) float local375 = local221[2] - local64[2];
		@Pc(385) double local385 = Math.sqrt((double) (local375 * local375 + local356 * local356));
		Static118.anInt2323 = (int) (Math.atan2((double) local366, local385) * 2607.5945876176133D) & 0x3FFF;
		Static206.anInt3821 = (int) (-Math.atan2((double) local356, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static260.anInt4898 = Static278.anIntArrayArrayArray11[Static659.anInt10095][local68][3] + ((Static278.anIntArrayArrayArray11[Static659.anInt10095][local68 + 2][3] - Static278.anIntArrayArrayArray11[Static659.anInt10095][local68][3]) * Static132.anInt2472 >> 16);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZ)Z")
	public static boolean method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static530.method7396(arg0, arg1) & (Static619.method8223(arg0, arg1) | (arg1 & 0x2000) != 0 | Static239.method3853(arg1, arg0));
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)Lclient!naa;")
	public static Class27 method795() {
		try {
			return (Class27) Class.forName("Class27_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZZ)I")
	public static int method796(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub29 local14 = Static577.method7771(false, arg0);
		if (local14 == null) {
			return Static483.aClass339_1.method7795(arg0).anInt2359;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray353.length; local31++) {
			if (local14.anIntArray353[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static483.aClass339_1.method7795(arg0).anInt2359 - local14.anIntArray353.length;
	}
}
