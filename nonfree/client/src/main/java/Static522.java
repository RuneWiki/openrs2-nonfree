import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString87;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)I")
	public static int method7500() {
		@Pc(5) Class264 local5 = Static324.aClass264_38;
		synchronized (Static324.aClass264_38) {
			return Static324.aClass264_38.method6358();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!wia;IBZ)V")
	public static void method7501(@OriginalArg(0) int arg0, @OriginalArg(2) Class386 arg1, @OriginalArg(3) int arg2) {
		Static471.method6842(arg1, 0L, arg0, arg2);
	}
}
