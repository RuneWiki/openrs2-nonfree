import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public static int anInt3489;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2045 = Static107.method1838(" loggt sich aus)3");

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	public static int anInt3491 = 0;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[Lclient!ph;")
	public static Class62[] aClass62Array1 = new Class62[6];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIIIIII)V")
	public static void method2405(@OriginalArg(0) int[] arg0) {
		Static91.anInt2325 = 25;
		Static126.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static91.anInt2325 + Static91.anInt2325 + 1][Static91.anInt2325 + Static91.anInt2325 + 1];
		Static123.anInt2918 = 0;
		Static38.anInt1031 = 0;
		Static63.anInt1753 = 512;
		Static81.anInt2514 = 334;
		Static96.anInt2436 = 256;
		Static13.anInt594 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static91.anInt2325 + Static91.anInt2325 + 3][Static91.anInt2325 + Static91.anInt2325 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static112.anInt2717 = Class2_Sub4_Sub3_Sub1.anIntArray58[local47];
				Static175.anInt3887 = Class2_Sub4_Sub3_Sub1.anIntArray60[local47];
				Static22.anInt738 = Class2_Sub4_Sub3_Sub1.anIntArray58[local50];
				Static66.anInt1786 = Class2_Sub4_Sub3_Sub1.anIntArray60[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static91.anInt2325 + 1); local82 <= Static91.anInt2325 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static91.anInt2325 + 1); local88 <= Static91.anInt2325 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static52.method968(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static91.anInt2325 + 1][local88 + Static91.anInt2325 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static91.anInt2325; local77 < Static91.anInt2325; local77++) {
					for (local82 = -Static91.anInt2325; local82 < Static91.anInt2325; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static91.anInt2325 + 1][local82 + local97 + Static91.anInt2325 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static91.anInt2325 + 1][local82 + local97 + Static91.anInt2325 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static91.anInt2325 + 1][local82 + local97 + Static91.anInt2325 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static91.anInt2325 + 1][local82 + local97 + Static91.anInt2325 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static126.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static91.anInt2325][local82 + Static91.anInt2325] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method2406() {
		aClass62Array1 = null;
		aClass28_2045 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V")
	public static void method2407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) int local24;
		if (arg0 != Static54.anInt1423) {
			Static36.anIntArray74 = new int[arg0];
			for (local24 = 0; local24 < arg0; local24++) {
				Static36.anIntArray74[local24] = (local24 << 12) / arg0;
			}
			Static73.anInt1916 = arg0 - 1;
			Static54.anInt1423 = arg0;
		}
		if (Static12.anInt558 == arg1) {
			return;
		}
		Static21.anIntArray50 = new int[arg1];
		for (local24 = 0; local24 < arg1; local24++) {
			Static21.anIntArray50[local24] = (local24 << 12) / arg1;
		}
		Static12.anInt558 = arg1;
		Static1.anInt2959 = arg1 - 1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLclient!ab;)Lclient!gg;")
	public static Class28 method2408(@OriginalArg(1) Class2_Sub2 arg0) {
		return Static110.method1879(arg0);
	}
}
