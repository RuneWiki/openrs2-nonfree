import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Lclient!wd;")
	public static Class261 aClass261_1;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
	public static int anInt5137 = 0;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
	public static int anInt5144 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!et;Ljava/lang/String;ZZI)V")
	public static void method3929(@OriginalArg(0) Class66 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			Static197.method3110(arg0, 3, arg1);
			return;
		}
		@Pc(29) String local29;
		if (Static98.aString25.startsWith("win") && Static98.anInt1987 != 3) {
			local29 = null;
			if (arg0.anApplet1 != null) {
				local29 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local29 == null || !local29.equals("1")) {
				@Pc(49) Class199 local49 = Static197.method3110(arg0, 0, arg1);
				Static333.aString57 = arg1;
				Static142.aClass199_6 = local49;
				Static248.aClass66_6 = arg0;
				return;
			}
		}
		if (Static98.aString25.startsWith("mac")) {
			local29 = null;
			if (arg0.anApplet1 != null) {
				local29 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local29 != null && local29.equals("1") && arg2) {
				Static197.method3110(arg0, 1, arg1);
				return;
			}
		}
		Static197.method3110(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;IIILclient!la;ILclient!uu;IILclient!gt;Lclient!ma;)V")
	public static void method3930(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class247 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class89 arg9, @OriginalArg(11) Class145 arg10) {
		@Pc(11) int local11;
		if (Static111.anInt2386 == 4) {
			local11 = (int) Static368.aFloat192 & 0x3FFF;
		} else {
			local11 = (int) Static368.aFloat192 + Static175.anInt3399 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg6.anInt6833 / 2, arg6.anInt6805 / 2) + 10;
		@Pc(41) int local41 = arg2 * arg2 + arg7 * arg7;
		if (local41 > local33 * local33) {
			return;
		}
		@Pc(55) int local55 = Class50_Sub1.anIntArray225[local11];
		@Pc(59) int local59 = Class50_Sub1.anIntArray224[local11];
		if (Static111.anInt2386 != 4) {
			local59 = local59 * 256 / (Static110.anInt2374 + 256);
			local55 = local55 * 256 / (Static110.anInt2374 + 256);
		}
		@Pc(89) int local89 = arg7 * local55 + arg2 * local59 >> 15;
		@Pc(99) int local99 = local59 * arg7 - local55 * arg2 >> 15;
		@Pc(106) int local106 = arg9.method2349(arg1, 100, null);
		@Pc(114) int local114 = arg9.method2345(arg1, null);
		@Pc(120) int local120 = local89 - local106 / 2;
		if (-arg6.anInt6833 <= local120 && local120 <= arg6.anInt6833 && local99 >= -arg6.anInt6805 && local99 <= arg6.anInt6805) {
			arg4.method5063(0, arg5, null, arg0, arg10, arg6.anInt6805 / 2 + arg5 - local114 - arg3 - local99, local120 - -arg0 - -(arg6.anInt6833 / 2), 50, local106, arg8, 0, arg1, null);
		}
	}
}
