import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static512 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!gp;Lclient!gp;Lclient!gp;Lclient!gp;)V")
	public static void method6835(@OriginalArg(1) Class117 arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) Class117 arg2, @OriginalArg(4) Class117 arg3) {
		Static372.aClass117_83 = arg1;
		Static153.aClass117_81 = arg0;
		Static182.aClass117_100 = arg2;
		Static102.aClass117_58 = arg3;
		Static139.aClass220ArrayArray1 = new Class220[Static182.aClass117_100.method2972()][];
		Static463.aBooleanArray33 = new boolean[Static182.aClass117_100.method2972()];
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	public static int method6837(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
