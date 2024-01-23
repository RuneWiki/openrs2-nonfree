import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!jo;")
	public static Class96 aClass96_18;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	public static int anInt4033;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "J")
	public static long aLong152;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public static void method3494() {
		Static273.aClass175_40.method4294();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIIIII)V")
	public static void method3495(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static2.anInt94 = arg3;
		Static13.anInt277 = arg2;
		Static54.anInt1168 = arg1;
		Static108.anInt2261 = arg4;
		Static261.anInt4825 = arg5;
		if (arg0 && Static54.anInt1168 >= 100) {
			Static273.anInt5035 = Static13.anInt277 * 128 + 64;
			Static87.anInt1875 = Static108.anInt2261 * 128 + 64;
			Static283.anInt5144 = Static42.method768(Static273.anInt5035, Static132.anInt2608, Static87.anInt1875) - Static261.anInt4825;
		}
		Static228.anInt4270 = 2;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
	public static void method3496(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static19.method322(arg0)) {
			return;
		}
		@Pc(27) Class157[] local27 = Static176.aClass157ArrayArray1[arg0];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(37) Class157 local37 = local27[local29];
			if (local37.anObjectArray7 != null) {
				@Pc(44) Class1_Sub29 local44 = new Class1_Sub29();
				local44.aClass157_13 = local37;
				local44.anObjectArray2 = local37.anObjectArray7;
				Static99.method1928(local44, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	public static void method3497() {
		while (true) {
			if (Static10.aClass1_Sub13_Sub1_117.method1886(Static5.anInt204) >= 27) {
				@Pc(23) int local23 = Static10.aClass1_Sub13_Sub1_117.method1883(15);
				if (local23 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static138.aClass11_Sub4_Sub2Array2[local23] == null) {
						local28 = true;
						Static138.aClass11_Sub4_Sub2Array2[local23] = new Class11_Sub4_Sub2();
					}
					@Pc(45) Class11_Sub4_Sub2 local45 = Static138.aClass11_Sub4_Sub2Array2[local23];
					Static288.anIntArray572[Static1.anInt48++] = local23;
					local45.anInt3822 = Static167.anInt637;
					if (local45.aClass183_1 != null && local45.aClass183_1.method4524()) {
						Static47.method897(local45);
					}
					@Pc(73) int local73 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
					@Pc(78) int local78 = Static10.aClass1_Sub13_Sub1_117.method1883(5);
					@Pc(83) int local83 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
					if (local78 > 15) {
						local78 -= 32;
					}
					if (local83 == 1) {
						Static18.anIntArray36[Static125.anInt2513++] = local23;
					}
					@Pc(111) int local111 = Static54.anIntArray92[Static10.aClass1_Sub13_Sub1_117.method1883(3)];
					if (local28) {
						local45.anInt3853 = local45.anInt3852 = local111;
					}
					local45.method3365(Static275.method4210(Static10.aClass1_Sub13_Sub1_117.method1883(14)));
					@Pc(134) int local134 = Static10.aClass1_Sub13_Sub1_117.method1883(5);
					if (local134 > 15) {
						local134 -= 32;
					}
					local45.method3352(local45.aClass183_1.anInt5436);
					local45.anInt3803 = local45.aClass183_1.anInt5425;
					local45.anInt3813 = local45.aClass183_1.anInt5442;
					if (local45.anInt3813 == 0) {
						local45.anInt3852 = 0;
					}
					local45.method3355(local134 + Static138.aClass11_Sub4_Sub1_3.anIntArray406[0], local73 == 1, local78 + Static138.aClass11_Sub4_Sub1_3.anIntArray407[0], local45.method3347());
					if (local45.aClass183_1.method4524()) {
						Static219.method3547(local45.anIntArray406[0], local45.anIntArray407[0], local45, Static132.anInt2608, 0, null, null);
					}
					continue;
				}
			}
			Static10.aClass1_Sub13_Sub1_117.method1890();
			return;
		}
	}
}
