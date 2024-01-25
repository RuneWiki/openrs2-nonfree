import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_20 = new Class242(80, 16);

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "[I")
	public static final int[] anIntArray119 = new int[2];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method966(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(27) String local27 = Static91.method1066(arg0);
		if (local27 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static148.anInt2307; local32++) {
			@Pc(38) String local38 = Static108.aStringArray10[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static91.method1066(local38);
			if (local38 != null && local38.equals(local27)) {
				Static148.anInt2307--;
				for (@Pc(62) int local62 = local32; local62 < Static148.anInt2307; local62++) {
					Static108.aStringArray10[local62] = Static108.aStringArray10[local62 + 1];
					Static313.aStringArray41[local62] = Static313.aStringArray41[local62 + 1];
					Static284.anIntArray359[local62] = Static284.anIntArray359[local62 + 1];
					Static57.aStringArray5[local62] = Static57.aStringArray5[local62 + 1];
					Static402.anIntArray467[local62] = Static402.anIntArray467[local62 + 1];
					Static67.aBooleanArray155[local62] = Static67.aBooleanArray155[local62 + 1];
				}
				Static75.anInt1071 = Static163.anInt5780;
				Static178.method2589(Static85.aClass242_104);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(arg0));
				Static426.aClass1_Sub19_Sub2_2.method2935(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public static void method968() {
		Static31.aClass204_1.method4346();
		Static425.aClass60_5.method971();
		Static241.aClass97_1.method1756();
		Static86.aClass248_7.method5249();
		Static428.aClass196_1.method4164();
		Static285.aClass226_2.method4780();
		Static402.aClass37_2.method667();
		Static46.aClass123_5.method2678();
		Static197.aClass76_1.method1383();
		Static186.aClass233_1.method4877();
		Static106.aClass199_131.method4207();
		Static60.aClass223_1.method4706();
		Static205.aClass36_2.method657();
		Static111.aClass26_1.method359();
		Static256.aClass136_1.method3018();
		Static202.aClass237_27.method5082();
		Static429.aClass126_1.method2691();
		Static331.aClass42_1.method808();
		Static285.aClass3_2.method22();
		Static257.aClass153_1.method3524();
		Static253.method3569();
		Static194.method2803();
		Static137.method1747();
		Static124.method1517();
		Static13.aClass77_6.method1394();
		Static12.aClass77_5.method1394();
		Static4.aClass77_3.method1394();
		Static439.aClass77_59.method1394();
		Static198.aClass77_30.method1394();
	}
}
