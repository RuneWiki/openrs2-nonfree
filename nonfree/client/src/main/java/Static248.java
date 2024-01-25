import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
	public static int anInt5069;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!oj;)V")
	public static void method4389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5 arg3) {
		@Pc(4) Class224 local4 = Static178.method3530(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub5_2 = arg3;
		}
	}
}
