import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!r;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
	public static final boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "Lclient!mb;")
	public static Class132 aClass132_1 = null;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public static int anInt149 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!vq;ILclient!ja;IZ)V")
	public static void method147(@OriginalArg(0) Class211 arg0, @OriginalArg(2) Class81 arg1) {
		Static225.aClass211_25.method5584();
		if (Static1.aBoolean2) {
			return;
		}
		for (@Pc(16) Class6_Sub35 local16 = (Class6_Sub35) arg0.method5594(); local16 != null; local16 = (Class6_Sub35) arg0.method5582()) {
			@Pc(23) Class165 local23 = Static345.method5701(local16.anInt5312);
			if (Static299.method5133(local23)) {
				@Pc(35) boolean local35 = Static137.method2630(local23, local16, arg1);
				if (local35) {
					Static68.method3981(local16, arg1, local23);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method148() {
		Static110.aClass132Array1 = null;
		Static20.method302(Static94.anInt1731, Static209.anInt3815, Static62.anInt1131, 0, 0, 0, 0, -1);
		if (Static110.aClass132Array1 != null) {
			Static326.method5428(-1412584499, Static214.aClass132_14.anInt3567, 0, 0, Static110.aClass132Array1, Static94.anInt1731, Static209.anInt3815, Static171.anInt3189, Static175.anInt3286);
			Static110.aClass132Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIII)V")
	public static void method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static311.anInt5837 <= arg4 && Static265.anInt4933 >= arg3 && arg0 >= Static327.anInt3039 && Static230.anInt4308 >= arg1) {
			Static142.method2685(arg5, arg2, arg1, arg3, arg4, arg6, arg0);
		} else {
			Static239.method5785(arg1, arg0, arg3, arg2, arg5, arg6, arg4);
		}
	}
}
