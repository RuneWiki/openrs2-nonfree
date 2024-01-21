import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_20;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1131 = Static106.method1849("Error loading your profile)3");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1128 = aClass66_1131;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1136 = Static106.method1849("Please try again)3");

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1129 = aClass66_1136;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1130 = Static106.method1849(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1132 = Static106.method1849("M");

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1138 = Static106.method1849("Loading fonts )2 ");

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1133 = aClass66_1138;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1134 = aClass66_1132;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1135 = aClass66_1132;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1137 = Static106.method1849("mapfunction");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1452() {
		Static17.aClass60_26.method1747();
		Static34.aClass60_11.method1747();
		Static8.aClass60_22.method1747();
		Static129.aClass60_90.method1747();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method1453() {
		aClass66_1137 = null;
		aClass5_Sub1_20 = null;
		aClass66_1135 = null;
		aClass66_1138 = null;
		aClass66_1133 = null;
		anIntArrayArrayArray6 = null;
		aClass66_1128 = null;
		aClass66_1129 = null;
		aClass66_1131 = null;
		aClass66_1136 = null;
		aClass66_1132 = null;
		aClass66_1130 = null;
		aClass66_1134 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBI)V")
	public static void method1454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		@Pc(16) Class1_Sub1_Sub4 local16 = (Class1_Sub1_Sub4) Static44.aClass65_18.method1802(local10);
		if (local16 != null) {
			Static34.aClass42_2.method1308(local16);
		}
	}
}
