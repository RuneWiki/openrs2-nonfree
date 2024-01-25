import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_235 = new Class305(36, -1);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4352(@OriginalArg(0) String arg0) {
		if (Static380.aString170.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static380.aString170.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static380.aString170.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public static void method4353() {
		Static361.anInt6516 = -1;
		Static434.anInt7518 = 1;
		if (Static396.aString177 == null) {
			Static47.method5114(35);
		} else {
			@Pc(25) Class1_Sub17 local25 = new Class1_Sub17(Static416.method6539(Static187.method3598(Static396.aString177)));
			@Pc(29) long local29 = local25.method4465();
			Static409.aLong203 = local25.method4465();
			Static212.method3940(true, Static229.method4132(local29), "");
		}
	}
}
