import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static215 {

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "Lclient!b;")
	public static Class16 aClass16_16;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "J")
	public static long aLong148 = 0L;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
	public static int anInt4248 = -1;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
	public static int anInt4250 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!eb;)Lclient!pp;")
	public static Class10_Sub3 method3960(@OriginalArg(1) Class1_Sub7 arg0) {
		return new Class10_Sub3(arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3137(), arg0.method3141());
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V")
	public static void method3961() {
		if (Static254.anInt4896 != -1) {
			Static222.method4059(Static254.anInt4896, -1, -1, false);
			Static254.anInt4896 = -1;
		}
	}
}
