import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
	public static int anInt1467;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "[I")
	public static int[] anIntArray118 = new int[32];

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4 = new String[8];

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "I")
	public static int anInt1471 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static85.method1597(arg2)) {
			Static108.method1949(arg4, arg0, arg1, Static274.aClass66ArrayArray1[arg2], -1, arg5, arg3, arg6, arg7);
		} else if (arg4 == -1) {
			for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
				Static304.aBooleanArray23[local27] = true;
			}
		} else {
			Static304.aBooleanArray23[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public static void method1360(@OriginalArg(0) boolean arg0) {
		Static115.method2067();
		if (Static37.anInt773 != 30 && Static37.anInt773 != 25) {
			return;
		}
		Static132.anInt3686++;
		if (Static132.anInt3686 < 50 && !arg0) {
			return;
		}
		Static132.anInt3686 = 0;
		if (!Static232.aBoolean292 && Static5.aClass97_1 != null) {
			Static127.aClass1_Sub14_Sub1_3.method1408(206);
			try {
				Static5.aClass97_1.method2552(Static127.aClass1_Sub14_Sub1_3.anInt1480, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
				Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
			} catch (@Pc(62) IOException local62) {
				Static232.aBoolean292 = true;
			}
		}
		Static115.method2067();
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public static void method1369() {
		if (Static201.anInt3866 == -1 || Static143.anInt2865 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static55.anInt1042 - Static139.anInt2803) * Static54.anInt1038 >> 16) + Static139.anInt2803;
		@Pc(28) int local28 = Static148.anInt2916 * 2;
		Static54.anInt1038 += local24;
		@Pc(35) float[] local35 = new float[3];
		if (Static54.anInt1038 >= 65535) {
			if (Static248.aBoolean305) {
				Static141.aBoolean179 = false;
			} else {
				Static141.aBoolean179 = true;
			}
			Static248.aBoolean305 = true;
			Static54.anInt1038 = 65535;
		} else {
			Static141.aBoolean179 = false;
			Static248.aBoolean305 = false;
		}
		@Pc(63) float local63 = (float) Static54.anInt1038 / 65535.0F;
		@Pc(78) int local78;
		@Pc(123) int local123;
		@Pc(111) int local111;
		@Pc(136) int local136;
		@Pc(128) int local128;
		@Pc(146) int local146;
		@Pc(163) int local163;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			local78 = Static249.anIntArrayArrayArray14[Static201.anInt3866][local28][local65] * 3;
			local111 = (Static249.anIntArrayArrayArray14[Static201.anInt3866][local28 + 2][local65] + Static249.anIntArrayArrayArray14[Static201.anInt3866][local28 + 2][local65] - Static249.anIntArrayArrayArray14[Static201.anInt3866][local28 + 3][local65]) * 3;
			local123 = Static249.anIntArrayArrayArray14[Static201.anInt3866][local28 + 1][local65] * 3;
			local128 = local123 - local78;
			local136 = Static249.anIntArrayArrayArray14[Static201.anInt3866][local28][local65];
			local146 = local78 + local111 - local123 * 2;
			local163 = local123 + Static249.anIntArrayArrayArray14[Static201.anInt3866][local28 + 2][local65] - local136 - local111;
			local35[local65] = (float) local136 + local63 * ((float) local128 + ((float) local163 * local63 + (float) local146) * local63);
		}
		Static94.anInt3434 = (int) local35[0] - Static199.anInt3817 * 128;
		Static306.anInt5420 = (int) local35[1] * -1;
		@Pc(206) float[] local206 = new float[3];
		local78 = Static181.anInt3481 * 2;
		Static233.anInt4252 = (int) local35[2] - Static192.anInt3637 * 128;
		for (local123 = 0; local123 < 3; local123++) {
			local111 = Static249.anIntArrayArrayArray14[Static143.anInt2865][local78][local123] * 3;
			local128 = (Static249.anIntArrayArrayArray14[Static143.anInt2865][local78 + 2][local123] + Static249.anIntArrayArrayArray14[Static143.anInt2865][local78 + 2][local123] - Static249.anIntArrayArrayArray14[Static143.anInt2865][local78 + 3][local123]) * 3;
			local136 = Static249.anIntArrayArrayArray14[Static143.anInt2865][local78 + 1][local123] * 3;
			local146 = Static249.anIntArrayArrayArray14[Static143.anInt2865][local78][local123];
			local163 = local136 - local111;
			@Pc(314) int local314 = local128 + local111 - local136 * 2;
			@Pc(331) int local331 = local136 + Static249.anIntArrayArrayArray14[Static143.anInt2865][local78 + 2][local123] - local146 - local128;
			local206[local123] = ((float) local163 + local63 * (local63 * (float) local331 + (float) local314)) * local63 + (float) local146;
		}
		@Pc(362) float local362 = local206[0] - local35[0];
		@Pc(373) float local373 = (local206[1] - local35[1]) * -1.0F;
		@Pc(381) float local381 = local206[2] - local35[2];
		@Pc(391) double local391 = Math.sqrt((double) (local381 * local381 + local362 * local362));
		Static5.aFloat3 = (float) Math.atan2((double) local373, local391);
		Static93.aFloat60 = -((float) Math.atan2((double) local362, (double) local381));
		Static93.anInt1895 = (int) ((double) Static93.aFloat60 * 325.949D) & 0x7FF;
		Static277.anInt4987 = (int) ((double) Static5.aFloat3 * 325.949D) & 0x7FF;
	}
}
