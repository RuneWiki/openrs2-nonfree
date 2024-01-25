import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!dk;")
	public static Class54 aClass54_44;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "[I")
	public static int[] anIntArray199;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)I")
	public static int method2125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local19;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method2126() {
		@Pc(9) int[] local9 = new int[Static384.aClass164_2.anInt4231];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static384.aClass164_2.anInt4231; local13++) {
			@Pc(20) Class208 local20 = Static384.aClass164_2.method3458(local13);
			if (local20.anInt5702 >= 0 || local20.anInt5703 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static67.anIntArray106 = new int[local11];
		for (@Pc(56) int local56 = 0; local56 < local11; local56++) {
			Static67.anIntArray106[local56] = local9[local56];
		}
	}
}
