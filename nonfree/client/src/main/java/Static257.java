import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_47 = new Class181();

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
	public static int[] anIntArray392 = new int[2];

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "S")
	public static short aShort72 = 205;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)V")
	public static void method3834() {
		@Pc(10) Class134 local10 = Static223.aClass134_33;
		synchronized (Static223.aClass134_33) {
			Static223.aClass134_33.method3270(5);
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
	public static void method3837() {
		if (Static53.aClass9_4 == null) {
			return;
		}
		if (Static53.aClass9_4.anInt368 == 1) {
			Static53.aClass9_4 = null;
			return;
		}
		if (Static53.aClass9_4.anInt368 == 2) {
			Static323.method4606(Static209.aString32, Static99.aClass180_2, 2);
			Static53.aClass9_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(CB)Z")
	public static boolean method3838(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
