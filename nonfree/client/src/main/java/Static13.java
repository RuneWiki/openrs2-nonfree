import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "h", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	public static int anInt192;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Lclient!qn;")
	public static Class211 aClass211_11;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_7 = new Class15("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!am", name = "k", descriptor = "[I")
	public static final int[] anIntArray10 = new int[4096];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method163(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg1 ? Static350.aClass66_1.anInt1725 : Static350.aClass66_1.anInt1729);
		for (@Pc(36) int local36 = local19; local36 < local29; local36++) {
			@Pc(43) Class4_Sub2_Sub18 local43 = Static350.aClass66_1.method1411(local36);
			if (local43.aBoolean488 && local43.method5545().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static193.aShortArray15 = null;
					Static246.anInt4087 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(77) short[] local77 = new short[local11.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local13; local79++) {
						local77[local79] = local11[local79];
					}
					local11 = local77;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static237.anInt5935 = 0;
		Static246.anInt4087 = local13;
		Static193.aShortArray15 = local11;
		@Pc(116) String[] local116 = new String[Static246.anInt4087];
		for (@Pc(118) int local118 = 0; local118 < Static246.anInt4087; local118++) {
			local116[local118] = Static350.aClass66_1.method1411(local11[local118]).method5545();
		}
		Static274.method3653(Static193.aShortArray15, local116);
	}
}
