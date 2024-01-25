import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
	public static int anInt2096;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V")
	public static void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg0 << 1) - 3);
		@Pc(76) int local76 = local54;
		Static367.method5559(-7, arg1 - arg2, arg4, Static36.anIntArrayArray4[arg3], arg2 + arg1);
		@Pc(97) int local97 = (arg0 - 1) * local50;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local62;
					local46 += local76;
					local62 += local54;
					local7++;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local76;
				local76 += local54;
				local62 += local54;
				local7++;
			}
			local38 += -local97;
			local46 += -local70;
			local97 -= local50;
			local9--;
			local70 -= local50;
			@Pc(177) int local177 = arg3 - local9;
			@Pc(182) int local182 = arg3 + local9;
			@Pc(186) int local186 = arg1 + local7;
			@Pc(191) int local191 = arg1 - local7;
			Static367.method5559(-7, local191, arg4, Static36.anIntArrayArray4[local177], local186);
			Static367.method5559(-7, local191, arg4, Static36.anIntArrayArray4[local182], local186);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!qo;)V")
	public static void method2018(@OriginalArg(1) Class60_Sub1_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class60_Sub1_Sub1_Sub3_Sub2) {
			@Pc(9) Class60_Sub1_Sub1_Sub3_Sub2 local9 = (Class60_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local9.aClass294_1 != null) {
				Static4.method27(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 != local9.aByte135, local9);
			}
		} else if (arg0 instanceof Class60_Sub1_Sub1_Sub3_Sub1) {
			@Pc(40) Class60_Sub1_Sub1_Sub3_Sub1 local40 = (Class60_Sub1_Sub1_Sub3_Sub1) arg0;
			Static288.method4729(local40, local40.aByte135 != Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[B")
	public static byte[] method2020(@OriginalArg(0) int arg0) {
		@Pc(18) Class6_Sub2_Sub19 local18 = (Class6_Sub2_Sub19) Static518.aClass379_5.method8729((long) arg0);
		if (local18 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(56) int local56 = 255 - local48;
				@Pc(61) int local61 = Static196.method3692(local29, local56);
				@Pc(65) byte local65 = local23[local61];
				local23[local61] = local23[local56];
				local23[local56] = local23[511 - local48] = local65;
			}
			local18 = new Class6_Sub2_Sub19(local23);
			Static518.aClass379_5.method8733((long) arg0, local18);
		}
		return local18.aByteArray102;
	}
}
