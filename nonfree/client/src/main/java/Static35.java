import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "Lclient!gda;")
	public static Class126 aClass126_20;

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
	public static int anInt522 = -1;

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
	public static int anInt525 = 0;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "[Lclient!tf;")
	public static final Class222_Sub1[] aClass222_Sub1Array1 = new Class222_Sub1[37];

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/awt/Frame;Lclient!tga;)V")
	public static void method561(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class349 arg1) {
		while (true) {
			@Pc(11) Class361 local11 = arg1.method7738(arg0);
			while (local11.anInt9720 == 0) {
				Static620.method7045(-4, 10L);
			}
			if (local11.anInt9720 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static620.method7045(-4, 100L);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIII)V")
	public static void method562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(57) int local57 = local13 << 2;
		@Pc(61) int local61 = local17 << 2;
		@Pc(69) int local69 = local21 * 3;
		@Pc(77) int local77 = ((arg4 << 1) - 3) * local25;
		@Pc(83) int local83 = local61;
		@Pc(103) int local103;
		@Pc(114) int local114;
		if (Static573.anInt8986 <= arg1 && Static319.anInt5445 >= arg1) {
			local103 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg0 + arg3);
			local114 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg3 - arg0);
			Static161.method2977(local114, arg2, local103, Static120.anIntArrayArray18[arg1], -117);
		}
		@Pc(130) int local130 = local57 * (arg4 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local83;
					local38 += local69;
					local83 += local61;
					local7++;
					local69 += local61;
				}
			}
			if (local46 < 0) {
				local46 += local83;
				local38 += local69;
				local7++;
				local69 += local61;
				local83 += local61;
			}
			local46 += -local77;
			local38 += -local130;
			local77 -= local57;
			local9--;
			local130 -= local57;
			local103 = arg1 - local9;
			local114 = arg1 + local9;
			if (Static573.anInt8986 <= local114 && Static319.anInt5445 >= local103) {
				@Pc(237) int local237 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg3 + local7);
				@Pc(248) int local248 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg3 - local7);
				if (local103 >= Static573.anInt8986) {
					Static161.method2977(local248, arg2, local237, Static120.anIntArrayArray18[local103], -109);
				}
				if (local114 <= Static319.anInt5445) {
					Static161.method2977(local248, arg2, local237, Static120.anIntArrayArray18[local114], -124);
				}
			}
		}
	}
}
