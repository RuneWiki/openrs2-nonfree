import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
	public static int anInt6271 = -2;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!ga;")
	public static Class124 aClass124_60 = new Class124();

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "([II[Ljava/lang/String;)V")
	public static void method5266(@OriginalArg(0) int[] arg0, @OriginalArg(2) String[] arg1) {
		Static318.method2089(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(FBIFLclient!bn;IFIFIF)[B")
	public static byte[] method5267(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) Class43 arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static626.method8350(local10, arg0, arg2, arg5, arg4, 0, arg3, arg1);
		return local10;
	}
}
