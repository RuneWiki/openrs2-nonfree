import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!pu;")
	public static Class270 aClass270_97;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6381(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class1_Sub6_Sub16 local16 = Static212.method3332(3, arg0);
		local16.method6594();
		local16.aString85 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method6382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class111 local13 = local7.aClass111_1; local13 != null; local13 = local13.aClass111_2) {
			@Pc(17) Class8_Sub3_Sub3 local17 = local13.aClass8_Sub3_Sub3_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort132 == arg1 && local17.aShort131 == arg2) {
				Static481.method6522(local17, false);
				return;
			}
		}
	}
}
