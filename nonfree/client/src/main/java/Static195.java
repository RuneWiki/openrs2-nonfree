import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public static int anInt4329 = -1;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1250 = Static81.method1507("Choose Option");

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1249 = aClass24_1250;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)J")
	public static long method3315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass19_1 == null ? 0L : local7.aClass19_1.aLong26;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lclient!h;")
	public static Class39 method3318() {
		try {
			return (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
