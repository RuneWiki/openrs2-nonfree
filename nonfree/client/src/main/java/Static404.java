import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "Lclient!ji;")
	public static Class123 aClass123_3;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "Lclient!bi;")
	public static Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_232 = new Class92(8, 7);

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[I")
	public static final int[] anIntArray497 = new int[4];

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "S")
	public static short aShort214 = 256;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I")
	public static int method5459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static92.anIntArray168[arg0 & 0x3] : Static144.anIntArray242[arg0 & 0x3];
	}
}
