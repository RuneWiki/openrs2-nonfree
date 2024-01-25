import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
	public static int anInt7220;

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
	public static int anInt7224;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	public static int anInt7214 = 0;

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
	public static int anInt7218 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLclient!lt;)V")
	public static void method6079(@OriginalArg(1) Class23_Sub8 arg0) {
		arg0.aClass23_Sub2_Sub1_Sub2_1 = null;
		if (Static325.anInt6037 < 20) {
			Static503.aClass105_11.method2447(arg0);
			Static325.anInt6037++;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V")
	public static void method6083(@OriginalArg(1) int arg0) {
		Static462.anInt7931 = arg0;
		Static296.anInt8194 = -1;
		Static296.anInt8194 = -1;
		Static109.method2090();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!fca;)V")
	public static void method6084(@OriginalArg(1) Class3_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static120.anInt2362; local7++) {
			@Pc(13) int local13 = arg0.method4841();
			@Pc(19) int local19 = arg0.method4858();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static559.aClass31_Sub1Array6[local13] != null) {
				Static559.aClass31_Sub1Array6[local13].anInt10060 = local19;
			}
		}
	}
}
