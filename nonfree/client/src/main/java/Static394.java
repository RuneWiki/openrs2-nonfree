import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	public static int anInt6803;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "Lclient!ua;")
	public static Class5_Sub49 aClass5_Sub49_2;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_64 = new Class187(40, -1);

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_9 = new Class307(7, 0, 1, 1);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BII[BIIIII)V")
	public static void method5727(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(22) int local22 = -arg5; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg1++;
				arg3[local30] += arg0[arg6++];
				@Pc(42) int local42 = arg1++;
				arg3[local42] += arg0[arg6++];
				@Pc(54) int local54 = arg1++;
				arg3[local54] += arg0[arg6++];
				@Pc(66) int local66 = arg1++;
				arg3[local66] += arg0[arg6++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local30 = arg1++;
				arg3[local30] += arg0[arg6++];
			}
			arg6 += arg4;
			arg1 += arg2;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Z")
	public static boolean method5729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static166.method2455(arg1, arg0)) {
			return Static467.method6899(arg0, arg1) | (arg1 & 0x9000) != 0 | Static260.method3619(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static56.method840(arg0, arg1) | (arg1 & 0x2000) != 0 | Static413.method6079(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
	public static void method5730() {
		@Pc(8) Class5_Sub2_Sub4 local8 = Static257.method3597(15, 0L);
		local8.method2440();
	}
}
