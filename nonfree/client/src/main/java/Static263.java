import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	public static int anInt3675;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_122 = new Class102(15, 8);

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
	public static void method2958() {
		for (@Pc(7) int local7 = 0; local7 < Static253.aByteArrayArrayArray11.length; local7++) {
			for (@Pc(13) int local13 = 0; local13 < Static253.aByteArrayArrayArray11[0].length; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static253.aByteArrayArrayArray11[0][0].length; local17++) {
					Static253.aByteArrayArrayArray11[local7][local13][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Lclient!gk;")
	public static Class65_Sub1 method2959() {
		return Static16.anInt207 < Static85.aClass65_Sub1Array3.length ? Static85.aClass65_Sub1Array3[Static16.anInt207++] : null;
	}
}
