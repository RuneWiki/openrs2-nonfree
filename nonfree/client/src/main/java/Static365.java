import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
	public static boolean aBoolean444 = false;

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString172 = null;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([BFIFIIILclient!p;IFFIF)V")
	public static void method4802(@OriginalArg(0) byte[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class9 arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static80.method3757(arg2, arg4, arg0, arg5, arg6, local3, arg1, arg7, arg3);
			arg3 += 16384;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method4803(@OriginalArg(0) Class163 arg0) {
		if (Static126.aBoolean52) {
			Static428.method5369(arg0);
		} else {
			Static280.method3742(arg0);
		}
	}
}
