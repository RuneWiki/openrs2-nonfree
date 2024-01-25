import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static492 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_141 = new Class337(87, -2);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if ((arg5 ? Static97.aClass5_Sub25_8.aClass6_Sub18_3.method5120() : Static97.aClass5_Sub25_8.aClass6_Sub18_5.method5120()) != 0 && arg4 != 0 && Static44.anInt945 < 50 && arg3 != -1) {
			Static13.aClass166Array1[Static44.anInt945++] = new Class166((byte) (arg5 ? 3 : 2), arg3, arg4, arg0, arg2, 0, arg1, null);
		}
	}
}
