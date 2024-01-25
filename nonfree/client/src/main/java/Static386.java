import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static int anInt6607;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Lclient!el;")
	public static final Class109 aClass109_137 = new Class109(30, 1);

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_68 = new Class387(67, -1);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIIZ)V")
	public static void method5632(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static404.method5928(0, arg0, arg2, Static92.aClass180_Sub1Array1.length - 1, arg3, arg1);
		Static45.aClass5_Sub7_4 = null;
		Static338.anInt6022 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method5633() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static268.aClass12Array1[local12] = null;
		}
		Static415.anInt9653 = 0;
	}
}
