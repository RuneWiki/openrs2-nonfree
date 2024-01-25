import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZII)I")
	public static int method71(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class6_Sub46 local10 = Static378.method5549(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray583.length; local28++) {
				if (local10.anIntArray582[local28] == arg2) {
					local26 += local10.anIntArray583[local28];
				}
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public static int method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static464.aByteArrayArray25 == null ? 0 : Static464.aByteArrayArray25[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!jr;)Lclient!dba;")
	public static Class65 method73(@OriginalArg(1) Class6_Sub12 arg0) {
		@Pc(10) Class114 local10 = Static551.method7703()[arg0.method6019()];
		@Pc(17) Class72 local17 = Static574.method4158()[arg0.method6019()];
		@Pc(21) int local21 = arg0.method6023();
		@Pc(30) int local30 = arg0.method6023();
		@Pc(34) int local34 = arg0.method6044();
		@Pc(38) int local38 = arg0.method6044();
		@Pc(42) int local42 = arg0.method6015();
		return new Class65(local10, local17, local21, local30, local34, local38, local42);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!jr;I)V")
	public static void method77(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static479.aClass193_4 != null) {
			@Pc(20) int local20;
			try {
				Static479.aClass193_4.method4607(0L);
				Static479.aClass193_4.method4602(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method6025(24, local8);
	}
}
