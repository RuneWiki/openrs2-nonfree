import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!le", name = "q", descriptor = "I")
	public static int anInt3107;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[520];

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_928 = Static181.method2795("<img=0>");

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_929 = Static181.method2795("rect_debug=");

	@OriginalMember(owner = "client!le", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_930 = Static181.method2795("null");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!eh;IZ)[Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1[] method2360(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2) {
		return Static66.method1261(arg0, arg2, arg1) ? Static44.method905() : null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ra;)Lclient!vi;")
	public static Class35_Sub4 method2361(@OriginalArg(1) Class2_Sub3 arg0) {
		return new Class35_Sub4(arg0.method242(), arg0.method242(), arg0.method242(), arg0.method242(), arg0.method261(), arg0.method261(), arg0.method260());
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public static void method2362() {
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt2895; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static35.anInt916; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static31.anInt825; local7++) {
					@Pc(16) Class2_Sub23 local16 = Static203.aClass2_Sub23ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class105 local21 = local16.aClass105_1;
						if (local21 != null && local21.aClass24_11.method2979()) {
							Static44.method908(local21.aClass24_11, local1, local4, local7, 1, 1);
							if (local21.aClass24_10 != null && local21.aClass24_10.method2979()) {
								Static44.method908(local21.aClass24_10, local1, local4, local7, 1, 1);
								local21.aClass24_11.method2976(local21.aClass24_10, 0, 0, 0, false);
								local21.aClass24_10 = local21.aClass24_10.method2977();
							}
							local21.aClass24_11 = local21.aClass24_11.method2977();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt3554; local77++) {
							@Pc(83) Class78 local83 = local16.aClass78Array3[local77];
							if (local83 != null && local83.aClass24_4.method2979()) {
								Static44.method908(local83.aClass24_4, local1, local4, local7, local83.anInt3031 + 1 - local83.anInt3028, local83.anInt3040 - local83.anInt3036 + 1);
								local83.aClass24_4 = local83.aClass24_4.method2977();
							}
						}
						@Pc(125) Class26 local125 = local16.aClass26_1;
						if (local125 != null && local125.aClass24_1.method2979()) {
							Static72.method417(local125.aClass24_1, local1, local4, local7);
							local125.aClass24_1 = local125.aClass24_1.method2977();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Z")
	public static boolean method2363(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IZ)V")
	public static void method2365(@OriginalArg(1) boolean arg0) {
		Static192.method2892();
		Static75.anInt1759++;
		if (Static75.anInt1759 < 50 && !arg0) {
			return;
		}
		Static75.anInt1759 = 0;
		if (Static4.aBoolean4 || Static175.aClass25_5 == null) {
			return;
		}
		Static69.aClass2_Sub3_Sub1_2.method284(155);
		try {
			Static175.aClass25_5.method800(Static69.aClass2_Sub3_Sub1_2.aByteArray2, Static69.aClass2_Sub3_Sub1_2.anInt340);
			Static69.aClass2_Sub3_Sub1_2.anInt340 = 0;
		} catch (@Pc(50) IOException local50) {
			Static4.aBoolean4 = true;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(ILclient!ra;)V")
	public static void method2366(@OriginalArg(1) Class2_Sub3 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static149.aClass67_6 != null) {
			@Pc(16) int local16;
			try {
				Static149.aClass67_6.method2215(0L);
				local16 = 0;
				Static149.aClass67_6.method2207(local8);
				while (local16 < 24 && local8[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(40) Exception local40) {
				for (local16 = 0; local16 < 24; local16++) {
					local8[local16] = -1;
				}
			}
		}
		arg0.method265(local8, 24);
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	public static void method2367() {
		Static89.anInt4289 = 0;
		Static177.anInt3619 = 0;
		Static199.method3016();
		Static69.method1293();
		Static53.method1039();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static89.anInt4289; local17++) {
			local23 = Static26.anIntArray46[local17];
			if (Static47.aClass24_Sub4_Sub2Array1[local23].anInt3309 != Static13.anInt386) {
				Static47.aClass24_Sub4_Sub2Array1[local23].aClass2_Sub2_Sub24_1 = null;
				Static47.aClass24_Sub4_Sub2Array1[local23] = null;
			}
		}
		if (Static131.anInt2843 != Static33.aClass2_Sub3_Sub1_1.anInt340) {
			throw new RuntimeException("gnp1 pos:" + Static33.aClass2_Sub3_Sub1_1.anInt340 + " psize:" + Static131.anInt2843);
		}
		for (local23 = 0; local23 < Static162.anInt3930; local23++) {
			if (Static47.aClass24_Sub4_Sub2Array1[Static207.anIntArray402[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static162.anInt3930);
			}
		}
	}
}
