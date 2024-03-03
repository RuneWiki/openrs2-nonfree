import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILclient!ml;Lclient!ci;Ljava/awt/Canvas;I)Lclient!wm;", line = 43)
	public static synchronized Class19 method2824(@OriginalArg(1) int arg0, @OriginalArg(2) Class152 arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			if (!Class2_Sub3.aBooleanArray67[local17]) {
				local7 = local17;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(56) Class19 local56;
		if (arg4 == 0) {
			local56 = Static362.method6438(arg2, local7, arg3);
		} else if (arg4 == 1) {
			local56 = Static150.method2956(arg3, arg1, arg2, arg0, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Class2_Sub3.aBooleanArray67[local7] = true;
		return local56;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(IIII)V", line = 110)
	public static void method2837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class21 local9 = Static309.aClass21ArrayArray3[arg1][arg2];
		Static7.method6471(local9 == null ? Static112.aClass21_1 : local9, arg0);
	}
}
