import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
	public static int anInt8898;

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "[I")
	public static final int[] anIntArray481 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
	public static int anInt8906 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[IIIIIII)Z")
	public static boolean method7447(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 < 0) {
			arg5 = 0;
		}
		if (Static95.anInt1572 < arg2) {
			arg2 = Static95.anInt1572;
		}
		if (arg2 <= arg5) {
			return true;
		}
		@Pc(31) int local31 = arg2 - arg5 >> 2;
		arg4 += arg5 - 1;
		arg1 += arg3 * arg5;
		@Pc(83) int local83;
		@Pc(67) int local67;
		@Pc(55) int local55;
		if (Static577.anInt9465 == 1) {
			Static195.anInt7170 += local31;
			while (true) {
				local31--;
				if (local31 < 0) {
					local31 = arg2 - arg5 & 0x3;
					while (true) {
						local31--;
						if (local31 < 0) {
							return true;
						}
						local83 = ~arg1;
						arg4++;
						if (local83 > ~arg0[arg4]) {
							arg0[arg4] = arg1;
						}
						arg1 += arg3;
					}
				}
				local55 = arg4 + 1;
				if (arg0[local55] > arg1) {
					arg0[local55] = arg1;
				}
				local67 = arg1 + arg3;
				local55++;
				if (arg0[local55] > local67) {
					arg0[local55] = local67;
				}
				local67 += arg3;
				local55++;
				if (arg0[local55] > local67) {
					arg0[local55] = local67;
				}
				local67 += arg3;
				arg4 = local55 + 1;
				if (arg0[arg4] > local67) {
					arg0[arg4] = local67;
				}
				arg1 = local67 + arg3;
			}
		} else {
			arg1 -= 38400;
			while (true) {
				local31--;
				if (local31 < 0) {
					local31 = arg2 - arg5 & 0x3;
					while (true) {
						local31--;
						if (local31 < 0) {
							return true;
						}
						arg4++;
						if (arg0[arg4] > arg1) {
							return false;
						}
						arg1 += arg3;
					}
				}
				local55 = arg4 + 1;
				if (arg1 < arg0[local55]) {
					return false;
				}
				local67 = arg1 + arg3;
				local55++;
				if (arg0[local55] > local67) {
					return false;
				}
				local67 += arg3;
				local83 = ~local67;
				local55++;
				if (local83 > ~arg0[local55]) {
					return false;
				}
				local67 += arg3;
				local83 = ~local67;
				arg4 = local55 + 1;
				if (local83 > ~arg0[arg4]) {
					return false;
				}
				arg1 = local67 + arg3;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)[B")
	public static byte[] method7449(@OriginalArg(1) int arg0) {
		@Pc(19) Class3_Sub4_Sub3 local19 = (Class3_Sub4_Sub3) Static306.aClass13_2.method324((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(49) int local49 = 0; local49 < 255; local49++) {
				@Pc(57) int local57 = 255 - local49;
				@Pc(64) int local64 = Static63.method794(local57, local30);
				@Pc(68) byte local68 = local24[local64];
				local24[local64] = local24[local57];
				local24[local57] = local24[511 - local49] = local68;
			}
			local19 = new Class3_Sub4_Sub3(local24);
			Static306.aClass13_2.method322(local19, (long) arg0);
		}
		return local19.aByteArray9;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
	public static void method7450(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub4_Sub2 local16 = Static502.method7211(12, (long) arg0);
		local16.method627();
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
	public static void method7451() {
		@Pc(5) int local5 = 0;
		if (Static713.aClass3_Sub55_31.aClass15_Sub28_1.method9169() == 1) {
			local5 = 55;
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub26_1.method8908() == 0) {
			local5 |= 0x40;
		}
		Static703.method9180(local5);
		Static70.aClass323_1.method7796(local5);
		Static243.aClass406_2.method9393(local5);
		Static631.aClass85_2.method2219(local5);
		Static660.aClass307_2.method7488(local5);
		Static334.method4984(local5);
		Static656.method8786(local5);
		Static490.method7105(local5);
		Static600.method8269(local5);
		Static268.method4109();
	}
}
