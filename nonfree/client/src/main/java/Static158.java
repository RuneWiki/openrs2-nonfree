import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
	public static int anInt3845;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "[I")
	public static final int[] anIntArray208 = new int[1];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;Lclient!tn;I)I")
	public static int method3377(@OriginalArg(0) String arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		@Pc(6) int local6 = arg1.anInt10282;
		@Pc(10) byte[] local10 = Static438.method6664(arg0);
		arg1.method8407(local10.length);
		arg1.anInt10282 += Static388.aClass253_1.method6530(arg1.aByteArray106, local10.length, arg1.anInt10282, local10, 0);
		return arg1.anInt10282 - local6;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)I")
	public static int method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
