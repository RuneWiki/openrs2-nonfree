import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static456 {

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!oi;")
	public static Class185 aClass185_58;

	@OriginalMember(owner = "client!wm", name = "S", descriptor = "Lclient!qi;")
	public static final Class208 aClass208_21 = new Class208(8);

	@OriginalMember(owner = "client!wm", name = "qb", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!wm", name = "zb", descriptor = "I")
	public static int anInt3744 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Z")
	public static boolean method2876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static86.method5984(arg1, arg0) | (arg0 & 0x40000) != 0 || Static275.method3737(arg1, arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)I")
	public static int method2931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static177.anIntArray236[arg0 & 0x3] : Static184.anIntArray249[arg0 & 0x3];
	}
}
