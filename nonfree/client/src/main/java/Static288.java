import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "F")
	public static float aFloat133;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "[Lclient!bq;")
	public static final Class3_Sub7[] aClass3_Sub7Array4 = new Class3_Sub7[8];

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_74 = new Class376(71, 2);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZLclient!ia;)Z")
	public static boolean method4523(@OriginalArg(0) int arg0, @OriginalArg(2) Class167 arg1) {
		Static186.aClass25_2.method4286(arg1.anIntArray291[arg0], arg1.anIntArray292[arg0], arg1.anIntArray293[arg0], Static46.anIntArray46);
		@Pc(27) int local27 = Static46.anIntArray46[2];
		if (local27 < 50) {
			return false;
		} else {
			arg1.aShortArray97[arg0] = (short) (Static626.anInt9703 + Static420.anInt7096 * Static46.anIntArray46[0] / local27);
			arg1.aShortArray98[arg0] = (short) (Static665.anInt10247 * Static46.anIntArray46[1] / local27 + Static643.anInt9908);
			arg1.aShortArray96[arg0] = (short) local27;
			return true;
		}
	}
}
