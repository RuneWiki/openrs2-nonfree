import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dj", name = "W", descriptor = "[I")
	public static int[] anIntArray101;

	@OriginalMember(owner = "client!dj", name = "P", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_23 = new Class253(37, -2);

	@OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
	public static int anInt1360 = 0;

	@OriginalMember(owner = "client!dj", name = "V", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_33 = new Class55("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!dj", name = "X", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
	public static int anInt1362 = 0;

	@OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
	public static int anInt1363 = 1;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBI)V")
	public static void method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static82.anInt1667 || Static316.anInt5188 > arg1) {
			return;
		}
		@Pc(19) boolean local19;
		if (Static293.anInt4886 > arg3) {
			local19 = false;
			arg3 = Static293.anInt4886;
		} else if (Static137.anInt2576 < arg3) {
			local19 = false;
			arg3 = Static137.anInt2576;
		} else {
			local19 = true;
		}
		@Pc(38) boolean local38;
		if (Static293.anInt4886 > arg2) {
			arg2 = Static293.anInt4886;
			local38 = false;
		} else if (arg2 > Static137.anInt2576) {
			local38 = false;
			arg2 = Static137.anInt2576;
		} else {
			local38 = true;
		}
		if (arg4 >= Static316.anInt5188) {
			Static404.method5769(Static353.anIntArrayArray48[arg4++], arg3, arg2, arg0);
		} else {
			arg4 = Static316.anInt5188;
		}
		if (Static82.anInt1667 < arg1) {
			arg1 = Static82.anInt1667;
		} else {
			Static404.method5769(Static353.anIntArrayArray48[arg1--], arg3, arg2, arg0);
		}
		@Pc(93) int local93;
		if (local19 && local38) {
			for (local93 = arg4; local93 <= arg1; local93++) {
				@Pc(99) int[] local99 = Static353.anIntArrayArray48[local93];
				local99[arg3] = local99[arg2] = arg0;
			}
		} else if (local19) {
			for (local93 = arg4; local93 <= arg1; local93++) {
				Static353.anIntArrayArray48[local93][arg3] = arg0;
			}
		} else if (local38) {
			for (local93 = arg4; local93 <= arg1; local93++) {
				Static353.anIntArrayArray48[local93][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
	public static void method1173() {
		Static258.aClass155_5.method3347();
		Static76.aClass233_3.method4850();
		Static430.aClass162_2.method3436();
		Static411.aClass142_4.method3151();
		Static442.aClass98_1.method2239();
		Static259.aClass206_2.method4321();
		Static364.aClass151_2.method3291();
		Static79.aClass231_1.method4829();
		Static446.aClass53_1.method1178();
		Static172.aClass123_1.method2742();
		Static223.aClass154_1.method3338();
		Static351.aClass176_4.method3719();
		Static106.aClass62_3.method1479();
		Static138.aClass122_1.method2724();
		Static443.aClass193_4.method4072();
		Static439.aClass255_1.method5272();
		Static411.aClass217_1.method4443();
		Static230.aClass152_1.method3294();
		Static23.aClass29_1.method514();
		Static109.aClass18_1.method205();
		Static12.method103();
		Static413.method5187();
		Static130.method2095();
		if (Static167.aClass136_5 != Static313.aClass136_7) {
			for (@Pc(76) int local76 = 0; local76 < Static423.aByteArrayArray23.length; local76++) {
				Static423.aByteArrayArray23[local76] = null;
			}
			Static144.anInt2767 = 0;
		}
		Static47.method610();
		Static322.method4271();
		Static211.method3035();
		Static105.method1839();
		Static2.method5();
		Static159.aClass126_23.method2827();
		Static269.aClass51_9.method5300();
		Static201.aClass86_2.method2016();
		Static90.method1615();
		Static264.aClass178_80.method3814();
		Static432.aClass178_136.method3814();
		Static413.aClass178_124.method3814();
		Static415.aClass178_127.method3814();
		Static32.aClass178_12.method3814();
		Static402.aClass178_123.method3814();
		Static122.aClass178_39.method3814();
		Static80.aClass178_22.method3814();
		Static25.aClass178_9.method3814();
		Static15.aClass178_4.method3814();
		Static170.aClass178_83.method3814();
		Static236.aClass178_67.method3814();
		Static78.aClass178_20.method3814();
		Static249.aClass178_74.method3814();
		Static282.aClass178_86.method3814();
		Static271.aClass178_82.method3814();
		Static4.aClass178_137.method3814();
		Static398.aClass178_122.method3814();
		Static106.aClass178_32.method3814();
		Static20.aClass178_34.method3814();
		Static388.aClass178_120.method3814();
		Static419.aClass178_129.method3814();
		Static331.aClass178_102.method3814();
		Static224.aClass178_108.method3814();
		Static206.aClass178_58.method3814();
		Static197.aClass178_54.method3814();
		Static81.aClass178_23.method3814();
		Static237.aClass178_68.method3814();
		Static70.aClass178_19.method3814();
		Static20.aClass178_33.method3814();
		Static87.aClass126_16.method2827();
		Static343.aClass126_51.method2827();
		Static322.aClass126_44.method2827();
		Static270.aClass126_38.method2827();
	}
}
