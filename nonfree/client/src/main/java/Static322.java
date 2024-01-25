import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "J")
	public static long aLong169;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!f;")
	public static Class88 aClass88_17;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!au;")
	public static Class22 aClass22_43 = new Class22();

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!iv;")
	public static final Class158 aClass158_13 = new Class158();

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public static int anInt6367 = 0;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "J")
	public static long aLong170 = 0L;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method5011(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}
}
