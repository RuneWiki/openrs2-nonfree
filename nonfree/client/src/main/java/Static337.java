import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lw", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
	public static int anInt6290 = -1;

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "Lclient!st;")
	public static final Class314 aClass314_96 = new Class314(4, 18);

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
	public static int anInt6295 = 0;

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_191 = new Class194(26, 6);

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIZ)Lclient!ni;")
	public static Class9_Sub2_Sub1_Sub2 method5432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class351 local11 = Static567.aClass351ArrayArrayArray4[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class9_Sub2_Sub1_Sub2 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class105 local27 = local11.aClass105_3; local27 != null; local27 = local27.aClass105_1) {
			@Pc(31) Class9_Sub2_Sub1 local31 = local27.aClass9_Sub2_Sub1_1;
			if (local31 instanceof Class9_Sub2_Sub1_Sub2) {
				@Pc(37) Class9_Sub2_Sub1_Sub2 local37 = (Class9_Sub2_Sub1_Sub2) local31;
				@Pc(47) int local47 = (local37.method8619() - 1) * 256 + 252;
				@Pc(55) int local55 = local37.anInt10152 - local47 >> 9;
				@Pc(63) int local63 = local37.anInt10158 - local47 >> 9;
				@Pc(70) int local70 = local47 + local37.anInt10152 >> 9;
				@Pc(78) int local78 = local37.anInt10158 + local47 >> 9;
				if (arg0 >= local55 && local63 <= arg2 && arg0 <= local70 && local78 >= arg2) {
					@Pc(108) int local108 = (local78 + 1 - arg2) * (local70 - -1 + -arg0);
					if (local24 < local108) {
						local17 = local37;
						local24 = local108;
					}
				}
			}
		}
		return local17;
	}
}
