import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!pk;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_17 = new Class134(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method694(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(12) Class2_Sub8 local12 = null;
		for (@Pc(17) Class2_Sub8 local17 = (Class2_Sub8) Static225.aClass156_28.method3155(); local17 != null; local17 = (Class2_Sub8) Static225.aClass156_28.method3150()) {
			if (arg0 == local17.anInt831 && local17.anInt827 == arg6 && arg2 == local17.anInt826 && arg1 == local17.anInt837) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class2_Sub8();
			local12.anInt827 = arg6;
			local12.anInt826 = arg2;
			local12.anInt831 = arg0;
			local12.anInt837 = arg1;
			if (arg6 >= 0 && arg2 >= 0 && arg6 < Static166.anInt2852 && Static426.anInt6923 > arg2) {
				Static181.method2508(local12);
			}
			Static225.aClass156_28.method3157(local12);
		}
		local12.anInt834 = -1;
		local12.anInt824 = arg4;
		local12.anInt832 = 0;
		local12.anInt836 = arg5;
		local12.anInt833 = arg3;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)I")
	public static int method700(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(44) int local44 = (arg0 & 0x7F) * 96 >> 7;
			if (local44 < 2) {
				local44 = 2;
			} else if (local44 > 126) {
				local44 = 126;
			}
			return (arg0 & 0xFF80) + local44;
		}
	}
}
