import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
	public static int anInt9591 = 0;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLclient!oi;)Ljava/lang/String;")
	public static String method7770(@OriginalArg(1) Class3_Sub40 arg0) {
		return arg0.aString88 == null || arg0.aString88.length() <= 0 ? arg0.aString87 : arg0.aString87 + Static139.aClass101_31.method2841(Static126.anInt2904) + arg0.aString88;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIILclient!pga;)V")
	public static void method7773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1 arg3) {
		@Pc(4) Class125 local4 = Static188.method3288(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass2_Sub1_1 = arg3;
		}
	}
}
