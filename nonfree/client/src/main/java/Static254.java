import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!im", name = "k", descriptor = "I")
	public static int anInt4534;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Lclient!aj;")
	public static Class15 aClass15_72;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "I")
	public static int anInt4540;

	@OriginalMember(owner = "client!im", name = "s", descriptor = "Lclient!jw;")
	public static Class180 aClass180_101;

	@OriginalMember(owner = "client!im", name = "t", descriptor = "I")
	public static int anInt4541;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public static int anInt4533 = -1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([IB[J)V")
	public static void method4155(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static597.method8387(arg0, 0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BILclient!bba;II)V")
	public static void method4156(@OriginalArg(1) int arg0, @OriginalArg(2) Class28_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class359 local9 = arg1.method9315();
		@Pc(24) int local24 = arg1.anInt10798 - arg1.aClass282_7.anInt8022 & 0x3FFF;
		if (arg2 == -1) {
			if (local24 != 0 || arg1.anInt10756 > 25) {
				if (arg0 < 0 && local9.anInt9982 != -1) {
					arg1.aBoolean820 = false;
					arg1.anInt10749 = local9.anInt9982;
				} else if (arg0 <= 0 || local9.anInt9996 == -1) {
					arg1.anInt10749 = local9.anInt9967;
				} else {
					arg1.anInt10749 = local9.anInt9996;
				}
				arg1.aBoolean820 = false;
			} else if (!arg1.aBoolean820 || !local9.method8762(arg1.anInt10749)) {
				arg1.anInt10749 = local9.method8767();
				arg1.aBoolean820 = arg1.anInt10749 != -1;
			}
		} else if (arg1.anInt10743 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(127) int local127 = Static507.anIntArray666[arg3] - arg1.aClass282_7.anInt8022 & 0x3FFF;
			if (arg2 == 2 && local9.anInt10008 != -1) {
				if (local127 > 2048 && local127 <= 6144 && local9.anInt9984 != -1) {
					arg1.anInt10749 = local9.anInt9984;
				} else if (local127 >= 10240 && local127 < 14336 && local9.anInt9986 != -1) {
					arg1.anInt10749 = local9.anInt9986;
				} else if (local127 <= 6144 || local127 >= 10240 || local9.anInt9990 == -1) {
					arg1.anInt10749 = local9.anInt10008;
				} else {
					arg1.anInt10749 = local9.anInt9990;
				}
			} else if (arg2 == 0 && local9.anInt9966 != -1) {
				if (local127 > 2048 && local127 <= 6144 && local9.anInt9976 != -1) {
					arg1.anInt10749 = local9.anInt9976;
				} else if (local127 >= 10240 && local127 < 14336 && local9.anInt9997 != -1) {
					arg1.anInt10749 = local9.anInt9997;
				} else if (local127 <= 6144 || local127 >= 10240 || local9.anInt9974 == -1) {
					arg1.anInt10749 = local9.anInt9966;
				} else {
					arg1.anInt10749 = local9.anInt9974;
				}
			} else if (local127 > 2048 && local127 <= 6144 && local9.anInt10004 != -1) {
				arg1.anInt10749 = local9.anInt10004;
			} else if (local127 >= 10240 && local127 < 14336 && local9.anInt9978 != -1) {
				arg1.anInt10749 = local9.anInt9978;
			} else if (local127 <= 6144 || local127 >= 10240 || local9.anInt9980 == -1) {
				arg1.anInt10749 = local9.anInt9967;
			} else {
				arg1.anInt10749 = local9.anInt9980;
			}
			arg1.aBoolean820 = false;
		} else if (local24 == 0 && arg1.anInt10756 <= 25) {
			arg1.aBoolean820 = false;
			if (arg2 == 2 && local9.anInt10008 != -1) {
				arg1.anInt10749 = local9.anInt10008;
			} else if (arg2 == 0 && local9.anInt9966 != -1) {
				arg1.anInt10749 = local9.anInt9966;
			} else {
				arg1.anInt10749 = local9.anInt9967;
			}
		} else {
			arg1.aBoolean820 = false;
			if (arg2 == 2 && local9.anInt10008 != -1) {
				if (arg0 < 0 && local9.anInt9988 != -1) {
					arg1.anInt10749 = local9.anInt9988;
				} else if (arg0 <= 0 || local9.anInt9999 == -1) {
					arg1.anInt10749 = local9.anInt10008;
				} else {
					arg1.anInt10749 = local9.anInt9999;
				}
			} else if (arg2 == 0 && local9.anInt9966 != -1) {
				if (arg0 < 0 && local9.anInt9989 != -1) {
					arg1.anInt10749 = local9.anInt9989;
				} else if (arg0 <= 0 || local9.anInt10001 == -1) {
					arg1.anInt10749 = local9.anInt9966;
				} else {
					arg1.anInt10749 = local9.anInt10001;
				}
			} else if (arg0 < 0 && local9.anInt9983 != -1) {
				arg1.anInt10749 = local9.anInt9983;
			} else if (arg0 <= 0 || local9.anInt9998 == -1) {
				arg1.anInt10749 = local9.anInt9967;
			} else {
				arg1.anInt10749 = local9.anInt9998;
			}
		}
	}
}
