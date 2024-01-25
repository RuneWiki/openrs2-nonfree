import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Lclient!laa;")
	public static Class198 aClass198_2;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBLclient!ui;)Z")
	public static boolean method4832(@OriginalArg(0) int arg0, @OriginalArg(2) Class333 arg1) {
		Static368.aClass34_5.method6216(arg1.anIntArray560[arg0], arg1.anIntArray561[arg0], arg1.anIntArray559[arg0], Static174.anIntArray148);
		@Pc(30) int local30 = Static174.anIntArray148[2];
		if (local30 < 50) {
			return false;
		} else {
			arg1.aShortArray122[arg0] = (short) (Static174.anIntArray148[0] * Static326.anInt4968 / local30 + Static467.anInt6044);
			arg1.aShortArray121[arg0] = (short) (Static174.anIntArray148[1] * Static489.anInt8325 / local30 + Static350.anInt6430);
			arg1.aShortArray120[arg0] = (short) local30;
			return true;
		}
	}
}
