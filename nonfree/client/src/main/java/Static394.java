import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!o;")
	public static Class49 aClass49_23;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array12;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_108 = new Class194(31, 7);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I")
	public static int method5132() {
		if (Static387.aClass76_14 == null) {
			if (!Static272.aBoolean283 && Static18.anInt395 > 0) {
				if (Static2.aBoolean506 && Static188.aClass80_1.method1723(81) && Static18.anInt395 > 2) {
					return ((Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268.aClass5_268).anInt6816;
				}
				return ((Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268).anInt6816;
			}
			@Pc(46) int local46 = Static290.aClass66_1.method5965();
			@Pc(50) int local50 = Static290.aClass66_1.method5974();
			@Pc(52) int local52 = Static285.anInt4431;
			@Pc(54) int local54 = Static381.anInt3882;
			@Pc(56) int local56 = Static78.anInt4643;
			if (local52 < local46 && local46 < local52 + local56) {
				@Pc(71) int local71 = -1;
				@Pc(90) int local90;
				for (@Pc(73) int local73 = 0; local73 < Static18.anInt395; local73++) {
					if (Static286.aBoolean295) {
						local90 = (Static18.anInt395 - local73 - 1) * 16 + local54 + 33;
						if (local50 > local90 - 13 && local50 <= local90 + 3) {
							local71 = local73;
						}
					} else {
						local90 = (Static18.anInt395 - local73 - 1) * 16 + local54 + 31;
						if (local90 - 13 < local50 && local90 + 3 >= local50) {
							local71 = local73;
						}
					}
				}
				if (local71 != -1) {
					local90 = 0;
					@Pc(148) Class142 local148 = new Class142(Static122.aClass177_13);
					for (@Pc(153) Class5_Sub41 local153 = (Class5_Sub41) local148.method2954(); local153 != null; local153 = (Class5_Sub41) local148.method2958()) {
						if (local71 == local90++) {
							return local153.anInt6816;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	public static void method5134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static288.method3576(Static9.aClass194_5);
		Static281.aClass5_Sub15_Sub2_13.method5597(arg1);
		Static281.aClass5_Sub15_Sub2_13.method5564(arg0);
	}
}
