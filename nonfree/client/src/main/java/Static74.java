import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
	public static int anInt1469;

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "Lclient!m;")
	public static Interface7 anInterface7_3;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
	public static int anInt1467 = 0;

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString9 = null;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!av;FBIFII[BFFFI)V")
	public static void method1249(@OriginalArg(1) Class17 arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static23.method433(arg3, arg5, local5, arg1, arg2, arg4, arg0, arg6, arg7);
			arg3 += 16384;
		}
	}
}
