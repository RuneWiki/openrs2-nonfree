import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt255;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 aClass1_Sub2_Sub5_Sub3_2;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_219 = Static118.method2249("Loaded sprites");

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!oc;")
	public static Class65 aClass65_217 = aClass65_219;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "[I")
	public static final int[] anIntArray31 = new int[256];

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_218 = Static118.method2249("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public static int anInt259 = 0;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt260 = -1;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	public static int anInt261 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
	public static boolean method204(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)I")
	public static int method205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg0;
			arg0 = local8;
		}
		@Pc(16) int local16 = arg3 & 0x3;
		if (local16 == 0) {
			return arg1;
		} else if (local16 == 1) {
			return 1 + 7 - arg5 - arg2;
		} else if (local16 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return arg5;
		}
	}
}
