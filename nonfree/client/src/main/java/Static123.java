import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array7;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "Lclient!te;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "[Lclient!ob;")
	public static Class60[] aClass60Array2;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
	public static int[] anIntArray428 = new int[5];

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Lclient!bf;")
	public static Class10 aClass10_10 = new Class10(4096);

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1192 = Static169.method2903("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1194 = Static169.method2903("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1193 = aClass23_1194;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1195 = null;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public static void method2188() {
		aClass23_1192 = null;
		aClass23_1195 = null;
		aClass80_1 = null;
		aLongArray6 = null;
		aClass23_1193 = null;
		aClass1_Sub1_Sub12_Sub1Array7 = null;
		aClass60Array2 = null;
		aClass23_1194 = null;
		aClass10_10 = null;
		anIntArray428 = null;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	public static void method2189() {
		Static8.aBoolean17 = false;
		Static159.aBoolean196 = false;
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
	public static int method2190() {
		return Static7.anInt319++;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILclient!ed;I)V")
	public static void method2191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class23 arg3) {
		@Pc(4) Class60 local4 = Static120.method2104(arg2, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray27 != null) {
			@Pc(18) Class1_Sub13 local18 = new Class1_Sub13();
			local18.aClass23_1021 = arg3;
			local18.anObjectArray3 = local4.anObjectArray27;
			local18.anInt2664 = arg0;
			local18.aClass60_6 = local4;
			Static178.method3065(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt3007 > 0) {
			local36 = Static182.method3159(local4);
		}
		if (!local36 || !Static130.method2309(Static170.method475(local4), arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static25.aClass1_Sub8_Sub1_1.method919(144);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 2) {
			Static25.aClass1_Sub8_Sub1_1.method919(119);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 3) {
			Static25.aClass1_Sub8_Sub1_1.method919(158);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 4) {
			Static25.aClass1_Sub8_Sub1_1.method919(245);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 5) {
			Static25.aClass1_Sub8_Sub1_1.method919(74);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 6) {
			Static25.aClass1_Sub8_Sub1_1.method919(41);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 7) {
			Static25.aClass1_Sub8_Sub1_1.method919(30);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 8) {
			Static25.aClass1_Sub8_Sub1_1.method919(116);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 9) {
			Static25.aClass1_Sub8_Sub1_1.method919(58);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
		if (arg0 == 10) {
			Static25.aClass1_Sub8_Sub1_1.method919(214);
			Static25.aClass1_Sub8_Sub1_1.method904(arg2);
			Static25.aClass1_Sub8_Sub1_1.method869(arg1);
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	public static void method2192() {
		@Pc(10) int local10 = Static35.aClass1_Sub8_Sub1_2.method911(8);
		@Pc(24) int local24;
		if (Static152.anInt3549 > local10) {
			for (local24 = local10; local24 < Static152.anInt3549; local24++) {
				Static42.anIntArray140[Static14.anInt465++] = Static112.anIntArray382[local24];
			}
		}
		if (local10 > Static152.anInt3549) {
			throw new RuntimeException("gppov1");
		}
		Static152.anInt3549 = 0;
		for (local24 = 0; local24 < local10; local24++) {
			@Pc(58) int local58 = Static112.anIntArray382[local24];
			@Pc(62) Class1_Sub1_Sub1_Sub1_Sub1 local62 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local58];
			@Pc(67) int local67 = Static35.aClass1_Sub8_Sub1_2.method911(1);
			if (local67 == 0) {
				Static112.anIntArray382[Static152.anInt3549++] = local58;
				local62.anInt1834 = Static26.anInt845;
			} else {
				@Pc(87) int local87 = Static35.aClass1_Sub8_Sub1_2.method911(2);
				if (local87 == 0) {
					Static112.anIntArray382[Static152.anInt3549++] = local58;
					local62.anInt1834 = Static26.anInt845;
					Static60.anIntArray611[Static104.anInt2660++] = local58;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local87 == 1) {
						Static112.anIntArray382[Static152.anInt3549++] = local58;
						local62.anInt1834 = Static26.anInt845;
						local129 = Static35.aClass1_Sub8_Sub1_2.method911(3);
						local62.method1224(false, local129);
						local139 = Static35.aClass1_Sub8_Sub1_2.method911(1);
						if (local139 == 1) {
							Static60.anIntArray611[Static104.anInt2660++] = local58;
						}
					} else if (local87 == 2) {
						Static112.anIntArray382[Static152.anInt3549++] = local58;
						local62.anInt1834 = Static26.anInt845;
						local129 = Static35.aClass1_Sub8_Sub1_2.method911(3);
						local62.method1224(true, local129);
						local139 = Static35.aClass1_Sub8_Sub1_2.method911(3);
						local62.method1224(true, local139);
						@Pc(193) int local193 = Static35.aClass1_Sub8_Sub1_2.method911(1);
						if (local193 == 1) {
							Static60.anIntArray611[Static104.anInt2660++] = local58;
						}
					} else if (local87 == 3) {
						Static42.anIntArray140[Static14.anInt465++] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I")
	public static int method2193() {
		@Pc(9) int local9 = Static99.method1680(Static166.anInt4090, Static162.anInt3999, Static85.anInt2267);
		return local9 - Static163.anInt4011 >= 800 || (Static12.aByteArrayArrayArray11[Static85.anInt2267][Static162.anInt3999 >> 7][Static166.anInt4090 >> 7] & 0x4) == 0 ? 3 : Static85.anInt2267;
	}
}
