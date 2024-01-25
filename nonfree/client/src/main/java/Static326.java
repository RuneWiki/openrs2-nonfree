import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static int anInt5525;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	public static int anInt5527;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!al;")
	public static final Class17 aClass17_3 = new Class17();

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public static int anInt5526 = -1;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
	public static final int[] anIntArray311 = new int[14];

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_112 = new Class56(65, 1);

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V")
	public static void method4711(@OriginalArg(1) boolean arg0) {
		if (Static324.aClass165_2 != null) {
			Static324.aClass165_2.method3977();
			Static324.aClass165_2 = null;
		}
		Static407.anInt7011 = 0;
		Static495.method6690();
		Static244.method3782();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static460.aClass169Array3[local19].method4038();
		}
		Static314.method4613(false);
		System.gc();
		Static227.method3538();
		Static416.anInt7067 = -1;
		Static6.aBoolean1 = false;
		Static491.method6644(true);
		Static110.anInt2172 = 0;
		Static246.anInt4344 = 0;
		Static39.anInt749 = 0;
		Static187.anInt3553 = 0;
		Static132.anInt9449 = 0;
		Static335.anInt5608 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static283.aClass205Array1.length; local60++) {
			Static283.aClass205Array1[local60] = null;
		}
		Static504.method6794();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local75] = null;
		}
		Static88.anInt1884 = 0;
		Static213.aClass354_37.method7687();
		Static137.anInt2977 = 0;
		Static211.aClass354_17.method7687();
		Static154.method2914();
		Static106.anInt2143 = 0;
		Static491.aClass318_1.method6744();
		Static368.method5387();
		Static195.method3274();
		Static330.aLong152 = 0L;
		Static81.aClass3_Sub38_1 = null;
		if (arg0) {
			Static25.method439(12);
			return;
		}
		Static25.method439(3);
		try {
			Static600.method2617("loggedout", Static31.anApplet1);
		} catch (@Pc(134) Throwable local134) {
		}
	}
}
