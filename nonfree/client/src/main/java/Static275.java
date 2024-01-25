import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static275 {

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Lclient!tq;")
	public static Class191 aClass191_181;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public static int anInt5623;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "[[[Lclient!ak;")
	public static Class8[][][] aClass8ArrayArrayArray4;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public static int anInt5618 = -1;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_100 = new Class93("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)B")
	public static byte method5017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
