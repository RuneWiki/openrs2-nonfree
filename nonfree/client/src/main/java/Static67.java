import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!q;")
	public static Class255 aClass255_10;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "Lclient!oo;")
	public static Class247 aClass247_12;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray83 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZZ)V")
	public static void method8226(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static195.anInt3800++;
			Static266.method6659();
		}
		if (arg0) {
			Static234.anInt4849++;
			Static380.method6134();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method8230(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(17) int local17 = arg0.length();
		while (local9 < local17 && Static134.method6534(arg0.charAt(local9))) {
			local9++;
		}
		while (local9 < local17 && Static134.method6534(arg0.charAt(local17 - 1))) {
			local17--;
		}
		@Pc(50) int local50 = local17 - local9;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(63) StringBuffer local63 = new StringBuffer(local50);
		for (@Pc(65) int local65 = local9; local65 < local17; local65++) {
			@Pc(70) char local70 = arg0.charAt(local65);
			if (Static346.method5844(local70)) {
				@Pc(78) char local78 = Static430.method6818(local70);
				if (local78 != '\u0000') {
					local63.append(local78);
				}
			}
		}
		if (local63.length() == 0) {
			return null;
		} else {
			return local63.toString();
		}
	}
}
