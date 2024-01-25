import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "Lclient!wfa;")
	public static final Class5_Sub49 aClass5_Sub49_1 = new Class5_Sub49(0, -1);

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "[I")
	public static final int[] anIntArray74 = new int[14];

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
	public static int anInt926 = 0;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_4 = new Class148(14, 5);

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "[I")
	public static final int[] anIntArray75 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z")
	public static boolean method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static248.method3792(arg0, arg1) || Static194.method3065(arg0, arg1) || Static83.method7208(arg0, arg1);
	}
}
