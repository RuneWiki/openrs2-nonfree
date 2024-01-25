import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mda", name = "L", descriptor = "Lclient!rba;")
	public static Class292 aClass292_3;

	@OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
	public static int anInt5430 = 0;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "Lclient!efa;")
	public static final Class90 aClass90_16 = new Class90(512);

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method4695(@OriginalArg(0) Class162 arg0) {
		Static585.aClass345Array1 = new Class345[Static48.anIntArray101.length];
		for (@Pc(11) int local11 = 0; local11 < Static48.anIntArray101.length; local11++) {
			@Pc(17) int local17 = Static48.anIntArray101[local11];
			@Pc(22) Class112 local22 = Static308.method4410(Static37.aClass229_9, local17);
			@Pc(30) Class37 local30 = arg0.method6864(local22, Static603.method7126(Static212.aClass229_48, local17));
			Static585.aClass345Array1[local11] = new Class345(local30, local22);
		}
	}
}
