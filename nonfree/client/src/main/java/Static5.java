import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aba", name = "F", descriptor = "I")
	public static int anInt98 = -2;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIZII)V")
	public static void method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static27.anInt668 = arg3;
		Static410.anInt6921 = arg2;
		Static504.anInt8038 = arg5;
		Static54.anInt1312 = arg4;
		Static280.anInt5116 = arg1;
		Static494.anInt7897 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "(I)V")
	public static void method99() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static142.anInt3029 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
