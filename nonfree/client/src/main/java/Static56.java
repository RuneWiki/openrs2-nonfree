import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_147 = new Class218(105, 10);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(FFIFIILclient!hm;IF[BIIF)V")
	public static void method8347(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(6) Class134 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(9) byte[] arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static79.method1893(arg4, arg1, arg2, arg7, arg6, arg3, arg5, arg0, local7);
			arg4 += 16384;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!ha;I)Lclient!tba;")
	public static Class315 method8352(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(14) Class148 local14 = Static557.method7854(true, arg1, arg0);
		return local14 == null ? null : local14.aClass315_12;
	}
}
