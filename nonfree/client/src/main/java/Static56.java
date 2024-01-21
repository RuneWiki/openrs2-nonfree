import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array3;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "Lclient!ab;")
	public static Class3 aClass3_8;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_559 = Static187.method3089("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	public static int anInt1344 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static204.anInt2389 < arg3 || Static118.anInt2521 > arg0) {
			return;
		}
		@Pc(18) boolean local18;
		if (Static102.anInt2207 > arg2) {
			arg2 = Static102.anInt2207;
			local18 = false;
		} else if (Static116.anInt2488 >= arg2) {
			local18 = true;
		} else {
			local18 = false;
			arg2 = Static116.anInt2488;
		}
		@Pc(40) boolean local40;
		if (arg1 < Static102.anInt2207) {
			local40 = false;
			arg1 = Static102.anInt2207;
		} else if (Static116.anInt2488 < arg1) {
			local40 = false;
			arg1 = Static116.anInt2488;
		} else {
			local40 = true;
		}
		if (arg3 >= Static118.anInt2521) {
			Static74.method1123(arg1, arg4, Static142.anIntArrayArray25[arg3++], arg2);
		} else {
			arg3 = Static118.anInt2521;
		}
		if (arg0 > Static204.anInt2389) {
			arg0 = Static204.anInt2389;
		} else {
			Static74.method1123(arg1, arg4, Static142.anIntArrayArray25[arg0--], arg2);
		}
		@Pc(103) int local103;
		if (local40 && local18) {
			for (local103 = arg3; local103 <= arg0; local103++) {
				@Pc(141) int[] local141 = Static142.anIntArrayArray25[local103];
				local141[arg1] = local141[arg2] = arg4;
			}
		} else if (local40) {
			for (local103 = arg3; local103 <= arg0; local103++) {
				Static142.anIntArrayArray25[local103][arg1] = arg4;
			}
		} else if (local18) {
			for (local103 = arg3; local103 <= arg0; local103++) {
				Static142.anIntArrayArray25[local103][arg2] = arg4;
			}
		}
	}
}
