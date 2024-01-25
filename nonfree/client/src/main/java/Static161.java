import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
	public static final int anInt3612 = 50;

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
	public static int anInt3613 = 0;

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "[I")
	public static final int[] anIntArray143 = new int[anInt3612];

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "[I")
	public static final int[] anIntArray144 = new int[anInt3612];

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "[I")
	public static final int[] anIntArray145 = new int[anInt3612];

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "[I")
	public static final int[] anIntArray146 = new int[anInt3612];

	@OriginalMember(owner = "client!fw", name = "B", descriptor = "[I")
	public static final int[] anIntArray148 = new int[anInt3612];

	@OriginalMember(owner = "client!fw", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[anInt3612];

	@OriginalMember(owner = "client!fw", name = "F", descriptor = "[I")
	public static final int[] anIntArray149 = new int[anInt3612];

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class3_Sub29 local7 = null;
		for (@Pc(17) Class3_Sub29 local17 = (Class3_Sub29) Static391.aClass244_52.method5572(); local17 != null; local17 = (Class3_Sub29) Static391.aClass244_52.method5576()) {
			if (arg4 == local17.anInt5004 && local17.anInt5007 == arg3 && local17.anInt5012 == arg6 && local17.anInt5003 == arg0) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub29();
			local7.anInt5007 = arg3;
			local7.anInt5012 = arg6;
			local7.anInt5003 = arg0;
			local7.anInt5004 = arg4;
			if (arg3 >= 0 && arg6 >= 0 && Static345.anInt6228 > arg3 && arg6 < Static535.anInt9341) {
				Static368.method5219(local7);
			}
			Static391.aClass244_52.method5570(local7);
		}
		local7.anInt5013 = arg5;
		local7.anInt5014 = arg2;
		local7.anInt5010 = arg1;
		local7.anInt5011 = 0;
		local7.anInt5015 = -1;
	}
}
