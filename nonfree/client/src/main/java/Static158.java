import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "[Lclient!bt;")
	public static Class15_Sub2[] aClass15_Sub2Array1;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[Lclient!rp;")
	public static final Class282[] aClass282Array1 = new Class282[16];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!tt;IIIII)Ljava/awt/Frame;")
	public static Frame method2469(@OriginalArg(0) Class313 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method6997()) {
			return null;
		}
		@Pc(20) Class178[] local20 = Static56.method825(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt5209 == arg2 && local20[local28].anInt5208 == arg1 && (!local26 || local20[local28].anInt5210 > arg3)) {
				arg3 = local20[local28].anInt5210;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(101) Class224 local101 = arg0.method6986(arg3, arg1, arg2);
		while (local101.anInt6632 == 0) {
			Static183.method3079(10L);
		}
		@Pc(123) Frame local123 = (Frame) local101.anObject14;
		if (local123 == null) {
			return null;
		} else if (local101.anInt6632 == 2) {
			Static219.method3486(local123, arg0);
			return null;
		} else {
			return local123;
		}
	}
}
