import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "Lclient!ic;")
	public static Class113 aClass113_48;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[B")
	public static byte[] method1881(@OriginalArg(1) int arg0) {
		@Pc(20) Class1_Sub3_Sub15 local20 = (Class1_Sub3_Sub15) Static56.aClass240_1.method5015((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(52) int local52 = 255 - local46;
				@Pc(57) int local57 = Static368.method4796(local31, local52);
				@Pc(61) byte local61 = local25[local57];
				local25[local57] = local25[local52];
				local25[local52] = local25[511 - local46] = local61;
			}
			local20 = new Class1_Sub3_Sub15(local25);
			Static56.aClass240_1.method5021(local20, (long) arg0);
		}
		return local20.aByteArray52;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)I")
	public static int method1882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * 57 + arg1;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = local21 * (local21 * 15731 * local21 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIBI)V")
	public static void method1884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(79) int local79 = local25 * ((arg3 << 1) - 3);
		@Pc(85) int local85 = local55;
		@Pc(91) int local91 = (arg3 - 1) * local51;
		Static298.method3891(arg1 + arg4, arg1 + -arg4, Static106.anIntArrayArray46[arg0], arg2);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local85;
					local38 += local63;
					local63 += local55;
					local7++;
					local85 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local85;
				local38 += local63;
				local7++;
				local85 += local55;
				local63 += local55;
			}
			local38 += -local91;
			local47 += -local79;
			local9--;
			local79 -= local51;
			local91 -= local51;
			@Pc(182) int local182 = arg0 - local9;
			@Pc(187) int local187 = arg0 + local9;
			@Pc(191) int local191 = local7 + arg1;
			@Pc(196) int local196 = arg1 - local7;
			Static298.method3891(local191, local196, Static106.anIntArrayArray46[local182], arg2);
			Static298.method3891(local191, local196, Static106.anIntArrayArray46[local187], arg2);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method1885(@OriginalArg(0) Class128 arg0) {
		if (Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 != Static313.anInt5202 && (Static159.aClass82ArrayArrayArray2 != null && Static291.method3807(Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, arg0))) {
			Static313.anInt5202 = Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89;
		}
	}
}
