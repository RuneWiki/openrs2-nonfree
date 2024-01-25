import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZILclient!lb;III)V")
	public static void method6421(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class185 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static5.anInt118 >= 50 || (arg2 == null || arg2.anIntArrayArray114 == null || arg5 >= arg2.anIntArrayArray114.length || arg2.anIntArrayArray114[arg5] == null)) {
			return;
		}
		@Pc(36) int local36 = arg2.anIntArrayArray114[arg5][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg2.anIntArrayArray114[arg5].length > 1) {
			local65 = (int) ((double) arg2.anIntArrayArray114[arg5].length * Math.random());
			if (local65 > 0) {
				local40 = arg2.anIntArrayArray114[arg5][local65];
			}
		}
		@Pc(81) int local81 = local36 & 0x1F;
		if (local81 == 0) {
			if (arg0) {
				if (!arg2.aBoolean360) {
					Static32.method540(255, local40, 0, local46);
					return;
				}
				Static39.method648(255, 0, local40, local46, false);
			}
		} else if (Static405.aClass3_Sub3_Sub1_1.anInt7577 != 0) {
			local65 = arg1 - 256 >> 9;
			@Pc(122) int local122 = arg4 - 256 >> 9;
			Static204.aClass347Array1[Static5.anInt118++] = new Class347((byte) (arg2.aBoolean360 ? 2 : 1), local40, local46, 0, 255, local81 + (local65 << 16) + (arg3 << 24) + (local122 << 8));
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method6422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!Static293.method3974(arg0)) {
			return;
		}
		if (Static259.aClass361ArrayArray1[arg0] == null) {
			Static71.method1521(Static380.aClass361ArrayArray2[arg0], -1, arg5, arg2, arg3, arg8, arg6, arg7, arg1, arg4);
		} else {
			Static71.method1521(Static259.aClass361ArrayArray1[arg0], -1, arg5, arg2, arg3, arg8, arg6, arg7, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method6424(@OriginalArg(1) Class322 arg0) {
		Static70.anInt1594 = arg0.method6823("hitmarks");
		Static196.anInt9122 = arg0.method6823("hitbar_default");
		Static61.anInt1467 = arg0.method6823("timerbar_default");
		Static339.anInt5929 = arg0.method6823("headicons_pk");
		Static403.anInt6974 = arg0.method6823("headicons_prayer");
		Static498.anInt8095 = arg0.method6823("hint_headicons");
		Static466.anInt7754 = arg0.method6823("hint_mapmarkers");
		Static275.anInt4831 = arg0.method6823("mapflag");
		Static261.anInt4597 = arg0.method6823("cross");
		Static230.anInt4044 = arg0.method6823("mapdots");
		Static96.anInt1960 = arg0.method6823("scrollbar");
		Static476.anInt7884 = arg0.method6823("name_icons");
		Static283.anInt4877 = arg0.method6823("floorshadows");
		Static366.anInt6318 = arg0.method6823("compass");
		Static391.anInt6857 = arg0.method6823("otherlevel");
		Static100.anInt2048 = arg0.method6823("hint_mapedge");
	}
}
