import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_19 = new Class387(10, 2, 2, 0);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(JZ)V")
	public static void method6990(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static140.anInt2658;
		@Pc(9) int local9 = Static276.anInt5174;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (local7 != Static429.anInt7552) {
			local21 = local7 - Static429.anInt7552;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local29 > local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local29 < local21) {
				local29 = local21;
			}
			Static429.anInt7552 += local29;
		}
		Static204.aFloat82 += Static112.aFloat74 * (float) arg0 / 40.0F * 8.0F;
		Static461.aFloat178 += (float) arg0 * Static554.aFloat185 / 40.0F * 8.0F;
		if (local9 != Static647.anInt9959) {
			local21 = local9 - Static647.anInt9959;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local21 > local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static647.anInt9959 += local29;
		}
		Static99.method1965();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIZLclient!gj;Lclient!pt;I)V")
	public static void method6992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class143 arg2, @OriginalArg(5) Class3_Sub9_Sub5 arg3) {
		Static507.method7179(arg1, arg2, arg0);
		Static424.aClass3_Sub9_Sub5_3 = arg3;
	}
}
