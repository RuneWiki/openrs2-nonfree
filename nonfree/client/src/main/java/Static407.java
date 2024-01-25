import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_16 = new Class387(12, 0, 1, 0);

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!v;")
	public static Class3_Sub6_Sub20 aClass3_Sub6_Sub20_1 = null;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
	public static int anInt6944 = 0;

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
	public static int anInt6947 = 0;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method5805() {
		for (@Pc(6) Class23_Sub8 local6 = (Class23_Sub8) Static57.aClass105_10.method2438(); local6 != null; local6 = (Class23_Sub8) Static57.aClass105_10.method2438()) {
			Static426.method6079(local6);
		}
		@Pc(34) int local34;
		@Pc(32) int local32;
		if (Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 1) {
			local32 = 3;
			local34 = 0;
		} else {
			local32 = anInt6944;
			local34 = anInt6944;
		}
		Static82.method1753();
		for (@Pc(48) int local48 = local34; local48 <= local32; local48++) {
			Static82.method1751();
			Static82.method1764(local48);
			Static82.method1758(local48);
		}
		Static82.method1759();
		Static82.method1765();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)Lclient!hf;")
	public static Class3_Sub23 method5809(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub23_Sub2");
			@Pc(15) Class3_Sub23 local15 = (Class3_Sub23) local6.getDeclaredConstructor().newInstance();
			local15.method6871(arg2, arg0, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub23_Sub1 local28 = new Class3_Sub23_Sub1();
			local28.method6871(arg2, arg0, arg1);
			return local28;
		}
	}
}
