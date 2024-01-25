import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!kg;")
	public static Class112 aClass112_10;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public static int anInt2903;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZJ)V")
	public static void method2737(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static46.method1121(arg0 - 1L);
			Static46.method1121(1L);
		} else {
			Static46.method1121(arg0);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method2738(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static99.anInt2276;
		@Pc(17) int[] local17 = Static238.anIntArray382;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(29) Class11_Sub2_Sub6_Sub1 local29 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local17[local21]];
			if (local29 != null && Static191.aClass11_Sub2_Sub6_Sub1_4 != local29 && local29.aString63 != null && local29.aString63.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static280.method5009(Static213.aClass18_145);
					Static339.aClass1_Sub7_Sub2_4.method2157(0);
					Static339.aClass1_Sub7_Sub2_4.method2101(local17[local21]);
				} else if (arg1 == 4) {
					Static280.method5009(Static8.aClass18_9);
					Static339.aClass1_Sub7_Sub2_4.method2121(0);
					Static339.aClass1_Sub7_Sub2_4.method2101(local17[local21]);
				} else if (arg1 == 5) {
					Static280.method5009(Static354.aClass18_224);
					Static339.aClass1_Sub7_Sub2_4.method2101(local17[local21]);
					Static339.aClass1_Sub7_Sub2_4.method2102(0);
				} else if (arg1 == 6) {
					Static280.method5009(Static352.aClass18_63);
					Static339.aClass1_Sub7_Sub2_4.method2101(local17[local21]);
					Static339.aClass1_Sub7_Sub2_4.method2157(0);
				} else if (arg1 == 7) {
					Static280.method5009(Static210.aClass18_140);
					Static339.aClass1_Sub7_Sub2_4.method2144(local17[local21]);
					Static339.aClass1_Sub7_Sub2_4.method2121(0);
				}
				local19 = true;
				break;
			}
		}
		if (!local19) {
			Static91.method6076(Static332.aClass106_219.method2927(Static254.anInt5172) + arg0);
		}
	}
}
