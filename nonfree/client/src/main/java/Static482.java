import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Lclient!pj;")
	public static Class248 aClass248_93;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "[S")
	public static final short[] aShortArray139 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "[Lclient!rs;")
	public static final Class6_Sub5_Sub15[] aClass6_Sub5_Sub15Array13 = new Class6_Sub5_Sub15[14];

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray72 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "Lclient!dg;")
	public static final Class72 aClass72_11 = new Class72();

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "S")
	public static short aShort105 = 32767;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public static void method6777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static97.anInt1562; local7++) {
			@Pc(13) Rectangle local13 = Class343.aRectangleArray5[local7];
			if (local13.x + local13.width > arg2 && local13.x < arg1 + arg2 && arg0 < local13.height + local13.y && local13.y < arg3 + arg0) {
				Static366.aBooleanArray23[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBI)I")
	public static int method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
	}
}
