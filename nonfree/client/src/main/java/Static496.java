import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "[Lclient!d;")
	public static Class46[] aClass46Array4;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
	public static int anInt9105;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "Lclient!tg;")
	public static Class307 aClass307_2;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lclient!faa;")
	public static Class97 aClass97_24;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
	public static int anInt9104 = -1;

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
	public static int anInt9106 = 0;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Lclient!di;")
	public static Class74 method7219() {
		try {
			return (Class74) Class.forName("Class74_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}
}
