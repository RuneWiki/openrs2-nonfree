import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_123 = new Class349(38, -1);

	@OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
	public static int anInt7189 = 0;

	@OriginalMember(owner = "client!qv", name = "O", descriptor = "I")
	public static int anInt7191 = 0;

	@OriginalMember(owner = "client!qv", name = "P", descriptor = "Lclient!nw;")
	public static final Class247 aClass247_3 = new Class247();

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z")
	public static boolean method5855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5857(@OriginalArg(0) String arg0) {
		if (Class196.aString58.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class196.aString58.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class196.aString58.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)V")
	public static void method5858(@OriginalArg(0) boolean arg0) {
		if (Static529.aClass124_2 != null) {
			Static529.aClass124_2.method2256();
			Static529.aClass124_2 = null;
		}
		Static135.anInt8199 = 0;
		Static507.method6604();
		Static411.method5545();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static87.aClass362Array3[local19].method7592();
		}
		Static169.method2209(false);
		System.gc();
		Static482.method6225();
		Static491.anInt7770 = -1;
		Static271.aBoolean352 = false;
		Static569.method7428();
		Static458.method5947(true);
		Static310.anInt5129 = 0;
		Static79.anInt7835 = 0;
		Static485.anInt7725 = 0;
		Static386.anInt6384 = 0;
		Static456.anInt7320 = 0;
		Static434.anInt6974 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static271.aClass80Array1.length; local60++) {
			Static271.aClass80Array1[local60] = null;
		}
		Static169.method2212();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local75] = null;
		}
		Static365.anInt6148 = 0;
		Static436.aClass90_26.method1678();
		Static51.anInt912 = 0;
		Static531.aClass90_39.method1678();
		Static513.method6626();
		Static240.anInt9588 = 0;
		Static426.aClass160_1.method2784();
		Static102.method1534();
		Static370.method5183();
		Static537.aLong247 = 0L;
		Static535.aClass2_Sub8_2 = null;
		if (arg0) {
			Static115.method1686(12);
			return;
		}
		Static115.method1686(3);
		try {
			Static597.method3394("loggedout", Static195.anApplet4);
		} catch (@Pc(130) Throwable local130) {
		}
	}
}
