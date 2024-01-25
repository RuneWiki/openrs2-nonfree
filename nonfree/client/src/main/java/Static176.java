import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!io", name = "H", descriptor = "I")
	public static int anInt1041;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "I")
	private static int anInt1043;

	@OriginalMember(owner = "client!io", name = "L", descriptor = "Z")
	private static boolean aBoolean115;

	@OriginalMember(owner = "client!io", name = "M", descriptor = "Z")
	private static boolean aBoolean116;

	@OriginalMember(owner = "client!io", name = "N", descriptor = "Z")
	private static boolean aBoolean117;

	@OriginalMember(owner = "client!io", name = "I", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_50 = new Class103(26, 5);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIFFLclient!nk;IFBFIF)[B")
	public static byte[] method941(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) Class166 arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static355.method4784(arg2, 0, arg1, arg5, arg4, arg0, arg3, local10);
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "providesignlink", descriptor = "(Lclient!fq;)V")
	private static void method951(@OriginalArg(0) Class83 arg0) {
		Static183.aClass83_2 = arg0;
		Static440.aClass83_5 = arg0;
	}
}
