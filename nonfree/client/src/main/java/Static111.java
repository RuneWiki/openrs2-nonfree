import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array25;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
	public static int anInt10351;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_213 = new Class126(17, 6);

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public static int anInt10340 = 0;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[I")
	public static final int[] anIntArray671 = new int[1];

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_214 = new Class126(57, 6);

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
	public static int anInt10350 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIII)Z")
	public static boolean method8750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static186.aClass25_2.method4286(arg2, arg1, arg0, Static46.anIntArray46);
		@Pc(18) int local18 = Static46.anIntArray46[2];
		if (local18 < 50) {
			return false;
		} else {
			Static46.anIntArray46[2] = local18;
			Static46.anIntArray46[1] = Static665.anInt10247 * Static46.anIntArray46[1] / local18 + Static643.anInt9908;
			Static46.anIntArray46[0] = Static626.anInt9703 + Static420.anInt7096 * Static46.anIntArray46[0] / local18;
			return true;
		}
	}
}
