import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	public static int anInt7759;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	public static int anInt7767;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_331 = new Class296(70, -1);

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "[I")
	public static final int[] anIntArray726 = new int[16];

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_114 = new Class306("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
	public static int anInt7768 = -1;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Z")
	public static boolean aBoolean555 = true;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6464(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I")
	public static int method6469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg0 > 0) {
			local15 = arg1 & 0x1 | local15 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local15;
	}
}
