import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!jaa;")
	public static Class170 aClass170_1;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public static int anInt4607;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt4612;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ha;IIIILclient!iba;ILclient!re;Lclient!cl;)V")
	public static void method4174(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub26 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class299 arg6, @OriginalArg(8) Class57 arg7) {
		@Pc(14) int local14 = arg2 - arg3 / 2 - 5;
		@Pc(18) int local18 = arg1 + 2;
		if (arg6.anInt8130 != 0) {
			arg0.method7251(arg3 + 10, -local18 + 1 + arg5 * arg7.method1239() + arg1, arg6.anInt8130, local18, local14);
		}
		if (arg6.anInt8119 != 0) {
			arg0.method7243(local14, arg6.anInt8119, arg1 + arg5 * arg7.method1239() + 1 - local18, local18, arg3 + 10);
		}
		@Pc(73) int local73 = arg6.anInt8141;
		if (arg4.aBoolean309 && arg6.anInt8145 != -1) {
			local73 = arg6.anInt8145;
		}
		for (@Pc(86) int local86 = 0; local86 < arg5; local86++) {
			@Pc(92) String local92 = Static183.aStringArray24[local86];
			if (local86 < arg5 - 1) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg7.method1237(arg0, local92, arg2, arg1, local73);
			arg1 += arg7.method1239();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)I")
	public static int method4176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = (local20 * 15731 * local20 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
