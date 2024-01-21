import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!md;")
	public static Class54 aClass54_5;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
	public static int[] anIntArray128 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	public static int anInt1372 = 0;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "[S")
	public static short[] aShortArray5 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method995(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static147.aBoolean142) {
			try {
				@Pc(20) Class15 local20 = (Class15) Class.forName("Class15_Sub1").getDeclaredConstructor().newInstance();
				local20.method2164(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static147.aBoolean142 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method998() {
		aShortArray5 = null;
		anIntArray128 = null;
		aClass54_5 = null;
	}
}
