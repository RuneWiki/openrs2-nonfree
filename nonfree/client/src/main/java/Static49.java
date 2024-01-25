import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "Lclient!re;")
	public static Class282 aClass282_1;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_38 = new Class363(115, 12);

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "J")
	public static long aLong36 = -1L;

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "Lclient!kp;")
	public static Class196 aClass196_1 = null;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
	public static int anInt1174 = 104;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLclient!ks;)V")
	public static void method819(@OriginalArg(1) Class2_Sub15_Sub2 arg0) {
		arg0.method4362();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static376.anInt6647; local12++) {
			local18 = Static557.anIntArray665[local12];
			if ((Static506.aByteArray85[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static506.aByteArray85[local18] = (byte) (Static506.aByteArray85[local18] | 0x2);
					local10--;
				} else {
					local43 = arg0.method4355(1);
					if (local43 == 0) {
						local10 = Static177.method3056(arg0);
						Static506.aByteArray85[local18] = (byte) (Static506.aByteArray85[local18] | 0x2);
					} else {
						Static69.method1126(arg0, local18);
					}
				}
			}
		}
		arg0.method4361();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4362();
		@Pc(127) int local127;
		for (local18 = 0; local18 < Static376.anInt6647; local18++) {
			local43 = Static557.anIntArray665[local18];
			if ((Static506.aByteArray85[local43] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static506.aByteArray85[local43] = (byte) (Static506.aByteArray85[local43] | 0x2);
				} else {
					local127 = arg0.method4355(1);
					if (local127 == 0) {
						local10 = Static177.method3056(arg0);
						Static506.aByteArray85[local43] = (byte) (Static506.aByteArray85[local43] | 0x2);
					} else {
						Static69.method1126(arg0, local43);
					}
				}
			}
		}
		arg0.method4361();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4362();
		@Pc(211) int local211;
		for (local43 = 0; local43 < Static319.anInt5951; local43++) {
			local127 = Static162.anIntArray195[local43];
			if ((Static506.aByteArray85[local127] & 0x1) != 0) {
				if (local10 > 0) {
					Static506.aByteArray85[local127] = (byte) (Static506.aByteArray85[local127] | 0x2);
					local10--;
				} else {
					local211 = arg0.method4355(1);
					if (local211 == 0) {
						local10 = Static177.method3056(arg0);
						Static506.aByteArray85[local127] = (byte) (Static506.aByteArray85[local127] | 0x2);
					} else if (Static456.method6472(arg0, local127)) {
						Static506.aByteArray85[local127] = (byte) (Static506.aByteArray85[local127] | 0x2);
					}
				}
			}
		}
		arg0.method4361();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4362();
		for (local127 = 0; local127 < Static319.anInt5951; local127++) {
			local211 = Static162.anIntArray195[local127];
			if ((Static506.aByteArray85[local211] & 0x1) == 0) {
				if (local10 > 0) {
					Static506.aByteArray85[local211] = (byte) (Static506.aByteArray85[local211] | 0x2);
					local10--;
				} else {
					@Pc(305) int local305 = arg0.method4355(1);
					if (local305 == 0) {
						local10 = Static177.method3056(arg0);
						Static506.aByteArray85[local211] = (byte) (Static506.aByteArray85[local211] | 0x2);
					} else if (Static456.method6472(arg0, local211)) {
						Static506.aByteArray85[local211] = (byte) (Static506.aByteArray85[local211] | 0x2);
					}
				}
			}
		}
		arg0.method4361();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static319.anInt5951 = 0;
		Static376.anInt6647 = 0;
		for (local211 = 1; local211 < 2048; local211++) {
			Static506.aByteArray85[local211] = (byte) (Static506.aByteArray85[local211] >> 1);
			@Pc(374) Class6_Sub1_Sub1_Sub1_Sub2 local374 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local211];
			if (local374 == null) {
				Static162.anIntArray195[Static319.anInt5951++] = local211;
			} else {
				Static557.anIntArray665[Static376.anInt6647++] = local211;
			}
		}
	}
}
