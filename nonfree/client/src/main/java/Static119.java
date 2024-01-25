import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "Lclient!he;")
	public static Class100 aClass100_84;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_93 = new Class267("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_94 = new Class267("M", "M", "M", "M");

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!md;I)I")
	public static int method5701(@OriginalArg(0) Class6_Sub1_Sub1 arg0) {
		@Pc(17) int local17 = arg0.method3803(2);
		@Pc(30) int local30;
		if (local17 == 0) {
			local30 = 0;
		} else if (local17 == 1) {
			local30 = arg0.method3803(5);
		} else if (local17 == 2) {
			local30 = arg0.method3803(8);
		} else {
			local30 = arg0.method3803(11);
		}
		return local30;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
	public static void method5703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg1; local15 <= arg2; local15++) {
			Static298.method4405(Static62.anIntArrayArray7[local15], arg0, arg4, arg3);
		}
	}
}
