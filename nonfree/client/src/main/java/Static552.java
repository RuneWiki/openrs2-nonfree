import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!ria", name = "m", descriptor = "I")
	public static int anInt9234;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "Lclient!jr;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
	public static int anInt9237;

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "Lclient!uj;")
	public static final Class371 aClass371_10 = new Class371("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "[I")
	public static final int[] anIntArray508 = new int[1];

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_156 = new Class186(27, -2);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)V")
	public static void method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static433.method6363(local7.aClass19_Sub1_Sub1_2);
		Static433.method6363(local7.aClass19_Sub1_Sub1_1);
		if (local7.aClass19_Sub1_Sub1_2 != null) {
			local7.aClass19_Sub1_Sub1_2 = null;
		}
		if (local7.aClass19_Sub1_Sub1_1 != null) {
			local7.aClass19_Sub1_Sub1_1 = null;
		}
	}
}
