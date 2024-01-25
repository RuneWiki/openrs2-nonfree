import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public static int anInt9328;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "Lclient!bfa;")
	public static Class6_Sub7 aClass6_Sub7_8;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame9;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V")
	public static void method7617() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static388.aBooleanArray18[local3] = false;
		}
		Static38.anInt1413 = 0;
		Static458.anInt8218 = 0;
		Static554.anInt9497 = 1;
		Static627.anInt10536 = -1;
		Static594.anInt10048 = -1;
		Static214.anInt4587 = -1;
		Static268.anInt5777 = -1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIBII)V")
	public static void method7620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = local13 << 1;
		@Pc(37) int local37 = arg4 << 1;
		@Pc(46) int local46 = local13 * (1 - local37) + local29;
		@Pc(55) int local55 = local17 - local33 * (local37 - 1);
		@Pc(59) int local59 = local13 << 2;
		@Pc(63) int local63 = local17 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = local33 * ((arg4 << 1) - 3);
		@Pc(85) int local85 = local63;
		Static571.method7990(arg2, Static173.anIntArrayArray15[arg0], arg3 - arg1, arg3 + arg1);
		@Pc(104) int local104 = local59 * (arg4 - 1);
		while (local9 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local46 += local71;
					local55 += local85;
					local7++;
					local85 += local63;
					local71 += local63;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local46 += local71;
				local71 += local63;
				local7++;
				local85 += local63;
			}
			local46 += -local104;
			local55 += -local79;
			local79 -= local59;
			local9--;
			local104 -= local59;
			@Pc(175) int local175 = arg0 - local9;
			@Pc(179) int local179 = local9 + arg0;
			@Pc(184) int local184 = arg3 + local7;
			@Pc(188) int local188 = arg3 - local7;
			Static571.method7990(arg2, Static173.anIntArrayArray15[local175], local188, local184);
			Static571.method7990(arg2, Static173.anIntArrayArray15[local179], local188, local184);
		}
	}
}
