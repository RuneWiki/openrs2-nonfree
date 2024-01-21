import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
	public static int anInt1687;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1007 = Static118.method2249("Loading textures )2 ");

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1008 = Static118.method2249("(U(Y");

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1009 = Static118.method2249("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1010 = aClass65_1007;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([IIIIIII)V")
	public static void method1142(@OriginalArg(0) int[] arg0) {
		Static25.anInt733 = 25;
		Static137.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static25.anInt733 + Static25.anInt733 + 1][Static25.anInt733 + Static25.anInt733 + 1];
		Static83.anInt2032 = 0;
		Static78.anInt1921 = 0;
		Static4.anInt87 = 512;
		Static102.anInt2552 = 334;
		Static125.anInt3097 = 256;
		Static107.anInt2623 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static25.anInt733 + Static25.anInt733 + 3][Static25.anInt733 + Static25.anInt733 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static201.anInt3974 = Class1_Sub2_Sub5_Sub2.anIntArray138[local47];
				Static123.anInt3073 = Class1_Sub2_Sub5_Sub2.anIntArray142[local47];
				Static36.anInt1022 = Class1_Sub2_Sub5_Sub2.anIntArray138[local50];
				Static14.anInt388 = Class1_Sub2_Sub5_Sub2.anIntArray142[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static25.anInt733 + 1); local82 <= Static25.anInt733 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static25.anInt733 + 1); local88 <= Static25.anInt733 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static100.method1902(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static25.anInt733 + 1][local88 + Static25.anInt733 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static25.anInt733; local77 < Static25.anInt733; local77++) {
					for (local82 = -Static25.anInt733; local82 < Static25.anInt733; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static25.anInt733 + 1][local82 + local97 + Static25.anInt733 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static25.anInt733 + 1][local82 + local97 + Static25.anInt733 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static25.anInt733 + 1][local82 + local97 + Static25.anInt733 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static25.anInt733 + 1][local82 + local97 + Static25.anInt733 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static137.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static25.anInt733][local82 + Static25.anInt733] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I")
	public static int method1143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(19) int local19 = arg2 & arg1 - 1;
		@Pc(28) int local28 = arg2 / arg1;
		@Pc(33) int local33 = Static96.method1819(local7, local28);
		@Pc(40) int local40 = Static96.method1819(local7 + 1, local28);
		@Pc(47) int local47 = Static96.method1819(local7, local28 + 1);
		@Pc(56) int local56 = Static96.method1819(local7 + 1, local28 + 1);
		@Pc(63) int local63 = Static26.method476(local13, local33, arg1, local40);
		@Pc(70) int local70 = Static26.method476(local13, local47, arg1, local56);
		return Static26.method476(local19, local63, arg1, local70);
	}
}
