import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!kda;")
	public static Class6_Sub33 aClass6_Sub33_1;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public static int anInt4972;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_21 = new Class209(32);

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!v;")
	public static final Class362 aClass362_22 = new Class362();

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!ld;")
	public static final Class203 aClass203_2 = new Class203(0);

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!si;")
	public static final Class322 aClass322_4 = new Class322();

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZ)V")
	public static void method4233(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static555.anInt9303;
		@Pc(9) int local9 = Static502.anInt8454;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (Static162.anInt2757 != local7) {
			local20 = local7 - Static162.anInt2757;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 <= 0) {
				if (local28 == 0) {
					local28 = -1;
				} else if (local20 > local28) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = 1;
			} else if (local28 > local20) {
				local28 = local20;
			}
			Static162.anInt2757 += local28;
		}
		Static228.aFloat26 += Static213.aFloat21 * (float) arg0 / 40.0F * 8.0F;
		Static132.aFloat14 += (float) arg0 * Static591.aFloat182 / 40.0F * 8.0F;
		if (local9 != Static674.anInt9799) {
			local20 = local9 - Static674.anInt9799;
			local28 = (int) (arg0 * (long) local20 / 320L);
			if (local20 > 0) {
				if (local28 == 0) {
					local28 = 1;
				} else if (local20 < local28) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = -1;
			} else if (local20 > local28) {
				local28 = local20;
			}
			Static674.anInt9799 += local28;
		}
		Static678.method9178();
	}
}
