import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "[Lclient!sp;")
	public static Class28_Sub7[] aClass28_Sub7Array1;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_26 = new Class165(10);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIII)V")
	public static void method3664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class312 local16 = Static654.aClass312ArrayArray1[arg0][arg2];
		Static43.method1106(arg1, local16 == null ? Static245.aClass312_1 : local16);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!or;I)V")
	public static void method3665(@OriginalArg(0) int arg0, @OriginalArg(2) Class260 arg1, @OriginalArg(3) int arg2) {
		Static402.anInt6382 = arg0;
		Static398.anInt6250 = arg2;
		Static329.aClass260_12 = arg1;
	}
}
