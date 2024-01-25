import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!lt;")
	public static Class159 aClass159_3;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!ph;")
	public static Class187 aClass187_95;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!ka;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "J")
	public static long aLong190 = -1L;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)I")
	public static int method4415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(27) int local27 = (arg0 & 0x7F) * arg2 + local13 * (arg1 & 0x7F) >> 7;
		@Pc(47) int local47 = local13 * (arg1 & 0x380) + (arg0 & 0x380) * arg2 >> 7;
		@Pc(61) int local61 = arg2 * (arg0 & 0xFC00) + local13 * (arg1 & 0xFC00) >> 7;
		return local47 & 0x380 | local61 & 0xFC00 | local27 & 0x7F;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([BI)[B")
	public static byte[] method4417(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local6];
		Static468.method4350(arg0, 0, local16, 0, local6);
		return local16;
	}
}
