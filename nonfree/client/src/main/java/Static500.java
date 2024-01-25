import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Z")
	public static boolean method7112() {
		return Static158.anInt3597 == 0 ? Static489.aClass2_Sub2_Sub1_4.method169() : true;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIBII)V")
	public static void method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(17) int local17 = -arg0;
		Static259.method4236(arg1 - arg0, arg1 - -arg0, arg2, Static618.anIntArrayArray101[arg3]);
		@Pc(33) int local33 = -1;
		while (local12 < local14) {
			local33 += 2;
			local17 += local33;
			local12++;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(56) int[] local56 = Static618.anIntArrayArray101[arg3 + local14];
				@Pc(63) int[] local63 = Static618.anIntArrayArray101[arg3 - local14];
				@Pc(68) int local68 = arg1 + local12;
				@Pc(72) int local72 = arg1 - local12;
				Static259.method4236(local72, local68, arg2, local56);
				Static259.method4236(local72, local68, arg2, local63);
			}
			@Pc(88) int local88 = local14 + arg1;
			@Pc(93) int local93 = arg1 - local14;
			@Pc(99) int[] local99 = Static618.anIntArrayArray101[local12 + arg3];
			@Pc(106) int[] local106 = Static618.anIntArrayArray101[arg3 - local12];
			Static259.method4236(local93, local88, arg2, local99);
			Static259.method4236(local93, local88, arg2, local106);
		}
	}
}
