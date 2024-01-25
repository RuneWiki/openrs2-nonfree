import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "Lclient!dn;")
	public static Class69 aClass69_71;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_51 = new Class277(64);

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_98 = new Class45("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_99 = new Class45(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	public static int anInt6464 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)I")
	public static int method5819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static29.anIntArray60[arg1 & 0x3] : Static330.anIntArray611[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[FI)[F")
	public static float[] method5821(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static556.method7042(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
