import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
	public static int anInt6506 = 0;

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "Z")
	public static boolean aBoolean713 = false;

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_166 = new Class12(12, 0);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BIIIII)V")
	public static void method5095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg0; local7++) {
			Static2.method38(arg4, arg3, Static67.anIntArrayArray13[local7], arg2);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!za;Lclient!vt;I)I")
	public static int method5096(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class258 arg1) {
		if (arg1.anInt7326 != -1) {
			return arg1.anInt7326;
		}
		if (arg1.anInt7322 != -1) {
			@Pc(34) Class114 local34 = arg0.anInterface6_8.method3937(arg0.method5772() ? arg1.anInt7322 : arg1.anInt7328);
			if (!local34.aBoolean340) {
				return local34.aShort37;
			}
		}
		return arg1.anInt7321;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)Z")
	public static boolean method5097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static16.method248(arg0, arg1) | (arg0 & 0x70000) != 0 || Static384.method5033(arg0, arg1);
	}
}
