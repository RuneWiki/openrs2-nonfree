import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
	public static int anInt7319;

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_151 = new Class298(60, -1);

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "F")
	public static float aFloat152 = 0.0F;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "[Lclient!gu;")
	public static final Class122[] aClass122Array1 = new Class122[8];

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static70.method7721(arg1, arg0) | (arg1 & 0x70000) != 0 || Static524.method6964(arg0, arg1);
	}
}
