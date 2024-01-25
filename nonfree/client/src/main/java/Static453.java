import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "Lclient!jb;")
	public static Class2_Sub18_Sub2 aClass2_Sub18_Sub2_3;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_205 = new Class81(44, 12);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
	public static void method6085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static331.anInt5894 <= arg0 - arg2 && Static351.anInt6176 >= arg0 + arg2 && arg5 - arg2 >= Static75.anInt1858 && arg5 + arg2 <= Static175.anInt3399) {
			Static328.method4697(arg0, arg4, arg3, arg5, arg2, arg1);
		} else {
			Static262.method3940(arg2, arg0, arg4, arg3, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
	public static void method6086() {
		Static433.method5833();
		Static438.method5925();
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
	public static void method6087() {
		@Pc(1) Class129 local1 = Static115.aClass129_58;
		synchronized (Static115.aClass129_58) {
			Static115.aClass129_58.method3025();
		}
		local1 = Static205.aClass129_33;
		synchronized (Static205.aClass129_33) {
			Static205.aClass129_33.method3025();
		}
	}
}
