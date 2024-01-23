import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!rn;")
	public static Class155 aClass155_92;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public static int anInt4337;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString155 = "Loading interfaces - ";

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "J")
	public static long aLong183 = 0L;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public static int anInt4338 = 0;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt4339 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIZI)Ljava/lang/String;")
	public static String method3633(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(29) int local29 = arg0[arg2 + local17] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(51) char local51 = Static202.aCharArray30[local29 - 128];
					if (local51 == '\u0000') {
						local51 = '?';
					}
					local29 = local51;
				}
				local13[local15++] = (char) local29;
			}
		}
		return new String(local13, 0, local15);
	}
}
