import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_46 = new Class98(72, 7);

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!jr;)Lclient!mu;")
	public static Class210_Sub1 method3261(@OriginalArg(1) Class6_Sub12 arg0) {
		@Pc(7) Class210 local7 = Static536.method7300(arg0);
		@Pc(11) int local11 = arg0.method6054();
		return new Class210_Sub1(local7.anInt6224, local7.aClass114_9, local7.aClass72_8, local7.anInt6225, local7.anInt6227, local11);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V")
	public static void method3263() {
		Static342.aClass330_35.method7678();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!en;IIIII)Lclient!an;")
	public static Class16_Sub1_Sub1 method3264(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean159 || Static331.method5078(arg1) && Static331.method5078(arg3)) {
			return new Class16_Sub1_Sub1(arg0, 3553, arg2, arg4, arg1, arg3, true);
		} else if (arg0.aBoolean167) {
			return new Class16_Sub1_Sub1(arg0, 34037, arg2, arg4, arg1, arg3, true);
		} else {
			return new Class16_Sub1_Sub1(arg0, arg2, arg4, arg1, arg3, Static14.method5936(arg1), Static14.method5936(arg3), true);
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V")
	public static void method3265() {
		Static513.method6926();
		Static262.method3999();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IILclient!pd;Lclient!pd;Z)I")
	public static int method3267(@OriginalArg(1) int arg0, @OriginalArg(2) Class139_Sub1 arg1, @OriginalArg(3) Class139_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(19) int local19;
		@Pc(22) int local22;
		if (arg0 == 1) {
			local19 = arg1.anInt7121;
			local22 = arg2.anInt7121;
			if (!arg3) {
				if (local19 == -1) {
					local19 = 2001;
				}
				if (local22 == -1) {
					local22 = 2001;
				}
			}
			return local19 - local22;
		} else if (arg0 == 2) {
			return Static487.method6843(Static188.anInt28, arg2.method5694().aString13, arg1.method5694().aString13);
		} else if (arg0 == 3) {
			if (arg1.aString57.equals("-")) {
				if (arg2.aString57.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString57.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static487.method6843(Static188.anInt28, arg2.aString57, arg1.aString57);
			}
		} else if (arg0 == 4) {
			if (arg1.method5687()) {
				return arg2.method5687() ? 0 : 1;
			} else if (arg2.method5687()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method5692()) {
				return arg2.method5692() ? 0 : 1;
			} else if (arg2.method5692()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method5688()) {
				return arg2.method5688() ? 0 : 1;
			} else if (arg2.method5688()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method5690()) {
				return arg2.method5690() ? 0 : 1;
			} else if (arg2.method5690()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local19 = arg1.anInt7130;
			local22 = arg2.anInt7130;
			if (arg3) {
				if (local19 == 1000) {
					local19 = -1;
				}
				if (local22 == 1000) {
					local22 = -1;
				}
			} else {
				if (local19 == -1) {
					local19 = 1000;
				}
				if (local22 == -1) {
					local22 = 1000;
				}
			}
			return local19 - local22;
		} else {
			return arg1.anInt7127 - arg2.anInt7127;
		}
	}
}
