import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ms", name = "M", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!ms", name = "F", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_66 = new Class142("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
	public static int anInt4660 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(CB)Z")
	public static boolean method3682(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(26) char[] local26 = Static292.aCharArray3;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (local34 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
