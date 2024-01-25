import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rj", name = "hb", descriptor = "[Lclient!ya;")
	public static Class162[] aClass162Array3;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_80 = new Class134("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!rj", name = "rb", descriptor = "I")
	public static int anInt5891 = 0;

	@OriginalMember(owner = "client!rj", name = "sb", descriptor = "I")
	public static int anInt5892 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	public static void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static309.aClass270ArrayArrayArray3[0][arg1][arg2] != null && Static309.aClass270ArrayArrayArray3[0][arg1][arg2].aClass270_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static309.aClass270ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class270 local46 = Static309.aClass270ArrayArrayArray3[local22][arg1][arg2] = new Class270(local22, arg1, arg2);
				if (local20) {
					local46.aByte105++;
				}
			}
		}
	}
}
