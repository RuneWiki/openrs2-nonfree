import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Lclient!vf;")
	public static Class238 aClass238_39;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_186 = new Class208(74, -2);

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public static int anInt6279 = 0;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public static int anInt6282 = 0;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public static int anInt6283 = -1;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public static int anInt6285 = 999999;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public static int anInt6290 = 500;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)Lclient!gn;")
	public static Class1_Sub2_Sub1 method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class188 local16 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class1_Sub2_Sub1 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class168 local27 = local16.aClass168_2; local27 != null; local27 = local27.aClass168_1) {
			@Pc(31) Class1_Sub2 local31 = local27.aClass1_Sub2_1;
			if (local31 instanceof Class1_Sub2_Sub1) {
				@Pc(37) Class1_Sub2_Sub1 local37 = (Class1_Sub2_Sub1) local31;
				@Pc(47) int local47 = local37.method4792() * 64 + 60 - 64;
				@Pc(55) int local55 = local37.anInt6800 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt6798 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt6800 + local47 >> 7;
				@Pc(77) int local77 = local37.anInt6798 + local47 >> 7;
				if (local55 <= arg1 && local63 <= arg2 && arg1 <= local70 && arg2 <= local77) {
					@Pc(107) int local107 = (local77 + 1 - arg2) * (-arg1 + local70 - -1);
					if (local24 < local107) {
						local22 = local37;
						local24 = local107;
					}
				}
			}
		}
		return local22;
	}
}
