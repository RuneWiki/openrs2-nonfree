import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!hr", name = "T", descriptor = "Lclient!dv;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "Lclient!mw;")
	public static final Class239 aClass239_5 = new Class239();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method3753(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static576.method7937(arg0, arg1) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLclient!aca;Lclient!aca;IZBI)I")
	public static int method3754(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub1 arg1, @OriginalArg(2) Class6_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static17.method231(arg5, arg1, arg4, arg2);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static17.method231(arg3, arg1, arg0, arg2);
			return arg0 ? -local37 : local37;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBI)V")
	public static void method3757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static26.anInt352 != 0) {
			if (arg0 >= 0) {
				Static326.anIntArray343[arg0] = arg1;
			} else {
				for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
					Static326.anIntArray343[local13] = arg1;
				}
			}
		}
		Static386.aClass5_Sub17_Sub1_2.method2531(arg0, arg1);
	}
}
