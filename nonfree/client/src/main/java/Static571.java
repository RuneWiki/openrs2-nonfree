import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static571 {

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "[[[Lclient!ko;")
	public static Class182[][][] aClass182ArrayArrayArray3;

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array15;

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "Lclient!is;")
	public static Class155 aClass155_17;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)V")
	public static void method8034() {
		Static433.anInt8342 = -1;
		Static441.aClass88_29 = null;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IBI)Z")
	public static boolean method8035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "(I)V")
	public static void method8036() {
		if (Static594.aString235.toLowerCase().indexOf("microsoft") != -1) {
			Static547.anIntArray561[189] = 26;
			Static547.anIntArray561[222] = 59;
			Static547.anIntArray561[219] = 42;
			Static547.anIntArray561[186] = 57;
			Static547.anIntArray561[192] = 58;
			Static547.anIntArray561[191] = 73;
			Static547.anIntArray561[223] = 28;
			Static547.anIntArray561[220] = 74;
			Static547.anIntArray561[188] = 71;
			Static547.anIntArray561[221] = 43;
			Static547.anIntArray561[190] = 72;
			Static547.anIntArray561[187] = 27;
			return;
		}
		Static547.anIntArray561[61] = 27;
		Static547.anIntArray561[92] = 74;
		Static547.anIntArray561[91] = 42;
		Static547.anIntArray561[93] = 43;
		Static547.anIntArray561[46] = 72;
		if (Static594.aMethod2 == null) {
			Static547.anIntArray561[192] = 58;
			Static547.anIntArray561[222] = 59;
		} else {
			Static547.anIntArray561[192] = 28;
			Static547.anIntArray561[222] = 58;
			Static547.anIntArray561[520] = 59;
		}
		Static547.anIntArray561[45] = 26;
		Static547.anIntArray561[47] = 73;
		Static547.anIntArray561[59] = 57;
		Static547.anIntArray561[44] = 71;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!vo;B)V")
	public static void method8037(@OriginalArg(0) Class348 arg0) {
		Static9.anInt757 = arg0.method7966("p11_full");
		Static410.anInt8176 = arg0.method7966("p12_full");
		Static558.anInt10185 = arg0.method7966("b12_full");
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!vo;ILclient!fa;)V")
	public static void method8039(@OriginalArg(0) Class348 arg0, @OriginalArg(2) Interface7 arg1) {
		Static197.aClass348_50 = arg0;
		Static99.anInterface7_4 = arg1;
	}
}
