import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_9 = new Class212(20, 6);

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
	public static final int[] anIntArray60 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLclient!wn;)Lclient!el;")
	public static Class31_Sub2 method927(@OriginalArg(1) Class4_Sub20 arg0) {
		return new Class31_Sub2(arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4586(), arg0.method4582(), arg0.method4614());
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)Z")
	public static boolean method928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static275.method4382(arg0, arg1)) {
			return Static151.method2806(arg0, arg1) | (arg1 & 0xB000) != 0 | Static395.method5585(arg0, arg1) ? true : (Static244.method4059(arg0, arg1) | Static24.method366(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;ZLclient!ul;ZI)V")
	public static void method930(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Static183.method3349(3, arg2, arg0);
			return;
		}
		@Pc(21) String local21;
		if (Static419.aString74.startsWith("win") && Static419.anInt7272 != 3) {
			local21 = null;
			if (arg2.anApplet1 != null) {
				local21 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local21 == null || !local21.equals("1")) {
				@Pc(41) Class87 local41 = Static183.method3349(0, arg2, arg0);
				Static275.aClass255_4 = arg2;
				Static215.aString40 = arg0;
				Static121.aClass87_9 = local41;
				return;
			}
		}
		if (Static419.aString74.startsWith("mac")) {
			local21 = null;
			if (arg2.anApplet1 != null) {
				local21 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local21 != null && local21.equals("1") && arg3) {
				Static183.method3349(1, arg2, arg0);
				return;
			}
		}
		Static183.method3349(2, arg2, arg0);
	}
}
