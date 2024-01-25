import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public static int anInt6742;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Lclient!oa;")
	public static Class65 aClass65_6;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_225 = new Class92(15, -1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJ)V")
	public static void method5289(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static222.anInt4311;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local7 != Static288.anInt5279) {
			local19 = local7 - Static288.anInt5279;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local27 > local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static288.anInt5279 += local27;
		}
		@Pc(59) int local59 = Static358.anInt5918;
		if (!Static123.aClass21_Sub1_1.aBoolean72) {
			Static235.aFloat60 += (float) arg0 * Static393.aFloat92 / 40.0F * 8.0F;
			Static265.aFloat64 += (float) arg0 * Static15.aFloat3 / 40.0F * 8.0F;
		}
		if (Static334.anInt6158 != local59) {
			local19 = local59 - Static334.anInt6158;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local27 < local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local27 > local19) {
				local27 = local19;
			}
			Static334.anInt6158 += local27;
		}
		Static338.method1150();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method5290(@OriginalArg(1) Class75 arg0) {
		if (Static378.aBoolean462) {
			Static445.method5915(arg0);
		} else {
			Static142.method2551(arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Lclient!nm;")
	public static Class1_Sub5 method5292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub5_2;
	}
}
