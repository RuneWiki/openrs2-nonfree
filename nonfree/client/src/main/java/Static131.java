import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!wo;")
	public static Class216 aClass216_48;

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_96 = new Class34(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	public static int anInt3019 = 1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ge;IIZIIIIILclient!uo;)Lclient!ge;")
	public static Class73 method2783(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class32 arg9) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class73 local12 = (Class73) Static329.aClass87_59.method2482(local6);
		if (local12 == null) {
			@Pc(22) Class82 local22 = Static221.method4154(arg5, Static56.aClass216_17);
			if (local22 == null) {
				return null;
			}
			local12 = arg9.method2153(local22, 1031, Static300.anInt5956, 64, 768);
			Static329.aClass87_59.method2481(local12, local6);
		}
		local12 = local12.method3306((byte) 2, 1031, true);
		if (arg2 != 0) {
			local12.method3319(arg2);
		}
		if (arg4 != 0) {
			local12.method3284(arg4);
		}
		if (arg3 != 0) {
			local12.method3324(arg3);
		}
		if (arg8 != 0) {
			local12.method3293(0, arg8, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	public static void method2797() {
		@Pc(5) Class87 local5 = Static322.aClass87_57;
		synchronized (Static322.aClass87_57) {
			Static322.aClass87_57.method2485();
		}
		local5 = Static28.aClass87_5;
		synchronized (Static28.aClass87_5) {
			Static28.aClass87_5.method2485();
		}
	}
}
