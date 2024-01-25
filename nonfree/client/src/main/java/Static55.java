import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public static int anInt1657;

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_39 = new Class34("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_40 = new Class34("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "[I")
	public static final int[] anIntArray155 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)I")
	public static int method1434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(16) int local16 = 128 - arg0;
		@Pc(31) int local31 = local16 * (arg2 & 0x7F) + (arg1 & 0x7F) * arg0 >> 7;
		@Pc(45) int local45 = arg0 * (arg1 & 0x380) + local16 * (arg2 & 0x380) >> 7;
		@Pc(59) int local59 = (arg2 & 0xFC00) * local16 + arg0 * (arg1 & 0xFC00) >> 7;
		return local59 & 0xFC00 | local45 & 0x380 | local31 & 0x7F;
	}
}
