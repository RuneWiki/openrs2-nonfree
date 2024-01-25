import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array54;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "Lclient!mh;")
	public static Class4_Sub28 aClass4_Sub28_2;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public static int anInt2999 = -1;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(JLjava/lang/String;IIBLjava/lang/String;II)V")
	public static void method2617(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!Static272.aBoolean393 && Static105.anInt2645 < 500) {
			@Pc(26) int local26 = arg3 == -1 ? Static273.anInt5438 : arg3;
			@Pc(37) Class4_Sub39 local37 = new Class4_Sub39(arg4, arg1, local26, arg2, arg0, arg5, arg6);
			Static58.aClass116_7.method3274(local37);
			Static105.anInt2645++;
		}
	}
}
