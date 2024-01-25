import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[S")
	public static short[] aShortArray46;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_44 = new Class208(33, 11);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg5 - 334;
		if (local11 < 0) {
			local11 = 0;
		} else if (local11 > 100) {
			local11 = 100;
		}
		@Pc(35) int local35 = Static281.aShort63 + local11 * (Static431.aShort105 - Static281.aShort63) / 100;
		@Pc(41) int local41 = local35 * arg3 >> 8;
		@Pc(48) int local48 = 16384 - arg4 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg6 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local41;
		if (local48 != 0) {
			local58 = -local41 * Class229.anIntArray537[local48] >> 15;
			local60 = local41 * Class229.anIntArray536[local48] >> 15;
		}
		if (local54 != 0) {
			local56 = local60 * Class229.anIntArray537[local54] >> 15;
			local60 = local60 * Class229.anIntArray536[local54] >> 15;
		}
		Static260.anInt4601 = arg0 - local58;
		Static213.anInt3662 = arg4;
		Static68.anInt1160 = 0;
		Static144.anInt2665 = arg6;
		Static263.anInt4619 = arg2 - local56;
		Static120.anInt2052 = arg1 - local60;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lclient!ec;")
	public static Class65_Sub1 method2529() {
		return Static117.aClass65_Sub1Array1.length > Static34.anInt590 ? Static117.aClass65_Sub1Array1[Static34.anInt590++] : null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZB)Z")
	public static boolean method2532(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static257.aClass75_8.method5972();
		if (arg0 == local12) {
			return true;
		}
		if (!arg0) {
			Static257.aClass75_8.method5975();
		} else if (!Static257.aClass75_8.method5947()) {
			arg0 = false;
		}
		if (local12 == arg0) {
			return false;
		} else {
			Static434.aClass165_Sub1_1.aBoolean296 = arg0;
			Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2536(@OriginalArg(0) String arg0) {
		Static94.method4447("", "", arg0, 0, 0);
	}
}
