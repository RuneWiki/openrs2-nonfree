import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Z")
	public static boolean aBoolean643;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BZLjava/lang/String;ZLclient!wd;)V")
	public static void method7519(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class354 arg3) {
		if (!arg0) {
			Static345.method5588(3, arg1, arg3);
			return;
		}
		@Pc(28) String local28;
		if (Static576.aString104.startsWith("win") && arg3.aBoolean711) {
			local28 = null;
			if (Static110.anApplet1 != null) {
				local28 = Static110.anApplet1.getParameter("haveie6");
			}
			if (local28 == null || !local28.equals("1")) {
				@Pc(46) Class234 local46 = Static345.method5588(0, arg1, arg3);
				Static138.aClass354_1 = arg3;
				Static204.aString87 = arg1;
				Static373.aClass234_6 = local46;
				return;
			}
		}
		if (Static576.aString104.startsWith("mac")) {
			local28 = null;
			if (Static110.anApplet1 != null) {
				local28 = Static110.anApplet1.getParameter("havefirefox");
			}
			if (local28 != null && local28.equals("1") && arg2) {
				Static345.method5588(1, arg1, arg3);
				return;
			}
		}
		Static345.method5588(2, arg1, arg3);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
	public static void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(169) Class53 local169 = Static60.aClass53ArrayArrayArray1[arg5][arg1][arg4];
		if (local169 == null) {
			local169 = new Class53(arg5);
		}
		if (arg0 == 1) {
			local169.aShort16 = (short) arg3;
			local169.aShort13 = (short) arg2;
		} else if (arg0 == 2) {
			local169.aShort15 = (short) arg2;
			local169.aShort14 = (short) arg3;
		}
		if (Static402.aBoolean525) {
			Static190.method3335();
		}
	}
}
