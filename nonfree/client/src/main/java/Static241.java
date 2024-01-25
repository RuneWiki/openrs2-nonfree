import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_95 = new Class129(1, 2);

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public static int anInt3924 = 0;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	public static int anInt3926 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public static void method3137() {
		Static34.aClass76ArrayArray1 = new Class76[Static149.aClass243_88.method5478()][];
		Static184.aClass76ArrayArray2 = new Class76[Static149.aClass243_88.method5478()][];
		Static371.aBooleanArray22 = new boolean[Static149.aClass243_88.method5478()];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!za;Lclient!nv;II)V")
	public static void method3138(@OriginalArg(1) Class200 arg0, @OriginalArg(2) Class177 arg1) {
		Static382.aClass177_35.method3614();
		if (Static368.aBoolean401) {
			return;
		}
		for (@Pc(20) Class5_Sub8 local20 = (Class5_Sub8) arg1.method3618(); local20 != null; local20 = (Class5_Sub8) arg1.method3619()) {
			@Pc(28) Class6 local28 = Static98.aClass28_3.method670(local20.anInt953);
			if (Static396.method5142(local28)) {
				@Pc(40) boolean local40 = Static120.method1710(arg0, local28, local20);
				if (local40) {
					Static223.method2945(local28, local20, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZIIIZ)Lclient!ur;")
	public static Class5_Sub44 method3140(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class5_Sub44 local12 = new Class5_Sub44();
		local12.anInt6981 = arg1;
		local12.anInt6979 = arg2;
		Static151.aClass252_42.method5658(local12, (long) arg3);
		Static68.method1036(arg1);
		@Pc(31) Class76 local31 = Static213.method2817(arg3);
		if (local31 != null) {
			Static53.method833(local31);
		}
		if (Static192.aClass76_9 != null) {
			Static53.method833(Static192.aClass76_9);
			Static192.aClass76_9 = null;
		}
		Static167.method2333();
		if (local31 != null) {
			Static125.method1758(!arg0, local31);
		}
		if (!arg0) {
			Static181.method2474(arg1);
		}
		if (!arg0 && Static199.anInt3319 != -1) {
			Static391.method5105(Static199.anInt3319, 1);
		}
		return local12;
	}
}
