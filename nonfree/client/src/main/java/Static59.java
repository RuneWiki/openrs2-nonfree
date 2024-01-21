import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public static int anInt1769;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_43;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!ec;")
	private static Class22 aClass22_460 = Static60.method1113("Attack");

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!ec;")
	private static Class22 aClass22_461 = Static60.method1113("Loading)3)3)3");

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_462 = Static60.method1113("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_463 = aClass22_460;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!ec;")
	public static Class22 aClass22_464 = Static60.method1113("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	public static int anInt1771 = 0;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_465 = aClass22_461;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1103() {
		aClass22_464 = null;
		aClass22_462 = null;
		aClass22_465 = null;
		aClass22_463 = null;
		aClass20_Sub1_43 = null;
		aClass22_461 = null;
		aClass22_460 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	public static void method1104(@OriginalArg(0) int arg0) {
		Static126.anInt3004 += arg0 * 128;
		@Pc(31) int local31;
		if (Static126.anInt3004 > Static5.anIntArray5.length) {
			Static126.anInt3004 -= Static5.anIntArray5.length;
			local31 = (int) (Math.random() * 12.0D);
			Static58.method1096(Static61.aClass4_Sub1_Sub2_Sub3Array5[local31]);
		}
		local31 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(75) int local75;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local75 = Static37.anIntArray105[local31 + local42] - Static5.anIntArray5[Static5.anIntArray5.length - 1 & local31 + Static126.anInt3004] * arg0 / 6;
			if (local75 < 0) {
				local75 = 0;
			}
			Static37.anIntArray105[local31++] = local75;
		}
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(110) int local110;
		for (local75 = 256 - arg0; local75 < 256; local75++) {
			local101 = local75 * 128;
			for (local103 = 0; local103 < 128; local103++) {
				local110 = (int) (Math.random() * 100.0D);
				if (local110 < 50 && local103 > 10 && local103 < 118) {
					Static37.anIntArray105[local101 + local103] = 255;
				} else {
					Static37.anIntArray105[local101 + local103] = 0;
				}
			}
		}
		if (Static55.anInt1115 > 0) {
			Static55.anInt1115 -= arg0 * 4;
		}
		if (Static71.anInt1912 > 0) {
			Static71.anInt1912 -= arg0 * 4;
		}
		if (Static55.anInt1115 == 0 && Static71.anInt1912 == 0) {
			local101 = (int) ((double) (2000 / arg0) * Math.random());
			if (local101 == 0) {
				Static55.anInt1115 = 1024;
			}
			if (local101 == 1) {
				Static71.anInt1912 = 1024;
			}
		}
		for (local101 = 0; local101 < 256 - arg0; local101++) {
			Static67.anIntArray189[local101] = Static67.anIntArray189[arg0 + local101];
		}
		for (local103 = 256 - arg0; local103 < 256; local103++) {
			Static67.anIntArray189[local103] = (int) (Math.sin((double) Static116.anInt2872 / 14.0D) * 16.0D + Math.sin((double) Static116.anInt2872 / 15.0D) * 14.0D + Math.sin((double) Static116.anInt2872 / 16.0D) * 12.0D);
			Static116.anInt2872++;
		}
		local110 = (arg0 + (Static117.anInt2877 & 0x1)) / 2;
		Static45.anInt1254 += arg0;
		if (local110 <= 0) {
			return;
		}
		@Pc(301) int local301;
		@Pc(294) int local294;
		for (@Pc(285) int local285 = 0; local285 < Static45.anInt1254 * 100; local285++) {
			local294 = (int) (Math.random() * 128.0D) + 128;
			local301 = (int) (Math.random() * 124.0D) + 2;
			Static37.anIntArray105[(local294 << 7) + local301] = 192;
		}
		Static45.anInt1254 = 0;
		@Pc(327) int local327;
		@Pc(330) int local330;
		for (local301 = 0; local301 < 256; local301++) {
			local294 = 0;
			local327 = local301 * 128;
			for (local330 = -local110; local330 < 128; local330++) {
				if (local330 + local110 < 128) {
					local294 += Static37.anIntArray105[local110 + local327 + local330];
				}
				if (local330 - local110 - 1 >= 0) {
					local294 -= Static37.anIntArray105[local327 + local330 - local110 - 1];
				}
				if (local330 >= 0) {
					Static3.anIntArray2[local330 + local327] = local294 / (local110 * 2 + 1);
				}
			}
		}
		for (local294 = 0; local294 < 128; local294++) {
			local327 = 0;
			for (local330 = -local110; local330 < 256; local330++) {
				@Pc(413) int local413 = local330 * 128;
				if (local330 + local110 < 256) {
					local327 += Static3.anIntArray2[local294 + local413 + local110 * 128];
				}
				if (local330 - local110 - 1 >= 0) {
					local327 -= Static3.anIntArray2[local413 + local294 - local110 * 128 - 128];
				}
				if (local330 >= 0) {
					Static37.anIntArray105[local294 + local413] = local327 / (local110 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ea;Lclient!ec;IZILclient!ec;I)V")
	public static void method1105(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(5) Class22 arg2) {
		@Pc(8) int local8 = arg0.method592(arg1);
		@Pc(14) int local14 = arg0.method606(arg2, local8);
		Static72.method1187(arg0, 255, local14, local8);
	}
}
