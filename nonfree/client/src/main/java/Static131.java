import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public static int anInt2857;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
	public static int anInt2859;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_75 = new Class208(55, 5);

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	public static int anInt2860 = 0;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean199 = true;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ab;B)Z")
	public static boolean method2285(@OriginalArg(0) Class3 arg0) {
		if (Static26.anInt375 == arg0.anInt59) {
			Static54.anInt1175 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIZIZ)V")
	public static void method2287(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg0 && arg3 == Static196.anInt2477 && Static15.anInt270 == arg1 && (Static241.anInt2711 == Static73.anInt1627 || Static40.method575())) {
			return;
		}
		Static73.anInt1627 = Static241.anInt2711;
		Static15.anInt270 = arg1;
		Static196.anInt2477 = arg3;
		if (Static40.method575()) {
			Static73.anInt1627 = 0;
		}
		if (arg2) {
			Static181.method3326(28);
		} else {
			Static181.method3326(25);
		}
		Static88.method1497(true, Static31.aClass44_1, Static87.aClass62_60.method1389(Static200.anInt4144));
		@Pc(59) int local59 = Static279.anInt5198;
		@Pc(61) int local61 = Static350.anInt6470;
		Static279.anInt5198 = (Static196.anInt2477 - (Static89.anInt1891 >> 4)) * 8;
		Static350.anInt6470 = (Static15.anInt270 - (Static85.anInt1839 >> 4)) * 8;
		Static190.aClass2_Sub7_Sub12_2 = Static20.method4157(Static196.anInt2477 * 8, Static15.anInt270 * 8);
		Static206.aClass215_2 = null;
		@Pc(92) int local92 = Static279.anInt5198 - local59;
		@Pc(96) int local96 = Static350.anInt6470 - local61;
		@Pc(100) int local100;
		@Pc(110) int local110;
		if (arg2) {
			Static123.anInt5933 = 0;
			local100 = Static89.anInt1891 * 128 - 128;
			@Pc(170) int local170 = (Static85.anInt1839 - 1) * 128;
			for (local110 = 0; local110 < 32768; local110++) {
				@Pc(178) Class1_Sub2_Sub1_Sub2 local178 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local110];
				if (local178 != null) {
					local178.anInt6800 -= local92 * 128;
					local178.anInt6798 -= local96 * 128;
					if (local178.anInt6800 >= 0 && local100 >= local178.anInt6800 && local178.anInt6798 >= 0 && local170 >= local178.anInt6798) {
						@Pc(227) boolean local227 = true;
						for (@Pc(229) int local229 = 0; local229 < 10; local229++) {
							local178.anIntArray466[local229] -= local92;
							local178.anIntArray465[local229] -= local96;
							if (local178.anIntArray466[local229] < 0 || local178.anIntArray466[local229] >= Static89.anInt1891 || local178.anIntArray465[local229] < 0 || local178.anIntArray465[local229] >= Static85.anInt1839) {
								local227 = false;
							}
						}
						if (local227) {
							Static373.anIntArray577[Static123.anInt5933++] = local110;
						} else {
							Static223.aClass1_Sub2_Sub1_Sub2Array1[local110].method4807(null);
							Static223.aClass1_Sub2_Sub1_Sub2Array1[local110] = null;
						}
					} else {
						Static223.aClass1_Sub2_Sub1_Sub2Array1[local110].method4807(null);
						Static223.aClass1_Sub2_Sub1_Sub2Array1[local110] = null;
					}
				}
			}
		} else {
			for (local100 = 0; local100 < 32768; local100++) {
				@Pc(106) Class1_Sub2_Sub1_Sub2 local106 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local100];
				if (local106 != null) {
					for (local110 = 0; local110 < 10; local110++) {
						local106.anIntArray466[local110] -= local92;
						local106.anIntArray465[local110] -= local96;
					}
					local106.anInt6798 -= local96 * 128;
					local106.anInt6800 -= local92 * 128;
				}
			}
		}
		for (local100 = 0; local100 < 2048; local100++) {
			@Pc(313) Class1_Sub2_Sub1_Sub1 local313 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local100];
			if (local313 != null) {
				for (local110 = 0; local110 < 10; local110++) {
					local313.anIntArray466[local110] -= local92;
					local313.anIntArray465[local110] -= local96;
				}
				local313.anInt6800 -= local92 * 128;
				local313.anInt6798 -= local96 * 128;
			}
		}
		Static160.method2835(local92, local96);
		for (@Pc(372) Class2_Sub15 local372 = (Class2_Sub15) Static35.aClass238_3.method5795(); local372 != null; local372 = (Class2_Sub15) Static35.aClass238_3.method5799()) {
			local372.anInt2545 -= local96;
			local372.anInt2548 -= local92;
			if (local372.anInt2548 < 0 || local372.anInt2545 < 0 || local372.anInt2548 >= Static89.anInt1891 || Static85.anInt1839 <= local372.anInt2545) {
				local372.method6130();
			}
		}
		Static277.anInt5160 = 0;
		if (Static391.anInt7123 != 0) {
			Static391.anInt7123 -= local92;
			Static280.anInt5248 -= local96;
		}
		if (arg2) {
			Static182.anInt3889 -= local92;
			Static141.anInt3014 -= local92;
			Static226.anInt4563 -= local96;
			Static178.anInt3759 -= local96;
			Static145.anInt5345 -= local92 * 128;
			Static27.anInt2842 -= local96 * 128;
			if (Math.abs(local92) > Static89.anInt1891 || Math.abs(local96) > Static85.anInt1839) {
				Static370.method4288();
			}
		} else if (Static198.anInt4108 == 4) {
			Static124.anInt4240 -= local92 * 128;
			Static273.anInt5127 -= local96 * 128;
			Static211.anInt4264 -= local96 * 128;
			Static74.anInt1635 -= local92 * 128;
		} else {
			Static198.anInt4108 = 1;
		}
		Static282.method4699();
		Static124.method3771();
		Static248.aClass238_25.method5806();
		Static307.aClass238_33.method5806();
		Static119.aClass199_2.method4905();
		Static78.method1357();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
	public static int method2288(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Lclient!pi;")
	public static Class35_Sub1 method2289(@OriginalArg(1) int arg0) {
		return Static108.aBoolean179 && arg0 >= Static392.anInt7143 && arg0 <= Static23.anInt351 ? Static266.aClass35_Sub1Array2[arg0 - Static392.anInt7143] : null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILclient!cu;Lclient!oj;I)V")
	public static void method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) Class48 arg4) {
		@Pc(11) Class173 local11 = Static197.aClass30_2.method539(arg3.anInt1244);
		if (local11.anInt4835 == -1) {
			return;
		}
		if (arg3.aBoolean102) {
			@Pc(25) int local25 = arg1 + arg3.anInt1272;
			arg1 = local25 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(41) Class27 local41 = local11.method4358(arg1, arg4, arg3.lb);
		if (local41 == null) {
			return;
		}
		@Pc(47) int local47 = arg3.anInt1247;
		@Pc(50) int local50 = arg3.anInt1241;
		if ((arg1 & 0x1) == 1) {
			local47 = arg3.anInt1241;
			local50 = arg3.anInt1247;
		}
		@Pc(66) int local66 = local41.method5317();
		@Pc(69) int local69 = local41.method5328();
		if (local11.aBoolean355) {
			local69 = local50 * 4;
			local66 = local47 * 4;
		}
		if (local11.anInt4838 == 0) {
			local41.method5321(arg2, arg0 + 4 - local50 * 4, local66, local69);
		} else {
			local41.method5334(arg2, arg0 - (local50 - 1) * 4, local66, local69, 1, local11.anInt4838 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method2293() {
		if (Static157.aClass89_2 != null) {
			Static157.aClass89_2.method5853();
		}
		if (Static42.aClass89_1 != null) {
			Static42.aClass89_1.method5853();
		}
	}
}
