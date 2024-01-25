import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "[I")
	public static int[] anIntArray743;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
	public static final int[] anIntArray742 = new int[5];

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray88 = new String[100];

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	public static int anInt6339 = 0;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
	public static int anInt6340 = 104;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method5507() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static96.aBooleanArray9[local12] = true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!tq;ILclient!lk;Lclient!gu;I)Z")
	public static boolean method5512(@OriginalArg(1) Class164 arg0, @OriginalArg(3) Class1_Sub24 arg1, @OriginalArg(4) Class97 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray289 != null) {
			local9 = Static353.anInt2627 + (Static353.anInt2631 - Static353.anInt2627) * (arg1.anInt3618 + arg2.anInt2293 - Static353.anInt2620) / (Static353.anInt2625 - Static353.anInt2620);
			local7 = Static353.anInt2627 + (Static353.anInt2631 - Static353.anInt2627) * (arg1.anInt3618 + (arg2.anInt2295 - Static353.anInt2620)) / (Static353.anInt2625 - Static353.anInt2620);
			local13 = Static353.anInt2624 - (arg1.anInt3621 + arg2.anInt2281 - Static353.anInt2622) * (-Static353.anInt2626 + Static353.anInt2624) / (Static353.anInt2628 - Static353.anInt2622);
			local11 = Static353.anInt2624 - (Static353.anInt2624 - Static353.anInt2626) * (arg1.anInt3621 + (arg2.anInt2298 - Static353.anInt2622)) / (Static353.anInt2628 - Static353.anInt2622);
		}
		@Pc(102) Class51 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg2.anInt2268 != -1) {
			if (arg1.aBoolean351 && arg2.anInt2289 != -1) {
				local102 = arg2.method1856(true, arg0);
			} else {
				local102 = arg2.method1856(false, arg0);
			}
			if (local102 != null) {
				local104 = arg1.anInt3617 - (local102.method4682() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				local106 = arg1.anInt3617 + (local102.method4682() + 1 >> 1);
				if (local106 > local9) {
					local9 = local106;
				}
				local108 = arg1.anInt3615 - (local102.method4673() + 1 >> 1);
				local110 = arg1.anInt3615 + (local102.method4673() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(205) Class79 local205 = null;
		@Pc(207) int local207 = 0;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(279) int local279;
		@Pc(302) int local302;
		if (arg2.aString22 != null) {
			local205 = Static59.method971(arg2.anInt2266);
			if (local205 != null) {
				local207 = Static302.aClass110_8.method2414(arg2.aString22, null, Static83.aStringArray20, null);
				local209 = arg1.anInt3615;
				if (local102 == null) {
					local209 -= local207 * local205.method1374() / 2;
				} else {
					local209 -= (local102.method4673() >> 1) + local207 * local205.method1375();
				}
				for (local279 = 0; local279 < local207; local279++) {
					@Pc(285) String local285 = Static83.aStringArray20[local279];
					if (local279 < local207 - 1) {
						local285 = local285.substring(0, local285.length() - 4);
					}
					local302 = local205.method1377(local285);
					if (local302 > local211) {
						local211 = local302;
					}
				}
				local213 = arg1.anInt3617 - local211 / 2;
				if (local7 > local213) {
					local7 = local213;
				}
				local215 = local211 / 2 + arg1.anInt3617;
				if (local9 < local215) {
					local9 = local215;
				}
				local228 = local209;
				local230 = local207 * local205.method1375() + local209;
				if (local11 > local228) {
					local11 = local228;
				}
				if (local230 > local13) {
					local13 = local230;
				}
			}
		}
		if (local9 < Static353.anInt2627 || local7 > Static353.anInt2631 || local13 < Static353.anInt2626 || Static353.anInt2624 < local11) {
			return true;
		}
		@Pc(405) int local405;
		if (arg2.anIntArray289 != null) {
			@Pc(403) int[] local403 = new int[arg2.anIntArray289.length];
			for (local405 = 0; local405 < local403.length / 2; local405++) {
				local302 = arg1.anInt3618 + arg2.anIntArray289[local405 * 2];
				@Pc(429) int local429 = arg1.anInt3621 + arg2.anIntArray289[local405 * 2 + 1];
				local403[local405 * 2] = (local302 - Static353.anInt2620) * (Static353.anInt2631 + -Static353.anInt2627) / (Static353.anInt2625 - Static353.anInt2620) + Static353.anInt2627;
				local403[local405 * 2 + 1] = Static353.anInt2624 - (local429 - Static353.anInt2622) * (-Static353.anInt2626 + Static353.anInt2624) / (Static353.anInt2628 - Static353.anInt2622);
			}
			Static106.method1508(arg0, local403, arg2.anInt2272);
			for (local302 = 0; local302 < local403.length / 2 - 1; local302++) {
				arg0.method5358(local403[local302 * 2 + 2 + 1], arg2.anInt2265, local403[local302 * 2], local403[local302 * 2 + 1], local403[(local302 + 1) * 2]);
			}
			arg0.method5358(local403[1], arg2.anInt2265, local403[local403.length - 2], local403[local403.length - 1], local403[0]);
		}
		if (local102 != null) {
			if (Static346.anInt5675 > 0 && (Static355.anInt4357 != -1 && Static355.anInt4357 == arg1.anInt3616 || Static276.anInt5133 != -1 && Static276.anInt5133 == arg2.anInt2292)) {
				if (Static134.anInt2508 > 50) {
					local279 = (100 - Static134.anInt2508) * 2;
				} else {
					local279 = Static134.anInt2508 * 2;
				}
				local405 = local279 << 24 | 0xFFFF00;
				arg0.method5371(local102.method4685() / 2 + 7, arg1.anInt3617, local405, arg1.anInt3615);
				arg0.method5371(local102.method4685() / 2 + 5, arg1.anInt3617, local405, arg1.anInt3615);
				arg0.method5371(local102.method4685() / 2 + 3, arg1.anInt3617, local405, arg1.anInt3615);
				arg0.method5371(local102.method4685() / 2 + 1, arg1.anInt3617, local405, arg1.anInt3615);
				arg0.method5371(local102.method4685() / 2, arg1.anInt3617, local405, arg1.anInt3615);
			}
			local102.method4669(arg1.anInt3617 - (local102.method4682() >> 1), arg1.anInt3615 + -(local102.method4673() >> 1));
		}
		if (arg2.aString22 != null && local205 != null) {
			Static272.method4176(local205, local207, local211, arg1, arg0, local209, arg2);
		}
		if (arg2.anInt2268 != -1 || arg2.aString22 != null) {
			@Pc(730) Class1_Sub10 local730 = new Class1_Sub10(arg1);
			local730.anInt1445 = local104;
			local730.anInt1447 = local215;
			local730.anInt1451 = local230;
			local730.anInt1449 = local108;
			local730.anInt1448 = local110;
			local730.anInt1446 = local106;
			local730.anInt1442 = local213;
			local730.anInt1444 = local228;
			Static35.aClass17_8.method199(local730);
		}
		return false;
	}
}
