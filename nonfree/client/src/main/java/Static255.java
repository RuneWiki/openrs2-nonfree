import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_6 = new Class216(11, 2);

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "Lclient!nl;")
	public static final Class214 aClass214_8 = new Class214(4);

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_57 = new Class160(74, 3);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIIII)V")
	public static void method3609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static235.anInt3970 <= arg2 && Static151.anInt2683 >= arg2) {
			@Pc(27) int local27 = Static112.method1759(arg1, Static134.anInt2364, Static60.anInt971);
			@Pc(33) int local33 = Static112.method1759(arg0, Static134.anInt2364, Static60.anInt971);
			Static461.method6478(local33, local27, arg3, arg2);
		}
	}
}
