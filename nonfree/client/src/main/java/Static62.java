import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static62 {

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "Lclient!bg;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	public static int anInt1684 = 0;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "Lclient!gg;")
	public static Class28 aClass28_957 = Static107.method1838(" ");

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "[Lclient!bc;")
	public static Class5[] aClass5Array1 = new Class5[16];

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "J")
	public static volatile long aLong58 = 0L;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	public static void method1120() {
		aClass8_1 = null;
		aClass5Array1 = null;
		aClass28_957 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([BZI)I")
	public static int method1130(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static168.method2642(arg0, 0, arg1);
	}
}
