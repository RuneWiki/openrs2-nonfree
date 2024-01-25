import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static190 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!dj;")
	public static Class49 aClass49_6;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	public static int anInt3614 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method3565(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static144.method2692(arg0, arg0.length - 1, 0, arg1);
	}
}
