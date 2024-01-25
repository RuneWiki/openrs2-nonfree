import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "[I")
	public static final int[] anIntArray3 = new int[2];

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "Lclient!qe;")
	public static final Class269 aClass269_1 = new Class269();

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
	public static int anInt44 = 0;

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_1 = new Class95(5, 1);

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
	public static int anInt45 = 0;

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
	public static int anInt46 = 0;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)Lclient!iq;")
	public static Class25_Sub2_Sub3 method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub2_Sub3_1;
	}
}
