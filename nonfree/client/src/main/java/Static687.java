import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "Lclient!pp;")
	public static Class6_Sub44 aClass6_Sub44_33;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
	public static int anInt9943 = 0;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "Z")
	public static boolean aBoolean733 = false;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V")
	public static void method8624(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(51) int local51 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg3; local53 < arg1; local53++) {
			if (arg2[local53] < local16 + (long) (local53 & local51)) {
				@Pc(76) long local76 = arg2[local53];
				arg2[local53] = arg2[local12];
				arg2[local12] = local76;
				@Pc(90) Object local90 = arg0[local53];
				arg0[local53] = arg0[local12];
				arg0[local12++] = local90;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg0[arg1] = arg0[local12];
		arg0[local12] = local30;
		method8624(arg0, local12 - 1, arg2, arg3);
		method8624(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!rfa;IIIII)V")
	public static void method8625(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static66.anInt802) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static230.anInt4470) {
						for (@Pc(35) int local35 = local11; local35 <= local15; local35++) {
							if (local35 >= 0 && local35 < Static63.anInt777 && (!local1 || local23 >= local7 || local35 >= local15 || local35 < arg3 && local23 != arg2)) {
								@Pc(77) Class243 local77 = Static334.aClass243ArrayArrayArray2[local17][local23][local35];
								if (local77 != null) {
									@Pc(163) int local163 = (Static555.aClass96Array3[local17].method8080(local23, local35) + Static555.aClass96Array3[local17].method8080(local23 + 1, local35) + Static555.aClass96Array3[local17].method8080(local23, local35 + 1) + Static555.aClass96Array3[local17].method8080(local23 + 1, local35 + 1)) / 4 - (Static555.aClass96Array3[arg1].method8080(arg2, arg3) + Static555.aClass96Array3[arg1].method8080(arg2 + 1, arg3) + Static555.aClass96Array3[arg1].method8080(arg2, arg3 + 1) + Static555.aClass96Array3[arg1].method8080(arg2 + 1, arg3 + 1)) / 4;
									@Pc(166) Class60_Sub1_Sub3 local166 = local77.aClass60_Sub1_Sub3_1;
									@Pc(169) Class60_Sub1_Sub3 local169 = local77.aClass60_Sub1_Sub3_2;
									if (local166 != null && local166.method7914()) {
										arg0.method7915((local35 - arg3) * Static234.anInt4537 + (1 - arg5) * Static430.anInt3928, local163, local166, local1, (local23 - arg2) * Static234.anInt4537 + (1 - arg4) * Static430.anInt3928, Static277.aClass75_7);
									}
									if (local169 != null && local169.method7914()) {
										arg0.method7915((local35 - arg3) * Static234.anInt4537 + (1 - arg5) * Static430.anInt3928, local163, local169, local1, (local23 - arg2) * Static234.anInt4537 + (1 - arg4) * Static430.anInt3928, Static277.aClass75_7);
									}
									for (@Pc(250) Class123 local250 = local77.aClass123_5; local250 != null; local250 = local250.aClass123_1) {
										@Pc(254) Class60_Sub1_Sub1 local254 = local250.aClass60_Sub1_Sub1_1;
										if (local254 != null && local254.method7914() && (local23 == local254.aShort100 || local23 == local3) && (local35 == local254.aShort102 || local35 == local11)) {
											@Pc(294) int local294 = local254.aShort101 + 1 - local254.aShort100;
											@Pc(302) int local302 = local254.aShort99 + 1 - local254.aShort102;
											arg0.method7915((local254.aShort102 - arg3) * Static234.anInt4537 + (local302 - arg5) * Static430.anInt3928, local163, local254, local1, (local254.aShort100 - arg2) * Static234.anInt4537 + (local294 - arg4) * Static430.anInt3928, Static277.aClass75_7);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method8626(@OriginalArg(0) String arg0) {
		return Static241.aHashtable4.containsKey(arg0);
	}
}
