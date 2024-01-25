import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "Lclient!ha;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_3 = new Class40("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
	public static int anInt193 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[[[Lclient!br;)V")
	public static void method328(@OriginalArg(1) Class37[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class37[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class37 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass15_Sub5_1 instanceof Interface10) {
							((Interface10) local27.aClass15_Sub5_1).method6870();
						}
						if (local27.aClass15_Sub1_3 instanceof Interface10) {
							((Interface10) local27.aClass15_Sub1_3).method6870();
						}
						if (local27.aClass15_Sub1_2 instanceof Interface10) {
							((Interface10) local27.aClass15_Sub1_2).method6870();
						}
						if (local27.aClass15_Sub3_3 instanceof Interface10) {
							((Interface10) local27.aClass15_Sub3_3).method6870();
						}
						if (local27.aClass15_Sub3_2 instanceof Interface10) {
							((Interface10) local27.aClass15_Sub3_2).method6870();
						}
						for (@Pc(77) Class108 local77 = local27.aClass108_1; local77 != null; local77 = local77.aClass108_3) {
							@Pc(82) Class15_Sub2 local82 = local77.aClass15_Sub2_1;
							if (local82 instanceof Interface10) {
								((Interface10) local82).method6870();
							}
						}
					}
				}
			}
		}
	}
}
