import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!us", name = "s", descriptor = "I")
	public static int anInt9149;

	@OriginalMember(owner = "client!us", name = "t", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!kca;IIILclient!oa;Lclient!ub;Lclient!ee;B)V")
	public static void method7526(@OriginalArg(0) Class189 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class66 arg4, @OriginalArg(5) Class4_Sub48 arg5, @OriginalArg(6) Class86 arg6) {
		@Pc(26) int local26 = arg5.anInt8898 - arg2 / 2 - 5;
		@Pc(30) int local30 = arg3 + 2;
		if (arg6.anInt2728 != 0) {
			arg4.method6794(arg2 + 10, local26, arg3 + arg0.method4341() * arg1 + 1 - local30, local30, arg6.anInt2728);
		}
		if (arg6.anInt2709 != 0) {
			arg4.method6822(local26, arg6.anInt2709, arg3 + arg1 * arg0.method4341() + 1 - local30, local30, arg2 + 10);
		}
		@Pc(84) int local84 = arg6.anInt2719;
		if (arg5.aBoolean614 && arg6.anInt2715 != -1) {
			local84 = arg6.anInt2715;
		}
		for (@Pc(96) int local96 = 0; local96 < arg1; local96++) {
			@Pc(102) String local102 = Static193.aStringArray14[local96];
			if (local96 < arg1 - 1) {
				local102 = local102.substring(0, local102.length() - 4);
			}
			arg0.method4342(arg4, local102, arg5.anInt8898, arg3, local84);
			arg3 += arg0.method4341();
		}
	}
}
