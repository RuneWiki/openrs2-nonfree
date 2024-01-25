import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!qu", name = "C", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_33 = new Class320(21);

	@OriginalMember(owner = "client!qu", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qu", name = "y", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_142 = new Class397(91, 11);

	@OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
	public static int anInt8426 = 0;

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "(I)I")
	public static int method7180() {
		return Static488.anInt7680 == 1 ? Static511.anInt8098 : 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BZ)I")
	public static int method7181(@OriginalArg(1) boolean arg0) {
		@Pc(14) int local14 = Static488.anInt7680;
		if (local14 == 0) {
			return arg0 ? 0 : Static511.anInt8098;
		} else if (local14 == 1) {
			return Static511.anInt8098;
		} else if (local14 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V")
	public static void method7182() {
		for (@Pc(7) int local7 = 0; local7 < Static510.aByteArrayArrayArray11.length; local7++) {
			for (@Pc(13) int local13 = 0; local13 < Static510.aByteArrayArrayArray11[0].length; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static510.aByteArrayArrayArray11[0][0].length; local17++) {
					Static510.aByteArrayArrayArray11[local7][local13][local17] = 0;
				}
			}
		}
		if (115 != 115) {
			anInt8426 = 120;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)Z")
	public static boolean method7183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
