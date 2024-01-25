import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "[I")
	public static final int[] anIntArray177 = new int[50];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class84 local13 = local7.aClass84_3; local13 != null; local13 = local13.aClass84_2) {
			@Pc(17) Class4_Sub5 local17 = local13.aClass4_Sub5_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort92 == arg1 && local17.aShort93 == arg2) {
				Static326.method5657(local17);
				return;
			}
		}
	}
}
