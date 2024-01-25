import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(III)I")
	public static int method4388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		if (arg0 < arg1) {
			local19 = arg0;
			arg0 = arg1;
			arg1 = local19;
		}
		while (arg1 != 0) {
			local19 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local19;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(BLclient!uca;ILclient!ha;Lclient!uaa;ILclient!bq;II)V")
	public static void method4389(@OriginalArg(1) Class6_Sub48 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) Class333 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class36 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = arg7 - arg1 / 2 - 5;
		@Pc(21) int local21 = arg4 + 2;
		if (arg5.anInt1740 != 0) {
			arg2.method6123(arg1 + 10, -local21 + arg4 - -(arg6 * arg3.method7932()) + 1, local21, arg5.anInt1740, local17);
		}
		if (arg5.anInt1747 != 0) {
			arg2.method6144(arg6 * arg3.method7932() + arg4 + 1 - local21, arg1 + 10, arg5.anInt1747, local17, local21);
		}
		@Pc(73) int local73 = arg5.anInt1767;
		if (arg0.aBoolean773 && arg5.anInt1746 != -1) {
			local73 = arg5.anInt1746;
		}
		for (@Pc(85) int local85 = 0; local85 < arg6; local85++) {
			@Pc(91) String local91 = Static72.aStringArray8[local85];
			if (arg6 - 1 > local85) {
				local91 = local91.substring(0, local91.length() - 4);
			}
			arg3.method7933(arg2, local91, arg7, arg4, local73);
			arg4 += arg3.method7932();
		}
	}
}
