import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	public static int anInt217 = -1;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_19 = new Class123(80, 8);

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Z")
	public static boolean aBoolean15 = true;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)Lclient!cw;")
	public static Class3_Sub10 method221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub10 local5 = null;
		if (arg1 == 0) {
			local5 = Static129.method2403(Static452.aClass353_2, Static494.aClass287_134);
		}
		if (arg1 == 1) {
			local5 = Static129.method2403(Static452.aClass353_2, Static566.aClass287_145);
		}
		local5.aClass3_Sub26_Sub1_1.method6820(arg2 + Static321.anInt5874);
		local5.aClass3_Sub26_Sub1_1.method6769(arg0 + Static137.anInt3293);
		local5.aClass3_Sub26_Sub1_1.method6780(Static446.aClass237_1.method5292(82) ? 1 : 0);
		Static46.aBoolean102 = false;
		Static262.anInt5041 = arg0;
		Static349.anInt6239 = arg2;
		Static28.method333();
		return local5;
	}
}
