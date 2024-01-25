import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!os", name = "C", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIB)Lclient!wv;")
	public static Class4_Sub1_Sub1 method5622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class276 local11 = Static270.aClass276ArrayArrayArray2[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class4_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class267 local27 = local11.aClass267_3; local27 != null; local27 = local27.aClass267_2) {
			@Pc(31) Class4_Sub1 local31 = local27.aClass4_Sub1_2;
			if (local31 instanceof Class4_Sub1_Sub1) {
				@Pc(37) Class4_Sub1_Sub1 local37 = (Class4_Sub1_Sub1) local31;
				@Pc(47) int local47 = (local37.method5892() - 1) * 256 + 252;
				@Pc(55) int local55 = local37.anInt9542 - local47 >> 9;
				@Pc(63) int local63 = local37.anInt9540 - local47 >> 9;
				@Pc(70) int local70 = local47 + local37.anInt9542 >> 9;
				@Pc(77) int local77 = local47 + local37.anInt9540 >> 9;
				if (local55 <= arg2 && arg1 >= local63 && arg2 <= local70 && arg1 <= local77) {
					@Pc(110) int local110 = (local70 + 1 - arg2) * (local77 + 1 - arg1);
					if (local110 > local19) {
						local17 = local37;
						local19 = local110;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(II)Z")
	public static boolean method5623(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
