import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!h", name = "E", descriptor = "Lclient!mg;")
	public static Class156 aClass156_14;

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	public static int anInt2557 = 2;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)Z")
	public static boolean method2119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static314.method4289(arg1, arg0) || Static261.method1844(arg0, arg1);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!tn;")
	public static Class3_Sub4 method2120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class241 local14 = local7.aClass241_2; local14 != null; local14 = local14.aClass241_1) {
			@Pc(18) Class3_Sub4 local18 = local14.aClass3_Sub4_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort92 == arg1 && local18.aShort89 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
