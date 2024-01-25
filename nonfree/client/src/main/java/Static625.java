import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
	public static int anInt11173;

	// $FF: synthetic field
	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass58;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
	public static int anInt11174 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZ)Z")
	public static boolean method9474(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	public static void method9475() {
		try {
			@Pc(25) Method local25 = (aClass58 == null ? (aClass58 = Class4.a("java.lang.Runtime")) : aClass58).getMethod("availableProcessors");
			if (local25 != null) {
				try {
					@Pc(29) Runtime local29 = Runtime.getRuntime();
					@Pc(35) Integer local35 = (Integer) local25.invoke(local29, (Object[]) null);
					Static438.anInt7394 = local35;
				} catch (@Pc(40) Throwable local40) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}
}
