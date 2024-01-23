import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	public static int anInt1941;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "[I")
	public static int[] anIntArray150 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public static int anInt1940 = 0;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!ll;")
	public static Class114 aClass114_10 = new Class114();

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "[Lclient!eg;")
	public static Class46[] aClass46Array1 = new Class46[14];

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public static int anInt1943 = 0;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)I")
	public static int method1474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = Static158.anIntArray295[Static180.method2925(arg2, arg0)];
		if (arg1 > 0) {
			@Pc(26) int local26 = Static158.anInterface5_1.method450(arg1 & 0xFFFF);
			@Pc(42) int local42;
			@Pc(61) int local61;
			if (local26 != 0) {
				if (arg0 < 0) {
					local42 = 0;
				} else if (arg0 > 127) {
					local42 = 16777215;
				} else {
					local42 = arg0 * 131586;
				}
				if (local26 == 256) {
					local16 = local42;
				} else {
					local61 = 256 - local26;
					local16 = (local61 * (local16 & 0xFF00FF) + local26 * (local42 & 0xFF00FF) & 0xFF00FF00) + ((local42 & 0xFF00) * local26 + ((local16 & 0xFF00) * local61) & 0xFF0000) >> 8;
				}
			}
			local42 = Static158.anInterface5_1.method447(arg1 & 0xFFFF);
			if (local42 != 0) {
				local42 += 256;
				@Pc(118) int local118 = local42 * (local16 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				local61 = (local16 >> 8 & 0xFF) * local42;
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(144) int local144 = (local16 & 0xFF) * local42;
				if (local144 > 65535) {
					local144 = 65535;
				}
				local16 = (local118 << 8 & 0xFF0066) - (-(local61 & 0xFF00) - (local144 >> 8));
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
	public static void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(6) int local6 = arg0; local6 <= arg2; local6++) {
			Static99.method1656(Static220.anIntArrayArray36[local6], arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZC)Z")
	public static boolean method1478(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	public static void method1479() {
		@Pc(3) int local3 = Static201.anInt3890;
		@Pc(9) int local9 = Static181.anInt3455;
		@Pc(11) int local11 = Static234.anInt4441;
		@Pc(19) int local19 = Static122.anInt2394;
		if (Static94.aBoolean138) {
			Static104.method1702(local3, local9, local11, local19, 6116423);
			Static104.method1702(local3 + 1, local9 + 1, local11 - 2, 16, 0);
			Static104.method1691(local3 + 1, local9 + 18, local11 - 2, local19 + -19, 0);
		} else {
			Static270.method4242(local3, local9, local11, local19, 6116423);
			Static270.method4242(local3 + 1, local9 - -1, local11 - 2, 16, 0);
			Static270.method4259(local3 + 1, local9 + 18, local11 - 2, local19 + -19, 0);
		}
		Static211.aClass4_Sub3_Sub5_3.method2266(Static171.aString202, local3 + 3, local9 + 14, 6116423, -1);
		@Pc(100) int local100 = Static286.anInt5358;
		@Pc(102) int local102 = Static312.anInt6042;
		for (@Pc(104) int local104 = 0; local104 < Static300.anInt5638; local104++) {
			@Pc(125) int local125 = local9 + (Static300.anInt5638 + -1 + -local104) * 15 + 31;
			@Pc(127) int local127 = 16777215;
			if (local100 > local3 && local3 + local11 > local100 && local102 > local125 - 13 && local102 < local125 + 3) {
				local127 = 16776960;
			}
			Static211.aClass4_Sub3_Sub5_3.method2266(Static190.method3005(local104), local3 + 3, local125, local127, 0);
		}
		Static89.method1559(Static201.anInt3890, Static181.anInt3455, Static122.anInt2394, Static234.anInt4441);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public static void method1480() {
		Static112.anInt5406 = 0;
		@Pc(13) int local13 = (Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7) + Static220.anInt3983;
		@Pc(20) int local20 = Static295.anInt5480 + (Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static112.anInt5406 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static112.anInt5406 = 1;
		}
		if (Static112.anInt5406 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static112.anInt5406 = 0;
		}
	}
}
