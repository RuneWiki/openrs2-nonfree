import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "D")
	public static double aDouble31;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray14;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "[Lclient!pf;")
	public static final Class5_Sub40[] aClass5_Sub40Array7 = new Class5_Sub40[300];

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
	public static int anInt8690 = 0;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Z")
	public static boolean aBoolean712 = false;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!wd;)V")
	public static void method7465(@OriginalArg(1) Class5_Sub12_Sub2 arg0) {
		arg0.method8667();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static227.anInt3948; local12++) {
			local18 = Static467.anIntArray632[local12];
			if ((Static353.aByteArray48[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static353.aByteArray48[local18] = (byte) (Static353.aByteArray48[local18] | 0x2);
				} else {
					local43 = arg0.method8670(1);
					if (local43 == 0) {
						local10 = Static473.method6914(arg0);
						Static353.aByteArray48[local18] = (byte) (Static353.aByteArray48[local18] | 0x2);
					} else {
						Static173.method2663(local18, arg0);
					}
				}
			}
		}
		arg0.method8666();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method8667();
		@Pc(120) int local120;
		for (local18 = 0; local18 < Static227.anInt3948; local18++) {
			local43 = Static467.anIntArray632[local18];
			if ((Static353.aByteArray48[local43] & 0x1) != 0) {
				if (local10 > 0) {
					Static353.aByteArray48[local43] = (byte) (Static353.aByteArray48[local43] | 0x2);
					local10--;
				} else {
					local120 = arg0.method8670(1);
					if (local120 == 0) {
						local10 = Static473.method6914(arg0);
						Static353.aByteArray48[local43] = (byte) (Static353.aByteArray48[local43] | 0x2);
					} else {
						Static173.method2663(local43, arg0);
					}
				}
			}
		}
		arg0.method8666();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method8667();
		@Pc(203) int local203;
		for (local43 = 0; local43 < Static161.anInt2820; local43++) {
			local120 = Static45.anIntArray59[local43];
			if ((Static353.aByteArray48[local120] & 0x1) != 0) {
				if (local10 > 0) {
					Static353.aByteArray48[local120] = (byte) (Static353.aByteArray48[local120] | 0x2);
					local10--;
				} else {
					local203 = arg0.method8670(1);
					if (local203 == 0) {
						local10 = Static473.method6914(arg0);
						Static353.aByteArray48[local120] = (byte) (Static353.aByteArray48[local120] | 0x2);
					} else if (Static226.method3560(local120, arg0)) {
						Static353.aByteArray48[local120] = (byte) (Static353.aByteArray48[local120] | 0x2);
					}
				}
			}
		}
		arg0.method8666();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method8667();
		for (local120 = 0; local120 < Static161.anInt2820; local120++) {
			local203 = Static45.anIntArray59[local120];
			if ((Static353.aByteArray48[local203] & 0x1) == 0) {
				if (local10 > 0) {
					Static353.aByteArray48[local203] = (byte) (Static353.aByteArray48[local203] | 0x2);
					local10--;
				} else {
					@Pc(298) int local298 = arg0.method8670(1);
					if (local298 == 0) {
						local10 = Static473.method6914(arg0);
						Static353.aByteArray48[local203] = (byte) (Static353.aByteArray48[local203] | 0x2);
					} else if (Static226.method3560(local203, arg0)) {
						Static353.aByteArray48[local203] = (byte) (Static353.aByteArray48[local203] | 0x2);
					}
				}
			}
		}
		arg0.method8666();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static161.anInt2820 = 0;
		Static227.anInt3948 = 0;
		for (local203 = 1; local203 < 2048; local203++) {
			Static353.aByteArray48[local203] = (byte) (Static353.aByteArray48[local203] >> 1);
			@Pc(371) Class14_Sub1_Sub1_Sub3_Sub1 local371 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local203];
			if (local371 == null) {
				Static45.anIntArray59[Static161.anInt2820++] = local203;
			} else {
				Static467.anIntArray632[Static227.anInt3948++] = local203;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "()V")
	public static void method7469() {
		for (@Pc(1) int local1 = 0; local1 < Static594.anInt9723; local1++) {
			@Pc(6) Class14_Sub1_Sub1 local6 = Static53.aClass14_Sub1_Sub1Array1[local1];
			Static95.method1435(local6, true);
			Static53.aClass14_Sub1_Sub1Array1[local1] = null;
		}
		Static594.anInt9723 = 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)Z")
	public static boolean method7470(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static605.aCharArray8[local12 - 128] != '\u0000';
		}
	}
}
