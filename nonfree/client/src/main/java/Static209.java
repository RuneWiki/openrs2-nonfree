import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 aClass1_Sub5_Sub6_Sub1_3;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!rj;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
	public static int[] anIntArray438 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString137 = "Discard";

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
	public static int[] anIntArray439 = new int[1000];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)Lclient!si;")
	public static Class157 method3469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class157 local13 = Static206.method3444(arg0);
		if (arg1 == -1) {
			return local13;
		} else if (local13 == null || local13.aClass157Array2 == null || local13.aClass157Array2.length <= arg1) {
			return null;
		} else {
			return local13.aClass157Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)J")
	public static long method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2573; local13++) {
			@Pc(22) Class45 local22 = local7.aClass45Array2[local13];
			if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1360 == arg1 && local22.anInt1359 == arg2) {
				return local22.aLong56;
			}
		}
		return 0L;
	}
}
