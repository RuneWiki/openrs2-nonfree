import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!kj", name = "zb", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_58 = new Class160(15, 3);

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "(I)V")
	public static void method3723() {
		if (Static43.aBoolean28) {
			return;
		}
		Static396.method5841(Static144.aClass9ArrayArrayArray1);
		if (Static177.aClass9ArrayArrayArray2 != null) {
			Static396.method5841(Static177.aClass9ArrayArrayArray2);
		}
		Static43.aBoolean28 = true;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBIII)V")
	public static void method3724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			Static455.method6536(arg1, arg3, arg0, Static503.anIntArrayArray12[arg2]);
		} else {
			Static455.method6536(arg3, arg1, arg0, Static503.anIntArrayArray12[arg2]);
		}
	}
}
