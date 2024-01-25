import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ps", name = "B", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!ps", name = "C", descriptor = "[Lclient!od;")
	public static Class147[] aClass147Array1;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_36 = new Class107(64);

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_37 = new Class107(64);

	@OriginalMember(owner = "client!ps", name = "A", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
	public static final int[] anIntArray417 = new int[2500];

	@OriginalMember(owner = "client!ps", name = "E", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_127 = new Class140("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!ps", name = "F", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_38 = new Class107(5);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method4557(@OriginalArg(0) Class68 arg0) {
		@Pc(11) Class68 local11 = Static227.method4206(arg0);
		@Pc(17) int local17;
		@Pc(15) int local15;
		if (local11 == null) {
			local15 = Static25.anInt396;
			local17 = Static335.anInt6496;
		} else {
			local17 = local11.anInt1874;
			local15 = local11.anInt1845;
		}
		Static339.method5548(local17, arg0, local15, false);
		Static249.method4404(local17, arg0, local15);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIBI)V")
	public static void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg2) {
			Static77.method1592(arg3, arg1, arg0, arg4);
		} else if (Static108.anInt2266 <= arg4 - arg0 && arg0 + arg4 <= Static205.anInt4504 && arg3 - arg2 >= Static197.anInt4298 && arg2 + arg3 <= Static38.anInt553) {
			Static82.method1678(arg3, arg2, arg1, arg0, arg4);
		} else {
			Static172.method3390(arg1, arg2, arg0, arg3, arg4);
		}
	}
}
