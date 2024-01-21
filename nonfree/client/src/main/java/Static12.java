import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "Lclient!bf;")
	public static Class10 aClass10_1 = new Class10(8);

	@OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_154 = Static169.method2903("Loaded fonts");

	@OriginalMember(owner = "client!bd", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_155 = Static169.method2903("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!bd", name = "ob", descriptor = "Lclient!ed;")
	public static Class23 aClass23_156 = Static169.method2903("cross");

	@OriginalMember(owner = "client!bd", name = "pb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11 = new byte[4][104][104];

	@OriginalMember(owner = "client!bd", name = "qb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_157 = aClass23_154;

	@OriginalMember(owner = "client!bd", name = "rb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_158 = Static169.method2903(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public static void method238() {
		aClass23_157 = null;
		aClass23_158 = null;
		aClass23_156 = null;
		aClass23_155 = null;
		aClass23_154 = null;
		aByteArrayArrayArray11 = null;
		aClass10_1 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBILclient!a;I)V")
	public static void method239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103 || Static38.anInt1037 >= 400) {
			return;
		}
		@Pc(57) Class23 local57;
		if (arg2.anInt210 == 0) {
			local57 = Static149.method2571(new Class23[] { arg2.aClass23_68, Static60.method3145(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt215, arg2.anInt215), Static92.aClass23_916, Static1.aClass23_73, Static27.method498(arg2.anInt215), Static40.aClass23_413 });
		} else {
			local57 = Static149.method2571(new Class23[] { arg2.aClass23_68, Static92.aClass23_916, Static171.aClass23_1589, Static27.method498(arg2.anInt210), Static40.aClass23_413 });
		}
		@Pc(135) int local135;
		if (Static144.anInt3643 == 1) {
			Static134.method2312(Static149.method2571(new Class23[] { Static170.aClass23_284, Static84.aClass23_1672, local57 }), Static176.aClass23_1596, arg0, 30, arg3, arg1);
		} else if (!Static156.aBoolean195) {
			for (local135 = 7; local135 >= 0; local135--) {
				if (Static140.aClass23Array21[local135] != null) {
					@Pc(147) short local147 = 0;
					if (Static140.aClass23Array21[local135].method644(Static58.aClass23_601)) {
						if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt215 < arg2.anInt215) {
							local147 = 2000;
						}
						if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt206 != 0 && arg2.anInt206 != 0) {
							if (arg2.anInt206 == Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt206) {
								local147 = 2000;
							} else {
								local147 = 0;
							}
						}
					} else if (Static110.aBooleanArray16[local135]) {
						local147 = 2000;
					}
					@Pc(205) int local205 = local147 + Static44.anIntArray146[local135];
					Static134.method2312(Static149.method2571(new Class23[] { Static111.aClass23_1086, local57 }), Static140.aClass23Array21[local135], arg0, local205, arg3, arg1);
				}
			}
		} else if ((Static23.anInt701 & 0x8) == 8) {
			Static134.method2312(Static149.method2571(new Class23[] { Static25.aClass23_277, Static84.aClass23_1672, local57 }), Static123.aClass23_1195, arg0, 42, arg3, arg1);
		}
		for (local135 = 0; local135 < Static38.anInt1037; local135++) {
			if (Static37.anIntArray124[local135] == 40) {
				Static104.aClass23Array12[local135] = Static149.method2571(new Class23[] { Static111.aClass23_1086, local57 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!cb;III)V")
	public static void method240(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub4 local7 = new Class1_Sub4();
		local7.anInt458 = arg1.anInt632;
		local7.anInt445 = arg4 * 128;
		local7.anInt451 = arg0;
		local7.anInt452 = arg1.anInt660;
		@Pc(36) int local36 = arg1.anInt656;
		local7.anInt449 = arg1.anInt673;
		local7.anInt456 = arg1.anInt664 * 128;
		local7.anInt459 = arg3 * 128;
		local7.anIntArray62 = arg1.anIntArray86;
		@Pc(58) int local58 = arg1.anInt657;
		if (arg2 == 1 || arg2 == 3) {
			local58 = arg1.anInt656;
			local36 = arg1.anInt657;
		}
		local7.anInt446 = (arg4 + local58) * 128;
		local7.anInt447 = (local36 + arg3) * 128;
		if (arg1.anIntArray88 != null) {
			local7.aClass1_Sub1_Sub3_1 = arg1;
			local7.method249();
		}
		Static1.aClass56_1.method1856(local7);
		if (local7.anIntArray62 != null) {
			local7.anInt457 = (int) ((double) (local7.anInt452 - local7.anInt458) * Math.random()) + local7.anInt458;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method241(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
