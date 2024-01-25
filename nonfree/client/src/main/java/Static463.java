import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!gi;")
	public static Class108 aClass108_1;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	public static int anInt7846;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_117 = new Class306(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!dg;IBI)V")
	public static void method6527(@OriginalArg(1) Class49_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray428[0];
		@Pc(15) int local15 = arg0.anIntArray427[0];
		if (local10 < 0 || local10 >= Static459.anInt7799 || local15 < 0 || local15 >= Static482.anInt7990 || (arg1 < 0 || Static459.anInt7799 <= arg1 || arg2 < 0 || arg2 >= Static482.anInt7990)) {
			return;
		}
		@Pc(72) int local72 = Static311.method1477(0, arg0.method3788(), local15, 0, -4, Static491.anIntArray760, true, arg2, 0, 0, Static86.aClass91Array1[arg0.aByte98], local10, Static421.anIntArray703, arg1);
		if (local72 >= 1 && local72 <= 3) {
			for (@Pc(89) int local89 = 0; local89 < local72 - 1; local89++) {
				arg0.method1532((byte) 2, Static491.anIntArray760[local89], Static421.anIntArray703[local89]);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method6528() {
		Static455.aClass1_Sub6_Sub2_2.method3948(Static390.aClass171_92.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static93.aClass171_38.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static429.aClass171_146.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static129.aClass171_46.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static361.aClass171_109.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static223.aClass171_77.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static235.aClass171_78.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static179.aClass171_69.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static543.aClass171_154.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static94.aClass171_39.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static410.aClass171_127.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static7.aClass171_5.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static409.aClass171_126.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static542.aClass171_152.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static546.aClass171_60.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static354.aClass171_105.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static140.aClass171_55.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static441.aClass171_137.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static266.aClass171_150.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static342.aClass171_98.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static193.aClass171_125.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static13.aClass171_12.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static88.aClass171_37.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static154.aClass171_59.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static192.aClass171_72.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static133.aClass171_47.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static307.aClass171_88.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static76.aClass171_30.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static352.aClass171_103.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static193.aClass171_124.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static71.aClass171_29.method4351());
		Static455.aClass1_Sub6_Sub2_2.method3948(Static313.aClass171_93.method4351());
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
	public static int method6529(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method6530() {
		if (Static432.anInt7513 < 0) {
			return;
		}
		@Pc(18) long local18 = Static60.method1119();
		Static432.anInt7513 = (int) ((long) Static432.anInt7513 + Static510.aLong319 - local18);
		if (Static432.anInt7513 <= 0) {
			Static2.aFloat116 = Static115.aClass283_2.aFloat147;
			Static124.aFloat26 = Static115.aClass283_2.aFloat148;
			Static235.aFloat99 = Static115.aClass283_2.aFloat150;
			Static283.aFloat106 = Static115.aClass283_2.aFloat149;
			Static432.anInt7513 = -1;
			Static104.aClass45_2 = Static115.aClass283_2.aClass45_4;
			Static498.aFloat160 = Static115.aClass283_2.aFloat152;
			Static69.anInt1328 = Static115.aClass283_2.anInt7856;
			Static493.aFloat157 = Static115.aClass283_2.aFloat151;
			Static24.anInt539 = Static115.aClass283_2.anInt7854;
			Static184.anInt7343 = Static115.aClass283_2.anInt7851;
		} else {
			@Pc(72) int local72 = (Static432.anInt7513 << 8) / Static248.anInt2367;
			@Pc(77) int local77 = 255 - local72;
			@Pc(82) float local82 = (float) local72 / 255.0F;
			Static69.anInt1328 = (local72 * (Static141.anInt2697 & 0xFF00) + local77 * (Static115.aClass283_2.anInt7856 & 0xFF00) & 0xFF0000) + (local72 * (Static141.anInt2697 & 0xFF00FF) + local77 * (Static115.aClass283_2.anInt7856 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(119) float local119 = 1.0F - local82;
			Static235.aFloat99 = (Static115.aClass283_2.aFloat150 - Static224.aFloat96) * local119 + Static224.aFloat96;
			Static24.anInt539 = (local77 * (Static115.aClass283_2.anInt7854 & 0xFF00) + (Static150.anInt2781 & 0xFF00) * local72 & 0xFF0000) + ((Static150.anInt2781 & 0xFF00FF) * local72 + (local77 * (Static115.aClass283_2.anInt7854 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static124.aFloat26 = local119 * (Static115.aClass283_2.aFloat148 - Static302.aFloat114) + Static302.aFloat114;
			Static2.aFloat116 = Static402.aFloat142 + local119 * (Static115.aClass283_2.aFloat147 - Static402.aFloat142);
			Static184.anInt7343 = Static115.aClass283_2.anInt7851 * local77 + local72 * Static444.anInt7641 >> 8;
			Static498.aFloat160 = Static117.aFloat22 + (Static115.aClass283_2.aFloat152 - Static117.aFloat22) * local119;
			Static283.aFloat106 = local119 * (Static115.aClass283_2.aFloat149 - Static302.aFloat113) + Static302.aFloat113;
			Static493.aFloat157 = Static129.aFloat29 + local119 * (Static115.aClass283_2.aFloat151 - Static129.aFloat29);
			if (Static115.aClass283_2.aClass45_4 != Static5.aClass45_1) {
				Static104.aClass45_2 = Static487.aClass122_8.method7233(Static5.aClass45_1, Static115.aClass283_2.aClass45_4, local119, Static104.aClass45_2);
			}
		}
		Static510.aLong319 = local18;
	}
}
