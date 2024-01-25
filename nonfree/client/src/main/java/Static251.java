import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!op", name = "s", descriptor = "Lclient!dp;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!op", name = "I", descriptor = "I")
	public static int anInt4861;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString44 = null;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "I")
	public static int anInt4857 = 0;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "J")
	public static long aLong148 = 0L;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "([BI)[B")
	public static byte[] method4377(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static394.method2443(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
