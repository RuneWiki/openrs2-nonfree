import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "Lclient!b;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
	public static int anInt109;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Lclient!us;")
	public static final Class234 aClass234_1 = new Class234(28, 8);

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
	public static int anInt110 = -1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIIIII)V")
	public static void method82(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg1 << 1;
		@Pc(47) int local47 = local21 * (1 - local37) + local29;
		@Pc(55) int local55 = local25 - (local37 - 1) * local33;
		@Pc(59) int local59 = local21 << 2;
		@Pc(63) int local63 = local25 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = ((arg1 << 1) - 3) * local33;
		@Pc(85) int local85 = local63;
		Static349.method5265(arg3 - arg0, arg0 + arg3, arg4, Static325.anIntArrayArray50[arg2]);
		@Pc(104) int local104 = (arg1 - 1) * local59;
		while (local9 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local55 += local85;
					local47 += local71;
					local71 += local63;
					local85 += local63;
					local7++;
				}
			}
			if (local55 < 0) {
				local47 += local71;
				local55 += local85;
				local7++;
				local71 += local63;
				local85 += local63;
			}
			local47 += -local104;
			local55 += -local79;
			local79 -= local59;
			local104 -= local59;
			local9--;
			@Pc(177) int local177 = arg2 - local9;
			@Pc(181) int local181 = arg2 + local9;
			@Pc(185) int local185 = local7 + arg3;
			@Pc(190) int local190 = arg3 - local7;
			Static349.method5265(local190, local185, arg4, Static325.anIntArrayArray50[local177]);
			Static349.method5265(local190, local185, arg4, Static325.anIntArrayArray50[local181]);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!np;ILclient!dq;II)V")
	public static void method83(@OriginalArg(1) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) Class143 local14 = Static319.aClass24_4.method317(arg2.anInt1380);
		if (local14.anInt3541 == -1) {
			return;
		}
		if (arg2.aBoolean89) {
			@Pc(28) int local28 = arg1 + arg2.anInt1395;
			arg1 = local28 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(44) Class110 local44 = local14.method3105(arg1, arg2.aBoolean85, arg0);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg2.anInt1390;
		@Pc(53) int local53 = arg2.anInt1427;
		if ((arg1 & 0x1) == 1) {
			local53 = arg2.anInt1390;
			local50 = arg2.anInt1427;
		}
		@Pc(69) int local69 = local44.method5101();
		@Pc(72) int local72 = local44.method5097();
		if (local14.aBoolean257) {
			local69 = local50 * 4;
			local72 = local53 * 4;
		}
		if (local14.anInt3545 == 0) {
			local44.method5102(arg3, arg4 - (local53 - 1) * 4, local69, local72);
		} else {
			local44.method5103(arg3, arg4 + 4 - local53 * 4, local69, local72, 1, local14.anInt3545 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!nm;B)Lclient!d;")
	public static Class50 method84(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub1 arg1) {
		@Pc(12) Class50 local12;
		if (Static121.aClass50_3 == null) {
			local12 = new Class50();
		} else {
			local12 = Static121.aClass50_3;
			Static121.aClass50_3 = Static121.aClass50_3.aClass50_2;
			local12.aClass50_2 = null;
			Static390.anInt6088--;
		}
		local12.anInt1127 = arg0;
		local12.aClass28_Sub1_1 = arg1;
		return local12;
	}
}
