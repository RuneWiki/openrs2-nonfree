import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
	public static int anInt5401 = -1;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_111 = new Class256("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_130 = new Class81(70, 8);

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
	public static int anInt5407 = 0;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIBI)Lclient!it;")
	public static Class4_Sub2_Sub2 method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class113 local11 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(25) Class4_Sub2_Sub2 local25 = null;
		@Pc(27) int local27 = -1;
		for (@Pc(30) Class134 local30 = local11.aClass134_1; local30 != null; local30 = local30.aClass134_2) {
			@Pc(34) Class4_Sub2 local34 = local30.aClass4_Sub2_1;
			if (local34 instanceof Class4_Sub2_Sub2) {
				@Pc(40) Class4_Sub2_Sub2 local40 = (Class4_Sub2_Sub2) local34;
				@Pc(48) int local48 = local40.method5118() * 64 - 4;
				@Pc(55) int local55 = local40.anInt7117 - local48 >> 7;
				@Pc(62) int local62 = local40.anInt7111 - local48 >> 7;
				@Pc(69) int local69 = local48 + local40.anInt7117 >> 7;
				@Pc(76) int local76 = local40.anInt7111 + local48 >> 7;
				if (local55 <= arg1 && arg2 >= local62 && local69 >= arg1 && local76 >= arg2) {
					@Pc(113) int local113 = (local76 + 1 - arg2) * (-arg1 + (local69 - -1));
					if (local27 < local113) {
						local25 = local40;
						local27 = local113;
					}
				}
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)Z")
	public static boolean method4382(@OriginalArg(0) int arg0) {
		Static277.aBoolean431 = true;
		Static436.anInt7620 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
