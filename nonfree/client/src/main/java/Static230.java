import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
	public static int anInt3916;

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "D")
	public static double aDouble72;

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "Z")
	public static final boolean aBoolean236 = false;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "[I")
	public static final int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!gs;)V")
	public static void method3328(@OriginalArg(1) Class6_Sub23_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method2877();
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static475.anInt8165; local12++) {
			local18 = Static75.anIntArray82[local12];
			if ((Static669.aByteArray106[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static669.aByteArray106[local18] = (byte) (Static669.aByteArray106[local18] | 0x2);
					local7--;
				} else {
					local43 = arg0.method2878(1);
					if (local43 == 0) {
						local7 = Static590.method8958(arg0);
						Static669.aByteArray106[local18] = (byte) (Static669.aByteArray106[local18] | 0x2);
					} else {
						Static67.method1185(local18, arg0);
					}
				}
			}
		}
		arg0.method2883();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2877();
		@Pc(122) int local122;
		for (local18 = 0; local18 < Static475.anInt8165; local18++) {
			local43 = Static75.anIntArray82[local18];
			if ((Static669.aByteArray106[local43] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static669.aByteArray106[local43] = (byte) (Static669.aByteArray106[local43] | 0x2);
				} else {
					local122 = arg0.method2878(1);
					if (local122 == 0) {
						local7 = Static590.method8958(arg0);
						Static669.aByteArray106[local43] = (byte) (Static669.aByteArray106[local43] | 0x2);
					} else {
						Static67.method1185(local43, arg0);
					}
				}
			}
		}
		arg0.method2883();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2877();
		@Pc(199) int local199;
		for (local43 = 0; local43 < Static218.anInt3725; local43++) {
			local122 = Static450.anIntArray690[local43];
			if ((Static669.aByteArray106[local122] & 0x1) != 0) {
				if (local7 > 0) {
					Static669.aByteArray106[local122] = (byte) (Static669.aByteArray106[local122] | 0x2);
					local7--;
				} else {
					local199 = arg0.method2878(1);
					if (local199 == 0) {
						local7 = Static590.method8958(arg0);
						Static669.aByteArray106[local122] = (byte) (Static669.aByteArray106[local122] | 0x2);
					} else if (Static673.method9102(local122, arg0)) {
						Static669.aByteArray106[local122] = (byte) (Static669.aByteArray106[local122] | 0x2);
					}
				}
			}
		}
		arg0.method2883();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2877();
		for (local122 = 0; local122 < Static218.anInt3725; local122++) {
			local199 = Static450.anIntArray690[local122];
			if ((Static669.aByteArray106[local199] & 0x1) == 0) {
				if (local7 > 0) {
					Static669.aByteArray106[local199] = (byte) (Static669.aByteArray106[local199] | 0x2);
					local7--;
				} else {
					@Pc(283) int local283 = arg0.method2878(1);
					if (local283 == 0) {
						local7 = Static590.method8958(arg0);
						Static669.aByteArray106[local199] = (byte) (Static669.aByteArray106[local199] | 0x2);
					} else if (Static673.method9102(local199, arg0)) {
						Static669.aByteArray106[local199] = (byte) (Static669.aByteArray106[local199] | 0x2);
					}
				}
			}
		}
		arg0.method2883();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static475.anInt8165 = 0;
		Static218.anInt3725 = 0;
		for (local199 = 1; local199 < 2048; local199++) {
			Static669.aByteArray106[local199] = (byte) (Static669.aByteArray106[local199] >> 1);
			@Pc(351) Class2_Sub1_Sub1_Sub3_Sub1 local351 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local199];
			if (local351 == null) {
				Static450.anIntArray690[Static218.anInt3725++] = local199;
			} else {
				Static75.anIntArray82[Static475.anInt8165++] = local199;
			}
		}
	}
}
