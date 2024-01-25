import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static390 {

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
	public static int anInt10740;

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
	public static int anInt10741;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_157 = new Class218(27, 3);

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "[I")
	public static int[] anIntArray946 = new int[4];

	@OriginalMember(owner = "client!nb", name = "X", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_219 = new Class180(35, 4);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(CZ)C")
	public static char method9300(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "(I)V")
	public static void method9301() {
		if (!Static139.aBoolean217) {
			Static214.aBoolean310 = true;
			Static139.aBoolean217 = true;
			Static667.aFloat213 += (24.0F - Static667.aFloat213) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
	public static void method9302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static115.anInt2363 = arg1;
		Static666.anInt10607 = arg3;
		Static385.anInt6092 = arg0;
		Static63.anInt1263 = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "(I)V")
	public static void method9304() {
		if (Static503.anInt8166 != -1) {
			Static499.method7144(Static503.anInt8166, -1, -1, false);
			Static503.anInt8166 = -1;
		}
	}
}
