import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!jd;")
	public static final Class117 aClass117_10 = new Class117("WTRC", 1);

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_65 = new Class32("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_66 = new Class32("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_100 = new Class205(94, 6);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!dh;III[Z)Z")
	public static boolean method4008(@OriginalArg(0) Class2_Sub10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static350.aClass107Array4 != Static94.aClass107Array2) {
			@Pc(11) int local11 = Static90.aClass107Array1[arg1].method4673(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class107 local18 = Static90.aClass107Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4673(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4674(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4677(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
