import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static349 {

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_91 = new Class252(64, 12);

	@OriginalMember(owner = "client!ol", name = "Y", descriptor = "F")
	public static float aFloat135 = 0.25F;

	@OriginalMember(owner = "client!ol", name = "nb", descriptor = "I")
	public static int anInt6412 = 0;

	@OriginalMember(owner = "client!ol", name = "ub", descriptor = "F")
	public static float aFloat136 = 0.0F;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public static void method5782() {
		if (Static61.anInt1489 == 1 || Static61.anInt1489 == 3 || Static61.anInt1489 != Static345.anInt6336 && (Static61.anInt1489 == 0 || Static345.anInt6336 == 0)) {
			Static141.anInt2822 = 0;
			Static342.anInt6322 = 0;
			Static362.aClass230_46.method6141();
		}
		Static345.anInt6336 = Static61.anInt1489;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V")
	public static void method5784(@OriginalArg(0) int arg0) {
		Static486.anInt8594 = 100;
		Static9.anInt229 = -1;
		Static360.anInt6507 = 3;
		Static39.anInt1113 = arg0;
	}
}
