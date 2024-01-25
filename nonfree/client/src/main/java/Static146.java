import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
	public static int anInt3198;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Lclient!wo;")
	public static Class216 aClass216_52;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "F")
	public static float aFloat40 = 0.0F;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBI)V")
	public static void method2931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg1, 12);
		local8.method1869();
		local8.anInt2142 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	public static void method2932() {
		@Pc(5) byte local5 = 0;
		if (Static129.aBoolean269) {
			local5 = 55;
		}
		Static64.method1565(local5);
		Static194.method3747(local5);
		Static335.method5428(local5);
		Static305.method5129(local5);
		Static112.method2423(local5);
		Static149.method2982(local5);
		Static80.method1809(local5);
		Static271.method4750(local5);
		Static52.method1346(local5);
		if (Static295.anInt5811 == 10) {
			Static232.method4269(28);
		} else if (Static295.anInt5811 == 30) {
			Static232.method4269(25);
		}
	}
}
