import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
	public static int anInt5372;

	@OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
	public static int anInt5374;

	@OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
	public static int anInt5375;

	@OriginalMember(owner = "client!pk", name = "eb", descriptor = "I")
	public static int anInt5377;

	@OriginalMember(owner = "client!pk", name = "W", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_196 = new Class103(65, 7);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!l;Lclient!fo;Z)V")
	public static void method4216(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Class82 arg1) {
		Static140.aClass82_37 = arg1;
		Static419.anInterface6_7 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class27 local13 = local7.aClass27_3; local13 != null; local13 = local13.aClass27_1) {
			@Pc(17) Class25_Sub5 local17 = local13.aClass25_Sub5_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort97 == arg1 && local17.aShort94 == arg2) {
				Static72.method1149(local17);
				return;
			}
		}
	}
}
