import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
	public static int[] anIntArray492 = new int[1000];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)Lclient!bl;")
	public static Class17 method3357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class17 local15 = new Class17();
		for (@Pc(20) Class1_Sub2_Sub13 local20 = (Class1_Sub2_Sub13) Static45.aClass22_3.method640(); local20 != null; local20 = (Class1_Sub2_Sub13) Static45.aClass22_3.method637()) {
			if (local20.aBoolean258 && local20.method2811(arg1, arg0)) {
				local15.method462(local20);
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ak;Lclient!ak;ILclient!ak;Lclient!ak;)V")
	public static void method3360(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class7 arg3) {
		Static55.aClass7_49 = arg2;
		Static38.aClass7_38 = arg3;
		Static234.aClass7_192 = arg1;
		Static70.aClass7_69 = arg0;
		Static86.aClass127ArrayArray1 = new Class127[Static55.aClass7_49.method257()][];
		Static176.aBooleanArray13 = new boolean[Static55.aClass7_49.method257()];
	}
}
