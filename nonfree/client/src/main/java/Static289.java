import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
	public static int anInt5908;

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "Lclient!ca;")
	public static final Class38 aClass38_1 = Static50.method1151();

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)Z")
	public static boolean method4998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static469.method6993(arg1, arg0)) {
			return Static523.method7473(arg1, arg0) | (arg1 & 0xB000) != 0 | Static132.method3076(arg1, arg0) ? true : (Static469.method6991(arg0, arg1) | Static461.method6933(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)Lclient!on;")
	public static Class185 method4999() {
		try {
			return (Class185) Class.forName("Class185_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5002(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg1, 2);
		local8.method8631();
		local8.aString114 = arg0;
	}
}
