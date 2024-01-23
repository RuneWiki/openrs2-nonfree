import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!km;")
	public static Class91 aClass91_88;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt2471;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
	public static int[] anIntArray215 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt2472 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1949() {
		Static263.aClass135_37.method3317();
		Static244.aClass135_30.method3317();
		Static55.aClass135_3.method3317();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[BIIZI[Lclient!la;III)V")
	public static void method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class92[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class1_Sub11 local10 = new Class1_Sub11(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method2656();
			if (local20 == 0) {
				return;
			}
			local12 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method2664();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(52) int local52 = local31 >> 12;
				@Pc(56) int local56 = local31 & 0x3F;
				@Pc(62) int local62 = local31 >> 6 & 0x3F;
				@Pc(66) int local66 = local10.method2690();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				if (arg3 == local52 && local62 >= arg8 && arg8 + 8 > local62 && local56 >= arg9 && local56 < arg9 + 8) {
					@Pc(101) Class181 local101 = Static183.method3511(local12);
					@Pc(118) int local118 = Static35.method1447(arg0, local74, local101.anInt5559, local56 & 0x7, local62 & 0x7, local101.anInt5534) + arg1;
					@Pc(135) int local135 = arg6 + Static141.method2347(local101.anInt5559, local62 & 0x7, local74, local56 & 0x7, local101.anInt5534, arg0);
					if (local118 > 0 && local135 > 0 && local118 < 103 && local135 < 103) {
						@Pc(151) Class92 local151 = null;
						if (!arg5) {
							@Pc(156) int local156 = arg4;
							if ((Static260.aByteArrayArrayArray25[1][local118][local135] & 0x2) == 2) {
								local156 = arg4 - 1;
							}
							if (local156 >= 0) {
								local151 = arg7[local156];
							}
						}
						Static2.method135(arg0 + local74 & 0x3, arg4, local151, local70, !arg5, arg4, arg5, local12, local135, local118);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public static void method1952() {
		Static194.aClass135_21.method3324();
		Static281.aClass135_39.method3324();
	}
}
