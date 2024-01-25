import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "Lclient!saa;")
	public static Class287 aClass287_6;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "[Lclient!efa;")
	public static Class8_Sub1[] aClass8_Sub1Array2 = new Class8_Sub1[0];

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_91 = new Class160(43, 7);

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
	public static int anInt6487 = 0;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V")
	public static void method5515() {
		Static153.method2254();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!cr;IIII)Ljava/awt/Frame;")
	public static Frame method5516(@OriginalArg(1) Class57 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method915()) {
			return null;
		}
		@Pc(20) Class199[] local20 = Static434.method6275(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg1 == local20[local28].anInt5562 && local20[local28].anInt5559 == arg2 && (!local26 || arg3 < local20[local28].anInt5565)) {
				local26 = true;
				arg3 = local20[local28].anInt5565;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(89) Class278 local89 = arg0.method927(arg2, arg3, arg1);
		while (local89.anInt7757 == 0) {
			Static149.method2211(10L);
		}
		@Pc(101) Frame local101 = (Frame) local89.anObject24;
		if (local101 == null) {
			return null;
		} else if (local89.anInt7757 == 2) {
			Static158.method2320(arg0, local101);
			return null;
		} else {
			return local101;
		}
	}
}
