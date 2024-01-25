import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array28;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!nb;")
	public static final Class232 aClass232_20 = new Class232("WTQA", 2);

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	public static final int[] anIntArray597 = new int[2];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)Lclient!rg;")
	public static Class12_Sub2_Sub1_Sub4 method7353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class228 local11 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class12_Sub2_Sub1_Sub4 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class180 local22 = local11.aClass180_3; local22 != null; local22 = local22.aClass180_2) {
			@Pc(26) Class12_Sub2_Sub1 local26 = local22.aClass12_Sub2_Sub1_1;
			if (local26 instanceof Class12_Sub2_Sub1_Sub4) {
				@Pc(32) Class12_Sub2_Sub1_Sub4 local32 = (Class12_Sub2_Sub1_Sub4) local26;
				@Pc(42) int local42 = (local32.method6777() - 1) * 256 + 252;
				@Pc(50) int local50 = local32.anInt9374 - local42 >> 9;
				@Pc(58) int local58 = local32.anInt9375 - local42 >> 9;
				@Pc(66) int local66 = local32.anInt9374 + local42 >> 9;
				@Pc(74) int local74 = local32.anInt9375 + local42 >> 9;
				if (arg1 >= local50 && arg2 >= local58 && local66 >= arg1 && local74 >= arg2) {
					@Pc(104) int local104 = (local74 + 1 - arg2) * (local66 + 1 + -arg1);
					if (local104 > local19) {
						local19 = local104;
						local17 = local32;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIZI)V")
	public static void method7356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static453.method5906(arg1)) {
			Static123.method1656(-1, Static509.aClass273ArrayArray2[arg1], arg0, arg3, arg2);
		}
	}
}
