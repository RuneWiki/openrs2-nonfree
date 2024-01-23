import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)Z")
	public static boolean method747(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[B)[B")
	public static byte[] method748(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class4_Sub24 local14 = new Class4_Sub24(arg0);
		@Pc(18) int local18 = local14.method3110();
		@Pc(22) int local22 = local14.method3084();
		if (local22 < 0 || Static91.anInt1812 != 0 && local22 > Static91.anInt1812) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(94) byte[] local94 = new byte[local22];
			local14.method3088(local22, local94);
			return local94;
		} else {
			@Pc(50) int local50 = local14.method3084();
			if (local50 < 0 || Static91.anInt1812 != 0 && Static91.anInt1812 < local50) {
				throw new RuntimeException();
			}
			@Pc(70) byte[] local70 = new byte[local50];
			if (local18 == 1) {
				Static275.method4339(local70, local50, arg0, local22);
			} else {
				Static97.aClass165_2.method4232(local14, local70);
			}
			return local70;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V")
	public static void method749(@OriginalArg(0) int arg0) {
		@Pc(4) Class4_Sub2_Sub15 local4 = Static131.method1210(arg0, 1);
		local4.method2875();
	}
}
