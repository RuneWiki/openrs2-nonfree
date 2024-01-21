import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
	public static int anInt361;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "Lclient!sd;")
	public static Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
	public static int anInt363 = 1;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	public static int anInt364 = 1;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	public static int anInt365 = 128;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
	public static int anInt366 = 0;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[50][];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	public static void method210() {
		aClass74_1 = null;
		aByteArrayArray2 = null;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)Lclient!m;")
	public static Class52 method211() {
		try {
			return (Class52) Class.forName("Class52_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
