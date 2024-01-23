import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!na", name = "S", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_26;

	@OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
	public static int anInt3131;

	@OriginalMember(owner = "client!na", name = "fb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_596 = Static199.method3560("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
	public static int anInt3129 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
	public static void method2443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(20) int local20 = Static80.method1342(arg1 + arg0, Static6.anInt187, Static101.anInt2213);
		@Pc(29) int local29 = Static80.method1342(arg0 - arg1, Static6.anInt187, Static101.anInt2213);
		@Pc(36) int local36 = -1;
		Static221.method3893(arg2, local29, Static183.anIntArrayArray40[arg3], local20);
		while (local9 > local7) {
			local36 += 2;
			local12 += local36;
			@Pc(73) int local73;
			@Pc(68) int local68;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local68 = arg3 + local9;
				local73 = arg3 - local9;
				if (local68 >= Static73.anInt1576 && Static137.anInt3137 >= local73) {
					local91 = Static80.method1342(local7 + arg0, Static6.anInt187, Static101.anInt2213);
					local100 = Static80.method1342(arg0 - local7, Static6.anInt187, Static101.anInt2213);
					if (local68 <= Static137.anInt3137) {
						Static221.method3893(arg2, local100, Static183.anIntArrayArray40[local68], local91);
					}
					if (local73 >= Static73.anInt1576) {
						Static221.method3893(arg2, local100, Static183.anIntArrayArray40[local73], local91);
					}
				}
			}
			local7++;
			local68 = local7 + arg3;
			local73 = arg3 - local7;
			if (Static73.anInt1576 <= local68 && local73 <= Static137.anInt3137) {
				local91 = Static80.method1342(local9 + arg0, Static6.anInt187, Static101.anInt2213);
				local100 = Static80.method1342(arg0 - local9, Static6.anInt187, Static101.anInt2213);
				if (local68 <= Static137.anInt3137) {
					Static221.method3893(arg2, local100, Static183.anIntArrayArray40[local68], local91);
				}
				if (Static73.anInt1576 <= local73) {
					Static221.method3893(arg2, local100, Static183.anIntArrayArray40[local73], local91);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII)I")
	public static int method2445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub26 local15 = (Class2_Sub26) Static48.aClass103_6.method3659((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && local15.anIntArray605.length > arg0) {
			return local15.anIntArray605[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Lclient!gi;")
	public static Class2_Sub3_Sub12 method2446(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub12 local10 = (Class2_Sub3_Sub12) Static171.aClass110_17.method3891((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static223.aClass72_282.method3197(arg0, 1);
		local10 = new Class2_Sub3_Sub12();
		if (local25 != null) {
			local10.method1256(new Class2_Sub23(local25), arg0);
		}
		Static171.aClass110_17.method3894(local10, (long) arg0);
		return local10;
	}
}
