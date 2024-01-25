import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "F")
	public static float aFloat41 = 0.0F;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
	public static final int[] anIntArray534 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	public static void method2517(@OriginalArg(0) boolean arg0) {
		Static273.aBoolean353 = arg0;
		if (Static221.aClass118_6 != null) {
			Static221.aClass118_6.method2854(!Static231.method3740());
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!d;Z)V")
	public static void method2518(@OriginalArg(0) Class42 arg0) {
		Static383.aClass42_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)Lclient!fo;")
	public static Class1_Sub5_Sub1 method2519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class251 local11 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class1_Sub5_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class46 local22 = local11.aClass46_3; local22 != null; local22 = local22.aClass46_1) {
			@Pc(26) Class1_Sub5 local26 = local22.aClass1_Sub5_1;
			if (local26 instanceof Class1_Sub5_Sub1) {
				@Pc(32) Class1_Sub5_Sub1 local32 = (Class1_Sub5_Sub1) local26;
				@Pc(44) int local44 = (local32.method5547() - 1) * 64 + 60;
				@Pc(52) int local52 = local32.anInt6390 - local44 >> 7;
				@Pc(60) int local60 = local32.anInt6386 - local44 >> 7;
				@Pc(67) int local67 = local44 + local32.anInt6390 >> 7;
				@Pc(74) int local74 = local44 + local32.anInt6386 >> 7;
				if (arg1 >= local52 && arg2 >= local60 && arg1 <= local67 && local74 >= arg2) {
					@Pc(106) int local106 = (local67 + 1 - arg1) * (local74 + 1 - arg2);
					if (local106 > local19) {
						local17 = local32;
						local19 = local106;
					}
				}
			}
		}
		return local17;
	}
}
