import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public static int anInt5013;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!gd;")
	public static Class61 aClass61_48 = new Class61(4);

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "[S")
	public static short[] aShortArray53 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public static int anInt5014 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZIIZ)V")
	public static void method3807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(10) int local10 = arg1;
		@Pc(16) int local16 = (arg1 + arg3) / 2;
		@Pc(20) Class13_Sub1 local20 = Static51.aClass13_Sub1Array1[local16];
		Static51.aClass13_Sub1Array1[local16] = Static51.aClass13_Sub1Array1[arg3];
		Static51.aClass13_Sub1Array1[arg3] = local20;
		for (@Pc(32) int local32 = arg1; local32 < arg3; local32++) {
			if (Static239.method3609(arg5, local20, Static51.aClass13_Sub1Array1[local32], arg2, arg0, arg4) <= 0) {
				@Pc(51) Class13_Sub1 local51 = Static51.aClass13_Sub1Array1[local32];
				Static51.aClass13_Sub1Array1[local32] = Static51.aClass13_Sub1Array1[local10];
				Static51.aClass13_Sub1Array1[local10++] = local51;
			}
		}
		Static51.aClass13_Sub1Array1[arg3] = Static51.aClass13_Sub1Array1[local10];
		Static51.aClass13_Sub1Array1[local10] = local20;
		method3807(arg0, arg1, arg2, local10 - 1, arg4, arg5);
		method3807(arg0, local10 + 1, arg2, arg3, arg4, arg5);
	}
}
