import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "[I")
	public static int[] anIntArray453 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!gj;IIZI)V")
	public static void method3906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static142.method2263(0, arg2.anInt4623, arg3, arg2.anInt4601, arg1, arg0, arg5, arg4);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class146 method3908(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static313.aClass146ArrayArray1[local7] == null || Static313.aClass146ArrayArray1[local7][local11] == null) {
			@Pc(27) boolean local27 = Static183.method3031(local7);
			if (!local27) {
				return null;
			}
		}
		return Static313.aClass146ArrayArray1[local7][local11];
	}
}
