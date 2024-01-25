import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static311 {

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[I")
	public static final int[] anIntArray363 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_31 = new Class177();

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[J[I)V")
	public static void method3822(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static440.method5805(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3824(@OriginalArg(0) String arg0) {
		return Static310.method3820(arg0, 10);
	}
}
