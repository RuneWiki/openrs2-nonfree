import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	public static int anInt4348;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!fc;")
	public static Class71 aClass71_58;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_31 = new Class210();

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	public static int anInt4349 = 0;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!qq;")
	public static Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_117 = new Class77(85, -2);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public static void method3862() {
		Static79.aClass210_13 = new Class210();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!pf;Z)V")
	public static void method3864(@OriginalArg(0) Class2_Sub13_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4252();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static168.anInt3003; local12++) {
			local18 = Static7.anIntArray24[local12];
			if ((Static225.aByteArray69[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static225.aByteArray69[local18] = (byte) (Static225.aByteArray69[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method4257(1);
					if (local46 == 0) {
						local7 = Static91.method1549(arg0);
						Static225.aByteArray69[local18] = (byte) (Static225.aByteArray69[local18] | 0x2);
					} else {
						Static3.method84(local18, arg0);
					}
				}
			}
		}
		arg0.method4262();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4252();
		@Pc(120) int local120;
		for (local18 = 0; local18 < Static168.anInt3003; local18++) {
			local46 = Static7.anIntArray24[local18];
			if ((Static225.aByteArray69[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static225.aByteArray69[local46] = (byte) (Static225.aByteArray69[local46] | 0x2);
					local7--;
				} else {
					local120 = arg0.method4257(1);
					if (local120 == 0) {
						local7 = Static91.method1549(arg0);
						Static225.aByteArray69[local46] = (byte) (Static225.aByteArray69[local46] | 0x2);
					} else {
						Static3.method84(local46, arg0);
					}
				}
			}
		}
		arg0.method4262();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4252();
		@Pc(195) int local195;
		for (local46 = 0; local46 < Static380.anInt6629; local46++) {
			local120 = Static363.anIntArray719[local46];
			if ((Static225.aByteArray69[local120] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static225.aByteArray69[local120] = (byte) (Static225.aByteArray69[local120] | 0x2);
				} else {
					local195 = arg0.method4257(1);
					if (local195 == 0) {
						local7 = Static91.method1549(arg0);
						Static225.aByteArray69[local120] = (byte) (Static225.aByteArray69[local120] | 0x2);
					} else if (Static166.method2718(arg0, local120)) {
						Static225.aByteArray69[local120] = (byte) (Static225.aByteArray69[local120] | 0x2);
					}
				}
			}
		}
		arg0.method4262();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4252();
		for (local120 = 0; local120 < Static380.anInt6629; local120++) {
			local195 = Static363.anIntArray719[local120];
			if ((Static225.aByteArray69[local195] & 0x1) == 0) {
				if (local7 > 0) {
					Static225.aByteArray69[local195] = (byte) (Static225.aByteArray69[local195] | 0x2);
					local7--;
				} else {
					@Pc(286) int local286 = arg0.method4257(1);
					if (local286 == 0) {
						local7 = Static91.method1549(arg0);
						Static225.aByteArray69[local195] = (byte) (Static225.aByteArray69[local195] | 0x2);
					} else if (Static166.method2718(arg0, local195)) {
						Static225.aByteArray69[local195] = (byte) (Static225.aByteArray69[local195] | 0x2);
					}
				}
			}
		}
		arg0.method4262();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static168.anInt3003 = 0;
		Static380.anInt6629 = 0;
		for (local195 = 1; local195 < 2048; local195++) {
			Static225.aByteArray69[local195] = (byte) (Static225.aByteArray69[local195] >> 1);
			@Pc(361) Class12_Sub1_Sub2_Sub2 local361 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local195];
			if (local361 == null) {
				Static363.anIntArray719[Static380.anInt6629++] = local195;
			} else {
				Static7.anIntArray24[Static168.anInt3003++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public static void method3865() {
		Static279.anInt4939 = 0;
		Static292.anInt5161 = -1;
		Static204.anInt3770 = -1;
	}
}
