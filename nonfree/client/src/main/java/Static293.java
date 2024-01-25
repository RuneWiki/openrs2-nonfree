import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!so", name = "K", descriptor = "Lclient!dp;")
	public static Class53 aClass53_136;

	@OriginalMember(owner = "client!so", name = "H", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_95 = new Class70(64);

	@OriginalMember(owner = "client!so", name = "L", descriptor = "Z")
	public static boolean aBoolean382 = true;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!vj;IIIBI)Ljava/awt/Frame;")
	public static Frame method5023(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0.method5531()) {
			return null;
		}
		@Pc(17) Class189[] local17 = Static279.method4822(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt5577 == arg1 && arg3 == local17[local25].anInt5580 && (!local23 || local17[local25].anInt5583 > arg2)) {
				arg2 = local17[local25].anInt5583;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(90) Class196 local90 = arg0.method5535(arg3, arg2, arg1);
		while (local90.anInt5851 == 0) {
			Static278.method5283(10L);
		}
		@Pc(105) Frame local105 = (Frame) local90.anObject8;
		if (local105 == null) {
			return null;
		} else if (local90.anInt5851 == 2) {
			Static167.method3290(local105, arg0);
			return null;
		} else {
			return local105;
		}
	}
}
