import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_193 = new Class214(55, 9);

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean464 = true;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBI)V")
	public static void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static157.aClass185_Sub1_1.anInt5567 * arg1 >> 8;
		if (arg0 == -1 && !Static351.aBoolean462) {
			Static449.method6144();
		} else if (arg0 != -1 && (Static305.anInt5655 != arg0 || !Static147.method2735()) && local10 != 0 && !Static351.aBoolean462) {
			Static337.method4951(arg2, Static296.aClass38_80, arg0, local10);
		}
		Static305.anInt5655 = arg0;
	}
}
