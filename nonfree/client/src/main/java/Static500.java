import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Z")
	public static boolean aBoolean652 = false;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!qfa;")
	public static final Class269 aClass269_9 = new Class269("", 14);

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	public static int anInt8403 = 1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!qj;IIII)Lclient!ar;")
	public static Class23_Sub1_Sub1 method6976(@OriginalArg(1) Class100_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean597 || Static19.method380(arg1) && Static19.method380(arg3)) {
			return new Class23_Sub1_Sub1(arg0, 3553, arg4, arg2, arg1, arg3, true);
		} else if (arg0.aBoolean586) {
			return new Class23_Sub1_Sub1(arg0, 34037, arg4, arg2, arg1, arg3, true);
		} else {
			return new Class23_Sub1_Sub1(arg0, arg4, arg2, arg1, arg3, Static89.method7259(arg1), Static89.method7259(arg3), true);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBI)V")
	public static void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class216 local14 = Static423.aClass216ArrayArray1[arg0][arg1];
		Static432.method6126(arg2, local14 == null ? Static510.aClass216_1 : local14);
	}
}
