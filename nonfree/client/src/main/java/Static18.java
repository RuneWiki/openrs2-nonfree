import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "J")
	public static long aLong15;

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "Lclient!nca;")
	public static Class254 aClass254_14;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
	public static int anInt242;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!ha;ILclient!dca;IILclient!nja;Lclient!sh;I)V")
	public static void method249(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class259 arg5, @OriginalArg(7) Class2_Sub51 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg0 - arg4 / 2 - 5;
		@Pc(17) int local17 = arg7 + 2;
		if (arg5.anInt6970 != 0) {
			arg1.method9637(arg4 + 10, arg7 + 1 + arg3.method1561() * arg2 + -local17, local17, arg5.anInt6970, local13);
		}
		if (arg5.anInt6956 != 0) {
			arg1.method9635(arg5.anInt6956, local17, arg7 + arg2 * arg3.method1561() + 1 - local17, local13, arg4 + 10);
		}
		@Pc(79) int local79 = arg5.anInt6978;
		if (arg6.aBoolean786 && arg5.anInt6959 != -1) {
			local79 = arg5.anInt6959;
		}
		for (@Pc(102) int local102 = 0; local102 < arg2; local102++) {
			@Pc(108) String local108 = Static512.aStringArray36[local102];
			if (local102 < arg2 - 1) {
				local108 = local108.substring(0, local108.length() - 4);
			}
			arg3.method1559(arg1, local108, arg0, arg7, local79);
			arg7 += arg3.method1561();
		}
	}
}
