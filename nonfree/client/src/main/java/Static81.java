import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Lclient!ag;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Lclient!sf;")
	public static Class157 aClass157_15 = new Class157(50);

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
	public static int[] anIntArray166 = new int[1000];

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public static int anInt1915 = 100;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
	public static String method1476(@OriginalArg(1) int arg0) {
		return arg0 >= 0 ? Static80.method1472(arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1477(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 = (local12 << 5) + (Static223.method3683(arg0.charAt(local17)) - local12);
		}
		return local12;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI[B[Lclient!rm;II)V")
	public static void method1478(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class154[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Class2_Sub16 local6 = new Class2_Sub16(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local6.method2157();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local6.method2161();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(56) int local56 = local35 >> 6 & 0x3F;
				@Pc(60) int local60 = arg3 + local56;
				@Pc(64) int local64 = local6.method2146();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local35 & 0x3F;
				@Pc(76) int local76 = local64 & 0x3;
				@Pc(80) int local80 = local35 >> 12;
				@Pc(84) int local84 = arg4 + local72;
				if (local60 > 0 && local84 > 0 && local60 < 103 && local84 < 103) {
					@Pc(100) Class154 local100 = null;
					if (!arg0) {
						@Pc(104) int local104 = local80;
						if ((Static13.aByteArrayArrayArray2[1][local60][local84] & 0x2) == 2) {
							local104 = local80 - 1;
						}
						if (local104 >= 0) {
							local100 = arg2[local104];
						}
					}
					Static59.method1138(local80, local60, !arg0, local76, local84, local68, local20, arg0, local100, local80);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!g;III)V")
	public static void method1479(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static199.aClass56_19 != null || Static196.aBoolean281 || (arg0 == null || Static13.method240(arg0) == null)) {
			return;
		}
		Static199.aClass56_19 = arg0;
		Static192.aClass56_18 = Static13.method240(arg0);
		Static215.anInt4386 = arg2;
		Static229.anInt4618 = arg1;
		Static40.aBoolean63 = false;
		Static44.anInt1146 = 0;
	}
}
