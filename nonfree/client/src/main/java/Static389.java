import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "[[[Lclient!sn;")
	public static Class227[][][] aClass227ArrayArrayArray3;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
	public static final int[] anIntArray212 = new int[32];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILclient!kr;Lclient!kr;)V")
	public static void method2922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub3 arg3, @OriginalArg(4) Class1_Sub3 arg4) {
		@Pc(4) Class227 local4 = Static361.method5054(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub3_3 = arg3;
			local4.aClass1_Sub3_2 = arg4;
		}
	}
}
