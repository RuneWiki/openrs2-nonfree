import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)V")
	public static void method7871(@OriginalArg(1) int arg0) {
		Static131.anInt10171 = arg0;
		Static489.aClass32_18.method640();
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)V")
	public static void method7875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static257.anInt4068 && Static67.anInt1214 >= arg2) {
			@Pc(11) int local11 = Static414.method5547(arg3, Static379.anInt5914, Static624.anInt10032);
			@Pc(17) int local17 = Static414.method5547(arg0, Static379.anInt5914, Static624.anInt10032);
			Static231.method3184(local11, local17, arg2, arg1);
		}
	}
}
