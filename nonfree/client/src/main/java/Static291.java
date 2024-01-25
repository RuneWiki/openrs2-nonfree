import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
	public static int anInt5610;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "[I")
	public static final int[] anIntArray507 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString208 = " more options";

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "[I")
	public static final int[] anIntArray508 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!jd;I)V")
	public static void method4987(@OriginalArg(0) Class10_Sub3_Sub3 arg0) {
		if (arg0 instanceof Class10_Sub3_Sub3_Sub1) {
			@Pc(23) Class10_Sub3_Sub3_Sub1 local23 = (Class10_Sub3_Sub3_Sub1) arg0;
			if (local23.aClass192_1 != null) {
				Static153.method3019(local23);
			}
		} else if (arg0 instanceof Class10_Sub3_Sub3_Sub2) {
			Static18.method432((Class10_Sub3_Sub3_Sub2) arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)Z")
	public static boolean method4988() {
		return Static41.anInt980 > 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V")
	public static void method4989(@OriginalArg(1) boolean arg0) {
		if (Static57.aBoolean90 != arg0) {
			Static57.aBoolean90 = arg0;
			Static323.method980();
		}
	}
}
