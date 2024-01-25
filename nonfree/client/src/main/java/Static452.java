import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
	public static int anInt7407;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
	public static int anInt7412;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZI)I")
	public static int method5603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(F[BIIFIFFIILclient!uv;IF)V")
	public static void method5604(@OriginalArg(0) float arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(10) Class10 arg5, @OriginalArg(11) int arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static163.method2235(arg4, arg2, arg5, arg0, arg3, arg6, arg7, local7, arg1);
			arg6 += 16384;
		}
	}
}
