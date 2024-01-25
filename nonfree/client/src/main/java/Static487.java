import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Lclient!gn;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
	public static int anInt8320 = 100;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[Lclient!vfa;ZIBI)V")
	public static void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) Class357[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class357 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt9837) {
				Static246.method3761(local13, arg2, arg3, arg4);
				Static268.method4075(local13, arg3, arg4);
				if (local13.anInt9879 - local13.anInt9852 < local13.anInt9814) {
					local13.anInt9814 = local13.anInt9879 - local13.anInt9852;
				}
				if (local13.anInt9819 > local13.anInt9861 - local13.anInt9797) {
					local13.anInt9819 = local13.anInt9861 - local13.anInt9797;
				}
				if (local13.anInt9814 < 0) {
					local13.anInt9814 = 0;
				}
				if (local13.anInt9819 < 0) {
					local13.anInt9819 = 0;
				}
				if (local13.anInt9828 == 0) {
					Static101.method1475(arg2, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	public static void method7153() {
		@Pc(11) int local11 = Static227.anInt3948;
		@Pc(13) int[] local13 = Static467.anIntArray632;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class14_Sub1_Sub1_Sub3_Sub1 local23 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local13[local15]];
			if (local23 != null) {
				Static643.method8836(local23, local23.method2509());
			}
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB[B)I")
	public static int method7154(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static199.method6981(arg0, 0, arg1);
	}
}
