import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!bw;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_95 = new Class163(3, -1);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)V")
	public static void method3093() {
		Static284.aClass268_40.method6173(5);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIB)Lclient!wj;")
	public static Class1_Sub2_Sub6 method3096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class227 local11 = Static389.aClass227ArrayArrayArray3[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class1_Sub2_Sub6 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class114 local27 = local11.aClass114_2; local27 != null; local27 = local27.aClass114_1) {
			@Pc(31) Class1_Sub2 local31 = local27.aClass1_Sub2_1;
			if (local31 instanceof Class1_Sub2_Sub6) {
				@Pc(37) Class1_Sub2_Sub6 local37 = (Class1_Sub2_Sub6) local31;
				@Pc(47) int local47 = (local37.method6204() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt7560 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt7557 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt7560 + local47 >> 7;
				@Pc(77) int local77 = local47 + local37.anInt7557 >> 7;
				if (arg2 >= local55 && arg0 >= local63 && local70 >= arg2 && arg0 <= local77) {
					@Pc(111) int local111 = (local70 + 1 - arg2) * (local77 + 1 + -arg0);
					if (local19 < local111) {
						local17 = local37;
						local19 = local111;
					}
				}
			}
		}
		return local17;
	}
}
