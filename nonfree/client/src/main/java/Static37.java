import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!ec;")
	public static Class58 aClass58_7 = new Class58(128);

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	public static int anInt693 = 3;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method546() {
		Static39.anInt727 = 0;
		Static17.anInt281 = 0;
		Static80.anInt5684 = 0;
		Static261.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static61.method917(Static240.anInt4829, arg4, Static166.anInt3315);
		@Pc(17) int local17 = Static61.method917(Static240.anInt4829, arg0, Static166.anInt3315);
		@Pc(27) int local27 = Static61.method917(Static280.anInt212, arg3, Static346.anInt6607);
		@Pc(33) int local33 = Static61.method917(Static280.anInt212, arg1, Static346.anInt6607);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static224.method5303(Static73.anIntArrayArray6[local35], local33, arg2, local27);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
	public static void method551(@OriginalArg(1) int arg0) {
		if (Static257.method4460(arg0)) {
			Static349.method5642(-1, Static188.aClass137ArrayArray1[arg0]);
		}
	}
}
