import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt5123;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!lc;")
	public static Class79 aClass79_35 = new Class79(64);

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
	public static int[] anIntArray445 = new int[64];

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[S")
	public static short[] aShortArray66 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method3914() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static125.aBooleanArray8[local3] = false;
		}
		Static38.anInt1012 = 0;
		Static61.anInt1682 = 1;
		Static10.anInt384 = 0;
		Static187.anInt4200 = -1;
		Static99.anInt2713 = -1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(CI)Z")
	public static boolean method3915(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
