import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "Lclient!oh;")
	public static Class237 aClass237_116;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
	public static int anInt8582 = 0;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_114 = new Class71(13, -1);

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIZIB[Lclient!tp;)V")
	public static void method7069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class331[] arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg4.length; local11++) {
			@Pc(17) Class331 local17 = arg4[local11];
			if (local17 != null && arg3 == local17.anInt9509) {
				Static615.method8357(arg2, arg0, arg1, local17);
				Static227.method4239(local17, arg1, arg0);
				if (local17.anInt9501 > local17.anInt9525 - local17.anInt9553) {
					local17.anInt9501 = local17.anInt9525 - local17.anInt9553;
				}
				if (local17.anInt9575 - local17.anInt9505 < local17.anInt9503) {
					local17.anInt9503 = local17.anInt9575 - local17.anInt9505;
				}
				if (local17.anInt9501 < 0) {
					local17.anInt9501 = 0;
				}
				if (local17.anInt9503 < 0) {
					local17.anInt9503 = 0;
				}
				if (local17.anInt9490 == 0) {
					Static279.method4732(arg2, local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)V")
	public static void method7070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static260.method4580(local7.aClass15_Sub1_Sub5_1);
		Static260.method4580(local7.aClass15_Sub1_Sub5_2);
		if (local7.aClass15_Sub1_Sub5_1 != null) {
			local7.aClass15_Sub1_Sub5_1 = null;
		}
		if (local7.aClass15_Sub1_Sub5_2 != null) {
			local7.aClass15_Sub1_Sub5_2 = null;
		}
	}
}
