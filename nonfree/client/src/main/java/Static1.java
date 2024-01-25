import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt2;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "S")
	public static short aShort1 = 320;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)I")
	public static int method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(27) int local27 = local13 * (arg1 & 0x7F) + (arg0 & 0x7F) * arg2 >> 7;
		@Pc(41) int local41 = arg2 * (arg0 & 0x380) + local13 * (arg1 & 0x380) >> 7;
		@Pc(56) int local56 = local13 * (arg1 & 0xFC00) + (arg0 & 0xFC00) * arg2 >> 7;
		return local41 & 0x380 | local56 & 0xFC00 | local27 & 0x7F;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	public static void method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass3_Sub4_3 != null) {
			local7.aClass3_Sub4_3 = null;
		}
		if (local7.aClass3_Sub4_2 != null) {
			local7.aClass3_Sub4_2 = null;
		}
	}
}
