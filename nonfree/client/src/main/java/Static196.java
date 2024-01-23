import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!of", name = "z", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!of", name = "B", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!of", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!of", name = "M", descriptor = "I")
	public static int anInt3909;

	@OriginalMember(owner = "client!of", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[200];

	@OriginalMember(owner = "client!of", name = "K", descriptor = "I")
	public static int anInt3908 = -1;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)Lclient!tc;")
	public static Class163 method3385(@OriginalArg(0) int arg0) {
		@Pc(10) Class163 local10 = (Class163) Static241.aClass175_35.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static130.aClass119_49.method3235(arg0, 33);
		local10 = new Class163();
		if (local21 != null) {
			local10.method4045(new Class1_Sub13(local21), arg0);
		}
		Static241.aClass175_35.method4285(local10, (long) arg0);
		return local10;
	}
}
