import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!oj", name = "gb", descriptor = "Lclient!fa;")
	public static Interface8 anInterface8_11;

	@OriginalMember(owner = "client!oj", name = "nb", descriptor = "[Lclient!gfa;")
	public static Class9_Sub1[] aClass9_Sub1Array2;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_137 = new Class298(63, 7);

	@OriginalMember(owner = "client!oj", name = "Z", descriptor = "J")
	public static long aLong186 = 0L;

	@OriginalMember(owner = "client!oj", name = "hb", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_207 = new Class272(70, -2);

	@OriginalMember(owner = "client!oj", name = "pb", descriptor = "[I")
	public static final int[] anIntArray531 = new int[2];

	@OriginalMember(owner = "client!oj", name = "qb", descriptor = "[F")
	public static final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public static void method5635() {
		Static129.aClass197Array1 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method5639(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static82.anInt2184; local16++) {
			if (arg0.equalsIgnoreCase(Static552.aStringArray46[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static40.aStringArray32[local16])) {
				return true;
			}
		}
		return false;
	}
}
