import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "Lclient!ik;")
	public static Class182 aClass182_97;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	public static int anInt7633;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[4];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!aq;II)Lclient!vt;")
	public static Class125_Sub1_Sub1 method6568(@OriginalArg(1) int arg0, @OriginalArg(2) Class22_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean76 || Static88.method1890(arg0) && Static88.method1890(arg3)) {
			return new Class125_Sub1_Sub1(arg1, 3553, arg2, arg0, arg3);
		} else if (arg1.aBoolean70) {
			return new Class125_Sub1_Sub1(arg1, 34037, arg2, arg0, arg3);
		} else {
			return new Class125_Sub1_Sub1(arg1, arg2, arg0, arg3, Static92.method1941(arg0), Static92.method1941(arg3));
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Z")
	public static boolean method6569(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
	public static void method6583() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static497.anInt7926; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static646.anInt9979; local18++) {
				if (Static677.method9030(local7, local18, local14, Static448.aClass364ArrayArrayArray2, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
