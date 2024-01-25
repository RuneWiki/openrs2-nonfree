import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt69;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[B")
	public static final byte[] aByteArray1 = new byte[2048];

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!ap;")
	public static final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_3 = new Class91(64);

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	public static int anInt68 = 16777215;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!lu;")
	public static Class74 method55() {
		try {
			return new Class74_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class74) Class.forName("Class74_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class74_Sub1();
			}
		}
	}
}
