import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static334 {

	@OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
	public static int anInt5824;

	@OriginalMember(owner = "client!qu", name = "R", descriptor = "Lclient!vh;")
	public static Class250 aClass250_66;

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_147 = new Class131(72, -1);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!vh;Lclient!sf;Lclient!vh;Lclient!vh;)Z")
	public static boolean method4673(@OriginalArg(1) Class250 arg0, @OriginalArg(2) Class1_Sub7_Sub3 arg1, @OriginalArg(3) Class250 arg2, @OriginalArg(4) Class250 arg3) {
		Static327.aClass1_Sub7_Sub3_3 = arg1;
		Static54.aClass250_12 = arg3;
		Static429.aClass250_89 = arg2;
		Static342.aClass250_70 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!ss;B)I")
	public static int method4675(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1) {
		if (!Static53.method916(arg1).method5788(arg0) && arg1.anObjectArray21 == null) {
			return -1;
		} else if (arg1.anIntArray529 == null || arg1.anIntArray529.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray529[arg0];
		}
	}
}
