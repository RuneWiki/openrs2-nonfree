import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	public static int anInt8967;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public static int anInt8968;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIII)Lclient!bba;")
	public static Class28_Sub1_Sub1_Sub1 method7835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class164 local11 = Static15.aClass164ArrayArrayArray5[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(26) Class28_Sub1_Sub1_Sub1 local26 = null;
		@Pc(28) int local28 = -1;
		for (@Pc(31) Class125 local31 = local11.aClass125_2; local31 != null; local31 = local31.aClass125_1) {
			@Pc(35) Class28_Sub1_Sub1 local35 = local31.aClass28_Sub1_Sub1_1;
			if (local35 instanceof Class28_Sub1_Sub1_Sub1) {
				@Pc(41) Class28_Sub1_Sub1_Sub1 local41 = (Class28_Sub1_Sub1_Sub1) local35;
				@Pc(51) int local51 = local41.method9314() * 256 + 252 - 256;
				@Pc(59) int local59 = local41.anInt10729 - local51 >> 9;
				@Pc(67) int local67 = local41.anInt10731 - local51 >> 9;
				@Pc(75) int local75 = local41.anInt10729 + local51 >> 9;
				@Pc(82) int local82 = local51 + local41.anInt10731 >> 9;
				if (arg0 >= local59 && local67 <= arg1 && arg0 <= local75 && local82 >= arg1) {
					@Pc(112) int local112 = (local75 + 1 - arg0) * (local82 + 1 + -arg1);
					if (local112 > local28) {
						local28 = local112;
						local26 = local41;
					}
				}
			}
		}
		return local26;
	}
}
