import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
	public static int anInt1522;

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)Lclient!bn;")
	public static Class3_Sub2_Sub1 method1266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class101 local20 = Static409.aClass101ArrayArrayArray3[arg0][arg2][arg1];
		if (local20 == null) {
			return null;
		}
		@Pc(26) Class3_Sub2_Sub1 local26 = null;
		@Pc(28) int local28 = -1;
		for (@Pc(31) Class145 local31 = local20.aClass145_1; local31 != null; local31 = local31.aClass145_2) {
			@Pc(35) Class3_Sub2 local35 = local31.aClass3_Sub2_2;
			if (local35 instanceof Class3_Sub2_Sub1) {
				@Pc(41) Class3_Sub2_Sub1 local41 = (Class3_Sub2_Sub1) local35;
				@Pc(53) int local53 = (local41.method5521() - 1) * 64 + 60;
				@Pc(61) int local61 = local41.anInt7202 - local53 >> 7;
				@Pc(69) int local69 = local41.anInt7207 - local53 >> 7;
				@Pc(76) int local76 = local53 + local41.anInt7202 >> 7;
				@Pc(83) int local83 = local41.anInt7207 + local53 >> 7;
				if (arg2 >= local61 && local69 <= arg1 && arg2 <= local76 && local83 >= arg1) {
					@Pc(121) int local121 = (local76 + 1 - arg2) * (local83 + 1 + -arg1);
					if (local28 < local121) {
						local28 = local121;
						local26 = local41;
					}
				}
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)I")
	public static int method1267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}
}
