import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array3;

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "Lclient!saa;")
	public static Class3_Sub44 aClass3_Sub44_1;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
	public static int anInt1410;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[I")
	public static final int[] anIntArray105 = new int[1000];

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!fda;")
	public static final Class93 aClass93_4 = new Class93(2);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lclient!io;")
	public static Class59 method1120() {
		try {
			return (Class59) Class.forName("Class59_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
