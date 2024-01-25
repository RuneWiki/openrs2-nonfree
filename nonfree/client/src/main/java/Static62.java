import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Lclient!nba;")
	public static final Class215 aClass215_2 = new Class215();

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II[[[BIIIIIILclient!oa;III)V")
	public static void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class14 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg4 == 0 || arg3 == 0) {
			return;
		}
		if (arg4 == 9) {
			arg0 = arg0 + 1 & 0x3;
			arg4 = 1;
		}
		if (arg4 == 10) {
			arg4 = 1;
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg4 == 11) {
			arg0 = arg0 + 3 & 0x3;
			arg4 = 8;
		}
		arg8.ma(arg11, arg10, arg6, arg7, arg9, arg5, arg2[arg4 - 1][arg0], arg3, arg1);
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)Z")
	public static boolean method1265() {
		if (Static301.aBoolean391) {
			try {
				Static608.method4639(Static249.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}
