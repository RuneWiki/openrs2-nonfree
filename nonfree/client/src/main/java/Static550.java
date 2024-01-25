import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
	public static int anInt9024;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIILclient!hg;I)V")
	public static void method7574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class334 local9 = arg2.method3964();
		@Pc(19) int local19 = arg2.anInt4609 - arg2.aClass116_7.anInt3077 & 0x3FFF;
		if (arg3 == -1) {
			if (local19 != 0 || arg2.anInt4625 > 25) {
				if (arg0 < 0 && local9.anInt8924 != -1) {
					arg2.aBoolean319 = false;
					arg2.anInt4553 = local9.anInt8924;
				} else if (arg0 <= 0 || local9.anInt8910 == -1) {
					arg2.anInt4553 = local9.anInt8942;
				} else {
					arg2.anInt4553 = local9.anInt8910;
				}
				arg2.aBoolean319 = false;
			} else if (!arg2.aBoolean319 || !local9.method7497(arg2.anInt4553)) {
				arg2.anInt4553 = local9.method7500();
				arg2.aBoolean319 = arg2.anInt4553 != -1;
			}
		} else if (arg2.anInt4580 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(122) int local122 = Static105.anIntArray136[arg1] - arg2.aClass116_7.anInt3077 & 0x3FFF;
			arg2.aBoolean319 = false;
			if (arg3 == 2 && local9.anInt8919 != -1) {
				if (local122 > 2048 && local122 <= 6144 && local9.anInt8945 != -1) {
					arg2.anInt4553 = local9.anInt8945;
				} else if (local122 >= 10240 && local122 < 14336 && local9.anInt8921 != -1) {
					arg2.anInt4553 = local9.anInt8921;
				} else if (local122 <= 6144 || local122 >= 10240 || local9.anInt8931 == -1) {
					arg2.anInt4553 = local9.anInt8919;
				} else {
					arg2.anInt4553 = local9.anInt8931;
				}
			} else if (arg3 == 0 && local9.anInt8943 != -1) {
				if (local122 > 2048 && local122 <= 6144 && local9.anInt8930 != -1) {
					arg2.anInt4553 = local9.anInt8930;
				} else if (local122 >= 10240 && local122 < 14336 && local9.anInt8926 != -1) {
					arg2.anInt4553 = local9.anInt8926;
				} else if (local122 <= 6144 || local122 >= 10240 || local9.anInt8913 == -1) {
					arg2.anInt4553 = local9.anInt8943;
				} else {
					arg2.anInt4553 = local9.anInt8913;
				}
			} else if (local122 > 2048 && local122 <= 6144 && local9.anInt8922 != -1) {
				arg2.anInt4553 = local9.anInt8922;
			} else if (local122 >= 10240 && local122 < 14336 && local9.anInt8914 != -1) {
				arg2.anInt4553 = local9.anInt8914;
			} else if (local122 <= 6144 || local122 >= 10240 || local9.anInt8935 == -1) {
				arg2.anInt4553 = local9.anInt8942;
			} else {
				arg2.anInt4553 = local9.anInt8935;
			}
		} else if (local19 == 0 && arg2.anInt4625 <= 25) {
			if (arg3 == 2 && local9.anInt8919 != -1) {
				arg2.anInt4553 = local9.anInt8919;
			} else if (arg3 == 0 && local9.anInt8943 != -1) {
				arg2.anInt4553 = local9.anInt8943;
			} else {
				arg2.anInt4553 = local9.anInt8942;
			}
			arg2.aBoolean319 = false;
		} else {
			arg2.aBoolean319 = false;
			if (arg3 == 2 && local9.anInt8919 != -1) {
				if (arg0 < 0 && local9.anInt8937 != -1) {
					arg2.anInt4553 = local9.anInt8937;
				} else if (arg0 <= 0 || local9.anInt8936 == -1) {
					arg2.anInt4553 = local9.anInt8919;
				} else {
					arg2.anInt4553 = local9.anInt8936;
				}
			} else if (arg3 == 0 && local9.anInt8943 != -1) {
				if (arg0 < 0 && local9.anInt8948 != -1) {
					arg2.anInt4553 = local9.anInt8948;
				} else if (arg0 <= 0 || local9.anInt8939 == -1) {
					arg2.anInt4553 = local9.anInt8943;
				} else {
					arg2.anInt4553 = local9.anInt8939;
				}
			} else if (arg0 < 0 && local9.anInt8917 != -1) {
				arg2.anInt4553 = local9.anInt8917;
			} else if (arg0 <= 0 || local9.anInt8929 == -1) {
				arg2.anInt4553 = local9.anInt8942;
			} else {
				arg2.anInt4553 = local9.anInt8929;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method7576(@OriginalArg(0) String arg0) {
		return Static183.method2677(arg0, cn.class);
	}
}
