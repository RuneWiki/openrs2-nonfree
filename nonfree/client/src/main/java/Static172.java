import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "Z")
	public static boolean aBoolean300;

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
	public static int anInt4156;

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "[I")
	public static final int[] anIntArray228 = new int[500];

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!nv;IBI)Lclient!tea;")
	public static Class20_Sub4_Sub1 method3380(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean534 || Static439.method6796(arg2) && Static439.method6796(arg0)) {
			return new Class20_Sub4_Sub1(arg1, 3553, arg3, arg2, arg0);
		} else if (arg1.aBoolean521) {
			return new Class20_Sub4_Sub1(arg1, 34037, arg3, arg2, arg0);
		} else {
			return new Class20_Sub4_Sub1(arg1, arg3, arg2, arg0, Static629.method8469(arg2), Static629.method8469(arg0));
		}
	}
}
