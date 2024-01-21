import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "Lclient!rc;")
	public static Class74 aClass74_22 = new Class74(128);

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "Lclient!lf;")
	public static Class49 aClass49_329 = Static32.method683("(U1");

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "Lclient!lf;")
	public static Class49 aClass49_330 = Static32.method683("(U(Y");

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "[I")
	public static int[] anIntArray50 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method474() {
		aClass49_329 = null;
		anIntArray50 = null;
		aClass49_330 = null;
		aClass74_22 = null;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)Z")
	public static boolean method476(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static30.aShortArray1[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1002;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I")
	public static int method477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		return Static91.aClass2_Sub2_Sub17_1 != null && Static91.aClass2_Sub2_Sub17_1.aLong157 == local10 ? Static134.aClass2_Sub13_4.anInt3940 * 99 / (Static134.aClass2_Sub13_4.aByteArray49.length - Static91.aClass2_Sub2_Sub17_1.aByte9) + 1 : 0;
	}
}
