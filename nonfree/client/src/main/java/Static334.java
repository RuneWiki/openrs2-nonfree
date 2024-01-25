import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	public static int anInt5950;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "Lclient!om;")
	public static Class246 aClass246_165;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_128 = new Class298(31, 8);

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public static int anInt5949 = 0;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_9 = new Class158(9, 0, 4, 1);

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "[I")
	public static final int[] anIntArray461 = new int[200];

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "[I")
	public static int[] anIntArray462 = new int[2];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method5136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static604.method5910(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method5138() {
		if (Static341.aClass43_7 != null) {
			Static341.aClass43_7.method7179();
			Static513.aClass117_11 = null;
			Static341.aClass43_7 = null;
		}
	}
}
