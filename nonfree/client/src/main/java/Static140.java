import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	public static int anInt2975;

	@OriginalMember(owner = "client!hc", name = "tb", descriptor = "[Lclient!nh;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_66 = new Class209(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "[I")
	public static final int[] anIntArray266 = new int[4];

	@OriginalMember(owner = "client!hc", name = "qb", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZ)I")
	public static int method2380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static118.anIntArray209[arg1 & 0x3] : 256;
	}
}
