import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!av", name = "u", descriptor = "Lclient!kca;")
	public static final Class179 aClass179_5 = new Class179();

	@OriginalMember(owner = "client!av", name = "v", descriptor = "[I")
	public static final int[] anIntArray657 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!av", name = "y", descriptor = "I")
	public static int anInt8939 = 0;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIB[BIII)Z")
	public static boolean method7425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg3 + 7) / 8);
		@Pc(43) int local43 = -((arg0 + 8 - 1) / 8);
		for (@Pc(45) int local45 = local29; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local43; local49 < 0; local49++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIIFILclient!ss;[BFIFFF)V")
	public static void method7432(@OriginalArg(3) int arg0, @OriginalArg(4) float arg1, @OriginalArg(6) Class214 arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static351.method5299(local7, arg3, arg1, arg5, arg0, arg6, arg2, arg4, arg7);
			arg0 += 16384;
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(II)Lclient!fu;")
	public static Class106 method7434(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static284.aFloat160 == 3.0D) {
				return Static108.aClass106_1;
			}
			if ((double) Static284.aFloat160 == 4.0D) {
				return Static217.aClass106_3;
			}
			if ((double) Static284.aFloat160 == 6.0D) {
				return Static152.aClass106_2;
			}
			if ((double) Static284.aFloat160 >= 8.0D) {
				return Static287.aClass106_4;
			}
		} else if (arg0 == 1) {
			if ((double) Static284.aFloat160 == 3.0D) {
				return Static152.aClass106_2;
			}
			if ((double) Static284.aFloat160 == 4.0D) {
				return Static287.aClass106_4;
			}
			if ((double) Static284.aFloat160 == 6.0D) {
				return Static455.aClass106_6;
			}
			if ((double) Static284.aFloat160 >= 8.0D) {
				return Static426.aClass106_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static284.aFloat160 == 3.0D) {
				return Static455.aClass106_6;
			}
			if ((double) Static284.aFloat160 == 4.0D) {
				return Static426.aClass106_5;
			}
			if ((double) Static284.aFloat160 == 6.0D) {
				return Static525.aClass106_8;
			}
			if ((double) Static284.aFloat160 >= 8.0D) {
				return Static508.aClass106_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
