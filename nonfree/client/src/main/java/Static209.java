import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
	public static int anInt4135 = 0;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!kr;)Ljava/lang/String;")
	public static String method3524(@OriginalArg(1) Class1_Sub23 arg0) {
		return arg0.aString55 == null || arg0.aString55.length() <= 0 ? arg0.aString54 : arg0.aString54 + Static103.aClass77_34.method1864(Static562.anInt9127) + arg0.aString55;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIBIIII)Lclient!it;")
	public static Class36 method3525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg4 * 76724863L ^ (long) arg5 * 475427L ^ (long) arg0 * 97549L ^ (long) arg2 * 67481L ^ (long) arg3 * 986053L ^ (long) arg1 * 32147369L;
		@Pc(46) Class36 local46 = (Class36) Static245.aClass326_18.method7238(local38);
		if (local46 == null) {
			local46 = Static174.aClass12_9.method6444(arg2, arg0, arg5, arg3, arg1, arg4);
			Static245.aClass326_18.method7236(local46, local38);
			return local46;
		} else {
			return local46;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIZ)V")
	public static void method3526(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		Static326.anInt5840 = arg0;
		Static590.anInt9527 = 3;
		Static473.method6674(Static404.aClass174_4.aString46, Static404.aClass174_4.anInt4666);
		if (arg1) {
			Static296.method4673(false, "", "");
		} else {
			Static230.method5037();
			Static296.method4673(false, Static375.aString68, Static365.aString67);
		}
	}
}
