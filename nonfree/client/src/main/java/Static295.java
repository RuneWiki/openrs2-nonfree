import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "F")
	public static float aFloat73 = 1024.0F;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public static int anInt5281 = 0;

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
	public static int anInt5285 = 0;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray119 = new boolean[200];

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "[I")
	public static final int[] anIntArray646 = new int[14];

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBZI)V")
	public static void method4662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static144.aLong84 = 0L;
		@Pc(8) int local8 = Static238.method3868();
		if (arg1 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static304.aClass82_4.method4551()) {
			arg2 = true;
		}
		Static191.method3062(local8, arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ll;I)Z")
	public static boolean method4663(@OriginalArg(0) Class143 arg0) {
		return arg0 == Static6.aClass143_1 || arg0 == Static384.aClass143_29 || Static228.aClass143_20 == arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ms;)V")
	public static void method4664(@OriginalArg(1) Class155 arg0) {
		if (arg0.anInt4183 == Static213.anInt3923) {
			Static370.aBooleanArray143[arg0.anInt4215] = true;
		}
	}
}
