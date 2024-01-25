import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bt", name = "hb", descriptor = "Lclient!jia;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!bt", name = "fb", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_23 = new Class130(8, 4);

	@OriginalMember(owner = "client!bt", name = "gb", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_11 = new Class200(74, -1);

	@OriginalMember(owner = "client!bt", name = "jb", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_12 = new Class200(27, 1);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZZLclient!ir;)V")
	public static void method1546(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class3_Sub29 arg2) {
		@Pc(8) int local8 = arg2.anInt4601;
		@Pc(15) int local15 = (int) arg2.aLong276;
		arg2.method8769();
		if (arg0) {
			Static248.method4014(local8);
		}
		Static229.method3810(local8);
		@Pc(30) Class279 local30 = Static433.method6771(local15);
		if (local30 != null) {
			Static482.method7193(local30);
		}
		Static206.method3540();
		if (!arg1 && Static307.anInt5465 != -1) {
			Static596.method8356(1, Static307.anInt5465);
		}
		@Pc(53) Class180 local53 = new Class180(Static356.aClass280_29);
		for (@Pc(58) Class3_Sub29 local58 = (Class3_Sub29) local53.method4571(); local58 != null; local58 = (Class3_Sub29) local53.method4568()) {
			if (!local58.method8770()) {
				local58 = (Class3_Sub29) local53.method4571();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt4603 == 3) {
				@Pc(82) int local82 = (int) local58.aLong276;
				if (local8 == local82 >>> 16) {
					method1546(true, arg1, local58);
				}
			}
		}
	}
}
