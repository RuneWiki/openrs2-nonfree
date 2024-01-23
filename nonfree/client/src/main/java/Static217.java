import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!rc;")
	public static Class2_Sub2_Sub16 aClass2_Sub2_Sub16_4;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
	public static int anInt4760 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V")
	public static void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class35 local13 = local7.aClass35_1;
		if (local13 != null) {
			local13.anInt1616 = local13.anInt1616 * arg3 / 16;
			local13.anInt1614 = local13.anInt1614 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public static void method3296() {
		@Pc(13) int local13 = Static111.anInt2664 - (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
		@Pc(23) int local23 = Static142.anInt3263 - (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1);
		@Pc(33) int local33 = Static111.anInt2664 + (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
		if (local13 < 0) {
			Static111.anInt2664 = (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
			Static167.anInt3886 = -1;
			Static32.anInt850 = -1;
		}
		if (Static95.anInt2353 < local33) {
			Static111.anInt2664 = Static95.anInt2353 - (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
			Static32.anInt850 = -1;
			Static167.anInt3886 = -1;
		}
		@Pc(76) int local76 = (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1) + Static142.anInt3263;
		if (local23 < 0) {
			Static142.anInt3263 = (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1);
			Static167.anInt3886 = -1;
			Static32.anInt850 = -1;
		}
		if (local76 > Static40.anInt1214) {
			Static142.anInt3263 = Static40.anInt1214 - (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1);
			Static167.anInt3886 = -1;
			Static32.anInt850 = -1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public static void method3297() {
		if (!Static94.aBoolean123) {
			Static48.aShortArray34[0] = 1007;
			Static59.aClass41Array24[0] = Static5.aClass41_50;
			Static179.anInt4150 = 1;
			Static177.aClass41Array63[0] = Static156.aClass41_981;
		}
		if (Static39.anInt1055 != -1) {
			Static192.method3029(Static39.anInt1055);
		}
		for (@Pc(30) int local30 = 0; local30 < Static182.anInt4210; local30++) {
			if (Static199.aBooleanArray23[local30]) {
				Static187.aBooleanArray22[local30] = true;
			}
			Static99.aBooleanArray13[local30] = Static199.aBooleanArray23[local30];
			Static199.aBooleanArray23[local30] = false;
		}
		Static199.aClass80_15 = null;
		Static53.anInt1532 = -1;
		Static96.anInt2368 = Static103.anInt2511;
		Static118.anInt2858 = -1;
		if (Static39.anInt1055 != -1) {
			Static182.anInt4210 = 0;
			Static48.method965(Static130.anInt3906, Static39.anInt1055, 0, -1, 0, 0, 0, Static197.anInt4442);
		}
		Static64.method1165();
		Static20.method431();
		if (Static94.aBoolean123) {
			Static36.method697();
		} else if (Static53.anInt1532 != -1) {
			Static84.method1524(Static118.anInt2858, Static53.anInt1532);
		}
		if (Static119.anInt2867 == 3) {
			for (@Pc(105) int local105 = 0; local105 < Static182.anInt4210; local105++) {
				if (Static99.aBooleanArray13[local105]) {
					Static64.method1183(Static71.anIntArray175[local105], Static117.anIntArray303[local105], Static118.anIntArray306[local105], Static70.anIntArray173[local105], 16711935, 128);
				} else if (Static187.aBooleanArray22[local105]) {
					Static64.method1183(Static71.anIntArray175[local105], Static117.anIntArray303[local105], Static118.anIntArray306[local105], Static70.anIntArray173[local105], 16711680, 128);
				}
			}
		}
		Static14.method297(Static213.aClass12_Sub3_Sub1_1.anInt3949, Static16.anInt432, Static213.aClass12_Sub3_Sub1_1.anInt3961, Static134.anInt3147);
		Static16.anInt432 = 0;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIII)I")
	public static int method3298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
