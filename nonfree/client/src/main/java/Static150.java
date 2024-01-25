import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!kha;")
	public static Class181 aClass181_34;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_16 = new Class112(4);

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_40 = new Class218(117, 3);

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "Lclient!ut;")
	public static final Class345 aClass345_2 = new Class345(16);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method3287() {
		if (!Static303.aBoolean521) {
			Static168.aBoolean336 = true;
			Static611.aFloat276 += (-24.0F - Static611.aFloat276) / 2.0F;
			Static303.aBoolean521 = true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(FFFZ)F")
	public static float method3288(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return (arg0 - arg2) * arg1 + arg2;
	}
}
