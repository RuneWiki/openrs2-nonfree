import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
	public static int anInt8327;

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "[I")
	public static final int[] anIntArray606 = new int[32];

	@OriginalMember(owner = "client!tca", name = "j", descriptor = "S")
	public static short aShort106 = 32767;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
	public static int anInt8329 = 0;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZIIII)V")
	public static void method6760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static201.method3634(arg4, Static415.anInt9494, Static583.anInt9478);
		@Pc(17) int local17 = Static201.method3634(arg2, Static415.anInt9494, Static583.anInt9478);
		@Pc(23) int local23 = Static201.method3634(arg0, Static461.anInt7899, Static13.anInt7634);
		@Pc(29) int local29 = Static201.method3634(arg3, Static461.anInt7899, Static13.anInt7634);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static208.method3687(local23, arg1, Static454.anIntArrayArray71[local35], local29);
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	public static void method6761() {
		Static585.aClass361_70.method7842();
		Static249.anInt4924 = 0;
	}
}
