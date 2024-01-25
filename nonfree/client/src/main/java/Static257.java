import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_150 = new Class288(10, -2);

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "F")
	public static float aFloat69 = 0.0F;

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_25 = new Class118(16);

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
	public static int anInt4066 = -1;

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
	public static int anInt4067 = 0;

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
	public static int anInt4068 = 0;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIB[Lclient!paa;IZ)V")
	public static void method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class261[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) Class261 local18 = arg2[local12];
			if (local18 != null && local18.anInt6631 == arg3) {
				Static640.method8599(arg0, arg4, local18, arg1);
				Static445.method6067(arg0, arg1, local18);
				if (local18.anInt6598 > local18.anInt6665 - local18.anInt6595) {
					local18.anInt6598 = local18.anInt6665 - local18.anInt6595;
				}
				if (local18.anInt6598 < 0) {
					local18.anInt6598 = 0;
				}
				if (local18.anInt6624 > local18.anInt6617 - local18.anInt6622) {
					local18.anInt6624 = local18.anInt6617 - local18.anInt6622;
				}
				if (local18.anInt6624 < 0) {
					local18.anInt6624 = 0;
				}
				if (local18.anInt6635 == 0) {
					Static338.method4549(arg4, local18);
				}
			}
		}
	}
}
