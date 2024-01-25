import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static412 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Lclient!qm;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "I")
	public static int anInt7192;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "Lclient!vh;")
	public static Class250 aClass250_86;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_94 = new Class84("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!us", name = "d", descriptor = "[I")
	public static final int[] anIntArray624 = new int[500];

	@OriginalMember(owner = "client!us", name = "j", descriptor = "[Lclient!vq;")
	public static Class196_Sub1[] aClass196_Sub1Array2 = new Class196_Sub1[0];

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)Z")
	public static boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)Z")
	public static boolean method5567(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
