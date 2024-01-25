import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	public static int anInt9144;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class187 local13 = local7.aClass187_3; local13 != null; local13 = local13.aClass187_1) {
			@Pc(17) Class1_Sub1 local17 = local13.aClass1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort127 == arg1 && local17.aShort128 == arg2) {
				Static363.method1118(local17);
				return;
			}
		}
	}
}
