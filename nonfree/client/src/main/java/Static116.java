import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!vh;")
	public static Class250 aClass250_23;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public static int anInt2032;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIILclient!os;)V")
	public static void method1715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26_Sub5 arg4) {
		@Pc(4) Class211 local4 = Static197.method3007(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt2702 = (arg1 << Static139.anInt2355) + Static122.anInt2160;
		arg4.anInt2698 = arg3;
		arg4.anInt2703 = (arg2 << Static139.anInt2355) + Static122.anInt2160;
		for (@Pc(28) Class125 local28 = local4.aClass125_3; local28 != null; local28 = local28.aClass125_1) {
			if (local28.aClass26_Sub2_1.aBoolean455) {
				@Pc(38) int local38 = local28.aClass26_Sub2_1.method5522();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt2698 += local8;
			arg4.aBoolean144 = true;
		}
		local4.aClass26_Sub5_1 = arg4;
	}
}
