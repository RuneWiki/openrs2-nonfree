import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!taa", name = "w", descriptor = "I")
	public static int anInt8164;

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_63 = new Class249();

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILclient!wca;)Lclient!wca;")
	public static Class310 method6843(@OriginalArg(1) Class310 arg0) {
		if (arg0.anInt9167 != -1) {
			return Static111.method2143(arg0.anInt9167);
		}
		@Pc(19) int local19 = arg0.anInt9226 >>> 16;
		@Pc(24) Class172 local24 = new Class172(Static110.aClass127_21);
		for (@Pc(29) Class2_Sub9 local29 = (Class2_Sub9) local24.method4304(); local29 != null; local29 = (Class2_Sub9) local24.method4300()) {
			if (local29.anInt833 == local19) {
				return Static111.method2143((int) local29.aLong241);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIZI)V")
	public static void method6844(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static161.aFloat56 = local15;
		if (Static427.anInt7875 == 2) {
			Static344.anInt6362 = 0;
			Static209.anInt3769 = local7;
			Static429.anInt7997 = local15;
		}
		Static265.aFloat182 = local7;
		Static74.method1489();
		Static253.aBoolean338 = true;
	}
}
