import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "Lclient!tca;")
	public static final Class3_Sub46 aClass3_Sub46_1 = new Class3_Sub46(0, 0);

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "J")
	public static long aLong254 = 0L;

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
	public static int anInt8759 = 0;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7295(@OriginalArg(1) String arg0) {
		Static180.method3112(arg0, "", "", 0, 4, "");
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method7296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class38 local13 = local7.aClass38_2; local13 != null; local13 = local13.aClass38_1) {
			@Pc(17) Class41_Sub2_Sub1 local17 = local13.aClass41_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort147 == arg1 && local17.aShort144 == arg2) {
				Static411.method5913(local17, false);
				return;
			}
		}
	}
}
