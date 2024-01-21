import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
	public static int anInt3702;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
	public static int anInt3703;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1071 = Static81.method1507("green:");

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1070 = aClass24_1071;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1074 = Static81.method1507("Loading wordpack )2 ");

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1072 = aClass24_1074;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1073 = aClass24_1071;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!dj;ILclient!dj;Lclient!dj;)V")
	public static void method2843(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class24 arg2) {
		Static159.aClass24_1034 = arg1;
		Static159.aClass24_1029 = arg2;
		Static159.aClass24_1033 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public static void method2844() {
		Static94.aClass86_34.method2817();
		Static140.aClass46_4.method1587();
		Static153.aClass46_9.method1587();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIBZ)Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(27) long local27 = ((long) arg1 << 40) + (arg4 ? 137438953472L : 0L) + (long) arg0 + ((long) arg3 << 16) + ((long) arg2 << 38);
		@Pc(35) Class1_Sub2_Sub8_Sub3 local35 = (Class1_Sub2_Sub8_Sub3) Static67.aClass86_24.method2816(local27);
		if (local35 != null) {
			return local35;
		}
		local35 = Static208.method3522(arg2, arg3, arg0, arg1, false, arg4);
		if (local35 != null) {
			Static67.aClass86_24.method2821(local35, local27);
		}
		return local35;
	}
}
