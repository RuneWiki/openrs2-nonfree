import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "Lclient!c;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "Lclient!rk;")
	public static Class220 aClass220_4;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "Lclient!lf;")
	public static Class4_Sub2_Sub11 aClass4_Sub2_Sub11_1;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public static int anInt4765 = 0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V")
	public static void method3782(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		Static46.method610(null, arg3, arg0, -1, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!hs;FIFFIFFI[BIII)V")
	public static void method3783(@OriginalArg(0) Class92 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(9) byte[] arg7) {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			Static260.method6061(arg6, arg7, arg0, local12, arg5, arg2, arg4, arg1, arg3);
			arg4 += 16384;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)I")
	public static int method3784(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBI)I")
	public static int method3785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 >>> 31;
		return (arg1 + local15) / arg0 - local15;
	}
}
