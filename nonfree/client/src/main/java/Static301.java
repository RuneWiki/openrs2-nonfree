import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "Lclient!q;")
	public static Class209 aClass209_5;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Lclient!si;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "Lclient!ga;")
	public static Class111 aClass111_70;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
	public static int anInt5523 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBI)Lclient!he;")
	public static Class20_Sub2_Sub4_Sub1 method4708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class293 local11 = Static118.aClass293ArrayArrayArray14[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class20_Sub2_Sub4_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(31) Class285 local31 = local11.aClass285_6; local31 != null; local31 = local31.aClass285_5) {
			@Pc(35) Class20_Sub2_Sub4 local35 = local31.aClass20_Sub2_Sub4_1;
			if (local35 instanceof Class20_Sub2_Sub4_Sub1) {
				@Pc(41) Class20_Sub2_Sub4_Sub1 local41 = (Class20_Sub2_Sub4_Sub1) local35;
				@Pc(51) int local51 = local41.method5349() * 256 + 252 - 256;
				@Pc(58) int local58 = local41.anInt8796 - local51 >> 9;
				@Pc(66) int local66 = local41.anInt8795 - local51 >> 9;
				@Pc(74) int local74 = local41.anInt8796 + local51 >> 9;
				@Pc(81) int local81 = local51 + local41.anInt8795 >> 9;
				if (arg0 >= local58 && arg2 >= local66 && local74 >= arg0 && arg2 <= local81) {
					@Pc(115) int local115 = (local74 + 1 - arg0) * (-arg2 + 1 + local81);
					if (local115 > local19) {
						local19 = local115;
						local17 = local41;
					}
				}
			}
		}
		return local17;
	}
}
