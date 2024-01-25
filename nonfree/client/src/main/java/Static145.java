import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt2733;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array7;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!tl;")
	public static final Class4_Sub30 aClass4_Sub30_3 = new Class4_Sub30(new byte[5000]);

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!jb;B)I")
	public static int method2119(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1) {
		if (!Static55.method1118(arg1).method4451(arg0) && arg1.anObjectArray20 == null) {
			return -1;
		} else if (arg1.anIntArray279 == null || arg0 >= arg1.anIntArray279.length) {
			return -1;
		} else {
			return arg1.anIntArray279[arg0];
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZLclient!hu;ZLjava/lang/String;)V")
	public static void method2120(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class114 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg0) {
			Static277.method3726(3, arg1, arg3);
			return;
		}
		@Pc(24) String local24;
		if (Static159.aString28.startsWith("win") && Static159.anInt3000 != 3) {
			local24 = null;
			if (arg1.anApplet1 != null) {
				local24 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class108 local44 = Static277.method3726(0, arg1, arg3);
				Static29.aClass114_2 = arg1;
				Static78.aClass108_4 = local44;
				Static67.aString19 = arg3;
				return;
			}
		}
		if (Static159.aString28.startsWith("mac")) {
			local24 = null;
			if (arg1.anApplet1 != null) {
				local24 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg2) {
				Static277.method3726(1, arg1, arg3);
				return;
			}
		}
		Static277.method3726(2, arg1, arg3);
	}
}
