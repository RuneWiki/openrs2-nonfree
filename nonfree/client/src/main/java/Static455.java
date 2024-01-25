import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
	public static int anInt7738 = 0;

	@OriginalMember(owner = "client!qda", name = "L", descriptor = "[I")
	public static final int[] anIntArray478 = new int[1000];

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIFFFIFIILclient!kt;F)[B")
	public static byte[] method6749(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) float arg3, @OriginalArg(9) Class80 arg4, @OriginalArg(10) float arg5) {
		@Pc(26) byte[] local26 = new byte[262144];
		Static402.method6295(arg1, 0, arg3, arg0, arg4, arg5, arg2, local26);
		return local26;
	}
}
