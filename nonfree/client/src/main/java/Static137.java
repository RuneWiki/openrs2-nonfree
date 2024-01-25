import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!hda;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_65 = new Class56(39, 6);

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt2977 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILjava/lang/String;JIZILjava/lang/String;ZII)V")
	public static void method2680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) long arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static150.aBoolean254 && Static571.anInt9281 < 500) {
			@Pc(18) int local18 = arg8 == -1 ? Static69.anInt1582 : arg8;
			@Pc(32) Class3_Sub43 local32 = new Class3_Sub43(arg6, arg2, local18, arg5, arg0, arg3, arg9, arg1, arg4, arg7);
			Static133.aClass112_20.method3079(local32);
			Static571.anInt9281++;
		}
	}
}
