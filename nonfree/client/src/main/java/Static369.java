import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[200];

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_157 = new Class381(47, 3);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)Z")
	public static boolean method5503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static648.method8947(arg0, arg1) || Static80.method1328(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static226.method3581(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public static void method5505(@OriginalArg(0) int arg0) {
		Static623.anInt9970 = arg0;
		Static120.anInt1966 = 2;
		Static365.aClass389_9 = Static4.aClass389_17;
		Static357.method5231(true, "", Static446.aString85.equals(""), Static446.aString85);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)Z")
	public static boolean method5506() {
		return Static652.anInt10664 >= 1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!eg;)Lclient!eg;")
	public static Class5_Sub4_Sub2 method5507(@OriginalArg(1) Class5_Sub4_Sub2 arg0) {
		@Pc(21) Class5_Sub4_Sub2 local21 = arg0 == null ? new Class5_Sub4_Sub2() : new Class5_Sub4_Sub2(arg0);
		local21.method1801();
		return local21;
	}
}
