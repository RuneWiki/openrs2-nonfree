import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!r", name = "A", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "I")
	public static int anInt2375;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1114 = Static56.method816("blaugr-Un:");

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	public static volatile int anInt2370 = 0;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1115 = Static56.method816("::rect_debug");

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	public static void method1472() {
		aClass34_1115 = null;
		anIntArray327 = null;
		aClass34_1114 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public static void method1473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class8_Sub22 local12 = (Class8_Sub22) Static64.aClass7_14.method45((long) arg3);
		if (local12 == null) {
			local12 = new Class8_Sub22();
			Static64.aClass7_14.method48(local12, (long) arg3);
		}
		if (arg0 >= local12.anIntArray397.length) {
			@Pc(38) int[] local38 = new int[arg0 + 1];
			@Pc(43) int[] local43 = new int[arg0 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray397.length; local45++) {
				local43[local45] = local12.anIntArray397[local45];
				local38[local45] = local12.anIntArray396[local45];
			}
			for (@Pc(71) int local71 = local12.anIntArray397.length; local71 < arg0; local71++) {
				local43[local71] = -1;
				local38[local71] = 0;
			}
			local12.anIntArray396 = local38;
			local12.anIntArray397 = local43;
		}
		local12.anIntArray397[arg0] = arg1;
		local12.anIntArray396[arg0] = arg2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!dd;Lclient!dd;)V")
	public static void method1474(@OriginalArg(1) Class14 arg0, @OriginalArg(2) Class14 arg1) {
		Static42.aClass14_16 = arg1;
		Static4.aClass14_1 = arg0;
	}
}
