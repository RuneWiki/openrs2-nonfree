import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array1;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method392(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static402.method5952("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!mg;ILclient!mg;)V")
	public static void method393(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (arg0.aClass6_Sub2_55 != null) {
			arg0.method6373();
		}
		arg0.aClass6_Sub2_55 = arg1;
		arg0.aClass6_Sub2_56 = arg1.aClass6_Sub2_56;
		arg0.aClass6_Sub2_55.aClass6_Sub2_56 = arg0;
		arg0.aClass6_Sub2_56.aClass6_Sub2_55 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)Lclient!qo;")
	public static Class210 method394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class210 local7 = new Class210();
		local7.anInt5599 = -1;
		local7.anInt5598 = -1;
		local7.anInt5610 = arg0 + 1 + 5;
		local7.anInt5612 = arg1 + 5 + 1;
		local7.anIntArrayArray34 = new int[local7.anInt5610][local7.anInt5612];
		local7.method4714();
		return local7;
	}
}
