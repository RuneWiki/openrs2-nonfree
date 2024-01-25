import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	public static int anInt4463;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString44 = null;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	public static int anInt4461 = 0;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "[I")
	public static int[] anIntArray241 = null;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z")
	public static boolean method3803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(FIIFBFIFIFLclient!hm;)[B")
	public static byte[] method3804(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) Class134 arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static56.method8347(arg1, arg2, arg0, arg5, 0, arg3, local15, arg4);
		return local15;
	}
}
