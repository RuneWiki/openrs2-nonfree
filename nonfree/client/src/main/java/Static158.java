import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_45;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public static int anInt3438 = 0;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	public static int anInt3439 = 0;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public static volatile int anInt3440 = 0;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1214 = Static64.method1101("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1216 = Static64.method1101("Starting 3d library");

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1215 = aClass51_1216;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	public static int anInt3442 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
	public static void method2685() {
		Static114.aClass1_Sub7ArrayArrayArray2 = new Class1_Sub7[4][104][104];
		Static190.anIntArrayArrayArray9 = new int[4][105][105];
		Static136.method2044();
		Static58.anInt1373 = 104;
		Static172.anInt3854 = 104;
		Static148.anIntArrayArrayArray7 = new int[4][105][105];
		Static3.method66();
		Static62.anInt1432 = 25;
		Static165.aBooleanArrayArray1 = new boolean[Static62.anInt1432 + Static62.anInt1432 + 1][Static62.anInt1432 + Static62.anInt1432 + 1];
		Static213.aBooleanArrayArray2 = new boolean[Static62.anInt1432 + Static62.anInt1432 + 2][Static62.anInt1432 + Static62.anInt1432 + 2];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([IIIIII)V")
	public static void method2686(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class126 local13 = local7.aClass126_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4886;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class95 local58 = local7.aClass95_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3857;
		@Pc(67) int local67 = local58.anInt3858;
		@Pc(70) int local70 = local58.anInt3856;
		@Pc(73) int local73 = local58.anInt3855;
		@Pc(77) int[] local77 = Static167.anIntArrayArray24[local23];
		@Pc(81) int[] local81 = Static135.anIntArrayArray18[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Lclient!ia;")
	public static Class51 method2687(@OriginalArg(1) int arg0) {
		@Pc(7) Class51 local7 = new Class51();
		local7.aByteArray17 = new byte[arg0];
		local7.anInt1858 = 0;
		return local7;
	}
}
