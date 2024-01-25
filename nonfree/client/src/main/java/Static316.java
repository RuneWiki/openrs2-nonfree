import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	public static int anInt5454;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_44 = new Class102(8);

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "[I")
	public static final int[] anIntArray368 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;")
	public static Object method4271(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static20.aBoolean552) {
			try {
				@Pc(23) Class15 local23 = (Class15) Class.forName("Class15_Sub1").getDeclaredConstructor().newInstance();
				local23.method3814(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static20.aBoolean552 = true;
			}
		}
		return arg0;
	}
}
