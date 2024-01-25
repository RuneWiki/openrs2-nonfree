import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "Lclient!oha;")
	public static Class274 aClass274_2;

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "D")
	public static double aDouble33;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIBIIII)V")
	public static void method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static219.method3080(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg5;
		@Pc(26) int local26 = -arg5;
		@Pc(35) int local35 = local14;
		@Pc(38) int local38 = -local14;
		@Pc(40) int local40 = -1;
		@Pc(42) int local42 = -1;
		@Pc(46) int[] local46 = Static449.anIntArrayArray48[arg1];
		@Pc(51) int local51 = arg2 - local14;
		Static494.method7075(arg2 - arg5, arg4, local51, local46, 18601);
		@Pc(64) int local64 = arg2 + local14;
		Static494.method7075(local51, arg3, local64, local46, 18601);
		Static494.method7075(local64, arg4, arg5 + arg2, local46, 18601);
		while (local10 < local23) {
			local42 += 2;
			local40 += 2;
			local38 += local42;
			local26 += local40;
			if (local38 >= 0 && local35 >= 1) {
				Static231.anIntArray285[local35] = local10;
				local35--;
				local38 -= local35 << 1;
			}
			local10++;
			@Pc(126) int[] local126;
			@Pc(133) int[] local133;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(181) int local181;
			@Pc(186) int local186;
			@Pc(191) int local191;
			if (local26 >= 0) {
				local23--;
				if (local23 >= local14) {
					local126 = Static449.anIntArrayArray48[local23 + arg1];
					local133 = Static449.anIntArrayArray48[arg1 - local23];
					local137 = arg2 + local10;
					local141 = arg2 - local10;
					Static494.method7075(local141, arg4, local137, local126, 18601);
					Static494.method7075(local141, arg4, local137, local133, 18601);
				} else {
					local126 = Static449.anIntArrayArray48[local23 + arg1];
					local133 = Static449.anIntArrayArray48[arg1 - local23];
					local137 = Static231.anIntArray285[local23];
					local141 = local10 + arg2;
					local181 = arg2 - local10;
					local186 = arg2 + local137;
					local191 = arg2 - local137;
					Static494.method7075(local181, arg4, local191, local126, 18601);
					Static494.method7075(local191, arg3, local186, local126, 18601);
					Static494.method7075(local186, arg4, local141, local126, 18601);
					Static494.method7075(local181, arg4, local191, local133, 18601);
					Static494.method7075(local191, arg3, local186, local133, 18601);
					Static494.method7075(local186, arg4, local141, local133, 18601);
				}
				local26 -= local23 << 1;
			}
			local126 = Static449.anIntArrayArray48[arg1 + local10];
			local133 = Static449.anIntArrayArray48[arg1 - local10];
			local137 = local23 + arg2;
			local141 = arg2 - local23;
			if (local10 < local14) {
				local181 = local35 >= local10 ? local35 : Static231.anIntArray285[local10];
				local186 = local181 + arg2;
				local191 = arg2 - local181;
				Static494.method7075(local141, arg4, local191, local126, 18601);
				Static494.method7075(local191, arg3, local186, local126, 18601);
				Static494.method7075(local186, arg4, local137, local126, 18601);
				Static494.method7075(local141, arg4, local191, local133, 18601);
				Static494.method7075(local191, arg3, local186, local133, 18601);
				Static494.method7075(local186, arg4, local137, local133, 18601);
			} else {
				Static494.method7075(local141, arg4, local137, local126, 18601);
				Static494.method7075(local141, arg4, local137, local133, 18601);
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
	public static void method5164() {
		if (Static681.anInt10509 < 0) {
			Static657.anInt10294 = -1;
			Static537.anInt5296 = -1;
			Static681.anInt10509 = 0;
		}
		if (Static90.anInt3350 < Static681.anInt10509) {
			Static537.anInt5296 = -1;
			Static681.anInt10509 = Static90.anInt3350;
			Static657.anInt10294 = -1;
		}
		if (Static704.anInt10775 < 0) {
			Static657.anInt10294 = -1;
			Static537.anInt5296 = -1;
			Static704.anInt10775 = 0;
		}
		if (Static90.anInt3349 < Static704.anInt10775) {
			Static657.anInt10294 = -1;
			Static704.anInt10775 = Static90.anInt3349;
			Static537.anInt5296 = -1;
		}
	}
}
