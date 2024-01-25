import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!lha", name = "f", descriptor = "I")
	public static int anInt6402;

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "Lclient!in;")
	public static final Class169 aClass169_161 = new Class169(88, 10);

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "[I")
	public static final int[] anIntArray308 = new int[4096];

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(FB)F")
	public static float method5716(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5717(@OriginalArg(0) String arg0) {
		if (Static523.aClass263Array1 != null) {
			@Pc(20) Class2_Sub52 local20 = Static311.method5098(Static578.aClass341_72, Static125.aClass179_1);
			local20.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(arg0));
			local20.aClass2_Sub8_Sub2_2.method5212(arg0);
			Static38.method791(local20);
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!da;")
	public static Class59 method5719(@OriginalArg(0) Class101 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class91 local14 = Static660.method9148(arg1, arg0, arg2);
		return local14 == null ? null : local14.aClass59_1;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)Lclient!aia;")
	public static Class15_Sub1 method5720() {
		@Pc(13) Class15_Sub1 local13 = (Class15_Sub1) Static102.aClass60_2.method1552();
		if (local13 == null) {
			return new Class15_Sub1();
		} else {
			Static621.anInt10814--;
			return local13;
		}
	}
}
