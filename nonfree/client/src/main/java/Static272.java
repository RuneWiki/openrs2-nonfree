import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jja", name = "e", descriptor = "Lclient!uo;")
	public static Class5_Sub1_Sub20 aClass5_Sub1_Sub20_1 = null;

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "I")
	public static int anInt4913 = -1;

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "[I")
	public static final int[] anIntArray266 = new int[4096];

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(III)V")
	public static void method4455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub41 local13 = Static647.method8905(Static526.aClass381_222, Static4.aClass389_17.aClass393_2);
		local13.aClass5_Sub36_Sub2_1.method7277(arg0);
		local13.aClass5_Sub36_Sub2_1.method7284(arg1);
		Static4.aClass389_17.method9079(local13);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "([SZ[Ljava/lang/String;)V")
	public static void method4456(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static467.method6572(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IIIIIII)V")
	public static void method4457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static519.anInt8235 = arg1;
		Static433.anInt7170 = arg3;
		Static322.anInt5500 = arg2;
		Static81.anInt1431 = arg0;
		Static116.anInt8663 = arg4;
		Static392.anInt6626 = arg5;
	}
}
