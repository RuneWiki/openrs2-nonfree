import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_10 = new Class288(100, 2);

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "[I")
	public static final int[] anIntArray31 = new int[25];

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
	public static int anInt93 = 0;

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	public static int anInt95 = -1;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Lclient!bc;")
	public static Class25 method109(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static296.aClass25Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	public static void method110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static54.method261(local7.aClass13_Sub1_Sub2_1);
			if (local7.aClass13_Sub1_Sub2_1 != null) {
				local7.aClass13_Sub1_Sub2_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(JB)V")
	public static void method111(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static319.anInt5080;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (Static203.anInt3426 != local11) {
			local18 = local11 - Static203.anInt3426;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local18 < local26) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local18 > local26) {
				local26 = local18;
			}
			Static203.anInt3426 += local26;
		}
		@Pc(65) int local65 = Static418.anInt6556;
		Static440.aFloat144 += (float) arg0 * Static257.aFloat69 / 40.0F * 8.0F;
		Static339.aFloat100 += Static16.aFloat3 * (float) arg0 / 40.0F * 8.0F;
		if (local65 != Static263.anInt4236) {
			local18 = local65 - Static263.anInt4236;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local18 < local26) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Static263.anInt4236 += local26;
		}
		Static222.method3034();
	}
}
