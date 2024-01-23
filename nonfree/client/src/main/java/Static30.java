import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cj", name = "hb", descriptor = "Lclient!mf;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "Lclient!i;")
	private static Class41 aClass41_206 = Static184.method2923("Close");

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "Lclient!i;")
	public static Class41 aClass41_205 = aClass41_206;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
	public static int anInt722 = 0;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
	public static int anInt726 = -1;

	@OriginalMember(owner = "client!cj", name = "cb", descriptor = "[I")
	public static int[] anIntArray64 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!cj", name = "db", descriptor = "Lclient!i;")
	public static Class41 aClass41_207 = Static184.method2923("Schlie-8en");

	@OriginalMember(owner = "client!cj", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_208 = Static184.method2923("<col=40ff00>");

	@OriginalMember(owner = "client!cj", name = "fb", descriptor = "Lclient!i;")
	public static Class41 aClass41_209 = Static184.method2923("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!cj", name = "gb", descriptor = "Lclient!id;")
	public static Class43 aClass43_6 = new Class43(128);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!i;)Lclient!we;")
	public static Class2_Sub27 method563(@OriginalArg(1) Class41 arg0) {
		if (arg0.method1393() == 0) {
			return null;
		}
		for (@Pc(27) Class2_Sub27 local27 = (Class2_Sub27) Static144.aClass108_11.method3322(); local27 != null; local27 = (Class2_Sub27) Static144.aClass108_11.method3331()) {
			if (local27.aClass41_1275.method1384(arg0)) {
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	public static void method566() {
		Static198.anInt4444 = 0;
		Static170.anInt3986 = 0;
		Static151.method2359();
		Static15.method303();
		Static83.method1494();
		Static154.method2515();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static198.anInt4444; local19++) {
			local25 = Static48.anIntArray131[local19];
			if (Static103.anInt2511 != Static216.aClass12_Sub3_Sub1Array1[local25].anInt3912) {
				Static216.aClass12_Sub3_Sub1Array1[local25] = null;
			}
		}
		if (Static204.aClass2_Sub3_Sub1_3.anInt239 != Static202.anInt1733) {
			throw new RuntimeException("gpp1 pos:" + Static204.aClass2_Sub3_Sub1_3.anInt239 + " psize:" + Static202.anInt1733);
		}
		for (local25 = 0; local25 < Static50.anInt2126; local25++) {
			if (Static216.aClass12_Sub3_Sub1Array1[Static156.anIntArray386[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static50.anInt2126);
			}
		}
	}
}
