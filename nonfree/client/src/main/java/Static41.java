import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString30 = "flash3:";

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!ar;")
	public static final Class15 aClass15_1 = new Class15(128);

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "[S")
	public static final short[] aShortArray17 = new short[] { 47, 11, 25, 3, 14, 19, 21, 46 };

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
	public static int method773(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)I")
	public static int method775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}
}
