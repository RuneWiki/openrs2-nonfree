import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_4;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method4311() {
		Static419.aClass85_45.method1741();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIII)V")
	public static void method4314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(14) int local14 = -1;
		Static494.method7075(arg2 - arg1, arg3, arg1 + arg2, Static449.anIntArrayArray48[arg0], 18601);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(53) int[] local53 = Static449.anIntArrayArray48[arg0 + local9];
				@Pc(59) int[] local59 = Static449.anIntArrayArray48[arg0 - local9];
				@Pc(63) int local63 = local7 + arg2;
				@Pc(68) int local68 = arg2 - local7;
				Static494.method7075(local68, arg3, local63, local53, arg4 ^ 0xFFFFA5AB);
				Static494.method7075(local68, arg3, local63, local59, 18601);
			}
			@Pc(87) int local87 = arg2 + local9;
			@Pc(91) int local91 = arg2 - local9;
			@Pc(98) int[] local98 = Static449.anIntArrayArray48[arg0 + local7];
			@Pc(104) int[] local104 = Static449.anIntArrayArray48[arg0 - local7];
			Static494.method7075(local91, arg3, local87, local98, 18601);
			Static494.method7075(local91, arg3, local87, local104, 18601);
		}
		if (arg4 != -4862) {
			method4314(-41, 48, 65, -35, 118);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZBIII)V")
	public static void method4316(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static70.method1065();
		Static506.aLong250 = 0L;
		@Pc(17) int local17 = Static193.method2756();
		if (arg3 == 3 || local17 == 3) {
			arg0 = true;
		}
		if (!Static396.aClass145_6.method9681()) {
			arg0 = true;
		}
		Static84.method1247(local17, arg2, arg0, arg3, arg1);
	}
}
