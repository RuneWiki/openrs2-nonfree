import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public static int anInt2627;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "Lclient!ho;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Z")
	public static boolean aBoolean159;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Lclient!cj;")
	public static Class27 aClass27_11;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Lclient!ln;")
	public static Class104 aClass104_4;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public static int anInt2631 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg6 < 1 || arg1 > 102 || arg6 > 102) {
			return;
		}
		@Pc(45) int local45;
		if (!Static241.method3782() && (Static303.aByteArrayArrayArray19[0][arg1][arg6] & 0x2) == 0) {
			local45 = arg4;
			if ((Static303.aByteArrayArrayArray19[arg4][arg1][arg6] & 0x8) != 0) {
				local45 = 0;
			}
			if (local45 != Static204.anInt4430) {
				return;
			}
		}
		local45 = arg4;
		if (arg4 < 3 && (Static303.aByteArrayArrayArray19[1][arg1][arg6] & 0x2) == 2) {
			local45 = arg4 + 1;
		}
		Static299.method4565(arg2, Static82.aClass75Array1[arg4], local45, arg6, arg4, arg1);
		if (arg3 >= 0) {
			@Pc(108) boolean local108 = Static293.aBoolean364;
			Static293.aBoolean364 = true;
			Static247.method3808(arg3, false, arg4, arg5, arg0, local45, arg6, arg1, false, Static82.aClass75Array1[arg4]);
			Static293.aBoolean364 = local108;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	public static void method1967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(10, arg0);
		local8.method4468();
		local8.anInt5849 = arg1;
		local8.anInt5843 = arg3;
		local8.anInt5852 = arg2;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lclient!aj;")
	public static Class7 method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt45; local13++) {
			@Pc(22) Class7 local22 = local7.aClass7Array1[local13];
			if ((local22.aLong7 >> 29 & 0x3L) == 2L && local22.anInt214 == arg1 && local22.anInt220 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!qm;Ljava/lang/String;I)I")
	public static int method1969(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt3000;
		@Pc(10) byte[] local10 = Static158.method1927(arg1);
		arg0.method2225(local10.length);
		arg0.anInt3000 += Static12.aClass70_2.method1732(0, local10, arg0.aByteArray55, local10.length, arg0.anInt3000);
		return arg0.anInt3000 - local6;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	public static void method1972() {
		Static2.aClass1_Sub14_Sub1_1.method2252(193);
		Static2.aClass1_Sub14_Sub1_1.method2191(0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)I")
	public static int method1974(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static106.method1772(arg0);
	}
}
