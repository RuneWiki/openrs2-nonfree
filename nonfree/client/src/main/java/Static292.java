import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static292 {

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
	public static int anInt5287;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
	public static int anInt5290 = -50;

	@OriginalMember(owner = "client!oq", name = "G", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!oq", name = "L", descriptor = "I")
	public static int anInt5295 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIILclient!jb;)V")
	public static void method4054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2) {
		if (Static15.aClass126_1 != null || Static346.aBoolean427 || (arg2 == null || Static249.method3417(arg2) == null)) {
			return;
		}
		Static15.aClass126_1 = arg2;
		Static171.aClass126_6 = Static249.method3417(arg2);
		Static383.anInt6698 = arg0;
		Static49.anInt1345 = 0;
		Static31.anInt729 = arg1;
		Static236.aBoolean323 = false;
	}
}
