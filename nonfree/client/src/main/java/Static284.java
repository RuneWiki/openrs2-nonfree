import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLclient!co;)Lclient!bd;")
	public static Class26 method4803(@OriginalArg(1) Class5_Sub3 arg0) {
		@Pc(12) Class26 local12 = new Class26();
		local12.anInt642 = arg0.method4227();
		local12.aClass5_Sub2_Sub10_1 = Static166.aClass278_2.method6455(local12.anInt642);
		return local12;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!vk;I)V")
	public static void method4804(@OriginalArg(0) Class302 arg0) {
		Static223.aClass302_1 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
	public static boolean method4809(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
