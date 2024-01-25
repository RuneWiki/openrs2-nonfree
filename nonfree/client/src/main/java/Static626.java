import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
	public static int anInt10033 = -1;

	@OriginalMember(owner = "client!vea", name = "y", descriptor = "[Lclient!oha;")
	public static final Class257[] aClass257Array1 = new Class257[16];

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(III[BIFLclient!bn;FFIIFF)V")
	public static void method8350(@OriginalArg(3) byte[] arg0, @OriginalArg(5) float arg1, @OriginalArg(6) Class43 arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) int arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static196.method2770(arg1, arg5, local1, arg2, arg7, arg3, arg6, arg4, arg0);
			arg5 += 16384;
		}
	}
}
