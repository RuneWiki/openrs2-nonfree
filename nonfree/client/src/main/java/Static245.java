import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
	public static int anInt6442;

	@OriginalMember(owner = "client!iq", name = "F", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_13 = new Class244(0, 3);

	@OriginalMember(owner = "client!iq", name = "J", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_113 = new Class268(28, 2);

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_14 = new Class244(6, 5);

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
	public static int anInt6443 = -1;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!sca;I)Lclient!sca;")
	public static Class302 method5547(@OriginalArg(0) Class302 arg0) {
		@Pc(11) Class302 local11 = Static78.method1365(arg0);
		if (local11 == null) {
			local11 = arg0.aClass302_52;
		}
		return local11;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	public static void method5548() {
		Static488.aBoolean687 = true;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)Lclient!ma;")
	public static Class20_Sub2_Sub1 method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_Sub1_1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIBII)I")
	public static int method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg4;
			arg4 = local8;
		}
		@Pc(21) int local21 = arg3 & 0x3;
		if (local21 == 0) {
			return arg1;
		} else if (local21 == 1) {
			return arg5;
		} else if (local21 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return 8 - arg4 - arg5;
		}
	}
}
