import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hw", name = "H", descriptor = "Lclient!ea;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!hw", name = "G", descriptor = "[S")
	public static short[] aShortArray22 = new short[256];

	@OriginalMember(owner = "client!hw", name = "J", descriptor = "[I")
	public static final int[] anIntArray222 = new int[500];

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method2307(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static175.aBoolean183) {
			try {
				@Pc(23) Class89 local23 = (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
				local23.method5155(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static175.aBoolean183 = true;
			}
		}
		return arg0;
	}
}
