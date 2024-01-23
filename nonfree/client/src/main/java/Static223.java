import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public static int anInt4191 = 0;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public static int anInt4195 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZ)I")
	public static int method3596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBILclient!si;)V")
	public static void method3597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class157 arg2) {
		if (Static241.anInt4470 < 2 && Static101.anInt2152 == 0 && !Static187.aBoolean318) {
			return;
		}
		@Pc(18) String local18 = Static311.method4644();
		if (arg2 == null) {
			@Pc(81) int local81 = Static19.aClass1_Sub5_Sub9_1.method2853(local18, arg0 + 4, arg1 - -15, Static103.aRandom1, Static35.anInt657);
			Static111.method2031(arg1, 15, arg0 + 4, local81 + Static19.aClass1_Sub5_Sub9_1.method2860(local18));
			return;
		}
		@Pc(25) Class1_Sub5_Sub9 local25 = arg2.method3969(Static277.aClass57Array5);
		if (local25 == null) {
			local25 = Static19.aClass1_Sub5_Sub9_1;
		}
		local25.method2865(local18, arg0, arg1, arg2.anInt4680, arg2.anInt4689, arg2.anInt4703, arg2.anInt4675, arg2.anInt4687, arg2.anInt4677, Static103.aRandom1, Static35.anInt657, Static302.anIntArray597);
		Static111.method2031(Static302.anIntArray597[1], Static302.anIntArray597[3], Static302.anIntArray597[0], Static302.anIntArray597[2]);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method3598() {
		while (true) {
			if (Static10.aClass1_Sub13_Sub1_117.method1886(Static5.anInt204) >= 11) {
				@Pc(22) int local22 = Static10.aClass1_Sub13_Sub1_117.method1883(11);
				if (local22 != 2047) {
					@Pc(31) boolean local31 = false;
					if (Static14.aClass11_Sub4_Sub1Array1[local22] == null) {
						Static14.aClass11_Sub4_Sub1Array1[local22] = new Class11_Sub4_Sub1();
						local31 = true;
						if (Static197.aClass1_Sub13Array1[local22] != null) {
							Static14.aClass11_Sub4_Sub1Array1[local22].method2581(Static197.aClass1_Sub13Array1[local22]);
						}
					}
					Static135.anIntArray210[Static275.anInt5043++] = local22;
					@Pc(69) Class11_Sub4_Sub1 local69 = Static14.aClass11_Sub4_Sub1Array1[local22];
					local69.anInt3822 = Static167.anInt637;
					@Pc(79) int local79 = Static54.anIntArray92[Static10.aClass1_Sub13_Sub1_117.method1883(3)];
					if (local31) {
						local69.anInt3853 = local69.anInt3852 = local79;
					}
					@Pc(95) int local95 = Static10.aClass1_Sub13_Sub1_117.method1883(5);
					@Pc(102) int local102 = Static10.aClass1_Sub13_Sub1_117.method1883(5);
					if (local102 > 15) {
						local102 -= 32;
					}
					@Pc(113) int local113 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
					if (local113 == 1) {
						Static18.anIntArray36[Static125.anInt2513++] = local22;
					}
					if (local95 > 15) {
						local95 -= 32;
					}
					@Pc(138) int local138 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
					local69.method2584(local138 == 1, Static138.aClass11_Sub4_Sub1_3.anIntArray407[0] + local102, local95 + Static138.aClass11_Sub4_Sub1_3.anIntArray406[0]);
					continue;
				}
			}
			Static10.aClass1_Sub13_Sub1_117.method1890();
			return;
		}
	}
}
