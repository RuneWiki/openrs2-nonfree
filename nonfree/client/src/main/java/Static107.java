import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "Lclient!cg;")
	public static Class3_Sub14 aClass3_Sub14_10;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_149 = new Class397(41, 4);

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "F")
	public static float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIBI)V")
	public static void method7325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13 = Static213.anInt3512;
		@Pc(15) int local15 = Static312.anInt5046;
		if (Static347.aBoolean360) {
			local13 += Static308.method4570();
			local15 += Static541.method7180();
		}
		@Pc(38) Class178 local38;
		if (Static448.anInt6836 == 1) {
			local38 = Static397.aClass178Array12[Static419.anInt10150 / 100];
			local38.method7637(local13 - 8, local15 + -8);
			Static218.method3251(local15 + local38.method7632() - 8, local13 + -8, local38.method7627() + local13 - 8, local15 + -8);
		}
		if (Static448.anInt6836 == 2) {
			local38 = Static397.aClass178Array12[Static419.anInt10150 / 100 + 4];
			local38.method7637(local13 - 8, local15 + -8);
			Static218.method3251(local38.method7632() + local15 - 8, local13 + -8, local13 + local38.method7627() - 8, local15 + -8);
		}
		Static310.method4583();
	}
}
