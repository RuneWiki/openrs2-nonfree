import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "J")
	public static long aLong124 = 0L;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString40 = null;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "[I")
	public static final int[] anIntArray308 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3792(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static111.method2113(Static248.method3642(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
