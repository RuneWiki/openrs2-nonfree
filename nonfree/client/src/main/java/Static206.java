import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Lclient!lm;")
	public static Class134 aClass134_100;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "I")
	public static int anInt4319;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = null;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public static int anInt4322 = -1;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public static int anInt4323 = 0;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString164 = "";

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public static void method3702() {
		Static237.aClass8_22 = null;
		Static229.aClass8_20 = null;
		Static231.aClass8_21 = null;
		Static212.aClass8_19 = null;
		Static184.aClass8_17 = null;
		Static217.aClass8_11 = null;
		Static286.aClass8_23 = null;
		Static39.aClass8_13 = null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
	public static void method3703() {
		@Pc(8) int[] local8 = new int[Static157.anInt3294];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static157.anInt3294; local17++) {
			@Pc(23) Class102 local23 = Static348.method5333(local17);
			if (local23.anInt2396 >= 0 || local23.anInt2429 >= 0) {
				local8[local10++] = local17;
			}
		}
		Static15.anIntArray12 = new int[local10];
		for (@Pc(53) int local53 = 0; local53 < local10; local53++) {
			Static15.anIntArray12[local53] = local8[local53];
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
	public static void method3704() {
		if (Static224.aClass3_1 != null) {
			@Pc(8) Class3 local8 = Static224.aClass3_1;
			synchronized (Static224.aClass3_1) {
				Static224.aClass3_1 = null;
			}
		}
	}
}
