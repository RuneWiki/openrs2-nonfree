import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "J")
	public static long aLong183;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public static int anInt7041;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "[Lclient!mh;")
	public static Class199[] aClass199Array1;

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
	public static int anInt7048;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "F")
	public static float aFloat167 = 0.0F;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_162 = new Class332(4);

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
	public static void method5871() {
		for (@Pc(15) Class6_Sub51 local15 = (Class6_Sub51) Static419.aClass275_193.method6366(); local15 != null; local15 = (Class6_Sub51) Static419.aClass275_193.method6364()) {
			if (local15.anInt9529 == -1) {
				local15.anInt9526 = 0;
				if (local15.anInt9518 >= 0 && local15.anInt9513 >= 0 && Static301.anInt4912 > local15.anInt9518 && local15.anInt9513 < Static473.anInt7969) {
					Static227.method3327(local15);
				}
			} else {
				local15.method7849();
			}
		}
	}
}
