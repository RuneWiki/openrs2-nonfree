import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eh", name = "Gb", descriptor = "Lclient!cs;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
	public static int anInt2695 = 16777215;

	@OriginalMember(owner = "client!eh", name = "sb", descriptor = "[I")
	public static final int[] anIntArray226 = new int[1024];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
	public static void method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(13, (long) arg0);
		local9.method2195();
		local9.anInt2394 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method2493(@OriginalArg(1) byte[] arg0) {
		return Static426.method6150(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IZ)V")
	public static void method2497(@OriginalArg(0) int arg0) {
		Static604.anInt9723 = arg0;
		Static208.aClass165_26.method4403();
	}
}
