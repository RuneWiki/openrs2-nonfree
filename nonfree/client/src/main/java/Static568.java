import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
	public static int[] anIntArray608;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_125 = new Class286(13, 8);

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Z")
	public static boolean aBoolean784 = false;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[SI)[S")
	public static short[] method9093(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(13) short[] local13 = new short[arg0];
		Static735.method9189(arg1, 0, local13, 0, arg0);
		return local13;
	}
}
