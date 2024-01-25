import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static71 {

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!cfa", name = "o", descriptor = "Z")
	public static final boolean aBoolean69 = false;

	@OriginalMember(owner = "client!cfa", name = "s", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_51 = new Class196(100, 5);

	@OriginalMember(owner = "client!cfa", name = "x", descriptor = "[I")
	public static final int[] anIntArray63 = new int[3];

	@OriginalMember(owner = "client!cfa", name = "G", descriptor = "Lclient!pb;")
	public static final Class267 aClass267_2 = new Class267("LIVE", "", "", 0);

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method1042() {
		return Static423.aBoolean549 || Static529.aClass5_Sub2_Sub13_5 == null ? "" : Static529.aClass5_Sub2_Sub13_5.aString68;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method1044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static317.aByteArrayArrayArray13[0][arg1][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static317.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x10) == 0) {
			return Static206.method2867(arg1, arg0, arg2) == arg3;
		} else {
			return false;
		}
	}
}
