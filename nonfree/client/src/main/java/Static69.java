import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "Lclient!tp;")
	public static Class331 aClass331_12;

	@OriginalMember(owner = "client!cha", name = "d", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
	public static int anInt7729;

	@OriginalMember(owner = "client!cha", name = "i", descriptor = "I")
	public static int anInt7730;

	@OriginalMember(owner = "client!cha", name = "l", descriptor = "Lclient!oh;")
	public static Class237 aClass237_107;

	@OriginalMember(owner = "client!cha", name = "e", descriptor = "Z")
	public static boolean aBoolean557 = false;

	@OriginalMember(owner = "client!cha", name = "g", descriptor = "Z")
	public static boolean aBoolean558 = true;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IB)V")
	public static void method6415(@OriginalArg(0) int arg0) {
		@Pc(15) Class8_Sub5_Sub8 local15 = Static509.method7344(2, arg0);
		local15.method3512();
	}

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "(IB)Z")
	public static boolean method6418(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
