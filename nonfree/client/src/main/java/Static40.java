import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[Lclient!iw;")
	public static Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	public static int anInt856;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIZ)Lclient!qba;")
	public static Class34_Sub1_Sub1_Sub2 method757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class368 local11 = Static254.aClass368ArrayArrayArray2[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class34_Sub1_Sub1_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class205 local22 = local11.aClass205_4; local22 != null; local22 = local22.aClass205_3) {
			@Pc(31) Class34_Sub1_Sub1 local31 = local22.aClass34_Sub1_Sub1_1;
			if (local31 instanceof Class34_Sub1_Sub1_Sub2) {
				@Pc(37) Class34_Sub1_Sub1_Sub2 local37 = (Class34_Sub1_Sub1_Sub2) local31;
				@Pc(45) int local45 = local37.method7866() * 256 - 4;
				@Pc(53) int local53 = local37.anInt9614 - local45 >> 9;
				@Pc(61) int local61 = local37.anInt9619 - local45 >> 9;
				@Pc(68) int local68 = local45 + local37.anInt9614 >> 9;
				@Pc(76) int local76 = local37.anInt9619 + local45 >> 9;
				if (local53 <= arg2 && arg0 >= local61 && local68 >= arg2 && local76 >= arg0) {
					@Pc(108) int local108 = (local76 + 1 - arg0) * (local68 + 1 - arg2);
					if (local108 > local19) {
						local19 = local108;
						local17 = local37;
					}
				}
			}
		}
		return local17;
	}
}
