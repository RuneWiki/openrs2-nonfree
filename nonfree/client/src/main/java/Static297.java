import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public static int anInt5142;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "[Lclient!gl;")
	public static Class146[] aClass146Array1;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[Lclient!pja;")
	public static Class279[] aClass279Array1;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!el;")
	public static final Class109 aClass109_116 = new Class109(25, 4);

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "[I")
	public static final int[] anIntArray289 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!me;Lclient!me;)V")
	public static void method4390(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_337 != null) {
			arg1.method9327(1);
		}
		arg1.aClass5_337 = arg0.aClass5_337;
		arg1.aClass5_338 = arg0;
		arg1.aClass5_337.aClass5_338 = arg1;
		arg1.aClass5_338.aClass5_337 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIILclient!ot;ILclient!la;I)V")
	public static void method4393(@OriginalArg(1) int arg0, @OriginalArg(3) Class5_Sub16_Sub4 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class208 arg3) {
		Static335.method5111(arg0, arg3, arg2);
		Static622.aClass5_Sub16_Sub4_8 = arg1;
	}
}
