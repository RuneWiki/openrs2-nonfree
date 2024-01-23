import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	public static int anInt4483;

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "J")
	public static long aLong155;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "[I")
	public static int[] anIntArray334 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	public static int anInt4484 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	public static void method3410() {
		if (Static21.aClass36_Sub3_Sub1_1 != null && Static21.aClass36_Sub3_Sub1_1.anInt4117 + 64 - Static21.aClass36_Sub3_Sub1_1.method3110() * 64 >> 7 == Static292.anInt5659 && Static21.aClass36_Sub3_Sub1_1.anInt4118 - (Static21.aClass36_Sub3_Sub1_1.method3110() - 1) * 64 >> 7 == Static67.anInt1466) {
			Static292.anInt5659 = 0;
		}
		@Pc(40) int local40;
		for (local40 = 0; local40 < 104; local40++) {
			for (@Pc(45) int local45 = 0; local45 < 104; local45++) {
				Static82.anIntArrayArray7[local40][local45] = 0;
			}
		}
		for (local40 = 0; local40 < Static61.anInt1336; local40++) {
			@Pc(77) Class36_Sub3_Sub1 local77 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local40]];
			if (local77 != null) {
				local77.aBoolean333 = false;
			}
		}
		for (local40 = 0; local40 < Static135.anInt2729; local40++) {
			@Pc(109) Class36_Sub3_Sub2 local109 = Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local40]];
			if (local109 != null) {
				local109.aBoolean333 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
	public static void method3411(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub1_Sub6 local8 = Static181.method2779(6, arg0);
		local8.method929();
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	public static void method3412() {
		if (Static169.aClass24ArrayArray1 == null) {
			return;
		}
		@Pc(7) Class24 local7 = new Class24();
		for (@Pc(9) int local9 = 0; local9 < 13; local9++) {
			for (@Pc(16) int local16 = 0; local16 < 13; local16++) {
				Static169.aClass24ArrayArray1[local9][local16] = local7;
			}
		}
	}
}
