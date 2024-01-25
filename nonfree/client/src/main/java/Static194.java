import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
	public static int anInt4181;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "[I")
	public static final int[] anIntArray284 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
	public static int anInt4180 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II[B)[B")
	public static byte[] method3443(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static649.method4863(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	public static void method3444() {
		Static192.aBoolean353 = true;
	}
}
