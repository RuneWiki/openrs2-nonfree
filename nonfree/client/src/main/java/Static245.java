import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public static int anInt4066;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!hd;")
	public static Class110 aClass110_10 = null;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!be;")
	public static final Class21 aClass21_3 = new Class21(0);

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_57 = new Class146(8, 5);

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_66 = new Class15("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)I")
	public static int method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg2 : arg0;
		@Pc(38) int local38 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg2 : arg3) : arg0;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}
}
