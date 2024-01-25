import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIILclient!ir;)V")
	public static void method477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class47_Sub1_Sub5 arg3) {
		@Pc(9) Class231 local9 = arg3.method4327();
		@Pc(23) int local23 = arg3.anInt5379 - arg3.aClass134_7.anInt3621 & 0x3FFF;
		if (arg2 == -1) {
			if (local23 != 0 || arg3.anInt5399 > 25) {
				if (arg1 < 0 && local9.anInt6971 != -1) {
					arg3.anInt5393 = local9.anInt6971;
				} else if (arg1 <= 0 || local9.anInt6987 == -1) {
					arg3.anInt5393 = local9.anInt6980;
				} else {
					arg3.anInt5393 = local9.anInt6987;
				}
				arg3.aBoolean432 = false;
			} else if (!arg3.aBoolean432 || !local9.method5400(arg3.anInt5393)) {
				arg3.anInt5393 = local9.method5402();
				arg3.aBoolean432 = arg3.anInt5393 != -1;
			}
		} else if (arg3.anInt5378 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(123) int local123 = Static401.anIntArray526[arg0] - arg3.aClass134_7.anInt3621 & 0x3FFF;
			if (arg2 == 2 && local9.anInt6975 != -1) {
				if (local123 > 2048 && local123 <= 6144 && local9.anInt6998 != -1) {
					arg3.anInt5393 = local9.anInt6998;
				} else if (local123 >= 10240 && local123 < 14336 && local9.anInt6984 != -1) {
					arg3.anInt5393 = local9.anInt6984;
				} else if (local123 <= 6144 || local123 >= 10240 || local9.anInt6972 == -1) {
					arg3.anInt5393 = local9.anInt6975;
				} else {
					arg3.anInt5393 = local9.anInt6972;
				}
			} else if (arg2 == 0 && local9.anInt7005 != -1) {
				if (local123 > 2048 && local123 <= 6144 && local9.anInt6976 != -1) {
					arg3.anInt5393 = local9.anInt6976;
				} else if (local123 >= 10240 && local123 < 14336 && local9.anInt7004 != -1) {
					arg3.anInt5393 = local9.anInt7004;
				} else if (local123 <= 6144 || local123 >= 10240 || local9.anInt6973 == -1) {
					arg3.anInt5393 = local9.anInt7005;
				} else {
					arg3.anInt5393 = local9.anInt6973;
				}
			} else if (local123 > 2048 && local123 <= 6144 && local9.anInt6979 != -1) {
				arg3.anInt5393 = local9.anInt6979;
			} else if (local123 >= 10240 && local123 < 14336 && local9.anInt6982 != -1) {
				arg3.anInt5393 = local9.anInt6982;
			} else if (local123 <= 6144 || local123 >= 10240 || local9.anInt6970 == -1) {
				arg3.anInt5393 = local9.anInt6980;
			} else {
				arg3.anInt5393 = local9.anInt6970;
			}
			arg3.aBoolean432 = false;
		} else if (local23 == 0 && arg3.anInt5399 <= 25) {
			if (arg2 == 2 && local9.anInt6975 != -1) {
				arg3.anInt5393 = local9.anInt6975;
			} else if (arg2 == 0 && local9.anInt7005 != -1) {
				arg3.anInt5393 = local9.anInt7005;
			} else {
				arg3.anInt5393 = local9.anInt6980;
			}
			arg3.aBoolean432 = false;
		} else {
			arg3.aBoolean432 = false;
			if (arg2 == 2 && local9.anInt6975 != -1) {
				if (arg1 < 0 && local9.anInt6989 != -1) {
					arg3.anInt5393 = local9.anInt6989;
				} else if (arg1 <= 0 || local9.anInt6981 == -1) {
					arg3.anInt5393 = local9.anInt6975;
				} else {
					arg3.anInt5393 = local9.anInt6981;
				}
			} else if (arg2 == 0 && local9.anInt7005 != -1) {
				if (arg1 < 0 && local9.anInt7012 != -1) {
					arg3.anInt5393 = local9.anInt7012;
				} else if (arg1 <= 0 || local9.anInt7001 == -1) {
					arg3.anInt5393 = local9.anInt7005;
				} else {
					arg3.anInt5393 = local9.anInt7001;
				}
			} else if (arg1 < 0 && local9.anInt7010 != -1) {
				arg3.anInt5393 = local9.anInt7010;
			} else if (arg1 <= 0 || local9.anInt7008 == -1) {
				arg3.anInt5393 = local9.anInt6980;
			} else {
				arg3.anInt5393 = local9.anInt7008;
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLjava/lang/String;ZLclient!ci;Z)V")
	public static void method478(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class42 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg1) {
			Static26.method374(3, arg2, arg0);
			return;
		}
		@Pc(27) String local27;
		if (Static48.aString13.startsWith("win") && Static48.anInt770 != 3) {
			local27 = null;
			if (arg2.anApplet1 != null) {
				local27 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local27 == null || !local27.equals("1")) {
				@Pc(47) Class159 local47 = Static26.method374(0, arg2, arg0);
				Static261.aClass159_6 = local47;
				Static363.aString76 = arg0;
				Static308.aClass42_7 = arg2;
				return;
			}
		}
		if (Static48.aString13.startsWith("mac")) {
			local27 = null;
			if (arg2.anApplet1 != null) {
				local27 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local27 != null && local27.equals("1") && arg3) {
				Static26.method374(1, arg2, arg0);
				return;
			}
		}
		Static26.method374(2, arg2, arg0);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public static void method479() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static80.anInt6558; local9++) {
			for (@Pc(18) int local18 = 0; local18 < Static104.anInt2048; local18++) {
				if (Static160.method5109(Static131.aClass137ArrayArrayArray2, local18, local9, true, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
	public static boolean method484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static18.method240(arg1, arg0) || Static434.method5821(arg0, arg1);
	}
}
