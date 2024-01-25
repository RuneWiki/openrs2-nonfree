import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
	public static int anInt7506;

	@OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
	public static int anInt7505 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)Lclient!vq;")
	public static Class8_Sub3_Sub3_Sub1 method5966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class39 local11 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class8_Sub3_Sub3_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class111 local27 = local11.aClass111_1; local27 != null; local27 = local27.aClass111_2) {
			@Pc(31) Class8_Sub3_Sub3 local31 = local27.aClass8_Sub3_Sub3_1;
			if (local31 instanceof Class8_Sub3_Sub3_Sub1) {
				@Pc(37) Class8_Sub3_Sub3_Sub1 local37 = (Class8_Sub3_Sub3_Sub1) local31;
				@Pc(47) int local47 = (local37.method5434() - 1) * 256 + 252;
				@Pc(55) int local55 = local37.anInt9365 - local47 >> 9;
				@Pc(63) int local63 = local37.anInt9370 - local47 >> 9;
				@Pc(70) int local70 = local47 + local37.anInt9365 >> 9;
				@Pc(77) int local77 = local37.anInt9370 + local47 >> 9;
				if (arg1 >= local55 && arg2 >= local63 && arg1 <= local70 && arg2 <= local77) {
					@Pc(111) int local111 = (local77 + 1 - arg2) * (local70 - -1 + -arg1);
					if (local111 > local19) {
						local17 = local37;
						local19 = local111;
					}
				}
			}
		}
		return local17;
	}
}
