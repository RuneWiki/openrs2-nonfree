import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	public static int anInt9039;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Lclient!jo;")
	public static Class168 aClass168_118;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_163 = new Class254(18, 3);

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray22 = new int[2][][];

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Lclient!sda;")
	public static Class146 method7587() {
		try {
			return (Class146) Class.forName("Class146_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z")
	public static boolean method7588(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
