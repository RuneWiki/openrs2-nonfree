import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "Lclient!ok;")
	public static Class18 aClass18_4;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	public static int anInt6823;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Lclient!aj;")
	public static Class9 method6032(@OriginalArg(0) int arg0) {
		@Pc(12) Class9 local12 = (Class9) Static99.aClass109_22.method2857((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static38.aClass93_13.method2410(arg0, 4);
		local12 = new Class9();
		if (local27 != null) {
			local12.method180(arg0, new Class5_Sub12(local27));
		}
		local12.method177(arg0);
		Static99.aClass109_22.method2855((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)V")
	public static void method6033() {
		Static44.aClass109_15.method2859(50);
		Static143.aClass109_33.method2859(50);
		Static308.aClass109_57.method2859(50);
		Static272.aClass109_49.method2859(50);
		Static11.aClass109_4.method2859(50);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBI)V")
	public static void method6034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 16);
		local8.method850();
		local8.anInt996 = arg1;
	}
}
