import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_109 = new Class81(54, 1);

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
	public static int anInt4362 = 0;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean347 = true;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)Lclient!qv;")
	public static Class20_Sub2_Sub5 method3759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class20_Sub2_Sub5 local14 = local7.aClass20_Sub2_Sub5_1;
			local7.aClass20_Sub2_Sub5_1 = null;
			Static158.method2429(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ga;[ILclient!ga;)V")
	public static void method3760(@OriginalArg(1) Class111 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class111 arg2) {
		if (arg1 != null) {
			Static501.anIntArray575 = arg1;
		}
		Static126.aClass111_92 = arg2;
		Static559.aClass111_121 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static487.method6814(arg1, arg0) | (arg0 & 0x70000) != 0 || Static357.method5214(arg0, arg1);
	}
}
