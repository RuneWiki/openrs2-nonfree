import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
	public static boolean aBoolean635;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V")
	public static void method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static201.aClass1_Sub14_Sub2_2.method4522(arg1);
		Static201.aClass1_Sub14_Sub2_2.method4495(arg0);
		Static201.aClass1_Sub14_Sub2_2.method4505(arg2);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIII)Lclient!ir;")
	public static Class47_Sub1_Sub5 method5721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class137 local16 = Static131.aClass137ArrayArrayArray2[arg2][arg1][arg0];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class47_Sub1_Sub5 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class167 local27 = local16.aClass167_1; local27 != null; local27 = local27.aClass167_2) {
			@Pc(31) Class47_Sub1 local31 = local27.aClass47_Sub1_2;
			if (local31 instanceof Class47_Sub1_Sub5) {
				@Pc(37) Class47_Sub1_Sub5 local37 = (Class47_Sub1_Sub5) local31;
				@Pc(47) int local47 = local37.method4317() * 64 + 60 - 64;
				@Pc(54) int local54 = local37.anInt7060 - local47 >> 7;
				@Pc(62) int local62 = local37.anInt7066 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt7060 + local47 >> 7;
				@Pc(77) int local77 = local47 + local37.anInt7066 >> 7;
				if (local54 <= arg1 && arg0 >= local62 && local70 >= arg1 && local77 >= arg0) {
					@Pc(109) int local109 = (local70 + 1 - arg1) * (local77 - -1 - arg0);
					if (local109 > local24) {
						local24 = local109;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZII)V")
	public static void method5722(@OriginalArg(1) boolean arg0) {
		Static228.anInt3926 = 2;
		Static183.aBoolean268 = arg0;
		Static3.anInt61 = 22050;
	}
}
