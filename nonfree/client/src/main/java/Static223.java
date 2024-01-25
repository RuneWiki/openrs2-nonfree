import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray19;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "Lclient!mg;")
	public static Class160 aClass160_42;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public static int anInt4335 = -1;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
	public static boolean aBoolean314 = false;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public static int anInt4338 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)Lclient!co;")
	public static Class3_Sub2_Sub1 method3510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class106 local11 = Static440.aClass106ArrayArrayArray3[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class3_Sub2_Sub1 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class4 local27 = local11.aClass4_3; local27 != null; local27 = local27.aClass4_1) {
			@Pc(31) Class3_Sub2 local31 = local27.aClass3_Sub2_1;
			if (local31 instanceof Class3_Sub2_Sub1) {
				@Pc(37) Class3_Sub2_Sub1 local37 = (Class3_Sub2_Sub1) local31;
				@Pc(47) int local47 = local37.method4935() * 64 + 60 - 64;
				@Pc(54) int local54 = local37.anInt6119 - local47 >> 7;
				@Pc(61) int local61 = local37.anInt6121 - local47 >> 7;
				@Pc(68) int local68 = local47 + local37.anInt6119 >> 7;
				@Pc(75) int local75 = local47 + local37.anInt6121 >> 7;
				if (arg1 >= local54 && local61 <= arg0 && local68 >= arg1 && local75 >= arg0) {
					@Pc(117) int local117 = (local68 + 1 - arg1) * (local75 + 1 + -arg0);
					if (local24 < local117) {
						local17 = local37;
						local24 = local117;
					}
				}
			}
		}
		return local17;
	}
}
