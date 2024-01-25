import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!mba", name = "y", descriptor = "I")
	public static int anInt5720;

	@OriginalMember(owner = "client!mba", name = "w", descriptor = "Lclient!ob;")
	public static final Class247 aClass247_4 = new Class247();

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IILclient!bi;IIZI)V")
	public static void method4857(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static211.anInt4328 = 0;
		Static347.aClass31_74 = arg1;
		Static481.anInt8134 = arg3;
		Static445.anInt7588 = 1;
		Static189.aBoolean300 = false;
		Static554.anInt9318 = arg2;
		Static289.anInt5377 = Static228.aClass4_Sub13_Sub3_2.method5113() / arg0;
		if (Static289.anInt5377 < 1) {
			Static289.anInt5377 = 1;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4858(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + Static22.method428(arg0.charAt(local17)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
	public static void method4859() {
		if (!Static403.method5821()) {
			return;
		}
		if (Static192.aStringArray13 == null) {
			Static421.method7828();
		}
		Static202.anInt4245 = 0;
		Static469.aBoolean550 = true;
	}
}
