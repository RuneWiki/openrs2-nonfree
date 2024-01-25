import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_84 = new Class274(96, 3);

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_85 = new Class274(67, 0);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BIIIIII)V")
	public static void method4490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static306.anInt5020 <= arg2 - arg4 && arg2 + arg4 <= Static252.anInt4988 && arg3 - arg4 >= Static570.anInt9385 && arg4 + arg3 <= Static177.anInt3963) {
			Static479.method8323(arg4, arg5, arg2, arg1, arg0, arg3);
		} else {
			Static629.method8477(arg2, arg3, arg0, arg5, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V")
	public static void method4491() {
		for (@Pc(18) Class2_Sub29 local18 = (Class2_Sub29) Static581.aClass222_41.method5474(); local18 != null; local18 = (Class2_Sub29) Static581.aClass222_41.method5472()) {
			if (local18.aBoolean416) {
				local18.aBoolean416 = false;
			} else {
				Static621.method8440(local18.anInt5430);
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method4492(@OriginalArg(0) Class87 arg0) {
		if (Static642.aBoolean757) {
			Static479.method8322(arg0);
		} else {
			Static508.method7197(arg0);
		}
	}
}
