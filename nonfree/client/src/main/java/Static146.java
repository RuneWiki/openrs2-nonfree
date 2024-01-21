import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!cc;")
	public static Class1_Sub6 aClass1_Sub6_1 = new Class1_Sub6(0, 0);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1394 = Static169.method2903(" )2>");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1395 = Static169.method2903("mod_icons");

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1396 = Static169.method2903("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!s", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBILclient!gb;)V")
	public static void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub9 arg3) {
		if (Static38.anInt1037 >= 400) {
			return;
		}
		if (arg3.anIntArray174 != null) {
			arg3 = arg3.method986();
		}
		if (arg3 == null || !arg3.aBoolean66) {
			return;
		}
		@Pc(28) Class23 local28 = arg3.aClass23_544;
		if (arg3.anInt1512 != 0) {
			local28 = Static149.method2571(new Class23[] { local28, Static60.method3145(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt215, arg3.anInt1512), Static92.aClass23_916, Static1.aClass23_73, Static27.method498(arg3.anInt1512), Static40.aClass23_413 });
		}
		if (Static144.anInt3643 == 1) {
			Static134.method2312(Static149.method2571(new Class23[] { Static170.aClass23_284, Static154.aClass23_1454, local28 }), Static176.aClass23_1596, arg2, 13, arg0, arg1);
		} else if (!Static156.aBoolean195) {
			@Pc(143) Class23[] local143 = arg3.aClass23Array5;
			if (Static49.aBoolean59) {
				local143 = Static111.method1966(local143);
			}
			@Pc(153) int local153;
			if (local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && !local143[local153].method644(Static58.aClass23_601)) {
						@Pc(172) byte local172 = 0;
						if (local153 == 0) {
							local172 = 38;
						}
						if (local153 == 1) {
							local172 = 36;
						}
						if (local153 == 2) {
							local172 = 17;
						}
						if (local153 == 3) {
							local172 = 11;
						}
						if (local153 == 4) {
							local172 = 46;
						}
						Static134.method2312(Static149.method2571(new Class23[] { Static15.aClass23_180, local28 }), local143[local153], arg2, local172, arg0, arg1);
					}
				}
			}
			if (local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && local143[local153].method644(Static58.aClass23_601)) {
						@Pc(253) int local253 = 0;
						@Pc(255) short local255 = 0;
						if (arg3.anInt1512 > Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt215) {
							local255 = 2000;
						}
						if (local153 == 0) {
							local253 = local255 + 38;
						}
						if (local153 == 1) {
							local253 = local255 + 36;
						}
						if (local153 == 2) {
							local253 = local255 + 17;
						}
						if (local153 == 3) {
							local253 = local255 + 11;
						}
						if (local153 == 4) {
							local253 = local255 + 46;
						}
						Static134.method2312(Static149.method2571(new Class23[] { Static15.aClass23_180, local28 }), local143[local153], arg2, local253, arg0, arg1);
					}
				}
			}
			Static134.method2312(Static149.method2571(new Class23[] { Static15.aClass23_180, local28 }), Static111.aClass23_1080, arg2, 1002, arg0, arg1);
		} else if ((Static23.anInt701 & 0x2) == 2) {
			Static134.method2312(Static149.method2571(new Class23[] { Static25.aClass23_277, Static154.aClass23_1454, local28 }), Static123.aClass23_1195, arg2, 57, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method2527() {
		aClass1_Sub6_1 = null;
		aClass23_1395 = null;
		aClass23_1394 = null;
		aByteArrayArray10 = null;
		aClass23_1396 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ob;I)Z")
	public static boolean method2528(@OriginalArg(0) Class60 arg0) {
		if (Static109.aBoolean136) {
			if (Static170.method475(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3032 == 0) {
				return false;
			}
		}
		return arg0.aBoolean153;
	}
}
