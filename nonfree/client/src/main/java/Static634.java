import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
	public static int anInt10184;

	@OriginalMember(owner = "client!wl", name = "K", descriptor = "Lclient!qs;")
	public static final Class291 aClass291_4 = new Class291();

	@OriginalMember(owner = "client!wl", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[8];

	@OriginalMember(owner = "client!wl", name = "W", descriptor = "[I")
	public static final int[] anIntArray691 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
	public static void method8473(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub2_Sub4 local16 = Static566.method7763(arg0, 8);
		local16.method669();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class2_Sub52 local7 = null;
		for (@Pc(12) Class2_Sub52 local12 = (Class2_Sub52) Static212.aClass109_28.method2325(); local12 != null; local12 = (Class2_Sub52) Static212.aClass109_28.method2318()) {
			if (arg0 == local12.anInt9836 && local12.anInt9843 == arg2 && arg5 == local12.anInt9838 && arg4 == local12.anInt9837) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub52();
			local7.anInt9837 = arg4;
			local7.anInt9843 = arg2;
			local7.anInt9836 = arg0;
			local7.anInt9838 = arg5;
			if (arg2 >= 0 && arg5 >= 0 && Static228.anInt3704 > arg2 && arg5 < Static162.anInt2911) {
				Static454.method6236(local7);
			}
			Static212.aClass109_28.method2323(local7);
		}
		local7.anInt9839 = 0;
		local7.anInt9834 = arg1;
		local7.anInt9846 = arg6;
		local7.anInt9832 = arg3;
		local7.anInt9842 = -1;
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(III)Z")
	public static boolean method8475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static392.method5361(arg1, arg0) || Static102.method1050(arg0, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(III)V")
	public static void method8476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class350 local9 = Static113.aClass350ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static332.anInt5258 = local9.anInt9404;
			Static207.anInt3511 = local9.anInt9398;
			Static67.anInt1218 = local9.anInt9403;
		}
		Static560.method7663();
	}
}
