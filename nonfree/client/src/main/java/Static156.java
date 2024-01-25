import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt3123;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public static int anInt3125;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_54 = new Class66(8);

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public static int anInt3126 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!jf;Lclient!en;)V")
	public static void method2909(@OriginalArg(1) Class96 arg0, @OriginalArg(2) Class59 arg1) {
		Static54.method1180(0, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public static void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static267.anIntArrayArray40 != null) {
			Static267.anIntArrayArray40[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
