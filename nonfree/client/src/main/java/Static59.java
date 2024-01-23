import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!e", name = "L", descriptor = "Lclient!rj;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!gd;")
	public static Class61 aClass61_9 = new Class61(64);

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	public static int anInt1292 = 0;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "[I")
	public static int[] anIntArray86 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
	public static int method927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static195.anIntArrayArrayArray7 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg0 >> 7;
		@Pc(16) int local16 = arg1 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg2;
		@Pc(39) int local39 = arg1 & 0x7F;
		@Pc(43) int local43 = arg0 & 0x7F;
		if (arg2 < 3 && (Static170.aByteArrayArrayArray9[1][local12][local16] & 0x2) == 2) {
			local35 = arg2 + 1;
		}
		@Pc(87) int local87 = Static195.anIntArrayArrayArray7[local35][local12 + 1][local16] * local43 + Static195.anIntArrayArrayArray7[local35][local12][local16] * (128 - local43) >> 7;
		@Pc(118) int local118 = Static195.anIntArrayArrayArray7[local35][local12 + 1][local16 + 1] * local43 + Static195.anIntArrayArrayArray7[local35][local12][local16 + 1] * (128 - local43) >> 7;
		return local87 * (128 - local39) + local118 * local39 >> 7;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public static void method930() {
		Static180.aClass61_30.method1381(5);
		Static293.aClass61_53.method1381(5);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
	public static int method934(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCF) >>> 2);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}
}
