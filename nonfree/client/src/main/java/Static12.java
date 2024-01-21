import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!jd;")
	public static Class11 aClass11_136;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!jd;")
	public static Class11 aClass11_137;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "J")
	public static long aLong147;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!sd;")
	public static Class29 aClass29_82;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1356 = Static63.method1251("title)3jpg");

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1357 = null;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1358 = Static63.method1251("null");

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1359 = Static63.method1251("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
	public static int[] anIntArray485 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "[I")
	public static int[] anIntArray486 = new int[100];

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	public static int anInt3113 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method2137() {
		Static100.aClass67_23.method1819();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method2138() {
		@Pc(9) int local9;
		if (Static61.anInt1808 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static61.anInt1808 > 768) {
					Static47.anIntArray219[local9] = Static41.method1534(1024 - Static61.anInt1808, Static97.anIntArray400[local9], Static97.anIntArray399[local9]);
				} else if (Static61.anInt1808 <= 256) {
					Static47.anIntArray219[local9] = Static41.method1534(256 - Static61.anInt1808, Static97.anIntArray399[local9], Static97.anIntArray400[local9]);
				} else {
					Static47.anIntArray219[local9] = Static97.anIntArray399[local9];
				}
			}
		} else if (Static96.anInt2623 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static96.anInt2623 > 768) {
					Static47.anIntArray219[local9] = Static41.method1534(1024 - Static96.anInt2623, Static97.anIntArray400[local9], Static56.anIntArray255[local9]);
				} else if (Static96.anInt2623 > 256) {
					Static47.anIntArray219[local9] = Static56.anIntArray255[local9];
				} else {
					Static47.anIntArray219[local9] = Static41.method1534(256 - Static96.anInt2623, Static56.anIntArray255[local9], Static97.anIntArray400[local9]);
				}
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				Static47.anIntArray219[local9] = Static97.anIntArray400[local9];
			}
		}
		for (local9 = 0; local9 < 33920; local9++) {
			Static120.aClass11_138.anIntArray487[local9] = Static107.aClass5_Sub2_Sub6_Sub3_5.anIntArray377[local9];
		}
		@Pc(167) int local167 = 0;
		@Pc(169) int local169 = 1152;
		@Pc(191) int local191;
		@Pc(196) int local196;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(223) int local223;
		@Pc(228) int local228;
		@Pc(233) int local233;
		for (@Pc(178) int local178 = 1; local178 < 255; local178++) {
			local191 = Static90.anIntArray369[local178] * (256 - local178) / 256;
			local196 = local191 + 22;
			if (local196 < 0) {
				local196 = 0;
			}
			local167 += local196;
			for (local209 = local196; local209 < 128; local209++) {
				local216 = Static119.anIntArray484[local167++];
				if (local216 == 0) {
					local169++;
				} else {
					local223 = local216;
					local228 = 256 - local216;
					local233 = Static120.aClass11_138.anIntArray487[local169];
					local216 = Static47.anIntArray219[local216];
					Static120.aClass11_138.anIntArray487[local169++] = (local228 * (local233 & 0xFF00FF) + local223 * (local216 & 0xFF00FF) & 0xFF00FF00) + ((local216 & 0xFF00) * local223 + ((local233 & 0xFF00) * local228) & 0xFF0000) >> 8;
				}
			}
			local169 += local196;
		}
		local169 = 1176;
		local167 = 0;
		for (local191 = 0; local191 < 33920; local191++) {
			Static107.aClass11_117.anIntArray487[local191] = Static103.aClass5_Sub2_Sub6_Sub3_4.anIntArray377[local191];
		}
		for (local196 = 1; local196 < 255; local196++) {
			local209 = Static90.anIntArray369[local196] * (256 - local196) / 256;
			local169 += local209;
			local216 = 103 - local209;
			for (local223 = 0; local223 < local216; local223++) {
				local228 = Static119.anIntArray484[local167++];
				if (local228 == 0) {
					local169++;
				} else {
					local233 = local228;
					@Pc(357) int local357 = Static107.aClass11_117.anIntArray487[local169];
					@Pc(361) int local361 = 256 - local228;
					local228 = Static47.anIntArray219[local228];
					Static107.aClass11_117.anIntArray487[local169++] = ((local357 & 0xFF00FF) * local361 + (local228 & 0xFF00FF) * local233 & 0xFF00FF00) + ((local357 & 0xFF00) * local361 + (local228 & 0xFF00) * local233 & 0xFF0000) >> 8;
				}
			}
			local169 += 128 - local209 - local216;
			local167 += 128 - local216;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method2139() {
		try {
			@Pc(6) Graphics local6 = Static75.aCanvas1.getGraphics();
			Static9.aClass11_17.method2148(local6, 17, 357);
		} catch (@Pc(19) Exception local19) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZJ)V")
	public static void method2140(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method2141() {
		aClass29_82 = null;
		aClass45_1356 = null;
		anIntArray486 = null;
		aClass45_1358 = null;
		anIntArray485 = null;
		aClass11_137 = null;
		aClass45_1359 = null;
		aClass11_136 = null;
		aClass45_1357 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method2142() {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = -1; local3 < Static56.anInt1694; local3++) {
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static64.anIntArray283[local3];
			}
			@Pc(21) Class5_Sub2_Sub4_Sub3_Sub1 local21 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local11];
			if (local21 != null && local21.anInt2395 > 0) {
				local21.anInt2395--;
				if (local21.anInt2395 == 0) {
					local21.aClass45_1014 = null;
				}
			}
		}
		for (local11 = 0; local11 < Static62.anInt1819; local11++) {
			@Pc(65) int local65 = Static70.anIntArray297[local11];
			@Pc(69) Class5_Sub2_Sub4_Sub3_Sub2 local69 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local65];
			if (local69 != null && local69.anInt2395 > 0) {
				local69.anInt2395--;
				if (local69.anInt2395 == 0) {
					local69.aClass45_1014 = null;
				}
			}
		}
	}
}
