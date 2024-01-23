import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public static int anInt471 = 0;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "[I")
	public static int[] anIntArray73 = new int[32768];

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public static int anInt473 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_157 = Static200.method3116(":clanreq:");

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V")
	public static void method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub1_Sub28 local7 = Static143.method2450(arg1);
		@Pc(10) int local10 = local7.anInt4659;
		@Pc(13) int local13 = local7.anInt4662;
		@Pc(16) int local16 = local7.anInt4665;
		@Pc(23) int local23 = Class1_Sub10.anIntArray187[local16 - local13];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static126.anIntArray358[local10] = local23 & arg0 << local13 | Static126.anIntArray358[local10] & ~local23;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([IIIZIIII[BI)V")
	public static void method333(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				if (arg7[arg6++] == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg2;
				}
				if (arg7[arg6++] == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg2;
				}
				if (arg7[arg6++] == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg2;
				}
				if (arg7[arg6++] == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg2;
				}
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				if (arg7[arg6++] == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg2;
				}
			}
			arg6 += arg4;
			arg8 += arg5;
		}
	}
}
