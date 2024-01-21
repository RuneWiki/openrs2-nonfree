import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_805 = Static151.method2243("Hidden");

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!mb;")
	public static Class62 aClass62_801 = aClass62_805;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_803 = Static151.method2243("Loaded interfaces");

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Lclient!mb;")
	public static Class62 aClass62_802 = aClass62_803;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_806 = Static151.method2243("Loading sprites )2 ");

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!mb;")
	public static Class62 aClass62_804 = aClass62_806;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
	public static void method1641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class2_Sub24 local16 = (Class2_Sub24) Static204.aClass58_14.method1704((long) arg3);
		if (local16 == null) {
			local16 = new Class2_Sub24();
			Static204.aClass58_14.method1708(local16, (long) arg3);
		}
		if (arg2 >= local16.anIntArray366.length) {
			@Pc(44) int[] local44 = new int[arg2 + 1];
			@Pc(49) int[] local49 = new int[arg2 + 1];
			for (@Pc(51) int local51 = 0; local51 < local16.anIntArray366.length; local51++) {
				local44[local51] = local16.anIntArray366[local51];
				local49[local51] = local16.anIntArray367[local51];
			}
			for (@Pc(77) int local77 = local16.anIntArray366.length; local77 < arg2; local77++) {
				local44[local77] = -1;
				local49[local77] = 0;
			}
			local16.anIntArray366 = local44;
			local16.anIntArray367 = local49;
		}
		local16.anIntArray366[arg2] = arg1;
		local16.anIntArray367[arg2] = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public static void method1647() {
		if (!Static180.aBoolean167) {
			Static6.aClass62Array5[0] = Static169.aClass62_1265;
			Static51.anInt1111 = 1;
			Static87.aClass62Array53[0] = Static69.aClass62_484;
			Static26.aShortArray134[0] = 1007;
		}
		if (Static40.anInt969 != -1) {
			Static190.method2726(Static40.anInt969);
		}
		for (@Pc(30) int local30 = 0; local30 < Static29.anInt713; local30++) {
			if (Static176.aBooleanArray19[local30]) {
				Static32.aBooleanArray3[local30] = true;
			}
			Static21.aBooleanArray2[local30] = Static176.aBooleanArray19[local30];
			Static176.aBooleanArray19[local30] = false;
		}
		Static26.anInt3841 = -1;
		Static49.anInt1077 = Static25.anInt581;
		Static197.anInt4092 = -1;
		Static102.aClass47_10 = null;
		if (Static40.anInt969 != -1) {
			Static29.anInt713 = 0;
			Static148.method2212(0, Static40.anInt969, Static42.anInt4285, 0, -1, 0, Static169.anInt3579, 0);
		}
		Static212.method3097();
		Static194.method2776();
		if (Static180.aBoolean167) {
			Static191.method2738();
		} else if (Static26.anInt3841 != -1) {
			Static66.method925(Static26.anInt3841, Static197.anInt4092);
		}
		if (Static182.anInt3831 == 3) {
			for (@Pc(108) int local108 = 0; local108 < Static29.anInt713; local108++) {
				if (Static21.aBooleanArray2[local108]) {
					Static212.method3109(Static181.anIntArray332[local108], Static209.anIntArray391[local108], Static11.anIntArray26[local108], Static115.anIntArray237[local108], 16711935, 128);
				} else if (Static32.aBooleanArray3[local108]) {
					Static212.method3109(Static181.anIntArray332[local108], Static209.anIntArray391[local108], Static11.anIntArray26[local108], Static115.anIntArray237[local108], 16711680, 128);
				}
			}
		}
		Static47.method727(Static186.aClass7_Sub2_Sub2_1.anInt3085, Static126.anInt2806, Static103.anInt2221, Static186.aClass7_Sub2_Sub2_1.anInt3046);
		Static103.anInt2221 = 0;
	}
}
