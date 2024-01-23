import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt638;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!bh;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public static int anInt637 = 0;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt639 = 0;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!cc;")
	public static Class22 aClass22_4 = null;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int anInt641 = 0;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method474() {
		aClass15_1 = null;
		aClass22_4 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BJ)V")
	public static void method475(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
	public static void method476(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static113.aBoolean165) {
			Static113.aBoolean165 = arg0;
			Static120.method2044();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(CZ)Z")
	public static boolean method477(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static43.aCharArray45;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(44) char local44 = local34[local36];
				if (local44 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method478() {
		if (Static126.anInt2695 == -1 || Static297.anInt5494 == -1) {
			return;
		}
		@Pc(22) int local22 = (Static268.anInt5016 * (Static121.anInt2646 - Static272.anInt5102) >> 16) + Static272.anInt5102;
		Static268.anInt5016 += local22;
		if (Static268.anInt5016 < 65535) {
			Static294.aBoolean284 = false;
			Static225.aBoolean296 = false;
		} else {
			Static268.anInt5016 = 65535;
			if (Static294.aBoolean284) {
				Static225.aBoolean296 = false;
			} else {
				Static225.aBoolean296 = true;
			}
			Static294.aBoolean284 = true;
		}
		@Pc(50) float[] local50 = new float[3];
		@Pc(55) float local55 = (float) Static268.anInt5016 / 65535.0F;
		@Pc(59) int local59 = Static220.anInt4360 * 2;
		@Pc(82) int local82;
		@Pc(128) int local128;
		@Pc(72) int local72;
		@Pc(133) int local133;
		@Pc(142) int local142;
		@Pc(160) int local160;
		for (@Pc(61) int local61 = 0; local61 < 3; local61++) {
			local72 = Static146.anIntArrayArrayArray8[Static126.anInt2695][local59][local61];
			local82 = Static146.anIntArrayArrayArray8[Static126.anInt2695][local59][local61] * 3;
			@Pc(94) int local94 = Static146.anIntArrayArrayArray8[Static126.anInt2695][local59 + 1][local61] * 3;
			local128 = (Static146.anIntArrayArrayArray8[Static126.anInt2695][local59 + 2][local61] + Static146.anIntArrayArrayArray8[Static126.anInt2695][local59 + 2][local61] - Static146.anIntArrayArrayArray8[Static126.anInt2695][local59 + 3][local61]) * 3;
			local133 = local94 - local82;
			local142 = local128 + local82 - local94 * 2;
			local160 = Static146.anIntArrayArrayArray8[Static126.anInt2695][local59 + 2][local61] + local94 - local128 - local72;
			local50[local61] = (float) local72 + ((float) local133 + local55 * ((float) local142 + local55 * (float) local160)) * local55;
		}
		Static149.anInt3032 = (int) local50[0] - Static170.anInt3385 * 128;
		Static160.anInt3185 = (int) local50[1] * -1;
		Static211.anInt4210 = (int) local50[2] - Static239.anInt4613 * 128;
		@Pc(212) float[] local212 = new float[3];
		local82 = Static85.anInt1720 * 2;
		for (local128 = 0; local128 < 3; local128++) {
			local72 = Static146.anIntArrayArrayArray8[Static297.anInt5494][local82][local128] * 3;
			local133 = Static146.anIntArrayArrayArray8[Static297.anInt5494][local82 + 1][local128] * 3;
			local160 = Static146.anIntArrayArrayArray8[Static297.anInt5494][local82][local128];
			local142 = (Static146.anIntArrayArrayArray8[Static297.anInt5494][local82 + 2][local128] + Static146.anIntArrayArrayArray8[Static297.anInt5494][local82 + 2][local128] - Static146.anIntArrayArrayArray8[Static297.anInt5494][local82 + 3][local128]) * 3;
			@Pc(297) int local297 = local133 - local72;
			@Pc(306) int local306 = local72 + local142 - local133 * 2;
			@Pc(323) int local323 = local133 + Static146.anIntArrayArrayArray8[Static297.anInt5494][local82 + 2][local128] - local160 - local142;
			local212[local128] = (float) local160 + ((float) local297 + ((float) local306 + local55 * (float) local323) * local55) * local55;
		}
		@Pc(356) float local356 = -1.0F * (local212[1] - local50[1]);
		@Pc(365) float local365 = local212[0] - local50[0];
		@Pc(374) float local374 = local212[2] - local50[2];
		@Pc(384) double local384 = Math.sqrt((double) (local365 * local365 + local374 * local374));
		Static125.aFloat23 = (float) Math.atan2((double) local356, local384);
		Static213.aFloat44 = -((float) Math.atan2((double) local365, (double) local374));
		Static299.anInt5560 = (int) ((double) Static125.aFloat23 * 325.949D) & 0x7FF;
		Static279.anInt5259 = (int) ((double) Static213.aFloat44 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public static void method479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 8) {
			arg0 = 4;
		}
		if (arg0 == 4 && !Static139.aBoolean188) {
			arg1 = 2;
			arg0 = 2;
		}
		if (arg0 != Static263.anInt908) {
			if (Static72.aBoolean96) {
				return;
			}
			if (Static263.anInt908 != 0) {
				Static240.anInterface3Array6[Static263.anInt908].method3960();
			}
			if (arg0 != 0) {
				@Pc(74) Interface3 local74 = Static240.anInterface3Array6[arg0];
				local74.method3961();
				local74.method3962(arg1);
			}
			Static263.anInt908 = arg0;
			Static86.anInt1772 = arg1;
		} else if (arg0 != 0 && Static86.anInt1772 != arg1) {
			Static240.anInterface3Array6[arg0].method3962(arg1);
			Static86.anInt1772 = arg1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IZ)V")
	public static void method480() {
		Static264.aClass33_38.method838(5);
		Static99.aClass33_15.method838(5);
	}
}
