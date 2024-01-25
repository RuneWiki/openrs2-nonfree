import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "[Lclient!l;")
	public static final Class184[] aClass184Array1 = new Class184[37];

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "[I")
	public static final int[] anIntArray431 = new int[14];

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_48 = new Class99(16);

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "Lclient!sh;")
	public static final Class313 aClass313_3 = new Class313(1);

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!at;III)V")
	public static void method5883(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static612.aClass24_17 != null || Static65.aBoolean754 || (arg0 == null || Static635.method9199(arg0) == null)) {
			return;
		}
		Static612.aClass24_17 = arg0;
		Static102.aClass24_7 = Static635.method9199(arg0);
		Static170.anInt10313 = 0;
		Static505.anInt9315 = arg2;
		Static257.anInt5500 = arg1;
		Static630.aBoolean747 = false;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BILclient!at;)I")
	public static int method5884(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		if (!Static76.method2235(arg1).method9002(arg0) && arg1.anObjectArray12 == null) {
			return -1;
		} else if (arg1.anIntArray26 == null || arg0 >= arg1.anIntArray26.length) {
			return -1;
		} else {
			return arg1.anIntArray26[arg0];
		}
	}
}
