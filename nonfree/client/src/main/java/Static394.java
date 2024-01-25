import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_118 = new Class6(104, -2);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public static void method5921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(12) Class2_Sub2 local12 = new Class2_Sub2();
		local12.anInt1216 = arg5;
		local12.anInt1218 = arg1;
		local12.aString6 = arg6;
		local12.anInt1214 = arg0;
		local12.anInt1217 = arg2;
		local12.anInt1221 = Static416.anInt7252 + arg3;
		local12.anInt1219 = arg4;
		Static368.aClass145_7.method3927(local12);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public static void method5923() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static74.anInt2041 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}
}
