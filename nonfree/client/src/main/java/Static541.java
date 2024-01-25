import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public static int anInt9200;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "F")
	public static float aFloat173 = 0.25F;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "[Lclient!lk;")
	public static final Class5_Sub5_Sub12[] aClass5_Sub5_Sub12Array3 = new Class5_Sub5_Sub12[14];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
	public static void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static97.aClass5_Sub25_8.aClass6_Sub18_5.method5120() != 0 && arg5 != 0 && Static44.anInt945 < 50 && arg4 != -1) {
			Static13.aClass166Array1[Static44.anInt945++] = new Class166((byte) 1, arg4, arg5, arg0, arg3, arg1, arg2, null);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
	public static void method7934(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub5_Sub21 local13 = Static101.method1629(6, arg0);
		local13.method8961();
	}
}
