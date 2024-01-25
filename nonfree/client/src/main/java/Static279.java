import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public static int anInt5429;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_93 = new Class66(64);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public static void method4734() {
		if (!Static20.aBoolean40) {
			return;
		}
		@Pc(13) Class96 local13 = Static305.method5232(Static21.anInt6209, Static151.anInt3085);
		if (local13 != null && local13.anObjectArray9 != null) {
			@Pc(22) Class5_Sub12 local22 = new Class5_Sub12();
			local22.anObjectArray3 = local13.anObjectArray9;
			local22.aClass96_4 = local13;
			Static223.method3891(local22);
		}
		Static20.aBoolean40 = false;
		Static156.anInt3126 = -1;
		Static336.method4719(local13);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4735(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg2); local14 != -1; local14 = arg0.indexOf(arg2, local14 + arg1.length())) {
			arg0 = arg0.substring(0, local14) + arg1 + arg0.substring(arg2.length() + local14);
		}
		return arg0;
	}
}
