import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
	public static int anInt9508;

	@OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
	public static int anInt9509 = -2;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "(I)V")
	public static void method7973() {
		Static358.aClass118_34.method2599();
		Static59.aClass75_2.method1567();
		Static471.aClass75_11.method1567();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
	public static void method7974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static221.method3025(arg0)) {
			Static317.method4254(arg1, Static559.aClass261ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(Lclient!ha;I)V")
	public static void method7975(@OriginalArg(0) Class95 arg0) {
		if (Static627.aBoolean736) {
			Static452.method6135(arg0);
		} else {
			Static524.method7272(arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)V")
	public static void method7976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static491.anInt8078 != 1) {
			return;
		}
		@Pc(13) int local13 = arg2 / Static281.anInt4510;
		@Pc(17) int local17 = arg0 / Static281.anInt4510;
		@Pc(21) int local21 = arg3 / Static598.anInt9689;
		@Pc(25) int local25 = arg1 / Static598.anInt9689;
		if (local13 >= Static176.anInt3100 || local17 < 0 || Static174.anInt3080 <= local21 || local25 < 0) {
			return;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (Static176.anInt3100 <= local17) {
			local17 = Static176.anInt3100 - 1;
		}
		if (local25 >= Static174.anInt3080) {
			local25 = Static174.anInt3080 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		for (@Pc(78) int local78 = local21; local78 <= local25; local78++) {
			@Pc(89) int local89 = Static236.method3208(local78 + Static233.anInt3794, Static174.anInt3080) * Static176.anInt3100;
			for (@Pc(91) int local91 = local13; local91 <= local17; local91++) {
				@Pc(102) int local102 = Static236.method3208(local91 + Static472.anInt7535, Static176.anInt3100) + local89;
				Static70.anIntArray93[local102] = Static613.anInt9883;
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[BII)V")
	public static void method7977(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg0) {
			return;
		}
		arg3 += arg2;
		@Pc(24) int local24 = arg0 - arg2 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg0 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg3 = local39 + 1;
			arg1[local39] = 1;
		}
	}
}
