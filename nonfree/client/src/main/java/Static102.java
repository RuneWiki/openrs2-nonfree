import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "[I")
	public static int[] anIntArray279;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1001 = Static121.method2047("Members object");

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_999 = aClass60_1001;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!s;")
	public static Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1000 = Static121.method2047("sch-Utteln:");

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	public static int anInt2474 = 1;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!kf;")
	public static Class4_Sub13_Sub1 aClass4_Sub13_Sub1_2 = new Class4_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1002 = Static121.method2047("welle2:");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method1810(@OriginalArg(1) Class40 arg0) {
		Static106.aClass40_77 = arg0;
		Static108.anInt2558 = Static106.aClass40_77.method1114(16);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1811() {
		aClass60_1001 = null;
		aClass60_1002 = null;
		aClass60_999 = null;
		aClass64_1 = null;
		aClass60_1000 = null;
		anIntArray279 = null;
		aClass4_Sub13_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!lc;BLclient!lc;)V")
	public static void method1814(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		Static114.aClass40_81 = arg1;
		Static22.aClass40_19 = arg0;
	}
}
