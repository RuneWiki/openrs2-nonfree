import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!lj;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[Lclient!il;")
	public static Class117[] aClass117Array1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method5244() {
		if (Static187.anInt3261 < 0) {
			Static187.anInt3261 = 0;
			Static340.anInt5720 = -1;
			Static212.anInt3671 = -1;
		}
		if (Static36.anInt2248 < Static187.anInt3261) {
			Static340.anInt5720 = -1;
			Static187.anInt3261 = Static36.anInt2248;
			Static212.anInt3671 = -1;
		}
		if (Static70.anInt1464 < 0) {
			Static212.anInt3671 = -1;
			Static340.anInt5720 = -1;
			Static70.anInt1464 = 0;
		}
		if (Static36.anInt2241 < Static70.anInt1464) {
			Static212.anInt3671 = -1;
			Static340.anInt5720 = -1;
			Static70.anInt1464 = Static36.anInt2241;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII[BIII[B)V")
	public static void method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg5 >> 2);
		@Pc(19) int local19 = -(arg5 & 0x3);
		for (@Pc(22) int local22 = -arg2; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg0++;
				arg7[local30] = (byte) (arg7[local30] - arg3[arg1++]);
				@Pc(43) int local43 = arg0++;
				arg7[local43] = (byte) (arg7[local43] - arg3[arg1++]);
				@Pc(56) int local56 = arg0++;
				arg7[local56] = (byte) (arg7[local56] - arg3[arg1++]);
				@Pc(69) int local69 = arg0++;
				arg7[local69] = (byte) (arg7[local69] - arg3[arg1++]);
			}
			for (@Pc(85) int local85 = local19; local85 < 0; local85++) {
				local30 = arg0++;
				arg7[local30] = (byte) (arg7[local30] - arg3[arg1++]);
			}
			arg0 += arg6;
			arg1 += arg4;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public static void method5247() {
		Static307.aClass28_42.method3521(Static42.aFloat30, Static195.aFloat64, Static151.aFloat49);
	}
}
