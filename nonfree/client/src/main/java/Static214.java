import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "Lclient!bq;")
	public static Class35 aClass35_16;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Lclient!st;")
	public static Class236 aClass236_15;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	public static int anInt7133;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "[I")
	public static final int[] anIntArray679 = new int[2048];

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "F")
	public static float aFloat101 = 0.0F;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZLclient!nv;)I")
	public static int method5443(@OriginalArg(2) Class183 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	public static void method5444() {
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			Static194.aBooleanArray16[local9] = false;
		}
		Static458.anInt7957 = -1;
		Static363.anInt6666 = 0;
		Static21.anInt6762 = 1;
		Static398.anInt7203 = -1;
		Static64.anInt1733 = 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	public static void method5445(@OriginalArg(1) int arg0) {
		Static331.anInt6090 = arg0;
		Static9.anInt3081 = 100;
		Static140.anInt3084 = -1;
		Static305.anInt5723 = 3;
	}
}
