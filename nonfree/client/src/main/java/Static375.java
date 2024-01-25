import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!sk;")
	public static Class3_Sub2_Sub1_Sub2 aClass3_Sub2_Sub1_Sub2_7;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!l;")
	public static Class17 aClass17_44;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public static int anInt5832 = -1;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4698(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	public static void method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static225.anIntArrayArray41 != null) {
			Static225.anIntArrayArray41[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static74.aByteArrayArray12 != null) {
			Static74.aByteArrayArray12[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static360.aByteArrayArray56 != null) {
			Static360.aByteArrayArray56[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBII)I")
	public static int method4700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}
