import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_4 = new Class21("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_8 = new Class212(7, -1);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([[[Lclient!mm;I)V")
	public static void method449(@OriginalArg(0) Class162[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(20) Class162[][] local20 = arg0[local7];
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				for (@Pc(26) int local26 = 0; local26 < local20[local22].length; local26++) {
					@Pc(34) Class162 local34 = local20[local22][local26];
					if (local34 != null) {
						if (local34.aClass11_Sub1_2 instanceof Interface12) {
							((Interface12) local34.aClass11_Sub1_2).method6317();
						}
						if (local34.aClass11_Sub3_1 instanceof Interface12) {
							((Interface12) local34.aClass11_Sub3_1).method6317();
						}
						if (local34.aClass11_Sub3_2 instanceof Interface12) {
							((Interface12) local34.aClass11_Sub3_2).method6317();
						}
						if (local34.aClass11_Sub2_2 instanceof Interface12) {
							((Interface12) local34.aClass11_Sub2_2).method6317();
						}
						if (local34.aClass11_Sub2_1 instanceof Interface12) {
							((Interface12) local34.aClass11_Sub2_1).method6317();
						}
						for (@Pc(84) Class199 local84 = local34.aClass199_1; local84 != null; local84 = local84.aClass199_2) {
							@Pc(89) Class11_Sub5 local89 = local84.aClass11_Sub5_1;
							if (local89 instanceof Interface12) {
								((Interface12) local89).method6317();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	public static void method451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(13, arg1);
		local8.method521();
		local8.anInt621 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	public static void method452() {
		Static298.aClass83_39.method2346();
	}
}
