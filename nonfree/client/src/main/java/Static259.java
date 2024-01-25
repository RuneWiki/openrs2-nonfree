import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Lclient!ob;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_63 = new Class242("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)Z")
	public static boolean method3548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static348.method4902(arg1, arg0) | (arg1 & 0x70000) != 0 || Static74.method1341(arg1, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method3550(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg4 + 7) / 8);
		@Pc(38) int local38 = -((arg1 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local29; local40 < 0; local40++) {
			for (@Pc(44) int local44 = local38; local44 < 0; local44++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local16;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg3;
		}
		return false;
	}
}
