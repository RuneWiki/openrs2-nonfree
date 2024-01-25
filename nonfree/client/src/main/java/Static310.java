import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!ij;")
	public static Class93 aClass93_126;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
	public static int anInt6638;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "[I")
	public static final int[] anIntArray625 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public static int anInt6635 = 0;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "[I")
	public static final int[] anIntArray626 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public static int anInt6639 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[S)[S")
	public static short[] method5903(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static368.method5431(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
