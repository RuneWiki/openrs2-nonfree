import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public static int anInt7562;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_189 = new Class131(74, 16);

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
	public static final int[] anIntArray661 = new int[4];

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IC)Z")
	public static boolean method5864(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method5866() {
		if (Static210.anInt3860 != 3) {
			Static193.anInt1052 = -1;
		}
	}
}
