import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public static int anInt9914;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_100 = new Class94(51, 3);

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	public static int anInt9912 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZILclient!at;)V")
	public static void method8245(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(20) int local20 = arg1.anInt434 == 0 ? arg1.anInt441 : arg1.anInt434;
		@Pc(29) int local29 = arg1.anInt489 == 0 ? arg1.anInt488 : arg1.anInt489;
		Static17.method366(arg1.anInt510, local20, arg0, local29, Static631.aClass24ArrayArray2[arg1.anInt510 >> 16]);
		if (arg1.aClass24Array1 != null) {
			Static17.method366(arg1.anInt510, local20, arg0, local29, arg1.aClass24Array1);
		}
		@Pc(62) Class2_Sub48 local62 = (Class2_Sub48) Static372.aClass99_51.method3056((long) arg1.anInt510);
		if (local62 != null) {
			Static252.method4677(local29, local62.anInt10125, arg0, local20);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I")
	public static int method8246(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)Z")
	public static boolean method8247(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!at;)V")
	public static void method8248(@OriginalArg(1) Class24 arg0) {
		if (arg0.anInt490 == Static267.anInt5681) {
			Static403.aBooleanArray18[arg0.anInt472] = true;
		}
	}
}
