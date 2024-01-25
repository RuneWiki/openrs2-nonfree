import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!r", name = "P", descriptor = "Z")
	public static volatile boolean aBoolean358 = false;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "I")
	public static int anInt5767 = 0;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "I")
	public static int anInt5769 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[IZILclient!rl;)Lclient!oc;")
	public static Class19_Sub4_Sub1 method4829(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class66_Sub2 arg3) {
		if (arg3.aBoolean393 || Static99.method4914(arg2) && Static99.method4914(arg0)) {
			return new Class19_Sub4_Sub1(arg3, 3553, arg2, arg0, false, arg1);
		} else if (arg3.aBoolean396) {
			return new Class19_Sub4_Sub1(arg3, 34037, arg2, arg0, false, arg1);
		} else {
			return new Class19_Sub4_Sub1(arg3, arg2, arg0, Static52.method1203(arg2), Static52.method1203(arg0), arg1);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!qn;)[Lclient!il;")
	public static Class118[] method4830(@OriginalArg(1) Class209 arg0) {
		if (!arg0.method4693()) {
			return new Class118[0];
		}
		@Pc(24) Class122 local24 = arg0.method4702();
		while (local24.anInt3557 == 0) {
			Static88.method4161(10L);
		}
		if (local24.anInt3557 == 2) {
			return new Class118[0];
		}
		@Pc(46) int[] local46 = (int[]) local24.anObject7;
		@Pc(52) Class118[] local52 = new Class118[local46.length >> 2];
		for (@Pc(54) int local54 = 0; local54 < local52.length; local54++) {
			@Pc(60) Class118 local60 = new Class118();
			local52[local54] = local60;
			local60.anInt3440 = local46[local54 << 2];
			local60.anInt3438 = local46[(local54 << 2) + 1];
			local60.anInt3441 = local46[(local54 << 2) + 2];
			local60.anInt3435 = local46[(local54 << 2) + 3];
		}
		return local52;
	}
}
