import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "J")
	public static long aLong197;

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
	public static int anInt7071;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "Lclient!vfa;")
	public static Class347 aClass347_3;

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "Lclient!pl;")
	public static Class259 aClass259_128;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "Lclient!oj;")
	public static Class243 aClass243_7;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V")
	public static void method5921(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(3, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Z")
	public static boolean method5922(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZLclient!qj;I[BIII)Lclient!ar;")
	public static Class23_Sub1_Sub1 method5923(@OriginalArg(0) int arg0, @OriginalArg(2) Class100_Sub3 arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean597 || Static19.method380(arg3) && Static19.method380(arg0)) {
			return new Class23_Sub1_Sub1(arg1, 3553, 6406, arg3, arg0, false, arg2, 6406);
		} else if (arg1.aBoolean586) {
			return new Class23_Sub1_Sub1(arg1, 34037, 6406, arg3, arg0, false, arg2, 6406);
		} else {
			return new Class23_Sub1_Sub1(arg1, 6406, arg3, arg0, Static89.method7259(arg3), Static89.method7259(arg0), arg2, 6406);
		}
	}
}
