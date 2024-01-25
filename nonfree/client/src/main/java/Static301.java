import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
	public static int anInt5240 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method4119(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static90.method1429(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(44) int local44 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(47) int local47;
			do {
				local47 = arg0.nextInt();
			} while (local44 <= local47);
			return Static428.method5664(local47, arg1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!fq;IILclient!l;I)Lclient!za;")
	public static Class34 method4120(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) int arg4) {
		return new Class34_Sub2(arg4, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IZ)V")
	public static void method4121(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static167.aClass1_Sub5_Sub18_2 != null) {
			Static140.anInt2479 = Static167.aClass1_Sub5_Sub18_2.anInt6637;
		} else {
			Static140.anInt2479 = -1;
		}
		Static103.aClass227_8 = null;
		Static167.aClass1_Sub5_Sub18_2 = null;
		Static253.aClass124_7 = null;
		Static442.anInt7365 = 0;
		Static167.method1755();
		Static167.aClass227_15.method4981();
		Static2.aClass88_1 = null;
		Static189.aClass6_33 = null;
		Static380.aClass88_8 = null;
		Static151.aClass88_3 = null;
		Static289.aClass88_6 = null;
		Static167.aClass100_3 = null;
		Static78.anInt3523 = -1;
		Static199.aClass88_4 = null;
		Static201.aClass88_5 = null;
		Static71.aClass88_2 = null;
		Static350.aClass88_7 = null;
		Static222.anInt3998 = -1;
		Static167.aClass178_2.method3961();
		Static167.aClass263_2.method5829(64, 64);
		Static167.aClass178_2.method3967(64, 128);
		Static167.aClass75_3.method1614(64);
		Static82.aClass105_4.method2288(64);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
	public static void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static272.method3804(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(48) int[] local48 = Static67.anIntArrayArray13[arg4];
		@Pc(53) int local53 = arg5 - local15;
		@Pc(57) int local57 = local15 + arg5;
		Static2.method38(local53, arg2, local48, arg5 - arg0);
		Static2.method38(local57, arg3, local48, local53);
		Static2.method38(arg5 + arg0, arg2, local48, local57);
		while (local10 < local21) {
			local33 += 2;
			local31 += 2;
			local24 += local31;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				Static236.anIntArray278[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(140) int[] local140;
			@Pc(147) int[] local147;
			@Pc(151) int local151;
			@Pc(155) int local155;
			@Pc(160) int local160;
			@Pc(164) int local164;
			@Pc(169) int local169;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 < local15) {
					local140 = Static67.anIntArrayArray13[arg4 + local21];
					local147 = Static67.anIntArrayArray13[arg4 - local21];
					local151 = Static236.anIntArray278[local21];
					local155 = local10 + arg5;
					local160 = arg5 - local10;
					local164 = arg5 + local151;
					local169 = arg5 - local151;
					Static2.method38(local169, arg2, local140, local160);
					Static2.method38(local164, arg3, local140, local169);
					Static2.method38(local155, arg2, local140, local164);
					Static2.method38(local169, arg2, local147, local160);
					Static2.method38(local164, arg3, local147, local169);
					Static2.method38(local155, arg2, local147, local164);
				} else {
					local140 = Static67.anIntArrayArray13[local21 + arg4];
					local147 = Static67.anIntArrayArray13[arg4 - local21];
					local151 = local10 + arg5;
					local155 = arg5 - local10;
					Static2.method38(local151, arg2, local140, local155);
					Static2.method38(local151, arg2, local147, local155);
				}
			}
			local140 = Static67.anIntArrayArray13[local10 + arg4];
			local147 = Static67.anIntArrayArray13[arg4 - local10];
			local151 = local21 + arg5;
			local155 = arg5 - local21;
			if (local10 < local15) {
				local160 = local10 <= local26 ? local26 : Static236.anIntArray278[local10];
				local164 = local160 + arg5;
				local169 = arg5 - local160;
				Static2.method38(local169, arg2, local140, local155);
				Static2.method38(local164, arg3, local140, local169);
				Static2.method38(local151, arg2, local140, local164);
				Static2.method38(local169, arg2, local147, local155);
				Static2.method38(local164, arg3, local147, local169);
				Static2.method38(local151, arg2, local147, local164);
			} else {
				Static2.method38(local151, arg2, local140, local155);
				Static2.method38(local151, arg2, local147, local155);
			}
		}
	}
}
