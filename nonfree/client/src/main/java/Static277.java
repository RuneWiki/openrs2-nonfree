import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!ha;")
	public static Class75 aClass75_7;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!lga;")
	public static Class223 aClass223_65;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public static void method4643(@OriginalArg(0) int arg0) {
		@Pc(19) Class6_Sub33 local19 = (Class6_Sub33) Static252.aClass74_67.method1401((long) arg0);
		if (local19 != null) {
			local19.aClass115_Sub1_1.method3254();
			Static159.method3133(local19.anInt5790, local19.aBoolean428);
			local19.method9051();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I")
	public static int method4644(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local14 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local14 == 19 || local14 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
