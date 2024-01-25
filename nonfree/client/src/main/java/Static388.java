import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
	public static int anInt6925;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "F")
	public static float aFloat129;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
	public static int anInt6926;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "[I")
	public static final int[] anIntArray391 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_138 = new Class359(125, -1);

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
	public static int anInt6928 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)I")
	public static int method5737(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local13 >> 12;
	}
}
